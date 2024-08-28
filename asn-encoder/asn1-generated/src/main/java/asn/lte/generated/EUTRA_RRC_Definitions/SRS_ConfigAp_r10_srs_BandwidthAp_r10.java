/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_ConfigAp_r10_srs_BandwidthAp_r10 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _BW0 = 0;
   public static final int _BW1 = 1;
   public static final int _BW2 = 2;
   public static final int _BW3 = 3;

   // Singleton instances of SRS_ConfigAp_r10_srs_BandwidthAp_r10
   protected static final SRS_ConfigAp_r10_srs_BandwidthAp_r10 _bw0 = new SRS_ConfigAp_r10_srs_BandwidthAp_r10(0);
   protected static final SRS_ConfigAp_r10_srs_BandwidthAp_r10 _bw1 = new SRS_ConfigAp_r10_srs_BandwidthAp_r10(1);
   protected static final SRS_ConfigAp_r10_srs_BandwidthAp_r10 _bw2 = new SRS_ConfigAp_r10_srs_BandwidthAp_r10(2);
   protected static final SRS_ConfigAp_r10_srs_BandwidthAp_r10 _bw3 = new SRS_ConfigAp_r10_srs_BandwidthAp_r10(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SRS_ConfigAp_r10_srs_BandwidthAp_r10 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for bw0.
    */
   public static SRS_ConfigAp_r10_srs_BandwidthAp_r10 bw0() {
      return _bw0;
   }

   /**
    * Singleton accessor method for bw1.
    */
   public static SRS_ConfigAp_r10_srs_BandwidthAp_r10 bw1() {
      return _bw1;
   }

   /**
    * Singleton accessor method for bw2.
    */
   public static SRS_ConfigAp_r10_srs_BandwidthAp_r10 bw2() {
      return _bw2;
   }

   /**
    * Singleton accessor method for bw3.
    */
   public static SRS_ConfigAp_r10_srs_BandwidthAp_r10 bw3() {
      return _bw3;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SRS_ConfigAp_r10_srs_BandwidthAp_r10.valueOf( SRS_ConfigAp_r10_srs_BandwidthAp_r10.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SRS_ConfigAp_r10_srs_BandwidthAp_r10 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return bw0();
         case 1: return bw1();
         case 2: return bw2();
         case 3: return bw3();
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
      buffer.invokeCharacters (SRS_ConfigAp_r10_srs_BandwidthAp_r10.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("bw0");
         case 1: return ("bw1");
         case 2: return ("bw2");
         case 3: return ("bw3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
