/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReconfiguration_v1130_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionReconfiguration-v1130-IEs";
   }

   public SystemInformationBlockType1 systemInformationBlockType1Dedicated_r11;  // optional
   public RRCConnectionReconfiguration_v1250_IEs nonCriticalExtension;  // optional

   public RRCConnectionReconfiguration_v1130_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReconfiguration_v1130_IEs (
      SystemInformationBlockType1 systemInformationBlockType1Dedicated_r11_,
      RRCConnectionReconfiguration_v1250_IEs nonCriticalExtension_
   ) {
      super();
      systemInformationBlockType1Dedicated_r11 = systemInformationBlockType1Dedicated_r11_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      systemInformationBlockType1Dedicated_r11 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return systemInformationBlockType1Dedicated_r11;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "systemInformationBlockType1Dedicated-r11";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean systemInformationBlockType1Dedicated_r11Present = buffer.decodeBit ("systemInformationBlockType1Dedicated_r11Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode systemInformationBlockType1Dedicated_r11

      if (systemInformationBlockType1Dedicated_r11Present) {
         buffer.getContext().eventDispatcher.startElement("systemInformationBlockType1Dedicated_r11", -1);

         Asn1OctetString systemInformationBlockType1Dedicated_r11_outer = new Asn1OctetString();
         systemInformationBlockType1Dedicated_r11_outer.decode (buffer);
         if (systemInformationBlockType1Dedicated_r11_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( systemInformationBlockType1Dedicated_r11_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         systemInformationBlockType1Dedicated_r11 = new SystemInformationBlockType1();
         systemInformationBlockType1Dedicated_r11.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("systemInformationBlockType1Dedicated_r11", -1);
      }
      else {
         systemInformationBlockType1Dedicated_r11 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionReconfiguration_v1250_IEs();
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
      if (systemInformationBlockType1Dedicated_r11 != null) systemInformationBlockType1Dedicated_r11.print (_sb, "systemInformationBlockType1Dedicated_r11", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
