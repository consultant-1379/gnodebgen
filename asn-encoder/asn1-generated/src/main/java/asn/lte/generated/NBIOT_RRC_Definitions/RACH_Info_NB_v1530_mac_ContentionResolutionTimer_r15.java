/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PP1 = 0;
   public static final int _PP2 = 1;
   public static final int _PP3 = 2;
   public static final int _PP4 = 3;
   public static final int _PP8 = 4;
   public static final int _PP16 = 5;
   public static final int _PP32 = 6;
   public static final int _PP64 = 7;

   // Singleton instances of RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp1 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(0);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp2 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(1);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp3 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(2);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp4 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(3);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp8 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(4);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp16 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(5);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp32 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(6);
   protected static final RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 _pp64 = new RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15(7);

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
   protected RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for pp1.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp1() {
      return _pp1;
   }

   /**
    * Singleton accessor method for pp2.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp2() {
      return _pp2;
   }

   /**
    * Singleton accessor method for pp3.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp3() {
      return _pp3;
   }

   /**
    * Singleton accessor method for pp4.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp4() {
      return _pp4;
   }

   /**
    * Singleton accessor method for pp8.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp8() {
      return _pp8;
   }

   /**
    * Singleton accessor method for pp16.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp16() {
      return _pp16;
   }

   /**
    * Singleton accessor method for pp32.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp32() {
      return _pp32;
   }

   /**
    * Singleton accessor method for pp64.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 pp64() {
      return _pp64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15.valueOf( RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return pp1();
         case 1: return pp2();
         case 2: return pp3();
         case 3: return pp4();
         case 4: return pp8();
         case 5: return pp16();
         case 6: return pp32();
         case 7: return pp64();
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
      buffer.invokeCharacters (RACH_Info_NB_v1530_mac_ContentionResolutionTimer_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("pp1");
         case 1: return ("pp2");
         case 2: return ("pp3");
         case 3: return ("pp4");
         case 4: return ("pp8");
         case 5: return ("pp16");
         case 6: return ("pp32");
         case 7: return ("pp64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
