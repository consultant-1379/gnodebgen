/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PMCH_Config_r12_dataMCS_r12 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _NORMAL_R12 = 1;
   public final static byte _HIGERORDER_R12 = 2;

   public PMCH_Config_r12_dataMCS_r12 () {
      super();
   }

   public PMCH_Config_r12_dataMCS_r12 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NORMAL_R12: return "normal_r12";
      case _HIGERORDER_R12: return "higerOrder_r12";
      default: return "UNDEFINED";
      }
   }

   public void set_normal_r12 (Asn1Integer value) {
      setElement (_NORMAL_R12, value);
   }

   public void set_higerOrder_r12 (Asn1Integer value) {
      setElement (_HIGERORDER_R12, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // normal_r12
         case 0: { 
            Asn1Integer normal_r12;
            element = normal_r12 = new Asn1Integer();
            normal_r12.decode (buffer, 0, 28);

            buffer.invokeCharacters(normal_r12.toString());
            break;
         }

         // higerOrder_r12
         case 1: { 
            Asn1Integer higerOrder_r12;
            element = higerOrder_r12 = new Asn1Integer();
            higerOrder_r12.decode (buffer, 0, 27);

            buffer.invokeCharacters(higerOrder_r12.toString());
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
