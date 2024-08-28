/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportFramework extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-ReportFramework";
   }

   public Asn1Integer maxNumberPeriodicCSI_PerBWP_ForCSI_Report;
   public Asn1Integer maxNumberAperiodicCSI_PerBWP_ForCSI_Report;
   public Asn1Integer maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report;
   public Asn1Integer maxNumberPeriodicCSI_PerBWP_ForBeamReport;
   public Asn1Integer maxNumberAperiodicCSI_PerBWP_ForBeamReport;
   public CSI_ReportFramework_maxNumberAperiodicCSI_triggeringStatePerCC maxNumberAperiodicCSI_triggeringStatePerCC = null;
   public Asn1Integer maxNumberSemiPersistentCSI_PerBWP_ForBeamReport;
   public Asn1Integer simultaneousCSI_ReportsPerCC;

   public CSI_ReportFramework () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_ReportFramework (
      Asn1Integer maxNumberPeriodicCSI_PerBWP_ForCSI_Report_,
      Asn1Integer maxNumberAperiodicCSI_PerBWP_ForCSI_Report_,
      Asn1Integer maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report_,
      Asn1Integer maxNumberPeriodicCSI_PerBWP_ForBeamReport_,
      Asn1Integer maxNumberAperiodicCSI_PerBWP_ForBeamReport_,
      CSI_ReportFramework_maxNumberAperiodicCSI_triggeringStatePerCC maxNumberAperiodicCSI_triggeringStatePerCC_,
      Asn1Integer maxNumberSemiPersistentCSI_PerBWP_ForBeamReport_,
      Asn1Integer simultaneousCSI_ReportsPerCC_
   ) {
      super();
      maxNumberPeriodicCSI_PerBWP_ForCSI_Report = maxNumberPeriodicCSI_PerBWP_ForCSI_Report_;
      maxNumberAperiodicCSI_PerBWP_ForCSI_Report = maxNumberAperiodicCSI_PerBWP_ForCSI_Report_;
      maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report = maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report_;
      maxNumberPeriodicCSI_PerBWP_ForBeamReport = maxNumberPeriodicCSI_PerBWP_ForBeamReport_;
      maxNumberAperiodicCSI_PerBWP_ForBeamReport = maxNumberAperiodicCSI_PerBWP_ForBeamReport_;
      maxNumberAperiodicCSI_triggeringStatePerCC = maxNumberAperiodicCSI_triggeringStatePerCC_;
      maxNumberSemiPersistentCSI_PerBWP_ForBeamReport = maxNumberSemiPersistentCSI_PerBWP_ForBeamReport_;
      simultaneousCSI_ReportsPerCC = simultaneousCSI_ReportsPerCC_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_ReportFramework (long maxNumberPeriodicCSI_PerBWP_ForCSI_Report_,
      long maxNumberAperiodicCSI_PerBWP_ForCSI_Report_,
      long maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report_,
      long maxNumberPeriodicCSI_PerBWP_ForBeamReport_,
      long maxNumberAperiodicCSI_PerBWP_ForBeamReport_,
      CSI_ReportFramework_maxNumberAperiodicCSI_triggeringStatePerCC maxNumberAperiodicCSI_triggeringStatePerCC_,
      long maxNumberSemiPersistentCSI_PerBWP_ForBeamReport_,
      long simultaneousCSI_ReportsPerCC_
   ) {
      super();
      maxNumberPeriodicCSI_PerBWP_ForCSI_Report = new Asn1Integer (maxNumberPeriodicCSI_PerBWP_ForCSI_Report_);
      maxNumberAperiodicCSI_PerBWP_ForCSI_Report = new Asn1Integer (maxNumberAperiodicCSI_PerBWP_ForCSI_Report_);
      maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report = new Asn1Integer (maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report_);
      maxNumberPeriodicCSI_PerBWP_ForBeamReport = new Asn1Integer (maxNumberPeriodicCSI_PerBWP_ForBeamReport_);
      maxNumberAperiodicCSI_PerBWP_ForBeamReport = new Asn1Integer (maxNumberAperiodicCSI_PerBWP_ForBeamReport_);
      maxNumberAperiodicCSI_triggeringStatePerCC = maxNumberAperiodicCSI_triggeringStatePerCC_;
      maxNumberSemiPersistentCSI_PerBWP_ForBeamReport = new Asn1Integer (maxNumberSemiPersistentCSI_PerBWP_ForBeamReport_);
      simultaneousCSI_ReportsPerCC = new Asn1Integer (simultaneousCSI_ReportsPerCC_);
   }

   public void init () {
      maxNumberPeriodicCSI_PerBWP_ForCSI_Report = null;
      maxNumberAperiodicCSI_PerBWP_ForCSI_Report = null;
      maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report = null;
      maxNumberPeriodicCSI_PerBWP_ForBeamReport = null;
      maxNumberAperiodicCSI_PerBWP_ForBeamReport = null;
      maxNumberAperiodicCSI_triggeringStatePerCC = null;
      maxNumberSemiPersistentCSI_PerBWP_ForBeamReport = null;
      simultaneousCSI_ReportsPerCC = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return maxNumberPeriodicCSI_PerBWP_ForCSI_Report;
         case 1: return maxNumberAperiodicCSI_PerBWP_ForCSI_Report;
         case 2: return maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report;
         case 3: return maxNumberPeriodicCSI_PerBWP_ForBeamReport;
         case 4: return maxNumberAperiodicCSI_PerBWP_ForBeamReport;
         case 5: return maxNumberAperiodicCSI_triggeringStatePerCC;
         case 6: return maxNumberSemiPersistentCSI_PerBWP_ForBeamReport;
         case 7: return simultaneousCSI_ReportsPerCC;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "maxNumberPeriodicCSI-PerBWP-ForCSI-Report";
         case 1: return "maxNumberAperiodicCSI-PerBWP-ForCSI-Report";
         case 2: return "maxNumberSemiPersistentCSI-PerBWP-ForCSI-Report";
         case 3: return "maxNumberPeriodicCSI-PerBWP-ForBeamReport";
         case 4: return "maxNumberAperiodicCSI-PerBWP-ForBeamReport";
         case 5: return "maxNumberAperiodicCSI-triggeringStatePerCC";
         case 6: return "maxNumberSemiPersistentCSI-PerBWP-ForBeamReport";
         case 7: return "simultaneousCSI-ReportsPerCC";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode maxNumberPeriodicCSI_PerBWP_ForCSI_Report

      buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicCSI_PerBWP_ForCSI_Report", -1);

      maxNumberPeriodicCSI_PerBWP_ForCSI_Report = new Asn1Integer();
      maxNumberPeriodicCSI_PerBWP_ForCSI_Report.decode (buffer, 1, 4);

      buffer.invokeCharacters(maxNumberPeriodicCSI_PerBWP_ForCSI_Report.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicCSI_PerBWP_ForCSI_Report", -1);

      // decode maxNumberAperiodicCSI_PerBWP_ForCSI_Report

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_PerBWP_ForCSI_Report", -1);

      maxNumberAperiodicCSI_PerBWP_ForCSI_Report = new Asn1Integer();
      maxNumberAperiodicCSI_PerBWP_ForCSI_Report.decode (buffer, 1, 4);

      buffer.invokeCharacters(maxNumberAperiodicCSI_PerBWP_ForCSI_Report.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_PerBWP_ForCSI_Report", -1);

      // decode maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report

      buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report", -1);

      maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report = new Asn1Integer();
      maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report.decode (buffer, 0, 4);

      buffer.invokeCharacters(maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report", -1);

      // decode maxNumberPeriodicCSI_PerBWP_ForBeamReport

      buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicCSI_PerBWP_ForBeamReport", -1);

      maxNumberPeriodicCSI_PerBWP_ForBeamReport = new Asn1Integer();
      maxNumberPeriodicCSI_PerBWP_ForBeamReport.decode (buffer, 1, 4);

      buffer.invokeCharacters(maxNumberPeriodicCSI_PerBWP_ForBeamReport.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicCSI_PerBWP_ForBeamReport", -1);

      // decode maxNumberAperiodicCSI_PerBWP_ForBeamReport

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_PerBWP_ForBeamReport", -1);

      maxNumberAperiodicCSI_PerBWP_ForBeamReport = new Asn1Integer();
      maxNumberAperiodicCSI_PerBWP_ForBeamReport.decode (buffer, 1, 4);

      buffer.invokeCharacters(maxNumberAperiodicCSI_PerBWP_ForBeamReport.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_PerBWP_ForBeamReport", -1);

      // decode maxNumberAperiodicCSI_triggeringStatePerCC

      buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_triggeringStatePerCC", -1);

      {
         int tval = CSI_ReportFramework_maxNumberAperiodicCSI_triggeringStatePerCC.decodeEnumValue (buffer);
         maxNumberAperiodicCSI_triggeringStatePerCC = CSI_ReportFramework_maxNumberAperiodicCSI_triggeringStatePerCC.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_triggeringStatePerCC", -1);

      // decode maxNumberSemiPersistentCSI_PerBWP_ForBeamReport

      buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentCSI_PerBWP_ForBeamReport", -1);

      maxNumberSemiPersistentCSI_PerBWP_ForBeamReport = new Asn1Integer();
      maxNumberSemiPersistentCSI_PerBWP_ForBeamReport.decode (buffer, 0, 4);

      buffer.invokeCharacters(maxNumberSemiPersistentCSI_PerBWP_ForBeamReport.toString());
      buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentCSI_PerBWP_ForBeamReport", -1);

      // decode simultaneousCSI_ReportsPerCC

      buffer.getContext().eventDispatcher.startElement("simultaneousCSI_ReportsPerCC", -1);

      simultaneousCSI_ReportsPerCC = new Asn1Integer();
      simultaneousCSI_ReportsPerCC.decode (buffer, 1, 8);

      buffer.invokeCharacters(simultaneousCSI_ReportsPerCC.toString());
      buffer.getContext().eventDispatcher.endElement("simultaneousCSI_ReportsPerCC", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode maxNumberPeriodicCSI_PerBWP_ForCSI_Report

      if (maxNumberPeriodicCSI_PerBWP_ForCSI_Report != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicCSI_PerBWP_ForCSI_Report", -1);

         maxNumberPeriodicCSI_PerBWP_ForCSI_Report.encode (buffer, 1, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicCSI_PerBWP_ForCSI_Report", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberPeriodicCSI_PerBWP_ForCSI_Report");

      // encode maxNumberAperiodicCSI_PerBWP_ForCSI_Report

      if (maxNumberAperiodicCSI_PerBWP_ForCSI_Report != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_PerBWP_ForCSI_Report", -1);

         maxNumberAperiodicCSI_PerBWP_ForCSI_Report.encode (buffer, 1, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_PerBWP_ForCSI_Report", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberAperiodicCSI_PerBWP_ForCSI_Report");

      // encode maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report

      if (maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report", -1);

         maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report.encode (buffer, 0, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report");

      // encode maxNumberPeriodicCSI_PerBWP_ForBeamReport

      if (maxNumberPeriodicCSI_PerBWP_ForBeamReport != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberPeriodicCSI_PerBWP_ForBeamReport", -1);

         maxNumberPeriodicCSI_PerBWP_ForBeamReport.encode (buffer, 1, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberPeriodicCSI_PerBWP_ForBeamReport", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberPeriodicCSI_PerBWP_ForBeamReport");

      // encode maxNumberAperiodicCSI_PerBWP_ForBeamReport

      if (maxNumberAperiodicCSI_PerBWP_ForBeamReport != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_PerBWP_ForBeamReport", -1);

         maxNumberAperiodicCSI_PerBWP_ForBeamReport.encode (buffer, 1, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_PerBWP_ForBeamReport", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberAperiodicCSI_PerBWP_ForBeamReport");

      // encode maxNumberAperiodicCSI_triggeringStatePerCC

      if (maxNumberAperiodicCSI_triggeringStatePerCC != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberAperiodicCSI_triggeringStatePerCC", -1);

         maxNumberAperiodicCSI_triggeringStatePerCC.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberAperiodicCSI_triggeringStatePerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberAperiodicCSI_triggeringStatePerCC");

      // encode maxNumberSemiPersistentCSI_PerBWP_ForBeamReport

      if (maxNumberSemiPersistentCSI_PerBWP_ForBeamReport != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberSemiPersistentCSI_PerBWP_ForBeamReport", -1);

         maxNumberSemiPersistentCSI_PerBWP_ForBeamReport.encode (buffer, 0, 4);

         buffer.getContext().eventDispatcher.endElement("maxNumberSemiPersistentCSI_PerBWP_ForBeamReport", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberSemiPersistentCSI_PerBWP_ForBeamReport");

      // encode simultaneousCSI_ReportsPerCC

      if (simultaneousCSI_ReportsPerCC != null) {
         buffer.getContext().eventDispatcher.startElement("simultaneousCSI_ReportsPerCC", -1);

         simultaneousCSI_ReportsPerCC.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("simultaneousCSI_ReportsPerCC", -1);
      }
      else throw new Asn1MissingRequiredException ("simultaneousCSI_ReportsPerCC");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (maxNumberPeriodicCSI_PerBWP_ForCSI_Report != null) maxNumberPeriodicCSI_PerBWP_ForCSI_Report.print (_sb, "maxNumberPeriodicCSI_PerBWP_ForCSI_Report", _level+1);
      if (maxNumberAperiodicCSI_PerBWP_ForCSI_Report != null) maxNumberAperiodicCSI_PerBWP_ForCSI_Report.print (_sb, "maxNumberAperiodicCSI_PerBWP_ForCSI_Report", _level+1);
      if (maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report != null) maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report.print (_sb, "maxNumberSemiPersistentCSI_PerBWP_ForCSI_Report", _level+1);
      if (maxNumberPeriodicCSI_PerBWP_ForBeamReport != null) maxNumberPeriodicCSI_PerBWP_ForBeamReport.print (_sb, "maxNumberPeriodicCSI_PerBWP_ForBeamReport", _level+1);
      if (maxNumberAperiodicCSI_PerBWP_ForBeamReport != null) maxNumberAperiodicCSI_PerBWP_ForBeamReport.print (_sb, "maxNumberAperiodicCSI_PerBWP_ForBeamReport", _level+1);
      if (maxNumberAperiodicCSI_triggeringStatePerCC != null) maxNumberAperiodicCSI_triggeringStatePerCC.print (_sb, "maxNumberAperiodicCSI_triggeringStatePerCC", _level+1);
      if (maxNumberSemiPersistentCSI_PerBWP_ForBeamReport != null) maxNumberSemiPersistentCSI_PerBWP_ForBeamReport.print (_sb, "maxNumberSemiPersistentCSI_PerBWP_ForBeamReport", _level+1);
      if (simultaneousCSI_ReportsPerCC != null) simultaneousCSI_ReportsPerCC.print (_sb, "simultaneousCSI_ReportsPerCC", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
