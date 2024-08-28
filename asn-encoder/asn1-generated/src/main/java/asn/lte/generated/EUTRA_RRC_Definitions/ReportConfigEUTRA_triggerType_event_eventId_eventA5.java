/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_triggerType_event_eventId_eventA5 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ThresholdEUTRA a5_Threshold1;
   public ThresholdEUTRA a5_Threshold2;

   public ReportConfigEUTRA_triggerType_event_eventId_eventA5 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventA5 (
      ThresholdEUTRA a5_Threshold1_,
      ThresholdEUTRA a5_Threshold2_
   ) {
      super();
      a5_Threshold1 = a5_Threshold1_;
      a5_Threshold2 = a5_Threshold2_;
   }

   public void init () {
      a5_Threshold1 = null;
      a5_Threshold2 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return a5_Threshold1;
         case 1: return a5_Threshold2;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "a5-Threshold1";
         case 1: return "a5-Threshold2";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode a5_Threshold1

      buffer.getContext().eventDispatcher.startElement("a5_Threshold1", -1);

      a5_Threshold1 = new ThresholdEUTRA();
      a5_Threshold1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("a5_Threshold1", -1);

      // decode a5_Threshold2

      buffer.getContext().eventDispatcher.startElement("a5_Threshold2", -1);

      a5_Threshold2 = new ThresholdEUTRA();
      a5_Threshold2.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("a5_Threshold2", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (a5_Threshold1 != null) a5_Threshold1.print (_sb, "a5_Threshold1", _level+1);
      if (a5_Threshold2 != null) a5_Threshold2.print (_sb, "a5_Threshold2", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
