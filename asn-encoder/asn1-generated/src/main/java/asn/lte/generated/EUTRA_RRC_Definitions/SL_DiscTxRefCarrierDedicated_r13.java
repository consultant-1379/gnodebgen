/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscTxRefCarrierDedicated_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-DiscTxRefCarrierDedicated-r13";
   }

   // Choice element identifier constants
   public final static byte _PCELL = 1;
   public final static byte _SCELL = 2;

   public SL_DiscTxRefCarrierDedicated_r13 () {
      super();
   }

   public SL_DiscTxRefCarrierDedicated_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PCELL: return "pCell";
      case _SCELL: return "sCell";
      default: return "UNDEFINED";
      }
   }

   public void set_pCell () {
      setElement (_PCELL, Asn1Null.NULL_VALUE);
   }

   public void set_sCell (SCellIndex_r10 value) {
      setElement (_SCELL, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // pCell
         case 0: { 
            Asn1Null pCell;
            element = pCell = Asn1Null.NULL_VALUE;
            pCell.decode (buffer);

            buffer.invokeCharacters(pCell.toString());
            break;
         }

         // sCell
         case 1: { 
            SCellIndex_r10 sCell;
            element = sCell = new SCellIndex_r10();
            sCell.decode (buffer);
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
