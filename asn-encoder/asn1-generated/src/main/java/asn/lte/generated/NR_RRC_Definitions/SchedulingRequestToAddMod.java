/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingRequestToAddMod extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SchedulingRequestToAddMod";
   }

   public SchedulingRequestId schedulingRequestId;
   public SchedulingRequestToAddMod_sr_ProhibitTimer sr_ProhibitTimer = null;  // optional
   public SchedulingRequestToAddMod_sr_TransMax sr_TransMax = null;

   public SchedulingRequestToAddMod () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SchedulingRequestToAddMod (
      SchedulingRequestId schedulingRequestId_,
      SchedulingRequestToAddMod_sr_ProhibitTimer sr_ProhibitTimer_,
      SchedulingRequestToAddMod_sr_TransMax sr_TransMax_
   ) {
      super();
      schedulingRequestId = schedulingRequestId_;
      sr_ProhibitTimer = sr_ProhibitTimer_;
      sr_TransMax = sr_TransMax_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SchedulingRequestToAddMod (
      SchedulingRequestId schedulingRequestId_,
      SchedulingRequestToAddMod_sr_TransMax sr_TransMax_
   ) {
      super();
      schedulingRequestId = schedulingRequestId_;
      sr_TransMax = sr_TransMax_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SchedulingRequestToAddMod (long schedulingRequestId_,
      SchedulingRequestToAddMod_sr_ProhibitTimer sr_ProhibitTimer_,
      SchedulingRequestToAddMod_sr_TransMax sr_TransMax_
   ) {
      super();
      schedulingRequestId = new SchedulingRequestId (schedulingRequestId_);
      sr_ProhibitTimer = sr_ProhibitTimer_;
      sr_TransMax = sr_TransMax_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SchedulingRequestToAddMod (
      long schedulingRequestId_,
      SchedulingRequestToAddMod_sr_TransMax sr_TransMax_
   ) {
      super();
      schedulingRequestId = new SchedulingRequestId (schedulingRequestId_);
      sr_TransMax = sr_TransMax_;
   }

   public void init () {
      schedulingRequestId = null;
      sr_ProhibitTimer = null;
      sr_TransMax = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return schedulingRequestId;
         case 1: return sr_ProhibitTimer;
         case 2: return sr_TransMax;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "schedulingRequestId";
         case 1: return "sr-ProhibitTimer";
         case 2: return "sr-TransMax";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sr_ProhibitTimerPresent = buffer.decodeBit ("sr_ProhibitTimerPresent");

      // decode schedulingRequestId

      buffer.getContext().eventDispatcher.startElement("schedulingRequestId", -1);

      schedulingRequestId = new SchedulingRequestId();
      schedulingRequestId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("schedulingRequestId", -1);

      // decode sr_ProhibitTimer

      if (sr_ProhibitTimerPresent) {
         buffer.getContext().eventDispatcher.startElement("sr_ProhibitTimer", -1);

         int tval = SchedulingRequestToAddMod_sr_ProhibitTimer.decodeEnumValue (buffer);
         sr_ProhibitTimer = SchedulingRequestToAddMod_sr_ProhibitTimer.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sr_ProhibitTimer", -1);
      }
      else {
         sr_ProhibitTimer = null;
      }

      // decode sr_TransMax

      buffer.getContext().eventDispatcher.startElement("sr_TransMax", -1);

      {
         int tval = SchedulingRequestToAddMod_sr_TransMax.decodeEnumValue (buffer);
         sr_TransMax = SchedulingRequestToAddMod_sr_TransMax.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sr_TransMax", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (schedulingRequestId != null) schedulingRequestId.print (_sb, "schedulingRequestId", _level+1);
      if (sr_ProhibitTimer != null) sr_ProhibitTimer.print (_sb, "sr_ProhibitTimer", _level+1);
      if (sr_TransMax != null) sr_TransMax.print (_sb, "sr_TransMax", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
