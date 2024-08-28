package com.ericsson.tcs.enrichment;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

import com.ericsson.tcs.constant.Utils;


/**
 * @author xjaimah
 *
 */
public class EnrichConfigParser {
    
    /**
     * 
     */
    private NetworkFunction nfDU = NetworkFunction.DU; 
    /**
     * 
     */
    private NetworkFunction nfCUUP = NetworkFunction.CUUP; 
    /**
     * 
     */
    private NetworkFunction nfCUCP = NetworkFunction.CUCP; 
    
    /**
     * @param filePath
     */
    public EnrichmentWrapper init(String filePath){
        List<String> fileText = Utils.readFile(filePath);
        int lineNum = 0;
        String[] keyVal;
        EventWrapper event = null;
        EnrichmentWrapper wrapper = new EnrichmentWrapper();
        while (lineNum < fileText.size()) {
            String line1 = fileText.get(lineNum);
            lineNum++;
            keyVal = line1.split("=");
            String cmd = keyVal[0].trim().toLowerCase();
            if ("set".equals(cmd) ) {
                handleSetCmd(event, keyVal[1], wrapper);
            }else if ("id".equals(cmd)) {
                event = handleId(keyVal[1],event);
            }else if ("version".equals(cmd) ) {
                handleVersionCmd(wrapper, keyVal[1]);
            } else if ("include".equals(cmd)) {
                List<String> importText = Utils.handleIncludeCmd(keyVal[1].trim(), filePath);
                for (int i = importText.size(); i > 0; i--) {
                    String s = importText.get(i - 1);
                    fileText.add(lineNum, s);
                }
            }
        }
        return wrapper;
    }

    /**
     * @param keyVal
     * @param event
     * @return
     */
    private EventWrapper handleId(String keyVal, EventWrapper event) {
        Integer eventId = Utils.safeParseInt(keyVal.trim());
        if (eventId == 0) {
            eventId = Utils.isValidId(keyVal.trim());
        }
        if ( !Utils.isValidId(eventId) ) {
            System.out.println("   Not a valid event ID!" + keyVal);
            return event;
        }else{
            event = new EventWrapper();
            event.setEventName(eventId);
        }
        return event;
    }

    /**
     * @param evt
     * @param string
     */
    private void handleSetCmd(EventWrapper evt, String keyVal, EnrichmentWrapper wrapper) {
        int idx = keyVal.indexOf(',');
        String parameterName = keyVal.substring(0,idx).trim();
        String val = keyVal.substring(idx+1).trim();
        Object value = null;
        if (parameterName.endsWith("]")) { // deal with arrays
            parameterName = parameterName.replaceAll("\\[", "_a");
            parameterName = parameterName.replace("]", "");
        }
       
        if (val.startsWith("\"")) { // deal with strings
            value = val.substring(1, val.length() - 1);
        } else if (val.startsWith("b\"") || val.startsWith("B\"")) { // deal with byte array
            val = val.substring(2, val.length() - 1);
            val = val.replaceAll(" ", "");  // change "ab cd ef" to "abcdef"
            if (0 != (val.length() % 2)) {
                System.out.println("Warning! length of binary string is not an even number!" + val);
            }
            value = Utils.hexStringToByteArray(val);
        } else if (val.startsWith("r(") || val.startsWith("R(")){
            // A random range specifier should go here
            // format is r(min,max, len)
            try {
                idx = val.indexOf(',');
                int idx2 = val.indexOf(',', idx +1);
                int min = Utils.safeParseInt(val.substring(2,idx));
                int max = Utils.safeParseInt(val.substring(idx+1,idx2));
                int len = Utils.safeParseInt(val.substring(idx2+1,val.length()-1));
                if (max > min) {
                    value = new Range(min, max, len);
                } else {
                    System.out.println("Invalid min or max specified! {} in set={} for id {}"+ val);
                }
            } catch (Exception e) {
                System.out.println("Invalid range specified! {}, correct format is r(min,max,len) in set={} for id {}" + val);
            }
        } else if(val.startsWith("[")){
            /*
             * repeated supported for  int, enum, string and messages
             * int val,[1,2,3,4]
             * enum val,[7,8,9]
             * string val,["abc","def","ghi"]
             * message val,JSON[{"param1":"74","param2":"0x01010},{"param1":"37","param2":"0x01020}]
             *
             */

            val = val.replace("[", "");
            val = val.replace("]", "");

            if(val.startsWith("\"")) {
                List<String> listVal = new ArrayList<>();
                val = val.replace("\"", "");
                for(String part : val.split(",")) {
                    listVal.add(part.trim());
                }
                value = listVal;
            }else {
                List<Long> listVal = new ArrayList<>();
                for(String part : val.split(",")) {
                    listVal.add(Utils.safeParseLong(part));
                }
                value = listVal;
            }

        } else if(val.startsWith("JSON")) {
            /*
             * This code block is used for parsing message and repeated message parameters
             * example :
             * message val,JSON{"param1":"74","param2":"0x01010}
             * repeated message val,JSON[{"param1":"74","param2":"0x01010},{"param1":"37","param2":"0x01020}]
             */

            val = val.substring(4);

            try {
                if(val.startsWith("{")) {
                    JSONObject json = new JSONObject(val);
                    value = json;
                }else if(val.startsWith("[")){
                    JSONArray jsonArray = new JSONArray(val);
                    value=jsonArray;
                }
            }catch(Exception e) {
                System.out.println("JSON enrichment given "+val+" is not a valid JSON or JSON Array object. Please use valid object.");
                value = null;
            }
        } else if (val.equals("true") || val.equals("false")) {
            if(val.equals("true")) {
                value = true;
            }else {
                value = false;
            }
        } else { // is it just a number
            value = Utils.safeParseLong(val);
        }

        // assign value to current event
        if (evt != null) {
            if(value!=null) {
               evt.getEventSpecificProperties().put(parameterName, value);
               wrapper.getEventSpecificEnrichMent().put(evt.getEventName(), evt);
            }
        } else { // if no current event, value gets assigned to all events
            wrapper.getDefaultMap().put(parameterName, value);
        }
    }
    
    /*
     * Version format is set=key,value where key is network function
     * and value is the array of values required to set the version properties (in order!)
     * pm_event_common_version, pm_event_group_version, pm_event_correction_version, 
     * etcm_version, etcm_correction_version
     *  eg version=DU,13,21,0,14,0
     *
     */
    private void handleVersionCmd(EnrichmentWrapper evt, String keyVal) {
        int idx = keyVal.indexOf(',');        
        String networkFunctionStr = keyVal.substring(0,idx).trim();
        String [] vals = keyVal.substring(idx+1).split(",");

        if (vals.length != 5) {
            System.out.println("version command {} expected 5 values"+ networkFunctionStr);
            return;
        }
        int [] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = Utils.safeParseInt(vals[i].trim());
        }

        switch (networkFunctionStr) {
        case "DU":
            nfDU.setVersion(values);
            evt.getNf().put("DU", nfDU);
            break;
        case "CUCP":
            nfCUCP.setVersion(values);
            evt.getNf().put("CUCP", nfCUCP);
            break;
        case "CUUP":
            nfCUUP.setVersion(values);
            evt.getNf().put("CUUP", nfCUUP);
            break;
        default:
            System.out.println("Network Function {} for version command not recognised"+ networkFunctionStr);
            break;
        }
    }

}
