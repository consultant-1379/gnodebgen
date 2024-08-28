/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SpecialSubframePatterns extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SpecialSubframePatterns";
   }

   // Integer constants for switch-case
   public static final int _SSP0 = 0;
   public static final int _SSP1 = 1;
   public static final int _SSP2 = 2;
   public static final int _SSP3 = 3;
   public static final int _SSP4 = 4;
   public static final int _SSP5 = 5;
   public static final int _SSP6 = 6;
   public static final int _SSP7 = 7;
   public static final int _SSP8 = 8;

   // Singleton instances of SpecialSubframePatterns
   protected static final SpecialSubframePatterns _ssp0 = new SpecialSubframePatterns(0);
   protected static final SpecialSubframePatterns _ssp1 = new SpecialSubframePatterns(1);
   protected static final SpecialSubframePatterns _ssp2 = new SpecialSubframePatterns(2);
   protected static final SpecialSubframePatterns _ssp3 = new SpecialSubframePatterns(3);
   protected static final SpecialSubframePatterns _ssp4 = new SpecialSubframePatterns(4);
   protected static final SpecialSubframePatterns _ssp5 = new SpecialSubframePatterns(5);
   protected static final SpecialSubframePatterns _ssp6 = new SpecialSubframePatterns(6);
   protected static final SpecialSubframePatterns _ssp7 = new SpecialSubframePatterns(7);
   protected static final SpecialSubframePatterns _ssp8 = new SpecialSubframePatterns(8);
   private static SpecialSubframePatterns __undefined = new SpecialSubframePatterns(-999);

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
    */
   protected SpecialSubframePatterns (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ssp0.
    */
   public static SpecialSubframePatterns ssp0() {
      return _ssp0;
   }

   /**
    * Singleton accessor method for ssp1.
    */
   public static SpecialSubframePatterns ssp1() {
      return _ssp1;
   }

   /**
    * Singleton accessor method for ssp2.
    */
   public static SpecialSubframePatterns ssp2() {
      return _ssp2;
   }

   /**
    * Singleton accessor method for ssp3.
    */
   public static SpecialSubframePatterns ssp3() {
      return _ssp3;
   }

   /**
    * Singleton accessor method for ssp4.
    */
   public static SpecialSubframePatterns ssp4() {
      return _ssp4;
   }

   /**
    * Singleton accessor method for ssp5.
    */
   public static SpecialSubframePatterns ssp5() {
      return _ssp5;
   }

   /**
    * Singleton accessor method for ssp6.
    */
   public static SpecialSubframePatterns ssp6() {
      return _ssp6;
   }

   /**
    * Singleton accessor method for ssp7.
    */
   public static SpecialSubframePatterns ssp7() {
      return _ssp7;
   }

   /**
    * Singleton accessor method for ssp8.
    */
   public static SpecialSubframePatterns ssp8() {
      return _ssp8;
   }

   /** Undefined value. */
   protected static SpecialSubframePatterns __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SpecialSubframePatterns.valueOf( SpecialSubframePatterns.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SpecialSubframePatterns valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return ssp0();
         case 1: return ssp1();
         case 2: return ssp2();
         case 3: return ssp3();
         case 4: return ssp4();
         case 5: return ssp5();
         case 6: return ssp6();
         case 7: return ssp7();
         case 8: return ssp8();
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
         ui = (int) buffer.decodeConsWholeNumber (9);

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
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SpecialSubframePatterns.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ssp0");
         case 1: return ("ssp1");
         case 2: return ("ssp2");
         case 3: return ("ssp3");
         case 4: return ("ssp4");
         case 5: return ("ssp5");
         case 6: return ("ssp6");
         case 7: return ("ssp7");
         case 8: return ("ssp8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
