/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;
   public static final int _N4 = 2;

   // Singleton instances of MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting
   protected static final MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting _n1 = new MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting(0);
   protected static final MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting _n2 = new MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting(1);
   protected static final MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting _n4 = new MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting n4() {
      return _n4;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting.valueOf( MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n4();
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
      buffer.invokeCharacters (MIMO_ParametersPerBand_maxNumberNonGroupBeamReporting.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n1 */break;
         case 1: ui = 1; /* n2 */break;
         case 2: ui = 2; /* n4 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n4");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
