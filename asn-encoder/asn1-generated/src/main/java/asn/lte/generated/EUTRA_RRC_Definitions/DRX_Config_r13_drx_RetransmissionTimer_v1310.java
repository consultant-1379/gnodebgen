/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_r13_drx_RetransmissionTimer_v1310 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _PSF40 = 0;
   public static final int _PSF64 = 1;
   public static final int _PSF80 = 2;
   public static final int _PSF96 = 3;
   public static final int _PSF112 = 4;
   public static final int _PSF128 = 5;
   public static final int _PSF160 = 6;
   public static final int _PSF320 = 7;

   // Singleton instances of DRX_Config_r13_drx_RetransmissionTimer_v1310
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf40 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(0);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf64 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(1);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf80 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(2);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf96 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(3);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf112 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(4);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf128 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(5);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf160 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(6);
   protected static final DRX_Config_r13_drx_RetransmissionTimer_v1310 _psf320 = new DRX_Config_r13_drx_RetransmissionTimer_v1310(7);

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
   protected DRX_Config_r13_drx_RetransmissionTimer_v1310 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for psf40.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf40() {
      return _psf40;
   }

   /**
    * Singleton accessor method for psf64.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf64() {
      return _psf64;
   }

   /**
    * Singleton accessor method for psf80.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf80() {
      return _psf80;
   }

   /**
    * Singleton accessor method for psf96.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf96() {
      return _psf96;
   }

   /**
    * Singleton accessor method for psf112.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf112() {
      return _psf112;
   }

   /**
    * Singleton accessor method for psf128.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf128() {
      return _psf128;
   }

   /**
    * Singleton accessor method for psf160.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf160() {
      return _psf160;
   }

   /**
    * Singleton accessor method for psf320.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 psf320() {
      return _psf320;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DRX_Config_r13_drx_RetransmissionTimer_v1310.valueOf( DRX_Config_r13_drx_RetransmissionTimer_v1310.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DRX_Config_r13_drx_RetransmissionTimer_v1310 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return psf40();
         case 1: return psf64();
         case 2: return psf80();
         case 3: return psf96();
         case 4: return psf112();
         case 5: return psf128();
         case 6: return psf160();
         case 7: return psf320();
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
      buffer.invokeCharacters (DRX_Config_r13_drx_RetransmissionTimer_v1310.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("psf40");
         case 1: return ("psf64");
         case 2: return ("psf80");
         case 3: return ("psf96");
         case 4: return ("psf112");
         case 5: return ("psf128");
         case 6: return ("psf160");
         case 7: return ("psf320");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
