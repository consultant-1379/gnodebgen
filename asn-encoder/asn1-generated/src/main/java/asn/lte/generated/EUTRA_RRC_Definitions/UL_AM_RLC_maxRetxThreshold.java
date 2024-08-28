/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_AM_RLC_maxRetxThreshold extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T1 = 0;
   public static final int _T2 = 1;
   public static final int _T3 = 2;
   public static final int _T4 = 3;
   public static final int _T6 = 4;
   public static final int _T8 = 5;
   public static final int _T16 = 6;
   public static final int _T32 = 7;

   // Singleton instances of UL_AM_RLC_maxRetxThreshold
   protected static final UL_AM_RLC_maxRetxThreshold _t1 = new UL_AM_RLC_maxRetxThreshold(0);
   protected static final UL_AM_RLC_maxRetxThreshold _t2 = new UL_AM_RLC_maxRetxThreshold(1);
   protected static final UL_AM_RLC_maxRetxThreshold _t3 = new UL_AM_RLC_maxRetxThreshold(2);
   protected static final UL_AM_RLC_maxRetxThreshold _t4 = new UL_AM_RLC_maxRetxThreshold(3);
   protected static final UL_AM_RLC_maxRetxThreshold _t6 = new UL_AM_RLC_maxRetxThreshold(4);
   protected static final UL_AM_RLC_maxRetxThreshold _t8 = new UL_AM_RLC_maxRetxThreshold(5);
   protected static final UL_AM_RLC_maxRetxThreshold _t16 = new UL_AM_RLC_maxRetxThreshold(6);
   protected static final UL_AM_RLC_maxRetxThreshold _t32 = new UL_AM_RLC_maxRetxThreshold(7);

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
   protected UL_AM_RLC_maxRetxThreshold (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t1.
    */
   public static UL_AM_RLC_maxRetxThreshold t1() {
      return _t1;
   }

   /**
    * Singleton accessor method for t2.
    */
   public static UL_AM_RLC_maxRetxThreshold t2() {
      return _t2;
   }

   /**
    * Singleton accessor method for t3.
    */
   public static UL_AM_RLC_maxRetxThreshold t3() {
      return _t3;
   }

   /**
    * Singleton accessor method for t4.
    */
   public static UL_AM_RLC_maxRetxThreshold t4() {
      return _t4;
   }

   /**
    * Singleton accessor method for t6.
    */
   public static UL_AM_RLC_maxRetxThreshold t6() {
      return _t6;
   }

   /**
    * Singleton accessor method for t8.
    */
   public static UL_AM_RLC_maxRetxThreshold t8() {
      return _t8;
   }

   /**
    * Singleton accessor method for t16.
    */
   public static UL_AM_RLC_maxRetxThreshold t16() {
      return _t16;
   }

   /**
    * Singleton accessor method for t32.
    */
   public static UL_AM_RLC_maxRetxThreshold t32() {
      return _t32;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UL_AM_RLC_maxRetxThreshold.valueOf( UL_AM_RLC_maxRetxThreshold.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UL_AM_RLC_maxRetxThreshold valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return t1();
         case 1: return t2();
         case 2: return t3();
         case 3: return t4();
         case 4: return t6();
         case 5: return t8();
         case 6: return t16();
         case 7: return t32();
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
      buffer.invokeCharacters (UL_AM_RLC_maxRetxThreshold.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("t1");
         case 1: return ("t2");
         case 2: return ("t3");
         case 3: return ("t4");
         case 4: return ("t6");
         case 5: return ("t8");
         case 6: return ("t16");
         case 7: return ("t32");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
