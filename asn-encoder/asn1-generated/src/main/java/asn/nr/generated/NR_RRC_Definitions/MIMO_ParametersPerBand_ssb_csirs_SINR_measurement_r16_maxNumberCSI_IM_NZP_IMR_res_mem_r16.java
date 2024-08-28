/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N8 = 0;
   public static final int _N16 = 1;
   public static final int _N32 = 2;
   public static final int _N64 = 3;
   public static final int _N128 = 4;

   // Singleton instances of MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16
   protected static final MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 _n8 = new MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16(0);
   protected static final MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 _n16 = new MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16(1);
   protected static final MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 _n32 = new MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16(2);
   protected static final MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 _n64 = new MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16(3);
   protected static final MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 _n128 = new MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n8.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 n32() {
      return _n32;
   }

   /**
    * Singleton accessor method for n64.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 n64() {
      return _n64;
   }

   /**
    * Singleton accessor method for n128.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 n128() {
      return _n128;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16.valueOf( MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n8();
         case 1: return n16();
         case 2: return n32();
         case 3: return n64();
         case 4: return n128();
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
      buffer.invokeCharacters (MIMO_ParametersPerBand_ssb_csirs_SINR_measurement_r16_maxNumberCSI_IM_NZP_IMR_res_mem_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n8 */break;
         case 1: ui = 1; /* n16 */break;
         case 2: ui = 2; /* n32 */break;
         case 3: ui = 3; /* n64 */break;
         case 4: ui = 4; /* n128 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 5);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n8");
         case 1: return ("n16");
         case 2: return ("n32");
         case 3: return ("n64");
         case 4: return ("n128");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
