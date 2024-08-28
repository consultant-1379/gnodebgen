/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QuantityConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "QuantityConfig";
   }

   public QuantityConfigEUTRA quantityConfigEUTRA;  // optional
   public QuantityConfigUTRA quantityConfigUTRA;  // optional
   public QuantityConfigGERAN quantityConfigGERAN;  // optional
   public QuantityConfigCDMA2000 quantityConfigCDMA2000;  // optional
   public boolean mV2ExtPresent;
   public QuantityConfigUTRA_v1020 quantityConfigUTRA_v1020;  // optional
   public boolean mV3ExtPresent;
   public QuantityConfigEUTRA_v1250 quantityConfigEUTRA_v1250;  // optional
   public boolean mV4ExtPresent;
   public QuantityConfigEUTRA_v1310 quantityConfigEUTRA_v1310;  // optional
   public QuantityConfigWLAN_r13 quantityConfigWLAN_r13;  // optional
   public boolean mV5ExtPresent;
   public QuantityConfigNRList_r15 quantityConfigNRList_r15;  // optional
   public Asn1OpenExt extElem1;

   public QuantityConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public QuantityConfig (
      QuantityConfigEUTRA quantityConfigEUTRA_,
      QuantityConfigUTRA quantityConfigUTRA_,
      QuantityConfigGERAN quantityConfigGERAN_,
      QuantityConfigCDMA2000 quantityConfigCDMA2000_,
      QuantityConfigUTRA_v1020 quantityConfigUTRA_v1020_,
      QuantityConfigEUTRA_v1250 quantityConfigEUTRA_v1250_,
      QuantityConfigEUTRA_v1310 quantityConfigEUTRA_v1310_,
      QuantityConfigWLAN_r13 quantityConfigWLAN_r13_,
      QuantityConfigNRList_r15 quantityConfigNRList_r15_
   ) {
      super();
      quantityConfigEUTRA = quantityConfigEUTRA_;
      quantityConfigUTRA = quantityConfigUTRA_;
      quantityConfigGERAN = quantityConfigGERAN_;
      quantityConfigCDMA2000 = quantityConfigCDMA2000_;
      quantityConfigUTRA_v1020 = quantityConfigUTRA_v1020_;
      quantityConfigEUTRA_v1250 = quantityConfigEUTRA_v1250_;
      quantityConfigEUTRA_v1310 = quantityConfigEUTRA_v1310_;
      quantityConfigWLAN_r13 = quantityConfigWLAN_r13_;
      quantityConfigNRList_r15 = quantityConfigNRList_r15_;
   }

   public void init () {
      quantityConfigEUTRA = null;
      quantityConfigUTRA = null;
      quantityConfigGERAN = null;
      quantityConfigCDMA2000 = null;
      quantityConfigUTRA_v1020 = null;
      quantityConfigEUTRA_v1250 = null;
      quantityConfigEUTRA_v1310 = null;
      quantityConfigWLAN_r13 = null;
      quantityConfigNRList_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return quantityConfigEUTRA;
         case 1: return quantityConfigUTRA;
         case 2: return quantityConfigGERAN;
         case 3: return quantityConfigCDMA2000;
         case 4: return quantityConfigUTRA_v1020;
         case 5: return quantityConfigEUTRA_v1250;
         case 6: return quantityConfigEUTRA_v1310;
         case 7: return quantityConfigWLAN_r13;
         case 8: return quantityConfigNRList_r15;
         case 9: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "quantityConfigEUTRA";
         case 1: return "quantityConfigUTRA";
         case 2: return "quantityConfigGERAN";
         case 3: return "quantityConfigCDMA2000";
         case 4: return "quantityConfigUTRA-v1020";
         case 5: return "quantityConfigEUTRA-v1250";
         case 6: return "quantityConfigEUTRA-v1310";
         case 7: return "quantityConfigWLAN-r13";
         case 8: return "quantityConfigNRList-r15";
         case 9: return null;
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

      boolean quantityConfigEUTRAPresent = buffer.decodeBit ("quantityConfigEUTRAPresent");
      boolean quantityConfigUTRAPresent = buffer.decodeBit ("quantityConfigUTRAPresent");
      boolean quantityConfigGERANPresent = buffer.decodeBit ("quantityConfigGERANPresent");
      boolean quantityConfigCDMA2000Present = buffer.decodeBit ("quantityConfigCDMA2000Present");

      // decode quantityConfigEUTRA

      if (quantityConfigEUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigEUTRA", -1);

         quantityConfigEUTRA = new QuantityConfigEUTRA();
         quantityConfigEUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfigEUTRA", -1);
      }
      else {
         quantityConfigEUTRA = null;
      }

      // decode quantityConfigUTRA

      if (quantityConfigUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigUTRA", -1);

         quantityConfigUTRA = new QuantityConfigUTRA();
         quantityConfigUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfigUTRA", -1);
      }
      else {
         quantityConfigUTRA = null;
      }

      // decode quantityConfigGERAN

      if (quantityConfigGERANPresent) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigGERAN", -1);

         quantityConfigGERAN = new QuantityConfigGERAN();
         quantityConfigGERAN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfigGERAN", -1);
      }
      else {
         quantityConfigGERAN = null;
      }

      // decode quantityConfigCDMA2000

      if (quantityConfigCDMA2000Present) {
         buffer.getContext().eventDispatcher.startElement("quantityConfigCDMA2000", -1);

         quantityConfigCDMA2000 = new QuantityConfigCDMA2000();
         quantityConfigCDMA2000.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfigCDMA2000", -1);
      }
      else {
         quantityConfigCDMA2000 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean quantityConfigUTRA_v1020Present = buffer.decodeBit ("quantityConfigUTRA_v1020Present");

            // decode quantityConfigUTRA_v1020

            if (quantityConfigUTRA_v1020Present) {
               buffer.getContext().eventDispatcher.startElement("quantityConfigUTRA_v1020", -1);

               quantityConfigUTRA_v1020 = new QuantityConfigUTRA_v1020();
               quantityConfigUTRA_v1020.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("quantityConfigUTRA_v1020", -1);
            }
            else {
               quantityConfigUTRA_v1020 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean quantityConfigEUTRA_v1250Present = buffer.decodeBit ("quantityConfigEUTRA_v1250Present");

            // decode quantityConfigEUTRA_v1250

            if (quantityConfigEUTRA_v1250Present) {
               buffer.getContext().eventDispatcher.startElement("quantityConfigEUTRA_v1250", -1);

               quantityConfigEUTRA_v1250 = new QuantityConfigEUTRA_v1250();
               quantityConfigEUTRA_v1250.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("quantityConfigEUTRA_v1250", -1);
            }
            else {
               quantityConfigEUTRA_v1250 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean quantityConfigEUTRA_v1310Present = buffer.decodeBit ("quantityConfigEUTRA_v1310Present");

            boolean quantityConfigWLAN_r13Present = buffer.decodeBit ("quantityConfigWLAN_r13Present");

            // decode quantityConfigEUTRA_v1310

            if (quantityConfigEUTRA_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("quantityConfigEUTRA_v1310", -1);

               quantityConfigEUTRA_v1310 = new QuantityConfigEUTRA_v1310();
               quantityConfigEUTRA_v1310.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("quantityConfigEUTRA_v1310", -1);
            }
            else {
               quantityConfigEUTRA_v1310 = null;
            }

            // decode quantityConfigWLAN_r13

            if (quantityConfigWLAN_r13Present) {
               buffer.getContext().eventDispatcher.startElement("quantityConfigWLAN_r13", -1);

               quantityConfigWLAN_r13 = new QuantityConfigWLAN_r13();
               quantityConfigWLAN_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("quantityConfigWLAN_r13", -1);
            }
            else {
               quantityConfigWLAN_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean quantityConfigNRList_r15Present = buffer.decodeBit ("quantityConfigNRList_r15Present");

            // decode quantityConfigNRList_r15

            if (quantityConfigNRList_r15Present) {
               buffer.getContext().eventDispatcher.startElement("quantityConfigNRList_r15", -1);

               quantityConfigNRList_r15 = new QuantityConfigNRList_r15();
               quantityConfigNRList_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("quantityConfigNRList_r15", -1);
            }
            else {
               quantityConfigNRList_r15 = null;
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
      if (quantityConfigEUTRA != null) quantityConfigEUTRA.print (_sb, "quantityConfigEUTRA", _level+1);
      if (quantityConfigUTRA != null) quantityConfigUTRA.print (_sb, "quantityConfigUTRA", _level+1);
      if (quantityConfigGERAN != null) quantityConfigGERAN.print (_sb, "quantityConfigGERAN", _level+1);
      if (quantityConfigCDMA2000 != null) quantityConfigCDMA2000.print (_sb, "quantityConfigCDMA2000", _level+1);
      if (quantityConfigUTRA_v1020 != null) quantityConfigUTRA_v1020.print (_sb, "quantityConfigUTRA_v1020", _level+1);
      if (quantityConfigEUTRA_v1250 != null) quantityConfigEUTRA_v1250.print (_sb, "quantityConfigEUTRA_v1250", _level+1);
      if (quantityConfigEUTRA_v1310 != null) quantityConfigEUTRA_v1310.print (_sb, "quantityConfigEUTRA_v1310", _level+1);
      if (quantityConfigWLAN_r13 != null) quantityConfigWLAN_r13.print (_sb, "quantityConfigWLAN_r13", _level+1);
      if (quantityConfigNRList_r15 != null) quantityConfigNRList_r15.print (_sb, "quantityConfigNRList_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
