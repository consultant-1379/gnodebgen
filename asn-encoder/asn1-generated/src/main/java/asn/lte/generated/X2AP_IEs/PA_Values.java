/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class PA_Values extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PA-Values";
   }

   // Integer constants for switch-case
   public static final int _DB_6 = 0;
   public static final int _DB_4DOT77 = 1;
   public static final int _DB_3 = 2;
   public static final int _DB_1DOT77 = 3;
   public static final int _DB0 = 4;
   public static final int _DB1 = 5;
   public static final int _DB2 = 6;
   public static final int _DB3 = 7;

   // Singleton instances of PA_Values
   protected static final PA_Values _dB_6 = new PA_Values(0);
   protected static final PA_Values _dB_4dot77 = new PA_Values(1);
   protected static final PA_Values _dB_3 = new PA_Values(2);
   protected static final PA_Values _dB_1dot77 = new PA_Values(3);
   protected static final PA_Values _dB0 = new PA_Values(4);
   protected static final PA_Values _dB1 = new PA_Values(5);
   protected static final PA_Values _dB2 = new PA_Values(6);
   protected static final PA_Values _dB3 = new PA_Values(7);
   private static PA_Values __undefined = new PA_Values(-999);

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
   protected PA_Values (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB_6.
    */
   public static PA_Values dB_6() {
      return _dB_6;
   }

   /**
    * Singleton accessor method for dB_4dot77.
    */
   public static PA_Values dB_4dot77() {
      return _dB_4dot77;
   }

   /**
    * Singleton accessor method for dB_3.
    */
   public static PA_Values dB_3() {
      return _dB_3;
   }

   /**
    * Singleton accessor method for dB_1dot77.
    */
   public static PA_Values dB_1dot77() {
      return _dB_1dot77;
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static PA_Values dB0() {
      return _dB0;
   }

   /**
    * Singleton accessor method for dB1.
    */
   public static PA_Values dB1() {
      return _dB1;
   }

   /**
    * Singleton accessor method for dB2.
    */
   public static PA_Values dB2() {
      return _dB2;
   }

   /**
    * Singleton accessor method for dB3.
    */
   public static PA_Values dB3() {
      return _dB3;
   }

   /** Undefined value. */
   protected static PA_Values __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PA_Values.valueOf( PA_Values.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PA_Values valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return dB_6();
         case 1: return dB_4dot77();
         case 2: return dB_3();
         case 3: return dB_1dot77();
         case 4: return dB0();
         case 5: return dB1();
         case 6: return dB2();
         case 7: return dB3();
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
      buffer.invokeCharacters (PA_Values.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB-6");
         case 1: return ("dB-4dot77");
         case 2: return ("dB-3");
         case 3: return ("dB-1dot77");
         case 4: return ("dB0");
         case 5: return ("dB1");
         case 6: return ("dB2");
         case 7: return ("dB3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
