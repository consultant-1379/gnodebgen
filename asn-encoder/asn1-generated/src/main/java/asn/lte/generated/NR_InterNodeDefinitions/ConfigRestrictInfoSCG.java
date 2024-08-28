/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.P_Max;
import asn.lte.generated.NR_RRC_Definitions.OverheatingAssistance;

public class ConfigRestrictInfoSCG extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ConfigRestrictInfoSCG";
   }

   public BandCombinationInfoList allowedBC_ListMRDC;  // optional
   public ConfigRestrictInfoSCG_powerCoordination_FR1 powerCoordination_FR1;  // optional
   public ConfigRestrictInfoSCG_servCellIndexRangeSCG servCellIndexRangeSCG;  // optional
   public Asn1Integer maxMeasFreqsSCG;  // optional
   public Asn1Integer dummy;  // optional
   public boolean mV2ExtPresent;
   public ConfigRestrictInfoSCG_selectedBandEntriesMNList selectedBandEntriesMNList;  // optional
   public Asn1Integer pdcch_BlindDetectionSCG;  // optional
   public Asn1Integer maxNumberROHC_ContextSessionsSN;  // optional
   public boolean mV3ExtPresent;
   public Asn1Integer maxIntraFreqMeasIdentitiesSCG;  // optional
   public Asn1Integer maxInterFreqMeasIdentitiesSCG;  // optional
   public boolean mV4ExtPresent;
   public P_Max p_maxNR_FR1_MCG_r16;  // optional
   public ConfigRestrictInfoSCG_powerCoordination_FR2_r16 powerCoordination_FR2_r16;  // optional
   public ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 nrdc_PC_mode_FR1_r16 = null;  // optional
   public ConfigRestrictInfoSCG_nrdc_PC_mode_FR2_r16 nrdc_PC_mode_FR2_r16 = null;  // optional
   public Asn1Integer maxMeasSRS_ResourceSCG_r16;  // optional
   public Asn1Integer maxMeasCLI_ResourceSCG_r16;  // optional
   public Asn1Integer maxNumberEHC_ContextsSN_r16;  // optional
   public OverheatingAssistance allowedReducedConfigForOverheating_r16;  // optional
   public T_Offset_r16 maxToffset_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public ConfigRestrictInfoSCG () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ConfigRestrictInfoSCG (
      BandCombinationInfoList allowedBC_ListMRDC_,
      ConfigRestrictInfoSCG_powerCoordination_FR1 powerCoordination_FR1_,
      ConfigRestrictInfoSCG_servCellIndexRangeSCG servCellIndexRangeSCG_,
      Asn1Integer maxMeasFreqsSCG_,
      Asn1Integer dummy_,
      ConfigRestrictInfoSCG_selectedBandEntriesMNList selectedBandEntriesMNList_,
      Asn1Integer pdcch_BlindDetectionSCG_,
      Asn1Integer maxNumberROHC_ContextSessionsSN_,
      Asn1Integer maxIntraFreqMeasIdentitiesSCG_,
      Asn1Integer maxInterFreqMeasIdentitiesSCG_,
      P_Max p_maxNR_FR1_MCG_r16_,
      ConfigRestrictInfoSCG_powerCoordination_FR2_r16 powerCoordination_FR2_r16_,
      ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 nrdc_PC_mode_FR1_r16_,
      ConfigRestrictInfoSCG_nrdc_PC_mode_FR2_r16 nrdc_PC_mode_FR2_r16_,
      Asn1Integer maxMeasSRS_ResourceSCG_r16_,
      Asn1Integer maxMeasCLI_ResourceSCG_r16_,
      Asn1Integer maxNumberEHC_ContextsSN_r16_,
      OverheatingAssistance allowedReducedConfigForOverheating_r16_,
      T_Offset_r16 maxToffset_r16_
   ) {
      super();
      allowedBC_ListMRDC = allowedBC_ListMRDC_;
      powerCoordination_FR1 = powerCoordination_FR1_;
      servCellIndexRangeSCG = servCellIndexRangeSCG_;
      maxMeasFreqsSCG = maxMeasFreqsSCG_;
      dummy = dummy_;
      selectedBandEntriesMNList = selectedBandEntriesMNList_;
      pdcch_BlindDetectionSCG = pdcch_BlindDetectionSCG_;
      maxNumberROHC_ContextSessionsSN = maxNumberROHC_ContextSessionsSN_;
      maxIntraFreqMeasIdentitiesSCG = maxIntraFreqMeasIdentitiesSCG_;
      maxInterFreqMeasIdentitiesSCG = maxInterFreqMeasIdentitiesSCG_;
      p_maxNR_FR1_MCG_r16 = p_maxNR_FR1_MCG_r16_;
      powerCoordination_FR2_r16 = powerCoordination_FR2_r16_;
      nrdc_PC_mode_FR1_r16 = nrdc_PC_mode_FR1_r16_;
      nrdc_PC_mode_FR2_r16 = nrdc_PC_mode_FR2_r16_;
      maxMeasSRS_ResourceSCG_r16 = maxMeasSRS_ResourceSCG_r16_;
      maxMeasCLI_ResourceSCG_r16 = maxMeasCLI_ResourceSCG_r16_;
      maxNumberEHC_ContextsSN_r16 = maxNumberEHC_ContextsSN_r16_;
      allowedReducedConfigForOverheating_r16 = allowedReducedConfigForOverheating_r16_;
      maxToffset_r16 = maxToffset_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ConfigRestrictInfoSCG (BandCombinationInfoList allowedBC_ListMRDC_,
      ConfigRestrictInfoSCG_powerCoordination_FR1 powerCoordination_FR1_,
      ConfigRestrictInfoSCG_servCellIndexRangeSCG servCellIndexRangeSCG_,
      long maxMeasFreqsSCG_,
      long dummy_,
      ConfigRestrictInfoSCG_selectedBandEntriesMNList selectedBandEntriesMNList_,
      long pdcch_BlindDetectionSCG_,
      long maxNumberROHC_ContextSessionsSN_,
      long maxIntraFreqMeasIdentitiesSCG_,
      long maxInterFreqMeasIdentitiesSCG_,
      long p_maxNR_FR1_MCG_r16_,
      ConfigRestrictInfoSCG_powerCoordination_FR2_r16 powerCoordination_FR2_r16_,
      ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 nrdc_PC_mode_FR1_r16_,
      ConfigRestrictInfoSCG_nrdc_PC_mode_FR2_r16 nrdc_PC_mode_FR2_r16_,
      long maxMeasSRS_ResourceSCG_r16_,
      long maxMeasCLI_ResourceSCG_r16_,
      long maxNumberEHC_ContextsSN_r16_,
      OverheatingAssistance allowedReducedConfigForOverheating_r16_,
      T_Offset_r16 maxToffset_r16_
   ) {
      super();
      allowedBC_ListMRDC = allowedBC_ListMRDC_;
      powerCoordination_FR1 = powerCoordination_FR1_;
      servCellIndexRangeSCG = servCellIndexRangeSCG_;
      maxMeasFreqsSCG = new Asn1Integer (maxMeasFreqsSCG_);
      dummy = new Asn1Integer (dummy_);
      selectedBandEntriesMNList = selectedBandEntriesMNList_;
      pdcch_BlindDetectionSCG = new Asn1Integer (pdcch_BlindDetectionSCG_);
      maxNumberROHC_ContextSessionsSN = new Asn1Integer (maxNumberROHC_ContextSessionsSN_);
      maxIntraFreqMeasIdentitiesSCG = new Asn1Integer (maxIntraFreqMeasIdentitiesSCG_);
      maxInterFreqMeasIdentitiesSCG = new Asn1Integer (maxInterFreqMeasIdentitiesSCG_);
      p_maxNR_FR1_MCG_r16 = new P_Max (p_maxNR_FR1_MCG_r16_);
      powerCoordination_FR2_r16 = powerCoordination_FR2_r16_;
      nrdc_PC_mode_FR1_r16 = nrdc_PC_mode_FR1_r16_;
      nrdc_PC_mode_FR2_r16 = nrdc_PC_mode_FR2_r16_;
      maxMeasSRS_ResourceSCG_r16 = new Asn1Integer (maxMeasSRS_ResourceSCG_r16_);
      maxMeasCLI_ResourceSCG_r16 = new Asn1Integer (maxMeasCLI_ResourceSCG_r16_);
      maxNumberEHC_ContextsSN_r16 = new Asn1Integer (maxNumberEHC_ContextsSN_r16_);
      allowedReducedConfigForOverheating_r16 = allowedReducedConfigForOverheating_r16_;
      maxToffset_r16 = maxToffset_r16_;
   }

   public void init () {
      allowedBC_ListMRDC = null;
      powerCoordination_FR1 = null;
      servCellIndexRangeSCG = null;
      maxMeasFreqsSCG = null;
      dummy = null;
      selectedBandEntriesMNList = null;
      pdcch_BlindDetectionSCG = null;
      maxNumberROHC_ContextSessionsSN = null;
      maxIntraFreqMeasIdentitiesSCG = null;
      maxInterFreqMeasIdentitiesSCG = null;
      p_maxNR_FR1_MCG_r16 = null;
      powerCoordination_FR2_r16 = null;
      nrdc_PC_mode_FR1_r16 = null;
      nrdc_PC_mode_FR2_r16 = null;
      maxMeasSRS_ResourceSCG_r16 = null;
      maxMeasCLI_ResourceSCG_r16 = null;
      maxNumberEHC_ContextsSN_r16 = null;
      allowedReducedConfigForOverheating_r16 = null;
      maxToffset_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 20; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return allowedBC_ListMRDC;
         case 1: return powerCoordination_FR1;
         case 2: return servCellIndexRangeSCG;
         case 3: return maxMeasFreqsSCG;
         case 4: return dummy;
         case 5: return selectedBandEntriesMNList;
         case 6: return pdcch_BlindDetectionSCG;
         case 7: return maxNumberROHC_ContextSessionsSN;
         case 8: return maxIntraFreqMeasIdentitiesSCG;
         case 9: return maxInterFreqMeasIdentitiesSCG;
         case 10: return p_maxNR_FR1_MCG_r16;
         case 11: return powerCoordination_FR2_r16;
         case 12: return nrdc_PC_mode_FR1_r16;
         case 13: return nrdc_PC_mode_FR2_r16;
         case 14: return maxMeasSRS_ResourceSCG_r16;
         case 15: return maxMeasCLI_ResourceSCG_r16;
         case 16: return maxNumberEHC_ContextsSN_r16;
         case 17: return allowedReducedConfigForOverheating_r16;
         case 18: return maxToffset_r16;
         case 19: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "allowedBC-ListMRDC";
         case 1: return "powerCoordination-FR1";
         case 2: return "servCellIndexRangeSCG";
         case 3: return "maxMeasFreqsSCG";
         case 4: return "dummy";
         case 5: return "selectedBandEntriesMNList";
         case 6: return "pdcch-BlindDetectionSCG";
         case 7: return "maxNumberROHC-ContextSessionsSN";
         case 8: return "maxIntraFreqMeasIdentitiesSCG";
         case 9: return "maxInterFreqMeasIdentitiesSCG";
         case 10: return "p-maxNR-FR1-MCG-r16";
         case 11: return "powerCoordination-FR2-r16";
         case 12: return "nrdc-PC-mode-FR1-r16";
         case 13: return "nrdc-PC-mode-FR2-r16";
         case 14: return "maxMeasSRS-ResourceSCG-r16";
         case 15: return "maxMeasCLI-ResourceSCG-r16";
         case 16: return "maxNumberEHC-ContextsSN-r16";
         case 17: return "allowedReducedConfigForOverheating-r16";
         case 18: return "maxToffset-r16";
         case 19: return null;
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

      boolean allowedBC_ListMRDCPresent = buffer.decodeBit ("allowedBC_ListMRDCPresent");
      boolean powerCoordination_FR1Present = buffer.decodeBit ("powerCoordination_FR1Present");
      boolean servCellIndexRangeSCGPresent = buffer.decodeBit ("servCellIndexRangeSCGPresent");
      boolean maxMeasFreqsSCGPresent = buffer.decodeBit ("maxMeasFreqsSCGPresent");
      boolean dummyPresent = buffer.decodeBit ("dummyPresent");

      // decode allowedBC_ListMRDC

      if (allowedBC_ListMRDCPresent) {
         buffer.getContext().eventDispatcher.startElement("allowedBC_ListMRDC", -1);

         allowedBC_ListMRDC = new BandCombinationInfoList();
         allowedBC_ListMRDC.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("allowedBC_ListMRDC", -1);
      }
      else {
         allowedBC_ListMRDC = null;
      }

      // decode powerCoordination_FR1

      if (powerCoordination_FR1Present) {
         buffer.getContext().eventDispatcher.startElement("powerCoordination_FR1", -1);

         powerCoordination_FR1 = new ConfigRestrictInfoSCG_powerCoordination_FR1();
         powerCoordination_FR1.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("powerCoordination_FR1", -1);
      }
      else {
         powerCoordination_FR1 = null;
      }

      // decode servCellIndexRangeSCG

      if (servCellIndexRangeSCGPresent) {
         buffer.getContext().eventDispatcher.startElement("servCellIndexRangeSCG", -1);

         servCellIndexRangeSCG = new ConfigRestrictInfoSCG_servCellIndexRangeSCG();
         servCellIndexRangeSCG.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("servCellIndexRangeSCG", -1);
      }
      else {
         servCellIndexRangeSCG = null;
      }

      // decode maxMeasFreqsSCG

      if (maxMeasFreqsSCGPresent) {
         buffer.getContext().eventDispatcher.startElement("maxMeasFreqsSCG", -1);

         maxMeasFreqsSCG = new Asn1Integer();
         maxMeasFreqsSCG.decode (buffer, 1, 32);

         buffer.invokeCharacters(maxMeasFreqsSCG.toString());
         buffer.getContext().eventDispatcher.endElement("maxMeasFreqsSCG", -1);
      }
      else {
         maxMeasFreqsSCG = null;
      }

      // decode dummy

      if (dummyPresent) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy = new Asn1Integer();
         dummy.decode (buffer, 1, 62);

         buffer.invokeCharacters(dummy.toString());
         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else {
         dummy = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean selectedBandEntriesMNListPresent = buffer.decodeBit ("selectedBandEntriesMNListPresent");

            boolean pdcch_BlindDetectionSCGPresent = buffer.decodeBit ("pdcch_BlindDetectionSCGPresent");

            boolean maxNumberROHC_ContextSessionsSNPresent = buffer.decodeBit ("maxNumberROHC_ContextSessionsSNPresent");

            // decode selectedBandEntriesMNList

            if (selectedBandEntriesMNListPresent) {
               buffer.getContext().eventDispatcher.startElement("selectedBandEntriesMNList", -1);

               selectedBandEntriesMNList = new ConfigRestrictInfoSCG_selectedBandEntriesMNList();
               selectedBandEntriesMNList.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("selectedBandEntriesMNList", -1);
            }
            else {
               selectedBandEntriesMNList = null;
            }

            // decode pdcch_BlindDetectionSCG

            if (pdcch_BlindDetectionSCGPresent) {
               buffer.getContext().eventDispatcher.startElement("pdcch_BlindDetectionSCG", -1);

               pdcch_BlindDetectionSCG = new Asn1Integer();
               pdcch_BlindDetectionSCG.decode (buffer, 1, 15);

               buffer.invokeCharacters(pdcch_BlindDetectionSCG.toString());
               buffer.getContext().eventDispatcher.endElement("pdcch_BlindDetectionSCG", -1);
            }
            else {
               pdcch_BlindDetectionSCG = null;
            }

            // decode maxNumberROHC_ContextSessionsSN

            if (maxNumberROHC_ContextSessionsSNPresent) {
               buffer.getContext().eventDispatcher.startElement("maxNumberROHC_ContextSessionsSN", -1);

               maxNumberROHC_ContextSessionsSN = new Asn1Integer();
               maxNumberROHC_ContextSessionsSN.decode (buffer, 0, 16384);

               buffer.invokeCharacters(maxNumberROHC_ContextSessionsSN.toString());
               buffer.getContext().eventDispatcher.endElement("maxNumberROHC_ContextSessionsSN", -1);
            }
            else {
               maxNumberROHC_ContextSessionsSN = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean maxIntraFreqMeasIdentitiesSCGPresent = buffer.decodeBit ("maxIntraFreqMeasIdentitiesSCGPresent");

            boolean maxInterFreqMeasIdentitiesSCGPresent = buffer.decodeBit ("maxInterFreqMeasIdentitiesSCGPresent");

            // decode maxIntraFreqMeasIdentitiesSCG

            if (maxIntraFreqMeasIdentitiesSCGPresent) {
               buffer.getContext().eventDispatcher.startElement("maxIntraFreqMeasIdentitiesSCG", -1);

               maxIntraFreqMeasIdentitiesSCG = new Asn1Integer();
               maxIntraFreqMeasIdentitiesSCG.decode (buffer, 1, 62);

               buffer.invokeCharacters(maxIntraFreqMeasIdentitiesSCG.toString());
               buffer.getContext().eventDispatcher.endElement("maxIntraFreqMeasIdentitiesSCG", -1);
            }
            else {
               maxIntraFreqMeasIdentitiesSCG = null;
            }

            // decode maxInterFreqMeasIdentitiesSCG

            if (maxInterFreqMeasIdentitiesSCGPresent) {
               buffer.getContext().eventDispatcher.startElement("maxInterFreqMeasIdentitiesSCG", -1);

               maxInterFreqMeasIdentitiesSCG = new Asn1Integer();
               maxInterFreqMeasIdentitiesSCG.decode (buffer, 1, 62);

               buffer.invokeCharacters(maxInterFreqMeasIdentitiesSCG.toString());
               buffer.getContext().eventDispatcher.endElement("maxInterFreqMeasIdentitiesSCG", -1);
            }
            else {
               maxInterFreqMeasIdentitiesSCG = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean p_maxNR_FR1_MCG_r16Present = buffer.decodeBit ("p_maxNR_FR1_MCG_r16Present");

            boolean powerCoordination_FR2_r16Present = buffer.decodeBit ("powerCoordination_FR2_r16Present");

            boolean nrdc_PC_mode_FR1_r16Present = buffer.decodeBit ("nrdc_PC_mode_FR1_r16Present");

            boolean nrdc_PC_mode_FR2_r16Present = buffer.decodeBit ("nrdc_PC_mode_FR2_r16Present");

            boolean maxMeasSRS_ResourceSCG_r16Present = buffer.decodeBit ("maxMeasSRS_ResourceSCG_r16Present");

            boolean maxMeasCLI_ResourceSCG_r16Present = buffer.decodeBit ("maxMeasCLI_ResourceSCG_r16Present");

            boolean maxNumberEHC_ContextsSN_r16Present = buffer.decodeBit ("maxNumberEHC_ContextsSN_r16Present");

            boolean allowedReducedConfigForOverheating_r16Present = buffer.decodeBit ("allowedReducedConfigForOverheating_r16Present");

            boolean maxToffset_r16Present = buffer.decodeBit ("maxToffset_r16Present");

            // decode p_maxNR_FR1_MCG_r16

            if (p_maxNR_FR1_MCG_r16Present) {
               buffer.getContext().eventDispatcher.startElement("p_maxNR_FR1_MCG_r16", -1);

               p_maxNR_FR1_MCG_r16 = new P_Max();
               p_maxNR_FR1_MCG_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("p_maxNR_FR1_MCG_r16", -1);
            }
            else {
               p_maxNR_FR1_MCG_r16 = null;
            }

            // decode powerCoordination_FR2_r16

            if (powerCoordination_FR2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("powerCoordination_FR2_r16", -1);

               powerCoordination_FR2_r16 = new ConfigRestrictInfoSCG_powerCoordination_FR2_r16();
               powerCoordination_FR2_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("powerCoordination_FR2_r16", -1);
            }
            else {
               powerCoordination_FR2_r16 = null;
            }

            // decode nrdc_PC_mode_FR1_r16

            if (nrdc_PC_mode_FR1_r16Present) {
               buffer.getContext().eventDispatcher.startElement("nrdc_PC_mode_FR1_r16", -1);

               int tval = ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16.decodeEnumValue (buffer);
               nrdc_PC_mode_FR1_r16 = ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("nrdc_PC_mode_FR1_r16", -1);
            }
            else {
               nrdc_PC_mode_FR1_r16 = null;
            }

            // decode nrdc_PC_mode_FR2_r16

            if (nrdc_PC_mode_FR2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("nrdc_PC_mode_FR2_r16", -1);

               int tval = ConfigRestrictInfoSCG_nrdc_PC_mode_FR2_r16.decodeEnumValue (buffer);
               nrdc_PC_mode_FR2_r16 = ConfigRestrictInfoSCG_nrdc_PC_mode_FR2_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("nrdc_PC_mode_FR2_r16", -1);
            }
            else {
               nrdc_PC_mode_FR2_r16 = null;
            }

            // decode maxMeasSRS_ResourceSCG_r16

            if (maxMeasSRS_ResourceSCG_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxMeasSRS_ResourceSCG_r16", -1);

               maxMeasSRS_ResourceSCG_r16 = new Asn1Integer();
               maxMeasSRS_ResourceSCG_r16.decode (buffer, 0, 32);

               buffer.invokeCharacters(maxMeasSRS_ResourceSCG_r16.toString());
               buffer.getContext().eventDispatcher.endElement("maxMeasSRS_ResourceSCG_r16", -1);
            }
            else {
               maxMeasSRS_ResourceSCG_r16 = null;
            }

            // decode maxMeasCLI_ResourceSCG_r16

            if (maxMeasCLI_ResourceSCG_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxMeasCLI_ResourceSCG_r16", -1);

               maxMeasCLI_ResourceSCG_r16 = new Asn1Integer();
               maxMeasCLI_ResourceSCG_r16.decode (buffer, 0, 64);

               buffer.invokeCharacters(maxMeasCLI_ResourceSCG_r16.toString());
               buffer.getContext().eventDispatcher.endElement("maxMeasCLI_ResourceSCG_r16", -1);
            }
            else {
               maxMeasCLI_ResourceSCG_r16 = null;
            }

            // decode maxNumberEHC_ContextsSN_r16

            if (maxNumberEHC_ContextsSN_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxNumberEHC_ContextsSN_r16", -1);

               maxNumberEHC_ContextsSN_r16 = new Asn1Integer();
               maxNumberEHC_ContextsSN_r16.decode (buffer, 0, 65536);

               buffer.invokeCharacters(maxNumberEHC_ContextsSN_r16.toString());
               buffer.getContext().eventDispatcher.endElement("maxNumberEHC_ContextsSN_r16", -1);
            }
            else {
               maxNumberEHC_ContextsSN_r16 = null;
            }

            // decode allowedReducedConfigForOverheating_r16

            if (allowedReducedConfigForOverheating_r16Present) {
               buffer.getContext().eventDispatcher.startElement("allowedReducedConfigForOverheating_r16", -1);

               allowedReducedConfigForOverheating_r16 = new OverheatingAssistance();
               allowedReducedConfigForOverheating_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("allowedReducedConfigForOverheating_r16", -1);
            }
            else {
               allowedReducedConfigForOverheating_r16 = null;
            }

            // decode maxToffset_r16

            if (maxToffset_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxToffset_r16", -1);

               int tval = T_Offset_r16.decodeEnumValue (buffer);
               maxToffset_r16 = T_Offset_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("maxToffset_r16", -1);
            }
            else {
               maxToffset_r16 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (allowedBC_ListMRDC != null) allowedBC_ListMRDC.print (_sb, "allowedBC_ListMRDC", _level+1);
      if (powerCoordination_FR1 != null) powerCoordination_FR1.print (_sb, "powerCoordination_FR1", _level+1);
      if (servCellIndexRangeSCG != null) servCellIndexRangeSCG.print (_sb, "servCellIndexRangeSCG", _level+1);
      if (maxMeasFreqsSCG != null) maxMeasFreqsSCG.print (_sb, "maxMeasFreqsSCG", _level+1);
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      if (selectedBandEntriesMNList != null) selectedBandEntriesMNList.print (_sb, "selectedBandEntriesMNList", _level+1);
      if (pdcch_BlindDetectionSCG != null) pdcch_BlindDetectionSCG.print (_sb, "pdcch_BlindDetectionSCG", _level+1);
      if (maxNumberROHC_ContextSessionsSN != null) maxNumberROHC_ContextSessionsSN.print (_sb, "maxNumberROHC_ContextSessionsSN", _level+1);
      if (maxIntraFreqMeasIdentitiesSCG != null) maxIntraFreqMeasIdentitiesSCG.print (_sb, "maxIntraFreqMeasIdentitiesSCG", _level+1);
      if (maxInterFreqMeasIdentitiesSCG != null) maxInterFreqMeasIdentitiesSCG.print (_sb, "maxInterFreqMeasIdentitiesSCG", _level+1);
      if (p_maxNR_FR1_MCG_r16 != null) p_maxNR_FR1_MCG_r16.print (_sb, "p_maxNR_FR1_MCG_r16", _level+1);
      if (powerCoordination_FR2_r16 != null) powerCoordination_FR2_r16.print (_sb, "powerCoordination_FR2_r16", _level+1);
      if (nrdc_PC_mode_FR1_r16 != null) nrdc_PC_mode_FR1_r16.print (_sb, "nrdc_PC_mode_FR1_r16", _level+1);
      if (nrdc_PC_mode_FR2_r16 != null) nrdc_PC_mode_FR2_r16.print (_sb, "nrdc_PC_mode_FR2_r16", _level+1);
      if (maxMeasSRS_ResourceSCG_r16 != null) maxMeasSRS_ResourceSCG_r16.print (_sb, "maxMeasSRS_ResourceSCG_r16", _level+1);
      if (maxMeasCLI_ResourceSCG_r16 != null) maxMeasCLI_ResourceSCG_r16.print (_sb, "maxMeasCLI_ResourceSCG_r16", _level+1);
      if (maxNumberEHC_ContextsSN_r16 != null) maxNumberEHC_ContextsSN_r16.print (_sb, "maxNumberEHC_ContextsSN_r16", _level+1);
      if (allowedReducedConfigForOverheating_r16 != null) allowedReducedConfigForOverheating_r16.print (_sb, "allowedReducedConfigForOverheating_r16", _level+1);
      if (maxToffset_r16 != null) maxToffset_r16.print (_sb, "maxToffset_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
