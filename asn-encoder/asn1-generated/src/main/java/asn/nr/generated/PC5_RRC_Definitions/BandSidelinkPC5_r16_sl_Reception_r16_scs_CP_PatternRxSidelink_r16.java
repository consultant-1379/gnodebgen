/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _FR1_R16 = 1;
   public final static byte _FR2_R16 = 2;

   public BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16 () {
      super();
   }

   public BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _FR1_R16: return "fr1_r16";
      case _FR2_R16: return "fr2_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_fr1_r16 (BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr1_r16 value) {
      setElement (_FR1_R16, value);
   }

   public void set_fr2_r16 (BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 value) {
      setElement (_FR2_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // fr1_r16
         case 0: { 
            BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr1_r16 fr1_r16;
            element = fr1_r16 = new BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr1_r16();
            fr1_r16.decode (buffer);
            break;
         }

         // fr2_r16
         case 1: { 
            BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 fr2_r16;
            element = fr2_r16 = new BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16();
            fr2_r16.decode (buffer);
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
         // fr1_r16
         case _FR1_R16:
            BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr1_r16 fr1_r16 = (BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr1_r16) element;
            fr1_r16.encode (buffer);
            break;

         // fr2_r16
         case _FR2_R16:
            BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16 fr2_r16 = (BandSidelinkPC5_r16_sl_Reception_r16_scs_CP_PatternRxSidelink_r16_fr2_r16) element;
            fr2_r16.encode (buffer);
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
