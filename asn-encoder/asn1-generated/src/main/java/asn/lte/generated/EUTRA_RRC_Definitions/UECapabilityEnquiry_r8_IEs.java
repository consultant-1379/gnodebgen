/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UECapabilityEnquiry_r8_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityEnquiry-r8-IEs";
   }

   public UE_CapabilityRequest ue_CapabilityRequest;
   public UECapabilityEnquiry_v8a0_IEs nonCriticalExtension;  // optional

   public UECapabilityEnquiry_r8_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityEnquiry_r8_IEs (
      UE_CapabilityRequest ue_CapabilityRequest_,
      UECapabilityEnquiry_v8a0_IEs nonCriticalExtension_
   ) {
      super();
      ue_CapabilityRequest = ue_CapabilityRequest_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UECapabilityEnquiry_r8_IEs (
      UE_CapabilityRequest ue_CapabilityRequest_
   ) {
      super();
      ue_CapabilityRequest = ue_CapabilityRequest_;
   }

   public void init () {
      ue_CapabilityRequest = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_CapabilityRequest;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-CapabilityRequest";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_CapabilityRequest

      buffer.getContext().eventDispatcher.startElement("ue_CapabilityRequest", -1);

      ue_CapabilityRequest = new UE_CapabilityRequest();
      ue_CapabilityRequest.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ue_CapabilityRequest", -1);

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityEnquiry_v8a0_IEs();
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
      if (ue_CapabilityRequest != null) ue_CapabilityRequest.print (_sb, "ue_CapabilityRequest", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
