/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CGI_Info_Logging_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CGI-Info-Logging-r16";
   }

   public PLMN_Identity plmn_Identity_r16;
   public CellIdentity cellIdentity_r16;
   public TrackingAreaCode trackingAreaCode_r16;  // optional

   public CGI_Info_Logging_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CGI_Info_Logging_r16 (
      PLMN_Identity plmn_Identity_r16_,
      CellIdentity cellIdentity_r16_,
      TrackingAreaCode trackingAreaCode_r16_
   ) {
      super();
      plmn_Identity_r16 = plmn_Identity_r16_;
      cellIdentity_r16 = cellIdentity_r16_;
      trackingAreaCode_r16 = trackingAreaCode_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CGI_Info_Logging_r16 (
      PLMN_Identity plmn_Identity_r16_,
      CellIdentity cellIdentity_r16_
   ) {
      super();
      plmn_Identity_r16 = plmn_Identity_r16_;
      cellIdentity_r16 = cellIdentity_r16_;
   }

   public void init () {
      plmn_Identity_r16 = null;
      cellIdentity_r16 = null;
      trackingAreaCode_r16 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return plmn_Identity_r16;
         case 1: return cellIdentity_r16;
         case 2: return trackingAreaCode_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "plmn-Identity-r16";
         case 1: return "cellIdentity-r16";
         case 2: return "trackingAreaCode-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean trackingAreaCode_r16Present = buffer.decodeBit ("trackingAreaCode_r16Present");

      // decode plmn_Identity_r16

      buffer.getContext().eventDispatcher.startElement("plmn_Identity_r16", -1);

      plmn_Identity_r16 = new PLMN_Identity();
      plmn_Identity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("plmn_Identity_r16", -1);

      // decode cellIdentity_r16

      buffer.getContext().eventDispatcher.startElement("cellIdentity_r16", -1);

      cellIdentity_r16 = new CellIdentity();
      cellIdentity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_r16", -1);

      // decode trackingAreaCode_r16

      if (trackingAreaCode_r16Present) {
         buffer.getContext().eventDispatcher.startElement("trackingAreaCode_r16", -1);

         trackingAreaCode_r16 = new TrackingAreaCode();
         trackingAreaCode_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("trackingAreaCode_r16", -1);
      }
      else {
         trackingAreaCode_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (plmn_Identity_r16 != null) plmn_Identity_r16.print (_sb, "plmn_Identity_r16", _level+1);
      if (cellIdentity_r16 != null) cellIdentity_r16.print (_sb, "cellIdentity_r16", _level+1);
      if (trackingAreaCode_r16 != null) trackingAreaCode_r16.print (_sb, "trackingAreaCode_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
