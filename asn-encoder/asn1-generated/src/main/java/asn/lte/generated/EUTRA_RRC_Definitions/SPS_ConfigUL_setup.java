/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPS_ConfigUL_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SPS_ConfigUL_setup_semiPersistSchedIntervalUL semiPersistSchedIntervalUL = null;
   public SPS_ConfigUL_setup_implicitReleaseAfter implicitReleaseAfter = null;
   public SPS_ConfigUL_setup_p0_Persistent p0_Persistent;  // optional
   public SPS_ConfigUL_setup_twoIntervalsConfig twoIntervalsConfig = null;  // optional
   public boolean mV2ExtPresent;
   public SPS_ConfigUL_setup_p0_PersistentSubframeSet2_r12 p0_PersistentSubframeSet2_r12;  // optional
   public boolean mV3ExtPresent;
   public Asn1Integer numberOfConfUlSPS_Processes_r13;  // optional
   public boolean mV4ExtPresent;
   public SPS_ConfigUL_setup_fixedRV_NonAdaptive_r14 fixedRV_NonAdaptive_r14 = null;  // optional
   public SPS_ConfigIndex_r14 sps_ConfigIndex_r14;  // optional
   public SPS_ConfigUL_setup_semiPersistSchedIntervalUL_v1430 semiPersistSchedIntervalUL_v1430 = null;  // optional
   public boolean mV5ExtPresent;
   public SPS_ConfigUL_setup_cyclicShiftSPS_r15 cyclicShiftSPS_r15 = null;  // optional
   public Asn1Integer harq_ProcID_Offset_r15;  // optional
   public SPS_ConfigUL_setup_rv_SPS_UL_Repetitions_r15 rv_SPS_UL_Repetitions_r15 = null;  // optional
   public TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15;  // optional
   public SPS_ConfigUL_setup_totalNumberPUSCH_SPS_UL_Repetitions_r15 totalNumberPUSCH_SPS_UL_Repetitions_r15 = null;  // optional
   public SPS_ConfigIndex_r15 sps_ConfigIndex_r15;  // optional
   public Asn1OpenExt extElem1;

   public SPS_ConfigUL_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SPS_ConfigUL_setup (
      SPS_ConfigUL_setup_semiPersistSchedIntervalUL semiPersistSchedIntervalUL_,
      SPS_ConfigUL_setup_implicitReleaseAfter implicitReleaseAfter_,
      SPS_ConfigUL_setup_p0_Persistent p0_Persistent_,
      SPS_ConfigUL_setup_twoIntervalsConfig twoIntervalsConfig_,
      SPS_ConfigUL_setup_p0_PersistentSubframeSet2_r12 p0_PersistentSubframeSet2_r12_,
      Asn1Integer numberOfConfUlSPS_Processes_r13_,
      SPS_ConfigUL_setup_fixedRV_NonAdaptive_r14 fixedRV_NonAdaptive_r14_,
      SPS_ConfigIndex_r14 sps_ConfigIndex_r14_,
      SPS_ConfigUL_setup_semiPersistSchedIntervalUL_v1430 semiPersistSchedIntervalUL_v1430_,
      SPS_ConfigUL_setup_cyclicShiftSPS_r15 cyclicShiftSPS_r15_,
      Asn1Integer harq_ProcID_Offset_r15_,
      SPS_ConfigUL_setup_rv_SPS_UL_Repetitions_r15 rv_SPS_UL_Repetitions_r15_,
      TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15_,
      SPS_ConfigUL_setup_totalNumberPUSCH_SPS_UL_Repetitions_r15 totalNumberPUSCH_SPS_UL_Repetitions_r15_,
      SPS_ConfigIndex_r15 sps_ConfigIndex_r15_
   ) {
      super();
      semiPersistSchedIntervalUL = semiPersistSchedIntervalUL_;
      implicitReleaseAfter = implicitReleaseAfter_;
      p0_Persistent = p0_Persistent_;
      twoIntervalsConfig = twoIntervalsConfig_;
      p0_PersistentSubframeSet2_r12 = p0_PersistentSubframeSet2_r12_;
      numberOfConfUlSPS_Processes_r13 = numberOfConfUlSPS_Processes_r13_;
      fixedRV_NonAdaptive_r14 = fixedRV_NonAdaptive_r14_;
      sps_ConfigIndex_r14 = sps_ConfigIndex_r14_;
      semiPersistSchedIntervalUL_v1430 = semiPersistSchedIntervalUL_v1430_;
      cyclicShiftSPS_r15 = cyclicShiftSPS_r15_;
      harq_ProcID_Offset_r15 = harq_ProcID_Offset_r15_;
      rv_SPS_UL_Repetitions_r15 = rv_SPS_UL_Repetitions_r15_;
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = tpc_PDCCH_ConfigPUSCH_SPS_r15_;
      totalNumberPUSCH_SPS_UL_Repetitions_r15 = totalNumberPUSCH_SPS_UL_Repetitions_r15_;
      sps_ConfigIndex_r15 = sps_ConfigIndex_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SPS_ConfigUL_setup (
      SPS_ConfigUL_setup_semiPersistSchedIntervalUL semiPersistSchedIntervalUL_,
      SPS_ConfigUL_setup_implicitReleaseAfter implicitReleaseAfter_
   ) {
      super();
      semiPersistSchedIntervalUL = semiPersistSchedIntervalUL_;
      implicitReleaseAfter = implicitReleaseAfter_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SPS_ConfigUL_setup (SPS_ConfigUL_setup_semiPersistSchedIntervalUL semiPersistSchedIntervalUL_,
      SPS_ConfigUL_setup_implicitReleaseAfter implicitReleaseAfter_,
      SPS_ConfigUL_setup_p0_Persistent p0_Persistent_,
      SPS_ConfigUL_setup_twoIntervalsConfig twoIntervalsConfig_,
      SPS_ConfigUL_setup_p0_PersistentSubframeSet2_r12 p0_PersistentSubframeSet2_r12_,
      long numberOfConfUlSPS_Processes_r13_,
      SPS_ConfigUL_setup_fixedRV_NonAdaptive_r14 fixedRV_NonAdaptive_r14_,
      long sps_ConfigIndex_r14_,
      SPS_ConfigUL_setup_semiPersistSchedIntervalUL_v1430 semiPersistSchedIntervalUL_v1430_,
      SPS_ConfigUL_setup_cyclicShiftSPS_r15 cyclicShiftSPS_r15_,
      long harq_ProcID_Offset_r15_,
      SPS_ConfigUL_setup_rv_SPS_UL_Repetitions_r15 rv_SPS_UL_Repetitions_r15_,
      TPC_PDCCH_Config tpc_PDCCH_ConfigPUSCH_SPS_r15_,
      SPS_ConfigUL_setup_totalNumberPUSCH_SPS_UL_Repetitions_r15 totalNumberPUSCH_SPS_UL_Repetitions_r15_,
      long sps_ConfigIndex_r15_
   ) {
      super();
      semiPersistSchedIntervalUL = semiPersistSchedIntervalUL_;
      implicitReleaseAfter = implicitReleaseAfter_;
      p0_Persistent = p0_Persistent_;
      twoIntervalsConfig = twoIntervalsConfig_;
      p0_PersistentSubframeSet2_r12 = p0_PersistentSubframeSet2_r12_;
      numberOfConfUlSPS_Processes_r13 = new Asn1Integer (numberOfConfUlSPS_Processes_r13_);
      fixedRV_NonAdaptive_r14 = fixedRV_NonAdaptive_r14_;
      sps_ConfigIndex_r14 = new SPS_ConfigIndex_r14 (sps_ConfigIndex_r14_);
      semiPersistSchedIntervalUL_v1430 = semiPersistSchedIntervalUL_v1430_;
      cyclicShiftSPS_r15 = cyclicShiftSPS_r15_;
      harq_ProcID_Offset_r15 = new Asn1Integer (harq_ProcID_Offset_r15_);
      rv_SPS_UL_Repetitions_r15 = rv_SPS_UL_Repetitions_r15_;
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = tpc_PDCCH_ConfigPUSCH_SPS_r15_;
      totalNumberPUSCH_SPS_UL_Repetitions_r15 = totalNumberPUSCH_SPS_UL_Repetitions_r15_;
      sps_ConfigIndex_r15 = new SPS_ConfigIndex_r15 (sps_ConfigIndex_r15_);
   }

   public void init () {
      semiPersistSchedIntervalUL = null;
      implicitReleaseAfter = null;
      p0_Persistent = null;
      twoIntervalsConfig = null;
      p0_PersistentSubframeSet2_r12 = null;
      numberOfConfUlSPS_Processes_r13 = null;
      fixedRV_NonAdaptive_r14 = null;
      sps_ConfigIndex_r14 = null;
      semiPersistSchedIntervalUL_v1430 = null;
      cyclicShiftSPS_r15 = null;
      harq_ProcID_Offset_r15 = null;
      rv_SPS_UL_Repetitions_r15 = null;
      tpc_PDCCH_ConfigPUSCH_SPS_r15 = null;
      totalNumberPUSCH_SPS_UL_Repetitions_r15 = null;
      sps_ConfigIndex_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 16; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return semiPersistSchedIntervalUL;
         case 1: return implicitReleaseAfter;
         case 2: return p0_Persistent;
         case 3: return twoIntervalsConfig;
         case 4: return p0_PersistentSubframeSet2_r12;
         case 5: return numberOfConfUlSPS_Processes_r13;
         case 6: return fixedRV_NonAdaptive_r14;
         case 7: return sps_ConfigIndex_r14;
         case 8: return semiPersistSchedIntervalUL_v1430;
         case 9: return cyclicShiftSPS_r15;
         case 10: return harq_ProcID_Offset_r15;
         case 11: return rv_SPS_UL_Repetitions_r15;
         case 12: return tpc_PDCCH_ConfigPUSCH_SPS_r15;
         case 13: return totalNumberPUSCH_SPS_UL_Repetitions_r15;
         case 14: return sps_ConfigIndex_r15;
         case 15: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "semiPersistSchedIntervalUL";
         case 1: return "implicitReleaseAfter";
         case 2: return "p0-Persistent";
         case 3: return "twoIntervalsConfig";
         case 4: return "p0-PersistentSubframeSet2-r12";
         case 5: return "numberOfConfUlSPS-Processes-r13";
         case 6: return "fixedRV-NonAdaptive-r14";
         case 7: return "sps-ConfigIndex-r14";
         case 8: return "semiPersistSchedIntervalUL-v1430";
         case 9: return "cyclicShiftSPS-r15";
         case 10: return "harq-ProcID-Offset-r15";
         case 11: return "rv-SPS-UL-Repetitions-r15";
         case 12: return "tpc-PDCCH-ConfigPUSCH-SPS-r15";
         case 13: return "totalNumberPUSCH-SPS-UL-Repetitions-r15";
         case 14: return "sps-ConfigIndex-r15";
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

      boolean p0_PersistentPresent = buffer.decodeBit ("p0_PersistentPresent");
      boolean twoIntervalsConfigPresent = buffer.decodeBit ("twoIntervalsConfigPresent");

      // decode semiPersistSchedIntervalUL

      buffer.getContext().eventDispatcher.startElement("semiPersistSchedIntervalUL", -1);

      {
         int tval = SPS_ConfigUL_setup_semiPersistSchedIntervalUL.decodeEnumValue (buffer);
         semiPersistSchedIntervalUL = SPS_ConfigUL_setup_semiPersistSchedIntervalUL.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("semiPersistSchedIntervalUL", -1);

      // decode implicitReleaseAfter

      buffer.getContext().eventDispatcher.startElement("implicitReleaseAfter", -1);

      {
         int tval = SPS_ConfigUL_setup_implicitReleaseAfter.decodeEnumValue (buffer);
         implicitReleaseAfter = SPS_ConfigUL_setup_implicitReleaseAfter.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("implicitReleaseAfter", -1);

      // decode p0_Persistent

      if (p0_PersistentPresent) {
         buffer.getContext().eventDispatcher.startElement("p0_Persistent", -1);

         p0_Persistent = new SPS_ConfigUL_setup_p0_Persistent();
         p0_Persistent.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p0_Persistent", -1);
      }
      else {
         p0_Persistent = null;
      }

      // decode twoIntervalsConfig

      if (twoIntervalsConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("twoIntervalsConfig", -1);

         int tval = SPS_ConfigUL_setup_twoIntervalsConfig.decodeEnumValue (buffer);
         twoIntervalsConfig = SPS_ConfigUL_setup_twoIntervalsConfig.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("twoIntervalsConfig", -1);
      }
      else {
         twoIntervalsConfig = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean p0_PersistentSubframeSet2_r12Present = buffer.decodeBit ("p0_PersistentSubframeSet2_r12Present");

            // decode p0_PersistentSubframeSet2_r12

            if (p0_PersistentSubframeSet2_r12Present) {
               buffer.getContext().eventDispatcher.startElement("p0_PersistentSubframeSet2_r12", -1);

               p0_PersistentSubframeSet2_r12 = new SPS_ConfigUL_setup_p0_PersistentSubframeSet2_r12();
               p0_PersistentSubframeSet2_r12.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("p0_PersistentSubframeSet2_r12", -1);
            }
            else {
               p0_PersistentSubframeSet2_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean numberOfConfUlSPS_Processes_r13Present = buffer.decodeBit ("numberOfConfUlSPS_Processes_r13Present");

            // decode numberOfConfUlSPS_Processes_r13

            if (numberOfConfUlSPS_Processes_r13Present) {
               buffer.getContext().eventDispatcher.startElement("numberOfConfUlSPS_Processes_r13", -1);

               numberOfConfUlSPS_Processes_r13 = new Asn1Integer();
               numberOfConfUlSPS_Processes_r13.decode (buffer, 1, 8);

               buffer.invokeCharacters(numberOfConfUlSPS_Processes_r13.toString());
               buffer.getContext().eventDispatcher.endElement("numberOfConfUlSPS_Processes_r13", -1);
            }
            else {
               numberOfConfUlSPS_Processes_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean fixedRV_NonAdaptive_r14Present = buffer.decodeBit ("fixedRV_NonAdaptive_r14Present");

            boolean sps_ConfigIndex_r14Present = buffer.decodeBit ("sps_ConfigIndex_r14Present");

            boolean semiPersistSchedIntervalUL_v1430Present = buffer.decodeBit ("semiPersistSchedIntervalUL_v1430Present");

            // decode fixedRV_NonAdaptive_r14

            if (fixedRV_NonAdaptive_r14Present) {
               buffer.getContext().eventDispatcher.startElement("fixedRV_NonAdaptive_r14", -1);

               int tval = SPS_ConfigUL_setup_fixedRV_NonAdaptive_r14.decodeEnumValue (buffer);
               fixedRV_NonAdaptive_r14 = SPS_ConfigUL_setup_fixedRV_NonAdaptive_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("fixedRV_NonAdaptive_r14", -1);
            }
            else {
               fixedRV_NonAdaptive_r14 = null;
            }

            // decode sps_ConfigIndex_r14

            if (sps_ConfigIndex_r14Present) {
               buffer.getContext().eventDispatcher.startElement("sps_ConfigIndex_r14", -1);

               sps_ConfigIndex_r14 = new SPS_ConfigIndex_r14();
               sps_ConfigIndex_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sps_ConfigIndex_r14", -1);
            }
            else {
               sps_ConfigIndex_r14 = null;
            }

            // decode semiPersistSchedIntervalUL_v1430

            if (semiPersistSchedIntervalUL_v1430Present) {
               buffer.getContext().eventDispatcher.startElement("semiPersistSchedIntervalUL_v1430", -1);

               int tval = SPS_ConfigUL_setup_semiPersistSchedIntervalUL_v1430.decodeEnumValue (buffer);
               semiPersistSchedIntervalUL_v1430 = SPS_ConfigUL_setup_semiPersistSchedIntervalUL_v1430.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("semiPersistSchedIntervalUL_v1430", -1);
            }
            else {
               semiPersistSchedIntervalUL_v1430 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cyclicShiftSPS_r15Present = buffer.decodeBit ("cyclicShiftSPS_r15Present");

            boolean harq_ProcID_Offset_r15Present = buffer.decodeBit ("harq_ProcID_Offset_r15Present");

            boolean rv_SPS_UL_Repetitions_r15Present = buffer.decodeBit ("rv_SPS_UL_Repetitions_r15Present");

            boolean tpc_PDCCH_ConfigPUSCH_SPS_r15Present = buffer.decodeBit ("tpc_PDCCH_ConfigPUSCH_SPS_r15Present");

            boolean totalNumberPUSCH_SPS_UL_Repetitions_r15Present = buffer.decodeBit ("totalNumberPUSCH_SPS_UL_Repetitions_r15Present");

            boolean sps_ConfigIndex_r15Present = buffer.decodeBit ("sps_ConfigIndex_r15Present");

            // decode cyclicShiftSPS_r15

            if (cyclicShiftSPS_r15Present) {
               buffer.getContext().eventDispatcher.startElement("cyclicShiftSPS_r15", -1);

               int tval = SPS_ConfigUL_setup_cyclicShiftSPS_r15.decodeEnumValue (buffer);
               cyclicShiftSPS_r15 = SPS_ConfigUL_setup_cyclicShiftSPS_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("cyclicShiftSPS_r15", -1);
            }
            else {
               cyclicShiftSPS_r15 = null;
            }

            // decode harq_ProcID_Offset_r15

            if (harq_ProcID_Offset_r15Present) {
               buffer.getContext().eventDispatcher.startElement("harq_ProcID_Offset_r15", -1);

               harq_ProcID_Offset_r15 = new Asn1Integer();
               harq_ProcID_Offset_r15.decode (buffer, 0, 7);

               buffer.invokeCharacters(harq_ProcID_Offset_r15.toString());
               buffer.getContext().eventDispatcher.endElement("harq_ProcID_Offset_r15", -1);
            }
            else {
               harq_ProcID_Offset_r15 = null;
            }

            // decode rv_SPS_UL_Repetitions_r15

            if (rv_SPS_UL_Repetitions_r15Present) {
               buffer.getContext().eventDispatcher.startElement("rv_SPS_UL_Repetitions_r15", -1);

               int tval = SPS_ConfigUL_setup_rv_SPS_UL_Repetitions_r15.decodeEnumValue (buffer);
               rv_SPS_UL_Repetitions_r15 = SPS_ConfigUL_setup_rv_SPS_UL_Repetitions_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("rv_SPS_UL_Repetitions_r15", -1);
            }
            else {
               rv_SPS_UL_Repetitions_r15 = null;
            }

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

            // decode totalNumberPUSCH_SPS_UL_Repetitions_r15

            if (totalNumberPUSCH_SPS_UL_Repetitions_r15Present) {
               buffer.getContext().eventDispatcher.startElement("totalNumberPUSCH_SPS_UL_Repetitions_r15", -1);

               int tval = SPS_ConfigUL_setup_totalNumberPUSCH_SPS_UL_Repetitions_r15.decodeEnumValue (buffer);
               totalNumberPUSCH_SPS_UL_Repetitions_r15 = SPS_ConfigUL_setup_totalNumberPUSCH_SPS_UL_Repetitions_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("totalNumberPUSCH_SPS_UL_Repetitions_r15", -1);
            }
            else {
               totalNumberPUSCH_SPS_UL_Repetitions_r15 = null;
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
      if (semiPersistSchedIntervalUL != null) semiPersistSchedIntervalUL.print (_sb, "semiPersistSchedIntervalUL", _level+1);
      if (implicitReleaseAfter != null) implicitReleaseAfter.print (_sb, "implicitReleaseAfter", _level+1);
      if (p0_Persistent != null) p0_Persistent.print (_sb, "p0_Persistent", _level+1);
      if (twoIntervalsConfig != null) twoIntervalsConfig.print (_sb, "twoIntervalsConfig", _level+1);
      if (p0_PersistentSubframeSet2_r12 != null) p0_PersistentSubframeSet2_r12.print (_sb, "p0_PersistentSubframeSet2_r12", _level+1);
      if (numberOfConfUlSPS_Processes_r13 != null) numberOfConfUlSPS_Processes_r13.print (_sb, "numberOfConfUlSPS_Processes_r13", _level+1);
      if (fixedRV_NonAdaptive_r14 != null) fixedRV_NonAdaptive_r14.print (_sb, "fixedRV_NonAdaptive_r14", _level+1);
      if (sps_ConfigIndex_r14 != null) sps_ConfigIndex_r14.print (_sb, "sps_ConfigIndex_r14", _level+1);
      if (semiPersistSchedIntervalUL_v1430 != null) semiPersistSchedIntervalUL_v1430.print (_sb, "semiPersistSchedIntervalUL_v1430", _level+1);
      if (cyclicShiftSPS_r15 != null) cyclicShiftSPS_r15.print (_sb, "cyclicShiftSPS_r15", _level+1);
      if (harq_ProcID_Offset_r15 != null) harq_ProcID_Offset_r15.print (_sb, "harq_ProcID_Offset_r15", _level+1);
      if (rv_SPS_UL_Repetitions_r15 != null) rv_SPS_UL_Repetitions_r15.print (_sb, "rv_SPS_UL_Repetitions_r15", _level+1);
      if (tpc_PDCCH_ConfigPUSCH_SPS_r15 != null) tpc_PDCCH_ConfigPUSCH_SPS_r15.print (_sb, "tpc_PDCCH_ConfigPUSCH_SPS_r15", _level+1);
      if (totalNumberPUSCH_SPS_UL_Repetitions_r15 != null) totalNumberPUSCH_SPS_UL_Repetitions_r15.print (_sb, "totalNumberPUSCH_SPS_UL_Repetitions_r15", _level+1);
      if (sps_ConfigIndex_r15 != null) sps_ConfigIndex_r15.print (_sb, "sps_ConfigIndex_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
