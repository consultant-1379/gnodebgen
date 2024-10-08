/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TimeAlignmentTimer extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TimeAlignmentTimer";
   }

   // Integer constants for switch-case
   public static final int _SF500 = 0;
   public static final int _SF750 = 1;
   public static final int _SF1280 = 2;
   public static final int _SF1920 = 3;
   public static final int _SF2560 = 4;
   public static final int _SF5120 = 5;
   public static final int _SF10240 = 6;
   public static final int _INFINITY = 7;

   // Singleton instances of TimeAlignmentTimer
   protected static final TimeAlignmentTimer _sf500 = new TimeAlignmentTimer(0);
   protected static final TimeAlignmentTimer _sf750 = new TimeAlignmentTimer(1);
   protected static final TimeAlignmentTimer _sf1280 = new TimeAlignmentTimer(2);
   protected static final TimeAlignmentTimer _sf1920 = new TimeAlignmentTimer(3);
   protected static final TimeAlignmentTimer _sf2560 = new TimeAlignmentTimer(4);
   protected static final TimeAlignmentTimer _sf5120 = new TimeAlignmentTimer(5);
   protected static final TimeAlignmentTimer _sf10240 = new TimeAlignmentTimer(6);
   protected static final TimeAlignmentTimer _infinity = new TimeAlignmentTimer(7);

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
   protected TimeAlignmentTimer (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf500.
    */
   public static TimeAlignmentTimer sf500() {
      return _sf500;
   }

   /**
    * Singleton accessor method for sf750.
    */
   public static TimeAlignmentTimer sf750() {
      return _sf750;
   }

   /**
    * Singleton accessor method for sf1280.
    */
   public static TimeAlignmentTimer sf1280() {
      return _sf1280;
   }

   /**
    * Singleton accessor method for sf1920.
    */
   public static TimeAlignmentTimer sf1920() {
      return _sf1920;
   }

   /**
    * Singleton accessor method for sf2560.
    */
   public static TimeAlignmentTimer sf2560() {
      return _sf2560;
   }

   /**
    * Singleton accessor method for sf5120.
    */
   public static TimeAlignmentTimer sf5120() {
      return _sf5120;
   }

   /**
    * Singleton accessor method for sf10240.
    */
   public static TimeAlignmentTimer sf10240() {
      return _sf10240;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static TimeAlignmentTimer infinity() {
      return _infinity;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return TimeAlignmentTimer.valueOf( TimeAlignmentTimer.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static TimeAlignmentTimer valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf500();
         case 1: return sf750();
         case 2: return sf1280();
         case 3: return sf1920();
         case 4: return sf2560();
         case 5: return sf5120();
         case 6: return sf10240();
         case 7: return infinity();
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
      buffer.invokeCharacters (TimeAlignmentTimer.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf500");
         case 1: return ("sf750");
         case 2: return ("sf1280");
         case 3: return ("sf1920");
         case 4: return ("sf2560");
         case 5: return ("sf5120");
         case 6: return ("sf10240");
         case 7: return ("infinity");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
