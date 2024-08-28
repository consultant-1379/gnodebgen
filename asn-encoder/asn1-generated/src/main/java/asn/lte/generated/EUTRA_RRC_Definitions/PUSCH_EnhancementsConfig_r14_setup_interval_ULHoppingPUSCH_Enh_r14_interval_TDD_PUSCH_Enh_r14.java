/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _INT1 = 0;
   public static final int _INT5 = 1;
   public static final int _INT10 = 2;
   public static final int _INT20 = 3;

   // Singleton instances of PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14
   protected static final PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 _int1 = new PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14(0);
   protected static final PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 _int5 = new PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14(1);
   protected static final PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 _int10 = new PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14(2);
   protected static final PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 _int20 = new PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for int1.
    */
   public static PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 int1() {
      return _int1;
   }

   /**
    * Singleton accessor method for int5.
    */
   public static PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 int5() {
      return _int5;
   }

   /**
    * Singleton accessor method for int10.
    */
   public static PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 int10() {
      return _int10;
   }

   /**
    * Singleton accessor method for int20.
    */
   public static PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 int20() {
      return _int20;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14.valueOf( PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return int1();
         case 1: return int5();
         case 2: return int10();
         case 3: return int20();
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
      buffer.invokeCharacters (PUSCH_EnhancementsConfig_r14_setup_interval_ULHoppingPUSCH_Enh_r14_interval_TDD_PUSCH_Enh_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("int1");
         case 1: return ("int5");
         case 2: return ("int10");
         case 3: return ("int20");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
