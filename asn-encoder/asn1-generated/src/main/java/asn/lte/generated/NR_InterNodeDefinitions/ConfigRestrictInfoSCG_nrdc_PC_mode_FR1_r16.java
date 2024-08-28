/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SEMI_STATIC_MODE1 = 0;
   public static final int _SEMI_STATIC_MODE2 = 1;
   public static final int _DYNAMIC = 2;

   // Singleton instances of ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16
   protected static final ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 _semi_static_mode1 = new ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16(0);
   protected static final ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 _semi_static_mode2 = new ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16(1);
   protected static final ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 _dynamic = new ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for semi_static_mode1.
    */
   public static ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 semi_static_mode1() {
      return _semi_static_mode1;
   }

   /**
    * Singleton accessor method for semi_static_mode2.
    */
   public static ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 semi_static_mode2() {
      return _semi_static_mode2;
   }

   /**
    * Singleton accessor method for dynamic.
    */
   public static ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 dynamic() {
      return _dynamic;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16.valueOf( ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return semi_static_mode1();
         case 1: return semi_static_mode2();
         case 2: return dynamic();
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
      buffer.invokeCharacters (ConfigRestrictInfoSCG_nrdc_PC_mode_FR1_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("semi-static-mode1");
         case 1: return ("semi-static-mode2");
         case 2: return ("dynamic");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
