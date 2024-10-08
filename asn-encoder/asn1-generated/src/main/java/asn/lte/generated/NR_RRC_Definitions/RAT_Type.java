/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RAT_Type extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RAT-Type";
   }

   // Integer constants for switch-case
   public static final int _NR = 0;
   public static final int _EUTRA_NR = 1;
   public static final int _EUTRA = 2;
   public static final int _UTRA_FDD_V1610 = 3;

   // Singleton instances of RAT_Type
   protected static final RAT_Type _nr = new RAT_Type(0);
   protected static final RAT_Type _eutra_nr = new RAT_Type(1);
   protected static final RAT_Type _eutra = new RAT_Type(2);
   protected static final RAT_Type _utra_fdd_v1610 = new RAT_Type(3);
   private static RAT_Type __undefined = new RAT_Type(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected RAT_Type (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nr.
    */
   public static RAT_Type nr() {
      return _nr;
   }

   /**
    * Singleton accessor method for eutra_nr.
    */
   public static RAT_Type eutra_nr() {
      return _eutra_nr;
   }

   /**
    * Singleton accessor method for eutra.
    */
   public static RAT_Type eutra() {
      return _eutra;
   }

   /**
    * Singleton accessor method for utra_fdd_v1610.
    */
   public static RAT_Type utra_fdd_v1610() {
      return _utra_fdd_v1610;
   }

   /** Undefined value. */
   protected static RAT_Type __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RAT_Type.valueOf( RAT_Type.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RAT_Type valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return nr();
         case 1: return eutra_nr();
         case 2: return eutra();
         case 3: return utra_fdd_v1610();
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
         ui = (int) buffer.decodeConsWholeNumber (4);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RAT_Type.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nr");
         case 1: return ("eutra-nr");
         case 2: return ("eutra");
         case 3: return ("utra-fdd-v1610");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
