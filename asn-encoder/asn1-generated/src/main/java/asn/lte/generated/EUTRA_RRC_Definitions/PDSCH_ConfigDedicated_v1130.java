/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_ConfigDedicated_v1130 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDSCH-ConfigDedicated-v1130";
   }

   public DMRS_Config_r11 dmrs_ConfigPDSCH_r11;  // optional
   public PDSCH_ConfigDedicated_v1130_qcl_Operation qcl_Operation = null;  // optional
   public RE_MappingQCLConfigToReleaseList_r11 re_MappingQCLConfigToReleaseList_r11;  // optional
   public RE_MappingQCLConfigToAddModList_r11 re_MappingQCLConfigToAddModList_r11;  // optional

   public PDSCH_ConfigDedicated_v1130 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDSCH_ConfigDedicated_v1130 (
      DMRS_Config_r11 dmrs_ConfigPDSCH_r11_,
      PDSCH_ConfigDedicated_v1130_qcl_Operation qcl_Operation_,
      RE_MappingQCLConfigToReleaseList_r11 re_MappingQCLConfigToReleaseList_r11_,
      RE_MappingQCLConfigToAddModList_r11 re_MappingQCLConfigToAddModList_r11_
   ) {
      super();
      dmrs_ConfigPDSCH_r11 = dmrs_ConfigPDSCH_r11_;
      qcl_Operation = qcl_Operation_;
      re_MappingQCLConfigToReleaseList_r11 = re_MappingQCLConfigToReleaseList_r11_;
      re_MappingQCLConfigToAddModList_r11 = re_MappingQCLConfigToAddModList_r11_;
   }

   public void init () {
      dmrs_ConfigPDSCH_r11 = null;
      qcl_Operation = null;
      re_MappingQCLConfigToReleaseList_r11 = null;
      re_MappingQCLConfigToAddModList_r11 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dmrs_ConfigPDSCH_r11;
         case 1: return qcl_Operation;
         case 2: return re_MappingQCLConfigToReleaseList_r11;
         case 3: return re_MappingQCLConfigToAddModList_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dmrs-ConfigPDSCH-r11";
         case 1: return "qcl-Operation";
         case 2: return "re-MappingQCLConfigToReleaseList-r11";
         case 3: return "re-MappingQCLConfigToAddModList-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dmrs_ConfigPDSCH_r11Present = buffer.decodeBit ("dmrs_ConfigPDSCH_r11Present");
      boolean qcl_OperationPresent = buffer.decodeBit ("qcl_OperationPresent");
      boolean re_MappingQCLConfigToReleaseList_r11Present = buffer.decodeBit ("re_MappingQCLConfigToReleaseList_r11Present");
      boolean re_MappingQCLConfigToAddModList_r11Present = buffer.decodeBit ("re_MappingQCLConfigToAddModList_r11Present");

      // decode dmrs_ConfigPDSCH_r11

      if (dmrs_ConfigPDSCH_r11Present) {
         buffer.getContext().eventDispatcher.startElement("dmrs_ConfigPDSCH_r11", -1);

         dmrs_ConfigPDSCH_r11 = new DMRS_Config_r11();
         dmrs_ConfigPDSCH_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dmrs_ConfigPDSCH_r11", -1);
      }
      else {
         dmrs_ConfigPDSCH_r11 = null;
      }

      // decode qcl_Operation

      if (qcl_OperationPresent) {
         buffer.getContext().eventDispatcher.startElement("qcl_Operation", -1);

         int tval = PDSCH_ConfigDedicated_v1130_qcl_Operation.decodeEnumValue (buffer);
         qcl_Operation = PDSCH_ConfigDedicated_v1130_qcl_Operation.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("qcl_Operation", -1);
      }
      else {
         qcl_Operation = null;
      }

      // decode re_MappingQCLConfigToReleaseList_r11

      if (re_MappingQCLConfigToReleaseList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("re_MappingQCLConfigToReleaseList_r11", -1);

         re_MappingQCLConfigToReleaseList_r11 = new RE_MappingQCLConfigToReleaseList_r11();
         re_MappingQCLConfigToReleaseList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("re_MappingQCLConfigToReleaseList_r11", -1);
      }
      else {
         re_MappingQCLConfigToReleaseList_r11 = null;
      }

      // decode re_MappingQCLConfigToAddModList_r11

      if (re_MappingQCLConfigToAddModList_r11Present) {
         buffer.getContext().eventDispatcher.startElement("re_MappingQCLConfigToAddModList_r11", -1);

         re_MappingQCLConfigToAddModList_r11 = new RE_MappingQCLConfigToAddModList_r11();
         re_MappingQCLConfigToAddModList_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("re_MappingQCLConfigToAddModList_r11", -1);
      }
      else {
         re_MappingQCLConfigToAddModList_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dmrs_ConfigPDSCH_r11 != null) dmrs_ConfigPDSCH_r11.print (_sb, "dmrs_ConfigPDSCH_r11", _level+1);
      if (qcl_Operation != null) qcl_Operation.print (_sb, "qcl_Operation", _level+1);
      if (re_MappingQCLConfigToReleaseList_r11 != null) re_MappingQCLConfigToReleaseList_r11.print (_sb, "re_MappingQCLConfigToReleaseList_r11", _level+1);
      if (re_MappingQCLConfigToAddModList_r11 != null) re_MappingQCLConfigToAddModList_r11.print (_sb, "re_MappingQCLConfigToAddModList_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
