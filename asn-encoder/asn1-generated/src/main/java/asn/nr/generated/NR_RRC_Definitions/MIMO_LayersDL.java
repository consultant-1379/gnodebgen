/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_LayersDL extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MIMO-LayersDL";
   }

   // Integer constants for switch-case
   public static final int _TWOLAYERS = 0;
   public static final int _FOURLAYERS = 1;
   public static final int _EIGHTLAYERS = 2;

   // Singleton instances of MIMO_LayersDL
   protected static final MIMO_LayersDL _twoLayers = new MIMO_LayersDL(0);
   protected static final MIMO_LayersDL _fourLayers = new MIMO_LayersDL(1);
   protected static final MIMO_LayersDL _eightLayers = new MIMO_LayersDL(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected MIMO_LayersDL (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for twoLayers.
    */
   public static MIMO_LayersDL twoLayers() {
      return _twoLayers;
   }

   /**
    * Singleton accessor method for fourLayers.
    */
   public static MIMO_LayersDL fourLayers() {
      return _fourLayers;
   }

   /**
    * Singleton accessor method for eightLayers.
    */
   public static MIMO_LayersDL eightLayers() {
      return _eightLayers;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MIMO_LayersDL.valueOf( MIMO_LayersDL.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MIMO_LayersDL valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return twoLayers();
         case 1: return fourLayers();
         case 2: return eightLayers();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MIMO_LayersDL.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* twoLayers */break;
         case 1: ui = 1; /* fourLayers */break;
         case 2: ui = 2; /* eightLayers */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("twoLayers");
         case 1: return ("fourLayers");
         case 2: return ("eightLayers");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
