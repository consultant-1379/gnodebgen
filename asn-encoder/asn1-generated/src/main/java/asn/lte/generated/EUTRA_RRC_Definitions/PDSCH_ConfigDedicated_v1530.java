/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_ConfigDedicated_v1530 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDSCH-ConfigDedicated-v1530";
   }

   public PDSCH_ConfigDedicated_v1530_qcl_Operation_v1530 qcl_Operation_v1530 = null;  // optional
   public PDSCH_ConfigDedicated_v1530_tbs_IndexAlt3_r15 tbs_IndexAlt3_r15 = null;  // optional
   public PDSCH_ConfigDedicated_v1530_ce_CQI_AlternativeTableConfig_r15 ce_CQI_AlternativeTableConfig_r15 = null;  // optional
   public PDSCH_ConfigDedicated_v1530_ce_PDSCH_64QAM_Config_r15 ce_PDSCH_64QAM_Config_r15 = null;  // optional
   public PDSCH_ConfigDedicated_v1530_ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 = null;  // optional
   public PDSCH_ConfigDedicated_v1530_altMCS_TableScalingConfig_r15 altMCS_TableScalingConfig_r15 = null;  // optional

   public PDSCH_ConfigDedicated_v1530 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDSCH_ConfigDedicated_v1530 (
      PDSCH_ConfigDedicated_v1530_qcl_Operation_v1530 qcl_Operation_v1530_,
      PDSCH_ConfigDedicated_v1530_tbs_IndexAlt3_r15 tbs_IndexAlt3_r15_,
      PDSCH_ConfigDedicated_v1530_ce_CQI_AlternativeTableConfig_r15 ce_CQI_AlternativeTableConfig_r15_,
      PDSCH_ConfigDedicated_v1530_ce_PDSCH_64QAM_Config_r15 ce_PDSCH_64QAM_Config_r15_,
      PDSCH_ConfigDedicated_v1530_ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 ce_PDSCH_FlexibleStartPRB_AllocConfig_r15_,
      PDSCH_ConfigDedicated_v1530_altMCS_TableScalingConfig_r15 altMCS_TableScalingConfig_r15_
   ) {
      super();
      qcl_Operation_v1530 = qcl_Operation_v1530_;
      tbs_IndexAlt3_r15 = tbs_IndexAlt3_r15_;
      ce_CQI_AlternativeTableConfig_r15 = ce_CQI_AlternativeTableConfig_r15_;
      ce_PDSCH_64QAM_Config_r15 = ce_PDSCH_64QAM_Config_r15_;
      ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 = ce_PDSCH_FlexibleStartPRB_AllocConfig_r15_;
      altMCS_TableScalingConfig_r15 = altMCS_TableScalingConfig_r15_;
   }

   public void init () {
      qcl_Operation_v1530 = null;
      tbs_IndexAlt3_r15 = null;
      ce_CQI_AlternativeTableConfig_r15 = null;
      ce_PDSCH_64QAM_Config_r15 = null;
      ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 = null;
      altMCS_TableScalingConfig_r15 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return qcl_Operation_v1530;
         case 1: return tbs_IndexAlt3_r15;
         case 2: return ce_CQI_AlternativeTableConfig_r15;
         case 3: return ce_PDSCH_64QAM_Config_r15;
         case 4: return ce_PDSCH_FlexibleStartPRB_AllocConfig_r15;
         case 5: return altMCS_TableScalingConfig_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "qcl-Operation-v1530";
         case 1: return "tbs-IndexAlt3-r15";
         case 2: return "ce-CQI-AlternativeTableConfig-r15";
         case 3: return "ce-PDSCH-64QAM-Config-r15";
         case 4: return "ce-PDSCH-FlexibleStartPRB-AllocConfig-r15";
         case 5: return "altMCS-TableScalingConfig-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean qcl_Operation_v1530Present = buffer.decodeBit ("qcl_Operation_v1530Present");
      boolean tbs_IndexAlt3_r15Present = buffer.decodeBit ("tbs_IndexAlt3_r15Present");
      boolean ce_CQI_AlternativeTableConfig_r15Present = buffer.decodeBit ("ce_CQI_AlternativeTableConfig_r15Present");
      boolean ce_PDSCH_64QAM_Config_r15Present = buffer.decodeBit ("ce_PDSCH_64QAM_Config_r15Present");
      boolean ce_PDSCH_FlexibleStartPRB_AllocConfig_r15Present = buffer.decodeBit ("ce_PDSCH_FlexibleStartPRB_AllocConfig_r15Present");
      boolean altMCS_TableScalingConfig_r15Present = buffer.decodeBit ("altMCS_TableScalingConfig_r15Present");

      // decode qcl_Operation_v1530

      if (qcl_Operation_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("qcl_Operation_v1530", -1);

         int tval = PDSCH_ConfigDedicated_v1530_qcl_Operation_v1530.decodeEnumValue (buffer);
         qcl_Operation_v1530 = PDSCH_ConfigDedicated_v1530_qcl_Operation_v1530.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("qcl_Operation_v1530", -1);
      }
      else {
         qcl_Operation_v1530 = null;
      }

      // decode tbs_IndexAlt3_r15

      if (tbs_IndexAlt3_r15Present) {
         buffer.getContext().eventDispatcher.startElement("tbs_IndexAlt3_r15", -1);

         int tval = PDSCH_ConfigDedicated_v1530_tbs_IndexAlt3_r15.decodeEnumValue (buffer);
         tbs_IndexAlt3_r15 = PDSCH_ConfigDedicated_v1530_tbs_IndexAlt3_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("tbs_IndexAlt3_r15", -1);
      }
      else {
         tbs_IndexAlt3_r15 = null;
      }

      // decode ce_CQI_AlternativeTableConfig_r15

      if (ce_CQI_AlternativeTableConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ce_CQI_AlternativeTableConfig_r15", -1);

         int tval = PDSCH_ConfigDedicated_v1530_ce_CQI_AlternativeTableConfig_r15.decodeEnumValue (buffer);
         ce_CQI_AlternativeTableConfig_r15 = PDSCH_ConfigDedicated_v1530_ce_CQI_AlternativeTableConfig_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ce_CQI_AlternativeTableConfig_r15", -1);
      }
      else {
         ce_CQI_AlternativeTableConfig_r15 = null;
      }

      // decode ce_PDSCH_64QAM_Config_r15

      if (ce_PDSCH_64QAM_Config_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ce_PDSCH_64QAM_Config_r15", -1);

         int tval = PDSCH_ConfigDedicated_v1530_ce_PDSCH_64QAM_Config_r15.decodeEnumValue (buffer);
         ce_PDSCH_64QAM_Config_r15 = PDSCH_ConfigDedicated_v1530_ce_PDSCH_64QAM_Config_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ce_PDSCH_64QAM_Config_r15", -1);
      }
      else {
         ce_PDSCH_64QAM_Config_r15 = null;
      }

      // decode ce_PDSCH_FlexibleStartPRB_AllocConfig_r15

      if (ce_PDSCH_FlexibleStartPRB_AllocConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ce_PDSCH_FlexibleStartPRB_AllocConfig_r15", -1);

         int tval = PDSCH_ConfigDedicated_v1530_ce_PDSCH_FlexibleStartPRB_AllocConfig_r15.decodeEnumValue (buffer);
         ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 = PDSCH_ConfigDedicated_v1530_ce_PDSCH_FlexibleStartPRB_AllocConfig_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ce_PDSCH_FlexibleStartPRB_AllocConfig_r15", -1);
      }
      else {
         ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 = null;
      }

      // decode altMCS_TableScalingConfig_r15

      if (altMCS_TableScalingConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("altMCS_TableScalingConfig_r15", -1);

         int tval = PDSCH_ConfigDedicated_v1530_altMCS_TableScalingConfig_r15.decodeEnumValue (buffer);
         altMCS_TableScalingConfig_r15 = PDSCH_ConfigDedicated_v1530_altMCS_TableScalingConfig_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("altMCS_TableScalingConfig_r15", -1);
      }
      else {
         altMCS_TableScalingConfig_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (qcl_Operation_v1530 != null) qcl_Operation_v1530.print (_sb, "qcl_Operation_v1530", _level+1);
      if (tbs_IndexAlt3_r15 != null) tbs_IndexAlt3_r15.print (_sb, "tbs_IndexAlt3_r15", _level+1);
      if (ce_CQI_AlternativeTableConfig_r15 != null) ce_CQI_AlternativeTableConfig_r15.print (_sb, "ce_CQI_AlternativeTableConfig_r15", _level+1);
      if (ce_PDSCH_64QAM_Config_r15 != null) ce_PDSCH_64QAM_Config_r15.print (_sb, "ce_PDSCH_64QAM_Config_r15", _level+1);
      if (ce_PDSCH_FlexibleStartPRB_AllocConfig_r15 != null) ce_PDSCH_FlexibleStartPRB_AllocConfig_r15.print (_sb, "ce_PDSCH_FlexibleStartPRB_AllocConfig_r15", _level+1);
      if (altMCS_TableScalingConfig_r15 != null) altMCS_TableScalingConfig_r15.print (_sb, "altMCS_TableScalingConfig_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
