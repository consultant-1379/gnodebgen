/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _UAC_IMPLICITAC_BARRINGLIST_R15 = 1;
   public final static byte _UAC_EXPLICITAC_BARRINGLIST_R15 = 2;

   public UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15 () {
      super();
   }

   public UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _UAC_IMPLICITAC_BARRINGLIST_R15: return "uac_ImplicitAC_BarringList_r15";
      case _UAC_EXPLICITAC_BARRINGLIST_R15: return "uac_ExplicitAC_BarringList_r15";
      default: return "UNDEFINED";
      }
   }

   public void set_uac_ImplicitAC_BarringList_r15 (UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15_uac_ImplicitAC_BarringList_r15 value) {
      setElement (_UAC_IMPLICITAC_BARRINGLIST_R15, value);
   }

   public void set_uac_ExplicitAC_BarringList_r15 (UAC_BarringPerCatList_r15 value) {
      setElement (_UAC_EXPLICITAC_BARRINGLIST_R15, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // uac_ImplicitAC_BarringList_r15
         case 0: { 
            UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15_uac_ImplicitAC_BarringList_r15 uac_ImplicitAC_BarringList_r15;
            element = uac_ImplicitAC_BarringList_r15 = new UAC_BarringPerPLMN_r15_uac_AC_BarringListType_r15_uac_ImplicitAC_BarringList_r15();
            uac_ImplicitAC_BarringList_r15.decode (buffer);
            break;
         }

         // uac_ExplicitAC_BarringList_r15
         case 1: { 
            UAC_BarringPerCatList_r15 uac_ExplicitAC_BarringList_r15;
            element = uac_ExplicitAC_BarringList_r15 = new UAC_BarringPerCatList_r15();
            uac_ExplicitAC_BarringList_r15.decode (buffer);
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
