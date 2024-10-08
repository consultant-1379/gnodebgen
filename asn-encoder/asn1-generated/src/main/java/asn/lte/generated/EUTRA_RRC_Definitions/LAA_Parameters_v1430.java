/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LAA_Parameters_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LAA-Parameters-v1430";
   }

   public LAA_Parameters_v1430_crossCarrierSchedulingLAA_UL_r14 crossCarrierSchedulingLAA_UL_r14 = null;  // optional
   public LAA_Parameters_v1430_uplinkLAA_r14 uplinkLAA_r14 = null;  // optional
   public LAA_Parameters_v1430_twoStepSchedulingTimingInfo_r14 twoStepSchedulingTimingInfo_r14 = null;  // optional
   public LAA_Parameters_v1430_uss_BlindDecodingAdjustment_r14 uss_BlindDecodingAdjustment_r14 = null;  // optional
   public LAA_Parameters_v1430_uss_BlindDecodingReduction_r14 uss_BlindDecodingReduction_r14 = null;  // optional
   public LAA_Parameters_v1430_outOfSequenceGrantHandling_r14 outOfSequenceGrantHandling_r14 = null;  // optional

   public LAA_Parameters_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LAA_Parameters_v1430 (
      LAA_Parameters_v1430_crossCarrierSchedulingLAA_UL_r14 crossCarrierSchedulingLAA_UL_r14_,
      LAA_Parameters_v1430_uplinkLAA_r14 uplinkLAA_r14_,
      LAA_Parameters_v1430_twoStepSchedulingTimingInfo_r14 twoStepSchedulingTimingInfo_r14_,
      LAA_Parameters_v1430_uss_BlindDecodingAdjustment_r14 uss_BlindDecodingAdjustment_r14_,
      LAA_Parameters_v1430_uss_BlindDecodingReduction_r14 uss_BlindDecodingReduction_r14_,
      LAA_Parameters_v1430_outOfSequenceGrantHandling_r14 outOfSequenceGrantHandling_r14_
   ) {
      super();
      crossCarrierSchedulingLAA_UL_r14 = crossCarrierSchedulingLAA_UL_r14_;
      uplinkLAA_r14 = uplinkLAA_r14_;
      twoStepSchedulingTimingInfo_r14 = twoStepSchedulingTimingInfo_r14_;
      uss_BlindDecodingAdjustment_r14 = uss_BlindDecodingAdjustment_r14_;
      uss_BlindDecodingReduction_r14 = uss_BlindDecodingReduction_r14_;
      outOfSequenceGrantHandling_r14 = outOfSequenceGrantHandling_r14_;
   }

   public void init () {
      crossCarrierSchedulingLAA_UL_r14 = null;
      uplinkLAA_r14 = null;
      twoStepSchedulingTimingInfo_r14 = null;
      uss_BlindDecodingAdjustment_r14 = null;
      uss_BlindDecodingReduction_r14 = null;
      outOfSequenceGrantHandling_r14 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return crossCarrierSchedulingLAA_UL_r14;
         case 1: return uplinkLAA_r14;
         case 2: return twoStepSchedulingTimingInfo_r14;
         case 3: return uss_BlindDecodingAdjustment_r14;
         case 4: return uss_BlindDecodingReduction_r14;
         case 5: return outOfSequenceGrantHandling_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "crossCarrierSchedulingLAA-UL-r14";
         case 1: return "uplinkLAA-r14";
         case 2: return "twoStepSchedulingTimingInfo-r14";
         case 3: return "uss-BlindDecodingAdjustment-r14";
         case 4: return "uss-BlindDecodingReduction-r14";
         case 5: return "outOfSequenceGrantHandling-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean crossCarrierSchedulingLAA_UL_r14Present = buffer.decodeBit ("crossCarrierSchedulingLAA_UL_r14Present");
      boolean uplinkLAA_r14Present = buffer.decodeBit ("uplinkLAA_r14Present");
      boolean twoStepSchedulingTimingInfo_r14Present = buffer.decodeBit ("twoStepSchedulingTimingInfo_r14Present");
      boolean uss_BlindDecodingAdjustment_r14Present = buffer.decodeBit ("uss_BlindDecodingAdjustment_r14Present");
      boolean uss_BlindDecodingReduction_r14Present = buffer.decodeBit ("uss_BlindDecodingReduction_r14Present");
      boolean outOfSequenceGrantHandling_r14Present = buffer.decodeBit ("outOfSequenceGrantHandling_r14Present");

      // decode crossCarrierSchedulingLAA_UL_r14

      if (crossCarrierSchedulingLAA_UL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierSchedulingLAA_UL_r14", -1);

         int tval = LAA_Parameters_v1430_crossCarrierSchedulingLAA_UL_r14.decodeEnumValue (buffer);
         crossCarrierSchedulingLAA_UL_r14 = LAA_Parameters_v1430_crossCarrierSchedulingLAA_UL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierSchedulingLAA_UL_r14", -1);
      }
      else {
         crossCarrierSchedulingLAA_UL_r14 = null;
      }

      // decode uplinkLAA_r14

      if (uplinkLAA_r14Present) {
         buffer.getContext().eventDispatcher.startElement("uplinkLAA_r14", -1);

         int tval = LAA_Parameters_v1430_uplinkLAA_r14.decodeEnumValue (buffer);
         uplinkLAA_r14 = LAA_Parameters_v1430_uplinkLAA_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("uplinkLAA_r14", -1);
      }
      else {
         uplinkLAA_r14 = null;
      }

      // decode twoStepSchedulingTimingInfo_r14

      if (twoStepSchedulingTimingInfo_r14Present) {
         buffer.getContext().eventDispatcher.startElement("twoStepSchedulingTimingInfo_r14", -1);

         int tval = LAA_Parameters_v1430_twoStepSchedulingTimingInfo_r14.decodeEnumValue (buffer);
         twoStepSchedulingTimingInfo_r14 = LAA_Parameters_v1430_twoStepSchedulingTimingInfo_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("twoStepSchedulingTimingInfo_r14", -1);
      }
      else {
         twoStepSchedulingTimingInfo_r14 = null;
      }

      // decode uss_BlindDecodingAdjustment_r14

      if (uss_BlindDecodingAdjustment_r14Present) {
         buffer.getContext().eventDispatcher.startElement("uss_BlindDecodingAdjustment_r14", -1);

         int tval = LAA_Parameters_v1430_uss_BlindDecodingAdjustment_r14.decodeEnumValue (buffer);
         uss_BlindDecodingAdjustment_r14 = LAA_Parameters_v1430_uss_BlindDecodingAdjustment_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("uss_BlindDecodingAdjustment_r14", -1);
      }
      else {
         uss_BlindDecodingAdjustment_r14 = null;
      }

      // decode uss_BlindDecodingReduction_r14

      if (uss_BlindDecodingReduction_r14Present) {
         buffer.getContext().eventDispatcher.startElement("uss_BlindDecodingReduction_r14", -1);

         int tval = LAA_Parameters_v1430_uss_BlindDecodingReduction_r14.decodeEnumValue (buffer);
         uss_BlindDecodingReduction_r14 = LAA_Parameters_v1430_uss_BlindDecodingReduction_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("uss_BlindDecodingReduction_r14", -1);
      }
      else {
         uss_BlindDecodingReduction_r14 = null;
      }

      // decode outOfSequenceGrantHandling_r14

      if (outOfSequenceGrantHandling_r14Present) {
         buffer.getContext().eventDispatcher.startElement("outOfSequenceGrantHandling_r14", -1);

         int tval = LAA_Parameters_v1430_outOfSequenceGrantHandling_r14.decodeEnumValue (buffer);
         outOfSequenceGrantHandling_r14 = LAA_Parameters_v1430_outOfSequenceGrantHandling_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("outOfSequenceGrantHandling_r14", -1);
      }
      else {
         outOfSequenceGrantHandling_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (crossCarrierSchedulingLAA_UL_r14 != null) crossCarrierSchedulingLAA_UL_r14.print (_sb, "crossCarrierSchedulingLAA_UL_r14", _level+1);
      if (uplinkLAA_r14 != null) uplinkLAA_r14.print (_sb, "uplinkLAA_r14", _level+1);
      if (twoStepSchedulingTimingInfo_r14 != null) twoStepSchedulingTimingInfo_r14.print (_sb, "twoStepSchedulingTimingInfo_r14", _level+1);
      if (uss_BlindDecodingAdjustment_r14 != null) uss_BlindDecodingAdjustment_r14.print (_sb, "uss_BlindDecodingAdjustment_r14", _level+1);
      if (uss_BlindDecodingReduction_r14 != null) uss_BlindDecodingReduction_r14.print (_sb, "uss_BlindDecodingReduction_r14", _level+1);
      if (outOfSequenceGrantHandling_r14 != null) outOfSequenceGrantHandling_r14.print (_sb, "outOfSequenceGrantHandling_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
