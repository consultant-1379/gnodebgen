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
package com.ericsson.s345g.pattern;

import java.io.File;
import java.util.*;
import java.util.Map.Entry;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.events.*;
import com.ericsson.s345g.utils.Range;
import com.ericsson.s345g.utils.Utils;

/**
 * A pattern describes the events that go to make up a call.
 */
public class PatternParser {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    static Random random;
    private MsgMaker msgMaker = new MsgMaker();
    private NetworkFunction lastnf;  // the last network function that was set. 
    private Map <Param, Object> defaultProps;
    private NetworkFunction nfDU = NetworkFunction.DU; 
    private NetworkFunction nfCUUP = NetworkFunction.CUUP; 
    private NetworkFunction nfCUCP = NetworkFunction.CUCP; 

    public PatternParser() {
        random = new Random();
    }

    /**
     * Parse the specified file to produce a pattern that can be used to generate calls.
     */
    public Pattern parseCallPatternFile(String inFile, boolean verbose) {
        Pattern pattern = new Pattern();
        List<Event> eventsUsed = new ArrayList<>();
        defaultProps = new HashMap<>();
        String textStr;
        lastnf = NetworkFunction.UNSET;

        if (inFile == null) {
            return null;
        }
        int lineNum = 0;
        String[] keyVal;
        Event evt = null;

        List<String> text = Utils.readFile(inFile);
        if (verbose) {
            textStr = String.format("Parsing %d lines from %s", text.size(), inFile);
            System.out.println(textStr);
            LOGGER.debug(textStr);
        }

        while (lineNum < text.size()) {
            String line1 = text.get(lineNum);
            lineNum++;
            keyVal = line1.split("=");
            if (verbose) {
                textStr = String.format(" %05d: %s", lineNum, line1);
                System.out.println(textStr);
                LOGGER.debug(textStr);
            }
            String cmd = keyVal[0].trim().toLowerCase();

            if ("set".equals(cmd) ) {
                handleSetCmd(evt, keyVal[1]);
            } else if ("version".equals(cmd) ) {
                handleVersionCmd(evt, keyVal[1]);
            } else if ("id".equals(cmd)) {
                evt = handleId(keyVal[1], verbose, inFile);
                if (null != evt) {
                    // set commands issued before the first id command
                    // apply to all ids in the pattern file
                    if (!defaultProps.isEmpty()) {
                        for (Entry <Param, Object> prop : defaultProps.entrySet()) {
                            evt.setProps(prop.getKey(), prop.getValue());
                        }
                    }
                    eventsUsed.add(evt);
                }
            } else if ("include".equals(cmd)) {
                List<String> importText = handleIncludeCmd(keyVal[1].trim(), inFile, verbose);
                for (int i = importText.size(); i > 0; i--) {
                    String s = importText.get(i - 1);
                    text.add(lineNum, s); // insert the imported text
                }
            } else if ("debug".equals(cmd)) {
                LOGGER.debug("Debug : {}", keyVal[1]);
            } else if ("period".equals(cmd) && evt != null) {
                evt.setPeriod(Utils.safeParseInt(keyVal[1].trim()));
            } else if ("offset".equals(cmd) && evt != null) {
                evt.setOffset(Utils.safeParseInt(keyVal[1].trim()));
            } else {
                LOGGER.warn("Unexpected command '{}' found. Ignoring it!", cmd);
            }
        }
        pattern.setEventsUsed(eventsUsed);
        return pattern;
    }

    /*
    * handle an ID command
    */
    private Event handleId(String keyVal, boolean verbose, String inFile) {
        Integer eventId = Utils.safeParseInt(keyVal.trim());
        if (eventId == 0) {
            eventId = msgMaker.isValidId(keyVal.trim());
        }
        if ( !msgMaker.isValidId(eventId) ) {
            LOGGER.warn("Unrecognised event >{}< found in {}", keyVal, inFile);
            if (verbose) {
                System.out.println("   Not a valid event ID!" + keyVal);
            }
            return null;
        }
        
        Event evt = new Event();
        evt.setEventId(eventId);
        NetworkFunction nf = msgMaker.getNetworkFunction(eventId);
        if (NetworkFunction.UNSET == nf ) {  // set the nf for common events to the last nf that was used
            nf = lastnf; 
        }
        switch(nf) {
        case DU:
            evt.setNf(nfDU);
            break;
        case CUCP:
            evt.setNf(nfCUCP);
            break;
        case CUUP:
            evt.setNf(nfCUUP);
            break;
        default:
            evt.setNf(nf);
        }
        
        evt.setOffset(0);
        evt.setPeriod(0);
        if (verbose) {
            String idStr = msgMaker.getEventName(eventId);
            System.out.println("   Id: " + eventId + ", name: " + idStr);
        }
        return evt;
    }

