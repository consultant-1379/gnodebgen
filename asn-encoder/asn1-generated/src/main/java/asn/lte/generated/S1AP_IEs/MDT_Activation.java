/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class MDT_Activation extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MDT-Activation";
   }

   // Integer constants for switch-case
   public static final int _IMMEDIATE_MDT_ONLY = 0;
   public static final int _IMMEDIATE_MDT_AND_TRACE = 1;
   public static final int _LOGGED_MDT_ONLY = 2;
   public static final int _LOGGED_MBSFN_MDT = 3;

   // Singleton instances of MDT_Activation
   protected static final MDT_Activation _immediate_MDT_only = new MDT_Activation(0);
   protected static final MDT_Activation _immediate_MDT_and_Trace = new MDT_Activation(1);
   protected static final MDT_Activation _logged_MDT_only = new MDT_Activation(2);
   protected static final MDT_Activation _logged_MBSFN_MDT = new MDT_Activation(3);
   private static MDT_Activation __undefined = new MDT_Activation(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MDT_Activation (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for immediate_MDT_only.
    */
   public static MDT_Activation immediate_MDT_only() {
      return _immediate_MDT_only;
   }

   /**
    * Singleton accessor method for immediate_MDT_and_Trace.
    */
   public static MDT_Activation immediate_MDT_and_Trace() {
      return _immediate_MDT_and_Trace;
   }

   /**
    * Singleton accessor method for logged_MDT_only.
    */
   public static MDT_Activation logged_MDT_only() {
      return _logged_MDT_only;
   }

   /**
    * Singleton accessor method for logged_MBSFN_MDT.
    */
   public static MDT_Activation logged_MBSFN_MDT() {
      return _logged_MBSFN_MDT;
   }

   /** Undefined value. */
   protected static MDT_Activation __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MDT_Activation.valueOf( MDT_Activation.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MDT_Activation valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return immediate_MDT_only();
         case 1: return immediate_MDT_and_Trace();
         case 2: return logged_MDT_only();
         case 3: return logged_MBSFN_MDT();
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

         switch (ui) {
            case 0: ret = 3; break;
            default: ret = 0x7fffffff; break;
         }
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
      buffer.invokeCharacters (MDT_Activation.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("immediate-MDT-only");
         case 1: return ("immediate-MDT-and-Trace");
         case 2: return ("logged-MDT-only");
         case 3: return ("logged-MBSFN-MDT");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
