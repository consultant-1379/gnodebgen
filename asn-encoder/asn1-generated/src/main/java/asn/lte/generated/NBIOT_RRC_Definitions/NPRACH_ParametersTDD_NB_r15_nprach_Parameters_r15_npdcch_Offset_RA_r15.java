/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ZERO = 0;
   public static final int _ONEEIGHTH = 1;
   public static final int _ONEFOURTH = 2;
   public static final int _THREEEIGHTH = 3;

   // Singleton instances of NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 _zero = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15(0);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 _oneEighth = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15(1);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 _oneFourth = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15(2);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 _threeEighth = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for zero.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 zero() {
      return _zero;
   }

   /**
    * Singleton accessor method for oneEighth.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 oneEighth() {
      return _oneEighth;
   }

   /**
    * Singleton accessor method for oneFourth.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 oneFourth() {
      return _oneFourth;
   }

   /**
    * Singleton accessor method for threeEighth.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 threeEighth() {
      return _threeEighth;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15.valueOf( NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return zero();
         case 1: return oneEighth();
         case 2: return oneFourth();
         case 3: return threeEighth();
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
      buffer.invokeCharacters (NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_npdcch_Offset_RA_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("zero");
         case 1: return ("oneEighth");
         case 2: return ("oneFourth");
         case 3: return ("threeEighth");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
