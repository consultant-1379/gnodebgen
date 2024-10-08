/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SL1 = 0;
   public static final int _SL2 = 1;
   public static final int _SL4 = 2;
   public static final int _SL6 = 3;

   // Singleton instances of MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16
   protected static final MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 _sl1 = new MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16(0);
   protected static final MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 _sl2 = new MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16(1);
   protected static final MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 _sl4 = new MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16(2);
   protected static final MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 _sl6 = new MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sl1.
    */
   public static MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 sl1() {
      return _sl1;
   }

   /**
    * Singleton accessor method for sl2.
    */
   public static MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 sl2() {
      return _sl2;
   }

   /**
    * Singleton accessor method for sl4.
    */
   public static MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 sl4() {
      return _sl4;
   }

   /**
    * Singleton accessor method for sl6.
    */
   public static MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 sl6() {
      return _sl6;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16.valueOf( MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sl1();
         case 1: return sl2();
         case 2: return sl4();
         case 3: return sl6();
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
      buffer.invokeCharacters (MinSchedulingOffsetPreference_r16_preferredK0_r16_preferredK0_SCS_30kHz_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sl1");
         case 1: return ("sl2");
         case 2: return ("sl4");
         case 3: return ("sl6");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
