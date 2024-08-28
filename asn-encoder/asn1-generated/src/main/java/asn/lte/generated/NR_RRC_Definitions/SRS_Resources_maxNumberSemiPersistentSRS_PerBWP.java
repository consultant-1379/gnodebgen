/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Resources_maxNumberSemiPersistentSRS_PerBWP extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;
   public static final int _N4 = 2;
   public static final int _N8 = 3;
   public static final int _N16 = 4;

   // Singleton instances of SRS_Resources_maxNumberSemiPersistentSRS_PerBWP
   protected static final SRS_Resources_maxNumberSemiPersistentSRS_PerBWP _n1 = new SRS_Resources_maxNumberSemiPersistentSRS_PerBWP(0);
   protected static final SRS_Resources_maxNumberSemiPersistentSRS_PerBWP _n2 = new SRS_Resources_maxNumberSemiPersistentSRS_PerBWP(1);
   protected static final SRS_Resources_maxNumberSemiPersistentSRS_PerBWP _n4 = new SRS_Resources_maxNumberSemiPersistentSRS_PerBWP(2);
   protected static final SRS_Resources_maxNumberSemiPersistentSRS_PerBWP _n8 = new SRS_Resources_maxNumberSemiPersistentSRS_PerBWP(3);
   protected static final SRS_Resources_maxNumberSemiPersistentSRS_PerBWP _n16 = new SRS_Resources_maxNumberSemiPersistentSRS_PerBWP(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected SRS_Resources_maxNumberSemiPersistentSRS_PerBWP (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP n16() {
      return _n16;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SRS_Resources_maxNumberSemiPersistentSRS_PerBWP.valueOf( SRS_Resources_maxNumberSemiPersistentSRS_PerBWP.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SRS_Resources_maxNumberSemiPersistentSRS_PerBWP valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n4();
         case 3: return n8();
         case 4: return n16();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SRS_Resources_maxNumberSemiPersistentSRS_PerBWP.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n4");
         case 3: return ("n8");
         case 4: return ("n16");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
