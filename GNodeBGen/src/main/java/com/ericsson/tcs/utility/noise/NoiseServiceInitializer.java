package com.ericsson.tcs.utility.noise;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class is use to add noise in gpb.gz files
 * @author xmanabh
 */

import com.ericsson.tcs.constant.ConstantParameter;

public class NoiseServiceInitializer implements ConstantParameter {

    private static String INPUT_LOCATION;
    private static String OUTPUT_LOCATION;

    private static String PRECOOK_NOISE_FILE_LOCATION;

    private int FILE_DELTA;

    // inFileMap = {NetworkFunction : List[ Files,...] }
    private static Map<String, List<File>> inFileMap;

    // Pre-Definded Network Function List
    private static Map<String, Integer> network_fn_file_size_map = new HashMap<>();

    public NoiseServiceInitializer(String input_loc, String output_loc, String cucp_size, String du_size,
            String cuup_size, String file_delta, String noise_file_loc) {
        // TODO Auto-generated constructor stub
        try {
            network_fn_file_size_map.put(CUCP, Integer.parseInt(cucp_size));
            network_fn_file_size_map.put(CUUP, Integer.parseInt(cuup_size));
            network_fn_file_size_map.put(DU, Integer.parseInt(du_size));
            INPUT_LOCATION = input_loc;
            OUTPUT_LOCATION = output_loc;
            PRECOOK_NOISE_FILE_LOCATION = noise_file_loc;
            this.FILE_DELTA = Integer.parseInt(file_delta);
            System.out.println("INFO : Given expected average file size value is as below : ");
            for (String s : network_fn_file_size_map.keySet()) {
                System.out.println("INFO : Expected average file size for, " + s + " is, "
                        + network_fn_file_size_map.get(s) + " KB.");
            }
            System.out.println("INFO : Given delta file size value is, " + this.FILE_DELTA + " KB.");
            initService();
        } catch (Exception e) {
            System.out.println("ERROR : Non-proper parameters given.");
            System.out.println(
                    "INFO : Parameters >> Input_Location, Output_Location, Cucp_Size, Du_Size, Cuup_Size, File_Open_Close_Handling");

        }

    }

    public void initService() {
        int status = 1;
        status = generateFileMap();
        if (status == 0) {
            new NoiseServiceWorker().consumeNoiseData();
        }
    }

    public int generateFileMap() {
        File in_loc_obj = new File(INPUT_LOCATION);
        if (!in_loc_obj.exists() || !in_loc_obj.isDirectory()) {
            System.out.println("ERROR : Invalid Input Location , " + INPUT_LOCATION);
            return 1;
        }
        File out_loc_obj = new File(OUTPUT_LOCATION);
        if (!out_loc_obj.exists() || !out_loc_obj.isDirectory()) {
            System.out.println("ERROR : Invalid Input Location , " + OUTPUT_LOCATION);
            return 1;
        }

        inFileMap = new HashMap<>();

        for (File nfDir : in_loc_obj.listFiles()) {
            if (nfDir.isDirectory()) {
                if (network_fn_file_size_map.keySet().contains(nfDir.getName().toUpperCase())) {
                    String net_fn_dir = nfDir.getName().toUpperCase();
                    inFileMap.put(net_fn_dir, new ArrayList<>());
                    long totalVolume = 0;
                    for (File f : nfDir.listFiles()) {
                        if (f.getName().contains(GPB_EXT) && f.getName().endsWith(GZ_EXT)) {
                            inFileMap.get(net_fn_dir).add(f);
                            totalVolume += (f.length() / 1024);
                        }
                    }
                    if (inFileMap.get(net_fn_dir).size() > 0) {
                        int expectedMinFileSize = network_fn_file_size_map.get(net_fn_dir) - FILE_DELTA;
                        if ((totalVolume / inFileMap.get(net_fn_dir).size()) >= expectedMinFileSize) {
                            System.out.println("INFO : Average file size for network function, " + net_fn_dir + " is, "
                                    + (totalVolume / inFileMap.get(net_fn_dir).size())
                                    + " KB. Skipping increase in file size for this network function.");
                            inFileMap.remove(net_fn_dir);
                        }
                    } else {
                        inFileMap.remove(net_fn_dir);
                    }
                }
            } else {
                System.out.println("ERROR : Network Function directory expected.");
                return 1;
            }
        }
        if (inFileMap.size() < 1) {
            System.out.println("WARNING : No files found. Please check input location , " + INPUT_LOCATION);
            return 1;
        }

        return 0;
    }

    public static String getINPUT_LOCATION() {
        return INPUT_LOCATION;
    }

    public static String getOUTPUT_LOCATION() {
        return OUTPUT_LOCATION;
    }

    public static Map<String, List<File>> getInFileMap() {
        return inFileMap;
    }

    public static Map<String, Integer> getNetwork_fn_file_size_map() {
        return network_fn_file_size_map;
    }

    public static String getPRECOOK_NOISE_FILE_LOCATION() {
        return PRECOOK_NOISE_FILE_LOCATION;
    }

}
