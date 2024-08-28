/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _S0 = 0;
   public static final int _S0DOT5 = 1;
   public static final int _S1 = 2;
   public static final int _S2 = 3;
   public static final int _S5 = 4;
   public static final int _S10 = 5;
   public static final int _S20 = 6;
   public static final int _S30 = 7;

   // Singleton instances of OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s0 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(0);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s0dot5 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(1);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s1 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(2);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s2 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(3);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s5 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(4);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s10 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(5);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s20 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(6);
   protected static final OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 _s30 = new OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16(7);

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
   protected OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for s0.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s0() {
      return _s0;
   }

   /**
    * Singleton accessor method for s0dot5.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s0dot5() {
      return _s0dot5;
   }

   /**
    * Singleton accessor method for s1.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s1() {
      return _s1;
   }

   /**
    * Singleton accessor method for s2.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s2() {
      return _s2;
   }

   /**
    * Singleton accessor method for s5.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s5() {
      return _s5;
   }

   /**
    * Singleton accessor method for s10.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s10() {
      return _s10;
   }

   /**
    * Singleton accessor method for s20.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s20() {
      return _s20;
   }

   /**
    * Singleton accessor method for s30.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 s30() {
      return _s30;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16.valueOf( OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return s0();
         case 1: return s0dot5();
         case 2: return s1();
         case 3: return s2();
         case 4: return s5();
         case 5: return s10();
         case 6: return s20();
         case 7: return s30();
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
      buffer.invokeCharacters (OnDemandSIB_Request_r16_onDemandSIB_RequestProhibitTimer_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("s0");
         case 1: return ("s0dot5");
         case 2: return ("s1");
         case 3: return ("s2");
         case 4: return ("s5");
         case 5: return ("s10");
         case 6: return ("s20");
         case 7: return ("s30");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
