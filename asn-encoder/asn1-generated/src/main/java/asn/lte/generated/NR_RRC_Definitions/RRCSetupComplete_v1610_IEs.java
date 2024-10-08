/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCSetupComplete_v1610_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRCSetupComplete-v1610-IEs";
   }

   public RRCSetupComplete_v1610_IEs_iab_NodeIndication_r16 iab_NodeIndication_r16 = null;  // optional
   public RRCSetupComplete_v1610_IEs_idleMeasAvailable_r16 idleMeasAvailable_r16 = null;  // optional
   public UE_MeasurementsAvailable_r16 ue_MeasurementsAvailable_r16;  // optional
   public RRCSetupComplete_v1610_IEs_mobilityHistoryAvail_r16 mobilityHistoryAvail_r16 = null;  // optional
   public RRCSetupComplete_v1610_IEs_mobilityState_r16 mobilityState_r16 = null;  // optional
   public RRCSetupComplete_v1610_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public RRCSetupComplete_v1610_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCSetupComplete_v1610_IEs (
      RRCSetupComplete_v1610_IEs_iab_NodeIndication_r16 iab_NodeIndication_r16_,
      RRCSetupComplete_v1610_IEs_idleMeasAvailable_r16 idleMeasAvailable_r16_,
      UE_MeasurementsAvailable_r16 ue_MeasurementsAvailable_r16_,
      RRCSetupComplete_v1610_IEs_mobilityHistoryAvail_r16 mobilityHistoryAvail_r16_,
      RRCSetupComplete_v1610_IEs_mobilityState_r16 mobilityState_r16_,
      RRCSetupComplete_v1610_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      iab_NodeIndication_r16 = iab_NodeIndication_r16_;
      idleMeasAvailable_r16 = idleMeasAvailable_r16_;
      ue_MeasurementsAvailable_r16 = ue_MeasurementsAvailable_r16_;
      mobilityHistoryAvail_r16 = mobilityHistoryAvail_r16_;
      mobilityState_r16 = mobilityState_r16_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      iab_NodeIndication_r16 = null;
      idleMeasAvailable_r16 = null;
      ue_MeasurementsAvailable_r16 = null;
      mobilityHistoryAvail_r16 = null;
      mobilityState_r16 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return iab_NodeIndication_r16;
         case 1: return idleMeasAvailable_r16;
         case 2: return ue_MeasurementsAvailable_r16;
         case 3: return mobilityHistoryAvail_r16;
         case 4: return mobilityState_r16;
         case 5: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "iab-NodeIndication-r16";
         case 1: return "idleMeasAvailable-r16";
         case 2: return "ue-MeasurementsAvailable-r16";
         case 3: return "mobilityHistoryAvail-r16";
         case 4: return "mobilityState-r16";
         case 5: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean iab_NodeIndication_r16Present = buffer.decodeBit ("iab_NodeIndication_r16Present");
      boolean idleMeasAvailable_r16Present = buffer.decodeBit ("idleMeasAvailable_r16Present");
      boolean ue_MeasurementsAvailable_r16Present = buffer.decodeBit ("ue_MeasurementsAvailable_r16Present");
      boolean mobilityHistoryAvail_r16Present = buffer.decodeBit ("mobilityHistoryAvail_r16Present");
      boolean mobilityState_r16Present = buffer.decodeBit ("mobilityState_r16Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode iab_NodeIndication_r16

      if (iab_NodeIndication_r16Present) {
         buffer.getContext().eventDispatcher.startElement("iab_NodeIndication_r16", -1);

         int tval = RRCSetupComplete_v1610_IEs_iab_NodeIndication_r16.decodeEnumValue (buffer);
         iab_NodeIndication_r16 = RRCSetupComplete_v1610_IEs_iab_NodeIndication_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("iab_NodeIndication_r16", -1);
      }
      else {
         iab_NodeIndication_r16 = null;
      }

      // decode idleMeasAvailable_r16

      if (idleMeasAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("idleMeasAvailable_r16", -1);

         int tval = RRCSetupComplete_v1610_IEs_idleMeasAvailable_r16.decodeEnumValue (buffer);
         idleMeasAvailable_r16 = RRCSetupComplete_v1610_IEs_idleMeasAvailable_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("idleMeasAvailable_r16", -1);
      }
      else {
         idleMeasAvailable_r16 = null;
      }

      // decode ue_MeasurementsAvailable_r16

      if (ue_MeasurementsAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ue_MeasurementsAvailable_r16", -1);

         ue_MeasurementsAvailable_r16 = new UE_MeasurementsAvailable_r16();
         ue_MeasurementsAvailable_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ue_MeasurementsAvailable_r16", -1);
      }
      else {
         ue_MeasurementsAvailable_r16 = null;
      }

      // decode mobilityHistoryAvail_r16

      if (mobilityHistoryAvail_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mobilityHistoryAvail_r16", -1);

         int tval = RRCSetupComplete_v1610_IEs_mobilityHistoryAvail_r16.decodeEnumValue (buffer);
         mobilityHistoryAvail_r16 = RRCSetupComplete_v1610_IEs_mobilityHistoryAvail_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mobilityHistoryAvail_r16", -1);
      }
      else {
         mobilityHistoryAvail_r16 = null;
      }

      // decode mobilityState_r16

      if (mobilityState_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mobilityState_r16", -1);

         int tval = RRCSetupComplete_v1610_IEs_mobilityState_r16.decodeEnumValue (buffer);
         mobilityState_r16 = RRCSetupComplete_v1610_IEs_mobilityState_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mobilityState_r16", -1);
      }
      else {
         mobilityState_r16 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new RRCSetupComplete_v1610_IEs_nonCriticalExtension();
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
      if (iab_NodeIndication_r16 != null) iab_NodeIndication_r16.print (_sb, "iab_NodeIndication_r16", _level+1);
      if (idleMeasAvailable_r16 != null) idleMeasAvailable_r16.print (_sb, "idleMeasAvailable_r16", _level+1);
      if (ue_MeasurementsAvailable_r16 != null) ue_MeasurementsAvailable_r16.print (_sb, "ue_MeasurementsAvailable_r16", _level+1);
      if (mobilityHistoryAvail_r16 != null) mobilityHistoryAvail_r16.print (_sb, "mobilityHistoryAvail_r16", _level+1);
      if (mobilityState_r16 != null) mobilityState_r16.print (_sb, "mobilityState_r16", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
