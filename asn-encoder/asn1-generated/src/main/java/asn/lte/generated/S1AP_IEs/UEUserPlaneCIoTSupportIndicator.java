/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class UEUserPlaneCIoTSupportIndicator extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UEUserPlaneCIoTSupportIndicator";
   }

   // Integer constants for switch-case
   public static final int _SUPPORTED = 0;

   // Singleton instances of UEUserPlaneCIoTSupportIndicator
   protected static final UEUserPlaneCIoTSupportIndicator _supported = new UEUserPlaneCIoTSupportIndicator(0);
   private static UEUserPlaneCIoTSupportIndicator __undefined = new UEUserPlaneCIoTSupportIndicator(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected UEUserPlaneCIoTSupportIndicator (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for supported.
    */
   public static UEUserPlaneCIoTSupportIndicator supported() {
      return _supported;
   }

   /** Undefined value. */
   protected static UEUserPlaneCIoTSupportIndicator __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UEUserPlaneCIoTSupportIndicator.valueOf( UEUserPlaneCIoTSupportIndicator.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UEUserPlaneCIoTSupportIndicator valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return supported();
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
         ui = (int) buffer.decodeConsWholeNumber (1);

         switch (ui) {
            case 0: ret =  0; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (UEUserPlaneCIoTSupportIndicator.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("supported");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
