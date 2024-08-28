/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N12 = 1;
   public static final int _N24 = 2;
   public static final int _N36 = 3;
   public static final int _N2 = 4;
   public static final int _N18 = 5;
   public static final int _N34 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n0 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(0);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n12 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(1);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n24 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(2);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n36 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(3);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n2 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(4);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n18 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(5);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _n34 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(6);
   protected static final NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 _spare1 = new NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13(7);

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
   protected NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n12.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n12() {
      return _n12;
   }

   /**
    * Singleton accessor method for n24.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n24() {
      return _n24;
   }

   /**
    * Singleton accessor method for n36.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n36() {
      return _n36;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n18.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n18() {
      return _n18;
   }

   /**
    * Singleton accessor method for n34.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 n34() {
      return _n34;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13.valueOf( NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n12();
         case 2: return n24();
         case 3: return n36();
         case 4: return n2();
         case 5: return n18();
         case 6: return n34();
         case 7: return spare1();
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
      buffer.invokeCharacters (NPRACH_Parameters_NB_r13_nprach_SubcarrierOffset_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n12");
         case 2: return ("n24");
         case 3: return ("n36");
         case 4: return ("n2");
         case 5: return ("n18");
         case 6: return ("n34");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
