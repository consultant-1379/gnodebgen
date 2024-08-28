/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CSI_ReportPeriodicityAndOffset reportSlotConfig;
   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH_pucch_CSI_ResourceList pucch_CSI_ResourceList;

   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH (
      CSI_ReportPeriodicityAndOffset reportSlotConfig_,
      CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH_pucch_CSI_ResourceList pucch_CSI_ResourceList_
   ) {
      super();
      reportSlotConfig = reportSlotConfig_;
      pucch_CSI_ResourceList = pucch_CSI_ResourceList_;
   }

   public void init () {
      reportSlotConfig = null;
      pucch_CSI_ResourceList = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportSlotConfig;
         case 1: return pucch_CSI_ResourceList;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportSlotConfig";
         case 1: return "pucch-CSI-ResourceList";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reportSlotConfig

      buffer.getContext().eventDispatcher.startElement("reportSlotConfig", -1);

      reportSlotConfig = new CSI_ReportPeriodicityAndOffset();
      reportSlotConfig.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("reportSlotConfig", -1);

      // decode pucch_CSI_ResourceList

      buffer.getContext().eventDispatcher.startElement("pucch_CSI_ResourceList", -1);

      pucch_CSI_ResourceList = new CSI_ReportConfig_reportConfigType_semiPersistentOnPUCCH_pucch_CSI_ResourceList();
      pucch_CSI_ResourceList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("pucch_CSI_ResourceList", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode reportSlotConfig

      if (reportSlotConfig != null) {
         buffer.getContext().eventDispatcher.startElement("reportSlotConfig", -1);

         reportSlotConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reportSlotConfig", -1);
      }
      else throw new Asn1MissingRequiredException ("reportSlotConfig");

      // encode pucch_CSI_ResourceList

      if (pucch_CSI_ResourceList != null) {
         buffer.getContext().eventDispatcher.startElement("pucch_CSI_ResourceList", -1);

         pucch_CSI_ResourceList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pucch_CSI_ResourceList", -1);
      }
      else throw new Asn1MissingRequiredException ("pucch_CSI_ResourceList");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportSlotConfig != null) reportSlotConfig.print (_sb, "reportSlotConfig", _level+1);
      if (pucch_CSI_ResourceList != null) pucch_CSI_ResourceList.print (_sb, "pucch_CSI_ResourceList", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
