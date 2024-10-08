/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public Asn1BitString trigger1_Indicator_r14;

   public CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CQI_ReportAperiodicHybrid_r14_triggers_r14_oneBit_r14 (
      Asn1BitString trigger1_Indicator_r14_
   ) {
      super();
      trigger1_Indicator_r14 = trigger1_Indicator_r14_;
   }

   public void init () {
      trigger1_Indicator_r14 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return trigger1_Indicator_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "trigger1-Indicator-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode trigger1_Indicator_r14

      buffer.getContext().eventDispatcher.startElement("trigger1_Indicator_r14", -1);

      trigger1_Indicator_r14 = new Asn1BitString();
      trigger1_Indicator_r14.decode (buffer, 8, 8);

      buffer.invokeCharacters(trigger1_Indicator_r14.toString());
      buffer.getContext().eventDispatcher.endElement("trigger1_Indicator_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (trigger1_Indicator_r14 != null) trigger1_Indicator_r14.print (_sb, "trigger1_Indicator_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
