/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CFRA_TwoStep_r16_msgA_TransMax_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;
   public static final int _N4 = 2;
   public static final int _N6 = 3;
   public static final int _N8 = 4;
   public static final int _N10 = 5;
   public static final int _N20 = 6;
   public static final int _N50 = 7;
   public static final int _N100 = 8;
   public static final int _N200 = 9;

   // Singleton instances of CFRA_TwoStep_r16_msgA_TransMax_r16
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n1 = new CFRA_TwoStep_r16_msgA_TransMax_r16(0);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n2 = new CFRA_TwoStep_r16_msgA_TransMax_r16(1);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n4 = new CFRA_TwoStep_r16_msgA_TransMax_r16(2);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n6 = new CFRA_TwoStep_r16_msgA_TransMax_r16(3);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n8 = new CFRA_TwoStep_r16_msgA_TransMax_r16(4);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n10 = new CFRA_TwoStep_r16_msgA_TransMax_r16(5);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n20 = new CFRA_TwoStep_r16_msgA_TransMax_r16(6);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n50 = new CFRA_TwoStep_r16_msgA_TransMax_r16(7);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n100 = new CFRA_TwoStep_r16_msgA_TransMax_r16(8);
   protected static final CFRA_TwoStep_r16_msgA_TransMax_r16 _n200 = new CFRA_TwoStep_r16_msgA_TransMax_r16(9);

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
    *   8
    *   9
    */
   protected CFRA_TwoStep_r16_msgA_TransMax_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n10.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n10() {
      return _n10;
   }

   /**
    * Singleton accessor method for n20.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n20() {
      return _n20;
   }

   /**
    * Singleton accessor method for n50.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n50() {
      return _n50;
   }

   /**
    * Singleton accessor method for n100.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n100() {
      return _n100;
   }

   /**
    * Singleton accessor method for n200.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 n200() {
      return _n200;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CFRA_TwoStep_r16_msgA_TransMax_r16.valueOf( CFRA_TwoStep_r16_msgA_TransMax_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CFRA_TwoStep_r16_msgA_TransMax_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n4();
         case 3: return n6();
         case 4: return n8();
         case 5: return n10();
         case 6: return n20();
         case 7: return n50();
         case 8: return n100();
         case 9: return n200();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (10);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         case 8: ret =  8; break;
         case 9: ret =  9; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CFRA_TwoStep_r16_msgA_TransMax_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n1 */break;
         case 1: ui = 1; /* n2 */break;
         case 2: ui = 2; /* n4 */break;
         case 3: ui = 3; /* n6 */break;
         case 4: ui = 4; /* n8 */break;
         case 5: ui = 5; /* n10 */break;
         case 6: ui = 6; /* n20 */break;
         case 7: ui = 7; /* n50 */break;
         case 8: ui = 8; /* n100 */break;
         case 9: ui = 9; /* n200 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 10);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n4");
         case 3: return ("n6");
         case 4: return ("n8");
         case 5: return ("n10");
         case 6: return ("n20");
         case 7: return ("n50");
         case 8: return ("n100");
         case 9: return ("n200");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
