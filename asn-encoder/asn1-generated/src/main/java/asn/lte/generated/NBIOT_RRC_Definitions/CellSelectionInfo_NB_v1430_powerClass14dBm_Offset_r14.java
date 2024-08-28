/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB_6 = 0;
   public static final int _DB_3 = 1;
   public static final int _DB3 = 2;
   public static final int _DB6 = 3;
   public static final int _DB9 = 4;
   public static final int _DB12 = 5;

   // Singleton instances of CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB_6 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(0);
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB_3 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(1);
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB3 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(2);
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB6 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(3);
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB9 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(4);
   protected static final CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 _dB12 = new CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14(5);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_3.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB_3() {
      return _dB_3;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB3() {
      return _dB3;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB6() {
      return _dB6;
   }

   /**
    * Singleton accessor method for dB9.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB9() {
      return _dB9;
   }

   /**
    * Singleton accessor method for dB12.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 dB12() {
      return _dB12;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14.valueOf( CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB_6();
         case 1: return dB_3();
         case 2: return dB3();
         case 3: return dB6();
         case 4: return dB9();
         case 5: return dB12();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (6);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CellSelectionInfo_NB_v1430_powerClass14dBm_Offset_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-6");
         case 1: return ("dB-3");
         case 2: return ("dB3");
         case 3: return ("dB6");
         case 4: return ("dB9");
         case 5: return ("dB12");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
