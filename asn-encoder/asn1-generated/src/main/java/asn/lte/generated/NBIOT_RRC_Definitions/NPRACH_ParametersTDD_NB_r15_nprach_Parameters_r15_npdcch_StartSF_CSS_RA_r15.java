/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _V4 = 0;
   public static final int _V8 = 1;
   public static final int _V16 = 2;
   public static final int _V32 = 3;
   public static final int _V48 = 4;
   public static final int _V64 = 5;
   public static final int _V96 = 6;
   public static final int _V128 = 7;

   // Singleton instances of NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v4 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(0);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v8 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(1);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v16 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(2);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v32 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(3);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v48 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(4);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v64 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(5);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v96 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(6);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 _v128 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15(7);

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
   protected NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for v4.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v4() {
      return _v4;
   }

   /**
    * Singleton accessor method for v8.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v8() {
      return _v8;
   }

   /**
    * Singleton accessor method for v16.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v16() {
      return _v16;
   }

   /**
    * Singleton accessor method for v32.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v32() {
      return _v32;
   }

   /**
    * Singleton accessor method for v48.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v48() {
      return _v48;
   }

   /**
    * Singleton accessor method for v64.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v64() {
      return _v64;
   }

   /**
    * Singleton accessor method for v96.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v96() {
      return _v96;
   }

   /**
    * Singleton accessor method for v128.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 v128() {
      return _v128;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15.valueOf( NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return v4();
         case 1: return v8();
         case 2: return v16();
         case 3: return v32();
         case 4: return v48();
         case 5: return v64();
         case 6: return v96();
         case 7: return v128();
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
      buffer.invokeCharacters (NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_StartSF_CSS_RA_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("v4");
         case 1: return ("v8");
         case 2: return ("v16");
         case 3: return ("v32");
         case 4: return ("v48");
         case 5: return ("v64");
         case 6: return ("v96");
         case 7: return ("v128");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
