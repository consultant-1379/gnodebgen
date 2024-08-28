/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_CommonDataTypes;

import com.objsys.asn1j.runtime.*;

public class Presence extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_CommonDataTypesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Presence";
   }

   // Integer constants for switch-case
   public static final int _OPTIONAL = 0;
   public static final int _CONDITIONAL = 1;
   public static final int _MANDATORY = 2;

   // Singleton instances of Presence
   protected static final Presence _optional = new Presence(0);
   protected static final Presence _conditional = new Presence(1);
   protected static final Presence _mandatory = new Presence(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected Presence (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for optional.
    */
   public static Presence optional() {
      return _optional;
   }

   /**
    * Singleton accessor method for conditional.
    */
   public static Presence conditional() {
      return _conditional;
   }

   /**
    * Singleton accessor method for mandatory.
    */
   public static Presence mandatory() {
      return _mandatory;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Presence.valueOf( Presence.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Presence valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return optional();
         case 1: return conditional();
         case 2: return mandatory();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (Presence.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("optional");
         case 1: return ("conditional");
         case 2: return ("mandatory");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
