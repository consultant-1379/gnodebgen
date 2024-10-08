/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SPUCCH = 0;
   public static final int _PUCCH = 1;

   // Singleton instances of LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup
   protected static final LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup _spucch = new LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup(0);
   protected static final LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup _pucch = new LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for spucch.
    */
   public static LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup spucch() {
      return _spucch;
   }

   /**
    * Singleton accessor method for pucch.
    */
   public static LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup pucch() {
      return _pucch;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup.valueOf( LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return spucch();
         case 1: return pucch();
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
      buffer.invokeCharacters (LogicalChannelConfig_logicalChannelSR_Restriction_r15_setup.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("spucch");
         case 1: return ("pucch");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
