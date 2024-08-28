/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReconfiguration_v1430_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCConnectionReconfiguration-v1430-IEs";
   }

   public SL_V2X_ConfigDedicated_r14 sl_V2X_ConfigDedicated_r14;  // optional
   public SCellToAddModListExt_v1430 sCellToAddModListExt_v1430;  // optional
   public RRCConnectionReconfiguration_v1430_IEs_perCC_GapIndicationRequest_r14 perCC_GapIndicationRequest_r14 = null;  // optional
   public SystemInformationBlockType2 systemInformationBlockType2Dedicated_r14;  // optional
   public RRCConnectionReconfiguration_v1510_IEs nonCriticalExtension;  // optional

   public RRCConnectionReconfiguration_v1430_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReconfiguration_v1430_IEs (
      SL_V2X_ConfigDedicated_r14 sl_V2X_ConfigDedicated_r14_,
      SCellToAddModListExt_v1430 sCellToAddModListExt_v1430_,
      RRCConnectionReconfiguration_v1430_IEs_perCC_GapIndicationRequest_r14 perCC_GapIndicationRequest_r14_,
      SystemInformationBlockType2 systemInformationBlockType2Dedicated_r14_,
      RRCConnectionReconfiguration_v1510_IEs nonCriticalExtension_
   ) {
      super();
      sl_V2X_ConfigDedicated_r14 = sl_V2X_ConfigDedicated_r14_;
      sCellToAddModListExt_v1430 = sCellToAddModListExt_v1430_;
      perCC_GapIndicationRequest_r14 = perCC_GapIndicationRequest_r14_;
      systemInformationBlockType2Dedicated_r14 = systemInformationBlockType2Dedicated_r14_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      sl_V2X_ConfigDedicated_r14 = null;
      sCellToAddModListExt_v1430 = null;
      perCC_GapIndicationRequest_r14 = null;
      systemInformationBlockType2Dedicated_r14 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_V2X_ConfigDedicated_r14;
         case 1: return sCellToAddModListExt_v1430;
         case 2: return perCC_GapIndicationRequest_r14;
         case 3: return systemInformationBlockType2Dedicated_r14;
         case 4: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-V2X-ConfigDedicated-r14";
         case 1: return "sCellToAddModListExt-v1430";
         case 2: return "perCC-GapIndicationRequest-r14";
         case 3: return "systemInformationBlockType2Dedicated-r14";
         case 4: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sl_V2X_ConfigDedicated_r14Present = buffer.decodeBit ("sl_V2X_ConfigDedicated_r14Present");
      boolean sCellToAddModListExt_v1430Present = buffer.decodeBit ("sCellToAddModListExt_v1430Present");
      boolean perCC_GapIndicationRequest_r14Present = buffer.decodeBit ("perCC_GapIndicationRequest_r14Present");
      boolean systemInformationBlockType2Dedicated_r14Present = buffer.decodeBit ("systemInformationBlockType2Dedicated_r14Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode sl_V2X_ConfigDedicated_r14

      if (sl_V2X_ConfigDedicated_r14Present) {
         buffer.getContext().eventDispatcher.startElement("sl_V2X_ConfigDedicated_r14", -1);

         sl_V2X_ConfigDedicated_r14 = new SL_V2X_ConfigDedicated_r14();
         sl_V2X_ConfigDedicated_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_V2X_ConfigDedicated_r14", -1);
      }
      else {
         sl_V2X_ConfigDedicated_r14 = null;
      }

      // decode sCellToAddModListExt_v1430

      if (sCellToAddModListExt_v1430Present) {
         buffer.getContext().eventDispatcher.startElement("sCellToAddModListExt_v1430", -1);

         sCellToAddModListExt_v1430 = new SCellToAddModListExt_v1430();
         sCellToAddModListExt_v1430.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sCellToAddModListExt_v1430", -1);
      }
      else {
         sCellToAddModListExt_v1430 = null;
      }

      // decode perCC_GapIndicationRequest_r14

      if (perCC_GapIndicationRequest_r14Present) {
         buffer.getContext().eventDispatcher.startElement("perCC_GapIndicationRequest_r14", -1);

         int tval = RRCConnectionReconfiguration_v1430_IEs_perCC_GapIndicationRequest_r14.decodeEnumValue (buffer);
         perCC_GapIndicationRequest_r14 = RRCConnectionReconfiguration_v1430_IEs_perCC_GapIndicationRequest_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("perCC_GapIndicationRequest_r14", -1);
      }
      else {
         perCC_GapIndicationRequest_r14 = null;
      }

      // decode systemInformationBlockType2Dedicated_r14

      if (systemInformationBlockType2Dedicated_r14Present) {
         buffer.getContext().eventDispatcher.startElement("systemInformationBlockType2Dedicated_r14", -1);

         Asn1OctetString systemInformationBlockType2Dedicated_r14_outer = new Asn1OctetString();
         systemInformationBlockType2Dedicated_r14_outer.decode (buffer);
         if (systemInformationBlockType2Dedicated_r14_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( systemInformationBlockType2Dedicated_r14_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         systemInformationBlockType2Dedicated_r14 = new SystemInformationBlockType2();
         systemInformationBlockType2Dedicated_r14.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("systemInformationBlockType2Dedicated_r14", -1);
      }
      else {
         systemInformationBlockType2Dedicated_r14 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCConnectionReconfiguration_v1510_IEs();
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
      if (sl_V2X_ConfigDedicated_r14 != null) sl_V2X_ConfigDedicated_r14.print (_sb, "sl_V2X_ConfigDedicated_r14", _level+1);
      if (sCellToAddModListExt_v1430 != null) sCellToAddModListExt_v1430.print (_sb, "sCellToAddModListExt_v1430", _level+1);
      if (perCC_GapIndicationRequest_r14 != null) perCC_GapIndicationRequest_r14.print (_sb, "perCC_GapIndicationRequest_r14", _level+1);
      if (systemInformationBlockType2Dedicated_r14 != null) systemInformationBlockType2Dedicated_r14.print (_sb, "systemInformationBlockType2Dedicated_r14", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
