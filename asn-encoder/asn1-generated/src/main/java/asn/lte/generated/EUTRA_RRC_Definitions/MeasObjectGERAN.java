/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectGERAN extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasObjectGERAN";
   }

   public CarrierFreqsGERAN carrierFreqs;
   public Q_OffsetRangeInterRAT offsetFreq;  // default = 0()
   public Asn1BitString ncc_Permitted;  // optional
   public PhysCellIdGERAN cellForWhichToReportCGI;  // optional
   public Asn1OpenExt extElem1;

   public MeasObjectGERAN () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasObjectGERAN (
      CarrierFreqsGERAN carrierFreqs_,
      Q_OffsetRangeInterRAT offsetFreq_,
      Asn1BitString ncc_Permitted_,
      PhysCellIdGERAN cellForWhichToReportCGI_
   ) {
      super();
      carrierFreqs = carrierFreqs_;
      offsetFreq = offsetFreq_;
      ncc_Permitted = ncc_Permitted_;
      cellForWhichToReportCGI = cellForWhichToReportCGI_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasObjectGERAN (
      CarrierFreqsGERAN carrierFreqs_
   ) {
      super();
      carrierFreqs = carrierFreqs_;
      offsetFreq = new Q_OffsetRangeInterRAT (0);
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasObjectGERAN (CarrierFreqsGERAN carrierFreqs_,
      long offsetFreq_,
      Asn1BitString ncc_Permitted_,
      PhysCellIdGERAN cellForWhichToReportCGI_
   ) {
      super();
      carrierFreqs = carrierFreqs_;
      offsetFreq = new Q_OffsetRangeInterRAT (offsetFreq_);
      ncc_Permitted = ncc_Permitted_;
      cellForWhichToReportCGI = cellForWhichToReportCGI_;
   }

   public void init () {
      carrierFreqs = null;
      offsetFreq = new Q_OffsetRangeInterRAT (0);
      ncc_Permitted = null;
      cellForWhichToReportCGI = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreqs;
         case 1: return offsetFreq;
         case 2: return ncc_Permitted;
         case 3: return cellForWhichToReportCGI;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreqs";
         case 1: return "offsetFreq";
         case 2: return "ncc-Permitted";
         case 3: return "cellForWhichToReportCGI";
         case 4: return null;
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
      boolean ncc_PermittedPresent = buffer.decodeBit ("ncc_PermittedPresent");
      boolean cellForWhichToReportCGIPresent = buffer.decodeBit ("cellForWhichToReportCGIPresent");

      // decode carrierFreqs

      buffer.getContext().eventDispatcher.startElement("carrierFreqs", -1);

      carrierFreqs = new CarrierFreqsGERAN();
      carrierFreqs.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreqs", -1);

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

      // decode ncc_Permitted

      if (ncc_PermittedPresent) {
         buffer.getContext().eventDispatcher.startElement("ncc_Permitted", -1);

         ncc_Permitted = new Asn1BitString();
         ncc_Permitted.decode (buffer, 8, 8);

         buffer.invokeCharacters(ncc_Permitted.toString());
         buffer.getContext().eventDispatcher.endElement("ncc_Permitted", -1);
      }
      else {
         ncc_Permitted = new Asn1BitString();
         ncc_Permitted.numbits = 8;
         ncc_Permitted.value = new byte[1];
         ncc_Permitted.value[0] = (byte)0xff;
      }

      // decode cellForWhichToReportCGI

      if (cellForWhichToReportCGIPresent) {
         buffer.getContext().eventDispatcher.startElement("cellForWhichToReportCGI", -1);

         cellForWhichToReportCGI = new PhysCellIdGERAN();
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
      if (carrierFreqs != null) carrierFreqs.print (_sb, "carrierFreqs", _level+1);
      if (offsetFreq != null) offsetFreq.print (_sb, "offsetFreq", _level+1);
      if (ncc_Permitted != null) ncc_Permitted.print (_sb, "ncc_Permitted", _level+1);
      if (cellForWhichToReportCGI != null) cellForWhichToReportCGI.print (_sb, "cellForWhichToReportCGI", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
