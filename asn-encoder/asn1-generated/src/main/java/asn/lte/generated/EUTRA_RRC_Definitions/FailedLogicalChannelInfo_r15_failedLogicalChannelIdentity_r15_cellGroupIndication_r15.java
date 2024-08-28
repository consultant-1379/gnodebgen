/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MN = 0;
   public static final int _SN = 1;

   // Singleton instances of FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15
   protected static final FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 _mn = new FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15(0);
   protected static final FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 _sn = new FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mn.
    */
   public static FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 mn() {
      return _mn;
   }

   /**
    * Singleton accessor method for sn.
    */
   public static FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 sn() {
      return _sn;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15.valueOf( FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mn();
         case 1: return sn();
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
      buffer.invokeCharacters (FailedLogicalChannelInfo_r15_failedLogicalChannelIdentity_r15_cellGroupIndication_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mn");
         case 1: return ("sn");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
