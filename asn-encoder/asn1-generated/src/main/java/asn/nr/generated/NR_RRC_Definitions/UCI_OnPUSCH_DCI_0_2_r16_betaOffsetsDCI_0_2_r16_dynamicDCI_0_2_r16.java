/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _ONEBIT_R16 = 1;
   public final static byte _TWOBITS_R16 = 2;

   public UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16 () {
      super();
   }

   public UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ONEBIT_R16: return "oneBit_r16";
      case _TWOBITS_R16: return "twoBits_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_oneBit_r16 (UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_oneBit_r16 value) {
      setElement (_ONEBIT_R16, value);
   }

   public void set_twoBits_r16 (UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_twoBits_r16 value) {
      setElement (_TWOBITS_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // oneBit_r16
         case 0: { 
            UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_oneBit_r16 oneBit_r16;
            element = oneBit_r16 = new UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_oneBit_r16();
            oneBit_r16.decode (buffer);
            break;
         }

         // twoBits_r16
         case 1: { 
            UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_twoBits_r16 twoBits_r16;
            element = twoBits_r16 = new UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_twoBits_r16();
            twoBits_r16.decode (buffer);
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
         // oneBit_r16
         case _ONEBIT_R16:
            UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_oneBit_r16 oneBit_r16 = (UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_oneBit_r16) element;
            oneBit_r16.encode (buffer);
            break;

         // twoBits_r16
         case _TWOBITS_R16:
            UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_twoBits_r16 twoBits_r16 = (UCI_OnPUSCH_DCI_0_2_r16_betaOffsetsDCI_0_2_r16_dynamicDCI_0_2_r16_twoBits_r16) element;
            twoBits_r16.encode (buffer);
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
