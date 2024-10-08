/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AntennaInfoDedicated_r10_transmissionMode_r10 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _TM1 = 0;
   public static final int _TM2 = 1;
   public static final int _TM3 = 2;
   public static final int _TM4 = 3;
   public static final int _TM5 = 4;
   public static final int _TM6 = 5;
   public static final int _TM7 = 6;
   public static final int _TM8_V920 = 7;
   public static final int _TM9_V1020 = 8;
   public static final int _TM10_V1130 = 9;
   public static final int _SPARE6 = 10;
   public static final int _SPARE5 = 11;
   public static final int _SPARE4 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of AntennaInfoDedicated_r10_transmissionMode_r10
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm1 = new AntennaInfoDedicated_r10_transmissionMode_r10(0);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm2 = new AntennaInfoDedicated_r10_transmissionMode_r10(1);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm3 = new AntennaInfoDedicated_r10_transmissionMode_r10(2);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm4 = new AntennaInfoDedicated_r10_transmissionMode_r10(3);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm5 = new AntennaInfoDedicated_r10_transmissionMode_r10(4);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm6 = new AntennaInfoDedicated_r10_transmissionMode_r10(5);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm7 = new AntennaInfoDedicated_r10_transmissionMode_r10(6);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm8_v920 = new AntennaInfoDedicated_r10_transmissionMode_r10(7);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm9_v1020 = new AntennaInfoDedicated_r10_transmissionMode_r10(8);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _tm10_v1130 = new AntennaInfoDedicated_r10_transmissionMode_r10(9);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare6 = new AntennaInfoDedicated_r10_transmissionMode_r10(10);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare5 = new AntennaInfoDedicated_r10_transmissionMode_r10(11);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare4 = new AntennaInfoDedicated_r10_transmissionMode_r10(12);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare3 = new AntennaInfoDedicated_r10_transmissionMode_r10(13);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare2 = new AntennaInfoDedicated_r10_transmissionMode_r10(14);
   protected static final AntennaInfoDedicated_r10_transmissionMode_r10 _spare1 = new AntennaInfoDedicated_r10_transmissionMode_r10(15);

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
   protected AntennaInfoDedicated_r10_transmissionMode_r10 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for tm1.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm1() {
      return _tm1;
   }

   /**
    * Singleton accessor method for tm2.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm2() {
      return _tm2;
   }

   /**
    * Singleton accessor method for tm3.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm3() {
      return _tm3;
   }

   /**
    * Singleton accessor method for tm4.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm4() {
      return _tm4;
   }

   /**
    * Singleton accessor method for tm5.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm5() {
      return _tm5;
   }

   /**
    * Singleton accessor method for tm6.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm6() {
      return _tm6;
   }

   /**
    * Singleton accessor method for tm7.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm7() {
      return _tm7;
   }

   /**
    * Singleton accessor method for tm8_v920.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm8_v920() {
      return _tm8_v920;
   }

   /**
    * Singleton accessor method for tm9_v1020.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm9_v1020() {
      return _tm9_v1020;
   }

   /**
    * Singleton accessor method for tm10_v1130.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 tm10_v1130() {
      return _tm10_v1130;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return AntennaInfoDedicated_r10_transmissionMode_r10.valueOf( AntennaInfoDedicated_r10_transmissionMode_r10.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static AntennaInfoDedicated_r10_transmissionMode_r10 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return tm1();
         case 1: return tm2();
         case 2: return tm3();
         case 3: return tm4();
         case 4: return tm5();
         case 5: return tm6();
         case 6: return tm7();
         case 7: return tm8_v920();
         case 8: return tm9_v1020();
         case 9: return tm10_v1130();
         case 10: return spare6();
         case 11: return spare5();
         case 12: return spare4();
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
      buffer.invokeCharacters (AntennaInfoDedicated_r10_transmissionMode_r10.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("tm1");
         case 1: return ("tm2");
         case 2: return ("tm3");
         case 3: return ("tm4");
         case 4: return ("tm5");
         case 5: return ("tm6");
         case 6: return ("tm7");
         case 7: return ("tm8-v920");
         case 8: return ("tm9-v1020");
         case 9: return ("tm10-v1130");
         case 10: return ("spare6");
         case 11: return ("spare5");
         case 12: return ("spare4");
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
