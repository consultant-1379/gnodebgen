/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PSSCH_Config_r16_sl_Scaling_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _F0P5 = 0;
   public static final int _F0P65 = 1;
   public static final int _F0P8 = 2;
   public static final int _F1 = 3;

   // Singleton instances of SL_PSSCH_Config_r16_sl_Scaling_r16
   protected static final SL_PSSCH_Config_r16_sl_Scaling_r16 _f0p5 = new SL_PSSCH_Config_r16_sl_Scaling_r16(0);
   protected static final SL_PSSCH_Config_r16_sl_Scaling_r16 _f0p65 = new SL_PSSCH_Config_r16_sl_Scaling_r16(1);
   protected static final SL_PSSCH_Config_r16_sl_Scaling_r16 _f0p8 = new SL_PSSCH_Config_r16_sl_Scaling_r16(2);
   protected static final SL_PSSCH_Config_r16_sl_Scaling_r16 _f1 = new SL_PSSCH_Config_r16_sl_Scaling_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SL_PSSCH_Config_r16_sl_Scaling_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for f0p5.
    */
   public static SL_PSSCH_Config_r16_sl_Scaling_r16 f0p5() {
      return _f0p5;
   }

   /**
    * Singleton accessor method for f0p65.
    */
   public static SL_PSSCH_Config_r16_sl_Scaling_r16 f0p65() {
      return _f0p65;
   }

   /**
    * Singleton accessor method for f0p8.
    */
   public static SL_PSSCH_Config_r16_sl_Scaling_r16 f0p8() {
      return _f0p8;
   }

   /**
    * Singleton accessor method for f1.
    */
   public static SL_PSSCH_Config_r16_sl_Scaling_r16 f1() {
      return _f1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_PSSCH_Config_r16_sl_Scaling_r16.valueOf( SL_PSSCH_Config_r16_sl_Scaling_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_PSSCH_Config_r16_sl_Scaling_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return f0p5();
         case 1: return f0p65();
         case 2: return f0p8();
         case 3: return f1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SL_PSSCH_Config_r16_sl_Scaling_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("f0p5");
         case 1: return ("f0p65");
         case 2: return ("f0p8");
         case 3: return ("f1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
