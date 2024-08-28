package com.ericsson.tcs.utility.event.alteration;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ericsson.pm_event.PmEventOuterClass;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.MessageMaker;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;

public class EventAdditionWorker implements Runnable {

	private EventAdditionService e = new EventAdditionService();

	private int threadId;
	private List<String> fdnList;
	private String outFolder;

	private FileReader gpbReader;
	private GPBServices gpbServ;
	private EncoderService encoder;
	private DecoderService decoder;
	private Utils utilObj;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		gpbReader = new FileReader();
		gpbServ = new GPBServices();
		encoder = new EncoderService();
		decoder = new DecoderService();
		utilObj = new Utils();

		System.out.println("Thread index: " + threadId + " assigned with fdn count: " + fdnList.size());

		MessageMaker ms = new MessageMaker();

		for (String fdn : fdnList) {
			for (String file : EventAdditionService.getFdnToFilesMap().get(fdn)) {

				File fp = new File(file);

				List<PmEventOuterClass.PmEvent> inputPmEvent = new ArrayList<PmEventOuterClass.PmEvent>();
				for (byte[] b : gpbReader.getFileEventList(fp)) {
					PmEvent pm = (PmEvent) gpbServ.getPmEventOuterMessage(b);
					inputPmEvent.add(pm);
				}

				for (Map<Object, Object> element : EventAdditionService.getRules().getConditions()) {

					long refEventId = Long.parseLong((String) element.get("ref_event_id"));
					long new_e_id = Integer.parseInt((String) element.get("event_id_to_add"));
					int putNoOfNewEventId = Integer.parseInt((String) element.get("no_of_new_event_id_put"));
					String placement = ((String) element.get("placement")).toLowerCase();

					List<PmEventOuterClass.PmEvent> tempHolderEvtList = new ArrayList<PmEventOuterClass.PmEvent>();

					for (PmEventOuterClass.PmEvent refPmEvent : inputPmEvent) {
						long evtId = refPmEvent.getEventId();
						if (refEventId == evtId) {
							if (EventAdditionService.acknowledger(evtId)) {
								PmEventOuterClass.PmEvent newEvtBytes = ms.init(refPmEvent, new_e_id,
										e.getEvtIdToNfmap(), e.getEvtIdToFieldDescriptor(), gpbServ, encoder, decoder);
								if (placement.equals("before")) {
									addEvents(newEvtBytes, putNoOfNewEventId, tempHolderEvtList);
									tempHolderEvtList.add(refPmEvent);
								} else {
									tempHolderEvtList.add(refPmEvent);
									addEvents(newEvtBytes, putNoOfNewEventId, tempHolderEvtList);
								}
							} else {
								tempHolderEvtList.add(refPmEvent);
							}
						} else {
							tempHolderEvtList.add(refPmEvent);
						}
					}
					inputPmEvent = tempHolderEvtList;
				}
				String finalFilePath = outFolder + fp.getName();

				List<byte[]> finalEventByteList = new ArrayList<byte[]>();

				for (PmEventOuterClass.PmEvent p : inputPmEvent) {
					finalEventByteList.add(gpbServ.write(p));
				}
				utilObj.compressedFileWrite(finalEventByteList, finalFilePath);
			}
		}
	}

	public void addEvents(PmEventOuterClass.PmEvent pmEvent, int count, List<PmEventOuterClass.PmEvent> holder) {
		for (int i = 0; i < count; i++) {
			holder.add(pmEvent);
		}
	}

	public void setThreadId(int threadId) {
		this.threadId = threadId;
	}

	public void setFdnList(List<String> fdnList) {
		this.fdnList = fdnList;
	}

	public void setOutFolder(String outFolder) {
		this.outFolder = outFolder;
	}

}
