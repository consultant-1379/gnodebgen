/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultServFreqNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultServFreqNR-r15";
   }

   public ARFCN_ValueNR_r15 carrierFreq_r15;
   public MeasResultCellNR_r15 measResultSCell_r15;  // optional
   public MeasResultCellNR_r15 measResultBestNeighCell_r15;  // optional
   public Asn1OpenExt extElem1;

   public MeasResultServFreqNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultServFreqNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_,
      MeasResultCellNR_r15 measResultSCell_r15_,
      MeasResultCellNR_r15 measResultBestNeighCell_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
      measResultSCell_r15 = measResultSCell_r15_;
      measResultBestNeighCell_r15 = measResultBestNeighCell_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultServFreqNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultServFreqNR_r15 (long carrierFreq_r15_,
      MeasResultCellNR_r15 measResultSCell_r15_,
      MeasResultCellNR_r15 measResultBestNeighCell_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
      measResultSCell_r15 = measResultSCell_r15_;
      measResultBestNeighCell_r15 = measResultBestNeighCell_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultServFreqNR_r15 (
      long carrierFreq_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
   }

   public void init () {
      carrierFreq_r15 = null;
      measResultSCell_r15 = null;
      measResultBestNeighCell_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r15;
         case 1: return measResultSCell_r15;
         case 2: return measResultBestNeighCell_r15;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r15";
         case 1: return "measResultSCell-r15";
         case 2: return "measResultBestNeighCell-r15";
         case 3: return null;
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

      boolean measResultSCell_r15Present = buffer.decodeBit ("measResultSCell_r15Present");
      boolean measResultBestNeighCell_r15Present = buffer.decodeBit ("measResultBestNeighCell_r15Present");

      // decode carrierFreq_r15

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r15", -1);

      carrierFreq_r15 = new ARFCN_ValueNR_r15();
      carrierFreq_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r15", -1);

      // decode measResultSCell_r15

      if (measResultSCell_r15Present) {
         buffer.getContext().eventDispatcher.startElement("measResultSCell_r15", -1);

         measResultSCell_r15 = new MeasResultCellNR_r15();
         measResultSCell_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultSCell_r15", -1);
      }
      else {
         measResultSCell_r15 = null;
      }

      // decode measResultBestNeighCell_r15

      if (measResultBestNeighCell_r15Present) {
         buffer.getContext().eventDispatcher.startElement("measResultBestNeighCell_r15", -1);

         measResultBestNeighCell_r15 = new MeasResultCellNR_r15();
         measResultBestNeighCell_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultBestNeighCell_r15", -1);
      }
      else {
         measResultBestNeighCell_r15 = null;
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
      if (carrierFreq_r15 != null) carrierFreq_r15.print (_sb, "carrierFreq_r15", _level+1);
      if (measResultSCell_r15 != null) measResultSCell_r15.print (_sb, "measResultSCell_r15", _level+1);
      if (measResultBestNeighCell_r15 != null) measResultBestNeighCell_r15.print (_sb, "measResultBestNeighCell_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
