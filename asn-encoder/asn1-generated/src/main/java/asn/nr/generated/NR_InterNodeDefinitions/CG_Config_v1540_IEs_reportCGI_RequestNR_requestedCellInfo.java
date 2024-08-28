/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.ARFCN_ValueNR;
import asn.nr.generated.NR_RRC_Definitions.PhysCellId;

public class CG_Config_v1540_IEs_reportCGI_RequestNR_requestedCellInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ARFCN_ValueNR ssbFrequency;
   public PhysCellId cellForWhichToReportCGI;

   public CG_Config_v1540_IEs_reportCGI_RequestNR_requestedCellInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_Config_v1540_IEs_reportCGI_RequestNR_requestedCellInfo (
      ARFCN_ValueNR ssbFrequency_,
      PhysCellId cellForWhichToReportCGI_
   ) {
      super();
      ssbFrequency = ssbFrequency_;
      cellForWhichToReportCGI = cellForWhichToReportCGI_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_Config_v1540_IEs_reportCGI_RequestNR_requestedCellInfo (long ssbFrequency_,
      long cellForWhichToReportCGI_
   ) {
      super();
      ssbFrequency = new ARFCN_ValueNR (ssbFrequency_);
      cellForWhichToReportCGI = new PhysCellId (cellForWhichToReportCGI_);
   }

   public void init () {
      ssbFrequency = null;
      cellForWhichToReportCGI = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ssbFrequency;
         case 1: return cellForWhichToReportCGI;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ssbFrequency";
         case 1: return "cellForWhichToReportCGI";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode ssbFrequency

      buffer.getContext().eventDispatcher.startElement("ssbFrequency", -1);

      ssbFrequency = new ARFCN_ValueNR();
      ssbFrequency.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ssbFrequency", -1);

      // decode cellForWhichToReportCGI

      buffer.getContext().eventDispatcher.startElement("cellForWhichToReportCGI", -1);

      cellForWhichToReportCGI = new PhysCellId();
      cellForWhichToReportCGI.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellForWhichToReportCGI", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode ssbFrequency

      if (ssbFrequency != null) {
         buffer.getContext().eventDispatcher.startElement("ssbFrequency", -1);

         ssbFrequency.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ssbFrequency", -1);
      }
      else throw new Asn1MissingRequiredException ("ssbFrequency");

      // encode cellForWhichToReportCGI

      if (cellForWhichToReportCGI != null) {
         buffer.getContext().eventDispatcher.startElement("cellForWhichToReportCGI", -1);

         cellForWhichToReportCGI.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellForWhichToReportCGI", -1);
      }
      else throw new Asn1MissingRequiredException ("cellForWhichToReportCGI");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ssbFrequency != null) ssbFrequency.print (_sb, "ssbFrequency", _level+1);
      if (cellForWhichToReportCGI != null) cellForWhichToReportCGI.print (_sb, "cellForWhichToReportCGI", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
