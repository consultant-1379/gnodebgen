/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _KHZ_7DOT5 = 0;
   public static final int _KHZ_1DOT25 = 1;

   // Singleton instances of MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14
   protected static final MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 _khz_7dot5 = new MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14(0);
   protected static final MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 _khz_1dot25 = new MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for khz_7dot5.
    */
   public static MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 khz_7dot5() {
      return _khz_7dot5;
   }

   /**
    * Singleton accessor method for khz_1dot25.
    */
   public static MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 khz_1dot25() {
      return _khz_1dot25;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14.valueOf( MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return khz_7dot5();
         case 1: return khz_1dot25();
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
      buffer.invokeCharacters (MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("khz-7dot5");
         case 1: return ("khz-1dot25");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
