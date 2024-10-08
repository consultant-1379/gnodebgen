/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _EUTRA_NR = 0;
   public static final int _NR = 1;
   public static final int _OTHER = 2;
   public static final int _EUTRA_NR_OTHER = 3;
   public static final int _NR_OTHER = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _eutra_nr = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(0);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _nr = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(1);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _other = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(2);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _eutra_nr_other = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(3);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _nr_other = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(4);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _spare3 = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(5);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _spare2 = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(6);
   protected static final AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 _spare1 = new AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15(7);

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
   protected AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for eutra_nr.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 eutra_nr() {
      return _eutra_nr;
   }

   /**
    * Singleton accessor method for nr.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 nr() {
      return _nr;
   }

   /**
    * Singleton accessor method for other.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 other() {
      return _other;
   }

   /**
    * Singleton accessor method for eutra_nr_other.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 eutra_nr_other() {
      return _eutra_nr_other;
   }

   /**
    * Singleton accessor method for nr_other.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 nr_other() {
      return _nr_other;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15.valueOf( AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return eutra_nr();
         case 1: return nr();
         case 2: return other();
         case 3: return eutra_nr_other();
         case 4: return nr_other();
         case 5: return spare3();
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
      buffer.invokeCharacters (AffectedCarrierFreqCombInfoMRDC_r15_interferenceDirectionMRDC_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("eutra-nr");
         case 1: return ("nr");
         case 2: return ("other");
         case 3: return ("eutra-nr-other");
         case 4: return ("nr-other");
         case 5: return ("spare3");
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
