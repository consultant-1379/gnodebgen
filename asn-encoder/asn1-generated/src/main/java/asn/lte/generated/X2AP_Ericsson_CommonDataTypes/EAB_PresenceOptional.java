/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_CommonDataTypes;

import com.objsys.asn1j.runtime.*;

public class EAB_PresenceOptional extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_CommonDataTypesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-PresenceOptional";
   }

   // Integer constants for switch-case
   public static final int _OPTIONAL = 0;

   // Singleton instances of EAB_PresenceOptional
   protected static final EAB_PresenceOptional _optional = new EAB_PresenceOptional(0);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected EAB_PresenceOptional (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for optional.
    */
   public static EAB_PresenceOptional optional() {
      return _optional;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EAB_PresenceOptional.valueOf( EAB_PresenceOptional.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EAB_PresenceOptional valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return optional();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (1);

      switch (ui) {
         case 0: ret =  0; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EAB_PresenceOptional.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("optional");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
