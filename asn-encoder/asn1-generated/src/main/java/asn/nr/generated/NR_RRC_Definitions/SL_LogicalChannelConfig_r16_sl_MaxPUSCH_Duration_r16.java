/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS0P02 = 0;
   public static final int _MS0P04 = 1;
   public static final int _MS0P0625 = 2;
   public static final int _MS0P125 = 3;
   public static final int _MS0P25 = 4;
   public static final int _MS0P5 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p02 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(0);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p04 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(1);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p0625 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(2);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p125 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(3);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p25 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(4);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _ms0p5 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(5);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _spare2 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(6);
   protected static final SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 _spare1 = new SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16(7);

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
   protected SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0p02.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p02() {
      return _ms0p02;
   }

   /**
    * Singleton accessor method for ms0p04.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p04() {
      return _ms0p04;
   }

   /**
    * Singleton accessor method for ms0p0625.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p0625() {
      return _ms0p0625;
   }

   /**
    * Singleton accessor method for ms0p125.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p125() {
      return _ms0p125;
   }

   /**
    * Singleton accessor method for ms0p25.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p25() {
      return _ms0p25;
   }

   /**
    * Singleton accessor method for ms0p5.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 ms0p5() {
      return _ms0p5;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16.valueOf( SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0p02();
         case 1: return ms0p04();
         case 2: return ms0p0625();
         case 3: return ms0p125();
         case 4: return ms0p25();
         case 5: return ms0p5();
         case 6: return spare2();
         case 7: return spare1();
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
      buffer.invokeCharacters (SL_LogicalChannelConfig_r16_sl_MaxPUSCH_Duration_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms0p02 */break;
         case 1: ui = 1; /* ms0p04 */break;
         case 2: ui = 2; /* ms0p0625 */break;
         case 3: ui = 3; /* ms0p125 */break;
         case 4: ui = 4; /* ms0p25 */break;
         case 5: ui = 5; /* ms0p5 */break;
         case 6: ui = 6; /* spare2 */break;
         case 7: ui = 7; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0p02");
         case 1: return ("ms0p04");
         case 2: return ("ms0p0625");
         case 3: return ("ms0p125");
         case 4: return ("ms0p25");
         case 5: return ("ms0p5");
         case 6: return ("spare2");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
