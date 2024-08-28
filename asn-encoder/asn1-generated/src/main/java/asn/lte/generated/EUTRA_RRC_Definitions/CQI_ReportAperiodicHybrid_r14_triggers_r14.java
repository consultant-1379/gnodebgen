/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportAperiodicHybrid_r14_triggers_r14 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _ONEBIT_R14 = 1;
   public final static byte _TWOBIT_R14 = 2;
   public final static byte _THREEBIT_R14 = 3;

   public CQI_ReportAperiodicHybrid_r14_triggers_r14 () {
      super();
   }

   public CQI_ReportAperiodicHybrid_r14_triggers_r14 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ONEBIT_R14: return "oneBit_r14";
      case _TWOBIT_R14: return "twoBit_r14";
      case _THREEBIT_R14: return "threeBit_r14";
      default: return "UNDEFINED";
      }
   }

   public void set_oneBit_r14 (CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14 value) {
      setElement (_ONEBIT_R14, value);
   }

   public void set_twoBit_r14 (CQI_ReportAperiodicHybrid_r14_triggers_r14_twoBit_r14 value) {
      setElement (_TWOBIT_R14, value);
   }

   public void set_threeBit_r14 (CQI_ReportAperiodicHybrid_r14_triggers_r14_threeBit_r14 value) {
      setElement (_THREEBIT_R14, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // oneBit_r14
         case 0: { 
            CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14 oneBit_r14;
            element = oneBit_r14 = new CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14();
            oneBit_r14.decode (buffer);
            break;
         }

         // twoBit_r14
         case 1: { 
            CQI_ReportAperiodicHybrid_r14_triggers_r14_twoBit_r14 twoBit_r14;
            element = twoBit_r14 = new CQI_ReportAperiodicHybrid_r14_triggers_r14_twoBit_r14();
            twoBit_r14.decode (buffer);
            break;
         }

         // threeBit_r14
         case 2: { 
            CQI_ReportAperiodicHybrid_r14_triggers_r14_threeBit_r14 threeBit_r14;
            element = threeBit_r14 = new CQI_ReportAperiodicHybrid_r14_triggers_r14_threeBit_r14();
            threeBit_r14.decode (buffer);
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
