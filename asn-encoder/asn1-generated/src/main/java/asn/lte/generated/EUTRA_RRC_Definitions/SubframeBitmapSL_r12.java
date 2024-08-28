/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SubframeBitmapSL_r12 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SubframeBitmapSL-r12";
   }

   // Choice element identifier constants
   public final static byte _BS4_R12 = 1;
   public final static byte _BS8_R12 = 2;
   public final static byte _BS12_R12 = 3;
   public final static byte _BS16_R12 = 4;
   public final static byte _BS30_R12 = 5;
   public final static byte _BS40_R12 = 6;
   public final static byte _BS42_R12 = 7;

   public SubframeBitmapSL_r12 () {
      super();
   }

   public SubframeBitmapSL_r12 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _BS4_R12: return "bs4_r12";
      case _BS8_R12: return "bs8_r12";
      case _BS12_R12: return "bs12_r12";
      case _BS16_R12: return "bs16_r12";
      case _BS30_R12: return "bs30_r12";
      case _BS40_R12: return "bs40_r12";
      case _BS42_R12: return "bs42_r12";
      default: return "UNDEFINED";
      }
   }

   public void set_bs4_r12 (Asn1BitString value) {
      setElement (_BS4_R12, value);
   }

   public void set_bs8_r12 (Asn1BitString value) {
      setElement (_BS8_R12, value);
   }

   public void set_bs12_r12 (Asn1BitString value) {
      setElement (_BS12_R12, value);
   }

   public void set_bs16_r12 (Asn1BitString value) {
      setElement (_BS16_R12, value);
   }

   public void set_bs30_r12 (Asn1BitString value) {
      setElement (_BS30_R12, value);
   }

   public void set_bs40_r12 (Asn1BitString value) {
      setElement (_BS40_R12, value);
   }

   public void set_bs42_r12 (Asn1BitString value) {
      setElement (_BS42_R12, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (7, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // bs4_r12
         case 0: { 
            Asn1BitString bs4_r12;
            element = bs4_r12 = new Asn1BitString();
            bs4_r12.decode (buffer, 4, 4);

            buffer.invokeCharacters(bs4_r12.toString());
            break;
         }

         // bs8_r12
         case 1: { 
            Asn1BitString bs8_r12;
            element = bs8_r12 = new Asn1BitString();
            bs8_r12.decode (buffer, 8, 8);

            buffer.invokeCharacters(bs8_r12.toString());
            break;
         }

         // bs12_r12
         case 2: { 
            Asn1BitString bs12_r12;
            element = bs12_r12 = new Asn1BitString();
            bs12_r12.decode (buffer, 12, 12);

            buffer.invokeCharacters(bs12_r12.toString());
            break;
         }

         // bs16_r12
         case 3: { 
            Asn1BitString bs16_r12;
            element = bs16_r12 = new Asn1BitString();
            bs16_r12.decode (buffer, 16, 16);

            buffer.invokeCharacters(bs16_r12.toString());
            break;
         }

         // bs30_r12
         case 4: { 
            Asn1BitString bs30_r12;
            element = bs30_r12 = new Asn1BitString();
            bs30_r12.decode (buffer, 30, 30);

            buffer.invokeCharacters(bs30_r12.toString());
            break;
         }

         // bs40_r12
         case 5: { 
            Asn1BitString bs40_r12;
            element = bs40_r12 = new Asn1BitString();
            bs40_r12.decode (buffer, 40, 40);

            buffer.invokeCharacters(bs40_r12.toString());
            break;
         }

         // bs42_r12
         case 6: { 
            Asn1BitString bs42_r12;
            element = bs42_r12 = new Asn1BitString();
            bs42_r12.decode (buffer, 42, 42);

            buffer.invokeCharacters(bs42_r12.toString());
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
