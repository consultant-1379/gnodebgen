/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF8 = 0;
   public static final int _SF16 = 1;
   public static final int _SF24 = 2;
   public static final int _SF32 = 3;
   public static final int _SF40 = 4;
   public static final int _SF48 = 5;
   public static final int _SF56 = 6;
   public static final int _SF64 = 7;

   // Singleton instances of RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf8 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(0);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf16 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(1);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf24 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(2);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf32 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(3);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf40 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(4);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf48 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(5);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf56 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(6);
   protected static final RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 _sf64 = new RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16(7);

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
   protected RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf8.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf8() {
      return _sf8;
   }

   /**
    * Singleton accessor method for sf16.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf16() {
      return _sf16;
   }

   /**
    * Singleton accessor method for sf24.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf24() {
      return _sf24;
   }

   /**
    * Singleton accessor method for sf32.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf32() {
      return _sf32;
   }

   /**
    * Singleton accessor method for sf40.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf40() {
      return _sf40;
   }

   /**
    * Singleton accessor method for sf48.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf48() {
      return _sf48;
   }

   /**
    * Singleton accessor method for sf56.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf56() {
      return _sf56;
   }

   /**
    * Singleton accessor method for sf64.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 sf64() {
      return _sf64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16.valueOf( RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf8();
         case 1: return sf16();
         case 2: return sf24();
         case 3: return sf32();
         case 4: return sf40();
         case 5: return sf48();
         case 6: return sf56();
         case 7: return sf64();
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
      buffer.invokeCharacters (RACH_ConfigCommonTwoStepRA_r16_ra_ContentionResolutionTimer_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* sf8 */break;
         case 1: ui = 1; /* sf16 */break;
         case 2: ui = 2; /* sf24 */break;
         case 3: ui = 3; /* sf32 */break;
         case 4: ui = 4; /* sf40 */break;
         case 5: ui = 5; /* sf48 */break;
         case 6: ui = 6; /* sf56 */break;
         case 7: ui = 7; /* sf64 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf8");
         case 1: return ("sf16");
         case 2: return ("sf24");
         case 3: return ("sf32");
         case 4: return ("sf40");
         case 5: return ("sf48");
         case 6: return ("sf56");
         case 7: return ("sf64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
