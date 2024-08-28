package com.ericsson.tcs.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.ericsson.tcs.constant.Utils;

/**
 * This class is use to obfuscate GNodeBID, NCI 
 * @author xjaimah
 */
public class ObfuscationService {

	
	/**
	 * The Output location
	 */
	private String outputLocation;
	
	/**
	 * The fdnToFileList
	 */
	Map <String, List<String>> fdnToFileList;
	
	/**
	 * Initialize parameters.
	 * @param inputLocation
	 * @param outputLocation
	 * @throws Exception 
	 */
	public void init(String inputLocation, String outputLocation) {
		fdnToFileList = new HashMap<>();
		this.outputLocation = outputLocation;
		collectAndArrangeFiles(inputLocation);
		if(fdnToFileList.isEmpty()) {
			System.out.println("ERROR: Please provide proper input file location as GPB files are not present at location :" + inputLocation);
			System.exit(1);
		}
		try {
			distributeFdnToThreads();
		} catch (Exception e) {
			System.out.println("Error while processing GPB files. "+e.getMessage());
		}
		System.out.println("Process completed successfully please check the updated file present at location: "+ outputLocation);
	}

	/**
	 * This method will recursively collect files from given location.
	 * @param inputLocation
	 */
	private void collectAndArrangeFiles(String inputLocation) {
		File directory = new File(inputLocation);
        List<File> fList = Arrays.asList(directory.listFiles());
        Collections.sort(fList);
        if (null != fList)
            for (File file : fList) {
                String fileName = file.getName();
                String fdn = Utils.getFdnWithAllDetails(fileName);
                if (Utils.fileFilters(fileName)) {
                	if(!fdnToFileList.containsKey(fdn)) {
                		List<String> tmp = new ArrayList<>();
                		fdnToFileList.put(fdn, tmp);
                	}
                	fdnToFileList.get(fdn).add(file.getAbsolutePath());
                } else if (file.isDirectory()) {
                	collectAndArrangeFiles(file.getAbsolutePath());
                }
            }
	}
	
	 /**
     * Distribute fdn to threads.
     *
     * @param fdnToFileNameListMap2
     * @throws Exception
     *             the exception
     */
    private void distributeFdnToThreads() throws Exception{
        try{
            int poolSize = Runtime.getRuntime().availableProcessors();
            int fdnCount = fdnToFileList.size();
            if(fdnCount > 0){
                int factor = 1;
                int mod = 0;
                int startIndex = 0;
                int endIndex = 0;
                if(fdnCount < poolSize){
                    poolSize = fdnCount;
                    mod = -1;
                } else{
                    factor = fdnCount / poolSize;
                    mod = fdnCount % poolSize;
                }
                ThreadPoolExecutor threadPoolTaskExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(poolSize);
                List<String> fdnList = new ArrayList<String>(fdnToFileList.keySet());
                int startGnbId = 1;
                for(int threadindex = 0; threadindex < poolSize; threadindex++){
                    startIndex = endIndex;
                    if(threadindex == poolSize - 1){
                        endIndex = fdnCount;
                    } else{
                        endIndex = endIndex + factor + (mod > 0 ? 1 : 0);
                        mod--;
                    }
                    List<String> subfdnList = fdnList.subList(startIndex,endIndex);
                    ObfuscationWorker work = new ObfuscationWorker();
                    work.setFdnToFileList(fdnToFileList);
                    work.setOutputLocation(outputLocation);
                    work.setFdnList(subfdnList);
                    work.setStartIndex(startGnbId);
                    threadPoolTaskExecutor.execute(work);
                    startGnbId = subfdnList.size() + 1;
                }
                threadPoolTaskExecutor.shutdown();
                while (!threadPoolTaskExecutor.isTerminated()){
                    Thread.sleep(5000);
                }
            }
        } catch(Exception e){
            System.out.println("Error occurred while distributing fdn to threads : " + e);
        }
    }

}
