/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DeltaFList_PUCCH_deltaF_PUCCH_Format2b extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DELTAF_2 = 0;
   public static final int _DELTAF0 = 1;
   public static final int _DELTAF2 = 2;

   // Singleton instances of DeltaFList_PUCCH_deltaF_PUCCH_Format2b
   protected static final DeltaFList_PUCCH_deltaF_PUCCH_Format2b _deltaF_2 = new DeltaFList_PUCCH_deltaF_PUCCH_Format2b(0);
   protected static final DeltaFList_PUCCH_deltaF_PUCCH_Format2b _deltaF0 = new DeltaFList_PUCCH_deltaF_PUCCH_Format2b(1);
   protected static final DeltaFList_PUCCH_deltaF_PUCCH_Format2b _deltaF2 = new DeltaFList_PUCCH_deltaF_PUCCH_Format2b(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected DeltaFList_PUCCH_deltaF_PUCCH_Format2b (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for deltaF_2.
    */
   public static DeltaFList_PUCCH_deltaF_PUCCH_Format2b deltaF_2() {
      return _deltaF_2;
   }

   /**
    * Singleton accessor method for deltaF0.
    */
   public static DeltaFList_PUCCH_deltaF_PUCCH_Format2b deltaF0() {
      return _deltaF0;
   }

   /**
    * Singleton accessor method for deltaF2.
    */
   public static DeltaFList_PUCCH_deltaF_PUCCH_Format2b deltaF2() {
      return _deltaF2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DeltaFList_PUCCH_deltaF_PUCCH_Format2b.valueOf( DeltaFList_PUCCH_deltaF_PUCCH_Format2b.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DeltaFList_PUCCH_deltaF_PUCCH_Format2b valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return deltaF_2();
         case 1: return deltaF0();
         case 2: return deltaF2();
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
      buffer.invokeCharacters (DeltaFList_PUCCH_deltaF_PUCCH_Format2b.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("deltaF-2");
         case 1: return ("deltaF0");
         case 2: return ("deltaF2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
