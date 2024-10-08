/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink_v1540 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FeatureSetDownlink-v1540";
   }

   public FeatureSetDownlink_v1540_oneFL_DMRS_TwoAdditionalDMRS_DL oneFL_DMRS_TwoAdditionalDMRS_DL = null;  // optional
   public FeatureSetDownlink_v1540_additionalDMRS_DL_Alt additionalDMRS_DL_Alt = null;  // optional
   public FeatureSetDownlink_v1540_twoFL_DMRS_TwoAdditionalDMRS_DL twoFL_DMRS_TwoAdditionalDMRS_DL = null;  // optional
   public FeatureSetDownlink_v1540_oneFL_DMRS_ThreeAdditionalDMRS_DL oneFL_DMRS_ThreeAdditionalDMRS_DL = null;  // optional
   public FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap pdcch_MonitoringAnyOccasionsWithSpanGap;  // optional
   public FeatureSetDownlink_v1540_pdsch_SeparationWithGap pdsch_SeparationWithGap = null;  // optional
   public FeatureSetDownlink_v1540_pdsch_ProcessingType2 pdsch_ProcessingType2;  // optional
   public FeatureSetDownlink_v1540_pdsch_ProcessingType2_Limited pdsch_ProcessingType2_Limited;  // optional
   public FeatureSetDownlink_v1540_dl_MCS_TableAlt_DynamicIndication dl_MCS_TableAlt_DynamicIndication = null;  // optional

   public FeatureSetDownlink_v1540 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetDownlink_v1540 (
      FeatureSetDownlink_v1540_oneFL_DMRS_TwoAdditionalDMRS_DL oneFL_DMRS_TwoAdditionalDMRS_DL_,
      FeatureSetDownlink_v1540_additionalDMRS_DL_Alt additionalDMRS_DL_Alt_,
      FeatureSetDownlink_v1540_twoFL_DMRS_TwoAdditionalDMRS_DL twoFL_DMRS_TwoAdditionalDMRS_DL_,
      FeatureSetDownlink_v1540_oneFL_DMRS_ThreeAdditionalDMRS_DL oneFL_DMRS_ThreeAdditionalDMRS_DL_,
      FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap pdcch_MonitoringAnyOccasionsWithSpanGap_,
      FeatureSetDownlink_v1540_pdsch_SeparationWithGap pdsch_SeparationWithGap_,
      FeatureSetDownlink_v1540_pdsch_ProcessingType2 pdsch_ProcessingType2_,
      FeatureSetDownlink_v1540_pdsch_ProcessingType2_Limited pdsch_ProcessingType2_Limited_,
      FeatureSetDownlink_v1540_dl_MCS_TableAlt_DynamicIndication dl_MCS_TableAlt_DynamicIndication_
   ) {
      super();
      oneFL_DMRS_TwoAdditionalDMRS_DL = oneFL_DMRS_TwoAdditionalDMRS_DL_;
      additionalDMRS_DL_Alt = additionalDMRS_DL_Alt_;
      twoFL_DMRS_TwoAdditionalDMRS_DL = twoFL_DMRS_TwoAdditionalDMRS_DL_;
      oneFL_DMRS_ThreeAdditionalDMRS_DL = oneFL_DMRS_ThreeAdditionalDMRS_DL_;
      pdcch_MonitoringAnyOccasionsWithSpanGap = pdcch_MonitoringAnyOccasionsWithSpanGap_;
      pdsch_SeparationWithGap = pdsch_SeparationWithGap_;
      pdsch_ProcessingType2 = pdsch_ProcessingType2_;
      pdsch_ProcessingType2_Limited = pdsch_ProcessingType2_Limited_;
      dl_MCS_TableAlt_DynamicIndication = dl_MCS_TableAlt_DynamicIndication_;
   }

   public void init () {
      oneFL_DMRS_TwoAdditionalDMRS_DL = null;
      additionalDMRS_DL_Alt = null;
      twoFL_DMRS_TwoAdditionalDMRS_DL = null;
      oneFL_DMRS_ThreeAdditionalDMRS_DL = null;
      pdcch_MonitoringAnyOccasionsWithSpanGap = null;
      pdsch_SeparationWithGap = null;
      pdsch_ProcessingType2 = null;
      pdsch_ProcessingType2_Limited = null;
      dl_MCS_TableAlt_DynamicIndication = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return oneFL_DMRS_TwoAdditionalDMRS_DL;
         case 1: return additionalDMRS_DL_Alt;
         case 2: return twoFL_DMRS_TwoAdditionalDMRS_DL;
         case 3: return oneFL_DMRS_ThreeAdditionalDMRS_DL;
         case 4: return pdcch_MonitoringAnyOccasionsWithSpanGap;
         case 5: return pdsch_SeparationWithGap;
         case 6: return pdsch_ProcessingType2;
         case 7: return pdsch_ProcessingType2_Limited;
         case 8: return dl_MCS_TableAlt_DynamicIndication;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "oneFL-DMRS-TwoAdditionalDMRS-DL";
         case 1: return "additionalDMRS-DL-Alt";
         case 2: return "twoFL-DMRS-TwoAdditionalDMRS-DL";
         case 3: return "oneFL-DMRS-ThreeAdditionalDMRS-DL";
         case 4: return "pdcch-MonitoringAnyOccasionsWithSpanGap";
         case 5: return "pdsch-SeparationWithGap";
         case 6: return "pdsch-ProcessingType2";
         case 7: return "pdsch-ProcessingType2-Limited";
         case 8: return "dl-MCS-TableAlt-DynamicIndication";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean oneFL_DMRS_TwoAdditionalDMRS_DLPresent = buffer.decodeBit ("oneFL_DMRS_TwoAdditionalDMRS_DLPresent");
      boolean additionalDMRS_DL_AltPresent = buffer.decodeBit ("additionalDMRS_DL_AltPresent");
      boolean twoFL_DMRS_TwoAdditionalDMRS_DLPresent = buffer.decodeBit ("twoFL_DMRS_TwoAdditionalDMRS_DLPresent");
      boolean oneFL_DMRS_ThreeAdditionalDMRS_DLPresent = buffer.decodeBit ("oneFL_DMRS_ThreeAdditionalDMRS_DLPresent");
      boolean pdcch_MonitoringAnyOccasionsWithSpanGapPresent = buffer.decodeBit ("pdcch_MonitoringAnyOccasionsWithSpanGapPresent");
      boolean pdsch_SeparationWithGapPresent = buffer.decodeBit ("pdsch_SeparationWithGapPresent");
      boolean pdsch_ProcessingType2Present = buffer.decodeBit ("pdsch_ProcessingType2Present");
      boolean pdsch_ProcessingType2_LimitedPresent = buffer.decodeBit ("pdsch_ProcessingType2_LimitedPresent");
      boolean dl_MCS_TableAlt_DynamicIndicationPresent = buffer.decodeBit ("dl_MCS_TableAlt_DynamicIndicationPresent");

      // decode oneFL_DMRS_TwoAdditionalDMRS_DL

      if (oneFL_DMRS_TwoAdditionalDMRS_DLPresent) {
         buffer.getContext().eventDispatcher.startElement("oneFL_DMRS_TwoAdditionalDMRS_DL", -1);

         int tval = FeatureSetDownlink_v1540_oneFL_DMRS_TwoAdditionalDMRS_DL.decodeEnumValue (buffer);
         oneFL_DMRS_TwoAdditionalDMRS_DL = FeatureSetDownlink_v1540_oneFL_DMRS_TwoAdditionalDMRS_DL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("oneFL_DMRS_TwoAdditionalDMRS_DL", -1);
      }
      else {
         oneFL_DMRS_TwoAdditionalDMRS_DL = null;
      }

      // decode additionalDMRS_DL_Alt

      if (additionalDMRS_DL_AltPresent) {
         buffer.getContext().eventDispatcher.startElement("additionalDMRS_DL_Alt", -1);

         int tval = FeatureSetDownlink_v1540_additionalDMRS_DL_Alt.decodeEnumValue (buffer);
         additionalDMRS_DL_Alt = FeatureSetDownlink_v1540_additionalDMRS_DL_Alt.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("additionalDMRS_DL_Alt", -1);
      }
      else {
         additionalDMRS_DL_Alt = null;
      }

      // decode twoFL_DMRS_TwoAdditionalDMRS_DL

      if (twoFL_DMRS_TwoAdditionalDMRS_DLPresent) {
         buffer.getContext().eventDispatcher.startElement("twoFL_DMRS_TwoAdditionalDMRS_DL", -1);

         int tval = FeatureSetDownlink_v1540_twoFL_DMRS_TwoAdditionalDMRS_DL.decodeEnumValue (buffer);
         twoFL_DMRS_TwoAdditionalDMRS_DL = FeatureSetDownlink_v1540_twoFL_DMRS_TwoAdditionalDMRS_DL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("twoFL_DMRS_TwoAdditionalDMRS_DL", -1);
      }
      else {
         twoFL_DMRS_TwoAdditionalDMRS_DL = null;
      }

      // decode oneFL_DMRS_ThreeAdditionalDMRS_DL

      if (oneFL_DMRS_ThreeAdditionalDMRS_DLPresent) {
         buffer.getContext().eventDispatcher.startElement("oneFL_DMRS_ThreeAdditionalDMRS_DL", -1);

         int tval = FeatureSetDownlink_v1540_oneFL_DMRS_ThreeAdditionalDMRS_DL.decodeEnumValue (buffer);
         oneFL_DMRS_ThreeAdditionalDMRS_DL = FeatureSetDownlink_v1540_oneFL_DMRS_ThreeAdditionalDMRS_DL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("oneFL_DMRS_ThreeAdditionalDMRS_DL", -1);
      }
      else {
         oneFL_DMRS_ThreeAdditionalDMRS_DL = null;
      }

      // decode pdcch_MonitoringAnyOccasionsWithSpanGap

      if (pdcch_MonitoringAnyOccasionsWithSpanGapPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringAnyOccasionsWithSpanGap", -1);

         pdcch_MonitoringAnyOccasionsWithSpanGap = new FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap();
         pdcch_MonitoringAnyOccasionsWithSpanGap.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringAnyOccasionsWithSpanGap", -1);
      }
      else {
         pdcch_MonitoringAnyOccasionsWithSpanGap = null;
      }

      // decode pdsch_SeparationWithGap

      if (pdsch_SeparationWithGapPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_SeparationWithGap", -1);

         int tval = FeatureSetDownlink_v1540_pdsch_SeparationWithGap.decodeEnumValue (buffer);
         pdsch_SeparationWithGap = FeatureSetDownlink_v1540_pdsch_SeparationWithGap.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_SeparationWithGap", -1);
      }
      else {
         pdsch_SeparationWithGap = null;
      }

      // decode pdsch_ProcessingType2

      if (pdsch_ProcessingType2Present) {
         buffer.getContext().eventDispatcher.startElement("pdsch_ProcessingType2", -1);

         pdsch_ProcessingType2 = new FeatureSetDownlink_v1540_pdsch_ProcessingType2();
         pdsch_ProcessingType2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdsch_ProcessingType2", -1);
      }
      else {
         pdsch_ProcessingType2 = null;
      }

      // decode pdsch_ProcessingType2_Limited

      if (pdsch_ProcessingType2_LimitedPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_ProcessingType2_Limited", -1);

         pdsch_ProcessingType2_Limited = new FeatureSetDownlink_v1540_pdsch_ProcessingType2_Limited();
         pdsch_ProcessingType2_Limited.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdsch_ProcessingType2_Limited", -1);
      }
      else {
         pdsch_ProcessingType2_Limited = null;
      }

      // decode dl_MCS_TableAlt_DynamicIndication

      if (dl_MCS_TableAlt_DynamicIndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("dl_MCS_TableAlt_DynamicIndication", -1);

         int tval = FeatureSetDownlink_v1540_dl_MCS_TableAlt_DynamicIndication.decodeEnumValue (buffer);
         dl_MCS_TableAlt_DynamicIndication = FeatureSetDownlink_v1540_dl_MCS_TableAlt_DynamicIndication.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_MCS_TableAlt_DynamicIndication", -1);
      }
      else {
         dl_MCS_TableAlt_DynamicIndication = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((oneFL_DMRS_TwoAdditionalDMRS_DL != null), null);
      buffer.encodeBit ((additionalDMRS_DL_Alt != null), null);
      buffer.encodeBit ((twoFL_DMRS_TwoAdditionalDMRS_DL != null), null);
      buffer.encodeBit ((oneFL_DMRS_ThreeAdditionalDMRS_DL != null), null);
      buffer.encodeBit ((pdcch_MonitoringAnyOccasionsWithSpanGap != null), null);
      buffer.encodeBit ((pdsch_SeparationWithGap != null), null);
      buffer.encodeBit ((pdsch_ProcessingType2 != null), null);
      buffer.encodeBit ((pdsch_ProcessingType2_Limited != null), null);
      buffer.encodeBit ((dl_MCS_TableAlt_DynamicIndication != null), null);

      // encode oneFL_DMRS_TwoAdditionalDMRS_DL

      if (oneFL_DMRS_TwoAdditionalDMRS_DL != null) {
         buffer.getContext().eventDispatcher.startElement("oneFL_DMRS_TwoAdditionalDMRS_DL", -1);

         oneFL_DMRS_TwoAdditionalDMRS_DL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("oneFL_DMRS_TwoAdditionalDMRS_DL", -1);
      }

      // encode additionalDMRS_DL_Alt

      if (additionalDMRS_DL_Alt != null) {
         buffer.getContext().eventDispatcher.startElement("additionalDMRS_DL_Alt", -1);

         additionalDMRS_DL_Alt.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("additionalDMRS_DL_Alt", -1);
      }

      // encode twoFL_DMRS_TwoAdditionalDMRS_DL

      if (twoFL_DMRS_TwoAdditionalDMRS_DL != null) {
         buffer.getContext().eventDispatcher.startElement("twoFL_DMRS_TwoAdditionalDMRS_DL", -1);

         twoFL_DMRS_TwoAdditionalDMRS_DL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("twoFL_DMRS_TwoAdditionalDMRS_DL", -1);
      }

      // encode oneFL_DMRS_ThreeAdditionalDMRS_DL

      if (oneFL_DMRS_ThreeAdditionalDMRS_DL != null) {
         buffer.getContext().eventDispatcher.startElement("oneFL_DMRS_ThreeAdditionalDMRS_DL", -1);

         oneFL_DMRS_ThreeAdditionalDMRS_DL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("oneFL_DMRS_ThreeAdditionalDMRS_DL", -1);
      }

      // encode pdcch_MonitoringAnyOccasionsWithSpanGap

      if (pdcch_MonitoringAnyOccasionsWithSpanGap != null) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringAnyOccasionsWithSpanGap", -1);

         pdcch_MonitoringAnyOccasionsWithSpanGap.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringAnyOccasionsWithSpanGap", -1);
      }

      // encode pdsch_SeparationWithGap

      if (pdsch_SeparationWithGap != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_SeparationWithGap", -1);

         pdsch_SeparationWithGap.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_SeparationWithGap", -1);
      }

      // encode pdsch_ProcessingType2

      if (pdsch_ProcessingType2 != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_ProcessingType2", -1);

         pdsch_ProcessingType2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_ProcessingType2", -1);
      }

      // encode pdsch_ProcessingType2_Limited

      if (pdsch_ProcessingType2_Limited != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_ProcessingType2_Limited", -1);

         pdsch_ProcessingType2_Limited.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_ProcessingType2_Limited", -1);
      }

      // encode dl_MCS_TableAlt_DynamicIndication

      if (dl_MCS_TableAlt_DynamicIndication != null) {
         buffer.getContext().eventDispatcher.startElement("dl_MCS_TableAlt_DynamicIndication", -1);

         dl_MCS_TableAlt_DynamicIndication.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dl_MCS_TableAlt_DynamicIndication", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (oneFL_DMRS_TwoAdditionalDMRS_DL != null) oneFL_DMRS_TwoAdditionalDMRS_DL.print (_sb, "oneFL_DMRS_TwoAdditionalDMRS_DL", _level+1);
      if (additionalDMRS_DL_Alt != null) additionalDMRS_DL_Alt.print (_sb, "additionalDMRS_DL_Alt", _level+1);
      if (twoFL_DMRS_TwoAdditionalDMRS_DL != null) twoFL_DMRS_TwoAdditionalDMRS_DL.print (_sb, "twoFL_DMRS_TwoAdditionalDMRS_DL", _level+1);
      if (oneFL_DMRS_ThreeAdditionalDMRS_DL != null) oneFL_DMRS_ThreeAdditionalDMRS_DL.print (_sb, "oneFL_DMRS_ThreeAdditionalDMRS_DL", _level+1);
      if (pdcch_MonitoringAnyOccasionsWithSpanGap != null) pdcch_MonitoringAnyOccasionsWithSpanGap.print (_sb, "pdcch_MonitoringAnyOccasionsWithSpanGap", _level+1);
      if (pdsch_SeparationWithGap != null) pdsch_SeparationWithGap.print (_sb, "pdsch_SeparationWithGap", _level+1);
      if (pdsch_ProcessingType2 != null) pdsch_ProcessingType2.print (_sb, "pdsch_ProcessingType2", _level+1);
      if (pdsch_ProcessingType2_Limited != null) pdsch_ProcessingType2_Limited.print (_sb, "pdsch_ProcessingType2_Limited", _level+1);
      if (dl_MCS_TableAlt_DynamicIndication != null) dl_MCS_TableAlt_DynamicIndication.print (_sb, "dl_MCS_TableAlt_DynamicIndication", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
