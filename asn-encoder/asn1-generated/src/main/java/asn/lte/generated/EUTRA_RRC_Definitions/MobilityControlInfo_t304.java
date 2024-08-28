/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MobilityControlInfo_t304 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS50 = 0;
   public static final int _MS100 = 1;
   public static final int _MS150 = 2;
   public static final int _MS200 = 3;
   public static final int _MS500 = 4;
   public static final int _MS1000 = 5;
   public static final int _MS2000 = 6;
   public static final int _MS10000_V1310 = 7;

   // Singleton instances of MobilityControlInfo_t304
   protected static final MobilityControlInfo_t304 _ms50 = new MobilityControlInfo_t304(0);
   protected static final MobilityControlInfo_t304 _ms100 = new MobilityControlInfo_t304(1);
   protected static final MobilityControlInfo_t304 _ms150 = new MobilityControlInfo_t304(2);
   protected static final MobilityControlInfo_t304 _ms200 = new MobilityControlInfo_t304(3);
   protected static final MobilityControlInfo_t304 _ms500 = new MobilityControlInfo_t304(4);
   protected static final MobilityControlInfo_t304 _ms1000 = new MobilityControlInfo_t304(5);
   protected static final MobilityControlInfo_t304 _ms2000 = new MobilityControlInfo_t304(6);
   protected static final MobilityControlInfo_t304 _ms10000_v1310 = new MobilityControlInfo_t304(7);

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
   protected MobilityControlInfo_t304 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms50.
    */
   public static MobilityControlInfo_t304 ms50() {
      return _ms50;
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static MobilityControlInfo_t304 ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms150.
    */
   public static MobilityControlInfo_t304 ms150() {
      return _ms150;
   }

   /**
    * Singleton accessor method for ms200.
    */
   public static MobilityControlInfo_t304 ms200() {
      return _ms200;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static MobilityControlInfo_t304 ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static MobilityControlInfo_t304 ms1000() {
      return _ms1000;
   }

   /**
    * Singleton accessor method for ms2000.
    */
   public static MobilityControlInfo_t304 ms2000() {
      return _ms2000;
   }

   /**
    * Singleton accessor method for ms10000_v1310.
    */
   public static MobilityControlInfo_t304 ms10000_v1310() {
      return _ms10000_v1310;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MobilityControlInfo_t304.valueOf( MobilityControlInfo_t304.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MobilityControlInfo_t304 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms50();
         case 1: return ms100();
         case 2: return ms150();
         case 3: return ms200();
         case 4: return ms500();
         case 5: return ms1000();
         case 6: return ms2000();
         case 7: return ms10000_v1310();
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
      buffer.invokeCharacters (MobilityControlInfo_t304.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms50");
         case 1: return ("ms100");
         case 2: return ("ms150");
         case 3: return ("ms200");
         case 4: return ("ms500");
         case 5: return ("ms1000");
         case 6: return ("ms2000");
         case 7: return ("ms10000-v1310");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
