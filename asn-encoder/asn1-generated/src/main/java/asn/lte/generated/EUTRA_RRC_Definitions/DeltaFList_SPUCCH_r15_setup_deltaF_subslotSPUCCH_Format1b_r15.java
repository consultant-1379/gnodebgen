/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DELTAF6 = 0;
   public static final int _DELTAF7 = 1;
   public static final int _DELTAF8 = 2;
   public static final int _DELTAF9 = 3;
   public static final int _DELTAF10 = 4;
   public static final int _DELTAF11 = 5;
   public static final int _DELTAF12 = 6;
   public static final int _DELTAF13 = 7;

   // Singleton instances of DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF6 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(0);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF7 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(1);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF8 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(2);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF9 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(3);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF10 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(4);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF11 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(5);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF12 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(6);
   protected static final DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 _deltaF13 = new DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15(7);

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
   protected DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for deltaF6.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF6() {
      return _deltaF6;
   }

   /**
    * Singleton accessor method for deltaF7.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF7() {
      return _deltaF7;
   }

   /**
    * Singleton accessor method for deltaF8.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF8() {
      return _deltaF8;
   }

   /**
    * Singleton accessor method for deltaF9.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF9() {
      return _deltaF9;
   }

   /**
    * Singleton accessor method for deltaF10.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF10() {
      return _deltaF10;
   }

   /**
    * Singleton accessor method for deltaF11.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF11() {
      return _deltaF11;
   }

   /**
    * Singleton accessor method for deltaF12.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF12() {
      return _deltaF12;
   }

   /**
    * Singleton accessor method for deltaF13.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 deltaF13() {
      return _deltaF13;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15.valueOf( DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return deltaF6();
         case 1: return deltaF7();
         case 2: return deltaF8();
         case 3: return deltaF9();
         case 4: return deltaF10();
         case 5: return deltaF11();
         case 6: return deltaF12();
         case 7: return deltaF13();
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
      buffer.invokeCharacters (DeltaFList_SPUCCH_r15_setup_deltaF_subslotSPUCCH_Format1b_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("deltaF6");
         case 1: return ("deltaF7");
         case 2: return ("deltaF8");
         case 3: return ("deltaF9");
         case 4: return ("deltaF10");
         case 5: return ("deltaF11");
         case 6: return ("deltaF12");
         case 7: return ("deltaF13");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
