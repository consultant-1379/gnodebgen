/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_triggerType_event_eventId_eventC2_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasCSI_RS_Id_r12 c2_RefCSI_RS_r12;
   public Asn1Integer c2_Offset_r12;
   public Asn1Boolean c2_ReportOnLeave_r12;

   public ReportConfigEUTRA_triggerType_event_eventId_eventC2_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventC2_r12 (
      MeasCSI_RS_Id_r12 c2_RefCSI_RS_r12_,
      Asn1Integer c2_Offset_r12_,
      Asn1Boolean c2_ReportOnLeave_r12_
   ) {
      super();
      c2_RefCSI_RS_r12 = c2_RefCSI_RS_r12_;
      c2_Offset_r12 = c2_Offset_r12_;
      c2_ReportOnLeave_r12 = c2_ReportOnLeave_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventC2_r12 (long c2_RefCSI_RS_r12_,
      long c2_Offset_r12_,
      boolean c2_ReportOnLeave_r12_
   ) {
      super();
      c2_RefCSI_RS_r12 = new MeasCSI_RS_Id_r12 (c2_RefCSI_RS_r12_);
      c2_Offset_r12 = new Asn1Integer (c2_Offset_r12_);
      c2_ReportOnLeave_r12 = new Asn1Boolean (c2_ReportOnLeave_r12_);
   }

   public void init () {
      c2_RefCSI_RS_r12 = null;
      c2_Offset_r12 = null;
      c2_ReportOnLeave_r12 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return c2_RefCSI_RS_r12;
         case 1: return c2_Offset_r12;
         case 2: return c2_ReportOnLeave_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "c2-RefCSI-RS-r12";
         case 1: return "c2-Offset-r12";
         case 2: return "c2-ReportOnLeave-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode c2_RefCSI_RS_r12

      buffer.getContext().eventDispatcher.startElement("c2_RefCSI_RS_r12", -1);

      c2_RefCSI_RS_r12 = new MeasCSI_RS_Id_r12();
      c2_RefCSI_RS_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("c2_RefCSI_RS_r12", -1);

      // decode c2_Offset_r12

      buffer.getContext().eventDispatcher.startElement("c2_Offset_r12", -1);

      c2_Offset_r12 = new Asn1Integer();
      c2_Offset_r12.decode (buffer, -30, 30);

      buffer.invokeCharacters(c2_Offset_r12.toString());
      buffer.getContext().eventDispatcher.endElement("c2_Offset_r12", -1);

      // decode c2_ReportOnLeave_r12

      buffer.getContext().eventDispatcher.startElement("c2_ReportOnLeave_r12", -1);

      c2_ReportOnLeave_r12 = new Asn1Boolean();
      c2_ReportOnLeave_r12.decode (buffer);

      buffer.invokeCharacters(c2_ReportOnLeave_r12.toString());
      buffer.getContext().eventDispatcher.endElement("c2_ReportOnLeave_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (c2_RefCSI_RS_r12 != null) c2_RefCSI_RS_r12.print (_sb, "c2_RefCSI_RS_r12", _level+1);
      if (c2_Offset_r12 != null) c2_Offset_r12.print (_sb, "c2_Offset_r12", _level+1);
      if (c2_ReportOnLeave_r12 != null) c2_ReportOnLeave_r12.print (_sb, "c2_ReportOnLeave_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
