/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PSF0 = 0;
   public static final int _PSF1 = 1;
   public static final int _PSF2 = 2;
   public static final int _PSF4 = 3;
   public static final int _PSF8 = 4;
   public static final int _PSF10 = 5;
   public static final int _PSF20 = 6;
   public static final int _PSF40 = 7;
   public static final int _PSF80 = 8;
   public static final int _PSF160 = 9;
   public static final int _PS320 = 10;
   public static final int _PSF640 = 11;
   public static final int _PSF960 = 12;
   public static final int _PSF1280 = 13;
   public static final int _PSF1920 = 14;
   public static final int _PSF2560 = 15;

   // Singleton instances of SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf0 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(0);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf1 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(1);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf2 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(2);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf4 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(3);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf8 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(4);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf10 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(5);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf20 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(6);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf40 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(7);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf80 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(8);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf160 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(9);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _ps320 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(10);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf640 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(11);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf960 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(12);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf1280 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(13);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf1920 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(14);
   protected static final SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 _psf2560 = new SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13(15);

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
   protected SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for psf0.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf0() {
      return _psf0;
   }

   /**
    * Singleton accessor method for psf1.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf1() {
      return _psf1;
   }

   /**
    * Singleton accessor method for psf2.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf2() {
      return _psf2;
   }

   /**
    * Singleton accessor method for psf4.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf4() {
      return _psf4;
   }

   /**
    * Singleton accessor method for psf8.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf8() {
      return _psf8;
   }

   /**
    * Singleton accessor method for psf10.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf10() {
      return _psf10;
   }

   /**
    * Singleton accessor method for psf20.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf20() {
      return _psf20;
   }

   /**
    * Singleton accessor method for psf40.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf40() {
      return _psf40;
   }

   /**
    * Singleton accessor method for psf80.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf80() {
      return _psf80;
   }

   /**
    * Singleton accessor method for psf160.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf160() {
      return _psf160;
   }

   /**
    * Singleton accessor method for ps320.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 ps320() {
      return _ps320;
   }

   /**
    * Singleton accessor method for psf640.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf640() {
      return _psf640;
   }

   /**
    * Singleton accessor method for psf960.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf960() {
      return _psf960;
   }

   /**
    * Singleton accessor method for psf1280.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf1280() {
      return _psf1280;
   }

   /**
    * Singleton accessor method for psf1920.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf1920() {
      return _psf1920;
   }

   /**
    * Singleton accessor method for psf2560.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 psf2560() {
      return _psf2560;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13.valueOf( SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return psf0();
         case 1: return psf1();
         case 2: return psf2();
         case 3: return psf4();
         case 4: return psf8();
         case 5: return psf10();
         case 6: return psf20();
         case 7: return psf40();
         case 8: return psf80();
         case 9: return psf160();
         case 10: return ps320();
         case 11: return psf640();
         case 12: return psf960();
         case 13: return psf1280();
         case 14: return psf1920();
         case 15: return psf2560();
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
      buffer.invokeCharacters (SC_MTCH_SchedulingInfo_r13_drx_InactivityTimerSCPTM_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("psf0");
         case 1: return ("psf1");
         case 2: return ("psf2");
         case 3: return ("psf4");
         case 4: return ("psf8");
         case 5: return ("psf10");
         case 6: return ("psf20");
         case 7: return ("psf40");
         case 8: return ("psf80");
         case 9: return ("psf160");
         case 10: return ("ps320");
         case 11: return ("psf640");
         case 12: return ("psf960");
         case 13: return ("psf1280");
         case 14: return ("psf1920");
         case 15: return ("psf2560");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
