/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyA_maxNumberCS_IM_PerCC extends Asn1Enumerated {
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
   public static final int _N8 = 3;
   public static final int _N16 = 4;
   public static final int _N32 = 5;

   // Singleton instances of DummyA_maxNumberCS_IM_PerCC
   protected static final DummyA_maxNumberCS_IM_PerCC _n1 = new DummyA_maxNumberCS_IM_PerCC(0);
   protected static final DummyA_maxNumberCS_IM_PerCC _n2 = new DummyA_maxNumberCS_IM_PerCC(1);
   protected static final DummyA_maxNumberCS_IM_PerCC _n4 = new DummyA_maxNumberCS_IM_PerCC(2);
   protected static final DummyA_maxNumberCS_IM_PerCC _n8 = new DummyA_maxNumberCS_IM_PerCC(3);
   protected static final DummyA_maxNumberCS_IM_PerCC _n16 = new DummyA_maxNumberCS_IM_PerCC(4);
   protected static final DummyA_maxNumberCS_IM_PerCC _n32 = new DummyA_maxNumberCS_IM_PerCC(5);

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
   protected DummyA_maxNumberCS_IM_PerCC (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static DummyA_maxNumberCS_IM_PerCC n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static DummyA_maxNumberCS_IM_PerCC n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static DummyA_maxNumberCS_IM_PerCC n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static DummyA_maxNumberCS_IM_PerCC n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static DummyA_maxNumberCS_IM_PerCC n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static DummyA_maxNumberCS_IM_PerCC n32() {
      return _n32;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DummyA_maxNumberCS_IM_PerCC.valueOf( DummyA_maxNumberCS_IM_PerCC.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DummyA_maxNumberCS_IM_PerCC valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n4();
         case 3: return n8();
         case 4: return n16();
         case 5: return n32();
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
      buffer.invokeCharacters (DummyA_maxNumberCS_IM_PerCC.valueOf(ret).toString());

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
         case 3: ui = 3; /* n8 */break;
         case 4: ui = 4; /* n16 */break;
         case 5: ui = 5; /* n32 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 6);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n4");
         case 3: return ("n8");
         case 4: return ("n16");
         case 5: return ("n32");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
