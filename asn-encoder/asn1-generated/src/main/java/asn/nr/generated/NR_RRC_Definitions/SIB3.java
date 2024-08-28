/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB3 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SIB3";
   }

   public IntraFreqNeighCellList intraFreqNeighCellList;  // optional
   public IntraFreqBlackCellList intraFreqBlackCellList;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public boolean mV2ExtPresent;
   public IntraFreqNeighCellList_v1610 intraFreqNeighCellList_v1610;  // optional
   public IntraFreqWhiteCellList_r16 intraFreqWhiteCellList_r16;  // optional
   public SIB3_intraFreqCAG_CellList_r16 intraFreqCAG_CellList_r16;  // optional
   public Asn1OpenExt extElem1;

   public SIB3 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SIB3 (
      IntraFreqNeighCellList intraFreqNeighCellList_,
      IntraFreqBlackCellList intraFreqBlackCellList_,
      Asn1OctetString lateNonCriticalExtension_,
      IntraFreqNeighCellList_v1610 intraFreqNeighCellList_v1610_,
      IntraFreqWhiteCellList_r16 intraFreqWhiteCellList_r16_,
      SIB3_intraFreqCAG_CellList_r16 intraFreqCAG_CellList_r16_
   ) {
      super();
      intraFreqNeighCellList = intraFreqNeighCellList_;
      intraFreqBlackCellList = intraFreqBlackCellList_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      intraFreqNeighCellList_v1610 = intraFreqNeighCellList_v1610_;
      intraFreqWhiteCellList_r16 = intraFreqWhiteCellList_r16_;
      intraFreqCAG_CellList_r16 = intraFreqCAG_CellList_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SIB3 (IntraFreqNeighCellList intraFreqNeighCellList_,
      IntraFreqBlackCellList intraFreqBlackCellList_,
      byte[] lateNonCriticalExtension_,
      IntraFreqNeighCellList_v1610 intraFreqNeighCellList_v1610_,
      IntraFreqWhiteCellList_r16 intraFreqWhiteCellList_r16_,
      SIB3_intraFreqCAG_CellList_r16 intraFreqCAG_CellList_r16_
   ) {
      super();
      intraFreqNeighCellList = intraFreqNeighCellList_;
      intraFreqBlackCellList = intraFreqBlackCellList_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      intraFreqNeighCellList_v1610 = intraFreqNeighCellList_v1610_;
      intraFreqWhiteCellList_r16 = intraFreqWhiteCellList_r16_;
      intraFreqCAG_CellList_r16 = intraFreqCAG_CellList_r16_;
   }

   public void init () {
      intraFreqNeighCellList = null;
      intraFreqBlackCellList = null;
      lateNonCriticalExtension = null;
      intraFreqNeighCellList_v1610 = null;
      intraFreqWhiteCellList_r16 = null;
      intraFreqCAG_CellList_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return intraFreqNeighCellList;
         case 1: return intraFreqBlackCellList;
         case 2: return lateNonCriticalExtension;
         case 3: return intraFreqNeighCellList_v1610;
         case 4: return intraFreqWhiteCellList_r16;
         case 5: return intraFreqCAG_CellList_r16;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "intraFreqNeighCellList";
         case 1: return "intraFreqBlackCellList";
         case 2: return "lateNonCriticalExtension";
         case 3: return "intraFreqNeighCellList-v1610";
         case 4: return "intraFreqWhiteCellList-r16";
         case 5: return "intraFreqCAG-CellList-r16";
         case 6: return null;
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

      boolean intraFreqNeighCellListPresent = buffer.decodeBit ("intraFreqNeighCellListPresent");
      boolean intraFreqBlackCellListPresent = buffer.decodeBit ("intraFreqBlackCellListPresent");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode intraFreqNeighCellList

      if (intraFreqNeighCellListPresent) {
         buffer.getContext().eventDispatcher.startElement("intraFreqNeighCellList", -1);

         intraFreqNeighCellList = new IntraFreqNeighCellList();
         intraFreqNeighCellList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("intraFreqNeighCellList", -1);
      }
      else {
         intraFreqNeighCellList = null;
      }

      // decode intraFreqBlackCellList

      if (intraFreqBlackCellListPresent) {
         buffer.getContext().eventDispatcher.startElement("intraFreqBlackCellList", -1);

         intraFreqBlackCellList = new IntraFreqBlackCellList();
         intraFreqBlackCellList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("intraFreqBlackCellList", -1);
      }
      else {
         intraFreqBlackCellList = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
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

            boolean intraFreqNeighCellList_v1610Present = buffer.decodeBit ("intraFreqNeighCellList_v1610Present");

            boolean intraFreqWhiteCellList_r16Present = buffer.decodeBit ("intraFreqWhiteCellList_r16Present");

            boolean intraFreqCAG_CellList_r16Present = buffer.decodeBit ("intraFreqCAG_CellList_r16Present");

            // decode intraFreqNeighCellList_v1610

            if (intraFreqNeighCellList_v1610Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqNeighCellList_v1610", -1);

               intraFreqNeighCellList_v1610 = new IntraFreqNeighCellList_v1610();
               intraFreqNeighCellList_v1610.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqNeighCellList_v1610", -1);
            }
            else {
               intraFreqNeighCellList_v1610 = null;
            }

            // decode intraFreqWhiteCellList_r16

            if (intraFreqWhiteCellList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqWhiteCellList_r16", -1);

               intraFreqWhiteCellList_r16 = new IntraFreqWhiteCellList_r16();
               intraFreqWhiteCellList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqWhiteCellList_r16", -1);
            }
            else {
               intraFreqWhiteCellList_r16 = null;
            }

            // decode intraFreqCAG_CellList_r16

            if (intraFreqCAG_CellList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqCAG_CellList_r16", -1);

               intraFreqCAG_CellList_r16 = new SIB3_intraFreqCAG_CellList_r16();
               intraFreqCAG_CellList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqCAG_CellList_r16", -1);
            }
            else {
               intraFreqCAG_CellList_r16 = null;
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

      // encode optional elements bit mask

      buffer.encodeBit ((intraFreqNeighCellList != null), null);
      buffer.encodeBit ((intraFreqBlackCellList != null), null);
      buffer.encodeBit ((lateNonCriticalExtension != null), null);

      // encode intraFreqNeighCellList

      if (intraFreqNeighCellList != null) {
         buffer.getContext().eventDispatcher.startElement("intraFreqNeighCellList", -1);

         intraFreqNeighCellList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("intraFreqNeighCellList", -1);
      }

      // encode intraFreqBlackCellList

      if (intraFreqBlackCellList != null) {
         buffer.getContext().eventDispatcher.startElement("intraFreqBlackCellList", -1);

         intraFreqBlackCellList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("intraFreqBlackCellList", -1);
      }

      // encode lateNonCriticalExtension

      if (lateNonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }

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
            buffer.encodeBit ((intraFreqNeighCellList_v1610 != null), "optbit");
            buffer.encodeBit ((intraFreqWhiteCellList_r16 != null), "optbit");
            buffer.encodeBit ((intraFreqCAG_CellList_r16 != null), "optbit");
            if (intraFreqNeighCellList_v1610 != null) {
               intraFreqNeighCellList_v1610.encode (buffer);
            }
            if (intraFreqWhiteCellList_r16 != null) {
               intraFreqWhiteCellList_r16.encode (buffer);
            }
            if (intraFreqCAG_CellList_r16 != null) {
               intraFreqCAG_CellList_r16.encode (buffer);
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
      if (intraFreqNeighCellList != null) intraFreqNeighCellList.print (_sb, "intraFreqNeighCellList", _level+1);
      if (intraFreqBlackCellList != null) intraFreqBlackCellList.print (_sb, "intraFreqBlackCellList", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (intraFreqNeighCellList_v1610 != null) intraFreqNeighCellList_v1610.print (_sb, "intraFreqNeighCellList_v1610", _level+1);
      if (intraFreqWhiteCellList_r16 != null) intraFreqWhiteCellList_r16.print (_sb, "intraFreqWhiteCellList_r16", _level+1);
      if (intraFreqCAG_CellList_r16 != null) intraFreqCAG_CellList_r16.print (_sb, "intraFreqCAG_CellList_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
