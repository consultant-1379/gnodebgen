/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OtherConfig_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "OtherConfig-r9";
   }

   public ReportProximityConfig_r9 reportProximityConfig_r9;  // optional
   public boolean mV2ExtPresent;
   public IDC_Config_r11 idc_Config_r11;  // optional
   public PowerPrefIndicationConfig_r11 powerPrefIndicationConfig_r11;  // optional
   public ObtainLocationConfig_r11 obtainLocationConfig_r11;  // optional
   public boolean mV3ExtPresent;
   public OtherConfig_r9_bw_PreferenceIndicationTimer_r14 bw_PreferenceIndicationTimer_r14 = null;  // optional
   public Asn1Boolean sps_AssistanceInfoReport_r14;  // optional
   public OtherConfig_r9_delayBudgetReportingConfig_r14 delayBudgetReportingConfig_r14;  // optional
   public OtherConfig_r9_rlm_ReportConfig_r14 rlm_ReportConfig_r14;  // optional
   public boolean mV4ExtPresent;
   public OtherConfig_r9_overheatingAssistanceConfig_r14 overheatingAssistanceConfig_r14;  // optional
   public boolean mV5ExtPresent;
   public OtherConfig_r9_measConfigAppLayer_r15 measConfigAppLayer_r15;  // optional
   public Asn1Boolean ailc_BitConfig_r15;  // optional
   public BT_NameListConfig_r15 bt_NameListConfig_r15;  // optional
   public WLAN_NameListConfig_r15 wlan_NameListConfig_r15;  // optional
   public Asn1OpenExt extElem1;

   public OtherConfig_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public OtherConfig_r9 (
      ReportProximityConfig_r9 reportProximityConfig_r9_,
      IDC_Config_r11 idc_Config_r11_,
      PowerPrefIndicationConfig_r11 powerPrefIndicationConfig_r11_,
      ObtainLocationConfig_r11 obtainLocationConfig_r11_,
      OtherConfig_r9_bw_PreferenceIndicationTimer_r14 bw_PreferenceIndicationTimer_r14_,
      Asn1Boolean sps_AssistanceInfoReport_r14_,
      OtherConfig_r9_delayBudgetReportingConfig_r14 delayBudgetReportingConfig_r14_,
      OtherConfig_r9_rlm_ReportConfig_r14 rlm_ReportConfig_r14_,
      OtherConfig_r9_overheatingAssistanceConfig_r14 overheatingAssistanceConfig_r14_,
      OtherConfig_r9_measConfigAppLayer_r15 measConfigAppLayer_r15_,
      Asn1Boolean ailc_BitConfig_r15_,
      BT_NameListConfig_r15 bt_NameListConfig_r15_,
      WLAN_NameListConfig_r15 wlan_NameListConfig_r15_
   ) {
      super();
      reportProximityConfig_r9 = reportProximityConfig_r9_;
      idc_Config_r11 = idc_Config_r11_;
      powerPrefIndicationConfig_r11 = powerPrefIndicationConfig_r11_;
      obtainLocationConfig_r11 = obtainLocationConfig_r11_;
      bw_PreferenceIndicationTimer_r14 = bw_PreferenceIndicationTimer_r14_;
      sps_AssistanceInfoReport_r14 = sps_AssistanceInfoReport_r14_;
      delayBudgetReportingConfig_r14 = delayBudgetReportingConfig_r14_;
      rlm_ReportConfig_r14 = rlm_ReportConfig_r14_;
      overheatingAssistanceConfig_r14 = overheatingAssistanceConfig_r14_;
      measConfigAppLayer_r15 = measConfigAppLayer_r15_;
      ailc_BitConfig_r15 = ailc_BitConfig_r15_;
      bt_NameListConfig_r15 = bt_NameListConfig_r15_;
      wlan_NameListConfig_r15 = wlan_NameListConfig_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public OtherConfig_r9 (ReportProximityConfig_r9 reportProximityConfig_r9_,
      IDC_Config_r11 idc_Config_r11_,
      PowerPrefIndicationConfig_r11 powerPrefIndicationConfig_r11_,
      ObtainLocationConfig_r11 obtainLocationConfig_r11_,
      OtherConfig_r9_bw_PreferenceIndicationTimer_r14 bw_PreferenceIndicationTimer_r14_,
      boolean sps_AssistanceInfoReport_r14_,
      OtherConfig_r9_delayBudgetReportingConfig_r14 delayBudgetReportingConfig_r14_,
      OtherConfig_r9_rlm_ReportConfig_r14 rlm_ReportConfig_r14_,
      OtherConfig_r9_overheatingAssistanceConfig_r14 overheatingAssistanceConfig_r14_,
      OtherConfig_r9_measConfigAppLayer_r15 measConfigAppLayer_r15_,
      boolean ailc_BitConfig_r15_,
      BT_NameListConfig_r15 bt_NameListConfig_r15_,
      WLAN_NameListConfig_r15 wlan_NameListConfig_r15_
   ) {
      super();
      reportProximityConfig_r9 = reportProximityConfig_r9_;
      idc_Config_r11 = idc_Config_r11_;
      powerPrefIndicationConfig_r11 = powerPrefIndicationConfig_r11_;
      obtainLocationConfig_r11 = obtainLocationConfig_r11_;
      bw_PreferenceIndicationTimer_r14 = bw_PreferenceIndicationTimer_r14_;
      sps_AssistanceInfoReport_r14 = new Asn1Boolean (sps_AssistanceInfoReport_r14_);
      delayBudgetReportingConfig_r14 = delayBudgetReportingConfig_r14_;
      rlm_ReportConfig_r14 = rlm_ReportConfig_r14_;
      overheatingAssistanceConfig_r14 = overheatingAssistanceConfig_r14_;
      measConfigAppLayer_r15 = measConfigAppLayer_r15_;
      ailc_BitConfig_r15 = new Asn1Boolean (ailc_BitConfig_r15_);
      bt_NameListConfig_r15 = bt_NameListConfig_r15_;
      wlan_NameListConfig_r15 = wlan_NameListConfig_r15_;
   }

   public void init () {
      reportProximityConfig_r9 = null;
      idc_Config_r11 = null;
      powerPrefIndicationConfig_r11 = null;
      obtainLocationConfig_r11 = null;
      bw_PreferenceIndicationTimer_r14 = null;
      sps_AssistanceInfoReport_r14 = null;
      delayBudgetReportingConfig_r14 = null;
      rlm_ReportConfig_r14 = null;
      overheatingAssistanceConfig_r14 = null;
      measConfigAppLayer_r15 = null;
      ailc_BitConfig_r15 = null;
      bt_NameListConfig_r15 = null;
      wlan_NameListConfig_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportProximityConfig_r9;
         case 1: return idc_Config_r11;
         case 2: return powerPrefIndicationConfig_r11;
         case 3: return obtainLocationConfig_r11;
         case 4: return bw_PreferenceIndicationTimer_r14;
         case 5: return sps_AssistanceInfoReport_r14;
         case 6: return delayBudgetReportingConfig_r14;
         case 7: return rlm_ReportConfig_r14;
         case 8: return overheatingAssistanceConfig_r14;
         case 9: return measConfigAppLayer_r15;
         case 10: return ailc_BitConfig_r15;
         case 11: return bt_NameListConfig_r15;
         case 12: return wlan_NameListConfig_r15;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportProximityConfig-r9";
         case 1: return "idc-Config-r11";
         case 2: return "powerPrefIndicationConfig-r11";
         case 3: return "obtainLocationConfig-r11";
         case 4: return "bw-PreferenceIndicationTimer-r14";
         case 5: return "sps-AssistanceInfoReport-r14";
         case 6: return "delayBudgetReportingConfig-r14";
         case 7: return "rlm-ReportConfig-r14";
         case 8: return "overheatingAssistanceConfig-r14";
         case 9: return "measConfigAppLayer-r15";
         case 10: return "ailc-BitConfig-r15";
         case 11: return "bt-NameListConfig-r15";
         case 12: return "wlan-NameListConfig-r15";
         case 13: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean reportProximityConfig_r9Present = buffer.decodeBit ("reportProximityConfig_r9Present");

      // decode reportProximityConfig_r9

      if (reportProximityConfig_r9Present) {
         buffer.getContext().eventDispatcher.startElement("reportProximityConfig_r9", -1);

         reportProximityConfig_r9 = new ReportProximityConfig_r9();
         reportProximityConfig_r9.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reportProximityConfig_r9", -1);
      }
      else {
         reportProximityConfig_r9 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean idc_Config_r11Present = buffer.decodeBit ("idc_Config_r11Present");

            boolean powerPrefIndicationConfig_r11Present = buffer.decodeBit ("powerPrefIndicationConfig_r11Present");

            boolean obtainLocationConfig_r11Present = buffer.decodeBit ("obtainLocationConfig_r11Present");

            // decode idc_Config_r11

            if (idc_Config_r11Present) {
               buffer.getContext().eventDispatcher.startElement("idc_Config_r11", -1);

               idc_Config_r11 = new IDC_Config_r11();
               idc_Config_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("idc_Config_r11", -1);
            }
            else {
               idc_Config_r11 = null;
            }

            // decode powerPrefIndicationConfig_r11

            if (powerPrefIndicationConfig_r11Present) {
               buffer.getContext().eventDispatcher.startElement("powerPrefIndicationConfig_r11", -1);

               powerPrefIndicationConfig_r11 = new PowerPrefIndicationConfig_r11();
               powerPrefIndicationConfig_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("powerPrefIndicationConfig_r11", -1);
            }
            else {
               powerPrefIndicationConfig_r11 = null;
            }

            // decode obtainLocationConfig_r11

            if (obtainLocationConfig_r11Present) {
               buffer.getContext().eventDispatcher.startElement("obtainLocationConfig_r11", -1);

               obtainLocationConfig_r11 = new ObtainLocationConfig_r11();
               obtainLocationConfig_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("obtainLocationConfig_r11", -1);
            }
            else {
               obtainLocationConfig_r11 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean bw_PreferenceIndicationTimer_r14Present = buffer.decodeBit ("bw_PreferenceIndicationTimer_r14Present");

            boolean sps_AssistanceInfoReport_r14Present = buffer.decodeBit ("sps_AssistanceInfoReport_r14Present");

            boolean delayBudgetReportingConfig_r14Present = buffer.decodeBit ("delayBudgetReportingConfig_r14Present");

            boolean rlm_ReportConfig_r14Present = buffer.decodeBit ("rlm_ReportConfig_r14Present");

            // decode bw_PreferenceIndicationTimer_r14

            if (bw_PreferenceIndicationTimer_r14Present) {
               buffer.getContext().eventDispatcher.startElement("bw_PreferenceIndicationTimer_r14", -1);

               int tval = OtherConfig_r9_bw_PreferenceIndicationTimer_r14.decodeEnumValue (buffer);
               bw_PreferenceIndicationTimer_r14 = OtherConfig_r9_bw_PreferenceIndicationTimer_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("bw_PreferenceIndicationTimer_r14", -1);
            }
            else {
               bw_PreferenceIndicationTimer_r14 = null;
            }

            // decode sps_AssistanceInfoReport_r14

            if (sps_AssistanceInfoReport_r14Present) {
               buffer.getContext().eventDispatcher.startElement("sps_AssistanceInfoReport_r14", -1);

               sps_AssistanceInfoReport_r14 = new Asn1Boolean();
               sps_AssistanceInfoReport_r14.decode (buffer);

               buffer.invokeCharacters(sps_AssistanceInfoReport_r14.toString());
               buffer.getContext().eventDispatcher.endElement("sps_AssistanceInfoReport_r14", -1);
            }
            else {
               sps_AssistanceInfoReport_r14 = null;
            }

            // decode delayBudgetReportingConfig_r14

            if (delayBudgetReportingConfig_r14Present) {
               buffer.getContext().eventDispatcher.startElement("delayBudgetReportingConfig_r14", -1);

               delayBudgetReportingConfig_r14 = new OtherConfig_r9_delayBudgetReportingConfig_r14();
               delayBudgetReportingConfig_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("delayBudgetReportingConfig_r14", -1);
            }
            else {
               delayBudgetReportingConfig_r14 = null;
            }

            // decode rlm_ReportConfig_r14

            if (rlm_ReportConfig_r14Present) {
               buffer.getContext().eventDispatcher.startElement("rlm_ReportConfig_r14", -1);

               rlm_ReportConfig_r14 = new OtherConfig_r9_rlm_ReportConfig_r14();
               rlm_ReportConfig_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlm_ReportConfig_r14", -1);
            }
            else {
               rlm_ReportConfig_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean overheatingAssistanceConfig_r14Present = buffer.decodeBit ("overheatingAssistanceConfig_r14Present");

            // decode overheatingAssistanceConfig_r14

            if (overheatingAssistanceConfig_r14Present) {
               buffer.getContext().eventDispatcher.startElement("overheatingAssistanceConfig_r14", -1);

               overheatingAssistanceConfig_r14 = new OtherConfig_r9_overheatingAssistanceConfig_r14();
               overheatingAssistanceConfig_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("overheatingAssistanceConfig_r14", -1);
            }
            else {
               overheatingAssistanceConfig_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measConfigAppLayer_r15Present = buffer.decodeBit ("measConfigAppLayer_r15Present");

            boolean ailc_BitConfig_r15Present = buffer.decodeBit ("ailc_BitConfig_r15Present");

            boolean bt_NameListConfig_r15Present = buffer.decodeBit ("bt_NameListConfig_r15Present");

            boolean wlan_NameListConfig_r15Present = buffer.decodeBit ("wlan_NameListConfig_r15Present");

            // decode measConfigAppLayer_r15

            if (measConfigAppLayer_r15Present) {
               buffer.getContext().eventDispatcher.startElement("measConfigAppLayer_r15", -1);

               measConfigAppLayer_r15 = new OtherConfig_r9_measConfigAppLayer_r15();
               measConfigAppLayer_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measConfigAppLayer_r15", -1);
            }
            else {
               measConfigAppLayer_r15 = null;
            }

            // decode ailc_BitConfig_r15

            if (ailc_BitConfig_r15Present) {
               buffer.getContext().eventDispatcher.startElement("ailc_BitConfig_r15", -1);

               ailc_BitConfig_r15 = new Asn1Boolean();
               ailc_BitConfig_r15.decode (buffer);

               buffer.invokeCharacters(ailc_BitConfig_r15.toString());
               buffer.getContext().eventDispatcher.endElement("ailc_BitConfig_r15", -1);
            }
            else {
               ailc_BitConfig_r15 = null;
            }

            // decode bt_NameListConfig_r15

            if (bt_NameListConfig_r15Present) {
               buffer.getContext().eventDispatcher.startElement("bt_NameListConfig_r15", -1);

               bt_NameListConfig_r15 = new BT_NameListConfig_r15();
               bt_NameListConfig_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("bt_NameListConfig_r15", -1);
            }
            else {
               bt_NameListConfig_r15 = null;
            }

            // decode wlan_NameListConfig_r15

            if (wlan_NameListConfig_r15Present) {
               buffer.getContext().eventDispatcher.startElement("wlan_NameListConfig_r15", -1);

               wlan_NameListConfig_r15 = new WLAN_NameListConfig_r15();
               wlan_NameListConfig_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("wlan_NameListConfig_r15", -1);
            }
            else {
               wlan_NameListConfig_r15 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportProximityConfig_r9 != null) reportProximityConfig_r9.print (_sb, "reportProximityConfig_r9", _level+1);
      if (idc_Config_r11 != null) idc_Config_r11.print (_sb, "idc_Config_r11", _level+1);
      if (powerPrefIndicationConfig_r11 != null) powerPrefIndicationConfig_r11.print (_sb, "powerPrefIndicationConfig_r11", _level+1);
      if (obtainLocationConfig_r11 != null) obtainLocationConfig_r11.print (_sb, "obtainLocationConfig_r11", _level+1);
      if (bw_PreferenceIndicationTimer_r14 != null) bw_PreferenceIndicationTimer_r14.print (_sb, "bw_PreferenceIndicationTimer_r14", _level+1);
      if (sps_AssistanceInfoReport_r14 != null) sps_AssistanceInfoReport_r14.print (_sb, "sps_AssistanceInfoReport_r14", _level+1);
      if (delayBudgetReportingConfig_r14 != null) delayBudgetReportingConfig_r14.print (_sb, "delayBudgetReportingConfig_r14", _level+1);
      if (rlm_ReportConfig_r14 != null) rlm_ReportConfig_r14.print (_sb, "rlm_ReportConfig_r14", _level+1);
      if (overheatingAssistanceConfig_r14 != null) overheatingAssistanceConfig_r14.print (_sb, "overheatingAssistanceConfig_r14", _level+1);
      if (measConfigAppLayer_r15 != null) measConfigAppLayer_r15.print (_sb, "measConfigAppLayer_r15", _level+1);
      if (ailc_BitConfig_r15 != null) ailc_BitConfig_r15.print (_sb, "ailc_BitConfig_r15", _level+1);
      if (bt_NameListConfig_r15 != null) bt_NameListConfig_r15.print (_sb, "bt_NameListConfig_r15", _level+1);
      if (wlan_NameListConfig_r15 != null) wlan_NameListConfig_r15.print (_sb, "wlan_NameListConfig_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
