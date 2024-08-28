/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.RadioResourceConfigDedicated;
import asn.lte.generated.EUTRA_RRC_Definitions.SCellToAddModList_r10;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasGapConfig;
import asn.lte.generated.EUTRA_RRC_Definitions.PowerCoordinationInfo_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SCG_ConfigPartSCG_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.UECapabilityInformation;
import asn.lte.generated.EUTRA_RRC_Definitions.MBMSInterestIndication_r11;
import asn.lte.generated.EUTRA_RRC_Definitions.DRB_ToReleaseList;
import asn.lte.generated.EUTRA_RRC_Definitions.SCellToReleaseList_r10;
import asn.lte.generated.EUTRA_RRC_Definitions.P_Max;

public class SCG_ConfigInfo_r12_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SCG-ConfigInfo-r12-IEs";
   }

   public RadioResourceConfigDedicated radioResourceConfigDedMCG_r12;  // optional
   public SCellToAddModList_r10 sCellToAddModListMCG_r12;  // optional
   public MeasGapConfig measGapConfig_r12;  // optional
   public PowerCoordinationInfo_r12 powerCoordinationInfo_r12;  // optional
   public SCG_ConfigPartSCG_r12 scg_RadioConfig_r12;  // optional
   public UECapabilityInformation eutra_CapabilityInfo_r12;  // optional
   public SCG_ConfigRestrictInfo_r12 scg_ConfigRestrictInfo_r12;  // optional
   public MBMSInterestIndication_r11 mbmsInterestIndication_r12;  // optional
   public MeasResultServCellListSCG_r12 measResultServCellListSCG_r12;  // optional
   public DRB_InfoListSCG_r12 drb_ToAddModListSCG_r12;  // optional
   public DRB_ToReleaseList drb_ToReleaseListSCG_r12;  // optional
   public SCellToAddModListSCG_r12 sCellToAddModListSCG_r12;  // optional
   public SCellToReleaseList_r10 sCellToReleaseListSCG_r12;  // optional
   public P_Max p_Max_r12;  // optional
   public SCG_ConfigInfo_v1310_IEs nonCriticalExtension;  // optional

   public SCG_ConfigInfo_r12_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCG_ConfigInfo_r12_IEs (
      RadioResourceConfigDedicated radioResourceConfigDedMCG_r12_,
      SCellToAddModList_r10 sCellToAddModListMCG_r12_,
      MeasGapConfig measGapConfig_r12_,
      PowerCoordinationInfo_r12 powerCoordinationInfo_r12_,
      SCG_ConfigPartSCG_r12 scg_RadioConfig_r12_,
      UECapabilityInformation eutra_CapabilityInfo_r12_,
      SCG_ConfigRestrictInfo_r12 scg_ConfigRestrictInfo_r12_,
      MBMSInterestIndication_r11 mbmsInterestIndication_r12_,
      MeasResultServCellListSCG_r12 measResultServCellListSCG_r12_,
      DRB_InfoListSCG_r12 drb_ToAddModListSCG_r12_,
      DRB_ToReleaseList drb_ToReleaseListSCG_r12_,
      SCellToAddModListSCG_r12 sCellToAddModListSCG_r12_,
      SCellToReleaseList_r10 sCellToReleaseListSCG_r12_,
      P_Max p_Max_r12_,
      SCG_ConfigInfo_v1310_IEs nonCriticalExtension_
   ) {
      super();
      radioResourceConfigDedMCG_r12 = radioResourceConfigDedMCG_r12_;
      sCellToAddModListMCG_r12 = sCellToAddModListMCG_r12_;
      measGapConfig_r12 = measGapConfig_r12_;
      powerCoordinationInfo_r12 = powerCoordinationInfo_r12_;
      scg_RadioConfig_r12 = scg_RadioConfig_r12_;
      eutra_CapabilityInfo_r12 = eutra_CapabilityInfo_r12_;
      scg_ConfigRestrictInfo_r12 = scg_ConfigRestrictInfo_r12_;
      mbmsInterestIndication_r12 = mbmsInterestIndication_r12_;
      measResultServCellListSCG_r12 = measResultServCellListSCG_r12_;
      drb_ToAddModListSCG_r12 = drb_ToAddModListSCG_r12_;
      drb_ToReleaseListSCG_r12 = drb_ToReleaseListSCG_r12_;
      sCellToAddModListSCG_r12 = sCellToAddModListSCG_r12_;
      sCellToReleaseListSCG_r12 = sCellToReleaseListSCG_r12_;
      p_Max_r12 = p_Max_r12_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SCG_ConfigInfo_r12_IEs (RadioResourceConfigDedicated radioResourceConfigDedMCG_r12_,
      SCellToAddModList_r10 sCellToAddModListMCG_r12_,
      MeasGapConfig measGapConfig_r12_,
      PowerCoordinationInfo_r12 powerCoordinationInfo_r12_,
      SCG_ConfigPartSCG_r12 scg_RadioConfig_r12_,
      UECapabilityInformation eutra_CapabilityInfo_r12_,
      SCG_ConfigRestrictInfo_r12 scg_ConfigRestrictInfo_r12_,
      MBMSInterestIndication_r11 mbmsInterestIndication_r12_,
      MeasResultServCellListSCG_r12 measResultServCellListSCG_r12_,
      DRB_InfoListSCG_r12 drb_ToAddModListSCG_r12_,
      DRB_ToReleaseList drb_ToReleaseListSCG_r12_,
      SCellToAddModListSCG_r12 sCellToAddModListSCG_r12_,
      SCellToReleaseList_r10 sCellToReleaseListSCG_r12_,
      long p_Max_r12_,
      SCG_ConfigInfo_v1310_IEs nonCriticalExtension_
   ) {
      super();
      radioResourceConfigDedMCG_r12 = radioResourceConfigDedMCG_r12_;
      sCellToAddModListMCG_r12 = sCellToAddModListMCG_r12_;
      measGapConfig_r12 = measGapConfig_r12_;
      powerCoordinationInfo_r12 = powerCoordinationInfo_r12_;
      scg_RadioConfig_r12 = scg_RadioConfig_r12_;
      eutra_CapabilityInfo_r12 = eutra_CapabilityInfo_r12_;
      scg_ConfigRestrictInfo_r12 = scg_ConfigRestrictInfo_r12_;
      mbmsInterestIndication_r12 = mbmsInterestIndication_r12_;
      measResultServCellListSCG_r12 = measResultServCellListSCG_r12_;
      drb_ToAddModListSCG_r12 = drb_ToAddModListSCG_r12_;
      drb_ToReleaseListSCG_r12 = drb_ToReleaseListSCG_r12_;
      sCellToAddModListSCG_r12 = sCellToAddModListSCG_r12_;
      sCellToReleaseListSCG_r12 = sCellToReleaseListSCG_r12_;
      p_Max_r12 = new P_Max (p_Max_r12_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      radioResourceConfigDedMCG_r12 = null;
      sCellToAddModListMCG_r12 = null;
      measGapConfig_r12 = null;
      powerCoordinationInfo_r12 = null;
      scg_RadioConfig_r12 = null;
      eutra_CapabilityInfo_r12 = null;
      scg_ConfigRestrictInfo_r12 = null;
      mbmsInterestIndication_r12 = null;
      measResultServCellListSCG_r12 = null;
      drb_ToAddModListSCG_r12 = null;
      drb_ToReleaseListSCG_r12 = null;
      sCellToAddModListSCG_r12 = null;
      sCellToReleaseListSCG_r12 = null;
      p_Max_r12 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 15; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return radioResourceConfigDedMCG_r12;
         case 1: return sCellToAddModListMCG_r12;
         case 2: return measGapConfig_r12;
         case 3: return powerCoordinationInfo_r12;
         case 4: return scg_RadioConfig_r12;
         case 5: return eutra_CapabilityInfo_r12;
         case 6: return scg_ConfigRestrictInfo_r12;
         case 7: return mbmsInterestIndication_r12;
         case 8: return measResultServCellListSCG_r12;
         case 9: return drb_ToAddModListSCG_r12;
         case 10: return drb_ToReleaseListSCG_r12;
         case 11: return sCellToAddModListSCG_r12;
         case 12: return sCellToReleaseListSCG_r12;
         case 13: return p_Max_r12;
         case 14: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "radioResourceConfigDedMCG-r12";
         case 1: return "sCellToAddModListMCG-r12";
         case 2: return "measGapConfig-r12";
         case 3: return "powerCoordinationInfo-r12";
         case 4: return "scg-RadioConfig-r12";
         case 5: return "eutra-CapabilityInfo-r12";
         case 6: return "scg-ConfigRestrictInfo-r12";
         case 7: return "mbmsInterestIndication-r12";
         case 8: return "measResultServCellListSCG-r12";
         case 9: return "drb-ToAddModListSCG-r12";
         case 10: return "drb-ToReleaseListSCG-r12";
         case 11: return "sCellToAddModListSCG-r12";
         case 12: return "sCellToReleaseListSCG-r12";
         case 13: return "p-Max-r12";
         case 14: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean radioResourceConfigDedMCG_r12Present = buffer.decodeBit ("radioResourceConfigDedMCG_r12Present");
      boolean sCellToAddModListMCG_r12Present = buffer.decodeBit ("sCellToAddModListMCG_r12Present");
      boolean measGapConfig_r12Present = buffer.decodeBit ("measGapConfig_r12Present");
      boolean powerCoordinationInfo_r12Present = buffer.decodeBit ("powerCoordinationInfo_r12Present");
      boolean scg_RadioConfig_r12Present = buffer.decodeBit ("scg_RadioConfig_r12Present");
      boolean eutra_CapabilityInfo_r12Present = buffer.decodeBit ("eutra_CapabilityInfo_r12Present");
      boolean scg_ConfigRestrictInfo_r12Present = buffer.decodeBit ("scg_ConfigRestrictInfo_r12Present");
      boolean mbmsInterestIndication_r12Present = buffer.decodeBit ("mbmsInterestIndication_r12Present");
      boolean measResultServCellListSCG_r12Present = buffer.decodeBit ("measResultServCellListSCG_r12Present");
      boolean drb_ToAddModListSCG_r12Present = buffer.decodeBit ("drb_ToAddModListSCG_r12Present");
      boolean drb_ToReleaseListSCG_r12Present = buffer.decodeBit ("drb_ToReleaseListSCG_r12Present");
      boolean sCellToAddModListSCG_r12Present = buffer.decodeBit ("sCellToAddModListSCG_r12Present");
      boolean sCellToReleaseListSCG_r12Present = buffer.decodeBit ("sCellToReleaseListSCG_r12Present");
      boolean p_Max_r12Present = buffer.decodeBit ("p_Max_r12Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode radioResourceConfigDedMCG_r12

      if (radioResourceConfigDedMCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("radioResourceConfigDedMCG_r12", -1);

         radioResourceConfigDedMCG_r12 = new RadioResourceConfigDedicated();
         radioResourceConfigDedMCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("radioResourceConfigDedMCG_r12", -1);
      }
      else {
         radioResourceConfigDedMCG_r12 = null;
      }

      // decode sCellToAddModListMCG_r12

      if (sCellToAddModListMCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sCellToAddModListMCG_r12", -1);

         sCellToAddModListMCG_r12 = new SCellToAddModList_r10();
         sCellToAddModListMCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sCellToAddModListMCG_r12", -1);
      }
      else {
         sCellToAddModListMCG_r12 = null;
      }

      // decode measGapConfig_r12

      if (measGapConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measGapConfig_r12", -1);

         measGapConfig_r12 = new MeasGapConfig();
         measGapConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measGapConfig_r12", -1);
      }
      else {
         measGapConfig_r12 = null;
      }

      // decode powerCoordinationInfo_r12

      if (powerCoordinationInfo_r12Present) {
         buffer.getContext().eventDispatcher.startElement("powerCoordinationInfo_r12", -1);

         powerCoordinationInfo_r12 = new PowerCoordinationInfo_r12();
         powerCoordinationInfo_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("powerCoordinationInfo_r12", -1);
      }
      else {
         powerCoordinationInfo_r12 = null;
      }

      // decode scg_RadioConfig_r12

      if (scg_RadioConfig_r12Present) {
         buffer.getContext().eventDispatcher.startElement("scg_RadioConfig_r12", -1);

         scg_RadioConfig_r12 = new SCG_ConfigPartSCG_r12();
         scg_RadioConfig_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scg_RadioConfig_r12", -1);
      }
      else {
         scg_RadioConfig_r12 = null;
      }

      // decode eutra_CapabilityInfo_r12

      if (eutra_CapabilityInfo_r12Present) {
         buffer.getContext().eventDispatcher.startElement("eutra_CapabilityInfo_r12", -1);

         Asn1OctetString eutra_CapabilityInfo_r12_outer = new Asn1OctetString();
         eutra_CapabilityInfo_r12_outer.decode (buffer);
         if (eutra_CapabilityInfo_r12_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( eutra_CapabilityInfo_r12_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         eutra_CapabilityInfo_r12 = new UECapabilityInformation();
         eutra_CapabilityInfo_r12.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("eutra_CapabilityInfo_r12", -1);
      }
      else {
         eutra_CapabilityInfo_r12 = null;
      }

      // decode scg_ConfigRestrictInfo_r12

      if (scg_ConfigRestrictInfo_r12Present) {
         buffer.getContext().eventDispatcher.startElement("scg_ConfigRestrictInfo_r12", -1);

         scg_ConfigRestrictInfo_r12 = new SCG_ConfigRestrictInfo_r12();
         scg_ConfigRestrictInfo_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scg_ConfigRestrictInfo_r12", -1);
      }
      else {
         scg_ConfigRestrictInfo_r12 = null;
      }

      // decode mbmsInterestIndication_r12

      if (mbmsInterestIndication_r12Present) {
         buffer.getContext().eventDispatcher.startElement("mbmsInterestIndication_r12", -1);

         Asn1OctetString mbmsInterestIndication_r12_outer = new Asn1OctetString();
         mbmsInterestIndication_r12_outer.decode (buffer);
         if (mbmsInterestIndication_r12_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( mbmsInterestIndication_r12_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         mbmsInterestIndication_r12 = new MBMSInterestIndication_r11();
         mbmsInterestIndication_r12.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("mbmsInterestIndication_r12", -1);
      }
      else {
         mbmsInterestIndication_r12 = null;
      }

      // decode measResultServCellListSCG_r12

      if (measResultServCellListSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measResultServCellListSCG_r12", -1);

         measResultServCellListSCG_r12 = new MeasResultServCellListSCG_r12();
         measResultServCellListSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultServCellListSCG_r12", -1);
      }
      else {
         measResultServCellListSCG_r12 = null;
      }

      // decode drb_ToAddModListSCG_r12

      if (drb_ToAddModListSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("drb_ToAddModListSCG_r12", -1);

         drb_ToAddModListSCG_r12 = new DRB_InfoListSCG_r12();
         drb_ToAddModListSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drb_ToAddModListSCG_r12", -1);
      }
      else {
         drb_ToAddModListSCG_r12 = null;
      }

      // decode drb_ToReleaseListSCG_r12

      if (drb_ToReleaseListSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("drb_ToReleaseListSCG_r12", -1);

         drb_ToReleaseListSCG_r12 = new DRB_ToReleaseList();
         drb_ToReleaseListSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drb_ToReleaseListSCG_r12", -1);
      }
      else {
         drb_ToReleaseListSCG_r12 = null;
      }

      // decode sCellToAddModListSCG_r12

      if (sCellToAddModListSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sCellToAddModListSCG_r12", -1);

         sCellToAddModListSCG_r12 = new SCellToAddModListSCG_r12();
         sCellToAddModListSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sCellToAddModListSCG_r12", -1);
      }
      else {
         sCellToAddModListSCG_r12 = null;
      }

      // decode sCellToReleaseListSCG_r12

      if (sCellToReleaseListSCG_r12Present) {
         buffer.getContext().eventDispatcher.startElement("sCellToReleaseListSCG_r12", -1);

         sCellToReleaseListSCG_r12 = new SCellToReleaseList_r10();
         sCellToReleaseListSCG_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sCellToReleaseListSCG_r12", -1);
      }
      else {
         sCellToReleaseListSCG_r12 = null;
      }

      // decode p_Max_r12

      if (p_Max_r12Present) {
         buffer.getContext().eventDispatcher.startElement("p_Max_r12", -1);

         p_Max_r12 = new P_Max();
         p_Max_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p_Max_r12", -1);
      }
      else {
         p_Max_r12 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SCG_ConfigInfo_v1310_IEs();
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
      if (radioResourceConfigDedMCG_r12 != null) radioResourceConfigDedMCG_r12.print (_sb, "radioResourceConfigDedMCG_r12", _level+1);
      if (sCellToAddModListMCG_r12 != null) sCellToAddModListMCG_r12.print (_sb, "sCellToAddModListMCG_r12", _level+1);
      if (measGapConfig_r12 != null) measGapConfig_r12.print (_sb, "measGapConfig_r12", _level+1);
      if (powerCoordinationInfo_r12 != null) powerCoordinationInfo_r12.print (_sb, "powerCoordinationInfo_r12", _level+1);
      if (scg_RadioConfig_r12 != null) scg_RadioConfig_r12.print (_sb, "scg_RadioConfig_r12", _level+1);
      if (eutra_CapabilityInfo_r12 != null) eutra_CapabilityInfo_r12.print (_sb, "eutra_CapabilityInfo_r12", _level+1);
      if (scg_ConfigRestrictInfo_r12 != null) scg_ConfigRestrictInfo_r12.print (_sb, "scg_ConfigRestrictInfo_r12", _level+1);
      if (mbmsInterestIndication_r12 != null) mbmsInterestIndication_r12.print (_sb, "mbmsInterestIndication_r12", _level+1);
      if (measResultServCellListSCG_r12 != null) measResultServCellListSCG_r12.print (_sb, "measResultServCellListSCG_r12", _level+1);
      if (drb_ToAddModListSCG_r12 != null) drb_ToAddModListSCG_r12.print (_sb, "drb_ToAddModListSCG_r12", _level+1);
      if (drb_ToReleaseListSCG_r12 != null) drb_ToReleaseListSCG_r12.print (_sb, "drb_ToReleaseListSCG_r12", _level+1);
      if (sCellToAddModListSCG_r12 != null) sCellToAddModListSCG_r12.print (_sb, "sCellToAddModListSCG_r12", _level+1);
      if (sCellToReleaseListSCG_r12 != null) sCellToReleaseListSCG_r12.print (_sb, "sCellToReleaseListSCG_r12", _level+1);
      if (p_Max_r12 != null) p_Max_r12.print (_sb, "p_Max_r12", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
