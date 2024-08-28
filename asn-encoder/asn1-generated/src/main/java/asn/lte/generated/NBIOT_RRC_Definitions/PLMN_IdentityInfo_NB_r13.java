/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.PLMN_Identity;

public class PLMN_IdentityInfo_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PLMN-IdentityInfo-NB-r13";
   }

   public PLMN_Identity plmn_Identity_r13;
   public PLMN_IdentityInfo_NB_r13_cellReservedForOperatorUse_r13 cellReservedForOperatorUse_r13 = null;
   public PLMN_IdentityInfo_NB_r13_attachWithoutPDN_Connectivity_r13 attachWithoutPDN_Connectivity_r13 = null;  // optional

   public PLMN_IdentityInfo_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PLMN_IdentityInfo_NB_r13 (
      PLMN_Identity plmn_Identity_r13_,
      PLMN_IdentityInfo_NB_r13_cellReservedForOperatorUse_r13 cellReservedForOperatorUse_r13_,
      PLMN_IdentityInfo_NB_r13_attachWithoutPDN_Connectivity_r13 attachWithoutPDN_Connectivity_r13_
   ) {
      super();
      plmn_Identity_r13 = plmn_Identity_r13_;
      cellReservedForOperatorUse_r13 = cellReservedForOperatorUse_r13_;
      attachWithoutPDN_Connectivity_r13 = attachWithoutPDN_Connectivity_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PLMN_IdentityInfo_NB_r13 (
      PLMN_Identity plmn_Identity_r13_,
      PLMN_IdentityInfo_NB_r13_cellReservedForOperatorUse_r13 cellReservedForOperatorUse_r13_
   ) {
      super();
      plmn_Identity_r13 = plmn_Identity_r13_;
      cellReservedForOperatorUse_r13 = cellReservedForOperatorUse_r13_;
   }

   public void init () {
      plmn_Identity_r13 = null;
      cellReservedForOperatorUse_r13 = null;
      attachWithoutPDN_Connectivity_r13 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_Identity_r13;
         case 1: return cellReservedForOperatorUse_r13;
         case 2: return attachWithoutPDN_Connectivity_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-Identity-r13";
         case 1: return "cellReservedForOperatorUse-r13";
         case 2: return "attachWithoutPDN-Connectivity-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean attachWithoutPDN_Connectivity_r13Present = buffer.decodeBit ("attachWithoutPDN_Connectivity_r13Present");

      // decode plmn_Identity_r13

      buffer.getContext().eventDispatcher.startElement("plmn_Identity_r13", -1);

      plmn_Identity_r13 = new PLMN_Identity();
      plmn_Identity_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_Identity_r13", -1);

      // decode cellReservedForOperatorUse_r13

      buffer.getContext().eventDispatcher.startElement("cellReservedForOperatorUse_r13", -1);

      {
         int tval = PLMN_IdentityInfo_NB_r13_cellReservedForOperatorUse_r13.decodeEnumValue (buffer);
         cellReservedForOperatorUse_r13 = PLMN_IdentityInfo_NB_r13_cellReservedForOperatorUse_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cellReservedForOperatorUse_r13", -1);

      // decode attachWithoutPDN_Connectivity_r13

      if (attachWithoutPDN_Connectivity_r13Present) {
         buffer.getContext().eventDispatcher.startElement("attachWithoutPDN_Connectivity_r13", -1);

         int tval = PLMN_IdentityInfo_NB_r13_attachWithoutPDN_Connectivity_r13.decodeEnumValue (buffer);
         attachWithoutPDN_Connectivity_r13 = PLMN_IdentityInfo_NB_r13_attachWithoutPDN_Connectivity_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("attachWithoutPDN_Connectivity_r13", -1);
      }
      else {
         attachWithoutPDN_Connectivity_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_Identity_r13 != null) plmn_Identity_r13.print (_sb, "plmn_Identity_r13", _level+1);
      if (cellReservedForOperatorUse_r13 != null) cellReservedForOperatorUse_r13.print (_sb, "cellReservedForOperatorUse_r13", _level+1);
      if (attachWithoutPDN_Connectivity_r13 != null) attachWithoutPDN_Connectivity_r13.print (_sb, "attachWithoutPDN_Connectivity_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
