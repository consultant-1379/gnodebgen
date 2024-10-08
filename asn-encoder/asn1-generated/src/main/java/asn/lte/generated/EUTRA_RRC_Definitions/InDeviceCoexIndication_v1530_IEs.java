/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InDeviceCoexIndication_v1530_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InDeviceCoexIndication-v1530-IEs";
   }

   public MRDC_AssistanceInfo_r15 mrdc_AssistanceInfo_r15;  // optional
   public InDeviceCoexIndication_v1530_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public InDeviceCoexIndication_v1530_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InDeviceCoexIndication_v1530_IEs (
      MRDC_AssistanceInfo_r15 mrdc_AssistanceInfo_r15_,
      InDeviceCoexIndication_v1530_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      mrdc_AssistanceInfo_r15 = mrdc_AssistanceInfo_r15_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      mrdc_AssistanceInfo_r15 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mrdc_AssistanceInfo_r15;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mrdc-AssistanceInfo-r15";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mrdc_AssistanceInfo_r15Present = buffer.decodeBit ("mrdc_AssistanceInfo_r15Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode mrdc_AssistanceInfo_r15

      if (mrdc_AssistanceInfo_r15Present) {
         buffer.getContext().eventDispatcher.startElement("mrdc_AssistanceInfo_r15", -1);

         mrdc_AssistanceInfo_r15 = new MRDC_AssistanceInfo_r15();
         mrdc_AssistanceInfo_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mrdc_AssistanceInfo_r15", -1);
      }
      else {
         mrdc_AssistanceInfo_r15 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new InDeviceCoexIndication_v1530_IEs_nonCriticalExtension();
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
      if (mrdc_AssistanceInfo_r15 != null) mrdc_AssistanceInfo_r15.print (_sb, "mrdc_AssistanceInfo_r15", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
