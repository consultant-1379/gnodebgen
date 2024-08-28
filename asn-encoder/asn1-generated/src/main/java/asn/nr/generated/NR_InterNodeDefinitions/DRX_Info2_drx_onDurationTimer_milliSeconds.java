/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Info2_drx_onDurationTimer_milliSeconds extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS1 = 0;
   public static final int _MS2 = 1;
   public static final int _MS3 = 2;
   public static final int _MS4 = 3;
   public static final int _MS5 = 4;
   public static final int _MS6 = 5;
   public static final int _MS8 = 6;
   public static final int _MS10 = 7;
   public static final int _MS20 = 8;
   public static final int _MS30 = 9;
   public static final int _MS40 = 10;
   public static final int _MS50 = 11;
   public static final int _MS60 = 12;
   public static final int _MS80 = 13;
   public static final int _MS100 = 14;
   public static final int _MS200 = 15;
   public static final int _MS300 = 16;
   public static final int _MS400 = 17;
   public static final int _MS500 = 18;
   public static final int _MS600 = 19;
   public static final int _MS800 = 20;
   public static final int _MS1000 = 21;
   public static final int _MS1200 = 22;
   public static final int _MS1600 = 23;
   public static final int _SPARE8 = 24;
   public static final int _SPARE7 = 25;
   public static final int _SPARE6 = 26;
   public static final int _SPARE5 = 27;
   public static final int _SPARE4 = 28;
   public static final int _SPARE3 = 29;
   public static final int _SPARE2 = 30;
   public static final int _SPARE1 = 31;

   // Singleton instances of DRX_Info2_drx_onDurationTimer_milliSeconds
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms1 = new DRX_Info2_drx_onDurationTimer_milliSeconds(0);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms2 = new DRX_Info2_drx_onDurationTimer_milliSeconds(1);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms3 = new DRX_Info2_drx_onDurationTimer_milliSeconds(2);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms4 = new DRX_Info2_drx_onDurationTimer_milliSeconds(3);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms5 = new DRX_Info2_drx_onDurationTimer_milliSeconds(4);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms6 = new DRX_Info2_drx_onDurationTimer_milliSeconds(5);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms8 = new DRX_Info2_drx_onDurationTimer_milliSeconds(6);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms10 = new DRX_Info2_drx_onDurationTimer_milliSeconds(7);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms20 = new DRX_Info2_drx_onDurationTimer_milliSeconds(8);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms30 = new DRX_Info2_drx_onDurationTimer_milliSeconds(9);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms40 = new DRX_Info2_drx_onDurationTimer_milliSeconds(10);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms50 = new DRX_Info2_drx_onDurationTimer_milliSeconds(11);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms60 = new DRX_Info2_drx_onDurationTimer_milliSeconds(12);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms80 = new DRX_Info2_drx_onDurationTimer_milliSeconds(13);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms100 = new DRX_Info2_drx_onDurationTimer_milliSeconds(14);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms200 = new DRX_Info2_drx_onDurationTimer_milliSeconds(15);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms300 = new DRX_Info2_drx_onDurationTimer_milliSeconds(16);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms400 = new DRX_Info2_drx_onDurationTimer_milliSeconds(17);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms500 = new DRX_Info2_drx_onDurationTimer_milliSeconds(18);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms600 = new DRX_Info2_drx_onDurationTimer_milliSeconds(19);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms800 = new DRX_Info2_drx_onDurationTimer_milliSeconds(20);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms1000 = new DRX_Info2_drx_onDurationTimer_milliSeconds(21);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms1200 = new DRX_Info2_drx_onDurationTimer_milliSeconds(22);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _ms1600 = new DRX_Info2_drx_onDurationTimer_milliSeconds(23);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare8 = new DRX_Info2_drx_onDurationTimer_milliSeconds(24);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare7 = new DRX_Info2_drx_onDurationTimer_milliSeconds(25);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare6 = new DRX_Info2_drx_onDurationTimer_milliSeconds(26);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare5 = new DRX_Info2_drx_onDurationTimer_milliSeconds(27);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare4 = new DRX_Info2_drx_onDurationTimer_milliSeconds(28);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare3 = new DRX_Info2_drx_onDurationTimer_milliSeconds(29);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare2 = new DRX_Info2_drx_onDurationTimer_milliSeconds(30);
   protected static final DRX_Info2_drx_onDurationTimer_milliSeconds _spare1 = new DRX_Info2_drx_onDurationTimer_milliSeconds(31);

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
    *   31
    */
   protected DRX_Info2_drx_onDurationTimer_milliSeconds (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for ms4.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms4() {
      return _ms4;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms6.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms6() {
      return _ms6;
   }

   /**
    * Singleton accessor method for ms8.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms8() {
      return _ms8;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms30.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms30() {
      return _ms30;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms50.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms50() {
      return _ms50;
   }

   /**
    * Singleton accessor method for ms60.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms60() {
      return _ms60;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms200.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms200() {
      return _ms200;
   }

   /**
    * Singleton accessor method for ms300.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms300() {
      return _ms300;
   }

   /**
    * Singleton accessor method for ms400.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms400() {
      return _ms400;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms600.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms600() {
      return _ms600;
   }

   /**
    * Singleton accessor method for ms800.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms800() {
      return _ms800;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms1200.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms1200() {
      return _ms1200;
   }

   /**
    * Singleton accessor method for ms1600.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds ms1600() {
      return _ms1600;
   }

   /**
    * Singleton accessor method for spare8.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare8() {
      return _spare8;
   }

   /**
    * Singleton accessor method for spare7.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare7() {
      return _spare7;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRX_Info2_drx_onDurationTimer_milliSeconds.valueOf( DRX_Info2_drx_onDurationTimer_milliSeconds.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRX_Info2_drx_onDurationTimer_milliSeconds valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms1();
         case 1: return ms2();
         case 2: return ms3();
         case 3: return ms4();
         case 4: return ms5();
         case 5: return ms6();
         case 6: return ms8();
         case 7: return ms10();
         case 8: return ms20();
         case 9: return ms30();
         case 10: return ms40();
         case 11: return ms50();
         case 12: return ms60();
         case 13: return ms80();
         case 14: return ms100();
         case 15: return ms200();
         case 16: return ms300();
         case 17: return ms400();
         case 18: return ms500();
         case 19: return ms600();
         case 20: return ms800();
         case 21: return ms1000();
         case 22: return ms1200();
         case 23: return ms1600();
         case 24: return spare8();
         case 25: return spare7();
         case 26: return spare6();
         case 27: return spare5();
         case 28: return spare4();
         case 29: return spare3();
         case 30: return spare2();
         case 31: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (32);

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
         case 31: ret =  31; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (DRX_Info2_drx_onDurationTimer_milliSeconds.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms1 */break;
         case 1: ui = 1; /* ms2 */break;
         case 2: ui = 2; /* ms3 */break;
         case 3: ui = 3; /* ms4 */break;
         case 4: ui = 4; /* ms5 */break;
         case 5: ui = 5; /* ms6 */break;
         case 6: ui = 6; /* ms8 */break;
         case 7: ui = 7; /* ms10 */break;
         case 8: ui = 8; /* ms20 */break;
         case 9: ui = 9; /* ms30 */break;
         case 10: ui = 10; /* ms40 */break;
         case 11: ui = 11; /* ms50 */break;
         case 12: ui = 12; /* ms60 */break;
         case 13: ui = 13; /* ms80 */break;
         case 14: ui = 14; /* ms100 */break;
         case 15: ui = 15; /* ms200 */break;
         case 16: ui = 16; /* ms300 */break;
         case 17: ui = 17; /* ms400 */break;
         case 18: ui = 18; /* ms500 */break;
         case 19: ui = 19; /* ms600 */break;
         case 20: ui = 20; /* ms800 */break;
         case 21: ui = 21; /* ms1000 */break;
         case 22: ui = 22; /* ms1200 */break;
         case 23: ui = 23; /* ms1600 */break;
         case 24: ui = 24; /* spare8 */break;
         case 25: ui = 25; /* spare7 */break;
         case 26: ui = 26; /* spare6 */break;
         case 27: ui = 27; /* spare5 */break;
         case 28: ui = 28; /* spare4 */break;
         case 29: ui = 29; /* spare3 */break;
         case 30: ui = 30; /* spare2 */break;
         case 31: ui = 31; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 32);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1");
         case 1: return ("ms2");
         case 2: return ("ms3");
         case 3: return ("ms4");
         case 4: return ("ms5");
         case 5: return ("ms6");
         case 6: return ("ms8");
         case 7: return ("ms10");
         case 8: return ("ms20");
         case 9: return ("ms30");
         case 10: return ("ms40");
         case 11: return ("ms50");
         case 12: return ("ms60");
         case 13: return ("ms80");
         case 14: return ("ms100");
         case 15: return ("ms200");
         case 16: return ("ms300");
         case 17: return ("ms400");
         case 18: return ("ms500");
         case 19: return ("ms600");
         case 20: return ("ms800");
         case 21: return ("ms1000");
         case 22: return ("ms1200");
         case 23: return ("ms1600");
         case 24: return ("spare8");
         case 25: return ("spare7");
         case 26: return ("spare6");
         case 27: return ("spare5");
         case 28: return ("spare4");
         case 29: return ("spare3");
         case 30: return ("spare2");
         case 31: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
