/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigInterRAT extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportConfigInterRAT";
   }

   public ReportConfigInterRAT_reportType reportType;

   public ReportConfigInterRAT () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigInterRAT (
      ReportConfigInterRAT_reportType reportType_
   ) {
      super();
      reportType = reportType_;
   }

   public void init () {
      reportType = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportType;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportType";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode reportType

      buffer.getContext().eventDispatcher.startElement("reportType", -1);

      reportType = new ReportConfigInterRAT_reportType();
      reportType.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("reportType", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportType != null) reportType.print (_sb, "reportType", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
