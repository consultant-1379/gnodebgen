/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ConfiguredGrantConfig_transformPrecoder extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ENABLED = 0;
   public static final int _DISABLED = 1;

   // Singleton instances of ConfiguredGrantConfig_transformPrecoder
   protected static final ConfiguredGrantConfig_transformPrecoder _enabled = new ConfiguredGrantConfig_transformPrecoder(0);
   protected static final ConfiguredGrantConfig_transformPrecoder _disabled = new ConfiguredGrantConfig_transformPrecoder(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected ConfiguredGrantConfig_transformPrecoder (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for enabled.
    */
   public static ConfiguredGrantConfig_transformPrecoder enabled() {
      return _enabled;
   }

   /**
    * Singleton accessor method for disabled.
    */
   public static ConfiguredGrantConfig_transformPrecoder disabled() {
      return _disabled;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ConfiguredGrantConfig_transformPrecoder.valueOf( ConfiguredGrantConfig_transformPrecoder.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ConfiguredGrantConfig_transformPrecoder valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return enabled();
         case 1: return disabled();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ConfiguredGrantConfig_transformPrecoder.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("enabled");
         case 1: return ("disabled");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
