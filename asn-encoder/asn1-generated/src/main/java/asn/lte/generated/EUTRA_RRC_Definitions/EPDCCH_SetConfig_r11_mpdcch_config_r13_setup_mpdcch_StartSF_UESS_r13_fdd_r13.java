/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _V1 = 0;
   public static final int _V1DOT5 = 1;
   public static final int _V2 = 2;
   public static final int _V2DOT5 = 3;
   public static final int _V4 = 4;
   public static final int _V5 = 5;
   public static final int _V8 = 6;
   public static final int _V10 = 7;

   // Singleton instances of EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v1 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(0);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v1dot5 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(1);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v2 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(2);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v2dot5 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(3);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v4 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(4);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v5 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(5);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v8 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(6);
   protected static final EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 _v10 = new EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13(7);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    */
   protected EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for v1.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v1() {
      return _v1;
   }

   /**
    * Singleton accessor method for v1dot5.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v1dot5() {
      return _v1dot5;
   }

   /**
    * Singleton accessor method for v2.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v2() {
      return _v2;
   }

   /**
    * Singleton accessor method for v2dot5.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v2dot5() {
      return _v2dot5;
   }

   /**
    * Singleton accessor method for v4.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v4() {
      return _v4;
   }

   /**
    * Singleton accessor method for v5.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v5() {
      return _v5;
   }

   /**
    * Singleton accessor method for v8.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v8() {
      return _v8;
   }

   /**
    * Singleton accessor method for v10.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 v10() {
      return _v10;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13.valueOf( EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return v1();
         case 1: return v1dot5();
         case 2: return v2();
         case 3: return v2dot5();
         case 4: return v4();
         case 5: return v5();
         case 6: return v8();
         case 7: return v10();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EPDCCH_SetConfig_r11_mpdcch_config_r13_setup_mpdcch_StartSF_UESS_r13_fdd_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("v1");
         case 1: return ("v1dot5");
         case 2: return ("v2");
         case 3: return ("v2dot5");
         case 4: return ("v4");
         case 5: return ("v5");
         case 6: return ("v8");
         case 7: return ("v10");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
