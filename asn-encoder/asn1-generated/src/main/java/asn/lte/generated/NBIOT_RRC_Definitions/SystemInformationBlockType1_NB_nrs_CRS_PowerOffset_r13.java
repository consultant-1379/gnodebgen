/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB_6 = 0;
   public static final int _DB_4DOT77 = 1;
   public static final int _DB_3 = 2;
   public static final int _DB_1DOT77 = 3;
   public static final int _DB0 = 4;
   public static final int _DB1 = 5;
   public static final int _DB1DOT23 = 6;
   public static final int _DB2 = 7;
   public static final int _DB3 = 8;
   public static final int _DB4 = 9;
   public static final int _DB4DOT23 = 10;
   public static final int _DB5 = 11;
   public static final int _DB6 = 12;
   public static final int _DB7 = 13;
   public static final int _DB8 = 14;
   public static final int _DB9 = 15;

   // Singleton instances of SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB_6 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(0);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB_4dot77 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(1);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB_3 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(2);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB_1dot77 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(3);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB0 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(4);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB1 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(5);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB1dot23 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(6);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB2 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(7);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB3 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(8);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB4 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(9);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB4dot23 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(10);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB5 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(11);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB6 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(12);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB7 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(13);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB8 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(14);
   protected static final SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 _dB9 = new SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13(15);

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
   protected SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_4dot77.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB_4dot77() {
      return _dB_4dot77;
   }

   /**
    * Singleton accessor method for dB_3.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB_3() {
      return _dB_3;
   }

   /**
    * Singleton accessor method for dB_1dot77.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB_1dot77() {
      return _dB_1dot77;
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB0() {
      return _dB0;
   }

   /**
    * Singleton accessor method for dB1.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB1() {
      return _dB1;
   }

   /**
    * Singleton accessor method for dB1dot23.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB1dot23() {
      return _dB1dot23;
   }

   /**
    * Singleton accessor method for dB2.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB2() {
      return _dB2;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB3() {
      return _dB3;
   }

   /**
    * Singleton accessor method for dB4.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB4() {
      return _dB4;
   }

   /**
    * Singleton accessor method for dB4dot23.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB4dot23() {
      return _dB4dot23;
   }

   /**
    * Singleton accessor method for dB5.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB5() {
      return _dB5;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB6() {
      return _dB6;
   }

   /**
    * Singleton accessor method for dB7.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB7() {
      return _dB7;
   }

   /**
    * Singleton accessor method for dB8.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB8() {
      return _dB8;
   }

   /**
    * Singleton accessor method for dB9.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 dB9() {
      return _dB9;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13.valueOf( SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB_6();
         case 1: return dB_4dot77();
         case 2: return dB_3();
         case 3: return dB_1dot77();
         case 4: return dB0();
         case 5: return dB1();
         case 6: return dB1dot23();
         case 7: return dB2();
         case 8: return dB3();
         case 9: return dB4();
         case 10: return dB4dot23();
         case 11: return dB5();
         case 12: return dB6();
         case 13: return dB7();
         case 14: return dB8();
         case 15: return dB9();
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
      buffer.invokeCharacters (SystemInformationBlockType1_NB_nrs_CRS_PowerOffset_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-6");
         case 1: return ("dB-4dot77");
         case 2: return ("dB-3");
         case 3: return ("dB-1dot77");
         case 4: return ("dB0");
         case 5: return ("dB1");
         case 6: return ("dB1dot23");
         case 7: return ("dB2");
         case 8: return ("dB3");
         case 9: return ("dB4");
         case 10: return ("dB4dot23");
         case 11: return ("dB5");
         case 12: return ("dB6");
         case 13: return ("dB7");
         case 14: return ("dB8");
         case 15: return ("dB9");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
