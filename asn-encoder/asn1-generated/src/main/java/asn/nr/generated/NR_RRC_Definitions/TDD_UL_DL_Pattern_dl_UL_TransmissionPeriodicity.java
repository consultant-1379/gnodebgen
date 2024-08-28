/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS0P5 = 0;
   public static final int _MS0P625 = 1;
   public static final int _MS1 = 2;
   public static final int _MS1P25 = 3;
   public static final int _MS2 = 4;
   public static final int _MS2P5 = 5;
   public static final int _MS5 = 6;
   public static final int _MS10 = 7;

   // Singleton instances of TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms0p5 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(0);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms0p625 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(1);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms1 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(2);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms1p25 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(3);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms2 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(4);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms2p5 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(5);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms5 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(6);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity _ms10 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity(7);

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
   protected TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0p5.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms0p5() {
      return _ms0p5;
   }

   /**
    * Singleton accessor method for ms0p625.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms0p625() {
      return _ms0p625;
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms1p25.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms1p25() {
      return _ms1p25;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms2p5.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms2p5() {
      return _ms2p5;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity ms10() {
      return _ms10;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity.valueOf( TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0p5();
         case 1: return ms0p625();
         case 2: return ms1();
         case 3: return ms1p25();
         case 4: return ms2();
         case 5: return ms2p5();
         case 6: return ms5();
         case 7: return ms10();
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
      buffer.invokeCharacters (TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms0p5 */break;
         case 1: ui = 1; /* ms0p625 */break;
         case 2: ui = 2; /* ms1 */break;
         case 3: ui = 3; /* ms1p25 */break;
         case 4: ui = 4; /* ms2 */break;
         case 5: ui = 5; /* ms2p5 */break;
         case 6: ui = 6; /* ms5 */break;
         case 7: ui = 7; /* ms10 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0p5");
         case 1: return ("ms0p625");
         case 2: return ("ms1");
         case 3: return ("ms1p25");
         case 4: return ("ms2");
         case 5: return ("ms2p5");
         case 6: return ("ms5");
         case 7: return ("ms10");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
