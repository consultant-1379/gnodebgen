/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_TimersAndConstants_NB_r13_n310_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;
   public static final int _N3 = 2;
   public static final int _N4 = 3;
   public static final int _N6 = 4;
   public static final int _N8 = 5;
   public static final int _N10 = 6;
   public static final int _N20 = 7;

   // Singleton instances of UE_TimersAndConstants_NB_r13_n310_r13
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n1 = new UE_TimersAndConstants_NB_r13_n310_r13(0);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n2 = new UE_TimersAndConstants_NB_r13_n310_r13(1);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n3 = new UE_TimersAndConstants_NB_r13_n310_r13(2);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n4 = new UE_TimersAndConstants_NB_r13_n310_r13(3);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n6 = new UE_TimersAndConstants_NB_r13_n310_r13(4);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n8 = new UE_TimersAndConstants_NB_r13_n310_r13(5);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n10 = new UE_TimersAndConstants_NB_r13_n310_r13(6);
   protected static final UE_TimersAndConstants_NB_r13_n310_r13 _n20 = new UE_TimersAndConstants_NB_r13_n310_r13(7);

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
   protected UE_TimersAndConstants_NB_r13_n310_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n3.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n3() {
      return _n3;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n10.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n10() {
      return _n10;
   }

   /**
    * Singleton accessor method for n20.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 n20() {
      return _n20;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UE_TimersAndConstants_NB_r13_n310_r13.valueOf( UE_TimersAndConstants_NB_r13_n310_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UE_TimersAndConstants_NB_r13_n310_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n3();
         case 3: return n4();
         case 4: return n6();
         case 5: return n8();
         case 6: return n10();
         case 7: return n20();
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
      buffer.invokeCharacters (UE_TimersAndConstants_NB_r13_n310_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n3");
         case 3: return ("n4");
         case 4: return ("n6");
         case 5: return ("n8");
         case 6: return ("n10");
         case 7: return ("n20");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
