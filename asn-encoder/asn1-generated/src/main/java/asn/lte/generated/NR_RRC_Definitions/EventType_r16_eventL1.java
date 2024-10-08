/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EventType_r16_eventL1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasTriggerQuantity l1_Threshold;
   public Hysteresis hysteresis;
   public TimeToTrigger timeToTrigger = null;

   public EventType_r16_eventL1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EventType_r16_eventL1 (
      MeasTriggerQuantity l1_Threshold_,
      Hysteresis hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      l1_Threshold = l1_Threshold_;
      hysteresis = hysteresis_;
      timeToTrigger = timeToTrigger_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EventType_r16_eventL1 (MeasTriggerQuantity l1_Threshold_,
      long hysteresis_,
      TimeToTrigger timeToTrigger_
   ) {
      super();
      l1_Threshold = l1_Threshold_;
      hysteresis = new Hysteresis (hysteresis_);
      timeToTrigger = timeToTrigger_;
   }

   public void init () {
      l1_Threshold = null;
      hysteresis = null;
      timeToTrigger = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return l1_Threshold;
         case 1: return hysteresis;
         case 2: return timeToTrigger;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "l1-Threshold";
         case 1: return "hysteresis";
         case 2: return "timeToTrigger";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode l1_Threshold

      buffer.getContext().eventDispatcher.startElement("l1_Threshold", -1);

      l1_Threshold = new MeasTriggerQuantity();
      l1_Threshold.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("l1_Threshold", -1);

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
      if (l1_Threshold != null) l1_Threshold.print (_sb, "l1_Threshold", _level+1);
      if (hysteresis != null) hysteresis.print (_sb, "hysteresis", _level+1);
      if (timeToTrigger != null) timeToTrigger.print (_sb, "timeToTrigger", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
