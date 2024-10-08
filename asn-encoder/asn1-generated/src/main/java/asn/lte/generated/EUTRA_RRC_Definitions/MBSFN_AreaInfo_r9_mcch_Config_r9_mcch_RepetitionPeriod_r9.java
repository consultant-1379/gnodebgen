/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF32 = 0;
   public static final int _RF64 = 1;
   public static final int _RF128 = 2;
   public static final int _RF256 = 3;

   // Singleton instances of MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 _rf32 = new MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9(0);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 _rf64 = new MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9(1);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 _rf128 = new MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9(2);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 _rf256 = new MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf32.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 rf32() {
      return _rf32;
   }

   /**
    * Singleton accessor method for rf64.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 rf64() {
      return _rf64;
   }

   /**
    * Singleton accessor method for rf128.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 rf128() {
      return _rf128;
   }

   /**
    * Singleton accessor method for rf256.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 rf256() {
      return _rf256;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9.valueOf( MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf32();
         case 1: return rf64();
         case 2: return rf128();
         case 3: return rf256();
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
      buffer.invokeCharacters (MBSFN_AreaInfo_r9_mcch_Config_r9_mcch_RepetitionPeriod_r9.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf32");
         case 1: return ("rf64");
         case 2: return ("rf128");
         case 3: return ("rf256");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
