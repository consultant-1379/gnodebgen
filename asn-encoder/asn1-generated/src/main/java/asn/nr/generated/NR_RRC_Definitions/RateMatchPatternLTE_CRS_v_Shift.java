/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RateMatchPatternLTE_CRS_v_Shift extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N1 = 1;
   public static final int _N2 = 2;
   public static final int _N3 = 3;
   public static final int _N4 = 4;
   public static final int _N5 = 5;

   // Singleton instances of RateMatchPatternLTE_CRS_v_Shift
   protected static final RateMatchPatternLTE_CRS_v_Shift _n0 = new RateMatchPatternLTE_CRS_v_Shift(0);
   protected static final RateMatchPatternLTE_CRS_v_Shift _n1 = new RateMatchPatternLTE_CRS_v_Shift(1);
   protected static final RateMatchPatternLTE_CRS_v_Shift _n2 = new RateMatchPatternLTE_CRS_v_Shift(2);
   protected static final RateMatchPatternLTE_CRS_v_Shift _n3 = new RateMatchPatternLTE_CRS_v_Shift(3);
   protected static final RateMatchPatternLTE_CRS_v_Shift _n4 = new RateMatchPatternLTE_CRS_v_Shift(4);
   protected static final RateMatchPatternLTE_CRS_v_Shift _n5 = new RateMatchPatternLTE_CRS_v_Shift(5);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected RateMatchPatternLTE_CRS_v_Shift (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n1.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n3.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n3() {
      return _n3;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n5.
    */
   public static RateMatchPatternLTE_CRS_v_Shift n5() {
      return _n5;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RateMatchPatternLTE_CRS_v_Shift.valueOf( RateMatchPatternLTE_CRS_v_Shift.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RateMatchPatternLTE_CRS_v_Shift valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n1();
         case 2: return n2();
         case 3: return n3();
         case 4: return n4();
         case 5: return n5();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (6);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RateMatchPatternLTE_CRS_v_Shift.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n0 */break;
         case 1: ui = 1; /* n1 */break;
         case 2: ui = 2; /* n2 */break;
         case 3: ui = 3; /* n3 */break;
         case 4: ui = 4; /* n4 */break;
         case 5: ui = 5; /* n5 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 6);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n1");
         case 2: return ("n2");
         case 3: return ("n3");
         case 4: return ("n4");
         case 5: return ("n5");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
