/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandParameters";
   }

   // Choice element identifier constants
   public final static byte _EUTRA = 1;
   public final static byte _NR = 2;

   public BandParameters () {
      super();
   }

   public BandParameters (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _EUTRA: return "eutra";
      case _NR: return "nr";
      default: return "UNDEFINED";
      }
   }

   public void set_eutra (BandParameters_eutra value) {
      setElement (_EUTRA, value);
   }

   public void set_nr (BandParameters_nr value) {
      setElement (_NR, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // eutra
         case 0: { 
            BandParameters_eutra eutra;
            element = eutra = new BandParameters_eutra();
            eutra.decode (buffer);
            break;
         }

         // nr
         case 1: { 
            BandParameters_nr nr;
            element = nr = new BandParameters_nr();
            nr.decode (buffer);
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
         // eutra
         case _EUTRA:
            BandParameters_eutra eutra = (BandParameters_eutra) element;
            eutra.encode (buffer);
            break;

         // nr
         case _NR:
            BandParameters_nr nr = (BandParameters_nr) element;
            nr.encode (buffer);
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
