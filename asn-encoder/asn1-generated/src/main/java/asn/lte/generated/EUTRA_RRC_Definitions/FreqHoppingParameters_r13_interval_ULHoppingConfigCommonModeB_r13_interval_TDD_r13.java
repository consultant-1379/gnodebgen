/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _INT5 = 0;
   public static final int _INT10 = 1;
   public static final int _INT20 = 2;
   public static final int _INT40 = 3;

   // Singleton instances of FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13
   protected static final FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 _int5 = new FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13(0);
   protected static final FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 _int10 = new FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13(1);
   protected static final FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 _int20 = new FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13(2);
   protected static final FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 _int40 = new FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for int5.
    */
   public static FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 int5() {
      return _int5;
   }

   /**
    * Singleton accessor method for int10.
    */
   public static FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 int10() {
      return _int10;
   }

   /**
    * Singleton accessor method for int20.
    */
   public static FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 int20() {
      return _int20;
   }

   /**
    * Singleton accessor method for int40.
    */
   public static FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 int40() {
      return _int40;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13.valueOf( FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return int5();
         case 1: return int10();
         case 2: return int20();
         case 3: return int40();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (FreqHoppingParameters_r13_interval_ULHoppingConfigCommonModeB_r13_interval_TDD_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("int5");
         case 1: return ("int10");
         case 2: return ("int20");
         case 3: return ("int40");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
