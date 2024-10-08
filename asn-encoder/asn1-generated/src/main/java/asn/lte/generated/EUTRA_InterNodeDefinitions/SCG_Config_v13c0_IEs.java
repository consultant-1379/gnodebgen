/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.SCG_ConfigPartSCG_v13c0;

public class SCG_Config_v13c0_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SCG-Config-v13c0-IEs";
   }

   public SCG_ConfigPartSCG_v13c0 scg_RadioConfig_v13c0;  // optional
   public SCG_Config_v13c0_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public SCG_Config_v13c0_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCG_Config_v13c0_IEs (
      SCG_ConfigPartSCG_v13c0 scg_RadioConfig_v13c0_,
      SCG_Config_v13c0_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      scg_RadioConfig_v13c0 = scg_RadioConfig_v13c0_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      scg_RadioConfig_v13c0 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return scg_RadioConfig_v13c0;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "scg-RadioConfig-v13c0";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean scg_RadioConfig_v13c0Present = buffer.decodeBit ("scg_RadioConfig_v13c0Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode scg_RadioConfig_v13c0

      if (scg_RadioConfig_v13c0Present) {
         buffer.getContext().eventDispatcher.startElement("scg_RadioConfig_v13c0", -1);

         scg_RadioConfig_v13c0 = new SCG_ConfigPartSCG_v13c0();
         scg_RadioConfig_v13c0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scg_RadioConfig_v13c0", -1);
      }
      else {
         scg_RadioConfig_v13c0 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SCG_Config_v13c0_IEs_nonCriticalExtension();
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
      if (scg_RadioConfig_v13c0 != null) scg_RadioConfig_v13c0.print (_sb, "scg_RadioConfig_v13c0", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
