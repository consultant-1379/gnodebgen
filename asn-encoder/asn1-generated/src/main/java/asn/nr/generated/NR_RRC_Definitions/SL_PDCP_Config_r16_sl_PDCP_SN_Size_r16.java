/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _LEN12BITS = 0;
   public static final int _LEN18BITS = 1;

   // Singleton instances of SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16
   protected static final SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 _len12bits = new SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16(0);
   protected static final SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 _len18bits = new SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for len12bits.
    */
   public static SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 len12bits() {
      return _len12bits;
   }

   /**
    * Singleton accessor method for len18bits.
    */
   public static SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 len18bits() {
      return _len18bits;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16.valueOf( SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return len12bits();
         case 1: return len18bits();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SL_PDCP_Config_r16_sl_PDCP_SN_Size_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* len12bits */break;
         case 1: ui = 1; /* len18bits */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 2);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("len12bits");
         case 1: return ("len18bits");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
