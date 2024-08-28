package com.ericsson.tcs.utility.event.alteration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;

public class EventDeletionWorker implements Runnable {

	private int threadId;
	private List<String> files;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		FileReader read = new FileReader();
		GPBServices gpb = new GPBServices();

		for (String f : files) {
			File fp = new File(f);
			List<byte[]> eventList = read.getFileEventList(fp);
			List<byte[]> newEventList = new ArrayList<byte[]>();
			for (byte[] event : eventList) {
				PmEvent.Builder msgBuilder = ((PmEvent) gpb.getPmEventOuterMessage(event)).toBuilder();
				if (EventDeletion.event_id_list.contains(msgBuilder.getEventId())) {
					continue;
				} else {
					newEventList.add(gpb.write(msgBuilder.build()));
				}
			}
			
			String finalFilePath = EventDeletion.output_location + File.separator + fp.getName();
			
			Utils u = new Utils();
			u.compressedFileWrite(newEventList, finalFilePath);
		}
	}

	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}

	public void setFiles(List<String> files) {
		this.files = files;
	}

}
