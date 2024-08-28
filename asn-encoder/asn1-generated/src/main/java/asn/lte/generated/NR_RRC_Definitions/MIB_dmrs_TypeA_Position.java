/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIB_dmrs_TypeA_Position extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _POS2 = 0;
   public static final int _POS3 = 1;

   // Singleton instances of MIB_dmrs_TypeA_Position
   protected static final MIB_dmrs_TypeA_Position _pos2 = new MIB_dmrs_TypeA_Position(0);
   protected static final MIB_dmrs_TypeA_Position _pos3 = new MIB_dmrs_TypeA_Position(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected MIB_dmrs_TypeA_Position (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for pos2.
    */
   public static MIB_dmrs_TypeA_Position pos2() {
      return _pos2;
   }

   /**
    * Singleton accessor method for pos3.
    */
   public static MIB_dmrs_TypeA_Position pos3() {
      return _pos3;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIB_dmrs_TypeA_Position.valueOf( MIB_dmrs_TypeA_Position.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIB_dmrs_TypeA_Position valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return pos2();
         case 1: return pos3();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MIB_dmrs_TypeA_Position.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("pos2");
         case 1: return ("pos3");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
