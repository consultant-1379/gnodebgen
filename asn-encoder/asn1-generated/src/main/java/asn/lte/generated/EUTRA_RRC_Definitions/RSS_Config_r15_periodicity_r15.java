/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RSS_Config_r15_periodicity_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS160 = 0;
   public static final int _MS320 = 1;
   public static final int _MS640 = 2;
   public static final int _MS1280 = 3;

   // Singleton instances of RSS_Config_r15_periodicity_r15
   protected static final RSS_Config_r15_periodicity_r15 _ms160 = new RSS_Config_r15_periodicity_r15(0);
   protected static final RSS_Config_r15_periodicity_r15 _ms320 = new RSS_Config_r15_periodicity_r15(1);
   protected static final RSS_Config_r15_periodicity_r15 _ms640 = new RSS_Config_r15_periodicity_r15(2);
   protected static final RSS_Config_r15_periodicity_r15 _ms1280 = new RSS_Config_r15_periodicity_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected RSS_Config_r15_periodicity_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms160.
    */
   public static RSS_Config_r15_periodicity_r15 ms160() {
      return _ms160;
   }

   /**
    * Singleton accessor method for ms320.
    */
   public static RSS_Config_r15_periodicity_r15 ms320() {
      return _ms320;
   }

   /**
    * Singleton accessor method for ms640.
    */
   public static RSS_Config_r15_periodicity_r15 ms640() {
      return _ms640;
   }

   /**
    * Singleton accessor method for ms1280.
    */
   public static RSS_Config_r15_periodicity_r15 ms1280() {
      return _ms1280;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RSS_Config_r15_periodicity_r15.valueOf( RSS_Config_r15_periodicity_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RSS_Config_r15_periodicity_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms160();
         case 1: return ms320();
         case 2: return ms640();
         case 3: return ms1280();
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
      buffer.invokeCharacters (RSS_Config_r15_periodicity_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms160");
         case 1: return ("ms320");
         case 2: return ("ms640");
         case 3: return ("ms1280");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
