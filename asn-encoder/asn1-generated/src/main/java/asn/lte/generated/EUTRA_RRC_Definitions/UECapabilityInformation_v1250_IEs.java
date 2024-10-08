/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UECapabilityInformation_v1250_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityInformation-v1250-IEs";
   }

   public UE_RadioPagingInfo_r12 ue_RadioPagingInfo_r12;  // optional
   public UECapabilityInformation_v1250_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UECapabilityInformation_v1250_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityInformation_v1250_IEs (
      UE_RadioPagingInfo_r12 ue_RadioPagingInfo_r12_,
      UECapabilityInformation_v1250_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ue_RadioPagingInfo_r12 = ue_RadioPagingInfo_r12_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_RadioPagingInfo_r12 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_RadioPagingInfo_r12;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-RadioPagingInfo-r12";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_RadioPagingInfo_r12Present = buffer.decodeBit ("ue_RadioPagingInfo_r12Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_RadioPagingInfo_r12

      if (ue_RadioPagingInfo_r12Present) {
         buffer.getContext().eventDispatcher.startElement("ue_RadioPagingInfo_r12", -1);

         ue_RadioPagingInfo_r12 = new UE_RadioPagingInfo_r12();
         ue_RadioPagingInfo_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ue_RadioPagingInfo_r12", -1);
      }
      else {
         ue_RadioPagingInfo_r12 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityInformation_v1250_IEs_nonCriticalExtension();
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
      if (ue_RadioPagingInfo_r12 != null) ue_RadioPagingInfo_r12.print (_sb, "ue_RadioPagingInfo_r12", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
