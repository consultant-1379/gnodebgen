/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _KBPS0 = 0;
   public static final int _KBPS8 = 1;
   public static final int _KBPS16 = 2;
   public static final int _KBPS32 = 3;
   public static final int _KBPS64 = 4;
   public static final int _KBPS128 = 5;
   public static final int _KBPS256 = 6;
   public static final int _KBPS512 = 7;
   public static final int _KBPS1024 = 8;
   public static final int _KBPS2048 = 9;
   public static final int _KBPS4096 = 10;
   public static final int _KBPS8192 = 11;
   public static final int _KBPS16384 = 12;
   public static final int _KBPS32768 = 13;
   public static final int _KBPS65536 = 14;
   public static final int _INFINITY = 15;

   // Singleton instances of SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps0 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(0);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps8 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(1);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps16 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(2);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps32 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(3);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps64 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(4);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps128 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(5);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps256 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(6);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps512 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(7);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps1024 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(8);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps2048 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(9);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps4096 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(10);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps8192 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(11);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps16384 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(12);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps32768 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(13);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _kBps65536 = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(14);
   protected static final SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 _infinity = new SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16(15);

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
    *   9
    *   10
    *   11
    *   12
    *   13
    *   14
    *   15
    */
   protected SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for kBps0.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps0() {
      return _kBps0;
   }

   /**
    * Singleton accessor method for kBps8.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps8() {
      return _kBps8;
   }

   /**
    * Singleton accessor method for kBps16.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps16() {
      return _kBps16;
   }

   /**
    * Singleton accessor method for kBps32.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps32() {
      return _kBps32;
   }

   /**
    * Singleton accessor method for kBps64.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps64() {
      return _kBps64;
   }

   /**
    * Singleton accessor method for kBps128.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps128() {
      return _kBps128;
   }

   /**
    * Singleton accessor method for kBps256.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps256() {
      return _kBps256;
   }

   /**
    * Singleton accessor method for kBps512.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps512() {
      return _kBps512;
   }

   /**
    * Singleton accessor method for kBps1024.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps1024() {
      return _kBps1024;
   }

   /**
    * Singleton accessor method for kBps2048.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps2048() {
      return _kBps2048;
   }

   /**
    * Singleton accessor method for kBps4096.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps4096() {
      return _kBps4096;
   }

   /**
    * Singleton accessor method for kBps8192.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps8192() {
      return _kBps8192;
   }

   /**
    * Singleton accessor method for kBps16384.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps16384() {
      return _kBps16384;
   }

   /**
    * Singleton accessor method for kBps32768.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps32768() {
      return _kBps32768;
   }

   /**
    * Singleton accessor method for kBps65536.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 kBps65536() {
      return _kBps65536;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 infinity() {
      return _infinity;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16.valueOf( SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return kBps0();
         case 1: return kBps8();
         case 2: return kBps16();
         case 3: return kBps32();
         case 4: return kBps64();
         case 5: return kBps128();
         case 6: return kBps256();
         case 7: return kBps512();
         case 8: return kBps1024();
         case 9: return kBps2048();
         case 10: return kBps4096();
         case 11: return kBps8192();
         case 12: return kBps16384();
         case 13: return kBps32768();
         case 14: return kBps65536();
         case 15: return infinity();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (16);

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
         case 9: ret =  9; break;
         case 10: ret =  10; break;
         case 11: ret =  11; break;
         case 12: ret =  12; break;
         case 13: ret =  13; break;
         case 14: ret =  14; break;
         case 15: ret =  15; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SL_LogicalChannelConfig_r16_sl_PrioritisedBitRate_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* kBps0 */break;
         case 1: ui = 1; /* kBps8 */break;
         case 2: ui = 2; /* kBps16 */break;
         case 3: ui = 3; /* kBps32 */break;
         case 4: ui = 4; /* kBps64 */break;
         case 5: ui = 5; /* kBps128 */break;
         case 6: ui = 6; /* kBps256 */break;
         case 7: ui = 7; /* kBps512 */break;
         case 8: ui = 8; /* kBps1024 */break;
         case 9: ui = 9; /* kBps2048 */break;
         case 10: ui = 10; /* kBps4096 */break;
         case 11: ui = 11; /* kBps8192 */break;
         case 12: ui = 12; /* kBps16384 */break;
         case 13: ui = 13; /* kBps32768 */break;
         case 14: ui = 14; /* kBps65536 */break;
         case 15: ui = 15; /* infinity */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 16);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("kBps0");
         case 1: return ("kBps8");
         case 2: return ("kBps16");
         case 3: return ("kBps32");
         case 4: return ("kBps64");
         case 5: return ("kBps128");
         case 6: return ("kBps256");
         case 7: return ("kBps512");
         case 8: return ("kBps1024");
         case 9: return ("kBps2048");
         case 10: return ("kBps4096");
         case 11: return ("kBps8192");
         case 12: return ("kBps16384");
         case 13: return ("kBps32768");
         case 14: return ("kBps65536");
         case 15: return ("infinity");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
