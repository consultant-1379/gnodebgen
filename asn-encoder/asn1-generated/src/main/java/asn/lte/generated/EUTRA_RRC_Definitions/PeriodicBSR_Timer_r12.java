/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PeriodicBSR_Timer_r12 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PeriodicBSR-Timer-r12";
   }

   // Integer constants for switch-case
   public static final int _SF5 = 0;
   public static final int _SF10 = 1;
   public static final int _SF16 = 2;
   public static final int _SF20 = 3;
   public static final int _SF32 = 4;
   public static final int _SF40 = 5;
   public static final int _SF64 = 6;
   public static final int _SF80 = 7;
   public static final int _SF128 = 8;
   public static final int _SF160 = 9;
   public static final int _SF320 = 10;
   public static final int _SF640 = 11;
   public static final int _SF1280 = 12;
   public static final int _SF2560 = 13;
   public static final int _INFINITY = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of PeriodicBSR_Timer_r12
   protected static final PeriodicBSR_Timer_r12 _sf5 = new PeriodicBSR_Timer_r12(0);
   protected static final PeriodicBSR_Timer_r12 _sf10 = new PeriodicBSR_Timer_r12(1);
   protected static final PeriodicBSR_Timer_r12 _sf16 = new PeriodicBSR_Timer_r12(2);
   protected static final PeriodicBSR_Timer_r12 _sf20 = new PeriodicBSR_Timer_r12(3);
   protected static final PeriodicBSR_Timer_r12 _sf32 = new PeriodicBSR_Timer_r12(4);
   protected static final PeriodicBSR_Timer_r12 _sf40 = new PeriodicBSR_Timer_r12(5);
   protected static final PeriodicBSR_Timer_r12 _sf64 = new PeriodicBSR_Timer_r12(6);
   protected static final PeriodicBSR_Timer_r12 _sf80 = new PeriodicBSR_Timer_r12(7);
   protected static final PeriodicBSR_Timer_r12 _sf128 = new PeriodicBSR_Timer_r12(8);
   protected static final PeriodicBSR_Timer_r12 _sf160 = new PeriodicBSR_Timer_r12(9);
   protected static final PeriodicBSR_Timer_r12 _sf320 = new PeriodicBSR_Timer_r12(10);
   protected static final PeriodicBSR_Timer_r12 _sf640 = new PeriodicBSR_Timer_r12(11);
   protected static final PeriodicBSR_Timer_r12 _sf1280 = new PeriodicBSR_Timer_r12(12);
   protected static final PeriodicBSR_Timer_r12 _sf2560 = new PeriodicBSR_Timer_r12(13);
   protected static final PeriodicBSR_Timer_r12 _infinity = new PeriodicBSR_Timer_r12(14);
   protected static final PeriodicBSR_Timer_r12 _spare1 = new PeriodicBSR_Timer_r12(15);

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
   protected PeriodicBSR_Timer_r12 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf5.
    */
   public static PeriodicBSR_Timer_r12 sf5() {
      return _sf5;
   }

   /**
    * Singleton accessor method for sf10.
    */
   public static PeriodicBSR_Timer_r12 sf10() {
      return _sf10;
   }

   /**
    * Singleton accessor method for sf16.
    */
   public static PeriodicBSR_Timer_r12 sf16() {
      return _sf16;
   }

   /**
    * Singleton accessor method for sf20.
    */
   public static PeriodicBSR_Timer_r12 sf20() {
      return _sf20;
   }

   /**
    * Singleton accessor method for sf32.
    */
   public static PeriodicBSR_Timer_r12 sf32() {
      return _sf32;
   }

   /**
    * Singleton accessor method for sf40.
    */
   public static PeriodicBSR_Timer_r12 sf40() {
      return _sf40;
   }

   /**
    * Singleton accessor method for sf64.
    */
   public static PeriodicBSR_Timer_r12 sf64() {
      return _sf64;
   }

   /**
    * Singleton accessor method for sf80.
    */
   public static PeriodicBSR_Timer_r12 sf80() {
      return _sf80;
   }

   /**
    * Singleton accessor method for sf128.
    */
   public static PeriodicBSR_Timer_r12 sf128() {
      return _sf128;
   }

   /**
    * Singleton accessor method for sf160.
    */
   public static PeriodicBSR_Timer_r12 sf160() {
      return _sf160;
   }

   /**
    * Singleton accessor method for sf320.
    */
   public static PeriodicBSR_Timer_r12 sf320() {
      return _sf320;
   }

   /**
    * Singleton accessor method for sf640.
    */
   public static PeriodicBSR_Timer_r12 sf640() {
      return _sf640;
   }

   /**
    * Singleton accessor method for sf1280.
    */
   public static PeriodicBSR_Timer_r12 sf1280() {
      return _sf1280;
   }

   /**
    * Singleton accessor method for sf2560.
    */
   public static PeriodicBSR_Timer_r12 sf2560() {
      return _sf2560;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static PeriodicBSR_Timer_r12 infinity() {
      return _infinity;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static PeriodicBSR_Timer_r12 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PeriodicBSR_Timer_r12.valueOf( PeriodicBSR_Timer_r12.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PeriodicBSR_Timer_r12 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf5();
         case 1: return sf10();
         case 2: return sf16();
         case 3: return sf20();
         case 4: return sf32();
         case 5: return sf40();
         case 6: return sf64();
         case 7: return sf80();
         case 8: return sf128();
         case 9: return sf160();
         case 10: return sf320();
         case 11: return sf640();
         case 12: return sf1280();
         case 13: return sf2560();
         case 14: return infinity();
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
      buffer.invokeCharacters (PeriodicBSR_Timer_r12.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf5");
         case 1: return ("sf10");
         case 2: return ("sf16");
         case 3: return ("sf20");
         case 4: return ("sf32");
         case 5: return ("sf40");
         case 6: return ("sf64");
         case 7: return ("sf80");
         case 8: return ("sf128");
         case 9: return ("sf160");
         case 10: return ("sf320");
         case 11: return ("sf640");
         case 12: return ("sf1280");
         case 13: return ("sf2560");
         case 14: return ("infinity");
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
