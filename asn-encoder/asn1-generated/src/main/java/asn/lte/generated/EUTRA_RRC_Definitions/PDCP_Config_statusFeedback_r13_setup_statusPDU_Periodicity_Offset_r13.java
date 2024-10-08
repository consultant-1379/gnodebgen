/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS1 = 0;
   public static final int _MS2 = 1;
   public static final int _MS5 = 2;
   public static final int _MS10 = 3;
   public static final int _MS25 = 4;
   public static final int _MS50 = 5;
   public static final int _MS100 = 6;
   public static final int _MS250 = 7;
   public static final int _MS500 = 8;
   public static final int _MS2500 = 9;
   public static final int _MS5000 = 10;
   public static final int _MS25000 = 11;

   // Singleton instances of PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms1 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(0);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms2 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(1);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms5 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(2);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms10 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(3);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms25 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(4);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms50 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(5);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms100 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(6);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms250 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(7);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms500 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(8);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms2500 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(9);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms5000 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(10);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 _ms25000 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13(11);

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
    */
   protected PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms25.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms25() {
      return _ms25;
   }

   /**
    * Singleton accessor method for ms50.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms50() {
      return _ms50;
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms250.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms250() {
      return _ms250;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms2500.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms2500() {
      return _ms2500;
   }

   /**
    * Singleton accessor method for ms5000.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms5000() {
      return _ms5000;
   }

   /**
    * Singleton accessor method for ms25000.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 ms25000() {
      return _ms25000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13.valueOf( PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms1();
         case 1: return ms2();
         case 2: return ms5();
         case 3: return ms10();
         case 4: return ms25();
         case 5: return ms50();
         case 6: return ms100();
         case 7: return ms250();
         case 8: return ms500();
         case 9: return ms2500();
         case 10: return ms5000();
         case 11: return ms25000();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (12);

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
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PDCP_Config_statusFeedback_r13_setup_statusPDU_Periodicity_Offset_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1");
         case 1: return ("ms2");
         case 2: return ("ms5");
         case 3: return ("ms10");
         case 4: return ("ms25");
         case 5: return ("ms50");
         case 6: return ("ms100");
         case 7: return ("ms250");
         case 8: return ("ms500");
         case 9: return ("ms2500");
         case 10: return ("ms5000");
         case 11: return ("ms25000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
