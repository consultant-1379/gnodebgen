/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DBM_130 = 0;
   public static final int _DBM_128 = 1;
   public static final int _DBM_126 = 2;
   public static final int _DBM_124 = 3;
   public static final int _DBM_122 = 4;
   public static final int _DBM_88 = 5;
   public static final int _DBM_86 = 6;
   public static final int _DBM_84 = 7;
   public static final int _DBM_82 = 8;
   public static final int _DBM_80 = 9;

   // Singleton instances of PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_130 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(0);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_128 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(1);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_126 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(2);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_124 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(3);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_122 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(4);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_88 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(5);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_86 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(6);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_84 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(7);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_82 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(8);
   protected static final PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 _dBm_80 = new PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450(9);

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
    *   8
    *   9
    */
   protected PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dBm_130.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_130() {
      return _dBm_130;
   }

   /**
    * Singleton accessor method for dBm_128.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_128() {
      return _dBm_128;
   }

   /**
    * Singleton accessor method for dBm_126.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_126() {
      return _dBm_126;
   }

   /**
    * Singleton accessor method for dBm_124.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_124() {
      return _dBm_124;
   }

   /**
    * Singleton accessor method for dBm_122.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_122() {
      return _dBm_122;
   }

   /**
    * Singleton accessor method for dBm_88.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_88() {
      return _dBm_88;
   }

   /**
    * Singleton accessor method for dBm_86.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_86() {
      return _dBm_86;
   }

   /**
    * Singleton accessor method for dBm_84.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_84() {
      return _dBm_84;
   }

   /**
    * Singleton accessor method for dBm_82.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_82() {
      return _dBm_82;
   }

   /**
    * Singleton accessor method for dBm_80.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 dBm_80() {
      return _dBm_80;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450.valueOf( PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dBm_130();
         case 1: return dBm_128();
         case 2: return dBm_126();
         case 3: return dBm_124();
         case 4: return dBm_122();
         case 5: return dBm_88();
         case 6: return dBm_86();
         case 7: return dBm_84();
         case 8: return dBm_82();
         case 9: return dBm_80();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (10);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         case 8: ret =  8; break;
         case 9: ret =  9; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PowerRampingParameters_NB_v1450_preambleInitialReceivedTargetPower_v1450.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dBm-130");
         case 1: return ("dBm-128");
         case 2: return ("dBm-126");
         case 3: return ("dBm-124");
         case 4: return ("dBm-122");
         case 5: return ("dBm-88");
         case 6: return ("dBm-86");
         case 7: return ("dBm-84");
         case 8: return ("dBm-82");
         case 9: return ("dBm-80");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
