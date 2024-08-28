/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResults extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResults";
   }

   public MeasId measId;
   public MeasResults_measResultPCell measResultPCell;
   public MeasResults_measResultNeighCells measResultNeighCells;  // optional
   public boolean mV2ExtPresent;
   public MeasResultForECID_r9 measResultForECID_r9;  // optional
   public boolean mV3ExtPresent;
   public LocationInfo_r10 locationInfo_r10;  // optional
   public MeasResultServFreqList_r10 measResultServFreqList_r10;  // optional
   public boolean mV4ExtPresent;
   public MeasId_v1250 measId_v1250;  // optional
   public RSRQ_Range_v1250 measResultPCell_v1250;  // optional
   public MeasResultCSI_RS_List_r12 measResultCSI_RS_List_r12;  // optional
   public boolean mV5ExtPresent;
   public MeasResultForRSSI_r13 measResultForRSSI_r13;  // optional
   public MeasResultServFreqListExt_r13 measResultServFreqListExt_r13;  // optional
   public MeasResultSSTD_r13 measResultSSTD_r13;  // optional
   public MeasResults_measResultPCell_v1310 measResultPCell_v1310;  // optional
   public UL_PDCP_DelayResultList_r13 ul_PDCP_DelayResultList_r13;  // optional
   public MeasResultListWLAN_r13 measResultListWLAN_r13;  // optional
   public boolean mV6ExtPresent;
   public RSRP_Range_v1360 measResultPCell_v1360;  // optional
   public boolean mV7ExtPresent;
   public MeasResultListCBR_r14 measResultListCBR_r14;  // optional
   public MeasResultListWLAN_r14 measResultListWLAN_r14;  // optional
   public boolean mV8ExtPresent;
   public MeasResultServFreqListNR_r15 measResultServFreqListNR_r15;  // optional
   public MeasResultCellListSFTD_r15 measResultCellListSFTD_r15;  // optional
   public boolean mV9ExtPresent;
   public LogMeasResultListBT_r15 logMeasResultListBT_r15;  // optional
   public LogMeasResultListWLAN_r15 logMeasResultListWLAN_r15;  // optional
   public MeasResultSensing_r15 measResultSensing_r15;  // optional
   public Asn1Integer heightUE_r15;  // optional
   public Asn1OpenExt extElem1;

   public MeasResults () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResults (
      MeasId measId_,
      MeasResults_measResultPCell measResultPCell_,
      MeasResults_measResultNeighCells measResultNeighCells_,
      MeasResultForECID_r9 measResultForECID_r9_,
      LocationInfo_r10 locationInfo_r10_,
      MeasResultServFreqList_r10 measResultServFreqList_r10_,
      MeasId_v1250 measId_v1250_,
      RSRQ_Range_v1250 measResultPCell_v1250_,
      MeasResultCSI_RS_List_r12 measResultCSI_RS_List_r12_,
      MeasResultForRSSI_r13 measResultForRSSI_r13_,
      MeasResultServFreqListExt_r13 measResultServFreqListExt_r13_,
      MeasResultSSTD_r13 measResultSSTD_r13_,
      MeasResults_measResultPCell_v1310 measResultPCell_v1310_,
      UL_PDCP_DelayResultList_r13 ul_PDCP_DelayResultList_r13_,
      MeasResultListWLAN_r13 measResultListWLAN_r13_,
      RSRP_Range_v1360 measResultPCell_v1360_,
      MeasResultListCBR_r14 measResultListCBR_r14_,
      MeasResultListWLAN_r14 measResultListWLAN_r14_,
      MeasResultServFreqListNR_r15 measResultServFreqListNR_r15_,
      MeasResultCellListSFTD_r15 measResultCellListSFTD_r15_,
      LogMeasResultListBT_r15 logMeasResultListBT_r15_,
      LogMeasResultListWLAN_r15 logMeasResultListWLAN_r15_,
      MeasResultSensing_r15 measResultSensing_r15_,
      Asn1Integer heightUE_r15_
   ) {
      super();
      measId = measId_;
      measResultPCell = measResultPCell_;
      measResultNeighCells = measResultNeighCells_;
      measResultForECID_r9 = measResultForECID_r9_;
      locationInfo_r10 = locationInfo_r10_;
      measResultServFreqList_r10 = measResultServFreqList_r10_;
      measId_v1250 = measId_v1250_;
      measResultPCell_v1250 = measResultPCell_v1250_;
      measResultCSI_RS_List_r12 = measResultCSI_RS_List_r12_;
      measResultForRSSI_r13 = measResultForRSSI_r13_;
      measResultServFreqListExt_r13 = measResultServFreqListExt_r13_;
      measResultSSTD_r13 = measResultSSTD_r13_;
      measResultPCell_v1310 = measResultPCell_v1310_;
      ul_PDCP_DelayResultList_r13 = ul_PDCP_DelayResultList_r13_;
      measResultListWLAN_r13 = measResultListWLAN_r13_;
      measResultPCell_v1360 = measResultPCell_v1360_;
      measResultListCBR_r14 = measResultListCBR_r14_;
      measResultListWLAN_r14 = measResultListWLAN_r14_;
      measResultServFreqListNR_r15 = measResultServFreqListNR_r15_;
      measResultCellListSFTD_r15 = measResultCellListSFTD_r15_;
      logMeasResultListBT_r15 = logMeasResultListBT_r15_;
      logMeasResultListWLAN_r15 = logMeasResultListWLAN_r15_;
      measResultSensing_r15 = measResultSensing_r15_;
      heightUE_r15 = heightUE_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResults (
      MeasId measId_,
      MeasResults_measResultPCell measResultPCell_
   ) {
      super();
      measId = measId_;
      measResultPCell = measResultPCell_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResults (long measId_,
      MeasResults_measResultPCell measResultPCell_,
      MeasResults_measResultNeighCells measResultNeighCells_,
      MeasResultForECID_r9 measResultForECID_r9_,
      LocationInfo_r10 locationInfo_r10_,
      MeasResultServFreqList_r10 measResultServFreqList_r10_,
      long measId_v1250_,
      long measResultPCell_v1250_,
      MeasResultCSI_RS_List_r12 measResultCSI_RS_List_r12_,
      MeasResultForRSSI_r13 measResultForRSSI_r13_,
      MeasResultServFreqListExt_r13 measResultServFreqListExt_r13_,
      MeasResultSSTD_r13 measResultSSTD_r13_,
      MeasResults_measResultPCell_v1310 measResultPCell_v1310_,
      UL_PDCP_DelayResultList_r13 ul_PDCP_DelayResultList_r13_,
      MeasResultListWLAN_r13 measResultListWLAN_r13_,
      long measResultPCell_v1360_,
      MeasResultListCBR_r14 measResultListCBR_r14_,
      MeasResultListWLAN_r14 measResultListWLAN_r14_,
      MeasResultServFreqListNR_r15 measResultServFreqListNR_r15_,
      MeasResultCellListSFTD_r15 measResultCellListSFTD_r15_,
      LogMeasResultListBT_r15 logMeasResultListBT_r15_,
      LogMeasResultListWLAN_r15 logMeasResultListWLAN_r15_,
      MeasResultSensing_r15 measResultSensing_r15_,
      long heightUE_r15_
   ) {
      super();
      measId = new MeasId (measId_);
      measResultPCell = measResultPCell_;
      measResultNeighCells = measResultNeighCells_;
      measResultForECID_r9 = measResultForECID_r9_;
      locationInfo_r10 = locationInfo_r10_;
      measResultServFreqList_r10 = measResultServFreqList_r10_;
      measId_v1250 = new MeasId_v1250 (measId_v1250_);
      measResultPCell_v1250 = new RSRQ_Range_v1250 (measResultPCell_v1250_);
      measResultCSI_RS_List_r12 = measResultCSI_RS_List_r12_;
      measResultForRSSI_r13 = measResultForRSSI_r13_;
      measResultServFreqListExt_r13 = measResultServFreqListExt_r13_;
      measResultSSTD_r13 = measResultSSTD_r13_;
      measResultPCell_v1310 = measResultPCell_v1310_;
      ul_PDCP_DelayResultList_r13 = ul_PDCP_DelayResultList_r13_;
      measResultListWLAN_r13 = measResultListWLAN_r13_;
      measResultPCell_v1360 = new RSRP_Range_v1360 (measResultPCell_v1360_);
      measResultListCBR_r14 = measResultListCBR_r14_;
      measResultListWLAN_r14 = measResultListWLAN_r14_;
      measResultServFreqListNR_r15 = measResultServFreqListNR_r15_;
      measResultCellListSFTD_r15 = measResultCellListSFTD_r15_;
      logMeasResultListBT_r15 = logMeasResultListBT_r15_;
      logMeasResultListWLAN_r15 = logMeasResultListWLAN_r15_;
      measResultSensing_r15 = measResultSensing_r15_;
      heightUE_r15 = new Asn1Integer (heightUE_r15_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResults (
      long measId_,
      MeasResults_measResultPCell measResultPCell_
   ) {
      super();
      measId = new MeasId (measId_);
      measResultPCell = measResultPCell_;
   }

   public void init () {
      measId = null;
      measResultPCell = null;
      measResultNeighCells = null;
      measResultForECID_r9 = null;
      locationInfo_r10 = null;
      measResultServFreqList_r10 = null;
      measId_v1250 = null;
      measResultPCell_v1250 = null;
      measResultCSI_RS_List_r12 = null;
      measResultForRSSI_r13 = null;
      measResultServFreqListExt_r13 = null;
      measResultSSTD_r13 = null;
      measResultPCell_v1310 = null;
      ul_PDCP_DelayResultList_r13 = null;
      measResultListWLAN_r13 = null;
      measResultPCell_v1360 = null;
      measResultListCBR_r14 = null;
      measResultListWLAN_r14 = null;
      measResultServFreqListNR_r15 = null;
      measResultCellListSFTD_r15 = null;
      logMeasResultListBT_r15 = null;
      logMeasResultListWLAN_r15 = null;
      measResultSensing_r15 = null;
      heightUE_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 25; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measId;
         case 1: return measResultPCell;
         case 2: return measResultNeighCells;
         case 3: return measResultForECID_r9;
         case 4: return locationInfo_r10;
         case 5: return measResultServFreqList_r10;
         case 6: return measId_v1250;
         case 7: return measResultPCell_v1250;
         case 8: return measResultCSI_RS_List_r12;
         case 9: return measResultForRSSI_r13;
         case 10: return measResultServFreqListExt_r13;
         case 11: return measResultSSTD_r13;
         case 12: return measResultPCell_v1310;
         case 13: return ul_PDCP_DelayResultList_r13;
         case 14: return measResultListWLAN_r13;
         case 15: return measResultPCell_v1360;
         case 16: return measResultListCBR_r14;
         case 17: return measResultListWLAN_r14;
         case 18: return measResultServFreqListNR_r15;
         case 19: return measResultCellListSFTD_r15;
         case 20: return logMeasResultListBT_r15;
         case 21: return logMeasResultListWLAN_r15;
         case 22: return measResultSensing_r15;
         case 23: return heightUE_r15;
         case 24: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measId";
         case 1: return "measResultPCell";
         case 2: return "measResultNeighCells";
         case 3: return "measResultForECID-r9";
         case 4: return "locationInfo-r10";
         case 5: return "measResultServFreqList-r10";
         case 6: return "measId-v1250";
         case 7: return "measResultPCell-v1250";
         case 8: return "measResultCSI-RS-List-r12";
         case 9: return "measResultForRSSI-r13";
         case 10: return "measResultServFreqListExt-r13";
         case 11: return "measResultSSTD-r13";
         case 12: return "measResultPCell-v1310";
         case 13: return "ul-PDCP-DelayResultList-r13";
         case 14: return "measResultListWLAN-r13";
         case 15: return "measResultPCell-v1360";
         case 16: return "measResultListCBR-r14";
         case 17: return "measResultListWLAN-r14";
         case 18: return "measResultServFreqListNR-r15";
         case 19: return "measResultCellListSFTD-r15";
         case 20: return "logMeasResultListBT-r15";
         case 21: return "logMeasResultListWLAN-r15";
         case 22: return "measResultSensing-r15";
         case 23: return "heightUE-r15";
         case 24: return null;
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

      boolean measResultNeighCellsPresent = buffer.decodeBit ("measResultNeighCellsPresent");

      // decode measId

      buffer.getContext().eventDispatcher.startElement("measId", -1);

      measId = new MeasId();
      measId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measId", -1);

      // decode measResultPCell

      buffer.getContext().eventDispatcher.startElement("measResultPCell", -1);

      measResultPCell = new MeasResults_measResultPCell();
      measResultPCell.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measResultPCell", -1);

      // decode measResultNeighCells

      if (measResultNeighCellsPresent) {
         buffer.getContext().eventDispatcher.startElement("measResultNeighCells", -1);

         measResultNeighCells = new MeasResults_measResultNeighCells();
         measResultNeighCells.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultNeighCells", -1);
      }
      else {
         measResultNeighCells = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV7ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV8ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV9ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultForECID_r9Present = buffer.decodeBit ("measResultForECID_r9Present");

            // decode measResultForECID_r9

            if (measResultForECID_r9Present) {
               buffer.getContext().eventDispatcher.startElement("measResultForECID_r9", -1);

               measResultForECID_r9 = new MeasResultForECID_r9();
               measResultForECID_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultForECID_r9", -1);
            }
            else {
               measResultForECID_r9 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean locationInfo_r10Present = buffer.decodeBit ("locationInfo_r10Present");

            boolean measResultServFreqList_r10Present = buffer.decodeBit ("measResultServFreqList_r10Present");

            // decode locationInfo_r10

            if (locationInfo_r10Present) {
               buffer.getContext().eventDispatcher.startElement("locationInfo_r10", -1);

               locationInfo_r10 = new LocationInfo_r10();
               locationInfo_r10.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("locationInfo_r10", -1);
            }
            else {
               locationInfo_r10 = null;
            }

            // decode measResultServFreqList_r10

            if (measResultServFreqList_r10Present) {
               buffer.getContext().eventDispatcher.startElement("measResultServFreqList_r10", -1);

               measResultServFreqList_r10 = new MeasResultServFreqList_r10();
               measResultServFreqList_r10.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultServFreqList_r10", -1);
            }
            else {
               measResultServFreqList_r10 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measId_v1250Present = buffer.decodeBit ("measId_v1250Present");

            boolean measResultPCell_v1250Present = buffer.decodeBit ("measResultPCell_v1250Present");

            boolean measResultCSI_RS_List_r12Present = buffer.decodeBit ("measResultCSI_RS_List_r12Present");

            // decode measId_v1250

            if (measId_v1250Present) {
               buffer.getContext().eventDispatcher.startElement("measId_v1250", -1);

               measId_v1250 = new MeasId_v1250();
               measId_v1250.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measId_v1250", -1);
            }
            else {
               measId_v1250 = null;
            }

            // decode measResultPCell_v1250

            if (measResultPCell_v1250Present) {
               buffer.getContext().eventDispatcher.startElement("measResultPCell_v1250", -1);

               measResultPCell_v1250 = new RSRQ_Range_v1250();
               measResultPCell_v1250.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultPCell_v1250", -1);
            }
            else {
               measResultPCell_v1250 = null;
            }

            // decode measResultCSI_RS_List_r12

            if (measResultCSI_RS_List_r12Present) {
               buffer.getContext().eventDispatcher.startElement("measResultCSI_RS_List_r12", -1);

               measResultCSI_RS_List_r12 = new MeasResultCSI_RS_List_r12();
               measResultCSI_RS_List_r12.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultCSI_RS_List_r12", -1);
            }
            else {
               measResultCSI_RS_List_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultForRSSI_r13Present = buffer.decodeBit ("measResultForRSSI_r13Present");

            boolean measResultServFreqListExt_r13Present = buffer.decodeBit ("measResultServFreqListExt_r13Present");

            boolean measResultSSTD_r13Present = buffer.decodeBit ("measResultSSTD_r13Present");

            boolean measResultPCell_v1310Present = buffer.decodeBit ("measResultPCell_v1310Present");

            boolean ul_PDCP_DelayResultList_r13Present = buffer.decodeBit ("ul_PDCP_DelayResultList_r13Present");

            boolean measResultListWLAN_r13Present = buffer.decodeBit ("measResultListWLAN_r13Present");

            // decode measResultForRSSI_r13

            if (measResultForRSSI_r13Present) {
               buffer.getContext().eventDispatcher.startElement("measResultForRSSI_r13", -1);

               measResultForRSSI_r13 = new MeasResultForRSSI_r13();
               measResultForRSSI_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultForRSSI_r13", -1);
            }
            else {
               measResultForRSSI_r13 = null;
            }

            // decode measResultServFreqListExt_r13

            if (measResultServFreqListExt_r13Present) {
               buffer.getContext().eventDispatcher.startElement("measResultServFreqListExt_r13", -1);

               measResultServFreqListExt_r13 = new MeasResultServFreqListExt_r13();
               measResultServFreqListExt_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultServFreqListExt_r13", -1);
            }
            else {
               measResultServFreqListExt_r13 = null;
            }

            // decode measResultSSTD_r13

            if (measResultSSTD_r13Present) {
               buffer.getContext().eventDispatcher.startElement("measResultSSTD_r13", -1);

               measResultSSTD_r13 = new MeasResultSSTD_r13();
               measResultSSTD_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultSSTD_r13", -1);
            }
            else {
               measResultSSTD_r13 = null;
            }

            // decode measResultPCell_v1310

            if (measResultPCell_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("measResultPCell_v1310", -1);

               measResultPCell_v1310 = new MeasResults_measResultPCell_v1310();
               measResultPCell_v1310.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultPCell_v1310", -1);
            }
            else {
               measResultPCell_v1310 = null;
            }

            // decode ul_PDCP_DelayResultList_r13

            if (ul_PDCP_DelayResultList_r13Present) {
               buffer.getContext().eventDispatcher.startElement("ul_PDCP_DelayResultList_r13", -1);

               ul_PDCP_DelayResultList_r13 = new UL_PDCP_DelayResultList_r13();
               ul_PDCP_DelayResultList_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ul_PDCP_DelayResultList_r13", -1);
            }
            else {
               ul_PDCP_DelayResultList_r13 = null;
            }

            // decode measResultListWLAN_r13

            if (measResultListWLAN_r13Present) {
               buffer.getContext().eventDispatcher.startElement("measResultListWLAN_r13", -1);

               measResultListWLAN_r13 = new MeasResultListWLAN_r13();
               measResultListWLAN_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultListWLAN_r13", -1);
            }
            else {
               measResultListWLAN_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultPCell_v1360Present = buffer.decodeBit ("measResultPCell_v1360Present");

            // decode measResultPCell_v1360

            if (measResultPCell_v1360Present) {
               buffer.getContext().eventDispatcher.startElement("measResultPCell_v1360", -1);

               measResultPCell_v1360 = new RSRP_Range_v1360();
               measResultPCell_v1360.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultPCell_v1360", -1);
            }
            else {
               measResultPCell_v1360 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV7ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultListCBR_r14Present = buffer.decodeBit ("measResultListCBR_r14Present");

            boolean measResultListWLAN_r14Present = buffer.decodeBit ("measResultListWLAN_r14Present");

            // decode measResultListCBR_r14

            if (measResultListCBR_r14Present) {
               buffer.getContext().eventDispatcher.startElement("measResultListCBR_r14", -1);

               measResultListCBR_r14 = new MeasResultListCBR_r14();
               measResultListCBR_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultListCBR_r14", -1);
            }
            else {
               measResultListCBR_r14 = null;
            }

            // decode measResultListWLAN_r14

            if (measResultListWLAN_r14Present) {
               buffer.getContext().eventDispatcher.startElement("measResultListWLAN_r14", -1);

               measResultListWLAN_r14 = new MeasResultListWLAN_r14();
               measResultListWLAN_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultListWLAN_r14", -1);
            }
            else {
               measResultListWLAN_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV8ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultServFreqListNR_r15Present = buffer.decodeBit ("measResultServFreqListNR_r15Present");

            boolean measResultCellListSFTD_r15Present = buffer.decodeBit ("measResultCellListSFTD_r15Present");

            // decode measResultServFreqListNR_r15

            if (measResultServFreqListNR_r15Present) {
               buffer.getContext().eventDispatcher.startElement("measResultServFreqListNR_r15", -1);

               measResultServFreqListNR_r15 = new MeasResultServFreqListNR_r15();
               measResultServFreqListNR_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultServFreqListNR_r15", -1);
            }
            else {
               measResultServFreqListNR_r15 = null;
            }

            // decode measResultCellListSFTD_r15

            if (measResultCellListSFTD_r15Present) {
               buffer.getContext().eventDispatcher.startElement("measResultCellListSFTD_r15", -1);

               measResultCellListSFTD_r15 = new MeasResultCellListSFTD_r15();
               measResultCellListSFTD_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultCellListSFTD_r15", -1);
            }
            else {
               measResultCellListSFTD_r15 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV9ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean logMeasResultListBT_r15Present = buffer.decodeBit ("logMeasResultListBT_r15Present");

            boolean logMeasResultListWLAN_r15Present = buffer.decodeBit ("logMeasResultListWLAN_r15Present");

            boolean measResultSensing_r15Present = buffer.decodeBit ("measResultSensing_r15Present");

            boolean heightUE_r15Present = buffer.decodeBit ("heightUE_r15Present");

            // decode logMeasResultListBT_r15

            if (logMeasResultListBT_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logMeasResultListBT_r15", -1);

               logMeasResultListBT_r15 = new LogMeasResultListBT_r15();
               logMeasResultListBT_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("logMeasResultListBT_r15", -1);
            }
            else {
               logMeasResultListBT_r15 = null;
            }

            // decode logMeasResultListWLAN_r15

            if (logMeasResultListWLAN_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logMeasResultListWLAN_r15", -1);

               logMeasResultListWLAN_r15 = new LogMeasResultListWLAN_r15();
               logMeasResultListWLAN_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("logMeasResultListWLAN_r15", -1);
            }
            else {
               logMeasResultListWLAN_r15 = null;
            }

            // decode measResultSensing_r15

            if (measResultSensing_r15Present) {
               buffer.getContext().eventDispatcher.startElement("measResultSensing_r15", -1);

               measResultSensing_r15 = new MeasResultSensing_r15();
               measResultSensing_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultSensing_r15", -1);
            }
            else {
               measResultSensing_r15 = null;
            }

            // decode heightUE_r15

            if (heightUE_r15Present) {
               buffer.getContext().eventDispatcher.startElement("heightUE_r15", -1);

               heightUE_r15 = new Asn1Integer();
               heightUE_r15.decode (buffer, -400, 8880);

               buffer.invokeCharacters(heightUE_r15.toString());
               buffer.getContext().eventDispatcher.endElement("heightUE_r15", -1);
            }
            else {
               heightUE_r15 = null;
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
      if (measId != null) measId.print (_sb, "measId", _level+1);
      if (measResultPCell != null) measResultPCell.print (_sb, "measResultPCell", _level+1);
      if (measResultNeighCells != null) measResultNeighCells.print (_sb, "measResultNeighCells", _level+1);
      if (measResultForECID_r9 != null) measResultForECID_r9.print (_sb, "measResultForECID_r9", _level+1);
      if (locationInfo_r10 != null) locationInfo_r10.print (_sb, "locationInfo_r10", _level+1);
      if (measResultServFreqList_r10 != null) measResultServFreqList_r10.print (_sb, "measResultServFreqList_r10", _level+1);
      if (measId_v1250 != null) measId_v1250.print (_sb, "measId_v1250", _level+1);
      if (measResultPCell_v1250 != null) measResultPCell_v1250.print (_sb, "measResultPCell_v1250", _level+1);
      if (measResultCSI_RS_List_r12 != null) measResultCSI_RS_List_r12.print (_sb, "measResultCSI_RS_List_r12", _level+1);
      if (measResultForRSSI_r13 != null) measResultForRSSI_r13.print (_sb, "measResultForRSSI_r13", _level+1);
      if (measResultServFreqListExt_r13 != null) measResultServFreqListExt_r13.print (_sb, "measResultServFreqListExt_r13", _level+1);
      if (measResultSSTD_r13 != null) measResultSSTD_r13.print (_sb, "measResultSSTD_r13", _level+1);
      if (measResultPCell_v1310 != null) measResultPCell_v1310.print (_sb, "measResultPCell_v1310", _level+1);
      if (ul_PDCP_DelayResultList_r13 != null) ul_PDCP_DelayResultList_r13.print (_sb, "ul_PDCP_DelayResultList_r13", _level+1);
      if (measResultListWLAN_r13 != null) measResultListWLAN_r13.print (_sb, "measResultListWLAN_r13", _level+1);
      if (measResultPCell_v1360 != null) measResultPCell_v1360.print (_sb, "measResultPCell_v1360", _level+1);
      if (measResultListCBR_r14 != null) measResultListCBR_r14.print (_sb, "measResultListCBR_r14", _level+1);
      if (measResultListWLAN_r14 != null) measResultListWLAN_r14.print (_sb, "measResultListWLAN_r14", _level+1);
      if (measResultServFreqListNR_r15 != null) measResultServFreqListNR_r15.print (_sb, "measResultServFreqListNR_r15", _level+1);
      if (measResultCellListSFTD_r15 != null) measResultCellListSFTD_r15.print (_sb, "measResultCellListSFTD_r15", _level+1);
      if (logMeasResultListBT_r15 != null) logMeasResultListBT_r15.print (_sb, "logMeasResultListBT_r15", _level+1);
      if (logMeasResultListWLAN_r15 != null) logMeasResultListWLAN_r15.print (_sb, "logMeasResultListWLAN_r15", _level+1);
      if (measResultSensing_r15 != null) measResultSensing_r15.print (_sb, "measResultSensing_r15", _level+1);
      if (heightUE_r15 != null) heightUE_r15.print (_sb, "heightUE_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
