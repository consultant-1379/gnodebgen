/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RedirectedCarrierInfo_r15_IEs extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RedirectedCarrierInfo-r15-IEs";
   }

   // Choice element identifier constants
   public final static byte _EUTRA_R15 = 1;
   public final static byte _GERAN_R15 = 2;
   public final static byte _UTRA_FDD_R15 = 3;
   public final static byte _CDMA2000_HRPD_R15 = 4;
   public final static byte _CDMA2000_1XRTT_R15 = 5;
   public final static byte _UTRA_TDD_R15 = 6;

   public RedirectedCarrierInfo_r15_IEs () {
      super();
   }

   public RedirectedCarrierInfo_r15_IEs (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _EUTRA_R15: return "eutra_r15";
      case _GERAN_R15: return "geran_r15";
      case _UTRA_FDD_R15: return "utra_FDD_r15";
      case _CDMA2000_HRPD_R15: return "cdma2000_HRPD_r15";
      case _CDMA2000_1XRTT_R15: return "cdma2000_1xRTT_r15";
      case _UTRA_TDD_R15: return "utra_TDD_r15";
      default: return "UNDEFINED";
      }
   }

   public void set_eutra_r15 (ARFCN_ValueEUTRA_r9 value) {
      setElement (_EUTRA_R15, value);
   }

   public void set_geran_r15 (CarrierFreqsGERAN value) {
      setElement (_GERAN_R15, value);
   }

   public void set_utra_FDD_r15 (ARFCN_ValueUTRA value) {
      setElement (_UTRA_FDD_R15, value);
   }

   public void set_cdma2000_HRPD_r15 (CarrierFreqCDMA2000 value) {
      setElement (_CDMA2000_HRPD_R15, value);
   }

   public void set_cdma2000_1xRTT_r15 (CarrierFreqCDMA2000 value) {
      setElement (_CDMA2000_1XRTT_R15, value);
   }

   public void set_utra_TDD_r15 (CarrierFreqListUTRA_TDD_r10 value) {
      setElement (_UTRA_TDD_R15, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (6, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // eutra_r15
         case 0: { 
            ARFCN_ValueEUTRA_r9 eutra_r15;
            element = eutra_r15 = new ARFCN_ValueEUTRA_r9();
            eutra_r15.decode (buffer);
            break;
         }

         // geran_r15
         case 1: { 
            CarrierFreqsGERAN geran_r15;
            element = geran_r15 = new CarrierFreqsGERAN();
            geran_r15.decode (buffer);
            break;
         }

         // utra_FDD_r15
         case 2: { 
            ARFCN_ValueUTRA utra_FDD_r15;
            element = utra_FDD_r15 = new ARFCN_ValueUTRA();
            utra_FDD_r15.decode (buffer);
            break;
         }

         // cdma2000_HRPD_r15
         case 3: { 
            CarrierFreqCDMA2000 cdma2000_HRPD_r15;
            element = cdma2000_HRPD_r15 = new CarrierFreqCDMA2000();
            cdma2000_HRPD_r15.decode (buffer);
            break;
         }

         // cdma2000_1xRTT_r15
         case 4: { 
            CarrierFreqCDMA2000 cdma2000_1xRTT_r15;
            element = cdma2000_1xRTT_r15 = new CarrierFreqCDMA2000();
            cdma2000_1xRTT_r15.decode (buffer);
            break;
         }

         // utra_TDD_r15
         case 5: { 
            CarrierFreqListUTRA_TDD_r10 utra_TDD_r15;
            element = utra_TDD_r15 = new CarrierFreqListUTRA_TDD_r10();
            utra_TDD_r15.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
