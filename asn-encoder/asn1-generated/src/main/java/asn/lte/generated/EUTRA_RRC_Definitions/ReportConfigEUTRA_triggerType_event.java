/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigEUTRA_triggerType_event extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public ReportConfigEUTRA_triggerType_event_eventId eventId;
   public Hysteresis hysteresis;
   public TimeToTrigger timeToTrigger = null;

   public ReportConfigEUTRA_triggerType_event () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportConfigEUTRA_triggerType_event (
      ReportConfigEUTRA_triggerType_event_eventId eventId_,
      Hysteresis hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      eventId = eventId_;
      hysteresis = hysteresis_;
      timeToTrigger = timeToTrigger_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public ReportConfigEUTRA_triggerType_event (ReportConfigEUTRA_triggerType_event_eventId eventId_,
      long hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      eventId = eventId_;
      hysteresis = new Hysteresis (hysteresis_);
      timeToTrigger = timeToTrigger_;
   }

   public void init () {
      eventId = null;
      hysteresis = null;
      timeToTrigger = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return eventId;
         case 1: return hysteresis;
         case 2: return timeToTrigger;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "eventId";
         case 1: return "hysteresis";
         case 2: return "timeToTrigger";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode eventId

      buffer.getContext().eventDispatcher.startElement("eventId", -1);

      eventId = new ReportConfigEUTRA_triggerType_event_eventId();
      eventId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eventId", -1);

      // decode hysteresis

      buffer.getContext().eventDispatcher.startElement("hysteresis", -1);

      hysteresis = new Hysteresis();
      hysteresis.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("hysteresis", -1);

      // decode timeToTrigger

      buffer.getContext().eventDispatcher.startElement("timeToTrigger", -1);

      {
         int tval = TimeToTrigger.decodeEnumValue (buffer);
         timeToTrigger = TimeToTrigger.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("timeToTrigger", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (eventId != null) eventId.print (_sb, "eventId", _level+1);
      if (hysteresis != null) hysteresis.print (_sb, "hysteresis", _level+1);
      if (timeToTrigger != null) timeToTrigger.print (_sb, "timeToTrigger", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
