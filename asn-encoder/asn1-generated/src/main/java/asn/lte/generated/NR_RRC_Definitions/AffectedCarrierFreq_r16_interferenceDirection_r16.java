/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AffectedCarrierFreq_r16_interferenceDirection_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _NR = 0;
   public static final int _OTHER = 1;
   public static final int _BOTH = 2;
   public static final int _SPARE = 3;

   // Singleton instances of AffectedCarrierFreq_r16_interferenceDirection_r16
   protected static final AffectedCarrierFreq_r16_interferenceDirection_r16 _nr = new AffectedCarrierFreq_r16_interferenceDirection_r16(0);
   protected static final AffectedCarrierFreq_r16_interferenceDirection_r16 _other = new AffectedCarrierFreq_r16_interferenceDirection_r16(1);
   protected static final AffectedCarrierFreq_r16_interferenceDirection_r16 _both = new AffectedCarrierFreq_r16_interferenceDirection_r16(2);
   protected static final AffectedCarrierFreq_r16_interferenceDirection_r16 _spare = new AffectedCarrierFreq_r16_interferenceDirection_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected AffectedCarrierFreq_r16_interferenceDirection_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nr.
    */
   public static AffectedCarrierFreq_r16_interferenceDirection_r16 nr() {
      return _nr;
   }

   /**
    * Singleton accessor method for other.
    */
   public static AffectedCarrierFreq_r16_interferenceDirection_r16 other() {
      return _other;
   }

   /**
    * Singleton accessor method for both.
    */
   public static AffectedCarrierFreq_r16_interferenceDirection_r16 both() {
      return _both;
   }

   /**
    * Singleton accessor method for spare.
    */
   public static AffectedCarrierFreq_r16_interferenceDirection_r16 spare() {
      return _spare;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return AffectedCarrierFreq_r16_interferenceDirection_r16.valueOf( AffectedCarrierFreq_r16_interferenceDirection_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static AffectedCarrierFreq_r16_interferenceDirection_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return nr();
         case 1: return other();
         case 2: return both();
         case 3: return spare();
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
      buffer.invokeCharacters (AffectedCarrierFreq_r16_interferenceDirection_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nr");
         case 1: return ("other");
         case 2: return ("both");
         case 3: return ("spare");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
