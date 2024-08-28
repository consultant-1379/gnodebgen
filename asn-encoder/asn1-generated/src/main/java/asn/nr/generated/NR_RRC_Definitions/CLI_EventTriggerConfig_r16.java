/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CLI_EventTriggerConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CLI-EventTriggerConfig-r16";
   }

   public CLI_EventTriggerConfig_r16_eventId_r16 eventId_r16;
   public ReportInterval reportInterval_r16 = null;
   public CLI_EventTriggerConfig_r16_reportAmount_r16 reportAmount_r16 = null;
   public Asn1Integer maxReportCLI_r16;
   public Asn1OpenExt extElem1;

   public CLI_EventTriggerConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CLI_EventTriggerConfig_r16 (
      CLI_EventTriggerConfig_r16_eventId_r16 eventId_r16_,
      ReportInterval reportInterval_r16_,
      CLI_EventTriggerConfig_r16_reportAmount_r16 reportAmount_r16_,
      Asn1Integer maxReportCLI_r16_
   ) {
      super();
      eventId_r16 = eventId_r16_;
      reportInterval_r16 = reportInterval_r16_;
      reportAmount_r16 = reportAmount_r16_;
      maxReportCLI_r16 = maxReportCLI_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CLI_EventTriggerConfig_r16 (CLI_EventTriggerConfig_r16_eventId_r16 eventId_r16_,
      ReportInterval reportInterval_r16_,
      CLI_EventTriggerConfig_r16_reportAmount_r16 reportAmount_r16_,
      long maxReportCLI_r16_
   ) {
      super();
      eventId_r16 = eventId_r16_;
      reportInterval_r16 = reportInterval_r16_;
      reportAmount_r16 = reportAmount_r16_;
      maxReportCLI_r16 = new Asn1Integer (maxReportCLI_r16_);
   }

   public void init () {
      eventId_r16 = null;
      reportInterval_r16 = null;
      reportAmount_r16 = null;
      maxReportCLI_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eventId_r16;
         case 1: return reportInterval_r16;
         case 2: return reportAmount_r16;
         case 3: return maxReportCLI_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eventId-r16";
         case 1: return "reportInterval-r16";
         case 2: return "reportAmount-r16";
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

      // decode eventId_r16

      buffer.getContext().eventDispatcher.startElement("eventId_r16", -1);

      eventId_r16 = new CLI_EventTriggerConfig_r16_eventId_r16();
      eventId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eventId_r16", -1);

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
         int tval = CLI_EventTriggerConfig_r16_reportAmount_r16.decodeEnumValue (buffer);
         reportAmount_r16 = CLI_EventTriggerConfig_r16_reportAmount_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("reportAmount_r16", -1);

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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode eventId_r16

      if (eventId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("eventId_r16", -1);

         eventId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("eventId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("eventId_r16");

      // encode reportInterval_r16

      if (reportInterval_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reportInterval_r16", -1);

         reportInterval_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reportInterval_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("reportInterval_r16");

      // encode reportAmount_r16

      if (reportAmount_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reportAmount_r16", -1);

         reportAmount_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reportAmount_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("reportAmount_r16");

      // encode maxReportCLI_r16

      if (maxReportCLI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("maxReportCLI_r16", -1);

         maxReportCLI_r16.encode (buffer, 1, 8);

         buffer.getContext().eventDispatcher.endElement("maxReportCLI_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("maxReportCLI_r16");

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eventId_r16 != null) eventId_r16.print (_sb, "eventId_r16", _level+1);
      if (reportInterval_r16 != null) reportInterval_r16.print (_sb, "reportInterval_r16", _level+1);
      if (reportAmount_r16 != null) reportAmount_r16.print (_sb, "reportAmount_r16", _level+1);
      if (maxReportCLI_r16 != null) maxReportCLI_r16.print (_sb, "maxReportCLI_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
