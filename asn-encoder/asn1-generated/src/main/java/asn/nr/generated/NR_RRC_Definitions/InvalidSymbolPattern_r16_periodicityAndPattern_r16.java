/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InvalidSymbolPattern_r16_periodicityAndPattern_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _N2 = 1;
   public final static byte _N4 = 2;
   public final static byte _N5 = 3;
   public final static byte _N8 = 4;
   public final static byte _N10 = 5;
   public final static byte _N20 = 6;
   public final static byte _N40 = 7;

   public InvalidSymbolPattern_r16_periodicityAndPattern_r16 () {
      super();
   }

   public InvalidSymbolPattern_r16_periodicityAndPattern_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _N2: return "n2";
      case _N4: return "n4";
      case _N5: return "n5";
      case _N8: return "n8";
      case _N10: return "n10";
      case _N20: return "n20";
      case _N40: return "n40";
      default: return "UNDEFINED";
      }
   }

   public void set_n2 (Asn1BitString value) {
      setElement (_N2, value);
   }

   public void set_n4 (Asn1BitString value) {
      setElement (_N4, value);
   }

   public void set_n5 (Asn1BitString value) {
      setElement (_N5, value);
   }

   public void set_n8 (Asn1BitString value) {
      setElement (_N8, value);
   }

   public void set_n10 (Asn1BitString value) {
      setElement (_N10, value);
   }

   public void set_n20 (Asn1BitString value) {
      setElement (_N20, value);
   }

   public void set_n40 (Asn1BitString value) {
      setElement (_N40, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (7, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // n2
         case 0: { 
            Asn1BitString n2;
            element = n2 = new Asn1BitString();
            n2.decode (buffer, 2, 2);

            buffer.invokeCharacters(n2.toString());
            break;
         }

         // n4
         case 1: { 
            Asn1BitString n4;
            element = n4 = new Asn1BitString();
            n4.decode (buffer, 4, 4);

            buffer.invokeCharacters(n4.toString());
            break;
         }

         // n5
         case 2: { 
            Asn1BitString n5;
            element = n5 = new Asn1BitString();
            n5.decode (buffer, 5, 5);

            buffer.invokeCharacters(n5.toString());
            break;
         }

         // n8
         case 3: { 
            Asn1BitString n8;
            element = n8 = new Asn1BitString();
            n8.decode (buffer, 8, 8);

            buffer.invokeCharacters(n8.toString());
            break;
         }

         // n10
         case 4: { 
            Asn1BitString n10;
            element = n10 = new Asn1BitString();
            n10.decode (buffer, 10, 10);

            buffer.invokeCharacters(n10.toString());
            break;
         }

         // n20
         case 5: { 
            Asn1BitString n20;
            element = n20 = new Asn1BitString();
            n20.decode (buffer, 20, 20);

            buffer.invokeCharacters(n20.toString());
            break;
         }

         // n40
         case 6: { 
            Asn1BitString n40;
            element = n40 = new Asn1BitString();
            n40.decode (buffer, 40, 40);

            buffer.invokeCharacters(n40.toString());
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

      buffer.encodeConsWholeNumber (choiceID - 1, 7, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // n2
         case _N2:
            Asn1BitString n2 = (Asn1BitString) element;
            n2.encode (buffer, 2, 2);
            break;

         // n4
         case _N4:
            Asn1BitString n4 = (Asn1BitString) element;
            n4.encode (buffer, 4, 4);
            break;

         // n5
         case _N5:
            Asn1BitString n5 = (Asn1BitString) element;
            n5.encode (buffer, 5, 5);
            break;

         // n8
         case _N8:
            Asn1BitString n8 = (Asn1BitString) element;
            n8.encode (buffer, 8, 8);
            break;

         // n10
         case _N10:
            Asn1BitString n10 = (Asn1BitString) element;
            n10.encode (buffer, 10, 10);
            break;

         // n20
         case _N20:
            Asn1BitString n20 = (Asn1BitString) element;
            n20.encode (buffer, 20, 20);
            break;

         // n40
         case _N40:
            Asn1BitString n40 = (Asn1BitString) element;
            n40.encode (buffer, 40, 40);
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
