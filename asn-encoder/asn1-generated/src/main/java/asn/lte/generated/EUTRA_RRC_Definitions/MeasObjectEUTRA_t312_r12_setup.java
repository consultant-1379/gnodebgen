/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectEUTRA_t312_r12_setup extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS0 = 0;
   public static final int _MS50 = 1;
   public static final int _MS100 = 2;
   public static final int _MS200 = 3;
   public static final int _MS300 = 4;
   public static final int _MS400 = 5;
   public static final int _MS500 = 6;
   public static final int _MS1000 = 7;

   // Singleton instances of MeasObjectEUTRA_t312_r12_setup
   protected static final MeasObjectEUTRA_t312_r12_setup _ms0 = new MeasObjectEUTRA_t312_r12_setup(0);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms50 = new MeasObjectEUTRA_t312_r12_setup(1);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms100 = new MeasObjectEUTRA_t312_r12_setup(2);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms200 = new MeasObjectEUTRA_t312_r12_setup(3);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms300 = new MeasObjectEUTRA_t312_r12_setup(4);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms400 = new MeasObjectEUTRA_t312_r12_setup(5);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms500 = new MeasObjectEUTRA_t312_r12_setup(6);
   protected static final MeasObjectEUTRA_t312_r12_setup _ms1000 = new MeasObjectEUTRA_t312_r12_setup(7);

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
   protected MeasObjectEUTRA_t312_r12_setup (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms0.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms0() {
      return _ms0;
   }

   /**
    * Singleton accessor method for ms50.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms50() {
      return _ms50;
   }

   /**
    * Singleton accessor method for ms100.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms100() {
      return _ms100;
   }

   /**
    * Singleton accessor method for ms200.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms200() {
      return _ms200;
   }

   /**
    * Singleton accessor method for ms300.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms300() {
      return _ms300;
   }

   /**
    * Singleton accessor method for ms400.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms400() {
      return _ms400;
   }

   /**
    * Singleton accessor method for ms500.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms500() {
      return _ms500;
   }

   /**
    * Singleton accessor method for ms1000.
    */
   public static MeasObjectEUTRA_t312_r12_setup ms1000() {
      return _ms1000;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MeasObjectEUTRA_t312_r12_setup.valueOf( MeasObjectEUTRA_t312_r12_setup.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MeasObjectEUTRA_t312_r12_setup valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms0();
         case 1: return ms50();
         case 2: return ms100();
         case 3: return ms200();
         case 4: return ms300();
         case 5: return ms400();
         case 6: return ms500();
         case 7: return ms1000();
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
      buffer.invokeCharacters (MeasObjectEUTRA_t312_r12_setup.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms0");
         case 1: return ("ms50");
         case 2: return ("ms100");
         case 3: return ("ms200");
         case 4: return ("ms300");
         case 5: return ("ms400");
         case 6: return ("ms500");
         case 7: return ("ms1000");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
