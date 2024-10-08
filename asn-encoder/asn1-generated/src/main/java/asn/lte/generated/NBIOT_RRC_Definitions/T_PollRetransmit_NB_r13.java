/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class T_PollRetransmit_NB_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "T-PollRetransmit-NB-r13";
   }

   // Integer constants for switch-case
   public static final int _MS250 = 0;
   public static final int _MS500 = 1;
   public static final int _MS1000 = 2;
   public static final int _MS2000 = 3;
   public static final int _MS3000 = 4;
   public static final int _MS4000 = 5;
   public static final int _MS6000 = 6;
   public static final int _MS10000 = 7;
   public static final int _MS15000 = 8;
   public static final int _MS25000 = 9;
   public static final int _MS40000 = 10;
   public static final int _MS60000 = 11;
   public static final int _MS90000 = 12;
   public static final int _MS120000 = 13;
   public static final int _MS180000 = 14;
   public static final int _MS300000_V1530 = 15;

   // Singleton instances of T_PollRetransmit_NB_r13
   protected static final T_PollRetransmit_NB_r13 _ms250 = new T_PollRetransmit_NB_r13(0);
   protected static final T_PollRetransmit_NB_r13 _ms500 = new T_PollRetransmit_NB_r13(1);
   protected static final T_PollRetransmit_NB_r13 _ms1000 = new T_PollRetransmit_NB_r13(2);
   protected static final T_PollRetransmit_NB_r13 _ms2000 = new T_PollRetransmit_NB_r13(3);
   protected static final T_PollRetransmit_NB_r13 _ms3000 = new T_PollRetransmit_NB_r13(4);
   protected static final T_PollRetransmit_NB_r13 _ms4000 = new T_PollRetransmit_NB_r13(5);
   protected static final T_PollRetransmit_NB_r13 _ms6000 = new T_PollRetransmit_NB_r13(6);
   protected static final T_PollRetransmit_NB_r13 _ms10000 = new T_PollRetransmit_NB_r13(7);
   protected static final T_PollRetransmit_NB_r13 _ms15000 = new T_PollRetransmit_NB_r13(8);
   protected static final T_PollRetransmit_NB_r13 _ms25000 = new T_PollRetransmit_NB_r13(9);
   protected static final T_PollRetransmit_NB_r13 _ms40000 = new T_PollRetransmit_NB_r13(10);
   protected static final T_PollRetransmit_NB_r13 _ms60000 = new T_PollRetransmit_NB_r13(11);
   protected static final T_PollRetransmit_NB_r13 _ms90000 = new T_PollRetransmit_NB_r13(12);
   protected static final T_PollRetransmit_NB_r13 _ms120000 = new T_PollRetransmit_NB_r13(13);
   protected static final T_PollRetransmit_NB_r13 _ms180000 = new T_PollRetransmit_NB_r13(14);
   protected static final T_PollRetransmit_NB_r13 _ms300000_v1530 = new T_PollRetransmit_NB_r13(15);

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
    */
   protected T_PollRetransmit_NB_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms250.
    */
   public static T_PollRetransmit_NB_r13 ms250() {
      return _ms250;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static T_PollRetransmit_NB_r13 ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static T_PollRetransmit_NB_r13 ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms2000.
    */
   public static T_PollRetransmit_NB_r13 ms2000() {
      return _ms2000;
   }

   /**
    * Singleton accessor method for ms3000.
    */
   public static T_PollRetransmit_NB_r13 ms3000() {
      return _ms3000;
   }

   /**
    * Singleton accessor method for ms4000.
    */
   public static T_PollRetransmit_NB_r13 ms4000() {
      return _ms4000;
   }

   /**
    * Singleton accessor method for ms6000.
    */
   public static T_PollRetransmit_NB_r13 ms6000() {
      return _ms6000;
   }

   /**
    * Singleton accessor method for ms10000.
    */
   public static T_PollRetransmit_NB_r13 ms10000() {
      return _ms10000;
   }

   /**
    * Singleton accessor method for ms15000.
    */
   public static T_PollRetransmit_NB_r13 ms15000() {
      return _ms15000;
   }

   /**
    * Singleton accessor method for ms25000.
    */
   public static T_PollRetransmit_NB_r13 ms25000() {
      return _ms25000;
   }

   /**
    * Singleton accessor method for ms40000.
    */
   public static T_PollRetransmit_NB_r13 ms40000() {
      return _ms40000;
   }

   /**
    * Singleton accessor method for ms60000.
    */
   public static T_PollRetransmit_NB_r13 ms60000() {
      return _ms60000;
   }

   /**
    * Singleton accessor method for ms90000.
    */
   public static T_PollRetransmit_NB_r13 ms90000() {
      return _ms90000;
   }

   /**
    * Singleton accessor method for ms120000.
    */
   public static T_PollRetransmit_NB_r13 ms120000() {
      return _ms120000;
   }

   /**
    * Singleton accessor method for ms180000.
    */
   public static T_PollRetransmit_NB_r13 ms180000() {
      return _ms180000;
   }

   /**
    * Singleton accessor method for ms300000_v1530.
    */
   public static T_PollRetransmit_NB_r13 ms300000_v1530() {
      return _ms300000_v1530;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return T_PollRetransmit_NB_r13.valueOf( T_PollRetransmit_NB_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static T_PollRetransmit_NB_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms250();
         case 1: return ms500();
         case 2: return ms1000();
         case 3: return ms2000();
         case 4: return ms3000();
         case 5: return ms4000();
         case 6: return ms6000();
         case 7: return ms10000();
         case 8: return ms15000();
         case 9: return ms25000();
         case 10: return ms40000();
         case 11: return ms60000();
         case 12: return ms90000();
         case 13: return ms120000();
         case 14: return ms180000();
         case 15: return ms300000_v1530();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (16);

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
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (T_PollRetransmit_NB_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms250");
         case 1: return ("ms500");
         case 2: return ("ms1000");
         case 3: return ("ms2000");
         case 4: return ("ms3000");
         case 5: return ("ms4000");
         case 6: return ("ms6000");
         case 7: return ("ms10000");
         case 8: return ("ms15000");
         case 9: return ("ms25000");
         case 10: return ("ms40000");
         case 11: return ("ms60000");
         case 12: return ("ms90000");
         case 13: return ("ms120000");
         case 14: return ("ms180000");
         case 15: return ("ms300000-v1530");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
