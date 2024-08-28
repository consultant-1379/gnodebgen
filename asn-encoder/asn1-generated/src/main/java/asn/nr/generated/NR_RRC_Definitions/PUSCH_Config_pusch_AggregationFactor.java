/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_Config_pusch_AggregationFactor extends Asn1Enumerated {
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

   // Singleton instances of PUSCH_Config_pusch_AggregationFactor
   protected static final PUSCH_Config_pusch_AggregationFactor _n2 = new PUSCH_Config_pusch_AggregationFactor(0);
   protected static final PUSCH_Config_pusch_AggregationFactor _n4 = new PUSCH_Config_pusch_AggregationFactor(1);
   protected static final PUSCH_Config_pusch_AggregationFactor _n8 = new PUSCH_Config_pusch_AggregationFactor(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected PUSCH_Config_pusch_AggregationFactor (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n2.
    */
   public static PUSCH_Config_pusch_AggregationFactor n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static PUSCH_Config_pusch_AggregationFactor n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static PUSCH_Config_pusch_AggregationFactor n8() {
      return _n8;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PUSCH_Config_pusch_AggregationFactor.valueOf( PUSCH_Config_pusch_AggregationFactor.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PUSCH_Config_pusch_AggregationFactor valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n2();
         case 1: return n4();
         case 2: return n8();
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
      buffer.invokeCharacters (PUSCH_Config_pusch_AggregationFactor.valueOf(ret).toString());

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
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n2");
         case 1: return ("n4");
         case 2: return ("n8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
