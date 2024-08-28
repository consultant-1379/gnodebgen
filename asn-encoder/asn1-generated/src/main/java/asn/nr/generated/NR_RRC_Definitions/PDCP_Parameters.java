/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Parameters extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCP-Parameters";
   }

   public PDCP_Parameters_supportedROHC_Profiles supportedROHC_Profiles;
   public PDCP_Parameters_maxNumberROHC_ContextSessions maxNumberROHC_ContextSessions = null;
   public PDCP_Parameters_uplinkOnlyROHC_Profiles uplinkOnlyROHC_Profiles = null;  // optional
   public PDCP_Parameters_continueROHC_Context continueROHC_Context = null;  // optional
   public PDCP_Parameters_outOfOrderDelivery outOfOrderDelivery = null;  // optional
   public PDCP_Parameters_shortSN shortSN = null;  // optional
   public PDCP_Parameters_pdcp_DuplicationSRB pdcp_DuplicationSRB = null;  // optional
   public PDCP_Parameters_pdcp_DuplicationMCG_OrSCG_DRB pdcp_DuplicationMCG_OrSCG_DRB = null;  // optional
   public boolean mV2ExtPresent;
   public PDCP_Parameters_drb_IAB_r16 drb_IAB_r16 = null;  // optional
   public PDCP_Parameters_non_DRB_IAB_r16 non_DRB_IAB_r16 = null;  // optional
   public PDCP_Parameters_extendedDiscardTimer_r16 extendedDiscardTimer_r16 = null;  // optional
   public PDCP_Parameters_continueEHC_Context_r16 continueEHC_Context_r16 = null;  // optional
   public PDCP_Parameters_ehc_r16 ehc_r16 = null;  // optional
   public PDCP_Parameters_maxNumberEHC_Contexts_r16 maxNumberEHC_Contexts_r16 = null;  // optional
   public PDCP_Parameters_jointEHC_ROHC_Config_r16 jointEHC_ROHC_Config_r16 = null;  // optional
   public PDCP_Parameters_pdcp_DuplicationMoreThanTwoRLC_r16 pdcp_DuplicationMoreThanTwoRLC_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public PDCP_Parameters () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Parameters (
      PDCP_Parameters_supportedROHC_Profiles supportedROHC_Profiles_,
      PDCP_Parameters_maxNumberROHC_ContextSessions maxNumberROHC_ContextSessions_,
      PDCP_Parameters_uplinkOnlyROHC_Profiles uplinkOnlyROHC_Profiles_,
      PDCP_Parameters_continueROHC_Context continueROHC_Context_,
      PDCP_Parameters_outOfOrderDelivery outOfOrderDelivery_,
      PDCP_Parameters_shortSN shortSN_,
      PDCP_Parameters_pdcp_DuplicationSRB pdcp_DuplicationSRB_,
      PDCP_Parameters_pdcp_DuplicationMCG_OrSCG_DRB pdcp_DuplicationMCG_OrSCG_DRB_,
      PDCP_Parameters_drb_IAB_r16 drb_IAB_r16_,
      PDCP_Parameters_non_DRB_IAB_r16 non_DRB_IAB_r16_,
      PDCP_Parameters_extendedDiscardTimer_r16 extendedDiscardTimer_r16_,
      PDCP_Parameters_continueEHC_Context_r16 continueEHC_Context_r16_,
      PDCP_Parameters_ehc_r16 ehc_r16_,
      PDCP_Parameters_maxNumberEHC_Contexts_r16 maxNumberEHC_Contexts_r16_,
      PDCP_Parameters_jointEHC_ROHC_Config_r16 jointEHC_ROHC_Config_r16_,
      PDCP_Parameters_pdcp_DuplicationMoreThanTwoRLC_r16 pdcp_DuplicationMoreThanTwoRLC_r16_
   ) {
      super();
      supportedROHC_Profiles = supportedROHC_Profiles_;
      maxNumberROHC_ContextSessions = maxNumberROHC_ContextSessions_;
      uplinkOnlyROHC_Profiles = uplinkOnlyROHC_Profiles_;
      continueROHC_Context = continueROHC_Context_;
      outOfOrderDelivery = outOfOrderDelivery_;
      shortSN = shortSN_;
      pdcp_DuplicationSRB = pdcp_DuplicationSRB_;
      pdcp_DuplicationMCG_OrSCG_DRB = pdcp_DuplicationMCG_OrSCG_DRB_;
      drb_IAB_r16 = drb_IAB_r16_;
      non_DRB_IAB_r16 = non_DRB_IAB_r16_;
      extendedDiscardTimer_r16 = extendedDiscardTimer_r16_;
      continueEHC_Context_r16 = continueEHC_Context_r16_;
      ehc_r16 = ehc_r16_;
      maxNumberEHC_Contexts_r16 = maxNumberEHC_Contexts_r16_;
      jointEHC_ROHC_Config_r16 = jointEHC_ROHC_Config_r16_;
      pdcp_DuplicationMoreThanTwoRLC_r16 = pdcp_DuplicationMoreThanTwoRLC_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PDCP_Parameters (
      PDCP_Parameters_supportedROHC_Profiles supportedROHC_Profiles_,
      PDCP_Parameters_maxNumberROHC_ContextSessions maxNumberROHC_ContextSessions_
   ) {
      super();
      supportedROHC_Profiles = supportedROHC_Profiles_;
      maxNumberROHC_ContextSessions = maxNumberROHC_ContextSessions_;
   }

   public void init () {
      supportedROHC_Profiles = null;
      maxNumberROHC_ContextSessions = null;
      uplinkOnlyROHC_Profiles = null;
      continueROHC_Context = null;
      outOfOrderDelivery = null;
      shortSN = null;
      pdcp_DuplicationSRB = null;
      pdcp_DuplicationMCG_OrSCG_DRB = null;
      drb_IAB_r16 = null;
      non_DRB_IAB_r16 = null;
      extendedDiscardTimer_r16 = null;
      continueEHC_Context_r16 = null;
      ehc_r16 = null;
      maxNumberEHC_Contexts_r16 = null;
      jointEHC_ROHC_Config_r16 = null;
      pdcp_DuplicationMoreThanTwoRLC_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 17; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedROHC_Profiles;
         case 1: return maxNumberROHC_ContextSessions;
         case 2: return uplinkOnlyROHC_Profiles;
         case 3: return continueROHC_Context;
         case 4: return outOfOrderDelivery;
         case 5: return shortSN;
         case 6: return pdcp_DuplicationSRB;
         case 7: return pdcp_DuplicationMCG_OrSCG_DRB;
         case 8: return drb_IAB_r16;
         case 9: return non_DRB_IAB_r16;
         case 10: return extendedDiscardTimer_r16;
         case 11: return continueEHC_Context_r16;
         case 12: return ehc_r16;
         case 13: return maxNumberEHC_Contexts_r16;
         case 14: return jointEHC_ROHC_Config_r16;
         case 15: return pdcp_DuplicationMoreThanTwoRLC_r16;
         case 16: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedROHC-Profiles";
         case 1: return "maxNumberROHC-ContextSessions";
         case 2: return "uplinkOnlyROHC-Profiles";
         case 3: return "continueROHC-Context";
         case 4: return "outOfOrderDelivery";
         case 5: return "shortSN";
         case 6: return "pdcp-DuplicationSRB";
         case 7: return "pdcp-DuplicationMCG-OrSCG-DRB";
         case 8: return "drb-IAB-r16";
         case 9: return "non-DRB-IAB-r16";
         case 10: return "extendedDiscardTimer-r16";
         case 11: return "continueEHC-Context-r16";
         case 12: return "ehc-r16";
         case 13: return "maxNumberEHC-Contexts-r16";
         case 14: return "jointEHC-ROHC-Config-r16";
         case 15: return "pdcp-DuplicationMoreThanTwoRLC-r16";
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

      boolean uplinkOnlyROHC_ProfilesPresent = buffer.decodeBit ("uplinkOnlyROHC_ProfilesPresent");
      boolean continueROHC_ContextPresent = buffer.decodeBit ("continueROHC_ContextPresent");
      boolean outOfOrderDeliveryPresent = buffer.decodeBit ("outOfOrderDeliveryPresent");
      boolean shortSNPresent = buffer.decodeBit ("shortSNPresent");
      boolean pdcp_DuplicationSRBPresent = buffer.decodeBit ("pdcp_DuplicationSRBPresent");
      boolean pdcp_DuplicationMCG_OrSCG_DRBPresent = buffer.decodeBit ("pdcp_DuplicationMCG_OrSCG_DRBPresent");

      // decode supportedROHC_Profiles

      buffer.getContext().eventDispatcher.startElement("supportedROHC_Profiles", -1);

      supportedROHC_Profiles = new PDCP_Parameters_supportedROHC_Profiles();
      supportedROHC_Profiles.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedROHC_Profiles", -1);

      // decode maxNumberROHC_ContextSessions

      buffer.getContext().eventDispatcher.startElement("maxNumberROHC_ContextSessions", -1);

      {
         int tval = PDCP_Parameters_maxNumberROHC_ContextSessions.decodeEnumValue (buffer);
         maxNumberROHC_ContextSessions = PDCP_Parameters_maxNumberROHC_ContextSessions.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("maxNumberROHC_ContextSessions", -1);

      // decode uplinkOnlyROHC_Profiles

      if (uplinkOnlyROHC_ProfilesPresent) {
         buffer.getContext().eventDispatcher.startElement("uplinkOnlyROHC_Profiles", -1);

         int tval = PDCP_Parameters_uplinkOnlyROHC_Profiles.decodeEnumValue (buffer);
         uplinkOnlyROHC_Profiles = PDCP_Parameters_uplinkOnlyROHC_Profiles.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("uplinkOnlyROHC_Profiles", -1);
      }
      else {
         uplinkOnlyROHC_Profiles = null;
      }

      // decode continueROHC_Context

      if (continueROHC_ContextPresent) {
         buffer.getContext().eventDispatcher.startElement("continueROHC_Context", -1);

         int tval = PDCP_Parameters_continueROHC_Context.decodeEnumValue (buffer);
         continueROHC_Context = PDCP_Parameters_continueROHC_Context.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("continueROHC_Context", -1);
      }
      else {
         continueROHC_Context = null;
      }

      // decode outOfOrderDelivery

      if (outOfOrderDeliveryPresent) {
         buffer.getContext().eventDispatcher.startElement("outOfOrderDelivery", -1);

         int tval = PDCP_Parameters_outOfOrderDelivery.decodeEnumValue (buffer);
         outOfOrderDelivery = PDCP_Parameters_outOfOrderDelivery.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("outOfOrderDelivery", -1);
      }
      else {
         outOfOrderDelivery = null;
      }

      // decode shortSN

      if (shortSNPresent) {
         buffer.getContext().eventDispatcher.startElement("shortSN", -1);

         int tval = PDCP_Parameters_shortSN.decodeEnumValue (buffer);
         shortSN = PDCP_Parameters_shortSN.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("shortSN", -1);
      }
      else {
         shortSN = null;
      }

      // decode pdcp_DuplicationSRB

      if (pdcp_DuplicationSRBPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSRB", -1);

         int tval = PDCP_Parameters_pdcp_DuplicationSRB.decodeEnumValue (buffer);
         pdcp_DuplicationSRB = PDCP_Parameters_pdcp_DuplicationSRB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSRB", -1);
      }
      else {
         pdcp_DuplicationSRB = null;
      }

      // decode pdcp_DuplicationMCG_OrSCG_DRB

      if (pdcp_DuplicationMCG_OrSCG_DRBPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationMCG_OrSCG_DRB", -1);

         int tval = PDCP_Parameters_pdcp_DuplicationMCG_OrSCG_DRB.decodeEnumValue (buffer);
         pdcp_DuplicationMCG_OrSCG_DRB = PDCP_Parameters_pdcp_DuplicationMCG_OrSCG_DRB.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationMCG_OrSCG_DRB", -1);
      }
      else {
         pdcp_DuplicationMCG_OrSCG_DRB = null;
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

            boolean drb_IAB_r16Present = buffer.decodeBit ("drb_IAB_r16Present");

            boolean non_DRB_IAB_r16Present = buffer.decodeBit ("non_DRB_IAB_r16Present");

            boolean extendedDiscardTimer_r16Present = buffer.decodeBit ("extendedDiscardTimer_r16Present");

            boolean continueEHC_Context_r16Present = buffer.decodeBit ("continueEHC_Context_r16Present");

            boolean ehc_r16Present = buffer.decodeBit ("ehc_r16Present");

            boolean maxNumberEHC_Contexts_r16Present = buffer.decodeBit ("maxNumberEHC_Contexts_r16Present");

            boolean jointEHC_ROHC_Config_r16Present = buffer.decodeBit ("jointEHC_ROHC_Config_r16Present");

            boolean pdcp_DuplicationMoreThanTwoRLC_r16Present = buffer.decodeBit ("pdcp_DuplicationMoreThanTwoRLC_r16Present");

            // decode drb_IAB_r16

            if (drb_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("drb_IAB_r16", -1);

               int tval = PDCP_Parameters_drb_IAB_r16.decodeEnumValue (buffer);
               drb_IAB_r16 = PDCP_Parameters_drb_IAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("drb_IAB_r16", -1);
            }
            else {
               drb_IAB_r16 = null;
            }

            // decode non_DRB_IAB_r16

            if (non_DRB_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("non_DRB_IAB_r16", -1);

               int tval = PDCP_Parameters_non_DRB_IAB_r16.decodeEnumValue (buffer);
               non_DRB_IAB_r16 = PDCP_Parameters_non_DRB_IAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("non_DRB_IAB_r16", -1);
            }
            else {
               non_DRB_IAB_r16 = null;
            }

            // decode extendedDiscardTimer_r16

            if (extendedDiscardTimer_r16Present) {
               buffer.getContext().eventDispatcher.startElement("extendedDiscardTimer_r16", -1);

               int tval = PDCP_Parameters_extendedDiscardTimer_r16.decodeEnumValue (buffer);
               extendedDiscardTimer_r16 = PDCP_Parameters_extendedDiscardTimer_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("extendedDiscardTimer_r16", -1);
            }
            else {
               extendedDiscardTimer_r16 = null;
            }

            // decode continueEHC_Context_r16

            if (continueEHC_Context_r16Present) {
               buffer.getContext().eventDispatcher.startElement("continueEHC_Context_r16", -1);

               int tval = PDCP_Parameters_continueEHC_Context_r16.decodeEnumValue (buffer);
               continueEHC_Context_r16 = PDCP_Parameters_continueEHC_Context_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("continueEHC_Context_r16", -1);
            }
            else {
               continueEHC_Context_r16 = null;
            }

            // decode ehc_r16

            if (ehc_r16Present) {
               buffer.getContext().eventDispatcher.startElement("ehc_r16", -1);

               int tval = PDCP_Parameters_ehc_r16.decodeEnumValue (buffer);
               ehc_r16 = PDCP_Parameters_ehc_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("ehc_r16", -1);
            }
            else {
               ehc_r16 = null;
            }

            // decode maxNumberEHC_Contexts_r16

            if (maxNumberEHC_Contexts_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxNumberEHC_Contexts_r16", -1);

               int tval = PDCP_Parameters_maxNumberEHC_Contexts_r16.decodeEnumValue (buffer);
               maxNumberEHC_Contexts_r16 = PDCP_Parameters_maxNumberEHC_Contexts_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("maxNumberEHC_Contexts_r16", -1);
            }
            else {
               maxNumberEHC_Contexts_r16 = null;
            }

            // decode jointEHC_ROHC_Config_r16

            if (jointEHC_ROHC_Config_r16Present) {
               buffer.getContext().eventDispatcher.startElement("jointEHC_ROHC_Config_r16", -1);

               int tval = PDCP_Parameters_jointEHC_ROHC_Config_r16.decodeEnumValue (buffer);
               jointEHC_ROHC_Config_r16 = PDCP_Parameters_jointEHC_ROHC_Config_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("jointEHC_ROHC_Config_r16", -1);
            }
            else {
               jointEHC_ROHC_Config_r16 = null;
            }

            // decode pdcp_DuplicationMoreThanTwoRLC_r16

            if (pdcp_DuplicationMoreThanTwoRLC_r16Present) {
               buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationMoreThanTwoRLC_r16", -1);

               int tval = PDCP_Parameters_pdcp_DuplicationMoreThanTwoRLC_r16.decodeEnumValue (buffer);
               pdcp_DuplicationMoreThanTwoRLC_r16 = PDCP_Parameters_pdcp_DuplicationMoreThanTwoRLC_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationMoreThanTwoRLC_r16", -1);
            }
            else {
               pdcp_DuplicationMoreThanTwoRLC_r16 = null;
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

      buffer.encodeBit ((uplinkOnlyROHC_Profiles != null), null);
      buffer.encodeBit ((continueROHC_Context != null), null);
      buffer.encodeBit ((outOfOrderDelivery != null), null);
      buffer.encodeBit ((shortSN != null), null);
      buffer.encodeBit ((pdcp_DuplicationSRB != null), null);
      buffer.encodeBit ((pdcp_DuplicationMCG_OrSCG_DRB != null), null);

      // encode supportedROHC_Profiles

      if (supportedROHC_Profiles != null) {
         buffer.getContext().eventDispatcher.startElement("supportedROHC_Profiles", -1);

         supportedROHC_Profiles.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedROHC_Profiles", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedROHC_Profiles");

      // encode maxNumberROHC_ContextSessions

      if (maxNumberROHC_ContextSessions != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberROHC_ContextSessions", -1);

         maxNumberROHC_ContextSessions.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberROHC_ContextSessions", -1);
      }
      else throw new Asn1MissingRequiredException ("maxNumberROHC_ContextSessions");

      // encode uplinkOnlyROHC_Profiles

      if (uplinkOnlyROHC_Profiles != null) {
         buffer.getContext().eventDispatcher.startElement("uplinkOnlyROHC_Profiles", -1);

         uplinkOnlyROHC_Profiles.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("uplinkOnlyROHC_Profiles", -1);
      }

      // encode continueROHC_Context

      if (continueROHC_Context != null) {
         buffer.getContext().eventDispatcher.startElement("continueROHC_Context", -1);

         continueROHC_Context.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("continueROHC_Context", -1);
      }

      // encode outOfOrderDelivery

      if (outOfOrderDelivery != null) {
         buffer.getContext().eventDispatcher.startElement("outOfOrderDelivery", -1);

         outOfOrderDelivery.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("outOfOrderDelivery", -1);
      }

      // encode shortSN

      if (shortSN != null) {
         buffer.getContext().eventDispatcher.startElement("shortSN", -1);

         shortSN.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("shortSN", -1);
      }

      // encode pdcp_DuplicationSRB

      if (pdcp_DuplicationSRB != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationSRB", -1);

         pdcp_DuplicationSRB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationSRB", -1);
      }

      // encode pdcp_DuplicationMCG_OrSCG_DRB

      if (pdcp_DuplicationMCG_OrSCG_DRB != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationMCG_OrSCG_DRB", -1);

         pdcp_DuplicationMCG_OrSCG_DRB.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationMCG_OrSCG_DRB", -1);
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
            buffer.encodeBit ((drb_IAB_r16 != null), "optbit");
            buffer.encodeBit ((non_DRB_IAB_r16 != null), "optbit");
            buffer.encodeBit ((extendedDiscardTimer_r16 != null), "optbit");
            buffer.encodeBit ((continueEHC_Context_r16 != null), "optbit");
            buffer.encodeBit ((ehc_r16 != null), "optbit");
            buffer.encodeBit ((maxNumberEHC_Contexts_r16 != null), "optbit");
            buffer.encodeBit ((jointEHC_ROHC_Config_r16 != null), "optbit");
            buffer.encodeBit ((pdcp_DuplicationMoreThanTwoRLC_r16 != null), "optbit");
            if (drb_IAB_r16 != null) {
               drb_IAB_r16.encode (buffer);
            }
            if (non_DRB_IAB_r16 != null) {
               non_DRB_IAB_r16.encode (buffer);
            }
            if (extendedDiscardTimer_r16 != null) {
               extendedDiscardTimer_r16.encode (buffer);
            }
            if (continueEHC_Context_r16 != null) {
               continueEHC_Context_r16.encode (buffer);
            }
            if (ehc_r16 != null) {
               ehc_r16.encode (buffer);
            }
            if (maxNumberEHC_Contexts_r16 != null) {
               maxNumberEHC_Contexts_r16.encode (buffer);
            }
            if (jointEHC_ROHC_Config_r16 != null) {
               jointEHC_ROHC_Config_r16.encode (buffer);
            }
            if (pdcp_DuplicationMoreThanTwoRLC_r16 != null) {
               pdcp_DuplicationMoreThanTwoRLC_r16.encode (buffer);
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
      if (supportedROHC_Profiles != null) supportedROHC_Profiles.print (_sb, "supportedROHC_Profiles", _level+1);
      if (maxNumberROHC_ContextSessions != null) maxNumberROHC_ContextSessions.print (_sb, "maxNumberROHC_ContextSessions", _level+1);
      if (uplinkOnlyROHC_Profiles != null) uplinkOnlyROHC_Profiles.print (_sb, "uplinkOnlyROHC_Profiles", _level+1);
      if (continueROHC_Context != null) continueROHC_Context.print (_sb, "continueROHC_Context", _level+1);
      if (outOfOrderDelivery != null) outOfOrderDelivery.print (_sb, "outOfOrderDelivery", _level+1);
      if (shortSN != null) shortSN.print (_sb, "shortSN", _level+1);
      if (pdcp_DuplicationSRB != null) pdcp_DuplicationSRB.print (_sb, "pdcp_DuplicationSRB", _level+1);
      if (pdcp_DuplicationMCG_OrSCG_DRB != null) pdcp_DuplicationMCG_OrSCG_DRB.print (_sb, "pdcp_DuplicationMCG_OrSCG_DRB", _level+1);
      if (drb_IAB_r16 != null) drb_IAB_r16.print (_sb, "drb_IAB_r16", _level+1);
      if (non_DRB_IAB_r16 != null) non_DRB_IAB_r16.print (_sb, "non_DRB_IAB_r16", _level+1);
      if (extendedDiscardTimer_r16 != null) extendedDiscardTimer_r16.print (_sb, "extendedDiscardTimer_r16", _level+1);
      if (continueEHC_Context_r16 != null) continueEHC_Context_r16.print (_sb, "continueEHC_Context_r16", _level+1);
      if (ehc_r16 != null) ehc_r16.print (_sb, "ehc_r16", _level+1);
      if (maxNumberEHC_Contexts_r16 != null) maxNumberEHC_Contexts_r16.print (_sb, "maxNumberEHC_Contexts_r16", _level+1);
      if (jointEHC_ROHC_Config_r16 != null) jointEHC_ROHC_Config_r16.print (_sb, "jointEHC_ROHC_Config_r16", _level+1);
      if (pdcp_DuplicationMoreThanTwoRLC_r16 != null) pdcp_DuplicationMoreThanTwoRLC_r16.print (_sb, "pdcp_DuplicationMoreThanTwoRLC_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
