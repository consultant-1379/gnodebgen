/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class CauseTransport extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CauseTransport";
   }

   // Integer constants for switch-case
   public static final int _TRANSPORT_RESOURCE_UNAVAILABLE = 0;
   public static final int _UNSPECIFIED = 1;

   // Singleton instances of CauseTransport
   protected static final CauseTransport _transport_resource_unavailable = new CauseTransport(0);
   protected static final CauseTransport _unspecified = new CauseTransport(1);
   private static CauseTransport __undefined = new CauseTransport(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected CauseTransport (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for transport_resource_unavailable.
    */
   public static CauseTransport transport_resource_unavailable() {
      return _transport_resource_unavailable;
   }

   /**
    * Singleton accessor method for unspecified.
    */
   public static CauseTransport unspecified() {
      return _unspecified;
   }

   /** Undefined value. */
   protected static CauseTransport __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CauseTransport.valueOf( CauseTransport.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CauseTransport valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return transport_resource_unavailable();
         case 1: return unspecified();
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
      buffer.invokeCharacters (CauseTransport.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("transport-resource-unavailable");
         case 1: return ("unspecified");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
