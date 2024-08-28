/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_NB_r13_discardTimer_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS5120 = 0;
   public static final int _MS10240 = 1;
   public static final int _MS20480 = 2;
   public static final int _MS40960 = 3;
   public static final int _MS81920 = 4;
   public static final int _INFINITY = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of PDCP_Config_NB_r13_discardTimer_r13
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _ms5120 = new PDCP_Config_NB_r13_discardTimer_r13(0);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _ms10240 = new PDCP_Config_NB_r13_discardTimer_r13(1);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _ms20480 = new PDCP_Config_NB_r13_discardTimer_r13(2);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _ms40960 = new PDCP_Config_NB_r13_discardTimer_r13(3);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _ms81920 = new PDCP_Config_NB_r13_discardTimer_r13(4);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _infinity = new PDCP_Config_NB_r13_discardTimer_r13(5);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _spare2 = new PDCP_Config_NB_r13_discardTimer_r13(6);
   protected static final PDCP_Config_NB_r13_discardTimer_r13 _spare1 = new PDCP_Config_NB_r13_discardTimer_r13(7);

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
   protected PDCP_Config_NB_r13_discardTimer_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms5120.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 ms5120() {
      return _ms5120;
   }

   /**
    * Singleton accessor method for ms10240.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 ms10240() {
      return _ms10240;
   }

   /**
    * Singleton accessor method for ms20480.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 ms20480() {
      return _ms20480;
   }

   /**
    * Singleton accessor method for ms40960.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 ms40960() {
      return _ms40960;
   }

   /**
    * Singleton accessor method for ms81920.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 ms81920() {
      return _ms81920;
   }

   /**
    * Singleton accessor method for infinity.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 infinity() {
      return _infinity;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCP_Config_NB_r13_discardTimer_r13.valueOf( PDCP_Config_NB_r13_discardTimer_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCP_Config_NB_r13_discardTimer_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms5120();
         case 1: return ms10240();
         case 2: return ms20480();
         case 3: return ms40960();
         case 4: return ms81920();
         case 5: return infinity();
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
      buffer.invokeCharacters (PDCP_Config_NB_r13_discardTimer_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms5120");
         case 1: return ("ms10240");
         case 2: return ("ms20480");
         case 3: return ("ms40960");
         case 4: return ("ms81920");
         case 5: return ("infinity");
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
