/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_si_WindowLength extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS1 = 0;
   public static final int _MS2 = 1;
   public static final int _MS5 = 2;
   public static final int _MS10 = 3;
   public static final int _MS15 = 4;
   public static final int _MS20 = 5;
   public static final int _MS40 = 6;

   // Singleton instances of SystemInformationBlockType1_si_WindowLength
   protected static final SystemInformationBlockType1_si_WindowLength _ms1 = new SystemInformationBlockType1_si_WindowLength(0);
   protected static final SystemInformationBlockType1_si_WindowLength _ms2 = new SystemInformationBlockType1_si_WindowLength(1);
   protected static final SystemInformationBlockType1_si_WindowLength _ms5 = new SystemInformationBlockType1_si_WindowLength(2);
   protected static final SystemInformationBlockType1_si_WindowLength _ms10 = new SystemInformationBlockType1_si_WindowLength(3);
   protected static final SystemInformationBlockType1_si_WindowLength _ms15 = new SystemInformationBlockType1_si_WindowLength(4);
   protected static final SystemInformationBlockType1_si_WindowLength _ms20 = new SystemInformationBlockType1_si_WindowLength(5);
   protected static final SystemInformationBlockType1_si_WindowLength _ms40 = new SystemInformationBlockType1_si_WindowLength(6);

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
   protected SystemInformationBlockType1_si_WindowLength (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms1.
    */
   public static SystemInformationBlockType1_si_WindowLength ms1() {
      return _ms1;
   }

   /**
    * Singleton accessor method for ms2.
    */
   public static SystemInformationBlockType1_si_WindowLength ms2() {
      return _ms2;
   }

   /**
    * Singleton accessor method for ms5.
    */
   public static SystemInformationBlockType1_si_WindowLength ms5() {
      return _ms5;
   }

   /**
    * Singleton accessor method for ms10.
    */
   public static SystemInformationBlockType1_si_WindowLength ms10() {
      return _ms10;
   }

   /**
    * Singleton accessor method for ms15.
    */
   public static SystemInformationBlockType1_si_WindowLength ms15() {
      return _ms15;
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static SystemInformationBlockType1_si_WindowLength ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static SystemInformationBlockType1_si_WindowLength ms40() {
      return _ms40;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SystemInformationBlockType1_si_WindowLength.valueOf( SystemInformationBlockType1_si_WindowLength.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SystemInformationBlockType1_si_WindowLength valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms1();
         case 1: return ms2();
         case 2: return ms5();
         case 3: return ms10();
         case 4: return ms15();
         case 5: return ms20();
         case 6: return ms40();
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
      buffer.invokeCharacters (SystemInformationBlockType1_si_WindowLength.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms1");
         case 1: return ("ms2");
         case 2: return ("ms5");
         case 3: return ("ms10");
         case 4: return ("ms15");
         case 5: return ("ms20");
         case 6: return ("ms40");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
