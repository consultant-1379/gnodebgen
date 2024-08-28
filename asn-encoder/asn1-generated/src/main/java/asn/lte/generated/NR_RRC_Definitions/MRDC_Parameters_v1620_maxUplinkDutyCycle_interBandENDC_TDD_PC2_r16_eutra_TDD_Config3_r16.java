/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N20 = 0;
   public static final int _N40 = 1;
   public static final int _N50 = 2;
   public static final int _N60 = 3;
   public static final int _N70 = 4;
   public static final int _N80 = 5;
   public static final int _N90 = 6;
   public static final int _N100 = 7;

   // Singleton instances of MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n20 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(0);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n40 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(1);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n50 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(2);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n60 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(3);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n70 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(4);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n80 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(5);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n90 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(6);
   protected static final MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 _n100 = new MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16(7);

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
   protected MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n20.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n20() {
      return _n20;
   }

   /**
    * Singleton accessor method for n40.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n40() {
      return _n40;
   }

   /**
    * Singleton accessor method for n50.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n50() {
      return _n50;
   }

   /**
    * Singleton accessor method for n60.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n60() {
      return _n60;
   }

   /**
    * Singleton accessor method for n70.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n70() {
      return _n70;
   }

   /**
    * Singleton accessor method for n80.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n80() {
      return _n80;
   }

   /**
    * Singleton accessor method for n90.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n90() {
      return _n90;
   }

   /**
    * Singleton accessor method for n100.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 n100() {
      return _n100;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16.valueOf( MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n20();
         case 1: return n40();
         case 2: return n50();
         case 3: return n60();
         case 4: return n70();
         case 5: return n80();
         case 6: return n90();
         case 7: return n100();
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
      buffer.invokeCharacters (MRDC_Parameters_v1620_maxUplinkDutyCycle_interBandENDC_TDD_PC2_r16_eutra_TDD_Config3_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n20");
         case 1: return ("n40");
         case 2: return ("n50");
         case 3: return ("n60");
         case 4: return ("n70");
         case 5: return ("n80");
         case 6: return ("n90");
         case 7: return ("n100");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
