/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TrafficPatternInfo_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TrafficPatternInfo-r14";
   }

   public TrafficPatternInfo_r14_trafficPeriodicity_r14 trafficPeriodicity_r14 = null;
   public Asn1Integer timingOffset_r14;
   public SL_Priority_r13 priorityInfoSL_r14;  // optional
   public Asn1Integer logicalChannelIdentityUL_r14;  // optional
   public Asn1BitString messageSize_r14;

   public TrafficPatternInfo_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TrafficPatternInfo_r14 (
      TrafficPatternInfo_r14_trafficPeriodicity_r14 trafficPeriodicity_r14_,
      Asn1Integer timingOffset_r14_,
      SL_Priority_r13 priorityInfoSL_r14_,
      Asn1Integer logicalChannelIdentityUL_r14_,
      Asn1BitString messageSize_r14_
   ) {
      super();
      trafficPeriodicity_r14 = trafficPeriodicity_r14_;
      timingOffset_r14 = timingOffset_r14_;
      priorityInfoSL_r14 = priorityInfoSL_r14_;
      logicalChannelIdentityUL_r14 = logicalChannelIdentityUL_r14_;
      messageSize_r14 = messageSize_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public TrafficPatternInfo_r14 (
      TrafficPatternInfo_r14_trafficPeriodicity_r14 trafficPeriodicity_r14_,
      Asn1Integer timingOffset_r14_,
      Asn1BitString messageSize_r14_
   ) {
      super();
      trafficPeriodicity_r14 = trafficPeriodicity_r14_;
      timingOffset_r14 = timingOffset_r14_;
      messageSize_r14 = messageSize_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public TrafficPatternInfo_r14 (TrafficPatternInfo_r14_trafficPeriodicity_r14 trafficPeriodicity_r14_,
      long timingOffset_r14_,
      long priorityInfoSL_r14_,
      long logicalChannelIdentityUL_r14_,
      Asn1BitString messageSize_r14_
   ) {
      super();
      trafficPeriodicity_r14 = trafficPeriodicity_r14_;
      timingOffset_r14 = new Asn1Integer (timingOffset_r14_);
      priorityInfoSL_r14 = new SL_Priority_r13 (priorityInfoSL_r14_);
      logicalChannelIdentityUL_r14 = new Asn1Integer (logicalChannelIdentityUL_r14_);
      messageSize_r14 = messageSize_r14_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public TrafficPatternInfo_r14 (
      TrafficPatternInfo_r14_trafficPeriodicity_r14 trafficPeriodicity_r14_,
      long timingOffset_r14_,
      Asn1BitString messageSize_r14_
   ) {
      super();
      trafficPeriodicity_r14 = trafficPeriodicity_r14_;
      timingOffset_r14 = new Asn1Integer (timingOffset_r14_);
      messageSize_r14 = messageSize_r14_;
   }

   public void init () {
      trafficPeriodicity_r14 = null;
      timingOffset_r14 = null;
      priorityInfoSL_r14 = null;
      logicalChannelIdentityUL_r14 = null;
      messageSize_r14 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return trafficPeriodicity_r14;
         case 1: return timingOffset_r14;
         case 2: return priorityInfoSL_r14;
         case 3: return logicalChannelIdentityUL_r14;
         case 4: return messageSize_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "trafficPeriodicity-r14";
         case 1: return "timingOffset-r14";
         case 2: return "priorityInfoSL-r14";
         case 3: return "logicalChannelIdentityUL-r14";
         case 4: return "messageSize-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean priorityInfoSL_r14Present = buffer.decodeBit ("priorityInfoSL_r14Present");
      boolean logicalChannelIdentityUL_r14Present = buffer.decodeBit ("logicalChannelIdentityUL_r14Present");

      // decode trafficPeriodicity_r14

      buffer.getContext().eventDispatcher.startElement("trafficPeriodicity_r14", -1);

      {
         int tval = TrafficPatternInfo_r14_trafficPeriodicity_r14.decodeEnumValue (buffer);
         trafficPeriodicity_r14 = TrafficPatternInfo_r14_trafficPeriodicity_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("trafficPeriodicity_r14", -1);

      // decode timingOffset_r14

      buffer.getContext().eventDispatcher.startElement("timingOffset_r14", -1);

      timingOffset_r14 = new Asn1Integer();
      timingOffset_r14.decode (buffer, 0, 10239);

      buffer.invokeCharacters(timingOffset_r14.toString());
      buffer.getContext().eventDispatcher.endElement("timingOffset_r14", -1);

      // decode priorityInfoSL_r14

      if (priorityInfoSL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("priorityInfoSL_r14", -1);

         priorityInfoSL_r14 = new SL_Priority_r13();
         priorityInfoSL_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("priorityInfoSL_r14", -1);
      }
      else {
         priorityInfoSL_r14 = null;
      }

      // decode logicalChannelIdentityUL_r14

      if (logicalChannelIdentityUL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelIdentityUL_r14", -1);

         logicalChannelIdentityUL_r14 = new Asn1Integer();
         logicalChannelIdentityUL_r14.decode (buffer, 3, 10);

         buffer.invokeCharacters(logicalChannelIdentityUL_r14.toString());
         buffer.getContext().eventDispatcher.endElement("logicalChannelIdentityUL_r14", -1);
      }
      else {
         logicalChannelIdentityUL_r14 = null;
      }

      // decode messageSize_r14

      buffer.getContext().eventDispatcher.startElement("messageSize_r14", -1);

      messageSize_r14 = new Asn1BitString();
      messageSize_r14.decode (buffer, 6, 6);

      buffer.invokeCharacters(messageSize_r14.toString());
      buffer.getContext().eventDispatcher.endElement("messageSize_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (trafficPeriodicity_r14 != null) trafficPeriodicity_r14.print (_sb, "trafficPeriodicity_r14", _level+1);
      if (timingOffset_r14 != null) timingOffset_r14.print (_sb, "timingOffset_r14", _level+1);
      if (priorityInfoSL_r14 != null) priorityInfoSL_r14.print (_sb, "priorityInfoSL_r14", _level+1);
      if (logicalChannelIdentityUL_r14 != null) logicalChannelIdentityUL_r14.print (_sb, "logicalChannelIdentityUL_r14", _level+1);
      if (messageSize_r14 != null) messageSize_r14.print (_sb, "messageSize_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
