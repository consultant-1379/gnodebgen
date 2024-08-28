/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RESERVED = 0;
   public static final int _NOTRESERVED = 1;

   // Singleton instances of PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15
   protected static final PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 _reserved = new PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15(0);
   protected static final PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 _notReserved = new PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for reserved.
    */
   public static PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 reserved() {
      return _reserved;
   }

   /**
    * Singleton accessor method for notReserved.
    */
   public static PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 notReserved() {
      return _notReserved;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15.valueOf( PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return reserved();
         case 1: return notReserved();
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
      buffer.invokeCharacters (PLMN_IdentityInfo_v1530_cellReservedForOperatorUse_CRS_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("reserved");
         case 1: return ("notReserved");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
