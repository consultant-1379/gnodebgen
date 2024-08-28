/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v1280_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-Capability-v1280-IEs";
   }

   public PhyLayerParameters_v1280 phyLayerParameters_v1280;  // optional
   public UE_EUTRA_Capability_v1310_IEs nonCriticalExtension;  // optional

   public UE_EUTRA_Capability_v1280_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_v1280_IEs (
      PhyLayerParameters_v1280 phyLayerParameters_v1280_,
      UE_EUTRA_Capability_v1310_IEs nonCriticalExtension_
   ) {
      super();
      phyLayerParameters_v1280 = phyLayerParameters_v1280_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      phyLayerParameters_v1280 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phyLayerParameters_v1280;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phyLayerParameters-v1280";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean phyLayerParameters_v1280Present = buffer.decodeBit ("phyLayerParameters_v1280Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode phyLayerParameters_v1280

      if (phyLayerParameters_v1280Present) {
         buffer.getContext().eventDispatcher.startElement("phyLayerParameters_v1280", -1);

         phyLayerParameters_v1280 = new PhyLayerParameters_v1280();
         phyLayerParameters_v1280.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phyLayerParameters_v1280", -1);
      }
      else {
         phyLayerParameters_v1280 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_EUTRA_Capability_v1310_IEs();
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
      if (phyLayerParameters_v1280 != null) phyLayerParameters_v1280.print (_sb, "phyLayerParameters_v1280", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
