/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BWP_UplinkDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BWP-UplinkDedicated";
   }

   public BWP_UplinkDedicated_pucch_Config pucch_Config;  // optional
   public BWP_UplinkDedicated_pusch_Config pusch_Config;  // optional
   public BWP_UplinkDedicated_configuredGrantConfig configuredGrantConfig;  // optional
   public BWP_UplinkDedicated_srs_Config srs_Config;  // optional
   public BWP_UplinkDedicated_beamFailureRecoveryConfig beamFailureRecoveryConfig;  // optional
   public boolean mV2ExtPresent;
   public BWP_UplinkDedicated_sl_PUCCH_Config_r16 sl_PUCCH_Config_r16;  // optional
   public Asn1Integer cp_ExtensionC2_r16;  // optional
   public Asn1Integer cp_ExtensionC3_r16;  // optional
   public BWP_UplinkDedicated_useInterlacePUCCH_PUSCH_r16 useInterlacePUCCH_PUSCH_r16 = null;  // optional
   public BWP_UplinkDedicated_pucch_ConfigurationList_r16 pucch_ConfigurationList_r16;  // optional
   public BWP_UplinkDedicated_lbt_FailureRecoveryConfig_r16 lbt_FailureRecoveryConfig_r16;  // optional
   public ConfiguredGrantConfigToAddModList_r16 configuredGrantConfigToAddModList_r16;  // optional
   public ConfiguredGrantConfigToReleaseList_r16 configuredGrantConfigToReleaseList_r16;  // optional
   public ConfiguredGrantConfigType2DeactivationStateList_r16 configuredGrantConfigType2DeactivationStateList_r16;  // optional
   public Asn1OpenExt extElem1;

   public BWP_UplinkDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BWP_UplinkDedicated (
      BWP_UplinkDedicated_pucch_Config pucch_Config_,
      BWP_UplinkDedicated_pusch_Config pusch_Config_,
      BWP_UplinkDedicated_configuredGrantConfig configuredGrantConfig_,
      BWP_UplinkDedicated_srs_Config srs_Config_,
      BWP_UplinkDedicated_beamFailureRecoveryConfig beamFailureRecoveryConfig_,
      BWP_UplinkDedicated_sl_PUCCH_Config_r16 sl_PUCCH_Config_r16_,
      Asn1Integer cp_ExtensionC2_r16_,
      Asn1Integer cp_ExtensionC3_r16_,
      BWP_UplinkDedicated_useInterlacePUCCH_PUSCH_r16 useInterlacePUCCH_PUSCH_r16_,
      BWP_UplinkDedicated_pucch_ConfigurationList_r16 pucch_ConfigurationList_r16_,
      BWP_UplinkDedicated_lbt_FailureRecoveryConfig_r16 lbt_FailureRecoveryConfig_r16_,
      ConfiguredGrantConfigToAddModList_r16 configuredGrantConfigToAddModList_r16_,
      ConfiguredGrantConfigToReleaseList_r16 configuredGrantConfigToReleaseList_r16_,
      ConfiguredGrantConfigType2DeactivationStateList_r16 configuredGrantConfigType2DeactivationStateList_r16_
   ) {
      super();
      pucch_Config = pucch_Config_;
      pusch_Config = pusch_Config_;
      configuredGrantConfig = configuredGrantConfig_;
      srs_Config = srs_Config_;
      beamFailureRecoveryConfig = beamFailureRecoveryConfig_;
      sl_PUCCH_Config_r16 = sl_PUCCH_Config_r16_;
      cp_ExtensionC2_r16 = cp_ExtensionC2_r16_;
      cp_ExtensionC3_r16 = cp_ExtensionC3_r16_;
      useInterlacePUCCH_PUSCH_r16 = useInterlacePUCCH_PUSCH_r16_;
      pucch_ConfigurationList_r16 = pucch_ConfigurationList_r16_;
      lbt_FailureRecoveryConfig_r16 = lbt_FailureRecoveryConfig_r16_;
      configuredGrantConfigToAddModList_r16 = configuredGrantConfigToAddModList_r16_;
      configuredGrantConfigToReleaseList_r16 = configuredGrantConfigToReleaseList_r16_;
      configuredGrantConfigType2DeactivationStateList_r16 = configuredGrantConfigType2DeactivationStateList_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BWP_UplinkDedicated (BWP_UplinkDedicated_pucch_Config pucch_Config_,
      BWP_UplinkDedicated_pusch_Config pusch_Config_,
      BWP_UplinkDedicated_configuredGrantConfig configuredGrantConfig_,
      BWP_UplinkDedicated_srs_Config srs_Config_,
      BWP_UplinkDedicated_beamFailureRecoveryConfig beamFailureRecoveryConfig_,
      BWP_UplinkDedicated_sl_PUCCH_Config_r16 sl_PUCCH_Config_r16_,
      long cp_ExtensionC2_r16_,
      long cp_ExtensionC3_r16_,
      BWP_UplinkDedicated_useInterlacePUCCH_PUSCH_r16 useInterlacePUCCH_PUSCH_r16_,
      BWP_UplinkDedicated_pucch_ConfigurationList_r16 pucch_ConfigurationList_r16_,
      BWP_UplinkDedicated_lbt_FailureRecoveryConfig_r16 lbt_FailureRecoveryConfig_r16_,
      ConfiguredGrantConfigToAddModList_r16 configuredGrantConfigToAddModList_r16_,
      ConfiguredGrantConfigToReleaseList_r16 configuredGrantConfigToReleaseList_r16_,
      ConfiguredGrantConfigType2DeactivationStateList_r16 configuredGrantConfigType2DeactivationStateList_r16_
   ) {
      super();
      pucch_Config = pucch_Config_;
      pusch_Config = pusch_Config_;
      configuredGrantConfig = configuredGrantConfig_;
      srs_Config = srs_Config_;
      beamFailureRecoveryConfig = beamFailureRecoveryConfig_;
      sl_PUCCH_Config_r16 = sl_PUCCH_Config_r16_;
      cp_ExtensionC2_r16 = new Asn1Integer (cp_ExtensionC2_r16_);
      cp_ExtensionC3_r16 = new Asn1Integer (cp_ExtensionC3_r16_);
      useInterlacePUCCH_PUSCH_r16 = useInterlacePUCCH_PUSCH_r16_;
      pucch_ConfigurationList_r16 = pucch_ConfigurationList_r16_;
      lbt_FailureRecoveryConfig_r16 = lbt_FailureRecoveryConfig_r16_;
      configuredGrantConfigToAddModList_r16 = configuredGrantConfigToAddModList_r16_;
      configuredGrantConfigToReleaseList_r16 = configuredGrantConfigToReleaseList_r16_;
      configuredGrantConfigType2DeactivationStateList_r16 = configuredGrantConfigType2DeactivationStateList_r16_;
   }

   public void init () {
      pucch_Config = null;
      pusch_Config = null;
      configuredGrantConfig = null;
      srs_Config = null;
      beamFailureRecoveryConfig = null;
      sl_PUCCH_Config_r16 = null;
      cp_ExtensionC2_r16 = null;
      cp_ExtensionC3_r16 = null;
      useInterlacePUCCH_PUSCH_r16 = null;
      pucch_ConfigurationList_r16 = null;
      lbt_FailureRecoveryConfig_r16 = null;
      configuredGrantConfigToAddModList_r16 = null;
      configuredGrantConfigToReleaseList_r16 = null;
      configuredGrantConfigType2DeactivationStateList_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 15; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pucch_Config;
         case 1: return pusch_Config;
         case 2: return configuredGrantConfig;
         case 3: return srs_Config;
         case 4: return beamFailureRecoveryConfig;
         case 5: return sl_PUCCH_Config_r16;
         case 6: return cp_ExtensionC2_r16;
         case 7: return cp_ExtensionC3_r16;
         case 8: return useInterlacePUCCH_PUSCH_r16;
         case 9: return pucch_ConfigurationList_r16;
         case 10: return lbt_FailureRecoveryConfig_r16;
         case 11: return configuredGrantConfigToAddModList_r16;
         case 12: return configuredGrantConfigToReleaseList_r16;
         case 13: return configuredGrantConfigType2DeactivationStateList_r16;
         case 14: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pucch-Config";
         case 1: return "pusch-Config";
         case 2: return "configuredGrantConfig";
         case 3: return "srs-Config";
         case 4: return "beamFailureRecoveryConfig";
         case 5: return "sl-PUCCH-Config-r16";
         case 6: return "cp-ExtensionC2-r16";
         case 7: return "cp-ExtensionC3-r16";
         case 8: return "useInterlacePUCCH-PUSCH-r16";
         case 9: return "pucch-ConfigurationList-r16";
         case 10: return "lbt-FailureRecoveryConfig-r16";
         case 11: return "configuredGrantConfigToAddModList-r16";
         case 12: return "configuredGrantConfigToReleaseList-r16";
         case 13: return "configuredGrantConfigType2DeactivationStateList-r16";
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

      boolean pucch_ConfigPresent = buffer.decodeBit ("pucch_ConfigPresent");
      boolean pusch_ConfigPresent = buffer.decodeBit ("pusch_ConfigPresent");
      boolean configuredGrantConfigPresent = buffer.decodeBit ("configuredGrantConfigPresent");
      boolean srs_ConfigPresent = buffer.decodeBit ("srs_ConfigPresent");
      boolean beamFailureRecoveryConfigPresent = buffer.decodeBit ("beamFailureRecoveryConfigPresent");

      // decode pucch_Config

      if (pucch_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("pucch_Config", -1);

         pucch_Config = new BWP_UplinkDedicated_pucch_Config();
         pucch_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pucch_Config", -1);
      }
      else {
         pucch_Config = null;
      }

      // decode pusch_Config

      if (pusch_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("pusch_Config", -1);

         pusch_Config = new BWP_UplinkDedicated_pusch_Config();
         pusch_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pusch_Config", -1);
      }
      else {
         pusch_Config = null;
      }

      // decode configuredGrantConfig

      if (configuredGrantConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("configuredGrantConfig", -1);

         configuredGrantConfig = new BWP_UplinkDedicated_configuredGrantConfig();
         configuredGrantConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("configuredGrantConfig", -1);
      }
      else {
         configuredGrantConfig = null;
      }

      // decode srs_Config

      if (srs_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("srs_Config", -1);

         srs_Config = new BWP_UplinkDedicated_srs_Config();
         srs_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("srs_Config", -1);
      }
      else {
         srs_Config = null;
      }

      // decode beamFailureRecoveryConfig

      if (beamFailureRecoveryConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("beamFailureRecoveryConfig", -1);

         beamFailureRecoveryConfig = new BWP_UplinkDedicated_beamFailureRecoveryConfig();
         beamFailureRecoveryConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("beamFailureRecoveryConfig", -1);
      }
      else {
         beamFailureRecoveryConfig = null;
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

            boolean sl_PUCCH_Config_r16Present = buffer.decodeBit ("sl_PUCCH_Config_r16Present");

            boolean cp_ExtensionC2_r16Present = buffer.decodeBit ("cp_ExtensionC2_r16Present");

            boolean cp_ExtensionC3_r16Present = buffer.decodeBit ("cp_ExtensionC3_r16Present");

            boolean useInterlacePUCCH_PUSCH_r16Present = buffer.decodeBit ("useInterlacePUCCH_PUSCH_r16Present");

            boolean pucch_ConfigurationList_r16Present = buffer.decodeBit ("pucch_ConfigurationList_r16Present");

            boolean lbt_FailureRecoveryConfig_r16Present = buffer.decodeBit ("lbt_FailureRecoveryConfig_r16Present");

            boolean configuredGrantConfigToAddModList_r16Present = buffer.decodeBit ("configuredGrantConfigToAddModList_r16Present");

            boolean configuredGrantConfigToReleaseList_r16Present = buffer.decodeBit ("configuredGrantConfigToReleaseList_r16Present");

            boolean configuredGrantConfigType2DeactivationStateList_r16Present = buffer.decodeBit ("configuredGrantConfigType2DeactivationStateList_r16Present");

            // decode sl_PUCCH_Config_r16

            if (sl_PUCCH_Config_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_PUCCH_Config_r16", -1);

               sl_PUCCH_Config_r16 = new BWP_UplinkDedicated_sl_PUCCH_Config_r16();
               sl_PUCCH_Config_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sl_PUCCH_Config_r16", -1);
            }
            else {
               sl_PUCCH_Config_r16 = null;
            }

            // decode cp_ExtensionC2_r16

            if (cp_ExtensionC2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("cp_ExtensionC2_r16", -1);

               cp_ExtensionC2_r16 = new Asn1Integer();
               cp_ExtensionC2_r16.decode (buffer, 1, 28);

               buffer.invokeCharacters(cp_ExtensionC2_r16.toString());
               buffer.getContext().eventDispatcher.endElement("cp_ExtensionC2_r16", -1);
            }
            else {
               cp_ExtensionC2_r16 = null;
            }

            // decode cp_ExtensionC3_r16

            if (cp_ExtensionC3_r16Present) {
               buffer.getContext().eventDispatcher.startElement("cp_ExtensionC3_r16", -1);

               cp_ExtensionC3_r16 = new Asn1Integer();
               cp_ExtensionC3_r16.decode (buffer, 1, 28);

               buffer.invokeCharacters(cp_ExtensionC3_r16.toString());
               buffer.getContext().eventDispatcher.endElement("cp_ExtensionC3_r16", -1);
            }
            else {
               cp_ExtensionC3_r16 = null;
            }

            // decode useInterlacePUCCH_PUSCH_r16

            if (useInterlacePUCCH_PUSCH_r16Present) {
               buffer.getContext().eventDispatcher.startElement("useInterlacePUCCH_PUSCH_r16", -1);

               int tval = BWP_UplinkDedicated_useInterlacePUCCH_PUSCH_r16.decodeEnumValue (buffer);
               useInterlacePUCCH_PUSCH_r16 = BWP_UplinkDedicated_useInterlacePUCCH_PUSCH_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("useInterlacePUCCH_PUSCH_r16", -1);
            }
            else {
               useInterlacePUCCH_PUSCH_r16 = null;
            }

            // decode pucch_ConfigurationList_r16

            if (pucch_ConfigurationList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("pucch_ConfigurationList_r16", -1);

               pucch_ConfigurationList_r16 = new BWP_UplinkDedicated_pucch_ConfigurationList_r16();
               pucch_ConfigurationList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("pucch_ConfigurationList_r16", -1);
            }
            else {
               pucch_ConfigurationList_r16 = null;
            }

            // decode lbt_FailureRecoveryConfig_r16

            if (lbt_FailureRecoveryConfig_r16Present) {
               buffer.getContext().eventDispatcher.startElement("lbt_FailureRecoveryConfig_r16", -1);

               lbt_FailureRecoveryConfig_r16 = new BWP_UplinkDedicated_lbt_FailureRecoveryConfig_r16();
               lbt_FailureRecoveryConfig_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("lbt_FailureRecoveryConfig_r16", -1);
            }
            else {
               lbt_FailureRecoveryConfig_r16 = null;
            }

            // decode configuredGrantConfigToAddModList_r16

            if (configuredGrantConfigToAddModList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("configuredGrantConfigToAddModList_r16", -1);

               configuredGrantConfigToAddModList_r16 = new ConfiguredGrantConfigToAddModList_r16();
               configuredGrantConfigToAddModList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("configuredGrantConfigToAddModList_r16", -1);
            }
            else {
               configuredGrantConfigToAddModList_r16 = null;
            }

            // decode configuredGrantConfigToReleaseList_r16

            if (configuredGrantConfigToReleaseList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("configuredGrantConfigToReleaseList_r16", -1);

               configuredGrantConfigToReleaseList_r16 = new ConfiguredGrantConfigToReleaseList_r16();
               configuredGrantConfigToReleaseList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("configuredGrantConfigToReleaseList_r16", -1);
            }
            else {
               configuredGrantConfigToReleaseList_r16 = null;
            }

            // decode configuredGrantConfigType2DeactivationStateList_r16

            if (configuredGrantConfigType2DeactivationStateList_r16Present) {
               buffer.getContext().eventDispatcher.startElement("configuredGrantConfigType2DeactivationStateList_r16", -1);

               configuredGrantConfigType2DeactivationStateList_r16 = new ConfiguredGrantConfigType2DeactivationStateList_r16();
               configuredGrantConfigType2DeactivationStateList_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("configuredGrantConfigType2DeactivationStateList_r16", -1);
            }
            else {
               configuredGrantConfigType2DeactivationStateList_r16 = null;
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

      buffer.encodeBit ((pucch_Config != null), null);
      buffer.encodeBit ((pusch_Config != null), null);
      buffer.encodeBit ((configuredGrantConfig != null), null);
      buffer.encodeBit ((srs_Config != null), null);
      buffer.encodeBit ((beamFailureRecoveryConfig != null), null);

      // encode pucch_Config

      if (pucch_Config != null) {
         buffer.getContext().eventDispatcher.startElement("pucch_Config", -1);

         pucch_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pucch_Config", -1);
      }

      // encode pusch_Config

      if (pusch_Config != null) {
         buffer.getContext().eventDispatcher.startElement("pusch_Config", -1);

         pusch_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pusch_Config", -1);
      }

      // encode configuredGrantConfig

      if (configuredGrantConfig != null) {
         buffer.getContext().eventDispatcher.startElement("configuredGrantConfig", -1);

         configuredGrantConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("configuredGrantConfig", -1);
      }

      // encode srs_Config

      if (srs_Config != null) {
         buffer.getContext().eventDispatcher.startElement("srs_Config", -1);

         srs_Config.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srs_Config", -1);
      }

      // encode beamFailureRecoveryConfig

      if (beamFailureRecoveryConfig != null) {
         buffer.getContext().eventDispatcher.startElement("beamFailureRecoveryConfig", -1);

         beamFailureRecoveryConfig.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("beamFailureRecoveryConfig", -1);
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
            buffer.encodeBit ((sl_PUCCH_Config_r16 != null), "optbit");
            buffer.encodeBit ((cp_ExtensionC2_r16 != null), "optbit");
            buffer.encodeBit ((cp_ExtensionC3_r16 != null), "optbit");
            buffer.encodeBit ((useInterlacePUCCH_PUSCH_r16 != null), "optbit");
            buffer.encodeBit ((pucch_ConfigurationList_r16 != null), "optbit");
            buffer.encodeBit ((lbt_FailureRecoveryConfig_r16 != null), "optbit");
            buffer.encodeBit ((configuredGrantConfigToAddModList_r16 != null), "optbit");
            buffer.encodeBit ((configuredGrantConfigToReleaseList_r16 != null), "optbit");
            buffer.encodeBit ((configuredGrantConfigType2DeactivationStateList_r16 != null), "optbit");
            if (sl_PUCCH_Config_r16 != null) {
               sl_PUCCH_Config_r16.encode (buffer);
            }
            if (cp_ExtensionC2_r16 != null) {
               cp_ExtensionC2_r16.encode (buffer, 1, 28);
            }
            if (cp_ExtensionC3_r16 != null) {
               cp_ExtensionC3_r16.encode (buffer, 1, 28);
            }
            if (useInterlacePUCCH_PUSCH_r16 != null) {
               useInterlacePUCCH_PUSCH_r16.encode (buffer);
            }
            if (pucch_ConfigurationList_r16 != null) {
               pucch_ConfigurationList_r16.encode (buffer);
            }
            if (lbt_FailureRecoveryConfig_r16 != null) {
               lbt_FailureRecoveryConfig_r16.encode (buffer);
            }
            if (configuredGrantConfigToAddModList_r16 != null) {
               configuredGrantConfigToAddModList_r16.encode (buffer);
            }
            if (configuredGrantConfigToReleaseList_r16 != null) {
               configuredGrantConfigToReleaseList_r16.encode (buffer);
            }
            if (configuredGrantConfigType2DeactivationStateList_r16 != null) {
               configuredGrantConfigType2DeactivationStateList_r16.encode (buffer);
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
      if (pucch_Config != null) pucch_Config.print (_sb, "pucch_Config", _level+1);
      if (pusch_Config != null) pusch_Config.print (_sb, "pusch_Config", _level+1);
      if (configuredGrantConfig != null) configuredGrantConfig.print (_sb, "configuredGrantConfig", _level+1);
      if (srs_Config != null) srs_Config.print (_sb, "srs_Config", _level+1);
      if (beamFailureRecoveryConfig != null) beamFailureRecoveryConfig.print (_sb, "beamFailureRecoveryConfig", _level+1);
      if (sl_PUCCH_Config_r16 != null) sl_PUCCH_Config_r16.print (_sb, "sl_PUCCH_Config_r16", _level+1);
      if (cp_ExtensionC2_r16 != null) cp_ExtensionC2_r16.print (_sb, "cp_ExtensionC2_r16", _level+1);
      if (cp_ExtensionC3_r16 != null) cp_ExtensionC3_r16.print (_sb, "cp_ExtensionC3_r16", _level+1);
      if (useInterlacePUCCH_PUSCH_r16 != null) useInterlacePUCCH_PUSCH_r16.print (_sb, "useInterlacePUCCH_PUSCH_r16", _level+1);
      if (pucch_ConfigurationList_r16 != null) pucch_ConfigurationList_r16.print (_sb, "pucch_ConfigurationList_r16", _level+1);
      if (lbt_FailureRecoveryConfig_r16 != null) lbt_FailureRecoveryConfig_r16.print (_sb, "lbt_FailureRecoveryConfig_r16", _level+1);
      if (configuredGrantConfigToAddModList_r16 != null) configuredGrantConfigToAddModList_r16.print (_sb, "configuredGrantConfigToAddModList_r16", _level+1);
      if (configuredGrantConfigToReleaseList_r16 != null) configuredGrantConfigToReleaseList_r16.print (_sb, "configuredGrantConfigToReleaseList_r16", _level+1);
      if (configuredGrantConfigType2DeactivationStateList_r16 != null) configuredGrantConfigType2DeactivationStateList_r16.print (_sb, "configuredGrantConfigType2DeactivationStateList_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
