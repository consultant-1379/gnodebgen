/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FeatureSetDownlink-v1610";
   }

   public FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16;  // optional
   public FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16;  // optional
   public FeatureSetDownlink_v1610_intraFreqDAPS_r16 intraFreqDAPS_r16;  // optional
   public FreqSeparationClassDL_v1620 intraBandFreqSeparationDL_v1620 = null;  // optional
   public FreqSeparationClassDL_Only_r16 intraBandFreqSeparationDL_Only_r16 = null;  // optional
   public FeatureSetDownlink_v1610_pdcch_Monitoring_r16 pdcch_Monitoring_r16;  // optional
   public FeatureSetDownlink_v1610_pdcch_MonitoringMixed_r16 pdcch_MonitoringMixed_r16 = null;  // optional
   public FeatureSetDownlink_v1610_crossCarrierSchedulingProcessing_DiffSCS_r16 crossCarrierSchedulingProcessing_DiffSCS_r16;  // optional
   public FeatureSetDownlink_v1610_singleDCI_SDM_scheme_r16 singleDCI_SDM_scheme_r16 = null;  // optional

   public FeatureSetDownlink_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetDownlink_v1610 (
      FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16_,
      FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_,
      FeatureSetDownlink_v1610_intraFreqDAPS_r16 intraFreqDAPS_r16_,
      FreqSeparationClassDL_v1620 intraBandFreqSeparationDL_v1620_,
      FreqSeparationClassDL_Only_r16 intraBandFreqSeparationDL_Only_r16_,
      FeatureSetDownlink_v1610_pdcch_Monitoring_r16 pdcch_Monitoring_r16_,
      FeatureSetDownlink_v1610_pdcch_MonitoringMixed_r16 pdcch_MonitoringMixed_r16_,
      FeatureSetDownlink_v1610_crossCarrierSchedulingProcessing_DiffSCS_r16 crossCarrierSchedulingProcessing_DiffSCS_r16_,
      FeatureSetDownlink_v1610_singleDCI_SDM_scheme_r16 singleDCI_SDM_scheme_r16_
   ) {
      super();
      cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 = cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16_;
      cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 = cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_;
      intraFreqDAPS_r16 = intraFreqDAPS_r16_;
      intraBandFreqSeparationDL_v1620 = intraBandFreqSeparationDL_v1620_;
      intraBandFreqSeparationDL_Only_r16 = intraBandFreqSeparationDL_Only_r16_;
      pdcch_Monitoring_r16 = pdcch_Monitoring_r16_;
      pdcch_MonitoringMixed_r16 = pdcch_MonitoringMixed_r16_;
      crossCarrierSchedulingProcessing_DiffSCS_r16 = crossCarrierSchedulingProcessing_DiffSCS_r16_;
      singleDCI_SDM_scheme_r16 = singleDCI_SDM_scheme_r16_;
   }

   public void init () {
      cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 = null;
      cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 = null;
      intraFreqDAPS_r16 = null;
      intraBandFreqSeparationDL_v1620 = null;
      intraBandFreqSeparationDL_Only_r16 = null;
      pdcch_Monitoring_r16 = null;
      pdcch_MonitoringMixed_r16 = null;
      crossCarrierSchedulingProcessing_DiffSCS_r16 = null;
      singleDCI_SDM_scheme_r16 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16;
         case 1: return cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16;
         case 2: return intraFreqDAPS_r16;
         case 3: return intraBandFreqSeparationDL_v1620;
         case 4: return intraBandFreqSeparationDL_Only_r16;
         case 5: return pdcch_Monitoring_r16;
         case 6: return pdcch_MonitoringMixed_r16;
         case 7: return crossCarrierSchedulingProcessing_DiffSCS_r16;
         case 8: return singleDCI_SDM_scheme_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cbgPDSCH-ProcessingType1-NumberOfTB-PerSlot-r16";
         case 1: return "cbgPDSCH-ProcessingType2-NumberOfTB-PerSlot-r16";
         case 2: return "intraFreqDAPS-r16";
         case 3: return "intraBandFreqSeparationDL-v1620";
         case 4: return "intraBandFreqSeparationDL-Only-r16";
         case 5: return "pdcch-Monitoring-r16";
         case 6: return "pdcch-MonitoringMixed-r16";
         case 7: return "crossCarrierSchedulingProcessing-DiffSCS-r16";
         case 8: return "singleDCI-SDM-scheme-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16Present = buffer.decodeBit ("cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16Present");
      boolean cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16Present = buffer.decodeBit ("cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16Present");
      boolean intraFreqDAPS_r16Present = buffer.decodeBit ("intraFreqDAPS_r16Present");
      boolean intraBandFreqSeparationDL_v1620Present = buffer.decodeBit ("intraBandFreqSeparationDL_v1620Present");
      boolean intraBandFreqSeparationDL_Only_r16Present = buffer.decodeBit ("intraBandFreqSeparationDL_Only_r16Present");
      boolean pdcch_Monitoring_r16Present = buffer.decodeBit ("pdcch_Monitoring_r16Present");
      boolean pdcch_MonitoringMixed_r16Present = buffer.decodeBit ("pdcch_MonitoringMixed_r16Present");
      boolean crossCarrierSchedulingProcessing_DiffSCS_r16Present = buffer.decodeBit ("crossCarrierSchedulingProcessing_DiffSCS_r16Present");
      boolean singleDCI_SDM_scheme_r16Present = buffer.decodeBit ("singleDCI_SDM_scheme_r16Present");

      // decode cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16

      if (cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16Present) {
         buffer.getContext().eventDispatcher.startElement("cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16", -1);

         cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16();
         cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16", -1);
      }
      else {
         cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 = null;
      }

      // decode cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16

      if (cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16Present) {
         buffer.getContext().eventDispatcher.startElement("cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16", -1);

         cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16();
         cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16", -1);
      }
      else {
         cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 = null;
      }

      // decode intraFreqDAPS_r16

      if (intraFreqDAPS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("intraFreqDAPS_r16", -1);

         intraFreqDAPS_r16 = new FeatureSetDownlink_v1610_intraFreqDAPS_r16();
         intraFreqDAPS_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("intraFreqDAPS_r16", -1);
      }
      else {
         intraFreqDAPS_r16 = null;
      }

      // decode intraBandFreqSeparationDL_v1620

      if (intraBandFreqSeparationDL_v1620Present) {
         buffer.getContext().eventDispatcher.startElement("intraBandFreqSeparationDL_v1620", -1);

         int tval = FreqSeparationClassDL_v1620.decodeEnumValue (buffer);
         intraBandFreqSeparationDL_v1620 = FreqSeparationClassDL_v1620.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("intraBandFreqSeparationDL_v1620", -1);
      }
      else {
         intraBandFreqSeparationDL_v1620 = null;
      }

      // decode intraBandFreqSeparationDL_Only_r16

      if (intraBandFreqSeparationDL_Only_r16Present) {
         buffer.getContext().eventDispatcher.startElement("intraBandFreqSeparationDL_Only_r16", -1);

         int tval = FreqSeparationClassDL_Only_r16.decodeEnumValue (buffer);
         intraBandFreqSeparationDL_Only_r16 = FreqSeparationClassDL_Only_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("intraBandFreqSeparationDL_Only_r16", -1);
      }
      else {
         intraBandFreqSeparationDL_Only_r16 = null;
      }

      // decode pdcch_Monitoring_r16

      if (pdcch_Monitoring_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_Monitoring_r16", -1);

         pdcch_Monitoring_r16 = new FeatureSetDownlink_v1610_pdcch_Monitoring_r16();
         pdcch_Monitoring_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_Monitoring_r16", -1);
      }
      else {
         pdcch_Monitoring_r16 = null;
      }

      // decode pdcch_MonitoringMixed_r16

      if (pdcch_MonitoringMixed_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringMixed_r16", -1);

         int tval = FeatureSetDownlink_v1610_pdcch_MonitoringMixed_r16.decodeEnumValue (buffer);
         pdcch_MonitoringMixed_r16 = FeatureSetDownlink_v1610_pdcch_MonitoringMixed_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringMixed_r16", -1);
      }
      else {
         pdcch_MonitoringMixed_r16 = null;
      }

      // decode crossCarrierSchedulingProcessing_DiffSCS_r16

      if (crossCarrierSchedulingProcessing_DiffSCS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierSchedulingProcessing_DiffSCS_r16", -1);

         crossCarrierSchedulingProcessing_DiffSCS_r16 = new FeatureSetDownlink_v1610_crossCarrierSchedulingProcessing_DiffSCS_r16();
         crossCarrierSchedulingProcessing_DiffSCS_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("crossCarrierSchedulingProcessing_DiffSCS_r16", -1);
      }
      else {
         crossCarrierSchedulingProcessing_DiffSCS_r16 = null;
      }

      // decode singleDCI_SDM_scheme_r16

      if (singleDCI_SDM_scheme_r16Present) {
         buffer.getContext().eventDispatcher.startElement("singleDCI_SDM_scheme_r16", -1);

         int tval = FeatureSetDownlink_v1610_singleDCI_SDM_scheme_r16.decodeEnumValue (buffer);
         singleDCI_SDM_scheme_r16 = FeatureSetDownlink_v1610_singleDCI_SDM_scheme_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("singleDCI_SDM_scheme_r16", -1);
      }
      else {
         singleDCI_SDM_scheme_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16 != null) cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16.print (_sb, "cbgPDSCH_ProcessingType1_NumberOfTB_PerSlot_r16", _level+1);
      if (cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16 != null) cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16.print (_sb, "cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16", _level+1);
      if (intraFreqDAPS_r16 != null) intraFreqDAPS_r16.print (_sb, "intraFreqDAPS_r16", _level+1);
      if (intraBandFreqSeparationDL_v1620 != null) intraBandFreqSeparationDL_v1620.print (_sb, "intraBandFreqSeparationDL_v1620", _level+1);
      if (intraBandFreqSeparationDL_Only_r16 != null) intraBandFreqSeparationDL_Only_r16.print (_sb, "intraBandFreqSeparationDL_Only_r16", _level+1);
      if (pdcch_Monitoring_r16 != null) pdcch_Monitoring_r16.print (_sb, "pdcch_Monitoring_r16", _level+1);
      if (pdcch_MonitoringMixed_r16 != null) pdcch_MonitoringMixed_r16.print (_sb, "pdcch_MonitoringMixed_r16", _level+1);
      if (crossCarrierSchedulingProcessing_DiffSCS_r16 != null) crossCarrierSchedulingProcessing_DiffSCS_r16.print (_sb, "crossCarrierSchedulingProcessing_DiffSCS_r16", _level+1);
      if (singleDCI_SDM_scheme_r16 != null) singleDCI_SDM_scheme_r16.print (_sb, "singleDCI_SDM_scheme_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
