/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigGeneric_preambleTransMax extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N3 = 0;
   public static final int _N4 = 1;
   public static final int _N5 = 2;
   public static final int _N6 = 3;
   public static final int _N7 = 4;
   public static final int _N8 = 5;
   public static final int _N10 = 6;
   public static final int _N20 = 7;
   public static final int _N50 = 8;
   public static final int _N100 = 9;
   public static final int _N200 = 10;

   // Singleton instances of RACH_ConfigGeneric_preambleTransMax
   protected static final RACH_ConfigGeneric_preambleTransMax _n3 = new RACH_ConfigGeneric_preambleTransMax(0);
   protected static final RACH_ConfigGeneric_preambleTransMax _n4 = new RACH_ConfigGeneric_preambleTransMax(1);
   protected static final RACH_ConfigGeneric_preambleTransMax _n5 = new RACH_ConfigGeneric_preambleTransMax(2);
   protected static final RACH_ConfigGeneric_preambleTransMax _n6 = new RACH_ConfigGeneric_preambleTransMax(3);
   protected static final RACH_ConfigGeneric_preambleTransMax _n7 = new RACH_ConfigGeneric_preambleTransMax(4);
   protected static final RACH_ConfigGeneric_preambleTransMax _n8 = new RACH_ConfigGeneric_preambleTransMax(5);
   protected static final RACH_ConfigGeneric_preambleTransMax _n10 = new RACH_ConfigGeneric_preambleTransMax(6);
   protected static final RACH_ConfigGeneric_preambleTransMax _n20 = new RACH_ConfigGeneric_preambleTransMax(7);
   protected static final RACH_ConfigGeneric_preambleTransMax _n50 = new RACH_ConfigGeneric_preambleTransMax(8);
   protected static final RACH_ConfigGeneric_preambleTransMax _n100 = new RACH_ConfigGeneric_preambleTransMax(9);
   protected static final RACH_ConfigGeneric_preambleTransMax _n200 = new RACH_ConfigGeneric_preambleTransMax(10);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    *   8
    *   9
    *   10
    */
   protected RACH_ConfigGeneric_preambleTransMax (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n3.
    */
   public static RACH_ConfigGeneric_preambleTransMax n3() {
      return _n3;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static RACH_ConfigGeneric_preambleTransMax n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n5.
    */
   public static RACH_ConfigGeneric_preambleTransMax n5() {
      return _n5;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static RACH_ConfigGeneric_preambleTransMax n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n7.
    */
   public static RACH_ConfigGeneric_preambleTransMax n7() {
      return _n7;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static RACH_ConfigGeneric_preambleTransMax n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n10.
    */
   public static RACH_ConfigGeneric_preambleTransMax n10() {
      return _n10;
   }

   /**
    * Singleton accessor method for n20.
    */
   public static RACH_ConfigGeneric_preambleTransMax n20() {
      return _n20;
   }

   /**
    * Singleton accessor method for n50.
    */
   public static RACH_ConfigGeneric_preambleTransMax n50() {
      return _n50;
   }

   /**
    * Singleton accessor method for n100.
    */
   public static RACH_ConfigGeneric_preambleTransMax n100() {
      return _n100;
   }

   /**
    * Singleton accessor method for n200.
    */
   public static RACH_ConfigGeneric_preambleTransMax n200() {
      return _n200;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigGeneric_preambleTransMax.valueOf( RACH_ConfigGeneric_preambleTransMax.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigGeneric_preambleTransMax valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n3();
         case 1: return n4();
         case 2: return n5();
         case 3: return n6();
         case 4: return n7();
         case 5: return n8();
         case 6: return n10();
         case 7: return n20();
         case 8: return n50();
         case 9: return n100();
         case 10: return n200();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (11);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         case 8: ret =  8; break;
         case 9: ret =  9; break;
         case 10: ret =  10; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RACH_ConfigGeneric_preambleTransMax.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n3 */break;
         case 1: ui = 1; /* n4 */break;
         case 2: ui = 2; /* n5 */break;
         case 3: ui = 3; /* n6 */break;
         case 4: ui = 4; /* n7 */break;
         case 5: ui = 5; /* n8 */break;
         case 6: ui = 6; /* n10 */break;
         case 7: ui = 7; /* n20 */break;
         case 8: ui = 8; /* n50 */break;
         case 9: ui = 9; /* n100 */break;
         case 10: ui = 10; /* n200 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 11);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n3");
         case 1: return ("n4");
         case 2: return ("n5");
         case 3: return ("n6");
         case 4: return ("n7");
         case 5: return ("n8");
         case 6: return ("n10");
         case 7: return ("n20");
         case 8: return ("n50");
         case 9: return ("n100");
         case 10: return ("n200");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
