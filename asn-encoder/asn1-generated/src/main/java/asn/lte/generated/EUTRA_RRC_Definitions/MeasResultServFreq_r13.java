/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultServFreq_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultServFreq-r13";
   }

   public ServCellIndex_r13 servFreqId_r13;
   public MeasResultServFreq_r13_measResultSCell_r13 measResultSCell_r13;  // optional
   public MeasResultServFreq_r13_measResultBestNeighCell_r13 measResultBestNeighCell_r13;  // optional
   public boolean mV2ExtPresent;
   public MeasResultServFreq_r13_measResultBestNeighCell_v1360 measResultBestNeighCell_v1360;  // optional
   public Asn1OpenExt extElem1;

   public MeasResultServFreq_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultServFreq_r13 (
      ServCellIndex_r13 servFreqId_r13_,
      MeasResultServFreq_r13_measResultSCell_r13 measResultSCell_r13_,
      MeasResultServFreq_r13_measResultBestNeighCell_r13 measResultBestNeighCell_r13_,
      MeasResultServFreq_r13_measResultBestNeighCell_v1360 measResultBestNeighCell_v1360_
   ) {
      super();
      servFreqId_r13 = servFreqId_r13_;
      measResultSCell_r13 = measResultSCell_r13_;
      measResultBestNeighCell_r13 = measResultBestNeighCell_r13_;
      measResultBestNeighCell_v1360 = measResultBestNeighCell_v1360_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultServFreq_r13 (
      ServCellIndex_r13 servFreqId_r13_
   ) {
      super();
      servFreqId_r13 = servFreqId_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultServFreq_r13 (long servFreqId_r13_,
      MeasResultServFreq_r13_measResultSCell_r13 measResultSCell_r13_,
      MeasResultServFreq_r13_measResultBestNeighCell_r13 measResultBestNeighCell_r13_,
      MeasResultServFreq_r13_measResultBestNeighCell_v1360 measResultBestNeighCell_v1360_
   ) {
      super();
      servFreqId_r13 = new ServCellIndex_r13 (servFreqId_r13_);
      measResultSCell_r13 = measResultSCell_r13_;
      measResultBestNeighCell_r13 = measResultBestNeighCell_r13_;
      measResultBestNeighCell_v1360 = measResultBestNeighCell_v1360_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultServFreq_r13 (
      long servFreqId_r13_
   ) {
      super();
      servFreqId_r13 = new ServCellIndex_r13 (servFreqId_r13_);
   }

   public void init () {
      servFreqId_r13 = null;
      measResultSCell_r13 = null;
      measResultBestNeighCell_r13 = null;
      measResultBestNeighCell_v1360 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return servFreqId_r13;
         case 1: return measResultSCell_r13;
         case 2: return measResultBestNeighCell_r13;
         case 3: return measResultBestNeighCell_v1360;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "servFreqId-r13";
         case 1: return "measResultSCell-r13";
         case 2: return "measResultBestNeighCell-r13";
         case 3: return "measResultBestNeighCell-v1360";
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

      boolean measResultSCell_r13Present = buffer.decodeBit ("measResultSCell_r13Present");
      boolean measResultBestNeighCell_r13Present = buffer.decodeBit ("measResultBestNeighCell_r13Present");

      // decode servFreqId_r13

      buffer.getContext().eventDispatcher.startElement("servFreqId_r13", -1);

      servFreqId_r13 = new ServCellIndex_r13();
      servFreqId_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("servFreqId_r13", -1);

      // decode measResultSCell_r13

      if (measResultSCell_r13Present) {
         buffer.getContext().eventDispatcher.startElement("measResultSCell_r13", -1);

         measResultSCell_r13 = new MeasResultServFreq_r13_measResultSCell_r13();
         measResultSCell_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultSCell_r13", -1);
      }
      else {
         measResultSCell_r13 = null;
      }

      // decode measResultBestNeighCell_r13

      if (measResultBestNeighCell_r13Present) {
         buffer.getContext().eventDispatcher.startElement("measResultBestNeighCell_r13", -1);

         measResultBestNeighCell_r13 = new MeasResultServFreq_r13_measResultBestNeighCell_r13();
         measResultBestNeighCell_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultBestNeighCell_r13", -1);
      }
      else {
         measResultBestNeighCell_r13 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResultBestNeighCell_v1360Present = buffer.decodeBit ("measResultBestNeighCell_v1360Present");

            // decode measResultBestNeighCell_v1360

            if (measResultBestNeighCell_v1360Present) {
               buffer.getContext().eventDispatcher.startElement("measResultBestNeighCell_v1360", -1);

               measResultBestNeighCell_v1360 = new MeasResultServFreq_r13_measResultBestNeighCell_v1360();
               measResultBestNeighCell_v1360.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResultBestNeighCell_v1360", -1);
            }
            else {
               measResultBestNeighCell_v1360 = null;
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
      if (servFreqId_r13 != null) servFreqId_r13.print (_sb, "servFreqId_r13", _level+1);
      if (measResultSCell_r13 != null) measResultSCell_r13.print (_sb, "measResultSCell_r13", _level+1);
      if (measResultBestNeighCell_r13 != null) measResultBestNeighCell_r13.print (_sb, "measResultBestNeighCell_r13", _level+1);
      if (measResultBestNeighCell_v1360 != null) measResultBestNeighCell_v1360.print (_sb, "measResultBestNeighCell_v1360", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
