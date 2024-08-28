/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.P_Max;

public class ConfigRestrictModReqSCG extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ConfigRestrictModReqSCG";
   }

   public BandCombinationInfoSN requestedBC_MRDC;  // optional
   public P_Max requestedP_MaxFR1;  // optional
   public boolean mV2ExtPresent;
   public Asn1Integer requestedPDCCH_BlindDetectionSCG;  // optional
   public P_Max requestedP_MaxEUTRA;  // optional
   public boolean mV3ExtPresent;
   public P_Max requestedP_MaxFR2_r16;  // optional
   public Asn1Integer requestedMaxInterFreqMeasIdSCG_r16;  // optional
   public Asn1Integer requestedMaxIntraFreqMeasIdSCG_r16;  // optional
   public T_Offset_r16 requestedToffset_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public ConfigRestrictModReqSCG () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ConfigRestrictModReqSCG (
      BandCombinationInfoSN requestedBC_MRDC_,
      P_Max requestedP_MaxFR1_,
      Asn1Integer requestedPDCCH_BlindDetectionSCG_,
      P_Max requestedP_MaxEUTRA_,
      P_Max requestedP_MaxFR2_r16_,
      Asn1Integer requestedMaxInterFreqMeasIdSCG_r16_,
      Asn1Integer requestedMaxIntraFreqMeasIdSCG_r16_,
      T_Offset_r16 requestedToffset_r16_
   ) {
      super();
      requestedBC_MRDC = requestedBC_MRDC_;
      requestedP_MaxFR1 = requestedP_MaxFR1_;
      requestedPDCCH_BlindDetectionSCG = requestedPDCCH_BlindDetectionSCG_;
      requestedP_MaxEUTRA = requestedP_MaxEUTRA_;
      requestedP_MaxFR2_r16 = requestedP_MaxFR2_r16_;
      requestedMaxInterFreqMeasIdSCG_r16 = requestedMaxInterFreqMeasIdSCG_r16_;
      requestedMaxIntraFreqMeasIdSCG_r16 = requestedMaxIntraFreqMeasIdSCG_r16_;
      requestedToffset_r16 = requestedToffset_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ConfigRestrictModReqSCG (BandCombinationInfoSN requestedBC_MRDC_,
      long requestedP_MaxFR1_,
      long requestedPDCCH_BlindDetectionSCG_,
      long requestedP_MaxEUTRA_,
      long requestedP_MaxFR2_r16_,
      long requestedMaxInterFreqMeasIdSCG_r16_,
      long requestedMaxIntraFreqMeasIdSCG_r16_,
      T_Offset_r16 requestedToffset_r16_
   ) {
      super();
      requestedBC_MRDC = requestedBC_MRDC_;
      requestedP_MaxFR1 = new P_Max (requestedP_MaxFR1_);
      requestedPDCCH_BlindDetectionSCG = new Asn1Integer (requestedPDCCH_BlindDetectionSCG_);
      requestedP_MaxEUTRA = new P_Max (requestedP_MaxEUTRA_);
      requestedP_MaxFR2_r16 = new P_Max (requestedP_MaxFR2_r16_);
      requestedMaxInterFreqMeasIdSCG_r16 = new Asn1Integer (requestedMaxInterFreqMeasIdSCG_r16_);
      requestedMaxIntraFreqMeasIdSCG_r16 = new Asn1Integer (requestedMaxIntraFreqMeasIdSCG_r16_);
      requestedToffset_r16 = requestedToffset_r16_;
   }

   public void init () {
      requestedBC_MRDC = null;
      requestedP_MaxFR1 = null;
      requestedPDCCH_BlindDetectionSCG = null;
      requestedP_MaxEUTRA = null;
      requestedP_MaxFR2_r16 = null;
      requestedMaxInterFreqMeasIdSCG_r16 = null;
      requestedMaxIntraFreqMeasIdSCG_r16 = null;
      requestedToffset_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return requestedBC_MRDC;
         case 1: return requestedP_MaxFR1;
         case 2: return requestedPDCCH_BlindDetectionSCG;
         case 3: return requestedP_MaxEUTRA;
         case 4: return requestedP_MaxFR2_r16;
         case 5: return requestedMaxInterFreqMeasIdSCG_r16;
         case 6: return requestedMaxIntraFreqMeasIdSCG_r16;
         case 7: return requestedToffset_r16;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "requestedBC-MRDC";
         case 1: return "requestedP-MaxFR1";
         case 2: return "requestedPDCCH-BlindDetectionSCG";
         case 3: return "requestedP-MaxEUTRA";
         case 4: return "requestedP-MaxFR2-r16";
         case 5: return "requestedMaxInterFreqMeasIdSCG-r16";
         case 6: return "requestedMaxIntraFreqMeasIdSCG-r16";
         case 7: return "requestedToffset-r16";
         case 8: return null;
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

      boolean requestedBC_MRDCPresent = buffer.decodeBit ("requestedBC_MRDCPresent");
      boolean requestedP_MaxFR1Present = buffer.decodeBit ("requestedP_MaxFR1Present");

      // decode requestedBC_MRDC

      if (requestedBC_MRDCPresent) {
         buffer.getContext().eventDispatcher.startElement("requestedBC_MRDC", -1);

         requestedBC_MRDC = new BandCombinationInfoSN();
         requestedBC_MRDC.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("requestedBC_MRDC", -1);
      }
      else {
         requestedBC_MRDC = null;
      }

      // decode requestedP_MaxFR1

      if (requestedP_MaxFR1Present) {
         buffer.getContext().eventDispatcher.startElement("requestedP_MaxFR1", -1);

         requestedP_MaxFR1 = new P_Max();
         requestedP_MaxFR1.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("requestedP_MaxFR1", -1);
      }
      else {
         requestedP_MaxFR1 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean requestedPDCCH_BlindDetectionSCGPresent = buffer.decodeBit ("requestedPDCCH_BlindDetectionSCGPresent");

            boolean requestedP_MaxEUTRAPresent = buffer.decodeBit ("requestedP_MaxEUTRAPresent");

            // decode requestedPDCCH_BlindDetectionSCG

            if (requestedPDCCH_BlindDetectionSCGPresent) {
               buffer.getContext().eventDispatcher.startElement("requestedPDCCH_BlindDetectionSCG", -1);

               requestedPDCCH_BlindDetectionSCG = new Asn1Integer();
               requestedPDCCH_BlindDetectionSCG.decode (buffer, 1, 15);

               buffer.invokeCharacters(requestedPDCCH_BlindDetectionSCG.toString());
               buffer.getContext().eventDispatcher.endElement("requestedPDCCH_BlindDetectionSCG", -1);
            }
            else {
               requestedPDCCH_BlindDetectionSCG = null;
            }

            // decode requestedP_MaxEUTRA

            if (requestedP_MaxEUTRAPresent) {
               buffer.getContext().eventDispatcher.startElement("requestedP_MaxEUTRA", -1);

               requestedP_MaxEUTRA = new P_Max();
               requestedP_MaxEUTRA.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("requestedP_MaxEUTRA", -1);
            }
            else {
               requestedP_MaxEUTRA = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean requestedP_MaxFR2_r16Present = buffer.decodeBit ("requestedP_MaxFR2_r16Present");

            boolean requestedMaxInterFreqMeasIdSCG_r16Present = buffer.decodeBit ("requestedMaxInterFreqMeasIdSCG_r16Present");

            boolean requestedMaxIntraFreqMeasIdSCG_r16Present = buffer.decodeBit ("requestedMaxIntraFreqMeasIdSCG_r16Present");

            boolean requestedToffset_r16Present = buffer.decodeBit ("requestedToffset_r16Present");

            // decode requestedP_MaxFR2_r16

            if (requestedP_MaxFR2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("requestedP_MaxFR2_r16", -1);

               requestedP_MaxFR2_r16 = new P_Max();
               requestedP_MaxFR2_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("requestedP_MaxFR2_r16", -1);
            }
            else {
               requestedP_MaxFR2_r16 = null;
            }

            // decode requestedMaxInterFreqMeasIdSCG_r16

            if (requestedMaxInterFreqMeasIdSCG_r16Present) {
               buffer.getContext().eventDispatcher.startElement("requestedMaxInterFreqMeasIdSCG_r16", -1);

               requestedMaxInterFreqMeasIdSCG_r16 = new Asn1Integer();
               requestedMaxInterFreqMeasIdSCG_r16.decode (buffer, 1, 62);

               buffer.invokeCharacters(requestedMaxInterFreqMeasIdSCG_r16.toString());
               buffer.getContext().eventDispatcher.endElement("requestedMaxInterFreqMeasIdSCG_r16", -1);
            }
            else {
               requestedMaxInterFreqMeasIdSCG_r16 = null;
            }

            // decode requestedMaxIntraFreqMeasIdSCG_r16

            if (requestedMaxIntraFreqMeasIdSCG_r16Present) {
               buffer.getContext().eventDispatcher.startElement("requestedMaxIntraFreqMeasIdSCG_r16", -1);

               requestedMaxIntraFreqMeasIdSCG_r16 = new Asn1Integer();
               requestedMaxIntraFreqMeasIdSCG_r16.decode (buffer, 1, 62);

               buffer.invokeCharacters(requestedMaxIntraFreqMeasIdSCG_r16.toString());
               buffer.getContext().eventDispatcher.endElement("requestedMaxIntraFreqMeasIdSCG_r16", -1);
            }
            else {
               requestedMaxIntraFreqMeasIdSCG_r16 = null;
            }

            // decode requestedToffset_r16

            if (requestedToffset_r16Present) {
               buffer.getContext().eventDispatcher.startElement("requestedToffset_r16", -1);

               int tval = T_Offset_r16.decodeEnumValue (buffer);
               requestedToffset_r16 = T_Offset_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("requestedToffset_r16", -1);
            }
            else {
               requestedToffset_r16 = null;
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
      mV3ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((requestedBC_MRDC != null), null);
      buffer.encodeBit ((requestedP_MaxFR1 != null), null);

      // encode requestedBC_MRDC

      if (requestedBC_MRDC != null) {
         buffer.getContext().eventDispatcher.startElement("requestedBC_MRDC", -1);

         requestedBC_MRDC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("requestedBC_MRDC", -1);
      }

      // encode requestedP_MaxFR1

      if (requestedP_MaxFR1 != null) {
         buffer.getContext().eventDispatcher.startElement("requestedP_MaxFR1", -1);

         requestedP_MaxFR1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("requestedP_MaxFR1", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 2;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);
         buffer.encodeBit (mV3ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((requestedPDCCH_BlindDetectionSCG != null), "optbit");
            buffer.encodeBit ((requestedP_MaxEUTRA != null), "optbit");
            if (requestedPDCCH_BlindDetectionSCG != null) {
               requestedPDCCH_BlindDetectionSCG.encode (buffer, 1, 15);
            }
            if (requestedP_MaxEUTRA != null) {
               requestedP_MaxEUTRA.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         if (mV3ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((requestedP_MaxFR2_r16 != null), "optbit");
            buffer.encodeBit ((requestedMaxInterFreqMeasIdSCG_r16 != null), "optbit");
            buffer.encodeBit ((requestedMaxIntraFreqMeasIdSCG_r16 != null), "optbit");
            buffer.encodeBit ((requestedToffset_r16 != null), "optbit");
            if (requestedP_MaxFR2_r16 != null) {
               requestedP_MaxFR2_r16.encode (buffer);
            }
            if (requestedMaxInterFreqMeasIdSCG_r16 != null) {
               requestedMaxInterFreqMeasIdSCG_r16.encode (buffer, 1, 62);
            }
            if (requestedMaxIntraFreqMeasIdSCG_r16 != null) {
               requestedMaxIntraFreqMeasIdSCG_r16.encode (buffer, 1, 62);
            }
            if (requestedToffset_r16 != null) {
               requestedToffset_r16.encode (buffer);
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
      if (requestedBC_MRDC != null) requestedBC_MRDC.print (_sb, "requestedBC_MRDC", _level+1);
      if (requestedP_MaxFR1 != null) requestedP_MaxFR1.print (_sb, "requestedP_MaxFR1", _level+1);
      if (requestedPDCCH_BlindDetectionSCG != null) requestedPDCCH_BlindDetectionSCG.print (_sb, "requestedPDCCH_BlindDetectionSCG", _level+1);
      if (requestedP_MaxEUTRA != null) requestedP_MaxEUTRA.print (_sb, "requestedP_MaxEUTRA", _level+1);
      if (requestedP_MaxFR2_r16 != null) requestedP_MaxFR2_r16.print (_sb, "requestedP_MaxFR2_r16", _level+1);
      if (requestedMaxInterFreqMeasIdSCG_r16 != null) requestedMaxInterFreqMeasIdSCG_r16.print (_sb, "requestedMaxInterFreqMeasIdSCG_r16", _level+1);
      if (requestedMaxIntraFreqMeasIdSCG_r16 != null) requestedMaxIntraFreqMeasIdSCG_r16.print (_sb, "requestedMaxIntraFreqMeasIdSCG_r16", _level+1);
      if (requestedToffset_r16 != null) requestedToffset_r16.print (_sb, "requestedToffset_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
