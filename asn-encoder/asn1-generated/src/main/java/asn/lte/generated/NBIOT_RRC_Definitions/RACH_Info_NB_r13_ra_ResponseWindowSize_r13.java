/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_Info_NB_r13_ra_ResponseWindowSize_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PP2 = 0;
   public static final int _PP3 = 1;
   public static final int _PP4 = 2;
   public static final int _PP5 = 3;
   public static final int _PP6 = 4;
   public static final int _PP7 = 5;
   public static final int _PP8 = 6;
   public static final int _PP10 = 7;

   // Singleton instances of RACH_Info_NB_r13_ra_ResponseWindowSize_r13
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp2 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(0);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp3 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(1);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp4 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(2);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp5 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(3);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp6 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(4);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp7 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(5);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp8 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(6);
   protected static final RACH_Info_NB_r13_ra_ResponseWindowSize_r13 _pp10 = new RACH_Info_NB_r13_ra_ResponseWindowSize_r13(7);

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
   protected RACH_Info_NB_r13_ra_ResponseWindowSize_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for pp2.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp2() {
      return _pp2;
   }

   /**
    * Singleton accessor method for pp3.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp3() {
      return _pp3;
   }

   /**
    * Singleton accessor method for pp4.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp4() {
      return _pp4;
   }

   /**
    * Singleton accessor method for pp5.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp5() {
      return _pp5;
   }

   /**
    * Singleton accessor method for pp6.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp6() {
      return _pp6;
   }

   /**
    * Singleton accessor method for pp7.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp7() {
      return _pp7;
   }

   /**
    * Singleton accessor method for pp8.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp8() {
      return _pp8;
   }

   /**
    * Singleton accessor method for pp10.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 pp10() {
      return _pp10;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_Info_NB_r13_ra_ResponseWindowSize_r13.valueOf( RACH_Info_NB_r13_ra_ResponseWindowSize_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_Info_NB_r13_ra_ResponseWindowSize_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return pp2();
         case 1: return pp3();
         case 2: return pp4();
         case 3: return pp5();
         case 4: return pp6();
         case 5: return pp7();
         case 6: return pp8();
         case 7: return pp10();
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
      buffer.invokeCharacters (RACH_Info_NB_r13_ra_ResponseWindowSize_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("pp2");
         case 1: return ("pp3");
         case 2: return ("pp4");
         case 3: return ("pp5");
         case 4: return ("pp6");
         case 5: return ("pp7");
         case 6: return ("pp8");
         case 7: return ("pp10");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
