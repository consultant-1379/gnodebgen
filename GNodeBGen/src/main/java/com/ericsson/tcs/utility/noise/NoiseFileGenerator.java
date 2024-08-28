package com.ericsson.tcs.utility.noise;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;

/**
 * This class is use to generate noise files
 *
 * @author xmanabh
 */

public class NoiseFileGenerator {

    private String inputNoiseFile;
    private String outputNoiseFileLocation;

    private final String NOISE_FILE_FORMAT = "NR_NOISE_FILE_SIZE_KB.gpb.gz";

    private int maxFileSize;

    public NoiseFileGenerator(String inputFile, String outputLoc, String maxSize) {
        // TODO Auto-generated constructor stub
        this.inputNoiseFile = inputFile;
        this.outputNoiseFileLocation = outputLoc;
        this.maxFileSize = Integer.parseInt(maxSize);
        init();
    }

    public void generateMultipleNoiseFile(List<Integer> sizeList, List<byte[]> eventList) {
        int startIndex = 0;
        int endIndex = 0;
        Map<Integer, Integer> pushedEventsHistory = new HashMap<>();
        for (int size : sizeList) {
            long sizeInBytes = size * 1024;
            String outFileName = outputNoiseFileLocation + File.separator
                    + NOISE_FILE_FORMAT.replace("SIZE", Integer.toString(size));
            FileOutputStream fos = null;
            GZIPOutputStream gos = null;
            if (pushedEventsHistory.keySet().size() > 0) {
                int sum = 0;
                int totalEventsPushed = 0;
                int averageEventPerKb = 0;
                for (int i : pushedEventsHistory.keySet()) {
                    sum += i;
                    totalEventsPushed += pushedEventsHistory.get(i);
                }
                averageEventPerKb = totalEventsPushed / sum;
                endIndex = endIndex - 1 + (averageEventPerKb * size);
            }
            try {
                while (true) {
                    File outFileObj = new File(outFileName);
                    outFileObj.createNewFile();
                    fos = new FileOutputStream(outFileObj);
                    gos = new GZIPOutputStream(fos);
                    for (int i = startIndex; i <= endIndex; i++) {
                        if (i >= eventList.size()) {
                            System.out.println(
                                    "ERROR : Not enough iteration reamining in list to get the event information.");
                            System.exit(1);
                        }
                        gos.write(eventList.get(i));
                    }
                    gos.flush();
                    fos.flush();
                    gos.close();
                    fos.close();
                    endIndex++;
                    if (outFileObj.length() >= sizeInBytes) {
                        pushedEventsHistory.put(size, (endIndex - 1 - startIndex));
                        System.out.println(size + " : " + pushedEventsHistory.get(size));
                        startIndex = endIndex;
                        break;
                    } else {
                        outFileObj.delete();
                        while (outFileObj.exists()) {
                            Thread.sleep(50);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != gos) {
                        gos.flush();
                        gos.close();
                    }
                    if (null != fos) {
                        fos.flush();
                        fos.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void populateFileSizeList(File f) {
        List<Integer> sizeList = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            int tempSize = i;
            for (int j = 1; j < 5; j++) {
                if (tempSize <= maxFileSize) {
                    sizeList.add(tempSize);
                }
                tempSize = tempSize * 10;
            }
        }

        Collections.sort(sizeList);

        FileReader fileParser = new FileReader();
        GPBServices gpbService = new GPBServices();

        List<byte[]> eventList = new ArrayList<>();

        for (byte[] b : fileParser.getFileEventList(f)) {
            PmEvent.Builder pmEventBuilder = ((PmEvent) gpbService.getPmEventOuterMessage(b)).toBuilder();
            eventList.add(gpbService.write(pmEventBuilder.build()));
        }

        generateMultipleNoiseFile(sizeList, eventList);
    }

    public void init() {
        File mainNoiseFile = new File(inputNoiseFile);
        File noiseOutLocation = new File(outputNoiseFileLocation);

        if (!mainNoiseFile.exists() || !mainNoiseFile.isFile()) {
            System.out.println("ERROR : " + inputNoiseFile + " does not exists.");
            System.exit(1);
        }

        if (!noiseOutLocation.exists() || !noiseOutLocation.isDirectory()) {
            System.out.println("ERROR : " + outputNoiseFileLocation + " does not exists.");
            System.exit(1);
        }

        if (maxFileSize > 0) {
            populateFileSizeList(mainNoiseFile);
        } else {
            System.out.println("ERROR : Max size can not be less than or equal to 0.");
            System.exit(1);
        }
    }

}
