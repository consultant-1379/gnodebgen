/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigToAddMod extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportConfigToAddMod";
   }

   public ReportConfigId reportConfigId;
   public ReportConfigToAddMod_reportConfig reportConfig;

   public ReportConfigToAddMod () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigToAddMod (
      ReportConfigId reportConfigId_,
      ReportConfigToAddMod_reportConfig reportConfig_
   ) {
      super();
      reportConfigId = reportConfigId_;
      reportConfig = reportConfig_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportConfigToAddMod (long reportConfigId_,
      ReportConfigToAddMod_reportConfig reportConfig_
   ) {
      super();
      reportConfigId = new ReportConfigId (reportConfigId_);
      reportConfig = reportConfig_;
   }

   public void init () {
      reportConfigId = null;
      reportConfig = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportConfigId;
         case 1: return reportConfig;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportConfigId";
         case 1: return "reportConfig";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reportConfigId

      buffer.getContext().eventDispatcher.startElement("reportConfigId", -1);

      reportConfigId = new ReportConfigId();
      reportConfigId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("reportConfigId", -1);

      // decode reportConfig

      buffer.getContext().eventDispatcher.startElement("reportConfig", -1);

      reportConfig = new ReportConfigToAddMod_reportConfig();
      reportConfig.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("reportConfig", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportConfigId != null) reportConfigId.print (_sb, "reportConfigId", _level+1);
      if (reportConfig != null) reportConfig.print (_sb, "reportConfig", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
