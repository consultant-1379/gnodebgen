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
package com.ericsson.tcs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import org.junit.Before;
import org.junit.Test;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;

public class EventEnrichmentTestSuites {

	private GPBServices gpbService;

	private EncoderService encode;

	private DecoderService decode;

	private List<byte[]> fileEventsList;

	private File file;

	@Before
	public void init() {
		gpbService = new GPBServices();
		encode = new EncoderService();
		fileEventsList = new ArrayList<byte[]>();
		decode = new DecoderService();
		String path = "src/test/resources/files/A20190529.1245-1300.gpb.gz";
		file = new File(path);
		try {
			FileInputStream fileStream = new FileInputStream(file);
			InputStream inputFileStream = new BufferedInputStream(new GZIPInputStream(fileStream));
			int bufferSize = Utils.getBufferSizeForBinaryFiles(file);
			byte[] binaryFileByteArr = new byte[bufferSize];
			int streamLenght = inputFileStream.read(binaryFileByteArr);
			int cursor = 0;
			while (cursor < streamLenght) {
				int recordLength = binaryFileByteArr[cursor];
				if (recordLength < 0) {
					recordLength = ((binaryFileByteArr[cursor + 1] & 0x7f) << 7) | (recordLength & 0x7f);
					cursor += 1;
				}
				byte[] eventByteArray = new byte[recordLength];
				System.arraycopy(binaryFileByteArr, cursor + 1, eventByteArray, 0, recordLength);
				byte[] record;
				int newEventLen = eventByteArray.length;
				if (newEventLen > 127) {
					record = new byte[newEventLen + 2];
					record[0] = (byte) ((newEventLen & 0xff) | 0x80);
					record[1] = (byte) (((newEventLen << 1) >> 8) & 0xff);
					System.arraycopy(eventByteArray, 0, record, 2, eventByteArray.length);
				} else {
					record = new byte[newEventLen + 1];
					record[0] = (byte) newEventLen;
					System.arraycopy(eventByteArray, 0, record, 1, eventByteArray.length);
				}
				fileEventsList.add(eventByteArray);
				cursor += recordLength + 1;
			}
			inputFileStream.close();
		} catch (Exception e) {
			System.out.println("Error Occured during file parsing. " + e.getMessage());
		}
	}

	/**
	 * This test case validate update header parameters updation.
	 */
	@Test
	public void checkEventHeaderParamUpdate() {
		Map<String, Object> headerParam = new HashMap<>();
		long fileStartEPochTime = Utils.convertStringToDate(file.getName().substring(1, 14));
		long deltaTime = System.currentTimeMillis() - fileStartEPochTime;
		for (byte[] event : fileEventsList) {
			PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
			assertNotNull(pmEventMessage);
			PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
			long actualValue = decode.getEventTimeStamp(pmEventMessage) + deltaTime;
			headerParam.put(ConstantParameter.TIME_STAMP, actualValue);
			encode.encodeHeaderParameters(pmEventMessageBuilder, headerParam);
			assertEquals(actualValue, pmEventMessageBuilder.build().getHeader().getTimeStamp());
		}
	}

	/**
	 * This test case validate event payload parameters updation.
	 */
	@Test
	public void checkEventPayLoadParamUpdate() {
		Map<String, Object> eventParam = new HashMap<>();
		eventParam.put(ConstantParameter.GNODEBID, 50);
		eventParam.put(ConstantParameter.GNODEBID_Length, 50);
		eventParam.put(ConstantParameter.NCI, 50);
		for (byte[] event : fileEventsList) {
			PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
			PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
			assertNotNull(pmEventMessageBuilder);
			encode.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, eventParam, null);
			Map<String, Object> decodedParamMap = decode.getEventParamValue(pmEventMessageBuilder.build(),
			        eventParam.keySet());
			for (String paramName : decodedParamMap.keySet()) {
				switch (paramName) {
				case ConstantParameter.GNODEBID:
					assertEquals(Long.valueOf((Integer) eventParam.get(ConstantParameter.GNODEBID)),
					        decodedParamMap.get(paramName));
					break;
				case ConstantParameter.GNODEBID_Length:
					assertEquals(Long.valueOf((Integer) eventParam.get(ConstantParameter.GNODEBID_Length)),
					        decodedParamMap.get(paramName));
					break;
				case ConstantParameter.NCI:
					assertEquals(Long.valueOf((Integer) eventParam.get(ConstantParameter.NCI)),
					        decodedParamMap.get(paramName));
					break;
				}
			}
		}
	}

}

