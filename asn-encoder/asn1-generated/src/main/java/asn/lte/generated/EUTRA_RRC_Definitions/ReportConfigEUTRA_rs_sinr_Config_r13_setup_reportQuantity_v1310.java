/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RSRPANDSINR = 0;
   public static final int _RSRQANDSINR = 1;
   public static final int _ALL = 2;

   // Singleton instances of ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310
   protected static final ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 _rsrpANDsinr = new ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310(0);
   protected static final ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 _rsrqANDsinr = new ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310(1);
   protected static final ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 _all = new ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rsrpANDsinr.
    */
   public static ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 rsrpANDsinr() {
      return _rsrpANDsinr;
   }

   /**
    * Singleton accessor method for rsrqANDsinr.
    */
   public static ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 rsrqANDsinr() {
      return _rsrqANDsinr;
   }

   /**
    * Singleton accessor method for all.
    */
   public static ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 all() {
      return _all;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310.valueOf( ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rsrpANDsinr();
         case 1: return rsrqANDsinr();
         case 2: return all();
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
      buffer.invokeCharacters (ReportConfigEUTRA_rs_sinr_Config_r13_setup_reportQuantity_v1310.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rsrpANDsinr");
         case 1: return ("rsrqANDsinr");
         case 2: return ("all");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
