/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _V0 = 0;
   public static final int _V0DOT2 = 1;
   public static final int _V0DOT4 = 2;
   public static final int _V0DOT6 = 3;
   public static final int _V0DOT8 = 4;

   // Singleton instances of SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16
   protected static final SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 _v0 = new SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16(0);
   protected static final SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 _v0dot2 = new SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16(1);
   protected static final SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 _v0dot4 = new SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16(2);
   protected static final SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 _v0dot6 = new SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16(3);
   protected static final SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 _v0dot8 = new SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for v0.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 v0() {
      return _v0;
   }

   /**
    * Singleton accessor method for v0dot2.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 v0dot2() {
      return _v0dot2;
   }

   /**
    * Singleton accessor method for v0dot4.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 v0dot4() {
      return _v0dot4;
   }

   /**
    * Singleton accessor method for v0dot6.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 v0dot6() {
      return _v0dot6;
   }

   /**
    * Singleton accessor method for v0dot8.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 v0dot8() {
      return _v0dot8;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16.valueOf( SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return v0();
         case 1: return v0dot2();
         case 2: return v0dot4();
         case 3: return v0dot6();
         case 4: return v0dot8();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SL_UE_SelectedConfig_r16_sl_ProbResourceKeep_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("v0");
         case 1: return ("v0dot2");
         case 2: return ("v0dot4");
         case 3: return ("v0dot6");
         case 4: return ("v0dot8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
