/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF1 = 0;
   public static final int _RF2 = 1;
   public static final int _RF4 = 2;
   public static final int _RF8 = 3;
   public static final int _RF16 = 4;

   // Singleton instances of MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 _rf1 = new MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430(0);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 _rf2 = new MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430(1);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 _rf4 = new MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430(2);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 _rf8 = new MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430(3);
   protected static final MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 _rf16 = new MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf1.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 rf1() {
      return _rf1;
   }

   /**
    * Singleton accessor method for rf2.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 rf2() {
      return _rf2;
   }

   /**
    * Singleton accessor method for rf4.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 rf4() {
      return _rf4;
   }

   /**
    * Singleton accessor method for rf8.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 rf8() {
      return _rf8;
   }

   /**
    * Singleton accessor method for rf16.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 rf16() {
      return _rf16;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430.valueOf( MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf1();
         case 1: return rf2();
         case 2: return rf4();
         case 3: return rf8();
         case 4: return rf16();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MBSFN_AreaInfo_r9_mcch_Config_r14_mcch_RepetitionPeriod_v1430.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf1");
         case 1: return ("rf2");
         case 2: return ("rf4");
         case 3: return ("rf8");
         case 4: return ("rf16");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
