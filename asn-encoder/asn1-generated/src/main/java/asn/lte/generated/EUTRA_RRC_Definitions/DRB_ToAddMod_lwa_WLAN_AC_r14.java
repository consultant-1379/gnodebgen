/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRB_ToAddMod_lwa_WLAN_AC_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _AC_BK = 0;
   public static final int _AC_BE = 1;
   public static final int _AC_VI = 2;
   public static final int _AC_VO = 3;

   // Singleton instances of DRB_ToAddMod_lwa_WLAN_AC_r14
   protected static final DRB_ToAddMod_lwa_WLAN_AC_r14 _ac_bk = new DRB_ToAddMod_lwa_WLAN_AC_r14(0);
   protected static final DRB_ToAddMod_lwa_WLAN_AC_r14 _ac_be = new DRB_ToAddMod_lwa_WLAN_AC_r14(1);
   protected static final DRB_ToAddMod_lwa_WLAN_AC_r14 _ac_vi = new DRB_ToAddMod_lwa_WLAN_AC_r14(2);
   protected static final DRB_ToAddMod_lwa_WLAN_AC_r14 _ac_vo = new DRB_ToAddMod_lwa_WLAN_AC_r14(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected DRB_ToAddMod_lwa_WLAN_AC_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ac_bk.
    */
   public static DRB_ToAddMod_lwa_WLAN_AC_r14 ac_bk() {
      return _ac_bk;
   }

   /**
    * Singleton accessor method for ac_be.
    */
   public static DRB_ToAddMod_lwa_WLAN_AC_r14 ac_be() {
      return _ac_be;
   }

   /**
    * Singleton accessor method for ac_vi.
    */
   public static DRB_ToAddMod_lwa_WLAN_AC_r14 ac_vi() {
      return _ac_vi;
   }

   /**
    * Singleton accessor method for ac_vo.
    */
   public static DRB_ToAddMod_lwa_WLAN_AC_r14 ac_vo() {
      return _ac_vo;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRB_ToAddMod_lwa_WLAN_AC_r14.valueOf( DRB_ToAddMod_lwa_WLAN_AC_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRB_ToAddMod_lwa_WLAN_AC_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ac_bk();
         case 1: return ac_be();
         case 2: return ac_vi();
         case 3: return ac_vo();
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
      buffer.invokeCharacters (DRB_ToAddMod_lwa_WLAN_AC_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ac-bk");
         case 1: return ("ac-be");
         case 2: return ("ac-vi");
         case 3: return ("ac-vo");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
