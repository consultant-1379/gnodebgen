/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _BW5 = 0;
   public static final int _BW20 = 1;

   // Singleton instances of PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14
   protected static final PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 _bw5 = new PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14(0);
   protected static final PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 _bw20 = new PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for bw5.
    */
   public static PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 bw5() {
      return _bw5;
   }

   /**
    * Singleton accessor method for bw20.
    */
   public static PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 bw20() {
      return _bw20;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14.valueOf( PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return bw5();
         case 1: return bw20();
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
      buffer.invokeCharacters (PhyLayerParameters_v1430_ce_PDSCH_PUSCH_MaxBandwidth_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("bw5");
         case 1: return ("bw20");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
