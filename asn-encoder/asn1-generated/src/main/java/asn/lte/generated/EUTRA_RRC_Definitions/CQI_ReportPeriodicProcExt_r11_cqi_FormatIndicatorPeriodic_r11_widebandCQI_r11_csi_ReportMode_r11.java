/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SUBMODE1 = 0;
   public static final int _SUBMODE2 = 1;

   // Singleton instances of CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11
   protected static final CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 _submode1 = new CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11(0);
   protected static final CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 _submode2 = new CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for submode1.
    */
   public static CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 submode1() {
      return _submode1;
   }

   /**
    * Singleton accessor method for submode2.
    */
   public static CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 submode2() {
      return _submode2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11.valueOf( CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return submode1();
         case 1: return submode2();
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
      buffer.invokeCharacters (CQI_ReportPeriodicProcExt_r11_cqi_FormatIndicatorPeriodic_r11_widebandCQI_r11_csi_ReportMode_r11.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("submode1");
         case 1: return ("submode2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
