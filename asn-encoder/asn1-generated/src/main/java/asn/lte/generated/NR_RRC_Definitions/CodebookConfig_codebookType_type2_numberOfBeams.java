/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookConfig_codebookType_type2_numberOfBeams extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _TWO = 0;
   public static final int _THREE = 1;
   public static final int _FOUR = 2;

   // Singleton instances of CodebookConfig_codebookType_type2_numberOfBeams
   protected static final CodebookConfig_codebookType_type2_numberOfBeams _two = new CodebookConfig_codebookType_type2_numberOfBeams(0);
   protected static final CodebookConfig_codebookType_type2_numberOfBeams _three = new CodebookConfig_codebookType_type2_numberOfBeams(1);
   protected static final CodebookConfig_codebookType_type2_numberOfBeams _four = new CodebookConfig_codebookType_type2_numberOfBeams(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected CodebookConfig_codebookType_type2_numberOfBeams (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for two.
    */
   public static CodebookConfig_codebookType_type2_numberOfBeams two() {
      return _two;
   }

   /**
    * Singleton accessor method for three.
    */
   public static CodebookConfig_codebookType_type2_numberOfBeams three() {
      return _three;
   }

   /**
    * Singleton accessor method for four.
    */
   public static CodebookConfig_codebookType_type2_numberOfBeams four() {
      return _four;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CodebookConfig_codebookType_type2_numberOfBeams.valueOf( CodebookConfig_codebookType_type2_numberOfBeams.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CodebookConfig_codebookType_type2_numberOfBeams valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return two();
         case 1: return three();
         case 2: return four();
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
      buffer.invokeCharacters (CodebookConfig_codebookType_type2_numberOfBeams.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("two");
         case 1: return ("three");
         case 2: return ("four");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
