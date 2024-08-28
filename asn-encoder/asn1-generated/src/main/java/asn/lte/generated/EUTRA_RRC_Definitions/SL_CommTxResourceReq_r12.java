/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CommTxResourceReq_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-CommTxResourceReq-r12";
   }

   public ARFCN_ValueEUTRA_r9 carrierFreq_r12;  // optional
   public SL_DestinationInfoList_r12 destinationInfoList_r12;

   public SL_CommTxResourceReq_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CommTxResourceReq_r12 (
      ARFCN_ValueEUTRA_r9 carrierFreq_r12_,
      SL_DestinationInfoList_r12 destinationInfoList_r12_
   ) {
      super();
      carrierFreq_r12 = carrierFreq_r12_;
      destinationInfoList_r12 = destinationInfoList_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_CommTxResourceReq_r12 (
      SL_DestinationInfoList_r12 destinationInfoList_r12_
   ) {
      super();
      destinationInfoList_r12 = destinationInfoList_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_CommTxResourceReq_r12 (long carrierFreq_r12_,
      SL_DestinationInfoList_r12 destinationInfoList_r12_
   ) {
      super();
      carrierFreq_r12 = new ARFCN_ValueEUTRA_r9 (carrierFreq_r12_);
      destinationInfoList_r12 = destinationInfoList_r12_;
   }

   public void init () {
      carrierFreq_r12 = null;
      destinationInfoList_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r12;
         case 1: return destinationInfoList_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r12";
         case 1: return "destinationInfoList-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean carrierFreq_r12Present = buffer.decodeBit ("carrierFreq_r12Present");

      // decode carrierFreq_r12

      if (carrierFreq_r12Present) {
         buffer.getContext().eventDispatcher.startElement("carrierFreq_r12", -1);

         carrierFreq_r12 = new ARFCN_ValueEUTRA_r9();
         carrierFreq_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("carrierFreq_r12", -1);
      }
      else {
         carrierFreq_r12 = null;
      }

      // decode destinationInfoList_r12

      buffer.getContext().eventDispatcher.startElement("destinationInfoList_r12", -1);

      destinationInfoList_r12 = new SL_DestinationInfoList_r12();
      destinationInfoList_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("destinationInfoList_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq_r12 != null) carrierFreq_r12.print (_sb, "carrierFreq_r12", _level+1);
      if (destinationInfoList_r12 != null) destinationInfoList_r12.print (_sb, "destinationInfoList_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
