/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PeriodComm_r12 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PeriodComm-r12";
   }

   // Integer constants for switch-case
   public static final int _SF40 = 0;
   public static final int _SF60 = 1;
   public static final int _SF70 = 2;
   public static final int _SF80 = 3;
   public static final int _SF120 = 4;
   public static final int _SF140 = 5;
   public static final int _SF160 = 6;
   public static final int _SF240 = 7;
   public static final int _SF280 = 8;
   public static final int _SF320 = 9;
   public static final int _SPARE6 = 10;
   public static final int _SPARE5 = 11;
   public static final int _SPARE4 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE = 15;

   // Singleton instances of SL_PeriodComm_r12
   protected static final SL_PeriodComm_r12 _sf40 = new SL_PeriodComm_r12(0);
   protected static final SL_PeriodComm_r12 _sf60 = new SL_PeriodComm_r12(1);
   protected static final SL_PeriodComm_r12 _sf70 = new SL_PeriodComm_r12(2);
   protected static final SL_PeriodComm_r12 _sf80 = new SL_PeriodComm_r12(3);
   protected static final SL_PeriodComm_r12 _sf120 = new SL_PeriodComm_r12(4);
   protected static final SL_PeriodComm_r12 _sf140 = new SL_PeriodComm_r12(5);
   protected static final SL_PeriodComm_r12 _sf160 = new SL_PeriodComm_r12(6);
   protected static final SL_PeriodComm_r12 _sf240 = new SL_PeriodComm_r12(7);
   protected static final SL_PeriodComm_r12 _sf280 = new SL_PeriodComm_r12(8);
   protected static final SL_PeriodComm_r12 _sf320 = new SL_PeriodComm_r12(9);
   protected static final SL_PeriodComm_r12 _spare6 = new SL_PeriodComm_r12(10);
   protected static final SL_PeriodComm_r12 _spare5 = new SL_PeriodComm_r12(11);
   protected static final SL_PeriodComm_r12 _spare4 = new SL_PeriodComm_r12(12);
   protected static final SL_PeriodComm_r12 _spare3 = new SL_PeriodComm_r12(13);
   protected static final SL_PeriodComm_r12 _spare2 = new SL_PeriodComm_r12(14);
   protected static final SL_PeriodComm_r12 _spare = new SL_PeriodComm_r12(15);

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
   protected SL_PeriodComm_r12 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf40.
    */
   public static SL_PeriodComm_r12 sf40() {
      return _sf40;
   }

   /**
    * Singleton accessor method for sf60.
    */
   public static SL_PeriodComm_r12 sf60() {
      return _sf60;
   }

   /**
    * Singleton accessor method for sf70.
    */
   public static SL_PeriodComm_r12 sf70() {
      return _sf70;
   }

   /**
    * Singleton accessor method for sf80.
    */
   public static SL_PeriodComm_r12 sf80() {
      return _sf80;
   }

   /**
    * Singleton accessor method for sf120.
    */
   public static SL_PeriodComm_r12 sf120() {
      return _sf120;
   }

   /**
    * Singleton accessor method for sf140.
    */
   public static SL_PeriodComm_r12 sf140() {
      return _sf140;
   }

   /**
    * Singleton accessor method for sf160.
    */
   public static SL_PeriodComm_r12 sf160() {
      return _sf160;
   }

   /**
    * Singleton accessor method for sf240.
    */
   public static SL_PeriodComm_r12 sf240() {
      return _sf240;
   }

   /**
    * Singleton accessor method for sf280.
    */
   public static SL_PeriodComm_r12 sf280() {
      return _sf280;
   }

   /**
    * Singleton accessor method for sf320.
    */
   public static SL_PeriodComm_r12 sf320() {
      return _sf320;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static SL_PeriodComm_r12 spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static SL_PeriodComm_r12 spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static SL_PeriodComm_r12 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static SL_PeriodComm_r12 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SL_PeriodComm_r12 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare.
    */
   public static SL_PeriodComm_r12 spare() {
      return _spare;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_PeriodComm_r12.valueOf( SL_PeriodComm_r12.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_PeriodComm_r12 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf40();
         case 1: return sf60();
         case 2: return sf70();
         case 3: return sf80();
         case 4: return sf120();
         case 5: return sf140();
         case 6: return sf160();
         case 7: return sf240();
         case 8: return sf280();
         case 9: return sf320();
         case 10: return spare6();
         case 11: return spare5();
         case 12: return spare4();
         case 13: return spare3();
         case 14: return spare2();
         case 15: return spare();
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
      buffer.invokeCharacters (SL_PeriodComm_r12.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf40");
         case 1: return ("sf60");
         case 2: return ("sf70");
         case 3: return ("sf80");
         case 4: return ("sf120");
         case 5: return ("sf140");
         case 6: return ("sf160");
         case 7: return ("sf240");
         case 8: return ("sf280");
         case 9: return ("sf320");
         case 10: return ("spare6");
         case 11: return ("spare5");
         case 12: return ("spare4");
         case 13: return ("spare3");
         case 14: return ("spare2");
         case 15: return ("spare");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
