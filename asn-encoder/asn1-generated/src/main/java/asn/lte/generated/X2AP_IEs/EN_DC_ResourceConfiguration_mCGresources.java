/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class EN_DC_ResourceConfiguration_mCGresources extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PRESENT = 0;
   public static final int _NOT_PRESENT = 1;

   // Singleton instances of EN_DC_ResourceConfiguration_mCGresources
   protected static final EN_DC_ResourceConfiguration_mCGresources _present = new EN_DC_ResourceConfiguration_mCGresources(0);
   protected static final EN_DC_ResourceConfiguration_mCGresources _not_present = new EN_DC_ResourceConfiguration_mCGresources(1);
   private static EN_DC_ResourceConfiguration_mCGresources __undefined = new EN_DC_ResourceConfiguration_mCGresources(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected EN_DC_ResourceConfiguration_mCGresources (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for present.
    */
   public static EN_DC_ResourceConfiguration_mCGresources present() {
      return _present;
   }

   /**
    * Singleton accessor method for not_present.
    */
   public static EN_DC_ResourceConfiguration_mCGresources not_present() {
      return _not_present;
   }

   /** Undefined value. */
   protected static EN_DC_ResourceConfiguration_mCGresources __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EN_DC_ResourceConfiguration_mCGresources.valueOf( EN_DC_ResourceConfiguration_mCGresources.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EN_DC_ResourceConfiguration_mCGresources valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return present();
         case 1: return not_present();
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
      buffer.invokeCharacters (EN_DC_ResourceConfiguration_mCGresources.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("present");
         case 1: return ("not-present");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
