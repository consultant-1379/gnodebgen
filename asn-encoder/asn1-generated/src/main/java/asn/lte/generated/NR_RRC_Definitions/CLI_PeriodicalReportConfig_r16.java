/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CLI_PeriodicalReportConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CLI-PeriodicalReportConfig-r16";
   }

   public ReportInterval reportInterval_r16 = null;
   public CLI_PeriodicalReportConfig_r16_reportAmount_r16 reportAmount_r16 = null;
   public MeasReportQuantityCLI_r16 reportQuantityCLI_r16 = null;
   public Asn1Integer maxReportCLI_r16;
   public Asn1OpenExt extElem1;

   public CLI_PeriodicalReportConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CLI_PeriodicalReportConfig_r16 (
      ReportInterval reportInterval_r16_,
      CLI_PeriodicalReportConfig_r16_reportAmount_r16 reportAmount_r16_,
      MeasReportQuantityCLI_r16 reportQuantityCLI_r16_,
      Asn1Integer maxReportCLI_r16_
   ) {
      super();
      reportInterval_r16 = reportInterval_r16_;
      reportAmount_r16 = reportAmount_r16_;
      reportQuantityCLI_r16 = reportQuantityCLI_r16_;
      maxReportCLI_r16 = maxReportCLI_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CLI_PeriodicalReportConfig_r16 (ReportInterval reportInterval_r16_,
      CLI_PeriodicalReportConfig_r16_reportAmount_r16 reportAmount_r16_,
      MeasReportQuantityCLI_r16 reportQuantityCLI_r16_,
      long maxReportCLI_r16_
   ) {
      super();
      reportInterval_r16 = reportInterval_r16_;
      reportAmount_r16 = reportAmount_r16_;
      reportQuantityCLI_r16 = reportQuantityCLI_r16_;
      maxReportCLI_r16 = new Asn1Integer (maxReportCLI_r16_);
   }

   public void init () {
      reportInterval_r16 = null;
      reportAmount_r16 = null;
      reportQuantityCLI_r16 = null;
      maxReportCLI_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return reportInterval_r16;
         case 1: return reportAmount_r16;
         case 2: return reportQuantityCLI_r16;
         case 3: return maxReportCLI_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "reportInterval-r16";
         case 1: return "reportAmount-r16";
         case 2: return "reportQuantityCLI-r16";
         case 3: return "maxReportCLI-r16";
         case 4: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode reportInterval_r16

      buffer.getContext().eventDispatcher.startElement("reportInterval_r16", -1);

      {
         int tval = ReportInterval.decodeEnumValue (buffer);
         reportInterval_r16 = ReportInterval.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reportInterval_r16", -1);

      // decode reportAmount_r16

      buffer.getContext().eventDispatcher.startElement("reportAmount_r16", -1);

      {
         int tval = CLI_PeriodicalReportConfig_r16_reportAmount_r16.decodeEnumValue (buffer);
         reportAmount_r16 = CLI_PeriodicalReportConfig_r16_reportAmount_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reportAmount_r16", -1);

      // decode reportQuantityCLI_r16

      buffer.getContext().eventDispatcher.startElement("reportQuantityCLI_r16", -1);

      {
         int tval = MeasReportQuantityCLI_r16.decodeEnumValue (buffer);
         reportQuantityCLI_r16 = MeasReportQuantityCLI_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reportQuantityCLI_r16", -1);

      // decode maxReportCLI_r16

      buffer.getContext().eventDispatcher.startElement("maxReportCLI_r16", -1);

      maxReportCLI_r16 = new Asn1Integer();
      maxReportCLI_r16.decode (buffer, 1, 8);

      buffer.invokeCharacters(maxReportCLI_r16.toString());
      buffer.getContext().eventDispatcher.endElement("maxReportCLI_r16", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (reportInterval_r16 != null) reportInterval_r16.print (_sb, "reportInterval_r16", _level+1);
      if (reportAmount_r16 != null) reportAmount_r16.print (_sb, "reportAmount_r16", _level+1);
      if (reportQuantityCLI_r16 != null) reportQuantityCLI_r16.print (_sb, "reportQuantityCLI_r16", _level+1);
      if (maxReportCLI_r16 != null) maxReportCLI_r16.print (_sb, "maxReportCLI_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
