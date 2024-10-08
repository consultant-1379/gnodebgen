/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MRDC_Parameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MRDC-Parameters";
   }

   public MRDC_Parameters_singleUL_Transmission singleUL_Transmission = null;  // optional
   public MRDC_Parameters_dynamicPowerSharingENDC dynamicPowerSharingENDC = null;  // optional
   public MRDC_Parameters_tdm_Pattern tdm_Pattern = null;  // optional
   public MRDC_Parameters_ul_SharingEUTRA_NR ul_SharingEUTRA_NR = null;  // optional
   public MRDC_Parameters_ul_SwitchingTimeEUTRA_NR ul_SwitchingTimeEUTRA_NR = null;  // optional
   public MRDC_Parameters_simultaneousRxTxInterBandENDC simultaneousRxTxInterBandENDC = null;  // optional
   public MRDC_Parameters_asyncIntraBandENDC asyncIntraBandENDC = null;  // optional
   public boolean mV2ExtPresent;
   public MRDC_Parameters_dualPA_Architecture dualPA_Architecture = null;  // optional
   public MRDC_Parameters_intraBandENDC_Support intraBandENDC_Support = null;  // optional
   public MRDC_Parameters_ul_TimingAlignmentEUTRA_NR ul_TimingAlignmentEUTRA_NR = null;  // optional
   public Asn1OpenExt extElem1;

   public MRDC_Parameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MRDC_Parameters (
      MRDC_Parameters_singleUL_Transmission singleUL_Transmission_,
      MRDC_Parameters_dynamicPowerSharingENDC dynamicPowerSharingENDC_,
      MRDC_Parameters_tdm_Pattern tdm_Pattern_,
      MRDC_Parameters_ul_SharingEUTRA_NR ul_SharingEUTRA_NR_,
      MRDC_Parameters_ul_SwitchingTimeEUTRA_NR ul_SwitchingTimeEUTRA_NR_,
      MRDC_Parameters_simultaneousRxTxInterBandENDC simultaneousRxTxInterBandENDC_,
      MRDC_Parameters_asyncIntraBandENDC asyncIntraBandENDC_,
      MRDC_Parameters_dualPA_Architecture dualPA_Architecture_,
      MRDC_Parameters_intraBandENDC_Support intraBandENDC_Support_,
      MRDC_Parameters_ul_TimingAlignmentEUTRA_NR ul_TimingAlignmentEUTRA_NR_
   ) {
      super();
      singleUL_Transmission = singleUL_Transmission_;
      dynamicPowerSharingENDC = dynamicPowerSharingENDC_;
      tdm_Pattern = tdm_Pattern_;
      ul_SharingEUTRA_NR = ul_SharingEUTRA_NR_;
      ul_SwitchingTimeEUTRA_NR = ul_SwitchingTimeEUTRA_NR_;
      simultaneousRxTxInterBandENDC = simultaneousRxTxInterBandENDC_;
      asyncIntraBandENDC = asyncIntraBandENDC_;
      dualPA_Architecture = dualPA_Architecture_;
      intraBandENDC_Support = intraBandENDC_Support_;
      ul_TimingAlignmentEUTRA_NR = ul_TimingAlignmentEUTRA_NR_;
   }

   public void init () {
      singleUL_Transmission = null;
      dynamicPowerSharingENDC = null;
      tdm_Pattern = null;
      ul_SharingEUTRA_NR = null;
      ul_SwitchingTimeEUTRA_NR = null;
      simultaneousRxTxInterBandENDC = null;
      asyncIntraBandENDC = null;
      dualPA_Architecture = null;
      intraBandENDC_Support = null;
      ul_TimingAlignmentEUTRA_NR = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return singleUL_Transmission;
         case 1: return dynamicPowerSharingENDC;
         case 2: return tdm_Pattern;
         case 3: return ul_SharingEUTRA_NR;
         case 4: return ul_SwitchingTimeEUTRA_NR;
         case 5: return simultaneousRxTxInterBandENDC;
         case 6: return asyncIntraBandENDC;
         case 7: return dualPA_Architecture;
         case 8: return intraBandENDC_Support;
         case 9: return ul_TimingAlignmentEUTRA_NR;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "singleUL-Transmission";
         case 1: return "dynamicPowerSharingENDC";
         case 2: return "tdm-Pattern";
         case 3: return "ul-SharingEUTRA-NR";
         case 4: return "ul-SwitchingTimeEUTRA-NR";
         case 5: return "simultaneousRxTxInterBandENDC";
         case 6: return "asyncIntraBandENDC";
         case 7: return "dualPA-Architecture";
         case 8: return "intraBandENDC-Support";
         case 9: return "ul-TimingAlignmentEUTRA-NR";
         case 10: return null;
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

      boolean singleUL_TransmissionPresent = buffer.decodeBit ("singleUL_TransmissionPresent");
      boolean dynamicPowerSharingENDCPresent = buffer.decodeBit ("dynamicPowerSharingENDCPresent");
      boolean tdm_PatternPresent = buffer.decodeBit ("tdm_PatternPresent");
      boolean ul_SharingEUTRA_NRPresent = buffer.decodeBit ("ul_SharingEUTRA_NRPresent");
      boolean ul_SwitchingTimeEUTRA_NRPresent = buffer.decodeBit ("ul_SwitchingTimeEUTRA_NRPresent");
      boolean simultaneousRxTxInterBandENDCPresent = buffer.decodeBit ("simultaneousRxTxInterBandENDCPresent");
      boolean asyncIntraBandENDCPresent = buffer.decodeBit ("asyncIntraBandENDCPresent");

      // decode singleUL_Transmission

      if (singleUL_TransmissionPresent) {
         buffer.getContext().eventDispatcher.startElement("singleUL_Transmission", -1);

         int tval = MRDC_Parameters_singleUL_Transmission.decodeEnumValue (buffer);
         singleUL_Transmission = MRDC_Parameters_singleUL_Transmission.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("singleUL_Transmission", -1);
      }
      else {
         singleUL_Transmission = null;
      }

      // decode dynamicPowerSharingENDC

      if (dynamicPowerSharingENDCPresent) {
         buffer.getContext().eventDispatcher.startElement("dynamicPowerSharingENDC", -1);

         int tval = MRDC_Parameters_dynamicPowerSharingENDC.decodeEnumValue (buffer);
         dynamicPowerSharingENDC = MRDC_Parameters_dynamicPowerSharingENDC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dynamicPowerSharingENDC", -1);
      }
      else {
         dynamicPowerSharingENDC = null;
      }

      // decode tdm_Pattern

      if (tdm_PatternPresent) {
         buffer.getContext().eventDispatcher.startElement("tdm_Pattern", -1);

         int tval = MRDC_Parameters_tdm_Pattern.decodeEnumValue (buffer);
         tdm_Pattern = MRDC_Parameters_tdm_Pattern.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tdm_Pattern", -1);
      }
      else {
         tdm_Pattern = null;
      }

      // decode ul_SharingEUTRA_NR

      if (ul_SharingEUTRA_NRPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_SharingEUTRA_NR", -1);

         int tval = MRDC_Parameters_ul_SharingEUTRA_NR.decodeEnumValue (buffer);
         ul_SharingEUTRA_NR = MRDC_Parameters_ul_SharingEUTRA_NR.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_SharingEUTRA_NR", -1);
      }
      else {
         ul_SharingEUTRA_NR = null;
      }

      // decode ul_SwitchingTimeEUTRA_NR

      if (ul_SwitchingTimeEUTRA_NRPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_SwitchingTimeEUTRA_NR", -1);

         int tval = MRDC_Parameters_ul_SwitchingTimeEUTRA_NR.decodeEnumValue (buffer);
         ul_SwitchingTimeEUTRA_NR = MRDC_Parameters_ul_SwitchingTimeEUTRA_NR.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_SwitchingTimeEUTRA_NR", -1);
      }
      else {
         ul_SwitchingTimeEUTRA_NR = null;
      }

      // decode simultaneousRxTxInterBandENDC

      if (simultaneousRxTxInterBandENDCPresent) {
         buffer.getContext().eventDispatcher.startElement("simultaneousRxTxInterBandENDC", -1);

         int tval = MRDC_Parameters_simultaneousRxTxInterBandENDC.decodeEnumValue (buffer);
         simultaneousRxTxInterBandENDC = MRDC_Parameters_simultaneousRxTxInterBandENDC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simultaneousRxTxInterBandENDC", -1);
      }
      else {
         simultaneousRxTxInterBandENDC = null;
      }

      // decode asyncIntraBandENDC

      if (asyncIntraBandENDCPresent) {
         buffer.getContext().eventDispatcher.startElement("asyncIntraBandENDC", -1);

         int tval = MRDC_Parameters_asyncIntraBandENDC.decodeEnumValue (buffer);
         asyncIntraBandENDC = MRDC_Parameters_asyncIntraBandENDC.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("asyncIntraBandENDC", -1);
      }
      else {
         asyncIntraBandENDC = null;
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

            boolean dualPA_ArchitecturePresent = buffer.decodeBit ("dualPA_ArchitecturePresent");

            boolean intraBandENDC_SupportPresent = buffer.decodeBit ("intraBandENDC_SupportPresent");

            boolean ul_TimingAlignmentEUTRA_NRPresent = buffer.decodeBit ("ul_TimingAlignmentEUTRA_NRPresent");

            // decode dualPA_Architecture

            if (dualPA_ArchitecturePresent) {
               buffer.getContext().eventDispatcher.startElement("dualPA_Architecture", -1);

               int tval = MRDC_Parameters_dualPA_Architecture.decodeEnumValue (buffer);
               dualPA_Architecture = MRDC_Parameters_dualPA_Architecture.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("dualPA_Architecture", -1);
            }
            else {
               dualPA_Architecture = null;
            }

            // decode intraBandENDC_Support

            if (intraBandENDC_SupportPresent) {
               buffer.getContext().eventDispatcher.startElement("intraBandENDC_Support", -1);

               int tval = MRDC_Parameters_intraBandENDC_Support.decodeEnumValue (buffer);
               intraBandENDC_Support = MRDC_Parameters_intraBandENDC_Support.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("intraBandENDC_Support", -1);
            }
            else {
               intraBandENDC_Support = null;
            }

            // decode ul_TimingAlignmentEUTRA_NR

            if (ul_TimingAlignmentEUTRA_NRPresent) {
               buffer.getContext().eventDispatcher.startElement("ul_TimingAlignmentEUTRA_NR", -1);

               int tval = MRDC_Parameters_ul_TimingAlignmentEUTRA_NR.decodeEnumValue (buffer);
               ul_TimingAlignmentEUTRA_NR = MRDC_Parameters_ul_TimingAlignmentEUTRA_NR.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("ul_TimingAlignmentEUTRA_NR", -1);
            }
            else {
               ul_TimingAlignmentEUTRA_NR = null;
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

      buffer.encodeBit ((singleUL_Transmission != null), null);
      buffer.encodeBit ((dynamicPowerSharingENDC != null), null);
      buffer.encodeBit ((tdm_Pattern != null), null);
      buffer.encodeBit ((ul_SharingEUTRA_NR != null), null);
      buffer.encodeBit ((ul_SwitchingTimeEUTRA_NR != null), null);
      buffer.encodeBit ((simultaneousRxTxInterBandENDC != null), null);
      buffer.encodeBit ((asyncIntraBandENDC != null), null);

      // encode singleUL_Transmission

      if (singleUL_Transmission != null) {
         buffer.getContext().eventDispatcher.startElement("singleUL_Transmission", -1);

         singleUL_Transmission.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("singleUL_Transmission", -1);
      }

      // encode dynamicPowerSharingENDC

      if (dynamicPowerSharingENDC != null) {
         buffer.getContext().eventDispatcher.startElement("dynamicPowerSharingENDC", -1);

         dynamicPowerSharingENDC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dynamicPowerSharingENDC", -1);
      }

      // encode tdm_Pattern

      if (tdm_Pattern != null) {
         buffer.getContext().eventDispatcher.startElement("tdm_Pattern", -1);

         tdm_Pattern.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tdm_Pattern", -1);
      }

      // encode ul_SharingEUTRA_NR

      if (ul_SharingEUTRA_NR != null) {
         buffer.getContext().eventDispatcher.startElement("ul_SharingEUTRA_NR", -1);

         ul_SharingEUTRA_NR.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ul_SharingEUTRA_NR", -1);
      }

      // encode ul_SwitchingTimeEUTRA_NR

      if (ul_SwitchingTimeEUTRA_NR != null) {
         buffer.getContext().eventDispatcher.startElement("ul_SwitchingTimeEUTRA_NR", -1);

         ul_SwitchingTimeEUTRA_NR.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ul_SwitchingTimeEUTRA_NR", -1);
      }

      // encode simultaneousRxTxInterBandENDC

      if (simultaneousRxTxInterBandENDC != null) {
         buffer.getContext().eventDispatcher.startElement("simultaneousRxTxInterBandENDC", -1);

         simultaneousRxTxInterBandENDC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("simultaneousRxTxInterBandENDC", -1);
      }

      // encode asyncIntraBandENDC

      if (asyncIntraBandENDC != null) {
         buffer.getContext().eventDispatcher.startElement("asyncIntraBandENDC", -1);

         asyncIntraBandENDC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("asyncIntraBandENDC", -1);
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
            buffer.encodeBit ((dualPA_Architecture != null), "optbit");
            buffer.encodeBit ((intraBandENDC_Support != null), "optbit");
            buffer.encodeBit ((ul_TimingAlignmentEUTRA_NR != null), "optbit");
            if (dualPA_Architecture != null) {
               dualPA_Architecture.encode (buffer);
            }
            if (intraBandENDC_Support != null) {
               intraBandENDC_Support.encode (buffer);
            }
            if (ul_TimingAlignmentEUTRA_NR != null) {
               ul_TimingAlignmentEUTRA_NR.encode (buffer);
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
      if (singleUL_Transmission != null) singleUL_Transmission.print (_sb, "singleUL_Transmission", _level+1);
      if (dynamicPowerSharingENDC != null) dynamicPowerSharingENDC.print (_sb, "dynamicPowerSharingENDC", _level+1);
      if (tdm_Pattern != null) tdm_Pattern.print (_sb, "tdm_Pattern", _level+1);
      if (ul_SharingEUTRA_NR != null) ul_SharingEUTRA_NR.print (_sb, "ul_SharingEUTRA_NR", _level+1);
      if (ul_SwitchingTimeEUTRA_NR != null) ul_SwitchingTimeEUTRA_NR.print (_sb, "ul_SwitchingTimeEUTRA_NR", _level+1);
      if (simultaneousRxTxInterBandENDC != null) simultaneousRxTxInterBandENDC.print (_sb, "simultaneousRxTxInterBandENDC", _level+1);
      if (asyncIntraBandENDC != null) asyncIntraBandENDC.print (_sb, "asyncIntraBandENDC", _level+1);
      if (dualPA_Architecture != null) dualPA_Architecture.print (_sb, "dualPA_Architecture", _level+1);
      if (intraBandENDC_Support != null) intraBandENDC_Support.print (_sb, "intraBandENDC_Support", _level+1);
      if (ul_TimingAlignmentEUTRA_NR != null) ul_TimingAlignmentEUTRA_NR.print (_sb, "ul_TimingAlignmentEUTRA_NR", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
