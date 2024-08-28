/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ONE = 0;
   public static final int _UPTO2 = 1;
   public static final int _UPTO4 = 2;
   public static final int _UPTO7 = 3;

   // Singleton instances of FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16
   protected static final FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 _one = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16(0);
   protected static final FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 _upto2 = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16(1);
   protected static final FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 _upto4 = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16(2);
   protected static final FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 _upto7 = new FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for one.
    */
   public static FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 one() {
      return _one;
   }

   /**
    * Singleton accessor method for upto2.
    */
   public static FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 upto2() {
      return _upto2;
   }

   /**
    * Singleton accessor method for upto4.
    */
   public static FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 upto4() {
      return _upto4;
   }

   /**
    * Singleton accessor method for upto7.
    */
   public static FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 upto7() {
      return _upto7;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16.valueOf( FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return one();
         case 1: return upto2();
         case 2: return upto4();
         case 3: return upto7();
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
      buffer.invokeCharacters (FeatureSetDownlink_v1610_cbgPDSCH_ProcessingType2_NumberOfTB_PerSlot_r16_scs_15kHz_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("one");
         case 1: return ("upto2");
         case 2: return ("upto4");
         case 3: return ("upto7");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
