/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF32 = 0;
   public static final int _RF128 = 1;
   public static final int _RF512 = 2;
   public static final int _RF1024 = 3;
   public static final int _RF2048 = 4;
   public static final int _RF4096 = 5;
   public static final int _RF8192 = 6;
   public static final int _RF16384 = 7;

   // Singleton instances of SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf32 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(0);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf128 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(1);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf512 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(2);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf1024 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(3);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf2048 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(4);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf4096 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(5);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf8192 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(6);
   protected static final SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 _rf16384 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14(7);

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
   protected SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf32.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf32() {
      return _rf32;
   }

   /**
    * Singleton accessor method for rf128.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf128() {
      return _rf128;
   }

   /**
    * Singleton accessor method for rf512.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf512() {
      return _rf512;
   }

   /**
    * Singleton accessor method for rf1024.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf1024() {
      return _rf1024;
   }

   /**
    * Singleton accessor method for rf2048.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf2048() {
      return _rf2048;
   }

   /**
    * Singleton accessor method for rf4096.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf4096() {
      return _rf4096;
   }

   /**
    * Singleton accessor method for rf8192.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf8192() {
      return _rf8192;
   }

   /**
    * Singleton accessor method for rf16384.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 rf16384() {
      return _rf16384;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14.valueOf( SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf32();
         case 1: return rf128();
         case 2: return rf512();
         case 3: return rf1024();
         case 4: return rf2048();
         case 5: return rf4096();
         case 6: return rf8192();
         case 7: return rf16384();
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
      buffer.invokeCharacters (SystemInformationBlockType20_r13_br_BCCH_Config_r14_sc_mcch_RepetitionPeriod_BR_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf32");
         case 1: return ("rf128");
         case 2: return ("rf512");
         case 3: return ("rf1024");
         case 4: return ("rf2048");
         case 5: return ("rf4096");
         case 6: return ("rf8192");
         case 7: return ("rf16384");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
