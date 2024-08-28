/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SUPPORTED = 0;

   // Singleton instances of Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat
   protected static final Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat _supported = new Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat(0);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for supported.
    */
   public static Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat supported() {
      return _supported;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat.valueOf( Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return supported();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (1);

      switch (ui) {
         case 0: ret =  0; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (Phy_ParametersFRX_Diff_onePUCCH_LongAndShortFormat.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("supported");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
