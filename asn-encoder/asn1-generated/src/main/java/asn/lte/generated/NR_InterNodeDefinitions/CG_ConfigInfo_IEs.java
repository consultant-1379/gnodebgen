/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.UE_CapabilityRAT_ContainerList;
import asn.lte.generated.NR_RRC_Definitions.MeasResultList2NR;
import asn.lte.generated.NR_RRC_Definitions.MeasResultCellListSFTD_NR;
import asn.lte.generated.NR_RRC_Definitions.RRCReconfiguration;
import asn.lte.generated.NR_RRC_Definitions.RadioBearerConfig;

public class CG_ConfigInfo_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-ConfigInfo-IEs";
   }

   public UE_CapabilityRAT_ContainerList ue_CapabilityInfo;  // optional
   public MeasResultList2NR candidateCellInfoListMN;  // optional
   public MeasResultList2NR candidateCellInfoListSN;  // optional
   public MeasResultCellListSFTD_NR measResultCellListSFTD_NR;  // optional
   public CG_ConfigInfo_IEs_scgFailureInfo scgFailureInfo;  // optional
   public ConfigRestrictInfoSCG configRestrictInfo;  // optional
   public DRX_Info drx_InfoMCG;  // optional
   public MeasConfigMN measConfigMN;  // optional
   public RRCReconfiguration sourceConfigSCG;  // optional
   public RadioBearerConfig scg_RB_Config;  // optional
   public RadioBearerConfig mcg_RB_Config;  // optional
   public MRDC_AssistanceInfo mrdc_AssistanceInfo;  // optional
   public CG_ConfigInfo_v1540_IEs nonCriticalExtension;  // optional

   public CG_ConfigInfo_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_IEs (
      UE_CapabilityRAT_ContainerList ue_CapabilityInfo_,
      MeasResultList2NR candidateCellInfoListMN_,
      MeasResultList2NR candidateCellInfoListSN_,
      MeasResultCellListSFTD_NR measResultCellListSFTD_NR_,
      CG_ConfigInfo_IEs_scgFailureInfo scgFailureInfo_,
      ConfigRestrictInfoSCG configRestrictInfo_,
      DRX_Info drx_InfoMCG_,
      MeasConfigMN measConfigMN_,
      RRCReconfiguration sourceConfigSCG_,
      RadioBearerConfig scg_RB_Config_,
      RadioBearerConfig mcg_RB_Config_,
      MRDC_AssistanceInfo mrdc_AssistanceInfo_,
      CG_ConfigInfo_v1540_IEs nonCriticalExtension_
   ) {
      super();
      ue_CapabilityInfo = ue_CapabilityInfo_;
      candidateCellInfoListMN = candidateCellInfoListMN_;
      candidateCellInfoListSN = candidateCellInfoListSN_;
      measResultCellListSFTD_NR = measResultCellListSFTD_NR_;
      scgFailureInfo = scgFailureInfo_;
      configRestrictInfo = configRestrictInfo_;
      drx_InfoMCG = drx_InfoMCG_;
      measConfigMN = measConfigMN_;
      sourceConfigSCG = sourceConfigSCG_;
      scg_RB_Config = scg_RB_Config_;
      mcg_RB_Config = mcg_RB_Config_;
      mrdc_AssistanceInfo = mrdc_AssistanceInfo_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_CapabilityInfo = null;
      candidateCellInfoListMN = null;
      candidateCellInfoListSN = null;
      measResultCellListSFTD_NR = null;
      scgFailureInfo = null;
      configRestrictInfo = null;
      drx_InfoMCG = null;
      measConfigMN = null;
      sourceConfigSCG = null;
      scg_RB_Config = null;
      mcg_RB_Config = null;
      mrdc_AssistanceInfo = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 13; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_CapabilityInfo;
         case 1: return candidateCellInfoListMN;
         case 2: return candidateCellInfoListSN;
         case 3: return measResultCellListSFTD_NR;
         case 4: return scgFailureInfo;
         case 5: return configRestrictInfo;
         case 6: return drx_InfoMCG;
         case 7: return measConfigMN;
         case 8: return sourceConfigSCG;
         case 9: return scg_RB_Config;
         case 10: return mcg_RB_Config;
         case 11: return mrdc_AssistanceInfo;
         case 12: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-CapabilityInfo";
         case 1: return "candidateCellInfoListMN";
         case 2: return "candidateCellInfoListSN";
         case 3: return "measResultCellListSFTD-NR";
         case 4: return "scgFailureInfo";
         case 5: return "configRestrictInfo";
         case 6: return "drx-InfoMCG";
         case 7: return "measConfigMN";
         case 8: return "sourceConfigSCG";
         case 9: return "scg-RB-Config";
         case 10: return "mcg-RB-Config";
         case 11: return "mrdc-AssistanceInfo";
         case 12: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_CapabilityInfoPresent = buffer.decodeBit ("ue_CapabilityInfoPresent");
      boolean candidateCellInfoListMNPresent = buffer.decodeBit ("candidateCellInfoListMNPresent");
      boolean candidateCellInfoListSNPresent = buffer.decodeBit ("candidateCellInfoListSNPresent");
      boolean measResultCellListSFTD_NRPresent = buffer.decodeBit ("measResultCellListSFTD_NRPresent");
      boolean scgFailureInfoPresent = buffer.decodeBit ("scgFailureInfoPresent");
      boolean configRestrictInfoPresent = buffer.decodeBit ("configRestrictInfoPresent");
      boolean drx_InfoMCGPresent = buffer.decodeBit ("drx_InfoMCGPresent");
      boolean measConfigMNPresent = buffer.decodeBit ("measConfigMNPresent");
      boolean sourceConfigSCGPresent = buffer.decodeBit ("sourceConfigSCGPresent");
      boolean scg_RB_ConfigPresent = buffer.decodeBit ("scg_RB_ConfigPresent");
      boolean mcg_RB_ConfigPresent = buffer.decodeBit ("mcg_RB_ConfigPresent");
      boolean mrdc_AssistanceInfoPresent = buffer.decodeBit ("mrdc_AssistanceInfoPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_CapabilityInfo

      if (ue_CapabilityInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("ue_CapabilityInfo", -1);

         Asn1OctetString ue_CapabilityInfo_outer = new Asn1OctetString();
         ue_CapabilityInfo_outer.decode (buffer);
         if (ue_CapabilityInfo_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( ue_CapabilityInfo_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         ue_CapabilityInfo = new UE_CapabilityRAT_ContainerList();
         ue_CapabilityInfo.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("ue_CapabilityInfo", -1);
      }
      else {
         ue_CapabilityInfo = null;
      }

      // decode candidateCellInfoListMN

      if (candidateCellInfoListMNPresent) {
         buffer.getContext().eventDispatcher.startElement("candidateCellInfoListMN", -1);

         candidateCellInfoListMN = new MeasResultList2NR();
         candidateCellInfoListMN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("candidateCellInfoListMN", -1);
      }
      else {
         candidateCellInfoListMN = null;
      }

      // decode candidateCellInfoListSN

      if (candidateCellInfoListSNPresent) {
         buffer.getContext().eventDispatcher.startElement("candidateCellInfoListSN", -1);

         Asn1OctetString candidateCellInfoListSN_outer = new Asn1OctetString();
         candidateCellInfoListSN_outer.decode (buffer);
         if (candidateCellInfoListSN_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( candidateCellInfoListSN_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         candidateCellInfoListSN = new MeasResultList2NR();
         candidateCellInfoListSN.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("candidateCellInfoListSN", -1);
      }
      else {
         candidateCellInfoListSN = null;
      }

      // decode measResultCellListSFTD_NR

      if (measResultCellListSFTD_NRPresent) {
         buffer.getContext().eventDispatcher.startElement("measResultCellListSFTD_NR", -1);

         measResultCellListSFTD_NR = new MeasResultCellListSFTD_NR();
         measResultCellListSFTD_NR.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultCellListSFTD_NR", -1);
      }
      else {
         measResultCellListSFTD_NR = null;
      }

      // decode scgFailureInfo

      if (scgFailureInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfo", -1);

         scgFailureInfo = new CG_ConfigInfo_IEs_scgFailureInfo();
         scgFailureInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scgFailureInfo", -1);
      }
      else {
         scgFailureInfo = null;
      }

      // decode configRestrictInfo

      if (configRestrictInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("configRestrictInfo", -1);

         configRestrictInfo = new ConfigRestrictInfoSCG();
         configRestrictInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("configRestrictInfo", -1);
      }
      else {
         configRestrictInfo = null;
      }

      // decode drx_InfoMCG

      if (drx_InfoMCGPresent) {
         buffer.getContext().eventDispatcher.startElement("drx_InfoMCG", -1);

         drx_InfoMCG = new DRX_Info();
         drx_InfoMCG.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drx_InfoMCG", -1);
      }
      else {
         drx_InfoMCG = null;
      }

      // decode measConfigMN

      if (measConfigMNPresent) {
         buffer.getContext().eventDispatcher.startElement("measConfigMN", -1);

         measConfigMN = new MeasConfigMN();
         measConfigMN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measConfigMN", -1);
      }
      else {
         measConfigMN = null;
      }

      // decode sourceConfigSCG

      if (sourceConfigSCGPresent) {
         buffer.getContext().eventDispatcher.startElement("sourceConfigSCG", -1);

         Asn1OctetString sourceConfigSCG_outer = new Asn1OctetString();
         sourceConfigSCG_outer.decode (buffer);
         if (sourceConfigSCG_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( sourceConfigSCG_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         sourceConfigSCG = new RRCReconfiguration();
         sourceConfigSCG.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("sourceConfigSCG", -1);
      }
      else {
         sourceConfigSCG = null;
      }

      // decode scg_RB_Config

      if (scg_RB_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("scg_RB_Config", -1);

         Asn1OctetString scg_RB_Config_outer = new Asn1OctetString();
         scg_RB_Config_outer.decode (buffer);
         if (scg_RB_Config_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( scg_RB_Config_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         scg_RB_Config = new RadioBearerConfig();
         scg_RB_Config.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("scg_RB_Config", -1);
      }
      else {
         scg_RB_Config = null;
      }

      // decode mcg_RB_Config

      if (mcg_RB_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("mcg_RB_Config", -1);

         Asn1OctetString mcg_RB_Config_outer = new Asn1OctetString();
         mcg_RB_Config_outer.decode (buffer);
         if (mcg_RB_Config_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( mcg_RB_Config_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         mcg_RB_Config = new RadioBearerConfig();
         mcg_RB_Config.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("mcg_RB_Config", -1);
      }
      else {
         mcg_RB_Config = null;
      }

      // decode mrdc_AssistanceInfo

      if (mrdc_AssistanceInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("mrdc_AssistanceInfo", -1);

         mrdc_AssistanceInfo = new MRDC_AssistanceInfo();
         mrdc_AssistanceInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mrdc_AssistanceInfo", -1);
      }
      else {
         mrdc_AssistanceInfo = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CG_ConfigInfo_v1540_IEs();
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
      if (ue_CapabilityInfo != null) ue_CapabilityInfo.print (_sb, "ue_CapabilityInfo", _level+1);
      if (candidateCellInfoListMN != null) candidateCellInfoListMN.print (_sb, "candidateCellInfoListMN", _level+1);
      if (candidateCellInfoListSN != null) candidateCellInfoListSN.print (_sb, "candidateCellInfoListSN", _level+1);
      if (measResultCellListSFTD_NR != null) measResultCellListSFTD_NR.print (_sb, "measResultCellListSFTD_NR", _level+1);
      if (scgFailureInfo != null) scgFailureInfo.print (_sb, "scgFailureInfo", _level+1);
      if (configRestrictInfo != null) configRestrictInfo.print (_sb, "configRestrictInfo", _level+1);
      if (drx_InfoMCG != null) drx_InfoMCG.print (_sb, "drx_InfoMCG", _level+1);
      if (measConfigMN != null) measConfigMN.print (_sb, "measConfigMN", _level+1);
      if (sourceConfigSCG != null) sourceConfigSCG.print (_sb, "sourceConfigSCG", _level+1);
      if (scg_RB_Config != null) scg_RB_Config.print (_sb, "scg_RB_Config", _level+1);
      if (mcg_RB_Config != null) mcg_RB_Config.print (_sb, "mcg_RB_Config", _level+1);
      if (mrdc_AssistanceInfo != null) mrdc_AssistanceInfo.print (_sb, "mrdc_AssistanceInfo", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
