/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_ResourceReservePeriod_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-ResourceReservePeriod-r16";
   }

   // Choice element identifier constants
   public final static byte _SL_RESOURCERESERVEPERIOD1_R16 = 1;
   public final static byte _SL_RESOURCERESERVEPERIOD2_R16 = 2;

   public SL_ResourceReservePeriod_r16 () {
      super();
   }

   public SL_ResourceReservePeriod_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SL_RESOURCERESERVEPERIOD1_R16: return "sl_ResourceReservePeriod1_r16";
      case _SL_RESOURCERESERVEPERIOD2_R16: return "sl_ResourceReservePeriod2_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_sl_ResourceReservePeriod1_r16 (SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16 value) {
      setElement (_SL_RESOURCERESERVEPERIOD1_R16, value);
   }

   public void set_sl_ResourceReservePeriod2_r16 (Asn1Integer value) {
      setElement (_SL_RESOURCERESERVEPERIOD2_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sl_ResourceReservePeriod1_r16
         case 0: { 
            SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16 sl_ResourceReservePeriod1_r16;
            int tval = SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16.decodeEnumValue (buffer);
            element = sl_ResourceReservePeriod1_r16 = SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16.valueOf (tval);
            break;
         }

         // sl_ResourceReservePeriod2_r16
         case 1: { 
            Asn1Integer sl_ResourceReservePeriod2_r16;
            element = sl_ResourceReservePeriod2_r16 = new Asn1Integer();
            sl_ResourceReservePeriod2_r16.decode (buffer, 1, 99);

            buffer.invokeCharacters(sl_ResourceReservePeriod2_r16.toString());
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
         // sl_ResourceReservePeriod1_r16
         case _SL_RESOURCERESERVEPERIOD1_R16:
            SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16 sl_ResourceReservePeriod1_r16 = (SL_ResourceReservePeriod_r16_sl_ResourceReservePeriod1_r16) element;
            sl_ResourceReservePeriod1_r16.encode (buffer);
            break;

         // sl_ResourceReservePeriod2_r16
         case _SL_RESOURCERESERVEPERIOD2_R16:
            Asn1Integer sl_ResourceReservePeriod2_r16 = (Asn1Integer) element;
            sl_ResourceReservePeriod2_r16.encode (buffer, 1, 99);
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
