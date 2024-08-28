/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_OffsetIndicator_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SubframeBitmapSL_r14;
import asn.lte.generated.EUTRA_RRC_Definitions.P0_SL_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_P2X_ResourceSelectionConfig_r14;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_SyncAllowed_r14;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_RestrictResourceReservationPeriodList_r14;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_MinT2ValueList_r15;

public class SL_V2X_PreconfigCommPool_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-V2X-PreconfigCommPool-r14";
   }

   public SL_OffsetIndicator_r12 sl_OffsetIndicator_r14;  // optional
   public SubframeBitmapSL_r14 sl_Subframe_r14;
   public Asn1Boolean adjacencyPSCCH_PSSCH_r14;
   public SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14 sizeSubchannel_r14 = null;
   public SL_V2X_PreconfigCommPool_r14_numSubchannel_r14 numSubchannel_r14 = null;
   public Asn1Integer startRB_Subchannel_r14;
   public Asn1Integer startRB_PSCCH_Pool_r14;  // optional
   public P0_SL_r12 dataTxParameters_r14;
   public Asn1Integer zoneID_r14;  // optional
   public Asn1Integer threshS_RSSI_CBR_r14;  // optional
   public SL_CBR_PPPP_TxPreconfigList_r14 cbr_pssch_TxConfigList_r14;  // optional
   public SL_P2X_ResourceSelectionConfig_r14 resourceSelectionConfigP2X_r14;  // optional
   public SL_SyncAllowed_r14 syncAllowed_r14;  // optional
   public SL_RestrictResourceReservationPeriodList_r14 restrictResourceReservationPeriod_r14;  // optional
   public boolean mV2ExtPresent;
   public SL_MinT2ValueList_r15 sl_MinT2ValueList_r15;  // optional
   public SL_CBR_PPPP_TxPreconfigList_v1530 cbr_pssch_TxConfigList_v1530;  // optional
   public Asn1OpenExt extElem1;

   public SL_V2X_PreconfigCommPool_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_V2X_PreconfigCommPool_r14 (
      SL_OffsetIndicator_r12 sl_OffsetIndicator_r14_,
      SubframeBitmapSL_r14 sl_Subframe_r14_,
      Asn1Boolean adjacencyPSCCH_PSSCH_r14_,
      SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14 sizeSubchannel_r14_,
      SL_V2X_PreconfigCommPool_r14_numSubchannel_r14 numSubchannel_r14_,
      Asn1Integer startRB_Subchannel_r14_,
      Asn1Integer startRB_PSCCH_Pool_r14_,
      P0_SL_r12 dataTxParameters_r14_,
      Asn1Integer zoneID_r14_,
      Asn1Integer threshS_RSSI_CBR_r14_,
      SL_CBR_PPPP_TxPreconfigList_r14 cbr_pssch_TxConfigList_r14_,
      SL_P2X_ResourceSelectionConfig_r14 resourceSelectionConfigP2X_r14_,
      SL_SyncAllowed_r14 syncAllowed_r14_,
      SL_RestrictResourceReservationPeriodList_r14 restrictResourceReservationPeriod_r14_,
      SL_MinT2ValueList_r15 sl_MinT2ValueList_r15_,
      SL_CBR_PPPP_TxPreconfigList_v1530 cbr_pssch_TxConfigList_v1530_
   ) {
      super();
      sl_OffsetIndicator_r14 = sl_OffsetIndicator_r14_;
      sl_Subframe_r14 = sl_Subframe_r14_;
      adjacencyPSCCH_PSSCH_r14 = adjacencyPSCCH_PSSCH_r14_;
      sizeSubchannel_r14 = sizeSubchannel_r14_;
      numSubchannel_r14 = numSubchannel_r14_;
      startRB_Subchannel_r14 = startRB_Subchannel_r14_;
      startRB_PSCCH_Pool_r14 = startRB_PSCCH_Pool_r14_;
      dataTxParameters_r14 = dataTxParameters_r14_;
      zoneID_r14 = zoneID_r14_;
      threshS_RSSI_CBR_r14 = threshS_RSSI_CBR_r14_;
      cbr_pssch_TxConfigList_r14 = cbr_pssch_TxConfigList_r14_;
      resourceSelectionConfigP2X_r14 = resourceSelectionConfigP2X_r14_;
      syncAllowed_r14 = syncAllowed_r14_;
      restrictResourceReservationPeriod_r14 = restrictResourceReservationPeriod_r14_;
      sl_MinT2ValueList_r15 = sl_MinT2ValueList_r15_;
      cbr_pssch_TxConfigList_v1530 = cbr_pssch_TxConfigList_v1530_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_V2X_PreconfigCommPool_r14 (
      SubframeBitmapSL_r14 sl_Subframe_r14_,
      Asn1Boolean adjacencyPSCCH_PSSCH_r14_,
      SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14 sizeSubchannel_r14_,
      SL_V2X_PreconfigCommPool_r14_numSubchannel_r14 numSubchannel_r14_,
      Asn1Integer startRB_Subchannel_r14_,
      P0_SL_r12 dataTxParameters_r14_
   ) {
      super();
      sl_Subframe_r14 = sl_Subframe_r14_;
      adjacencyPSCCH_PSSCH_r14 = adjacencyPSCCH_PSSCH_r14_;
      sizeSubchannel_r14 = sizeSubchannel_r14_;
      numSubchannel_r14 = numSubchannel_r14_;
      startRB_Subchannel_r14 = startRB_Subchannel_r14_;
      dataTxParameters_r14 = dataTxParameters_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_V2X_PreconfigCommPool_r14 (SL_OffsetIndicator_r12 sl_OffsetIndicator_r14_,
      SubframeBitmapSL_r14 sl_Subframe_r14_,
      boolean adjacencyPSCCH_PSSCH_r14_,
      SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14 sizeSubchannel_r14_,
      SL_V2X_PreconfigCommPool_r14_numSubchannel_r14 numSubchannel_r14_,
      long startRB_Subchannel_r14_,
      long startRB_PSCCH_Pool_r14_,
      long dataTxParameters_r14_,
      long zoneID_r14_,
      long threshS_RSSI_CBR_r14_,
      SL_CBR_PPPP_TxPreconfigList_r14 cbr_pssch_TxConfigList_r14_,
      SL_P2X_ResourceSelectionConfig_r14 resourceSelectionConfigP2X_r14_,
      SL_SyncAllowed_r14 syncAllowed_r14_,
      SL_RestrictResourceReservationPeriodList_r14 restrictResourceReservationPeriod_r14_,
      SL_MinT2ValueList_r15 sl_MinT2ValueList_r15_,
      SL_CBR_PPPP_TxPreconfigList_v1530 cbr_pssch_TxConfigList_v1530_
   ) {
      super();
      sl_OffsetIndicator_r14 = sl_OffsetIndicator_r14_;
      sl_Subframe_r14 = sl_Subframe_r14_;
      adjacencyPSCCH_PSSCH_r14 = new Asn1Boolean (adjacencyPSCCH_PSSCH_r14_);
      sizeSubchannel_r14 = sizeSubchannel_r14_;
      numSubchannel_r14 = numSubchannel_r14_;
      startRB_Subchannel_r14 = new Asn1Integer (startRB_Subchannel_r14_);
      startRB_PSCCH_Pool_r14 = new Asn1Integer (startRB_PSCCH_Pool_r14_);
      dataTxParameters_r14 = new P0_SL_r12 (dataTxParameters_r14_);
      zoneID_r14 = new Asn1Integer (zoneID_r14_);
      threshS_RSSI_CBR_r14 = new Asn1Integer (threshS_RSSI_CBR_r14_);
      cbr_pssch_TxConfigList_r14 = cbr_pssch_TxConfigList_r14_;
      resourceSelectionConfigP2X_r14 = resourceSelectionConfigP2X_r14_;
      syncAllowed_r14 = syncAllowed_r14_;
      restrictResourceReservationPeriod_r14 = restrictResourceReservationPeriod_r14_;
      sl_MinT2ValueList_r15 = sl_MinT2ValueList_r15_;
      cbr_pssch_TxConfigList_v1530 = cbr_pssch_TxConfigList_v1530_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_V2X_PreconfigCommPool_r14 (
      SubframeBitmapSL_r14 sl_Subframe_r14_,
      boolean adjacencyPSCCH_PSSCH_r14_,
      SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14 sizeSubchannel_r14_,
      SL_V2X_PreconfigCommPool_r14_numSubchannel_r14 numSubchannel_r14_,
      long startRB_Subchannel_r14_,
      long dataTxParameters_r14_
   ) {
      super();
      sl_Subframe_r14 = sl_Subframe_r14_;
      adjacencyPSCCH_PSSCH_r14 = new Asn1Boolean (adjacencyPSCCH_PSSCH_r14_);
      sizeSubchannel_r14 = sizeSubchannel_r14_;
      numSubchannel_r14 = numSubchannel_r14_;
      startRB_Subchannel_r14 = new Asn1Integer (startRB_Subchannel_r14_);
      dataTxParameters_r14 = new P0_SL_r12 (dataTxParameters_r14_);
   }

   public void init () {
      sl_OffsetIndicator_r14 = null;
      sl_Subframe_r14 = null;
      adjacencyPSCCH_PSSCH_r14 = null;
      sizeSubchannel_r14 = null;
      numSubchannel_r14 = null;
      startRB_Subchannel_r14 = null;
      startRB_PSCCH_Pool_r14 = null;
      dataTxParameters_r14 = null;
      zoneID_r14 = null;
      threshS_RSSI_CBR_r14 = null;
      cbr_pssch_TxConfigList_r14 = null;
      resourceSelectionConfigP2X_r14 = null;
      syncAllowed_r14 = null;
      restrictResourceReservationPeriod_r14 = null;
      sl_MinT2ValueList_r15 = null;
      cbr_pssch_TxConfigList_v1530 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 17; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_OffsetIndicator_r14;
         case 1: return sl_Subframe_r14;
         case 2: return adjacencyPSCCH_PSSCH_r14;
         case 3: return sizeSubchannel_r14;
         case 4: return numSubchannel_r14;
         case 5: return startRB_Subchannel_r14;
         case 6: return startRB_PSCCH_Pool_r14;
         case 7: return dataTxParameters_r14;
         case 8: return zoneID_r14;
         case 9: return threshS_RSSI_CBR_r14;
         case 10: return cbr_pssch_TxConfigList_r14;
         case 11: return resourceSelectionConfigP2X_r14;
         case 12: return syncAllowed_r14;
         case 13: return restrictResourceReservationPeriod_r14;
         case 14: return sl_MinT2ValueList_r15;
         case 15: return cbr_pssch_TxConfigList_v1530;
         case 16: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-OffsetIndicator-r14";
         case 1: return "sl-Subframe-r14";
         case 2: return "adjacencyPSCCH-PSSCH-r14";
         case 3: return "sizeSubchannel-r14";
         case 4: return "numSubchannel-r14";
         case 5: return "startRB-Subchannel-r14";
         case 6: return "startRB-PSCCH-Pool-r14";
         case 7: return "dataTxParameters-r14";
         case 8: return "zoneID-r14";
         case 9: return "threshS-RSSI-CBR-r14";
         case 10: return "cbr-pssch-TxConfigList-r14";
         case 11: return "resourceSelectionConfigP2X-r14";
         case 12: return "syncAllowed-r14";
         case 13: return "restrictResourceReservationPeriod-r14";
         case 14: return "sl-MinT2ValueList-r15";
         case 15: return "cbr-pssch-TxConfigList-v1530";
         case 16: return null;
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

      boolean sl_OffsetIndicator_r14Present = buffer.decodeBit ("sl_OffsetIndicator_r14Present");
      boolean startRB_PSCCH_Pool_r14Present = buffer.decodeBit ("startRB_PSCCH_Pool_r14Present");
      boolean zoneID_r14Present = buffer.decodeBit ("zoneID_r14Present");
      boolean threshS_RSSI_CBR_r14Present = buffer.decodeBit ("threshS_RSSI_CBR_r14Present");
      boolean cbr_pssch_TxConfigList_r14Present = buffer.decodeBit ("cbr_pssch_TxConfigList_r14Present");
      boolean resourceSelectionConfigP2X_r14Present = buffer.decodeBit ("resourceSelectionConfigP2X_r14Present");
      boolean syncAllowed_r14Present = buffer.decodeBit ("syncAllowed_r14Present");
      boolean restrictResourceReservationPeriod_r14Present = buffer.decodeBit ("restrictResourceReservationPeriod_r14Present");

      // decode sl_OffsetIndicator_r14

      if (sl_OffsetIndicator_r14Present) {
         buffer.getContext().eventDispatcher.startElement("sl_OffsetIndicator_r14", -1);

         sl_OffsetIndicator_r14 = new SL_OffsetIndicator_r12();
         sl_OffsetIndicator_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_OffsetIndicator_r14", -1);
      }
      else {
         sl_OffsetIndicator_r14 = null;
      }

      // decode sl_Subframe_r14

      buffer.getContext().eventDispatcher.startElement("sl_Subframe_r14", -1);

      sl_Subframe_r14 = new SubframeBitmapSL_r14();
      sl_Subframe_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_Subframe_r14", -1);

      // decode adjacencyPSCCH_PSSCH_r14

      buffer.getContext().eventDispatcher.startElement("adjacencyPSCCH_PSSCH_r14", -1);

      adjacencyPSCCH_PSSCH_r14 = new Asn1Boolean();
      adjacencyPSCCH_PSSCH_r14.decode (buffer);

      buffer.invokeCharacters(adjacencyPSCCH_PSSCH_r14.toString());
      buffer.getContext().eventDispatcher.endElement("adjacencyPSCCH_PSSCH_r14", -1);

      // decode sizeSubchannel_r14

      buffer.getContext().eventDispatcher.startElement("sizeSubchannel_r14", -1);

      {
         int tval = SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14.decodeEnumValue (buffer);
         sizeSubchannel_r14 = SL_V2X_PreconfigCommPool_r14_sizeSubchannel_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sizeSubchannel_r14", -1);

      // decode numSubchannel_r14

      buffer.getContext().eventDispatcher.startElement("numSubchannel_r14", -1);

      {
         int tval = SL_V2X_PreconfigCommPool_r14_numSubchannel_r14.decodeEnumValue (buffer);
         numSubchannel_r14 = SL_V2X_PreconfigCommPool_r14_numSubchannel_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("numSubchannel_r14", -1);

      // decode startRB_Subchannel_r14

      buffer.getContext().eventDispatcher.startElement("startRB_Subchannel_r14", -1);

      startRB_Subchannel_r14 = new Asn1Integer();
      startRB_Subchannel_r14.decode (buffer, 0, 99);

      buffer.invokeCharacters(startRB_Subchannel_r14.toString());
      buffer.getContext().eventDispatcher.endElement("startRB_Subchannel_r14", -1);

      // decode startRB_PSCCH_Pool_r14

      if (startRB_PSCCH_Pool_r14Present) {
         buffer.getContext().eventDispatcher.startElement("startRB_PSCCH_Pool_r14", -1);

         startRB_PSCCH_Pool_r14 = new Asn1Integer();
         startRB_PSCCH_Pool_r14.decode (buffer, 0, 99);

         buffer.invokeCharacters(startRB_PSCCH_Pool_r14.toString());
         buffer.getContext().eventDispatcher.endElement("startRB_PSCCH_Pool_r14", -1);
      }
      else {
         startRB_PSCCH_Pool_r14 = null;
      }

      // decode dataTxParameters_r14

      buffer.getContext().eventDispatcher.startElement("dataTxParameters_r14", -1);

      dataTxParameters_r14 = new P0_SL_r12();
      dataTxParameters_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dataTxParameters_r14", -1);

      // decode zoneID_r14

      if (zoneID_r14Present) {
         buffer.getContext().eventDispatcher.startElement("zoneID_r14", -1);

         zoneID_r14 = new Asn1Integer();
         zoneID_r14.decode (buffer, 0, 7);

         buffer.invokeCharacters(zoneID_r14.toString());
         buffer.getContext().eventDispatcher.endElement("zoneID_r14", -1);
      }
      else {
         zoneID_r14 = null;
      }

      // decode threshS_RSSI_CBR_r14

      if (threshS_RSSI_CBR_r14Present) {
         buffer.getContext().eventDispatcher.startElement("threshS_RSSI_CBR_r14", -1);

         threshS_RSSI_CBR_r14 = new Asn1Integer();
         threshS_RSSI_CBR_r14.decode (buffer, 0, 45);

         buffer.invokeCharacters(threshS_RSSI_CBR_r14.toString());
         buffer.getContext().eventDispatcher.endElement("threshS_RSSI_CBR_r14", -1);
      }
      else {
         threshS_RSSI_CBR_r14 = null;
      }

      // decode cbr_pssch_TxConfigList_r14

      if (cbr_pssch_TxConfigList_r14Present) {
         buffer.getContext().eventDispatcher.startElement("cbr_pssch_TxConfigList_r14", -1);

         cbr_pssch_TxConfigList_r14 = new SL_CBR_PPPP_TxPreconfigList_r14();
         cbr_pssch_TxConfigList_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cbr_pssch_TxConfigList_r14", -1);
      }
      else {
         cbr_pssch_TxConfigList_r14 = null;
      }

      // decode resourceSelectionConfigP2X_r14

      if (resourceSelectionConfigP2X_r14Present) {
         buffer.getContext().eventDispatcher.startElement("resourceSelectionConfigP2X_r14", -1);

         resourceSelectionConfigP2X_r14 = new SL_P2X_ResourceSelectionConfig_r14();
         resourceSelectionConfigP2X_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("resourceSelectionConfigP2X_r14", -1);
      }
      else {
         resourceSelectionConfigP2X_r14 = null;
      }

      // decode syncAllowed_r14

      if (syncAllowed_r14Present) {
         buffer.getContext().eventDispatcher.startElement("syncAllowed_r14", -1);

         syncAllowed_r14 = new SL_SyncAllowed_r14();
         syncAllowed_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("syncAllowed_r14", -1);
      }
      else {
         syncAllowed_r14 = null;
      }

      // decode restrictResourceReservationPeriod_r14

      if (restrictResourceReservationPeriod_r14Present) {
         buffer.getContext().eventDispatcher.startElement("restrictResourceReservationPeriod_r14", -1);

         restrictResourceReservationPeriod_r14 = new SL_RestrictResourceReservationPeriodList_r14();
         restrictResourceReservationPeriod_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("restrictResourceReservationPeriod_r14", -1);
      }
      else {
         restrictResourceReservationPeriod_r14 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean sl_MinT2ValueList_r15Present = buffer.decodeBit ("sl_MinT2ValueList_r15Present");

            boolean cbr_pssch_TxConfigList_v1530Present = buffer.decodeBit ("cbr_pssch_TxConfigList_v1530Present");

            // decode sl_MinT2ValueList_r15

            if (sl_MinT2ValueList_r15Present) {
               buffer.getContext().eventDispatcher.startElement("sl_MinT2ValueList_r15", -1);

               sl_MinT2ValueList_r15 = new SL_MinT2ValueList_r15();
               sl_MinT2ValueList_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sl_MinT2ValueList_r15", -1);
            }
            else {
               sl_MinT2ValueList_r15 = null;
            }

            // decode cbr_pssch_TxConfigList_v1530

            if (cbr_pssch_TxConfigList_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("cbr_pssch_TxConfigList_v1530", -1);

               cbr_pssch_TxConfigList_v1530 = new SL_CBR_PPPP_TxPreconfigList_v1530();
               cbr_pssch_TxConfigList_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cbr_pssch_TxConfigList_v1530", -1);
            }
            else {
               cbr_pssch_TxConfigList_v1530 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (sl_OffsetIndicator_r14 != null) sl_OffsetIndicator_r14.print (_sb, "sl_OffsetIndicator_r14", _level+1);
      if (sl_Subframe_r14 != null) sl_Subframe_r14.print (_sb, "sl_Subframe_r14", _level+1);
      if (adjacencyPSCCH_PSSCH_r14 != null) adjacencyPSCCH_PSSCH_r14.print (_sb, "adjacencyPSCCH_PSSCH_r14", _level+1);
      if (sizeSubchannel_r14 != null) sizeSubchannel_r14.print (_sb, "sizeSubchannel_r14", _level+1);
      if (numSubchannel_r14 != null) numSubchannel_r14.print (_sb, "numSubchannel_r14", _level+1);
      if (startRB_Subchannel_r14 != null) startRB_Subchannel_r14.print (_sb, "startRB_Subchannel_r14", _level+1);
      if (startRB_PSCCH_Pool_r14 != null) startRB_PSCCH_Pool_r14.print (_sb, "startRB_PSCCH_Pool_r14", _level+1);
      if (dataTxParameters_r14 != null) dataTxParameters_r14.print (_sb, "dataTxParameters_r14", _level+1);
      if (zoneID_r14 != null) zoneID_r14.print (_sb, "zoneID_r14", _level+1);
      if (threshS_RSSI_CBR_r14 != null) threshS_RSSI_CBR_r14.print (_sb, "threshS_RSSI_CBR_r14", _level+1);
      if (cbr_pssch_TxConfigList_r14 != null) cbr_pssch_TxConfigList_r14.print (_sb, "cbr_pssch_TxConfigList_r14", _level+1);
      if (resourceSelectionConfigP2X_r14 != null) resourceSelectionConfigP2X_r14.print (_sb, "resourceSelectionConfigP2X_r14", _level+1);
      if (syncAllowed_r14 != null) syncAllowed_r14.print (_sb, "syncAllowed_r14", _level+1);
      if (restrictResourceReservationPeriod_r14 != null) restrictResourceReservationPeriod_r14.print (_sb, "restrictResourceReservationPeriod_r14", _level+1);
      if (sl_MinT2ValueList_r15 != null) sl_MinT2ValueList_r15.print (_sb, "sl_MinT2ValueList_r15", _level+1);
      if (cbr_pssch_TxConfigList_v1530 != null) cbr_pssch_TxConfigList_v1530.print (_sb, "cbr_pssch_TxConfigList_v1530", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
