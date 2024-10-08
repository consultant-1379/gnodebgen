/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigInterRAT_triggerType_event_eventId_eventB1_b1_Threshold extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _B1_THRESHOLDUTRA = 1;
   public final static byte _B1_THRESHOLDGERAN = 2;
   public final static byte _B1_THRESHOLDCDMA2000 = 3;

   public ReportConfigInterRAT_triggerType_event_eventId_eventB1_b1_Threshold () {
      super();
   }

   public ReportConfigInterRAT_triggerType_event_eventId_eventB1_b1_Threshold (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _B1_THRESHOLDUTRA: return "b1_ThresholdUTRA";
      case _B1_THRESHOLDGERAN: return "b1_ThresholdGERAN";
      case _B1_THRESHOLDCDMA2000: return "b1_ThresholdCDMA2000";
      default: return "UNDEFINED";
      }
   }

   public void set_b1_ThresholdUTRA (ThresholdUTRA value) {
      setElement (_B1_THRESHOLDUTRA, value);
   }

   public void set_b1_ThresholdGERAN (ThresholdGERAN value) {
      setElement (_B1_THRESHOLDGERAN, value);
   }

   public void set_b1_ThresholdCDMA2000 (ThresholdCDMA2000 value) {
      setElement (_B1_THRESHOLDCDMA2000, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // b1_ThresholdUTRA
         case 0: { 
            ThresholdUTRA b1_ThresholdUTRA;
            element = b1_ThresholdUTRA = new ThresholdUTRA();
            b1_ThresholdUTRA.decode (buffer);
            break;
         }

         // b1_ThresholdGERAN
         case 1: { 
            ThresholdGERAN b1_ThresholdGERAN;
            element = b1_ThresholdGERAN = new ThresholdGERAN();
            b1_ThresholdGERAN.decode (buffer);
            break;
         }

         // b1_ThresholdCDMA2000
         case 2: { 
            ThresholdCDMA2000 b1_ThresholdCDMA2000;
            element = b1_ThresholdCDMA2000 = new ThresholdCDMA2000();
            b1_ThresholdCDMA2000.decode (buffer);
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
