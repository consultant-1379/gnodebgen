/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasCycleSCell_r10 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasCycleSCell-r10";
   }

   // Integer constants for switch-case
   public static final int _SF160 = 0;
   public static final int _SF256 = 1;
   public static final int _SF320 = 2;
   public static final int _SF512 = 3;
   public static final int _SF640 = 4;
   public static final int _SF1024 = 5;
   public static final int _SF1280 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of MeasCycleSCell_r10
   protected static final MeasCycleSCell_r10 _sf160 = new MeasCycleSCell_r10(0);
   protected static final MeasCycleSCell_r10 _sf256 = new MeasCycleSCell_r10(1);
   protected static final MeasCycleSCell_r10 _sf320 = new MeasCycleSCell_r10(2);
   protected static final MeasCycleSCell_r10 _sf512 = new MeasCycleSCell_r10(3);
   protected static final MeasCycleSCell_r10 _sf640 = new MeasCycleSCell_r10(4);
   protected static final MeasCycleSCell_r10 _sf1024 = new MeasCycleSCell_r10(5);
   protected static final MeasCycleSCell_r10 _sf1280 = new MeasCycleSCell_r10(6);
   protected static final MeasCycleSCell_r10 _spare1 = new MeasCycleSCell_r10(7);

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
   protected MeasCycleSCell_r10 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf160.
    */
   public static MeasCycleSCell_r10 sf160() {
      return _sf160;
   }

   /**
    * Singleton accessor method for sf256.
    */
   public static MeasCycleSCell_r10 sf256() {
      return _sf256;
   }

   /**
    * Singleton accessor method for sf320.
    */
   public static MeasCycleSCell_r10 sf320() {
      return _sf320;
   }

   /**
    * Singleton accessor method for sf512.
    */
   public static MeasCycleSCell_r10 sf512() {
      return _sf512;
   }

   /**
    * Singleton accessor method for sf640.
    */
   public static MeasCycleSCell_r10 sf640() {
      return _sf640;
   }

   /**
    * Singleton accessor method for sf1024.
    */
   public static MeasCycleSCell_r10 sf1024() {
      return _sf1024;
   }

   /**
    * Singleton accessor method for sf1280.
    */
   public static MeasCycleSCell_r10 sf1280() {
      return _sf1280;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static MeasCycleSCell_r10 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MeasCycleSCell_r10.valueOf( MeasCycleSCell_r10.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MeasCycleSCell_r10 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf160();
         case 1: return sf256();
         case 2: return sf320();
         case 3: return sf512();
         case 4: return sf640();
         case 5: return sf1024();
         case 6: return sf1280();
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
      buffer.invokeCharacters (MeasCycleSCell_r10.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf160");
         case 1: return ("sf256");
         case 2: return ("sf320");
         case 3: return ("sf512");
         case 4: return ("sf640");
         case 5: return ("sf1024");
         case 6: return ("sf1280");
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
