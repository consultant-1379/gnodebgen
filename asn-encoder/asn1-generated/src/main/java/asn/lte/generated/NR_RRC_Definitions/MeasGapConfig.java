/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasGapConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasGapConfig";
   }

   public MeasGapConfig_gapFR2 gapFR2;  // optional
   public boolean mV2ExtPresent;
   public MeasGapConfig_gapFR1 gapFR1;  // optional
   public MeasGapConfig_gapUE gapUE;  // optional
   public Asn1OpenExt extElem1;

   public MeasGapConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasGapConfig (
      MeasGapConfig_gapFR2 gapFR2_,
      MeasGapConfig_gapFR1 gapFR1_,
      MeasGapConfig_gapUE gapUE_
   ) {
      super();
      gapFR2 = gapFR2_;
      gapFR1 = gapFR1_;
      gapUE = gapUE_;
   }

   public void init () {
      gapFR2 = null;
      gapFR1 = null;
      gapUE = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gapFR2;
         case 1: return gapFR1;
         case 2: return gapUE;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gapFR2";
         case 1: return "gapFR1";
         case 2: return "gapUE";
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

      boolean gapFR2Present = buffer.decodeBit ("gapFR2Present");

      // decode gapFR2

      if (gapFR2Present) {
         buffer.getContext().eventDispatcher.startElement("gapFR2", -1);

         gapFR2 = new MeasGapConfig_gapFR2();
         gapFR2.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("gapFR2", -1);
      }
      else {
         gapFR2 = null;
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

            boolean gapFR1Present = buffer.decodeBit ("gapFR1Present");

            boolean gapUEPresent = buffer.decodeBit ("gapUEPresent");

            // decode gapFR1

            if (gapFR1Present) {
               buffer.getContext().eventDispatcher.startElement("gapFR1", -1);

               gapFR1 = new MeasGapConfig_gapFR1();
               gapFR1.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("gapFR1", -1);
            }
            else {
               gapFR1 = null;
            }

            // decode gapUE

            if (gapUEPresent) {
               buffer.getContext().eventDispatcher.startElement("gapUE", -1);

               gapUE = new MeasGapConfig_gapUE();
               gapUE.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("gapUE", -1);
            }
            else {
               gapUE = null;
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
      if (gapFR2 != null) gapFR2.print (_sb, "gapFR2", _level+1);
      if (gapFR1 != null) gapFR1.print (_sb, "gapFR1", _level+1);
      if (gapUE != null) gapUE.print (_sb, "gapUE", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
