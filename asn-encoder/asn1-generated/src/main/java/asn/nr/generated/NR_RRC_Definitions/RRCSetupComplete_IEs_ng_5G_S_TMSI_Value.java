/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCSetupComplete_IEs_ng_5G_S_TMSI_Value extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _NG_5G_S_TMSI = 1;
   public final static byte _NG_5G_S_TMSI_PART2 = 2;

   public RRCSetupComplete_IEs_ng_5G_S_TMSI_Value () {
      super();
   }

   public RRCSetupComplete_IEs_ng_5G_S_TMSI_Value (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NG_5G_S_TMSI: return "ng_5G_S_TMSI";
      case _NG_5G_S_TMSI_PART2: return "ng_5G_S_TMSI_Part2";
      default: return "UNDEFINED";
      }
   }

   public void set_ng_5G_S_TMSI (NG_5G_S_TMSI value) {
      setElement (_NG_5G_S_TMSI, value);
   }

   public void set_ng_5G_S_TMSI_Part2 (Asn1BitString value) {
      setElement (_NG_5G_S_TMSI_PART2, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ng_5G_S_TMSI
         case 0: { 
            NG_5G_S_TMSI ng_5G_S_TMSI;
            element = ng_5G_S_TMSI = new NG_5G_S_TMSI();
            ng_5G_S_TMSI.decode (buffer);
            break;
         }

         // ng_5G_S_TMSI_Part2
         case 1: { 
            Asn1BitString ng_5G_S_TMSI_Part2;
            element = ng_5G_S_TMSI_Part2 = new Asn1BitString();
            ng_5G_S_TMSI_Part2.decode (buffer, 9, 9);

            buffer.invokeCharacters(ng_5G_S_TMSI_Part2.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 2, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // ng_5G_S_TMSI
         case _NG_5G_S_TMSI:
            NG_5G_S_TMSI ng_5G_S_TMSI = (NG_5G_S_TMSI) element;
            ng_5G_S_TMSI.encode (buffer);
            break;

         // ng_5G_S_TMSI_Part2
         case _NG_5G_S_TMSI_PART2:
            Asn1BitString ng_5G_S_TMSI_Part2 = (Asn1BitString) element;
            ng_5G_S_TMSI_Part2.encode (buffer, 9, 9);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
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
