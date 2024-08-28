/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlinkPerCC extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FeatureSetDownlinkPerCC";
   }

   public SubcarrierSpacing supportedSubcarrierSpacingDL = null;
   public SupportedBandwidth supportedBandwidthDL;
   public FeatureSetDownlinkPerCC_channelBW_90mhz channelBW_90mhz = null;  // optional
   public MIMO_LayersDL maxNumberMIMO_LayersPDSCH = null;  // optional
   public ModulationOrder supportedModulationOrderDL = null;  // optional

   public FeatureSetDownlinkPerCC () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetDownlinkPerCC (
      SubcarrierSpacing supportedSubcarrierSpacingDL_,
      SupportedBandwidth supportedBandwidthDL_,
      FeatureSetDownlinkPerCC_channelBW_90mhz channelBW_90mhz_,
      MIMO_LayersDL maxNumberMIMO_LayersPDSCH_,
      ModulationOrder supportedModulationOrderDL_
   ) {
      super();
      supportedSubcarrierSpacingDL = supportedSubcarrierSpacingDL_;
      supportedBandwidthDL = supportedBandwidthDL_;
      channelBW_90mhz = channelBW_90mhz_;
      maxNumberMIMO_LayersPDSCH = maxNumberMIMO_LayersPDSCH_;
      supportedModulationOrderDL = supportedModulationOrderDL_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FeatureSetDownlinkPerCC (
      SubcarrierSpacing supportedSubcarrierSpacingDL_,
      SupportedBandwidth supportedBandwidthDL_
   ) {
      super();
      supportedSubcarrierSpacingDL = supportedSubcarrierSpacingDL_;
      supportedBandwidthDL = supportedBandwidthDL_;
   }

   public void init () {
      supportedSubcarrierSpacingDL = null;
      supportedBandwidthDL = null;
      channelBW_90mhz = null;
      maxNumberMIMO_LayersPDSCH = null;
      supportedModulationOrderDL = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportedSubcarrierSpacingDL;
         case 1: return supportedBandwidthDL;
         case 2: return channelBW_90mhz;
         case 3: return maxNumberMIMO_LayersPDSCH;
         case 4: return supportedModulationOrderDL;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportedSubcarrierSpacingDL";
         case 1: return "supportedBandwidthDL";
         case 2: return "channelBW-90mhz";
         case 3: return "maxNumberMIMO-LayersPDSCH";
         case 4: return "supportedModulationOrderDL";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean channelBW_90mhzPresent = buffer.decodeBit ("channelBW_90mhzPresent");
      boolean maxNumberMIMO_LayersPDSCHPresent = buffer.decodeBit ("maxNumberMIMO_LayersPDSCHPresent");
      boolean supportedModulationOrderDLPresent = buffer.decodeBit ("supportedModulationOrderDLPresent");

      // decode supportedSubcarrierSpacingDL

      buffer.getContext().eventDispatcher.startElement("supportedSubcarrierSpacingDL", -1);

      {
         int tval = SubcarrierSpacing.decodeEnumValue (buffer);
         supportedSubcarrierSpacingDL = SubcarrierSpacing.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("supportedSubcarrierSpacingDL", -1);

      // decode supportedBandwidthDL

      buffer.getContext().eventDispatcher.startElement("supportedBandwidthDL", -1);

      supportedBandwidthDL = new SupportedBandwidth();
      supportedBandwidthDL.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("supportedBandwidthDL", -1);

      // decode channelBW_90mhz

      if (channelBW_90mhzPresent) {
         buffer.getContext().eventDispatcher.startElement("channelBW_90mhz", -1);

         int tval = FeatureSetDownlinkPerCC_channelBW_90mhz.decodeEnumValue (buffer);
         channelBW_90mhz = FeatureSetDownlinkPerCC_channelBW_90mhz.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("channelBW_90mhz", -1);
      }
      else {
         channelBW_90mhz = null;
      }

      // decode maxNumberMIMO_LayersPDSCH

      if (maxNumberMIMO_LayersPDSCHPresent) {
         buffer.getContext().eventDispatcher.startElement("maxNumberMIMO_LayersPDSCH", -1);

         int tval = MIMO_LayersDL.decodeEnumValue (buffer);
         maxNumberMIMO_LayersPDSCH = MIMO_LayersDL.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("maxNumberMIMO_LayersPDSCH", -1);
      }
      else {
         maxNumberMIMO_LayersPDSCH = null;
      }

      // decode supportedModulationOrderDL

      if (supportedModulationOrderDLPresent) {
         buffer.getContext().eventDispatcher.startElement("supportedModulationOrderDL", -1);

         int tval = ModulationOrder.decodeEnumValue (buffer);
         supportedModulationOrderDL = ModulationOrder.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportedModulationOrderDL", -1);
      }
      else {
         supportedModulationOrderDL = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((channelBW_90mhz != null), null);
      buffer.encodeBit ((maxNumberMIMO_LayersPDSCH != null), null);
      buffer.encodeBit ((supportedModulationOrderDL != null), null);

      // encode supportedSubcarrierSpacingDL

      if (supportedSubcarrierSpacingDL != null) {
         buffer.getContext().eventDispatcher.startElement("supportedSubcarrierSpacingDL", -1);

         supportedSubcarrierSpacingDL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedSubcarrierSpacingDL", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedSubcarrierSpacingDL");

      // encode supportedBandwidthDL

      if (supportedBandwidthDL != null) {
         buffer.getContext().eventDispatcher.startElement("supportedBandwidthDL", -1);

         supportedBandwidthDL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedBandwidthDL", -1);
      }
      else throw new Asn1MissingRequiredException ("supportedBandwidthDL");

      // encode channelBW_90mhz

      if (channelBW_90mhz != null) {
         buffer.getContext().eventDispatcher.startElement("channelBW_90mhz", -1);

         channelBW_90mhz.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("channelBW_90mhz", -1);
      }

      // encode maxNumberMIMO_LayersPDSCH

      if (maxNumberMIMO_LayersPDSCH != null) {
         buffer.getContext().eventDispatcher.startElement("maxNumberMIMO_LayersPDSCH", -1);

         maxNumberMIMO_LayersPDSCH.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("maxNumberMIMO_LayersPDSCH", -1);
      }

      // encode supportedModulationOrderDL

      if (supportedModulationOrderDL != null) {
         buffer.getContext().eventDispatcher.startElement("supportedModulationOrderDL", -1);

         supportedModulationOrderDL.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedModulationOrderDL", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportedSubcarrierSpacingDL != null) supportedSubcarrierSpacingDL.print (_sb, "supportedSubcarrierSpacingDL", _level+1);
      if (supportedBandwidthDL != null) supportedBandwidthDL.print (_sb, "supportedBandwidthDL", _level+1);
      if (channelBW_90mhz != null) channelBW_90mhz.print (_sb, "channelBW_90mhz", _level+1);
      if (maxNumberMIMO_LayersPDSCH != null) maxNumberMIMO_LayersPDSCH.print (_sb, "maxNumberMIMO_LayersPDSCH", _level+1);
      if (supportedModulationOrderDL != null) supportedModulationOrderDL.print (_sb, "supportedModulationOrderDL", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
