/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ALLSUBFRAMES = 0;
   public static final int _CSI_SUBFRAMESET1 = 1;
   public static final int _CSI_SUBFRAMESET2 = 2;
   public static final int _SPARE1 = 3;

   // Singleton instances of CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15
   protected static final CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 _allSubframes = new CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15(0);
   protected static final CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 _csi_SubframeSet1 = new CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15(1);
   protected static final CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 _csi_SubframeSet2 = new CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15(2);
   protected static final CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 _spare1 = new CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for allSubframes.
    */
   public static CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 allSubframes() {
      return _allSubframes;
   }

   /**
    * Singleton accessor method for csi_SubframeSet1.
    */
   public static CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 csi_SubframeSet1() {
      return _csi_SubframeSet1;
   }

   /**
    * Singleton accessor method for csi_SubframeSet2.
    */
   public static CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 csi_SubframeSet2() {
      return _csi_SubframeSet2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15.valueOf( CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return allSubframes();
         case 1: return csi_SubframeSet1();
         case 2: return csi_SubframeSet2();
         case 3: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CQI_ReportConfigSCell_r15_altCQI_Table_1024QAM_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("allSubframes");
         case 1: return ("csi-SubframeSet1");
         case 2: return ("csi-SubframeSet2");
         case 3: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
