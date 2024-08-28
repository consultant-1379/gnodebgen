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

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * This interface is holding constant parameter name.
 *
 * @author xjaimah
 *
 */
public interface ConstantParameter {


        /**
         * The TIME_STAMP
         */
        public static String TIME_STAMP = "time_stamp";

        /**
         * INPUT_NODE_INFO_JSON
         */
        public static String INPUT_NODE_INFO_JSON = "input_node_info.json";

        /**
         * The NCI
         */
        public static String NCI = "nci";
        public static String SERVINGID= "target_cell_plmn_identity";

        public static String TARGETCELL = "target_cell_identity";

        /**
         * The GNODEBID
         */
        public static String GNODEBID = "gnb_id";

        /**
         * The GNODEBID_Length
         */
        public static String GNODEBID_Length = "gnb_id_length";

        public static String LOCAL_END_POINT = "local_end_point";
        public static String REMOTE_END_POINT = "remote_end_point";
        
        public static String LINK_TYPE  = "link_type";
        
        public static String GNB_CUUP_FN_ID = "gnb_cuup_function_id";

        /**
         * Constants defined for different OS
         */
        public static String WINDOWS = "windows";

        /**
         * The LINUX
         */
        public static String LINUX = "linux";

        /**
         * The UNKNOWN
         */
        public static String UNKNOWN = "unknown";

        /**
         * The GZ_EXT
         */
        public static String GZ_EXT = ".gz";

        /**
         * GPB_EXT
         */
        public static String GPB_EXT = ".gpb";

        public static String CUUP = "CUUP";
        public static String DU = "DU";
        public static String CUCP = "CUCP";
        public static String COMMON = "COMMON";

        /**
         * This will hold mapping of network function name.
         */
        @SuppressWarnings("serial")
        public static final Map<String, String> NETWORKFUNCTIONMAP = new HashMap<String, String>() {
                {
                        put("DU", "GNBDUFunction");
                        put("CUCP", "GNBCUCPFunction");
                        put("CUUP", "GNBCUUPFunction");
                }
        };

        /**
         * This will hold mapping of network function name.
         */
        @SuppressWarnings("serial")
        public static final Map<Integer, String> NETWORK_FUNCTION_GROUP_ID_MAP = new HashMap<Integer, String>() {
                {
                        put(1, "COMMON");
                        put(2, "DU");
                        put(3, "CUCP");
                        put(4, "CUUP");
                }
        };

        /**
         * The ZERO
         */
        public static int ZERO = 0;

        /**
         * JSON_EXT
         */
        public static String JSON_EXT = ".json";

        /**
         * The FILE_EXTENSION
         */
        public static final List<String> FILE_EXTENSION = Collections.unmodifiableList(Arrays.asList("gz", "gpb"));

        /**
         * The MNC
         */
        public static final String MNC = "410";

        /**
         * The MCC
         */
        public static final String MCC = "310";

        /**
         * The PLMN_ID
         */
        public static final String PLMN_ID = "main_plmn_id";
    

        public static String HOTYPE = "ho_target_node_type";

        /**
         * decodeEventParametersSet
         */
        public Set<String> decodeEventParametersSet = new HashSet<>(
                        Arrays.asList(ConstantParameter.GNODEBID, ConstantParameter.GNODEBID_Length, ConstantParameter.NCI));

        /**
         * The UE_TRACE_ID
         */
        public static final String UE_TRACE_ID = "ue_trace_id";

        /**
         * The PDU_SESSION
         */
        public static final String PDU_SESSION = "pdu_session_setup_list";

        /**
         * This parameter is used to wait for 2sec before close that call.
         */
        public static final int BUFFER_SESSION_SEC = 2;

        /**
         * This is the file name which contain session information.
         */
        public static String SESSION_FILE = "session_record";

        /**
         * This is the file name which contain session information.
         */
        public static String SESSION_FILE_FORMAT = ".csv";

        /**
         * Max number of rows in session file.
         */
        public static int MAX_ROWS = 1000000;

    /**
     * The ENRICHMENT_FILE_PATH
     */
    public static String ENRICHMENT_FILE_PATH = "config" + File.separator + "EVENT_PARAM_ENRICHMENT" + File.separator
            + "event_param_enrichment.cfg";
    
    public static final String S1ULink = "LINK_TYPE_S1U" ;
    public static final String EP_NgU = "LINK_TYPE_NGU" ;
    public static final List<Long> RP_USER_PLANE_LINK_EVENT_ID = new ArrayList<Long>() {
    	{
            add(4008L);
            add(4012L);
    	}
    };
    public static final List<Long> PP_CONTROL_LINK = new ArrayList<Long>() {
    	{
            add(4009L);
            add(4010L);
            add(4016L);
            
    	}
    };

}
