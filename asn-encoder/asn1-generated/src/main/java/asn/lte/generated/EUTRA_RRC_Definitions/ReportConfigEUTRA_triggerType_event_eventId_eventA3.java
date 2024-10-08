/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_triggerType_event_eventId_eventA3 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1Integer a3_Offset;
   public Asn1Boolean reportOnLeave;

   public ReportConfigEUTRA_triggerType_event_eventId_eventA3 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventA3 (
      Asn1Integer a3_Offset_,
      Asn1Boolean reportOnLeave_
   ) {
      super();
      a3_Offset = a3_Offset_;
      reportOnLeave = reportOnLeave_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventA3 (long a3_Offset_,
      boolean reportOnLeave_
   ) {
      super();
      a3_Offset = new Asn1Integer (a3_Offset_);
      reportOnLeave = new Asn1Boolean (reportOnLeave_);
   }

   public void init () {
      a3_Offset = null;
      reportOnLeave = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return a3_Offset;
         case 1: return reportOnLeave;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "a3-Offset";
         case 1: return "reportOnLeave";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode a3_Offset

      buffer.getContext().eventDispatcher.startElement("a3_Offset", -1);

      a3_Offset = new Asn1Integer();
      a3_Offset.decode (buffer, -30, 30);

      buffer.invokeCharacters(a3_Offset.toString());
      buffer.getContext().eventDispatcher.endElement("a3_Offset", -1);

      // decode reportOnLeave

      buffer.getContext().eventDispatcher.startElement("reportOnLeave", -1);

      reportOnLeave = new Asn1Boolean();
      reportOnLeave.decode (buffer);

      buffer.invokeCharacters(reportOnLeave.toString());
      buffer.getContext().eventDispatcher.endElement("reportOnLeave", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (a3_Offset != null) a3_Offset.print (_sb, "a3_Offset", _level+1);
      if (reportOnLeave != null) reportOnLeave.print (_sb, "reportOnLeave", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
