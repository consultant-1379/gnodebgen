/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class SGNB_Addition_Trigger_Ind extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SGNB-Addition-Trigger-Ind";
   }

   // Integer constants for switch-case
   public static final int _SN_CHANGE = 0;
   public static final int _INTER_ENB_HO = 1;
   public static final int _INTRA_ENB_HO = 2;

   // Singleton instances of SGNB_Addition_Trigger_Ind
   protected static final SGNB_Addition_Trigger_Ind _sn_change = new SGNB_Addition_Trigger_Ind(0);
   protected static final SGNB_Addition_Trigger_Ind _inter_eNB_HO = new SGNB_Addition_Trigger_Ind(1);
   protected static final SGNB_Addition_Trigger_Ind _intra_eNB_HO = new SGNB_Addition_Trigger_Ind(2);
   private static SGNB_Addition_Trigger_Ind __undefined = new SGNB_Addition_Trigger_Ind(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected SGNB_Addition_Trigger_Ind (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sn_change.
    */
   public static SGNB_Addition_Trigger_Ind sn_change() {
      return _sn_change;
   }

   /**
    * Singleton accessor method for inter_eNB_HO.
    */
   public static SGNB_Addition_Trigger_Ind inter_eNB_HO() {
      return _inter_eNB_HO;
   }

   /**
    * Singleton accessor method for intra_eNB_HO.
    */
   public static SGNB_Addition_Trigger_Ind intra_eNB_HO() {
      return _intra_eNB_HO;
   }

   /** Undefined value. */
   protected static SGNB_Addition_Trigger_Ind __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SGNB_Addition_Trigger_Ind.valueOf( SGNB_Addition_Trigger_Ind.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SGNB_Addition_Trigger_Ind valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return sn_change();
         case 1: return inter_eNB_HO();
         case 2: return intra_eNB_HO();
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
      buffer.invokeCharacters (SGNB_Addition_Trigger_Ind.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sn-change");
         case 1: return ("inter-eNB-HO");
         case 2: return ("intra-eNB-HO");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
