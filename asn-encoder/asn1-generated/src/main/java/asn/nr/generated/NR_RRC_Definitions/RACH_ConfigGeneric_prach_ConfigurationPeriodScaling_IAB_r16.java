/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SCF1 = 0;
   public static final int _SCF2 = 1;
   public static final int _SCF4 = 2;
   public static final int _SCF8 = 3;
   public static final int _SCF16 = 4;
   public static final int _SCF32 = 5;
   public static final int _SCF64 = 6;

   // Singleton instances of RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf1 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(0);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf2 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(1);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf4 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(2);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf8 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(3);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf16 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(4);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf32 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(5);
   protected static final RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 _scf64 = new RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16(6);

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
    */
   protected RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for scf1.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf1() {
      return _scf1;
   }

   /**
    * Singleton accessor method for scf2.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf2() {
      return _scf2;
   }

   /**
    * Singleton accessor method for scf4.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf4() {
      return _scf4;
   }

   /**
    * Singleton accessor method for scf8.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf8() {
      return _scf8;
   }

   /**
    * Singleton accessor method for scf16.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf16() {
      return _scf16;
   }

   /**
    * Singleton accessor method for scf32.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf32() {
      return _scf32;
   }

   /**
    * Singleton accessor method for scf64.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 scf64() {
      return _scf64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16.valueOf( RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return scf1();
         case 1: return scf2();
         case 2: return scf4();
         case 3: return scf8();
         case 4: return scf16();
         case 5: return scf32();
         case 6: return scf64();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (7);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* scf1 */break;
         case 1: ui = 1; /* scf2 */break;
         case 2: ui = 2; /* scf4 */break;
         case 3: ui = 3; /* scf8 */break;
         case 4: ui = 4; /* scf16 */break;
         case 5: ui = 5; /* scf32 */break;
         case 6: ui = 6; /* scf64 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 7);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("scf1");
         case 1: return ("scf2");
         case 2: return ("scf4");
         case 3: return ("scf8");
         case 4: return ("scf16");
         case 5: return ("scf32");
         case 6: return ("scf64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
