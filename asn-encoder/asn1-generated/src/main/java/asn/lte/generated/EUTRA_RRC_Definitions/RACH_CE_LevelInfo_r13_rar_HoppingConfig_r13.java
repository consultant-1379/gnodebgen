/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ON = 0;
   public static final int _OFF = 1;

   // Singleton instances of RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13
   protected static final RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 _on = new RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13(0);
   protected static final RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 _off = new RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for on.
    */
   public static RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 on() {
      return _on;
   }

   /**
    * Singleton accessor method for off.
    */
   public static RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 off() {
      return _off;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13.valueOf( RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return on();
         case 1: return off();
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
      buffer.invokeCharacters (RACH_CE_LevelInfo_r13_rar_HoppingConfig_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("on");
         case 1: return ("off");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
