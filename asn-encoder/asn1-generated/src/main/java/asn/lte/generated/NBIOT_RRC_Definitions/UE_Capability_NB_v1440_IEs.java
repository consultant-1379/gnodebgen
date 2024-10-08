/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_Capability_NB_v1440_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-Capability-NB-v1440-IEs";
   }

   public PhyLayerParameters_NB_v1440 phyLayerParameters_v1440;  // optional
   public UE_Capability_NB_v14x0_IEs nonCriticalExtension;  // optional

   public UE_Capability_NB_v1440_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_Capability_NB_v1440_IEs (
      PhyLayerParameters_NB_v1440 phyLayerParameters_v1440_,
      UE_Capability_NB_v14x0_IEs nonCriticalExtension_
   ) {
      super();
      phyLayerParameters_v1440 = phyLayerParameters_v1440_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      phyLayerParameters_v1440 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return phyLayerParameters_v1440;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "phyLayerParameters-v1440";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean phyLayerParameters_v1440Present = buffer.decodeBit ("phyLayerParameters_v1440Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode phyLayerParameters_v1440

      if (phyLayerParameters_v1440Present) {
         buffer.getContext().eventDispatcher.startElement("phyLayerParameters_v1440", -1);

         phyLayerParameters_v1440 = new PhyLayerParameters_NB_v1440();
         phyLayerParameters_v1440.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phyLayerParameters_v1440", -1);
      }
      else {
         phyLayerParameters_v1440 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_Capability_NB_v14x0_IEs();
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
      if (phyLayerParameters_v1440 != null) phyLayerParameters_v1440.print (_sb, "phyLayerParameters_v1440", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
