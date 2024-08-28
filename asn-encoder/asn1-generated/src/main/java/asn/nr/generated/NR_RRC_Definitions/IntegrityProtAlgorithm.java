/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IntegrityProtAlgorithm extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "IntegrityProtAlgorithm";
   }

   // Integer constants for switch-case
   public static final int _NIA0 = 0;
   public static final int _NIA1 = 1;
   public static final int _NIA2 = 2;
   public static final int _NIA3 = 3;
   public static final int _SPARE4 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of IntegrityProtAlgorithm
   protected static final IntegrityProtAlgorithm _nia0 = new IntegrityProtAlgorithm(0);
   protected static final IntegrityProtAlgorithm _nia1 = new IntegrityProtAlgorithm(1);
   protected static final IntegrityProtAlgorithm _nia2 = new IntegrityProtAlgorithm(2);
   protected static final IntegrityProtAlgorithm _nia3 = new IntegrityProtAlgorithm(3);
   protected static final IntegrityProtAlgorithm _spare4 = new IntegrityProtAlgorithm(4);
   protected static final IntegrityProtAlgorithm _spare3 = new IntegrityProtAlgorithm(5);
   protected static final IntegrityProtAlgorithm _spare2 = new IntegrityProtAlgorithm(6);
   protected static final IntegrityProtAlgorithm _spare1 = new IntegrityProtAlgorithm(7);
   private static IntegrityProtAlgorithm __undefined = new IntegrityProtAlgorithm(-999);

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
   protected IntegrityProtAlgorithm (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nia0.
    */
   public static IntegrityProtAlgorithm nia0() {
      return _nia0;
   }

   /**
    * Singleton accessor method for nia1.
    */
   public static IntegrityProtAlgorithm nia1() {
      return _nia1;
   }

   /**
    * Singleton accessor method for nia2.
    */
   public static IntegrityProtAlgorithm nia2() {
      return _nia2;
   }

   /**
    * Singleton accessor method for nia3.
    */
   public static IntegrityProtAlgorithm nia3() {
      return _nia3;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static IntegrityProtAlgorithm spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static IntegrityProtAlgorithm spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static IntegrityProtAlgorithm spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static IntegrityProtAlgorithm spare1() {
      return _spare1;
   }

   /** Undefined value. */
   protected static IntegrityProtAlgorithm __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return IntegrityProtAlgorithm.valueOf( IntegrityProtAlgorithm.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static IntegrityProtAlgorithm valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return nia0();
         case 1: return nia1();
         case 2: return nia2();
         case 3: return nia3();
         case 4: return spare4();
         case 5: return spare3();
         case 6: return spare2();
         case 7: return spare1();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         return 0x7fffffff;
      }
      else {
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
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (IntegrityProtAlgorithm.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      boolean extbit = false;

      switch ((int)value) {
         case 0: ui = 0; /* nia0 */break;
         case 1: ui = 1; /* nia1 */break;
         case 2: ui = 2; /* nia2 */break;
         case 3: ui = 3; /* nia3 */break;
         case 4: ui = 4; /* spare4 */break;
         case 5: ui = 5; /* spare3 */break;
         case 6: ui = 6; /* spare2 */break;
         case 7: ui = 7; /* spare1 */break;
         default:
            ui = (int) value;
            extbit = true;
      }

      buffer.encodeBit (extbit, "extbit");

      if (extbit) {
         buffer.encodeSmallNonNegWholeNumber (ui);
      }
      else {
         buffer.encodeConsWholeNumber (ui, 8);
      }
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nia0");
         case 1: return ("nia1");
         case 2: return ("nia2");
         case 3: return ("nia3");
         case 4: return ("spare4");
         case 5: return ("spare3");
         case 6: return ("spare2");
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
