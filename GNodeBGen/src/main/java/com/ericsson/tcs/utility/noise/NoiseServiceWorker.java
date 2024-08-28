package com.ericsson.tcs.utility.noise;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;

public class NoiseServiceWorker implements ConstantParameter {

    private static List<Integer> fileSizes = new ArrayList<>();

    // Thread configuration
    private static int THREAD_CNT = 1;
    private static final int SLEEP_TIME = 500;

    private static final int ONE_KB = 1024;

    // Noise Data Map
    private static Map<Integer, List<byte[]>> noiseFileMap;

    public void consumeNoiseData() {
        // FILENAME : NR_NOISE_FILE_1_KB.gpb.gz
        noiseFileMap = new HashMap<Integer, List<byte[]>>();

        File noiseFileLocObj = new File(NoiseServiceInitializer.getPRECOOK_NOISE_FILE_LOCATION());

        for (File noiseFile : noiseFileLocObj.listFiles()) {
            if (noiseFile.getName().contains(GPB_EXT) && noiseFile.getName().endsWith(GZ_EXT)) {
                String[] fileNameArray = noiseFile.getName().replace(GPB_EXT, "").replace(GZ_EXT, "").split("_");
                int noiseFileSize = Integer.parseInt(fileNameArray[3]);
                noiseFileMap.put(noiseFileSize, collectFileEventsWithEventLen(noiseFile));
            }
        }

        fileSizes.addAll(noiseFileMap.keySet());
        java.util.Collections.sort(fileSizes);
        java.util.Collections.reverse(fileSizes);

        evaluateFilesAndDoOperation();
    }

    public void setThreadCount(int cnt) {
        if (cnt <= 100) {
            THREAD_CNT = 1;
        } else if (cnt > 100 && cnt <= 1000) {
            THREAD_CNT = 10;
        } else if (cnt > 1000) {
            THREAD_CNT = 25;
        }
    }

    public List<byte[]> collectFileEventsWithEventLen(File inputFile) {
        FileReader fileParser = new FileReader();
        GPBServices gpbServices = new GPBServices();
        List<byte[]> eventList = new ArrayList<>();
        for (byte[] b : fileParser.getFileEventList(inputFile)) {
            PmEvent.Builder pmEventBuilder = ((PmEvent) gpbServices.getPmEventOuterMessage(b)).toBuilder();
            eventList.add(gpbServices.write(pmEventBuilder.build()));
        }
        return eventList;
    }

    public List<byte[]> getRequireNoiseEvents(long reqNoiseToAdd) {
        List<byte[]> reqNoiseEventsList = new ArrayList<>();
        for (int size : fileSizes) {
            if (reqNoiseToAdd >= size) {
                for (byte b[] : noiseFileMap.get(size)) {
                    reqNoiseEventsList.add(b);
                }
                reqNoiseToAdd -= size;
            }
        }
        return reqNoiseEventsList;
    }

    public long writeInformation(String netFun, String outFileName, List<byte[]> allEventList) {
        long newFileSize = 0;
        String outputFilePath = NoiseServiceInitializer.getOUTPUT_LOCATION() + File.separator + netFun + File.separator
                + outFileName;
        FileOutputStream fileStream = null;
        GZIPOutputStream gZipStream = null;
        try {
            fileStream = new FileOutputStream(outputFilePath);
            gZipStream = new GZIPOutputStream(fileStream);
            for (byte[] b : allEventList) {
                gZipStream.write(b);
            }
            File newOutFile = new File(outputFilePath);
            newFileSize = newOutFile.length();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != gZipStream) {
                    gZipStream.flush();
                    gZipStream.close();
                }
                if (null != fileStream) {
                    fileStream.flush();
                    fileStream.close();
                }
            } catch (Exception x) {
                x.printStackTrace();
            }
        }
        return newFileSize / 1024;
    }

    public void doOperation(String nf, List<File> inputFiles) {

        // SIZE_BUFFER + --> Input file has more data than expected
        // SIZE_BUFFER - --> Input file has less data than expected
        long SIZE_BUFFER = 0;

        for (File f : inputFiles) {
            List<byte[]> inputFileEventList = collectFileEventsWithEventLen(f);
            long fileSize = f.length() / ONE_KB;
            // noiseNeeded is + (Positive),
            // Input file size is less than expected
            // 3072 - 2072 = +1000
            // noiseNeeded is - (Negative),
            // Input file size is more than expected
            // 3072 - 4072 = -1000
            long noiseNeeded = NoiseServiceInitializer.getNetwork_fn_file_size_map().get(nf) - fileSize;
            long newExpectedFileSize = fileSize;
            if (noiseNeeded > 0) {
                if (SIZE_BUFFER > 0) {
                    if (SIZE_BUFFER >= noiseNeeded) {
                        SIZE_BUFFER -= noiseNeeded;
                        noiseNeeded = 0;
                    } else if (SIZE_BUFFER < noiseNeeded) {
                        noiseNeeded -= SIZE_BUFFER;
                        SIZE_BUFFER = 0;
                    }
                } else if (SIZE_BUFFER <= 0) {
                    noiseNeeded += SIZE_BUFFER;
                    SIZE_BUFFER = 0;
                }
                if (noiseNeeded > 0) {
                    newExpectedFileSize += noiseNeeded;
                    int lastIndex = inputFileEventList.size() - 1;
                    byte[] b = inputFileEventList.get(lastIndex);
                    inputFileEventList.remove(lastIndex);
                    inputFileEventList.addAll(getRequireNoiseEvents(noiseNeeded));
                    inputFileEventList.add(b);

                }
            } else {

                // If input file size is more than required file size then
                // transfer extra available noise in SIZE_BUFFER.
                SIZE_BUFFER += (noiseNeeded * -1);
            }
            long newActualFileSize = writeInformation(nf, f.getName(), inputFileEventList);
            if (newExpectedFileSize >= newActualFileSize) {
                // Less information generated ref with expected.
                SIZE_BUFFER -= (newExpectedFileSize - newActualFileSize);
            } else {
                // expected < actual
                // More information generated ref with expected.
                SIZE_BUFFER += (newActualFileSize - newExpectedFileSize);
            }
        }
    }

    public void evaluateFilesAndDoOperation() {
        ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(THREAD_CNT);
        for (String nf : NoiseServiceInitializer.getInFileMap().keySet()) {
            List<File> files = NoiseServiceInitializer.getInFileMap().get(nf);
            setThreadCount(files.size());
            // System.out.println(THREAD_CNT);
            Map<Integer, List<File>> threadFilePool = new HashMap<>();
            int thread_counter = 0;
            for (File f : files) {
                if (thread_counter >= THREAD_CNT) {
                    thread_counter = 0;
                }
                if (!threadFilePool.containsKey(thread_counter)) {
                    threadFilePool.put(thread_counter, new ArrayList<File>());
                }
                threadFilePool.get(thread_counter).add(f);
                thread_counter++;
            }
            for (int thread_id : threadFilePool.keySet()) {
                pool.execute(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        doOperation(nf, threadFilePool.get(thread_id));
                    }
                });
            }
        }
        pool.shutdown();
        while (!pool.isTerminated()) {
            try {
                Thread.sleep(SLEEP_TIME);
            } catch (Exception e) {
                System.out.println("ERROR : Exception in Thread Sleep logic for termination.");
            }
        }

    }
}
