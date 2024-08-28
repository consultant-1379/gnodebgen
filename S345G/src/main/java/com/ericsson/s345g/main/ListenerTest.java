package com.ericsson.s345g.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.*;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ListenerTest {
    static Logger LOGGER = LoggerFactory.getLogger(ListenerTest.class);
    public static String Address = "127.0.0.1";
    public static boolean decode = false;
    public static long TIMEOUT = 10000;

    private ServerSocketChannel serverChannel;
    private Selector selector;
    private ServerMonitor sm;
    private Map<SocketChannel, byte[]> dataTracking = new HashMap<SocketChannel, byte[]>();
    private BufferedWriter logToFileHandle = null;

    public ListenerTest(List <Integer> ports) {
        System.out.println("initializing server ");
        sm = new ServerMonitor(1000, decode);

        // We do not want to call init() twice and recreate the selector or the
        // serverChannel.
        if (selector != null) {
            return;
        }
        if (serverChannel != null) {
            return;
        }
        if (decode) {
            try {
                // These handles are closed in the close() method
                logToFileHandle = new BufferedWriter(new FileWriter("NrGPB.decode.txt", false));
                //logToFileHandle = Channels.newChannel(outgz);
            } catch (Exception e) {
                decode = false;
            }
        }

        try {
            selector = Selector.open();

            for (Integer port : ports) {
                serverChannel = ServerSocketChannel.open();
                // You MUST configure as non-blocking or else you cannot register
                // the serverChannel to the Selector.
                serverChannel.configureBlocking(false);
                // bind to the address that you will use to Serve.
                serverChannel.socket().bind(new InetSocketAddress(Address, port));

                /**
                 * Here you are registering the serverSocketChannel to accept connection, thus the OP_ACCEPT. This means that you
                 * just told your selector that this channel will be used to accept connections. We can change this operation later
                 * to read/write, more on this later.
                 */
                serverChannel.register(selector, SelectionKey.OP_ACCEPT);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        System.out.println("\nCleaning up");
        sm.stop();
    }

    public void start() {
        LOGGER.debug("Now accepting connections on {}",Address);
        System.out.println("Now accepting connections on "+Address);
        sm.start();
        try {
            while (!Thread.currentThread().isInterrupted()) {
                /**
                 * selector.select(TIMEOUT) is waiting for an OPERATION to be ready and is a blocking call. For example, if a client
                 * connects right this second, then it will break from the select() call and run the code below it. The TIMEOUT is
                 * not needed, but its just so it doesn't block indefinitely.
                 */
                selector.select(TIMEOUT);

                /**
                 * If we are here, it is because an operation happened (or the TIMEOUT expired). We need to get the SelectionKeys
                 * from the selector to see what operations are available. We use an iterator for this.
                 */
                Iterator<SelectionKey> keys = selector.selectedKeys().iterator();

                while (keys.hasNext()) {
                    SelectionKey key = keys.next();
                    // remove the key so that we don't process this OPERATION
                    // again.
                    keys.remove();

                    // key could be invalid if for example, the client closed
                    // the connection.
                    if (!key.isValid()) {
                        continue;
                    }
                    /**
                     * In the server, we start by listening to the OP_ACCEPT when we register with the Selector. If the key from the
                     * keyset is Acceptable, then we must get ready to accept the client connection and do something with it. Go
                     * read the comments in the accept method.
                     */
                    if (key.isAcceptable()) {
                        accept(key);
                        //String addr = accept(key);
                        //System.out.println("Accepting connection from "+ addr);
                    }
                    /**
                     * If you already read the comments in the accept() method, then you know we changed the OPERATION to OP_WRITE.
                     * This means that one of these keys in the iterator will return a channel that is writable (key.isWritable()).
                     * The write() method will explain further.
                     */
                    if (key.isWritable()) {
                        // System.out.println("Writing...");
                        write(key);
                    }
                    /**
                     * If you already read the comments in the write method then you understand that we registered the OPERATION
                     * OP_READ. That means that on the next Selector.select(), there is probably a key that is ready to read
                     * (key.isReadable()). The read() method will explain further.
                     */
                    if (key.isReadable()) {
                        // System.out.println("Reading connection");
                        quick_read(key);
                    }
                }
            }
            System.out.println("\nThread Interupted");

        } catch (IOException e) {
            System.out.println("\nException caught processing connection # "+sm.getNumChannel());
            e.printStackTrace();
        } finally {
            closeConnection();
            sm.stop();
        }
    }

    /**
     * We registered this channel in the Selector. This means that the SocketChannel we are receiving back from the key.channel() is
     * the same channel that was used to register the selector in the accept() method. Again, I am just explaning as if things are
     * synchronous to make things easy to understand. This means that later, we might register to write from the read() method (for
     * example).
     */
    private void write(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        /**
         * The hashmap contains the object SockenChannel along with the information in it to be written. In this example, we send
         * the "Hello from server" String and also an echo back to the client. This is what the hashmap is for, to keep track of the
         * messages to be written and their socketChannels.
         */
        byte[] data = dataTracking.get(channel);
        dataTracking.remove(channel);

        // Something to notice here is that reads and writes in NIO go directly
        // to the channel and in form of
        // a buffer.
        channel.write(ByteBuffer.wrap(data));

        // Since we wrote, then we should register to read next, since that is
        // the most logical thing
        // to happen next. YOU DO NOT HAVE TO DO THIS. But I am doing it for the
        // purpose of the example
        // Usually if you register once for a read/write/connect/accept, you
        // never have to register again for that unless you
        // register for none (0). Like it said, I am doing it here for the
        // purpose of the example. The same goes for all others.
        key.interestOps(SelectionKey.OP_READ);

    }

    // Nothing special, just closing our selector and socket.
    private void closeConnection() {
        System.out.println("Closing server down");
        if (selector != null) {
            try {
                selector.close();
                serverChannel.socket().close();
                serverChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (decode) {
            try {
                logToFileHandle.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Since we are accepting, we must instantiate a serverSocketChannel by calling key.channel(). We use this in order to get a
     * socketChannel (which is like a socket in I/O) by calling serverSocketChannel.accept() and we register that channel to the
     * selector to listen to a WRITE OPERATION. I do this because my server sends a hello message to each client that connects to
     * it. This doesn't mean that I will write right NOW. It means that I told the selector that I am ready to write and that next
     * time Selector.select() gets called it should give me a key with isWritable(). More on this in the write() method.
     */
    private String accept(SelectionKey key) throws IOException {
        ServerSocketChannel serverSocketChannel = (ServerSocketChannel) key.channel();
        SocketChannel socketChannel = serverSocketChannel.accept();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);
        sm.incNumChannel();  // count number of connections
        return socketChannel.getRemoteAddress().toString();
    }

    private void quick_read(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        int bytesRead = 0;
        ByteBuffer lenBuffer = ByteBuffer.allocate(1);
        byte[] headerPart = new byte[5];
        int read;
        try {
            int mostSignificantBit = 1;
            int counter = 0;
            while (mostSignificantBit == 1) {
                lenBuffer = ByteBuffer.allocate(1);
                read = channel.read(lenBuffer);
                if (read == 1) {
                    lenBuffer.flip();
                    byte currentByte = lenBuffer.get();
                    headerPart[counter] = currentByte;
                    counter++;
                    mostSignificantBit = (currentByte & 0xff) >> 7;
                }
            }
            bytesRead += counter;
            int eventLength = CodedInputStream.newInstance(headerPart, 0, counter).readUInt32();
            if (eventLength < 1 || eventLength > 750) {
                throw new Exception("Corrupted Frame; Invalid length: " + eventLength);
            }
            //sm.incBytesRead(eventLength);

            ByteBuffer readBuffer = ByteBuffer.allocate(eventLength);
            read = 0;
            do {
                read += channel.read(readBuffer);
            } while (read < eventLength );
            bytesRead += eventLength;
            sm.incBytesRead(bytesRead);
            readBuffer.flip();
            // ready for processing
            if (decode) {
                try {
                    PmEvent evt = PmEvent.parseFrom(readBuffer);
                    sm.incEventIdCnt((int) evt.getEventId());
                    logToFileHandle.write(""+evt.toString()+"\n");
                } catch (InvalidProtocolBufferException e) {
                    //e.printStackTrace();
                    sm.incNumError();
                } catch (IOException e) {
                    e.printStackTrace();
                    decode = false;
                }
            }
            sm.incNumEvent();

        } catch (IOException e) {
            System.out.println("Connection closed by other end.");
            //sm.incNumError(); // this isn't an error
            //e.printStackTrace();
            key.cancel();
            channel.close();
            sm.decNumChannel();
            return;
        } catch (Exception e) {
            System.out.println("\nother Reading problem, closing connection");
            sm.incNumError();
            e.printStackTrace();
            key.cancel();
            channel.close();
            sm.decNumChannel();
            return;
        }
    }

    public static void main(String[] args) {
        List<Integer> portList = new ArrayList<Integer>();
        Integer port;
        int numArgs = args.length;
        for (int i = 0; i < numArgs; i++) {
            String arg = args[i];
            if (!arg.startsWith("-")) {
                try {
                    port = Integer.parseInt(arg);
                    portList.add(port);
                } catch (Exception e) {}
            }
            if (arg.startsWith("-d") ) {
                decode = true;
            }
            if (arg.startsWith("-ip") && i < (args.length -1)) {
                Address = args[i+1];
                i += 1; // this arg has been used
            }
            if (arg.startsWith("-p") && i < (numArgs -1)) {
                String str2 = args[i+1];
                i += 1;  // this arg is used.
                String [] splt = null;
                if (str2.contains(":")){
                    splt = str2.split(":");
                } else if ( str2.contains("-")) {
                    splt = str2.split("-");
                } else {
                    port = Integer.parseInt(str2);
                    portList.add(port);
                }
                if (null != splt && splt.length > 1) {
                    try {
                        int strt = Integer.parseInt(splt[0]);
                        int end = Integer.parseInt(splt[1]);
                        for (int val = strt; val <= end; val++){
                               portList.add(val);
                        }
                    } catch (Exception e) {}
                }
            }
        }

        if (portList.size() == 0) {
            // LOGGER.warn("No ports specified for listener.");
            System.out.println("No ports specified for listener.");
            return;
        }
        System.out.println("About to start listener on ports "+portList);
        //LOGGER.debug("About to start listener on ports {}",portList);
        ListenerTest st = new ListenerTest(portList);

        st.start();  // will run until finished

    }
}