/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EstablishmentCause extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EstablishmentCause";
   }

   // Integer constants for switch-case
   public static final int _EMERGENCY = 0;
   public static final int _HIGHPRIORITYACCESS = 1;
   public static final int _MT_ACCESS = 2;
   public static final int _MO_SIGNALLING = 3;
   public static final int _MO_DATA = 4;
   public static final int _MO_VOICECALL = 5;
   public static final int _MO_VIDEOCALL = 6;
   public static final int _MO_SMS = 7;
   public static final int _MPS_PRIORITYACCESS = 8;
   public static final int _MCS_PRIORITYACCESS = 9;
   public static final int _SPARE6 = 10;
   public static final int _SPARE5 = 11;
   public static final int _SPARE4 = 12;
   public static final int _SPARE3 = 13;
   public static final int _SPARE2 = 14;
   public static final int _SPARE1 = 15;

   // Singleton instances of EstablishmentCause
   protected static final EstablishmentCause _emergency = new EstablishmentCause(0);
   protected static final EstablishmentCause _highPriorityAccess = new EstablishmentCause(1);
   protected static final EstablishmentCause _mt_Access = new EstablishmentCause(2);
   protected static final EstablishmentCause _mo_Signalling = new EstablishmentCause(3);
   protected static final EstablishmentCause _mo_Data = new EstablishmentCause(4);
   protected static final EstablishmentCause _mo_VoiceCall = new EstablishmentCause(5);
   protected static final EstablishmentCause _mo_VideoCall = new EstablishmentCause(6);
   protected static final EstablishmentCause _mo_SMS = new EstablishmentCause(7);
   protected static final EstablishmentCause _mps_PriorityAccess = new EstablishmentCause(8);
   protected static final EstablishmentCause _mcs_PriorityAccess = new EstablishmentCause(9);
   protected static final EstablishmentCause _spare6 = new EstablishmentCause(10);
   protected static final EstablishmentCause _spare5 = new EstablishmentCause(11);
   protected static final EstablishmentCause _spare4 = new EstablishmentCause(12);
   protected static final EstablishmentCause _spare3 = new EstablishmentCause(13);
   protected static final EstablishmentCause _spare2 = new EstablishmentCause(14);
   protected static final EstablishmentCause _spare1 = new EstablishmentCause(15);

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
    *   8
    *   9
    *   10
    *   11
    *   12
    *   13
    *   14
    *   15
    */
   protected EstablishmentCause (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for emergency.
    */
   public static EstablishmentCause emergency() {
      return _emergency;
   }

   /**
    * Singleton accessor method for highPriorityAccess.
    */
   public static EstablishmentCause highPriorityAccess() {
      return _highPriorityAccess;
   }

   /**
    * Singleton accessor method for mt_Access.
    */
   public static EstablishmentCause mt_Access() {
      return _mt_Access;
   }

   /**
    * Singleton accessor method for mo_Signalling.
    */
   public static EstablishmentCause mo_Signalling() {
      return _mo_Signalling;
   }

   /**
    * Singleton accessor method for mo_Data.
    */
   public static EstablishmentCause mo_Data() {
      return _mo_Data;
   }

   /**
    * Singleton accessor method for mo_VoiceCall.
    */
   public static EstablishmentCause mo_VoiceCall() {
      return _mo_VoiceCall;
   }

   /**
    * Singleton accessor method for mo_VideoCall.
    */
   public static EstablishmentCause mo_VideoCall() {
      return _mo_VideoCall;
   }

   /**
    * Singleton accessor method for mo_SMS.
    */
   public static EstablishmentCause mo_SMS() {
      return _mo_SMS;
   }

   /**
    * Singleton accessor method for mps_PriorityAccess.
    */
   public static EstablishmentCause mps_PriorityAccess() {
      return _mps_PriorityAccess;
   }

   /**
    * Singleton accessor method for mcs_PriorityAccess.
    */
   public static EstablishmentCause mcs_PriorityAccess() {
      return _mcs_PriorityAccess;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static EstablishmentCause spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static EstablishmentCause spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static EstablishmentCause spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static EstablishmentCause spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static EstablishmentCause spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static EstablishmentCause spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EstablishmentCause.valueOf( EstablishmentCause.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EstablishmentCause valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return emergency();
         case 1: return highPriorityAccess();
         case 2: return mt_Access();
         case 3: return mo_Signalling();
         case 4: return mo_Data();
         case 5: return mo_VoiceCall();
         case 6: return mo_VideoCall();
         case 7: return mo_SMS();
         case 8: return mps_PriorityAccess();
         case 9: return mcs_PriorityAccess();
         case 10: return spare6();
         case 11: return spare5();
         case 12: return spare4();
         case 13: return spare3();
         case 14: return spare2();
         case 15: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (16);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         case 8: ret =  8; break;
         case 9: ret =  9; break;
         case 10: ret =  10; break;
         case 11: ret =  11; break;
         case 12: ret =  12; break;
         case 13: ret =  13; break;
         case 14: ret =  14; break;
         case 15: ret =  15; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EstablishmentCause.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* emergency */break;
         case 1: ui = 1; /* highPriorityAccess */break;
         case 2: ui = 2; /* mt_Access */break;
         case 3: ui = 3; /* mo_Signalling */break;
         case 4: ui = 4; /* mo_Data */break;
         case 5: ui = 5; /* mo_VoiceCall */break;
         case 6: ui = 6; /* mo_VideoCall */break;
         case 7: ui = 7; /* mo_SMS */break;
         case 8: ui = 8; /* mps_PriorityAccess */break;
         case 9: ui = 9; /* mcs_PriorityAccess */break;
         case 10: ui = 10; /* spare6 */break;
         case 11: ui = 11; /* spare5 */break;
         case 12: ui = 12; /* spare4 */break;
         case 13: ui = 13; /* spare3 */break;
         case 14: ui = 14; /* spare2 */break;
         case 15: ui = 15; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 16);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("emergency");
         case 1: return ("highPriorityAccess");
         case 2: return ("mt-Access");
         case 3: return ("mo-Signalling");
         case 4: return ("mo-Data");
         case 5: return ("mo-VoiceCall");
         case 6: return ("mo-VideoCall");
         case 7: return ("mo-SMS");
         case 8: return ("mps-PriorityAccess");
         case 9: return ("mcs-PriorityAccess");
         case 10: return ("spare6");
         case 11: return ("spare5");
         case 12: return ("spare4");
         case 13: return ("spare3");
         case 14: return ("spare2");
         case 15: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
