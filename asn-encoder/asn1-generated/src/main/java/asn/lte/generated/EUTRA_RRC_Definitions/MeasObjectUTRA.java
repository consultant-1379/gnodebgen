/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasObjectUTRA";
   }

   public ARFCN_ValueUTRA carrierFreq;
   public Q_OffsetRangeInterRAT offsetFreq;  // default = 0()
   public CellIndexList cellsToRemoveList;  // optional
   public MeasObjectUTRA_cellsToAddModList cellsToAddModList;  // optional
   public MeasObjectUTRA_cellForWhichToReportCGI cellForWhichToReportCGI;  // optional
   public boolean mV2ExtPresent;
   public CSG_AllowedReportingCells_r9 csg_allowedReportingCells_v930;  // optional
   public boolean mV3ExtPresent;
   public Asn1Boolean reducedMeasPerformance_r12;  // optional
   public Asn1OpenExt extElem1;

   public MeasObjectUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasObjectUTRA (
      ARFCN_ValueUTRA carrierFreq_,
      Q_OffsetRangeInterRAT offsetFreq_,
      CellIndexList cellsToRemoveList_,
      MeasObjectUTRA_cellsToAddModList cellsToAddModList_,
      MeasObjectUTRA_cellForWhichToReportCGI cellForWhichToReportCGI_,
      CSG_AllowedReportingCells_r9 csg_allowedReportingCells_v930_,
      Asn1Boolean reducedMeasPerformance_r12_
   ) {
      super();
      carrierFreq = carrierFreq_;
      offsetFreq = offsetFreq_;
      cellsToRemoveList = cellsToRemoveList_;
      cellsToAddModList = cellsToAddModList_;
      cellForWhichToReportCGI = cellForWhichToReportCGI_;
      csg_allowedReportingCells_v930 = csg_allowedReportingCells_v930_;
      reducedMeasPerformance_r12 = reducedMeasPerformance_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasObjectUTRA (
      ARFCN_ValueUTRA carrierFreq_
   ) {
      super();
      carrierFreq = carrierFreq_;
      offsetFreq = new Q_OffsetRangeInterRAT (0);
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasObjectUTRA (long carrierFreq_,
      long offsetFreq_,
      CellIndexList cellsToRemoveList_,
      MeasObjectUTRA_cellsToAddModList cellsToAddModList_,
      MeasObjectUTRA_cellForWhichToReportCGI cellForWhichToReportCGI_,
      CSG_AllowedReportingCells_r9 csg_allowedReportingCells_v930_,
      boolean reducedMeasPerformance_r12_
   ) {
      super();
      carrierFreq = new ARFCN_ValueUTRA (carrierFreq_);
      offsetFreq = new Q_OffsetRangeInterRAT (offsetFreq_);
      cellsToRemoveList = cellsToRemoveList_;
      cellsToAddModList = cellsToAddModList_;
      cellForWhichToReportCGI = cellForWhichToReportCGI_;
      csg_allowedReportingCells_v930 = csg_allowedReportingCells_v930_;
      reducedMeasPerformance_r12 = new Asn1Boolean (reducedMeasPerformance_r12_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasObjectUTRA (
      long carrierFreq_
   ) {
      super();
      carrierFreq = new ARFCN_ValueUTRA (carrierFreq_);
      offsetFreq = new Q_OffsetRangeInterRAT (0);
   }

   public void init () {
      carrierFreq = null;
      offsetFreq = new Q_OffsetRangeInterRAT (0);
      cellsToRemoveList = null;
      cellsToAddModList = null;
      cellForWhichToReportCGI = null;
      csg_allowedReportingCells_v930 = null;
      reducedMeasPerformance_r12 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq;
         case 1: return offsetFreq;
         case 2: return cellsToRemoveList;
         case 3: return cellsToAddModList;
         case 4: return cellForWhichToReportCGI;
         case 5: return csg_allowedReportingCells_v930;
         case 6: return reducedMeasPerformance_r12;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq";
         case 1: return "offsetFreq";
         case 2: return "cellsToRemoveList";
         case 3: return "cellsToAddModList";
         case 4: return "cellForWhichToReportCGI";
         case 5: return "csg-allowedReportingCells-v930";
         case 6: return "reducedMeasPerformance-r12";
         case 7: return null;
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

      boolean offsetFreqPresent = buffer.decodeBit ("offsetFreqPresent");
      boolean cellsToRemoveListPresent = buffer.decodeBit ("cellsToRemoveListPresent");
      boolean cellsToAddModListPresent = buffer.decodeBit ("cellsToAddModListPresent");
      boolean cellForWhichToReportCGIPresent = buffer.decodeBit ("cellForWhichToReportCGIPresent");

      // decode carrierFreq

      buffer.getContext().eventDispatcher.startElement("carrierFreq", -1);

      carrierFreq = new ARFCN_ValueUTRA();
      carrierFreq.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq", -1);

      // decode offsetFreq

      if (offsetFreqPresent) {
         buffer.getContext().eventDispatcher.startElement("offsetFreq", -1);

         offsetFreq = new Q_OffsetRangeInterRAT();
         offsetFreq.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("offsetFreq", -1);
      }
      else {
         offsetFreq = new Q_OffsetRangeInterRAT();
         offsetFreq.value = 0;
      }

      // decode cellsToRemoveList

      if (cellsToRemoveListPresent) {
         buffer.getContext().eventDispatcher.startElement("cellsToRemoveList", -1);

         cellsToRemoveList = new CellIndexList();
         cellsToRemoveList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToRemoveList", -1);
      }
      else {
         cellsToRemoveList = null;
      }

      // decode cellsToAddModList

      if (cellsToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("cellsToAddModList", -1);

         cellsToAddModList = new MeasObjectUTRA_cellsToAddModList();
         cellsToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToAddModList", -1);
      }
      else {
         cellsToAddModList = null;
      }

      // decode cellForWhichToReportCGI

      if (cellForWhichToReportCGIPresent) {
         buffer.getContext().eventDispatcher.startElement("cellForWhichToReportCGI", -1);

         cellForWhichToReportCGI = new MeasObjectUTRA_cellForWhichToReportCGI();
         cellForWhichToReportCGI.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellForWhichToReportCGI", -1);
      }
      else {
         cellForWhichToReportCGI = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean csg_allowedReportingCells_v930Present = buffer.decodeBit ("csg_allowedReportingCells_v930Present");

            // decode csg_allowedReportingCells_v930

            if (csg_allowedReportingCells_v930Present) {
               buffer.getContext().eventDispatcher.startElement("csg_allowedReportingCells_v930", -1);

               csg_allowedReportingCells_v930 = new CSG_AllowedReportingCells_r9();
               csg_allowedReportingCells_v930.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("csg_allowedReportingCells_v930", -1);
            }
            else {
               csg_allowedReportingCells_v930 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean reducedMeasPerformance_r12Present = buffer.decodeBit ("reducedMeasPerformance_r12Present");

            // decode reducedMeasPerformance_r12

            if (reducedMeasPerformance_r12Present) {
               buffer.getContext().eventDispatcher.startElement("reducedMeasPerformance_r12", -1);

               reducedMeasPerformance_r12 = new Asn1Boolean();
               reducedMeasPerformance_r12.decode (buffer);

               buffer.invokeCharacters(reducedMeasPerformance_r12.toString());
               buffer.getContext().eventDispatcher.endElement("reducedMeasPerformance_r12", -1);
            }
            else {
               reducedMeasPerformance_r12 = null;
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
      if (carrierFreq != null) carrierFreq.print (_sb, "carrierFreq", _level+1);
      if (offsetFreq != null) offsetFreq.print (_sb, "offsetFreq", _level+1);
      if (cellsToRemoveList != null) cellsToRemoveList.print (_sb, "cellsToRemoveList", _level+1);
      if (cellsToAddModList != null) cellsToAddModList.print (_sb, "cellsToAddModList", _level+1);
      if (cellForWhichToReportCGI != null) cellForWhichToReportCGI.print (_sb, "cellForWhichToReportCGI", _level+1);
      if (csg_allowedReportingCells_v930 != null) csg_allowedReportingCells_v930.print (_sb, "csg_allowedReportingCells_v930", _level+1);
      if (reducedMeasPerformance_r12 != null) reducedMeasPerformance_r12.print (_sb, "reducedMeasPerformance_r12", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
