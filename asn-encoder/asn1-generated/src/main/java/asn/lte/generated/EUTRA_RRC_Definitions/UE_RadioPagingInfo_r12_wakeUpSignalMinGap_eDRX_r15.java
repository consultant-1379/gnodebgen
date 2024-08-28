/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS40 = 0;
   public static final int _MS240 = 1;
   public static final int _MS1000 = 2;
   public static final int _MS2000 = 3;

   // Singleton instances of UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15
   protected static final UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 _ms40 = new UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15(0);
   protected static final UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 _ms240 = new UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15(1);
   protected static final UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 _ms1000 = new UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15(2);
   protected static final UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 _ms2000 = new UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms240.
    */
   public static UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 ms240() {
      return _ms240;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms2000.
    */
   public static UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 ms2000() {
      return _ms2000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15.valueOf( UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms40();
         case 1: return ms240();
         case 2: return ms1000();
         case 3: return ms2000();
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
      buffer.invokeCharacters (UE_RadioPagingInfo_r12_wakeUpSignalMinGap_eDRX_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms40");
         case 1: return ("ms240");
         case 2: return ("ms1000");
         case 3: return ("ms2000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
