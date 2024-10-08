/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N12 = 0;
   public static final int _N24 = 1;
   public static final int _N36 = 2;
   public static final int _N48 = 3;

   // Singleton instances of NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 _n12 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15(0);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 _n24 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15(1);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 _n36 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15(2);
   protected static final NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 _n48 = new NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n12.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 n12() {
      return _n12;
   }

   /**
    * Singleton accessor method for n24.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 n24() {
      return _n24;
   }

   /**
    * Singleton accessor method for n36.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 n36() {
      return _n36;
   }

   /**
    * Singleton accessor method for n48.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 n48() {
      return _n48;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15.valueOf( NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n12();
         case 1: return n24();
         case 2: return n36();
         case 3: return n48();
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
      buffer.invokeCharacters (NPRACH_ParametersTDD_NB_r15_nprach_Parameters_r15_nprach_NumSubcarriers_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n12");
         case 1: return ("n24");
         case 2: return ("n36");
         case 3: return ("n48");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
