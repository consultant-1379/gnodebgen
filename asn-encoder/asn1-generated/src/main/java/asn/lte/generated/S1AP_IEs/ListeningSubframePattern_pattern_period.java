/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ListeningSubframePattern_pattern_period extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS1280 = 0;
   public static final int _MS2560 = 1;
   public static final int _MS5120 = 2;
   public static final int _MS10240 = 3;

   // Singleton instances of ListeningSubframePattern_pattern_period
   protected static final ListeningSubframePattern_pattern_period _ms1280 = new ListeningSubframePattern_pattern_period(0);
   protected static final ListeningSubframePattern_pattern_period _ms2560 = new ListeningSubframePattern_pattern_period(1);
   protected static final ListeningSubframePattern_pattern_period _ms5120 = new ListeningSubframePattern_pattern_period(2);
   protected static final ListeningSubframePattern_pattern_period _ms10240 = new ListeningSubframePattern_pattern_period(3);
   private static ListeningSubframePattern_pattern_period __undefined = new ListeningSubframePattern_pattern_period(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected ListeningSubframePattern_pattern_period (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1280.
    */
   public static ListeningSubframePattern_pattern_period ms1280() {
      return _ms1280;
   }

   /**
    * Singleton accessor method for ms2560.
    */
   public static ListeningSubframePattern_pattern_period ms2560() {
      return _ms2560;
   }

   /**
    * Singleton accessor method for ms5120.
    */
   public static ListeningSubframePattern_pattern_period ms5120() {
      return _ms5120;
   }

   /**
    * Singleton accessor method for ms10240.
    */
   public static ListeningSubframePattern_pattern_period ms10240() {
      return _ms10240;
   }

   /** Undefined value. */
   protected static ListeningSubframePattern_pattern_period __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ListeningSubframePattern_pattern_period.valueOf( ListeningSubframePattern_pattern_period.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ListeningSubframePattern_pattern_period valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return ms1280();
         case 1: return ms2560();
         case 2: return ms5120();
         case 3: return ms10240();
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
         ui = (int) buffer.decodeConsWholeNumber (4);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ListeningSubframePattern_pattern_period.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1280");
         case 1: return ("ms2560");
         case 2: return ("ms5120");
         case 3: return ("ms10240");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
