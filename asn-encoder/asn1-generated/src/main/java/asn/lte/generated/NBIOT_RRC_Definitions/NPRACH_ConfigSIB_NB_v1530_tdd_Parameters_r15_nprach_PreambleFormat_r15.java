/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _FMT0 = 0;
   public static final int _FMT1 = 1;
   public static final int _FMT2 = 2;
   public static final int _FMT0_A = 3;
   public static final int _FMT1_A = 4;

   // Singleton instances of NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15
   protected static final NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 _fmt0 = new NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15(0);
   protected static final NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 _fmt1 = new NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15(1);
   protected static final NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 _fmt2 = new NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15(2);
   protected static final NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 _fmt0_a = new NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15(3);
   protected static final NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 _fmt1_a = new NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for fmt0.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 fmt0() {
      return _fmt0;
   }

   /**
    * Singleton accessor method for fmt1.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 fmt1() {
      return _fmt1;
   }

   /**
    * Singleton accessor method for fmt2.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 fmt2() {
      return _fmt2;
   }

   /**
    * Singleton accessor method for fmt0_a.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 fmt0_a() {
      return _fmt0_a;
   }

   /**
    * Singleton accessor method for fmt1_a.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 fmt1_a() {
      return _fmt1_a;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15.valueOf( NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return fmt0();
         case 1: return fmt1();
         case 2: return fmt2();
         case 3: return fmt0_a();
         case 4: return fmt1_a();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (NPRACH_ConfigSIB_NB_v1530_tdd_Parameters_r15_nprach_PreambleFormat_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("fmt0");
         case 1: return ("fmt1");
         case 2: return ("fmt2");
         case 3: return ("fmt0-a");
         case 4: return ("fmt1-a");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
