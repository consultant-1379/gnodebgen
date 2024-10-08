/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SL1 = 0;
   public static final int _SL2 = 1;
   public static final int _SL4 = 2;
   public static final int _SL8 = 3;
   public static final int _SL10 = 4;
   public static final int _SL20 = 5;
   public static final int _SL40 = 6;
   public static final int _SL80 = 7;
   public static final int _SL160 = 8;
   public static final int _SL320 = 9;

   // Singleton instances of RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl1 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(0);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl2 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(1);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl4 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(2);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl8 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(3);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl10 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(4);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl20 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(5);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl40 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(6);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl80 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(7);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl160 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(8);
   protected static final RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 _sl320 = new RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16(9);

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
    *   8
    *   9
    */
   protected RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sl1.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl1() {
      return _sl1;
   }

   /**
    * Singleton accessor method for sl2.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl2() {
      return _sl2;
   }

   /**
    * Singleton accessor method for sl4.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl4() {
      return _sl4;
   }

   /**
    * Singleton accessor method for sl8.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl8() {
      return _sl8;
   }

   /**
    * Singleton accessor method for sl10.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl10() {
      return _sl10;
   }

   /**
    * Singleton accessor method for sl20.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl20() {
      return _sl20;
   }

   /**
    * Singleton accessor method for sl40.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl40() {
      return _sl40;
   }

   /**
    * Singleton accessor method for sl80.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl80() {
      return _sl80;
   }

   /**
    * Singleton accessor method for sl160.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl160() {
      return _sl160;
   }

   /**
    * Singleton accessor method for sl320.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 sl320() {
      return _sl320;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16.valueOf( RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sl1();
         case 1: return sl2();
         case 2: return sl4();
         case 3: return sl8();
         case 4: return sl10();
         case 5: return sl20();
         case 6: return sl40();
         case 7: return sl80();
         case 8: return sl160();
         case 9: return sl320();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (10);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         case 8: ret =  8; break;
         case 9: ret =  9; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RACH_ConfigGenericTwoStepRA_r16_msgB_ResponseWindow_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* sl1 */break;
         case 1: ui = 1; /* sl2 */break;
         case 2: ui = 2; /* sl4 */break;
         case 3: ui = 3; /* sl8 */break;
         case 4: ui = 4; /* sl10 */break;
         case 5: ui = 5; /* sl20 */break;
         case 6: ui = 6; /* sl40 */break;
         case 7: ui = 7; /* sl80 */break;
         case 8: ui = 8; /* sl160 */break;
         case 9: ui = 9; /* sl320 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 10);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sl1");
         case 1: return ("sl2");
         case 2: return ("sl4");
         case 3: return ("sl8");
         case 4: return ("sl10");
         case 5: return ("sl20");
         case 6: return ("sl40");
         case 7: return ("sl80");
         case 8: return ("sl160");
         case 9: return ("sl320");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
