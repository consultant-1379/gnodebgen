/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class MeasConfigMN extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasConfigMN";
   }

   public MeasConfigMN_measuredFrequenciesMN measuredFrequenciesMN;  // optional
   public MeasConfigMN_measGapConfig measGapConfig;  // optional
   public MeasConfigMN_gapPurpose gapPurpose = null;  // optional
   public boolean mV2ExtPresent;
   public MeasConfigMN_measGapConfigFR2 measGapConfigFR2;  // optional
   public Asn1OpenExt extElem1;

   public MeasConfigMN () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasConfigMN (
      MeasConfigMN_measuredFrequenciesMN measuredFrequenciesMN_,
      MeasConfigMN_measGapConfig measGapConfig_,
      MeasConfigMN_gapPurpose gapPurpose_,
      MeasConfigMN_measGapConfigFR2 measGapConfigFR2_
   ) {
      super();
      measuredFrequenciesMN = measuredFrequenciesMN_;
      measGapConfig = measGapConfig_;
      gapPurpose = gapPurpose_;
      measGapConfigFR2 = measGapConfigFR2_;
   }

   public void init () {
      measuredFrequenciesMN = null;
      measGapConfig = null;
      gapPurpose = null;
      measGapConfigFR2 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measuredFrequenciesMN;
         case 1: return measGapConfig;
         case 2: return gapPurpose;
         case 3: return measGapConfigFR2;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measuredFrequenciesMN";
         case 1: return "measGapConfig";
         case 2: return "gapPurpose";
         case 3: return "measGapConfigFR2";
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

      boolean measuredFrequenciesMNPresent = buffer.decodeBit ("measuredFrequenciesMNPresent");
      boolean measGapConfigPresent = buffer.decodeBit ("measGapConfigPresent");
      boolean gapPurposePresent = buffer.decodeBit ("gapPurposePresent");

      // decode measuredFrequenciesMN

      if (measuredFrequenciesMNPresent) {
         buffer.getContext().eventDispatcher.startElement("measuredFrequenciesMN", -1);

         measuredFrequenciesMN = new MeasConfigMN_measuredFrequenciesMN();
         measuredFrequenciesMN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measuredFrequenciesMN", -1);
      }
      else {
         measuredFrequenciesMN = null;
      }

      // decode measGapConfig

      if (measGapConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("measGapConfig", -1);

         measGapConfig = new MeasConfigMN_measGapConfig();
         measGapConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measGapConfig", -1);
      }
      else {
         measGapConfig = null;
      }

      // decode gapPurpose

      if (gapPurposePresent) {
         buffer.getContext().eventDispatcher.startElement("gapPurpose", -1);

         int tval = MeasConfigMN_gapPurpose.decodeEnumValue (buffer);
         gapPurpose = MeasConfigMN_gapPurpose.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("gapPurpose", -1);
      }
      else {
         gapPurpose = null;
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

            boolean measGapConfigFR2Present = buffer.decodeBit ("measGapConfigFR2Present");

            // decode measGapConfigFR2

            if (measGapConfigFR2Present) {
               buffer.getContext().eventDispatcher.startElement("measGapConfigFR2", -1);

               measGapConfigFR2 = new MeasConfigMN_measGapConfigFR2();
               measGapConfigFR2.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measGapConfigFR2", -1);
            }
            else {
               measGapConfigFR2 = null;
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
      if (measuredFrequenciesMN != null) measuredFrequenciesMN.print (_sb, "measuredFrequenciesMN", _level+1);
      if (measGapConfig != null) measGapConfig.print (_sb, "measGapConfig", _level+1);
      if (gapPurpose != null) gapPurpose.print (_sb, "gapPurpose", _level+1);
      if (measGapConfigFR2 != null) measGapConfigFR2.print (_sb, "measGapConfigFR2", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
