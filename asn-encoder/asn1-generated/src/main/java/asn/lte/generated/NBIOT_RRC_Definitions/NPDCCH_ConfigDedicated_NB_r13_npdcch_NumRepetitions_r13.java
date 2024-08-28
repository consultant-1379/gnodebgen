/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
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
   public static final int _R128 = 7;
   public static final int _R256 = 8;
   public static final int _R512 = 9;
   public static final int _R1024 = 10;
   public static final int _R2048 = 11;
   public static final int _SPARE4 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r1 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(0);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r2 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(1);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r4 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(2);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r8 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(3);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r16 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(4);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r32 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(5);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r64 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(6);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r128 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(7);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r256 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(8);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r512 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(9);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r1024 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(10);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _r2048 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(11);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _spare4 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(12);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _spare3 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(13);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _spare2 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(14);
   protected static final NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 _spare1 = new NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13(15);

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
   protected NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for r1.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r1() {
      return _r1;
   }

   /**
    * Singleton accessor method for r2.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r2() {
      return _r2;
   }

   /**
    * Singleton accessor method for r4.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r4() {
      return _r4;
   }

   /**
    * Singleton accessor method for r8.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r8() {
      return _r8;
   }

   /**
    * Singleton accessor method for r16.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r16() {
      return _r16;
   }

   /**
    * Singleton accessor method for r32.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r32() {
      return _r32;
   }

   /**
    * Singleton accessor method for r64.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r64() {
      return _r64;
   }

   /**
    * Singleton accessor method for r128.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r128() {
      return _r128;
   }

   /**
    * Singleton accessor method for r256.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r256() {
      return _r256;
   }

   /**
    * Singleton accessor method for r512.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r512() {
      return _r512;
   }

   /**
    * Singleton accessor method for r1024.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r1024() {
      return _r1024;
   }

   /**
    * Singleton accessor method for r2048.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 r2048() {
      return _r2048;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13.valueOf( NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13 valueOf (int _value)
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
         case 7: return r128();
         case 8: return r256();
         case 9: return r512();
         case 10: return r1024();
         case 11: return r2048();
         case 12: return spare4();
         case 13: return spare3();
         case 14: return spare2();
         case 15: return spare1();
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
      buffer.invokeCharacters (NPDCCH_ConfigDedicated_NB_r13_npdcch_NumRepetitions_r13.valueOf(ret).toString());

      return ret;
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
         case 7: return ("r128");
         case 8: return ("r256");
         case 9: return ("r512");
         case 10: return ("r1024");
         case 11: return ("r2048");
         case 12: return ("spare4");
         case 13: return ("spare3");
         case 14: return ("spare2");
         case 15: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
