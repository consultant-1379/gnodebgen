/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _TYPE1 = 0;
   public static final int _TYPE2 = 1;

   // Singleton instances of PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 _type1 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13(0);
   protected static final PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 _type2 = new PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for type1.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 type1() {
      return _type1;
   }

   /**
    * Singleton accessor method for type2.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 type2() {
      return _type2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13.valueOf( PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return type1();
         case 1: return type2();
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
      buffer.invokeCharacters (PDCP_Config_statusFeedback_r13_setup_statusPDU_TypeForPolling_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("type1");
         case 1: return ("type2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
