/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MAC_MainConfig_logicalChannelSR_Config_r12_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MAC_MainConfig_logicalChannelSR_Config_r12_setup_logicalChannelSR_ProhibitTimer_r12 logicalChannelSR_ProhibitTimer_r12 = null;

   public MAC_MainConfig_logicalChannelSR_Config_r12_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MAC_MainConfig_logicalChannelSR_Config_r12_setup (
      MAC_MainConfig_logicalChannelSR_Config_r12_setup_logicalChannelSR_ProhibitTimer_r12 logicalChannelSR_ProhibitTimer_r12_
   ) {
      super();
      logicalChannelSR_ProhibitTimer_r12 = logicalChannelSR_ProhibitTimer_r12_;
   }

   public void init () {
      logicalChannelSR_ProhibitTimer_r12 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return logicalChannelSR_ProhibitTimer_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "logicalChannelSR-ProhibitTimer-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode logicalChannelSR_ProhibitTimer_r12

      buffer.getContext().eventDispatcher.startElement("logicalChannelSR_ProhibitTimer_r12", -1);

      {
         int tval = MAC_MainConfig_logicalChannelSR_Config_r12_setup_logicalChannelSR_ProhibitTimer_r12.decodeEnumValue (buffer);
         logicalChannelSR_ProhibitTimer_r12 = MAC_MainConfig_logicalChannelSR_Config_r12_setup_logicalChannelSR_ProhibitTimer_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("logicalChannelSR_ProhibitTimer_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (logicalChannelSR_ProhibitTimer_r12 != null) logicalChannelSR_ProhibitTimer_r12.print (_sb, "logicalChannelSR_ProhibitTimer_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
