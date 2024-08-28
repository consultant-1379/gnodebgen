/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_MaxCodeRate extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUCCH-MaxCodeRate";
   }

   // Integer constants for switch-case
   public static final int _ZERODOT08 = 0;
   public static final int _ZERODOT15 = 1;
   public static final int _ZERODOT25 = 2;
   public static final int _ZERODOT35 = 3;
   public static final int _ZERODOT45 = 4;
   public static final int _ZERODOT60 = 5;
   public static final int _ZERODOT80 = 6;

   // Singleton instances of PUCCH_MaxCodeRate
   protected static final PUCCH_MaxCodeRate _zeroDot08 = new PUCCH_MaxCodeRate(0);
   protected static final PUCCH_MaxCodeRate _zeroDot15 = new PUCCH_MaxCodeRate(1);
   protected static final PUCCH_MaxCodeRate _zeroDot25 = new PUCCH_MaxCodeRate(2);
   protected static final PUCCH_MaxCodeRate _zeroDot35 = new PUCCH_MaxCodeRate(3);
   protected static final PUCCH_MaxCodeRate _zeroDot45 = new PUCCH_MaxCodeRate(4);
   protected static final PUCCH_MaxCodeRate _zeroDot60 = new PUCCH_MaxCodeRate(5);
   protected static final PUCCH_MaxCodeRate _zeroDot80 = new PUCCH_MaxCodeRate(6);

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
    */
   protected PUCCH_MaxCodeRate (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for zeroDot08.
    */
   public static PUCCH_MaxCodeRate zeroDot08() {
      return _zeroDot08;
   }

   /**
    * Singleton accessor method for zeroDot15.
    */
   public static PUCCH_MaxCodeRate zeroDot15() {
      return _zeroDot15;
   }

   /**
    * Singleton accessor method for zeroDot25.
    */
   public static PUCCH_MaxCodeRate zeroDot25() {
      return _zeroDot25;
   }

   /**
    * Singleton accessor method for zeroDot35.
    */
   public static PUCCH_MaxCodeRate zeroDot35() {
      return _zeroDot35;
   }

   /**
    * Singleton accessor method for zeroDot45.
    */
   public static PUCCH_MaxCodeRate zeroDot45() {
      return _zeroDot45;
   }

   /**
    * Singleton accessor method for zeroDot60.
    */
   public static PUCCH_MaxCodeRate zeroDot60() {
      return _zeroDot60;
   }

   /**
    * Singleton accessor method for zeroDot80.
    */
   public static PUCCH_MaxCodeRate zeroDot80() {
      return _zeroDot80;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PUCCH_MaxCodeRate.valueOf( PUCCH_MaxCodeRate.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PUCCH_MaxCodeRate valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return zeroDot08();
         case 1: return zeroDot15();
         case 2: return zeroDot25();
         case 3: return zeroDot35();
         case 4: return zeroDot45();
         case 5: return zeroDot60();
         case 6: return zeroDot80();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (7);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PUCCH_MaxCodeRate.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("zeroDot08");
         case 1: return ("zeroDot15");
         case 2: return ("zeroDot25");
         case 3: return ("zeroDot35");
         case 4: return ("zeroDot45");
         case 5: return ("zeroDot60");
         case 6: return ("zeroDot80");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
