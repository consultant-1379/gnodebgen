/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PRESENT = 0;
   public static final int _ABSENT = 1;

   // Singleton instances of SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16
   protected static final SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 _present = new SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16(0);
   protected static final SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 _absent = new SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for present.
    */
   public static SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 present() {
      return _present;
   }

   /**
    * Singleton accessor method for absent.
    */
   public static SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 absent() {
      return _absent;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16.valueOf( SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return present();
         case 1: return absent();
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
      buffer.invokeCharacters (SL_SDAP_ConfigPC5_r16_sl_SDAP_Header_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* present */break;
         case 1: ui = 1; /* absent */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 2);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("present");
         case 1: return ("absent");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
