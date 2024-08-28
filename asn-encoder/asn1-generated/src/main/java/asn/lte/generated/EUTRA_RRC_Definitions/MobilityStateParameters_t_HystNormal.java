/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MobilityStateParameters_t_HystNormal extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _S30 = 0;
   public static final int _S60 = 1;
   public static final int _S120 = 2;
   public static final int _S180 = 3;
   public static final int _S240 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of MobilityStateParameters_t_HystNormal
   protected static final MobilityStateParameters_t_HystNormal _s30 = new MobilityStateParameters_t_HystNormal(0);
   protected static final MobilityStateParameters_t_HystNormal _s60 = new MobilityStateParameters_t_HystNormal(1);
   protected static final MobilityStateParameters_t_HystNormal _s120 = new MobilityStateParameters_t_HystNormal(2);
   protected static final MobilityStateParameters_t_HystNormal _s180 = new MobilityStateParameters_t_HystNormal(3);
   protected static final MobilityStateParameters_t_HystNormal _s240 = new MobilityStateParameters_t_HystNormal(4);
   protected static final MobilityStateParameters_t_HystNormal _spare3 = new MobilityStateParameters_t_HystNormal(5);
   protected static final MobilityStateParameters_t_HystNormal _spare2 = new MobilityStateParameters_t_HystNormal(6);
   protected static final MobilityStateParameters_t_HystNormal _spare1 = new MobilityStateParameters_t_HystNormal(7);

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
   protected MobilityStateParameters_t_HystNormal (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for s30.
    */
   public static MobilityStateParameters_t_HystNormal s30() {
      return _s30;
   }

   /**
    * Singleton accessor method for s60.
    */
   public static MobilityStateParameters_t_HystNormal s60() {
      return _s60;
   }

   /**
    * Singleton accessor method for s120.
    */
   public static MobilityStateParameters_t_HystNormal s120() {
      return _s120;
   }

   /**
    * Singleton accessor method for s180.
    */
   public static MobilityStateParameters_t_HystNormal s180() {
      return _s180;
   }

   /**
    * Singleton accessor method for s240.
    */
   public static MobilityStateParameters_t_HystNormal s240() {
      return _s240;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static MobilityStateParameters_t_HystNormal spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static MobilityStateParameters_t_HystNormal spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static MobilityStateParameters_t_HystNormal spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MobilityStateParameters_t_HystNormal.valueOf( MobilityStateParameters_t_HystNormal.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MobilityStateParameters_t_HystNormal valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return s30();
         case 1: return s60();
         case 2: return s120();
         case 3: return s180();
         case 4: return s240();
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
      buffer.invokeCharacters (MobilityStateParameters_t_HystNormal.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("s30");
         case 1: return ("s60");
         case 2: return ("s120");
         case 3: return ("s180");
         case 4: return ("s240");
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
