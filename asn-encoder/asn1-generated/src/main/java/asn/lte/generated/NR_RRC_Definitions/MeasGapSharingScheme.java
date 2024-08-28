/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasGapSharingScheme extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasGapSharingScheme";
   }

   // Integer constants for switch-case
   public static final int _SCHEME00 = 0;
   public static final int _SCHEME01 = 1;
   public static final int _SCHEME10 = 2;
   public static final int _SCHEME11 = 3;

   // Singleton instances of MeasGapSharingScheme
   protected static final MeasGapSharingScheme _scheme00 = new MeasGapSharingScheme(0);
   protected static final MeasGapSharingScheme _scheme01 = new MeasGapSharingScheme(1);
   protected static final MeasGapSharingScheme _scheme10 = new MeasGapSharingScheme(2);
   protected static final MeasGapSharingScheme _scheme11 = new MeasGapSharingScheme(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MeasGapSharingScheme (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for scheme00.
    */
   public static MeasGapSharingScheme scheme00() {
      return _scheme00;
   }

   /**
    * Singleton accessor method for scheme01.
    */
   public static MeasGapSharingScheme scheme01() {
      return _scheme01;
   }

   /**
    * Singleton accessor method for scheme10.
    */
   public static MeasGapSharingScheme scheme10() {
      return _scheme10;
   }

   /**
    * Singleton accessor method for scheme11.
    */
   public static MeasGapSharingScheme scheme11() {
      return _scheme11;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MeasGapSharingScheme.valueOf( MeasGapSharingScheme.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MeasGapSharingScheme valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return scheme00();
         case 1: return scheme01();
         case 2: return scheme10();
         case 3: return scheme11();
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
      buffer.invokeCharacters (MeasGapSharingScheme.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("scheme00");
         case 1: return ("scheme01");
         case 2: return ("scheme10");
         case 3: return ("scheme11");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
