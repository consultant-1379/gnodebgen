/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ALPHA0 = 0;
   public static final int _ALPHA04 = 1;
   public static final int _ALPHA05 = 2;
   public static final int _ALPHA06 = 3;
   public static final int _ALPHA07 = 4;
   public static final int _ALPHA08 = 5;
   public static final int _ALPHA09 = 6;
   public static final int _ALPHA1 = 7;

   // Singleton instances of MsgA_PUSCH_Resource_r16_msgA_Alpha_r16
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha0 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(0);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha04 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(1);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha05 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(2);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha06 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(3);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha07 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(4);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha08 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(5);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha09 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(6);
   protected static final MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 _alpha1 = new MsgA_PUSCH_Resource_r16_msgA_Alpha_r16(7);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    */
   protected MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for alpha0.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha0() {
      return _alpha0;
   }

   /**
    * Singleton accessor method for alpha04.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha04() {
      return _alpha04;
   }

   /**
    * Singleton accessor method for alpha05.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha05() {
      return _alpha05;
   }

   /**
    * Singleton accessor method for alpha06.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha06() {
      return _alpha06;
   }

   /**
    * Singleton accessor method for alpha07.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha07() {
      return _alpha07;
   }

   /**
    * Singleton accessor method for alpha08.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha08() {
      return _alpha08;
   }

   /**
    * Singleton accessor method for alpha09.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha09() {
      return _alpha09;
   }

   /**
    * Singleton accessor method for alpha1.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 alpha1() {
      return _alpha1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MsgA_PUSCH_Resource_r16_msgA_Alpha_r16.valueOf( MsgA_PUSCH_Resource_r16_msgA_Alpha_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MsgA_PUSCH_Resource_r16_msgA_Alpha_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return alpha0();
         case 1: return alpha04();
         case 2: return alpha05();
         case 3: return alpha06();
         case 4: return alpha07();
         case 5: return alpha08();
         case 6: return alpha09();
         case 7: return alpha1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MsgA_PUSCH_Resource_r16_msgA_Alpha_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* alpha0 */break;
         case 1: ui = 1; /* alpha04 */break;
         case 2: ui = 2; /* alpha05 */break;
         case 3: ui = 3; /* alpha06 */break;
         case 4: ui = 4; /* alpha07 */break;
         case 5: ui = 5; /* alpha08 */break;
         case 6: ui = 6; /* alpha09 */break;
         case 7: ui = 7; /* alpha1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("alpha0");
         case 1: return ("alpha04");
         case 2: return ("alpha05");
         case 3: return ("alpha06");
         case 4: return ("alpha07");
         case 5: return ("alpha08");
         case 6: return ("alpha09");
         case 7: return ("alpha1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
