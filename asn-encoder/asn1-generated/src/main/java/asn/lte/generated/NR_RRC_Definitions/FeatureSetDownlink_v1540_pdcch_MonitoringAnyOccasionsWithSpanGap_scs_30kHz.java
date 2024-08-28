/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SET1 = 0;
   public static final int _SET2 = 1;
   public static final int _SET3 = 2;

   // Singleton instances of FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz
   protected static final FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz _set1 = new FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz(0);
   protected static final FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz _set2 = new FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz(1);
   protected static final FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz _set3 = new FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for set1.
    */
   public static FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz set1() {
      return _set1;
   }

   /**
    * Singleton accessor method for set2.
    */
   public static FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz set2() {
      return _set2;
   }

   /**
    * Singleton accessor method for set3.
    */
   public static FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz set3() {
      return _set3;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz.valueOf( FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return set1();
         case 1: return set2();
         case 2: return set3();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (FeatureSetDownlink_v1540_pdcch_MonitoringAnyOccasionsWithSpanGap_scs_30kHz.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("set1");
         case 1: return ("set2");
         case 2: return ("set3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
