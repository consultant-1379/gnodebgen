/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;

public class SidelinkPreconfigNR_r16_t400_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS100 = 0;
   public static final int _MS200 = 1;
   public static final int _MS300 = 2;
   public static final int _MS400 = 3;
   public static final int _MS600 = 4;
   public static final int _MS1000 = 5;
   public static final int _MS1500 = 6;
   public static final int _MS2000 = 7;

   // Singleton instances of SidelinkPreconfigNR_r16_t400_r16
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms100 = new SidelinkPreconfigNR_r16_t400_r16(0);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms200 = new SidelinkPreconfigNR_r16_t400_r16(1);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms300 = new SidelinkPreconfigNR_r16_t400_r16(2);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms400 = new SidelinkPreconfigNR_r16_t400_r16(3);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms600 = new SidelinkPreconfigNR_r16_t400_r16(4);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms1000 = new SidelinkPreconfigNR_r16_t400_r16(5);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms1500 = new SidelinkPreconfigNR_r16_t400_r16(6);
   protected static final SidelinkPreconfigNR_r16_t400_r16 _ms2000 = new SidelinkPreconfigNR_r16_t400_r16(7);

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
   protected SidelinkPreconfigNR_r16_t400_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms200.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms200() {
      return _ms200;
   }

   /**
    * Singleton accessor method for ms300.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms300() {
      return _ms300;
   }

   /**
    * Singleton accessor method for ms400.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms400() {
      return _ms400;
   }

   /**
    * Singleton accessor method for ms600.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms600() {
      return _ms600;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms1500.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms1500() {
      return _ms1500;
   }

   /**
    * Singleton accessor method for ms2000.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 ms2000() {
      return _ms2000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SidelinkPreconfigNR_r16_t400_r16.valueOf( SidelinkPreconfigNR_r16_t400_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SidelinkPreconfigNR_r16_t400_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms100();
         case 1: return ms200();
         case 2: return ms300();
         case 3: return ms400();
         case 4: return ms600();
         case 5: return ms1000();
         case 6: return ms1500();
         case 7: return ms2000();
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
      buffer.invokeCharacters (SidelinkPreconfigNR_r16_t400_r16.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms100 */break;
         case 1: ui = 1; /* ms200 */break;
         case 2: ui = 2; /* ms300 */break;
         case 3: ui = 3; /* ms400 */break;
         case 4: ui = 4; /* ms600 */break;
         case 5: ui = 5; /* ms1000 */break;
         case 6: ui = 6; /* ms1500 */break;
         case 7: ui = 7; /* ms2000 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms100");
         case 1: return ("ms200");
         case 2: return ("ms300");
         case 3: return ("ms400");
         case 4: return ("ms600");
         case 5: return ("ms1000");
         case 6: return ("ms1500");
         case 7: return ("ms2000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
