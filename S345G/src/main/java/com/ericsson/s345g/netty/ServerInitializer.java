/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.netty;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

/**
 * @author xjaimah
 *
 */
public class ServerInitializer extends ChannelInitializer<SocketChannel> {

    /**
     * The rop time
     */
    private int rop_time;

    /**
     * The Location
     */
    private String location;
    
    /**
     * The fileBasedFlag
     */
    private boolean fileBasedFlag;

    /**
     * @param rop_time
     * @param location
     */
    public ServerInitializer(int rop_time, String location, boolean fileBasedFlag) {
        this.rop_time = rop_time;
        this.location = location;
        this.fileBasedFlag = fileBasedFlag;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * io.netty.channel.ChannelInitializer#initChannel(io.netty.channel.Channel)
     */
    @Override
    public void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipe = ch.pipeline();
        channelPipe.addLast(new ProtobufVarint32FrameDecoder());
        channelPipe.addLast(new ProtobufDecoder(PmEvent.getDefaultInstance()));
        channelPipe.addLast(new ProtobufVarint32LengthFieldPrepender());
        channelPipe.addLast(new ProtobufEncoder());
        channelPipe.addLast(new StreamTerminator(rop_time, location, fileBasedFlag));
    }
    
}

