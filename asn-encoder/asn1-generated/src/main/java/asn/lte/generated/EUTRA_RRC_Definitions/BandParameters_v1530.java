/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandParameters_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandParameters-v1530";
   }

   public BandParameters_v1530_ue_TxAntennaSelection_SRS_1T4R_r15 ue_TxAntennaSelection_SRS_1T4R_r15 = null;  // optional
   public BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 = null;  // optional
   public BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 = null;  // optional
   public BandParameters_v1530_dl_1024QAM_r15 dl_1024QAM_r15 = null;  // optional
   public BandParameters_v1530_qcl_TypeC_Operation_r15 qcl_TypeC_Operation_r15 = null;  // optional
   public BandParameters_v1530_qcl_CRI_BasedCSI_Reporting_r15 qcl_CRI_BasedCSI_Reporting_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15 stti_SPT_BandParameters_r15;  // optional

   public BandParameters_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandParameters_v1530 (
      BandParameters_v1530_ue_TxAntennaSelection_SRS_1T4R_r15 ue_TxAntennaSelection_SRS_1T4R_r15_,
      BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15_,
      BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15_,
      BandParameters_v1530_dl_1024QAM_r15 dl_1024QAM_r15_,
      BandParameters_v1530_qcl_TypeC_Operation_r15 qcl_TypeC_Operation_r15_,
      BandParameters_v1530_qcl_CRI_BasedCSI_Reporting_r15 qcl_CRI_BasedCSI_Reporting_r15_,
      STTI_SPT_BandParameters_r15 stti_SPT_BandParameters_r15_
   ) {
      super();
      ue_TxAntennaSelection_SRS_1T4R_r15 = ue_TxAntennaSelection_SRS_1T4R_r15_;
      ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 = ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15_;
      ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 = ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15_;
      dl_1024QAM_r15 = dl_1024QAM_r15_;
      qcl_TypeC_Operation_r15 = qcl_TypeC_Operation_r15_;
      qcl_CRI_BasedCSI_Reporting_r15 = qcl_CRI_BasedCSI_Reporting_r15_;
      stti_SPT_BandParameters_r15 = stti_SPT_BandParameters_r15_;
   }

   public void init () {
      ue_TxAntennaSelection_SRS_1T4R_r15 = null;
      ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 = null;
      ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 = null;
      dl_1024QAM_r15 = null;
      qcl_TypeC_Operation_r15 = null;
      qcl_CRI_BasedCSI_Reporting_r15 = null;
      stti_SPT_BandParameters_r15 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_TxAntennaSelection_SRS_1T4R_r15;
         case 1: return ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15;
         case 2: return ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15;
         case 3: return dl_1024QAM_r15;
         case 4: return qcl_TypeC_Operation_r15;
         case 5: return qcl_CRI_BasedCSI_Reporting_r15;
         case 6: return stti_SPT_BandParameters_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-TxAntennaSelection-SRS-1T4R-r15";
         case 1: return "ue-TxAntennaSelection-SRS-2T4R-2Pairs-r15";
         case 2: return "ue-TxAntennaSelection-SRS-2T4R-3Pairs-r15";
         case 3: return "dl-1024QAM-r15";
         case 4: return "qcl-TypeC-Operation-r15";
         case 5: return "qcl-CRI-BasedCSI-Reporting-r15";
         case 6: return "stti-SPT-BandParameters-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_TxAntennaSelection_SRS_1T4R_r15Present = buffer.decodeBit ("ue_TxAntennaSelection_SRS_1T4R_r15Present");
      boolean ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15Present = buffer.decodeBit ("ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15Present");
      boolean ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15Present = buffer.decodeBit ("ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15Present");
      boolean dl_1024QAM_r15Present = buffer.decodeBit ("dl_1024QAM_r15Present");
      boolean qcl_TypeC_Operation_r15Present = buffer.decodeBit ("qcl_TypeC_Operation_r15Present");
      boolean qcl_CRI_BasedCSI_Reporting_r15Present = buffer.decodeBit ("qcl_CRI_BasedCSI_Reporting_r15Present");
      boolean stti_SPT_BandParameters_r15Present = buffer.decodeBit ("stti_SPT_BandParameters_r15Present");

      // decode ue_TxAntennaSelection_SRS_1T4R_r15

      if (ue_TxAntennaSelection_SRS_1T4R_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ue_TxAntennaSelection_SRS_1T4R_r15", -1);

         int tval = BandParameters_v1530_ue_TxAntennaSelection_SRS_1T4R_r15.decodeEnumValue (buffer);
         ue_TxAntennaSelection_SRS_1T4R_r15 = BandParameters_v1530_ue_TxAntennaSelection_SRS_1T4R_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_TxAntennaSelection_SRS_1T4R_r15", -1);
      }
      else {
         ue_TxAntennaSelection_SRS_1T4R_r15 = null;
      }

      // decode ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15

      if (ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15", -1);

         int tval = BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15.decodeEnumValue (buffer);
         ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 = BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15", -1);
      }
      else {
         ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 = null;
      }

      // decode ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15

      if (ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15", -1);

         int tval = BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15.decodeEnumValue (buffer);
         ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 = BandParameters_v1530_ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15", -1);
      }
      else {
         ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 = null;
      }

      // decode dl_1024QAM_r15

      if (dl_1024QAM_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_1024QAM_r15", -1);

         int tval = BandParameters_v1530_dl_1024QAM_r15.decodeEnumValue (buffer);
         dl_1024QAM_r15 = BandParameters_v1530_dl_1024QAM_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_1024QAM_r15", -1);
      }
      else {
         dl_1024QAM_r15 = null;
      }

      // decode qcl_TypeC_Operation_r15

      if (qcl_TypeC_Operation_r15Present) {
         buffer.getContext().eventDispatcher.startElement("qcl_TypeC_Operation_r15", -1);

         int tval = BandParameters_v1530_qcl_TypeC_Operation_r15.decodeEnumValue (buffer);
         qcl_TypeC_Operation_r15 = BandParameters_v1530_qcl_TypeC_Operation_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("qcl_TypeC_Operation_r15", -1);
      }
      else {
         qcl_TypeC_Operation_r15 = null;
      }

      // decode qcl_CRI_BasedCSI_Reporting_r15

      if (qcl_CRI_BasedCSI_Reporting_r15Present) {
         buffer.getContext().eventDispatcher.startElement("qcl_CRI_BasedCSI_Reporting_r15", -1);

         int tval = BandParameters_v1530_qcl_CRI_BasedCSI_Reporting_r15.decodeEnumValue (buffer);
         qcl_CRI_BasedCSI_Reporting_r15 = BandParameters_v1530_qcl_CRI_BasedCSI_Reporting_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("qcl_CRI_BasedCSI_Reporting_r15", -1);
      }
      else {
         qcl_CRI_BasedCSI_Reporting_r15 = null;
      }

      // decode stti_SPT_BandParameters_r15

      if (stti_SPT_BandParameters_r15Present) {
         buffer.getContext().eventDispatcher.startElement("stti_SPT_BandParameters_r15", -1);

         stti_SPT_BandParameters_r15 = new STTI_SPT_BandParameters_r15();
         stti_SPT_BandParameters_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("stti_SPT_BandParameters_r15", -1);
      }
      else {
         stti_SPT_BandParameters_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ue_TxAntennaSelection_SRS_1T4R_r15 != null) ue_TxAntennaSelection_SRS_1T4R_r15.print (_sb, "ue_TxAntennaSelection_SRS_1T4R_r15", _level+1);
      if (ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15 != null) ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15.print (_sb, "ue_TxAntennaSelection_SRS_2T4R_2Pairs_r15", _level+1);
      if (ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15 != null) ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15.print (_sb, "ue_TxAntennaSelection_SRS_2T4R_3Pairs_r15", _level+1);
      if (dl_1024QAM_r15 != null) dl_1024QAM_r15.print (_sb, "dl_1024QAM_r15", _level+1);
      if (qcl_TypeC_Operation_r15 != null) qcl_TypeC_Operation_r15.print (_sb, "qcl_TypeC_Operation_r15", _level+1);
      if (qcl_CRI_BasedCSI_Reporting_r15 != null) qcl_CRI_BasedCSI_Reporting_r15.print (_sb, "qcl_CRI_BasedCSI_Reporting_r15", _level+1);
      if (stti_SPT_BandParameters_r15 != null) stti_SPT_BandParameters_r15.print (_sb, "stti_SPT_BandParameters_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
