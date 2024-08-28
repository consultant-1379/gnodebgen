/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPS_ConfigUL_STTI_r15_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15 semiPersistSchedIntervalUL_STTI_r15 = null;
   public SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter implicitReleaseAfter = null;
   public SPS_ConfigUL_STTI_r15_setup_p0_Persistent_r15 p0_Persistent_r15;  // optional
   public SPS_ConfigUL_STTI_r15_setup_twoIntervalsConfig_r15 twoIntervalsConfig_r15 = null;  // optional
   public SPS_ConfigUL_STTI_r15_setup_p0_PersistentSubframeSet2_r15 p0_PersistentSubframeSet2_r15;  // optional
   public Asn1Integer numberOfConfUL_SPS_Processes_STTI_r15;  // optional
   public Asn1Integer sTTI_StartTimeUL_r15;
   public TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15;  // optional
   public SPS_ConfigUL_STTI_r15_setup_cyclicShiftSPS_sTTI_r15 cyclicShiftSPS_sTTI_r15 = null;  // optional
   public Asn1Boolean ifdma_Config_SPS_r15;  // optional
   public Asn1Integer harq_ProcID_offset_r15;  // optional
   public SPS_ConfigUL_STTI_r15_setup_rv_SPS_STTI_UL_Repetitions_r15 rv_SPS_STTI_UL_Repetitions_r15 = null;  // optional
   public SPS_ConfigIndex_r15 sps_ConfigIndex_r15;  // optional
   public SPS_ConfigUL_STTI_r15_setup_tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = null;  // optional
   public SPS_ConfigUL_STTI_r15_setup_totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public SPS_ConfigUL_STTI_r15_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SPS_ConfigUL_STTI_r15_setup (
      SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15 semiPersistSchedIntervalUL_STTI_r15_,
      SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter implicitReleaseAfter_,
      SPS_ConfigUL_STTI_r15_setup_p0_Persistent_r15 p0_Persistent_r15_,
      SPS_ConfigUL_STTI_r15_setup_twoIntervalsConfig_r15 twoIntervalsConfig_r15_,
      SPS_ConfigUL_STTI_r15_setup_p0_PersistentSubframeSet2_r15 p0_PersistentSubframeSet2_r15_,
      Asn1Integer numberOfConfUL_SPS_Processes_STTI_r15_,
      Asn1Integer sTTI_StartTimeUL_r15_,
      TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15_,
      SPS_ConfigUL_STTI_r15_setup_cyclicShiftSPS_sTTI_r15 cyclicShiftSPS_sTTI_r15_,
      Asn1Boolean ifdma_Config_SPS_r15_,
      Asn1Integer harq_ProcID_offset_r15_,
      SPS_ConfigUL_STTI_r15_setup_rv_SPS_STTI_UL_Repetitions_r15 rv_SPS_STTI_UL_Repetitions_r15_,
      SPS_ConfigIndex_r15 sps_ConfigIndex_r15_,
      SPS_ConfigUL_STTI_r15_setup_tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 tbs_scalingFactorSubslotSPS_UL_Repetitions_r15_,
      SPS_ConfigUL_STTI_r15_setup_totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15_
   ) {
      super();
      semiPersistSchedIntervalUL_STTI_r15 = semiPersistSchedIntervalUL_STTI_r15_;
      implicitReleaseAfter = implicitReleaseAfter_;
      p0_Persistent_r15 = p0_Persistent_r15_;
      twoIntervalsConfig_r15 = twoIntervalsConfig_r15_;
      p0_PersistentSubframeSet2_r15 = p0_PersistentSubframeSet2_r15_;
      numberOfConfUL_SPS_Processes_STTI_r15 = numberOfConfUL_SPS_Processes_STTI_r15_;
      sTTI_StartTimeUL_r15 = sTTI_StartTimeUL_r15_;
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = tpc_PDCCH_ConfigPUSCH_SPS_r15_;
      cyclicShiftSPS_sTTI_r15 = cyclicShiftSPS_sTTI_r15_;
      ifdma_Config_SPS_r15 = ifdma_Config_SPS_r15_;
      harq_ProcID_offset_r15 = harq_ProcID_offset_r15_;
      rv_SPS_STTI_UL_Repetitions_r15 = rv_SPS_STTI_UL_Repetitions_r15_;
      sps_ConfigIndex_r15 = sps_ConfigIndex_r15_;
      tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = tbs_scalingFactorSubslotSPS_UL_Repetitions_r15_;
      totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SPS_ConfigUL_STTI_r15_setup (
      SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15 semiPersistSchedIntervalUL_STTI_r15_,
      SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter implicitReleaseAfter_,
      Asn1Integer sTTI_StartTimeUL_r15_
   ) {
      super();
      semiPersistSchedIntervalUL_STTI_r15 = semiPersistSchedIntervalUL_STTI_r15_;
      implicitReleaseAfter = implicitReleaseAfter_;
      sTTI_StartTimeUL_r15 = sTTI_StartTimeUL_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SPS_ConfigUL_STTI_r15_setup (SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15 semiPersistSchedIntervalUL_STTI_r15_,
      SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter implicitReleaseAfter_,
      SPS_ConfigUL_STTI_r15_setup_p0_Persistent_r15 p0_Persistent_r15_,
      SPS_ConfigUL_STTI_r15_setup_twoIntervalsConfig_r15 twoIntervalsConfig_r15_,
      SPS_ConfigUL_STTI_r15_setup_p0_PersistentSubframeSet2_r15 p0_PersistentSubframeSet2_r15_,
      long numberOfConfUL_SPS_Processes_STTI_r15_,
      long sTTI_StartTimeUL_r15_,
      TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15_,
      SPS_ConfigUL_STTI_r15_setup_cyclicShiftSPS_sTTI_r15 cyclicShiftSPS_sTTI_r15_,
      boolean ifdma_Config_SPS_r15_,
      long harq_ProcID_offset_r15_,
      SPS_ConfigUL_STTI_r15_setup_rv_SPS_STTI_UL_Repetitions_r15 rv_SPS_STTI_UL_Repetitions_r15_,
      long sps_ConfigIndex_r15_,
      SPS_ConfigUL_STTI_r15_setup_tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 tbs_scalingFactorSubslotSPS_UL_Repetitions_r15_,
      SPS_ConfigUL_STTI_r15_setup_totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15_
   ) {
      super();
      semiPersistSchedIntervalUL_STTI_r15 = semiPersistSchedIntervalUL_STTI_r15_;
      implicitReleaseAfter = implicitReleaseAfter_;
      p0_Persistent_r15 = p0_Persistent_r15_;
      twoIntervalsConfig_r15 = twoIntervalsConfig_r15_;
      p0_PersistentSubframeSet2_r15 = p0_PersistentSubframeSet2_r15_;
      numberOfConfUL_SPS_Processes_STTI_r15 = new Asn1Integer (numberOfConfUL_SPS_Processes_STTI_r15_);
      sTTI_StartTimeUL_r15 = new Asn1Integer (sTTI_StartTimeUL_r15_);
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = tpc_PDCCH_ConfigPUSCH_SPS_r15_;
      cyclicShiftSPS_sTTI_r15 = cyclicShiftSPS_sTTI_r15_;
      ifdma_Config_SPS_r15 = new Asn1Boolean (ifdma_Config_SPS_r15_);
      harq_ProcID_offset_r15 = new Asn1Integer (harq_ProcID_offset_r15_);
      rv_SPS_STTI_UL_Repetitions_r15 = rv_SPS_STTI_UL_Repetitions_r15_;
      sps_ConfigIndex_r15 = new SPS_ConfigIndex_r15 (sps_ConfigIndex_r15_);
      tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = tbs_scalingFactorSubslotSPS_UL_Repetitions_r15_;
      totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SPS_ConfigUL_STTI_r15_setup (
      SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15 semiPersistSchedIntervalUL_STTI_r15_,
      SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter implicitReleaseAfter_,
      long sTTI_StartTimeUL_r15_
   ) {
      super();
      semiPersistSchedIntervalUL_STTI_r15 = semiPersistSchedIntervalUL_STTI_r15_;
      implicitReleaseAfter = implicitReleaseAfter_;
      sTTI_StartTimeUL_r15 = new Asn1Integer (sTTI_StartTimeUL_r15_);
   }

   public void init () {
      semiPersistSchedIntervalUL_STTI_r15 = null;
      implicitReleaseAfter = null;
      p0_Persistent_r15 = null;
      twoIntervalsConfig_r15 = null;
      p0_PersistentSubframeSet2_r15 = null;
      numberOfConfUL_SPS_Processes_STTI_r15 = null;
      sTTI_StartTimeUL_r15 = null;
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = null;
      cyclicShiftSPS_sTTI_r15 = null;
      ifdma_Config_SPS_r15 = null;
      harq_ProcID_offset_r15 = null;
      rv_SPS_STTI_UL_Repetitions_r15 = null;
      sps_ConfigIndex_r15 = null;
      tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = null;
      totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 16; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return semiPersistSchedIntervalUL_STTI_r15;
         case 1: return implicitReleaseAfter;
         case 2: return p0_Persistent_r15;
         case 3: return twoIntervalsConfig_r15;
         case 4: return p0_PersistentSubframeSet2_r15;
         case 5: return numberOfConfUL_SPS_Processes_STTI_r15;
         case 6: return sTTI_StartTimeUL_r15;
         case 7: return tpc_PDCCH_ConfigPUSCH_SPS_r15;
         case 8: return cyclicShiftSPS_sTTI_r15;
         case 9: return ifdma_Config_SPS_r15;
         case 10: return harq_ProcID_offset_r15;
         case 11: return rv_SPS_STTI_UL_Repetitions_r15;
         case 12: return sps_ConfigIndex_r15;
         case 13: return tbs_scalingFactorSubslotSPS_UL_Repetitions_r15;
         case 14: return totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15;
         case 15: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "semiPersistSchedIntervalUL-STTI-r15";
         case 1: return "implicitReleaseAfter";
         case 2: return "p0-Persistent-r15";
         case 3: return "twoIntervalsConfig-r15";
         case 4: return "p0-PersistentSubframeSet2-r15";
         case 5: return "numberOfConfUL-SPS-Processes-STTI-r15";
         case 6: return "sTTI-StartTimeUL-r15";
         case 7: return "tpc-PDCCH-ConfigPUSCH-SPS-r15";
         case 8: return "cyclicShiftSPS-sTTI-r15";
         case 9: return "ifdma-Config-SPS-r15";
         case 10: return "harq-ProcID-offset-r15";
         case 11: return "rv-SPS-STTI-UL-Repetitions-r15";
         case 12: return "sps-ConfigIndex-r15";
         case 13: return "tbs-scalingFactorSubslotSPS-UL-Repetitions-r15";
         case 14: return "totalNumberPUSCH-SPS-STTI-UL-Repetitions-r15";
         case 15: return null;
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

      boolean p0_Persistent_r15Present = buffer.decodeBit ("p0_Persistent_r15Present");
      boolean twoIntervalsConfig_r15Present = buffer.decodeBit ("twoIntervalsConfig_r15Present");
      boolean p0_PersistentSubframeSet2_r15Present = buffer.decodeBit ("p0_PersistentSubframeSet2_r15Present");
      boolean numberOfConfUL_SPS_Processes_STTI_r15Present = buffer.decodeBit ("numberOfConfUL_SPS_Processes_STTI_r15Present");
      boolean tpc_PDCCH_ConfigPUSCH_SPS_r15Present = buffer.decodeBit ("tpc_PDCCH_ConfigPUSCH_SPS_r15Present");
      boolean cyclicShiftSPS_sTTI_r15Present = buffer.decodeBit ("cyclicShiftSPS_sTTI_r15Present");
      boolean ifdma_Config_SPS_r15Present = buffer.decodeBit ("ifdma_Config_SPS_r15Present");
      boolean harq_ProcID_offset_r15Present = buffer.decodeBit ("harq_ProcID_offset_r15Present");
      boolean rv_SPS_STTI_UL_Repetitions_r15Present = buffer.decodeBit ("rv_SPS_STTI_UL_Repetitions_r15Present");
      boolean sps_ConfigIndex_r15Present = buffer.decodeBit ("sps_ConfigIndex_r15Present");
      boolean tbs_scalingFactorSubslotSPS_UL_Repetitions_r15Present = buffer.decodeBit ("tbs_scalingFactorSubslotSPS_UL_Repetitions_r15Present");
      boolean totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15Present = buffer.decodeBit ("totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15Present");

      // decode semiPersistSchedIntervalUL_STTI_r15

      buffer.getContext().eventDispatcher.startElement("semiPersistSchedIntervalUL_STTI_r15", -1);

      {
         int tval = SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15.decodeEnumValue (buffer);
         semiPersistSchedIntervalUL_STTI_r15 = SPS_ConfigUL_STTI_r15_setup_semiPersistSchedIntervalUL_STTI_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("semiPersistSchedIntervalUL_STTI_r15", -1);

      // decode implicitReleaseAfter

      buffer.getContext().eventDispatcher.startElement("implicitReleaseAfter", -1);

      {
         int tval = SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter.decodeEnumValue (buffer);
         implicitReleaseAfter = SPS_ConfigUL_STTI_r15_setup_implicitReleaseAfter.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("implicitReleaseAfter", -1);

      // decode p0_Persistent_r15

      if (p0_Persistent_r15Present) {
         buffer.getContext().eventDispatcher.startElement("p0_Persistent_r15", -1);

         p0_Persistent_r15 = new SPS_ConfigUL_STTI_r15_setup_p0_Persistent_r15();
         p0_Persistent_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p0_Persistent_r15", -1);
      }
      else {
         p0_Persistent_r15 = null;
      }

      // decode twoIntervalsConfig_r15

      if (twoIntervalsConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("twoIntervalsConfig_r15", -1);

         int tval = SPS_ConfigUL_STTI_r15_setup_twoIntervalsConfig_r15.decodeEnumValue (buffer);
         twoIntervalsConfig_r15 = SPS_ConfigUL_STTI_r15_setup_twoIntervalsConfig_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("twoIntervalsConfig_r15", -1);
      }
      else {
         twoIntervalsConfig_r15 = null;
      }

      // decode p0_PersistentSubframeSet2_r15

      if (p0_PersistentSubframeSet2_r15Present) {
         buffer.getContext().eventDispatcher.startElement("p0_PersistentSubframeSet2_r15", -1);

         p0_PersistentSubframeSet2_r15 = new SPS_ConfigUL_STTI_r15_setup_p0_PersistentSubframeSet2_r15();
         p0_PersistentSubframeSet2_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p0_PersistentSubframeSet2_r15", -1);
      }
      else {
         p0_PersistentSubframeSet2_r15 = null;
      }

      // decode numberOfConfUL_SPS_Processes_STTI_r15

      if (numberOfConfUL_SPS_Processes_STTI_r15Present) {
         buffer.getContext().eventDispatcher.startElement("numberOfConfUL_SPS_Processes_STTI_r15", -1);

         numberOfConfUL_SPS_Processes_STTI_r15 = new Asn1Integer();
         numberOfConfUL_SPS_Processes_STTI_r15.decode (buffer, 1, 12);

         buffer.invokeCharacters(numberOfConfUL_SPS_Processes_STTI_r15.toString());
         buffer.getContext().eventDispatcher.endElement("numberOfConfUL_SPS_Processes_STTI_r15", -1);
      }
      else {
         numberOfConfUL_SPS_Processes_STTI_r15 = null;
      }

      // decode sTTI_StartTimeUL_r15

      buffer.getContext().eventDispatcher.startElement("sTTI_StartTimeUL_r15", -1);

      sTTI_StartTimeUL_r15 = new Asn1Integer();
      sTTI_StartTimeUL_r15.decode (buffer, 0, 5);

      buffer.invokeCharacters(sTTI_StartTimeUL_r15.toString());
      buffer.getContext().eventDispatcher.endElement("sTTI_StartTimeUL_r15", -1);

      // decode tpc_PDCCH_ConfigPUSCH_SPS_r15

      if (tpc_PDCCH_ConfigPUSCH_SPS_r15Present) {
         buffer.getContext().eventDispatcher.startElement("tpc_PDCCH_ConfigPUSCH_SPS_r15", -1);

         tpc_PDCCH_ConfigPUSCH_SPS_r15 = new TPC_PDCCH_Config();
         tpc_PDCCH_ConfigPUSCH_SPS_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tpc_PDCCH_ConfigPUSCH_SPS_r15", -1);
      }
      else {
         tpc_PDCCH_ConfigPUSCH_SPS_r15 = null;
      }

      // decode cyclicShiftSPS_sTTI_r15

      if (cyclicShiftSPS_sTTI_r15Present) {
         buffer.getContext().eventDispatcher.startElement("cyclicShiftSPS_sTTI_r15", -1);

         int tval = SPS_ConfigUL_STTI_r15_setup_cyclicShiftSPS_sTTI_r15.decodeEnumValue (buffer);
         cyclicShiftSPS_sTTI_r15 = SPS_ConfigUL_STTI_r15_setup_cyclicShiftSPS_sTTI_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cyclicShiftSPS_sTTI_r15", -1);
      }
      else {
         cyclicShiftSPS_sTTI_r15 = null;
      }

      // decode ifdma_Config_SPS_r15

      if (ifdma_Config_SPS_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ifdma_Config_SPS_r15", -1);

         ifdma_Config_SPS_r15 = new Asn1Boolean();
         ifdma_Config_SPS_r15.decode (buffer);

         buffer.invokeCharacters(ifdma_Config_SPS_r15.toString());
         buffer.getContext().eventDispatcher.endElement("ifdma_Config_SPS_r15", -1);
      }
      else {
         ifdma_Config_SPS_r15 = null;
      }

      // decode harq_ProcID_offset_r15

      if (harq_ProcID_offset_r15Present) {
         buffer.getContext().eventDispatcher.startElement("harq_ProcID_offset_r15", -1);

         harq_ProcID_offset_r15 = new Asn1Integer();
         harq_ProcID_offset_r15.decode (buffer, 0, 15);

         buffer.invokeCharacters(harq_ProcID_offset_r15.toString());
         buffer.getContext().eventDispatcher.endElement("harq_ProcID_offset_r15", -1);
      }
      else {
         harq_ProcID_offset_r15 = null;
      }

      // decode rv_SPS_STTI_UL_Repetitions_r15

      if (rv_SPS_STTI_UL_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("rv_SPS_STTI_UL_Repetitions_r15", -1);

         int tval = SPS_ConfigUL_STTI_r15_setup_rv_SPS_STTI_UL_Repetitions_r15.decodeEnumValue (buffer);
         rv_SPS_STTI_UL_Repetitions_r15 = SPS_ConfigUL_STTI_r15_setup_rv_SPS_STTI_UL_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("rv_SPS_STTI_UL_Repetitions_r15", -1);
      }
      else {
         rv_SPS_STTI_UL_Repetitions_r15 = null;
      }

      // decode sps_ConfigIndex_r15

      if (sps_ConfigIndex_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sps_ConfigIndex_r15", -1);

         sps_ConfigIndex_r15 = new SPS_ConfigIndex_r15();
         sps_ConfigIndex_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sps_ConfigIndex_r15", -1);
      }
      else {
         sps_ConfigIndex_r15 = null;
      }

      // decode tbs_scalingFactorSubslotSPS_UL_Repetitions_r15

      if (tbs_scalingFactorSubslotSPS_UL_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("tbs_scalingFactorSubslotSPS_UL_Repetitions_r15", -1);

         int tval = SPS_ConfigUL_STTI_r15_setup_tbs_scalingFactorSubslotSPS_UL_Repetitions_r15.decodeEnumValue (buffer);
         tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = SPS_ConfigUL_STTI_r15_setup_tbs_scalingFactorSubslotSPS_UL_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tbs_scalingFactorSubslotSPS_UL_Repetitions_r15", -1);
      }
      else {
         tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 = null;
      }

      // decode totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15

      if (totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15Present) {
         buffer.getContext().eventDispatcher.startElement("totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15", -1);

         int tval = SPS_ConfigUL_STTI_r15_setup_totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15.decodeEnumValue (buffer);
         totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = SPS_ConfigUL_STTI_r15_setup_totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15", -1);
      }
      else {
         totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 = null;
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

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (semiPersistSchedIntervalUL_STTI_r15 != null) semiPersistSchedIntervalUL_STTI_r15.print (_sb, "semiPersistSchedIntervalUL_STTI_r15", _level+1);
      if (implicitReleaseAfter != null) implicitReleaseAfter.print (_sb, "implicitReleaseAfter", _level+1);
      if (p0_Persistent_r15 != null) p0_Persistent_r15.print (_sb, "p0_Persistent_r15", _level+1);
      if (twoIntervalsConfig_r15 != null) twoIntervalsConfig_r15.print (_sb, "twoIntervalsConfig_r15", _level+1);
      if (p0_PersistentSubframeSet2_r15 != null) p0_PersistentSubframeSet2_r15.print (_sb, "p0_PersistentSubframeSet2_r15", _level+1);
      if (numberOfConfUL_SPS_Processes_STTI_r15 != null) numberOfConfUL_SPS_Processes_STTI_r15.print (_sb, "numberOfConfUL_SPS_Processes_STTI_r15", _level+1);
      if (sTTI_StartTimeUL_r15 != null) sTTI_StartTimeUL_r15.print (_sb, "sTTI_StartTimeUL_r15", _level+1);
      if (tpc_PDCCH_ConfigPUSCH_SPS_r15 != null) tpc_PDCCH_ConfigPUSCH_SPS_r15.print (_sb, "tpc_PDCCH_ConfigPUSCH_SPS_r15", _level+1);
      if (cyclicShiftSPS_sTTI_r15 != null) cyclicShiftSPS_sTTI_r15.print (_sb, "cyclicShiftSPS_sTTI_r15", _level+1);
      if (ifdma_Config_SPS_r15 != null) ifdma_Config_SPS_r15.print (_sb, "ifdma_Config_SPS_r15", _level+1);
      if (harq_ProcID_offset_r15 != null) harq_ProcID_offset_r15.print (_sb, "harq_ProcID_offset_r15", _level+1);
      if (rv_SPS_STTI_UL_Repetitions_r15 != null) rv_SPS_STTI_UL_Repetitions_r15.print (_sb, "rv_SPS_STTI_UL_Repetitions_r15", _level+1);
      if (sps_ConfigIndex_r15 != null) sps_ConfigIndex_r15.print (_sb, "sps_ConfigIndex_r15", _level+1);
      if (tbs_scalingFactorSubslotSPS_UL_Repetitions_r15 != null) tbs_scalingFactorSubslotSPS_UL_Repetitions_r15.print (_sb, "tbs_scalingFactorSubslotSPS_UL_Repetitions_r15", _level+1);
      if (totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15 != null) totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15.print (_sb, "totalNumberPUSCH_SPS_STTI_UL_Repetitions_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
