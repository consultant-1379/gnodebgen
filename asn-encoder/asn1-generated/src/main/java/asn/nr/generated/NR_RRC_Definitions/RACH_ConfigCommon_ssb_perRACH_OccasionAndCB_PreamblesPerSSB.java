/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _ONEEIGHTH = 1;
   public final static byte _ONEFOURTH = 2;
   public final static byte _ONEHALF = 3;
   public final static byte _ONE = 4;
   public final static byte _TWO = 5;
   public final static byte _FOUR = 6;
   public final static byte _EIGHT = 7;
   public final static byte _SIXTEEN = 8;

   public RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB () {
      super();
   }

   public RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ONEEIGHTH: return "oneEighth";
      case _ONEFOURTH: return "oneFourth";
      case _ONEHALF: return "oneHalf";
      case _ONE: return "one";
      case _TWO: return "two";
      case _FOUR: return "four";
      case _EIGHT: return "eight";
      case _SIXTEEN: return "sixteen";
      default: return "UNDEFINED";
      }
   }

   public void set_oneEighth (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth value) {
      setElement (_ONEEIGHTH, value);
   }

   public void set_oneFourth (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth value) {
      setElement (_ONEFOURTH, value);
   }

   public void set_oneHalf (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf value) {
      setElement (_ONEHALF, value);
   }

   public void set_one (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one value) {
      setElement (_ONE, value);
   }

   public void set_two (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two value) {
      setElement (_TWO, value);
   }

   public void set_four (Asn1Integer value) {
      setElement (_FOUR, value);
   }

   public void set_eight (Asn1Integer value) {
      setElement (_EIGHT, value);
   }

   public void set_sixteen (Asn1Integer value) {
      setElement (_SIXTEEN, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (8, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // oneEighth
         case 0: { 
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth oneEighth;
            int tval = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth.decodeEnumValue (buffer);
            element = oneEighth = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth.valueOf (tval);
            break;
         }

         // oneFourth
         case 1: { 
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth oneFourth;
            int tval = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth.decodeEnumValue (buffer);
            element = oneFourth = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth.valueOf (tval);
            break;
         }

         // oneHalf
         case 2: { 
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf oneHalf;
            int tval = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf.decodeEnumValue (buffer);
            element = oneHalf = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf.valueOf (tval);
            break;
         }

         // one
         case 3: { 
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one one;
            int tval = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one.decodeEnumValue (buffer);
            element = one = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one.valueOf (tval);
            break;
         }

         // two
         case 4: { 
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two two;
            int tval = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two.decodeEnumValue (buffer);
            element = two = RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two.valueOf (tval);
            break;
         }

         // four
         case 5: { 
            Asn1Integer four;
            element = four = new Asn1Integer();
            four.decode (buffer, 1, 16);

            buffer.invokeCharacters(four.toString());
            break;
         }

         // eight
         case 6: { 
            Asn1Integer eight;
            element = eight = new Asn1Integer();
            eight.decode (buffer, 1, 8);

            buffer.invokeCharacters(eight.toString());
            break;
         }

         // sixteen
         case 7: { 
            Asn1Integer sixteen;
            element = sixteen = new Asn1Integer();
            sixteen.decode (buffer, 1, 4);

            buffer.invokeCharacters(sixteen.toString());
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

      buffer.encodeConsWholeNumber (choiceID - 1, 8, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // oneEighth
         case _ONEEIGHTH:
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth oneEighth = (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth) element;
            oneEighth.encode (buffer);
            break;

         // oneFourth
         case _ONEFOURTH:
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth oneFourth = (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneFourth) element;
            oneFourth.encode (buffer);
            break;

         // oneHalf
         case _ONEHALF:
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf oneHalf = (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneHalf) element;
            oneHalf.encode (buffer);
            break;

         // one
         case _ONE:
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one one = (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_one) element;
            one.encode (buffer);
            break;

         // two
         case _TWO:
            RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two two = (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two) element;
            two.encode (buffer);
            break;

         // four
         case _FOUR:
            Asn1Integer four = (Asn1Integer) element;
            four.encode (buffer, 1, 16);
            break;

         // eight
         case _EIGHT:
            Asn1Integer eight = (Asn1Integer) element;
            eight.encode (buffer, 1, 8);
            break;

         // sixteen
         case _SIXTEEN:
            Asn1Integer sixteen = (Asn1Integer) element;
            sixteen.encode (buffer, 1, 4);
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
