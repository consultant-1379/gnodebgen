/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FreqSeparationClassDL_v1620 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FreqSeparationClassDL-v1620";
   }

   // Integer constants for switch-case
   public static final int _MHZ1000 = 0;
   public static final int _MHZ1600 = 1;
   public static final int _MHZ1800 = 2;
   public static final int _MHZ2000 = 3;
   public static final int _MHZ2200 = 4;
   public static final int _MHZ2400 = 5;

   // Singleton instances of FreqSeparationClassDL_v1620
   protected static final FreqSeparationClassDL_v1620 _mhz1000 = new FreqSeparationClassDL_v1620(0);
   protected static final FreqSeparationClassDL_v1620 _mhz1600 = new FreqSeparationClassDL_v1620(1);
   protected static final FreqSeparationClassDL_v1620 _mhz1800 = new FreqSeparationClassDL_v1620(2);
   protected static final FreqSeparationClassDL_v1620 _mhz2000 = new FreqSeparationClassDL_v1620(3);
   protected static final FreqSeparationClassDL_v1620 _mhz2200 = new FreqSeparationClassDL_v1620(4);
   protected static final FreqSeparationClassDL_v1620 _mhz2400 = new FreqSeparationClassDL_v1620(5);

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
   protected FreqSeparationClassDL_v1620 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mhz1000.
    */
   public static FreqSeparationClassDL_v1620 mhz1000() {
      return _mhz1000;
   }

   /**
    * Singleton accessor method for mhz1600.
    */
   public static FreqSeparationClassDL_v1620 mhz1600() {
      return _mhz1600;
   }

   /**
    * Singleton accessor method for mhz1800.
    */
   public static FreqSeparationClassDL_v1620 mhz1800() {
      return _mhz1800;
   }

   /**
    * Singleton accessor method for mhz2000.
    */
   public static FreqSeparationClassDL_v1620 mhz2000() {
      return _mhz2000;
   }

   /**
    * Singleton accessor method for mhz2200.
    */
   public static FreqSeparationClassDL_v1620 mhz2200() {
      return _mhz2200;
   }

   /**
    * Singleton accessor method for mhz2400.
    */
   public static FreqSeparationClassDL_v1620 mhz2400() {
      return _mhz2400;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FreqSeparationClassDL_v1620.valueOf( FreqSeparationClassDL_v1620.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FreqSeparationClassDL_v1620 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mhz1000();
         case 1: return mhz1600();
         case 2: return mhz1800();
         case 3: return mhz2000();
         case 4: return mhz2200();
         case 5: return mhz2400();
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
      buffer.invokeCharacters (FreqSeparationClassDL_v1620.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mhz1000");
         case 1: return ("mhz1600");
         case 2: return ("mhz1800");
         case 3: return ("mhz2000");
         case 4: return ("mhz2200");
         case 5: return ("mhz2400");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
