/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 31-Dec-2020.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLF_TimersAndConstants_t311_v1530 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS1000 = 0;
   public static final int _MS3000 = 1;
   public static final int _MS5000 = 2;
   public static final int _MS10000 = 3;
   public static final int _MS15000 = 4;
   public static final int _MS20000 = 5;
   public static final int _MS30000 = 6;

   // Singleton instances of RLF_TimersAndConstants_t311_v1530
   protected static final RLF_TimersAndConstants_t311_v1530 _ms1000 = new RLF_TimersAndConstants_t311_v1530(0);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms3000 = new RLF_TimersAndConstants_t311_v1530(1);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms5000 = new RLF_TimersAndConstants_t311_v1530(2);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms10000 = new RLF_TimersAndConstants_t311_v1530(3);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms15000 = new RLF_TimersAndConstants_t311_v1530(4);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms20000 = new RLF_TimersAndConstants_t311_v1530(5);
   protected static final RLF_TimersAndConstants_t311_v1530 _ms30000 = new RLF_TimersAndConstants_t311_v1530(6);

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
    */
   protected RLF_TimersAndConstants_t311_v1530 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms3000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms3000() {
      return _ms3000;
   }

   /**
    * Singleton accessor method for ms5000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms5000() {
      return _ms5000;
   }

   /**
    * Singleton accessor method for ms10000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms10000() {
      return _ms10000;
   }

   /**
    * Singleton accessor method for ms15000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms15000() {
      return _ms15000;
   }

   /**
    * Singleton accessor method for ms20000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms20000() {
      return _ms20000;
   }

   /**
    * Singleton accessor method for ms30000.
    */
   public static RLF_TimersAndConstants_t311_v1530 ms30000() {
      return _ms30000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RLF_TimersAndConstants_t311_v1530.valueOf( RLF_TimersAndConstants_t311_v1530.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RLF_TimersAndConstants_t311_v1530 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms1000();
         case 1: return ms3000();
         case 2: return ms5000();
         case 3: return ms10000();
         case 4: return ms15000();
         case 5: return ms20000();
         case 6: return ms30000();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (7);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms1000 */break;
         case 1: ui = 1; /* ms3000 */break;
         case 2: ui = 2; /* ms5000 */break;
         case 3: ui = 3; /* ms10000 */break;
         case 4: ui = 4; /* ms15000 */break;
         case 5: ui = 5; /* ms20000 */break;
         case 6: ui = 6; /* ms30000 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 7);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1000");
         case 1: return ("ms3000");
         case 2: return ("ms5000");
         case 3: return ("ms10000");
         case 4: return ("ms15000");
         case 5: return ("ms20000");
         case 6: return ("ms30000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
