/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class NSSS_NumOccasionDifferentPrecoder extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NSSS-NumOccasionDifferentPrecoder";
   }

   // Integer constants for switch-case
   public static final int _TWO = 0;
   public static final int _FOUR = 1;
   public static final int _EIGHT = 2;

   // Singleton instances of NSSS_NumOccasionDifferentPrecoder
   protected static final NSSS_NumOccasionDifferentPrecoder _two = new NSSS_NumOccasionDifferentPrecoder(0);
   protected static final NSSS_NumOccasionDifferentPrecoder _four = new NSSS_NumOccasionDifferentPrecoder(1);
   protected static final NSSS_NumOccasionDifferentPrecoder _eight = new NSSS_NumOccasionDifferentPrecoder(2);
   private static NSSS_NumOccasionDifferentPrecoder __undefined = new NSSS_NumOccasionDifferentPrecoder(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected NSSS_NumOccasionDifferentPrecoder (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for two.
    */
   public static NSSS_NumOccasionDifferentPrecoder two() {
      return _two;
   }

   /**
    * Singleton accessor method for four.
    */
   public static NSSS_NumOccasionDifferentPrecoder four() {
      return _four;
   }

   /**
    * Singleton accessor method for eight.
    */
   public static NSSS_NumOccasionDifferentPrecoder eight() {
      return _eight;
   }

   /** Undefined value. */
   protected static NSSS_NumOccasionDifferentPrecoder __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NSSS_NumOccasionDifferentPrecoder.valueOf( NSSS_NumOccasionDifferentPrecoder.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NSSS_NumOccasionDifferentPrecoder valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return two();
         case 1: return four();
         case 2: return eight();
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
         ui = (int) buffer.decodeConsWholeNumber (3);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (NSSS_NumOccasionDifferentPrecoder.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("two");
         case 1: return ("four");
         case 2: return ("eight");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
