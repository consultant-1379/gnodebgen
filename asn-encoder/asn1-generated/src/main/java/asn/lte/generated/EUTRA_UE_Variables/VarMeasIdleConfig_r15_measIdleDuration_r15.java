/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;

public class VarMeasIdleConfig_r15_measIdleDuration_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SEC10 = 0;
   public static final int _SEC30 = 1;
   public static final int _SEC60 = 2;
   public static final int _SEC120 = 3;
   public static final int _SEC180 = 4;
   public static final int _SEC240 = 5;
   public static final int _SEC300 = 6;

   // Singleton instances of VarMeasIdleConfig_r15_measIdleDuration_r15
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec10 = new VarMeasIdleConfig_r15_measIdleDuration_r15(0);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec30 = new VarMeasIdleConfig_r15_measIdleDuration_r15(1);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec60 = new VarMeasIdleConfig_r15_measIdleDuration_r15(2);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec120 = new VarMeasIdleConfig_r15_measIdleDuration_r15(3);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec180 = new VarMeasIdleConfig_r15_measIdleDuration_r15(4);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec240 = new VarMeasIdleConfig_r15_measIdleDuration_r15(5);
   protected static final VarMeasIdleConfig_r15_measIdleDuration_r15 _sec300 = new VarMeasIdleConfig_r15_measIdleDuration_r15(6);

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
   protected VarMeasIdleConfig_r15_measIdleDuration_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sec10.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec10() {
      return _sec10;
   }

   /**
    * Singleton accessor method for sec30.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec30() {
      return _sec30;
   }

   /**
    * Singleton accessor method for sec60.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec60() {
      return _sec60;
   }

   /**
    * Singleton accessor method for sec120.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec120() {
      return _sec120;
   }

   /**
    * Singleton accessor method for sec180.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec180() {
      return _sec180;
   }

   /**
    * Singleton accessor method for sec240.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec240() {
      return _sec240;
   }

   /**
    * Singleton accessor method for sec300.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 sec300() {
      return _sec300;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return VarMeasIdleConfig_r15_measIdleDuration_r15.valueOf( VarMeasIdleConfig_r15_measIdleDuration_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static VarMeasIdleConfig_r15_measIdleDuration_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sec10();
         case 1: return sec30();
         case 2: return sec60();
         case 3: return sec120();
         case 4: return sec180();
         case 5: return sec240();
         case 6: return sec300();
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
      buffer.invokeCharacters (VarMeasIdleConfig_r15_measIdleDuration_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sec10");
         case 1: return ("sec30");
         case 2: return ("sec60");
         case 3: return ("sec120");
         case 4: return ("sec180");
         case 5: return ("sec240");
         case 6: return ("sec300");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
