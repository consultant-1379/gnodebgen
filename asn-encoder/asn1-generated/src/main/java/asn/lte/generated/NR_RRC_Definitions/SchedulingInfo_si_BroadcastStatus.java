/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingInfo_si_BroadcastStatus extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _BROADCASTING = 0;
   public static final int _NOTBROADCASTING = 1;

   // Singleton instances of SchedulingInfo_si_BroadcastStatus
   protected static final SchedulingInfo_si_BroadcastStatus _broadcasting = new SchedulingInfo_si_BroadcastStatus(0);
   protected static final SchedulingInfo_si_BroadcastStatus _notBroadcasting = new SchedulingInfo_si_BroadcastStatus(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected SchedulingInfo_si_BroadcastStatus (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for broadcasting.
    */
   public static SchedulingInfo_si_BroadcastStatus broadcasting() {
      return _broadcasting;
   }

   /**
    * Singleton accessor method for notBroadcasting.
    */
   public static SchedulingInfo_si_BroadcastStatus notBroadcasting() {
      return _notBroadcasting;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SchedulingInfo_si_BroadcastStatus.valueOf( SchedulingInfo_si_BroadcastStatus.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SchedulingInfo_si_BroadcastStatus valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return broadcasting();
         case 1: return notBroadcasting();
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
      buffer.invokeCharacters (SchedulingInfo_si_BroadcastStatus.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("broadcasting");
         case 1: return ("notBroadcasting");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
