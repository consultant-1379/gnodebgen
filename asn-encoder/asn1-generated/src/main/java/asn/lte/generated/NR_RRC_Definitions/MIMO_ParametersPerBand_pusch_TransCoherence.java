/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_pusch_TransCoherence extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _NONCOHERENT = 0;
   public static final int _PARTIALCOHERENT = 1;
   public static final int _FULLCOHERENT = 2;

   // Singleton instances of MIMO_ParametersPerBand_pusch_TransCoherence
   protected static final MIMO_ParametersPerBand_pusch_TransCoherence _nonCoherent = new MIMO_ParametersPerBand_pusch_TransCoherence(0);
   protected static final MIMO_ParametersPerBand_pusch_TransCoherence _partialCoherent = new MIMO_ParametersPerBand_pusch_TransCoherence(1);
   protected static final MIMO_ParametersPerBand_pusch_TransCoherence _fullCoherent = new MIMO_ParametersPerBand_pusch_TransCoherence(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MIMO_ParametersPerBand_pusch_TransCoherence (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nonCoherent.
    */
   public static MIMO_ParametersPerBand_pusch_TransCoherence nonCoherent() {
      return _nonCoherent;
   }

   /**
    * Singleton accessor method for partialCoherent.
    */
   public static MIMO_ParametersPerBand_pusch_TransCoherence partialCoherent() {
      return _partialCoherent;
   }

   /**
    * Singleton accessor method for fullCoherent.
    */
   public static MIMO_ParametersPerBand_pusch_TransCoherence fullCoherent() {
      return _fullCoherent;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_ParametersPerBand_pusch_TransCoherence.valueOf( MIMO_ParametersPerBand_pusch_TransCoherence.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_ParametersPerBand_pusch_TransCoherence valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return nonCoherent();
         case 1: return partialCoherent();
         case 2: return fullCoherent();
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
      buffer.invokeCharacters (MIMO_ParametersPerBand_pusch_TransCoherence.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nonCoherent");
         case 1: return ("partialCoherent");
         case 2: return ("fullCoherent");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
