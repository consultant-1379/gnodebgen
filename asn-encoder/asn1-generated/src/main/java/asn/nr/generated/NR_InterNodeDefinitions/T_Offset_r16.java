/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class T_Offset_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "T-Offset-r16";
   }

   // Integer constants for switch-case
   public static final int _MS0DOT5 = 0;
   public static final int _MS0DOT75 = 1;
   public static final int _MS1 = 2;
   public static final int _MS1DOT5 = 3;
   public static final int _MS2 = 4;
   public static final int _MS2DOT5 = 5;
   public static final int _MS3 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of T_Offset_r16
   protected static final T_Offset_r16 _ms0dot5 = new T_Offset_r16(0);
   protected static final T_Offset_r16 _ms0dot75 = new T_Offset_r16(1);
   protected static final T_Offset_r16 _ms1 = new T_Offset_r16(2);
   protected static final T_Offset_r16 _ms1dot5 = new T_Offset_r16(3);
   protected static final T_Offset_r16 _ms2 = new T_Offset_r16(4);
   protected static final T_Offset_r16 _ms2dot5 = new T_Offset_r16(5);
   protected static final T_Offset_r16 _ms3 = new T_Offset_r16(6);
   protected static final T_Offset_r16 _spare1 = new T_Offset_r16(7);

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
   protected T_Offset_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0dot5.
    */
   public static T_Offset_r16 ms0dot5() {
      return _ms0dot5;
   }

   /**
    * Singleton accessor method for ms0dot75.
    */
   public static T_Offset_r16 ms0dot75() {
      return _ms0dot75;
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static T_Offset_r16 ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms1dot5.
    */
   public static T_Offset_r16 ms1dot5() {
      return _ms1dot5;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static T_Offset_r16 ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms2dot5.
    */
   public static T_Offset_r16 ms2dot5() {
      return _ms2dot5;
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static T_Offset_r16 ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static T_Offset_r16 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return T_Offset_r16.valueOf( T_Offset_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static T_Offset_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0dot5();
         case 1: return ms0dot75();
         case 2: return ms1();
         case 3: return ms1dot5();
         case 4: return ms2();
         case 5: return ms2dot5();
         case 6: return ms3();
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
      buffer.invokeCharacters (T_Offset_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms0dot5 */break;
         case 1: ui = 1; /* ms0dot75 */break;
         case 2: ui = 2; /* ms1 */break;
         case 3: ui = 3; /* ms1dot5 */break;
         case 4: ui = 4; /* ms2 */break;
         case 5: ui = 5; /* ms2dot5 */break;
         case 6: ui = 6; /* ms3 */break;
         case 7: ui = 7; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0dot5");
         case 1: return ("ms0dot75");
         case 2: return ("ms1");
         case 3: return ("ms1dot5");
         case 4: return ("ms2");
         case 5: return ("ms2dot5");
         case 6: return ("ms3");
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
