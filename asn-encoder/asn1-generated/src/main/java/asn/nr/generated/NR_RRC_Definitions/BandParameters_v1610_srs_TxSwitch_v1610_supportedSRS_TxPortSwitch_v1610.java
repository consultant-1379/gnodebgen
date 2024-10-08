/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T1R1_T1R2 = 0;
   public static final int _T1R1_T1R2_T1R4 = 1;
   public static final int _T1R1_T1R2_T2R2_T2R4 = 2;
   public static final int _T1R1_T1R2_T2R2_T1R4_T2R4 = 3;
   public static final int _T1R1_T2R2 = 4;
   public static final int _T1R1_T2R2_T4R4 = 5;

   // Singleton instances of BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t1r2 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(0);
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t1r2_t1r4 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(1);
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t1r2_t2r2_t2r4 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(2);
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t1r2_t2r2_t1r4_t2r4 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(3);
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t2r2 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(4);
   protected static final BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 _t1r1_t2r2_t4r4 = new BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610(5);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t1r1_t1r2.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t1r2() {
      return _t1r1_t1r2;
   }

   /**
    * Singleton accessor method for t1r1_t1r2_t1r4.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t1r2_t1r4() {
      return _t1r1_t1r2_t1r4;
   }

   /**
    * Singleton accessor method for t1r1_t1r2_t2r2_t2r4.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t1r2_t2r2_t2r4() {
      return _t1r1_t1r2_t2r2_t2r4;
   }

   /**
    * Singleton accessor method for t1r1_t1r2_t2r2_t1r4_t2r4.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t1r2_t2r2_t1r4_t2r4() {
      return _t1r1_t1r2_t2r2_t1r4_t2r4;
   }

   /**
    * Singleton accessor method for t1r1_t2r2.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t2r2() {
      return _t1r1_t2r2;
   }

   /**
    * Singleton accessor method for t1r1_t2r2_t4r4.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 t1r1_t2r2_t4r4() {
      return _t1r1_t2r2_t4r4;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610.valueOf( BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return t1r1_t1r2();
         case 1: return t1r1_t1r2_t1r4();
         case 2: return t1r1_t1r2_t2r2_t2r4();
         case 3: return t1r1_t1r2_t2r2_t1r4_t2r4();
         case 4: return t1r1_t2r2();
         case 5: return t1r1_t2r2_t4r4();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (6);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (BandParameters_v1610_srs_TxSwitch_v1610_supportedSRS_TxPortSwitch_v1610.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* t1r1_t1r2 */break;
         case 1: ui = 1; /* t1r1_t1r2_t1r4 */break;
         case 2: ui = 2; /* t1r1_t1r2_t2r2_t2r4 */break;
         case 3: ui = 3; /* t1r1_t1r2_t2r2_t1r4_t2r4 */break;
         case 4: ui = 4; /* t1r1_t2r2 */break;
         case 5: ui = 5; /* t1r1_t2r2_t4r4 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 6);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("t1r1-t1r2");
         case 1: return ("t1r1-t1r2-t1r4");
         case 2: return ("t1r1-t1r2-t2r2-t2r4");
         case 3: return ("t1r1-t1r2-t2r2-t1r4-t2r4");
         case 4: return ("t1r1-t2r2");
         case 5: return ("t1r1-t2r2-t4r4");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
