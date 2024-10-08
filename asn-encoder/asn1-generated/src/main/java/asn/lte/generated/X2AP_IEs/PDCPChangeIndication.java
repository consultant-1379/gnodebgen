/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class PDCPChangeIndication extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCPChangeIndication";
   }

   // Integer constants for switch-case
   public static final int _S_KGNB_UPDATE_REQUIRED = 0;
   public static final int _PDCP_DATA_RECOVERY_REQUIRED = 1;

   // Singleton instances of PDCPChangeIndication
   protected static final PDCPChangeIndication _s_KgNB_update_required = new PDCPChangeIndication(0);
   protected static final PDCPChangeIndication _pDCP_data_recovery_required = new PDCPChangeIndication(1);
   private static PDCPChangeIndication __undefined = new PDCPChangeIndication(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PDCPChangeIndication (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for s_KgNB_update_required.
    */
   public static PDCPChangeIndication s_KgNB_update_required() {
      return _s_KgNB_update_required;
   }

   /**
    * Singleton accessor method for pDCP_data_recovery_required.
    */
   public static PDCPChangeIndication pDCP_data_recovery_required() {
      return _pDCP_data_recovery_required;
   }

   /** Undefined value. */
   protected static PDCPChangeIndication __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCPChangeIndication.valueOf( PDCPChangeIndication.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCPChangeIndication valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return s_KgNB_update_required();
         case 1: return pDCP_data_recovery_required();
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
         ui = (int) buffer.decodeConsWholeNumber (2);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PDCPChangeIndication.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("s-KgNB-update-required");
         case 1: return ("pDCP-data-recovery-required");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