    /*
     * Set format is set=key,value where key is a parameter that can appear in a
     * message. if key ends with ']' this indicates an array offset, ie
     * set=ERAB_QCI[7],35
     *
     * value can be a number, a "string" or a b"byte array", or
     * a r(min,max, len) random
     */
    private void handleSetCmd(Event evt, String keyVal) {
        int idx = keyVal.indexOf(',');
        String parameterName = keyVal.substring(0,idx).trim();
        String val = keyVal.substring(idx+1).trim();
        Object value = null;
        if (parameterName.endsWith("]")) { // deal with arrays
            parameterName = parameterName.replaceAll("\\[", "_a");
            parameterName = parameterName.replace("]", "");
        }
        Param key = Param.getParamByName(parameterName);
        if (null == key) {
            LOGGER.warn("Param >{}< is not a recognised settable parameter for event ", parameterName, evt);
            return; // move on to the next line
        }
        if (val.startsWith("\"")) { // deal with strings
            value = val.substring(1, val.length() - 1);
        } else if (val.startsWith("b\"") || val.startsWith("B\"")) { // deal with byte array
            val = val.substring(2, val.length() - 1);
            val = val.replaceAll(" ", "");  // change "ab cd ef" to "abcdef"
            if (0 != (val.length() % 2)) {
                LOGGER.warn("Warning! length of binary string is not an even number!" + val);
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
                    LOGGER.warn("Invalid min or max specified! {} in set={} for id {}", val, parameterName, evt.getEventId());
                }
            } catch (Exception e) {
                LOGGER.warn("Invalid range specified! {}, correct format is r(min,max,len) in set={} for id {}", val, parameterName, evt.getEventId());
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
                LOGGER.error("JSON enrichment given "+val+" is not a valid JSON or JSON Array object. Please use valid object.");
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
                evt.setProps(key, value);
            }
        } else { // if no current event, value gets assigned to all events
            defaultProps.put(key, value);
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
    private void handleVersionCmd(Event evt, String keyVal) {
        int idx = keyVal.indexOf(',');        
        String networkFunctionStr = keyVal.substring(0,idx).trim();
        String [] vals = keyVal.substring(idx+1).split(",");

        if (vals.length != 5) {
            LOGGER.error("version command {} expected 5 values", networkFunctionStr);
            return;
        }
        int [] values = new int[5];
        for (int i = 0; i < 5; i++) {
            values[i] = Utils.safeParseInt(vals[i].trim());
        }

        switch (networkFunctionStr) {
        case "DU":
            nfDU.setVersion(values);
            break;
        case "CUCP":
            nfCUCP.setVersion(values);
            break;
        case "CUUP":
            nfCUUP.setVersion(values);
            break;
        default:
            LOGGER.error("Network Function {} for version command not recognised", networkFunctionStr);
            break;
        }
    }

    /*
    * add text from another file to this point in the pattern
    * command is :
    * include=filename[,repeatCount]
    */
    private List<String> handleIncludeCmd(String keyVal, String inFile, boolean verbose ) {
        List<String> text = new ArrayList<>();
        String fname = keyVal;
        int idx = fname.indexOf(',');
        int numRepeat = 1;
        if (idx > 0) { // Is there a repeat count?
            fname = keyVal.substring(0,idx).trim();
            String val = keyVal.substring(idx+1).trim();
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
                LOGGER.warn("Invalid repeat count >{}< specified for include for {} !", val, fname);
                if (verbose) {
                    System.out.println("Invalid repeat count >"+val2+"< specified for include for file "+fname);
                }
                numRepeat = 1;
            }
            if (verbose) {
                System.out.println("Repeat count set to "+numRepeat+" for include file "+fname);
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
            for (int repeatCnt = 0; repeatCnt < numRepeat; repeatCnt ++) {
                importText.addAll(Utils.readFile(path + fname));
            }
        } catch (Exception e) {
            LOGGER.error("Error! Include file failed {} ", keyVal);
        }
        return text;
    }
}
