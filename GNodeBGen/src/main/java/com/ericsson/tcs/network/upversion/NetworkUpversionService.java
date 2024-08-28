package com.ericsson.tcs.network.upversion;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import com.ericsson.tcs.config.wrapper.UserConfig;
import com.ericsson.tcs.controller.MainController;
import com.ericsson.tcs.enrichment.EnrichConfigParser;

/**
 * @author xjaimah
 *
 */
public class NetworkUpversionService {
     /**
     * 
     */
    public void init(){
     Map<String, File[]> files = collectFilesAndProcess();
      if(!files.isEmpty()){
          processFiles(files);
      }else{
          System.out.println("ERROR: Please check the input location, GPB files are not present in input location.");
      }
    }

    /**
     * This method will use to process files network function wise.
     * @param files
     */
    private void processFiles(Map<String, File[]> files) {
        for(String key : files.keySet()){
            List<File> fileList =  Arrays.asList(files.get(key));
            int poolSize = Runtime.getRuntime().availableProcessors();
            int fdnCount = fileList.size();
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
                for(int threadindex = 0; threadindex < poolSize; threadindex++){
                    startIndex = endIndex;
                    if(threadindex == poolSize - 1){
                        endIndex = fdnCount;
                    } else{
                        endIndex = endIndex + factor + (mod > 0 ? 1 : 0);
                        mod--;
                    }
                    List<File> subFileList = fileList.subList(startIndex,endIndex);
                    NetworkUpversionWorker work = new NetworkUpversionWorker();
                    work.setFileToProcess(subFileList);
                    work.setNetworkFuncation(key);
                    threadPoolTaskExecutor.execute(work);
                }
                threadPoolTaskExecutor.shutdown();
                while (!threadPoolTaskExecutor.isTerminated()){
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * This method will be use to collect files as per network funcation.
     * @return
     */
    private Map<String, File[]> collectFilesAndProcess() {
        Map<String, File[]> filesPerNetworkFunction = new HashMap<String,File[]>();
        String [] nfDirs = new File(MainController.config.getInput_location()).list();
        for(String networkFuncation : nfDirs){
            File inputNfFolder = new File(MainController.config.getInput_location() + File.separator + networkFuncation);
            File[] files = inputNfFolder.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if (name.endsWith(".gpb") || name.endsWith(".gz")) {
                        return true;
                    }else{
                        return false;
                    }
                }
            });
            if(files.length > 0){
                filesPerNetworkFunction.put(networkFuncation, files);
            }
        }
        return filesPerNetworkFunction;
    }
}
