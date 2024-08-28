/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCCH_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCCH-Config";
   }

   public PDCCH_Config_controlResourceSetToAddModList controlResourceSetToAddModList;  // optional
   public PDCCH_Config_controlResourceSetToReleaseList controlResourceSetToReleaseList;  // optional
   public PDCCH_Config_searchSpacesToAddModList searchSpacesToAddModList;  // optional
   public PDCCH_Config_searchSpacesToReleaseList searchSpacesToReleaseList;  // optional
   public PDCCH_Config_downlinkPreemption downlinkPreemption;  // optional
   public PDCCH_Config_tpc_PUSCH tpc_PUSCH;  // optional
   public PDCCH_Config_tpc_PUCCH tpc_PUCCH;  // optional
   public PDCCH_Config_tpc_SRS tpc_SRS;  // optional
   public boolean mV2ExtPresent;
   public PDCCH_Config_controlResourceSetToAddModListSizeExt_v1610 controlResourceSetToAddModListSizeExt_v1610;  // optional
   public PDCCH_Config_controlResourceSetToReleaseListSizeExt_r16 controlResourceSetToReleaseListSizeExt_r16;  // optional
   public PDCCH_Config_searchSpacesToAddModListExt_r16 searchSpacesToAddModListExt_r16;  // optional
   public PDCCH_Config_uplinkCancellation_r16 uplinkCancellation_r16;  // optional
   public PDCCH_Config_monitoringCapabilityConfig_r16 monitoringCapabilityConfig_r16 = null;  // optional
   public SearchSpaceSwitchConfig_r16 searchSpaceSwitchConfig_r16;  // optional
   public Asn1OpenExt extElem1;

   public PDCCH_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCCH_Config (
      PDCCH_Config_controlResourceSetToAddModList controlResourceSetToAddModList_,
      PDCCH_Config_controlResourceSetToReleaseList controlResourceSetToReleaseList_,
      PDCCH_Config_searchSpacesToAddModList searchSpacesToAddModList_,
      PDCCH_Config_searchSpacesToReleaseList searchSpacesToReleaseList_,
      PDCCH_Config_downlinkPreemption downlinkPreemption_,
      PDCCH_Config_tpc_PUSCH tpc_PUSCH_,
      PDCCH_Config_tpc_PUCCH tpc_PUCCH_,
      PDCCH_Config_tpc_SRS tpc_SRS_,
      PDCCH_Config_controlResourceSetToAddModListSizeExt_v1610 controlResourceSetToAddModListSizeExt_v1610_,
      PDCCH_Config_controlResourceSetToReleaseListSizeExt_r16 controlResourceSetToReleaseListSizeExt_r16_,
      PDCCH_Config_searchSpacesToAddModListExt_r16 searchSpacesToAddModListExt_r16_,
      PDCCH_Config_uplinkCancellation_r16 uplinkCancellation_r16_,
      PDCCH_Config_monitoringCapabilityConfig_r16 monitoringCapabilityConfig_r16_,
      SearchSpaceSwitchConfig_r16 searchSpaceSwitchConfig_r16_
   ) {
      super();
      controlResourceSetToAddModList = controlResourceSetToAddModList_;
      controlResourceSetToReleaseList = controlResourceSetToReleaseList_;
      searchSpacesToAddModList = searchSpacesToAddModList_;
      searchSpacesToReleaseList = searchSpacesToReleaseList_;
      downlinkPreemption = downlinkPreemption_;
      tpc_PUSCH = tpc_PUSCH_;
      tpc_PUCCH = tpc_PUCCH_;
      tpc_SRS = tpc_SRS_;
      controlResourceSetToAddModListSizeExt_v1610 = controlResourceSetToAddModListSizeExt_v1610_;
      controlResourceSetToReleaseListSizeExt_r16 = controlResourceSetToReleaseListSizeExt_r16_;
      searchSpacesToAddModListExt_r16 = searchSpacesToAddModListExt_r16_;
      uplinkCancellation_r16 = uplinkCancellation_r16_;
      monitoringCapabilityConfig_r16 = monitoringCapabilityConfig_r16_;
      searchSpaceSwitchConfig_r16 = searchSpaceSwitchConfig_r16_;
   }

   public void init () {
      controlResourceSetToAddModList = null;
      controlResourceSetToReleaseList = null;
      searchSpacesToAddModList = null;
      searchSpacesToReleaseList = null;
      downlinkPreemption = null;
      tpc_PUSCH = null;
      tpc_PUCCH = null;
      tpc_SRS = null;
      controlResourceSetToAddModListSizeExt_v1610 = null;
      controlResourceSetToReleaseListSizeExt_r16 = null;
      searchSpacesToAddModListExt_r16 = null;
      uplinkCancellation_r16 = null;
      monitoringCapabilityConfig_r16 = null;
      searchSpaceSwitchConfig_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 15; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return controlResourceSetToAddModList;
         case 1: return controlResourceSetToReleaseList;
         case 2: return searchSpacesToAddModList;
         case 3: return searchSpacesToReleaseList;
         case 4: return downlinkPreemption;
         case 5: return tpc_PUSCH;
         case 6: return tpc_PUCCH;
         case 7: return tpc_SRS;
         case 8: return controlResourceSetToAddModListSizeExt_v1610;
         case 9: return controlResourceSetToReleaseListSizeExt_r16;
         case 10: return searchSpacesToAddModListExt_r16;
         case 11: return uplinkCancellation_r16;
         case 12: return monitoringCapabilityConfig_r16;
         case 13: return searchSpaceSwitchConfig_r16;
         case 14: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "controlResourceSetToAddModList";
         case 1: return "controlResourceSetToReleaseList";
         case 2: return "searchSpacesToAddModList";
         case 3: return "searchSpacesToReleaseList";
         case 4: return "downlinkPreemption";
         case 5: return "tpc-PUSCH";
         case 6: return "tpc-PUCCH";
         case 7: return "tpc-SRS";
         case 8: return "controlResourceSetToAddModListSizeExt-v1610";
         case 9: return "controlResourceSetToReleaseListSizeExt-r16";
         case 10: return "searchSpacesToAddModListExt-r16";
         case 11: return "uplinkCancellation-r16";
         case 12: return "monitoringCapabilityConfig-r16";
         case 13: return "searchSpaceSwitchConfig-r16";
         case 14: return null;
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

      boolean controlResourceSetToAddModListPresent = buffer.decodeBit ("controlResourceSetToAddModListPresent");
      boolean controlResourceSetToReleaseListPresent = buffer.decodeBit ("controlResourceSetToReleaseListPresent");
      boolean searchSpacesToAddModListPresent = buffer.decodeBit ("searchSpacesToAddModListPresent");
      boolean searchSpacesToReleaseListPresent = buffer.decodeBit ("searchSpacesToReleaseListPresent");
      boolean downlinkPreemptionPresent = buffer.decodeBit ("downlinkPreemptionPresent");
      boolean tpc_PUSCHPresent = buffer.decodeBit ("tpc_PUSCHPresent");
      boolean tpc_PUCCHPresent = buffer.decodeBit ("tpc_PUCCHPresent");
      boolean tpc_SRSPresent = buffer.decodeBit ("tpc_SRSPresent");

      // decode controlResourceSetToAddModList

      if (controlResourceSetToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetToAddModList", -1);

         controlResourceSetToAddModList = new PDCCH_Config_controlResourceSetToAddModList();
         controlResourceSetToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("controlResourceSetToAddModList", -1);
      }
      else {
         controlResourceSetToAddModList = null;
      }

      // decode controlResourceSetToReleaseList

      if (controlResourceSetToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetToReleaseList", -1);

         controlResourceSetToReleaseList = new PDCCH_Config_controlResourceSetToReleaseList();
         controlResourceSetToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("controlResourceSetToReleaseList", -1);
      }
      else {
         controlResourceSetToReleaseList = null;
      }

      // decode searchSpacesToAddModList

      if (searchSpacesToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("searchSpacesToAddModList", -1);

         searchSpacesToAddModList = new PDCCH_Config_searchSpacesToAddModList();
         searchSpacesToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("searchSpacesToAddModList", -1);
      }
      else {
         searchSpacesToAddModList = null;
      }

      // decode searchSpacesToReleaseList

      if (searchSpacesToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("searchSpacesToReleaseList", -1);

         searchSpacesToReleaseList = new PDCCH_Config_searchSpacesToReleaseList();
         searchSpacesToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("searchSpacesToReleaseList", -1);
      }
      else {
         searchSpacesToReleaseList = null;
      }

      // decode downlinkPreemption

      if (downlinkPreemptionPresent) {
         buffer.getContext().eventDispatcher.startElement("downlinkPreemption", -1);

         downlinkPreemption = new PDCCH_Config_downlinkPreemption();
         downlinkPreemption.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("downlinkPreemption", -1);
      }
      else {
         downlinkPreemption = null;
      }

      // decode tpc_PUSCH

      if (tpc_PUSCHPresent) {
         buffer.getContext().eventDispatcher.startElement("tpc_PUSCH", -1);

         tpc_PUSCH = new PDCCH_Config_tpc_PUSCH();
         tpc_PUSCH.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tpc_PUSCH", -1);
      }
      else {
         tpc_PUSCH = null;
      }

      // decode tpc_PUCCH

      if (tpc_PUCCHPresent) {
         buffer.getContext().eventDispatcher.startElement("tpc_PUCCH", -1);

         tpc_PUCCH = new PDCCH_Config_tpc_PUCCH();
         tpc_PUCCH.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tpc_PUCCH", -1);
      }
      else {
         tpc_PUCCH = null;
      }

      // decode tpc_SRS

      if (tpc_SRSPresent) {
         buffer.getContext().eventDispatcher.startElement("tpc_SRS", -1);

         tpc_SRS = new PDCCH_Config_tpc_SRS();
         tpc_SRS.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("tpc_SRS", -1);
      }
      else {
         tpc_SRS = null;
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

            boolean controlResourceSetToAddModListSizeExt_v1610Present = buffer.decodeBit ("controlResourceSetToAddModListSizeExt_v1610Present");

            boolean controlResourceSetToReleaseListSizeExt_r16Present = buffer.decodeBit ("controlResourceSetToReleaseListSizeExt_r16Present");

            boolean searchSpacesToAddModListExt_r16Present = buffer.decodeBit ("searchSpacesToAddModListExt_r16Present");

            boolean uplinkCancellation_r16Present = buffer.decodeBit ("uplinkCancellation_r16Present");

            boolean monitoringCapabilityConfig_r16Present = buffer.decodeBit ("monitoringCapabilityConfig_r16Present");

            boolean searchSpaceSwitchConfig_r16Present = buffer.decodeBit ("searchSpaceSwitchConfig_r16Present");

            // decode controlResourceSetToAddModListSizeExt_v1610

            if (controlResourceSetToAddModListSizeExt_v1610Present) {
               buffer.getContext().eventDispatcher.startElement("controlResourceSetToAddModListSizeExt_v1610", -1);

               controlResourceSetToAddModListSizeExt_v1610 = new PDCCH_Config_controlResourceSetToAddModListSizeExt_v1610();
               controlResourceSetToAddModListSizeExt_v1610.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("controlResourceSetToAddModListSizeExt_v1610", -1);
            }
            else {
               controlResourceSetToAddModListSizeExt_v1610 = null;
            }

            // decode controlResourceSetToReleaseListSizeExt_r16

            if (controlResourceSetToReleaseListSizeExt_r16Present) {
               buffer.getContext().eventDispatcher.startElement("controlResourceSetToReleaseListSizeExt_r16", -1);

               controlResourceSetToReleaseListSizeExt_r16 = new PDCCH_Config_controlResourceSetToReleaseListSizeExt_r16();
               controlResourceSetToReleaseListSizeExt_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("controlResourceSetToReleaseListSizeExt_r16", -1);
            }
            else {
               controlResourceSetToReleaseListSizeExt_r16 = null;
            }

            // decode searchSpacesToAddModListExt_r16

            if (searchSpacesToAddModListExt_r16Present) {
               buffer.getContext().eventDispatcher.startElement("searchSpacesToAddModListExt_r16", -1);

               searchSpacesToAddModListExt_r16 = new PDCCH_Config_searchSpacesToAddModListExt_r16();
               searchSpacesToAddModListExt_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("searchSpacesToAddModListExt_r16", -1);
            }
            else {
               searchSpacesToAddModListExt_r16 = null;
            }

            // decode uplinkCancellation_r16

            if (uplinkCancellation_r16Present) {
               buffer.getContext().eventDispatcher.startElement("uplinkCancellation_r16", -1);

               uplinkCancellation_r16 = new PDCCH_Config_uplinkCancellation_r16();
               uplinkCancellation_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("uplinkCancellation_r16", -1);
            }
            else {
               uplinkCancellation_r16 = null;
            }

            // decode monitoringCapabilityConfig_r16

            if (monitoringCapabilityConfig_r16Present) {
               buffer.getContext().eventDispatcher.startElement("monitoringCapabilityConfig_r16", -1);

               int tval = PDCCH_Config_monitoringCapabilityConfig_r16.decodeEnumValue (buffer);
               monitoringCapabilityConfig_r16 = PDCCH_Config_monitoringCapabilityConfig_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("monitoringCapabilityConfig_r16", -1);
            }
            else {
               monitoringCapabilityConfig_r16 = null;
            }

            // decode searchSpaceSwitchConfig_r16

            if (searchSpaceSwitchConfig_r16Present) {
               buffer.getContext().eventDispatcher.startElement("searchSpaceSwitchConfig_r16", -1);

               searchSpaceSwitchConfig_r16 = new SearchSpaceSwitchConfig_r16();
               searchSpaceSwitchConfig_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("searchSpaceSwitchConfig_r16", -1);
            }
            else {
               searchSpaceSwitchConfig_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (mV2ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((controlResourceSetToAddModList != null), null);
      buffer.encodeBit ((controlResourceSetToReleaseList != null), null);
      buffer.encodeBit ((searchSpacesToAddModList != null), null);
      buffer.encodeBit ((searchSpacesToReleaseList != null), null);
      buffer.encodeBit ((downlinkPreemption != null), null);
      buffer.encodeBit ((tpc_PUSCH != null), null);
      buffer.encodeBit ((tpc_PUCCH != null), null);
      buffer.encodeBit ((tpc_SRS != null), null);

      // encode controlResourceSetToAddModList

      if (controlResourceSetToAddModList != null) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetToAddModList", -1);

         controlResourceSetToAddModList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("controlResourceSetToAddModList", -1);
      }

      // encode controlResourceSetToReleaseList

      if (controlResourceSetToReleaseList != null) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetToReleaseList", -1);

         controlResourceSetToReleaseList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("controlResourceSetToReleaseList", -1);
      }

      // encode searchSpacesToAddModList

      if (searchSpacesToAddModList != null) {
         buffer.getContext().eventDispatcher.startElement("searchSpacesToAddModList", -1);

         searchSpacesToAddModList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("searchSpacesToAddModList", -1);
      }

      // encode searchSpacesToReleaseList

      if (searchSpacesToReleaseList != null) {
         buffer.getContext().eventDispatcher.startElement("searchSpacesToReleaseList", -1);

         searchSpacesToReleaseList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("searchSpacesToReleaseList", -1);
      }

      // encode downlinkPreemption

      if (downlinkPreemption != null) {
         buffer.getContext().eventDispatcher.startElement("downlinkPreemption", -1);

         downlinkPreemption.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("downlinkPreemption", -1);
      }

      // encode tpc_PUSCH

      if (tpc_PUSCH != null) {
         buffer.getContext().eventDispatcher.startElement("tpc_PUSCH", -1);

         tpc_PUSCH.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tpc_PUSCH", -1);
      }

      // encode tpc_PUCCH

      if (tpc_PUCCH != null) {
         buffer.getContext().eventDispatcher.startElement("tpc_PUCCH", -1);

         tpc_PUCCH.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tpc_PUCCH", -1);
      }

      // encode tpc_SRS

      if (tpc_SRS != null) {
         buffer.getContext().eventDispatcher.startElement("tpc_SRS", -1);

         tpc_SRS.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("tpc_SRS", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((controlResourceSetToAddModListSizeExt_v1610 != null), "optbit");
            buffer.encodeBit ((controlResourceSetToReleaseListSizeExt_r16 != null), "optbit");
            buffer.encodeBit ((searchSpacesToAddModListExt_r16 != null), "optbit");
            buffer.encodeBit ((uplinkCancellation_r16 != null), "optbit");
            buffer.encodeBit ((monitoringCapabilityConfig_r16 != null), "optbit");
            buffer.encodeBit ((searchSpaceSwitchConfig_r16 != null), "optbit");
            if (controlResourceSetToAddModListSizeExt_v1610 != null) {
               controlResourceSetToAddModListSizeExt_v1610.encode (buffer);
            }
            if (controlResourceSetToReleaseListSizeExt_r16 != null) {
               controlResourceSetToReleaseListSizeExt_r16.encode (buffer);
            }
            if (searchSpacesToAddModListExt_r16 != null) {
               searchSpacesToAddModListExt_r16.encode (buffer);
            }
            if (uplinkCancellation_r16 != null) {
               uplinkCancellation_r16.encode (buffer);
            }
            if (monitoringCapabilityConfig_r16 != null) {
               monitoringCapabilityConfig_r16.encode (buffer);
            }
            if (searchSpaceSwitchConfig_r16 != null) {
               searchSpaceSwitchConfig_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (controlResourceSetToAddModList != null) controlResourceSetToAddModList.print (_sb, "controlResourceSetToAddModList", _level+1);
      if (controlResourceSetToReleaseList != null) controlResourceSetToReleaseList.print (_sb, "controlResourceSetToReleaseList", _level+1);
      if (searchSpacesToAddModList != null) searchSpacesToAddModList.print (_sb, "searchSpacesToAddModList", _level+1);
      if (searchSpacesToReleaseList != null) searchSpacesToReleaseList.print (_sb, "searchSpacesToReleaseList", _level+1);
      if (downlinkPreemption != null) downlinkPreemption.print (_sb, "downlinkPreemption", _level+1);
      if (tpc_PUSCH != null) tpc_PUSCH.print (_sb, "tpc_PUSCH", _level+1);
      if (tpc_PUCCH != null) tpc_PUCCH.print (_sb, "tpc_PUCCH", _level+1);
      if (tpc_SRS != null) tpc_SRS.print (_sb, "tpc_SRS", _level+1);
      if (controlResourceSetToAddModListSizeExt_v1610 != null) controlResourceSetToAddModListSizeExt_v1610.print (_sb, "controlResourceSetToAddModListSizeExt_v1610", _level+1);
      if (controlResourceSetToReleaseListSizeExt_r16 != null) controlResourceSetToReleaseListSizeExt_r16.print (_sb, "controlResourceSetToReleaseListSizeExt_r16", _level+1);
      if (searchSpacesToAddModListExt_r16 != null) searchSpacesToAddModListExt_r16.print (_sb, "searchSpacesToAddModListExt_r16", _level+1);
      if (uplinkCancellation_r16 != null) uplinkCancellation_r16.print (_sb, "uplinkCancellation_r16", _level+1);
      if (monitoringCapabilityConfig_r16 != null) monitoringCapabilityConfig_r16.print (_sb, "monitoringCapabilityConfig_r16", _level+1);
      if (searchSpaceSwitchConfig_r16 != null) searchSpaceSwitchConfig_r16.print (_sb, "searchSpaceSwitchConfig_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
