/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _INTERSLOTHOPPING = 0;
   public static final int _INTERREPETITIONHOPPING = 1;
   public static final int _BOTH = 2;

   // Singleton instances of FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16
   protected static final FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 _interSlotHopping = new FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16(0);
   protected static final FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 _interRepetitionHopping = new FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16(1);
   protected static final FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 _both = new FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for interSlotHopping.
    */
   public static FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 interSlotHopping() {
      return _interSlotHopping;
   }

   /**
    * Singleton accessor method for interRepetitionHopping.
    */
   public static FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 interRepetitionHopping() {
      return _interRepetitionHopping;
   }

   /**
    * Singleton accessor method for both.
    */
   public static FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 both() {
      return _both;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16.valueOf( FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return interSlotHopping();
         case 1: return interRepetitionHopping();
         case 2: return both();
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
      buffer.invokeCharacters (FeatureSetUplink_v1610_pusch_RepetitionTypeB_r16_hoppingScheme_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* interSlotHopping */break;
         case 1: ui = 1; /* interRepetitionHopping */break;
         case 2: ui = 2; /* both */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("interSlotHopping");
         case 1: return ("interRepetitionHopping");
         case 2: return ("both");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
