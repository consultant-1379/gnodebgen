/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ReportConfig_aperiodic_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_2_r16 reportSlotOffsetListDCI_0_2_r16;  // optional
   public CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_1_r16 reportSlotOffsetListDCI_0_1_r16;  // optional

   public CSI_ReportConfig_aperiodic_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_ReportConfig_aperiodic_v1610 (
      CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_2_r16 reportSlotOffsetListDCI_0_2_r16_,
      CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_1_r16 reportSlotOffsetListDCI_0_1_r16_
   ) {
      super();
      reportSlotOffsetListDCI_0_2_r16 = reportSlotOffsetListDCI_0_2_r16_;
      reportSlotOffsetListDCI_0_1_r16 = reportSlotOffsetListDCI_0_1_r16_;
   }

   public void init () {
      reportSlotOffsetListDCI_0_2_r16 = null;
      reportSlotOffsetListDCI_0_1_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportSlotOffsetListDCI_0_2_r16;
         case 1: return reportSlotOffsetListDCI_0_1_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportSlotOffsetListDCI-0-2-r16";
         case 1: return "reportSlotOffsetListDCI-0-1-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean reportSlotOffsetListDCI_0_2_r16Present = buffer.decodeBit ("reportSlotOffsetListDCI_0_2_r16Present");
      boolean reportSlotOffsetListDCI_0_1_r16Present = buffer.decodeBit ("reportSlotOffsetListDCI_0_1_r16Present");

      // decode reportSlotOffsetListDCI_0_2_r16

      if (reportSlotOffsetListDCI_0_2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("reportSlotOffsetListDCI_0_2_r16", -1);

         reportSlotOffsetListDCI_0_2_r16 = new CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_2_r16();
         reportSlotOffsetListDCI_0_2_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reportSlotOffsetListDCI_0_2_r16", -1);
      }
      else {
         reportSlotOffsetListDCI_0_2_r16 = null;
      }

      // decode reportSlotOffsetListDCI_0_1_r16

      if (reportSlotOffsetListDCI_0_1_r16Present) {
         buffer.getContext().eventDispatcher.startElement("reportSlotOffsetListDCI_0_1_r16", -1);

         reportSlotOffsetListDCI_0_1_r16 = new CSI_ReportConfig_aperiodic_v1610_reportSlotOffsetListDCI_0_1_r16();
         reportSlotOffsetListDCI_0_1_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reportSlotOffsetListDCI_0_1_r16", -1);
      }
      else {
         reportSlotOffsetListDCI_0_1_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportSlotOffsetListDCI_0_2_r16 != null) reportSlotOffsetListDCI_0_2_r16.print (_sb, "reportSlotOffsetListDCI_0_2_r16", _level+1);
      if (reportSlotOffsetListDCI_0_1_r16 != null) reportSlotOffsetListDCI_0_1_r16.print (_sb, "reportSlotOffsetListDCI_0_1_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
