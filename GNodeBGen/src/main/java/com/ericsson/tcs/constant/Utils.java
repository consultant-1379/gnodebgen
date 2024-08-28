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

package com.ericsson.tcs.constant;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.CuCpFunctionPmEventOuterClass.CuCpFunctionPmEvent;
import com.ericsson.pm_event.CuUpFunctionPmEventOuterClass.CuUpFunctionPmEvent;
import com.ericsson.pm_event.DuFunctionPmEventOuterClass.DuFunctionPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.CommonPmEvent;
import com.ericsson.tcs.config.wrapper.UserConfig;
import com.ericsson.tcs.controller.MainController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;

public class Utils implements ConstantParameter {

	static Random random;

	private static Map<Integer, FieldDescriptor> eventIds = new HashMap<>();

	private static Map<Integer, String> eventToNetworkFuncationMap = new HashMap<>();

	static {
		setEventIds();
		random = new Random();
	}

	public long convertObjectToLongValue(Object o) {
		String s = o.toString();
		long l = (long) Double.parseDouble(s);
		return l;
	}

	public static List<String[]> returnCsvObjects(String csvFile) {
		List<String[]> csvLineList = new ArrayList<>();
		String row = null;
		BufferedReader csvReader = null;
		try {
			File csv = new File(csvFile);
			csvReader = new BufferedReader(new FileReader(csv));
			csvReader.readLine();
			while ((row = csvReader.readLine()) != null) {
				if (!row.startsWith("#") && (!row.isEmpty())) {
					row = row.trim();
					String[] data = row.split(",");
					csvLineList.add(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR : Issue while reading csv file : " + csvFile);
		} finally {
			if (null != csvReader) {
				try {
					csvReader.close();
				} catch (IOException i) {
					System.out.println("ERROR : IO Exception while closing file : " + csvFile);
				}
			}
		}
		return csvLineList;
	}

	/**
	 * This method will convert parsed file output to JSON object
	 */
	public static void convertObjectToJson(Object object, String fileName, String outputLocation) {
		Gson gson = new GsonBuilder().disableHtmlEscaping().create();
		String jsonString = gson.toJson(object);
		try (FileWriter file = new FileWriter(outputLocation + File.separator + fileName)) {
			file.write(jsonString);
			file.flush();
			file.close();
		} catch (IOException e) {
			System.out.println("ERROR: Issue while writing JSON object into file. " + e.getMessage());
		}
	}

	public static long convertStringToDate(String dateString) {
		Date RopDate;
		DateFormat formatter;

		formatter = new SimpleDateFormat("yyyyMMdd.HHmm");
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			RopDate = formatter.parse(dateString);
		} catch (ParseException e) {
			return 0L;
		}
		return RopDate.getTime();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see common.iservices.IDateTimeHandler#convertToRoundFigureUpdated(long, int)
	 */
	public static long convertToRoundFigureUpdated(long dateInMillis, int ropInterval) {
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(dateInMillis);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int remainMin = minute % ropInterval;
		int minutesToAdd = ropInterval - remainMin - 1;
		int secondsToAdd = 60 - second;
		dateInMillis = dateInMillis + minutesToAdd * 60000 + secondsToAdd * 1000 - ropInterval * 60000;
		return dateInMillis;
	}

	public synchronized static boolean mkDir(String name, UserConfig userConfigObj) throws InterruptedException {
		File file = new File(
				userConfigObj.getIntermediate_location() + File.separator + userConfigObj.getData_source_name()
						+ File.separator + userConfigObj.getRop_period() + File.separator + name);
		if (!file.exists()) {
			return file.mkdirs();
		} else {
			return true;
		}
	}

	public static long getCurrentUtcSystemTimeInSeconds() {
		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
		long secondsSinceEpoch = ((calendar.getTimeInMillis() / 1000L) / 900);
		return (secondsSinceEpoch * 900) + 900;
	}

	public static String convertStringToDateWithTimeZone(long epoch, String timeZone) {
		Date date = new Date(epoch * 1000L);
		DateFormat format = new SimpleDateFormat("yyyyMMdd.HHmm");
		format.setTimeZone(TimeZone.getTimeZone(timeZone));
		String formatted = format.format(date);
		return formatted;
	}

	public static void makeDirectory(String inputPath) {
		File file = new File(inputPath);
		if (!file.exists()) {
			file.mkdirs();
		} else if (!file.isDirectory()) {
			file.mkdirs();
		}
	}

	/**
	 * This method convert input integer value to ByteArray and return that byte
	 * array.
	 * 
	 * @param : integer_value (int)
	 * @return : byte[]
	 */
	public static byte[] convertIntegerToByteArray(int value) {
		byte[] bytes = ByteBuffer.allocate(4).putInt(value).array();
		return bytes;
	}

	/**
	 * This method parse Ne/Node name from given input file name
	 * 
	 * @param inputFileName
	 * @return node_name (string)
	 */
	public static String parseNeName(String inputFileName) {
		// This method will parse node name from input file using
		// ManagedElement/MeContext

		String ne_name = null;

		int startIndex = inputFileName.indexOf("ManagedElement=");
		int endIndex = inputFileName.indexOf("_celltrace");

		if (startIndex != -1) {
			return inputFileName.substring(startIndex + 15, endIndex);
		}

		startIndex = inputFileName.indexOf("MeContext=");
		if (startIndex != -1) {
			return inputFileName.substring(startIndex + 10, endIndex);
		}

		return ne_name;
	}

	/**
	 * This method return fdn details with subnetwork, mecontext/managedelement
	 * 
	 * @param inputFileName
	 * @return
	 */
	public static String getFdnWithAllDetails(String inputFileName) {
		return inputFileName.substring(20, inputFileName.indexOf("_celltrace"));
	}

	/**
	 * This method detect the OS on which application is running and return the OS
	 * name
	 * 
	 * @return String = OS name
	 */
	public static String detectOS() {
		String OS = System.getProperty("os.name").toLowerCase();
		if (OS.indexOf("win") >= 0) {
			return ConstantParameter.WINDOWS;
		} else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") >= 0) {
			return ConstantParameter.LINUX;
		} else {
			return ConstantParameter.UNKNOWN;
		}
	}

	public static String createDirectory(String start_date, String netFnDir) {
		String dirPath = MainController.config.getIntermediate_location() + File.separator
				+ MainController.config.getData_source_name() + File.separator + MainController.config.getRop_period()
				+ File.separator + netFnDir + File.separator + start_date;
		makeDirectory(dirPath);
		return dirPath;
	}

	/**
	 * @param binaryFile
	 * @return
	 * @throws IOException
	 */
	public static int getBufferSizeForBinaryFiles(File binaryFile) throws IOException {
		int size = 0;
		if (binaryFile.getName().endsWith(".gz")) {
			RandomAccessFile raf = new RandomAccessFile(binaryFile, "r");
			raf.seek(raf.length() - 4);
			int b4 = raf.read();
			int b3 = raf.read();
			int b2 = raf.read();
			int b1 = raf.read();
			size = b1 << 24 | (b2 << 16) + (b3 << 8) + b4;
			raf.close();
		} else {
			size = (int) binaryFile.length();
		}
		return size;
	}

	/**
	 * It will return file extension.
	 * 
	 * @param file
	 * @return
	 */
	public static String getFileExtension(String fileName) {
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		} else {
			return "";
		}
	}

	/**
	 * 
	 * @param fileName
	 * @param ropFilterString
	 * @return
	 */
	public static boolean fileFilters(String fileName) {
		String fileExtension = getFileExtension(fileName);
		if (ConstantParameter.FILE_EXTENSION.contains(fileExtension)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method will recursively collect files from given location.
	 * 
	 * @param inputLocation
	 */
	public static void collectAndArrangeFiles(String inputLocation, Map<String, List<String>> fdnToFileList) {
		File directory = new File(inputLocation);
		List<File> fList = Arrays.asList(directory.listFiles());
		Collections.sort(fList);
		if (null != fList)
			for (File file : fList) {
				String fileName = file.getName();
				if (Utils.fileFilters(fileName)) {
					String fdn = Utils.getFdnWithAllDetails(fileName);
					if (!fdnToFileList.containsKey(fdn)) {
						List<String> tmp = new ArrayList<>();
						fdnToFileList.put(fdn, tmp);
					}
					fdnToFileList.get(fdn).add(file.getAbsolutePath());
				} else if (file.isDirectory()) {
					collectAndArrangeFiles(file.getAbsolutePath(), fdnToFileList);
				}
			}
	}

	public static void collectFiles(String inputLocation, List<String> fileList) {
		File directory = new File(inputLocation);
		List<File> fList = Arrays.asList(directory.listFiles());
		Collections.sort(fList);
		if (null != fList)
			for (File file : fList) {
				String fileName = file.getName();
				if (Utils.fileFilters(fileName)) {
					fileList.add(file.getAbsolutePath());
				} else if (file.isDirectory()) {
					collectFiles(file.getAbsolutePath(), fileList);
				}
			}
	}

	/**
	 * This method will give mapping between event name and event id.
	 * 
	 * @param eventIds
	 */
	public static void getEventNameToIdMap(Map<Long, String> eventIds) {
		List<OneofDescriptor> oneOfs;
		oneOfs = DuFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Long eventId = (long) event.getNumber();
				eventIds.put(eventId, event.getJsonName());
			}
		}
		oneOfs = CuCpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Long eventId = (long) event.getNumber();
				eventIds.put(eventId, event.getJsonName());
			}
		}
		oneOfs = CuUpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Long eventId = (long) event.getNumber();
				eventIds.put(eventId, event.getJsonName());
			}
		}
		oneOfs = CommonPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Long eventId = (long) event.getNumber();
				eventIds.put(eventId, event.getJsonName());
			}
		}
	}

	/**
	 * This method will recursively collect files from given location.
	 * 
	 * @param inputLocation
	 */
	public static void collectRopsFiles(String inputLocation, Map<String, List<String>> fdnToFileList) {
		File directory = new File(inputLocation);
		List<File> fList = Arrays.asList(directory.listFiles());
		Collections.sort(fList);
		if (null != fList)
			for (File file : fList) {
				String fileName = file.getName();
				if (Utils.fileFilters(fileName)) {
					String inFileRopTime = fileName.substring(0, 14);
					if (!fdnToFileList.containsKey(inFileRopTime)) {
						List<String> tmp = new ArrayList<>();
						fdnToFileList.put(inFileRopTime, tmp);
					}
					fdnToFileList.get(inFileRopTime).add(file.getAbsolutePath());
				} else if (file.isDirectory()) {
					collectAndArrangeFiles(file.getAbsolutePath(), fdnToFileList);
				}
			}
	}

	/*
	 * Read the named file into a list of strings
	 */
	public static List<String> readFile(String fileName) {
		List<String> result = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				int idx = line.indexOf('#'); // strip out comments
				if (idx > -1) {
					line = line.substring(0, idx);
				}
				line = line.trim();
				if (line.length() > 0) {
					result.add(line);
				}
			}
		} catch (IOException e) {
			System.out.println("File " + fileName + " is not available. Please check the path and file name.");
		}
		return result;
	}

	/**
	 * Convert a string "0123ab" into byte [] = {0x01, 0x23, 0xab}
	 *
	 * @param s
	 * @return byte []
	 */
	public static byte[] hexStringToByteArray(String s) {
		int len = s.length();

		byte[] data = new byte[len / 2];
		for (int i = 0; i < len; i += 2) {
			data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
		}
		return data;
	}

	public static byte[] longToBytes(long x) {
		ByteBuffer longBuffer = ByteBuffer.allocate(Long.SIZE / 8);
		longBuffer.putLong(0, x);
		return longBuffer.array();
	}

	/*
	 * Return value of int or zero
	 */
	public static Integer safeParseInt(String s) {
		if (s == null || s.isEmpty()) {
			return 0;
		}
		try {
			return Integer.parseInt(s);
		} catch (Exception e) {
			return 0;
		}
	}

	/*
	 * Return value of long or zero
	 */
	public static Long safeParseLong(String s) {
		if (s == null || s.isEmpty()) {
			return 0L;
		}
		try {
			return Long.parseLong(s);
		} catch (Exception e) {
			return 0L;
		}
	}

	public static double safeParseDouble(String s, double defaultVal) {
		if (s == null || s.isEmpty()) {
			return defaultVal;
		}
		try {
			return Double.parseDouble(s);
		} catch (Exception e) {
			return defaultVal;
		}
	}

	private static void setEventIds() {
		List<OneofDescriptor> oneOfs;
		oneOfs = DuFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				eventToNetworkFuncationMap.put(eventId, DU);
			}
		}
		oneOfs = CuCpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				eventToNetworkFuncationMap.put(eventId, CUCP);
			}
		}
		oneOfs = CuUpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				eventToNetworkFuncationMap.put(eventId, CUUP);
			}
		}
		oneOfs = CommonPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				eventToNetworkFuncationMap.put(eventId, COMMON);
			}
		}
	}

	public static boolean isValidId(final Integer msgId) {
		return eventIds.containsKey(msgId);
	}

	public static Integer isValidId(String eventName) {
		for (Entry<Integer, FieldDescriptor> evt : eventIds.entrySet()) {
			if (eventName.equalsIgnoreCase(evt.getValue().getJsonName())) {
				return evt.getKey();
			}
		}
		return -1;
	}

	/*
	 * add text from another file to this point in the pattern command is :
	 * include=filename[,repeatCount]
	 */
	public static List<String> handleIncludeCmd(String keyVal, String inFile) {
		List<String> text = new ArrayList<>();
		String fname = keyVal;
		int idx = fname.indexOf(',');
		int numRepeat = 1;
		if (idx > 0) { // Is there a repeat count?
			fname = keyVal.substring(0, idx).trim();
			String val = keyVal.substring(idx + 1).trim();
			String val2 = "";
			try {
				// Is the repeat count random?
				if (val.startsWith("r(") || val.startsWith("R(")) {
					val2 = val.substring(2, val.length() - 1);
					int maxVal = Integer.parseInt(val2);
					numRepeat = random.nextInt(maxVal) + 1;
				} else {
					numRepeat = Integer.parseInt(val);
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid repeat count >{}< specified for include for {} !" + val);
				numRepeat = 1;
			}
		}
		try {
			// get the path to the parent
			String path = new File(inFile).getAbsolutePath();
			path = path.substring(0, path.lastIndexOf(File.separator) + 1);

			if (fname.startsWith("\"")) {
				// deal with strings
				fname = fname.substring(1, fname.length() - 1);
			}
			List<String> importText = Utils.readFile(path + fname);
			for (int repeatCnt = 0; repeatCnt < numRepeat; repeatCnt++) {
				importText.addAll(Utils.readFile(path + fname));
			}
		} catch (Exception e) {
			System.out.println("Error! Include file failed {} " + keyVal);
		}
		return text;
	}

	/**
	 * @return the eventToNetworkFuncationMap
	 */
	public static Map<Integer, String> getEventToNetworkFuncationMap() {
		return eventToNetworkFuncationMap;
	}

	/**
	 * @param eventToNetworkFuncationMap the eventToNetworkFuncationMap to set
	 */
	public static void setEventToNetworkFuncationMap(Map<Integer, String> eventToNetworkFuncationMap) {
		Utils.eventToNetworkFuncationMap = eventToNetworkFuncationMap;
	}

	public void compressedFileWrite(List<byte[]> eventList, String outFilePath) {
		FileOutputStream fileOuputStream = null;
		GZIPOutputStream gzOutput = null;
		try {
			fileOuputStream = new FileOutputStream(outFilePath);
			gzOutput = new GZIPOutputStream(fileOuputStream);
			for (byte[] event : eventList) {
				gzOutput.write(event);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (gzOutput != null) {
				try {
					gzOutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOuputStream != null) {
				try {
					fileOuputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static Map<Integer, FieldDescriptor> getEventIds() {
		return eventIds;
	}

	public static void setEventIds(Map<Integer, FieldDescriptor> eventIds) {
		Utils.eventIds = eventIds;
	}

}
