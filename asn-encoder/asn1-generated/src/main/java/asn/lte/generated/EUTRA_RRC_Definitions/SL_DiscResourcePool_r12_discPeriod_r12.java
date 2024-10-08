/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_DiscResourcePool_r12_discPeriod_r12 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF32 = 0;
   public static final int _RF64 = 1;
   public static final int _RF128 = 2;
   public static final int _RF256 = 3;
   public static final int _RF512 = 4;
   public static final int _RF1024 = 5;
   public static final int _RF16_V1310 = 6;
   public static final int _SPARE = 7;

   // Singleton instances of SL_DiscResourcePool_r12_discPeriod_r12
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf32 = new SL_DiscResourcePool_r12_discPeriod_r12(0);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf64 = new SL_DiscResourcePool_r12_discPeriod_r12(1);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf128 = new SL_DiscResourcePool_r12_discPeriod_r12(2);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf256 = new SL_DiscResourcePool_r12_discPeriod_r12(3);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf512 = new SL_DiscResourcePool_r12_discPeriod_r12(4);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf1024 = new SL_DiscResourcePool_r12_discPeriod_r12(5);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _rf16_v1310 = new SL_DiscResourcePool_r12_discPeriod_r12(6);
   protected static final SL_DiscResourcePool_r12_discPeriod_r12 _spare = new SL_DiscResourcePool_r12_discPeriod_r12(7);

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
   protected SL_DiscResourcePool_r12_discPeriod_r12 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf32.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf32() {
      return _rf32;
   }

   /**
    * Singleton accessor method for rf64.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf64() {
      return _rf64;
   }

   /**
    * Singleton accessor method for rf128.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf128() {
      return _rf128;
   }

   /**
    * Singleton accessor method for rf256.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf256() {
      return _rf256;
   }

   /**
    * Singleton accessor method for rf512.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf512() {
      return _rf512;
   }

   /**
    * Singleton accessor method for rf1024.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf1024() {
      return _rf1024;
   }

   /**
    * Singleton accessor method for rf16_v1310.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 rf16_v1310() {
      return _rf16_v1310;
   }

   /**
    * Singleton accessor method for spare.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 spare() {
      return _spare;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_DiscResourcePool_r12_discPeriod_r12.valueOf( SL_DiscResourcePool_r12_discPeriod_r12.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_DiscResourcePool_r12_discPeriod_r12 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf32();
         case 1: return rf64();
         case 2: return rf128();
         case 3: return rf256();
         case 4: return rf512();
         case 5: return rf1024();
         case 6: return rf16_v1310();
         case 7: return spare();
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
      buffer.invokeCharacters (SL_DiscResourcePool_r12_discPeriod_r12.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf32");
         case 1: return ("rf64");
         case 2: return ("rf128");
         case 3: return ("rf256");
         case 4: return ("rf512");
         case 5: return ("rf1024");
         case 6: return ("rf16-v1310");
         case 7: return ("spare");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
