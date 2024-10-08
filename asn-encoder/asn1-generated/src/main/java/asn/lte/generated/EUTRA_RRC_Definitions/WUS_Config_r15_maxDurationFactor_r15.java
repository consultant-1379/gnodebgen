/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WUS_Config_r15_maxDurationFactor_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ONE32TH = 0;
   public static final int _ONE16TH = 1;
   public static final int _ONE8TH = 2;
   public static final int _ONE4TH = 3;

   // Singleton instances of WUS_Config_r15_maxDurationFactor_r15
   protected static final WUS_Config_r15_maxDurationFactor_r15 _one32th = new WUS_Config_r15_maxDurationFactor_r15(0);
   protected static final WUS_Config_r15_maxDurationFactor_r15 _one16th = new WUS_Config_r15_maxDurationFactor_r15(1);
   protected static final WUS_Config_r15_maxDurationFactor_r15 _one8th = new WUS_Config_r15_maxDurationFactor_r15(2);
   protected static final WUS_Config_r15_maxDurationFactor_r15 _one4th = new WUS_Config_r15_maxDurationFactor_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected WUS_Config_r15_maxDurationFactor_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for one32th.
    */
   public static WUS_Config_r15_maxDurationFactor_r15 one32th() {
      return _one32th;
   }

   /**
    * Singleton accessor method for one16th.
    */
   public static WUS_Config_r15_maxDurationFactor_r15 one16th() {
      return _one16th;
   }

   /**
    * Singleton accessor method for one8th.
    */
   public static WUS_Config_r15_maxDurationFactor_r15 one8th() {
      return _one8th;
   }

   /**
    * Singleton accessor method for one4th.
    */
   public static WUS_Config_r15_maxDurationFactor_r15 one4th() {
      return _one4th;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return WUS_Config_r15_maxDurationFactor_r15.valueOf( WUS_Config_r15_maxDurationFactor_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static WUS_Config_r15_maxDurationFactor_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return one32th();
         case 1: return one16th();
         case 2: return one8th();
         case 3: return one4th();
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
      buffer.invokeCharacters (WUS_Config_r15_maxDurationFactor_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("one32th");
         case 1: return ("one16th");
         case 2: return ("one8th");
         case 3: return ("one4th");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
