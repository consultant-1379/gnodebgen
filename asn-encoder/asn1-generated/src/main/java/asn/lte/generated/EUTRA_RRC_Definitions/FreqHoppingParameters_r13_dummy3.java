/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FreqHoppingParameters_r13_dummy3 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _INTERVAL_FDD_R13 = 1;
   public final static byte _INTERVAL_TDD_R13 = 2;

   public FreqHoppingParameters_r13_dummy3 () {
      super();
   }

   public FreqHoppingParameters_r13_dummy3 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _INTERVAL_FDD_R13: return "interval_FDD_r13";
      case _INTERVAL_TDD_R13: return "interval_TDD_r13";
      default: return "UNDEFINED";
      }
   }

   public void set_interval_FDD_r13 (FreqHoppingParameters_r13_dummy3_interval_FDD_r13 value) {
      setElement (_INTERVAL_FDD_R13, value);
   }

   public void set_interval_TDD_r13 (FreqHoppingParameters_r13_dummy3_interval_TDD_r13 value) {
      setElement (_INTERVAL_TDD_R13, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // interval_FDD_r13
         case 0: { 
            FreqHoppingParameters_r13_dummy3_interval_FDD_r13 interval_FDD_r13;
            int tval = FreqHoppingParameters_r13_dummy3_interval_FDD_r13.decodeEnumValue (buffer);
            element = interval_FDD_r13 = FreqHoppingParameters_r13_dummy3_interval_FDD_r13.valueOf (tval);
            break;
         }

         // interval_TDD_r13
         case 1: { 
            FreqHoppingParameters_r13_dummy3_interval_TDD_r13 interval_TDD_r13;
            int tval = FreqHoppingParameters_r13_dummy3_interval_TDD_r13.decodeEnumValue (buffer);
            element = interval_TDD_r13 = FreqHoppingParameters_r13_dummy3_interval_TDD_r13.valueOf (tval);
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
