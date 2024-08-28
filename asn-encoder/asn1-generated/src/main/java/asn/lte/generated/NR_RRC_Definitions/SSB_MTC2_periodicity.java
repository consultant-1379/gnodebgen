/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_MTC2_periodicity extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF5 = 0;
   public static final int _SF10 = 1;
   public static final int _SF20 = 2;
   public static final int _SF40 = 3;
   public static final int _SF80 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of SSB_MTC2_periodicity
   protected static final SSB_MTC2_periodicity _sf5 = new SSB_MTC2_periodicity(0);
   protected static final SSB_MTC2_periodicity _sf10 = new SSB_MTC2_periodicity(1);
   protected static final SSB_MTC2_periodicity _sf20 = new SSB_MTC2_periodicity(2);
   protected static final SSB_MTC2_periodicity _sf40 = new SSB_MTC2_periodicity(3);
   protected static final SSB_MTC2_periodicity _sf80 = new SSB_MTC2_periodicity(4);
   protected static final SSB_MTC2_periodicity _spare3 = new SSB_MTC2_periodicity(5);
   protected static final SSB_MTC2_periodicity _spare2 = new SSB_MTC2_periodicity(6);
   protected static final SSB_MTC2_periodicity _spare1 = new SSB_MTC2_periodicity(7);

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
   protected SSB_MTC2_periodicity (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf5.
    */
   public static SSB_MTC2_periodicity sf5() {
      return _sf5;
   }

   /**
    * Singleton accessor method for sf10.
    */
   public static SSB_MTC2_periodicity sf10() {
      return _sf10;
   }

   /**
    * Singleton accessor method for sf20.
    */
   public static SSB_MTC2_periodicity sf20() {
      return _sf20;
   }

   /**
    * Singleton accessor method for sf40.
    */
   public static SSB_MTC2_periodicity sf40() {
      return _sf40;
   }

   /**
    * Singleton accessor method for sf80.
    */
   public static SSB_MTC2_periodicity sf80() {
      return _sf80;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static SSB_MTC2_periodicity spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SSB_MTC2_periodicity spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SSB_MTC2_periodicity spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SSB_MTC2_periodicity.valueOf( SSB_MTC2_periodicity.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SSB_MTC2_periodicity valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf5();
         case 1: return sf10();
         case 2: return sf20();
         case 3: return sf40();
         case 4: return sf80();
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
      buffer.invokeCharacters (SSB_MTC2_periodicity.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf5");
         case 1: return ("sf10");
         case 2: return ("sf20");
         case 3: return ("sf40");
         case 4: return ("sf80");
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
