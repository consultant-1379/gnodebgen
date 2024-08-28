/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_RLC_ModeIndication_r16_sl_Mode_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SL_AM_MODE_R16 = 1;
   public final static byte _SL_UM_MODE_R16 = 2;

   public SL_RLC_ModeIndication_r16_sl_Mode_r16 () {
      super();
   }

   public SL_RLC_ModeIndication_r16_sl_Mode_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SL_AM_MODE_R16: return "sl_AM_Mode_r16";
      case _SL_UM_MODE_R16: return "sl_UM_Mode_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_sl_AM_Mode_r16 () {
      setElement (_SL_AM_MODE_R16, Asn1Null.NULL_VALUE);
   }

   public void set_sl_UM_Mode_r16 () {
      setElement (_SL_UM_MODE_R16, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sl_AM_Mode_r16
         case 0: { 
            Asn1Null sl_AM_Mode_r16;
            element = sl_AM_Mode_r16 = Asn1Null.NULL_VALUE;
            sl_AM_Mode_r16.decode (buffer);

            buffer.invokeCharacters(sl_AM_Mode_r16.toString());
            break;
         }

         // sl_UM_Mode_r16
         case 1: { 
            Asn1Null sl_UM_Mode_r16;
            element = sl_UM_Mode_r16 = Asn1Null.NULL_VALUE;
            sl_UM_Mode_r16.decode (buffer);

            buffer.invokeCharacters(sl_UM_Mode_r16.toString());
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
