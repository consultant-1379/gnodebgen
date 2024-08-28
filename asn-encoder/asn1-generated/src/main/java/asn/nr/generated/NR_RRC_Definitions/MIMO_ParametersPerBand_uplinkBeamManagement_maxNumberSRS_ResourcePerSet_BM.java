/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N2 = 0;
   public static final int _N4 = 1;
   public static final int _N8 = 2;
   public static final int _N16 = 3;

   // Singleton instances of MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM
   protected static final MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM _n2 = new MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM(0);
   protected static final MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM _n4 = new MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM(1);
   protected static final MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM _n8 = new MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM(2);
   protected static final MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM _n16 = new MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n2.
    */
   public static MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM n16() {
      return _n16;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM.valueOf( MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n2();
         case 1: return n4();
         case 2: return n8();
         case 3: return n16();
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
      buffer.invokeCharacters (MIMO_ParametersPerBand_uplinkBeamManagement_maxNumberSRS_ResourcePerSet_BM.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n2 */break;
         case 1: ui = 1; /* n4 */break;
         case 2: ui = 2; /* n8 */break;
         case 3: ui = 3; /* n16 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n2");
         case 1: return ("n4");
         case 2: return ("n8");
         case 3: return ("n16");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
