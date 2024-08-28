/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BWP_DownlinkDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BWP-DownlinkDedicated";
   }

   public BWP_DownlinkDedicated_pdcch_Config pdcch_Config;  // optional
   public BWP_DownlinkDedicated_pdsch_Config pdsch_Config;  // optional
   public BWP_DownlinkDedicated_sps_Config sps_Config;  // optional
   public BWP_DownlinkDedicated_radioLinkMonitoringConfig radioLinkMonitoringConfig;  // optional
   public boolean mV2ExtPresent;
   public SPS_ConfigToAddModList_r16 sps_ConfigToAddModList_r16;  // optional
   public SPS_ConfigToReleaseList_r16 sps_ConfigToReleaseList_r16;  // optional
   public SPS_ConfigDeactivationStateList_r16 sps_ConfigDeactivationStateList_r16;  // optional
   public BWP_DownlinkDedicated_beamFailureRecoverySCellConfig_r16 beamFailureRecoverySCellConfig_r16;  // optional
   public BWP_DownlinkDedicated_sl_PDCCH_Config_r16 sl_PDCCH_Config_r16;  // optional
   public BWP_DownlinkDedicated_sl_V2X_PDCCH_Config_r16 sl_V2X_PDCCH_Config_r16;  // optional
   public Asn1OpenExt extElem1;

   public BWP_DownlinkDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BWP_DownlinkDedicated (
      BWP_DownlinkDedicated_pdcch_Config pdcch_Config_,
      BWP_DownlinkDedicated_pdsch_Config pdsch_Config_,
      BWP_DownlinkDedicated_sps_Config sps_Config_,
      BWP_DownlinkDedicated_radioLinkMonitoringConfig radioLinkMonitoringConfig_,
      SPS_ConfigToAddModList_r16 sps_ConfigToAddModList_r16_,
      SPS_ConfigToReleaseList_r16 sps_ConfigToReleaseList_r16_,
      SPS_ConfigDeactivationStateList_r16 sps_ConfigDeactivationStateList_r16_,
      BWP_DownlinkDedicated_beamFailureRecoverySCellConfig_r16 beamFailureRecoverySCellConfig_r16_,
      BWP_DownlinkDedicated_sl_PDCCH_Config_r16 sl_PDCCH_Config_r16_,
      BWP_DownlinkDedicated_sl_V2X_PDCCH_Config_r16 sl_V2X_PDCCH_Config_r16_
   ) {
      super();
      pdcch_Config = pdcch_Config_;
      pdsch_Config = pdsch_Config_;
      sps_Config = sps_Config_;
      radioLinkMonitoringConfig = radioLinkMonitoringConfig_;
      sps_ConfigToAddModList_r16 = sps_ConfigToAddModList_r16_;
      sps_ConfigToReleaseList_r16 = sps_ConfigToReleaseList_r16_;
      sps_ConfigDeactivationStateList_r16 = sps_ConfigDeactivationStateList_r16_;
      beamFailureRecoverySCellConfig_r16 = beamFailureRecoverySCellConfig_r16_;
      sl_PDCCH_Config_r16 = sl_PDCCH_Config_r16_;
      sl_V2X_PDCCH_Config_r16 = sl_V2X_PDCCH_Config_r16_;
   }

   public void init () {
      pdcch_Config = null;
      pdsch_Config = null;
      sps_Config = null;
      radioLinkMonitoringConfig = null;
      sps_ConfigToAddModList_r16 = null;
      sps_ConfigToReleaseList_r16 = null;
      sps_ConfigDeactivationStateList_r16 = null;
      beamFailureRecoverySCellConfig_r16 = null;
      sl_PDCCH_Config_r16 = null;
      sl_V2X_PDCCH_Config_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pdcch_Config;
         case 1: return pdsch_Config;
         case 2: return sps_Config;
         case 3: return radioLinkMonitoringConfig;
         case 4: return sps_ConfigToAddModList_r16;
         case 5: return sps_ConfigToReleaseList_r16;
         case 6: return sps_ConfigDeactivationStateList_r16;
         case 7: return beamFailureRecoverySCellConfig_r16;
         case 8: return sl_PDCCH_Config_r16;
         case 9: return sl_V2X_PDCCH_Config_r16;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pdcch-Config";
         case 1: return "pdsch-Config";
         case 2: return "sps-Config";
         case 3: return "radioLinkMonitoringConfig";
         case 4: return "sps-ConfigToAddModList-r16";
         case 5: return "sps-ConfigToReleaseList-r16";
         case 6: return "sps-ConfigDeactivationStateList-r16";
         case 7: return "beamFailureRecoverySCellConfig-r16";
         case 8: return "sl-PDCCH-Config-r16";
         case 9: return "sl-V2X-PDCCH-Config-r16";
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

      boolean pdcch_ConfigPresent = buffer.decodeBit ("pdcch_ConfigPresent");
      boolean pdsch_ConfigPresent = buffer.decodeBit ("pdsch_ConfigPresent");
      boolean sps_ConfigPresent = buffer.decodeBit ("sps_ConfigPresent");
      boolean radioLinkMonitoringConfigPresent = buffer.decodeBit ("radioLinkMonitoringConfigPresent");

      // decode pdcch_Config

      if (pdcch_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcch_Config", -1);

         pdcch_Config = new BWP_DownlinkDedicated_pdcch_Config();
         pdcch_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcch_Config", -1);
      }
      else {
         pdcch_Config = null;
      }

      // decode pdsch_Config

      if (pdsch_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_Config", -1);

         pdsch_Config = new BWP_DownlinkDedicated_pdsch_Config();
         pdsch_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdsch_Config", -1);
      }
      else {
         pdsch_Config = null;
      }

      // decode sps_Config

      if (sps_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("sps_Config", -1);

         sps_Config = new BWP_DownlinkDedicated_sps_Config();
         sps_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sps_Config", -1);
      }
      else {
         sps_Config = null;
      }

      // decode radioLinkMonitoringConfig

      if (radioLinkMonitoringConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("radioLinkMonitoringConfig", -1);

         radioLinkMonitoringConfig = new BWP_DownlinkDedicated_radioLinkMonitoringConfig();
         radioLinkMonitoringConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("radioLinkMonitoringConfig", -1);
      }
      else {
         radioLinkMonitoringConfig = null;
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

            boolean sps_ConfigToAddModList_r16Present = buffer.decodeBit ("sps_ConfigToAddModList_r16Present");

            boolean sps_ConfigToReleaseList_r16Present = buffer.decodeBit ("sps_ConfigToReleaseList_r16Present");

            boolean sps_ConfigDeactivationStateList_r16Present = buffer.decodeBit ("sps_ConfigDeactivationStateList_r16Present");

            boolean beamFailureRecoverySCellConfig_r16Present = buffer.decodeBit ("beamFailureRecoverySCellConfig_r16Present");

            boolean sl_PDCCH_Config_r16Present = buffer.decodeBit ("sl_PDCCH_Config_r16Present");

            boolean sl_V2X_PDCCH_Config_r16Present = buffer.decodeBit ("sl_V2X_PDCCH_Config_r16Present");

            // decode sps_ConfigToAddModList_r16

            if (sps_ConfigToAddModList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sps_ConfigToAddModList_r16", -1);

               sps_ConfigToAddModList_r16 = new SPS_ConfigToAddModList_r16();
               sps_ConfigToAddModList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sps_ConfigToAddModList_r16", -1);
            }
            else {
               sps_ConfigToAddModList_r16 = null;
            }

            // decode sps_ConfigToReleaseList_r16

            if (sps_ConfigToReleaseList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sps_ConfigToReleaseList_r16", -1);

               sps_ConfigToReleaseList_r16 = new SPS_ConfigToReleaseList_r16();
               sps_ConfigToReleaseList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sps_ConfigToReleaseList_r16", -1);
            }
            else {
               sps_ConfigToReleaseList_r16 = null;
            }

            // decode sps_ConfigDeactivationStateList_r16

            if (sps_ConfigDeactivationStateList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sps_ConfigDeactivationStateList_r16", -1);

               sps_ConfigDeactivationStateList_r16 = new SPS_ConfigDeactivationStateList_r16();
               sps_ConfigDeactivationStateList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sps_ConfigDeactivationStateList_r16", -1);
            }
            else {
               sps_ConfigDeactivationStateList_r16 = null;
            }

            // decode beamFailureRecoverySCellConfig_r16

            if (beamFailureRecoverySCellConfig_r16Present) {
               buffer.getContext().eventDispatcher.startElement("beamFailureRecoverySCellConfig_r16", -1);

               beamFailureRecoverySCellConfig_r16 = new BWP_DownlinkDedicated_beamFailureRecoverySCellConfig_r16();
               beamFailureRecoverySCellConfig_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("beamFailureRecoverySCellConfig_r16", -1);
            }
            else {
               beamFailureRecoverySCellConfig_r16 = null;
            }

            // decode sl_PDCCH_Config_r16

            if (sl_PDCCH_Config_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_PDCCH_Config_r16", -1);

               sl_PDCCH_Config_r16 = new BWP_DownlinkDedicated_sl_PDCCH_Config_r16();
               sl_PDCCH_Config_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sl_PDCCH_Config_r16", -1);
            }
            else {
               sl_PDCCH_Config_r16 = null;
            }

            // decode sl_V2X_PDCCH_Config_r16

            if (sl_V2X_PDCCH_Config_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_V2X_PDCCH_Config_r16", -1);

               sl_V2X_PDCCH_Config_r16 = new BWP_DownlinkDedicated_sl_V2X_PDCCH_Config_r16();
               sl_V2X_PDCCH_Config_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sl_V2X_PDCCH_Config_r16", -1);
            }
            else {
               sl_V2X_PDCCH_Config_r16 = null;
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

      buffer.encodeBit ((pdcch_Config != null), null);
      buffer.encodeBit ((pdsch_Config != null), null);
      buffer.encodeBit ((sps_Config != null), null);
      buffer.encodeBit ((radioLinkMonitoringConfig != null), null);

      // encode pdcch_Config

      if (pdcch_Config != null) {
         buffer.getContext().eventDispatcher.startElement("pdcch_Config", -1);

         pdcch_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcch_Config", -1);
      }

      // encode pdsch_Config

      if (pdsch_Config != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_Config", -1);

         pdsch_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_Config", -1);
      }

      // encode sps_Config

      if (sps_Config != null) {
         buffer.getContext().eventDispatcher.startElement("sps_Config", -1);

         sps_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sps_Config", -1);
      }

      // encode radioLinkMonitoringConfig

      if (radioLinkMonitoringConfig != null) {
         buffer.getContext().eventDispatcher.startElement("radioLinkMonitoringConfig", -1);

         radioLinkMonitoringConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("radioLinkMonitoringConfig", -1);
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
            buffer.encodeBit ((sps_ConfigToAddModList_r16 != null), "optbit");
            buffer.encodeBit ((sps_ConfigToReleaseList_r16 != null), "optbit");
            buffer.encodeBit ((sps_ConfigDeactivationStateList_r16 != null), "optbit");
            buffer.encodeBit ((beamFailureRecoverySCellConfig_r16 != null), "optbit");
            buffer.encodeBit ((sl_PDCCH_Config_r16 != null), "optbit");
            buffer.encodeBit ((sl_V2X_PDCCH_Config_r16 != null), "optbit");
            if (sps_ConfigToAddModList_r16 != null) {
               sps_ConfigToAddModList_r16.encode (buffer);
            }
            if (sps_ConfigToReleaseList_r16 != null) {
               sps_ConfigToReleaseList_r16.encode (buffer);
            }
            if (sps_ConfigDeactivationStateList_r16 != null) {
               sps_ConfigDeactivationStateList_r16.encode (buffer);
            }
            if (beamFailureRecoverySCellConfig_r16 != null) {
               beamFailureRecoverySCellConfig_r16.encode (buffer);
            }
            if (sl_PDCCH_Config_r16 != null) {
               sl_PDCCH_Config_r16.encode (buffer);
            }
            if (sl_V2X_PDCCH_Config_r16 != null) {
               sl_V2X_PDCCH_Config_r16.encode (buffer);
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
      if (pdcch_Config != null) pdcch_Config.print (_sb, "pdcch_Config", _level+1);
      if (pdsch_Config != null) pdsch_Config.print (_sb, "pdsch_Config", _level+1);
      if (sps_Config != null) sps_Config.print (_sb, "sps_Config", _level+1);
      if (radioLinkMonitoringConfig != null) radioLinkMonitoringConfig.print (_sb, "radioLinkMonitoringConfig", _level+1);
      if (sps_ConfigToAddModList_r16 != null) sps_ConfigToAddModList_r16.print (_sb, "sps_ConfigToAddModList_r16", _level+1);
      if (sps_ConfigToReleaseList_r16 != null) sps_ConfigToReleaseList_r16.print (_sb, "sps_ConfigToReleaseList_r16", _level+1);
      if (sps_ConfigDeactivationStateList_r16 != null) sps_ConfigDeactivationStateList_r16.print (_sb, "sps_ConfigDeactivationStateList_r16", _level+1);
      if (beamFailureRecoverySCellConfig_r16 != null) beamFailureRecoverySCellConfig_r16.print (_sb, "beamFailureRecoverySCellConfig_r16", _level+1);
      if (sl_PDCCH_Config_r16 != null) sl_PDCCH_Config_r16.print (_sb, "sl_PDCCH_Config_r16", _level+1);
      if (sl_V2X_PDCCH_Config_r16 != null) sl_V2X_PDCCH_Config_r16.print (_sb, "sl_V2X_PDCCH_Config_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
