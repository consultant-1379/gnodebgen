/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB_12 = 0;
   public static final int _DB_10 = 1;
   public static final int _DB_8 = 2;
   public static final int _DB_6 = 3;
   public static final int _DB_4 = 4;
   public static final int _DB_2 = 5;
   public static final int _DB0 = 6;
   public static final int _DB3 = 7;

   // Singleton instances of DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_12 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(0);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_10 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(1);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_8 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(2);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_6 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(3);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_4 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(4);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB_2 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(5);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB0 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(6);
   protected static final DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 _dB3 = new DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330(7);

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
    */
   protected DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_12.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_12() {
      return _dB_12;
   }

   /**
    * Singleton accessor method for dB_10.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_10() {
      return _dB_10;
   }

   /**
    * Singleton accessor method for dB_8.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_8() {
      return _dB_8;
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_4.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_4() {
      return _dB_4;
   }

   /**
    * Singleton accessor method for dB_2.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB_2() {
      return _dB_2;
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB0() {
      return _dB0;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 dB3() {
      return _dB3;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330.valueOf( DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB_12();
         case 1: return dB_10();
         case 2: return dB_8();
         case 3: return dB_6();
         case 4: return dB_4();
         case 5: return dB_2();
         case 6: return dB0();
         case 7: return dB3();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (DL_CarrierConfigDedicated_NB_r13_nrs_PowerOffsetNonAnchor_v1330.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-12");
         case 1: return ("dB-10");
         case 2: return ("dB-8");
         case 3: return ("dB-6");
         case 4: return ("dB-4");
         case 5: return ("dB-2");
         case 6: return ("dB0");
         case 7: return ("dB3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
