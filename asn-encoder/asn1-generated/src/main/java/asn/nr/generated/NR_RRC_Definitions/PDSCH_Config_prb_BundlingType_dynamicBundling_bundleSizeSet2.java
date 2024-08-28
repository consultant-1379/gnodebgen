/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N4 = 0;
   public static final int _WIDEBAND = 1;

   // Singleton instances of PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2
   protected static final PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 _n4 = new PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2(0);
   protected static final PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 _wideband = new PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for wideband.
    */
   public static PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 wideband() {
      return _wideband;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2.valueOf( PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n4();
         case 1: return wideband();
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
      buffer.invokeCharacters (PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n4 */break;
         case 1: ui = 1; /* wideband */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 2);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n4");
         case 1: return ("wideband");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
