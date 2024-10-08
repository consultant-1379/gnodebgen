/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_drx_RetransmissionTimerUL extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SL0 = 0;
   public static final int _SL1 = 1;
   public static final int _SL2 = 2;
   public static final int _SL4 = 3;
   public static final int _SL6 = 4;
   public static final int _SL8 = 5;
   public static final int _SL16 = 6;
   public static final int _SL24 = 7;
   public static final int _SL33 = 8;
   public static final int _SL40 = 9;
   public static final int _SL64 = 10;
   public static final int _SL80 = 11;
   public static final int _SL96 = 12;
   public static final int _SL112 = 13;
   public static final int _SL128 = 14;
   public static final int _SL160 = 15;
   public static final int _SL320 = 16;
   public static final int _SPARE15 = 17;
   public static final int _SPARE14 = 18;
   public static final int _SPARE13 = 19;
   public static final int _SPARE12 = 20;
   public static final int _SPARE11 = 21;
   public static final int _SPARE10 = 22;
   public static final int _SPARE9 = 23;
   public static final int _SPARE8 = 24;
   public static final int _SPARE7 = 25;
   public static final int _SPARE6 = 26;
   public static final int _SPARE5 = 27;
   public static final int _SPARE4 = 28;
   public static final int _SPARE3 = 29;
   public static final int _SPARE2 = 30;
   public static final int _SPARE1 = 31;

   // Singleton instances of DRX_Config_drx_RetransmissionTimerUL
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl0 = new DRX_Config_drx_RetransmissionTimerUL(0);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl1 = new DRX_Config_drx_RetransmissionTimerUL(1);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl2 = new DRX_Config_drx_RetransmissionTimerUL(2);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl4 = new DRX_Config_drx_RetransmissionTimerUL(3);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl6 = new DRX_Config_drx_RetransmissionTimerUL(4);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl8 = new DRX_Config_drx_RetransmissionTimerUL(5);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl16 = new DRX_Config_drx_RetransmissionTimerUL(6);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl24 = new DRX_Config_drx_RetransmissionTimerUL(7);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl33 = new DRX_Config_drx_RetransmissionTimerUL(8);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl40 = new DRX_Config_drx_RetransmissionTimerUL(9);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl64 = new DRX_Config_drx_RetransmissionTimerUL(10);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl80 = new DRX_Config_drx_RetransmissionTimerUL(11);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl96 = new DRX_Config_drx_RetransmissionTimerUL(12);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl112 = new DRX_Config_drx_RetransmissionTimerUL(13);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl128 = new DRX_Config_drx_RetransmissionTimerUL(14);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl160 = new DRX_Config_drx_RetransmissionTimerUL(15);
   protected static final DRX_Config_drx_RetransmissionTimerUL _sl320 = new DRX_Config_drx_RetransmissionTimerUL(16);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare15 = new DRX_Config_drx_RetransmissionTimerUL(17);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare14 = new DRX_Config_drx_RetransmissionTimerUL(18);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare13 = new DRX_Config_drx_RetransmissionTimerUL(19);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare12 = new DRX_Config_drx_RetransmissionTimerUL(20);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare11 = new DRX_Config_drx_RetransmissionTimerUL(21);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare10 = new DRX_Config_drx_RetransmissionTimerUL(22);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare9 = new DRX_Config_drx_RetransmissionTimerUL(23);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare8 = new DRX_Config_drx_RetransmissionTimerUL(24);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare7 = new DRX_Config_drx_RetransmissionTimerUL(25);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare6 = new DRX_Config_drx_RetransmissionTimerUL(26);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare5 = new DRX_Config_drx_RetransmissionTimerUL(27);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare4 = new DRX_Config_drx_RetransmissionTimerUL(28);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare3 = new DRX_Config_drx_RetransmissionTimerUL(29);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare2 = new DRX_Config_drx_RetransmissionTimerUL(30);
   protected static final DRX_Config_drx_RetransmissionTimerUL _spare1 = new DRX_Config_drx_RetransmissionTimerUL(31);

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
   protected DRX_Config_drx_RetransmissionTimerUL (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sl0.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl0() {
      return _sl0;
   }

   /**
    * Singleton accessor method for sl1.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl1() {
      return _sl1;
   }

   /**
    * Singleton accessor method for sl2.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl2() {
      return _sl2;
   }

   /**
    * Singleton accessor method for sl4.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl4() {
      return _sl4;
   }

   /**
    * Singleton accessor method for sl6.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl6() {
      return _sl6;
   }

   /**
    * Singleton accessor method for sl8.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl8() {
      return _sl8;
   }

   /**
    * Singleton accessor method for sl16.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl16() {
      return _sl16;
   }

   /**
    * Singleton accessor method for sl24.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl24() {
      return _sl24;
   }

   /**
    * Singleton accessor method for sl33.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl33() {
      return _sl33;
   }

   /**
    * Singleton accessor method for sl40.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl40() {
      return _sl40;
   }

   /**
    * Singleton accessor method for sl64.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl64() {
      return _sl64;
   }

   /**
    * Singleton accessor method for sl80.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl80() {
      return _sl80;
   }

   /**
    * Singleton accessor method for sl96.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl96() {
      return _sl96;
   }

   /**
    * Singleton accessor method for sl112.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl112() {
      return _sl112;
   }

   /**
    * Singleton accessor method for sl128.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl128() {
      return _sl128;
   }

   /**
    * Singleton accessor method for sl160.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl160() {
      return _sl160;
   }

   /**
    * Singleton accessor method for sl320.
    */
   public static DRX_Config_drx_RetransmissionTimerUL sl320() {
      return _sl320;
   }

   /**
    * Singleton accessor method for spare15.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare15() {
      return _spare15;
   }

   /**
    * Singleton accessor method for spare14.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare14() {
      return _spare14;
   }

   /**
    * Singleton accessor method for spare13.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare13() {
      return _spare13;
   }

   /**
    * Singleton accessor method for spare12.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare12() {
      return _spare12;
   }

   /**
    * Singleton accessor method for spare11.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare11() {
      return _spare11;
   }

   /**
    * Singleton accessor method for spare10.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare10() {
      return _spare10;
   }

   /**
    * Singleton accessor method for spare9.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare9() {
      return _spare9;
   }

   /**
    * Singleton accessor method for spare8.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare8() {
      return _spare8;
   }

   /**
    * Singleton accessor method for spare7.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare7() {
      return _spare7;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static DRX_Config_drx_RetransmissionTimerUL spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRX_Config_drx_RetransmissionTimerUL.valueOf( DRX_Config_drx_RetransmissionTimerUL.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRX_Config_drx_RetransmissionTimerUL valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sl0();
         case 1: return sl1();
         case 2: return sl2();
         case 3: return sl4();
         case 4: return sl6();
         case 5: return sl8();
         case 6: return sl16();
         case 7: return sl24();
         case 8: return sl33();
         case 9: return sl40();
         case 10: return sl64();
         case 11: return sl80();
         case 12: return sl96();
         case 13: return sl112();
         case 14: return sl128();
         case 15: return sl160();
         case 16: return sl320();
         case 17: return spare15();
         case 18: return spare14();
         case 19: return spare13();
         case 20: return spare12();
         case 21: return spare11();
         case 22: return spare10();
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
      buffer.invokeCharacters (DRX_Config_drx_RetransmissionTimerUL.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sl0");
         case 1: return ("sl1");
         case 2: return ("sl2");
         case 3: return ("sl4");
         case 4: return ("sl6");
         case 5: return ("sl8");
         case 6: return ("sl16");
         case 7: return ("sl24");
         case 8: return ("sl33");
         case 9: return ("sl40");
         case 10: return ("sl64");
         case 11: return ("sl80");
         case 12: return ("sl96");
         case 13: return ("sl112");
         case 14: return ("sl128");
         case 15: return ("sl160");
         case 16: return ("sl320");
         case 17: return ("spare15");
         case 18: return ("spare14");
         case 19: return ("spare13");
         case 20: return ("spare12");
         case 21: return ("spare11");
         case 22: return ("spare10");
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
