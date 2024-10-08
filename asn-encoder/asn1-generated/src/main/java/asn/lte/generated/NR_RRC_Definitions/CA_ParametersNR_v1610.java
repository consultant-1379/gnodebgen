/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNR_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CA-ParametersNR-v1610";
   }

   public CA_ParametersNR_v1610_parallelTxMsgA_SRS_PUCCH_PUSCH_r16 parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = null;  // optional
   public CA_ParametersNR_v1610_msgA_SUL_r16 msgA_SUL_r16 = null;  // optional
   public CA_ParametersNR_v1610_jointSearchSpaceGroupSwitchingAcrossCells_r16 jointSearchSpaceGroupSwitchingAcrossCells_r16 = null;  // optional
   public CA_ParametersNR_v1610_half_DuplexTDD_CA_SameSCS_r16 half_DuplexTDD_CA_SameSCS_r16 = null;  // optional
   public CA_ParametersNR_v1610_scellDormancyWithinActiveTime_r16 scellDormancyWithinActiveTime_r16 = null;  // optional
   public CA_ParametersNR_v1610_scellDormancyOutsideActiveTime_r16 scellDormancyOutsideActiveTime_r16 = null;  // optional
   public CA_ParametersNR_v1610_crossCarrierA_CSI_trigDiffSCS_r16 crossCarrierA_CSI_trigDiffSCS_r16 = null;  // optional
   public CA_ParametersNR_v1610_defaultQCL_CrossCarrierA_CSI_Trig_r16 defaultQCL_CrossCarrierA_CSI_Trig_r16 = null;  // optional
   public CA_ParametersNR_v1610_interCA_NonAlignedFrame_r16 interCA_NonAlignedFrame_r16 = null;  // optional
   public CA_ParametersNR_v1610_simul_SRS_Trans_BC_r16 simul_SRS_Trans_BC_r16 = null;  // optional
   public CA_ParametersNR_v1610_interFreqDAPS_r16 interFreqDAPS_r16;  // optional
   public CodebookParameters_v1610 codebookParametersPerBC_r16;  // optional
   public Asn1Integer blindDetectFactor_r16;  // optional
   public CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 pdcch_MonitoringCA_r16;  // optional
   public CA_ParametersNR_v1610_pdcch_BlindDetectionCA_Mixed_r16 pdcch_BlindDetectionCA_Mixed_r16;  // optional
   public Asn1Integer pdcch_BlindDetectionMCG_UE_r16;  // optional
   public Asn1Integer pdcch_BlindDetectionSCG_UE_r16;  // optional
   public CA_ParametersNR_v1610_pdcch_BlindDetectionMCG_UE_Mixed_r16 pdcch_BlindDetectionMCG_UE_Mixed_r16;  // optional
   public CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 pdcch_BlindDetectionSCG_UE_Mixed_r16;  // optional
   public CA_ParametersNR_v1610_crossCarrierSchedulingDL_DiffSCS_r16 crossCarrierSchedulingDL_DiffSCS_r16 = null;  // optional
   public CA_ParametersNR_v1610_crossCarrierSchedulingDefaultQCL_r16 crossCarrierSchedulingDefaultQCL_r16 = null;  // optional
   public CA_ParametersNR_v1610_crossCarrierSchedulingUL_DiffSCS_r16 crossCarrierSchedulingUL_DiffSCS_r16 = null;  // optional
   public CA_ParametersNR_v1610_simul_SRS_MIMO_Trans_BC_r16 simul_SRS_MIMO_Trans_BC_r16 = null;  // optional
   public CodebookParametersAdditionPerBC_r16 codebookParametersAdditionPerBC_r16;  // optional
   public CodebookComboParametersAdditionPerBC_r16 codebookComboParametersAdditionPerBC_r16;  // optional

   public CA_ParametersNR_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CA_ParametersNR_v1610 (
      CA_ParametersNR_v1610_parallelTxMsgA_SRS_PUCCH_PUSCH_r16 parallelTxMsgA_SRS_PUCCH_PUSCH_r16_,
      CA_ParametersNR_v1610_msgA_SUL_r16 msgA_SUL_r16_,
      CA_ParametersNR_v1610_jointSearchSpaceGroupSwitchingAcrossCells_r16 jointSearchSpaceGroupSwitchingAcrossCells_r16_,
      CA_ParametersNR_v1610_half_DuplexTDD_CA_SameSCS_r16 half_DuplexTDD_CA_SameSCS_r16_,
      CA_ParametersNR_v1610_scellDormancyWithinActiveTime_r16 scellDormancyWithinActiveTime_r16_,
      CA_ParametersNR_v1610_scellDormancyOutsideActiveTime_r16 scellDormancyOutsideActiveTime_r16_,
      CA_ParametersNR_v1610_crossCarrierA_CSI_trigDiffSCS_r16 crossCarrierA_CSI_trigDiffSCS_r16_,
      CA_ParametersNR_v1610_defaultQCL_CrossCarrierA_CSI_Trig_r16 defaultQCL_CrossCarrierA_CSI_Trig_r16_,
      CA_ParametersNR_v1610_interCA_NonAlignedFrame_r16 interCA_NonAlignedFrame_r16_,
      CA_ParametersNR_v1610_simul_SRS_Trans_BC_r16 simul_SRS_Trans_BC_r16_,
      CA_ParametersNR_v1610_interFreqDAPS_r16 interFreqDAPS_r16_,
      CodebookParameters_v1610 codebookParametersPerBC_r16_,
      Asn1Integer blindDetectFactor_r16_,
      CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 pdcch_MonitoringCA_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionCA_Mixed_r16 pdcch_BlindDetectionCA_Mixed_r16_,
      Asn1Integer pdcch_BlindDetectionMCG_UE_r16_,
      Asn1Integer pdcch_BlindDetectionSCG_UE_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionMCG_UE_Mixed_r16 pdcch_BlindDetectionMCG_UE_Mixed_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 pdcch_BlindDetectionSCG_UE_Mixed_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingDL_DiffSCS_r16 crossCarrierSchedulingDL_DiffSCS_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingDefaultQCL_r16 crossCarrierSchedulingDefaultQCL_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingUL_DiffSCS_r16 crossCarrierSchedulingUL_DiffSCS_r16_,
      CA_ParametersNR_v1610_simul_SRS_MIMO_Trans_BC_r16 simul_SRS_MIMO_Trans_BC_r16_,
      CodebookParametersAdditionPerBC_r16 codebookParametersAdditionPerBC_r16_,
      CodebookComboParametersAdditionPerBC_r16 codebookComboParametersAdditionPerBC_r16_
   ) {
      super();
      parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = parallelTxMsgA_SRS_PUCCH_PUSCH_r16_;
      msgA_SUL_r16 = msgA_SUL_r16_;
      jointSearchSpaceGroupSwitchingAcrossCells_r16 = jointSearchSpaceGroupSwitchingAcrossCells_r16_;
      half_DuplexTDD_CA_SameSCS_r16 = half_DuplexTDD_CA_SameSCS_r16_;
      scellDormancyWithinActiveTime_r16 = scellDormancyWithinActiveTime_r16_;
      scellDormancyOutsideActiveTime_r16 = scellDormancyOutsideActiveTime_r16_;
      crossCarrierA_CSI_trigDiffSCS_r16 = crossCarrierA_CSI_trigDiffSCS_r16_;
      defaultQCL_CrossCarrierA_CSI_Trig_r16 = defaultQCL_CrossCarrierA_CSI_Trig_r16_;
      interCA_NonAlignedFrame_r16 = interCA_NonAlignedFrame_r16_;
      simul_SRS_Trans_BC_r16 = simul_SRS_Trans_BC_r16_;
      interFreqDAPS_r16 = interFreqDAPS_r16_;
      codebookParametersPerBC_r16 = codebookParametersPerBC_r16_;
      blindDetectFactor_r16 = blindDetectFactor_r16_;
      pdcch_MonitoringCA_r16 = pdcch_MonitoringCA_r16_;
      pdcch_BlindDetectionCA_Mixed_r16 = pdcch_BlindDetectionCA_Mixed_r16_;
      pdcch_BlindDetectionMCG_UE_r16 = pdcch_BlindDetectionMCG_UE_r16_;
      pdcch_BlindDetectionSCG_UE_r16 = pdcch_BlindDetectionSCG_UE_r16_;
      pdcch_BlindDetectionMCG_UE_Mixed_r16 = pdcch_BlindDetectionMCG_UE_Mixed_r16_;
      pdcch_BlindDetectionSCG_UE_Mixed_r16 = pdcch_BlindDetectionSCG_UE_Mixed_r16_;
      crossCarrierSchedulingDL_DiffSCS_r16 = crossCarrierSchedulingDL_DiffSCS_r16_;
      crossCarrierSchedulingDefaultQCL_r16 = crossCarrierSchedulingDefaultQCL_r16_;
      crossCarrierSchedulingUL_DiffSCS_r16 = crossCarrierSchedulingUL_DiffSCS_r16_;
      simul_SRS_MIMO_Trans_BC_r16 = simul_SRS_MIMO_Trans_BC_r16_;
      codebookParametersAdditionPerBC_r16 = codebookParametersAdditionPerBC_r16_;
      codebookComboParametersAdditionPerBC_r16 = codebookComboParametersAdditionPerBC_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CA_ParametersNR_v1610 (CA_ParametersNR_v1610_parallelTxMsgA_SRS_PUCCH_PUSCH_r16 parallelTxMsgA_SRS_PUCCH_PUSCH_r16_,
      CA_ParametersNR_v1610_msgA_SUL_r16 msgA_SUL_r16_,
      CA_ParametersNR_v1610_jointSearchSpaceGroupSwitchingAcrossCells_r16 jointSearchSpaceGroupSwitchingAcrossCells_r16_,
      CA_ParametersNR_v1610_half_DuplexTDD_CA_SameSCS_r16 half_DuplexTDD_CA_SameSCS_r16_,
      CA_ParametersNR_v1610_scellDormancyWithinActiveTime_r16 scellDormancyWithinActiveTime_r16_,
      CA_ParametersNR_v1610_scellDormancyOutsideActiveTime_r16 scellDormancyOutsideActiveTime_r16_,
      CA_ParametersNR_v1610_crossCarrierA_CSI_trigDiffSCS_r16 crossCarrierA_CSI_trigDiffSCS_r16_,
      CA_ParametersNR_v1610_defaultQCL_CrossCarrierA_CSI_Trig_r16 defaultQCL_CrossCarrierA_CSI_Trig_r16_,
      CA_ParametersNR_v1610_interCA_NonAlignedFrame_r16 interCA_NonAlignedFrame_r16_,
      CA_ParametersNR_v1610_simul_SRS_Trans_BC_r16 simul_SRS_Trans_BC_r16_,
      CA_ParametersNR_v1610_interFreqDAPS_r16 interFreqDAPS_r16_,
      CodebookParameters_v1610 codebookParametersPerBC_r16_,
      long blindDetectFactor_r16_,
      CA_ParametersNR_v1610_pdcch_MonitoringCA_r16 pdcch_MonitoringCA_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionCA_Mixed_r16 pdcch_BlindDetectionCA_Mixed_r16_,
      long pdcch_BlindDetectionMCG_UE_r16_,
      long pdcch_BlindDetectionSCG_UE_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionMCG_UE_Mixed_r16 pdcch_BlindDetectionMCG_UE_Mixed_r16_,
      CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16 pdcch_BlindDetectionSCG_UE_Mixed_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingDL_DiffSCS_r16 crossCarrierSchedulingDL_DiffSCS_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingDefaultQCL_r16 crossCarrierSchedulingDefaultQCL_r16_,
      CA_ParametersNR_v1610_crossCarrierSchedulingUL_DiffSCS_r16 crossCarrierSchedulingUL_DiffSCS_r16_,
      CA_ParametersNR_v1610_simul_SRS_MIMO_Trans_BC_r16 simul_SRS_MIMO_Trans_BC_r16_,
      CodebookParametersAdditionPerBC_r16 codebookParametersAdditionPerBC_r16_,
      CodebookComboParametersAdditionPerBC_r16 codebookComboParametersAdditionPerBC_r16_
   ) {
      super();
      parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = parallelTxMsgA_SRS_PUCCH_PUSCH_r16_;
      msgA_SUL_r16 = msgA_SUL_r16_;
      jointSearchSpaceGroupSwitchingAcrossCells_r16 = jointSearchSpaceGroupSwitchingAcrossCells_r16_;
      half_DuplexTDD_CA_SameSCS_r16 = half_DuplexTDD_CA_SameSCS_r16_;
      scellDormancyWithinActiveTime_r16 = scellDormancyWithinActiveTime_r16_;
      scellDormancyOutsideActiveTime_r16 = scellDormancyOutsideActiveTime_r16_;
      crossCarrierA_CSI_trigDiffSCS_r16 = crossCarrierA_CSI_trigDiffSCS_r16_;
      defaultQCL_CrossCarrierA_CSI_Trig_r16 = defaultQCL_CrossCarrierA_CSI_Trig_r16_;
      interCA_NonAlignedFrame_r16 = interCA_NonAlignedFrame_r16_;
      simul_SRS_Trans_BC_r16 = simul_SRS_Trans_BC_r16_;
      interFreqDAPS_r16 = interFreqDAPS_r16_;
      codebookParametersPerBC_r16 = codebookParametersPerBC_r16_;
      blindDetectFactor_r16 = new Asn1Integer (blindDetectFactor_r16_);
      pdcch_MonitoringCA_r16 = pdcch_MonitoringCA_r16_;
      pdcch_BlindDetectionCA_Mixed_r16 = pdcch_BlindDetectionCA_Mixed_r16_;
      pdcch_BlindDetectionMCG_UE_r16 = new Asn1Integer (pdcch_BlindDetectionMCG_UE_r16_);
      pdcch_BlindDetectionSCG_UE_r16 = new Asn1Integer (pdcch_BlindDetectionSCG_UE_r16_);
      pdcch_BlindDetectionMCG_UE_Mixed_r16 = pdcch_BlindDetectionMCG_UE_Mixed_r16_;
      pdcch_BlindDetectionSCG_UE_Mixed_r16 = pdcch_BlindDetectionSCG_UE_Mixed_r16_;
      crossCarrierSchedulingDL_DiffSCS_r16 = crossCarrierSchedulingDL_DiffSCS_r16_;
      crossCarrierSchedulingDefaultQCL_r16 = crossCarrierSchedulingDefaultQCL_r16_;
      crossCarrierSchedulingUL_DiffSCS_r16 = crossCarrierSchedulingUL_DiffSCS_r16_;
      simul_SRS_MIMO_Trans_BC_r16 = simul_SRS_MIMO_Trans_BC_r16_;
      codebookParametersAdditionPerBC_r16 = codebookParametersAdditionPerBC_r16_;
      codebookComboParametersAdditionPerBC_r16 = codebookComboParametersAdditionPerBC_r16_;
   }

   public void init () {
      parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = null;
      msgA_SUL_r16 = null;
      jointSearchSpaceGroupSwitchingAcrossCells_r16 = null;
      half_DuplexTDD_CA_SameSCS_r16 = null;
      scellDormancyWithinActiveTime_r16 = null;
      scellDormancyOutsideActiveTime_r16 = null;
      crossCarrierA_CSI_trigDiffSCS_r16 = null;
      defaultQCL_CrossCarrierA_CSI_Trig_r16 = null;
      interCA_NonAlignedFrame_r16 = null;
      simul_SRS_Trans_BC_r16 = null;
      interFreqDAPS_r16 = null;
      codebookParametersPerBC_r16 = null;
      blindDetectFactor_r16 = null;
      pdcch_MonitoringCA_r16 = null;
      pdcch_BlindDetectionCA_Mixed_r16 = null;
      pdcch_BlindDetectionMCG_UE_r16 = null;
      pdcch_BlindDetectionSCG_UE_r16 = null;
      pdcch_BlindDetectionMCG_UE_Mixed_r16 = null;
      pdcch_BlindDetectionSCG_UE_Mixed_r16 = null;
      crossCarrierSchedulingDL_DiffSCS_r16 = null;
      crossCarrierSchedulingDefaultQCL_r16 = null;
      crossCarrierSchedulingUL_DiffSCS_r16 = null;
      simul_SRS_MIMO_Trans_BC_r16 = null;
      codebookParametersAdditionPerBC_r16 = null;
      codebookComboParametersAdditionPerBC_r16 = null;
   }

   public int getElementCount() { return 25; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return parallelTxMsgA_SRS_PUCCH_PUSCH_r16;
         case 1: return msgA_SUL_r16;
         case 2: return jointSearchSpaceGroupSwitchingAcrossCells_r16;
         case 3: return half_DuplexTDD_CA_SameSCS_r16;
         case 4: return scellDormancyWithinActiveTime_r16;
         case 5: return scellDormancyOutsideActiveTime_r16;
         case 6: return crossCarrierA_CSI_trigDiffSCS_r16;
         case 7: return defaultQCL_CrossCarrierA_CSI_Trig_r16;
         case 8: return interCA_NonAlignedFrame_r16;
         case 9: return simul_SRS_Trans_BC_r16;
         case 10: return interFreqDAPS_r16;
         case 11: return codebookParametersPerBC_r16;
         case 12: return blindDetectFactor_r16;
         case 13: return pdcch_MonitoringCA_r16;
         case 14: return pdcch_BlindDetectionCA_Mixed_r16;
         case 15: return pdcch_BlindDetectionMCG_UE_r16;
         case 16: return pdcch_BlindDetectionSCG_UE_r16;
         case 17: return pdcch_BlindDetectionMCG_UE_Mixed_r16;
         case 18: return pdcch_BlindDetectionSCG_UE_Mixed_r16;
         case 19: return crossCarrierSchedulingDL_DiffSCS_r16;
         case 20: return crossCarrierSchedulingDefaultQCL_r16;
         case 21: return crossCarrierSchedulingUL_DiffSCS_r16;
         case 22: return simul_SRS_MIMO_Trans_BC_r16;
         case 23: return codebookParametersAdditionPerBC_r16;
         case 24: return codebookComboParametersAdditionPerBC_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "parallelTxMsgA-SRS-PUCCH-PUSCH-r16";
         case 1: return "msgA-SUL-r16";
         case 2: return "jointSearchSpaceGroupSwitchingAcrossCells-r16";
         case 3: return "half-DuplexTDD-CA-SameSCS-r16";
         case 4: return "scellDormancyWithinActiveTime-r16";
         case 5: return "scellDormancyOutsideActiveTime-r16";
         case 6: return "crossCarrierA-CSI-trigDiffSCS-r16";
         case 7: return "defaultQCL-CrossCarrierA-CSI-Trig-r16";
         case 8: return "interCA-NonAlignedFrame-r16";
         case 9: return "simul-SRS-Trans-BC-r16";
         case 10: return "interFreqDAPS-r16";
         case 11: return "codebookParametersPerBC-r16";
         case 12: return "blindDetectFactor-r16";
         case 13: return "pdcch-MonitoringCA-r16";
         case 14: return "pdcch-BlindDetectionCA-Mixed-r16";
         case 15: return "pdcch-BlindDetectionMCG-UE-r16";
         case 16: return "pdcch-BlindDetectionSCG-UE-r16";
         case 17: return "pdcch-BlindDetectionMCG-UE-Mixed-r16";
         case 18: return "pdcch-BlindDetectionSCG-UE-Mixed-r16";
         case 19: return "crossCarrierSchedulingDL-DiffSCS-r16";
         case 20: return "crossCarrierSchedulingDefaultQCL-r16";
         case 21: return "crossCarrierSchedulingUL-DiffSCS-r16";
         case 22: return "simul-SRS-MIMO-Trans-BC-r16";
         case 23: return "codebookParametersAdditionPerBC-r16";
         case 24: return "codebookComboParametersAdditionPerBC-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean parallelTxMsgA_SRS_PUCCH_PUSCH_r16Present = buffer.decodeBit ("parallelTxMsgA_SRS_PUCCH_PUSCH_r16Present");
      boolean msgA_SUL_r16Present = buffer.decodeBit ("msgA_SUL_r16Present");
      boolean jointSearchSpaceGroupSwitchingAcrossCells_r16Present = buffer.decodeBit ("jointSearchSpaceGroupSwitchingAcrossCells_r16Present");
      boolean half_DuplexTDD_CA_SameSCS_r16Present = buffer.decodeBit ("half_DuplexTDD_CA_SameSCS_r16Present");
      boolean scellDormancyWithinActiveTime_r16Present = buffer.decodeBit ("scellDormancyWithinActiveTime_r16Present");
      boolean scellDormancyOutsideActiveTime_r16Present = buffer.decodeBit ("scellDormancyOutsideActiveTime_r16Present");
      boolean crossCarrierA_CSI_trigDiffSCS_r16Present = buffer.decodeBit ("crossCarrierA_CSI_trigDiffSCS_r16Present");
      boolean defaultQCL_CrossCarrierA_CSI_Trig_r16Present = buffer.decodeBit ("defaultQCL_CrossCarrierA_CSI_Trig_r16Present");
      boolean interCA_NonAlignedFrame_r16Present = buffer.decodeBit ("interCA_NonAlignedFrame_r16Present");
      boolean simul_SRS_Trans_BC_r16Present = buffer.decodeBit ("simul_SRS_Trans_BC_r16Present");
      boolean interFreqDAPS_r16Present = buffer.decodeBit ("interFreqDAPS_r16Present");
      boolean codebookParametersPerBC_r16Present = buffer.decodeBit ("codebookParametersPerBC_r16Present");
      boolean blindDetectFactor_r16Present = buffer.decodeBit ("blindDetectFactor_r16Present");
      boolean pdcch_MonitoringCA_r16Present = buffer.decodeBit ("pdcch_MonitoringCA_r16Present");
      boolean pdcch_BlindDetectionCA_Mixed_r16Present = buffer.decodeBit ("pdcch_BlindDetectionCA_Mixed_r16Present");
      boolean pdcch_BlindDetectionMCG_UE_r16Present = buffer.decodeBit ("pdcch_BlindDetectionMCG_UE_r16Present");
      boolean pdcch_BlindDetectionSCG_UE_r16Present = buffer.decodeBit ("pdcch_BlindDetectionSCG_UE_r16Present");
      boolean pdcch_BlindDetectionMCG_UE_Mixed_r16Present = buffer.decodeBit ("pdcch_BlindDetectionMCG_UE_Mixed_r16Present");
      boolean pdcch_BlindDetectionSCG_UE_Mixed_r16Present = buffer.decodeBit ("pdcch_BlindDetectionSCG_UE_Mixed_r16Present");
      boolean crossCarrierSchedulingDL_DiffSCS_r16Present = buffer.decodeBit ("crossCarrierSchedulingDL_DiffSCS_r16Present");
      boolean crossCarrierSchedulingDefaultQCL_r16Present = buffer.decodeBit ("crossCarrierSchedulingDefaultQCL_r16Present");
      boolean crossCarrierSchedulingUL_DiffSCS_r16Present = buffer.decodeBit ("crossCarrierSchedulingUL_DiffSCS_r16Present");
      boolean simul_SRS_MIMO_Trans_BC_r16Present = buffer.decodeBit ("simul_SRS_MIMO_Trans_BC_r16Present");
      boolean codebookParametersAdditionPerBC_r16Present = buffer.decodeBit ("codebookParametersAdditionPerBC_r16Present");
      boolean codebookComboParametersAdditionPerBC_r16Present = buffer.decodeBit ("codebookComboParametersAdditionPerBC_r16Present");

      // decode parallelTxMsgA_SRS_PUCCH_PUSCH_r16

      if (parallelTxMsgA_SRS_PUCCH_PUSCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("parallelTxMsgA_SRS_PUCCH_PUSCH_r16", -1);

         int tval = CA_ParametersNR_v1610_parallelTxMsgA_SRS_PUCCH_PUSCH_r16.decodeEnumValue (buffer);
         parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = CA_ParametersNR_v1610_parallelTxMsgA_SRS_PUCCH_PUSCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("parallelTxMsgA_SRS_PUCCH_PUSCH_r16", -1);
      }
      else {
         parallelTxMsgA_SRS_PUCCH_PUSCH_r16 = null;
      }

      // decode msgA_SUL_r16

      if (msgA_SUL_r16Present) {
         buffer.getContext().eventDispatcher.startElement("msgA_SUL_r16", -1);

         int tval = CA_ParametersNR_v1610_msgA_SUL_r16.decodeEnumValue (buffer);
         msgA_SUL_r16 = CA_ParametersNR_v1610_msgA_SUL_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("msgA_SUL_r16", -1);
      }
      else {
         msgA_SUL_r16 = null;
      }

      // decode jointSearchSpaceGroupSwitchingAcrossCells_r16

      if (jointSearchSpaceGroupSwitchingAcrossCells_r16Present) {
         buffer.getContext().eventDispatcher.startElement("jointSearchSpaceGroupSwitchingAcrossCells_r16", -1);

         int tval = CA_ParametersNR_v1610_jointSearchSpaceGroupSwitchingAcrossCells_r16.decodeEnumValue (buffer);
         jointSearchSpaceGroupSwitchingAcrossCells_r16 = CA_ParametersNR_v1610_jointSearchSpaceGroupSwitchingAcrossCells_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("jointSearchSpaceGroupSwitchingAcrossCells_r16", -1);
      }
      else {
         jointSearchSpaceGroupSwitchingAcrossCells_r16 = null;
      }

      // decode half_DuplexTDD_CA_SameSCS_r16

      if (half_DuplexTDD_CA_SameSCS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("half_DuplexTDD_CA_SameSCS_r16", -1);

         int tval = CA_ParametersNR_v1610_half_DuplexTDD_CA_SameSCS_r16.decodeEnumValue (buffer);
         half_DuplexTDD_CA_SameSCS_r16 = CA_ParametersNR_v1610_half_DuplexTDD_CA_SameSCS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("half_DuplexTDD_CA_SameSCS_r16", -1);
      }
      else {
         half_DuplexTDD_CA_SameSCS_r16 = null;
      }

      // decode scellDormancyWithinActiveTime_r16

      if (scellDormancyWithinActiveTime_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scellDormancyWithinActiveTime_r16", -1);

         int tval = CA_ParametersNR_v1610_scellDormancyWithinActiveTime_r16.decodeEnumValue (buffer);
         scellDormancyWithinActiveTime_r16 = CA_ParametersNR_v1610_scellDormancyWithinActiveTime_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scellDormancyWithinActiveTime_r16", -1);
      }
      else {
         scellDormancyWithinActiveTime_r16 = null;
      }

      // decode scellDormancyOutsideActiveTime_r16

      if (scellDormancyOutsideActiveTime_r16Present) {
         buffer.getContext().eventDispatcher.startElement("scellDormancyOutsideActiveTime_r16", -1);

         int tval = CA_ParametersNR_v1610_scellDormancyOutsideActiveTime_r16.decodeEnumValue (buffer);
         scellDormancyOutsideActiveTime_r16 = CA_ParametersNR_v1610_scellDormancyOutsideActiveTime_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scellDormancyOutsideActiveTime_r16", -1);
      }
      else {
         scellDormancyOutsideActiveTime_r16 = null;
      }

      // decode crossCarrierA_CSI_trigDiffSCS_r16

      if (crossCarrierA_CSI_trigDiffSCS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierA_CSI_trigDiffSCS_r16", -1);

         int tval = CA_ParametersNR_v1610_crossCarrierA_CSI_trigDiffSCS_r16.decodeEnumValue (buffer);
         crossCarrierA_CSI_trigDiffSCS_r16 = CA_ParametersNR_v1610_crossCarrierA_CSI_trigDiffSCS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierA_CSI_trigDiffSCS_r16", -1);
      }
      else {
         crossCarrierA_CSI_trigDiffSCS_r16 = null;
      }

      // decode defaultQCL_CrossCarrierA_CSI_Trig_r16

      if (defaultQCL_CrossCarrierA_CSI_Trig_r16Present) {
         buffer.getContext().eventDispatcher.startElement("defaultQCL_CrossCarrierA_CSI_Trig_r16", -1);

         int tval = CA_ParametersNR_v1610_defaultQCL_CrossCarrierA_CSI_Trig_r16.decodeEnumValue (buffer);
         defaultQCL_CrossCarrierA_CSI_Trig_r16 = CA_ParametersNR_v1610_defaultQCL_CrossCarrierA_CSI_Trig_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("defaultQCL_CrossCarrierA_CSI_Trig_r16", -1);
      }
      else {
         defaultQCL_CrossCarrierA_CSI_Trig_r16 = null;
      }

      // decode interCA_NonAlignedFrame_r16

      if (interCA_NonAlignedFrame_r16Present) {
         buffer.getContext().eventDispatcher.startElement("interCA_NonAlignedFrame_r16", -1);

         int tval = CA_ParametersNR_v1610_interCA_NonAlignedFrame_r16.decodeEnumValue (buffer);
         interCA_NonAlignedFrame_r16 = CA_ParametersNR_v1610_interCA_NonAlignedFrame_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("interCA_NonAlignedFrame_r16", -1);
      }
      else {
         interCA_NonAlignedFrame_r16 = null;
      }

      // decode simul_SRS_Trans_BC_r16

      if (simul_SRS_Trans_BC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("simul_SRS_Trans_BC_r16", -1);

         int tval = CA_ParametersNR_v1610_simul_SRS_Trans_BC_r16.decodeEnumValue (buffer);
         simul_SRS_Trans_BC_r16 = CA_ParametersNR_v1610_simul_SRS_Trans_BC_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simul_SRS_Trans_BC_r16", -1);
      }
      else {
         simul_SRS_Trans_BC_r16 = null;
      }

      // decode interFreqDAPS_r16

      if (interFreqDAPS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("interFreqDAPS_r16", -1);

         interFreqDAPS_r16 = new CA_ParametersNR_v1610_interFreqDAPS_r16();
         interFreqDAPS_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interFreqDAPS_r16", -1);
      }
      else {
         interFreqDAPS_r16 = null;
      }

      // decode codebookParametersPerBC_r16

      if (codebookParametersPerBC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("codebookParametersPerBC_r16", -1);

         codebookParametersPerBC_r16 = new CodebookParameters_v1610();
         codebookParametersPerBC_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("codebookParametersPerBC_r16", -1);
      }
      else {
         codebookParametersPerBC_r16 = null;
      }

      // decode blindDetectFactor_r16

      if (blindDetectFactor_r16Present) {
         buffer.getContext().eventDispatcher.startElement("blindDetectFactor_r16", -1);

         blindDetectFactor_r16 = new Asn1Integer();
         blindDetectFactor_r16.decode (buffer, 1, 2);

         buffer.invokeCharacters(blindDetectFactor_r16.toString());
         buffer.getContext().eventDispatcher.endElement("blindDetectFactor_r16", -1);
      }
      else {
         blindDetectFactor_r16 = null;
      }

      // decode pdcch_MonitoringCA_r16

      if (pdcch_MonitoringCA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringCA_r16", -1);

         pdcch_MonitoringCA_r16 = new CA_ParametersNR_v1610_pdcch_MonitoringCA_r16();
         pdcch_MonitoringCA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringCA_r16", -1);
      }
      else {
         pdcch_MonitoringCA_r16 = null;
      }

      // decode pdcch_BlindDetectionCA_Mixed_r16

      if (pdcch_BlindDetectionCA_Mixed_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionCA_Mixed_r16", -1);

         pdcch_BlindDetectionCA_Mixed_r16 = new CA_ParametersNR_v1610_pdcch_BlindDetectionCA_Mixed_r16();
         pdcch_BlindDetectionCA_Mixed_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionCA_Mixed_r16", -1);
      }
      else {
         pdcch_BlindDetectionCA_Mixed_r16 = null;
      }

      // decode pdcch_BlindDetectionMCG_UE_r16

      if (pdcch_BlindDetectionMCG_UE_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionMCG_UE_r16", -1);

         pdcch_BlindDetectionMCG_UE_r16 = new Asn1Integer();
         pdcch_BlindDetectionMCG_UE_r16.decode (buffer, 1, 14);

         buffer.invokeCharacters(pdcch_BlindDetectionMCG_UE_r16.toString());
         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionMCG_UE_r16", -1);
      }
      else {
         pdcch_BlindDetectionMCG_UE_r16 = null;
      }

      // decode pdcch_BlindDetectionSCG_UE_r16

      if (pdcch_BlindDetectionSCG_UE_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE_r16", -1);

         pdcch_BlindDetectionSCG_UE_r16 = new Asn1Integer();
         pdcch_BlindDetectionSCG_UE_r16.decode (buffer, 1, 14);

         buffer.invokeCharacters(pdcch_BlindDetectionSCG_UE_r16.toString());
         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE_r16", -1);
      }
      else {
         pdcch_BlindDetectionSCG_UE_r16 = null;
      }

      // decode pdcch_BlindDetectionMCG_UE_Mixed_r16

      if (pdcch_BlindDetectionMCG_UE_Mixed_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionMCG_UE_Mixed_r16", -1);

         pdcch_BlindDetectionMCG_UE_Mixed_r16 = new CA_ParametersNR_v1610_pdcch_BlindDetectionMCG_UE_Mixed_r16();
         pdcch_BlindDetectionMCG_UE_Mixed_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionMCG_UE_Mixed_r16", -1);
      }
      else {
         pdcch_BlindDetectionMCG_UE_Mixed_r16 = null;
      }

      // decode pdcch_BlindDetectionSCG_UE_Mixed_r16

      if (pdcch_BlindDetectionSCG_UE_Mixed_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG_UE_Mixed_r16", -1);

         pdcch_BlindDetectionSCG_UE_Mixed_r16 = new CA_ParametersNR_v1610_pdcch_BlindDetectionSCG_UE_Mixed_r16();
         pdcch_BlindDetectionSCG_UE_Mixed_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG_UE_Mixed_r16", -1);
      }
      else {
         pdcch_BlindDetectionSCG_UE_Mixed_r16 = null;
      }

      // decode crossCarrierSchedulingDL_DiffSCS_r16

      if (crossCarrierSchedulingDL_DiffSCS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierSchedulingDL_DiffSCS_r16", -1);

         int tval = CA_ParametersNR_v1610_crossCarrierSchedulingDL_DiffSCS_r16.decodeEnumValue (buffer);
         crossCarrierSchedulingDL_DiffSCS_r16 = CA_ParametersNR_v1610_crossCarrierSchedulingDL_DiffSCS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierSchedulingDL_DiffSCS_r16", -1);
      }
      else {
         crossCarrierSchedulingDL_DiffSCS_r16 = null;
      }

      // decode crossCarrierSchedulingDefaultQCL_r16

      if (crossCarrierSchedulingDefaultQCL_r16Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierSchedulingDefaultQCL_r16", -1);

         int tval = CA_ParametersNR_v1610_crossCarrierSchedulingDefaultQCL_r16.decodeEnumValue (buffer);
         crossCarrierSchedulingDefaultQCL_r16 = CA_ParametersNR_v1610_crossCarrierSchedulingDefaultQCL_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierSchedulingDefaultQCL_r16", -1);
      }
      else {
         crossCarrierSchedulingDefaultQCL_r16 = null;
      }

      // decode crossCarrierSchedulingUL_DiffSCS_r16

      if (crossCarrierSchedulingUL_DiffSCS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierSchedulingUL_DiffSCS_r16", -1);

         int tval = CA_ParametersNR_v1610_crossCarrierSchedulingUL_DiffSCS_r16.decodeEnumValue (buffer);
         crossCarrierSchedulingUL_DiffSCS_r16 = CA_ParametersNR_v1610_crossCarrierSchedulingUL_DiffSCS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierSchedulingUL_DiffSCS_r16", -1);
      }
      else {
         crossCarrierSchedulingUL_DiffSCS_r16 = null;
      }

      // decode simul_SRS_MIMO_Trans_BC_r16

      if (simul_SRS_MIMO_Trans_BC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("simul_SRS_MIMO_Trans_BC_r16", -1);

         int tval = CA_ParametersNR_v1610_simul_SRS_MIMO_Trans_BC_r16.decodeEnumValue (buffer);
         simul_SRS_MIMO_Trans_BC_r16 = CA_ParametersNR_v1610_simul_SRS_MIMO_Trans_BC_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simul_SRS_MIMO_Trans_BC_r16", -1);
      }
      else {
         simul_SRS_MIMO_Trans_BC_r16 = null;
      }

      // decode codebookParametersAdditionPerBC_r16

      if (codebookParametersAdditionPerBC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("codebookParametersAdditionPerBC_r16", -1);

         codebookParametersAdditionPerBC_r16 = new CodebookParametersAdditionPerBC_r16();
         codebookParametersAdditionPerBC_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("codebookParametersAdditionPerBC_r16", -1);
      }
      else {
         codebookParametersAdditionPerBC_r16 = null;
      }

      // decode codebookComboParametersAdditionPerBC_r16

      if (codebookComboParametersAdditionPerBC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("codebookComboParametersAdditionPerBC_r16", -1);

         codebookComboParametersAdditionPerBC_r16 = new CodebookComboParametersAdditionPerBC_r16();
         codebookComboParametersAdditionPerBC_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("codebookComboParametersAdditionPerBC_r16", -1);
      }
      else {
         codebookComboParametersAdditionPerBC_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (parallelTxMsgA_SRS_PUCCH_PUSCH_r16 != null) parallelTxMsgA_SRS_PUCCH_PUSCH_r16.print (_sb, "parallelTxMsgA_SRS_PUCCH_PUSCH_r16", _level+1);
      if (msgA_SUL_r16 != null) msgA_SUL_r16.print (_sb, "msgA_SUL_r16", _level+1);
      if (jointSearchSpaceGroupSwitchingAcrossCells_r16 != null) jointSearchSpaceGroupSwitchingAcrossCells_r16.print (_sb, "jointSearchSpaceGroupSwitchingAcrossCells_r16", _level+1);
      if (half_DuplexTDD_CA_SameSCS_r16 != null) half_DuplexTDD_CA_SameSCS_r16.print (_sb, "half_DuplexTDD_CA_SameSCS_r16", _level+1);
      if (scellDormancyWithinActiveTime_r16 != null) scellDormancyWithinActiveTime_r16.print (_sb, "scellDormancyWithinActiveTime_r16", _level+1);
      if (scellDormancyOutsideActiveTime_r16 != null) scellDormancyOutsideActiveTime_r16.print (_sb, "scellDormancyOutsideActiveTime_r16", _level+1);
      if (crossCarrierA_CSI_trigDiffSCS_r16 != null) crossCarrierA_CSI_trigDiffSCS_r16.print (_sb, "crossCarrierA_CSI_trigDiffSCS_r16", _level+1);
      if (defaultQCL_CrossCarrierA_CSI_Trig_r16 != null) defaultQCL_CrossCarrierA_CSI_Trig_r16.print (_sb, "defaultQCL_CrossCarrierA_CSI_Trig_r16", _level+1);
      if (interCA_NonAlignedFrame_r16 != null) interCA_NonAlignedFrame_r16.print (_sb, "interCA_NonAlignedFrame_r16", _level+1);
      if (simul_SRS_Trans_BC_r16 != null) simul_SRS_Trans_BC_r16.print (_sb, "simul_SRS_Trans_BC_r16", _level+1);
      if (interFreqDAPS_r16 != null) interFreqDAPS_r16.print (_sb, "interFreqDAPS_r16", _level+1);
      if (codebookParametersPerBC_r16 != null) codebookParametersPerBC_r16.print (_sb, "codebookParametersPerBC_r16", _level+1);
      if (blindDetectFactor_r16 != null) blindDetectFactor_r16.print (_sb, "blindDetectFactor_r16", _level+1);
      if (pdcch_MonitoringCA_r16 != null) pdcch_MonitoringCA_r16.print (_sb, "pdcch_MonitoringCA_r16", _level+1);
      if (pdcch_BlindDetectionCA_Mixed_r16 != null) pdcch_BlindDetectionCA_Mixed_r16.print (_sb, "pdcch_BlindDetectionCA_Mixed_r16", _level+1);
      if (pdcch_BlindDetectionMCG_UE_r16 != null) pdcch_BlindDetectionMCG_UE_r16.print (_sb, "pdcch_BlindDetectionMCG_UE_r16", _level+1);
      if (pdcch_BlindDetectionSCG_UE_r16 != null) pdcch_BlindDetectionSCG_UE_r16.print (_sb, "pdcch_BlindDetectionSCG_UE_r16", _level+1);
      if (pdcch_BlindDetectionMCG_UE_Mixed_r16 != null) pdcch_BlindDetectionMCG_UE_Mixed_r16.print (_sb, "pdcch_BlindDetectionMCG_UE_Mixed_r16", _level+1);
      if (pdcch_BlindDetectionSCG_UE_Mixed_r16 != null) pdcch_BlindDetectionSCG_UE_Mixed_r16.print (_sb, "pdcch_BlindDetectionSCG_UE_Mixed_r16", _level+1);
      if (crossCarrierSchedulingDL_DiffSCS_r16 != null) crossCarrierSchedulingDL_DiffSCS_r16.print (_sb, "crossCarrierSchedulingDL_DiffSCS_r16", _level+1);
      if (crossCarrierSchedulingDefaultQCL_r16 != null) crossCarrierSchedulingDefaultQCL_r16.print (_sb, "crossCarrierSchedulingDefaultQCL_r16", _level+1);
      if (crossCarrierSchedulingUL_DiffSCS_r16 != null) crossCarrierSchedulingUL_DiffSCS_r16.print (_sb, "crossCarrierSchedulingUL_DiffSCS_r16", _level+1);
      if (simul_SRS_MIMO_Trans_BC_r16 != null) simul_SRS_MIMO_Trans_BC_r16.print (_sb, "simul_SRS_MIMO_Trans_BC_r16", _level+1);
      if (codebookParametersAdditionPerBC_r16 != null) codebookParametersAdditionPerBC_r16.print (_sb, "codebookParametersAdditionPerBC_r16", _level+1);
      if (codebookComboParametersAdditionPerBC_r16 != null) codebookComboParametersAdditionPerBC_r16.print (_sb, "codebookComboParametersAdditionPerBC_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
