/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class NB_IoT_DefaultPagingDRX extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NB-IoT-DefaultPagingDRX";
   }

   // Integer constants for switch-case
   public static final int _V128 = 0;
   public static final int _V256 = 1;
   public static final int _V512 = 2;
   public static final int _V1024 = 3;

   // Singleton instances of NB_IoT_DefaultPagingDRX
   protected static final NB_IoT_DefaultPagingDRX _v128 = new NB_IoT_DefaultPagingDRX(0);
   protected static final NB_IoT_DefaultPagingDRX _v256 = new NB_IoT_DefaultPagingDRX(1);
   protected static final NB_IoT_DefaultPagingDRX _v512 = new NB_IoT_DefaultPagingDRX(2);
   protected static final NB_IoT_DefaultPagingDRX _v1024 = new NB_IoT_DefaultPagingDRX(3);
   private static NB_IoT_DefaultPagingDRX __undefined = new NB_IoT_DefaultPagingDRX(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected NB_IoT_DefaultPagingDRX (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for v128.
    */
   public static NB_IoT_DefaultPagingDRX v128() {
      return _v128;
   }

   /**
    * Singleton accessor method for v256.
    */
   public static NB_IoT_DefaultPagingDRX v256() {
      return _v256;
   }

   /**
    * Singleton accessor method for v512.
    */
   public static NB_IoT_DefaultPagingDRX v512() {
      return _v512;
   }

   /**
    * Singleton accessor method for v1024.
    */
   public static NB_IoT_DefaultPagingDRX v1024() {
      return _v1024;
   }

   /** Undefined value. */
   protected static NB_IoT_DefaultPagingDRX __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NB_IoT_DefaultPagingDRX.valueOf( NB_IoT_DefaultPagingDRX.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NB_IoT_DefaultPagingDRX valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return v128();
         case 1: return v256();
         case 2: return v512();
         case 3: return v1024();
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
      buffer.invokeCharacters (NB_IoT_DefaultPagingDRX.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("v128");
         case 1: return ("v256");
         case 2: return ("v512");
         case 3: return ("v1024");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
