/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.RLF_Report_r9;
import asn.lte.generated.EUTRA_RRC_Definitions.PLMN_IdentityList3_r11;

public class VarRLF_Report_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarRLF-Report-r11";
   }

   public RLF_Report_r9 rlf_Report_r10;
   public PLMN_IdentityList3_r11 plmn_IdentityList_r11;

   public VarRLF_Report_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarRLF_Report_r11 (
      RLF_Report_r9 rlf_Report_r10_,
      PLMN_IdentityList3_r11 plmn_IdentityList_r11_
   ) {
      super();
      rlf_Report_r10 = rlf_Report_r10_;
      plmn_IdentityList_r11 = plmn_IdentityList_r11_;
   }

   public void init () {
      rlf_Report_r10 = null;
      plmn_IdentityList_r11 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rlf_Report_r10;
         case 1: return plmn_IdentityList_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rlf-Report-r10";
         case 1: return "plmn-IdentityList-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rlf_Report_r10

      buffer.getContext().eventDispatcher.startElement("rlf_Report_r10", -1);

      rlf_Report_r10 = new RLF_Report_r9();
      rlf_Report_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rlf_Report_r10", -1);

      // decode plmn_IdentityList_r11

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_r11", -1);

      plmn_IdentityList_r11 = new PLMN_IdentityList3_r11();
      plmn_IdentityList_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_r11", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rlf_Report_r10 != null) rlf_Report_r10.print (_sb, "rlf_Report_r10", _level+1);
      if (plmn_IdentityList_r11 != null) plmn_IdentityList_r11.print (_sb, "plmn_IdentityList_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
