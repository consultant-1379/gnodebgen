/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.ARFCN_ValueEUTRA;
import asn.lte.generated.NR_RRC_Definitions.EUTRA_PhysCellId;
import asn.lte.generated.NR_RRC_Definitions.CGI_InfoEUTRA;

public class CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ARFCN_ValueEUTRA eutraFrequency;
   public EUTRA_PhysCellId cellForWhichToReportCGI_EUTRA;
   public CGI_InfoEUTRA cgi_InfoEUTRA;

   public CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA (
      ARFCN_ValueEUTRA eutraFrequency_,
      EUTRA_PhysCellId cellForWhichToReportCGI_EUTRA_,
      CGI_InfoEUTRA cgi_InfoEUTRA_
   ) {
      super();
      eutraFrequency = eutraFrequency_;
      cellForWhichToReportCGI_EUTRA = cellForWhichToReportCGI_EUTRA_;
      cgi_InfoEUTRA = cgi_InfoEUTRA_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA (long eutraFrequency_,
      long cellForWhichToReportCGI_EUTRA_,
      CGI_InfoEUTRA cgi_InfoEUTRA_
   ) {
      super();
      eutraFrequency = new ARFCN_ValueEUTRA (eutraFrequency_);
      cellForWhichToReportCGI_EUTRA = new EUTRA_PhysCellId (cellForWhichToReportCGI_EUTRA_);
      cgi_InfoEUTRA = cgi_InfoEUTRA_;
   }

   public void init () {
      eutraFrequency = null;
      cellForWhichToReportCGI_EUTRA = null;
      cgi_InfoEUTRA = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eutraFrequency;
         case 1: return cellForWhichToReportCGI_EUTRA;
         case 2: return cgi_InfoEUTRA;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eutraFrequency";
         case 1: return "cellForWhichToReportCGI-EUTRA";
         case 2: return "cgi-InfoEUTRA";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode eutraFrequency

      buffer.getContext().eventDispatcher.startElement("eutraFrequency", -1);

      eutraFrequency = new ARFCN_ValueEUTRA();
      eutraFrequency.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eutraFrequency", -1);

      // decode cellForWhichToReportCGI_EUTRA

      buffer.getContext().eventDispatcher.startElement("cellForWhichToReportCGI_EUTRA", -1);

      cellForWhichToReportCGI_EUTRA = new EUTRA_PhysCellId();
      cellForWhichToReportCGI_EUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellForWhichToReportCGI_EUTRA", -1);

      // decode cgi_InfoEUTRA

      buffer.getContext().eventDispatcher.startElement("cgi_InfoEUTRA", -1);

      cgi_InfoEUTRA = new CGI_InfoEUTRA();
      cgi_InfoEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cgi_InfoEUTRA", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eutraFrequency != null) eutraFrequency.print (_sb, "eutraFrequency", _level+1);
      if (cellForWhichToReportCGI_EUTRA != null) cellForWhichToReportCGI_EUTRA.print (_sb, "cellForWhichToReportCGI_EUTRA", _level+1);
      if (cgi_InfoEUTRA != null) cgi_InfoEUTRA.print (_sb, "cgi_InfoEUTRA", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
