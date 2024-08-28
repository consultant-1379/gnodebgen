/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RA_Prioritization_powerRampingStepHighPriority extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _DB0 = 0;
   public static final int _DB2 = 1;
   public static final int _DB4 = 2;
   public static final int _DB6 = 3;

   // Singleton instances of RA_Prioritization_powerRampingStepHighPriority
   protected static final RA_Prioritization_powerRampingStepHighPriority _dB0 = new RA_Prioritization_powerRampingStepHighPriority(0);
   protected static final RA_Prioritization_powerRampingStepHighPriority _dB2 = new RA_Prioritization_powerRampingStepHighPriority(1);
   protected static final RA_Prioritization_powerRampingStepHighPriority _dB4 = new RA_Prioritization_powerRampingStepHighPriority(2);
   protected static final RA_Prioritization_powerRampingStepHighPriority _dB6 = new RA_Prioritization_powerRampingStepHighPriority(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected RA_Prioritization_powerRampingStepHighPriority (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for dB0.
    */
   public static RA_Prioritization_powerRampingStepHighPriority dB0() {
      return _dB0;
   }

   /**
    * Singleton accessor method for dB2.
    */
   public static RA_Prioritization_powerRampingStepHighPriority dB2() {
      return _dB2;
   }

   /**
    * Singleton accessor method for dB4.
    */
   public static RA_Prioritization_powerRampingStepHighPriority dB4() {
      return _dB4;
   }

   /**
    * Singleton accessor method for dB6.
    */
   public static RA_Prioritization_powerRampingStepHighPriority dB6() {
      return _dB6;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RA_Prioritization_powerRampingStepHighPriority.valueOf( RA_Prioritization_powerRampingStepHighPriority.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RA_Prioritization_powerRampingStepHighPriority valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return dB0();
         case 1: return dB2();
         case 2: return dB4();
         case 3: return dB6();
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
      buffer.invokeCharacters (RA_Prioritization_powerRampingStepHighPriority.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* dB0 */break;
         case 1: ui = 1; /* dB2 */break;
         case 2: ui = 2; /* dB4 */break;
         case 3: ui = 3; /* dB6 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("dB0");
         case 1: return ("dB2");
         case 2: return ("dB4");
         case 3: return ("dB6");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
