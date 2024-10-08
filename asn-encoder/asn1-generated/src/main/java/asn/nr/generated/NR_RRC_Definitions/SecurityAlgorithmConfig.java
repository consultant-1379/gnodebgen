/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SecurityAlgorithmConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SecurityAlgorithmConfig";
   }

   public CipheringAlgorithm cipheringAlgorithm = null;
   public IntegrityProtAlgorithm integrityProtAlgorithm = null;  // optional
   public Asn1OpenExt extElem1;

   public SecurityAlgorithmConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SecurityAlgorithmConfig (
      CipheringAlgorithm cipheringAlgorithm_,
      IntegrityProtAlgorithm integrityProtAlgorithm_
   ) {
      super();
      cipheringAlgorithm = cipheringAlgorithm_;
      integrityProtAlgorithm = integrityProtAlgorithm_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SecurityAlgorithmConfig (
      CipheringAlgorithm cipheringAlgorithm_
   ) {
      super();
      cipheringAlgorithm = cipheringAlgorithm_;
   }

   public void init () {
      cipheringAlgorithm = null;
      integrityProtAlgorithm = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cipheringAlgorithm;
         case 1: return integrityProtAlgorithm;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cipheringAlgorithm";
         case 1: return "integrityProtAlgorithm";
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

      boolean integrityProtAlgorithmPresent = buffer.decodeBit ("integrityProtAlgorithmPresent");

      // decode cipheringAlgorithm

      buffer.getContext().eventDispatcher.startElement("cipheringAlgorithm", -1);

      {
         int tval = CipheringAlgorithm.decodeEnumValue (buffer);
         cipheringAlgorithm = CipheringAlgorithm.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cipheringAlgorithm", -1);

      // decode integrityProtAlgorithm

      if (integrityProtAlgorithmPresent) {
         buffer.getContext().eventDispatcher.startElement("integrityProtAlgorithm", -1);

         int tval = IntegrityProtAlgorithm.decodeEnumValue (buffer);
         integrityProtAlgorithm = IntegrityProtAlgorithm.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("integrityProtAlgorithm", -1);
      }
      else {
         integrityProtAlgorithm = null;
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

      buffer.encodeBit ((integrityProtAlgorithm != null), null);

      // encode cipheringAlgorithm

      if (cipheringAlgorithm != null) {
         buffer.getContext().eventDispatcher.startElement("cipheringAlgorithm", -1);

         cipheringAlgorithm.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cipheringAlgorithm", -1);
      }
      else throw new Asn1MissingRequiredException ("cipheringAlgorithm");

      // encode integrityProtAlgorithm

      if (integrityProtAlgorithm != null) {
         buffer.getContext().eventDispatcher.startElement("integrityProtAlgorithm", -1);

         integrityProtAlgorithm.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("integrityProtAlgorithm", -1);
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
      if (cipheringAlgorithm != null) cipheringAlgorithm.print (_sb, "cipheringAlgorithm", _level+1);
      if (integrityProtAlgorithm != null) integrityProtAlgorithm.print (_sb, "integrityProtAlgorithm", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
