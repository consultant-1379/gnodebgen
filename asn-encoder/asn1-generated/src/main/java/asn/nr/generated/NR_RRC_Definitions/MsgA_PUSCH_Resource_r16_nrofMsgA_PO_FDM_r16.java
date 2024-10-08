/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 extends Asn1Enumerated {
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
   public static final int _FOUR = 2;
   public static final int _EIGHT = 3;

   // Singleton instances of MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 _one = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16(0);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 _two = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16(1);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 _four = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16(2);
   protected static final MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 _eight = new MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for one.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 one() {
      return _one;
   }

   /**
    * Singleton accessor method for two.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 two() {
      return _two;
   }

   /**
    * Singleton accessor method for four.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 four() {
      return _four;
   }

   /**
    * Singleton accessor method for eight.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 eight() {
      return _eight;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16.valueOf( MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return one();
         case 1: return two();
         case 2: return four();
         case 3: return eight();
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
      buffer.invokeCharacters (MsgA_PUSCH_Resource_r16_nrofMsgA_PO_FDM_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* one */break;
         case 1: ui = 1; /* two */break;
         case 2: ui = 2; /* four */break;
         case 3: ui = 3; /* eight */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("one");
         case 1: return ("two");
         case 2: return ("four");
         case 3: return ("eight");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
