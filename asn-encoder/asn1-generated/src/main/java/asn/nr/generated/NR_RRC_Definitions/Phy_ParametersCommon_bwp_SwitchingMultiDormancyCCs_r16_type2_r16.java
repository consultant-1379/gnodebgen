/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _US200 = 0;
   public static final int _US400 = 1;
   public static final int _US800 = 2;
   public static final int _US1000 = 3;

   // Singleton instances of Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16
   protected static final Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 _us200 = new Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16(0);
   protected static final Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 _us400 = new Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16(1);
   protected static final Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 _us800 = new Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16(2);
   protected static final Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 _us1000 = new Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for us200.
    */
   public static Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 us200() {
      return _us200;
   }

   /**
    * Singleton accessor method for us400.
    */
   public static Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 us400() {
      return _us400;
   }

   /**
    * Singleton accessor method for us800.
    */
   public static Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 us800() {
      return _us800;
   }

   /**
    * Singleton accessor method for us1000.
    */
   public static Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 us1000() {
      return _us1000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16.valueOf( Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return us200();
         case 1: return us400();
         case 2: return us800();
         case 3: return us1000();
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
      buffer.invokeCharacters (Phy_ParametersCommon_bwp_SwitchingMultiDormancyCCs_r16_type2_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* us200 */break;
         case 1: ui = 1; /* us400 */break;
         case 2: ui = 2; /* us800 */break;
         case 3: ui = 3; /* us1000 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("us200");
         case 1: return ("us400");
         case 2: return ("us800");
         case 3: return ("us1000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
