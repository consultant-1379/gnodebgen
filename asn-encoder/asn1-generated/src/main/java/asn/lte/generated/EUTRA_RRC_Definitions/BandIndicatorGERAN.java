/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandIndicatorGERAN extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandIndicatorGERAN";
   }

   // Integer constants for switch-case
   public static final int _DCS1800 = 0;
   public static final int _PCS1900 = 1;

   // Singleton instances of BandIndicatorGERAN
   protected static final BandIndicatorGERAN _dcs1800 = new BandIndicatorGERAN(0);
   protected static final BandIndicatorGERAN _pcs1900 = new BandIndicatorGERAN(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected BandIndicatorGERAN (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dcs1800.
    */
   public static BandIndicatorGERAN dcs1800() {
      return _dcs1800;
   }

   /**
    * Singleton accessor method for pcs1900.
    */
   public static BandIndicatorGERAN pcs1900() {
      return _pcs1900;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return BandIndicatorGERAN.valueOf( BandIndicatorGERAN.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static BandIndicatorGERAN valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dcs1800();
         case 1: return pcs1900();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (BandIndicatorGERAN.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dcs1800");
         case 1: return ("pcs1900");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
