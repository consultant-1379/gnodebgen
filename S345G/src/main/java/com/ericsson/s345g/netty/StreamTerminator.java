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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.zip.GZIPOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.pm_event.PmEventOuterClass;
import com.ericsson.pm_event.PmEventOuterClass.CommonPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.FileCloseEndOfRop;
import com.ericsson.pm_event.PmEventOuterClass.FileOpen;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEventHeader;
import com.ericsson.pm_event.PmEventOuterClass.PmEventHeader.Builder;
import com.ericsson.pm_event.PmEventOuterClass.PmEventMessageGroup;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedOutputStream;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author xjaimah
 *
 */
public class StreamTerminator extends SimpleChannelInboundHandler<PmEvent> {

    /**
     * The headerTime
     */
    private long headerTime;

    /**
     * The nextFiveMillis
     */
    private long endRopTimeInMills;

    /**
     * The outputStream
     */
    private BufferedOutputStream outputStream = null;

    /**
     * The outputLocation
     */
    private String outputLocation;

    /**
     * The ropTime
     */
    private int ropTime;

    /**
     * The isFirstEvent
     */
    private boolean isFirstEvent = true;

    /**
     * LOGGER
     */
    static final Logger LOGGER = LoggerFactory.getLogger(StreamTerminator.class);

    /**
     * The etcmVersion
     */
    private long etcmVersion;

    /**
     * The etcmCorrectedVersion
     */
    private long etcmCorrectedVersion;

    /**
     * The isFileBaseRun
     */
    private boolean isFileBaseRun;

    /**
     * @param ropTime
     * @param outputLocation
     */
    public StreamTerminator(int ropTime, String outputLocation, boolean isFileBaseRun) {
        this.ropTime = ropTime;
        this.outputLocation = outputLocation;
        this.isFileBaseRun = isFileBaseRun;
    }

    /*
     * (non-Javadoc)
     * 
     * @see io.netty.channel.SimpleChannelInboundHandler#channelRead0(io.netty.
     * channel. ChannelHandlerContext, java.lang.Object)
     */
    @Override
    public void channelRead0(ChannelHandlerContext ctx, PmEvent msg) {
        etcmVersion = msg.getEtcmVersion();
        etcmCorrectedVersion = msg.getEtcmCorrectionVersion();
        headerTime = msg.getHeader().getTimeStamp();
        String val = ctx.channel().remoteAddress().toString().replace("/", "").replaceAll(":", "_");
        if (isFirstEvent) {
            isFirstEvent = false;
            long ropTimeInMills = ropTime * DateTimeService.SECONDS_IN_MINUTES * DateTimeService.MILLI_IN_SECOND;
            long startRopTimeInMills = headerTime - (headerTime % ropTimeInMills);
            endRopTimeInMills = startRopTimeInMills + ropTimeInMills;
            createNewFileWriter(val, msg, false);
        } else {
            if (headerTime <= endRopTimeInMills + DateTimeService.ROP_BUFFER_IN_MILLI) {
                write(msg);
            } else {
                headerTime = endRopTimeInMills;
                long ropTimeInMills = ropTime * DateTimeService.SECONDS_IN_MINUTES * DateTimeService.MILLI_IN_SECOND;
                endRopTimeInMills = headerTime + ropTimeInMills;
                createNewFileWriter(val, msg, true);
            }
        }
    }

    /**
     * @param msg
     */
    public void write(PmEvent msg) {
        int msgLen = msg.getSerializedSize();
        final int hdrLen = CodedOutputStream.computeUInt32SizeNoTag(msgLen);
        ByteBuffer msgb = ByteBuffer.allocate(hdrLen + msgLen);
        final CodedOutputStream codedOutputStream = CodedOutputStream.newInstance(msgb);
        try {
            codedOutputStream.writeUInt32NoTag(msgLen);
            msg.writeTo(codedOutputStream);
            codedOutputStream.flush();
            msgb.flip();
            outputStream.write(msgb.array());
        } catch (Exception e) {
            LOGGER.error("Error while processing 5G events. " + e.getMessage());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * io.netty.channel.ChannelInboundHandlerAdapter#channelInactive(io.netty.
     * channel.ChannelHandlerContext)
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws IOException {
        try {
            if (null != outputStream) {
                outputStream.flush();
                outputStream.close();
            }
        } catch (Exception e) {
            LOGGER.error("Error while closing streaming channel." + e.getMessage());
        }

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * io.netty.channel.ChannelInboundHandlerAdapter#exceptionCaught(io.netty.
     * channel.ChannelHandlerContext, java.lang.Throwable)
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }

