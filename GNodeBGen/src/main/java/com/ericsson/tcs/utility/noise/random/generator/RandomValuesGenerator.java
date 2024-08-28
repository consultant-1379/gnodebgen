package com.ericsson.tcs.utility.noise.random.generator;

import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.google.protobuf.ByteString;

public class RandomValuesGenerator implements ConstantParameter {

	private String input;
	private String output;
	private List<byte[]> eventsList;
	private List<byte[]> finalEventsList;
	private GPBServices gpbService;
	private boolean setSystemUuid = false;
	private int systemUuidSize = 1;

	public RandomValuesGenerator(String inputFilePath, String setSystemUuid, String systemUuidSize) {
		this.input = inputFilePath;
		this.output = inputFilePath.replace(GPB_EXT, "_OUT" + GPB_EXT);
		if (setSystemUuid.equalsIgnoreCase("YES")) {
			this.setSystemUuid = true;
		}
		this.systemUuidSize = Integer.parseInt(systemUuidSize);
		init();
	}

	public void init() {
		eventConsumer();
		bulidNewPmEventObject();
		writer();
	}

	private void eventConsumer() {
		System.out.println("INFO : Consuming events from " + input + " file.");
		FileReader f = new FileReader();
		File inFile = new File(input);
		eventsList = new ArrayList<>();
		eventsList = f.getFileEventList(inFile);
		System.out.println("INFO : Total events in input file is : " + eventsList.size());
		gpbService = new GPBServices();
		System.out.println("INFO : Event consumption completed from input.");
	}

	private void updateSystemUUID(PmEvent.Builder pmEventBuilder) {
		byte[] sysUuid = new byte[systemUuidSize];
		new SecureRandom().nextBytes(sysUuid);
		pmEventBuilder.setHeader(pmEventBuilder.getHeader().toBuilder().setSystemUuid(ByteString.copyFrom(sysUuid)))
				.build();
	}

	private void bulidNewPmEventObject() {
		finalEventsList = new ArrayList<>();
		List<Integer> sizeList = new ArrayList<>();
		for (byte[] event : eventsList) {
			PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
			PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
			if (setSystemUuid) {
				updateSystemUUID(pmEventMessageBuilder);
			}
			finalEventsList.add(gpbService.write(pmEventMessageBuilder.build()));
		}
		long totalLen = 0L;
		for (byte[] e : finalEventsList) {
			totalLen += e.length;
			sizeList.add(e.length);
		}
		System.out.println("INFO : Max event size : " + Collections.max(sizeList));
		System.out.println("INFO : Min event size : " + Collections.min(sizeList));
		System.out.println("INFO : Avg event size : " + totalLen / sizeList.size());
	}

	private void writer() {
		Utils u = new Utils();
		System.out.println("INFO : Writing events in output file : " + output);
		System.out.println("INFO : Total events in final list : " + finalEventsList.size());
		u.compressedFileWrite(finalEventsList, output);
		System.out.println("INFO : Writing completed.");
	}

}
