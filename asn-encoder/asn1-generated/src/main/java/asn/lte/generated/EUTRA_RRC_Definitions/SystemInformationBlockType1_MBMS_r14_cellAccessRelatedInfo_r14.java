/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_MBMS_r14_cellAccessRelatedInfo_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PLMN_IdentityList_MBMS_r14 plmn_IdentityList_r14;
   public TrackingAreaCode trackingAreaCode_r14;
   public CellIdentity cellIdentity_r14;

   public SystemInformationBlockType1_MBMS_r14_cellAccessRelatedInfo_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_MBMS_r14_cellAccessRelatedInfo_r14 (
      PLMN_IdentityList_MBMS_r14 plmn_IdentityList_r14_,
      TrackingAreaCode trackingAreaCode_r14_,
      CellIdentity cellIdentity_r14_
   ) {
      super();
      plmn_IdentityList_r14 = plmn_IdentityList_r14_;
      trackingAreaCode_r14 = trackingAreaCode_r14_;
      cellIdentity_r14 = cellIdentity_r14_;
   }

   public void init () {
      plmn_IdentityList_r14 = null;
      trackingAreaCode_r14 = null;
      cellIdentity_r14 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityList_r14;
         case 1: return trackingAreaCode_r14;
         case 2: return cellIdentity_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityList-r14";
         case 1: return "trackingAreaCode-r14";
         case 2: return "cellIdentity-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode plmn_IdentityList_r14

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_r14", -1);

      plmn_IdentityList_r14 = new PLMN_IdentityList_MBMS_r14();
      plmn_IdentityList_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_r14", -1);

      // decode trackingAreaCode_r14

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode_r14", -1);

      trackingAreaCode_r14 = new TrackingAreaCode();
      trackingAreaCode_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode_r14", -1);

      // decode cellIdentity_r14

      buffer.getContext().eventDispatcher.startElement("cellIdentity_r14", -1);

      cellIdentity_r14 = new CellIdentity();
      cellIdentity_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_IdentityList_r14 != null) plmn_IdentityList_r14.print (_sb, "plmn_IdentityList_r14", _level+1);
      if (trackingAreaCode_r14 != null) trackingAreaCode_r14.print (_sb, "trackingAreaCode_r14", _level+1);
      if (cellIdentity_r14 != null) cellIdentity_r14.print (_sb, "cellIdentity_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
