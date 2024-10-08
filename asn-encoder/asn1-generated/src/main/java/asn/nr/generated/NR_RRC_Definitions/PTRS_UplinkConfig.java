/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PTRS_UplinkConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PTRS-UplinkConfig";
   }

   public PTRS_UplinkConfig_transformPrecoderDisabled transformPrecoderDisabled;  // optional
   public PTRS_UplinkConfig_transformPrecoderEnabled transformPrecoderEnabled;  // optional
   public Asn1OpenExt extElem1;

   public PTRS_UplinkConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PTRS_UplinkConfig (
      PTRS_UplinkConfig_transformPrecoderDisabled transformPrecoderDisabled_,
      PTRS_UplinkConfig_transformPrecoderEnabled transformPrecoderEnabled_
   ) {
      super();
      transformPrecoderDisabled = transformPrecoderDisabled_;
      transformPrecoderEnabled = transformPrecoderEnabled_;
   }

   public void init () {
      transformPrecoderDisabled = null;
      transformPrecoderEnabled = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return transformPrecoderDisabled;
         case 1: return transformPrecoderEnabled;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "transformPrecoderDisabled";
         case 1: return "transformPrecoderEnabled";
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

      boolean transformPrecoderDisabledPresent = buffer.decodeBit ("transformPrecoderDisabledPresent");
      boolean transformPrecoderEnabledPresent = buffer.decodeBit ("transformPrecoderEnabledPresent");

      // decode transformPrecoderDisabled

      if (transformPrecoderDisabledPresent) {
         buffer.getContext().eventDispatcher.startElement("transformPrecoderDisabled", -1);

         transformPrecoderDisabled = new PTRS_UplinkConfig_transformPrecoderDisabled();
         transformPrecoderDisabled.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("transformPrecoderDisabled", -1);
      }
      else {
         transformPrecoderDisabled = null;
      }

      // decode transformPrecoderEnabled

      if (transformPrecoderEnabledPresent) {
         buffer.getContext().eventDispatcher.startElement("transformPrecoderEnabled", -1);

         transformPrecoderEnabled = new PTRS_UplinkConfig_transformPrecoderEnabled();
         transformPrecoderEnabled.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("transformPrecoderEnabled", -1);
      }
      else {
         transformPrecoderEnabled = null;
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

      buffer.encodeBit ((transformPrecoderDisabled != null), null);
      buffer.encodeBit ((transformPrecoderEnabled != null), null);

      // encode transformPrecoderDisabled

      if (transformPrecoderDisabled != null) {
         buffer.getContext().eventDispatcher.startElement("transformPrecoderDisabled", -1);

         transformPrecoderDisabled.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("transformPrecoderDisabled", -1);
      }

      // encode transformPrecoderEnabled

      if (transformPrecoderEnabled != null) {
         buffer.getContext().eventDispatcher.startElement("transformPrecoderEnabled", -1);

         transformPrecoderEnabled.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("transformPrecoderEnabled", -1);
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
      if (transformPrecoderDisabled != null) transformPrecoderDisabled.print (_sb, "transformPrecoderDisabled", _level+1);
      if (transformPrecoderEnabled != null) transformPrecoderEnabled.print (_sb, "transformPrecoderEnabled", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
