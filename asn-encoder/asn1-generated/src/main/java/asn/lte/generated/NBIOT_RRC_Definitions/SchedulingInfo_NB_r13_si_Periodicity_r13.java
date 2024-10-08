/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingInfo_NB_r13_si_Periodicity_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _RF64 = 0;
   public static final int _RF128 = 1;
   public static final int _RF256 = 2;
   public static final int _RF512 = 3;
   public static final int _RF1024 = 4;
   public static final int _RF2048 = 5;
   public static final int _RF4096 = 6;
   public static final int _SPARE = 7;

   // Singleton instances of SchedulingInfo_NB_r13_si_Periodicity_r13
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf64 = new SchedulingInfo_NB_r13_si_Periodicity_r13(0);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf128 = new SchedulingInfo_NB_r13_si_Periodicity_r13(1);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf256 = new SchedulingInfo_NB_r13_si_Periodicity_r13(2);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf512 = new SchedulingInfo_NB_r13_si_Periodicity_r13(3);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf1024 = new SchedulingInfo_NB_r13_si_Periodicity_r13(4);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf2048 = new SchedulingInfo_NB_r13_si_Periodicity_r13(5);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _rf4096 = new SchedulingInfo_NB_r13_si_Periodicity_r13(6);
   protected static final SchedulingInfo_NB_r13_si_Periodicity_r13 _spare = new SchedulingInfo_NB_r13_si_Periodicity_r13(7);

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
   protected SchedulingInfo_NB_r13_si_Periodicity_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rf64.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf64() {
      return _rf64;
   }

   /**
    * Singleton accessor method for rf128.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf128() {
      return _rf128;
   }

   /**
    * Singleton accessor method for rf256.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf256() {
      return _rf256;
   }

   /**
    * Singleton accessor method for rf512.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf512() {
      return _rf512;
   }

   /**
    * Singleton accessor method for rf1024.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf1024() {
      return _rf1024;
   }

   /**
    * Singleton accessor method for rf2048.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf2048() {
      return _rf2048;
   }

   /**
    * Singleton accessor method for rf4096.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 rf4096() {
      return _rf4096;
   }

   /**
    * Singleton accessor method for spare.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 spare() {
      return _spare;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SchedulingInfo_NB_r13_si_Periodicity_r13.valueOf( SchedulingInfo_NB_r13_si_Periodicity_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SchedulingInfo_NB_r13_si_Periodicity_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return rf64();
         case 1: return rf128();
         case 2: return rf256();
         case 3: return rf512();
         case 4: return rf1024();
         case 5: return rf2048();
         case 6: return rf4096();
         case 7: return spare();
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
      buffer.invokeCharacters (SchedulingInfo_NB_r13_si_Periodicity_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rf64");
         case 1: return ("rf128");
         case 2: return ("rf256");
         case 3: return ("rf512");
         case 4: return ("rf1024");
         case 5: return ("rf2048");
         case 6: return ("rf4096");
         case 7: return ("spare");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
