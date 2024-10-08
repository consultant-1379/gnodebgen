/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_Configuration_r16_ssb_Periodicity_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS5 = 0;
   public static final int _MS10 = 1;
   public static final int _MS20 = 2;
   public static final int _MS40 = 3;
   public static final int _MS80 = 4;
   public static final int _MS160 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of SSB_Configuration_r16_ssb_Periodicity_r16
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms5 = new SSB_Configuration_r16_ssb_Periodicity_r16(0);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms10 = new SSB_Configuration_r16_ssb_Periodicity_r16(1);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms20 = new SSB_Configuration_r16_ssb_Periodicity_r16(2);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms40 = new SSB_Configuration_r16_ssb_Periodicity_r16(3);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms80 = new SSB_Configuration_r16_ssb_Periodicity_r16(4);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _ms160 = new SSB_Configuration_r16_ssb_Periodicity_r16(5);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _spare2 = new SSB_Configuration_r16_ssb_Periodicity_r16(6);
   protected static final SSB_Configuration_r16_ssb_Periodicity_r16 _spare1 = new SSB_Configuration_r16_ssb_Periodicity_r16(7);

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
   protected SSB_Configuration_r16_ssb_Periodicity_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms160.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 ms160() {
      return _ms160;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SSB_Configuration_r16_ssb_Periodicity_r16.valueOf( SSB_Configuration_r16_ssb_Periodicity_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SSB_Configuration_r16_ssb_Periodicity_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms5();
         case 1: return ms10();
         case 2: return ms20();
         case 3: return ms40();
         case 4: return ms80();
         case 5: return ms160();
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
      buffer.invokeCharacters (SSB_Configuration_r16_ssb_Periodicity_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms5");
         case 1: return ("ms10");
         case 2: return ("ms20");
         case 3: return ("ms40");
         case 4: return ("ms80");
         case 5: return ("ms160");
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
