/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.RLC_ParametersSidelink_r16;
import asn.nr.generated.NR_RRC_Definitions.FreqBandList;

public class UECapabilityInformationSidelink_IEs_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityInformationSidelink-IEs-r16";
   }

   public AccessStratumReleaseSidelink_r16 accessStratumReleaseSidelink_r16 = null;
   public PDCP_ParametersSidelink_r16 pdcp_ParametersSidelink_r16;  // optional
   public RLC_ParametersSidelink_r16 rlc_ParametersSidelink_r16;  // optional
   public BandCombinationListSidelinkNR_r16 supportedBandCombinationListSidelinkNR_r16;  // optional
   public UECapabilityInformationSidelink_IEs_r16_supportedBandListSidelink_r16 supportedBandListSidelink_r16;  // optional
   public FreqBandList appliedFreqBandListFilter_r16;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public UECapabilityInformationSidelink_IEs_r16_nonCriticalExtension nonCriticalExtension;  // optional

   public UECapabilityInformationSidelink_IEs_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityInformationSidelink_IEs_r16 (
      AccessStratumReleaseSidelink_r16 accessStratumReleaseSidelink_r16_,
      PDCP_ParametersSidelink_r16 pdcp_ParametersSidelink_r16_,
      RLC_ParametersSidelink_r16 rlc_ParametersSidelink_r16_,
      BandCombinationListSidelinkNR_r16 supportedBandCombinationListSidelinkNR_r16_,
      UECapabilityInformationSidelink_IEs_r16_supportedBandListSidelink_r16 supportedBandListSidelink_r16_,
      FreqBandList appliedFreqBandListFilter_r16_,
      Asn1OctetString lateNonCriticalExtension_,
      UECapabilityInformationSidelink_IEs_r16_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      accessStratumReleaseSidelink_r16 = accessStratumReleaseSidelink_r16_;
      pdcp_ParametersSidelink_r16 = pdcp_ParametersSidelink_r16_;
      rlc_ParametersSidelink_r16 = rlc_ParametersSidelink_r16_;
      supportedBandCombinationListSidelinkNR_r16 = supportedBandCombinationListSidelinkNR_r16_;
      supportedBandListSidelink_r16 = supportedBandListSidelink_r16_;
      appliedFreqBandListFilter_r16 = appliedFreqBandListFilter_r16_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UECapabilityInformationSidelink_IEs_r16 (
      AccessStratumReleaseSidelink_r16 accessStratumReleaseSidelink_r16_
   ) {
      super();
      accessStratumReleaseSidelink_r16 = accessStratumReleaseSidelink_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UECapabilityInformationSidelink_IEs_r16 (AccessStratumReleaseSidelink_r16 accessStratumReleaseSidelink_r16_,
      PDCP_ParametersSidelink_r16 pdcp_ParametersSidelink_r16_,
      RLC_ParametersSidelink_r16 rlc_ParametersSidelink_r16_,
      BandCombinationListSidelinkNR_r16 supportedBandCombinationListSidelinkNR_r16_,
      UECapabilityInformationSidelink_IEs_r16_supportedBandListSidelink_r16 supportedBandListSidelink_r16_,
      FreqBandList appliedFreqBandListFilter_r16_,
      byte[] lateNonCriticalExtension_,
      UECapabilityInformationSidelink_IEs_r16_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      accessStratumReleaseSidelink_r16 = accessStratumReleaseSidelink_r16_;
      pdcp_ParametersSidelink_r16 = pdcp_ParametersSidelink_r16_;
      rlc_ParametersSidelink_r16 = rlc_ParametersSidelink_r16_;
      supportedBandCombinationListSidelinkNR_r16 = supportedBandCombinationListSidelinkNR_r16_;
      supportedBandListSidelink_r16 = supportedBandListSidelink_r16_;
      appliedFreqBandListFilter_r16 = appliedFreqBandListFilter_r16_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      accessStratumReleaseSidelink_r16 = null;
      pdcp_ParametersSidelink_r16 = null;
      rlc_ParametersSidelink_r16 = null;
      supportedBandCombinationListSidelinkNR_r16 = null;
      supportedBandListSidelink_r16 = null;
      appliedFreqBandListFilter_r16 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return accessStratumReleaseSidelink_r16;
         case 1: return pdcp_ParametersSidelink_r16;
         case 2: return rlc_ParametersSidelink_r16;
         case 3: return supportedBandCombinationListSidelinkNR_r16;
         case 4: return supportedBandListSidelink_r16;
         case 5: return appliedFreqBandListFilter_r16;
         case 6: return lateNonCriticalExtension;
         case 7: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "accessStratumReleaseSidelink-r16";
         case 1: return "pdcp-ParametersSidelink-r16";
         case 2: return "rlc-ParametersSidelink-r16";
         case 3: return "supportedBandCombinationListSidelinkNR-r16";
         case 4: return "supportedBandListSidelink-r16";
         case 5: return "appliedFreqBandListFilter-r16";
         case 6: return "lateNonCriticalExtension";
         case 7: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pdcp_ParametersSidelink_r16Present = buffer.decodeBit ("pdcp_ParametersSidelink_r16Present");
      boolean rlc_ParametersSidelink_r16Present = buffer.decodeBit ("rlc_ParametersSidelink_r16Present");
      boolean supportedBandCombinationListSidelinkNR_r16Present = buffer.decodeBit ("supportedBandCombinationListSidelinkNR_r16Present");
      boolean supportedBandListSidelink_r16Present = buffer.decodeBit ("supportedBandListSidelink_r16Present");
      boolean appliedFreqBandListFilter_r16Present = buffer.decodeBit ("appliedFreqBandListFilter_r16Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode accessStratumReleaseSidelink_r16

      buffer.getContext().eventDispatcher.startElement("accessStratumReleaseSidelink_r16", -1);

      {
         int tval = AccessStratumReleaseSidelink_r16.decodeEnumValue (buffer);
         accessStratumReleaseSidelink_r16 = AccessStratumReleaseSidelink_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("accessStratumReleaseSidelink_r16", -1);

      // decode pdcp_ParametersSidelink_r16

      if (pdcp_ParametersSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pdcp_ParametersSidelink_r16", -1);

         pdcp_ParametersSidelink_r16 = new PDCP_ParametersSidelink_r16();
         pdcp_ParametersSidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pdcp_ParametersSidelink_r16", -1);
      }
      else {
         pdcp_ParametersSidelink_r16 = null;
      }

      // decode rlc_ParametersSidelink_r16

      if (rlc_ParametersSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rlc_ParametersSidelink_r16", -1);

         rlc_ParametersSidelink_r16 = new RLC_ParametersSidelink_r16();
         rlc_ParametersSidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_ParametersSidelink_r16", -1);
      }
      else {
         rlc_ParametersSidelink_r16 = null;
      }

      // decode supportedBandCombinationListSidelinkNR_r16

      if (supportedBandCombinationListSidelinkNR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombinationListSidelinkNR_r16", -1);

         supportedBandCombinationListSidelinkNR_r16 = new BandCombinationListSidelinkNR_r16();
         supportedBandCombinationListSidelinkNR_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandCombinationListSidelinkNR_r16", -1);
      }
      else {
         supportedBandCombinationListSidelinkNR_r16 = null;
      }

      // decode supportedBandListSidelink_r16

      if (supportedBandListSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandListSidelink_r16", -1);

         supportedBandListSidelink_r16 = new UECapabilityInformationSidelink_IEs_r16_supportedBandListSidelink_r16();
         supportedBandListSidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandListSidelink_r16", -1);
      }
      else {
         supportedBandListSidelink_r16 = null;
      }

      // decode appliedFreqBandListFilter_r16

      if (appliedFreqBandListFilter_r16Present) {
         buffer.getContext().eventDispatcher.startElement("appliedFreqBandListFilter_r16", -1);

         appliedFreqBandListFilter_r16 = new FreqBandList();
         appliedFreqBandListFilter_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("appliedFreqBandListFilter_r16", -1);
      }
      else {
         appliedFreqBandListFilter_r16 = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityInformationSidelink_IEs_r16_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((pdcp_ParametersSidelink_r16 != null), null);
      buffer.encodeBit ((rlc_ParametersSidelink_r16 != null), null);
      buffer.encodeBit ((supportedBandCombinationListSidelinkNR_r16 != null), null);
      buffer.encodeBit ((supportedBandListSidelink_r16 != null), null);
      buffer.encodeBit ((appliedFreqBandListFilter_r16 != null), null);
      buffer.encodeBit ((lateNonCriticalExtension != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode accessStratumReleaseSidelink_r16

      if (accessStratumReleaseSidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("accessStratumReleaseSidelink_r16", -1);

         accessStratumReleaseSidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("accessStratumReleaseSidelink_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("accessStratumReleaseSidelink_r16");

      // encode pdcp_ParametersSidelink_r16

      if (pdcp_ParametersSidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("pdcp_ParametersSidelink_r16", -1);

         pdcp_ParametersSidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdcp_ParametersSidelink_r16", -1);
      }

      // encode rlc_ParametersSidelink_r16

      if (rlc_ParametersSidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rlc_ParametersSidelink_r16", -1);

         rlc_ParametersSidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rlc_ParametersSidelink_r16", -1);
      }

      // encode supportedBandCombinationListSidelinkNR_r16

      if (supportedBandCombinationListSidelinkNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("supportedBandCombinationListSidelinkNR_r16", -1);

         supportedBandCombinationListSidelinkNR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedBandCombinationListSidelinkNR_r16", -1);
      }

      // encode supportedBandListSidelink_r16

      if (supportedBandListSidelink_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("supportedBandListSidelink_r16", -1);

         supportedBandListSidelink_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("supportedBandListSidelink_r16", -1);
      }

      // encode appliedFreqBandListFilter_r16

      if (appliedFreqBandListFilter_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("appliedFreqBandListFilter_r16", -1);

         appliedFreqBandListFilter_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("appliedFreqBandListFilter_r16", -1);
      }

      // encode lateNonCriticalExtension

      if (lateNonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (accessStratumReleaseSidelink_r16 != null) accessStratumReleaseSidelink_r16.print (_sb, "accessStratumReleaseSidelink_r16", _level+1);
      if (pdcp_ParametersSidelink_r16 != null) pdcp_ParametersSidelink_r16.print (_sb, "pdcp_ParametersSidelink_r16", _level+1);
      if (rlc_ParametersSidelink_r16 != null) rlc_ParametersSidelink_r16.print (_sb, "rlc_ParametersSidelink_r16", _level+1);
      if (supportedBandCombinationListSidelinkNR_r16 != null) supportedBandCombinationListSidelinkNR_r16.print (_sb, "supportedBandCombinationListSidelinkNR_r16", _level+1);
      if (supportedBandListSidelink_r16 != null) supportedBandListSidelink_r16.print (_sb, "supportedBandListSidelink_r16", _level+1);
      if (appliedFreqBandListFilter_r16 != null) appliedFreqBandListFilter_r16.print (_sb, "appliedFreqBandListFilter_r16", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
