/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigGeneric extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RACH-ConfigGeneric";
   }

   public Asn1Integer prach_ConfigurationIndex;
   public RACH_ConfigGeneric_msg1_FDM msg1_FDM = null;
   public Asn1Integer msg1_FrequencyStart;
   public Asn1Integer zeroCorrelationZoneConfig;
   public Asn1Integer preambleReceivedTargetPower;
   public RACH_ConfigGeneric_preambleTransMax preambleTransMax = null;
   public RACH_ConfigGeneric_powerRampingStep powerRampingStep = null;
   public RACH_ConfigGeneric_ra_ResponseWindow ra_ResponseWindow = null;
   public boolean mV2ExtPresent;
   public RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 prach_ConfigurationPeriodScaling_IAB_r16 = null;  // optional
   public Asn1Integer prach_ConfigurationFrameOffset_IAB_r16;  // optional
   public Asn1Integer prach_ConfigurationSOffset_IAB_r16;  // optional
   public RACH_ConfigGeneric_ra_ResponseWindow_v1610 ra_ResponseWindow_v1610 = null;  // optional
   public Asn1Integer prach_ConfigurationIndex_v1610;  // optional
   public Asn1OpenExt extElem1;

   public RACH_ConfigGeneric () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_ConfigGeneric (
      Asn1Integer prach_ConfigurationIndex_,
      RACH_ConfigGeneric_msg1_FDM msg1_FDM_,
      Asn1Integer msg1_FrequencyStart_,
      Asn1Integer zeroCorrelationZoneConfig_,
      Asn1Integer preambleReceivedTargetPower_,
      RACH_ConfigGeneric_preambleTransMax preambleTransMax_,
      RACH_ConfigGeneric_powerRampingStep powerRampingStep_,
      RACH_ConfigGeneric_ra_ResponseWindow ra_ResponseWindow_,
      RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 prach_ConfigurationPeriodScaling_IAB_r16_,
      Asn1Integer prach_ConfigurationFrameOffset_IAB_r16_,
      Asn1Integer prach_ConfigurationSOffset_IAB_r16_,
      RACH_ConfigGeneric_ra_ResponseWindow_v1610 ra_ResponseWindow_v1610_,
      Asn1Integer prach_ConfigurationIndex_v1610_
   ) {
      super();
      prach_ConfigurationIndex = prach_ConfigurationIndex_;
      msg1_FDM = msg1_FDM_;
      msg1_FrequencyStart = msg1_FrequencyStart_;
      zeroCorrelationZoneConfig = zeroCorrelationZoneConfig_;
      preambleReceivedTargetPower = preambleReceivedTargetPower_;
      preambleTransMax = preambleTransMax_;
      powerRampingStep = powerRampingStep_;
      ra_ResponseWindow = ra_ResponseWindow_;
      prach_ConfigurationPeriodScaling_IAB_r16 = prach_ConfigurationPeriodScaling_IAB_r16_;
      prach_ConfigurationFrameOffset_IAB_r16 = prach_ConfigurationFrameOffset_IAB_r16_;
      prach_ConfigurationSOffset_IAB_r16 = prach_ConfigurationSOffset_IAB_r16_;
      ra_ResponseWindow_v1610 = ra_ResponseWindow_v1610_;
      prach_ConfigurationIndex_v1610 = prach_ConfigurationIndex_v1610_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RACH_ConfigGeneric (
      Asn1Integer prach_ConfigurationIndex_,
      RACH_ConfigGeneric_msg1_FDM msg1_FDM_,
      Asn1Integer msg1_FrequencyStart_,
      Asn1Integer zeroCorrelationZoneConfig_,
      Asn1Integer preambleReceivedTargetPower_,
      RACH_ConfigGeneric_preambleTransMax preambleTransMax_,
      RACH_ConfigGeneric_powerRampingStep powerRampingStep_,
      RACH_ConfigGeneric_ra_ResponseWindow ra_ResponseWindow_
   ) {
      super();
      prach_ConfigurationIndex = prach_ConfigurationIndex_;
      msg1_FDM = msg1_FDM_;
      msg1_FrequencyStart = msg1_FrequencyStart_;
      zeroCorrelationZoneConfig = zeroCorrelationZoneConfig_;
      preambleReceivedTargetPower = preambleReceivedTargetPower_;
      preambleTransMax = preambleTransMax_;
      powerRampingStep = powerRampingStep_;
      ra_ResponseWindow = ra_ResponseWindow_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RACH_ConfigGeneric (long prach_ConfigurationIndex_,
      RACH_ConfigGeneric_msg1_FDM msg1_FDM_,
      long msg1_FrequencyStart_,
      long zeroCorrelationZoneConfig_,
      long preambleReceivedTargetPower_,
      RACH_ConfigGeneric_preambleTransMax preambleTransMax_,
      RACH_ConfigGeneric_powerRampingStep powerRampingStep_,
      RACH_ConfigGeneric_ra_ResponseWindow ra_ResponseWindow_,
      RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16 prach_ConfigurationPeriodScaling_IAB_r16_,
      long prach_ConfigurationFrameOffset_IAB_r16_,
      long prach_ConfigurationSOffset_IAB_r16_,
      RACH_ConfigGeneric_ra_ResponseWindow_v1610 ra_ResponseWindow_v1610_,
      long prach_ConfigurationIndex_v1610_
   ) {
      super();
      prach_ConfigurationIndex = new Asn1Integer (prach_ConfigurationIndex_);
      msg1_FDM = msg1_FDM_;
      msg1_FrequencyStart = new Asn1Integer (msg1_FrequencyStart_);
      zeroCorrelationZoneConfig = new Asn1Integer (zeroCorrelationZoneConfig_);
      preambleReceivedTargetPower = new Asn1Integer (preambleReceivedTargetPower_);
      preambleTransMax = preambleTransMax_;
      powerRampingStep = powerRampingStep_;
      ra_ResponseWindow = ra_ResponseWindow_;
      prach_ConfigurationPeriodScaling_IAB_r16 = prach_ConfigurationPeriodScaling_IAB_r16_;
      prach_ConfigurationFrameOffset_IAB_r16 = new Asn1Integer (prach_ConfigurationFrameOffset_IAB_r16_);
      prach_ConfigurationSOffset_IAB_r16 = new Asn1Integer (prach_ConfigurationSOffset_IAB_r16_);
      ra_ResponseWindow_v1610 = ra_ResponseWindow_v1610_;
      prach_ConfigurationIndex_v1610 = new Asn1Integer (prach_ConfigurationIndex_v1610_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RACH_ConfigGeneric (
      long prach_ConfigurationIndex_,
      RACH_ConfigGeneric_msg1_FDM msg1_FDM_,
      long msg1_FrequencyStart_,
      long zeroCorrelationZoneConfig_,
      long preambleReceivedTargetPower_,
      RACH_ConfigGeneric_preambleTransMax preambleTransMax_,
      RACH_ConfigGeneric_powerRampingStep powerRampingStep_,
      RACH_ConfigGeneric_ra_ResponseWindow ra_ResponseWindow_
   ) {
      super();
      prach_ConfigurationIndex = new Asn1Integer (prach_ConfigurationIndex_);
      msg1_FDM = msg1_FDM_;
      msg1_FrequencyStart = new Asn1Integer (msg1_FrequencyStart_);
      zeroCorrelationZoneConfig = new Asn1Integer (zeroCorrelationZoneConfig_);
      preambleReceivedTargetPower = new Asn1Integer (preambleReceivedTargetPower_);
      preambleTransMax = preambleTransMax_;
      powerRampingStep = powerRampingStep_;
      ra_ResponseWindow = ra_ResponseWindow_;
   }

   public void init () {
      prach_ConfigurationIndex = null;
      msg1_FDM = null;
      msg1_FrequencyStart = null;
      zeroCorrelationZoneConfig = null;
      preambleReceivedTargetPower = null;
      preambleTransMax = null;
      powerRampingStep = null;
      ra_ResponseWindow = null;
      prach_ConfigurationPeriodScaling_IAB_r16 = null;
      prach_ConfigurationFrameOffset_IAB_r16 = null;
      prach_ConfigurationSOffset_IAB_r16 = null;
      ra_ResponseWindow_v1610 = null;
      prach_ConfigurationIndex_v1610 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return prach_ConfigurationIndex;
         case 1: return msg1_FDM;
         case 2: return msg1_FrequencyStart;
         case 3: return zeroCorrelationZoneConfig;
         case 4: return preambleReceivedTargetPower;
         case 5: return preambleTransMax;
         case 6: return powerRampingStep;
         case 7: return ra_ResponseWindow;
         case 8: return prach_ConfigurationPeriodScaling_IAB_r16;
         case 9: return prach_ConfigurationFrameOffset_IAB_r16;
         case 10: return prach_ConfigurationSOffset_IAB_r16;
         case 11: return ra_ResponseWindow_v1610;
         case 12: return prach_ConfigurationIndex_v1610;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "prach-ConfigurationIndex";
         case 1: return "msg1-FDM";
         case 2: return "msg1-FrequencyStart";
         case 3: return "zeroCorrelationZoneConfig";
         case 4: return "preambleReceivedTargetPower";
         case 5: return "preambleTransMax";
         case 6: return "powerRampingStep";
         case 7: return "ra-ResponseWindow";
         case 8: return "prach-ConfigurationPeriodScaling-IAB-r16";
         case 9: return "prach-ConfigurationFrameOffset-IAB-r16";
         case 10: return "prach-ConfigurationSOffset-IAB-r16";
         case 11: return "ra-ResponseWindow-v1610";
         case 12: return "prach-ConfigurationIndex-v1610";
         case 13: return null;
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

      // decode prach_ConfigurationIndex

      buffer.getContext().eventDispatcher.startElement("prach_ConfigurationIndex", -1);

      prach_ConfigurationIndex = new Asn1Integer();
      prach_ConfigurationIndex.decode (buffer, 0, 255);

      buffer.invokeCharacters(prach_ConfigurationIndex.toString());
      buffer.getContext().eventDispatcher.endElement("prach_ConfigurationIndex", -1);

      // decode msg1_FDM

      buffer.getContext().eventDispatcher.startElement("msg1_FDM", -1);

      {
         int tval = RACH_ConfigGeneric_msg1_FDM.decodeEnumValue (buffer);
         msg1_FDM = RACH_ConfigGeneric_msg1_FDM.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("msg1_FDM", -1);

      // decode msg1_FrequencyStart

      buffer.getContext().eventDispatcher.startElement("msg1_FrequencyStart", -1);

      msg1_FrequencyStart = new Asn1Integer();
      msg1_FrequencyStart.decode (buffer, 0, 274);

      buffer.invokeCharacters(msg1_FrequencyStart.toString());
      buffer.getContext().eventDispatcher.endElement("msg1_FrequencyStart", -1);

      // decode zeroCorrelationZoneConfig

      buffer.getContext().eventDispatcher.startElement("zeroCorrelationZoneConfig", -1);

      zeroCorrelationZoneConfig = new Asn1Integer();
      zeroCorrelationZoneConfig.decode (buffer, 0, 15);

      buffer.invokeCharacters(zeroCorrelationZoneConfig.toString());
      buffer.getContext().eventDispatcher.endElement("zeroCorrelationZoneConfig", -1);

      // decode preambleReceivedTargetPower

      buffer.getContext().eventDispatcher.startElement("preambleReceivedTargetPower", -1);

      preambleReceivedTargetPower = new Asn1Integer();
      preambleReceivedTargetPower.decode (buffer, -202, -60);

      buffer.invokeCharacters(preambleReceivedTargetPower.toString());
      buffer.getContext().eventDispatcher.endElement("preambleReceivedTargetPower", -1);

      // decode preambleTransMax

      buffer.getContext().eventDispatcher.startElement("preambleTransMax", -1);

      {
         int tval = RACH_ConfigGeneric_preambleTransMax.decodeEnumValue (buffer);
         preambleTransMax = RACH_ConfigGeneric_preambleTransMax.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("preambleTransMax", -1);

      // decode powerRampingStep

      buffer.getContext().eventDispatcher.startElement("powerRampingStep", -1);

      {
         int tval = RACH_ConfigGeneric_powerRampingStep.decodeEnumValue (buffer);
         powerRampingStep = RACH_ConfigGeneric_powerRampingStep.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("powerRampingStep", -1);

      // decode ra_ResponseWindow

      buffer.getContext().eventDispatcher.startElement("ra_ResponseWindow", -1);

      {
         int tval = RACH_ConfigGeneric_ra_ResponseWindow.decodeEnumValue (buffer);
         ra_ResponseWindow = RACH_ConfigGeneric_ra_ResponseWindow.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("ra_ResponseWindow", -1);

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

            boolean prach_ConfigurationPeriodScaling_IAB_r16Present = buffer.decodeBit ("prach_ConfigurationPeriodScaling_IAB_r16Present");

            boolean prach_ConfigurationFrameOffset_IAB_r16Present = buffer.decodeBit ("prach_ConfigurationFrameOffset_IAB_r16Present");

            boolean prach_ConfigurationSOffset_IAB_r16Present = buffer.decodeBit ("prach_ConfigurationSOffset_IAB_r16Present");

            boolean ra_ResponseWindow_v1610Present = buffer.decodeBit ("ra_ResponseWindow_v1610Present");

            boolean prach_ConfigurationIndex_v1610Present = buffer.decodeBit ("prach_ConfigurationIndex_v1610Present");

            // decode prach_ConfigurationPeriodScaling_IAB_r16

            if (prach_ConfigurationPeriodScaling_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("prach_ConfigurationPeriodScaling_IAB_r16", -1);

               int tval = RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16.decodeEnumValue (buffer);
               prach_ConfigurationPeriodScaling_IAB_r16 = RACH_ConfigGeneric_prach_ConfigurationPeriodScaling_IAB_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("prach_ConfigurationPeriodScaling_IAB_r16", -1);
            }
            else {
               prach_ConfigurationPeriodScaling_IAB_r16 = null;
            }

            // decode prach_ConfigurationFrameOffset_IAB_r16

            if (prach_ConfigurationFrameOffset_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("prach_ConfigurationFrameOffset_IAB_r16", -1);

               prach_ConfigurationFrameOffset_IAB_r16 = new Asn1Integer();
               prach_ConfigurationFrameOffset_IAB_r16.decode (buffer, 0, 63);

               buffer.invokeCharacters(prach_ConfigurationFrameOffset_IAB_r16.toString());
               buffer.getContext().eventDispatcher.endElement("prach_ConfigurationFrameOffset_IAB_r16", -1);
            }
            else {
               prach_ConfigurationFrameOffset_IAB_r16 = null;
            }

            // decode prach_ConfigurationSOffset_IAB_r16

            if (prach_ConfigurationSOffset_IAB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("prach_ConfigurationSOffset_IAB_r16", -1);

               prach_ConfigurationSOffset_IAB_r16 = new Asn1Integer();
               prach_ConfigurationSOffset_IAB_r16.decode (buffer, 0, 39);

               buffer.invokeCharacters(prach_ConfigurationSOffset_IAB_r16.toString());
               buffer.getContext().eventDispatcher.endElement("prach_ConfigurationSOffset_IAB_r16", -1);
            }
            else {
               prach_ConfigurationSOffset_IAB_r16 = null;
            }

            // decode ra_ResponseWindow_v1610

            if (ra_ResponseWindow_v1610Present) {
               buffer.getContext().eventDispatcher.startElement("ra_ResponseWindow_v1610", -1);

               int tval = RACH_ConfigGeneric_ra_ResponseWindow_v1610.decodeEnumValue (buffer);
               ra_ResponseWindow_v1610 = RACH_ConfigGeneric_ra_ResponseWindow_v1610.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("ra_ResponseWindow_v1610", -1);
            }
            else {
               ra_ResponseWindow_v1610 = null;
            }

            // decode prach_ConfigurationIndex_v1610

            if (prach_ConfigurationIndex_v1610Present) {
               buffer.getContext().eventDispatcher.startElement("prach_ConfigurationIndex_v1610", -1);

               prach_ConfigurationIndex_v1610 = new Asn1Integer();
               prach_ConfigurationIndex_v1610.decode (buffer, 256, 262);

               buffer.invokeCharacters(prach_ConfigurationIndex_v1610.toString());
               buffer.getContext().eventDispatcher.endElement("prach_ConfigurationIndex_v1610", -1);
            }
            else {
               prach_ConfigurationIndex_v1610 = null;
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

      // encode prach_ConfigurationIndex

      if (prach_ConfigurationIndex != null) {
         buffer.getContext().eventDispatcher.startElement("prach_ConfigurationIndex", -1);

         prach_ConfigurationIndex.encode (buffer, 0, 255);

         buffer.getContext().eventDispatcher.endElement("prach_ConfigurationIndex", -1);
      }
      else throw new Asn1MissingRequiredException ("prach_ConfigurationIndex");

      // encode msg1_FDM

      if (msg1_FDM != null) {
         buffer.getContext().eventDispatcher.startElement("msg1_FDM", -1);

         msg1_FDM.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("msg1_FDM", -1);
      }
      else throw new Asn1MissingRequiredException ("msg1_FDM");

      // encode msg1_FrequencyStart

      if (msg1_FrequencyStart != null) {
         buffer.getContext().eventDispatcher.startElement("msg1_FrequencyStart", -1);

         msg1_FrequencyStart.encode (buffer, 0, 274);

         buffer.getContext().eventDispatcher.endElement("msg1_FrequencyStart", -1);
      }
      else throw new Asn1MissingRequiredException ("msg1_FrequencyStart");

      // encode zeroCorrelationZoneConfig

      if (zeroCorrelationZoneConfig != null) {
         buffer.getContext().eventDispatcher.startElement("zeroCorrelationZoneConfig", -1);

         zeroCorrelationZoneConfig.encode (buffer, 0, 15);

         buffer.getContext().eventDispatcher.endElement("zeroCorrelationZoneConfig", -1);
      }
      else throw new Asn1MissingRequiredException ("zeroCorrelationZoneConfig");

      // encode preambleReceivedTargetPower

      if (preambleReceivedTargetPower != null) {
         buffer.getContext().eventDispatcher.startElement("preambleReceivedTargetPower", -1);

         preambleReceivedTargetPower.encode (buffer, -202, -60);

         buffer.getContext().eventDispatcher.endElement("preambleReceivedTargetPower", -1);
      }
      else throw new Asn1MissingRequiredException ("preambleReceivedTargetPower");

      // encode preambleTransMax

      if (preambleTransMax != null) {
         buffer.getContext().eventDispatcher.startElement("preambleTransMax", -1);

         preambleTransMax.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("preambleTransMax", -1);
      }
      else throw new Asn1MissingRequiredException ("preambleTransMax");

      // encode powerRampingStep

      if (powerRampingStep != null) {
         buffer.getContext().eventDispatcher.startElement("powerRampingStep", -1);

         powerRampingStep.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("powerRampingStep", -1);
      }
      else throw new Asn1MissingRequiredException ("powerRampingStep");

      // encode ra_ResponseWindow

      if (ra_ResponseWindow != null) {
         buffer.getContext().eventDispatcher.startElement("ra_ResponseWindow", -1);

         ra_ResponseWindow.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_ResponseWindow", -1);
      }
      else throw new Asn1MissingRequiredException ("ra_ResponseWindow");

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
            buffer.encodeBit ((prach_ConfigurationPeriodScaling_IAB_r16 != null), "optbit");
            buffer.encodeBit ((prach_ConfigurationFrameOffset_IAB_r16 != null), "optbit");
            buffer.encodeBit ((prach_ConfigurationSOffset_IAB_r16 != null), "optbit");
            buffer.encodeBit ((ra_ResponseWindow_v1610 != null), "optbit");
            buffer.encodeBit ((prach_ConfigurationIndex_v1610 != null), "optbit");
            if (prach_ConfigurationPeriodScaling_IAB_r16 != null) {
               prach_ConfigurationPeriodScaling_IAB_r16.encode (buffer);
            }
            if (prach_ConfigurationFrameOffset_IAB_r16 != null) {
               prach_ConfigurationFrameOffset_IAB_r16.encode (buffer, 0, 63);
            }
            if (prach_ConfigurationSOffset_IAB_r16 != null) {
               prach_ConfigurationSOffset_IAB_r16.encode (buffer, 0, 39);
            }
            if (ra_ResponseWindow_v1610 != null) {
               ra_ResponseWindow_v1610.encode (buffer);
            }
            if (prach_ConfigurationIndex_v1610 != null) {
               prach_ConfigurationIndex_v1610.encode (buffer, 256, 262);
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
      if (prach_ConfigurationIndex != null) prach_ConfigurationIndex.print (_sb, "prach_ConfigurationIndex", _level+1);
      if (msg1_FDM != null) msg1_FDM.print (_sb, "msg1_FDM", _level+1);
      if (msg1_FrequencyStart != null) msg1_FrequencyStart.print (_sb, "msg1_FrequencyStart", _level+1);
      if (zeroCorrelationZoneConfig != null) zeroCorrelationZoneConfig.print (_sb, "zeroCorrelationZoneConfig", _level+1);
      if (preambleReceivedTargetPower != null) preambleReceivedTargetPower.print (_sb, "preambleReceivedTargetPower", _level+1);
      if (preambleTransMax != null) preambleTransMax.print (_sb, "preambleTransMax", _level+1);
      if (powerRampingStep != null) powerRampingStep.print (_sb, "powerRampingStep", _level+1);
      if (ra_ResponseWindow != null) ra_ResponseWindow.print (_sb, "ra_ResponseWindow", _level+1);
      if (prach_ConfigurationPeriodScaling_IAB_r16 != null) prach_ConfigurationPeriodScaling_IAB_r16.print (_sb, "prach_ConfigurationPeriodScaling_IAB_r16", _level+1);
      if (prach_ConfigurationFrameOffset_IAB_r16 != null) prach_ConfigurationFrameOffset_IAB_r16.print (_sb, "prach_ConfigurationFrameOffset_IAB_r16", _level+1);
      if (prach_ConfigurationSOffset_IAB_r16 != null) prach_ConfigurationSOffset_IAB_r16.print (_sb, "prach_ConfigurationSOffset_IAB_r16", _level+1);
      if (ra_ResponseWindow_v1610 != null) ra_ResponseWindow_v1610.print (_sb, "ra_ResponseWindow_v1610", _level+1);
      if (prach_ConfigurationIndex_v1610 != null) prach_ConfigurationIndex_v1610.print (_sb, "prach_ConfigurationIndex_v1610", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
