/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigInterRAT_triggerType_event_eventId_eventB2_b2_Threshold2 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _B2_THRESHOLD2UTRA = 1;
   public final static byte _B2_THRESHOLD2GERAN = 2;
   public final static byte _B2_THRESHOLD2CDMA2000 = 3;

   public ReportConfigInterRAT_triggerType_event_eventId_eventB2_b2_Threshold2 () {
      super();
   }

   public ReportConfigInterRAT_triggerType_event_eventId_eventB2_b2_Threshold2 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _B2_THRESHOLD2UTRA: return "b2_Threshold2UTRA";
      case _B2_THRESHOLD2GERAN: return "b2_Threshold2GERAN";
      case _B2_THRESHOLD2CDMA2000: return "b2_Threshold2CDMA2000";
      default: return "UNDEFINED";
      }
   }

   public void set_b2_Threshold2UTRA (ThresholdUTRA value) {
      setElement (_B2_THRESHOLD2UTRA, value);
   }

   public void set_b2_Threshold2GERAN (ThresholdGERAN value) {
      setElement (_B2_THRESHOLD2GERAN, value);
   }

   public void set_b2_Threshold2CDMA2000 (ThresholdCDMA2000 value) {
      setElement (_B2_THRESHOLD2CDMA2000, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // b2_Threshold2UTRA
         case 0: { 
            ThresholdUTRA b2_Threshold2UTRA;
            element = b2_Threshold2UTRA = new ThresholdUTRA();
            b2_Threshold2UTRA.decode (buffer);
            break;
         }

         // b2_Threshold2GERAN
         case 1: { 
            ThresholdGERAN b2_Threshold2GERAN;
            element = b2_Threshold2GERAN = new ThresholdGERAN();
            b2_Threshold2GERAN.decode (buffer);
            break;
         }

         // b2_Threshold2CDMA2000
         case 2: { 
            ThresholdCDMA2000 b2_Threshold2CDMA2000;
            element = b2_Threshold2CDMA2000 = new ThresholdCDMA2000();
            b2_Threshold2CDMA2000.decode (buffer);
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
