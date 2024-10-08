/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ServiceType extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ServiceType";
   }

   // Integer constants for switch-case
   public static final int _QMC_FOR_STREAMING_SERVICE = 0;
   public static final int _QMC_FOR_MTSI_SERVICE = 1;

   // Singleton instances of ServiceType
   protected static final ServiceType _qMC_for_streaming_service = new ServiceType(0);
   protected static final ServiceType _qMC_for_MTSI_service = new ServiceType(1);
   private static ServiceType __undefined = new ServiceType(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected ServiceType (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for qMC_for_streaming_service.
    */
   public static ServiceType qMC_for_streaming_service() {
      return _qMC_for_streaming_service;
   }

   /**
    * Singleton accessor method for qMC_for_MTSI_service.
    */
   public static ServiceType qMC_for_MTSI_service() {
      return _qMC_for_MTSI_service;
   }

   /** Undefined value. */
   protected static ServiceType __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ServiceType.valueOf( ServiceType.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ServiceType valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return qMC_for_streaming_service();
         case 1: return qMC_for_MTSI_service();
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

         return 0x7fffffff;
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (2);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ServiceType.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("qMC-for-streaming-service");
         case 1: return ("qMC-for-MTSI-service");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
