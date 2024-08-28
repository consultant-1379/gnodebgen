/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellAccessRelatedInfo_EUTRA_EPC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellAccessRelatedInfo-EUTRA-EPC";
   }

   public PLMN_IdentityList_EUTRA_EPC plmn_IdentityList_eutra_epc;
   public Asn1BitString trackingAreaCode_eutra_epc;
   public Asn1BitString cellIdentity_eutra_epc;

   public CellAccessRelatedInfo_EUTRA_EPC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellAccessRelatedInfo_EUTRA_EPC (
      PLMN_IdentityList_EUTRA_EPC plmn_IdentityList_eutra_epc_,
      Asn1BitString trackingAreaCode_eutra_epc_,
      Asn1BitString cellIdentity_eutra_epc_
   ) {
      super();
      plmn_IdentityList_eutra_epc = plmn_IdentityList_eutra_epc_;
      trackingAreaCode_eutra_epc = trackingAreaCode_eutra_epc_;
      cellIdentity_eutra_epc = cellIdentity_eutra_epc_;
   }

   public void init () {
      plmn_IdentityList_eutra_epc = null;
      trackingAreaCode_eutra_epc = null;
      cellIdentity_eutra_epc = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityList_eutra_epc;
         case 1: return trackingAreaCode_eutra_epc;
         case 2: return cellIdentity_eutra_epc;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityList-eutra-epc";
         case 1: return "trackingAreaCode-eutra-epc";
         case 2: return "cellIdentity-eutra-epc";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode plmn_IdentityList_eutra_epc

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_eutra_epc", -1);

      plmn_IdentityList_eutra_epc = new PLMN_IdentityList_EUTRA_EPC();
      plmn_IdentityList_eutra_epc.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_eutra_epc", -1);

      // decode trackingAreaCode_eutra_epc

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode_eutra_epc", -1);

      trackingAreaCode_eutra_epc = new Asn1BitString();
      trackingAreaCode_eutra_epc.decode (buffer, 16, 16);

      buffer.invokeCharacters(trackingAreaCode_eutra_epc.toString());
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode_eutra_epc", -1);

      // decode cellIdentity_eutra_epc

      buffer.getContext().eventDispatcher.startElement("cellIdentity_eutra_epc", -1);

      cellIdentity_eutra_epc = new Asn1BitString();
      cellIdentity_eutra_epc.decode (buffer, 28, 28);

      buffer.invokeCharacters(cellIdentity_eutra_epc.toString());
      buffer.getContext().eventDispatcher.endElement("cellIdentity_eutra_epc", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode plmn_IdentityList_eutra_epc

      if (plmn_IdentityList_eutra_epc != null) {
         buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_eutra_epc", -1);

         plmn_IdentityList_eutra_epc.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_eutra_epc", -1);
      }
      else throw new Asn1MissingRequiredException ("plmn_IdentityList_eutra_epc");

      // encode trackingAreaCode_eutra_epc

      if (trackingAreaCode_eutra_epc != null) {
         buffer.getContext().eventDispatcher.startElement("trackingAreaCode_eutra_epc", -1);

         trackingAreaCode_eutra_epc.encode (buffer, 16, 16);

         buffer.getContext().eventDispatcher.endElement("trackingAreaCode_eutra_epc", -1);
      }
      else throw new Asn1MissingRequiredException ("trackingAreaCode_eutra_epc");

      // encode cellIdentity_eutra_epc

      if (cellIdentity_eutra_epc != null) {
         buffer.getContext().eventDispatcher.startElement("cellIdentity_eutra_epc", -1);

         cellIdentity_eutra_epc.encode (buffer, 28, 28);

         buffer.getContext().eventDispatcher.endElement("cellIdentity_eutra_epc", -1);
      }
      else throw new Asn1MissingRequiredException ("cellIdentity_eutra_epc");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_IdentityList_eutra_epc != null) plmn_IdentityList_eutra_epc.print (_sb, "plmn_IdentityList_eutra_epc", _level+1);
      if (trackingAreaCode_eutra_epc != null) trackingAreaCode_eutra_epc.print (_sb, "trackingAreaCode_eutra_epc", _level+1);
      if (cellIdentity_eutra_epc != null) cellIdentity_eutra_epc.print (_sb, "cellIdentity_eutra_epc", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
