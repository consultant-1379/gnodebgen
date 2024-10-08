/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ServingCellConfig_ca_SlotOffset_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _REFSCS15KHZ = 1;
   public final static byte _REFSCS30KHZ = 2;
   public final static byte _REFSCS60KHZ = 3;
   public final static byte _REFSCS120KHZ = 4;

   public ServingCellConfig_ca_SlotOffset_r16 () {
      super();
   }

   public ServingCellConfig_ca_SlotOffset_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _REFSCS15KHZ: return "refSCS15kHz";
      case _REFSCS30KHZ: return "refSCS30KHz";
      case _REFSCS60KHZ: return "refSCS60KHz";
      case _REFSCS120KHZ: return "refSCS120KHz";
      default: return "UNDEFINED";
      }
   }

   public void set_refSCS15kHz (Asn1Integer value) {
      setElement (_REFSCS15KHZ, value);
   }

   public void set_refSCS30KHz (Asn1Integer value) {
      setElement (_REFSCS30KHZ, value);
   }

   public void set_refSCS60KHz (Asn1Integer value) {
      setElement (_REFSCS60KHZ, value);
   }

   public void set_refSCS120KHz (Asn1Integer value) {
      setElement (_REFSCS120KHZ, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // refSCS15kHz
         case 0: { 
            Asn1Integer refSCS15kHz;
            element = refSCS15kHz = new Asn1Integer();
            refSCS15kHz.decode (buffer, -2, 2);

            buffer.invokeCharacters(refSCS15kHz.toString());
            break;
         }

         // refSCS30KHz
         case 1: { 
            Asn1Integer refSCS30KHz;
            element = refSCS30KHz = new Asn1Integer();
            refSCS30KHz.decode (buffer, -5, 5);

            buffer.invokeCharacters(refSCS30KHz.toString());
            break;
         }

         // refSCS60KHz
         case 2: { 
            Asn1Integer refSCS60KHz;
            element = refSCS60KHz = new Asn1Integer();
            refSCS60KHz.decode (buffer, -10, 10);

            buffer.invokeCharacters(refSCS60KHz.toString());
            break;
         }

         // refSCS120KHz
         case 3: { 
            Asn1Integer refSCS120KHz;
            element = refSCS120KHz = new Asn1Integer();
            refSCS120KHz.decode (buffer, -20, 20);

            buffer.invokeCharacters(refSCS120KHz.toString());
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
