/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB_6 = 0;
   public static final int _DB_4 = 1;
   public static final int _DB_2 = 2;
   public static final int _DB0 = 3;

   // Singleton instances of SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium
   protected static final SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium _dB_6 = new SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium(0);
   protected static final SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium _dB_4 = new SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium(1);
   protected static final SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium _dB_2 = new SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium(2);
   protected static final SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium _dB0 = new SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_4.
    */
   public static SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium dB_4() {
      return _dB_4;
   }

   /**
    * Singleton accessor method for dB_2.
    */
   public static SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium dB_2() {
      return _dB_2;
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium dB0() {
      return _dB0;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium.valueOf( SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB_6();
         case 1: return dB_4();
         case 2: return dB_2();
         case 3: return dB0();
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
      buffer.invokeCharacters (SIB2_cellReselectionInfoCommon_speedStateReselectionPars_q_HystSF_sf_Medium.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* dB_6 */break;
         case 1: ui = 1; /* dB_4 */break;
         case 2: ui = 2; /* dB_2 */break;
         case 3: ui = 3; /* dB0 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-6");
         case 1: return ("dB-4");
         case 2: return ("dB-2");
         case 3: return ("dB0");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
