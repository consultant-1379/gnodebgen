/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UECapabilityEnquiry_v1510_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityEnquiry-v1510-IEs";
   }

   public Asn1OctetString requestedFreqBandsNR_MRDC_r15;  // optional
   public UECapabilityEnquiry_v1530_IEs nonCriticalExtension;  // optional

   public UECapabilityEnquiry_v1510_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityEnquiry_v1510_IEs (
      Asn1OctetString requestedFreqBandsNR_MRDC_r15_,
      UECapabilityEnquiry_v1530_IEs nonCriticalExtension_
   ) {
      super();
      requestedFreqBandsNR_MRDC_r15 = requestedFreqBandsNR_MRDC_r15_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UECapabilityEnquiry_v1510_IEs (byte[] requestedFreqBandsNR_MRDC_r15_,
      UECapabilityEnquiry_v1530_IEs nonCriticalExtension_
   ) {
      super();
      requestedFreqBandsNR_MRDC_r15 = new Asn1OctetString (requestedFreqBandsNR_MRDC_r15_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      requestedFreqBandsNR_MRDC_r15 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return requestedFreqBandsNR_MRDC_r15;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "requestedFreqBandsNR-MRDC-r15";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean requestedFreqBandsNR_MRDC_r15Present = buffer.decodeBit ("requestedFreqBandsNR_MRDC_r15Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode requestedFreqBandsNR_MRDC_r15

      if (requestedFreqBandsNR_MRDC_r15Present) {
         buffer.getContext().eventDispatcher.startElement("requestedFreqBandsNR_MRDC_r15", -1);

         requestedFreqBandsNR_MRDC_r15 = new Asn1OctetString();
         requestedFreqBandsNR_MRDC_r15.decode (buffer);

         buffer.invokeCharacters(requestedFreqBandsNR_MRDC_r15.toString());
         buffer.getContext().eventDispatcher.endElement("requestedFreqBandsNR_MRDC_r15", -1);
      }
      else {
         requestedFreqBandsNR_MRDC_r15 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityEnquiry_v1530_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (requestedFreqBandsNR_MRDC_r15 != null) requestedFreqBandsNR_MRDC_r15.print (_sb, "requestedFreqBandsNR_MRDC_r15", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
