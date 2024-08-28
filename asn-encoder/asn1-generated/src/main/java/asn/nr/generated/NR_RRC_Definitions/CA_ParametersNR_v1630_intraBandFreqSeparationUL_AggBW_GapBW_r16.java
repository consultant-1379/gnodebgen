/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _CLASSI = 0;
   public static final int _CLASSII = 1;
   public static final int _CLASSIII = 2;

   // Singleton instances of CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16
   protected static final CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 _classI = new CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16(0);
   protected static final CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 _classII = new CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16(1);
   protected static final CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 _classIII = new CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for classI.
    */
   public static CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 classI() {
      return _classI;
   }

   /**
    * Singleton accessor method for classII.
    */
   public static CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 classII() {
      return _classII;
   }

   /**
    * Singleton accessor method for classIII.
    */
   public static CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 classIII() {
      return _classIII;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16.valueOf( CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return classI();
         case 1: return classII();
         case 2: return classIII();
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
      buffer.invokeCharacters (CA_ParametersNR_v1630_intraBandFreqSeparationUL_AggBW_GapBW_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* classI */break;
         case 1: ui = 1; /* classII */break;
         case 2: ui = 2; /* classIII */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("classI");
         case 1: return ("classII");
         case 2: return ("classIII");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
