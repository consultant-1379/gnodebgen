/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class T_StatusProhibit_v1610 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "T-StatusProhibit-v1610";
   }

   // Integer constants for switch-case
   public static final int _MS1 = 0;
   public static final int _MS2 = 1;
   public static final int _MS3 = 2;
   public static final int _MS4 = 3;
   public static final int _SPARE4 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of T_StatusProhibit_v1610
   protected static final T_StatusProhibit_v1610 _ms1 = new T_StatusProhibit_v1610(0);
   protected static final T_StatusProhibit_v1610 _ms2 = new T_StatusProhibit_v1610(1);
   protected static final T_StatusProhibit_v1610 _ms3 = new T_StatusProhibit_v1610(2);
   protected static final T_StatusProhibit_v1610 _ms4 = new T_StatusProhibit_v1610(3);
   protected static final T_StatusProhibit_v1610 _spare4 = new T_StatusProhibit_v1610(4);
   protected static final T_StatusProhibit_v1610 _spare3 = new T_StatusProhibit_v1610(5);
   protected static final T_StatusProhibit_v1610 _spare2 = new T_StatusProhibit_v1610(6);
   protected static final T_StatusProhibit_v1610 _spare1 = new T_StatusProhibit_v1610(7);

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
   protected T_StatusProhibit_v1610 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static T_StatusProhibit_v1610 ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static T_StatusProhibit_v1610 ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static T_StatusProhibit_v1610 ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for ms4.
    */
   public static T_StatusProhibit_v1610 ms4() {
      return _ms4;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static T_StatusProhibit_v1610 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static T_StatusProhibit_v1610 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static T_StatusProhibit_v1610 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static T_StatusProhibit_v1610 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return T_StatusProhibit_v1610.valueOf( T_StatusProhibit_v1610.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static T_StatusProhibit_v1610 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms1();
         case 1: return ms2();
         case 2: return ms3();
         case 3: return ms4();
         case 4: return spare4();
         case 5: return spare3();
         case 6: return spare2();
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
      buffer.invokeCharacters (T_StatusProhibit_v1610.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms1 */break;
         case 1: ui = 1; /* ms2 */break;
         case 2: ui = 2; /* ms3 */break;
         case 3: ui = 3; /* ms4 */break;
         case 4: ui = 4; /* spare4 */break;
         case 5: ui = 5; /* spare3 */break;
         case 6: ui = 6; /* spare2 */break;
         case 7: ui = 7; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1");
         case 1: return ("ms2");
         case 2: return ("ms3");
         case 3: return ("ms4");
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
