/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CodebookParameters_type1_multiPanel_modes extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MODE1 = 0;
   public static final int _MODE2 = 1;
   public static final int _BOTH = 2;

   // Singleton instances of CodebookParameters_type1_multiPanel_modes
   protected static final CodebookParameters_type1_multiPanel_modes _mode1 = new CodebookParameters_type1_multiPanel_modes(0);
   protected static final CodebookParameters_type1_multiPanel_modes _mode2 = new CodebookParameters_type1_multiPanel_modes(1);
   protected static final CodebookParameters_type1_multiPanel_modes _both = new CodebookParameters_type1_multiPanel_modes(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected CodebookParameters_type1_multiPanel_modes (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mode1.
    */
   public static CodebookParameters_type1_multiPanel_modes mode1() {
      return _mode1;
   }

   /**
    * Singleton accessor method for mode2.
    */
   public static CodebookParameters_type1_multiPanel_modes mode2() {
      return _mode2;
   }

   /**
    * Singleton accessor method for both.
    */
   public static CodebookParameters_type1_multiPanel_modes both() {
      return _both;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CodebookParameters_type1_multiPanel_modes.valueOf( CodebookParameters_type1_multiPanel_modes.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CodebookParameters_type1_multiPanel_modes valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mode1();
         case 1: return mode2();
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
      buffer.invokeCharacters (CodebookParameters_type1_multiPanel_modes.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* mode1 */break;
         case 1: ui = 1; /* mode2 */break;
         case 2: ui = 2; /* both */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mode1");
         case 1: return ("mode2");
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
