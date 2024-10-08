/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingInfo_BR_r13_si_TBS_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _B152 = 0;
   public static final int _B208 = 1;
   public static final int _B256 = 2;
   public static final int _B328 = 3;
   public static final int _B408 = 4;
   public static final int _B504 = 5;
   public static final int _B600 = 6;
   public static final int _B712 = 7;
   public static final int _B808 = 8;
   public static final int _B936 = 9;

   // Singleton instances of SchedulingInfo_BR_r13_si_TBS_r13
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b152 = new SchedulingInfo_BR_r13_si_TBS_r13(0);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b208 = new SchedulingInfo_BR_r13_si_TBS_r13(1);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b256 = new SchedulingInfo_BR_r13_si_TBS_r13(2);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b328 = new SchedulingInfo_BR_r13_si_TBS_r13(3);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b408 = new SchedulingInfo_BR_r13_si_TBS_r13(4);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b504 = new SchedulingInfo_BR_r13_si_TBS_r13(5);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b600 = new SchedulingInfo_BR_r13_si_TBS_r13(6);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b712 = new SchedulingInfo_BR_r13_si_TBS_r13(7);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b808 = new SchedulingInfo_BR_r13_si_TBS_r13(8);
   protected static final SchedulingInfo_BR_r13_si_TBS_r13 _b936 = new SchedulingInfo_BR_r13_si_TBS_r13(9);

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
   protected SchedulingInfo_BR_r13_si_TBS_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for b152.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b152() {
      return _b152;
   }

   /**
    * Singleton accessor method for b208.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b208() {
      return _b208;
   }

   /**
    * Singleton accessor method for b256.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b256() {
      return _b256;
   }

   /**
    * Singleton accessor method for b328.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b328() {
      return _b328;
   }

   /**
    * Singleton accessor method for b408.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b408() {
      return _b408;
   }

   /**
    * Singleton accessor method for b504.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b504() {
      return _b504;
   }

   /**
    * Singleton accessor method for b600.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b600() {
      return _b600;
   }

   /**
    * Singleton accessor method for b712.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b712() {
      return _b712;
   }

   /**
    * Singleton accessor method for b808.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b808() {
      return _b808;
   }

   /**
    * Singleton accessor method for b936.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 b936() {
      return _b936;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SchedulingInfo_BR_r13_si_TBS_r13.valueOf( SchedulingInfo_BR_r13_si_TBS_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SchedulingInfo_BR_r13_si_TBS_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return b152();
         case 1: return b208();
         case 2: return b256();
         case 3: return b328();
         case 4: return b408();
         case 5: return b504();
         case 6: return b600();
         case 7: return b712();
         case 8: return b808();
         case 9: return b936();
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
      buffer.invokeCharacters (SchedulingInfo_BR_r13_si_TBS_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("b152");
         case 1: return ("b208");
         case 2: return ("b256");
         case 3: return ("b328");
         case 4: return ("b408");
         case 5: return ("b504");
         case 6: return ("b600");
         case 7: return ("b712");
         case 8: return ("b808");
         case 9: return ("b936");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
