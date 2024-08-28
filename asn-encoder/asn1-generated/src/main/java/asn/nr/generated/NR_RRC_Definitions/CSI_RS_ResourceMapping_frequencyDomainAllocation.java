/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_ResourceMapping_frequencyDomainAllocation extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _ROW1 = 1;
   public final static byte _ROW2 = 2;
   public final static byte _ROW4 = 3;
   public final static byte _OTHER = 4;

   public CSI_RS_ResourceMapping_frequencyDomainAllocation () {
      super();
   }

   public CSI_RS_ResourceMapping_frequencyDomainAllocation (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ROW1: return "row1";
      case _ROW2: return "row2";
      case _ROW4: return "row4";
      case _OTHER: return "other";
      default: return "UNDEFINED";
      }
   }

   public void set_row1 (Asn1BitString value) {
      setElement (_ROW1, value);
   }

   public void set_row2 (Asn1BitString value) {
      setElement (_ROW2, value);
   }

   public void set_row4 (Asn1BitString value) {
      setElement (_ROW4, value);
   }

   public void set_other (Asn1BitString value) {
      setElement (_OTHER, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // row1
         case 0: { 
            Asn1BitString row1;
            element = row1 = new Asn1BitString();
            row1.decode (buffer, 4, 4);

            buffer.invokeCharacters(row1.toString());
            break;
         }

         // row2
         case 1: { 
            Asn1BitString row2;
            element = row2 = new Asn1BitString();
            row2.decode (buffer, 12, 12);

            buffer.invokeCharacters(row2.toString());
            break;
         }

         // row4
         case 2: { 
            Asn1BitString row4;
            element = row4 = new Asn1BitString();
            row4.decode (buffer, 3, 3);

            buffer.invokeCharacters(row4.toString());
            break;
         }

         // other
         case 3: { 
            Asn1BitString other;
            element = other = new Asn1BitString();
            other.decode (buffer, 6, 6);

            buffer.invokeCharacters(other.toString());
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

      buffer.encodeConsWholeNumber (choiceID - 1, 4, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // row1
         case _ROW1:
            Asn1BitString row1 = (Asn1BitString) element;
            row1.encode (buffer, 4, 4);
            break;

         // row2
         case _ROW2:
            Asn1BitString row2 = (Asn1BitString) element;
            row2.encode (buffer, 12, 12);
            break;

         // row4
         case _ROW4:
            Asn1BitString row4 = (Asn1BitString) element;
            row4.encode (buffer, 3, 3);
            break;

         // other
         case _OTHER:
            Asn1BitString other = (Asn1BitString) element;
            other.encode (buffer, 6, 6);
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