    /**
     * @param address
     * @param msg
     */
    private void createNewFileWriter(String address, PmEvent msg, boolean isRopTermination) {
        try {
            if (isRopTermination && isFileBaseRun) {
                final FileCloseEndOfRop fileClose = PmEventOuterClass.FileCloseEndOfRop.newBuilder().build();
                final CommonPmEvent commonPmEvent = CommonPmEvent.newBuilder().setFileCloseEndOfRop(fileClose).build();
                PmEvent.Builder fileCloseBuilder = getOuterMessage(CommonPmEvent.FILE_CLOSE_END_OF_ROP_FIELD_NUMBER,
                        commonPmEvent.toByteString(),msg);
                write(fileCloseBuilder.build()); 
            }
            if (null != outputStream) {
                outputStream.flush();
                outputStream.close();
            }
            String fileString = "A{DATE}.{STARTTIME}-{ENDTIME}_SubNetwork=ONRM_ROOT_MO_R,MeContext={ENODENAME}_celltracefile_1.gpb.gz";
            Date outFileDate = new Date(headerTime);
            String DATE = DateTimeService.convertDateToString(outFileDate);
            String STARTTIME = String.format("%02d", DateTimeService.getStartHour(endRopTimeInMills, ropTime))
                    + String.format("%02d", DateTimeService.getStartMin(endRopTimeInMills, ropTime));
            String ENDTIME = String.format("%02d", DateTimeService.getEndHore(endRopTimeInMills))
                    + String.format("%02d", DateTimeService.getEndMin(endRopTimeInMills));
            fileString = fileString.replace("{DATE}", DATE).replace("{STARTTIME}", STARTTIME)
                    .replace("{ENDTIME}", ENDTIME).replace("{ENODENAME}", address);
            File outputFile = new File(outputLocation.concat(File.separator).concat(fileString));
            outputStream = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(outputFile)),
                    msg.toByteArray().length);
            if (isFileBaseRun) {
                FileOpen fileOpen = FileOpen.newBuilder().setEtcmVersion(etcmVersion)
                        .setEtcmCorrectionVersion(etcmCorrectedVersion).build();
                CommonPmEvent commonPmEvent = CommonPmEvent.newBuilder().setFileOpen(fileOpen).build();
                PmEvent.Builder fileOpenBuilder = getOuterMessage(CommonPmEvent.FILE_OPEN_FIELD_NUMBER,
                        commonPmEvent.toByteString(), msg);
                write(fileOpenBuilder.build()); // Rop open event
            }
            write(msg);
        } catch (Exception e) {
            LOGGER.error("Error: Error while writing events in GPB files. " + e.getMessage());
        }
    }

    /**
     * This will make common event message
     * 
     * @param eventId
     * @param payload
     * @return
     */
    private PmEvent.Builder getOuterMessage( long eventId,  ByteString payload, PmEvent msg) {
        return PmEvent.newBuilder().setPmEventGroupVersion(msg.getPmEventGroupVersion())
                .setPmEventCommonVersion(msg.getPmEventCommonVersion())
                .setPmEventCorrectionVersion(msg.getPmEventCorrectionVersion())
                .setEtcmVersion(msg.getEtcmVersion())
                .setEtcmCorrectionVersion(msg.getEtcmCorrectionVersion()).setGroup(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_COMMON)
                .setEventId(eventId)
                .setHeader(getHeader( msg.getHeader().getTimeStamp(), msg.getHeader().getSystemUuid())).setPayload(payload);
    }

    /**
     * Main Outer PmEvent header generator.
     * 
     * @return PmEvent header.
     */
    private PmEventHeader getHeader(long timestamp, ByteString bytes) {
        final Builder pmHeaderBuilder = PmEventHeader.newBuilder().setTimeStamp(timestamp).setSystemUuid(bytes)
                .setComputeName("msgMaker").setNetworkManagedElement("NME").addPmEventJobIds(5);
        return pmHeaderBuilder.build();
    }
}
