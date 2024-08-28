/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class RLCMode extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RLCMode";
   }

   // Integer constants for switch-case
   public static final int _RLC_AM = 0;
   public static final int _RLC_UM_BIDIRECTIONAL = 1;
   public static final int _RLC_UM_UNIDIRECTIONAL_UL = 2;
   public static final int _RLC_UM_UNIDIRECTIONAL_DL = 3;

   // Singleton instances of RLCMode
   protected static final RLCMode _rlc_am = new RLCMode(0);
   protected static final RLCMode _rlc_um_bidirectional = new RLCMode(1);
   protected static final RLCMode _rlc_um_unidirectional_ul = new RLCMode(2);
   protected static final RLCMode _rlc_um_unidirectional_dl = new RLCMode(3);
   private static RLCMode __undefined = new RLCMode(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected RLCMode (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rlc_am.
    */
   public static RLCMode rlc_am() {
      return _rlc_am;
   }

   /**
    * Singleton accessor method for rlc_um_bidirectional.
    */
   public static RLCMode rlc_um_bidirectional() {
      return _rlc_um_bidirectional;
   }

   /**
    * Singleton accessor method for rlc_um_unidirectional_ul.
    */
   public static RLCMode rlc_um_unidirectional_ul() {
      return _rlc_um_unidirectional_ul;
   }

   /**
    * Singleton accessor method for rlc_um_unidirectional_dl.
    */
   public static RLCMode rlc_um_unidirectional_dl() {
      return _rlc_um_unidirectional_dl;
   }

   /** Undefined value. */
   protected static RLCMode __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RLCMode.valueOf( RLCMode.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RLCMode valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return rlc_am();
         case 1: return rlc_um_bidirectional();
         case 2: return rlc_um_unidirectional_ul();
         case 3: return rlc_um_unidirectional_dl();
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
         ui = (int) buffer.decodeConsWholeNumber (4);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (RLCMode.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rlc-am");
         case 1: return ("rlc-um-bidirectional");
         case 2: return ("rlc-um-unidirectional-ul");
         case 3: return ("rlc-um-unidirectional-dl");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
