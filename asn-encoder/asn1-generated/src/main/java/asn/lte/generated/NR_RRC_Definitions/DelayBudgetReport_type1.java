/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DelayBudgetReport_type1 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MSMINUS1280 = 0;
   public static final int _MSMINUS640 = 1;
   public static final int _MSMINUS320 = 2;
   public static final int _MSMINUS160 = 3;
   public static final int _MSMINUS80 = 4;
   public static final int _MSMINUS60 = 5;
   public static final int _MSMINUS40 = 6;
   public static final int _MSMINUS20 = 7;
   public static final int _MS0 = 8;
   public static final int _MS20 = 9;
   public static final int _MS40 = 10;
   public static final int _MS60 = 11;
   public static final int _MS80 = 12;
   public static final int _MS160 = 13;
   public static final int _MS320 = 14;
   public static final int _MS640 = 15;
   public static final int _MS1280 = 16;

   // Singleton instances of DelayBudgetReport_type1
   protected static final DelayBudgetReport_type1 _msMinus1280 = new DelayBudgetReport_type1(0);
   protected static final DelayBudgetReport_type1 _msMinus640 = new DelayBudgetReport_type1(1);
   protected static final DelayBudgetReport_type1 _msMinus320 = new DelayBudgetReport_type1(2);
   protected static final DelayBudgetReport_type1 _msMinus160 = new DelayBudgetReport_type1(3);
   protected static final DelayBudgetReport_type1 _msMinus80 = new DelayBudgetReport_type1(4);
   protected static final DelayBudgetReport_type1 _msMinus60 = new DelayBudgetReport_type1(5);
   protected static final DelayBudgetReport_type1 _msMinus40 = new DelayBudgetReport_type1(6);
   protected static final DelayBudgetReport_type1 _msMinus20 = new DelayBudgetReport_type1(7);
   protected static final DelayBudgetReport_type1 _ms0 = new DelayBudgetReport_type1(8);
   protected static final DelayBudgetReport_type1 _ms20 = new DelayBudgetReport_type1(9);
   protected static final DelayBudgetReport_type1 _ms40 = new DelayBudgetReport_type1(10);
   protected static final DelayBudgetReport_type1 _ms60 = new DelayBudgetReport_type1(11);
   protected static final DelayBudgetReport_type1 _ms80 = new DelayBudgetReport_type1(12);
   protected static final DelayBudgetReport_type1 _ms160 = new DelayBudgetReport_type1(13);
   protected static final DelayBudgetReport_type1 _ms320 = new DelayBudgetReport_type1(14);
   protected static final DelayBudgetReport_type1 _ms640 = new DelayBudgetReport_type1(15);
   protected static final DelayBudgetReport_type1 _ms1280 = new DelayBudgetReport_type1(16);

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
    *   10
    *   11
    *   12
    *   13
    *   14
    *   15
    *   16
    */
   protected DelayBudgetReport_type1 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for msMinus1280.
    */
   public static DelayBudgetReport_type1 msMinus1280() {
      return _msMinus1280;
   }

   /**
    * Singleton accessor method for msMinus640.
    */
   public static DelayBudgetReport_type1 msMinus640() {
      return _msMinus640;
   }

   /**
    * Singleton accessor method for msMinus320.
    */
   public static DelayBudgetReport_type1 msMinus320() {
      return _msMinus320;
   }

   /**
    * Singleton accessor method for msMinus160.
    */
   public static DelayBudgetReport_type1 msMinus160() {
      return _msMinus160;
   }

   /**
    * Singleton accessor method for msMinus80.
    */
   public static DelayBudgetReport_type1 msMinus80() {
      return _msMinus80;
   }

   /**
    * Singleton accessor method for msMinus60.
    */
   public static DelayBudgetReport_type1 msMinus60() {
      return _msMinus60;
   }

   /**
    * Singleton accessor method for msMinus40.
    */
   public static DelayBudgetReport_type1 msMinus40() {
      return _msMinus40;
   }

   /**
    * Singleton accessor method for msMinus20.
    */
   public static DelayBudgetReport_type1 msMinus20() {
      return _msMinus20;
   }

   /**
    * Singleton accessor method for ms0.
    */
   public static DelayBudgetReport_type1 ms0() {
      return _ms0;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static DelayBudgetReport_type1 ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static DelayBudgetReport_type1 ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms60.
    */
   public static DelayBudgetReport_type1 ms60() {
      return _ms60;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static DelayBudgetReport_type1 ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms160.
    */
   public static DelayBudgetReport_type1 ms160() {
      return _ms160;
   }

   /**
    * Singleton accessor method for ms320.
    */
   public static DelayBudgetReport_type1 ms320() {
      return _ms320;
   }

   /**
    * Singleton accessor method for ms640.
    */
   public static DelayBudgetReport_type1 ms640() {
      return _ms640;
   }

   /**
    * Singleton accessor method for ms1280.
    */
   public static DelayBudgetReport_type1 ms1280() {
      return _ms1280;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DelayBudgetReport_type1.valueOf( DelayBudgetReport_type1.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DelayBudgetReport_type1 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return msMinus1280();
         case 1: return msMinus640();
         case 2: return msMinus320();
         case 3: return msMinus160();
         case 4: return msMinus80();
         case 5: return msMinus60();
         case 6: return msMinus40();
         case 7: return msMinus20();
         case 8: return ms0();
         case 9: return ms20();
         case 10: return ms40();
         case 11: return ms60();
         case 12: return ms80();
         case 13: return ms160();
         case 14: return ms320();
         case 15: return ms640();
         case 16: return ms1280();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (17);

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
         case 10: ret =  10; break;
         case 11: ret =  11; break;
         case 12: ret =  12; break;
         case 13: ret =  13; break;
         case 14: ret =  14; break;
         case 15: ret =  15; break;
         case 16: ret =  16; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (DelayBudgetReport_type1.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("msMinus1280");
         case 1: return ("msMinus640");
         case 2: return ("msMinus320");
         case 3: return ("msMinus160");
         case 4: return ("msMinus80");
         case 5: return ("msMinus60");
         case 6: return ("msMinus40");
         case 7: return ("msMinus20");
         case 8: return ("ms0");
         case 9: return ("ms20");
         case 10: return ("ms40");
         case 11: return ("ms60");
         case 12: return ("ms80");
         case 13: return ("ms160");
         case 14: return ("ms320");
         case 15: return ("ms640");
         case 16: return ("ms1280");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
