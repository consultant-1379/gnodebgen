/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SIB2";
   }

   public SIB2_cellReselectionInfoCommon cellReselectionInfoCommon;
   public SIB2_cellReselectionServingFreqInfo cellReselectionServingFreqInfo;
   public SIB2_intraFreqCellReselectionInfo intraFreqCellReselectionInfo;
   public boolean mV2ExtPresent;
   public SIB2_relaxedMeasurement_r16 relaxedMeasurement_r16;  // optional
   public Asn1OpenExt extElem1;

   public SIB2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SIB2 (
      SIB2_cellReselectionInfoCommon cellReselectionInfoCommon_,
      SIB2_cellReselectionServingFreqInfo cellReselectionServingFreqInfo_,
      SIB2_intraFreqCellReselectionInfo intraFreqCellReselectionInfo_,
      SIB2_relaxedMeasurement_r16 relaxedMeasurement_r16_
   ) {
      super();
      cellReselectionInfoCommon = cellReselectionInfoCommon_;
      cellReselectionServingFreqInfo = cellReselectionServingFreqInfo_;
      intraFreqCellReselectionInfo = intraFreqCellReselectionInfo_;
      relaxedMeasurement_r16 = relaxedMeasurement_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SIB2 (
      SIB2_cellReselectionInfoCommon cellReselectionInfoCommon_,
      SIB2_cellReselectionServingFreqInfo cellReselectionServingFreqInfo_,
      SIB2_intraFreqCellReselectionInfo intraFreqCellReselectionInfo_
   ) {
      super();
      cellReselectionInfoCommon = cellReselectionInfoCommon_;
      cellReselectionServingFreqInfo = cellReselectionServingFreqInfo_;
      intraFreqCellReselectionInfo = intraFreqCellReselectionInfo_;
   }

   public void init () {
      cellReselectionInfoCommon = null;
      cellReselectionServingFreqInfo = null;
      intraFreqCellReselectionInfo = null;
      relaxedMeasurement_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellReselectionInfoCommon;
         case 1: return cellReselectionServingFreqInfo;
         case 2: return intraFreqCellReselectionInfo;
         case 3: return relaxedMeasurement_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellReselectionInfoCommon";
         case 1: return "cellReselectionServingFreqInfo";
         case 2: return "intraFreqCellReselectionInfo";
         case 3: return "relaxedMeasurement-r16";
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

      // decode cellReselectionInfoCommon

      buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon", -1);

      cellReselectionInfoCommon = new SIB2_cellReselectionInfoCommon();
      cellReselectionInfoCommon.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon", -1);

      // decode cellReselectionServingFreqInfo

      buffer.getContext().eventDispatcher.startElement("cellReselectionServingFreqInfo", -1);

      cellReselectionServingFreqInfo = new SIB2_cellReselectionServingFreqInfo();
      cellReselectionServingFreqInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionServingFreqInfo", -1);

      // decode intraFreqCellReselectionInfo

      buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo", -1);

      intraFreqCellReselectionInfo = new SIB2_intraFreqCellReselectionInfo();
      intraFreqCellReselectionInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo", -1);

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

            boolean relaxedMeasurement_r16Present = buffer.decodeBit ("relaxedMeasurement_r16Present");

            // decode relaxedMeasurement_r16

            if (relaxedMeasurement_r16Present) {
               buffer.getContext().eventDispatcher.startElement("relaxedMeasurement_r16", -1);

               relaxedMeasurement_r16 = new SIB2_relaxedMeasurement_r16();
               relaxedMeasurement_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("relaxedMeasurement_r16", -1);
            }
            else {
               relaxedMeasurement_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (mV2ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode cellReselectionInfoCommon

      if (cellReselectionInfoCommon != null) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon", -1);

         cellReselectionInfoCommon.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon", -1);
      }
      else throw new Asn1MissingRequiredException ("cellReselectionInfoCommon");

      // encode cellReselectionServingFreqInfo

      if (cellReselectionServingFreqInfo != null) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionServingFreqInfo", -1);

         cellReselectionServingFreqInfo.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellReselectionServingFreqInfo", -1);
      }
      else throw new Asn1MissingRequiredException ("cellReselectionServingFreqInfo");

      // encode intraFreqCellReselectionInfo

      if (intraFreqCellReselectionInfo != null) {
         buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo", -1);

         intraFreqCellReselectionInfo.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo", -1);
      }
      else throw new Asn1MissingRequiredException ("intraFreqCellReselectionInfo");

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((relaxedMeasurement_r16 != null), "optbit");
            if (relaxedMeasurement_r16 != null) {
               relaxedMeasurement_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellReselectionInfoCommon != null) cellReselectionInfoCommon.print (_sb, "cellReselectionInfoCommon", _level+1);
      if (cellReselectionServingFreqInfo != null) cellReselectionServingFreqInfo.print (_sb, "cellReselectionServingFreqInfo", _level+1);
      if (intraFreqCellReselectionInfo != null) intraFreqCellReselectionInfo.print (_sb, "intraFreqCellReselectionInfo", _level+1);
      if (relaxedMeasurement_r16 != null) relaxedMeasurement_r16.print (_sb, "relaxedMeasurement_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
