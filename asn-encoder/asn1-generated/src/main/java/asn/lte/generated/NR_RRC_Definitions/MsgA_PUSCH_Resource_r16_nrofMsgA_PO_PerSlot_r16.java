/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ONE = 0;
   public static final int _TWO = 1;
   public static final int _THREE = 2;
   public static final int _SIX = 3;

   // Singleton instances of MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 _one = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16(0);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 _two = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16(1);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 _three = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16(2);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 _six = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for one.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 one() {
      return _one;
   }

   /**
    * Singleton accessor method for two.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 two() {
      return _two;
   }

   /**
    * Singleton accessor method for three.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 three() {
      return _three;
   }

   /**
    * Singleton accessor method for six.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 six() {
      return _six;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16.valueOf( MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return one();
         case 1: return two();
         case 2: return three();
         case 3: return six();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MsgA_PUSCH_Resource_r16_nrofMsgA_PO_PerSlot_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("one");
         case 1: return ("two");
         case 2: return ("three");
         case 3: return ("six");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
