/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellAccessRelatedInfo_5GC_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellAccessRelatedInfo-5GC-r15";
   }

   public PLMN_IdentityList_r15 plmn_IdentityList_r15;
   public RAN_AreaCode_r15 ran_AreaCode_r15;  // optional
   public TrackingAreaCode_5GC_r15 trackingAreaCode_5GC_r15;
   public CellIdentity_5GC_r15 cellIdentity_5GC_r15;

   public CellAccessRelatedInfo_5GC_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellAccessRelatedInfo_5GC_r15 (
      PLMN_IdentityList_r15 plmn_IdentityList_r15_,
      RAN_AreaCode_r15 ran_AreaCode_r15_,
      TrackingAreaCode_5GC_r15 trackingAreaCode_5GC_r15_,
      CellIdentity_5GC_r15 cellIdentity_5GC_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      ran_AreaCode_r15 = ran_AreaCode_r15_;
      trackingAreaCode_5GC_r15 = trackingAreaCode_5GC_r15_;
      cellIdentity_5GC_r15 = cellIdentity_5GC_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CellAccessRelatedInfo_5GC_r15 (
      PLMN_IdentityList_r15 plmn_IdentityList_r15_,
      TrackingAreaCode_5GC_r15 trackingAreaCode_5GC_r15_,
      CellIdentity_5GC_r15 cellIdentity_5GC_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      trackingAreaCode_5GC_r15 = trackingAreaCode_5GC_r15_;
      cellIdentity_5GC_r15 = cellIdentity_5GC_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellAccessRelatedInfo_5GC_r15 (PLMN_IdentityList_r15 plmn_IdentityList_r15_,
      long ran_AreaCode_r15_,
      TrackingAreaCode_5GC_r15 trackingAreaCode_5GC_r15_,
      CellIdentity_5GC_r15 cellIdentity_5GC_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      ran_AreaCode_r15 = new RAN_AreaCode_r15 (ran_AreaCode_r15_);
      trackingAreaCode_5GC_r15 = trackingAreaCode_5GC_r15_;
      cellIdentity_5GC_r15 = cellIdentity_5GC_r15_;
   }

   public void init () {
      plmn_IdentityList_r15 = null;
      ran_AreaCode_r15 = null;
      trackingAreaCode_5GC_r15 = null;
      cellIdentity_5GC_r15 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityList_r15;
         case 1: return ran_AreaCode_r15;
         case 2: return trackingAreaCode_5GC_r15;
         case 3: return cellIdentity_5GC_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityList-r15";
         case 1: return "ran-AreaCode-r15";
         case 2: return "trackingAreaCode-5GC-r15";
         case 3: return "cellIdentity-5GC-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ran_AreaCode_r15Present = buffer.decodeBit ("ran_AreaCode_r15Present");

      // decode plmn_IdentityList_r15

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_r15", -1);

      plmn_IdentityList_r15 = new PLMN_IdentityList_r15();
      plmn_IdentityList_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_r15", -1);

      // decode ran_AreaCode_r15

      if (ran_AreaCode_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ran_AreaCode_r15", -1);

         ran_AreaCode_r15 = new RAN_AreaCode_r15();
         ran_AreaCode_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ran_AreaCode_r15", -1);
      }
      else {
         ran_AreaCode_r15 = null;
      }

      // decode trackingAreaCode_5GC_r15

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode_5GC_r15", -1);

      trackingAreaCode_5GC_r15 = new TrackingAreaCode_5GC_r15();
      trackingAreaCode_5GC_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode_5GC_r15", -1);

      // decode cellIdentity_5GC_r15

      buffer.getContext().eventDispatcher.startElement("cellIdentity_5GC_r15", -1);

      cellIdentity_5GC_r15 = new CellIdentity_5GC_r15();
      cellIdentity_5GC_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_5GC_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_IdentityList_r15 != null) plmn_IdentityList_r15.print (_sb, "plmn_IdentityList_r15", _level+1);
      if (ran_AreaCode_r15 != null) ran_AreaCode_r15.print (_sb, "ran_AreaCode_r15", _level+1);
      if (trackingAreaCode_5GC_r15 != null) trackingAreaCode_5GC_r15.print (_sb, "trackingAreaCode_5GC_r15", _level+1);
      if (cellIdentity_5GC_r15 != null) cellIdentity_5GC_r15.print (_sb, "cellIdentity_5GC_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
