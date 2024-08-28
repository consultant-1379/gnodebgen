/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat1_2OFDM_syms_r16 supportReportFormat1_2OFDM_syms_r16 = null;  // optional
   public MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat4_14OFDM_syms_r16 supportReportFormat4_14OFDM_syms_r16 = null;  // optional

   public MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16 (
      MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat1_2OFDM_syms_r16 supportReportFormat1_2OFDM_syms_r16_,
      MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat4_14OFDM_syms_r16 supportReportFormat4_14OFDM_syms_r16_
   ) {
      super();
      supportReportFormat1_2OFDM_syms_r16 = supportReportFormat1_2OFDM_syms_r16_;
      supportReportFormat4_14OFDM_syms_r16 = supportReportFormat4_14OFDM_syms_r16_;
   }

   public void init () {
      supportReportFormat1_2OFDM_syms_r16 = null;
      supportReportFormat4_14OFDM_syms_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportReportFormat1_2OFDM_syms_r16;
         case 1: return supportReportFormat4_14OFDM_syms_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportReportFormat1-2OFDM-syms-r16";
         case 1: return "supportReportFormat4-14OFDM-syms-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportReportFormat1_2OFDM_syms_r16Present = buffer.decodeBit ("supportReportFormat1_2OFDM_syms_r16Present");
      boolean supportReportFormat4_14OFDM_syms_r16Present = buffer.decodeBit ("supportReportFormat4_14OFDM_syms_r16Present");

      // decode supportReportFormat1_2OFDM_syms_r16

      if (supportReportFormat1_2OFDM_syms_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportReportFormat1_2OFDM_syms_r16", -1);

         int tval = MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat1_2OFDM_syms_r16.decodeEnumValue (buffer);
         supportReportFormat1_2OFDM_syms_r16 = MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat1_2OFDM_syms_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportReportFormat1_2OFDM_syms_r16", -1);
      }
      else {
         supportReportFormat1_2OFDM_syms_r16 = null;
      }

      // decode supportReportFormat4_14OFDM_syms_r16

      if (supportReportFormat4_14OFDM_syms_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportReportFormat4_14OFDM_syms_r16", -1);

         int tval = MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat4_14OFDM_syms_r16.decodeEnumValue (buffer);
         supportReportFormat4_14OFDM_syms_r16 = MIMO_ParametersPerBand_semi_PersistentL1_SINR_Report_PUCCH_r16_supportReportFormat4_14OFDM_syms_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportReportFormat4_14OFDM_syms_r16", -1);
      }
      else {
         supportReportFormat4_14OFDM_syms_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportReportFormat1_2OFDM_syms_r16 != null) supportReportFormat1_2OFDM_syms_r16.print (_sb, "supportReportFormat1_2OFDM_syms_r16", _level+1);
      if (supportReportFormat4_14OFDM_syms_r16 != null) supportReportFormat4_14OFDM_syms_r16.print (_sb, "supportReportFormat4_14OFDM_syms_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
