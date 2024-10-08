/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF200 = 0;
   public static final int _SF500 = 1;
   public static final int _SF1000 = 2;
   public static final int _SF2000 = 3;
   public static final int _SPARE4 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _sf200 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(0);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _sf500 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(1);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _sf1000 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(2);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _sf2000 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(3);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _spare4 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(4);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _spare3 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(5);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _spare2 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(6);
   protected static final IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 _spare1 = new IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11(7);

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
   protected IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf200.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 sf200() {
      return _sf200;
   }

   /**
    * Singleton accessor method for sf500.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 sf500() {
      return _sf500;
   }

   /**
    * Singleton accessor method for sf1000.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 sf1000() {
      return _sf1000;
   }

   /**
    * Singleton accessor method for sf2000.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 sf2000() {
      return _sf2000;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11.valueOf( IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf200();
         case 1: return sf500();
         case 2: return sf1000();
         case 3: return sf2000();
         case 4: return spare4();
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
      buffer.invokeCharacters (IDC_Config_r11_autonomousDenialParameters_r11_autonomousDenialValidity_r11.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf200");
         case 1: return ("sf500");
         case 2: return ("sf1000");
         case 3: return ("sf2000");
         case 4: return ("spare4");
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
