/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class Subscription_Based_UE_DifferentiationInfo_trafficProfile extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SINGLE_PACKET = 0;
   public static final int _DUAL_PACKETS = 1;
   public static final int _MULTIPLE_PACKETS = 2;

   // Singleton instances of Subscription_Based_UE_DifferentiationInfo_trafficProfile
   protected static final Subscription_Based_UE_DifferentiationInfo_trafficProfile _single_packet = new Subscription_Based_UE_DifferentiationInfo_trafficProfile(0);
   protected static final Subscription_Based_UE_DifferentiationInfo_trafficProfile _dual_packets = new Subscription_Based_UE_DifferentiationInfo_trafficProfile(1);
   protected static final Subscription_Based_UE_DifferentiationInfo_trafficProfile _multiple_packets = new Subscription_Based_UE_DifferentiationInfo_trafficProfile(2);
   private static Subscription_Based_UE_DifferentiationInfo_trafficProfile __undefined = new Subscription_Based_UE_DifferentiationInfo_trafficProfile(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected Subscription_Based_UE_DifferentiationInfo_trafficProfile (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for single_packet.
    */
   public static Subscription_Based_UE_DifferentiationInfo_trafficProfile single_packet() {
      return _single_packet;
   }

   /**
    * Singleton accessor method for dual_packets.
    */
   public static Subscription_Based_UE_DifferentiationInfo_trafficProfile dual_packets() {
      return _dual_packets;
   }

   /**
    * Singleton accessor method for multiple_packets.
    */
   public static Subscription_Based_UE_DifferentiationInfo_trafficProfile multiple_packets() {
      return _multiple_packets;
   }

   /** Undefined value. */
   protected static Subscription_Based_UE_DifferentiationInfo_trafficProfile __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Subscription_Based_UE_DifferentiationInfo_trafficProfile.valueOf( Subscription_Based_UE_DifferentiationInfo_trafficProfile.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Subscription_Based_UE_DifferentiationInfo_trafficProfile valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return single_packet();
         case 1: return dual_packets();
         case 2: return multiple_packets();
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
         ui = (int) buffer.decodeConsWholeNumber (3);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (Subscription_Based_UE_DifferentiationInfo_trafficProfile.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("single-packet");
         case 1: return ("dual-packets");
         case 2: return ("multiple-packets");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
