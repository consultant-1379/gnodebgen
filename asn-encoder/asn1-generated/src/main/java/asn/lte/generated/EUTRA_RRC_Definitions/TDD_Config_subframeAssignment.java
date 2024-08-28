/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_Config_subframeAssignment extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SA0 = 0;
   public static final int _SA1 = 1;
   public static final int _SA2 = 2;
   public static final int _SA3 = 3;
   public static final int _SA4 = 4;
   public static final int _SA5 = 5;
   public static final int _SA6 = 6;

   // Singleton instances of TDD_Config_subframeAssignment
   protected static final TDD_Config_subframeAssignment _sa0 = new TDD_Config_subframeAssignment(0);
   protected static final TDD_Config_subframeAssignment _sa1 = new TDD_Config_subframeAssignment(1);
   protected static final TDD_Config_subframeAssignment _sa2 = new TDD_Config_subframeAssignment(2);
   protected static final TDD_Config_subframeAssignment _sa3 = new TDD_Config_subframeAssignment(3);
   protected static final TDD_Config_subframeAssignment _sa4 = new TDD_Config_subframeAssignment(4);
   protected static final TDD_Config_subframeAssignment _sa5 = new TDD_Config_subframeAssignment(5);
   protected static final TDD_Config_subframeAssignment _sa6 = new TDD_Config_subframeAssignment(6);

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
   protected TDD_Config_subframeAssignment (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sa0.
    */
   public static TDD_Config_subframeAssignment sa0() {
      return _sa0;
   }

   /**
    * Singleton accessor method for sa1.
    */
   public static TDD_Config_subframeAssignment sa1() {
      return _sa1;
   }

   /**
    * Singleton accessor method for sa2.
    */
   public static TDD_Config_subframeAssignment sa2() {
      return _sa2;
   }

   /**
    * Singleton accessor method for sa3.
    */
   public static TDD_Config_subframeAssignment sa3() {
      return _sa3;
   }

   /**
    * Singleton accessor method for sa4.
    */
   public static TDD_Config_subframeAssignment sa4() {
      return _sa4;
   }

   /**
    * Singleton accessor method for sa5.
    */
   public static TDD_Config_subframeAssignment sa5() {
      return _sa5;
   }

   /**
    * Singleton accessor method for sa6.
    */
   public static TDD_Config_subframeAssignment sa6() {
      return _sa6;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return TDD_Config_subframeAssignment.valueOf( TDD_Config_subframeAssignment.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static TDD_Config_subframeAssignment valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sa0();
         case 1: return sa1();
         case 2: return sa2();
         case 3: return sa3();
         case 4: return sa4();
         case 5: return sa5();
         case 6: return sa6();
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
      buffer.invokeCharacters (TDD_Config_subframeAssignment.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sa0");
         case 1: return ("sa1");
         case 2: return ("sa2");
         case 3: return ("sa3");
         case 4: return ("sa4");
         case 5: return ("sa5");
         case 6: return ("sa6");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
