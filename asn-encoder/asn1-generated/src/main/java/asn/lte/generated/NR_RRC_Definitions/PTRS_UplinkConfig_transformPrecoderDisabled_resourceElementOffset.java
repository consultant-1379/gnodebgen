/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _OFFSET01 = 0;
   public static final int _OFFSET10 = 1;
   public static final int _OFFSET11 = 2;

   // Singleton instances of PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset
   protected static final PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset _offset01 = new PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset(0);
   protected static final PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset _offset10 = new PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset(1);
   protected static final PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset _offset11 = new PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for offset01.
    */
   public static PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset offset01() {
      return _offset01;
   }

   /**
    * Singleton accessor method for offset10.
    */
   public static PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset offset10() {
      return _offset10;
   }

   /**
    * Singleton accessor method for offset11.
    */
   public static PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset offset11() {
      return _offset11;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset.valueOf( PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return offset01();
         case 1: return offset10();
         case 2: return offset11();
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
      buffer.invokeCharacters (PTRS_UplinkConfig_transformPrecoderDisabled_resourceElementOffset.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("offset01");
         case 1: return ("offset10");
         case 2: return ("offset11");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
