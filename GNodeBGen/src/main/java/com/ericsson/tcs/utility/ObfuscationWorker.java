package com.ericsson.tcs.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;

/**
 * @author xjaimah
 *
 */
public class ObfuscationWorker implements Runnable {

	/**
	 * The outputLocation
	 */
	private String outputLocation;

	/**
	 * The fdnToFileList
	 */
	private Map<String, List<String>> fdnToFileList;

	/**
	 * The fdnList
	 */
	private List<String> fdnList;

	/**
	 * The startIndex
	 */
	private int startIndex;

	/**
	 * The gpbService
	 */
	private GPBServices gpbService;

	/**
	 * The decode
	 */
	private DecoderService decode;

	/**
	 * The encode
	 */
	private EncoderService encode;

	/**
	 * @param fdnList
	 *            the fdnList to set
	 */
	public void setFdnList(List<String> fdnList) {
		this.fdnList = fdnList;
	}

	/**
	 * @param outputLocation
	 *            the outputLocation to set
	 */
	public void setOutputLocation(String outputLocation) {
		this.outputLocation = outputLocation;
	}

	/**
	 * @param fdnToFileList
	 *            the fdnToFileList to set
	 */
	public void setFdnToFileList(Map<String, List<String>> fdnToFileList) {
		this.fdnToFileList = fdnToFileList;
	}

	/**
	 * @param startIndex
	 *            the startIndex to set
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	@Override
	public void run() {
		gpbService = new GPBServices();
		decode = new DecoderService();
		encode = new EncoderService();
		FileReader file = new FileReader();
		for (String fdn : fdnList) {
			for (String fileLocation : fdnToFileList.get(fdn)) {
				startObfuscation(fileLocation, file);
			}
			startIndex += 1;
		}
	}

	/**
	 * 
	 * Generate new NCI value.
	 * 
	 * @return
	 */
	private Object getUpdateNCI(Map<String, Object> values) {
		Long nci = (Long) values.get(ConstantParameter.NCI);
		Long genodBIDLength = (Long) values.get(ConstantParameter.GNODEBID_Length);
		Long nciValue;
		if (genodBIDLength == 22) {
			Long cellId = nci & 0x0000003fff;
			nciValue = ((startIndex << (36 - genodBIDLength)) | cellId);
		} else {
			Long cellId = nci & 0x000000000f;
			nciValue = ((startIndex << (36 - genodBIDLength)) | cellId);
		}
		
		return nciValue;
	}

	/**
	 * This method will update
	 */
	private void startObfuscation(String filePath, FileReader fileReader) {
		File file = new File(filePath);
		List<byte[]> eventList = fileReader.getFileEventList(file);
		Set<String> parameters = new HashSet<>();
		parameters.add(ConstantParameter.GNODEBID_Length);
		parameters.add(ConstantParameter.NCI);
		Map<String, Object> paramToEnrich = new HashMap<String, Object>();
		paramToEnrich.put(ConstantParameter.GNODEBID, startIndex);
		paramToEnrich.put(ConstantParameter.PLMN_ID, encode.makePLMNId(ConstantParameter.MCC, ConstantParameter.MNC));
		List<byte[]> fileEvents = new ArrayList<byte[]>();
		for (byte[] event : eventList) {
			PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
			PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
			Map<String, Object> values = decode.getEventParamValue(pmEventMessage, parameters);
			if (pmEventMessage.getGroupValue() != 1) {
				if(null != values && values.containsKey(ConstantParameter.NCI)) {
					paramToEnrich.put(ConstantParameter.NCI, getUpdateNCI(values));
				}
				encode.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, paramToEnrich, null);
			}
			fileEvents.add(gpbService.write(pmEventMessageBuilder.build()));
		}
		writeGBP(fileEvents, file.getName().replace(ConstantParameter.GZ_EXT, ""));
	}

	/**
	 * This method will write data in GPB file at given location.
	 * 
	 * @param data
	 * @param path
	 */
	private void writeGBP(List<byte[]> data, String fileName) {
		FileOutputStream fileOuputStream = null;
		GZIPOutputStream gzOutput = null;
		try {
			fileOuputStream = new FileOutputStream(
					outputLocation + File.separator + fileName + ConstantParameter.GZ_EXT);
			gzOutput = new GZIPOutputStream(fileOuputStream);
			for (byte[] dt : data) {
				gzOutput.write(dt);
			}
		} catch (IOException e) {
			System.out.println("Error while writing events into the files. " + e.getMessage());
		} finally {
			try {
				if (gzOutput != null) {
					gzOutput.close();
				}
				if (fileOuputStream != null) {
					fileOuputStream.close();
				}
			} catch (Exception e) {
				System.out.println("Error while closing file and output stream " + e.getMessage());
			}
		}
	}

}

