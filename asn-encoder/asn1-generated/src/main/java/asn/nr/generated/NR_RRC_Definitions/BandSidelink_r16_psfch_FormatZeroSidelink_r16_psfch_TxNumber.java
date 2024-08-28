/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N4 = 0;
   public static final int _N8 = 1;
   public static final int _N16 = 2;

   // Singleton instances of BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber
   protected static final BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber _n4 = new BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber(0);
   protected static final BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber _n8 = new BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber(1);
   protected static final BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber _n16 = new BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber n16() {
      return _n16;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber.valueOf( BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n4();
         case 1: return n8();
         case 2: return n16();
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
      buffer.invokeCharacters (BandSidelink_r16_psfch_FormatZeroSidelink_r16_psfch_TxNumber.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n4 */break;
         case 1: ui = 1; /* n8 */break;
         case 2: ui = 2; /* n16 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n4");
         case 1: return ("n8");
         case 2: return ("n16");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
