/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _TWO_ONE = 1;
   public final static byte _TWO_TWO = 2;
   public final static byte _FOUR_ONE = 3;
   public final static byte _THREE_TWO = 4;
   public final static byte _SIX_ONE = 5;
   public final static byte _FOUR_TWO = 6;
   public final static byte _EIGHT_ONE = 7;
   public final static byte _FOUR_THREE = 8;
   public final static byte _SIX_TWO = 9;
   public final static byte _TWELVE_ONE = 10;
   public final static byte _FOUR_FOUR = 11;
   public final static byte _EIGHT_TWO = 12;
   public final static byte _SIXTEEN_ONE = 13;

   public CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction () {
      super();
   }

   public CodebookConfig_codebookType_type2_subType_typeII_n1_n2_codebookSubsetRestriction (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _TWO_ONE: return "two_one";
      case _TWO_TWO: return "two_two";
      case _FOUR_ONE: return "four_one";
      case _THREE_TWO: return "three_two";
      case _SIX_ONE: return "six_one";
      case _FOUR_TWO: return "four_two";
      case _EIGHT_ONE: return "eight_one";
      case _FOUR_THREE: return "four_three";
      case _SIX_TWO: return "six_two";
      case _TWELVE_ONE: return "twelve_one";
      case _FOUR_FOUR: return "four_four";
      case _EIGHT_TWO: return "eight_two";
      case _SIXTEEN_ONE: return "sixteen_one";
      default: return "UNDEFINED";
      }
   }

   public void set_two_one (Asn1BitString value) {
      setElement (_TWO_ONE, value);
   }

   public void set_two_two (Asn1BitString value) {
      setElement (_TWO_TWO, value);
   }

   public void set_four_one (Asn1BitString value) {
      setElement (_FOUR_ONE, value);
   }

   public void set_three_two (Asn1BitString value) {
      setElement (_THREE_TWO, value);
   }

   public void set_six_one (Asn1BitString value) {
      setElement (_SIX_ONE, value);
   }

   public void set_four_two (Asn1BitString value) {
      setElement (_FOUR_TWO, value);
   }

   public void set_eight_one (Asn1BitString value) {
      setElement (_EIGHT_ONE, value);
   }

   public void set_four_three (Asn1BitString value) {
      setElement (_FOUR_THREE, value);
   }

   public void set_six_two (Asn1BitString value) {
      setElement (_SIX_TWO, value);
   }

   public void set_twelve_one (Asn1BitString value) {
      setElement (_TWELVE_ONE, value);
   }

   public void set_four_four (Asn1BitString value) {
      setElement (_FOUR_FOUR, value);
   }

   public void set_eight_two (Asn1BitString value) {
      setElement (_EIGHT_TWO, value);
   }

   public void set_sixteen_one (Asn1BitString value) {
      setElement (_SIXTEEN_ONE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (13, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // two_one
         case 0: { 
            Asn1BitString two_one;
            element = two_one = new Asn1BitString();
            two_one.decode (buffer, 16, 16);

            buffer.invokeCharacters(two_one.toString());
            break;
         }

         // two_two
         case 1: { 
            Asn1BitString two_two;
            element = two_two = new Asn1BitString();
            two_two.decode (buffer, 43, 43);

            buffer.invokeCharacters(two_two.toString());
            break;
         }

         // four_one
         case 2: { 
            Asn1BitString four_one;
            element = four_one = new Asn1BitString();
            four_one.decode (buffer, 32, 32);

            buffer.invokeCharacters(four_one.toString());
            break;
         }

         // three_two
         case 3: { 
            Asn1BitString three_two;
            element = three_two = new Asn1BitString();
            three_two.decode (buffer, 59, 59);

            buffer.invokeCharacters(three_two.toString());
            break;
         }

         // six_one
         case 4: { 
            Asn1BitString six_one;
            element = six_one = new Asn1BitString();
            six_one.decode (buffer, 48, 48);

            buffer.invokeCharacters(six_one.toString());
            break;
         }

         // four_two
         case 5: { 
            Asn1BitString four_two;
            element = four_two = new Asn1BitString();
            four_two.decode (buffer, 75, 75);

            buffer.invokeCharacters(four_two.toString());
            break;
         }

         // eight_one
         case 6: { 
            Asn1BitString eight_one;
            element = eight_one = new Asn1BitString();
            eight_one.decode (buffer, 64, 64);

            buffer.invokeCharacters(eight_one.toString());
            break;
         }

         // four_three
         case 7: { 
            Asn1BitString four_three;
            element = four_three = new Asn1BitString();
            four_three.decode (buffer, 107, 107);

            buffer.invokeCharacters(four_three.toString());
            break;
         }

         // six_two
         case 8: { 
            Asn1BitString six_two;
            element = six_two = new Asn1BitString();
            six_two.decode (buffer, 107, 107);

            buffer.invokeCharacters(six_two.toString());
            break;
         }

         // twelve_one
         case 9: { 
            Asn1BitString twelve_one;
            element = twelve_one = new Asn1BitString();
            twelve_one.decode (buffer, 96, 96);

            buffer.invokeCharacters(twelve_one.toString());
            break;
         }

         // four_four
         case 10: { 
            Asn1BitString four_four;
            element = four_four = new Asn1BitString();
            four_four.decode (buffer, 139, 139);

            buffer.invokeCharacters(four_four.toString());
            break;
         }

         // eight_two
         case 11: { 
            Asn1BitString eight_two;
            element = eight_two = new Asn1BitString();
            eight_two.decode (buffer, 139, 139);

            buffer.invokeCharacters(eight_two.toString());
            break;
         }

         // sixteen_one
         case 12: { 
            Asn1BitString sixteen_one;
            element = sixteen_one = new Asn1BitString();
            sixteen_one.decode (buffer, 128, 128);

            buffer.invokeCharacters(sixteen_one.toString());
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
