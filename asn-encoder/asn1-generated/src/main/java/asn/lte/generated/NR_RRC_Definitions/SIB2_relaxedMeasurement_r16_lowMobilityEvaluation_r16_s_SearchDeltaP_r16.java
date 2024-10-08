/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB3 = 0;
   public static final int _DB6 = 1;
   public static final int _DB9 = 2;
   public static final int _DB12 = 3;
   public static final int _DB15 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _dB3 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(0);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _dB6 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(1);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _dB9 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(2);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _dB12 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(3);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _dB15 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(4);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _spare3 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(5);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _spare2 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(6);
   protected static final SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 _spare1 = new SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16(7);

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
   protected SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 dB3() {
      return _dB3;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 dB6() {
      return _dB6;
   }

   /**
    * Singleton accessor method for dB9.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 dB9() {
      return _dB9;
   }

   /**
    * Singleton accessor method for dB12.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 dB12() {
      return _dB12;
   }

   /**
    * Singleton accessor method for dB15.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 dB15() {
      return _dB15;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16.valueOf( SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB3();
         case 1: return dB6();
         case 2: return dB9();
         case 3: return dB12();
         case 4: return dB15();
         case 5: return spare3();
         case 6: return spare2();
         case 7: return spare1();
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
      buffer.invokeCharacters (SIB2_relaxedMeasurement_r16_lowMobilityEvaluation_r16_s_SearchDeltaP_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB3");
         case 1: return ("dB6");
         case 2: return ("dB9");
         case 3: return ("dB12");
         case 4: return ("dB15");
         case 5: return ("spare3");
         case 6: return ("spare2");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
