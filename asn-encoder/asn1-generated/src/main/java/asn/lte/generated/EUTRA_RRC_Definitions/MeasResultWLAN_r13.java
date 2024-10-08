/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultWLAN_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasResultWLAN-r13";
   }

   public WLAN_Identifiers_r12 wlan_Identifiers_r13;
   public WLAN_CarrierInfo_r13 carrierInfoWLAN_r13;  // optional
   public WLAN_BandIndicator_r13 bandWLAN_r13 = null;  // optional
   public WLAN_RSSI_Range_r13 rssiWLAN_r13;
   public Asn1Integer availableAdmissionCapacityWLAN_r13;  // optional
   public WLAN_backhaulRate_r12 backhaulDL_BandwidthWLAN_r13 = null;  // optional
   public WLAN_backhaulRate_r12 backhaulUL_BandwidthWLAN_r13 = null;  // optional
   public Asn1Integer channelUtilizationWLAN_r13;  // optional
   public Asn1Integer stationCountWLAN_r13;  // optional
   public MeasResultWLAN_r13_connectedWLAN_r13 connectedWLAN_r13 = null;  // optional
   public Asn1OpenExt extElem1;

   public MeasResultWLAN_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultWLAN_r13 (
      WLAN_Identifiers_r12 wlan_Identifiers_r13_,
      WLAN_CarrierInfo_r13 carrierInfoWLAN_r13_,
      WLAN_BandIndicator_r13 bandWLAN_r13_,
      WLAN_RSSI_Range_r13 rssiWLAN_r13_,
      Asn1Integer availableAdmissionCapacityWLAN_r13_,
      WLAN_backhaulRate_r12 backhaulDL_BandwidthWLAN_r13_,
      WLAN_backhaulRate_r12 backhaulUL_BandwidthWLAN_r13_,
      Asn1Integer channelUtilizationWLAN_r13_,
      Asn1Integer stationCountWLAN_r13_,
      MeasResultWLAN_r13_connectedWLAN_r13 connectedWLAN_r13_
   ) {
      super();
      wlan_Identifiers_r13 = wlan_Identifiers_r13_;
      carrierInfoWLAN_r13 = carrierInfoWLAN_r13_;
      bandWLAN_r13 = bandWLAN_r13_;
      rssiWLAN_r13 = rssiWLAN_r13_;
      availableAdmissionCapacityWLAN_r13 = availableAdmissionCapacityWLAN_r13_;
      backhaulDL_BandwidthWLAN_r13 = backhaulDL_BandwidthWLAN_r13_;
      backhaulUL_BandwidthWLAN_r13 = backhaulUL_BandwidthWLAN_r13_;
      channelUtilizationWLAN_r13 = channelUtilizationWLAN_r13_;
      stationCountWLAN_r13 = stationCountWLAN_r13_;
      connectedWLAN_r13 = connectedWLAN_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasResultWLAN_r13 (
      WLAN_Identifiers_r12 wlan_Identifiers_r13_,
      WLAN_RSSI_Range_r13 rssiWLAN_r13_
   ) {
      super();
      wlan_Identifiers_r13 = wlan_Identifiers_r13_;
      rssiWLAN_r13 = rssiWLAN_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultWLAN_r13 (WLAN_Identifiers_r12 wlan_Identifiers_r13_,
      WLAN_CarrierInfo_r13 carrierInfoWLAN_r13_,
      WLAN_BandIndicator_r13 bandWLAN_r13_,
      long rssiWLAN_r13_,
      long availableAdmissionCapacityWLAN_r13_,
      WLAN_backhaulRate_r12 backhaulDL_BandwidthWLAN_r13_,
      WLAN_backhaulRate_r12 backhaulUL_BandwidthWLAN_r13_,
      long channelUtilizationWLAN_r13_,
      long stationCountWLAN_r13_,
      MeasResultWLAN_r13_connectedWLAN_r13 connectedWLAN_r13_
   ) {
      super();
      wlan_Identifiers_r13 = wlan_Identifiers_r13_;
      carrierInfoWLAN_r13 = carrierInfoWLAN_r13_;
      bandWLAN_r13 = bandWLAN_r13_;
      rssiWLAN_r13 = new WLAN_RSSI_Range_r13 (rssiWLAN_r13_);
      availableAdmissionCapacityWLAN_r13 = new Asn1Integer (availableAdmissionCapacityWLAN_r13_);
      backhaulDL_BandwidthWLAN_r13 = backhaulDL_BandwidthWLAN_r13_;
      backhaulUL_BandwidthWLAN_r13 = backhaulUL_BandwidthWLAN_r13_;
      channelUtilizationWLAN_r13 = new Asn1Integer (channelUtilizationWLAN_r13_);
      stationCountWLAN_r13 = new Asn1Integer (stationCountWLAN_r13_);
      connectedWLAN_r13 = connectedWLAN_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasResultWLAN_r13 (
      WLAN_Identifiers_r12 wlan_Identifiers_r13_,
      long rssiWLAN_r13_
   ) {
      super();
      wlan_Identifiers_r13 = wlan_Identifiers_r13_;
      rssiWLAN_r13 = new WLAN_RSSI_Range_r13 (rssiWLAN_r13_);
   }

   public void init () {
      wlan_Identifiers_r13 = null;
      carrierInfoWLAN_r13 = null;
      bandWLAN_r13 = null;
      rssiWLAN_r13 = null;
      availableAdmissionCapacityWLAN_r13 = null;
      backhaulDL_BandwidthWLAN_r13 = null;
      backhaulUL_BandwidthWLAN_r13 = null;
      channelUtilizationWLAN_r13 = null;
      stationCountWLAN_r13 = null;
      connectedWLAN_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return wlan_Identifiers_r13;
         case 1: return carrierInfoWLAN_r13;
         case 2: return bandWLAN_r13;
         case 3: return rssiWLAN_r13;
         case 4: return availableAdmissionCapacityWLAN_r13;
         case 5: return backhaulDL_BandwidthWLAN_r13;
         case 6: return backhaulUL_BandwidthWLAN_r13;
         case 7: return channelUtilizationWLAN_r13;
         case 8: return stationCountWLAN_r13;
         case 9: return connectedWLAN_r13;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "wlan-Identifiers-r13";
         case 1: return "carrierInfoWLAN-r13";
         case 2: return "bandWLAN-r13";
         case 3: return "rssiWLAN-r13";
         case 4: return "availableAdmissionCapacityWLAN-r13";
         case 5: return "backhaulDL-BandwidthWLAN-r13";
         case 6: return "backhaulUL-BandwidthWLAN-r13";
         case 7: return "channelUtilizationWLAN-r13";
         case 8: return "stationCountWLAN-r13";
         case 9: return "connectedWLAN-r13";
         case 10: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean carrierInfoWLAN_r13Present = buffer.decodeBit ("carrierInfoWLAN_r13Present");
      boolean bandWLAN_r13Present = buffer.decodeBit ("bandWLAN_r13Present");
      boolean availableAdmissionCapacityWLAN_r13Present = buffer.decodeBit ("availableAdmissionCapacityWLAN_r13Present");
      boolean backhaulDL_BandwidthWLAN_r13Present = buffer.decodeBit ("backhaulDL_BandwidthWLAN_r13Present");
      boolean backhaulUL_BandwidthWLAN_r13Present = buffer.decodeBit ("backhaulUL_BandwidthWLAN_r13Present");
      boolean channelUtilizationWLAN_r13Present = buffer.decodeBit ("channelUtilizationWLAN_r13Present");
      boolean stationCountWLAN_r13Present = buffer.decodeBit ("stationCountWLAN_r13Present");
      boolean connectedWLAN_r13Present = buffer.decodeBit ("connectedWLAN_r13Present");

      // decode wlan_Identifiers_r13

      buffer.getContext().eventDispatcher.startElement("wlan_Identifiers_r13", -1);

      wlan_Identifiers_r13 = new WLAN_Identifiers_r12();
      wlan_Identifiers_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("wlan_Identifiers_r13", -1);

      // decode carrierInfoWLAN_r13

      if (carrierInfoWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("carrierInfoWLAN_r13", -1);

         carrierInfoWLAN_r13 = new WLAN_CarrierInfo_r13();
         carrierInfoWLAN_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("carrierInfoWLAN_r13", -1);
      }
      else {
         carrierInfoWLAN_r13 = null;
      }

      // decode bandWLAN_r13

      if (bandWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("bandWLAN_r13", -1);

         int tval = WLAN_BandIndicator_r13.decodeEnumValue (buffer);
         bandWLAN_r13 = WLAN_BandIndicator_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bandWLAN_r13", -1);
      }
      else {
         bandWLAN_r13 = null;
      }

      // decode rssiWLAN_r13

      buffer.getContext().eventDispatcher.startElement("rssiWLAN_r13", -1);

      rssiWLAN_r13 = new WLAN_RSSI_Range_r13();
      rssiWLAN_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rssiWLAN_r13", -1);

      // decode availableAdmissionCapacityWLAN_r13

      if (availableAdmissionCapacityWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("availableAdmissionCapacityWLAN_r13", -1);

         availableAdmissionCapacityWLAN_r13 = new Asn1Integer();
         availableAdmissionCapacityWLAN_r13.decode (buffer, 0, 31250);

         buffer.invokeCharacters(availableAdmissionCapacityWLAN_r13.toString());
         buffer.getContext().eventDispatcher.endElement("availableAdmissionCapacityWLAN_r13", -1);
      }
      else {
         availableAdmissionCapacityWLAN_r13 = null;
      }

      // decode backhaulDL_BandwidthWLAN_r13

      if (backhaulDL_BandwidthWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("backhaulDL_BandwidthWLAN_r13", -1);

         int tval = WLAN_backhaulRate_r12.decodeEnumValue (buffer);
         backhaulDL_BandwidthWLAN_r13 = WLAN_backhaulRate_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("backhaulDL_BandwidthWLAN_r13", -1);
      }
      else {
         backhaulDL_BandwidthWLAN_r13 = null;
      }

      // decode backhaulUL_BandwidthWLAN_r13

      if (backhaulUL_BandwidthWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("backhaulUL_BandwidthWLAN_r13", -1);

         int tval = WLAN_backhaulRate_r12.decodeEnumValue (buffer);
         backhaulUL_BandwidthWLAN_r13 = WLAN_backhaulRate_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("backhaulUL_BandwidthWLAN_r13", -1);
      }
      else {
         backhaulUL_BandwidthWLAN_r13 = null;
      }

      // decode channelUtilizationWLAN_r13

      if (channelUtilizationWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("channelUtilizationWLAN_r13", -1);

         channelUtilizationWLAN_r13 = new Asn1Integer();
         channelUtilizationWLAN_r13.decode (buffer, 0, 255);

         buffer.invokeCharacters(channelUtilizationWLAN_r13.toString());
         buffer.getContext().eventDispatcher.endElement("channelUtilizationWLAN_r13", -1);
      }
      else {
         channelUtilizationWLAN_r13 = null;
      }

      // decode stationCountWLAN_r13

      if (stationCountWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("stationCountWLAN_r13", -1);

         stationCountWLAN_r13 = new Asn1Integer();
         stationCountWLAN_r13.decode (buffer, 0, 65535);

         buffer.invokeCharacters(stationCountWLAN_r13.toString());
         buffer.getContext().eventDispatcher.endElement("stationCountWLAN_r13", -1);
      }
      else {
         stationCountWLAN_r13 = null;
      }

      // decode connectedWLAN_r13

      if (connectedWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("connectedWLAN_r13", -1);

         int tval = MeasResultWLAN_r13_connectedWLAN_r13.decodeEnumValue (buffer);
         connectedWLAN_r13 = MeasResultWLAN_r13_connectedWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("connectedWLAN_r13", -1);
      }
      else {
         connectedWLAN_r13 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (wlan_Identifiers_r13 != null) wlan_Identifiers_r13.print (_sb, "wlan_Identifiers_r13", _level+1);
      if (carrierInfoWLAN_r13 != null) carrierInfoWLAN_r13.print (_sb, "carrierInfoWLAN_r13", _level+1);
      if (bandWLAN_r13 != null) bandWLAN_r13.print (_sb, "bandWLAN_r13", _level+1);
      if (rssiWLAN_r13 != null) rssiWLAN_r13.print (_sb, "rssiWLAN_r13", _level+1);
      if (availableAdmissionCapacityWLAN_r13 != null) availableAdmissionCapacityWLAN_r13.print (_sb, "availableAdmissionCapacityWLAN_r13", _level+1);
      if (backhaulDL_BandwidthWLAN_r13 != null) backhaulDL_BandwidthWLAN_r13.print (_sb, "backhaulDL_BandwidthWLAN_r13", _level+1);
      if (backhaulUL_BandwidthWLAN_r13 != null) backhaulUL_BandwidthWLAN_r13.print (_sb, "backhaulUL_BandwidthWLAN_r13", _level+1);
      if (channelUtilizationWLAN_r13 != null) channelUtilizationWLAN_r13.print (_sb, "channelUtilizationWLAN_r13", _level+1);
      if (stationCountWLAN_r13 != null) stationCountWLAN_r13.print (_sb, "stationCountWLAN_r13", _level+1);
      if (connectedWLAN_r13 != null) connectedWLAN_r13.print (_sb, "connectedWLAN_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
