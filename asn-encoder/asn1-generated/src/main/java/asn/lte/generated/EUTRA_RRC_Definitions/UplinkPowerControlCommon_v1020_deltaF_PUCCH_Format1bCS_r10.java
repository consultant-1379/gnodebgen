/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DELTAF1 = 0;
   public static final int _DELTAF2 = 1;
   public static final int _SPARE2 = 2;
   public static final int _SPARE1 = 3;

   // Singleton instances of UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10
   protected static final UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 _deltaF1 = new UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10(0);
   protected static final UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 _deltaF2 = new UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10(1);
   protected static final UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 _spare2 = new UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10(2);
   protected static final UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 _spare1 = new UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for deltaF1.
    */
   public static UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 deltaF1() {
      return _deltaF1;
   }

   /**
    * Singleton accessor method for deltaF2.
    */
   public static UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 deltaF2() {
      return _deltaF2;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10.valueOf( UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return deltaF1();
         case 1: return deltaF2();
         case 2: return spare2();
         case 3: return spare1();
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
      buffer.invokeCharacters (UplinkPowerControlCommon_v1020_deltaF_PUCCH_Format1bCS_r10.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("deltaF1");
         case 1: return ("deltaF2");
         case 2: return ("spare2");
         case 3: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
