/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_Ericsson_IEs;

import com.objsys.asn1j.runtime.*;

public class EAB_UE_Type extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_Ericsson_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-UE-Type";
   }

   // Integer constants for switch-case
   public static final int _LOWCOVERAGEUE = 0;
   public static final int _CATMUE = 1;

   // Singleton instances of EAB_UE_Type
   protected static final EAB_UE_Type _lowCoverageUE = new EAB_UE_Type(0);
   protected static final EAB_UE_Type _catmUE = new EAB_UE_Type(1);
   private static EAB_UE_Type __undefined = new EAB_UE_Type(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected EAB_UE_Type (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for lowCoverageUE.
    */
   public static EAB_UE_Type lowCoverageUE() {
      return _lowCoverageUE;
   }

   /**
    * Singleton accessor method for catmUE.
    */
   public static EAB_UE_Type catmUE() {
      return _catmUE;
   }

   /** Undefined value. */
   protected static EAB_UE_Type __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EAB_UE_Type.valueOf( EAB_UE_Type.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EAB_UE_Type valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return lowCoverageUE();
         case 1: return catmUE();
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
            case 0: ret = 1; break;
            default: ret = 0x7fffffff; break;
         }
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (1);

         switch (ui) {
            case 0: ret =  0; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (EAB_UE_Type.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("lowCoverageUE");
         case 1: return ("catmUE");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
