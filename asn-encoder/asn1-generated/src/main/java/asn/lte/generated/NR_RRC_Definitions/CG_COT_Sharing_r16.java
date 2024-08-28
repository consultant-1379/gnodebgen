/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CG_COT_Sharing_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-COT-Sharing-r16";
   }

   // Choice element identifier constants
   public final static byte _NOCOT_SHARING_R16 = 1;
   public final static byte _COT_SHARING_R16 = 2;

   public CG_COT_Sharing_r16 () {
      super();
   }

   public CG_COT_Sharing_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NOCOT_SHARING_R16: return "noCOT_Sharing_r16";
      case _COT_SHARING_R16: return "cot_Sharing_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_noCOT_Sharing_r16 () {
      setElement (_NOCOT_SHARING_R16, Asn1Null.NULL_VALUE);
   }

   public void set_cot_Sharing_r16 (CG_COT_Sharing_r16_cot_Sharing_r16 value) {
      setElement (_COT_SHARING_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // noCOT_Sharing_r16
         case 0: { 
            Asn1Null noCOT_Sharing_r16;
            element = noCOT_Sharing_r16 = Asn1Null.NULL_VALUE;
            noCOT_Sharing_r16.decode (buffer);

            buffer.invokeCharacters(noCOT_Sharing_r16.toString());
            break;
         }

         // cot_Sharing_r16
         case 1: { 
            CG_COT_Sharing_r16_cot_Sharing_r16 cot_Sharing_r16;
            element = cot_Sharing_r16 = new CG_COT_Sharing_r16_cot_Sharing_r16();
            cot_Sharing_r16.decode (buffer);
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
