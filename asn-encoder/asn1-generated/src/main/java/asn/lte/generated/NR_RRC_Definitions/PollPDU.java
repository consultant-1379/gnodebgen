/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PollPDU extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PollPDU";
   }

   // Integer constants for switch-case
   public static final int _P4 = 0;
   public static final int _P8 = 1;
   public static final int _P16 = 2;
   public static final int _P32 = 3;
   public static final int _P64 = 4;
   public static final int _P128 = 5;
   public static final int _P256 = 6;
   public static final int _P512 = 7;
   public static final int _P1024 = 8;
   public static final int _P2048 = 9;
   public static final int _P4096 = 10;
   public static final int _P6144 = 11;
   public static final int _P8192 = 12;
   public static final int _P12288 = 13;
   public static final int _P16384 = 14;
   public static final int _P20480 = 15;
   public static final int _P24576 = 16;
   public static final int _P28672 = 17;
   public static final int _P32768 = 18;
   public static final int _P40960 = 19;
   public static final int _P49152 = 20;
   public static final int _P57344 = 21;
   public static final int _P65536 = 22;
   public static final int _INFINITY = 23;
   public static final int _SPARE8 = 24;
   public static final int _SPARE7 = 25;
   public static final int _SPARE6 = 26;
   public static final int _SPARE5 = 27;
   public static final int _SPARE4 = 28;
   public static final int _SPARE3 = 29;
   public static final int _SPARE2 = 30;
   public static final int _SPARE1 = 31;

   // Singleton instances of PollPDU
   protected static final PollPDU _p4 = new PollPDU(0);
   protected static final PollPDU _p8 = new PollPDU(1);
   protected static final PollPDU _p16 = new PollPDU(2);
   protected static final PollPDU _p32 = new PollPDU(3);
   protected static final PollPDU _p64 = new PollPDU(4);
   protected static final PollPDU _p128 = new PollPDU(5);
   protected static final PollPDU _p256 = new PollPDU(6);
   protected static final PollPDU _p512 = new PollPDU(7);
   protected static final PollPDU _p1024 = new PollPDU(8);
   protected static final PollPDU _p2048 = new PollPDU(9);
   protected static final PollPDU _p4096 = new PollPDU(10);
   protected static final PollPDU _p6144 = new PollPDU(11);
   protected static final PollPDU _p8192 = new PollPDU(12);
   protected static final PollPDU _p12288 = new PollPDU(13);
   protected static final PollPDU _p16384 = new PollPDU(14);
   protected static final PollPDU _p20480 = new PollPDU(15);
   protected static final PollPDU _p24576 = new PollPDU(16);
   protected static final PollPDU _p28672 = new PollPDU(17);
   protected static final PollPDU _p32768 = new PollPDU(18);
   protected static final PollPDU _p40960 = new PollPDU(19);
   protected static final PollPDU _p49152 = new PollPDU(20);
   protected static final PollPDU _p57344 = new PollPDU(21);
   protected static final PollPDU _p65536 = new PollPDU(22);
   protected static final PollPDU _infinity = new PollPDU(23);
   protected static final PollPDU _spare8 = new PollPDU(24);
   protected static final PollPDU _spare7 = new PollPDU(25);
   protected static final PollPDU _spare6 = new PollPDU(26);
   protected static final PollPDU _spare5 = new PollPDU(27);
   protected static final PollPDU _spare4 = new PollPDU(28);
   protected static final PollPDU _spare3 = new PollPDU(29);
   protected static final PollPDU _spare2 = new PollPDU(30);
   protected static final PollPDU _spare1 = new PollPDU(31);

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
    *   16
    *   17
    *   18
    *   19
    *   20
    *   21
    *   22
    *   23
    *   24
    *   25
    *   26
    *   27
    *   28
    *   29
    *   30
    *   31
    */
   protected PollPDU (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for p4.
    */
   public static PollPDU p4() {
      return _p4;
   }

   /**
    * Singleton accessor method for p8.
    */
   public static PollPDU p8() {
      return _p8;
   }

   /**
    * Singleton accessor method for p16.
    */
   public static PollPDU p16() {
      return _p16;
   }

   /**
    * Singleton accessor method for p32.
    */
   public static PollPDU p32() {
      return _p32;
   }

   /**
    * Singleton accessor method for p64.
    */
   public static PollPDU p64() {
      return _p64;
   }

   /**
    * Singleton accessor method for p128.
    */
   public static PollPDU p128() {
      return _p128;
   }

   /**
    * Singleton accessor method for p256.
    */
   public static PollPDU p256() {
      return _p256;
   }

   /**
    * Singleton accessor method for p512.
    */
   public static PollPDU p512() {
      return _p512;
   }

   /**
    * Singleton accessor method for p1024.
    */
   public static PollPDU p1024() {
      return _p1024;
   }

   /**
    * Singleton accessor method for p2048.
    */
   public static PollPDU p2048() {
      return _p2048;
   }

   /**
    * Singleton accessor method for p4096.
    */
   public static PollPDU p4096() {
      return _p4096;
   }

   /**
    * Singleton accessor method for p6144.
    */
   public static PollPDU p6144() {
      return _p6144;
   }

   /**
    * Singleton accessor method for p8192.
    */
   public static PollPDU p8192() {
      return _p8192;
   }

   /**
    * Singleton accessor method for p12288.
    */
   public static PollPDU p12288() {
      return _p12288;
   }

   /**
    * Singleton accessor method for p16384.
    */
   public static PollPDU p16384() {
      return _p16384;
   }

   /**
    * Singleton accessor method for p20480.
    */
   public static PollPDU p20480() {
      return _p20480;
   }

   /**
    * Singleton accessor method for p24576.
    */
   public static PollPDU p24576() {
      return _p24576;
   }

   /**
    * Singleton accessor method for p28672.
    */
   public static PollPDU p28672() {
      return _p28672;
   }

   /**
    * Singleton accessor method for p32768.
    */
   public static PollPDU p32768() {
      return _p32768;
   }

   /**
    * Singleton accessor method for p40960.
    */
   public static PollPDU p40960() {
      return _p40960;
   }

   /**
    * Singleton accessor method for p49152.
    */
   public static PollPDU p49152() {
      return _p49152;
   }

   /**
    * Singleton accessor method for p57344.
    */
   public static PollPDU p57344() {
      return _p57344;
   }

   /**
    * Singleton accessor method for p65536.
    */
   public static PollPDU p65536() {
      return _p65536;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static PollPDU infinity() {
      return _infinity;
   }

   /**
    * Singleton accessor method for spare8.
    */
   public static PollPDU spare8() {
      return _spare8;
   }

   /**
    * Singleton accessor method for spare7.
    */
   public static PollPDU spare7() {
      return _spare7;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static PollPDU spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static PollPDU spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static PollPDU spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static PollPDU spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static PollPDU spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static PollPDU spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PollPDU.valueOf( PollPDU.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PollPDU valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return p4();
         case 1: return p8();
         case 2: return p16();
         case 3: return p32();
         case 4: return p64();
         case 5: return p128();
         case 6: return p256();
         case 7: return p512();
         case 8: return p1024();
         case 9: return p2048();
         case 10: return p4096();
         case 11: return p6144();
         case 12: return p8192();
         case 13: return p12288();
         case 14: return p16384();
         case 15: return p20480();
         case 16: return p24576();
         case 17: return p28672();
         case 18: return p32768();
         case 19: return p40960();
         case 20: return p49152();
         case 21: return p57344();
         case 22: return p65536();
         case 23: return infinity();
         case 24: return spare8();
         case 25: return spare7();
         case 26: return spare6();
         case 27: return spare5();
         case 28: return spare4();
         case 29: return spare3();
         case 30: return spare2();
         case 31: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (32);

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
         case 16: ret =  16; break;
         case 17: ret =  17; break;
         case 18: ret =  18; break;
         case 19: ret =  19; break;
         case 20: ret =  20; break;
         case 21: ret =  21; break;
         case 22: ret =  22; break;
         case 23: ret =  23; break;
         case 24: ret =  24; break;
         case 25: ret =  25; break;
         case 26: ret =  26; break;
         case 27: ret =  27; break;
         case 28: ret =  28; break;
         case 29: ret =  29; break;
         case 30: ret =  30; break;
         case 31: ret =  31; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PollPDU.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("p4");
         case 1: return ("p8");
         case 2: return ("p16");
         case 3: return ("p32");
         case 4: return ("p64");
         case 5: return ("p128");
         case 6: return ("p256");
         case 7: return ("p512");
         case 8: return ("p1024");
         case 9: return ("p2048");
         case 10: return ("p4096");
         case 11: return ("p6144");
         case 12: return ("p8192");
         case 13: return ("p12288");
         case 14: return ("p16384");
         case 15: return ("p20480");
         case 16: return ("p24576");
         case 17: return ("p28672");
         case 18: return ("p32768");
         case 19: return ("p40960");
         case 20: return ("p49152");
         case 21: return ("p57344");
         case 22: return ("p65536");
         case 23: return ("infinity");
         case 24: return ("spare8");
         case 25: return ("spare7");
         case 26: return ("spare6");
         case 27: return ("spare5");
         case 28: return ("spare4");
         case 29: return ("spare3");
         case 30: return ("spare2");
         case 31: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
