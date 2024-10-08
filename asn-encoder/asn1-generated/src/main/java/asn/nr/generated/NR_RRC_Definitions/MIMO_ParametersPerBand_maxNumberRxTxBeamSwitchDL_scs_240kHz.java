/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N4 = 0;
   public static final int _N7 = 1;
   public static final int _N14 = 2;

   // Singleton instances of MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz
   protected static final MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz _n4 = new MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz(0);
   protected static final MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz _n7 = new MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz(1);
   protected static final MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz _n14 = new MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n7.
    */
   public static MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz n7() {
      return _n7;
   }

   /**
    * Singleton accessor method for n14.
    */
   public static MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz n14() {
      return _n14;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz.valueOf( MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n4();
         case 1: return n7();
         case 2: return n14();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MIMO_ParametersPerBand_maxNumberRxTxBeamSwitchDL_scs_240kHz.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n4 */break;
         case 1: ui = 1; /* n7 */break;
         case 2: ui = 2; /* n14 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n4");
         case 1: return ("n7");
         case 2: return ("n14");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
