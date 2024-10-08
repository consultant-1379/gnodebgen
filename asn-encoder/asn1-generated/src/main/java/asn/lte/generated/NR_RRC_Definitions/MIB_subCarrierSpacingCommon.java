/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIB_subCarrierSpacingCommon extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SCS15OR60 = 0;
   public static final int _SCS30OR120 = 1;

   // Singleton instances of MIB_subCarrierSpacingCommon
   protected static final MIB_subCarrierSpacingCommon _scs15or60 = new MIB_subCarrierSpacingCommon(0);
   protected static final MIB_subCarrierSpacingCommon _scs30or120 = new MIB_subCarrierSpacingCommon(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected MIB_subCarrierSpacingCommon (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for scs15or60.
    */
   public static MIB_subCarrierSpacingCommon scs15or60() {
      return _scs15or60;
   }

   /**
    * Singleton accessor method for scs30or120.
    */
   public static MIB_subCarrierSpacingCommon scs30or120() {
      return _scs30or120;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIB_subCarrierSpacingCommon.valueOf( MIB_subCarrierSpacingCommon.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIB_subCarrierSpacingCommon valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return scs15or60();
         case 1: return scs30or120();
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
      buffer.invokeCharacters (MIB_subCarrierSpacingCommon.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("scs15or60");
         case 1: return ("scs30or120");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
