/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _CS2 = 0;
   public static final int _CS4 = 1;
   public static final int _CS8 = 2;
   public static final int _CS12 = 3;
   public static final int _CS16 = 4;
   public static final int _CS24 = 5;
   public static final int _CS32 = 6;
   public static final int _CS48 = 7;
   public static final int _CS64 = 8;
   public static final int _CS128 = 9;
   public static final int _CS256 = 10;
   public static final int _CS512 = 11;
   public static final int _CS1024 = 12;
   public static final int _CS16384 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs2 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(0);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs4 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(1);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs8 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(2);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs12 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(3);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs16 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(4);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs24 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(5);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs32 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(6);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs48 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(7);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs64 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(8);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs128 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(9);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs256 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(10);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs512 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(11);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs1024 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(12);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _cs16384 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(13);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _spare2 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(14);
   protected static final PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 _spare1 = new PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15(15);

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
   protected PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for cs2.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs2() {
      return _cs2;
   }

   /**
    * Singleton accessor method for cs4.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs4() {
      return _cs4;
   }

   /**
    * Singleton accessor method for cs8.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs8() {
      return _cs8;
   }

   /**
    * Singleton accessor method for cs12.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs12() {
      return _cs12;
   }

   /**
    * Singleton accessor method for cs16.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs16() {
      return _cs16;
   }

   /**
    * Singleton accessor method for cs24.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs24() {
      return _cs24;
   }

   /**
    * Singleton accessor method for cs32.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs32() {
      return _cs32;
   }

   /**
    * Singleton accessor method for cs48.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs48() {
      return _cs48;
   }

   /**
    * Singleton accessor method for cs64.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs64() {
      return _cs64;
   }

   /**
    * Singleton accessor method for cs128.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs128() {
      return _cs128;
   }

   /**
    * Singleton accessor method for cs256.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs256() {
      return _cs256;
   }

   /**
    * Singleton accessor method for cs512.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs512() {
      return _cs512;
   }

   /**
    * Singleton accessor method for cs1024.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs1024() {
      return _cs1024;
   }

   /**
    * Singleton accessor method for cs16384.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 cs16384() {
      return _cs16384;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15.valueOf( PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return cs2();
         case 1: return cs4();
         case 2: return cs8();
         case 3: return cs12();
         case 4: return cs16();
         case 5: return cs24();
         case 6: return cs32();
         case 7: return cs48();
         case 8: return cs64();
         case 9: return cs128();
         case 10: return cs256();
         case 11: return cs512();
         case 12: return cs1024();
         case 13: return cs16384();
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
      buffer.invokeCharacters (PDCP_ParametersNR_r15_rohc_ContextMaxSessions_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("cs2");
         case 1: return ("cs4");
         case 2: return ("cs8");
         case 3: return ("cs12");
         case 4: return ("cs16");
         case 5: return ("cs24");
         case 6: return ("cs32");
         case 7: return ("cs48");
         case 8: return ("cs64");
         case 9: return ("cs128");
         case 10: return ("cs256");
         case 11: return ("cs512");
         case 12: return ("cs1024");
         case 13: return ("cs16384");
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
