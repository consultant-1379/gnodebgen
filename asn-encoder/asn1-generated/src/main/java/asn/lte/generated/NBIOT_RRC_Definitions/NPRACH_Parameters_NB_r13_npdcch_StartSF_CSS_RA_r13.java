/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _V1DOT5 = 0;
   public static final int _V2 = 1;
   public static final int _V4 = 2;
   public static final int _V8 = 3;
   public static final int _V16 = 4;
   public static final int _V32 = 5;
   public static final int _V48 = 6;
   public static final int _V64 = 7;

   // Singleton instances of NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v1dot5 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(0);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v2 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(1);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v4 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(2);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v8 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(3);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v16 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(4);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v32 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(5);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v48 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(6);
   protected static final NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 _v64 = new NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13(7);

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
   protected NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for v1dot5.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v1dot5() {
      return _v1dot5;
   }

   /**
    * Singleton accessor method for v2.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v2() {
      return _v2;
   }

   /**
    * Singleton accessor method for v4.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v4() {
      return _v4;
   }

   /**
    * Singleton accessor method for v8.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v8() {
      return _v8;
   }

   /**
    * Singleton accessor method for v16.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v16() {
      return _v16;
   }

   /**
    * Singleton accessor method for v32.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v32() {
      return _v32;
   }

   /**
    * Singleton accessor method for v48.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v48() {
      return _v48;
   }

   /**
    * Singleton accessor method for v64.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 v64() {
      return _v64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13.valueOf( NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return v1dot5();
         case 1: return v2();
         case 2: return v4();
         case 3: return v8();
         case 4: return v16();
         case 5: return v32();
         case 6: return v48();
         case 7: return v64();
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
      buffer.invokeCharacters (NPRACH_Parameters_NB_r13_npdcch_StartSF_CSS_RA_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("v1dot5");
         case 1: return ("v2");
         case 2: return ("v4");
         case 3: return ("v8");
         case 4: return ("v16");
         case 5: return ("v32");
         case 6: return ("v48");
         case 7: return ("v64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
