/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EUTRA_Q_OffsetRange extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EUTRA-Q-OffsetRange";
   }

   // Integer constants for switch-case
   public static final int _DB_24 = 0;
   public static final int _DB_22 = 1;
   public static final int _DB_20 = 2;
   public static final int _DB_18 = 3;
   public static final int _DB_16 = 4;
   public static final int _DB_14 = 5;
   public static final int _DB_12 = 6;
   public static final int _DB_10 = 7;
   public static final int _DB_8 = 8;
   public static final int _DB_6 = 9;
   public static final int _DB_5 = 10;
   public static final int _DB_4 = 11;
   public static final int _DB_3 = 12;
   public static final int _DB_2 = 13;
   public static final int _DB_1 = 14;
   public static final int _DB0 = 15;
   public static final int _DB1 = 16;
   public static final int _DB2 = 17;
   public static final int _DB3 = 18;
   public static final int _DB4 = 19;
   public static final int _DB5 = 20;
   public static final int _DB6 = 21;
   public static final int _DB8 = 22;
   public static final int _DB10 = 23;
   public static final int _DB12 = 24;
   public static final int _DB14 = 25;
   public static final int _DB16 = 26;
   public static final int _DB18 = 27;
   public static final int _DB20 = 28;
   public static final int _DB22 = 29;
   public static final int _DB24 = 30;

   // Singleton instances of EUTRA_Q_OffsetRange
   protected static final EUTRA_Q_OffsetRange _dB_24 = new EUTRA_Q_OffsetRange(0);
   protected static final EUTRA_Q_OffsetRange _dB_22 = new EUTRA_Q_OffsetRange(1);
   protected static final EUTRA_Q_OffsetRange _dB_20 = new EUTRA_Q_OffsetRange(2);
   protected static final EUTRA_Q_OffsetRange _dB_18 = new EUTRA_Q_OffsetRange(3);
   protected static final EUTRA_Q_OffsetRange _dB_16 = new EUTRA_Q_OffsetRange(4);
   protected static final EUTRA_Q_OffsetRange _dB_14 = new EUTRA_Q_OffsetRange(5);
   protected static final EUTRA_Q_OffsetRange _dB_12 = new EUTRA_Q_OffsetRange(6);
   protected static final EUTRA_Q_OffsetRange _dB_10 = new EUTRA_Q_OffsetRange(7);
   protected static final EUTRA_Q_OffsetRange _dB_8 = new EUTRA_Q_OffsetRange(8);
   protected static final EUTRA_Q_OffsetRange _dB_6 = new EUTRA_Q_OffsetRange(9);
   protected static final EUTRA_Q_OffsetRange _dB_5 = new EUTRA_Q_OffsetRange(10);
   protected static final EUTRA_Q_OffsetRange _dB_4 = new EUTRA_Q_OffsetRange(11);
   protected static final EUTRA_Q_OffsetRange _dB_3 = new EUTRA_Q_OffsetRange(12);
   protected static final EUTRA_Q_OffsetRange _dB_2 = new EUTRA_Q_OffsetRange(13);
   protected static final EUTRA_Q_OffsetRange _dB_1 = new EUTRA_Q_OffsetRange(14);
   protected static final EUTRA_Q_OffsetRange _dB0 = new EUTRA_Q_OffsetRange(15);
   protected static final EUTRA_Q_OffsetRange _dB1 = new EUTRA_Q_OffsetRange(16);
   protected static final EUTRA_Q_OffsetRange _dB2 = new EUTRA_Q_OffsetRange(17);
   protected static final EUTRA_Q_OffsetRange _dB3 = new EUTRA_Q_OffsetRange(18);
   protected static final EUTRA_Q_OffsetRange _dB4 = new EUTRA_Q_OffsetRange(19);
   protected static final EUTRA_Q_OffsetRange _dB5 = new EUTRA_Q_OffsetRange(20);
   protected static final EUTRA_Q_OffsetRange _dB6 = new EUTRA_Q_OffsetRange(21);
   protected static final EUTRA_Q_OffsetRange _dB8 = new EUTRA_Q_OffsetRange(22);
   protected static final EUTRA_Q_OffsetRange _dB10 = new EUTRA_Q_OffsetRange(23);
   protected static final EUTRA_Q_OffsetRange _dB12 = new EUTRA_Q_OffsetRange(24);
   protected static final EUTRA_Q_OffsetRange _dB14 = new EUTRA_Q_OffsetRange(25);
   protected static final EUTRA_Q_OffsetRange _dB16 = new EUTRA_Q_OffsetRange(26);
   protected static final EUTRA_Q_OffsetRange _dB18 = new EUTRA_Q_OffsetRange(27);
   protected static final EUTRA_Q_OffsetRange _dB20 = new EUTRA_Q_OffsetRange(28);
   protected static final EUTRA_Q_OffsetRange _dB22 = new EUTRA_Q_OffsetRange(29);
   protected static final EUTRA_Q_OffsetRange _dB24 = new EUTRA_Q_OffsetRange(30);

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
    *   11
    *   12
    *   13
    *   14
    *   15
    *   16
    *   17
    *   18
    *   19
    *   20
    *   21
    *   22
    *   23
    *   24
    *   25
    *   26
    *   27
    *   28
    *   29
    *   30
    */
   protected EUTRA_Q_OffsetRange (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_24.
    */
   public static EUTRA_Q_OffsetRange dB_24() {
      return _dB_24;
   }

   /**
    * Singleton accessor method for dB_22.
    */
   public static EUTRA_Q_OffsetRange dB_22() {
      return _dB_22;
   }

   /**
    * Singleton accessor method for dB_20.
    */
   public static EUTRA_Q_OffsetRange dB_20() {
      return _dB_20;
   }

   /**
    * Singleton accessor method for dB_18.
    */
   public static EUTRA_Q_OffsetRange dB_18() {
      return _dB_18;
   }

   /**
    * Singleton accessor method for dB_16.
    */
   public static EUTRA_Q_OffsetRange dB_16() {
      return _dB_16;
   }

   /**
    * Singleton accessor method for dB_14.
    */
   public static EUTRA_Q_OffsetRange dB_14() {
      return _dB_14;
   }

   /**
    * Singleton accessor method for dB_12.
    */
   public static EUTRA_Q_OffsetRange dB_12() {
      return _dB_12;
   }

   /**
    * Singleton accessor method for dB_10.
    */
   public static EUTRA_Q_OffsetRange dB_10() {
      return _dB_10;
   }

   /**
    * Singleton accessor method for dB_8.
    */
   public static EUTRA_Q_OffsetRange dB_8() {
      return _dB_8;
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static EUTRA_Q_OffsetRange dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_5.
    */
   public static EUTRA_Q_OffsetRange dB_5() {
      return _dB_5;
   }

   /**
    * Singleton accessor method for dB_4.
    */
   public static EUTRA_Q_OffsetRange dB_4() {
      return _dB_4;
   }

   /**
    * Singleton accessor method for dB_3.
    */
   public static EUTRA_Q_OffsetRange dB_3() {
      return _dB_3;
   }

   /**
    * Singleton accessor method for dB_2.
    */
   public static EUTRA_Q_OffsetRange dB_2() {
      return _dB_2;
   }

   /**
    * Singleton accessor method for dB_1.
    */
   public static EUTRA_Q_OffsetRange dB_1() {
      return _dB_1;
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static EUTRA_Q_OffsetRange dB0() {
      return _dB0;
   }

   /**
    * Singleton accessor method for dB1.
    */
   public static EUTRA_Q_OffsetRange dB1() {
      return _dB1;
   }

   /**
    * Singleton accessor method for dB2.
    */
   public static EUTRA_Q_OffsetRange dB2() {
      return _dB2;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static EUTRA_Q_OffsetRange dB3() {
      return _dB3;
   }

   /**
    * Singleton accessor method for dB4.
    */
   public static EUTRA_Q_OffsetRange dB4() {
      return _dB4;
   }

   /**
    * Singleton accessor method for dB5.
    */
   public static EUTRA_Q_OffsetRange dB5() {
      return _dB5;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static EUTRA_Q_OffsetRange dB6() {
      return _dB6;
   }

   /**
    * Singleton accessor method for dB8.
    */
   public static EUTRA_Q_OffsetRange dB8() {
      return _dB8;
   }

   /**
    * Singleton accessor method for dB10.
    */
   public static EUTRA_Q_OffsetRange dB10() {
      return _dB10;
   }

   /**
    * Singleton accessor method for dB12.
    */
   public static EUTRA_Q_OffsetRange dB12() {
      return _dB12;
   }

   /**
    * Singleton accessor method for dB14.
    */
   public static EUTRA_Q_OffsetRange dB14() {
      return _dB14;
   }

   /**
    * Singleton accessor method for dB16.
    */
   public static EUTRA_Q_OffsetRange dB16() {
      return _dB16;
   }

   /**
    * Singleton accessor method for dB18.
    */
   public static EUTRA_Q_OffsetRange dB18() {
      return _dB18;
   }

   /**
    * Singleton accessor method for dB20.
    */
   public static EUTRA_Q_OffsetRange dB20() {
      return _dB20;
   }

   /**
    * Singleton accessor method for dB22.
    */
   public static EUTRA_Q_OffsetRange dB22() {
      return _dB22;
   }

   /**
    * Singleton accessor method for dB24.
    */
   public static EUTRA_Q_OffsetRange dB24() {
      return _dB24;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EUTRA_Q_OffsetRange.valueOf( EUTRA_Q_OffsetRange.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EUTRA_Q_OffsetRange valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB_24();
         case 1: return dB_22();
         case 2: return dB_20();
         case 3: return dB_18();
         case 4: return dB_16();
         case 5: return dB_14();
         case 6: return dB_12();
         case 7: return dB_10();
         case 8: return dB_8();
         case 9: return dB_6();
         case 10: return dB_5();
         case 11: return dB_4();
         case 12: return dB_3();
         case 13: return dB_2();
         case 14: return dB_1();
         case 15: return dB0();
         case 16: return dB1();
         case 17: return dB2();
         case 18: return dB3();
         case 19: return dB4();
         case 20: return dB5();
         case 21: return dB6();
         case 22: return dB8();
         case 23: return dB10();
         case 24: return dB12();
         case 25: return dB14();
         case 26: return dB16();
         case 27: return dB18();
         case 28: return dB20();
         case 29: return dB22();
         case 30: return dB24();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (31);

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
         case 11: ret =  11; break;
         case 12: ret =  12; break;
         case 13: ret =  13; break;
         case 14: ret =  14; break;
         case 15: ret =  15; break;
         case 16: ret =  16; break;
         case 17: ret =  17; break;
         case 18: ret =  18; break;
         case 19: ret =  19; break;
         case 20: ret =  20; break;
         case 21: ret =  21; break;
         case 22: ret =  22; break;
         case 23: ret =  23; break;
         case 24: ret =  24; break;
         case 25: ret =  25; break;
         case 26: ret =  26; break;
         case 27: ret =  27; break;
         case 28: ret =  28; break;
         case 29: ret =  29; break;
         case 30: ret =  30; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EUTRA_Q_OffsetRange.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* dB_24 */break;
         case 1: ui = 1; /* dB_22 */break;
         case 2: ui = 2; /* dB_20 */break;
         case 3: ui = 3; /* dB_18 */break;
         case 4: ui = 4; /* dB_16 */break;
         case 5: ui = 5; /* dB_14 */break;
         case 6: ui = 6; /* dB_12 */break;
         case 7: ui = 7; /* dB_10 */break;
         case 8: ui = 8; /* dB_8 */break;
         case 9: ui = 9; /* dB_6 */break;
         case 10: ui = 10; /* dB_5 */break;
         case 11: ui = 11; /* dB_4 */break;
         case 12: ui = 12; /* dB_3 */break;
         case 13: ui = 13; /* dB_2 */break;
         case 14: ui = 14; /* dB_1 */break;
         case 15: ui = 15; /* dB0 */break;
         case 16: ui = 16; /* dB1 */break;
         case 17: ui = 17; /* dB2 */break;
         case 18: ui = 18; /* dB3 */break;
         case 19: ui = 19; /* dB4 */break;
         case 20: ui = 20; /* dB5 */break;
         case 21: ui = 21; /* dB6 */break;
         case 22: ui = 22; /* dB8 */break;
         case 23: ui = 23; /* dB10 */break;
         case 24: ui = 24; /* dB12 */break;
         case 25: ui = 25; /* dB14 */break;
         case 26: ui = 26; /* dB16 */break;
         case 27: ui = 27; /* dB18 */break;
         case 28: ui = 28; /* dB20 */break;
         case 29: ui = 29; /* dB22 */break;
         case 30: ui = 30; /* dB24 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 31);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-24");
         case 1: return ("dB-22");
         case 2: return ("dB-20");
         case 3: return ("dB-18");
         case 4: return ("dB-16");
         case 5: return ("dB-14");
         case 6: return ("dB-12");
         case 7: return ("dB-10");
         case 8: return ("dB-8");
         case 9: return ("dB-6");
         case 10: return ("dB-5");
         case 11: return ("dB-4");
         case 12: return ("dB-3");
         case 13: return ("dB-2");
         case 14: return ("dB-1");
         case 15: return ("dB0");
         case 16: return ("dB1");
         case 17: return ("dB2");
         case 18: return ("dB3");
         case 19: return ("dB4");
         case 20: return ("dB5");
         case 21: return ("dB6");
         case 22: return ("dB8");
         case 23: return ("dB10");
         case 24: return ("dB12");
         case 25: return ("dB14");
         case 26: return ("dB16");
         case 27: return ("dB18");
         case 28: return ("dB20");
         case 29: return ("dB22");
         case 30: return ("dB24");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
