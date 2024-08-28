/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_CommonDataTypes;

import com.objsys.asn1j.runtime.*;

public class Criticality extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_CommonDataTypesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Criticality";
   }

   // Integer constants for switch-case
   public static final int _REJECT = 0;
   public static final int _IGNORE = 1;
   public static final int _NOTIFY_ = 2;

   // Singleton instances of Criticality
   protected static final Criticality _reject = new Criticality(0);
   protected static final Criticality _ignore = new Criticality(1);
   protected static final Criticality _notify_ = new Criticality(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected Criticality (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for reject.
    */
   public static Criticality reject() {
      return _reject;
   }

   /**
    * Singleton accessor method for ignore.
    */
   public static Criticality ignore() {
      return _ignore;
   }

   /**
    * Singleton accessor method for notify_.
    */
   public static Criticality notify_() {
      return _notify_;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Criticality.valueOf( Criticality.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Criticality valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return reject();
         case 1: return ignore();
         case 2: return notify_();
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
      buffer.invokeCharacters (Criticality.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("reject");
         case 1: return ("ignore");
         case 2: return ("notify");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
