/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB11_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SIB11-r16";
   }

   public MeasIdleConfigSIB_r16 measIdleConfigSIB_r16;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public Asn1OpenExt extElem1;

   public SIB11_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SIB11_r16 (
      MeasIdleConfigSIB_r16 measIdleConfigSIB_r16_,
      Asn1OctetString lateNonCriticalExtension_
   ) {
      super();
      measIdleConfigSIB_r16 = measIdleConfigSIB_r16_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SIB11_r16 (MeasIdleConfigSIB_r16 measIdleConfigSIB_r16_,
      byte[] lateNonCriticalExtension_
   ) {
      super();
      measIdleConfigSIB_r16 = measIdleConfigSIB_r16_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
   }

   public void init () {
      measIdleConfigSIB_r16 = null;
      lateNonCriticalExtension = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measIdleConfigSIB_r16;
         case 1: return lateNonCriticalExtension;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measIdleConfigSIB-r16";
         case 1: return "lateNonCriticalExtension";
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

      boolean measIdleConfigSIB_r16Present = buffer.decodeBit ("measIdleConfigSIB_r16Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode measIdleConfigSIB_r16

      if (measIdleConfigSIB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measIdleConfigSIB_r16", -1);

         measIdleConfigSIB_r16 = new MeasIdleConfigSIB_r16();
         measIdleConfigSIB_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdleConfigSIB_r16", -1);
      }
      else {
         measIdleConfigSIB_r16 = null;
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

      buffer.encodeBit ((measIdleConfigSIB_r16 != null), null);
      buffer.encodeBit ((lateNonCriticalExtension != null), null);

      // encode measIdleConfigSIB_r16

      if (measIdleConfigSIB_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measIdleConfigSIB_r16", -1);

         measIdleConfigSIB_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measIdleConfigSIB_r16", -1);
      }

      // encode lateNonCriticalExtension

      if (lateNonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
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
      if (measIdleConfigSIB_r16 != null) measIdleConfigSIB_r16.print (_sb, "measIdleConfigSIB_r16", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
