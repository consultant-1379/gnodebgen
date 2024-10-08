/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersSharedSpectrumChAccess_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Phy-ParametersSharedSpectrumChAccess-r16";
   }

   public Phy_ParametersSharedSpectrumChAccess_r16_ss_SINR_Meas_r16 ss_SINR_Meas_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUCCH_r16 sp_CSI_ReportPUCCH_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUSCH_r16 sp_CSI_ReportPUSCH_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_dynamicSFI_r16 dynamicSFI_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_PUCCH_r16 mux_SR_HARQ_ACK_PUCCH_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_mux_HARQ_ACK_PUSCH_DiffSymbol_r16 mux_HARQ_ACK_PUSCH_DiffSymbol_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_pucch_Repetition_F1_3_4_r16 pucch_Repetition_F1_3_4_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_type1_PUSCH_RepetitionMultiSlots_r16 type1_PUSCH_RepetitionMultiSlots_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_type2_PUSCH_RepetitionMultiSlots_r16 type2_PUSCH_RepetitionMultiSlots_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_pusch_RepetitionMultiSlots_r16 pusch_RepetitionMultiSlots_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_pdsch_RepetitionMultiSlots_r16 pdsch_RepetitionMultiSlots_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_downlinkSPS_r16 downlinkSPS_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType1_r16 configuredUL_GrantType1_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType2_r16 configuredUL_GrantType2_r16 = null;  // optional
   public Phy_ParametersSharedSpectrumChAccess_r16_pre_EmptIndication_DL_r16 pre_EmptIndication_DL_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public Phy_ParametersSharedSpectrumChAccess_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Phy_ParametersSharedSpectrumChAccess_r16 (
      Phy_ParametersSharedSpectrumChAccess_r16_ss_SINR_Meas_r16 ss_SINR_Meas_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUCCH_r16 sp_CSI_ReportPUCCH_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUSCH_r16 sp_CSI_ReportPUSCH_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_dynamicSFI_r16 dynamicSFI_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_PUCCH_r16 mux_SR_HARQ_ACK_PUCCH_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_mux_HARQ_ACK_PUSCH_DiffSymbol_r16 mux_HARQ_ACK_PUSCH_DiffSymbol_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_pucch_Repetition_F1_3_4_r16 pucch_Repetition_F1_3_4_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_type1_PUSCH_RepetitionMultiSlots_r16 type1_PUSCH_RepetitionMultiSlots_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_type2_PUSCH_RepetitionMultiSlots_r16 type2_PUSCH_RepetitionMultiSlots_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_pusch_RepetitionMultiSlots_r16 pusch_RepetitionMultiSlots_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_pdsch_RepetitionMultiSlots_r16 pdsch_RepetitionMultiSlots_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_downlinkSPS_r16 downlinkSPS_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType1_r16 configuredUL_GrantType1_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType2_r16 configuredUL_GrantType2_r16_,
      Phy_ParametersSharedSpectrumChAccess_r16_pre_EmptIndication_DL_r16 pre_EmptIndication_DL_r16_
   ) {
      super();
      ss_SINR_Meas_r16 = ss_SINR_Meas_r16_;
      sp_CSI_ReportPUCCH_r16 = sp_CSI_ReportPUCCH_r16_;
      sp_CSI_ReportPUSCH_r16 = sp_CSI_ReportPUSCH_r16_;
      dynamicSFI_r16 = dynamicSFI_r16_;
      mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 = mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16_;
      mux_SR_HARQ_ACK_PUCCH_r16 = mux_SR_HARQ_ACK_PUCCH_r16_;
      mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 = mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16_;
      mux_HARQ_ACK_PUSCH_DiffSymbol_r16 = mux_HARQ_ACK_PUSCH_DiffSymbol_r16_;
      pucch_Repetition_F1_3_4_r16 = pucch_Repetition_F1_3_4_r16_;
      type1_PUSCH_RepetitionMultiSlots_r16 = type1_PUSCH_RepetitionMultiSlots_r16_;
      type2_PUSCH_RepetitionMultiSlots_r16 = type2_PUSCH_RepetitionMultiSlots_r16_;
      pusch_RepetitionMultiSlots_r16 = pusch_RepetitionMultiSlots_r16_;
      pdsch_RepetitionMultiSlots_r16 = pdsch_RepetitionMultiSlots_r16_;
      downlinkSPS_r16 = downlinkSPS_r16_;
      configuredUL_GrantType1_r16 = configuredUL_GrantType1_r16_;
      configuredUL_GrantType2_r16 = configuredUL_GrantType2_r16_;
      pre_EmptIndication_DL_r16 = pre_EmptIndication_DL_r16_;
   }

   public void init () {
      ss_SINR_Meas_r16 = null;
      sp_CSI_ReportPUCCH_r16 = null;
      sp_CSI_ReportPUSCH_r16 = null;
      dynamicSFI_r16 = null;
      mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 = null;
      mux_SR_HARQ_ACK_PUCCH_r16 = null;
      mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 = null;
      mux_HARQ_ACK_PUSCH_DiffSymbol_r16 = null;
      pucch_Repetition_F1_3_4_r16 = null;
      type1_PUSCH_RepetitionMultiSlots_r16 = null;
      type2_PUSCH_RepetitionMultiSlots_r16 = null;
      pusch_RepetitionMultiSlots_r16 = null;
      pdsch_RepetitionMultiSlots_r16 = null;
      downlinkSPS_r16 = null;
      configuredUL_GrantType1_r16 = null;
      configuredUL_GrantType2_r16 = null;
      pre_EmptIndication_DL_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 18; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ss_SINR_Meas_r16;
         case 1: return sp_CSI_ReportPUCCH_r16;
         case 2: return sp_CSI_ReportPUSCH_r16;
         case 3: return dynamicSFI_r16;
         case 4: return mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16;
         case 5: return mux_SR_HARQ_ACK_PUCCH_r16;
         case 6: return mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16;
         case 7: return mux_HARQ_ACK_PUSCH_DiffSymbol_r16;
         case 8: return pucch_Repetition_F1_3_4_r16;
         case 9: return type1_PUSCH_RepetitionMultiSlots_r16;
         case 10: return type2_PUSCH_RepetitionMultiSlots_r16;
         case 11: return pusch_RepetitionMultiSlots_r16;
         case 12: return pdsch_RepetitionMultiSlots_r16;
         case 13: return downlinkSPS_r16;
         case 14: return configuredUL_GrantType1_r16;
         case 15: return configuredUL_GrantType2_r16;
         case 16: return pre_EmptIndication_DL_r16;
         case 17: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ss-SINR-Meas-r16";
         case 1: return "sp-CSI-ReportPUCCH-r16";
         case 2: return "sp-CSI-ReportPUSCH-r16";
         case 3: return "dynamicSFI-r16";
         case 4: return "mux-SR-HARQ-ACK-CSI-PUCCH-OncePerSlot-r16";
         case 5: return "mux-SR-HARQ-ACK-PUCCH-r16";
         case 6: return "mux-SR-HARQ-ACK-CSI-PUCCH-MultiPerSlot-r16";
         case 7: return "mux-HARQ-ACK-PUSCH-DiffSymbol-r16";
         case 8: return "pucch-Repetition-F1-3-4-r16";
         case 9: return "type1-PUSCH-RepetitionMultiSlots-r16";
         case 10: return "type2-PUSCH-RepetitionMultiSlots-r16";
         case 11: return "pusch-RepetitionMultiSlots-r16";
         case 12: return "pdsch-RepetitionMultiSlots-r16";
         case 13: return "downlinkSPS-r16";
         case 14: return "configuredUL-GrantType1-r16";
         case 15: return "configuredUL-GrantType2-r16";
         case 16: return "pre-EmptIndication-DL-r16";
         case 17: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean ss_SINR_Meas_r16Present = buffer.decodeBit ("ss_SINR_Meas_r16Present");
      boolean sp_CSI_ReportPUCCH_r16Present = buffer.decodeBit ("sp_CSI_ReportPUCCH_r16Present");
      boolean sp_CSI_ReportPUSCH_r16Present = buffer.decodeBit ("sp_CSI_ReportPUSCH_r16Present");
      boolean dynamicSFI_r16Present = buffer.decodeBit ("dynamicSFI_r16Present");
      boolean mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16Present = buffer.decodeBit ("mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16Present");
      boolean mux_SR_HARQ_ACK_PUCCH_r16Present = buffer.decodeBit ("mux_SR_HARQ_ACK_PUCCH_r16Present");
      boolean mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16Present = buffer.decodeBit ("mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16Present");
      boolean mux_HARQ_ACK_PUSCH_DiffSymbol_r16Present = buffer.decodeBit ("mux_HARQ_ACK_PUSCH_DiffSymbol_r16Present");
      boolean pucch_Repetition_F1_3_4_r16Present = buffer.decodeBit ("pucch_Repetition_F1_3_4_r16Present");
      boolean type1_PUSCH_RepetitionMultiSlots_r16Present = buffer.decodeBit ("type1_PUSCH_RepetitionMultiSlots_r16Present");
      boolean type2_PUSCH_RepetitionMultiSlots_r16Present = buffer.decodeBit ("type2_PUSCH_RepetitionMultiSlots_r16Present");
      boolean pusch_RepetitionMultiSlots_r16Present = buffer.decodeBit ("pusch_RepetitionMultiSlots_r16Present");
      boolean pdsch_RepetitionMultiSlots_r16Present = buffer.decodeBit ("pdsch_RepetitionMultiSlots_r16Present");
      boolean downlinkSPS_r16Present = buffer.decodeBit ("downlinkSPS_r16Present");
      boolean configuredUL_GrantType1_r16Present = buffer.decodeBit ("configuredUL_GrantType1_r16Present");
      boolean configuredUL_GrantType2_r16Present = buffer.decodeBit ("configuredUL_GrantType2_r16Present");
      boolean pre_EmptIndication_DL_r16Present = buffer.decodeBit ("pre_EmptIndication_DL_r16Present");

      // decode ss_SINR_Meas_r16

      if (ss_SINR_Meas_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ss_SINR_Meas_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_ss_SINR_Meas_r16.decodeEnumValue (buffer);
         ss_SINR_Meas_r16 = Phy_ParametersSharedSpectrumChAccess_r16_ss_SINR_Meas_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ss_SINR_Meas_r16", -1);
      }
      else {
         ss_SINR_Meas_r16 = null;
      }

      // decode sp_CSI_ReportPUCCH_r16

      if (sp_CSI_ReportPUCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sp_CSI_ReportPUCCH_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUCCH_r16.decodeEnumValue (buffer);
         sp_CSI_ReportPUCCH_r16 = Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUCCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sp_CSI_ReportPUCCH_r16", -1);
      }
      else {
         sp_CSI_ReportPUCCH_r16 = null;
      }

      // decode sp_CSI_ReportPUSCH_r16

      if (sp_CSI_ReportPUSCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sp_CSI_ReportPUSCH_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUSCH_r16.decodeEnumValue (buffer);
         sp_CSI_ReportPUSCH_r16 = Phy_ParametersSharedSpectrumChAccess_r16_sp_CSI_ReportPUSCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sp_CSI_ReportPUSCH_r16", -1);
      }
      else {
         sp_CSI_ReportPUSCH_r16 = null;
      }

      // decode dynamicSFI_r16

      if (dynamicSFI_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dynamicSFI_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_dynamicSFI_r16.decodeEnumValue (buffer);
         dynamicSFI_r16 = Phy_ParametersSharedSpectrumChAccess_r16_dynamicSFI_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dynamicSFI_r16", -1);
      }
      else {
         dynamicSFI_r16 = null;
      }

      // decode mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16

      if (mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16", -1);

         mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 = new Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16();
         mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16", -1);
      }
      else {
         mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 = null;
      }

      // decode mux_SR_HARQ_ACK_PUCCH_r16

      if (mux_SR_HARQ_ACK_PUCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_PUCCH_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_PUCCH_r16.decodeEnumValue (buffer);
         mux_SR_HARQ_ACK_PUCCH_r16 = Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_PUCCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_PUCCH_r16", -1);
      }
      else {
         mux_SR_HARQ_ACK_PUCCH_r16 = null;
      }

      // decode mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16

      if (mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16.decodeEnumValue (buffer);
         mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 = Phy_ParametersSharedSpectrumChAccess_r16_mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16", -1);
      }
      else {
         mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 = null;
      }

      // decode mux_HARQ_ACK_PUSCH_DiffSymbol_r16

      if (mux_HARQ_ACK_PUSCH_DiffSymbol_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mux_HARQ_ACK_PUSCH_DiffSymbol_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_mux_HARQ_ACK_PUSCH_DiffSymbol_r16.decodeEnumValue (buffer);
         mux_HARQ_ACK_PUSCH_DiffSymbol_r16 = Phy_ParametersSharedSpectrumChAccess_r16_mux_HARQ_ACK_PUSCH_DiffSymbol_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mux_HARQ_ACK_PUSCH_DiffSymbol_r16", -1);
      }
      else {
         mux_HARQ_ACK_PUSCH_DiffSymbol_r16 = null;
      }

      // decode pucch_Repetition_F1_3_4_r16

      if (pucch_Repetition_F1_3_4_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pucch_Repetition_F1_3_4_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_pucch_Repetition_F1_3_4_r16.decodeEnumValue (buffer);
         pucch_Repetition_F1_3_4_r16 = Phy_ParametersSharedSpectrumChAccess_r16_pucch_Repetition_F1_3_4_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pucch_Repetition_F1_3_4_r16", -1);
      }
      else {
         pucch_Repetition_F1_3_4_r16 = null;
      }

      // decode type1_PUSCH_RepetitionMultiSlots_r16

      if (type1_PUSCH_RepetitionMultiSlots_r16Present) {
         buffer.getContext().eventDispatcher.startElement("type1_PUSCH_RepetitionMultiSlots_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_type1_PUSCH_RepetitionMultiSlots_r16.decodeEnumValue (buffer);
         type1_PUSCH_RepetitionMultiSlots_r16 = Phy_ParametersSharedSpectrumChAccess_r16_type1_PUSCH_RepetitionMultiSlots_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("type1_PUSCH_RepetitionMultiSlots_r16", -1);
      }
      else {
         type1_PUSCH_RepetitionMultiSlots_r16 = null;
      }

      // decode type2_PUSCH_RepetitionMultiSlots_r16

      if (type2_PUSCH_RepetitionMultiSlots_r16Present) {
         buffer.getContext().eventDispatcher.startElement("type2_PUSCH_RepetitionMultiSlots_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_type2_PUSCH_RepetitionMultiSlots_r16.decodeEnumValue (buffer);
         type2_PUSCH_RepetitionMultiSlots_r16 = Phy_ParametersSharedSpectrumChAccess_r16_type2_PUSCH_RepetitionMultiSlots_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("type2_PUSCH_RepetitionMultiSlots_r16", -1);
      }
      else {
         type2_PUSCH_RepetitionMultiSlots_r16 = null;
      }

      // decode pusch_RepetitionMultiSlots_r16

      if (pusch_RepetitionMultiSlots_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pusch_RepetitionMultiSlots_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_pusch_RepetitionMultiSlots_r16.decodeEnumValue (buffer);
         pusch_RepetitionMultiSlots_r16 = Phy_ParametersSharedSpectrumChAccess_r16_pusch_RepetitionMultiSlots_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pusch_RepetitionMultiSlots_r16", -1);
      }
      else {
         pusch_RepetitionMultiSlots_r16 = null;
      }

      // decode pdsch_RepetitionMultiSlots_r16

      if (pdsch_RepetitionMultiSlots_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdsch_RepetitionMultiSlots_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_pdsch_RepetitionMultiSlots_r16.decodeEnumValue (buffer);
         pdsch_RepetitionMultiSlots_r16 = Phy_ParametersSharedSpectrumChAccess_r16_pdsch_RepetitionMultiSlots_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_RepetitionMultiSlots_r16", -1);
      }
      else {
         pdsch_RepetitionMultiSlots_r16 = null;
      }

      // decode downlinkSPS_r16

      if (downlinkSPS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("downlinkSPS_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_downlinkSPS_r16.decodeEnumValue (buffer);
         downlinkSPS_r16 = Phy_ParametersSharedSpectrumChAccess_r16_downlinkSPS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("downlinkSPS_r16", -1);
      }
      else {
         downlinkSPS_r16 = null;
      }

      // decode configuredUL_GrantType1_r16

      if (configuredUL_GrantType1_r16Present) {
         buffer.getContext().eventDispatcher.startElement("configuredUL_GrantType1_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType1_r16.decodeEnumValue (buffer);
         configuredUL_GrantType1_r16 = Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType1_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("configuredUL_GrantType1_r16", -1);
      }
      else {
         configuredUL_GrantType1_r16 = null;
      }

      // decode configuredUL_GrantType2_r16

      if (configuredUL_GrantType2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("configuredUL_GrantType2_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType2_r16.decodeEnumValue (buffer);
         configuredUL_GrantType2_r16 = Phy_ParametersSharedSpectrumChAccess_r16_configuredUL_GrantType2_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("configuredUL_GrantType2_r16", -1);
      }
      else {
         configuredUL_GrantType2_r16 = null;
      }

      // decode pre_EmptIndication_DL_r16

      if (pre_EmptIndication_DL_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pre_EmptIndication_DL_r16", -1);

         int tval = Phy_ParametersSharedSpectrumChAccess_r16_pre_EmptIndication_DL_r16.decodeEnumValue (buffer);
         pre_EmptIndication_DL_r16 = Phy_ParametersSharedSpectrumChAccess_r16_pre_EmptIndication_DL_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pre_EmptIndication_DL_r16", -1);
      }
      else {
         pre_EmptIndication_DL_r16 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((ss_SINR_Meas_r16 != null), null);
      buffer.encodeBit ((sp_CSI_ReportPUCCH_r16 != null), null);
      buffer.encodeBit ((sp_CSI_ReportPUSCH_r16 != null), null);
      buffer.encodeBit ((dynamicSFI_r16 != null), null);
      buffer.encodeBit ((mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 != null), null);
      buffer.encodeBit ((mux_SR_HARQ_ACK_PUCCH_r16 != null), null);
      buffer.encodeBit ((mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 != null), null);
      buffer.encodeBit ((mux_HARQ_ACK_PUSCH_DiffSymbol_r16 != null), null);
      buffer.encodeBit ((pucch_Repetition_F1_3_4_r16 != null), null);
      buffer.encodeBit ((type1_PUSCH_RepetitionMultiSlots_r16 != null), null);
      buffer.encodeBit ((type2_PUSCH_RepetitionMultiSlots_r16 != null), null);
      buffer.encodeBit ((pusch_RepetitionMultiSlots_r16 != null), null);
      buffer.encodeBit ((pdsch_RepetitionMultiSlots_r16 != null), null);
      buffer.encodeBit ((downlinkSPS_r16 != null), null);
      buffer.encodeBit ((configuredUL_GrantType1_r16 != null), null);
      buffer.encodeBit ((configuredUL_GrantType2_r16 != null), null);
      buffer.encodeBit ((pre_EmptIndication_DL_r16 != null), null);

      // encode ss_SINR_Meas_r16

      if (ss_SINR_Meas_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ss_SINR_Meas_r16", -1);

         ss_SINR_Meas_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ss_SINR_Meas_r16", -1);
      }

      // encode sp_CSI_ReportPUCCH_r16

      if (sp_CSI_ReportPUCCH_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sp_CSI_ReportPUCCH_r16", -1);

         sp_CSI_ReportPUCCH_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sp_CSI_ReportPUCCH_r16", -1);
      }

      // encode sp_CSI_ReportPUSCH_r16

      if (sp_CSI_ReportPUSCH_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sp_CSI_ReportPUSCH_r16", -1);

         sp_CSI_ReportPUSCH_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sp_CSI_ReportPUSCH_r16", -1);
      }

      // encode dynamicSFI_r16

      if (dynamicSFI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("dynamicSFI_r16", -1);

         dynamicSFI_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dynamicSFI_r16", -1);
      }

      // encode mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16

      if (mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16", -1);

         mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16", -1);
      }

      // encode mux_SR_HARQ_ACK_PUCCH_r16

      if (mux_SR_HARQ_ACK_PUCCH_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_PUCCH_r16", -1);

         mux_SR_HARQ_ACK_PUCCH_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_PUCCH_r16", -1);
      }

      // encode mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16

      if (mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16", -1);

         mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16", -1);
      }

      // encode mux_HARQ_ACK_PUSCH_DiffSymbol_r16

      if (mux_HARQ_ACK_PUSCH_DiffSymbol_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mux_HARQ_ACK_PUSCH_DiffSymbol_r16", -1);

         mux_HARQ_ACK_PUSCH_DiffSymbol_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mux_HARQ_ACK_PUSCH_DiffSymbol_r16", -1);
      }

      // encode pucch_Repetition_F1_3_4_r16

      if (pucch_Repetition_F1_3_4_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pucch_Repetition_F1_3_4_r16", -1);

         pucch_Repetition_F1_3_4_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pucch_Repetition_F1_3_4_r16", -1);
      }

      // encode type1_PUSCH_RepetitionMultiSlots_r16

      if (type1_PUSCH_RepetitionMultiSlots_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("type1_PUSCH_RepetitionMultiSlots_r16", -1);

         type1_PUSCH_RepetitionMultiSlots_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("type1_PUSCH_RepetitionMultiSlots_r16", -1);
      }

      // encode type2_PUSCH_RepetitionMultiSlots_r16

      if (type2_PUSCH_RepetitionMultiSlots_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("type2_PUSCH_RepetitionMultiSlots_r16", -1);

         type2_PUSCH_RepetitionMultiSlots_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("type2_PUSCH_RepetitionMultiSlots_r16", -1);
      }

      // encode pusch_RepetitionMultiSlots_r16

      if (pusch_RepetitionMultiSlots_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pusch_RepetitionMultiSlots_r16", -1);

         pusch_RepetitionMultiSlots_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pusch_RepetitionMultiSlots_r16", -1);
      }

      // encode pdsch_RepetitionMultiSlots_r16

      if (pdsch_RepetitionMultiSlots_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_RepetitionMultiSlots_r16", -1);

         pdsch_RepetitionMultiSlots_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_RepetitionMultiSlots_r16", -1);
      }

      // encode downlinkSPS_r16

      if (downlinkSPS_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("downlinkSPS_r16", -1);

         downlinkSPS_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("downlinkSPS_r16", -1);
      }

      // encode configuredUL_GrantType1_r16

      if (configuredUL_GrantType1_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("configuredUL_GrantType1_r16", -1);

         configuredUL_GrantType1_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("configuredUL_GrantType1_r16", -1);
      }

      // encode configuredUL_GrantType2_r16

      if (configuredUL_GrantType2_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("configuredUL_GrantType2_r16", -1);

         configuredUL_GrantType2_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("configuredUL_GrantType2_r16", -1);
      }

      // encode pre_EmptIndication_DL_r16

      if (pre_EmptIndication_DL_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pre_EmptIndication_DL_r16", -1);

         pre_EmptIndication_DL_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pre_EmptIndication_DL_r16", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ss_SINR_Meas_r16 != null) ss_SINR_Meas_r16.print (_sb, "ss_SINR_Meas_r16", _level+1);
      if (sp_CSI_ReportPUCCH_r16 != null) sp_CSI_ReportPUCCH_r16.print (_sb, "sp_CSI_ReportPUCCH_r16", _level+1);
      if (sp_CSI_ReportPUSCH_r16 != null) sp_CSI_ReportPUSCH_r16.print (_sb, "sp_CSI_ReportPUSCH_r16", _level+1);
      if (dynamicSFI_r16 != null) dynamicSFI_r16.print (_sb, "dynamicSFI_r16", _level+1);
      if (mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16 != null) mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16.print (_sb, "mux_SR_HARQ_ACK_CSI_PUCCH_OncePerSlot_r16", _level+1);
      if (mux_SR_HARQ_ACK_PUCCH_r16 != null) mux_SR_HARQ_ACK_PUCCH_r16.print (_sb, "mux_SR_HARQ_ACK_PUCCH_r16", _level+1);
      if (mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16 != null) mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16.print (_sb, "mux_SR_HARQ_ACK_CSI_PUCCH_MultiPerSlot_r16", _level+1);
      if (mux_HARQ_ACK_PUSCH_DiffSymbol_r16 != null) mux_HARQ_ACK_PUSCH_DiffSymbol_r16.print (_sb, "mux_HARQ_ACK_PUSCH_DiffSymbol_r16", _level+1);
      if (pucch_Repetition_F1_3_4_r16 != null) pucch_Repetition_F1_3_4_r16.print (_sb, "pucch_Repetition_F1_3_4_r16", _level+1);
      if (type1_PUSCH_RepetitionMultiSlots_r16 != null) type1_PUSCH_RepetitionMultiSlots_r16.print (_sb, "type1_PUSCH_RepetitionMultiSlots_r16", _level+1);
      if (type2_PUSCH_RepetitionMultiSlots_r16 != null) type2_PUSCH_RepetitionMultiSlots_r16.print (_sb, "type2_PUSCH_RepetitionMultiSlots_r16", _level+1);
      if (pusch_RepetitionMultiSlots_r16 != null) pusch_RepetitionMultiSlots_r16.print (_sb, "pusch_RepetitionMultiSlots_r16", _level+1);
      if (pdsch_RepetitionMultiSlots_r16 != null) pdsch_RepetitionMultiSlots_r16.print (_sb, "pdsch_RepetitionMultiSlots_r16", _level+1);
      if (downlinkSPS_r16 != null) downlinkSPS_r16.print (_sb, "downlinkSPS_r16", _level+1);
      if (configuredUL_GrantType1_r16 != null) configuredUL_GrantType1_r16.print (_sb, "configuredUL_GrantType1_r16", _level+1);
      if (configuredUL_GrantType2_r16 != null) configuredUL_GrantType2_r16.print (_sb, "configuredUL_GrantType2_r16", _level+1);
      if (pre_EmptIndication_DL_r16 != null) pre_EmptIndication_DL_r16.print (_sb, "pre_EmptIndication_DL_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
