/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ConfiguredGrantConfig_mcs_Table extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _QAM256 = 0;
   public static final int _QAM64LOWSE = 1;

   // Singleton instances of ConfiguredGrantConfig_mcs_Table
   protected static final ConfiguredGrantConfig_mcs_Table _qam256 = new ConfiguredGrantConfig_mcs_Table(0);
   protected static final ConfiguredGrantConfig_mcs_Table _qam64LowSE = new ConfiguredGrantConfig_mcs_Table(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected ConfiguredGrantConfig_mcs_Table (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for qam256.
    */
   public static ConfiguredGrantConfig_mcs_Table qam256() {
      return _qam256;
   }

   /**
    * Singleton accessor method for qam64LowSE.
    */
   public static ConfiguredGrantConfig_mcs_Table qam64LowSE() {
      return _qam64LowSE;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ConfiguredGrantConfig_mcs_Table.valueOf( ConfiguredGrantConfig_mcs_Table.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ConfiguredGrantConfig_mcs_Table valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return qam256();
         case 1: return qam64LowSE();
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
      buffer.invokeCharacters (ConfiguredGrantConfig_mcs_Table.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* qam256 */break;
         case 1: ui = 1; /* qam64LowSE */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 2);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("qam256");
         case 1: return ("qam64LowSE");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
