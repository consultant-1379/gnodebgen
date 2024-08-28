/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OtherConfig_delayBudgetReportingConfig_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public OtherConfig_delayBudgetReportingConfig_setup_delayBudgetReportingProhibitTimer delayBudgetReportingProhibitTimer = null;

   public OtherConfig_delayBudgetReportingConfig_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public OtherConfig_delayBudgetReportingConfig_setup (
      OtherConfig_delayBudgetReportingConfig_setup_delayBudgetReportingProhibitTimer delayBudgetReportingProhibitTimer_
   ) {
      super();
      delayBudgetReportingProhibitTimer = delayBudgetReportingProhibitTimer_;
   }

   public void init () {
      delayBudgetReportingProhibitTimer = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return delayBudgetReportingProhibitTimer;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "delayBudgetReportingProhibitTimer";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode delayBudgetReportingProhibitTimer

      buffer.getContext().eventDispatcher.startElement("delayBudgetReportingProhibitTimer", -1);

      {
         int tval = OtherConfig_delayBudgetReportingConfig_setup_delayBudgetReportingProhibitTimer.decodeEnumValue (buffer);
         delayBudgetReportingProhibitTimer = OtherConfig_delayBudgetReportingConfig_setup_delayBudgetReportingProhibitTimer.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("delayBudgetReportingProhibitTimer", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (delayBudgetReportingProhibitTimer != null) delayBudgetReportingProhibitTimer.print (_sb, "delayBudgetReportingProhibitTimer", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
