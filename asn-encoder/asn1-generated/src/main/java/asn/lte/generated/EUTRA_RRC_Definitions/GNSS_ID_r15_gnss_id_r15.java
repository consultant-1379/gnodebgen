/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class GNSS_ID_r15_gnss_id_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _GPS = 0;
   public static final int _SBAS = 1;
   public static final int _QZSS = 2;
   public static final int _GALILEO = 3;
   public static final int _GLONASS = 4;
   public static final int _BDS = 5;

   // Singleton instances of GNSS_ID_r15_gnss_id_r15
   protected static final GNSS_ID_r15_gnss_id_r15 _gps = new GNSS_ID_r15_gnss_id_r15(0);
   protected static final GNSS_ID_r15_gnss_id_r15 _sbas = new GNSS_ID_r15_gnss_id_r15(1);
   protected static final GNSS_ID_r15_gnss_id_r15 _qzss = new GNSS_ID_r15_gnss_id_r15(2);
   protected static final GNSS_ID_r15_gnss_id_r15 _galileo = new GNSS_ID_r15_gnss_id_r15(3);
   protected static final GNSS_ID_r15_gnss_id_r15 _glonass = new GNSS_ID_r15_gnss_id_r15(4);
   protected static final GNSS_ID_r15_gnss_id_r15 _bds = new GNSS_ID_r15_gnss_id_r15(5);
   private static GNSS_ID_r15_gnss_id_r15 __undefined = new GNSS_ID_r15_gnss_id_r15(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected GNSS_ID_r15_gnss_id_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for gps.
    */
   public static GNSS_ID_r15_gnss_id_r15 gps() {
      return _gps;
   }

   /**
    * Singleton accessor method for sbas.
    */
   public static GNSS_ID_r15_gnss_id_r15 sbas() {
      return _sbas;
   }

   /**
    * Singleton accessor method for qzss.
    */
   public static GNSS_ID_r15_gnss_id_r15 qzss() {
      return _qzss;
   }

   /**
    * Singleton accessor method for galileo.
    */
   public static GNSS_ID_r15_gnss_id_r15 galileo() {
      return _galileo;
   }

   /**
    * Singleton accessor method for glonass.
    */
   public static GNSS_ID_r15_gnss_id_r15 glonass() {
      return _glonass;
   }

   /**
    * Singleton accessor method for bds.
    */
   public static GNSS_ID_r15_gnss_id_r15 bds() {
      return _bds;
   }

   /** Undefined value. */
   protected static GNSS_ID_r15_gnss_id_r15 __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return GNSS_ID_r15_gnss_id_r15.valueOf( GNSS_ID_r15_gnss_id_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static GNSS_ID_r15_gnss_id_r15 valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return gps();
         case 1: return sbas();
         case 2: return qzss();
         case 3: return galileo();
         case 4: return glonass();
         case 5: return bds();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         return 0x7fffffff;
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (6);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            case 4: ret =  4; break;
            case 5: ret =  5; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (GNSS_ID_r15_gnss_id_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("gps");
         case 1: return ("sbas");
         case 2: return ("qzss");
         case 3: return ("galileo");
         case 4: return ("glonass");
         case 5: return ("bds");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
