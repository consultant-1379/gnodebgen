/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v9d0_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-Capability-v9d0-IEs";
   }

   public PhyLayerParameters_v9d0 phyLayerParameters_v9d0;  // optional
   public UE_EUTRA_Capability_v9e0_IEs nonCriticalExtension;  // optional

   public UE_EUTRA_Capability_v9d0_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_v9d0_IEs (
      PhyLayerParameters_v9d0 phyLayerParameters_v9d0_,
      UE_EUTRA_Capability_v9e0_IEs nonCriticalExtension_
   ) {
      super();
      phyLayerParameters_v9d0 = phyLayerParameters_v9d0_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      phyLayerParameters_v9d0 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phyLayerParameters_v9d0;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phyLayerParameters-v9d0";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean phyLayerParameters_v9d0Present = buffer.decodeBit ("phyLayerParameters_v9d0Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode phyLayerParameters_v9d0

      if (phyLayerParameters_v9d0Present) {
         buffer.getContext().eventDispatcher.startElement("phyLayerParameters_v9d0", -1);

         phyLayerParameters_v9d0 = new PhyLayerParameters_v9d0();
         phyLayerParameters_v9d0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phyLayerParameters_v9d0", -1);
      }
      else {
         phyLayerParameters_v9d0 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_EUTRA_Capability_v9e0_IEs();
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
      if (phyLayerParameters_v9d0 != null) phyLayerParameters_v9d0.print (_sb, "phyLayerParameters_v9d0", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
