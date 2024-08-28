/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _POS0 = 0;
   public static final int _POS1 = 1;
   public static final int _POS3 = 2;

   // Singleton instances of MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16
   protected static final MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 _pos0 = new MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16(0);
   protected static final MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 _pos1 = new MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16(1);
   protected static final MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 _pos3 = new MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for pos0.
    */
   public static MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 pos0() {
      return _pos0;
   }

   /**
    * Singleton accessor method for pos1.
    */
   public static MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 pos1() {
      return _pos1;
   }

   /**
    * Singleton accessor method for pos3.
    */
   public static MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 pos3() {
      return _pos3;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16.valueOf( MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return pos0();
         case 1: return pos1();
         case 2: return pos3();
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
      buffer.invokeCharacters (MsgA_DMRS_Config_r16_msgA_DMRS_AdditionalPosition_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("pos0");
         case 1: return ("pos1");
         case 2: return ("pos3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
