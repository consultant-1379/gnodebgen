/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_ParametersCommon extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MAC-ParametersCommon";
   }

   public MAC_ParametersCommon_lcp_Restriction lcp_Restriction = null;  // optional
   public MAC_ParametersCommon_dummy dummy = null;  // optional
   public MAC_ParametersCommon_lch_ToSCellRestriction lch_ToSCellRestriction = null;  // optional
   public boolean mV2ExtPresent;
   public MAC_ParametersCommon_recommendedBitRate recommendedBitRate = null;  // optional
   public MAC_ParametersCommon_recommendedBitRateQuery recommendedBitRateQuery = null;  // optional
   public boolean mV3ExtPresent;
   public MAC_ParametersCommon_recommendedBitRateMultiplier_r16 recommendedBitRateMultiplier_r16 = null;  // optional
   public MAC_ParametersCommon_preEmptiveBSR_r16 preEmptiveBSR_r16 = null;  // optional
   public MAC_ParametersCommon_autonomousTransmission_r16 autonomousTransmission_r16 = null;  // optional
   public MAC_ParametersCommon_lch_PriorityBasedPrioritization_r16 lch_PriorityBasedPrioritization_r16 = null;  // optional
   public MAC_ParametersCommon_lch_ToConfiguredGrantMapping_r16 lch_ToConfiguredGrantMapping_r16 = null;  // optional
   public MAC_ParametersCommon_lch_ToGrantPriorityRestriction_r16 lch_ToGrantPriorityRestriction_r16 = null;  // optional
   public MAC_ParametersCommon_singlePHR_P_r16 singlePHR_P_r16 = null;  // optional
   public MAC_ParametersCommon_ul_LBT_FailureDetectionRecovery_r16 ul_LBT_FailureDetectionRecovery_r16 = null;  // optional
   public MAC_ParametersCommon_tdd_MPE_P_MPR_Reporting_r16 tdd_MPE_P_MPR_Reporting_r16 = null;  // optional
   public MAC_ParametersCommon_lcid_ExtensionIAB_r16 lcid_ExtensionIAB_r16 = null;  // optional
   public boolean mV4ExtPresent;
   public MAC_ParametersCommon_spCell_BFR_CBRA_r16 spCell_BFR_CBRA_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public MAC_ParametersCommon () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_ParametersCommon (
      MAC_ParametersCommon_lcp_Restriction lcp_Restriction_,
      MAC_ParametersCommon_dummy dummy_,
      MAC_ParametersCommon_lch_ToSCellRestriction lch_ToSCellRestriction_,
      MAC_ParametersCommon_recommendedBitRate recommendedBitRate_,
      MAC_ParametersCommon_recommendedBitRateQuery recommendedBitRateQuery_,
      MAC_ParametersCommon_recommendedBitRateMultiplier_r16 recommendedBitRateMultiplier_r16_,
      MAC_ParametersCommon_preEmptiveBSR_r16 preEmptiveBSR_r16_,
      MAC_ParametersCommon_autonomousTransmission_r16 autonomousTransmission_r16_,
      MAC_ParametersCommon_lch_PriorityBasedPrioritization_r16 lch_PriorityBasedPrioritization_r16_,
      MAC_ParametersCommon_lch_ToConfiguredGrantMapping_r16 lch_ToConfiguredGrantMapping_r16_,
      MAC_ParametersCommon_lch_ToGrantPriorityRestriction_r16 lch_ToGrantPriorityRestriction_r16_,
      MAC_ParametersCommon_singlePHR_P_r16 singlePHR_P_r16_,
      MAC_ParametersCommon_ul_LBT_FailureDetectionRecovery_r16 ul_LBT_FailureDetectionRecovery_r16_,
      MAC_ParametersCommon_tdd_MPE_P_MPR_Reporting_r16 tdd_MPE_P_MPR_Reporting_r16_,
      MAC_ParametersCommon_lcid_ExtensionIAB_r16 lcid_ExtensionIAB_r16_,
      MAC_ParametersCommon_spCell_BFR_CBRA_r16 spCell_BFR_CBRA_r16_
   ) {
      super();
      lcp_Restriction = lcp_Restriction_;
      dummy = dummy_;
      lch_ToSCellRestriction = lch_ToSCellRestriction_;
      recommendedBitRate = recommendedBitRate_;
      recommendedBitRateQuery = recommendedBitRateQuery_;
      recommendedBitRateMultiplier_r16 = recommendedBitRateMultiplier_r16_;
      preEmptiveBSR_r16 = preEmptiveBSR_r16_;
      autonomousTransmission_r16 = autonomousTransmission_r16_;
      lch_PriorityBasedPrioritization_r16 = lch_PriorityBasedPrioritization_r16_;
      lch_ToConfiguredGrantMapping_r16 = lch_ToConfiguredGrantMapping_r16_;
      lch_ToGrantPriorityRestriction_r16 = lch_ToGrantPriorityRestriction_r16_;
      singlePHR_P_r16 = singlePHR_P_r16_;
      ul_LBT_FailureDetectionRecovery_r16 = ul_LBT_FailureDetectionRecovery_r16_;
      tdd_MPE_P_MPR_Reporting_r16 = tdd_MPE_P_MPR_Reporting_r16_;
      lcid_ExtensionIAB_r16 = lcid_ExtensionIAB_r16_;
      spCell_BFR_CBRA_r16 = spCell_BFR_CBRA_r16_;
   }

   public void init () {
      lcp_Restriction = null;
      dummy = null;
      lch_ToSCellRestriction = null;
      recommendedBitRate = null;
      recommendedBitRateQuery = null;
      recommendedBitRateMultiplier_r16 = null;
      preEmptiveBSR_r16 = null;
      autonomousTransmission_r16 = null;
      lch_PriorityBasedPrioritization_r16 = null;
      lch_ToConfiguredGrantMapping_r16 = null;
      lch_ToGrantPriorityRestriction_r16 = null;
      singlePHR_P_r16 = null;
      ul_LBT_FailureDetectionRecovery_r16 = null;
      tdd_MPE_P_MPR_Reporting_r16 = null;
      lcid_ExtensionIAB_r16 = null;
      spCell_BFR_CBRA_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 17; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lcp_Restriction;
         case 1: return dummy;
         case 2: return lch_ToSCellRestriction;
         case 3: return recommendedBitRate;
         case 4: return recommendedBitRateQuery;
         case 5: return recommendedBitRateMultiplier_r16;
         case 6: return preEmptiveBSR_r16;
         case 7: return autonomousTransmission_r16;
         case 8: return lch_PriorityBasedPrioritization_r16;
         case 9: return lch_ToConfiguredGrantMapping_r16;
         case 10: return lch_ToGrantPriorityRestriction_r16;
         case 11: return singlePHR_P_r16;
         case 12: return ul_LBT_FailureDetectionRecovery_r16;
         case 13: return tdd_MPE_P_MPR_Reporting_r16;
         case 14: return lcid_ExtensionIAB_r16;
         case 15: return spCell_BFR_CBRA_r16;
         case 16: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lcp-Restriction";
         case 1: return "dummy";
         case 2: return "lch-ToSCellRestriction";
         case 3: return "recommendedBitRate";
         case 4: return "recommendedBitRateQuery";
         case 5: return "recommendedBitRateMultiplier-r16";
         case 6: return "preEmptiveBSR-r16";
         case 7: return "autonomousTransmission-r16";
         case 8: return "lch-PriorityBasedPrioritization-r16";
         case 9: return "lch-ToConfiguredGrantMapping-r16";
         case 10: return "lch-ToGrantPriorityRestriction-r16";
         case 11: return "singlePHR-P-r16";
         case 12: return "ul-LBT-FailureDetectionRecovery-r16";
         case 13: return "tdd-MPE-P-MPR-Reporting-r16";
         case 14: return "lcid-ExtensionIAB-r16";
         case 15: return "spCell-BFR-CBRA-r16";
         case 16: return null;
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

      boolean lcp_RestrictionPresent = buffer.decodeBit ("lcp_RestrictionPresent");
      boolean dummyPresent = buffer.decodeBit ("dummyPresent");
      boolean lch_ToSCellRestrictionPresent = buffer.decodeBit ("lch_ToSCellRestrictionPresent");

      // decode lcp_Restriction

      if (lcp_RestrictionPresent) {
         buffer.getContext().eventDispatcher.startElement("lcp_Restriction", -1);

         int tval = MAC_ParametersCommon_lcp_Restriction.decodeEnumValue (buffer);
         lcp_Restriction = MAC_ParametersCommon_lcp_Restriction.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lcp_Restriction", -1);
      }
      else {
         lcp_Restriction = null;
      }

      // decode dummy

      if (dummyPresent) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         int tval = MAC_ParametersCommon_dummy.decodeEnumValue (buffer);
         dummy = MAC_ParametersCommon_dummy.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else {
         dummy = null;
      }

      // decode lch_ToSCellRestriction

      if (lch_ToSCellRestrictionPresent) {
         buffer.getContext().eventDispatcher.startElement("lch_ToSCellRestriction", -1);

         int tval = MAC_ParametersCommon_lch_ToSCellRestriction.decodeEnumValue (buffer);
         lch_ToSCellRestriction = MAC_ParametersCommon_lch_ToSCellRestriction.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lch_ToSCellRestriction", -1);
      }
      else {
         lch_ToSCellRestriction = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean recommendedBitRatePresent = buffer.decodeBit ("recommendedBitRatePresent");

            boolean recommendedBitRateQueryPresent = buffer.decodeBit ("recommendedBitRateQueryPresent");

            // decode recommendedBitRate

            if (recommendedBitRatePresent) {
               buffer.getContext().eventDispatcher.startElement("recommendedBitRate", -1);

               int tval = MAC_ParametersCommon_recommendedBitRate.decodeEnumValue (buffer);
               recommendedBitRate = MAC_ParametersCommon_recommendedBitRate.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("recommendedBitRate", -1);
            }
            else {
               recommendedBitRate = null;
            }

            // decode recommendedBitRateQuery

            if (recommendedBitRateQueryPresent) {
               buffer.getContext().eventDispatcher.startElement("recommendedBitRateQuery", -1);

               int tval = MAC_ParametersCommon_recommendedBitRateQuery.decodeEnumValue (buffer);
               recommendedBitRateQuery = MAC_ParametersCommon_recommendedBitRateQuery.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("recommendedBitRateQuery", -1);
            }
            else {
               recommendedBitRateQuery = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean recommendedBitRateMultiplier_r16Present = buffer.decodeBit ("recommendedBitRateMultiplier_r16Present");

            boolean preEmptiveBSR_r16Present = buffer.decodeBit ("preEmptiveBSR_r16Present");

            boolean autonomousTransmission_r16Present = buffer.decodeBit ("autonomousTransmission_r16Present");

            boolean lch_PriorityBasedPrioritization_r16Present = buffer.decodeBit ("lch_PriorityBasedPrioritization_r16Present");

            boolean lch_ToConfiguredGrantMapping_r16Present = buffer.decodeBit ("lch_ToConfiguredGrantMapping_r16Present");

            boolean lch_ToGrantPriorityRestriction_r16Present = buffer.decodeBit ("lch_ToGrantPriorityRestriction_r16Present");

            boolean singlePHR_P_r16Present = buffer.decodeBit ("singlePHR_P_r16Present");

            boolean ul_LBT_FailureDetectionRecovery_r16Present = buffer.decodeBit ("ul_LBT_FailureDetectionRecovery_r16Present");

            boolean tdd_MPE_P_MPR_Reporting_r16Present = buffer.decodeBit ("tdd_MPE_P_MPR_Reporting_r16Present");

            boolean lcid_ExtensionIAB_r16Present = buffer.decodeBit ("lcid_ExtensionIAB_r16Present");

            // decode recommendedBitRateMultiplier_r16

            if (recommendedBitRateMultiplier_r16Present) {
               buffer.getContext().eventDispatcher.startElement("recommendedBitRateMultiplier_r16", -1);

               int tval = MAC_ParametersCommon_recommendedBitRateMultiplier_r16.decodeEnumValue (buffer);
               recommendedBitRateMultiplier_r16 = MAC_ParametersCommon_recommendedBitRateMultiplier_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("recommendedBitRateMultiplier_r16", -1);
            }
            else {
               recommendedBitRateMultiplier_r16 = null;
            }

            // decode preEmptiveBSR_r16

            if (preEmptiveBSR_r16Present) {
               buffer.getContext().eventDispatcher.startElement("preEmptiveBSR_r16", -1);

               int tval = MAC_ParametersCommon_preEmptiveBSR_r16.decodeEnumValue (buffer);
               preEmptiveBSR_r16 = MAC_ParametersCommon_preEmptiveBSR_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("preEmptiveBSR_r16", -1);
            }
            else {
               preEmptiveBSR_r16 = null;
            }

            // decode autonomousTransmission_r16

            if (autonomousTransmission_r16Present) {
               buffer.getContext().eventDispatcher.startElement("autonomousTransmission_r16", -1);

               int tval = MAC_ParametersCommon_autonomousTransmission_r16.decodeEnumValue (buffer);
               autonomousTransmission_r16 = MAC_ParametersCommon_autonomousTransmission_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("autonomousTransmission_r16", -1);
            }
            else {
               autonomousTransmission_r16 = null;
            }

            // decode lch_PriorityBasedPrioritization_r16

            if (lch_PriorityBasedPrioritization_r16Present) {
               buffer.getContext().eventDispatcher.startElement("lch_PriorityBasedPrioritization_r16", -1);

               int tval = MAC_ParametersCommon_lch_PriorityBasedPrioritization_r16.decodeEnumValue (buffer);
               lch_PriorityBasedPrioritization_r16 = MAC_ParametersCommon_lch_PriorityBasedPrioritization_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("lch_PriorityBasedPrioritization_r16", -1);
            }
            else {
               lch_PriorityBasedPrioritization_r16 = null;
            }

            // decode lch_ToConfiguredGrantMapping_r16

            if (lch_ToConfiguredGrantMapping_r16Present) {
               buffer.getContext().eventDispatcher.startElement("lch_ToConfiguredGrantMapping_r16", -1);

               int tval = MAC_ParametersCommon_lch_ToConfiguredGrantMapping_r16.decodeEnumValue (buffer);
               lch_ToConfiguredGrantMapping_r16 = MAC_ParametersCommon_lch_ToConfiguredGrantMapping_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("lch_ToConfiguredGrantMapping_r16", -1);
            }
            else {
               lch_ToConfiguredGrantMapping_r16 = null;
            }

            // decode lch_ToGrantPriorityRestriction_r16

            if (lch_ToGrantPriorityRestriction_r16Present) {
               buffer.getContext().eventDispatcher.startElement("lch_ToGrantPriorityRestriction_r16", -1);

               int tval = MAC_ParametersCommon_lch_ToGrantPriorityRestriction_r16.decodeEnumValue (buffer);
               lch_ToGrantPriorityRestriction_r16 = MAC_ParametersCommon_lch_ToGrantPriorityRestriction_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("lch_ToGrantPriorityRestriction_r16", -1);
            }
            else {
               lch_ToGrantPriorityRestriction_r16 = null;
            }

            // decode singlePHR_P_r16

            if (singlePHR_P_r16Present) {
               buffer.getContext().eventDispatcher.startElement("singlePHR_P_r16", -1);

               int tval = MAC_ParametersCommon_singlePHR_P_r16.decodeEnumValue (buffer);
               singlePHR_P_r16 = MAC_ParametersCommon_singlePHR_P_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("singlePHR_P_r16", -1);
            }
            else {
               singlePHR_P_r16 = null;
            }

            // decode ul_LBT_FailureDetectionRecovery_r16

            if (ul_LBT_FailureDetectionRecovery_r16Present) {
               buffer.getContext().eventDispatcher.startElement("ul_LBT_FailureDetectionRecovery_r16", -1);

               int tval = MAC_ParametersCommon_ul_LBT_FailureDetectionRecovery_r16.decodeEnumValue (buffer);
               ul_LBT_FailureDetectionRecovery_r16 = MAC_ParametersCommon_ul_LBT_FailureDetectionRecovery_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("ul_LBT_FailureDetectionRecovery_r16", -1);
            }
            else {
               ul_LBT_FailureDetectionRecovery_r16 = null;
            }

            // decode tdd_MPE_P_MPR_Reporting_r16

            if (tdd_MPE_P_MPR_Reporting_r16Present) {
               buffer.getContext().eventDispatcher.startElement("tdd_MPE_P_MPR_Reporting_r16", -1);

               int tval = MAC_ParametersCommon_tdd_MPE_P_MPR_Reporting_r16.decodeEnumValue (buffer);
               tdd_MPE_P_MPR_Reporting_r16 = MAC_ParametersCommon_tdd_MPE_P_MPR_Reporting_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("tdd_MPE_P_MPR_Reporting_r16", -1);
            }
            else {
               tdd_MPE_P_MPR_Reporting_r16 = null;
            }

            // decode lcid_ExtensionIAB_r16

            if (lcid_ExtensionIAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("lcid_ExtensionIAB_r16", -1);

               int tval = MAC_ParametersCommon_lcid_ExtensionIAB_r16.decodeEnumValue (buffer);
               lcid_ExtensionIAB_r16 = MAC_ParametersCommon_lcid_ExtensionIAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("lcid_ExtensionIAB_r16", -1);
            }
            else {
               lcid_ExtensionIAB_r16 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean spCell_BFR_CBRA_r16Present = buffer.decodeBit ("spCell_BFR_CBRA_r16Present");

            // decode spCell_BFR_CBRA_r16

            if (spCell_BFR_CBRA_r16Present) {
               buffer.getContext().eventDispatcher.startElement("spCell_BFR_CBRA_r16", -1);

               int tval = MAC_ParametersCommon_spCell_BFR_CBRA_r16.decodeEnumValue (buffer);
               spCell_BFR_CBRA_r16 = MAC_ParametersCommon_spCell_BFR_CBRA_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("spCell_BFR_CBRA_r16", -1);
            }
            else {
               spCell_BFR_CBRA_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (mV2ExtPresent ||
      mV3ExtPresent ||
      mV4ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((lcp_Restriction != null), null);
      buffer.encodeBit ((dummy != null), null);
      buffer.encodeBit ((lch_ToSCellRestriction != null), null);

      // encode lcp_Restriction

      if (lcp_Restriction != null) {
         buffer.getContext().eventDispatcher.startElement("lcp_Restriction", -1);

         lcp_Restriction.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lcp_Restriction", -1);
      }

      // encode dummy

      if (dummy != null) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }

      // encode lch_ToSCellRestriction

      if (lch_ToSCellRestriction != null) {
         buffer.getContext().eventDispatcher.startElement("lch_ToSCellRestriction", -1);

         lch_ToSCellRestriction.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lch_ToSCellRestriction", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 3;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);
         buffer.encodeBit (mV3ExtPresent, null);
         buffer.encodeBit (mV4ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((recommendedBitRate != null), "optbit");
            buffer.encodeBit ((recommendedBitRateQuery != null), "optbit");
            if (recommendedBitRate != null) {
               recommendedBitRate.encode (buffer);
            }
            if (recommendedBitRateQuery != null) {
               recommendedBitRateQuery.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         if (mV3ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((recommendedBitRateMultiplier_r16 != null), "optbit");
            buffer.encodeBit ((preEmptiveBSR_r16 != null), "optbit");
            buffer.encodeBit ((autonomousTransmission_r16 != null), "optbit");
            buffer.encodeBit ((lch_PriorityBasedPrioritization_r16 != null), "optbit");
            buffer.encodeBit ((lch_ToConfiguredGrantMapping_r16 != null), "optbit");
            buffer.encodeBit ((lch_ToGrantPriorityRestriction_r16 != null), "optbit");
            buffer.encodeBit ((singlePHR_P_r16 != null), "optbit");
            buffer.encodeBit ((ul_LBT_FailureDetectionRecovery_r16 != null), "optbit");
            buffer.encodeBit ((tdd_MPE_P_MPR_Reporting_r16 != null), "optbit");
            buffer.encodeBit ((lcid_ExtensionIAB_r16 != null), "optbit");
            if (recommendedBitRateMultiplier_r16 != null) {
               recommendedBitRateMultiplier_r16.encode (buffer);
            }
            if (preEmptiveBSR_r16 != null) {
               preEmptiveBSR_r16.encode (buffer);
            }
            if (autonomousTransmission_r16 != null) {
               autonomousTransmission_r16.encode (buffer);
            }
            if (lch_PriorityBasedPrioritization_r16 != null) {
               lch_PriorityBasedPrioritization_r16.encode (buffer);
            }
            if (lch_ToConfiguredGrantMapping_r16 != null) {
               lch_ToConfiguredGrantMapping_r16.encode (buffer);
            }
            if (lch_ToGrantPriorityRestriction_r16 != null) {
               lch_ToGrantPriorityRestriction_r16.encode (buffer);
            }
            if (singlePHR_P_r16 != null) {
               singlePHR_P_r16.encode (buffer);
            }
            if (ul_LBT_FailureDetectionRecovery_r16 != null) {
               ul_LBT_FailureDetectionRecovery_r16.encode (buffer);
            }
            if (tdd_MPE_P_MPR_Reporting_r16 != null) {
               tdd_MPE_P_MPR_Reporting_r16.encode (buffer);
            }
            if (lcid_ExtensionIAB_r16 != null) {
               lcid_ExtensionIAB_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         if (mV4ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((spCell_BFR_CBRA_r16 != null), "optbit");
            if (spCell_BFR_CBRA_r16 != null) {
               spCell_BFR_CBRA_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (lcp_Restriction != null) lcp_Restriction.print (_sb, "lcp_Restriction", _level+1);
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      if (lch_ToSCellRestriction != null) lch_ToSCellRestriction.print (_sb, "lch_ToSCellRestriction", _level+1);
      if (recommendedBitRate != null) recommendedBitRate.print (_sb, "recommendedBitRate", _level+1);
      if (recommendedBitRateQuery != null) recommendedBitRateQuery.print (_sb, "recommendedBitRateQuery", _level+1);
      if (recommendedBitRateMultiplier_r16 != null) recommendedBitRateMultiplier_r16.print (_sb, "recommendedBitRateMultiplier_r16", _level+1);
      if (preEmptiveBSR_r16 != null) preEmptiveBSR_r16.print (_sb, "preEmptiveBSR_r16", _level+1);
      if (autonomousTransmission_r16 != null) autonomousTransmission_r16.print (_sb, "autonomousTransmission_r16", _level+1);
      if (lch_PriorityBasedPrioritization_r16 != null) lch_PriorityBasedPrioritization_r16.print (_sb, "lch_PriorityBasedPrioritization_r16", _level+1);
      if (lch_ToConfiguredGrantMapping_r16 != null) lch_ToConfiguredGrantMapping_r16.print (_sb, "lch_ToConfiguredGrantMapping_r16", _level+1);
      if (lch_ToGrantPriorityRestriction_r16 != null) lch_ToGrantPriorityRestriction_r16.print (_sb, "lch_ToGrantPriorityRestriction_r16", _level+1);
      if (singlePHR_P_r16 != null) singlePHR_P_r16.print (_sb, "singlePHR_P_r16", _level+1);
      if (ul_LBT_FailureDetectionRecovery_r16 != null) ul_LBT_FailureDetectionRecovery_r16.print (_sb, "ul_LBT_FailureDetectionRecovery_r16", _level+1);
      if (tdd_MPE_P_MPR_Reporting_r16 != null) tdd_MPE_P_MPR_Reporting_r16.print (_sb, "tdd_MPE_P_MPR_Reporting_r16", _level+1);
      if (lcid_ExtensionIAB_r16 != null) lcid_ExtensionIAB_r16.print (_sb, "lcid_ExtensionIAB_r16", _level+1);
      if (spCell_BFR_CBRA_r16 != null) spCell_BFR_CBRA_r16.print (_sb, "spCell_BFR_CBRA_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
