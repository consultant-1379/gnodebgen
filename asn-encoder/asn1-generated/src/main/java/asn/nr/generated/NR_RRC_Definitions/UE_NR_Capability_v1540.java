/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_NR_Capability_v1540 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-NR-Capability-v1540";
   }

   public SDAP_Parameters sdap_Parameters;  // optional
   public UE_NR_Capability_v1540_overheatingInd overheatingInd = null;  // optional
   public IMS_Parameters ims_Parameters;  // optional
   public UE_NR_CapabilityAddFRX_Mode_v1540 fr1_Add_UE_NR_Capabilities_v1540;  // optional
   public UE_NR_CapabilityAddFRX_Mode_v1540 fr2_Add_UE_NR_Capabilities_v1540;  // optional
   public UE_NR_CapabilityAddFRX_Mode fr1_fr2_Add_UE_NR_Capabilities;  // optional
   public UE_NR_Capability_v1550 nonCriticalExtension;  // optional

   public UE_NR_Capability_v1540 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_NR_Capability_v1540 (
      SDAP_Parameters sdap_Parameters_,
      UE_NR_Capability_v1540_overheatingInd overheatingInd_,
      IMS_Parameters ims_Parameters_,
      UE_NR_CapabilityAddFRX_Mode_v1540 fr1_Add_UE_NR_Capabilities_v1540_,
      UE_NR_CapabilityAddFRX_Mode_v1540 fr2_Add_UE_NR_Capabilities_v1540_,
      UE_NR_CapabilityAddFRX_Mode fr1_fr2_Add_UE_NR_Capabilities_,
      UE_NR_Capability_v1550 nonCriticalExtension_
   ) {
      super();
      sdap_Parameters = sdap_Parameters_;
      overheatingInd = overheatingInd_;
      ims_Parameters = ims_Parameters_;
      fr1_Add_UE_NR_Capabilities_v1540 = fr1_Add_UE_NR_Capabilities_v1540_;
      fr2_Add_UE_NR_Capabilities_v1540 = fr2_Add_UE_NR_Capabilities_v1540_;
      fr1_fr2_Add_UE_NR_Capabilities = fr1_fr2_Add_UE_NR_Capabilities_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      sdap_Parameters = null;
      overheatingInd = null;
      ims_Parameters = null;
      fr1_Add_UE_NR_Capabilities_v1540 = null;
      fr2_Add_UE_NR_Capabilities_v1540 = null;
      fr1_fr2_Add_UE_NR_Capabilities = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sdap_Parameters;
         case 1: return overheatingInd;
         case 2: return ims_Parameters;
         case 3: return fr1_Add_UE_NR_Capabilities_v1540;
         case 4: return fr2_Add_UE_NR_Capabilities_v1540;
         case 5: return fr1_fr2_Add_UE_NR_Capabilities;
         case 6: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sdap-Parameters";
         case 1: return "overheatingInd";
         case 2: return "ims-Parameters";
         case 3: return "fr1-Add-UE-NR-Capabilities-v1540";
         case 4: return "fr2-Add-UE-NR-Capabilities-v1540";
         case 5: return "fr1-fr2-Add-UE-NR-Capabilities";
         case 6: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sdap_ParametersPresent = buffer.decodeBit ("sdap_ParametersPresent");
      boolean overheatingIndPresent = buffer.decodeBit ("overheatingIndPresent");
      boolean ims_ParametersPresent = buffer.decodeBit ("ims_ParametersPresent");
      boolean fr1_Add_UE_NR_Capabilities_v1540Present = buffer.decodeBit ("fr1_Add_UE_NR_Capabilities_v1540Present");
      boolean fr2_Add_UE_NR_Capabilities_v1540Present = buffer.decodeBit ("fr2_Add_UE_NR_Capabilities_v1540Present");
      boolean fr1_fr2_Add_UE_NR_CapabilitiesPresent = buffer.decodeBit ("fr1_fr2_Add_UE_NR_CapabilitiesPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode sdap_Parameters

      if (sdap_ParametersPresent) {
         buffer.getContext().eventDispatcher.startElement("sdap_Parameters", -1);

         sdap_Parameters = new SDAP_Parameters();
         sdap_Parameters.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sdap_Parameters", -1);
      }
      else {
         sdap_Parameters = null;
      }

      // decode overheatingInd

      if (overheatingIndPresent) {
         buffer.getContext().eventDispatcher.startElement("overheatingInd", -1);

         int tval = UE_NR_Capability_v1540_overheatingInd.decodeEnumValue (buffer);
         overheatingInd = UE_NR_Capability_v1540_overheatingInd.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("overheatingInd", -1);
      }
      else {
         overheatingInd = null;
      }

      // decode ims_Parameters

      if (ims_ParametersPresent) {
         buffer.getContext().eventDispatcher.startElement("ims_Parameters", -1);

         ims_Parameters = new IMS_Parameters();
         ims_Parameters.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ims_Parameters", -1);
      }
      else {
         ims_Parameters = null;
      }

      // decode fr1_Add_UE_NR_Capabilities_v1540

      if (fr1_Add_UE_NR_Capabilities_v1540Present) {
         buffer.getContext().eventDispatcher.startElement("fr1_Add_UE_NR_Capabilities_v1540", -1);

         fr1_Add_UE_NR_Capabilities_v1540 = new UE_NR_CapabilityAddFRX_Mode_v1540();
         fr1_Add_UE_NR_Capabilities_v1540.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("fr1_Add_UE_NR_Capabilities_v1540", -1);
      }
      else {
         fr1_Add_UE_NR_Capabilities_v1540 = null;
      }

      // decode fr2_Add_UE_NR_Capabilities_v1540

      if (fr2_Add_UE_NR_Capabilities_v1540Present) {
         buffer.getContext().eventDispatcher.startElement("fr2_Add_UE_NR_Capabilities_v1540", -1);

         fr2_Add_UE_NR_Capabilities_v1540 = new UE_NR_CapabilityAddFRX_Mode_v1540();
         fr2_Add_UE_NR_Capabilities_v1540.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("fr2_Add_UE_NR_Capabilities_v1540", -1);
      }
      else {
         fr2_Add_UE_NR_Capabilities_v1540 = null;
      }

      // decode fr1_fr2_Add_UE_NR_Capabilities

      if (fr1_fr2_Add_UE_NR_CapabilitiesPresent) {
         buffer.getContext().eventDispatcher.startElement("fr1_fr2_Add_UE_NR_Capabilities", -1);

         fr1_fr2_Add_UE_NR_Capabilities = new UE_NR_CapabilityAddFRX_Mode();
         fr1_fr2_Add_UE_NR_Capabilities.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("fr1_fr2_Add_UE_NR_Capabilities", -1);
      }
      else {
         fr1_fr2_Add_UE_NR_Capabilities = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_NR_Capability_v1550();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sdap_Parameters != null), null);
      buffer.encodeBit ((overheatingInd != null), null);
      buffer.encodeBit ((ims_Parameters != null), null);
      buffer.encodeBit ((fr1_Add_UE_NR_Capabilities_v1540 != null), null);
      buffer.encodeBit ((fr2_Add_UE_NR_Capabilities_v1540 != null), null);
      buffer.encodeBit ((fr1_fr2_Add_UE_NR_Capabilities != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode sdap_Parameters

      if (sdap_Parameters != null) {
         buffer.getContext().eventDispatcher.startElement("sdap_Parameters", -1);

         sdap_Parameters.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sdap_Parameters", -1);
      }

      // encode overheatingInd

      if (overheatingInd != null) {
         buffer.getContext().eventDispatcher.startElement("overheatingInd", -1);

         overheatingInd.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("overheatingInd", -1);
      }

      // encode ims_Parameters

      if (ims_Parameters != null) {
         buffer.getContext().eventDispatcher.startElement("ims_Parameters", -1);

         ims_Parameters.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ims_Parameters", -1);
      }

      // encode fr1_Add_UE_NR_Capabilities_v1540

      if (fr1_Add_UE_NR_Capabilities_v1540 != null) {
         buffer.getContext().eventDispatcher.startElement("fr1_Add_UE_NR_Capabilities_v1540", -1);

         fr1_Add_UE_NR_Capabilities_v1540.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("fr1_Add_UE_NR_Capabilities_v1540", -1);
      }

      // encode fr2_Add_UE_NR_Capabilities_v1540

      if (fr2_Add_UE_NR_Capabilities_v1540 != null) {
         buffer.getContext().eventDispatcher.startElement("fr2_Add_UE_NR_Capabilities_v1540", -1);

         fr2_Add_UE_NR_Capabilities_v1540.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("fr2_Add_UE_NR_Capabilities_v1540", -1);
      }

      // encode fr1_fr2_Add_UE_NR_Capabilities

      if (fr1_fr2_Add_UE_NR_Capabilities != null) {
         buffer.getContext().eventDispatcher.startElement("fr1_fr2_Add_UE_NR_Capabilities", -1);

         fr1_fr2_Add_UE_NR_Capabilities.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("fr1_fr2_Add_UE_NR_Capabilities", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sdap_Parameters != null) sdap_Parameters.print (_sb, "sdap_Parameters", _level+1);
      if (overheatingInd != null) overheatingInd.print (_sb, "overheatingInd", _level+1);
      if (ims_Parameters != null) ims_Parameters.print (_sb, "ims_Parameters", _level+1);
      if (fr1_Add_UE_NR_Capabilities_v1540 != null) fr1_Add_UE_NR_Capabilities_v1540.print (_sb, "fr1_Add_UE_NR_Capabilities_v1540", _level+1);
      if (fr2_Add_UE_NR_Capabilities_v1540 != null) fr2_Add_UE_NR_Capabilities_v1540.print (_sb, "fr2_Add_UE_NR_Capabilities_v1540", _level+1);
      if (fr1_fr2_Add_UE_NR_Capabilities != null) fr1_fr2_Add_UE_NR_Capabilities.print (_sb, "fr1_fr2_Add_UE_NR_Capabilities", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
