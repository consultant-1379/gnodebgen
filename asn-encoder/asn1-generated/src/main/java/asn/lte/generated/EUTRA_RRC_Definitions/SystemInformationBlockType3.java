/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType3 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType3";
   }

   public SystemInformationBlockType3_cellReselectionInfoCommon cellReselectionInfoCommon;
   public SystemInformationBlockType3_cellReselectionServingFreqInfo cellReselectionServingFreqInfo;
   public SystemInformationBlockType3_intraFreqCellReselectionInfo intraFreqCellReselectionInfo;
   public SystemInformationBlockType3_v10j0_IEs lateNonCriticalExtension;  // optional
   public boolean mV3ExtPresent;
   public SystemInformationBlockType3_s_IntraSearch_v920 s_IntraSearch_v920;  // optional
   public SystemInformationBlockType3_s_NonIntraSearch_v920 s_NonIntraSearch_v920;  // optional
   public Q_QualMin_r9 q_QualMin_r9;  // optional
   public ReselectionThresholdQ_r9 threshServingLowQ_r9;  // optional
   public boolean mV4ExtPresent;
   public Q_QualMin_r9 q_QualMinWB_r11;  // optional
   public boolean mV5ExtPresent;
   public Q_QualMin_r9 q_QualMinRSRQ_OnAllSymbols_r12;  // optional
   public boolean mV6ExtPresent;
   public CellReselectionServingFreqInfo_v1310 cellReselectionServingFreqInfo_v1310;  // optional
   public RedistributionServingInfo_r13 redistributionServingInfo_r13;  // optional
   public CellSelectionInfoCE_r13 cellSelectionInfoCE_r13;  // optional
   public T_ReselectionEUTRA_CE_r13 t_ReselectionEUTRA_CE_r13;  // optional
   public boolean mV7ExtPresent;
   public CellSelectionInfoCE1_r13 cellSelectionInfoCE1_r13;  // optional
   public boolean mV8ExtPresent;
   public CellSelectionInfoCE1_v1360 cellSelectionInfoCE1_v1360;  // optional
   public boolean mV9ExtPresent;
   public CellReselectionInfoCommon_v1460 cellReselectionInfoCommon_v1460;  // optional
   public boolean mV10ExtPresent;
   public CellReselectionInfoHSDN_r15 cellReselectionInfoHSDN_r15;  // optional
   public CellSelectionInfoCE_v1530 cellSelectionInfoCE_v1530;  // optional
   public SystemInformationBlockType3_crs_IntfMitigNeighCellsCE_r15 crs_IntfMitigNeighCellsCE_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType3 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType3 (
      SystemInformationBlockType3_cellReselectionInfoCommon cellReselectionInfoCommon_,
      SystemInformationBlockType3_cellReselectionServingFreqInfo cellReselectionServingFreqInfo_,
      SystemInformationBlockType3_intraFreqCellReselectionInfo intraFreqCellReselectionInfo_,
      SystemInformationBlockType3_v10j0_IEs lateNonCriticalExtension_,
      SystemInformationBlockType3_s_IntraSearch_v920 s_IntraSearch_v920_,
      SystemInformationBlockType3_s_NonIntraSearch_v920 s_NonIntraSearch_v920_,
      Q_QualMin_r9 q_QualMin_r9_,
      ReselectionThresholdQ_r9 threshServingLowQ_r9_,
      Q_QualMin_r9 q_QualMinWB_r11_,
      Q_QualMin_r9 q_QualMinRSRQ_OnAllSymbols_r12_,
      CellReselectionServingFreqInfo_v1310 cellReselectionServingFreqInfo_v1310_,
      RedistributionServingInfo_r13 redistributionServingInfo_r13_,
      CellSelectionInfoCE_r13 cellSelectionInfoCE_r13_,
      T_ReselectionEUTRA_CE_r13 t_ReselectionEUTRA_CE_r13_,
      CellSelectionInfoCE1_r13 cellSelectionInfoCE1_r13_,
      CellSelectionInfoCE1_v1360 cellSelectionInfoCE1_v1360_,
      CellReselectionInfoCommon_v1460 cellReselectionInfoCommon_v1460_,
      CellReselectionInfoHSDN_r15 cellReselectionInfoHSDN_r15_,
      CellSelectionInfoCE_v1530 cellSelectionInfoCE_v1530_,
      SystemInformationBlockType3_crs_IntfMitigNeighCellsCE_r15 crs_IntfMitigNeighCellsCE_r15_
   ) {
      super();
      cellReselectionInfoCommon = cellReselectionInfoCommon_;
      cellReselectionServingFreqInfo = cellReselectionServingFreqInfo_;
      intraFreqCellReselectionInfo = intraFreqCellReselectionInfo_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      s_IntraSearch_v920 = s_IntraSearch_v920_;
      s_NonIntraSearch_v920 = s_NonIntraSearch_v920_;
      q_QualMin_r9 = q_QualMin_r9_;
      threshServingLowQ_r9 = threshServingLowQ_r9_;
      q_QualMinWB_r11 = q_QualMinWB_r11_;
      q_QualMinRSRQ_OnAllSymbols_r12 = q_QualMinRSRQ_OnAllSymbols_r12_;
      cellReselectionServingFreqInfo_v1310 = cellReselectionServingFreqInfo_v1310_;
      redistributionServingInfo_r13 = redistributionServingInfo_r13_;
      cellSelectionInfoCE_r13 = cellSelectionInfoCE_r13_;
      t_ReselectionEUTRA_CE_r13 = t_ReselectionEUTRA_CE_r13_;
      cellSelectionInfoCE1_r13 = cellSelectionInfoCE1_r13_;
      cellSelectionInfoCE1_v1360 = cellSelectionInfoCE1_v1360_;
      cellReselectionInfoCommon_v1460 = cellReselectionInfoCommon_v1460_;
      cellReselectionInfoHSDN_r15 = cellReselectionInfoHSDN_r15_;
      cellSelectionInfoCE_v1530 = cellSelectionInfoCE_v1530_;
      crs_IntfMitigNeighCellsCE_r15 = crs_IntfMitigNeighCellsCE_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType3 (
      SystemInformationBlockType3_cellReselectionInfoCommon cellReselectionInfoCommon_,
      SystemInformationBlockType3_cellReselectionServingFreqInfo cellReselectionServingFreqInfo_,
      SystemInformationBlockType3_intraFreqCellReselectionInfo intraFreqCellReselectionInfo_
   ) {
      super();
      cellReselectionInfoCommon = cellReselectionInfoCommon_;
      cellReselectionServingFreqInfo = cellReselectionServingFreqInfo_;
      intraFreqCellReselectionInfo = intraFreqCellReselectionInfo_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType3 (SystemInformationBlockType3_cellReselectionInfoCommon cellReselectionInfoCommon_,
      SystemInformationBlockType3_cellReselectionServingFreqInfo cellReselectionServingFreqInfo_,
      SystemInformationBlockType3_intraFreqCellReselectionInfo intraFreqCellReselectionInfo_,
      SystemInformationBlockType3_v10j0_IEs lateNonCriticalExtension_,
      SystemInformationBlockType3_s_IntraSearch_v920 s_IntraSearch_v920_,
      SystemInformationBlockType3_s_NonIntraSearch_v920 s_NonIntraSearch_v920_,
      long q_QualMin_r9_,
      long threshServingLowQ_r9_,
      long q_QualMinWB_r11_,
      long q_QualMinRSRQ_OnAllSymbols_r12_,
      CellReselectionServingFreqInfo_v1310 cellReselectionServingFreqInfo_v1310_,
      RedistributionServingInfo_r13 redistributionServingInfo_r13_,
      CellSelectionInfoCE_r13 cellSelectionInfoCE_r13_,
      long t_ReselectionEUTRA_CE_r13_,
      CellSelectionInfoCE1_r13 cellSelectionInfoCE1_r13_,
      CellSelectionInfoCE1_v1360 cellSelectionInfoCE1_v1360_,
      CellReselectionInfoCommon_v1460 cellReselectionInfoCommon_v1460_,
      CellReselectionInfoHSDN_r15 cellReselectionInfoHSDN_r15_,
      CellSelectionInfoCE_v1530 cellSelectionInfoCE_v1530_,
      SystemInformationBlockType3_crs_IntfMitigNeighCellsCE_r15 crs_IntfMitigNeighCellsCE_r15_
   ) {
      super();
      cellReselectionInfoCommon = cellReselectionInfoCommon_;
      cellReselectionServingFreqInfo = cellReselectionServingFreqInfo_;
      intraFreqCellReselectionInfo = intraFreqCellReselectionInfo_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      s_IntraSearch_v920 = s_IntraSearch_v920_;
      s_NonIntraSearch_v920 = s_NonIntraSearch_v920_;
      q_QualMin_r9 = new Q_QualMin_r9 (q_QualMin_r9_);
      threshServingLowQ_r9 = new ReselectionThresholdQ_r9 (threshServingLowQ_r9_);
      q_QualMinWB_r11 = new Q_QualMin_r9 (q_QualMinWB_r11_);
      q_QualMinRSRQ_OnAllSymbols_r12 = new Q_QualMin_r9 (q_QualMinRSRQ_OnAllSymbols_r12_);
      cellReselectionServingFreqInfo_v1310 = cellReselectionServingFreqInfo_v1310_;
      redistributionServingInfo_r13 = redistributionServingInfo_r13_;
      cellSelectionInfoCE_r13 = cellSelectionInfoCE_r13_;
      t_ReselectionEUTRA_CE_r13 = new T_ReselectionEUTRA_CE_r13 (t_ReselectionEUTRA_CE_r13_);
      cellSelectionInfoCE1_r13 = cellSelectionInfoCE1_r13_;
      cellSelectionInfoCE1_v1360 = cellSelectionInfoCE1_v1360_;
      cellReselectionInfoCommon_v1460 = cellReselectionInfoCommon_v1460_;
      cellReselectionInfoHSDN_r15 = cellReselectionInfoHSDN_r15_;
      cellSelectionInfoCE_v1530 = cellSelectionInfoCE_v1530_;
      crs_IntfMitigNeighCellsCE_r15 = crs_IntfMitigNeighCellsCE_r15_;
   }

   public void init () {
      cellReselectionInfoCommon = null;
      cellReselectionServingFreqInfo = null;
      intraFreqCellReselectionInfo = null;
      lateNonCriticalExtension = null;
      s_IntraSearch_v920 = null;
      s_NonIntraSearch_v920 = null;
      q_QualMin_r9 = null;
      threshServingLowQ_r9 = null;
      q_QualMinWB_r11 = null;
      q_QualMinRSRQ_OnAllSymbols_r12 = null;
      cellReselectionServingFreqInfo_v1310 = null;
      redistributionServingInfo_r13 = null;
      cellSelectionInfoCE_r13 = null;
      t_ReselectionEUTRA_CE_r13 = null;
      cellSelectionInfoCE1_r13 = null;
      cellSelectionInfoCE1_v1360 = null;
      cellReselectionInfoCommon_v1460 = null;
      cellReselectionInfoHSDN_r15 = null;
      cellSelectionInfoCE_v1530 = null;
      crs_IntfMitigNeighCellsCE_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 21; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellReselectionInfoCommon;
         case 1: return cellReselectionServingFreqInfo;
         case 2: return intraFreqCellReselectionInfo;
         case 3: return lateNonCriticalExtension;
         case 4: return s_IntraSearch_v920;
         case 5: return s_NonIntraSearch_v920;
         case 6: return q_QualMin_r9;
         case 7: return threshServingLowQ_r9;
         case 8: return q_QualMinWB_r11;
         case 9: return q_QualMinRSRQ_OnAllSymbols_r12;
         case 10: return cellReselectionServingFreqInfo_v1310;
         case 11: return redistributionServingInfo_r13;
         case 12: return cellSelectionInfoCE_r13;
         case 13: return t_ReselectionEUTRA_CE_r13;
         case 14: return cellSelectionInfoCE1_r13;
         case 15: return cellSelectionInfoCE1_v1360;
         case 16: return cellReselectionInfoCommon_v1460;
         case 17: return cellReselectionInfoHSDN_r15;
         case 18: return cellSelectionInfoCE_v1530;
         case 19: return crs_IntfMitigNeighCellsCE_r15;
         case 20: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellReselectionInfoCommon";
         case 1: return "cellReselectionServingFreqInfo";
         case 2: return "intraFreqCellReselectionInfo";
         case 3: return "lateNonCriticalExtension";
         case 4: return "s-IntraSearch-v920";
         case 5: return "s-NonIntraSearch-v920";
         case 6: return "q-QualMin-r9";
         case 7: return "threshServingLowQ-r9";
         case 8: return "q-QualMinWB-r11";
         case 9: return "q-QualMinRSRQ-OnAllSymbols-r12";
         case 10: return "cellReselectionServingFreqInfo-v1310";
         case 11: return "redistributionServingInfo-r13";
         case 12: return "cellSelectionInfoCE-r13";
         case 13: return "t-ReselectionEUTRA-CE-r13";
         case 14: return "cellSelectionInfoCE1-r13";
         case 15: return "cellSelectionInfoCE1-v1360";
         case 16: return "cellReselectionInfoCommon-v1460";
         case 17: return "cellReselectionInfoHSDN-r15";
         case 18: return "cellSelectionInfoCE-v1530";
         case 19: return "crs-IntfMitigNeighCellsCE-r15";
         case 20: return null;
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

      // decode cellReselectionInfoCommon

      buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon", -1);

      cellReselectionInfoCommon = new SystemInformationBlockType3_cellReselectionInfoCommon();
      cellReselectionInfoCommon.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon", -1);

      // decode cellReselectionServingFreqInfo

      buffer.getContext().eventDispatcher.startElement("cellReselectionServingFreqInfo", -1);

      cellReselectionServingFreqInfo = new SystemInformationBlockType3_cellReselectionServingFreqInfo();
      cellReselectionServingFreqInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionServingFreqInfo", -1);

      // decode intraFreqCellReselectionInfo

      buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo", -1);

      intraFreqCellReselectionInfo = new SystemInformationBlockType3_intraFreqCellReselectionInfo();
      intraFreqCellReselectionInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("lateNonCriticalExtensionPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV7ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV8ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV9ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV10ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode lateNonCriticalExtension

         if (i < bitcnt && bitmap[i++]) {
            buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

            long _curidx = buffer.getBitOffset();
            bitidx = buffer.decodeExtLength ();
            if (bitidx - _curidx >= 131088)  {
               throw new Asn1Exception ("PER fragmentation not enabled: add -perindef to decode");
            }

            /* decode contained type */
            Asn1OctetString lateNonCriticalExtension_outer = new Asn1OctetString();
            lateNonCriticalExtension_outer.decode (buffer);

            if (lateNonCriticalExtension_outer.value == null) {
               throw new Asn1Exception("contained type's complete encoding is empty");
            }

            Asn1PerDecodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerDecodeBuffer (lateNonCriticalExtension_outer.value, buffer.isAligned());
            buffer.setEventHandlerList( savedBuffer );

            lateNonCriticalExtension = new SystemInformationBlockType3_v10j0_IEs();
            lateNonCriticalExtension.decode (buffer);

            buffer = savedBuffer;
            buffer.moveBitCursor (bitidx);

            buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);

         }
         else {
            lateNonCriticalExtension = null;
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean s_IntraSearch_v920Present = buffer.decodeBit ("s_IntraSearch_v920Present");

            boolean s_NonIntraSearch_v920Present = buffer.decodeBit ("s_NonIntraSearch_v920Present");

            boolean q_QualMin_r9Present = buffer.decodeBit ("q_QualMin_r9Present");

            boolean threshServingLowQ_r9Present = buffer.decodeBit ("threshServingLowQ_r9Present");

            // decode s_IntraSearch_v920

            if (s_IntraSearch_v920Present) {
               buffer.getContext().eventDispatcher.startElement("s_IntraSearch_v920", -1);

               s_IntraSearch_v920 = new SystemInformationBlockType3_s_IntraSearch_v920();
               s_IntraSearch_v920.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("s_IntraSearch_v920", -1);
            }
            else {
               s_IntraSearch_v920 = null;
            }

            // decode s_NonIntraSearch_v920

            if (s_NonIntraSearch_v920Present) {
               buffer.getContext().eventDispatcher.startElement("s_NonIntraSearch_v920", -1);

               s_NonIntraSearch_v920 = new SystemInformationBlockType3_s_NonIntraSearch_v920();
               s_NonIntraSearch_v920.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("s_NonIntraSearch_v920", -1);
            }
            else {
               s_NonIntraSearch_v920 = null;
            }

            // decode q_QualMin_r9

            if (q_QualMin_r9Present) {
               buffer.getContext().eventDispatcher.startElement("q_QualMin_r9", -1);

               q_QualMin_r9 = new Q_QualMin_r9();
               q_QualMin_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("q_QualMin_r9", -1);
            }
            else {
               q_QualMin_r9 = null;
            }

            // decode threshServingLowQ_r9

            if (threshServingLowQ_r9Present) {
               buffer.getContext().eventDispatcher.startElement("threshServingLowQ_r9", -1);

               threshServingLowQ_r9 = new ReselectionThresholdQ_r9();
               threshServingLowQ_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("threshServingLowQ_r9", -1);
            }
            else {
               threshServingLowQ_r9 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean q_QualMinWB_r11Present = buffer.decodeBit ("q_QualMinWB_r11Present");

            // decode q_QualMinWB_r11

            if (q_QualMinWB_r11Present) {
               buffer.getContext().eventDispatcher.startElement("q_QualMinWB_r11", -1);

               q_QualMinWB_r11 = new Q_QualMin_r9();
               q_QualMinWB_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("q_QualMinWB_r11", -1);
            }
            else {
               q_QualMinWB_r11 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean q_QualMinRSRQ_OnAllSymbols_r12Present = buffer.decodeBit ("q_QualMinRSRQ_OnAllSymbols_r12Present");

            // decode q_QualMinRSRQ_OnAllSymbols_r12

            if (q_QualMinRSRQ_OnAllSymbols_r12Present) {
               buffer.getContext().eventDispatcher.startElement("q_QualMinRSRQ_OnAllSymbols_r12", -1);

               q_QualMinRSRQ_OnAllSymbols_r12 = new Q_QualMin_r9();
               q_QualMinRSRQ_OnAllSymbols_r12.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("q_QualMinRSRQ_OnAllSymbols_r12", -1);
            }
            else {
               q_QualMinRSRQ_OnAllSymbols_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellReselectionServingFreqInfo_v1310Present = buffer.decodeBit ("cellReselectionServingFreqInfo_v1310Present");

            boolean redistributionServingInfo_r13Present = buffer.decodeBit ("redistributionServingInfo_r13Present");

            boolean cellSelectionInfoCE_r13Present = buffer.decodeBit ("cellSelectionInfoCE_r13Present");

            boolean t_ReselectionEUTRA_CE_r13Present = buffer.decodeBit ("t_ReselectionEUTRA_CE_r13Present");

            // decode cellReselectionServingFreqInfo_v1310

            if (cellReselectionServingFreqInfo_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("cellReselectionServingFreqInfo_v1310", -1);

               cellReselectionServingFreqInfo_v1310 = new CellReselectionServingFreqInfo_v1310();
               cellReselectionServingFreqInfo_v1310.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellReselectionServingFreqInfo_v1310", -1);
            }
            else {
               cellReselectionServingFreqInfo_v1310 = null;
            }

            // decode redistributionServingInfo_r13

            if (redistributionServingInfo_r13Present) {
               buffer.getContext().eventDispatcher.startElement("redistributionServingInfo_r13", -1);

               redistributionServingInfo_r13 = new RedistributionServingInfo_r13();
               redistributionServingInfo_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("redistributionServingInfo_r13", -1);
            }
            else {
               redistributionServingInfo_r13 = null;
            }

            // decode cellSelectionInfoCE_r13

            if (cellSelectionInfoCE_r13Present) {
               buffer.getContext().eventDispatcher.startElement("cellSelectionInfoCE_r13", -1);

               cellSelectionInfoCE_r13 = new CellSelectionInfoCE_r13();
               cellSelectionInfoCE_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellSelectionInfoCE_r13", -1);
            }
            else {
               cellSelectionInfoCE_r13 = null;
            }

            // decode t_ReselectionEUTRA_CE_r13

            if (t_ReselectionEUTRA_CE_r13Present) {
               buffer.getContext().eventDispatcher.startElement("t_ReselectionEUTRA_CE_r13", -1);

               t_ReselectionEUTRA_CE_r13 = new T_ReselectionEUTRA_CE_r13();
               t_ReselectionEUTRA_CE_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("t_ReselectionEUTRA_CE_r13", -1);
            }
            else {
               t_ReselectionEUTRA_CE_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV7ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellSelectionInfoCE1_r13Present = buffer.decodeBit ("cellSelectionInfoCE1_r13Present");

            // decode cellSelectionInfoCE1_r13

            if (cellSelectionInfoCE1_r13Present) {
               buffer.getContext().eventDispatcher.startElement("cellSelectionInfoCE1_r13", -1);

               cellSelectionInfoCE1_r13 = new CellSelectionInfoCE1_r13();
               cellSelectionInfoCE1_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellSelectionInfoCE1_r13", -1);
            }
            else {
               cellSelectionInfoCE1_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV8ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellSelectionInfoCE1_v1360Present = buffer.decodeBit ("cellSelectionInfoCE1_v1360Present");

            // decode cellSelectionInfoCE1_v1360

            if (cellSelectionInfoCE1_v1360Present) {
               buffer.getContext().eventDispatcher.startElement("cellSelectionInfoCE1_v1360", -1);

               cellSelectionInfoCE1_v1360 = new CellSelectionInfoCE1_v1360();
               cellSelectionInfoCE1_v1360.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellSelectionInfoCE1_v1360", -1);
            }
            else {
               cellSelectionInfoCE1_v1360 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV9ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellReselectionInfoCommon_v1460Present = buffer.decodeBit ("cellReselectionInfoCommon_v1460Present");

            // decode cellReselectionInfoCommon_v1460

            if (cellReselectionInfoCommon_v1460Present) {
               buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon_v1460", -1);

               cellReselectionInfoCommon_v1460 = new CellReselectionInfoCommon_v1460();
               cellReselectionInfoCommon_v1460.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon_v1460", -1);
            }
            else {
               cellReselectionInfoCommon_v1460 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV10ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellReselectionInfoHSDN_r15Present = buffer.decodeBit ("cellReselectionInfoHSDN_r15Present");

            boolean cellSelectionInfoCE_v1530Present = buffer.decodeBit ("cellSelectionInfoCE_v1530Present");

            boolean crs_IntfMitigNeighCellsCE_r15Present = buffer.decodeBit ("crs_IntfMitigNeighCellsCE_r15Present");

            // decode cellReselectionInfoHSDN_r15

            if (cellReselectionInfoHSDN_r15Present) {
               buffer.getContext().eventDispatcher.startElement("cellReselectionInfoHSDN_r15", -1);

               cellReselectionInfoHSDN_r15 = new CellReselectionInfoHSDN_r15();
               cellReselectionInfoHSDN_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellReselectionInfoHSDN_r15", -1);
            }
            else {
               cellReselectionInfoHSDN_r15 = null;
            }

            // decode cellSelectionInfoCE_v1530

            if (cellSelectionInfoCE_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("cellSelectionInfoCE_v1530", -1);

               cellSelectionInfoCE_v1530 = new CellSelectionInfoCE_v1530();
               cellSelectionInfoCE_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellSelectionInfoCE_v1530", -1);
            }
            else {
               cellSelectionInfoCE_v1530 = null;
            }

            // decode crs_IntfMitigNeighCellsCE_r15

            if (crs_IntfMitigNeighCellsCE_r15Present) {
               buffer.getContext().eventDispatcher.startElement("crs_IntfMitigNeighCellsCE_r15", -1);

               int tval = SystemInformationBlockType3_crs_IntfMitigNeighCellsCE_r15.decodeEnumValue (buffer);
               crs_IntfMitigNeighCellsCE_r15 = SystemInformationBlockType3_crs_IntfMitigNeighCellsCE_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("crs_IntfMitigNeighCellsCE_r15", -1);
            }
            else {
               crs_IntfMitigNeighCellsCE_r15 = null;
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
      if (cellReselectionInfoCommon != null) cellReselectionInfoCommon.print (_sb, "cellReselectionInfoCommon", _level+1);
      if (cellReselectionServingFreqInfo != null) cellReselectionServingFreqInfo.print (_sb, "cellReselectionServingFreqInfo", _level+1);
      if (intraFreqCellReselectionInfo != null) intraFreqCellReselectionInfo.print (_sb, "intraFreqCellReselectionInfo", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (s_IntraSearch_v920 != null) s_IntraSearch_v920.print (_sb, "s_IntraSearch_v920", _level+1);
      if (s_NonIntraSearch_v920 != null) s_NonIntraSearch_v920.print (_sb, "s_NonIntraSearch_v920", _level+1);
      if (q_QualMin_r9 != null) q_QualMin_r9.print (_sb, "q_QualMin_r9", _level+1);
      if (threshServingLowQ_r9 != null) threshServingLowQ_r9.print (_sb, "threshServingLowQ_r9", _level+1);
      if (q_QualMinWB_r11 != null) q_QualMinWB_r11.print (_sb, "q_QualMinWB_r11", _level+1);
      if (q_QualMinRSRQ_OnAllSymbols_r12 != null) q_QualMinRSRQ_OnAllSymbols_r12.print (_sb, "q_QualMinRSRQ_OnAllSymbols_r12", _level+1);
      if (cellReselectionServingFreqInfo_v1310 != null) cellReselectionServingFreqInfo_v1310.print (_sb, "cellReselectionServingFreqInfo_v1310", _level+1);
      if (redistributionServingInfo_r13 != null) redistributionServingInfo_r13.print (_sb, "redistributionServingInfo_r13", _level+1);
      if (cellSelectionInfoCE_r13 != null) cellSelectionInfoCE_r13.print (_sb, "cellSelectionInfoCE_r13", _level+1);
      if (t_ReselectionEUTRA_CE_r13 != null) t_ReselectionEUTRA_CE_r13.print (_sb, "t_ReselectionEUTRA_CE_r13", _level+1);
      if (cellSelectionInfoCE1_r13 != null) cellSelectionInfoCE1_r13.print (_sb, "cellSelectionInfoCE1_r13", _level+1);
      if (cellSelectionInfoCE1_v1360 != null) cellSelectionInfoCE1_v1360.print (_sb, "cellSelectionInfoCE1_v1360", _level+1);
      if (cellReselectionInfoCommon_v1460 != null) cellReselectionInfoCommon_v1460.print (_sb, "cellReselectionInfoCommon_v1460", _level+1);
      if (cellReselectionInfoHSDN_r15 != null) cellReselectionInfoHSDN_r15.print (_sb, "cellReselectionInfoHSDN_r15", _level+1);
      if (cellSelectionInfoCE_v1530 != null) cellSelectionInfoCE_v1530.print (_sb, "cellSelectionInfoCE_v1530", _level+1);
      if (crs_IntfMitigNeighCellsCE_r15 != null) crs_IntfMitigNeighCellsCE_r15.print (_sb, "crs_IntfMitigNeighCellsCE_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
