/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellAccessRelatedInfo_EUTRA_5GC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellAccessRelatedInfo-EUTRA-5GC";
   }

   public PLMN_IdentityList_EUTRA_5GC plmn_IdentityList_eutra_5gc;
   public TrackingAreaCode trackingAreaCode_eutra_5gc;
   public RAN_AreaCode ranac_5gc;  // optional
   public CellIdentity_EUTRA_5GC cellIdentity_eutra_5gc;

   public CellAccessRelatedInfo_EUTRA_5GC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellAccessRelatedInfo_EUTRA_5GC (
      PLMN_IdentityList_EUTRA_5GC plmn_IdentityList_eutra_5gc_,
      TrackingAreaCode trackingAreaCode_eutra_5gc_,
      RAN_AreaCode ranac_5gc_,
      CellIdentity_EUTRA_5GC cellIdentity_eutra_5gc_
   ) {
      super();
      plmn_IdentityList_eutra_5gc = plmn_IdentityList_eutra_5gc_;
      trackingAreaCode_eutra_5gc = trackingAreaCode_eutra_5gc_;
      ranac_5gc = ranac_5gc_;
      cellIdentity_eutra_5gc = cellIdentity_eutra_5gc_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CellAccessRelatedInfo_EUTRA_5GC (
      PLMN_IdentityList_EUTRA_5GC plmn_IdentityList_eutra_5gc_,
      TrackingAreaCode trackingAreaCode_eutra_5gc_,
      CellIdentity_EUTRA_5GC cellIdentity_eutra_5gc_
   ) {
      super();
      plmn_IdentityList_eutra_5gc = plmn_IdentityList_eutra_5gc_;
      trackingAreaCode_eutra_5gc = trackingAreaCode_eutra_5gc_;
      cellIdentity_eutra_5gc = cellIdentity_eutra_5gc_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellAccessRelatedInfo_EUTRA_5GC (PLMN_IdentityList_EUTRA_5GC plmn_IdentityList_eutra_5gc_,
      TrackingAreaCode trackingAreaCode_eutra_5gc_,
      long ranac_5gc_,
      CellIdentity_EUTRA_5GC cellIdentity_eutra_5gc_
   ) {
      super();
      plmn_IdentityList_eutra_5gc = plmn_IdentityList_eutra_5gc_;
      trackingAreaCode_eutra_5gc = trackingAreaCode_eutra_5gc_;
      ranac_5gc = new RAN_AreaCode (ranac_5gc_);
      cellIdentity_eutra_5gc = cellIdentity_eutra_5gc_;
   }

   public void init () {
      plmn_IdentityList_eutra_5gc = null;
      trackingAreaCode_eutra_5gc = null;
      ranac_5gc = null;
      cellIdentity_eutra_5gc = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityList_eutra_5gc;
         case 1: return trackingAreaCode_eutra_5gc;
         case 2: return ranac_5gc;
         case 3: return cellIdentity_eutra_5gc;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityList-eutra-5gc";
         case 1: return "trackingAreaCode-eutra-5gc";
         case 2: return "ranac-5gc";
         case 3: return "cellIdentity-eutra-5gc";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ranac_5gcPresent = buffer.decodeBit ("ranac_5gcPresent");

      // decode plmn_IdentityList_eutra_5gc

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_eutra_5gc", -1);

      plmn_IdentityList_eutra_5gc = new PLMN_IdentityList_EUTRA_5GC();
      plmn_IdentityList_eutra_5gc.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_eutra_5gc", -1);

      // decode trackingAreaCode_eutra_5gc

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode_eutra_5gc", -1);

      trackingAreaCode_eutra_5gc = new TrackingAreaCode();
      trackingAreaCode_eutra_5gc.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode_eutra_5gc", -1);

      // decode ranac_5gc

      if (ranac_5gcPresent) {
         buffer.getContext().eventDispatcher.startElement("ranac_5gc", -1);

         ranac_5gc = new RAN_AreaCode();
         ranac_5gc.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ranac_5gc", -1);
      }
      else {
         ranac_5gc = null;
      }

      // decode cellIdentity_eutra_5gc

      buffer.getContext().eventDispatcher.startElement("cellIdentity_eutra_5gc", -1);

      cellIdentity_eutra_5gc = new CellIdentity_EUTRA_5GC();
      cellIdentity_eutra_5gc.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_eutra_5gc", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((ranac_5gc != null), null);

      // encode plmn_IdentityList_eutra_5gc

      if (plmn_IdentityList_eutra_5gc != null) {
         buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_eutra_5gc", -1);

         plmn_IdentityList_eutra_5gc.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_eutra_5gc", -1);
      }
      else throw new Asn1MissingRequiredException ("plmn_IdentityList_eutra_5gc");

      // encode trackingAreaCode_eutra_5gc

      if (trackingAreaCode_eutra_5gc != null) {
         buffer.getContext().eventDispatcher.startElement("trackingAreaCode_eutra_5gc", -1);

         trackingAreaCode_eutra_5gc.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("trackingAreaCode_eutra_5gc", -1);
      }
      else throw new Asn1MissingRequiredException ("trackingAreaCode_eutra_5gc");

      // encode ranac_5gc

      if (ranac_5gc != null) {
         buffer.getContext().eventDispatcher.startElement("ranac_5gc", -1);

         ranac_5gc.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ranac_5gc", -1);
      }

      // encode cellIdentity_eutra_5gc

      if (cellIdentity_eutra_5gc != null) {
         buffer.getContext().eventDispatcher.startElement("cellIdentity_eutra_5gc", -1);

         cellIdentity_eutra_5gc.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellIdentity_eutra_5gc", -1);
      }
      else throw new Asn1MissingRequiredException ("cellIdentity_eutra_5gc");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_IdentityList_eutra_5gc != null) plmn_IdentityList_eutra_5gc.print (_sb, "plmn_IdentityList_eutra_5gc", _level+1);
      if (trackingAreaCode_eutra_5gc != null) trackingAreaCode_eutra_5gc.print (_sb, "trackingAreaCode_eutra_5gc", _level+1);
      if (ranac_5gc != null) ranac_5gc.print (_sb, "ranac_5gc", _level+1);
      if (cellIdentity_eutra_5gc != null) cellIdentity_eutra_5gc.print (_sb, "cellIdentity_eutra_5gc", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
