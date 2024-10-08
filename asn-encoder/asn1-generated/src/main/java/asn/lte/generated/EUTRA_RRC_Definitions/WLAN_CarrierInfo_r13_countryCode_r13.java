/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_CarrierInfo_r13_countryCode_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _UNITEDSTATES = 0;
   public static final int _EUROPE = 1;
   public static final int _JAPAN = 2;
   public static final int _GLOBAL = 3;

   // Singleton instances of WLAN_CarrierInfo_r13_countryCode_r13
   protected static final WLAN_CarrierInfo_r13_countryCode_r13 _unitedStates = new WLAN_CarrierInfo_r13_countryCode_r13(0);
   protected static final WLAN_CarrierInfo_r13_countryCode_r13 _europe = new WLAN_CarrierInfo_r13_countryCode_r13(1);
   protected static final WLAN_CarrierInfo_r13_countryCode_r13 _japan = new WLAN_CarrierInfo_r13_countryCode_r13(2);
   protected static final WLAN_CarrierInfo_r13_countryCode_r13 _global = new WLAN_CarrierInfo_r13_countryCode_r13(3);
   private static WLAN_CarrierInfo_r13_countryCode_r13 __undefined = new WLAN_CarrierInfo_r13_countryCode_r13(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected WLAN_CarrierInfo_r13_countryCode_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for unitedStates.
    */
   public static WLAN_CarrierInfo_r13_countryCode_r13 unitedStates() {
      return _unitedStates;
   }

   /**
    * Singleton accessor method for europe.
    */
   public static WLAN_CarrierInfo_r13_countryCode_r13 europe() {
      return _europe;
   }

   /**
    * Singleton accessor method for japan.
    */
   public static WLAN_CarrierInfo_r13_countryCode_r13 japan() {
      return _japan;
   }

   /**
    * Singleton accessor method for global.
    */
   public static WLAN_CarrierInfo_r13_countryCode_r13 global() {
      return _global;
   }

   /** Undefined value. */
   protected static WLAN_CarrierInfo_r13_countryCode_r13 __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return WLAN_CarrierInfo_r13_countryCode_r13.valueOf( WLAN_CarrierInfo_r13_countryCode_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static WLAN_CarrierInfo_r13_countryCode_r13 valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return unitedStates();
         case 1: return europe();
         case 2: return japan();
         case 3: return global();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         return 0x7fffffff;
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (4);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (WLAN_CarrierInfo_r13_countryCode_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("unitedStates");
         case 1: return ("europe");
         case 2: return ("japan");
         case 3: return ("global");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
