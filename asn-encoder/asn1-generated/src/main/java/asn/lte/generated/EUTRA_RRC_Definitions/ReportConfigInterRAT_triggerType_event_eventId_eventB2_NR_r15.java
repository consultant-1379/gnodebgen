/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigInterRAT_triggerType_event_eventId_eventB2_NR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ThresholdEUTRA b2_Threshold1_r15;
   public ThresholdNR_r15 b2_Threshold2NR_r15;
   public Asn1Boolean reportOnLeave_r15;

   public ReportConfigInterRAT_triggerType_event_eventId_eventB2_NR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigInterRAT_triggerType_event_eventId_eventB2_NR_r15 (
      ThresholdEUTRA b2_Threshold1_r15_,
      ThresholdNR_r15 b2_Threshold2NR_r15_,
      Asn1Boolean reportOnLeave_r15_
   ) {
      super();
      b2_Threshold1_r15 = b2_Threshold1_r15_;
      b2_Threshold2NR_r15 = b2_Threshold2NR_r15_;
      reportOnLeave_r15 = reportOnLeave_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportConfigInterRAT_triggerType_event_eventId_eventB2_NR_r15 (ThresholdEUTRA b2_Threshold1_r15_,
      ThresholdNR_r15 b2_Threshold2NR_r15_,
      boolean reportOnLeave_r15_
   ) {
      super();
      b2_Threshold1_r15 = b2_Threshold1_r15_;
      b2_Threshold2NR_r15 = b2_Threshold2NR_r15_;
      reportOnLeave_r15 = new Asn1Boolean (reportOnLeave_r15_);
   }

   public void init () {
      b2_Threshold1_r15 = null;
      b2_Threshold2NR_r15 = null;
      reportOnLeave_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return b2_Threshold1_r15;
         case 1: return b2_Threshold2NR_r15;
         case 2: return reportOnLeave_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "b2-Threshold1-r15";
         case 1: return "b2-Threshold2NR-r15";
         case 2: return "reportOnLeave-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode b2_Threshold1_r15

      buffer.getContext().eventDispatcher.startElement("b2_Threshold1_r15", -1);

      b2_Threshold1_r15 = new ThresholdEUTRA();
      b2_Threshold1_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("b2_Threshold1_r15", -1);

      // decode b2_Threshold2NR_r15

      buffer.getContext().eventDispatcher.startElement("b2_Threshold2NR_r15", -1);

      b2_Threshold2NR_r15 = new ThresholdNR_r15();
      b2_Threshold2NR_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("b2_Threshold2NR_r15", -1);

      // decode reportOnLeave_r15

      buffer.getContext().eventDispatcher.startElement("reportOnLeave_r15", -1);

      reportOnLeave_r15 = new Asn1Boolean();
      reportOnLeave_r15.decode (buffer);

      buffer.invokeCharacters(reportOnLeave_r15.toString());
      buffer.getContext().eventDispatcher.endElement("reportOnLeave_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (b2_Threshold1_r15 != null) b2_Threshold1_r15.print (_sb, "b2_Threshold1_r15", _level+1);
      if (b2_Threshold2NR_r15 != null) b2_Threshold2NR_r15.print (_sb, "b2_Threshold2NR_r15", _level+1);
      if (reportOnLeave_r15 != null) reportOnLeave_r15.print (_sb, "reportOnLeave_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
