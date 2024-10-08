/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class HandoverPreparationInformation_v9e0_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "HandoverPreparationInformation-v9e0-IEs";
   }

   public AS_Config_v9e0 as_Config_v9e0;  // optional
   public HandoverPreparationInformation_v1130_IEs nonCriticalExtension;  // optional

   public HandoverPreparationInformation_v9e0_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public HandoverPreparationInformation_v9e0_IEs (
      AS_Config_v9e0 as_Config_v9e0_,
      HandoverPreparationInformation_v1130_IEs nonCriticalExtension_
   ) {
      super();
      as_Config_v9e0 = as_Config_v9e0_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      as_Config_v9e0 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return as_Config_v9e0;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "as-Config-v9e0";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean as_Config_v9e0Present = buffer.decodeBit ("as_Config_v9e0Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode as_Config_v9e0

      if (as_Config_v9e0Present) {
         buffer.getContext().eventDispatcher.startElement("as_Config_v9e0", -1);

         as_Config_v9e0 = new AS_Config_v9e0();
         as_Config_v9e0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("as_Config_v9e0", -1);
      }
      else {
         as_Config_v9e0 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new HandoverPreparationInformation_v1130_IEs();
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
      if (as_Config_v9e0 != null) as_Config_v9e0.print (_sb, "as_Config_v9e0", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
