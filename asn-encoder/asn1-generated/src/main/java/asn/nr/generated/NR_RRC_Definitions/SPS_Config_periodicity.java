/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPS_Config_periodicity extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS10 = 0;
   public static final int _MS20 = 1;
   public static final int _MS32 = 2;
   public static final int _MS40 = 3;
   public static final int _MS64 = 4;
   public static final int _MS80 = 5;
   public static final int _MS128 = 6;
   public static final int _MS160 = 7;
   public static final int _MS320 = 8;
   public static final int _MS640 = 9;
   public static final int _SPARE6 = 10;
   public static final int _SPARE5 = 11;
   public static final int _SPARE4 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of SPS_Config_periodicity
   protected static final SPS_Config_periodicity _ms10 = new SPS_Config_periodicity(0);
   protected static final SPS_Config_periodicity _ms20 = new SPS_Config_periodicity(1);
   protected static final SPS_Config_periodicity _ms32 = new SPS_Config_periodicity(2);
   protected static final SPS_Config_periodicity _ms40 = new SPS_Config_periodicity(3);
   protected static final SPS_Config_periodicity _ms64 = new SPS_Config_periodicity(4);
   protected static final SPS_Config_periodicity _ms80 = new SPS_Config_periodicity(5);
   protected static final SPS_Config_periodicity _ms128 = new SPS_Config_periodicity(6);
   protected static final SPS_Config_periodicity _ms160 = new SPS_Config_periodicity(7);
   protected static final SPS_Config_periodicity _ms320 = new SPS_Config_periodicity(8);
   protected static final SPS_Config_periodicity _ms640 = new SPS_Config_periodicity(9);
   protected static final SPS_Config_periodicity _spare6 = new SPS_Config_periodicity(10);
   protected static final SPS_Config_periodicity _spare5 = new SPS_Config_periodicity(11);
   protected static final SPS_Config_periodicity _spare4 = new SPS_Config_periodicity(12);
   protected static final SPS_Config_periodicity _spare3 = new SPS_Config_periodicity(13);
   protected static final SPS_Config_periodicity _spare2 = new SPS_Config_periodicity(14);
   protected static final SPS_Config_periodicity _spare1 = new SPS_Config_periodicity(15);

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
   protected SPS_Config_periodicity (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static SPS_Config_periodicity ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static SPS_Config_periodicity ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms32.
    */
   public static SPS_Config_periodicity ms32() {
      return _ms32;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static SPS_Config_periodicity ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms64.
    */
   public static SPS_Config_periodicity ms64() {
      return _ms64;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static SPS_Config_periodicity ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms128.
    */
   public static SPS_Config_periodicity ms128() {
      return _ms128;
   }

   /**
    * Singleton accessor method for ms160.
    */
   public static SPS_Config_periodicity ms160() {
      return _ms160;
   }

   /**
    * Singleton accessor method for ms320.
    */
   public static SPS_Config_periodicity ms320() {
      return _ms320;
   }

   /**
    * Singleton accessor method for ms640.
    */
   public static SPS_Config_periodicity ms640() {
      return _ms640;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static SPS_Config_periodicity spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static SPS_Config_periodicity spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static SPS_Config_periodicity spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static SPS_Config_periodicity spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SPS_Config_periodicity spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SPS_Config_periodicity spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SPS_Config_periodicity.valueOf( SPS_Config_periodicity.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SPS_Config_periodicity valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms10();
         case 1: return ms20();
         case 2: return ms32();
         case 3: return ms40();
         case 4: return ms64();
         case 5: return ms80();
         case 6: return ms128();
         case 7: return ms160();
         case 8: return ms320();
         case 9: return ms640();
         case 10: return spare6();
         case 11: return spare5();
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
      buffer.invokeCharacters (SPS_Config_periodicity.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms10 */break;
         case 1: ui = 1; /* ms20 */break;
         case 2: ui = 2; /* ms32 */break;
         case 3: ui = 3; /* ms40 */break;
         case 4: ui = 4; /* ms64 */break;
         case 5: ui = 5; /* ms80 */break;
         case 6: ui = 6; /* ms128 */break;
         case 7: ui = 7; /* ms160 */break;
         case 8: ui = 8; /* ms320 */break;
         case 9: ui = 9; /* ms640 */break;
         case 10: ui = 10; /* spare6 */break;
         case 11: ui = 11; /* spare5 */break;
         case 12: ui = 12; /* spare4 */break;
         case 13: ui = 13; /* spare3 */break;
         case 14: ui = 14; /* spare2 */break;
         case 15: ui = 15; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 16);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms10");
         case 1: return ("ms20");
         case 2: return ("ms32");
         case 3: return ("ms40");
         case 4: return ("ms64");
         case 5: return ("ms80");
         case 6: return ("ms128");
         case 7: return ("ms160");
         case 8: return ("ms320");
         case 9: return ("ms640");
         case 10: return ("spare6");
         case 11: return ("spare5");
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
