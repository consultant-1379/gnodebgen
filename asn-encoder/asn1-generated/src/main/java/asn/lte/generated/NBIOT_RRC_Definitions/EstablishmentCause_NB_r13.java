/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EstablishmentCause_NB_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EstablishmentCause-NB-r13";
   }

   // Integer constants for switch-case
   public static final int _MT_ACCESS = 0;
   public static final int _MO_SIGNALLING = 1;
   public static final int _MO_DATA = 2;
   public static final int _MO_EXCEPTIONDATA = 3;
   public static final int _DELAYTOLERANTACCESS_V1330 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of EstablishmentCause_NB_r13
   protected static final EstablishmentCause_NB_r13 _mt_Access = new EstablishmentCause_NB_r13(0);
   protected static final EstablishmentCause_NB_r13 _mo_Signalling = new EstablishmentCause_NB_r13(1);
   protected static final EstablishmentCause_NB_r13 _mo_Data = new EstablishmentCause_NB_r13(2);
   protected static final EstablishmentCause_NB_r13 _mo_ExceptionData = new EstablishmentCause_NB_r13(3);
   protected static final EstablishmentCause_NB_r13 _delayTolerantAccess_v1330 = new EstablishmentCause_NB_r13(4);
   protected static final EstablishmentCause_NB_r13 _spare3 = new EstablishmentCause_NB_r13(5);
   protected static final EstablishmentCause_NB_r13 _spare2 = new EstablishmentCause_NB_r13(6);
   protected static final EstablishmentCause_NB_r13 _spare1 = new EstablishmentCause_NB_r13(7);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    */
   protected EstablishmentCause_NB_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mt_Access.
    */
   public static EstablishmentCause_NB_r13 mt_Access() {
      return _mt_Access;
   }

   /**
    * Singleton accessor method for mo_Signalling.
    */
   public static EstablishmentCause_NB_r13 mo_Signalling() {
      return _mo_Signalling;
   }

   /**
    * Singleton accessor method for mo_Data.
    */
   public static EstablishmentCause_NB_r13 mo_Data() {
      return _mo_Data;
   }

   /**
    * Singleton accessor method for mo_ExceptionData.
    */
   public static EstablishmentCause_NB_r13 mo_ExceptionData() {
      return _mo_ExceptionData;
   }

   /**
    * Singleton accessor method for delayTolerantAccess_v1330.
    */
   public static EstablishmentCause_NB_r13 delayTolerantAccess_v1330() {
      return _delayTolerantAccess_v1330;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static EstablishmentCause_NB_r13 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static EstablishmentCause_NB_r13 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static EstablishmentCause_NB_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EstablishmentCause_NB_r13.valueOf( EstablishmentCause_NB_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EstablishmentCause_NB_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mt_Access();
         case 1: return mo_Signalling();
         case 2: return mo_Data();
         case 3: return mo_ExceptionData();
         case 4: return delayTolerantAccess_v1330();
         case 5: return spare3();
         case 6: return spare2();
         case 7: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EstablishmentCause_NB_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mt-Access");
         case 1: return ("mo-Signalling");
         case 2: return ("mo-Data");
         case 3: return ("mo-ExceptionData");
         case 4: return ("delayTolerantAccess-v1330");
         case 5: return ("spare3");
         case 6: return ("spare2");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
