/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PLMN_IdentityInfo2_r12 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PLMN-IdentityInfo2-r12";
   }

   // Choice element identifier constants
   public final static byte _PLMN_INDEX_R12 = 1;
   public final static byte _PLMNIDENTITY_R12 = 2;

   public PLMN_IdentityInfo2_r12 () {
      super();
   }

   public PLMN_IdentityInfo2_r12 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PLMN_INDEX_R12: return "plmn_Index_r12";
      case _PLMNIDENTITY_R12: return "plmnIdentity_r12";
      default: return "UNDEFINED";
      }
   }

   public void set_plmn_Index_r12 (Asn1Integer value) {
      setElement (_PLMN_INDEX_R12, value);
   }

   public void set_plmnIdentity_r12 (PLMN_Identity value) {
      setElement (_PLMNIDENTITY_R12, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // plmn_Index_r12
         case 0: { 
            Asn1Integer plmn_Index_r12;
            element = plmn_Index_r12 = new Asn1Integer();
            plmn_Index_r12.decode (buffer, 1, 6);

            buffer.invokeCharacters(plmn_Index_r12.toString());
            break;
         }

         // plmnIdentity_r12
         case 1: { 
            PLMN_Identity plmnIdentity_r12;
            element = plmnIdentity_r12 = new PLMN_Identity();
            plmnIdentity_r12.decode (buffer);
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
