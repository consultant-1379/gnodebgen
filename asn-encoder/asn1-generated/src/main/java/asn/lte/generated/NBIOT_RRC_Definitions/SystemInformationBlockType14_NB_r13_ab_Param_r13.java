/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType14_NB_r13_ab_Param_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _AB_COMMON_R13 = 1;
   public final static byte _AB_PERPLMN_LIST_R13 = 2;

   public SystemInformationBlockType14_NB_r13_ab_Param_r13 () {
      super();
   }

   public SystemInformationBlockType14_NB_r13_ab_Param_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _AB_COMMON_R13: return "ab_Common_r13";
      case _AB_PERPLMN_LIST_R13: return "ab_PerPLMN_List_r13";
      default: return "UNDEFINED";
      }
   }

   public void set_ab_Common_r13 (AB_Config_NB_r13 value) {
      setElement (_AB_COMMON_R13, value);
   }

   public void set_ab_PerPLMN_List_r13 (SystemInformationBlockType14_NB_r13_ab_Param_r13_ab_PerPLMN_List_r13 value) {
      setElement (_AB_PERPLMN_LIST_R13, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ab_Common_r13
         case 0: { 
            AB_Config_NB_r13 ab_Common_r13;
            element = ab_Common_r13 = new AB_Config_NB_r13();
            ab_Common_r13.decode (buffer);
            break;
         }

         // ab_PerPLMN_List_r13
         case 1: { 
            SystemInformationBlockType14_NB_r13_ab_Param_r13_ab_PerPLMN_List_r13 ab_PerPLMN_List_r13;
            element = ab_PerPLMN_List_r13 = new SystemInformationBlockType14_NB_r13_ab_Param_r13_ab_PerPLMN_List_r13();
            ab_PerPLMN_List_r13.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
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
