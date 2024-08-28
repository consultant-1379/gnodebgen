/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectUTRA_FDD_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasObjectUTRA-FDD-r16";
   }

   public ARFCN_ValueUTRA_FDD_r16 carrierFreq_r16;
   public UTRA_FDD_Q_OffsetRange_r16 utra_FDD_Q_OffsetRange_r16 = null;  // optional
   public UTRA_FDD_CellIndexList_r16 cellsToRemoveList_r16;  // optional
   public CellsToAddModListUTRA_FDD_r16 cellsToAddModList_r16;  // optional
   public Asn1OpenExt extElem1;

   public MeasObjectUTRA_FDD_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasObjectUTRA_FDD_r16 (
      ARFCN_ValueUTRA_FDD_r16 carrierFreq_r16_,
      UTRA_FDD_Q_OffsetRange_r16 utra_FDD_Q_OffsetRange_r16_,
      UTRA_FDD_CellIndexList_r16 cellsToRemoveList_r16_,
      CellsToAddModListUTRA_FDD_r16 cellsToAddModList_r16_
   ) {
      super();
      carrierFreq_r16 = carrierFreq_r16_;
      utra_FDD_Q_OffsetRange_r16 = utra_FDD_Q_OffsetRange_r16_;
      cellsToRemoveList_r16 = cellsToRemoveList_r16_;
      cellsToAddModList_r16 = cellsToAddModList_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasObjectUTRA_FDD_r16 (
      ARFCN_ValueUTRA_FDD_r16 carrierFreq_r16_
   ) {
      super();
      carrierFreq_r16 = carrierFreq_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasObjectUTRA_FDD_r16 (long carrierFreq_r16_,
      UTRA_FDD_Q_OffsetRange_r16 utra_FDD_Q_OffsetRange_r16_,
      UTRA_FDD_CellIndexList_r16 cellsToRemoveList_r16_,
      CellsToAddModListUTRA_FDD_r16 cellsToAddModList_r16_
   ) {
      super();
      carrierFreq_r16 = new ARFCN_ValueUTRA_FDD_r16 (carrierFreq_r16_);
      utra_FDD_Q_OffsetRange_r16 = utra_FDD_Q_OffsetRange_r16_;
      cellsToRemoveList_r16 = cellsToRemoveList_r16_;
      cellsToAddModList_r16 = cellsToAddModList_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasObjectUTRA_FDD_r16 (
      long carrierFreq_r16_
   ) {
      super();
      carrierFreq_r16 = new ARFCN_ValueUTRA_FDD_r16 (carrierFreq_r16_);
   }

   public void init () {
      carrierFreq_r16 = null;
      utra_FDD_Q_OffsetRange_r16 = null;
      cellsToRemoveList_r16 = null;
      cellsToAddModList_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r16;
         case 1: return utra_FDD_Q_OffsetRange_r16;
         case 2: return cellsToRemoveList_r16;
         case 3: return cellsToAddModList_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r16";
         case 1: return "utra-FDD-Q-OffsetRange-r16";
         case 2: return "cellsToRemoveList-r16";
         case 3: return "cellsToAddModList-r16";
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

      boolean utra_FDD_Q_OffsetRange_r16Present = buffer.decodeBit ("utra_FDD_Q_OffsetRange_r16Present");
      boolean cellsToRemoveList_r16Present = buffer.decodeBit ("cellsToRemoveList_r16Present");
      boolean cellsToAddModList_r16Present = buffer.decodeBit ("cellsToAddModList_r16Present");

      // decode carrierFreq_r16

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r16", -1);

      carrierFreq_r16 = new ARFCN_ValueUTRA_FDD_r16();
      carrierFreq_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r16", -1);

      // decode utra_FDD_Q_OffsetRange_r16

      if (utra_FDD_Q_OffsetRange_r16Present) {
         buffer.getContext().eventDispatcher.startElement("utra_FDD_Q_OffsetRange_r16", -1);

         int tval = UTRA_FDD_Q_OffsetRange_r16.decodeEnumValue (buffer);
         utra_FDD_Q_OffsetRange_r16 = UTRA_FDD_Q_OffsetRange_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("utra_FDD_Q_OffsetRange_r16", -1);
      }
      else {
         utra_FDD_Q_OffsetRange_r16 = null;
      }

      // decode cellsToRemoveList_r16

      if (cellsToRemoveList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("cellsToRemoveList_r16", -1);

         cellsToRemoveList_r16 = new UTRA_FDD_CellIndexList_r16();
         cellsToRemoveList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToRemoveList_r16", -1);
      }
      else {
         cellsToRemoveList_r16 = null;
      }

      // decode cellsToAddModList_r16

      if (cellsToAddModList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("cellsToAddModList_r16", -1);

         cellsToAddModList_r16 = new CellsToAddModListUTRA_FDD_r16();
         cellsToAddModList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToAddModList_r16", -1);
      }
      else {
         cellsToAddModList_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((utra_FDD_Q_OffsetRange_r16 != null), null);
      buffer.encodeBit ((cellsToRemoveList_r16 != null), null);
      buffer.encodeBit ((cellsToAddModList_r16 != null), null);

      // encode carrierFreq_r16

      if (carrierFreq_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("carrierFreq_r16", -1);

         carrierFreq_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("carrierFreq_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("carrierFreq_r16");

      // encode utra_FDD_Q_OffsetRange_r16

      if (utra_FDD_Q_OffsetRange_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("utra_FDD_Q_OffsetRange_r16", -1);

         utra_FDD_Q_OffsetRange_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("utra_FDD_Q_OffsetRange_r16", -1);
      }

      // encode cellsToRemoveList_r16

      if (cellsToRemoveList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("cellsToRemoveList_r16", -1);

         cellsToRemoveList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellsToRemoveList_r16", -1);
      }

      // encode cellsToAddModList_r16

      if (cellsToAddModList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("cellsToAddModList_r16", -1);

         cellsToAddModList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellsToAddModList_r16", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq_r16 != null) carrierFreq_r16.print (_sb, "carrierFreq_r16", _level+1);
      if (utra_FDD_Q_OffsetRange_r16 != null) utra_FDD_Q_OffsetRange_r16.print (_sb, "utra_FDD_Q_OffsetRange_r16", _level+1);
      if (cellsToRemoveList_r16 != null) cellsToRemoveList_r16.print (_sb, "cellsToRemoveList_r16", _level+1);
      if (cellsToAddModList_r16 != null) cellsToAddModList_r16.print (_sb, "cellsToAddModList_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
