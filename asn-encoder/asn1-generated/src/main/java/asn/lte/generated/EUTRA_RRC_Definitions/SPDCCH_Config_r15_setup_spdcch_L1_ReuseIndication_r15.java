/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N1 = 1;
   public static final int _N2 = 2;

   // Singleton instances of SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15
   protected static final SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 _n0 = new SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15(0);
   protected static final SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 _n1 = new SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15(1);
   protected static final SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 _n2 = new SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n1.
    */
   public static SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 n2() {
      return _n2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15.valueOf( SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n1();
         case 2: return n2();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SPDCCH_Config_r15_setup_spdcch_L1_ReuseIndication_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n1");
         case 2: return ("n2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
