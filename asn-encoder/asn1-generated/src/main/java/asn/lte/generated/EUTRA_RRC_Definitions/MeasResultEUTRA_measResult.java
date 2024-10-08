/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultEUTRA_measResult extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_Range rsrpResult;  // optional
   public RSRQ_Range rsrqResult;  // optional
   public boolean mV2ExtPresent;
   public AdditionalSI_Info_r9 additionalSI_Info_r9;  // optional
   public boolean mV3ExtPresent;
   public MeasResultEUTRA_measResult_primaryPLMN_Suitable_r12 primaryPLMN_Suitable_r12 = null;  // optional
   public RSRQ_Range_v1250 measResult_v1250;  // optional
   public boolean mV4ExtPresent;
   public RS_SINR_Range_r13 rs_sinr_Result_r13;  // optional
   public MeasResultEUTRA_measResult_cgi_Info_v1310 cgi_Info_v1310;  // optional
   public boolean mV5ExtPresent;
   public RSRP_Range_v1360 measResult_v1360;  // optional
   public boolean mV6ExtPresent;
   public MeasResultEUTRA_measResult_cgi_Info_5GC_r15 cgi_Info_5GC_r15;  // optional
   public Asn1OpenExt extElem1;

   public MeasResultEUTRA_measResult () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultEUTRA_measResult (
      RSRP_Range rsrpResult_,
      RSRQ_Range rsrqResult_,
      AdditionalSI_Info_r9 additionalSI_Info_r9_,
      MeasResultEUTRA_measResult_primaryPLMN_Suitable_r12 primaryPLMN_Suitable_r12_,
      RSRQ_Range_v1250 measResult_v1250_,
      RS_SINR_Range_r13 rs_sinr_Result_r13_,
      MeasResultEUTRA_measResult_cgi_Info_v1310 cgi_Info_v1310_,
      RSRP_Range_v1360 measResult_v1360_,
      MeasResultEUTRA_measResult_cgi_Info_5GC_r15 cgi_Info_5GC_r15_
   ) {
      super();
      rsrpResult = rsrpResult_;
      rsrqResult = rsrqResult_;
      additionalSI_Info_r9 = additionalSI_Info_r9_;
      primaryPLMN_Suitable_r12 = primaryPLMN_Suitable_r12_;
      measResult_v1250 = measResult_v1250_;
      rs_sinr_Result_r13 = rs_sinr_Result_r13_;
      cgi_Info_v1310 = cgi_Info_v1310_;
      measResult_v1360 = measResult_v1360_;
      cgi_Info_5GC_r15 = cgi_Info_5GC_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultEUTRA_measResult (long rsrpResult_,
      long rsrqResult_,
      AdditionalSI_Info_r9 additionalSI_Info_r9_,
      MeasResultEUTRA_measResult_primaryPLMN_Suitable_r12 primaryPLMN_Suitable_r12_,
      long measResult_v1250_,
      long rs_sinr_Result_r13_,
      MeasResultEUTRA_measResult_cgi_Info_v1310 cgi_Info_v1310_,
      long measResult_v1360_,
      MeasResultEUTRA_measResult_cgi_Info_5GC_r15 cgi_Info_5GC_r15_
   ) {
      super();
      rsrpResult = new RSRP_Range (rsrpResult_);
      rsrqResult = new RSRQ_Range (rsrqResult_);
      additionalSI_Info_r9 = additionalSI_Info_r9_;
      primaryPLMN_Suitable_r12 = primaryPLMN_Suitable_r12_;
      measResult_v1250 = new RSRQ_Range_v1250 (measResult_v1250_);
      rs_sinr_Result_r13 = new RS_SINR_Range_r13 (rs_sinr_Result_r13_);
      cgi_Info_v1310 = cgi_Info_v1310_;
      measResult_v1360 = new RSRP_Range_v1360 (measResult_v1360_);
      cgi_Info_5GC_r15 = cgi_Info_5GC_r15_;
   }

   public void init () {
      rsrpResult = null;
      rsrqResult = null;
      additionalSI_Info_r9 = null;
      primaryPLMN_Suitable_r12 = null;
      measResult_v1250 = null;
      rs_sinr_Result_r13 = null;
      cgi_Info_v1310 = null;
      measResult_v1360 = null;
      cgi_Info_5GC_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rsrpResult;
         case 1: return rsrqResult;
         case 2: return additionalSI_Info_r9;
         case 3: return primaryPLMN_Suitable_r12;
         case 4: return measResult_v1250;
         case 5: return rs_sinr_Result_r13;
         case 6: return cgi_Info_v1310;
         case 7: return measResult_v1360;
         case 8: return cgi_Info_5GC_r15;
         case 9: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rsrpResult";
         case 1: return "rsrqResult";
         case 2: return "additionalSI-Info-r9";
         case 3: return "primaryPLMN-Suitable-r12";
         case 4: return "measResult-v1250";
         case 5: return "rs-sinr-Result-r13";
         case 6: return "cgi-Info-v1310";
         case 7: return "measResult-v1360";
         case 8: return "cgi-Info-5GC-r15";
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

      boolean rsrpResultPresent = buffer.decodeBit ("rsrpResultPresent");
      boolean rsrqResultPresent = buffer.decodeBit ("rsrqResultPresent");

      // decode rsrpResult

      if (rsrpResultPresent) {
         buffer.getContext().eventDispatcher.startElement("rsrpResult", -1);

         rsrpResult = new RSRP_Range();
         rsrpResult.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrpResult", -1);
      }
      else {
         rsrpResult = null;
      }

      // decode rsrqResult

      if (rsrqResultPresent) {
         buffer.getContext().eventDispatcher.startElement("rsrqResult", -1);

         rsrqResult = new RSRQ_Range();
         rsrqResult.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrqResult", -1);
      }
      else {
         rsrqResult = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean additionalSI_Info_r9Present = buffer.decodeBit ("additionalSI_Info_r9Present");

            // decode additionalSI_Info_r9

            if (additionalSI_Info_r9Present) {
               buffer.getContext().eventDispatcher.startElement("additionalSI_Info_r9", -1);

               additionalSI_Info_r9 = new AdditionalSI_Info_r9();
               additionalSI_Info_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("additionalSI_Info_r9", -1);
            }
            else {
               additionalSI_Info_r9 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean primaryPLMN_Suitable_r12Present = buffer.decodeBit ("primaryPLMN_Suitable_r12Present");

            boolean measResult_v1250Present = buffer.decodeBit ("measResult_v1250Present");

            // decode primaryPLMN_Suitable_r12

            if (primaryPLMN_Suitable_r12Present) {
               buffer.getContext().eventDispatcher.startElement("primaryPLMN_Suitable_r12", -1);

               int tval = MeasResultEUTRA_measResult_primaryPLMN_Suitable_r12.decodeEnumValue (buffer);
               primaryPLMN_Suitable_r12 = MeasResultEUTRA_measResult_primaryPLMN_Suitable_r12.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("primaryPLMN_Suitable_r12", -1);
            }
            else {
               primaryPLMN_Suitable_r12 = null;
            }

            // decode measResult_v1250

            if (measResult_v1250Present) {
               buffer.getContext().eventDispatcher.startElement("measResult_v1250", -1);

               measResult_v1250 = new RSRQ_Range_v1250();
               measResult_v1250.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResult_v1250", -1);
            }
            else {
               measResult_v1250 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean rs_sinr_Result_r13Present = buffer.decodeBit ("rs_sinr_Result_r13Present");

            boolean cgi_Info_v1310Present = buffer.decodeBit ("cgi_Info_v1310Present");

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

            // decode cgi_Info_v1310

            if (cgi_Info_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("cgi_Info_v1310", -1);

               cgi_Info_v1310 = new MeasResultEUTRA_measResult_cgi_Info_v1310();
               cgi_Info_v1310.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cgi_Info_v1310", -1);
            }
            else {
               cgi_Info_v1310 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean measResult_v1360Present = buffer.decodeBit ("measResult_v1360Present");

            // decode measResult_v1360

            if (measResult_v1360Present) {
               buffer.getContext().eventDispatcher.startElement("measResult_v1360", -1);

               measResult_v1360 = new RSRP_Range_v1360();
               measResult_v1360.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("measResult_v1360", -1);
            }
            else {
               measResult_v1360 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cgi_Info_5GC_r15Present = buffer.decodeBit ("cgi_Info_5GC_r15Present");

            // decode cgi_Info_5GC_r15

            if (cgi_Info_5GC_r15Present) {
               buffer.getContext().eventDispatcher.startElement("cgi_Info_5GC_r15", -1);

               cgi_Info_5GC_r15 = new MeasResultEUTRA_measResult_cgi_Info_5GC_r15();
               cgi_Info_5GC_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cgi_Info_5GC_r15", -1);
            }
            else {
               cgi_Info_5GC_r15 = null;
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
      if (rsrpResult != null) rsrpResult.print (_sb, "rsrpResult", _level+1);
      if (rsrqResult != null) rsrqResult.print (_sb, "rsrqResult", _level+1);
      if (additionalSI_Info_r9 != null) additionalSI_Info_r9.print (_sb, "additionalSI_Info_r9", _level+1);
      if (primaryPLMN_Suitable_r12 != null) primaryPLMN_Suitable_r12.print (_sb, "primaryPLMN_Suitable_r12", _level+1);
      if (measResult_v1250 != null) measResult_v1250.print (_sb, "measResult_v1250", _level+1);
      if (rs_sinr_Result_r13 != null) rs_sinr_Result_r13.print (_sb, "rs_sinr_Result_r13", _level+1);
      if (cgi_Info_v1310 != null) cgi_Info_v1310.print (_sb, "cgi_Info_v1310", _level+1);
      if (measResult_v1360 != null) measResult_v1360.print (_sb, "measResult_v1360", _level+1);
      if (cgi_Info_5GC_r15 != null) cgi_Info_5GC_r15.print (_sb, "cgi_Info_5GC_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
