/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRB_ToAddMod_drb_TypeLWIP_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _LWIP = 0;
   public static final int _LWIP_DL_ONLY = 1;
   public static final int _LWIP_UL_ONLY = 2;
   public static final int _EUTRAN = 3;

   // Singleton instances of DRB_ToAddMod_drb_TypeLWIP_r13
   protected static final DRB_ToAddMod_drb_TypeLWIP_r13 _lwip = new DRB_ToAddMod_drb_TypeLWIP_r13(0);
   protected static final DRB_ToAddMod_drb_TypeLWIP_r13 _lwip_DL_only = new DRB_ToAddMod_drb_TypeLWIP_r13(1);
   protected static final DRB_ToAddMod_drb_TypeLWIP_r13 _lwip_UL_only = new DRB_ToAddMod_drb_TypeLWIP_r13(2);
   protected static final DRB_ToAddMod_drb_TypeLWIP_r13 _eutran = new DRB_ToAddMod_drb_TypeLWIP_r13(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected DRB_ToAddMod_drb_TypeLWIP_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for lwip.
    */
   public static DRB_ToAddMod_drb_TypeLWIP_r13 lwip() {
      return _lwip;
   }

   /**
    * Singleton accessor method for lwip_DL_only.
    */
   public static DRB_ToAddMod_drb_TypeLWIP_r13 lwip_DL_only() {
      return _lwip_DL_only;
   }

   /**
    * Singleton accessor method for lwip_UL_only.
    */
   public static DRB_ToAddMod_drb_TypeLWIP_r13 lwip_UL_only() {
      return _lwip_UL_only;
   }

   /**
    * Singleton accessor method for eutran.
    */
   public static DRB_ToAddMod_drb_TypeLWIP_r13 eutran() {
      return _eutran;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRB_ToAddMod_drb_TypeLWIP_r13.valueOf( DRB_ToAddMod_drb_TypeLWIP_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRB_ToAddMod_drb_TypeLWIP_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return lwip();
         case 1: return lwip_DL_only();
         case 2: return lwip_UL_only();
         case 3: return eutran();
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
      buffer.invokeCharacters (DRB_ToAddMod_drb_TypeLWIP_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("lwip");
         case 1: return ("lwip-DL-only");
         case 2: return ("lwip-UL-only");
         case 3: return ("eutran");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
