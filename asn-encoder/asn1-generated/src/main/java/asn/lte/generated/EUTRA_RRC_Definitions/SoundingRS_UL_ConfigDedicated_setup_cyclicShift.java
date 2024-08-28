/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SoundingRS_UL_ConfigDedicated_setup_cyclicShift extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _CS0 = 0;
   public static final int _CS1 = 1;
   public static final int _CS2 = 2;
   public static final int _CS3 = 3;
   public static final int _CS4 = 4;
   public static final int _CS5 = 5;
   public static final int _CS6 = 6;
   public static final int _CS7 = 7;

   // Singleton instances of SoundingRS_UL_ConfigDedicated_setup_cyclicShift
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs0 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(0);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs1 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(1);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs2 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(2);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs3 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(3);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs4 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(4);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs5 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(5);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs6 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(6);
   protected static final SoundingRS_UL_ConfigDedicated_setup_cyclicShift _cs7 = new SoundingRS_UL_ConfigDedicated_setup_cyclicShift(7);

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
    *   7
    */
   protected SoundingRS_UL_ConfigDedicated_setup_cyclicShift (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for cs0.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs0() {
      return _cs0;
   }

   /**
    * Singleton accessor method for cs1.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs1() {
      return _cs1;
   }

   /**
    * Singleton accessor method for cs2.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs2() {
      return _cs2;
   }

   /**
    * Singleton accessor method for cs3.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs3() {
      return _cs3;
   }

   /**
    * Singleton accessor method for cs4.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs4() {
      return _cs4;
   }

   /**
    * Singleton accessor method for cs5.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs5() {
      return _cs5;
   }

   /**
    * Singleton accessor method for cs6.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs6() {
      return _cs6;
   }

   /**
    * Singleton accessor method for cs7.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift cs7() {
      return _cs7;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SoundingRS_UL_ConfigDedicated_setup_cyclicShift.valueOf( SoundingRS_UL_ConfigDedicated_setup_cyclicShift.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SoundingRS_UL_ConfigDedicated_setup_cyclicShift valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return cs0();
         case 1: return cs1();
         case 2: return cs2();
         case 3: return cs3();
         case 4: return cs4();
         case 5: return cs5();
         case 6: return cs6();
         case 7: return cs7();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SoundingRS_UL_ConfigDedicated_setup_cyclicShift.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("cs0");
         case 1: return ("cs1");
         case 2: return ("cs2");
         case 3: return ("cs3");
         case 4: return ("cs4");
         case 5: return ("cs5");
         case 6: return ("cs6");
         case 7: return ("cs7");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
