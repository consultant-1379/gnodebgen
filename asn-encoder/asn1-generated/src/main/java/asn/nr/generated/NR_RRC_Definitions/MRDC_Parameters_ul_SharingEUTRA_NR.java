/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MRDC_Parameters_ul_SharingEUTRA_NR extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _TDM = 0;
   public static final int _FDM = 1;
   public static final int _BOTH = 2;

   // Singleton instances of MRDC_Parameters_ul_SharingEUTRA_NR
   protected static final MRDC_Parameters_ul_SharingEUTRA_NR _tdm = new MRDC_Parameters_ul_SharingEUTRA_NR(0);
   protected static final MRDC_Parameters_ul_SharingEUTRA_NR _fdm = new MRDC_Parameters_ul_SharingEUTRA_NR(1);
   protected static final MRDC_Parameters_ul_SharingEUTRA_NR _both = new MRDC_Parameters_ul_SharingEUTRA_NR(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MRDC_Parameters_ul_SharingEUTRA_NR (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for tdm.
    */
   public static MRDC_Parameters_ul_SharingEUTRA_NR tdm() {
      return _tdm;
   }

   /**
    * Singleton accessor method for fdm.
    */
   public static MRDC_Parameters_ul_SharingEUTRA_NR fdm() {
      return _fdm;
   }

   /**
    * Singleton accessor method for both.
    */
   public static MRDC_Parameters_ul_SharingEUTRA_NR both() {
      return _both;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MRDC_Parameters_ul_SharingEUTRA_NR.valueOf( MRDC_Parameters_ul_SharingEUTRA_NR.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MRDC_Parameters_ul_SharingEUTRA_NR valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return tdm();
         case 1: return fdm();
         case 2: return both();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MRDC_Parameters_ul_SharingEUTRA_NR.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* tdm */break;
         case 1: ui = 1; /* fdm */break;
         case 2: ui = 2; /* both */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("tdm");
         case 1: return ("fdm");
         case 2: return ("both");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
