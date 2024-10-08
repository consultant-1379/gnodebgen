/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LWA_Parameters_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LWA-Parameters-v1430";
   }

   public LWA_Parameters_v1430_lwa_HO_WithoutWT_Change_r14 lwa_HO_WithoutWT_Change_r14 = null;  // optional
   public LWA_Parameters_v1430_lwa_UL_r14 lwa_UL_r14 = null;  // optional
   public LWA_Parameters_v1430_wlan_PeriodicMeas_r14 wlan_PeriodicMeas_r14 = null;  // optional
   public LWA_Parameters_v1430_wlan_ReportAnyWLAN_r14 wlan_ReportAnyWLAN_r14 = null;  // optional
   public Asn1Integer wlan_SupportedDataRate_r14;  // optional

   public LWA_Parameters_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LWA_Parameters_v1430 (
      LWA_Parameters_v1430_lwa_HO_WithoutWT_Change_r14 lwa_HO_WithoutWT_Change_r14_,
      LWA_Parameters_v1430_lwa_UL_r14 lwa_UL_r14_,
      LWA_Parameters_v1430_wlan_PeriodicMeas_r14 wlan_PeriodicMeas_r14_,
      LWA_Parameters_v1430_wlan_ReportAnyWLAN_r14 wlan_ReportAnyWLAN_r14_,
      Asn1Integer wlan_SupportedDataRate_r14_
   ) {
      super();
      lwa_HO_WithoutWT_Change_r14 = lwa_HO_WithoutWT_Change_r14_;
      lwa_UL_r14 = lwa_UL_r14_;
      wlan_PeriodicMeas_r14 = wlan_PeriodicMeas_r14_;
      wlan_ReportAnyWLAN_r14 = wlan_ReportAnyWLAN_r14_;
      wlan_SupportedDataRate_r14 = wlan_SupportedDataRate_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LWA_Parameters_v1430 (LWA_Parameters_v1430_lwa_HO_WithoutWT_Change_r14 lwa_HO_WithoutWT_Change_r14_,
      LWA_Parameters_v1430_lwa_UL_r14 lwa_UL_r14_,
      LWA_Parameters_v1430_wlan_PeriodicMeas_r14 wlan_PeriodicMeas_r14_,
      LWA_Parameters_v1430_wlan_ReportAnyWLAN_r14 wlan_ReportAnyWLAN_r14_,
      long wlan_SupportedDataRate_r14_
   ) {
      super();
      lwa_HO_WithoutWT_Change_r14 = lwa_HO_WithoutWT_Change_r14_;
      lwa_UL_r14 = lwa_UL_r14_;
      wlan_PeriodicMeas_r14 = wlan_PeriodicMeas_r14_;
      wlan_ReportAnyWLAN_r14 = wlan_ReportAnyWLAN_r14_;
      wlan_SupportedDataRate_r14 = new Asn1Integer (wlan_SupportedDataRate_r14_);
   }

   public void init () {
      lwa_HO_WithoutWT_Change_r14 = null;
      lwa_UL_r14 = null;
      wlan_PeriodicMeas_r14 = null;
      wlan_ReportAnyWLAN_r14 = null;
      wlan_SupportedDataRate_r14 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return lwa_HO_WithoutWT_Change_r14;
         case 1: return lwa_UL_r14;
         case 2: return wlan_PeriodicMeas_r14;
         case 3: return wlan_ReportAnyWLAN_r14;
         case 4: return wlan_SupportedDataRate_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "lwa-HO-WithoutWT-Change-r14";
         case 1: return "lwa-UL-r14";
         case 2: return "wlan-PeriodicMeas-r14";
         case 3: return "wlan-ReportAnyWLAN-r14";
         case 4: return "wlan-SupportedDataRate-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lwa_HO_WithoutWT_Change_r14Present = buffer.decodeBit ("lwa_HO_WithoutWT_Change_r14Present");
      boolean lwa_UL_r14Present = buffer.decodeBit ("lwa_UL_r14Present");
      boolean wlan_PeriodicMeas_r14Present = buffer.decodeBit ("wlan_PeriodicMeas_r14Present");
      boolean wlan_ReportAnyWLAN_r14Present = buffer.decodeBit ("wlan_ReportAnyWLAN_r14Present");
      boolean wlan_SupportedDataRate_r14Present = buffer.decodeBit ("wlan_SupportedDataRate_r14Present");

      // decode lwa_HO_WithoutWT_Change_r14

      if (lwa_HO_WithoutWT_Change_r14Present) {
         buffer.getContext().eventDispatcher.startElement("lwa_HO_WithoutWT_Change_r14", -1);

         int tval = LWA_Parameters_v1430_lwa_HO_WithoutWT_Change_r14.decodeEnumValue (buffer);
         lwa_HO_WithoutWT_Change_r14 = LWA_Parameters_v1430_lwa_HO_WithoutWT_Change_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lwa_HO_WithoutWT_Change_r14", -1);
      }
      else {
         lwa_HO_WithoutWT_Change_r14 = null;
      }

      // decode lwa_UL_r14

      if (lwa_UL_r14Present) {
         buffer.getContext().eventDispatcher.startElement("lwa_UL_r14", -1);

         int tval = LWA_Parameters_v1430_lwa_UL_r14.decodeEnumValue (buffer);
         lwa_UL_r14 = LWA_Parameters_v1430_lwa_UL_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lwa_UL_r14", -1);
      }
      else {
         lwa_UL_r14 = null;
      }

      // decode wlan_PeriodicMeas_r14

      if (wlan_PeriodicMeas_r14Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_PeriodicMeas_r14", -1);

         int tval = LWA_Parameters_v1430_wlan_PeriodicMeas_r14.decodeEnumValue (buffer);
         wlan_PeriodicMeas_r14 = LWA_Parameters_v1430_wlan_PeriodicMeas_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("wlan_PeriodicMeas_r14", -1);
      }
      else {
         wlan_PeriodicMeas_r14 = null;
      }

      // decode wlan_ReportAnyWLAN_r14

      if (wlan_ReportAnyWLAN_r14Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_ReportAnyWLAN_r14", -1);

         int tval = LWA_Parameters_v1430_wlan_ReportAnyWLAN_r14.decodeEnumValue (buffer);
         wlan_ReportAnyWLAN_r14 = LWA_Parameters_v1430_wlan_ReportAnyWLAN_r14.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("wlan_ReportAnyWLAN_r14", -1);
      }
      else {
         wlan_ReportAnyWLAN_r14 = null;
      }

      // decode wlan_SupportedDataRate_r14

      if (wlan_SupportedDataRate_r14Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_SupportedDataRate_r14", -1);

         wlan_SupportedDataRate_r14 = new Asn1Integer();
         wlan_SupportedDataRate_r14.decode (buffer, 1, 2048);

         buffer.invokeCharacters(wlan_SupportedDataRate_r14.toString());
         buffer.getContext().eventDispatcher.endElement("wlan_SupportedDataRate_r14", -1);
      }
      else {
         wlan_SupportedDataRate_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (lwa_HO_WithoutWT_Change_r14 != null) lwa_HO_WithoutWT_Change_r14.print (_sb, "lwa_HO_WithoutWT_Change_r14", _level+1);
      if (lwa_UL_r14 != null) lwa_UL_r14.print (_sb, "lwa_UL_r14", _level+1);
      if (wlan_PeriodicMeas_r14 != null) wlan_PeriodicMeas_r14.print (_sb, "wlan_PeriodicMeas_r14", _level+1);
      if (wlan_ReportAnyWLAN_r14 != null) wlan_ReportAnyWLAN_r14.print (_sb, "wlan_ReportAnyWLAN_r14", _level+1);
      if (wlan_SupportedDataRate_r14 != null) wlan_SupportedDataRate_r14.print (_sb, "wlan_SupportedDataRate_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
