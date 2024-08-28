/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PCCH_Config_NB_r13_nB_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _FOURT = 0;
   public static final int _TWOT = 1;
   public static final int _ONET = 2;
   public static final int _HALFT = 3;
   public static final int _QUARTERT = 4;
   public static final int _ONE8THT = 5;
   public static final int _ONE16THT = 6;
   public static final int _ONE32NDT = 7;
   public static final int _ONE64THT = 8;
   public static final int _ONE128THT = 9;
   public static final int _ONE256THT = 10;
   public static final int _ONE512THT = 11;
   public static final int _ONE1024THT = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of PCCH_Config_NB_r13_nB_r13
   protected static final PCCH_Config_NB_r13_nB_r13 _fourT = new PCCH_Config_NB_r13_nB_r13(0);
   protected static final PCCH_Config_NB_r13_nB_r13 _twoT = new PCCH_Config_NB_r13_nB_r13(1);
   protected static final PCCH_Config_NB_r13_nB_r13 _oneT = new PCCH_Config_NB_r13_nB_r13(2);
   protected static final PCCH_Config_NB_r13_nB_r13 _halfT = new PCCH_Config_NB_r13_nB_r13(3);
   protected static final PCCH_Config_NB_r13_nB_r13 _quarterT = new PCCH_Config_NB_r13_nB_r13(4);
   protected static final PCCH_Config_NB_r13_nB_r13 _one8thT = new PCCH_Config_NB_r13_nB_r13(5);
   protected static final PCCH_Config_NB_r13_nB_r13 _one16thT = new PCCH_Config_NB_r13_nB_r13(6);
   protected static final PCCH_Config_NB_r13_nB_r13 _one32ndT = new PCCH_Config_NB_r13_nB_r13(7);
   protected static final PCCH_Config_NB_r13_nB_r13 _one64thT = new PCCH_Config_NB_r13_nB_r13(8);
   protected static final PCCH_Config_NB_r13_nB_r13 _one128thT = new PCCH_Config_NB_r13_nB_r13(9);
   protected static final PCCH_Config_NB_r13_nB_r13 _one256thT = new PCCH_Config_NB_r13_nB_r13(10);
   protected static final PCCH_Config_NB_r13_nB_r13 _one512thT = new PCCH_Config_NB_r13_nB_r13(11);
   protected static final PCCH_Config_NB_r13_nB_r13 _one1024thT = new PCCH_Config_NB_r13_nB_r13(12);
   protected static final PCCH_Config_NB_r13_nB_r13 _spare3 = new PCCH_Config_NB_r13_nB_r13(13);
   protected static final PCCH_Config_NB_r13_nB_r13 _spare2 = new PCCH_Config_NB_r13_nB_r13(14);
   protected static final PCCH_Config_NB_r13_nB_r13 _spare1 = new PCCH_Config_NB_r13_nB_r13(15);

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
   protected PCCH_Config_NB_r13_nB_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for fourT.
    */
   public static PCCH_Config_NB_r13_nB_r13 fourT() {
      return _fourT;
   }

   /**
    * Singleton accessor method for twoT.
    */
   public static PCCH_Config_NB_r13_nB_r13 twoT() {
      return _twoT;
   }

   /**
    * Singleton accessor method for oneT.
    */
   public static PCCH_Config_NB_r13_nB_r13 oneT() {
      return _oneT;
   }

   /**
    * Singleton accessor method for halfT.
    */
   public static PCCH_Config_NB_r13_nB_r13 halfT() {
      return _halfT;
   }

   /**
    * Singleton accessor method for quarterT.
    */
   public static PCCH_Config_NB_r13_nB_r13 quarterT() {
      return _quarterT;
   }

   /**
    * Singleton accessor method for one8thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one8thT() {
      return _one8thT;
   }

   /**
    * Singleton accessor method for one16thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one16thT() {
      return _one16thT;
   }

   /**
    * Singleton accessor method for one32ndT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one32ndT() {
      return _one32ndT;
   }

   /**
    * Singleton accessor method for one64thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one64thT() {
      return _one64thT;
   }

   /**
    * Singleton accessor method for one128thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one128thT() {
      return _one128thT;
   }

   /**
    * Singleton accessor method for one256thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one256thT() {
      return _one256thT;
   }

   /**
    * Singleton accessor method for one512thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one512thT() {
      return _one512thT;
   }

   /**
    * Singleton accessor method for one1024thT.
    */
   public static PCCH_Config_NB_r13_nB_r13 one1024thT() {
      return _one1024thT;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static PCCH_Config_NB_r13_nB_r13 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static PCCH_Config_NB_r13_nB_r13 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static PCCH_Config_NB_r13_nB_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PCCH_Config_NB_r13_nB_r13.valueOf( PCCH_Config_NB_r13_nB_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PCCH_Config_NB_r13_nB_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return fourT();
         case 1: return twoT();
         case 2: return oneT();
         case 3: return halfT();
         case 4: return quarterT();
         case 5: return one8thT();
         case 6: return one16thT();
         case 7: return one32ndT();
         case 8: return one64thT();
         case 9: return one128thT();
         case 10: return one256thT();
         case 11: return one512thT();
         case 12: return one1024thT();
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
      buffer.invokeCharacters (PCCH_Config_NB_r13_nB_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("fourT");
         case 1: return ("twoT");
         case 2: return ("oneT");
         case 3: return ("halfT");
         case 4: return ("quarterT");
         case 5: return ("one8thT");
         case 6: return ("one16thT");
         case 7: return ("one32ndT");
         case 8: return ("one64thT");
         case 9: return ("one128thT");
         case 10: return ("one256thT");
         case 11: return ("one512thT");
         case 12: return ("one1024thT");
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
