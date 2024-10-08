/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SONInformationRequest extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SONInformationRequest";
   }

   // Integer constants for switch-case
   public static final int _X2TNL_CONFIGURATION_INFO = 0;
   public static final int _TIME_SYNCHRONISATION_INFO = 1;
   public static final int _ACTIVATE_MUTING = 2;
   public static final int _DEACTIVATE_MUTING = 3;

   // Singleton instances of SONInformationRequest
   protected static final SONInformationRequest _x2TNL_Configuration_Info = new SONInformationRequest(0);
   protected static final SONInformationRequest _time_Synchronisation_Info = new SONInformationRequest(1);
   protected static final SONInformationRequest _activate_Muting = new SONInformationRequest(2);
   protected static final SONInformationRequest _deactivate_Muting = new SONInformationRequest(3);
   private static SONInformationRequest __undefined = new SONInformationRequest(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SONInformationRequest (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for x2TNL_Configuration_Info.
    */
   public static SONInformationRequest x2TNL_Configuration_Info() {
      return _x2TNL_Configuration_Info;
   }

   /**
    * Singleton accessor method for time_Synchronisation_Info.
    */
   public static SONInformationRequest time_Synchronisation_Info() {
      return _time_Synchronisation_Info;
   }

   /**
    * Singleton accessor method for activate_Muting.
    */
   public static SONInformationRequest activate_Muting() {
      return _activate_Muting;
   }

   /**
    * Singleton accessor method for deactivate_Muting.
    */
   public static SONInformationRequest deactivate_Muting() {
      return _deactivate_Muting;
   }

   /** Undefined value. */
   protected static SONInformationRequest __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SONInformationRequest.valueOf( SONInformationRequest.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SONInformationRequest valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return x2TNL_Configuration_Info();
         case 1: return time_Synchronisation_Info();
         case 2: return activate_Muting();
         case 3: return deactivate_Muting();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         switch (ui) {
            case 0: ret = 1; break;
            case 1: ret = 2; break;
            case 2: ret = 3; break;
            default: ret = 0x7fffffff; break;
         }
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (1);

         switch (ui) {
            case 0: ret =  0; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SONInformationRequest.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("x2TNL-Configuration-Info");
         case 1: return ("time-Synchronisation-Info");
         case 2: return ("activate-Muting");
         case 3: return ("deactivate-Muting");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
