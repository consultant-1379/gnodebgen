/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_beamReportTiming_scs_30kHz extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SYM4 = 0;
   public static final int _SYM8 = 1;
   public static final int _SYM14 = 2;
   public static final int _SYM28 = 3;

   // Singleton instances of MIMO_ParametersPerBand_beamReportTiming_scs_30kHz
   protected static final MIMO_ParametersPerBand_beamReportTiming_scs_30kHz _sym4 = new MIMO_ParametersPerBand_beamReportTiming_scs_30kHz(0);
   protected static final MIMO_ParametersPerBand_beamReportTiming_scs_30kHz _sym8 = new MIMO_ParametersPerBand_beamReportTiming_scs_30kHz(1);
   protected static final MIMO_ParametersPerBand_beamReportTiming_scs_30kHz _sym14 = new MIMO_ParametersPerBand_beamReportTiming_scs_30kHz(2);
   protected static final MIMO_ParametersPerBand_beamReportTiming_scs_30kHz _sym28 = new MIMO_ParametersPerBand_beamReportTiming_scs_30kHz(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MIMO_ParametersPerBand_beamReportTiming_scs_30kHz (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sym4.
    */
   public static MIMO_ParametersPerBand_beamReportTiming_scs_30kHz sym4() {
      return _sym4;
   }

   /**
    * Singleton accessor method for sym8.
    */
   public static MIMO_ParametersPerBand_beamReportTiming_scs_30kHz sym8() {
      return _sym8;
   }

   /**
    * Singleton accessor method for sym14.
    */
   public static MIMO_ParametersPerBand_beamReportTiming_scs_30kHz sym14() {
      return _sym14;
   }

   /**
    * Singleton accessor method for sym28.
    */
   public static MIMO_ParametersPerBand_beamReportTiming_scs_30kHz sym28() {
      return _sym28;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_beamReportTiming_scs_30kHz.valueOf( MIMO_ParametersPerBand_beamReportTiming_scs_30kHz.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_beamReportTiming_scs_30kHz valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sym4();
         case 1: return sym8();
         case 2: return sym14();
         case 3: return sym28();
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
      buffer.invokeCharacters (MIMO_ParametersPerBand_beamReportTiming_scs_30kHz.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sym4");
         case 1: return ("sym8");
         case 2: return ("sym14");
         case 3: return ("sym28");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
