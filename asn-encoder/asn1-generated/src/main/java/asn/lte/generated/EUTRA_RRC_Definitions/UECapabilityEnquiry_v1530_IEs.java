/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UECapabilityEnquiry_v1530_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityEnquiry-v1530-IEs";
   }

   public UECapabilityEnquiry_v1530_IEs_requestSTTI_SPT_Capability_r15 requestSTTI_SPT_Capability_r15 = null;  // optional
   public UECapabilityEnquiry_v1530_IEs_eutra_nr_only_r15 eutra_nr_only_r15 = null;  // optional
   public UECapabilityEnquiry_v1530_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UECapabilityEnquiry_v1530_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityEnquiry_v1530_IEs (
      UECapabilityEnquiry_v1530_IEs_requestSTTI_SPT_Capability_r15 requestSTTI_SPT_Capability_r15_,
      UECapabilityEnquiry_v1530_IEs_eutra_nr_only_r15 eutra_nr_only_r15_,
      UECapabilityEnquiry_v1530_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      requestSTTI_SPT_Capability_r15 = requestSTTI_SPT_Capability_r15_;
      eutra_nr_only_r15 = eutra_nr_only_r15_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      requestSTTI_SPT_Capability_r15 = null;
      eutra_nr_only_r15 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return requestSTTI_SPT_Capability_r15;
         case 1: return eutra_nr_only_r15;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "requestSTTI-SPT-Capability-r15";
         case 1: return "eutra-nr-only-r15";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean requestSTTI_SPT_Capability_r15Present = buffer.decodeBit ("requestSTTI_SPT_Capability_r15Present");
      boolean eutra_nr_only_r15Present = buffer.decodeBit ("eutra_nr_only_r15Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode requestSTTI_SPT_Capability_r15

      if (requestSTTI_SPT_Capability_r15Present) {
         buffer.getContext().eventDispatcher.startElement("requestSTTI_SPT_Capability_r15", -1);

         int tval = UECapabilityEnquiry_v1530_IEs_requestSTTI_SPT_Capability_r15.decodeEnumValue (buffer);
         requestSTTI_SPT_Capability_r15 = UECapabilityEnquiry_v1530_IEs_requestSTTI_SPT_Capability_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("requestSTTI_SPT_Capability_r15", -1);
      }
      else {
         requestSTTI_SPT_Capability_r15 = null;
      }

      // decode eutra_nr_only_r15

      if (eutra_nr_only_r15Present) {
         buffer.getContext().eventDispatcher.startElement("eutra_nr_only_r15", -1);

         int tval = UECapabilityEnquiry_v1530_IEs_eutra_nr_only_r15.decodeEnumValue (buffer);
         eutra_nr_only_r15 = UECapabilityEnquiry_v1530_IEs_eutra_nr_only_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("eutra_nr_only_r15", -1);
      }
      else {
         eutra_nr_only_r15 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityEnquiry_v1530_IEs_nonCriticalExtension();
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
      if (requestSTTI_SPT_Capability_r15 != null) requestSTTI_SPT_Capability_r15.print (_sb, "requestSTTI_SPT_Capability_r15", _level+1);
      if (eutra_nr_only_r15 != null) eutra_nr_only_r15.print (_sb, "eutra_nr_only_r15", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
