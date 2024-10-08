/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _PLMNCOMMON = 1;
   public final static byte _INDIVIDUALPLMNLIST = 2;

   public SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo () {
      super();
   }

   public SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PLMNCOMMON: return "plmnCommon";
      case _INDIVIDUALPLMNLIST: return "individualPLMNList";
      default: return "UNDEFINED";
      }
   }

   public void set_plmnCommon (UAC_AccessCategory1_SelectionAssistanceInfo value) {
      setElement (_PLMNCOMMON, value);
   }

   public void set_individualPLMNList (SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo_individualPLMNList value) {
      setElement (_INDIVIDUALPLMNLIST, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // plmnCommon
         case 0: { 
            UAC_AccessCategory1_SelectionAssistanceInfo plmnCommon;
            int tval = UAC_AccessCategory1_SelectionAssistanceInfo.decodeEnumValue (buffer);
            element = plmnCommon = UAC_AccessCategory1_SelectionAssistanceInfo.valueOf (tval);
            break;
         }

         // individualPLMNList
         case 1: { 
            SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo_individualPLMNList individualPLMNList;
            element = individualPLMNList = new SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo_individualPLMNList();
            individualPLMNList.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 2, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // plmnCommon
         case _PLMNCOMMON:
            UAC_AccessCategory1_SelectionAssistanceInfo plmnCommon = (UAC_AccessCategory1_SelectionAssistanceInfo) element;
            plmnCommon.encode (buffer);
            break;

         // individualPLMNList
         case _INDIVIDUALPLMNLIST:
            SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo_individualPLMNList individualPLMNList = (SIB1_uac_BarringInfo_uac_AccessCategory1_SelectionAssistanceInfo_individualPLMNList) element;
            individualPLMNList.encode (buffer);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
