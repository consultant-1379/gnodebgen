/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SynchronisationStatus extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SynchronisationStatus";
   }

   // Integer constants for switch-case
   public static final int _SYNCHRONOUS = 0;
   public static final int _ASYNCHRONOUS = 1;

   // Singleton instances of SynchronisationStatus
   protected static final SynchronisationStatus _synchronous = new SynchronisationStatus(0);
   protected static final SynchronisationStatus _asynchronous = new SynchronisationStatus(1);
   private static SynchronisationStatus __undefined = new SynchronisationStatus(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected SynchronisationStatus (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for synchronous.
    */
   public static SynchronisationStatus synchronous() {
      return _synchronous;
   }

   /**
    * Singleton accessor method for asynchronous.
    */
   public static SynchronisationStatus asynchronous() {
      return _asynchronous;
   }

   /** Undefined value. */
   protected static SynchronisationStatus __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SynchronisationStatus.valueOf( SynchronisationStatus.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SynchronisationStatus valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return synchronous();
         case 1: return asynchronous();
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
      buffer.invokeCharacters (SynchronisationStatus.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("synchronous");
         case 1: return ("asynchronous");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
