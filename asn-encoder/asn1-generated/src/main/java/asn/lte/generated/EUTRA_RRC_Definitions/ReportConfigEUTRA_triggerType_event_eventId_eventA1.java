/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_triggerType_event_eventId_eventA1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ThresholdEUTRA a1_Threshold;

   public ReportConfigEUTRA_triggerType_event_eventId_eventA1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigEUTRA_triggerType_event_eventId_eventA1 (
      ThresholdEUTRA a1_Threshold_
   ) {
      super();
      a1_Threshold = a1_Threshold_;
   }

   public void init () {
      a1_Threshold = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return a1_Threshold;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "a1-Threshold";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode a1_Threshold

      buffer.getContext().eventDispatcher.startElement("a1_Threshold", -1);

      a1_Threshold = new ThresholdEUTRA();
      a1_Threshold.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("a1_Threshold", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (a1_Threshold != null) a1_Threshold.print (_sb, "a1_Threshold", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
