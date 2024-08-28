/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_ResourcePool_r16_sl_X_Overhead_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N3 = 1;
   public static final int _N6 = 2;
   public static final int _N9 = 3;

   // Singleton instances of SL_ResourcePool_r16_sl_X_Overhead_r16
   protected static final SL_ResourcePool_r16_sl_X_Overhead_r16 _n0 = new SL_ResourcePool_r16_sl_X_Overhead_r16(0);
   protected static final SL_ResourcePool_r16_sl_X_Overhead_r16 _n3 = new SL_ResourcePool_r16_sl_X_Overhead_r16(1);
   protected static final SL_ResourcePool_r16_sl_X_Overhead_r16 _n6 = new SL_ResourcePool_r16_sl_X_Overhead_r16(2);
   protected static final SL_ResourcePool_r16_sl_X_Overhead_r16 _n9 = new SL_ResourcePool_r16_sl_X_Overhead_r16(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SL_ResourcePool_r16_sl_X_Overhead_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static SL_ResourcePool_r16_sl_X_Overhead_r16 n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n3.
    */
   public static SL_ResourcePool_r16_sl_X_Overhead_r16 n3() {
      return _n3;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static SL_ResourcePool_r16_sl_X_Overhead_r16 n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n9.
    */
   public static SL_ResourcePool_r16_sl_X_Overhead_r16 n9() {
      return _n9;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SL_ResourcePool_r16_sl_X_Overhead_r16.valueOf( SL_ResourcePool_r16_sl_X_Overhead_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SL_ResourcePool_r16_sl_X_Overhead_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n3();
         case 2: return n6();
         case 3: return n9();
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
      buffer.invokeCharacters (SL_ResourcePool_r16_sl_X_Overhead_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n0 */break;
         case 1: ui = 1; /* n3 */break;
         case 2: ui = 2; /* n6 */break;
         case 3: ui = 3; /* n9 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n3");
         case 2: return ("n6");
         case 3: return ("n9");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
