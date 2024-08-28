/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_CSI_RS_Config_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-CSI-RS-Config-r16";
   }

   public SL_CSI_RS_Config_r16_sl_CSI_RS_FreqAllocation_r16 sl_CSI_RS_FreqAllocation_r16;  // optional
   public Asn1Integer sl_CSI_RS_FirstSymbol_r16;  // optional
   public Asn1OpenExt extElem1;

   public SL_CSI_RS_Config_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_CSI_RS_Config_r16 (
      SL_CSI_RS_Config_r16_sl_CSI_RS_FreqAllocation_r16 sl_CSI_RS_FreqAllocation_r16_,
      Asn1Integer sl_CSI_RS_FirstSymbol_r16_
   ) {
      super();
      sl_CSI_RS_FreqAllocation_r16 = sl_CSI_RS_FreqAllocation_r16_;
      sl_CSI_RS_FirstSymbol_r16 = sl_CSI_RS_FirstSymbol_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_CSI_RS_Config_r16 (SL_CSI_RS_Config_r16_sl_CSI_RS_FreqAllocation_r16 sl_CSI_RS_FreqAllocation_r16_,
      long sl_CSI_RS_FirstSymbol_r16_
   ) {
      super();
      sl_CSI_RS_FreqAllocation_r16 = sl_CSI_RS_FreqAllocation_r16_;
      sl_CSI_RS_FirstSymbol_r16 = new Asn1Integer (sl_CSI_RS_FirstSymbol_r16_);
   }

   public void init () {
      sl_CSI_RS_FreqAllocation_r16 = null;
      sl_CSI_RS_FirstSymbol_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_CSI_RS_FreqAllocation_r16;
         case 1: return sl_CSI_RS_FirstSymbol_r16;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-CSI-RS-FreqAllocation-r16";
         case 1: return "sl-CSI-RS-FirstSymbol-r16";
         case 2: return null;
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

      boolean sl_CSI_RS_FreqAllocation_r16Present = buffer.decodeBit ("sl_CSI_RS_FreqAllocation_r16Present");
      boolean sl_CSI_RS_FirstSymbol_r16Present = buffer.decodeBit ("sl_CSI_RS_FirstSymbol_r16Present");

      // decode sl_CSI_RS_FreqAllocation_r16

      if (sl_CSI_RS_FreqAllocation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_CSI_RS_FreqAllocation_r16", -1);

         sl_CSI_RS_FreqAllocation_r16 = new SL_CSI_RS_Config_r16_sl_CSI_RS_FreqAllocation_r16();
         sl_CSI_RS_FreqAllocation_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_CSI_RS_FreqAllocation_r16", -1);
      }
      else {
         sl_CSI_RS_FreqAllocation_r16 = null;
      }

      // decode sl_CSI_RS_FirstSymbol_r16

      if (sl_CSI_RS_FirstSymbol_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_CSI_RS_FirstSymbol_r16", -1);

         sl_CSI_RS_FirstSymbol_r16 = new Asn1Integer();
         sl_CSI_RS_FirstSymbol_r16.decode (buffer, 3, 12);

         buffer.invokeCharacters(sl_CSI_RS_FirstSymbol_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_CSI_RS_FirstSymbol_r16", -1);
      }
      else {
         sl_CSI_RS_FirstSymbol_r16 = null;
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

      buffer.encodeBit ((sl_CSI_RS_FreqAllocation_r16 != null), null);
      buffer.encodeBit ((sl_CSI_RS_FirstSymbol_r16 != null), null);

      // encode sl_CSI_RS_FreqAllocation_r16

      if (sl_CSI_RS_FreqAllocation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_CSI_RS_FreqAllocation_r16", -1);

         sl_CSI_RS_FreqAllocation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sl_CSI_RS_FreqAllocation_r16", -1);
      }

      // encode sl_CSI_RS_FirstSymbol_r16

      if (sl_CSI_RS_FirstSymbol_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sl_CSI_RS_FirstSymbol_r16", -1);

         sl_CSI_RS_FirstSymbol_r16.encode (buffer, 3, 12);

         buffer.getContext().eventDispatcher.endElement("sl_CSI_RS_FirstSymbol_r16", -1);
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
      if (sl_CSI_RS_FreqAllocation_r16 != null) sl_CSI_RS_FreqAllocation_r16.print (_sb, "sl_CSI_RS_FreqAllocation_r16", _level+1);
      if (sl_CSI_RS_FirstSymbol_r16 != null) sl_CSI_RS_FirstSymbol_r16.print (_sb, "sl_CSI_RS_FirstSymbol_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
