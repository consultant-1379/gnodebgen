/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_ResourceExt_r16_interlaceAllocation_r16_interlace0 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SCS15 = 1;
   public final static byte _SCS30 = 2;

   public PUCCH_ResourceExt_r16_interlaceAllocation_r16_interlace0 () {
      super();
   }

   public PUCCH_ResourceExt_r16_interlaceAllocation_r16_interlace0 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SCS15: return "scs15";
      case _SCS30: return "scs30";
      default: return "UNDEFINED";
      }
   }

   public void set_scs15 (Asn1Integer value) {
      setElement (_SCS15, value);
   }

   public void set_scs30 (Asn1Integer value) {
      setElement (_SCS30, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // scs15
         case 0: { 
            Asn1Integer scs15;
            element = scs15 = new Asn1Integer();
            scs15.decode (buffer, 0, 9);

            buffer.invokeCharacters(scs15.toString());
            break;
         }

         // scs30
         case 1: { 
            Asn1Integer scs30;
            element = scs30 = new Asn1Integer();
            scs30.decode (buffer, 0, 4);

            buffer.invokeCharacters(scs30.toString());
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
         // scs15
         case _SCS15:
            Asn1Integer scs15 = (Asn1Integer) element;
            scs15.encode (buffer, 0, 9);
            break;

         // scs30
         case _SCS30:
            Asn1Integer scs30 = (Asn1Integer) element;
            scs30.encode (buffer, 0, 4);
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
