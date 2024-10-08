/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRB_ToAddMod extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SRB-ToAddMod";
   }

   public Asn1Integer srb_Identity;
   public SRB_ToAddMod_rlc_Config rlc_Config;  // optional
   public SRB_ToAddMod_logicalChannelConfig logicalChannelConfig;  // optional
   public boolean mV2ExtPresent;
   public SRB_ToAddMod_pdcp_verChange_r15 pdcp_verChange_r15 = null;  // optional
   public RLC_Config_v1530 rlc_Config_v1530;  // optional
   public RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15;  // optional
   public Asn1Integer srb_Identity_v1530;  // optional
   public Asn1OpenExt extElem1;

   public SRB_ToAddMod () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SRB_ToAddMod (
      Asn1Integer srb_Identity_,
      SRB_ToAddMod_rlc_Config rlc_Config_,
      SRB_ToAddMod_logicalChannelConfig logicalChannelConfig_,
      SRB_ToAddMod_pdcp_verChange_r15 pdcp_verChange_r15_,
      RLC_Config_v1530 rlc_Config_v1530_,
      RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15_,
      Asn1Integer srb_Identity_v1530_
   ) {
      super();
      srb_Identity = srb_Identity_;
      rlc_Config = rlc_Config_;
      logicalChannelConfig = logicalChannelConfig_;
      pdcp_verChange_r15 = pdcp_verChange_r15_;
      rlc_Config_v1530 = rlc_Config_v1530_;
      rlc_BearerConfigDupl_r15 = rlc_BearerConfigDupl_r15_;
      srb_Identity_v1530 = srb_Identity_v1530_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SRB_ToAddMod (
      Asn1Integer srb_Identity_
   ) {
      super();
      srb_Identity = srb_Identity_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SRB_ToAddMod (long srb_Identity_,
      SRB_ToAddMod_rlc_Config rlc_Config_,
      SRB_ToAddMod_logicalChannelConfig logicalChannelConfig_,
      SRB_ToAddMod_pdcp_verChange_r15 pdcp_verChange_r15_,
      RLC_Config_v1530 rlc_Config_v1530_,
      RLC_BearerConfig_r15 rlc_BearerConfigDupl_r15_,
      long srb_Identity_v1530_
   ) {
      super();
      srb_Identity = new Asn1Integer (srb_Identity_);
      rlc_Config = rlc_Config_;
      logicalChannelConfig = logicalChannelConfig_;
      pdcp_verChange_r15 = pdcp_verChange_r15_;
      rlc_Config_v1530 = rlc_Config_v1530_;
      rlc_BearerConfigDupl_r15 = rlc_BearerConfigDupl_r15_;
      srb_Identity_v1530 = new Asn1Integer (srb_Identity_v1530_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SRB_ToAddMod (
      long srb_Identity_
   ) {
      super();
      srb_Identity = new Asn1Integer (srb_Identity_);
   }

   public void init () {
      srb_Identity = null;
      rlc_Config = null;
      logicalChannelConfig = null;
      pdcp_verChange_r15 = null;
      rlc_Config_v1530 = null;
      rlc_BearerConfigDupl_r15 = null;
      srb_Identity_v1530 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return srb_Identity;
         case 1: return rlc_Config;
         case 2: return logicalChannelConfig;
         case 3: return pdcp_verChange_r15;
         case 4: return rlc_Config_v1530;
         case 5: return rlc_BearerConfigDupl_r15;
         case 6: return srb_Identity_v1530;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "srb-Identity";
         case 1: return "rlc-Config";
         case 2: return "logicalChannelConfig";
         case 3: return "pdcp-verChange-r15";
         case 4: return "rlc-Config-v1530";
         case 5: return "rlc-BearerConfigDupl-r15";
         case 6: return "srb-Identity-v1530";
         case 7: return null;
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

      boolean rlc_ConfigPresent = buffer.decodeBit ("rlc_ConfigPresent");
      boolean logicalChannelConfigPresent = buffer.decodeBit ("logicalChannelConfigPresent");

      // decode srb_Identity

      buffer.getContext().eventDispatcher.startElement("srb_Identity", -1);

      srb_Identity = new Asn1Integer();
      srb_Identity.decode (buffer, 1, 2);

      buffer.invokeCharacters(srb_Identity.toString());
      buffer.getContext().eventDispatcher.endElement("srb_Identity", -1);

      // decode rlc_Config

      if (rlc_ConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("rlc_Config", -1);

         rlc_Config = new SRB_ToAddMod_rlc_Config();
         rlc_Config.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_Config", -1);
      }
      else {
         rlc_Config = null;
      }

      // decode logicalChannelConfig

      if (logicalChannelConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("logicalChannelConfig", -1);

         logicalChannelConfig = new SRB_ToAddMod_logicalChannelConfig();
         logicalChannelConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("logicalChannelConfig", -1);
      }
      else {
         logicalChannelConfig = null;
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

            boolean pdcp_verChange_r15Present = buffer.decodeBit ("pdcp_verChange_r15Present");

            boolean rlc_Config_v1530Present = buffer.decodeBit ("rlc_Config_v1530Present");

            boolean rlc_BearerConfigDupl_r15Present = buffer.decodeBit ("rlc_BearerConfigDupl_r15Present");

            boolean srb_Identity_v1530Present = buffer.decodeBit ("srb_Identity_v1530Present");

            // decode pdcp_verChange_r15

            if (pdcp_verChange_r15Present) {
               buffer.getContext().eventDispatcher.startElement("pdcp_verChange_r15", -1);

               int tval = SRB_ToAddMod_pdcp_verChange_r15.decodeEnumValue (buffer);
               pdcp_verChange_r15 = SRB_ToAddMod_pdcp_verChange_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdcp_verChange_r15", -1);
            }
            else {
               pdcp_verChange_r15 = null;
            }

            // decode rlc_Config_v1530

            if (rlc_Config_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("rlc_Config_v1530", -1);

               rlc_Config_v1530 = new RLC_Config_v1530();
               rlc_Config_v1530.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlc_Config_v1530", -1);
            }
            else {
               rlc_Config_v1530 = null;
            }

            // decode rlc_BearerConfigDupl_r15

            if (rlc_BearerConfigDupl_r15Present) {
               buffer.getContext().eventDispatcher.startElement("rlc_BearerConfigDupl_r15", -1);

               rlc_BearerConfigDupl_r15 = new RLC_BearerConfig_r15();
               rlc_BearerConfigDupl_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("rlc_BearerConfigDupl_r15", -1);
            }
            else {
               rlc_BearerConfigDupl_r15 = null;
            }

            // decode srb_Identity_v1530

            if (srb_Identity_v1530Present) {
               buffer.getContext().eventDispatcher.startElement("srb_Identity_v1530", -1);

               srb_Identity_v1530 = new Asn1Integer();
               srb_Identity_v1530.decode (buffer, 4, 4);

               buffer.invokeCharacters(srb_Identity_v1530.toString());
               buffer.getContext().eventDispatcher.endElement("srb_Identity_v1530", -1);
            }
            else {
               srb_Identity_v1530 = null;
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
      if (srb_Identity != null) srb_Identity.print (_sb, "srb_Identity", _level+1);
      if (rlc_Config != null) rlc_Config.print (_sb, "rlc_Config", _level+1);
      if (logicalChannelConfig != null) logicalChannelConfig.print (_sb, "logicalChannelConfig", _level+1);
      if (pdcp_verChange_r15 != null) pdcp_verChange_r15.print (_sb, "pdcp_verChange_r15", _level+1);
      if (rlc_Config_v1530 != null) rlc_Config_v1530.print (_sb, "rlc_Config_v1530", _level+1);
      if (rlc_BearerConfigDupl_r15 != null) rlc_BearerConfigDupl_r15.print (_sb, "rlc_BearerConfigDupl_r15", _level+1);
      if (srb_Identity_v1530 != null) srb_Identity_v1530.print (_sb, "srb_Identity_v1530", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
