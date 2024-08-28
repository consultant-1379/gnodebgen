/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PLMN_IdentityInfoNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PLMN-IdentityInfoNR-r15";
   }

   public PLMN_IdentityListNR_r15 plmn_IdentityList_r15;
   public TrackingAreaCodeNR_r15 trackingAreaCode_r15;  // optional
   public RAN_AreaCode_r15 ran_AreaCode_r15;  // optional
   public CellIdentityNR_r15 cellIdentity_r15;

   public PLMN_IdentityInfoNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PLMN_IdentityInfoNR_r15 (
      PLMN_IdentityListNR_r15 plmn_IdentityList_r15_,
      TrackingAreaCodeNR_r15 trackingAreaCode_r15_,
      RAN_AreaCode_r15 ran_AreaCode_r15_,
      CellIdentityNR_r15 cellIdentity_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      trackingAreaCode_r15 = trackingAreaCode_r15_;
      ran_AreaCode_r15 = ran_AreaCode_r15_;
      cellIdentity_r15 = cellIdentity_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PLMN_IdentityInfoNR_r15 (
      PLMN_IdentityListNR_r15 plmn_IdentityList_r15_,
      CellIdentityNR_r15 cellIdentity_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      cellIdentity_r15 = cellIdentity_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PLMN_IdentityInfoNR_r15 (PLMN_IdentityListNR_r15 plmn_IdentityList_r15_,
      TrackingAreaCodeNR_r15 trackingAreaCode_r15_,
      long ran_AreaCode_r15_,
      CellIdentityNR_r15 cellIdentity_r15_
   ) {
      super();
      plmn_IdentityList_r15 = plmn_IdentityList_r15_;
      trackingAreaCode_r15 = trackingAreaCode_r15_;
      ran_AreaCode_r15 = new RAN_AreaCode_r15 (ran_AreaCode_r15_);
      cellIdentity_r15 = cellIdentity_r15_;
   }

   public void init () {
      plmn_IdentityList_r15 = null;
      trackingAreaCode_r15 = null;
      ran_AreaCode_r15 = null;
      cellIdentity_r15 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_IdentityList_r15;
         case 1: return trackingAreaCode_r15;
         case 2: return ran_AreaCode_r15;
         case 3: return cellIdentity_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-IdentityList-r15";
         case 1: return "trackingAreaCode-r15";
         case 2: return "ran-AreaCode-r15";
         case 3: return "cellIdentity-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean trackingAreaCode_r15Present = buffer.decodeBit ("trackingAreaCode_r15Present");
      boolean ran_AreaCode_r15Present = buffer.decodeBit ("ran_AreaCode_r15Present");

      // decode plmn_IdentityList_r15

      buffer.getContext().eventDispatcher.startElement("plmn_IdentityList_r15", -1);

      plmn_IdentityList_r15 = new PLMN_IdentityListNR_r15();
      plmn_IdentityList_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_IdentityList_r15", -1);

      // decode trackingAreaCode_r15

      if (trackingAreaCode_r15Present) {
         buffer.getContext().eventDispatcher.startElement("trackingAreaCode_r15", -1);

         trackingAreaCode_r15 = new TrackingAreaCodeNR_r15();
         trackingAreaCode_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("trackingAreaCode_r15", -1);
      }
      else {
         trackingAreaCode_r15 = null;
      }

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

      // decode cellIdentity_r15

      buffer.getContext().eventDispatcher.startElement("cellIdentity_r15", -1);

      cellIdentity_r15 = new CellIdentityNR_r15();
      cellIdentity_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_IdentityList_r15 != null) plmn_IdentityList_r15.print (_sb, "plmn_IdentityList_r15", _level+1);
      if (trackingAreaCode_r15 != null) trackingAreaCode_r15.print (_sb, "trackingAreaCode_r15", _level+1);
      if (ran_AreaCode_r15 != null) ran_AreaCode_r15.print (_sb, "ran_AreaCode_r15", _level+1);
      if (cellIdentity_r15 != null) cellIdentity_r15.print (_sb, "cellIdentity_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
