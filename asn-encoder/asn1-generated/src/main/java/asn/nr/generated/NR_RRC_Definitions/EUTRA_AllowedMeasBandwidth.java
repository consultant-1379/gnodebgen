/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EUTRA_AllowedMeasBandwidth extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EUTRA-AllowedMeasBandwidth";
   }

   // Integer constants for switch-case
   public static final int _MBW6 = 0;
   public static final int _MBW15 = 1;
   public static final int _MBW25 = 2;
   public static final int _MBW50 = 3;
   public static final int _MBW75 = 4;
   public static final int _MBW100 = 5;

   // Singleton instances of EUTRA_AllowedMeasBandwidth
   protected static final EUTRA_AllowedMeasBandwidth _mbw6 = new EUTRA_AllowedMeasBandwidth(0);
   protected static final EUTRA_AllowedMeasBandwidth _mbw15 = new EUTRA_AllowedMeasBandwidth(1);
   protected static final EUTRA_AllowedMeasBandwidth _mbw25 = new EUTRA_AllowedMeasBandwidth(2);
   protected static final EUTRA_AllowedMeasBandwidth _mbw50 = new EUTRA_AllowedMeasBandwidth(3);
   protected static final EUTRA_AllowedMeasBandwidth _mbw75 = new EUTRA_AllowedMeasBandwidth(4);
   protected static final EUTRA_AllowedMeasBandwidth _mbw100 = new EUTRA_AllowedMeasBandwidth(5);

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
   protected EUTRA_AllowedMeasBandwidth (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mbw6.
    */
   public static EUTRA_AllowedMeasBandwidth mbw6() {
      return _mbw6;
   }

   /**
    * Singleton accessor method for mbw15.
    */
   public static EUTRA_AllowedMeasBandwidth mbw15() {
      return _mbw15;
   }

   /**
    * Singleton accessor method for mbw25.
    */
   public static EUTRA_AllowedMeasBandwidth mbw25() {
      return _mbw25;
   }

   /**
    * Singleton accessor method for mbw50.
    */
   public static EUTRA_AllowedMeasBandwidth mbw50() {
      return _mbw50;
   }

   /**
    * Singleton accessor method for mbw75.
    */
   public static EUTRA_AllowedMeasBandwidth mbw75() {
      return _mbw75;
   }

   /**
    * Singleton accessor method for mbw100.
    */
   public static EUTRA_AllowedMeasBandwidth mbw100() {
      return _mbw100;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EUTRA_AllowedMeasBandwidth.valueOf( EUTRA_AllowedMeasBandwidth.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EUTRA_AllowedMeasBandwidth valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mbw6();
         case 1: return mbw15();
         case 2: return mbw25();
         case 3: return mbw50();
         case 4: return mbw75();
         case 5: return mbw100();
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
      buffer.invokeCharacters (EUTRA_AllowedMeasBandwidth.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* mbw6 */break;
         case 1: ui = 1; /* mbw15 */break;
         case 2: ui = 2; /* mbw25 */break;
         case 3: ui = 3; /* mbw50 */break;
         case 4: ui = 4; /* mbw75 */break;
         case 5: ui = 5; /* mbw100 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 6);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mbw6");
         case 1: return ("mbw15");
         case 2: return ("mbw25");
         case 3: return ("mbw50");
         case 4: return ("mbw75");
         case 5: return ("mbw100");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
