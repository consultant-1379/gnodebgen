/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FeatureSetDownlink";
   }

   public FeatureSetDownlink_featureSetListPerDownlinkCC featureSetListPerDownlinkCC;
   public FreqSeparationClass intraBandFreqSeparationDL = null;  // optional
   public FeatureSetDownlink_scalingFactor scalingFactor = null;  // optional
   public FeatureSetDownlink_dummy8 dummy8 = null;  // optional
   public FeatureSetDownlink_scellWithoutSSB scellWithoutSSB = null;  // optional
   public FeatureSetDownlink_csi_RS_MeasSCellWithoutSSB csi_RS_MeasSCellWithoutSSB = null;  // optional
   public FeatureSetDownlink_dummy1 dummy1 = null;  // optional
   public FeatureSetDownlink_type1_3_CSS type1_3_CSS = null;  // optional
   public FeatureSetDownlink_pdcch_MonitoringAnyOccasions pdcch_MonitoringAnyOccasions = null;  // optional
   public FeatureSetDownlink_dummy2 dummy2 = null;  // optional
   public FeatureSetDownlink_ue_SpecificUL_DL_Assignment ue_SpecificUL_DL_Assignment = null;  // optional
   public FeatureSetDownlink_searchSpaceSharingCA_DL searchSpaceSharingCA_DL = null;  // optional
   public FeatureSetDownlink_timeDurationForQCL timeDurationForQCL;  // optional
   public FeatureSetDownlink_pdsch_ProcessingType1_DifferentTB_PerSlot pdsch_ProcessingType1_DifferentTB_PerSlot;  // optional
   public DummyA dummy3;  // optional
   public FeatureSetDownlink_dummy4 dummy4;  // optional
   public FeatureSetDownlink_dummy5 dummy5;  // optional
   public FeatureSetDownlink_dummy6 dummy6;  // optional
   public FeatureSetDownlink_dummy7 dummy7;  // optional

   public FeatureSetDownlink () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetDownlink (
      FeatureSetDownlink_featureSetListPerDownlinkCC featureSetListPerDownlinkCC_,
      FreqSeparationClass intraBandFreqSeparationDL_,
      FeatureSetDownlink_scalingFactor scalingFactor_,
      FeatureSetDownlink_dummy8 dummy8_,
      FeatureSetDownlink_scellWithoutSSB scellWithoutSSB_,
      FeatureSetDownlink_csi_RS_MeasSCellWithoutSSB csi_RS_MeasSCellWithoutSSB_,
      FeatureSetDownlink_dummy1 dummy1_,
      FeatureSetDownlink_type1_3_CSS type1_3_CSS_,
      FeatureSetDownlink_pdcch_MonitoringAnyOccasions pdcch_MonitoringAnyOccasions_,
      FeatureSetDownlink_dummy2 dummy2_,
      FeatureSetDownlink_ue_SpecificUL_DL_Assignment ue_SpecificUL_DL_Assignment_,
      FeatureSetDownlink_searchSpaceSharingCA_DL searchSpaceSharingCA_DL_,
      FeatureSetDownlink_timeDurationForQCL timeDurationForQCL_,
      FeatureSetDownlink_pdsch_ProcessingType1_DifferentTB_PerSlot pdsch_ProcessingType1_DifferentTB_PerSlot_,
      DummyA dummy3_,
      FeatureSetDownlink_dummy4 dummy4_,
      FeatureSetDownlink_dummy5 dummy5_,
      FeatureSetDownlink_dummy6 dummy6_,
      FeatureSetDownlink_dummy7 dummy7_
   ) {
      super();
      featureSetListPerDownlinkCC = featureSetListPerDownlinkCC_;
      intraBandFreqSeparationDL = intraBandFreqSeparationDL_;
      scalingFactor = scalingFactor_;
      dummy8 = dummy8_;
      scellWithoutSSB = scellWithoutSSB_;
      csi_RS_MeasSCellWithoutSSB = csi_RS_MeasSCellWithoutSSB_;
      dummy1 = dummy1_;
      type1_3_CSS = type1_3_CSS_;
      pdcch_MonitoringAnyOccasions = pdcch_MonitoringAnyOccasions_;
      dummy2 = dummy2_;
      ue_SpecificUL_DL_Assignment = ue_SpecificUL_DL_Assignment_;
      searchSpaceSharingCA_DL = searchSpaceSharingCA_DL_;
      timeDurationForQCL = timeDurationForQCL_;
      pdsch_ProcessingType1_DifferentTB_PerSlot = pdsch_ProcessingType1_DifferentTB_PerSlot_;
      dummy3 = dummy3_;
      dummy4 = dummy4_;
      dummy5 = dummy5_;
      dummy6 = dummy6_;
      dummy7 = dummy7_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FeatureSetDownlink (
      FeatureSetDownlink_featureSetListPerDownlinkCC featureSetListPerDownlinkCC_
   ) {
      super();
      featureSetListPerDownlinkCC = featureSetListPerDownlinkCC_;
   }

   public void init () {
      featureSetListPerDownlinkCC = null;
      intraBandFreqSeparationDL = null;
      scalingFactor = null;
      dummy8 = null;
      scellWithoutSSB = null;
      csi_RS_MeasSCellWithoutSSB = null;
      dummy1 = null;
      type1_3_CSS = null;
      pdcch_MonitoringAnyOccasions = null;
      dummy2 = null;
      ue_SpecificUL_DL_Assignment = null;
      searchSpaceSharingCA_DL = null;
      timeDurationForQCL = null;
      pdsch_ProcessingType1_DifferentTB_PerSlot = null;
      dummy3 = null;
      dummy4 = null;
      dummy5 = null;
      dummy6 = null;
      dummy7 = null;
   }

   public int getElementCount() { return 19; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return featureSetListPerDownlinkCC;
         case 1: return intraBandFreqSeparationDL;
         case 2: return scalingFactor;
         case 3: return dummy8;
         case 4: return scellWithoutSSB;
         case 5: return csi_RS_MeasSCellWithoutSSB;
         case 6: return dummy1;
         case 7: return type1_3_CSS;
         case 8: return pdcch_MonitoringAnyOccasions;
         case 9: return dummy2;
         case 10: return ue_SpecificUL_DL_Assignment;
         case 11: return searchSpaceSharingCA_DL;
         case 12: return timeDurationForQCL;
         case 13: return pdsch_ProcessingType1_DifferentTB_PerSlot;
         case 14: return dummy3;
         case 15: return dummy4;
         case 16: return dummy5;
         case 17: return dummy6;
         case 18: return dummy7;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "featureSetListPerDownlinkCC";
         case 1: return "intraBandFreqSeparationDL";
         case 2: return "scalingFactor";
         case 3: return "dummy8";
         case 4: return "scellWithoutSSB";
         case 5: return "csi-RS-MeasSCellWithoutSSB";
         case 6: return "dummy1";
         case 7: return "type1-3-CSS";
         case 8: return "pdcch-MonitoringAnyOccasions";
         case 9: return "dummy2";
         case 10: return "ue-SpecificUL-DL-Assignment";
         case 11: return "searchSpaceSharingCA-DL";
         case 12: return "timeDurationForQCL";
         case 13: return "pdsch-ProcessingType1-DifferentTB-PerSlot";
         case 14: return "dummy3";
         case 15: return "dummy4";
         case 16: return "dummy5";
         case 17: return "dummy6";
         case 18: return "dummy7";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean intraBandFreqSeparationDLPresent = buffer.decodeBit ("intraBandFreqSeparationDLPresent");
      boolean scalingFactorPresent = buffer.decodeBit ("scalingFactorPresent");
      boolean dummy8Present = buffer.decodeBit ("dummy8Present");
      boolean scellWithoutSSBPresent = buffer.decodeBit ("scellWithoutSSBPresent");
      boolean csi_RS_MeasSCellWithoutSSBPresent = buffer.decodeBit ("csi_RS_MeasSCellWithoutSSBPresent");
      boolean dummy1Present = buffer.decodeBit ("dummy1Present");
      boolean type1_3_CSSPresent = buffer.decodeBit ("type1_3_CSSPresent");
      boolean pdcch_MonitoringAnyOccasionsPresent = buffer.decodeBit ("pdcch_MonitoringAnyOccasionsPresent");
      boolean dummy2Present = buffer.decodeBit ("dummy2Present");
      boolean ue_SpecificUL_DL_AssignmentPresent = buffer.decodeBit ("ue_SpecificUL_DL_AssignmentPresent");
      boolean searchSpaceSharingCA_DLPresent = buffer.decodeBit ("searchSpaceSharingCA_DLPresent");
      boolean timeDurationForQCLPresent = buffer.decodeBit ("timeDurationForQCLPresent");
      boolean pdsch_ProcessingType1_DifferentTB_PerSlotPresent = buffer.decodeBit ("pdsch_ProcessingType1_DifferentTB_PerSlotPresent");
      boolean dummy3Present = buffer.decodeBit ("dummy3Present");
      boolean dummy4Present = buffer.decodeBit ("dummy4Present");
      boolean dummy5Present = buffer.decodeBit ("dummy5Present");
      boolean dummy6Present = buffer.decodeBit ("dummy6Present");
      boolean dummy7Present = buffer.decodeBit ("dummy7Present");

      // decode featureSetListPerDownlinkCC

      buffer.getContext().eventDispatcher.startElement("featureSetListPerDownlinkCC", -1);

      featureSetListPerDownlinkCC = new FeatureSetDownlink_featureSetListPerDownlinkCC();
      featureSetListPerDownlinkCC.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("featureSetListPerDownlinkCC", -1);

      // decode intraBandFreqSeparationDL

      if (intraBandFreqSeparationDLPresent) {
         buffer.getContext().eventDispatcher.startElement("intraBandFreqSeparationDL", -1);

         int tval = FreqSeparationClass.decodeEnumValue (buffer);
         intraBandFreqSeparationDL = FreqSeparationClass.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("intraBandFreqSeparationDL", -1);
      }
      else {
         intraBandFreqSeparationDL = null;
      }

      // decode scalingFactor

      if (scalingFactorPresent) {
         buffer.getContext().eventDispatcher.startElement("scalingFactor", -1);

         int tval = FeatureSetDownlink_scalingFactor.decodeEnumValue (buffer);
         scalingFactor = FeatureSetDownlink_scalingFactor.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scalingFactor", -1);
      }
      else {
         scalingFactor = null;
      }

      // decode dummy8

      if (dummy8Present) {
         buffer.getContext().eventDispatcher.startElement("dummy8", -1);

         int tval = FeatureSetDownlink_dummy8.decodeEnumValue (buffer);
         dummy8 = FeatureSetDownlink_dummy8.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy8", -1);
      }
      else {
         dummy8 = null;
      }

      // decode scellWithoutSSB

      if (scellWithoutSSBPresent) {
         buffer.getContext().eventDispatcher.startElement("scellWithoutSSB", -1);

         int tval = FeatureSetDownlink_scellWithoutSSB.decodeEnumValue (buffer);
         scellWithoutSSB = FeatureSetDownlink_scellWithoutSSB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scellWithoutSSB", -1);
      }
      else {
         scellWithoutSSB = null;
      }

      // decode csi_RS_MeasSCellWithoutSSB

      if (csi_RS_MeasSCellWithoutSSBPresent) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_MeasSCellWithoutSSB", -1);

         int tval = FeatureSetDownlink_csi_RS_MeasSCellWithoutSSB.decodeEnumValue (buffer);
         csi_RS_MeasSCellWithoutSSB = FeatureSetDownlink_csi_RS_MeasSCellWithoutSSB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csi_RS_MeasSCellWithoutSSB", -1);
      }
      else {
         csi_RS_MeasSCellWithoutSSB = null;
      }

      // decode dummy1

      if (dummy1Present) {
         buffer.getContext().eventDispatcher.startElement("dummy1", -1);

         int tval = FeatureSetDownlink_dummy1.decodeEnumValue (buffer);
         dummy1 = FeatureSetDownlink_dummy1.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy1", -1);
      }
      else {
         dummy1 = null;
      }

      // decode type1_3_CSS

      if (type1_3_CSSPresent) {
         buffer.getContext().eventDispatcher.startElement("type1_3_CSS", -1);

         int tval = FeatureSetDownlink_type1_3_CSS.decodeEnumValue (buffer);
         type1_3_CSS = FeatureSetDownlink_type1_3_CSS.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("type1_3_CSS", -1);
      }
      else {
         type1_3_CSS = null;
      }

      // decode pdcch_MonitoringAnyOccasions

      if (pdcch_MonitoringAnyOccasionsPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringAnyOccasions", -1);

         int tval = FeatureSetDownlink_pdcch_MonitoringAnyOccasions.decodeEnumValue (buffer);
         pdcch_MonitoringAnyOccasions = FeatureSetDownlink_pdcch_MonitoringAnyOccasions.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringAnyOccasions", -1);
      }
      else {
         pdcch_MonitoringAnyOccasions = null;
      }

      // decode dummy2

      if (dummy2Present) {
         buffer.getContext().eventDispatcher.startElement("dummy2", -1);

         int tval = FeatureSetDownlink_dummy2.decodeEnumValue (buffer);
         dummy2 = FeatureSetDownlink_dummy2.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy2", -1);
      }
      else {
         dummy2 = null;
      }

      // decode ue_SpecificUL_DL_Assignment

      if (ue_SpecificUL_DL_AssignmentPresent) {
         buffer.getContext().eventDispatcher.startElement("ue_SpecificUL_DL_Assignment", -1);

         int tval = FeatureSetDownlink_ue_SpecificUL_DL_Assignment.decodeEnumValue (buffer);
         ue_SpecificUL_DL_Assignment = FeatureSetDownlink_ue_SpecificUL_DL_Assignment.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_SpecificUL_DL_Assignment", -1);
      }
      else {
         ue_SpecificUL_DL_Assignment = null;
      }

      // decode searchSpaceSharingCA_DL

      if (searchSpaceSharingCA_DLPresent) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceSharingCA_DL", -1);

         int tval = FeatureSetDownlink_searchSpaceSharingCA_DL.decodeEnumValue (buffer);
         searchSpaceSharingCA_DL = FeatureSetDownlink_searchSpaceSharingCA_DL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("searchSpaceSharingCA_DL", -1);
      }
      else {
         searchSpaceSharingCA_DL = null;
      }

      // decode timeDurationForQCL

      if (timeDurationForQCLPresent) {
         buffer.getContext().eventDispatcher.startElement("timeDurationForQCL", -1);

         timeDurationForQCL = new FeatureSetDownlink_timeDurationForQCL();
         timeDurationForQCL.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("timeDurationForQCL", -1);
      }
      else {
         timeDurationForQCL = null;
      }

      // decode pdsch_ProcessingType1_DifferentTB_PerSlot

      if (pdsch_ProcessingType1_DifferentTB_PerSlotPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_ProcessingType1_DifferentTB_PerSlot", -1);

         pdsch_ProcessingType1_DifferentTB_PerSlot = new FeatureSetDownlink_pdsch_ProcessingType1_DifferentTB_PerSlot();
         pdsch_ProcessingType1_DifferentTB_PerSlot.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdsch_ProcessingType1_DifferentTB_PerSlot", -1);
      }
      else {
         pdsch_ProcessingType1_DifferentTB_PerSlot = null;
      }

      // decode dummy3

      if (dummy3Present) {
         buffer.getContext().eventDispatcher.startElement("dummy3", -1);

         dummy3 = new DummyA();
         dummy3.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dummy3", -1);
      }
      else {
         dummy3 = null;
      }

      // decode dummy4

      if (dummy4Present) {
         buffer.getContext().eventDispatcher.startElement("dummy4", -1);

         dummy4 = new FeatureSetDownlink_dummy4();
         dummy4.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dummy4", -1);
      }
      else {
         dummy4 = null;
      }

      // decode dummy5

      if (dummy5Present) {
         buffer.getContext().eventDispatcher.startElement("dummy5", -1);

         dummy5 = new FeatureSetDownlink_dummy5();
         dummy5.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dummy5", -1);
      }
      else {
         dummy5 = null;
      }

      // decode dummy6

      if (dummy6Present) {
         buffer.getContext().eventDispatcher.startElement("dummy6", -1);

         dummy6 = new FeatureSetDownlink_dummy6();
         dummy6.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dummy6", -1);
      }
      else {
         dummy6 = null;
      }

      // decode dummy7

      if (dummy7Present) {
         buffer.getContext().eventDispatcher.startElement("dummy7", -1);

         dummy7 = new FeatureSetDownlink_dummy7();
         dummy7.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dummy7", -1);
      }
      else {
         dummy7 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (featureSetListPerDownlinkCC != null) featureSetListPerDownlinkCC.print (_sb, "featureSetListPerDownlinkCC", _level+1);
      if (intraBandFreqSeparationDL != null) intraBandFreqSeparationDL.print (_sb, "intraBandFreqSeparationDL", _level+1);
      if (scalingFactor != null) scalingFactor.print (_sb, "scalingFactor", _level+1);
      if (dummy8 != null) dummy8.print (_sb, "dummy8", _level+1);
      if (scellWithoutSSB != null) scellWithoutSSB.print (_sb, "scellWithoutSSB", _level+1);
      if (csi_RS_MeasSCellWithoutSSB != null) csi_RS_MeasSCellWithoutSSB.print (_sb, "csi_RS_MeasSCellWithoutSSB", _level+1);
      if (dummy1 != null) dummy1.print (_sb, "dummy1", _level+1);
      if (type1_3_CSS != null) type1_3_CSS.print (_sb, "type1_3_CSS", _level+1);
      if (pdcch_MonitoringAnyOccasions != null) pdcch_MonitoringAnyOccasions.print (_sb, "pdcch_MonitoringAnyOccasions", _level+1);
      if (dummy2 != null) dummy2.print (_sb, "dummy2", _level+1);
      if (ue_SpecificUL_DL_Assignment != null) ue_SpecificUL_DL_Assignment.print (_sb, "ue_SpecificUL_DL_Assignment", _level+1);
      if (searchSpaceSharingCA_DL != null) searchSpaceSharingCA_DL.print (_sb, "searchSpaceSharingCA_DL", _level+1);
      if (timeDurationForQCL != null) timeDurationForQCL.print (_sb, "timeDurationForQCL", _level+1);
      if (pdsch_ProcessingType1_DifferentTB_PerSlot != null) pdsch_ProcessingType1_DifferentTB_PerSlot.print (_sb, "pdsch_ProcessingType1_DifferentTB_PerSlot", _level+1);
      if (dummy3 != null) dummy3.print (_sb, "dummy3", _level+1);
      if (dummy4 != null) dummy4.print (_sb, "dummy4", _level+1);
      if (dummy5 != null) dummy5.print (_sb, "dummy5", _level+1);
      if (dummy6 != null) dummy6.print (_sb, "dummy6", _level+1);
      if (dummy7 != null) dummy7.print (_sb, "dummy7", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
