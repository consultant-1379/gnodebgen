/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PHR_Config_phr_Tx_PowerFactorChange extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB1 = 0;
   public static final int _DB3 = 1;
   public static final int _DB6 = 2;
   public static final int _INFINITY = 3;

   // Singleton instances of PHR_Config_phr_Tx_PowerFactorChange
   protected static final PHR_Config_phr_Tx_PowerFactorChange _dB1 = new PHR_Config_phr_Tx_PowerFactorChange(0);
   protected static final PHR_Config_phr_Tx_PowerFactorChange _dB3 = new PHR_Config_phr_Tx_PowerFactorChange(1);
   protected static final PHR_Config_phr_Tx_PowerFactorChange _dB6 = new PHR_Config_phr_Tx_PowerFactorChange(2);
   protected static final PHR_Config_phr_Tx_PowerFactorChange _infinity = new PHR_Config_phr_Tx_PowerFactorChange(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected PHR_Config_phr_Tx_PowerFactorChange (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB1.
    */
   public static PHR_Config_phr_Tx_PowerFactorChange dB1() {
      return _dB1;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static PHR_Config_phr_Tx_PowerFactorChange dB3() {
      return _dB3;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static PHR_Config_phr_Tx_PowerFactorChange dB6() {
      return _dB6;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static PHR_Config_phr_Tx_PowerFactorChange infinity() {
      return _infinity;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PHR_Config_phr_Tx_PowerFactorChange.valueOf( PHR_Config_phr_Tx_PowerFactorChange.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PHR_Config_phr_Tx_PowerFactorChange valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB1();
         case 1: return dB3();
         case 2: return dB6();
         case 3: return infinity();
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
      buffer.invokeCharacters (PHR_Config_phr_Tx_PowerFactorChange.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* dB1 */break;
         case 1: ui = 1; /* dB3 */break;
         case 2: ui = 2; /* dB6 */break;
         case 3: ui = 3; /* infinity */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB1");
         case 1: return ("dB3");
         case 2: return ("dB6");
         case 3: return ("infinity");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
