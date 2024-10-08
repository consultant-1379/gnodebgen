/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RACH-ConfigCommon";
   }

   public RACH_ConfigGeneric rach_ConfigGeneric;
   public Asn1Integer totalNumberOfRA_Preambles;  // optional
   public RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB ssb_perRACH_OccasionAndCB_PreamblesPerSSB;  // optional
   public RACH_ConfigCommon_groupBconfigured groupBconfigured;  // optional
   public RACH_ConfigCommon_ra_ContentionResolutionTimer ra_ContentionResolutionTimer = null;
   public RSRP_Range rsrp_ThresholdSSB;  // optional
   public RSRP_Range rsrp_ThresholdSSB_SUL;  // optional
   public RACH_ConfigCommon_prach_RootSequenceIndex prach_RootSequenceIndex;
   public SubcarrierSpacing msg1_SubcarrierSpacing = null;  // optional
   public RACH_ConfigCommon_restrictedSetConfig restrictedSetConfig = null;
   public RACH_ConfigCommon_msg3_transformPrecoder msg3_transformPrecoder = null;  // optional
   public boolean mV2ExtPresent;
   public RACH_ConfigCommon_ra_PrioritizationForAccessIdentity_r16 ra_PrioritizationForAccessIdentity_r16;  // optional
   public RACH_ConfigCommon_prach_RootSequenceIndex_r16 prach_RootSequenceIndex_r16;  // optional
   public Asn1OpenExt extElem1;

   public RACH_ConfigCommon () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_ConfigCommon (
      RACH_ConfigGeneric rach_ConfigGeneric_,
      Asn1Integer totalNumberOfRA_Preambles_,
      RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB ssb_perRACH_OccasionAndCB_PreamblesPerSSB_,
      RACH_ConfigCommon_groupBconfigured groupBconfigured_,
      RACH_ConfigCommon_ra_ContentionResolutionTimer ra_ContentionResolutionTimer_,
      RSRP_Range rsrp_ThresholdSSB_,
      RSRP_Range rsrp_ThresholdSSB_SUL_,
      RACH_ConfigCommon_prach_RootSequenceIndex prach_RootSequenceIndex_,
      SubcarrierSpacing msg1_SubcarrierSpacing_,
      RACH_ConfigCommon_restrictedSetConfig restrictedSetConfig_,
      RACH_ConfigCommon_msg3_transformPrecoder msg3_transformPrecoder_,
      RACH_ConfigCommon_ra_PrioritizationForAccessIdentity_r16 ra_PrioritizationForAccessIdentity_r16_,
      RACH_ConfigCommon_prach_RootSequenceIndex_r16 prach_RootSequenceIndex_r16_
   ) {
      super();
      rach_ConfigGeneric = rach_ConfigGeneric_;
      totalNumberOfRA_Preambles = totalNumberOfRA_Preambles_;
      ssb_perRACH_OccasionAndCB_PreamblesPerSSB = ssb_perRACH_OccasionAndCB_PreamblesPerSSB_;
      groupBconfigured = groupBconfigured_;
      ra_ContentionResolutionTimer = ra_ContentionResolutionTimer_;
      rsrp_ThresholdSSB = rsrp_ThresholdSSB_;
      rsrp_ThresholdSSB_SUL = rsrp_ThresholdSSB_SUL_;
      prach_RootSequenceIndex = prach_RootSequenceIndex_;
      msg1_SubcarrierSpacing = msg1_SubcarrierSpacing_;
      restrictedSetConfig = restrictedSetConfig_;
      msg3_transformPrecoder = msg3_transformPrecoder_;
      ra_PrioritizationForAccessIdentity_r16 = ra_PrioritizationForAccessIdentity_r16_;
      prach_RootSequenceIndex_r16 = prach_RootSequenceIndex_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RACH_ConfigCommon (
      RACH_ConfigGeneric rach_ConfigGeneric_,
      RACH_ConfigCommon_ra_ContentionResolutionTimer ra_ContentionResolutionTimer_,
      RACH_ConfigCommon_prach_RootSequenceIndex prach_RootSequenceIndex_,
      RACH_ConfigCommon_restrictedSetConfig restrictedSetConfig_
   ) {
      super();
      rach_ConfigGeneric = rach_ConfigGeneric_;
      ra_ContentionResolutionTimer = ra_ContentionResolutionTimer_;
      prach_RootSequenceIndex = prach_RootSequenceIndex_;
      restrictedSetConfig = restrictedSetConfig_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RACH_ConfigCommon (RACH_ConfigGeneric rach_ConfigGeneric_,
      long totalNumberOfRA_Preambles_,
      RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB ssb_perRACH_OccasionAndCB_PreamblesPerSSB_,
      RACH_ConfigCommon_groupBconfigured groupBconfigured_,
      RACH_ConfigCommon_ra_ContentionResolutionTimer ra_ContentionResolutionTimer_,
      long rsrp_ThresholdSSB_,
      long rsrp_ThresholdSSB_SUL_,
      RACH_ConfigCommon_prach_RootSequenceIndex prach_RootSequenceIndex_,
      SubcarrierSpacing msg1_SubcarrierSpacing_,
      RACH_ConfigCommon_restrictedSetConfig restrictedSetConfig_,
      RACH_ConfigCommon_msg3_transformPrecoder msg3_transformPrecoder_,
      RACH_ConfigCommon_ra_PrioritizationForAccessIdentity_r16 ra_PrioritizationForAccessIdentity_r16_,
      RACH_ConfigCommon_prach_RootSequenceIndex_r16 prach_RootSequenceIndex_r16_
   ) {
      super();
      rach_ConfigGeneric = rach_ConfigGeneric_;
      totalNumberOfRA_Preambles = new Asn1Integer (totalNumberOfRA_Preambles_);
      ssb_perRACH_OccasionAndCB_PreamblesPerSSB = ssb_perRACH_OccasionAndCB_PreamblesPerSSB_;
      groupBconfigured = groupBconfigured_;
      ra_ContentionResolutionTimer = ra_ContentionResolutionTimer_;
      rsrp_ThresholdSSB = new RSRP_Range (rsrp_ThresholdSSB_);
      rsrp_ThresholdSSB_SUL = new RSRP_Range (rsrp_ThresholdSSB_SUL_);
      prach_RootSequenceIndex = prach_RootSequenceIndex_;
      msg1_SubcarrierSpacing = msg1_SubcarrierSpacing_;
      restrictedSetConfig = restrictedSetConfig_;
      msg3_transformPrecoder = msg3_transformPrecoder_;
      ra_PrioritizationForAccessIdentity_r16 = ra_PrioritizationForAccessIdentity_r16_;
      prach_RootSequenceIndex_r16 = prach_RootSequenceIndex_r16_;
   }

   public void init () {
      rach_ConfigGeneric = null;
      totalNumberOfRA_Preambles = null;
      ssb_perRACH_OccasionAndCB_PreamblesPerSSB = null;
      groupBconfigured = null;
      ra_ContentionResolutionTimer = null;
      rsrp_ThresholdSSB = null;
      rsrp_ThresholdSSB_SUL = null;
      prach_RootSequenceIndex = null;
      msg1_SubcarrierSpacing = null;
      restrictedSetConfig = null;
      msg3_transformPrecoder = null;
      ra_PrioritizationForAccessIdentity_r16 = null;
      prach_RootSequenceIndex_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rach_ConfigGeneric;
         case 1: return totalNumberOfRA_Preambles;
         case 2: return ssb_perRACH_OccasionAndCB_PreamblesPerSSB;
         case 3: return groupBconfigured;
         case 4: return ra_ContentionResolutionTimer;
         case 5: return rsrp_ThresholdSSB;
         case 6: return rsrp_ThresholdSSB_SUL;
         case 7: return prach_RootSequenceIndex;
         case 8: return msg1_SubcarrierSpacing;
         case 9: return restrictedSetConfig;
         case 10: return msg3_transformPrecoder;
         case 11: return ra_PrioritizationForAccessIdentity_r16;
         case 12: return prach_RootSequenceIndex_r16;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rach-ConfigGeneric";
         case 1: return "totalNumberOfRA-Preambles";
         case 2: return "ssb-perRACH-OccasionAndCB-PreamblesPerSSB";
         case 3: return "groupBconfigured";
         case 4: return "ra-ContentionResolutionTimer";
         case 5: return "rsrp-ThresholdSSB";
         case 6: return "rsrp-ThresholdSSB-SUL";
         case 7: return "prach-RootSequenceIndex";
         case 8: return "msg1-SubcarrierSpacing";
         case 9: return "restrictedSetConfig";
         case 10: return "msg3-transformPrecoder";
         case 11: return "ra-PrioritizationForAccessIdentity-r16";
         case 12: return "prach-RootSequenceIndex-r16";
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

      boolean totalNumberOfRA_PreamblesPresent = buffer.decodeBit ("totalNumberOfRA_PreamblesPresent");
      boolean ssb_perRACH_OccasionAndCB_PreamblesPerSSBPresent = buffer.decodeBit ("ssb_perRACH_OccasionAndCB_PreamblesPerSSBPresent");
      boolean groupBconfiguredPresent = buffer.decodeBit ("groupBconfiguredPresent");
      boolean rsrp_ThresholdSSBPresent = buffer.decodeBit ("rsrp_ThresholdSSBPresent");
      boolean rsrp_ThresholdSSB_SULPresent = buffer.decodeBit ("rsrp_ThresholdSSB_SULPresent");
      boolean msg1_SubcarrierSpacingPresent = buffer.decodeBit ("msg1_SubcarrierSpacingPresent");
      boolean msg3_transformPrecoderPresent = buffer.decodeBit ("msg3_transformPrecoderPresent");

      // decode rach_ConfigGeneric

      buffer.getContext().eventDispatcher.startElement("rach_ConfigGeneric", -1);

      rach_ConfigGeneric = new RACH_ConfigGeneric();
      rach_ConfigGeneric.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rach_ConfigGeneric", -1);

      // decode totalNumberOfRA_Preambles

      if (totalNumberOfRA_PreamblesPresent) {
         buffer.getContext().eventDispatcher.startElement("totalNumberOfRA_Preambles", -1);

         totalNumberOfRA_Preambles = new Asn1Integer();
         totalNumberOfRA_Preambles.decode (buffer, 1, 63);

         buffer.invokeCharacters(totalNumberOfRA_Preambles.toString());
         buffer.getContext().eventDispatcher.endElement("totalNumberOfRA_Preambles", -1);
      }
      else {
         totalNumberOfRA_Preambles = null;
      }

      // decode ssb_perRACH_OccasionAndCB_PreamblesPerSSB

      if (ssb_perRACH_OccasionAndCB_PreamblesPerSSBPresent) {
         buffer.getContext().eventDispatcher.startElement("ssb_perRACH_OccasionAndCB_PreamblesPerSSB", -1);

         ssb_perRACH_OccasionAndCB_PreamblesPerSSB = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB();
         ssb_perRACH_OccasionAndCB_PreamblesPerSSB.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ssb_perRACH_OccasionAndCB_PreamblesPerSSB", -1);
      }
      else {
         ssb_perRACH_OccasionAndCB_PreamblesPerSSB = null;
      }

      // decode groupBconfigured

      if (groupBconfiguredPresent) {
         buffer.getContext().eventDispatcher.startElement("groupBconfigured", -1);

         groupBconfigured = new RACH_ConfigCommon_groupBconfigured();
         groupBconfigured.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("groupBconfigured", -1);
      }
      else {
         groupBconfigured = null;
      }

      // decode ra_ContentionResolutionTimer

      buffer.getContext().eventDispatcher.startElement("ra_ContentionResolutionTimer", -1);

      {
         int tval = RACH_ConfigCommon_ra_ContentionResolutionTimer.decodeEnumValue (buffer);
         ra_ContentionResolutionTimer = RACH_ConfigCommon_ra_ContentionResolutionTimer.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ra_ContentionResolutionTimer", -1);

      // decode rsrp_ThresholdSSB

      if (rsrp_ThresholdSSBPresent) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ThresholdSSB", -1);

         rsrp_ThresholdSSB = new RSRP_Range();
         rsrp_ThresholdSSB.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrp_ThresholdSSB", -1);
      }
      else {
         rsrp_ThresholdSSB = null;
      }

      // decode rsrp_ThresholdSSB_SUL

      if (rsrp_ThresholdSSB_SULPresent) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ThresholdSSB_SUL", -1);

         rsrp_ThresholdSSB_SUL = new RSRP_Range();
         rsrp_ThresholdSSB_SUL.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrp_ThresholdSSB_SUL", -1);
      }
      else {
         rsrp_ThresholdSSB_SUL = null;
      }

      // decode prach_RootSequenceIndex

      buffer.getContext().eventDispatcher.startElement("prach_RootSequenceIndex", -1);

      prach_RootSequenceIndex = new RACH_ConfigCommon_prach_RootSequenceIndex();
      prach_RootSequenceIndex.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("prach_RootSequenceIndex", -1);

      // decode msg1_SubcarrierSpacing

      if (msg1_SubcarrierSpacingPresent) {
         buffer.getContext().eventDispatcher.startElement("msg1_SubcarrierSpacing", -1);

         int tval = SubcarrierSpacing.decodeEnumValue (buffer);
         msg1_SubcarrierSpacing = SubcarrierSpacing.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("msg1_SubcarrierSpacing", -1);
      }
      else {
         msg1_SubcarrierSpacing = null;
      }

      // decode restrictedSetConfig

      buffer.getContext().eventDispatcher.startElement("restrictedSetConfig", -1);

      {
         int tval = RACH_ConfigCommon_restrictedSetConfig.decodeEnumValue (buffer);
         restrictedSetConfig = RACH_ConfigCommon_restrictedSetConfig.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("restrictedSetConfig", -1);

      // decode msg3_transformPrecoder

      if (msg3_transformPrecoderPresent) {
         buffer.getContext().eventDispatcher.startElement("msg3_transformPrecoder", -1);

         int tval = RACH_ConfigCommon_msg3_transformPrecoder.decodeEnumValue (buffer);
         msg3_transformPrecoder = RACH_ConfigCommon_msg3_transformPrecoder.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("msg3_transformPrecoder", -1);
      }
      else {
         msg3_transformPrecoder = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean ra_PrioritizationForAccessIdentity_r16Present = buffer.decodeBit ("ra_PrioritizationForAccessIdentity_r16Present");

            boolean prach_RootSequenceIndex_r16Present = buffer.decodeBit ("prach_RootSequenceIndex_r16Present");

            // decode ra_PrioritizationForAccessIdentity_r16

            if (ra_PrioritizationForAccessIdentity_r16Present) {
               buffer.getContext().eventDispatcher.startElement("ra_PrioritizationForAccessIdentity_r16", -1);

               ra_PrioritizationForAccessIdentity_r16 = new RACH_ConfigCommon_ra_PrioritizationForAccessIdentity_r16();
               ra_PrioritizationForAccessIdentity_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ra_PrioritizationForAccessIdentity_r16", -1);
            }
            else {
               ra_PrioritizationForAccessIdentity_r16 = null;
            }

            // decode prach_RootSequenceIndex_r16

            if (prach_RootSequenceIndex_r16Present) {
               buffer.getContext().eventDispatcher.startElement("prach_RootSequenceIndex_r16", -1);

               prach_RootSequenceIndex_r16 = new RACH_ConfigCommon_prach_RootSequenceIndex_r16();
               prach_RootSequenceIndex_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("prach_RootSequenceIndex_r16", -1);
            }
            else {
               prach_RootSequenceIndex_r16 = null;
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
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((totalNumberOfRA_Preambles != null), null);
      buffer.encodeBit ((ssb_perRACH_OccasionAndCB_PreamblesPerSSB != null), null);
      buffer.encodeBit ((groupBconfigured != null), null);
      buffer.encodeBit ((rsrp_ThresholdSSB != null), null);
      buffer.encodeBit ((rsrp_ThresholdSSB_SUL != null), null);
      buffer.encodeBit ((msg1_SubcarrierSpacing != null), null);
      buffer.encodeBit ((msg3_transformPrecoder != null), null);

      // encode rach_ConfigGeneric

      if (rach_ConfigGeneric != null) {
         buffer.getContext().eventDispatcher.startElement("rach_ConfigGeneric", -1);

         rach_ConfigGeneric.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rach_ConfigGeneric", -1);
      }
      else throw new Asn1MissingRequiredException ("rach_ConfigGeneric");

      // encode totalNumberOfRA_Preambles

      if (totalNumberOfRA_Preambles != null) {
         buffer.getContext().eventDispatcher.startElement("totalNumberOfRA_Preambles", -1);

         totalNumberOfRA_Preambles.encode (buffer, 1, 63);

         buffer.getContext().eventDispatcher.endElement("totalNumberOfRA_Preambles", -1);
      }

      // encode ssb_perRACH_OccasionAndCB_PreamblesPerSSB

      if (ssb_perRACH_OccasionAndCB_PreamblesPerSSB != null) {
         buffer.getContext().eventDispatcher.startElement("ssb_perRACH_OccasionAndCB_PreamblesPerSSB", -1);

         ssb_perRACH_OccasionAndCB_PreamblesPerSSB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ssb_perRACH_OccasionAndCB_PreamblesPerSSB", -1);
      }

      // encode groupBconfigured

      if (groupBconfigured != null) {
         buffer.getContext().eventDispatcher.startElement("groupBconfigured", -1);

         groupBconfigured.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("groupBconfigured", -1);
      }

      // encode ra_ContentionResolutionTimer

      if (ra_ContentionResolutionTimer != null) {
         buffer.getContext().eventDispatcher.startElement("ra_ContentionResolutionTimer", -1);

         ra_ContentionResolutionTimer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_ContentionResolutionTimer", -1);
      }
      else throw new Asn1MissingRequiredException ("ra_ContentionResolutionTimer");

      // encode rsrp_ThresholdSSB

      if (rsrp_ThresholdSSB != null) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ThresholdSSB", -1);

         rsrp_ThresholdSSB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rsrp_ThresholdSSB", -1);
      }

      // encode rsrp_ThresholdSSB_SUL

      if (rsrp_ThresholdSSB_SUL != null) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ThresholdSSB_SUL", -1);

         rsrp_ThresholdSSB_SUL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rsrp_ThresholdSSB_SUL", -1);
      }

      // encode prach_RootSequenceIndex

      if (prach_RootSequenceIndex != null) {
         buffer.getContext().eventDispatcher.startElement("prach_RootSequenceIndex", -1);

         prach_RootSequenceIndex.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("prach_RootSequenceIndex", -1);
      }
      else throw new Asn1MissingRequiredException ("prach_RootSequenceIndex");

      // encode msg1_SubcarrierSpacing

      if (msg1_SubcarrierSpacing != null) {
         buffer.getContext().eventDispatcher.startElement("msg1_SubcarrierSpacing", -1);

         msg1_SubcarrierSpacing.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("msg1_SubcarrierSpacing", -1);
      }

      // encode restrictedSetConfig

      if (restrictedSetConfig != null) {
         buffer.getContext().eventDispatcher.startElement("restrictedSetConfig", -1);

         restrictedSetConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("restrictedSetConfig", -1);
      }
      else throw new Asn1MissingRequiredException ("restrictedSetConfig");

      // encode msg3_transformPrecoder

      if (msg3_transformPrecoder != null) {
         buffer.getContext().eventDispatcher.startElement("msg3_transformPrecoder", -1);

         msg3_transformPrecoder.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("msg3_transformPrecoder", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((ra_PrioritizationForAccessIdentity_r16 != null), "optbit");
            buffer.encodeBit ((prach_RootSequenceIndex_r16 != null), "optbit");
            if (ra_PrioritizationForAccessIdentity_r16 != null) {
               ra_PrioritizationForAccessIdentity_r16.encode (buffer);
            }
            if (prach_RootSequenceIndex_r16 != null) {
               prach_RootSequenceIndex_r16.encode (buffer);
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
      if (rach_ConfigGeneric != null) rach_ConfigGeneric.print (_sb, "rach_ConfigGeneric", _level+1);
      if (totalNumberOfRA_Preambles != null) totalNumberOfRA_Preambles.print (_sb, "totalNumberOfRA_Preambles", _level+1);
      if (ssb_perRACH_OccasionAndCB_PreamblesPerSSB != null) ssb_perRACH_OccasionAndCB_PreamblesPerSSB.print (_sb, "ssb_perRACH_OccasionAndCB_PreamblesPerSSB", _level+1);
      if (groupBconfigured != null) groupBconfigured.print (_sb, "groupBconfigured", _level+1);
      if (ra_ContentionResolutionTimer != null) ra_ContentionResolutionTimer.print (_sb, "ra_ContentionResolutionTimer", _level+1);
      if (rsrp_ThresholdSSB != null) rsrp_ThresholdSSB.print (_sb, "rsrp_ThresholdSSB", _level+1);
      if (rsrp_ThresholdSSB_SUL != null) rsrp_ThresholdSSB_SUL.print (_sb, "rsrp_ThresholdSSB_SUL", _level+1);
      if (prach_RootSequenceIndex != null) prach_RootSequenceIndex.print (_sb, "prach_RootSequenceIndex", _level+1);
      if (msg1_SubcarrierSpacing != null) msg1_SubcarrierSpacing.print (_sb, "msg1_SubcarrierSpacing", _level+1);
      if (restrictedSetConfig != null) restrictedSetConfig.print (_sb, "restrictedSetConfig", _level+1);
      if (msg3_transformPrecoder != null) msg3_transformPrecoder.print (_sb, "msg3_transformPrecoder", _level+1);
      if (ra_PrioritizationForAccessIdentity_r16 != null) ra_PrioritizationForAccessIdentity_r16.print (_sb, "ra_PrioritizationForAccessIdentity_r16", _level+1);
      if (prach_RootSequenceIndex_r16 != null) prach_RootSequenceIndex_r16.print (_sb, "prach_RootSequenceIndex_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
