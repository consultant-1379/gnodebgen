/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportBothProc_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CQI-ReportBothProc-r11";
   }

   public CSI_ProcessId_r11 ri_Ref_CSI_ProcessId_r11;  // optional
   public CQI_ReportBothProc_r11_pmi_RI_Report_r11 pmi_RI_Report_r11 = null;  // optional

   public CQI_ReportBothProc_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportBothProc_r11 (
      CSI_ProcessId_r11 ri_Ref_CSI_ProcessId_r11_,
      CQI_ReportBothProc_r11_pmi_RI_Report_r11 pmi_RI_Report_r11_
   ) {
      super();
      ri_Ref_CSI_ProcessId_r11 = ri_Ref_CSI_ProcessId_r11_;
      pmi_RI_Report_r11 = pmi_RI_Report_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CQI_ReportBothProc_r11 (long ri_Ref_CSI_ProcessId_r11_,
      CQI_ReportBothProc_r11_pmi_RI_Report_r11 pmi_RI_Report_r11_
   ) {
      super();
      ri_Ref_CSI_ProcessId_r11 = new CSI_ProcessId_r11 (ri_Ref_CSI_ProcessId_r11_);
      pmi_RI_Report_r11 = pmi_RI_Report_r11_;
   }

   public void init () {
      ri_Ref_CSI_ProcessId_r11 = null;
      pmi_RI_Report_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ri_Ref_CSI_ProcessId_r11;
         case 1: return pmi_RI_Report_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ri-Ref-CSI-ProcessId-r11";
         case 1: return "pmi-RI-Report-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ri_Ref_CSI_ProcessId_r11Present = buffer.decodeBit ("ri_Ref_CSI_ProcessId_r11Present");
      boolean pmi_RI_Report_r11Present = buffer.decodeBit ("pmi_RI_Report_r11Present");

      // decode ri_Ref_CSI_ProcessId_r11

      if (ri_Ref_CSI_ProcessId_r11Present) {
         buffer.getContext().eventDispatcher.startElement("ri_Ref_CSI_ProcessId_r11", -1);

         ri_Ref_CSI_ProcessId_r11 = new CSI_ProcessId_r11();
         ri_Ref_CSI_ProcessId_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ri_Ref_CSI_ProcessId_r11", -1);
      }
      else {
         ri_Ref_CSI_ProcessId_r11 = null;
      }

      // decode pmi_RI_Report_r11

      if (pmi_RI_Report_r11Present) {
         buffer.getContext().eventDispatcher.startElement("pmi_RI_Report_r11", -1);

         int tval = CQI_ReportBothProc_r11_pmi_RI_Report_r11.decodeEnumValue (buffer);
         pmi_RI_Report_r11 = CQI_ReportBothProc_r11_pmi_RI_Report_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pmi_RI_Report_r11", -1);
      }
      else {
         pmi_RI_Report_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ri_Ref_CSI_ProcessId_r11 != null) ri_Ref_CSI_ProcessId_r11.print (_sb, "ri_Ref_CSI_ProcessId_r11", _level+1);
      if (pmi_RI_Report_r11 != null) pmi_RI_Report_r11.print (_sb, "pmi_RI_Report_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
