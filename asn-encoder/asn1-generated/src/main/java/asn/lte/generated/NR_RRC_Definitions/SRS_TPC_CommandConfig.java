/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_TPC_CommandConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRS-TPC-CommandConfig";
   }

   public Asn1Integer startingBitOfFormat2_3;  // optional
   public Asn1Integer fieldTypeFormat2_3;  // optional
   public boolean mV2ExtPresent;
   public Asn1Integer startingBitOfFormat2_3SUL;  // optional
   public Asn1OpenExt extElem1;

   public SRS_TPC_CommandConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRS_TPC_CommandConfig (
      Asn1Integer startingBitOfFormat2_3_,
      Asn1Integer fieldTypeFormat2_3_,
      Asn1Integer startingBitOfFormat2_3SUL_
   ) {
      super();
      startingBitOfFormat2_3 = startingBitOfFormat2_3_;
      fieldTypeFormat2_3 = fieldTypeFormat2_3_;
      startingBitOfFormat2_3SUL = startingBitOfFormat2_3SUL_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRS_TPC_CommandConfig (long startingBitOfFormat2_3_,
      long fieldTypeFormat2_3_,
      long startingBitOfFormat2_3SUL_
   ) {
      super();
      startingBitOfFormat2_3 = new Asn1Integer (startingBitOfFormat2_3_);
      fieldTypeFormat2_3 = new Asn1Integer (fieldTypeFormat2_3_);
      startingBitOfFormat2_3SUL = new Asn1Integer (startingBitOfFormat2_3SUL_);
   }

   public void init () {
      startingBitOfFormat2_3 = null;
      fieldTypeFormat2_3 = null;
      startingBitOfFormat2_3SUL = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return startingBitOfFormat2_3;
         case 1: return fieldTypeFormat2_3;
         case 2: return startingBitOfFormat2_3SUL;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "startingBitOfFormat2-3";
         case 1: return "fieldTypeFormat2-3";
         case 2: return "startingBitOfFormat2-3SUL";
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

      boolean startingBitOfFormat2_3Present = buffer.decodeBit ("startingBitOfFormat2_3Present");
      boolean fieldTypeFormat2_3Present = buffer.decodeBit ("fieldTypeFormat2_3Present");

      // decode startingBitOfFormat2_3

      if (startingBitOfFormat2_3Present) {
         buffer.getContext().eventDispatcher.startElement("startingBitOfFormat2_3", -1);

         startingBitOfFormat2_3 = new Asn1Integer();
         startingBitOfFormat2_3.decode (buffer, 1, 31);

         buffer.invokeCharacters(startingBitOfFormat2_3.toString());
         buffer.getContext().eventDispatcher.endElement("startingBitOfFormat2_3", -1);
      }
      else {
         startingBitOfFormat2_3 = null;
      }

      // decode fieldTypeFormat2_3

      if (fieldTypeFormat2_3Present) {
         buffer.getContext().eventDispatcher.startElement("fieldTypeFormat2_3", -1);

         fieldTypeFormat2_3 = new Asn1Integer();
         fieldTypeFormat2_3.decode (buffer, 0, 1);

         buffer.invokeCharacters(fieldTypeFormat2_3.toString());
         buffer.getContext().eventDispatcher.endElement("fieldTypeFormat2_3", -1);
      }
      else {
         fieldTypeFormat2_3 = null;
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

            boolean startingBitOfFormat2_3SULPresent = buffer.decodeBit ("startingBitOfFormat2_3SULPresent");

            // decode startingBitOfFormat2_3SUL

            if (startingBitOfFormat2_3SULPresent) {
               buffer.getContext().eventDispatcher.startElement("startingBitOfFormat2_3SUL", -1);

               startingBitOfFormat2_3SUL = new Asn1Integer();
               startingBitOfFormat2_3SUL.decode (buffer, 1, 31);

               buffer.invokeCharacters(startingBitOfFormat2_3SUL.toString());
               buffer.getContext().eventDispatcher.endElement("startingBitOfFormat2_3SUL", -1);
            }
            else {
               startingBitOfFormat2_3SUL = null;
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
      if (startingBitOfFormat2_3 != null) startingBitOfFormat2_3.print (_sb, "startingBitOfFormat2_3", _level+1);
      if (fieldTypeFormat2_3 != null) fieldTypeFormat2_3.print (_sb, "fieldTypeFormat2_3", _level+1);
      if (startingBitOfFormat2_3SUL != null) startingBitOfFormat2_3SUL.print (_sb, "startingBitOfFormat2_3SUL", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
