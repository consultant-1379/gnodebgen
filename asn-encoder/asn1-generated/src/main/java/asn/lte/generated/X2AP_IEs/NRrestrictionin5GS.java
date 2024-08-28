/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class NRrestrictionin5GS extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NRrestrictionin5GS";
   }

   // Integer constants for switch-case
   public static final int _NRRESTRICTEDIN5GS = 0;

   // Singleton instances of NRrestrictionin5GS
   protected static final NRrestrictionin5GS _nRrestrictedin5GS = new NRrestrictionin5GS(0);
   private static NRrestrictionin5GS __undefined = new NRrestrictionin5GS(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected NRrestrictionin5GS (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for nRrestrictedin5GS.
    */
   public static NRrestrictionin5GS nRrestrictedin5GS() {
      return _nRrestrictedin5GS;
   }

   /** Undefined value. */
   protected static NRrestrictionin5GS __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NRrestrictionin5GS.valueOf( NRrestrictionin5GS.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NRrestrictionin5GS valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return nRrestrictedin5GS();
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
         ui = (int) buffer.decodeConsWholeNumber (1);

         switch (ui) {
            case 0: ret =  0; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (NRrestrictionin5GS.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("nRrestrictedin5GS");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
