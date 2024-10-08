/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RSS_Config_r15_duration_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF8 = 0;
   public static final int _SF16 = 1;
   public static final int _SF32 = 2;
   public static final int _SF40 = 3;

   // Singleton instances of RSS_Config_r15_duration_r15
   protected static final RSS_Config_r15_duration_r15 _sf8 = new RSS_Config_r15_duration_r15(0);
   protected static final RSS_Config_r15_duration_r15 _sf16 = new RSS_Config_r15_duration_r15(1);
   protected static final RSS_Config_r15_duration_r15 _sf32 = new RSS_Config_r15_duration_r15(2);
   protected static final RSS_Config_r15_duration_r15 _sf40 = new RSS_Config_r15_duration_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected RSS_Config_r15_duration_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf8.
    */
   public static RSS_Config_r15_duration_r15 sf8() {
      return _sf8;
   }

   /**
    * Singleton accessor method for sf16.
    */
   public static RSS_Config_r15_duration_r15 sf16() {
      return _sf16;
   }

   /**
    * Singleton accessor method for sf32.
    */
   public static RSS_Config_r15_duration_r15 sf32() {
      return _sf32;
   }

   /**
    * Singleton accessor method for sf40.
    */
   public static RSS_Config_r15_duration_r15 sf40() {
      return _sf40;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RSS_Config_r15_duration_r15.valueOf( RSS_Config_r15_duration_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RSS_Config_r15_duration_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf8();
         case 1: return sf16();
         case 2: return sf32();
         case 3: return sf40();
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
      buffer.invokeCharacters (RSS_Config_r15_duration_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf8");
         case 1: return ("sf16");
         case 2: return ("sf32");
         case 3: return ("sf40");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
