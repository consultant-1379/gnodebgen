/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N17 = 0;
   public static final int _M1 = 1;

   // Singleton instances of UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310
   protected static final UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 _n17 = new UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310(0);
   protected static final UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 _m1 = new UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n17.
    */
   public static UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 n17() {
      return _n17;
   }

   /**
    * Singleton accessor method for m1.
    */
   public static UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 m1() {
      return _m1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310.valueOf( UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n17();
         case 1: return m1();
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
      buffer.invokeCharacters (UE_EUTRA_Capability_v1310_IEs_ue_CategoryDL_v1310.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n17");
         case 1: return ("m1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
