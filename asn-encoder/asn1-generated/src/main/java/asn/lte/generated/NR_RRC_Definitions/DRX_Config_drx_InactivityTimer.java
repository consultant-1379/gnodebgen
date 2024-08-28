/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_drx_InactivityTimer extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS0 = 0;
   public static final int _MS1 = 1;
   public static final int _MS2 = 2;
   public static final int _MS3 = 3;
   public static final int _MS4 = 4;
   public static final int _MS5 = 5;
   public static final int _MS6 = 6;
   public static final int _MS8 = 7;
   public static final int _MS10 = 8;
   public static final int _MS20 = 9;
   public static final int _MS30 = 10;
   public static final int _MS40 = 11;
   public static final int _MS50 = 12;
   public static final int _MS60 = 13;
   public static final int _MS80 = 14;
   public static final int _MS100 = 15;
   public static final int _MS200 = 16;
   public static final int _MS300 = 17;
   public static final int _MS500 = 18;
   public static final int _MS750 = 19;
   public static final int _MS1280 = 20;
   public static final int _MS1920 = 21;
   public static final int _MS2560 = 22;
   public static final int _SPARE9 = 23;
   public static final int _SPARE8 = 24;
   public static final int _SPARE7 = 25;
   public static final int _SPARE6 = 26;
   public static final int _SPARE5 = 27;
   public static final int _SPARE4 = 28;
   public static final int _SPARE3 = 29;
   public static final int _SPARE2 = 30;
   public static final int _SPARE1 = 31;

   // Singleton instances of DRX_Config_drx_InactivityTimer
   protected static final DRX_Config_drx_InactivityTimer _ms0 = new DRX_Config_drx_InactivityTimer(0);
   protected static final DRX_Config_drx_InactivityTimer _ms1 = new DRX_Config_drx_InactivityTimer(1);
   protected static final DRX_Config_drx_InactivityTimer _ms2 = new DRX_Config_drx_InactivityTimer(2);
   protected static final DRX_Config_drx_InactivityTimer _ms3 = new DRX_Config_drx_InactivityTimer(3);
   protected static final DRX_Config_drx_InactivityTimer _ms4 = new DRX_Config_drx_InactivityTimer(4);
   protected static final DRX_Config_drx_InactivityTimer _ms5 = new DRX_Config_drx_InactivityTimer(5);
   protected static final DRX_Config_drx_InactivityTimer _ms6 = new DRX_Config_drx_InactivityTimer(6);
   protected static final DRX_Config_drx_InactivityTimer _ms8 = new DRX_Config_drx_InactivityTimer(7);
   protected static final DRX_Config_drx_InactivityTimer _ms10 = new DRX_Config_drx_InactivityTimer(8);
   protected static final DRX_Config_drx_InactivityTimer _ms20 = new DRX_Config_drx_InactivityTimer(9);
   protected static final DRX_Config_drx_InactivityTimer _ms30 = new DRX_Config_drx_InactivityTimer(10);
   protected static final DRX_Config_drx_InactivityTimer _ms40 = new DRX_Config_drx_InactivityTimer(11);
   protected static final DRX_Config_drx_InactivityTimer _ms50 = new DRX_Config_drx_InactivityTimer(12);
   protected static final DRX_Config_drx_InactivityTimer _ms60 = new DRX_Config_drx_InactivityTimer(13);
   protected static final DRX_Config_drx_InactivityTimer _ms80 = new DRX_Config_drx_InactivityTimer(14);
   protected static final DRX_Config_drx_InactivityTimer _ms100 = new DRX_Config_drx_InactivityTimer(15);
   protected static final DRX_Config_drx_InactivityTimer _ms200 = new DRX_Config_drx_InactivityTimer(16);
   protected static final DRX_Config_drx_InactivityTimer _ms300 = new DRX_Config_drx_InactivityTimer(17);
   protected static final DRX_Config_drx_InactivityTimer _ms500 = new DRX_Config_drx_InactivityTimer(18);
   protected static final DRX_Config_drx_InactivityTimer _ms750 = new DRX_Config_drx_InactivityTimer(19);
   protected static final DRX_Config_drx_InactivityTimer _ms1280 = new DRX_Config_drx_InactivityTimer(20);
   protected static final DRX_Config_drx_InactivityTimer _ms1920 = new DRX_Config_drx_InactivityTimer(21);
   protected static final DRX_Config_drx_InactivityTimer _ms2560 = new DRX_Config_drx_InactivityTimer(22);
   protected static final DRX_Config_drx_InactivityTimer _spare9 = new DRX_Config_drx_InactivityTimer(23);
   protected static final DRX_Config_drx_InactivityTimer _spare8 = new DRX_Config_drx_InactivityTimer(24);
   protected static final DRX_Config_drx_InactivityTimer _spare7 = new DRX_Config_drx_InactivityTimer(25);
   protected static final DRX_Config_drx_InactivityTimer _spare6 = new DRX_Config_drx_InactivityTimer(26);
   protected static final DRX_Config_drx_InactivityTimer _spare5 = new DRX_Config_drx_InactivityTimer(27);
   protected static final DRX_Config_drx_InactivityTimer _spare4 = new DRX_Config_drx_InactivityTimer(28);
   protected static final DRX_Config_drx_InactivityTimer _spare3 = new DRX_Config_drx_InactivityTimer(29);
   protected static final DRX_Config_drx_InactivityTimer _spare2 = new DRX_Config_drx_InactivityTimer(30);
   protected static final DRX_Config_drx_InactivityTimer _spare1 = new DRX_Config_drx_InactivityTimer(31);

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
   protected DRX_Config_drx_InactivityTimer (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0.
    */
   public static DRX_Config_drx_InactivityTimer ms0() {
      return _ms0;
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static DRX_Config_drx_InactivityTimer ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static DRX_Config_drx_InactivityTimer ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static DRX_Config_drx_InactivityTimer ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for ms4.
    */
   public static DRX_Config_drx_InactivityTimer ms4() {
      return _ms4;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static DRX_Config_drx_InactivityTimer ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms6.
    */
   public static DRX_Config_drx_InactivityTimer ms6() {
      return _ms6;
   }

   /**
    * Singleton accessor method for ms8.
    */
   public static DRX_Config_drx_InactivityTimer ms8() {
      return _ms8;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static DRX_Config_drx_InactivityTimer ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static DRX_Config_drx_InactivityTimer ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms30.
    */
   public static DRX_Config_drx_InactivityTimer ms30() {
      return _ms30;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static DRX_Config_drx_InactivityTimer ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms50.
    */
   public static DRX_Config_drx_InactivityTimer ms50() {
      return _ms50;
   }

   /**
    * Singleton accessor method for ms60.
    */
   public static DRX_Config_drx_InactivityTimer ms60() {
      return _ms60;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static DRX_Config_drx_InactivityTimer ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static DRX_Config_drx_InactivityTimer ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms200.
    */
   public static DRX_Config_drx_InactivityTimer ms200() {
      return _ms200;
   }

   /**
    * Singleton accessor method for ms300.
    */
   public static DRX_Config_drx_InactivityTimer ms300() {
      return _ms300;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static DRX_Config_drx_InactivityTimer ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms750.
    */
   public static DRX_Config_drx_InactivityTimer ms750() {
      return _ms750;
   }

   /**
    * Singleton accessor method for ms1280.
    */
   public static DRX_Config_drx_InactivityTimer ms1280() {
      return _ms1280;
   }

   /**
    * Singleton accessor method for ms1920.
    */
   public static DRX_Config_drx_InactivityTimer ms1920() {
      return _ms1920;
   }

   /**
    * Singleton accessor method for ms2560.
    */
   public static DRX_Config_drx_InactivityTimer ms2560() {
      return _ms2560;
   }

   /**
    * Singleton accessor method for spare9.
    */
   public static DRX_Config_drx_InactivityTimer spare9() {
      return _spare9;
   }

   /**
    * Singleton accessor method for spare8.
    */
   public static DRX_Config_drx_InactivityTimer spare8() {
      return _spare8;
   }

   /**
    * Singleton accessor method for spare7.
    */
   public static DRX_Config_drx_InactivityTimer spare7() {
      return _spare7;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static DRX_Config_drx_InactivityTimer spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static DRX_Config_drx_InactivityTimer spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static DRX_Config_drx_InactivityTimer spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static DRX_Config_drx_InactivityTimer spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static DRX_Config_drx_InactivityTimer spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static DRX_Config_drx_InactivityTimer spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRX_Config_drx_InactivityTimer.valueOf( DRX_Config_drx_InactivityTimer.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRX_Config_drx_InactivityTimer valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0();
         case 1: return ms1();
         case 2: return ms2();
         case 3: return ms3();
         case 4: return ms4();
         case 5: return ms5();
         case 6: return ms6();
         case 7: return ms8();
         case 8: return ms10();
         case 9: return ms20();
         case 10: return ms30();
         case 11: return ms40();
         case 12: return ms50();
         case 13: return ms60();
         case 14: return ms80();
         case 15: return ms100();
         case 16: return ms200();
         case 17: return ms300();
         case 18: return ms500();
         case 19: return ms750();
         case 20: return ms1280();
         case 21: return ms1920();
         case 22: return ms2560();
         case 23: return spare9();
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
      buffer.invokeCharacters (DRX_Config_drx_InactivityTimer.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0");
         case 1: return ("ms1");
         case 2: return ("ms2");
         case 3: return ("ms3");
         case 4: return ("ms4");
         case 5: return ("ms5");
         case 6: return ("ms6");
         case 7: return ("ms8");
         case 8: return ("ms10");
         case 9: return ("ms20");
         case 10: return ("ms30");
         case 11: return ("ms40");
         case 12: return ("ms50");
         case 13: return ("ms60");
         case 14: return ("ms80");
         case 15: return ("ms100");
         case 16: return ("ms200");
         case 17: return ("ms300");
         case 18: return ("ms500");
         case 19: return ("ms750");
         case 20: return ("ms1280");
         case 21: return ("ms1920");
         case 22: return ("ms2560");
         case 23: return ("spare9");
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
