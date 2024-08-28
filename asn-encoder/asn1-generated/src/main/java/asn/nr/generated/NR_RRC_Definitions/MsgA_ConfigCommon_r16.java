/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MsgA_ConfigCommon_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MsgA-ConfigCommon-r16";
   }

   public RACH_ConfigCommonTwoStepRA_r16 rach_ConfigCommonTwoStepRA_r16;
   public MsgA_PUSCH_Config_r16 msgA_PUSCH_Config_r16;  // optional

   public MsgA_ConfigCommon_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MsgA_ConfigCommon_r16 (
      RACH_ConfigCommonTwoStepRA_r16 rach_ConfigCommonTwoStepRA_r16_,
      MsgA_PUSCH_Config_r16 msgA_PUSCH_Config_r16_
   ) {
      super();
      rach_ConfigCommonTwoStepRA_r16 = rach_ConfigCommonTwoStepRA_r16_;
      msgA_PUSCH_Config_r16 = msgA_PUSCH_Config_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MsgA_ConfigCommon_r16 (
      RACH_ConfigCommonTwoStepRA_r16 rach_ConfigCommonTwoStepRA_r16_
   ) {
      super();
      rach_ConfigCommonTwoStepRA_r16 = rach_ConfigCommonTwoStepRA_r16_;
   }

   public void init () {
      rach_ConfigCommonTwoStepRA_r16 = null;
      msgA_PUSCH_Config_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rach_ConfigCommonTwoStepRA_r16;
         case 1: return msgA_PUSCH_Config_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rach-ConfigCommonTwoStepRA-r16";
         case 1: return "msgA-PUSCH-Config-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean msgA_PUSCH_Config_r16Present = buffer.decodeBit ("msgA_PUSCH_Config_r16Present");

      // decode rach_ConfigCommonTwoStepRA_r16

      buffer.getContext().eventDispatcher.startElement("rach_ConfigCommonTwoStepRA_r16", -1);

      rach_ConfigCommonTwoStepRA_r16 = new RACH_ConfigCommonTwoStepRA_r16();
      rach_ConfigCommonTwoStepRA_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rach_ConfigCommonTwoStepRA_r16", -1);

      // decode msgA_PUSCH_Config_r16

      if (msgA_PUSCH_Config_r16Present) {
         buffer.getContext().eventDispatcher.startElement("msgA_PUSCH_Config_r16", -1);

         msgA_PUSCH_Config_r16 = new MsgA_PUSCH_Config_r16();
         msgA_PUSCH_Config_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("msgA_PUSCH_Config_r16", -1);
      }
      else {
         msgA_PUSCH_Config_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((msgA_PUSCH_Config_r16 != null), null);

      // encode rach_ConfigCommonTwoStepRA_r16

      if (rach_ConfigCommonTwoStepRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rach_ConfigCommonTwoStepRA_r16", -1);

         rach_ConfigCommonTwoStepRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rach_ConfigCommonTwoStepRA_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("rach_ConfigCommonTwoStepRA_r16");

      // encode msgA_PUSCH_Config_r16

      if (msgA_PUSCH_Config_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("msgA_PUSCH_Config_r16", -1);

         msgA_PUSCH_Config_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("msgA_PUSCH_Config_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rach_ConfigCommonTwoStepRA_r16 != null) rach_ConfigCommonTwoStepRA_r16.print (_sb, "rach_ConfigCommonTwoStepRA_r16", _level+1);
      if (msgA_PUSCH_Config_r16 != null) msgA_PUSCH_Config_r16.print (_sb, "msgA_PUSCH_Config_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
