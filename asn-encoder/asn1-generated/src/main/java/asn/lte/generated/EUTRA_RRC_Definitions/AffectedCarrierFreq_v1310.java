/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AffectedCarrierFreq_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AffectedCarrierFreq-v1310";
   }

   public MeasObjectId_v1310 carrierFreq_v1310;  // optional

   public AffectedCarrierFreq_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public AffectedCarrierFreq_v1310 (
      MeasObjectId_v1310 carrierFreq_v1310_
   ) {
      super();
      carrierFreq_v1310 = carrierFreq_v1310_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public AffectedCarrierFreq_v1310 (long carrierFreq_v1310_
   ) {
      super();
      carrierFreq_v1310 = new MeasObjectId_v1310 (carrierFreq_v1310_);
   }

   public void init () {
      carrierFreq_v1310 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_v1310;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-v1310";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean carrierFreq_v1310Present = buffer.decodeBit ("carrierFreq_v1310Present");

      // decode carrierFreq_v1310

      if (carrierFreq_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("carrierFreq_v1310", -1);

         carrierFreq_v1310 = new MeasObjectId_v1310();
         carrierFreq_v1310.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("carrierFreq_v1310", -1);
      }
      else {
         carrierFreq_v1310 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq_v1310 != null) carrierFreq_v1310.print (_sb, "carrierFreq_v1310", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
