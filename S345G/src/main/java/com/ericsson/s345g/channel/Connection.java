/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.channel;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.utils.Utils;

public class Connection {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private SocketChannel socket;
    private final SocketAddress dest;
    private CState connectionState = CState.CLOSED;
	private String localAddress;
    private String nodeName;
    private boolean logCTRFiles;
    private boolean useSymLinks;
    private String logCTRFilesPath;
    private String symLinkPath;
    private String outputFileName;
    private WritableByteChannel fileCTR;

    /**
     * Create a connection between the specified source and destination
     *
     * @param dest remote address to connect to
     * @param stream use stream or file headers (and footers)
     *
     */
    public Connection(final SocketAddress dest, String nodeName, Boolean logCTRFiles, String logCTRFilesPath, String symLinkPath) {
        this.dest = dest;
        this.nodeName = nodeName;
        this.logCTRFiles = logCTRFiles;
        this.logCTRFilesPath = logCTRFilesPath;
        this.symLinkPath = symLinkPath;
        if (!S3Defaults.UNSET.equals(symLinkPath)) {
            this.useSymLinks = true;
        }
        createConnection();
    }

    /**
     * Write the bytebuffer to a stream.
     *
     * The write mechanism uses a semi-blocking policy in that the write attempt does
     * not wait for tcp acknowledgment as normal blocking policy would, but it will
     * not return until all the requested bytes have been written to the tcp stack.<br>
     *
     * This approach means that if the application is flooding the stream, the thread
     * will slow down which can be detected by the generation thread which in turn
     * can slow down.
     *
     * @param buffer Bytebuffer to be written
     * @return number of bytes written
     */
    public int write(ByteBuffer buffer) {
        int written = 0;
        if (this.logCTRFiles) {
            logCTRFile(buffer.duplicate());
        }

        int attemptsLeft = 2;
        if (connectionState == CState.READY) {
            try {
                written += socket.write(buffer);
                while (buffer.hasRemaining() && attemptsLeft > 0) {
                    // if we are here, then the tcp buffer is full, time to slow down
                    Utils.snooze(50);
                    written += socket.write(buffer);
                    attemptsLeft -= 1;
                }
                if (attemptsLeft == 0) {
                    // failed to write event!
                    connectionState = CState.DROPPED;
                    LOGGER.warn("attemptsLeft 0");
                    written = 0;  // write was not successful
                }
            } catch (IOException e) {
                LOGGER.warn("Connection failed: {}", e.getMessage());
                connectionState = CState.DROPPED;
            }
        }
        if (written == 0) {
            LOGGER.warn("written = 0");
        }
        return written;
    }

    // close any open CTR file and open a fresh one
    public void rollCTRFile(String rop) {
        try {
            this.fileCTR.close();
            if (useSymLinks) {
                String src = this.logCTRFilesPath + "/" + outputFileName;
                String link = this.symLinkPath + "/" + outputFileName;
                Files.createSymbolicLink(Paths.get(link), Paths.get(src));
            }
        } catch (Exception e) {
            //don't care about errors
        }
        try {
            outputFileName = rop+nodeName+".bin.gz";
            String output = this.logCTRFilesPath + "/" + outputFileName;
            this.fileCTR = Channels.newChannel(new GZIPOutputStream(new FileOutputStream(output, false)));
        } catch (Exception e) {
            // ignore failures
        }
    }

    private void logCTRFile(ByteBuffer buffer) {
        try {
            this.fileCTR.write(buffer);
        } catch (Exception e) {
            // ignore failures
        }
    }

    public void close() {
        try {
            socket.close();
            if (this.logCTRFiles && this.fileCTR != null ) {
                this.fileCTR.close();  // don't care about errors
            }
        } catch (IOException e) {
            // this socket is dead but reconnect will just open another one.
        }
    }

    public boolean reconnect() {
        LOGGER.debug("Reconnecting to Dest: {} ", dest);
        try {
            socket.close();
        } catch (IOException e) {
            // we have a mechanism for dealing with reconnection attempts
        }
        return createConnection();
    }

    public CState getStatus() {
        return connectionState;
    }

    private boolean createConnection() {
        try {
            if (null != socket) {
                socket.close();
            }
            socket = SocketChannel.open();
            socket.configureBlocking(true);

            socket.socket().connect(dest, S3Defaults.CONNECTIONTIMEOUT); // 3 second connection timeout
			this.localAddress = socket.getLocalAddress().toString();
            socket.finishConnect(); // in blocking mode, returns true or throws exception
            connectionState = CState.READY;
            socket.configureBlocking(false); // switch to non blocking mode
            return true;
        } catch (Exception e) {
            LOGGER.warn("Exception connecting to dest {}. Error : {}", dest, e.getMessage());
        }
        return false;  // connection failed
    }
	public String getLocalAddress() {
        return this.localAddress;
	}
}
