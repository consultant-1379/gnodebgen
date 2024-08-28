/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCCH_CandidateReductionValue_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCCH-CandidateReductionValue-r14";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N50 = 1;
   public static final int _N100 = 2;
   public static final int _N150 = 3;

   // Singleton instances of PDCCH_CandidateReductionValue_r14
   protected static final PDCCH_CandidateReductionValue_r14 _n0 = new PDCCH_CandidateReductionValue_r14(0);
   protected static final PDCCH_CandidateReductionValue_r14 _n50 = new PDCCH_CandidateReductionValue_r14(1);
   protected static final PDCCH_CandidateReductionValue_r14 _n100 = new PDCCH_CandidateReductionValue_r14(2);
   protected static final PDCCH_CandidateReductionValue_r14 _n150 = new PDCCH_CandidateReductionValue_r14(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected PDCCH_CandidateReductionValue_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static PDCCH_CandidateReductionValue_r14 n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n50.
    */
   public static PDCCH_CandidateReductionValue_r14 n50() {
      return _n50;
   }

   /**
    * Singleton accessor method for n100.
    */
   public static PDCCH_CandidateReductionValue_r14 n100() {
      return _n100;
   }

   /**
    * Singleton accessor method for n150.
    */
   public static PDCCH_CandidateReductionValue_r14 n150() {
      return _n150;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCCH_CandidateReductionValue_r14.valueOf( PDCCH_CandidateReductionValue_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCCH_CandidateReductionValue_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n50();
         case 2: return n100();
         case 3: return n150();
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
      buffer.invokeCharacters (PDCCH_CandidateReductionValue_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n50");
         case 2: return ("n100");
         case 3: return ("n150");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
