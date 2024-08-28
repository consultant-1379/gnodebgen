/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InterFreqCarrierFreqInfo_v10j0 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InterFreqCarrierFreqInfo-v10j0";
   }

   public NS_PmaxList_r10 freqBandInfo_r10;  // optional
   public MultiBandInfoList_v10j0 multiBandInfoList_v10j0;  // optional

   public InterFreqCarrierFreqInfo_v10j0 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InterFreqCarrierFreqInfo_v10j0 (
      NS_PmaxList_r10 freqBandInfo_r10_,
      MultiBandInfoList_v10j0 multiBandInfoList_v10j0_
   ) {
      super();
      freqBandInfo_r10 = freqBandInfo_r10_;
      multiBandInfoList_v10j0 = multiBandInfoList_v10j0_;
   }

   public void init () {
      freqBandInfo_r10 = null;
      multiBandInfoList_v10j0 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqBandInfo_r10;
         case 1: return multiBandInfoList_v10j0;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqBandInfo-r10";
         case 1: return "multiBandInfoList-v10j0";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean freqBandInfo_r10Present = buffer.decodeBit ("freqBandInfo_r10Present");
      boolean multiBandInfoList_v10j0Present = buffer.decodeBit ("multiBandInfoList_v10j0Present");

      // decode freqBandInfo_r10

      if (freqBandInfo_r10Present) {
         buffer.getContext().eventDispatcher.startElement("freqBandInfo_r10", -1);

         freqBandInfo_r10 = new NS_PmaxList_r10();
         freqBandInfo_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("freqBandInfo_r10", -1);
      }
      else {
         freqBandInfo_r10 = null;
      }

      // decode multiBandInfoList_v10j0

      if (multiBandInfoList_v10j0Present) {
         buffer.getContext().eventDispatcher.startElement("multiBandInfoList_v10j0", -1);

         multiBandInfoList_v10j0 = new MultiBandInfoList_v10j0();
         multiBandInfoList_v10j0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("multiBandInfoList_v10j0", -1);
      }
      else {
         multiBandInfoList_v10j0 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (freqBandInfo_r10 != null) freqBandInfo_r10.print (_sb, "freqBandInfo_r10", _level+1);
      if (multiBandInfoList_v10j0 != null) multiBandInfoList_v10j0.print (_sb, "multiBandInfoList_v10j0", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
