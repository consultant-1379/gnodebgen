/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS3 = 0;
   public static final int _MS4 = 1;

   // Singleton instances of TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 _ms3 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530(0);
   protected static final TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 _ms4 = new TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for ms4.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 ms4() {
      return _ms4;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530.valueOf( TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms3();
         case 1: return ms4();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (TDD_UL_DL_Pattern_dl_UL_TransmissionPeriodicity_v1530.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms3 */break;
         case 1: ui = 1; /* ms4 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 2);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms3");
         case 1: return ("ms4");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
