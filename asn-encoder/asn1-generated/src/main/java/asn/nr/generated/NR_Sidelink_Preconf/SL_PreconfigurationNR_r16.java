/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;

public class SL_PreconfigurationNR_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PreconfigurationNR-r16";
   }

   public SidelinkPreconfigNR_r16 sidelinkPreconfigNR_r16;
   public Asn1OpenExt extElem1;

   public SL_PreconfigurationNR_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PreconfigurationNR_r16 (
      SidelinkPreconfigNR_r16 sidelinkPreconfigNR_r16_
   ) {
      super();
      sidelinkPreconfigNR_r16 = sidelinkPreconfigNR_r16_;
   }

   public void init () {
      sidelinkPreconfigNR_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sidelinkPreconfigNR_r16;
         case 1: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sidelinkPreconfigNR-r16";
         case 1: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode sidelinkPreconfigNR_r16

      buffer.getContext().eventDispatcher.startElement("sidelinkPreconfigNR_r16", -1);

      sidelinkPreconfigNR_r16 = new SidelinkPreconfigNR_r16();
      sidelinkPreconfigNR_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sidelinkPreconfigNR_r16", -1);

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

      // encode sidelinkPreconfigNR_r16

      if (sidelinkPreconfigNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sidelinkPreconfigNR_r16", -1);

         sidelinkPreconfigNR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sidelinkPreconfigNR_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("sidelinkPreconfigNR_r16");

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
      if (sidelinkPreconfigNR_r16 != null) sidelinkPreconfigNR_r16.print (_sb, "sidelinkPreconfigNR_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
