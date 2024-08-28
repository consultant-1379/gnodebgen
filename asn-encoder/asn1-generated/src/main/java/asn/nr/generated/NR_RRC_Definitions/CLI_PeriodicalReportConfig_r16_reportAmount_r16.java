/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CLI_PeriodicalReportConfig_r16_reportAmount_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _R1 = 0;
   public static final int _R2 = 1;
   public static final int _R4 = 2;
   public static final int _R8 = 3;
   public static final int _R16 = 4;
   public static final int _R32 = 5;
   public static final int _R64 = 6;
   public static final int _INFINITY = 7;

   // Singleton instances of CLI_PeriodicalReportConfig_r16_reportAmount_r16
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r1 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(0);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r2 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(1);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r4 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(2);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r8 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(3);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r16 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(4);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r32 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(5);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _r64 = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(6);
   protected static final CLI_PeriodicalReportConfig_r16_reportAmount_r16 _infinity = new CLI_PeriodicalReportConfig_r16_reportAmount_r16(7);

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
   protected CLI_PeriodicalReportConfig_r16_reportAmount_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for r1.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r1() {
      return _r1;
   }

   /**
    * Singleton accessor method for r2.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r2() {
      return _r2;
   }

   /**
    * Singleton accessor method for r4.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r4() {
      return _r4;
   }

   /**
    * Singleton accessor method for r8.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r8() {
      return _r8;
   }

   /**
    * Singleton accessor method for r16.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r16() {
      return _r16;
   }

   /**
    * Singleton accessor method for r32.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r32() {
      return _r32;
   }

   /**
    * Singleton accessor method for r64.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 r64() {
      return _r64;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 infinity() {
      return _infinity;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CLI_PeriodicalReportConfig_r16_reportAmount_r16.valueOf( CLI_PeriodicalReportConfig_r16_reportAmount_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CLI_PeriodicalReportConfig_r16_reportAmount_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return r1();
         case 1: return r2();
         case 2: return r4();
         case 3: return r8();
         case 4: return r16();
         case 5: return r32();
         case 6: return r64();
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
      buffer.invokeCharacters (CLI_PeriodicalReportConfig_r16_reportAmount_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* r1 */break;
         case 1: ui = 1; /* r2 */break;
         case 2: ui = 2; /* r4 */break;
         case 3: ui = 3; /* r8 */break;
         case 4: ui = 4; /* r16 */break;
         case 5: ui = 5; /* r32 */break;
         case 6: ui = 6; /* r64 */break;
         case 7: ui = 7; /* infinity */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("r1");
         case 1: return ("r2");
         case 2: return ("r4");
         case 3: return ("r8");
         case 4: return ("r16");
         case 5: return ("r32");
         case 6: return ("r64");
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
