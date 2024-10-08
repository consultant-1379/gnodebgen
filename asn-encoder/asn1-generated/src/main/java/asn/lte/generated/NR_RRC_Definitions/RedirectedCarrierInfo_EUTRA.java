/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RedirectedCarrierInfo_EUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RedirectedCarrierInfo-EUTRA";
   }

   public ARFCN_ValueEUTRA eutraFrequency;
   public RedirectedCarrierInfo_EUTRA_cnType cnType = null;  // optional

   public RedirectedCarrierInfo_EUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RedirectedCarrierInfo_EUTRA (
      ARFCN_ValueEUTRA eutraFrequency_,
      RedirectedCarrierInfo_EUTRA_cnType cnType_
   ) {
      super();
      eutraFrequency = eutraFrequency_;
      cnType = cnType_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RedirectedCarrierInfo_EUTRA (
      ARFCN_ValueEUTRA eutraFrequency_
   ) {
      super();
      eutraFrequency = eutraFrequency_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RedirectedCarrierInfo_EUTRA (long eutraFrequency_,
      RedirectedCarrierInfo_EUTRA_cnType cnType_
   ) {
      super();
      eutraFrequency = new ARFCN_ValueEUTRA (eutraFrequency_);
      cnType = cnType_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RedirectedCarrierInfo_EUTRA (
      long eutraFrequency_
   ) {
      super();
      eutraFrequency = new ARFCN_ValueEUTRA (eutraFrequency_);
   }

   public void init () {
      eutraFrequency = null;
      cnType = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eutraFrequency;
         case 1: return cnType;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eutraFrequency";
         case 1: return "cnType";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cnTypePresent = buffer.decodeBit ("cnTypePresent");

      // decode eutraFrequency

      buffer.getContext().eventDispatcher.startElement("eutraFrequency", -1);

      eutraFrequency = new ARFCN_ValueEUTRA();
      eutraFrequency.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eutraFrequency", -1);

      // decode cnType

      if (cnTypePresent) {
         buffer.getContext().eventDispatcher.startElement("cnType", -1);

         int tval = RedirectedCarrierInfo_EUTRA_cnType.decodeEnumValue (buffer);
         cnType = RedirectedCarrierInfo_EUTRA_cnType.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cnType", -1);
      }
      else {
         cnType = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eutraFrequency != null) eutraFrequency.print (_sb, "eutraFrequency", _level+1);
      if (cnType != null) cnType.print (_sb, "cnType", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
