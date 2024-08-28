/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _S0 = 0;
   public static final int _S0DOT4 = 1;
   public static final int _S0DOT8 = 2;
   public static final int _S1DOT6 = 3;
   public static final int _S3 = 4;
   public static final int _S6 = 5;
   public static final int _S12 = 6;
   public static final int _S30 = 7;

   // Singleton instances of LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s0 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(0);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s0dot4 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(1);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s0dot8 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(2);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s1dot6 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(3);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s3 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(4);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s6 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(5);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s12 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(6);
   protected static final LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer _s30 = new LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer(7);

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
   protected LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for s0.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s0() {
      return _s0;
   }

   /**
    * Singleton accessor method for s0dot4.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s0dot4() {
      return _s0dot4;
   }

   /**
    * Singleton accessor method for s0dot8.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s0dot8() {
      return _s0dot8;
   }

   /**
    * Singleton accessor method for s1dot6.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s1dot6() {
      return _s1dot6;
   }

   /**
    * Singleton accessor method for s3.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s3() {
      return _s3;
   }

   /**
    * Singleton accessor method for s6.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s6() {
      return _s6;
   }

   /**
    * Singleton accessor method for s12.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s12() {
      return _s12;
   }

   /**
    * Singleton accessor method for s30.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer s30() {
      return _s30;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer.valueOf( LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return s0();
         case 1: return s0dot4();
         case 2: return s0dot8();
         case 3: return s1dot6();
         case 4: return s3();
         case 5: return s6();
         case 6: return s12();
         case 7: return s30();
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
      buffer.invokeCharacters (LogicalChannelConfig_ul_SpecificParameters_bitRateQueryProhibitTimer.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("s0");
         case 1: return ("s0dot4");
         case 2: return ("s0dot8");
         case 3: return ("s1dot6");
         case 4: return ("s3");
         case 5: return ("s6");
         case 6: return ("s12");
         case 7: return ("s30");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
