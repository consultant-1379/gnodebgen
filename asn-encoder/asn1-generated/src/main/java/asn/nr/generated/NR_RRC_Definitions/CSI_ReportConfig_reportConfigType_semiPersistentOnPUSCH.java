/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotConfig reportSlotConfig = null;
   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotOffsetList reportSlotOffsetList;
   public P0_PUSCH_AlphaSetId p0alpha;

   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH (
      CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotConfig reportSlotConfig_,
      CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotOffsetList reportSlotOffsetList_,
      P0_PUSCH_AlphaSetId p0alpha_
   ) {
      super();
      reportSlotConfig = reportSlotConfig_;
      reportSlotOffsetList = reportSlotOffsetList_;
      p0alpha = p0alpha_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH (CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotConfig reportSlotConfig_,
      CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotOffsetList reportSlotOffsetList_,
      long p0alpha_
   ) {
      super();
      reportSlotConfig = reportSlotConfig_;
      reportSlotOffsetList = reportSlotOffsetList_;
      p0alpha = new P0_PUSCH_AlphaSetId (p0alpha_);
   }

   public void init () {
      reportSlotConfig = null;
      reportSlotOffsetList = null;
      p0alpha = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportSlotConfig;
         case 1: return reportSlotOffsetList;
         case 2: return p0alpha;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportSlotConfig";
         case 1: return "reportSlotOffsetList";
         case 2: return "p0alpha";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reportSlotConfig

      buffer.getContext().eventDispatcher.startElement("reportSlotConfig", -1);

      {
         int tval = CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotConfig.decodeEnumValue (buffer);
         reportSlotConfig = CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotConfig.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reportSlotConfig", -1);

      // decode reportSlotOffsetList

      buffer.getContext().eventDispatcher.startElement("reportSlotOffsetList", -1);

      reportSlotOffsetList = new CSI_ReportConfig_reportConfigType_semiPersistentOnPUSCH_reportSlotOffsetList();
      reportSlotOffsetList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("reportSlotOffsetList", -1);

      // decode p0alpha

      buffer.getContext().eventDispatcher.startElement("p0alpha", -1);

      p0alpha = new P0_PUSCH_AlphaSetId();
      p0alpha.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("p0alpha", -1);

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

      // encode reportSlotOffsetList

      if (reportSlotOffsetList != null) {
         buffer.getContext().eventDispatcher.startElement("reportSlotOffsetList", -1);

         reportSlotOffsetList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reportSlotOffsetList", -1);
      }
      else throw new Asn1MissingRequiredException ("reportSlotOffsetList");

      // encode p0alpha

      if (p0alpha != null) {
         buffer.getContext().eventDispatcher.startElement("p0alpha", -1);

         p0alpha.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("p0alpha", -1);
      }
      else throw new Asn1MissingRequiredException ("p0alpha");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportSlotConfig != null) reportSlotConfig.print (_sb, "reportSlotConfig", _level+1);
      if (reportSlotOffsetList != null) reportSlotOffsetList.print (_sb, "reportSlotOffsetList", _level+1);
      if (p0alpha != null) p0alpha.print (_sb, "p0alpha", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
