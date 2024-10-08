/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.PhysCellId;
import asn.lte.generated.EUTRA_RRC_Definitions.ARFCN_ValueEUTRA;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRP_Range;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRQ_Range;
import asn.lte.generated.EUTRA_RRC_Definitions.ARFCN_ValueEUTRA_v9e0;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRQ_Range_v1250;
import asn.lte.generated.EUTRA_RRC_Definitions.RS_SINR_Range_r13;

public class CandidateCellInfo_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CandidateCellInfo-r10";
   }

   public PhysCellId physCellId_r10;
   public ARFCN_ValueEUTRA dl_CarrierFreq_r10;
   public RSRP_Range rsrpResult_r10;  // optional
   public RSRQ_Range rsrqResult_r10;  // optional
   public boolean mV2ExtPresent;
   public ARFCN_ValueEUTRA_v9e0 dl_CarrierFreq_v1090;  // optional
   public boolean mV3ExtPresent;
   public RSRQ_Range_v1250 rsrqResult_v1250;  // optional
   public boolean mV4ExtPresent;
   public RS_SINR_Range_r13 rs_sinr_Result_r13;  // optional
   public Asn1OpenExt extElem1;

   public CandidateCellInfo_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CandidateCellInfo_r10 (
      PhysCellId physCellId_r10_,
      ARFCN_ValueEUTRA dl_CarrierFreq_r10_,
      RSRP_Range rsrpResult_r10_,
      RSRQ_Range rsrqResult_r10_,
      ARFCN_ValueEUTRA_v9e0 dl_CarrierFreq_v1090_,
      RSRQ_Range_v1250 rsrqResult_v1250_,
      RS_SINR_Range_r13 rs_sinr_Result_r13_
   ) {
      super();
      physCellId_r10 = physCellId_r10_;
      dl_CarrierFreq_r10 = dl_CarrierFreq_r10_;
      rsrpResult_r10 = rsrpResult_r10_;
      rsrqResult_r10 = rsrqResult_r10_;
      dl_CarrierFreq_v1090 = dl_CarrierFreq_v1090_;
      rsrqResult_v1250 = rsrqResult_v1250_;
      rs_sinr_Result_r13 = rs_sinr_Result_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CandidateCellInfo_r10 (
      PhysCellId physCellId_r10_,
      ARFCN_ValueEUTRA dl_CarrierFreq_r10_
   ) {
      super();
      physCellId_r10 = physCellId_r10_;
      dl_CarrierFreq_r10 = dl_CarrierFreq_r10_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CandidateCellInfo_r10 (long physCellId_r10_,
      long dl_CarrierFreq_r10_,
      long rsrpResult_r10_,
      long rsrqResult_r10_,
      long dl_CarrierFreq_v1090_,
      long rsrqResult_v1250_,
      long rs_sinr_Result_r13_
   ) {
      super();
      physCellId_r10 = new PhysCellId (physCellId_r10_);
      dl_CarrierFreq_r10 = new ARFCN_ValueEUTRA (dl_CarrierFreq_r10_);
      rsrpResult_r10 = new RSRP_Range (rsrpResult_r10_);
      rsrqResult_r10 = new RSRQ_Range (rsrqResult_r10_);
      dl_CarrierFreq_v1090 = new ARFCN_ValueEUTRA_v9e0 (dl_CarrierFreq_v1090_);
      rsrqResult_v1250 = new RSRQ_Range_v1250 (rsrqResult_v1250_);
      rs_sinr_Result_r13 = new RS_SINR_Range_r13 (rs_sinr_Result_r13_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CandidateCellInfo_r10 (
      long physCellId_r10_,
      long dl_CarrierFreq_r10_
   ) {
      super();
      physCellId_r10 = new PhysCellId (physCellId_r10_);
      dl_CarrierFreq_r10 = new ARFCN_ValueEUTRA (dl_CarrierFreq_r10_);
   }

   public void init () {
      physCellId_r10 = null;
      dl_CarrierFreq_r10 = null;
      rsrpResult_r10 = null;
      rsrqResult_r10 = null;
      dl_CarrierFreq_v1090 = null;
      rsrqResult_v1250 = null;
      rs_sinr_Result_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId_r10;
         case 1: return dl_CarrierFreq_r10;
         case 2: return rsrpResult_r10;
         case 3: return rsrqResult_r10;
         case 4: return dl_CarrierFreq_v1090;
         case 5: return rsrqResult_v1250;
         case 6: return rs_sinr_Result_r13;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId-r10";
         case 1: return "dl-CarrierFreq-r10";
         case 2: return "rsrpResult-r10";
         case 3: return "rsrqResult-r10";
         case 4: return "dl-CarrierFreq-v1090";
         case 5: return "rsrqResult-v1250";
         case 6: return "rs-sinr-Result-r13";
         case 7: return null;
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

      boolean rsrpResult_r10Present = buffer.decodeBit ("rsrpResult_r10Present");
      boolean rsrqResult_r10Present = buffer.decodeBit ("rsrqResult_r10Present");

      // decode physCellId_r10

      buffer.getContext().eventDispatcher.startElement("physCellId_r10", -1);

      physCellId_r10 = new PhysCellId();
      physCellId_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r10", -1);

      // decode dl_CarrierFreq_r10

      buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq_r10", -1);

      dl_CarrierFreq_r10 = new ARFCN_ValueEUTRA();
      dl_CarrierFreq_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq_r10", -1);

      // decode rsrpResult_r10

      if (rsrpResult_r10Present) {
         buffer.getContext().eventDispatcher.startElement("rsrpResult_r10", -1);

         rsrpResult_r10 = new RSRP_Range();
         rsrpResult_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrpResult_r10", -1);
      }
      else {
         rsrpResult_r10 = null;
      }

      // decode rsrqResult_r10

      if (rsrqResult_r10Present) {
         buffer.getContext().eventDispatcher.startElement("rsrqResult_r10", -1);

         rsrqResult_r10 = new RSRQ_Range();
         rsrqResult_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrqResult_r10", -1);
      }
      else {
         rsrqResult_r10 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean dl_CarrierFreq_v1090Present = buffer.decodeBit ("dl_CarrierFreq_v1090Present");

            // decode dl_CarrierFreq_v1090

            if (dl_CarrierFreq_v1090Present) {
               buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq_v1090", -1);

               dl_CarrierFreq_v1090 = new ARFCN_ValueEUTRA_v9e0();
               dl_CarrierFreq_v1090.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq_v1090", -1);
            }
            else {
               dl_CarrierFreq_v1090 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean rsrqResult_v1250Present = buffer.decodeBit ("rsrqResult_v1250Present");

            // decode rsrqResult_v1250

            if (rsrqResult_v1250Present) {
               buffer.getContext().eventDispatcher.startElement("rsrqResult_v1250", -1);

               rsrqResult_v1250 = new RSRQ_Range_v1250();
               rsrqResult_v1250.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rsrqResult_v1250", -1);
            }
            else {
               rsrqResult_v1250 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean rs_sinr_Result_r13Present = buffer.decodeBit ("rs_sinr_Result_r13Present");

            // decode rs_sinr_Result_r13

            if (rs_sinr_Result_r13Present) {
               buffer.getContext().eventDispatcher.startElement("rs_sinr_Result_r13", -1);

               rs_sinr_Result_r13 = new RS_SINR_Range_r13();
               rs_sinr_Result_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rs_sinr_Result_r13", -1);
            }
            else {
               rs_sinr_Result_r13 = null;
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
      if (physCellId_r10 != null) physCellId_r10.print (_sb, "physCellId_r10", _level+1);
      if (dl_CarrierFreq_r10 != null) dl_CarrierFreq_r10.print (_sb, "dl_CarrierFreq_r10", _level+1);
      if (rsrpResult_r10 != null) rsrpResult_r10.print (_sb, "rsrpResult_r10", _level+1);
      if (rsrqResult_r10 != null) rsrqResult_r10.print (_sb, "rsrqResult_r10", _level+1);
      if (dl_CarrierFreq_v1090 != null) dl_CarrierFreq_v1090.print (_sb, "dl_CarrierFreq_v1090", _level+1);
      if (rsrqResult_v1250 != null) rsrqResult_v1250.print (_sb, "rsrqResult_v1250", _level+1);
      if (rs_sinr_Result_r13 != null) rs_sinr_Result_r13.print (_sb, "rs_sinr_Result_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
