/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InitialUE_Identity extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InitialUE-Identity";
   }

   // Choice element identifier constants
   public final static byte _NG_5G_S_TMSI_PART1 = 1;
   public final static byte _RANDOMVALUE = 2;

   public InitialUE_Identity () {
      super();
   }

   public InitialUE_Identity (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NG_5G_S_TMSI_PART1: return "ng_5G_S_TMSI_Part1";
      case _RANDOMVALUE: return "randomValue";
      default: return "UNDEFINED";
      }
   }

   public void set_ng_5G_S_TMSI_Part1 (Asn1BitString value) {
      setElement (_NG_5G_S_TMSI_PART1, value);
   }

   public void set_randomValue (Asn1BitString value) {
      setElement (_RANDOMVALUE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ng_5G_S_TMSI_Part1
         case 0: { 
            Asn1BitString ng_5G_S_TMSI_Part1;
            element = ng_5G_S_TMSI_Part1 = new Asn1BitString();
            ng_5G_S_TMSI_Part1.decode (buffer, 39, 39);

            buffer.invokeCharacters(ng_5G_S_TMSI_Part1.toString());
            break;
         }

         // randomValue
         case 1: { 
            Asn1BitString randomValue;
            element = randomValue = new Asn1BitString();
            randomValue.decode (buffer, 39, 39);

            buffer.invokeCharacters(randomValue.toString());
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
