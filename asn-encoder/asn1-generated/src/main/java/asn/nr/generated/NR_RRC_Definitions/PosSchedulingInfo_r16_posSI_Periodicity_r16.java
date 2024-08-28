/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PosSchedulingInfo_r16_posSI_Periodicity_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF8 = 0;
   public static final int _RF16 = 1;
   public static final int _RF32 = 2;
   public static final int _RF64 = 3;
   public static final int _RF128 = 4;
   public static final int _RF256 = 5;
   public static final int _RF512 = 6;

   // Singleton instances of PosSchedulingInfo_r16_posSI_Periodicity_r16
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf8 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(0);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf16 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(1);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf32 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(2);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf64 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(3);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf128 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(4);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf256 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(5);
   protected static final PosSchedulingInfo_r16_posSI_Periodicity_r16 _rf512 = new PosSchedulingInfo_r16_posSI_Periodicity_r16(6);

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
   protected PosSchedulingInfo_r16_posSI_Periodicity_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf8.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf8() {
      return _rf8;
   }

   /**
    * Singleton accessor method for rf16.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf16() {
      return _rf16;
   }

   /**
    * Singleton accessor method for rf32.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf32() {
      return _rf32;
   }

   /**
    * Singleton accessor method for rf64.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf64() {
      return _rf64;
   }

   /**
    * Singleton accessor method for rf128.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf128() {
      return _rf128;
   }

   /**
    * Singleton accessor method for rf256.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf256() {
      return _rf256;
   }

   /**
    * Singleton accessor method for rf512.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 rf512() {
      return _rf512;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PosSchedulingInfo_r16_posSI_Periodicity_r16.valueOf( PosSchedulingInfo_r16_posSI_Periodicity_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PosSchedulingInfo_r16_posSI_Periodicity_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf8();
         case 1: return rf16();
         case 2: return rf32();
         case 3: return rf64();
         case 4: return rf128();
         case 5: return rf256();
         case 6: return rf512();
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
      buffer.invokeCharacters (PosSchedulingInfo_r16_posSI_Periodicity_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* rf8 */break;
         case 1: ui = 1; /* rf16 */break;
         case 2: ui = 2; /* rf32 */break;
         case 3: ui = 3; /* rf64 */break;
         case 4: ui = 4; /* rf128 */break;
         case 5: ui = 5; /* rf256 */break;
         case 6: ui = 6; /* rf512 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 7);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf8");
         case 1: return ("rf16");
         case 2: return ("rf32");
         case 3: return ("rf64");
         case 4: return ("rf128");
         case 5: return ("rf256");
         case 6: return ("rf512");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
