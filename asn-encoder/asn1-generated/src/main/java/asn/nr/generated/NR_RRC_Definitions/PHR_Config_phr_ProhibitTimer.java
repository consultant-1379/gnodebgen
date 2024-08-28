/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PHR_Config_phr_ProhibitTimer extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF0 = 0;
   public static final int _SF10 = 1;
   public static final int _SF20 = 2;
   public static final int _SF50 = 3;
   public static final int _SF100 = 4;
   public static final int _SF200 = 5;
   public static final int _SF500 = 6;
   public static final int _SF1000 = 7;

   // Singleton instances of PHR_Config_phr_ProhibitTimer
   protected static final PHR_Config_phr_ProhibitTimer _sf0 = new PHR_Config_phr_ProhibitTimer(0);
   protected static final PHR_Config_phr_ProhibitTimer _sf10 = new PHR_Config_phr_ProhibitTimer(1);
   protected static final PHR_Config_phr_ProhibitTimer _sf20 = new PHR_Config_phr_ProhibitTimer(2);
   protected static final PHR_Config_phr_ProhibitTimer _sf50 = new PHR_Config_phr_ProhibitTimer(3);
   protected static final PHR_Config_phr_ProhibitTimer _sf100 = new PHR_Config_phr_ProhibitTimer(4);
   protected static final PHR_Config_phr_ProhibitTimer _sf200 = new PHR_Config_phr_ProhibitTimer(5);
   protected static final PHR_Config_phr_ProhibitTimer _sf500 = new PHR_Config_phr_ProhibitTimer(6);
   protected static final PHR_Config_phr_ProhibitTimer _sf1000 = new PHR_Config_phr_ProhibitTimer(7);

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
   protected PHR_Config_phr_ProhibitTimer (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf0.
    */
   public static PHR_Config_phr_ProhibitTimer sf0() {
      return _sf0;
   }

   /**
    * Singleton accessor method for sf10.
    */
   public static PHR_Config_phr_ProhibitTimer sf10() {
      return _sf10;
   }

   /**
    * Singleton accessor method for sf20.
    */
   public static PHR_Config_phr_ProhibitTimer sf20() {
      return _sf20;
   }

   /**
    * Singleton accessor method for sf50.
    */
   public static PHR_Config_phr_ProhibitTimer sf50() {
      return _sf50;
   }

   /**
    * Singleton accessor method for sf100.
    */
   public static PHR_Config_phr_ProhibitTimer sf100() {
      return _sf100;
   }

   /**
    * Singleton accessor method for sf200.
    */
   public static PHR_Config_phr_ProhibitTimer sf200() {
      return _sf200;
   }

   /**
    * Singleton accessor method for sf500.
    */
   public static PHR_Config_phr_ProhibitTimer sf500() {
      return _sf500;
   }

   /**
    * Singleton accessor method for sf1000.
    */
   public static PHR_Config_phr_ProhibitTimer sf1000() {
      return _sf1000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PHR_Config_phr_ProhibitTimer.valueOf( PHR_Config_phr_ProhibitTimer.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PHR_Config_phr_ProhibitTimer valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf0();
         case 1: return sf10();
         case 2: return sf20();
         case 3: return sf50();
         case 4: return sf100();
         case 5: return sf200();
         case 6: return sf500();
         case 7: return sf1000();
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
      buffer.invokeCharacters (PHR_Config_phr_ProhibitTimer.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* sf0 */break;
         case 1: ui = 1; /* sf10 */break;
         case 2: ui = 2; /* sf20 */break;
         case 3: ui = 3; /* sf50 */break;
         case 4: ui = 4; /* sf100 */break;
         case 5: ui = 5; /* sf200 */break;
         case 6: ui = 6; /* sf500 */break;
         case 7: ui = 7; /* sf1000 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf0");
         case 1: return ("sf10");
         case 2: return ("sf20");
         case 3: return ("sf50");
         case 4: return ("sf100");
         case 5: return ("sf200");
         case 6: return ("sf500");
         case 7: return ("sf1000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
