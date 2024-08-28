/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _CS8 = 0;
   public static final int _CS9 = 1;
   public static final int _CS10 = 2;
   public static final int _CS11 = 3;

   // Singleton instances of SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310
   protected static final SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 _cs8 = new SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310(0);
   protected static final SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 _cs9 = new SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310(1);
   protected static final SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 _cs10 = new SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310(2);
   protected static final SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 _cs11 = new SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for cs8.
    */
   public static SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cs8() {
      return _cs8;
   }

   /**
    * Singleton accessor method for cs9.
    */
   public static SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cs9() {
      return _cs9;
   }

   /**
    * Singleton accessor method for cs10.
    */
   public static SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cs10() {
      return _cs10;
   }

   /**
    * Singleton accessor method for cs11.
    */
   public static SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 cs11() {
      return _cs11;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310.valueOf( SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return cs8();
         case 1: return cs9();
         case 2: return cs10();
         case 3: return cs11();
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
      buffer.invokeCharacters (SoundingRS_UL_ConfigDedicated_v1310_setup_cyclicShift_v1310.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("cs8");
         case 1: return ("cs9");
         case 2: return ("cs10");
         case 3: return ("cs11");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
