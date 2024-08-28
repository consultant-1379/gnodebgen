/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ServingCellConfigCommon_discoveryBurstWindowLength_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS0DOT5 = 0;
   public static final int _MS1 = 1;
   public static final int _MS2 = 2;
   public static final int _MS3 = 3;
   public static final int _MS4 = 4;
   public static final int _MS5 = 5;

   // Singleton instances of ServingCellConfigCommon_discoveryBurstWindowLength_r16
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms0dot5 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(0);
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms1 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(1);
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms2 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(2);
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms3 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(3);
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms4 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(4);
   protected static final ServingCellConfigCommon_discoveryBurstWindowLength_r16 _ms5 = new ServingCellConfigCommon_discoveryBurstWindowLength_r16(5);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected ServingCellConfigCommon_discoveryBurstWindowLength_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0dot5.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms0dot5() {
      return _ms0dot5;
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms3.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms3() {
      return _ms3;
   }

   /**
    * Singleton accessor method for ms4.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms4() {
      return _ms4;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 ms5() {
      return _ms5;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ServingCellConfigCommon_discoveryBurstWindowLength_r16.valueOf( ServingCellConfigCommon_discoveryBurstWindowLength_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ServingCellConfigCommon_discoveryBurstWindowLength_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0dot5();
         case 1: return ms1();
         case 2: return ms2();
         case 3: return ms3();
         case 4: return ms4();
         case 5: return ms5();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (6);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ServingCellConfigCommon_discoveryBurstWindowLength_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0dot5");
         case 1: return ("ms1");
         case 2: return ("ms2");
         case 3: return ("ms3");
         case 4: return ("ms4");
         case 5: return ("ms5");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
