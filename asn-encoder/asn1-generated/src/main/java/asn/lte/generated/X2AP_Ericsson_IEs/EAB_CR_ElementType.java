/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_IEs;

import com.objsys.asn1j.runtime.*;

public class EAB_CR_ElementType extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-CR-ElementType";
   }

   // Integer constants for switch-case
   public static final int _TRAFFICLOADSTATUS = 0;

   // Singleton instances of EAB_CR_ElementType
   protected static final EAB_CR_ElementType _trafficLoadStatus = new EAB_CR_ElementType(0);
   private static EAB_CR_ElementType __undefined = new EAB_CR_ElementType(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected EAB_CR_ElementType (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for trafficLoadStatus.
    */
   public static EAB_CR_ElementType trafficLoadStatus() {
      return _trafficLoadStatus;
   }

   /** Undefined value. */
   protected static EAB_CR_ElementType __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return EAB_CR_ElementType.valueOf( EAB_CR_ElementType.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static EAB_CR_ElementType valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return trafficLoadStatus();
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
      buffer.invokeCharacters (EAB_CR_ElementType.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("trafficLoadStatus");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
