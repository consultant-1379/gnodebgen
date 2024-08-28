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
package com.ericsson.tcs.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.ericsson.tcs.constant.Utils;

/**
 * This class is use to correct NCI, NCI 
 * @author xjaimah
 */
public class DataCorrectionService {
	
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
		Utils.collectAndArrangeFiles(inputLocation, fdnToFileList);
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
                for(int threadindex = 0; threadindex < poolSize; threadindex++){
                    startIndex = endIndex;
                    if(threadindex == poolSize - 1){
                        endIndex = fdnCount;
                    } else{
                        endIndex = endIndex + factor + (mod > 0 ? 1 : 0);
                        mod--;
                    }
                    List<String> subfdnList = fdnList.subList(startIndex,endIndex);
                    DataCorrectionWorker work = new DataCorrectionWorker();
                    work.setFdnList(subfdnList);
                    work.setFdnToFileList(fdnToFileList);
                    work.setOutputLocation(outputLocation);
                    threadPoolTaskExecutor.execute(work);
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

