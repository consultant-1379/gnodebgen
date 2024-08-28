/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SPS_ConfigUL_setup_implicitReleaseAfter extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _E2 = 0;
   public static final int _E3 = 1;
   public static final int _E4 = 2;
   public static final int _E8 = 3;

   // Singleton instances of SPS_ConfigUL_setup_implicitReleaseAfter
   protected static final SPS_ConfigUL_setup_implicitReleaseAfter _e2 = new SPS_ConfigUL_setup_implicitReleaseAfter(0);
   protected static final SPS_ConfigUL_setup_implicitReleaseAfter _e3 = new SPS_ConfigUL_setup_implicitReleaseAfter(1);
   protected static final SPS_ConfigUL_setup_implicitReleaseAfter _e4 = new SPS_ConfigUL_setup_implicitReleaseAfter(2);
   protected static final SPS_ConfigUL_setup_implicitReleaseAfter _e8 = new SPS_ConfigUL_setup_implicitReleaseAfter(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected SPS_ConfigUL_setup_implicitReleaseAfter (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for e2.
    */
   public static SPS_ConfigUL_setup_implicitReleaseAfter e2() {
      return _e2;
   }

   /**
    * Singleton accessor method for e3.
    */
   public static SPS_ConfigUL_setup_implicitReleaseAfter e3() {
      return _e3;
   }

   /**
    * Singleton accessor method for e4.
    */
   public static SPS_ConfigUL_setup_implicitReleaseAfter e4() {
      return _e4;
   }

   /**
    * Singleton accessor method for e8.
    */
   public static SPS_ConfigUL_setup_implicitReleaseAfter e8() {
      return _e8;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SPS_ConfigUL_setup_implicitReleaseAfter.valueOf( SPS_ConfigUL_setup_implicitReleaseAfter.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SPS_ConfigUL_setup_implicitReleaseAfter valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return e2();
         case 1: return e3();
         case 2: return e4();
         case 3: return e8();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SPS_ConfigUL_setup_implicitReleaseAfter.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("e2");
         case 1: return ("e3");
         case 2: return ("e4");
         case 3: return ("e8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
