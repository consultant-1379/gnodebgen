/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportInterval extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportInterval";
   }

   // Integer constants for switch-case
   public static final int _MS120 = 0;
   public static final int _MS240 = 1;
   public static final int _MS480 = 2;
   public static final int _MS640 = 3;
   public static final int _MS1024 = 4;
   public static final int _MS2048 = 5;
   public static final int _MS5120 = 6;
   public static final int _MS10240 = 7;
   public static final int _MIN1 = 8;
   public static final int _MIN6 = 9;
   public static final int _MIN12 = 10;
   public static final int _MIN30 = 11;
   public static final int _MIN60 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of ReportInterval
   protected static final ReportInterval _ms120 = new ReportInterval(0);
   protected static final ReportInterval _ms240 = new ReportInterval(1);
   protected static final ReportInterval _ms480 = new ReportInterval(2);
   protected static final ReportInterval _ms640 = new ReportInterval(3);
   protected static final ReportInterval _ms1024 = new ReportInterval(4);
   protected static final ReportInterval _ms2048 = new ReportInterval(5);
   protected static final ReportInterval _ms5120 = new ReportInterval(6);
   protected static final ReportInterval _ms10240 = new ReportInterval(7);
   protected static final ReportInterval _min1 = new ReportInterval(8);
   protected static final ReportInterval _min6 = new ReportInterval(9);
   protected static final ReportInterval _min12 = new ReportInterval(10);
   protected static final ReportInterval _min30 = new ReportInterval(11);
   protected static final ReportInterval _min60 = new ReportInterval(12);
   protected static final ReportInterval _spare3 = new ReportInterval(13);
   protected static final ReportInterval _spare2 = new ReportInterval(14);
   protected static final ReportInterval _spare1 = new ReportInterval(15);

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
    */
   protected ReportInterval (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms120.
    */
   public static ReportInterval ms120() {
      return _ms120;
   }

   /**
    * Singleton accessor method for ms240.
    */
   public static ReportInterval ms240() {
      return _ms240;
   }

   /**
    * Singleton accessor method for ms480.
    */
   public static ReportInterval ms480() {
      return _ms480;
   }

   /**
    * Singleton accessor method for ms640.
    */
   public static ReportInterval ms640() {
      return _ms640;
   }

   /**
    * Singleton accessor method for ms1024.
    */
   public static ReportInterval ms1024() {
      return _ms1024;
   }

   /**
    * Singleton accessor method for ms2048.
    */
   public static ReportInterval ms2048() {
      return _ms2048;
   }

   /**
    * Singleton accessor method for ms5120.
    */
   public static ReportInterval ms5120() {
      return _ms5120;
   }

   /**
    * Singleton accessor method for ms10240.
    */
   public static ReportInterval ms10240() {
      return _ms10240;
   }

   /**
    * Singleton accessor method for min1.
    */
   public static ReportInterval min1() {
      return _min1;
   }

   /**
    * Singleton accessor method for min6.
    */
   public static ReportInterval min6() {
      return _min6;
   }

   /**
    * Singleton accessor method for min12.
    */
   public static ReportInterval min12() {
      return _min12;
   }

   /**
    * Singleton accessor method for min30.
    */
   public static ReportInterval min30() {
      return _min30;
   }

   /**
    * Singleton accessor method for min60.
    */
   public static ReportInterval min60() {
      return _min60;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static ReportInterval spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static ReportInterval spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static ReportInterval spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ReportInterval.valueOf( ReportInterval.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ReportInterval valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms120();
         case 1: return ms240();
         case 2: return ms480();
         case 3: return ms640();
         case 4: return ms1024();
         case 5: return ms2048();
         case 6: return ms5120();
         case 7: return ms10240();
         case 8: return min1();
         case 9: return min6();
         case 10: return min12();
         case 11: return min30();
         case 12: return min60();
         case 13: return spare3();
         case 14: return spare2();
         case 15: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (16);

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
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ReportInterval.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms120");
         case 1: return ("ms240");
         case 2: return ("ms480");
         case 3: return ("ms640");
         case 4: return ("ms1024");
         case 5: return ("ms2048");
         case 6: return ("ms5120");
         case 7: return ("ms10240");
         case 8: return ("min1");
         case 9: return ("min6");
         case 10: return ("min12");
         case 11: return ("min30");
         case 12: return ("min60");
         case 13: return ("spare3");
         case 14: return ("spare2");
         case 15: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
