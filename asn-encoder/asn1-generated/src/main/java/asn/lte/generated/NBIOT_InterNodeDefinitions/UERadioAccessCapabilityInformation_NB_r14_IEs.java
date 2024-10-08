/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NBIOT_RRC_Definitions.UECapabilityInformation_NB;

public class UERadioAccessCapabilityInformation_NB_r14_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UERadioAccessCapabilityInformation-NB-r14-IEs";
   }

   public UECapabilityInformation_NB ue_RadioAccessCapabilityInfo_r14;  // optional
   public UERadioAccessCapabilityInformation_NB_r14_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UERadioAccessCapabilityInformation_NB_r14_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UERadioAccessCapabilityInformation_NB_r14_IEs (
      UECapabilityInformation_NB ue_RadioAccessCapabilityInfo_r14_,
      UERadioAccessCapabilityInformation_NB_r14_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ue_RadioAccessCapabilityInfo_r14 = ue_RadioAccessCapabilityInfo_r14_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_RadioAccessCapabilityInfo_r14 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_RadioAccessCapabilityInfo_r14;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-RadioAccessCapabilityInfo-r14";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_RadioAccessCapabilityInfo_r14Present = buffer.decodeBit ("ue_RadioAccessCapabilityInfo_r14Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_RadioAccessCapabilityInfo_r14

      if (ue_RadioAccessCapabilityInfo_r14Present) {
         buffer.getContext().eventDispatcher.startElement("ue_RadioAccessCapabilityInfo_r14", -1);

         Asn1OctetString ue_RadioAccessCapabilityInfo_r14_outer = new Asn1OctetString();
         ue_RadioAccessCapabilityInfo_r14_outer.decode (buffer);
         if (ue_RadioAccessCapabilityInfo_r14_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( ue_RadioAccessCapabilityInfo_r14_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         ue_RadioAccessCapabilityInfo_r14 = new UECapabilityInformation_NB();
         ue_RadioAccessCapabilityInfo_r14.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("ue_RadioAccessCapabilityInfo_r14", -1);
      }
      else {
         ue_RadioAccessCapabilityInfo_r14 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UERadioAccessCapabilityInformation_NB_r14_IEs_nonCriticalExtension();
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
      if (ue_RadioAccessCapabilityInfo_r14 != null) ue_RadioAccessCapabilityInfo_r14.print (_sb, "ue_RadioAccessCapabilityInfo_r14", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
