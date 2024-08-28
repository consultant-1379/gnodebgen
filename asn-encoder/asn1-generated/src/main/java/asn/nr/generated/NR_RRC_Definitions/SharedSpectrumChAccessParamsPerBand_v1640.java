/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SharedSpectrumChAccessParamsPerBand_v1640 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SharedSpectrumChAccessParamsPerBand-v1640";
   }

   public SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithSSB_r16 csi_RSRP_AndRSRQ_MeasWithSSB_r16 = null;  // optional
   public SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 = null;  // optional
   public SharedSpectrumChAccessParamsPerBand_v1640_csi_SINR_Meas_r16 csi_SINR_Meas_r16 = null;  // optional
   public SharedSpectrumChAccessParamsPerBand_v1640_ssb_AndCSI_RS_RLM_r16 ssb_AndCSI_RS_RLM_r16 = null;  // optional
   public SharedSpectrumChAccessParamsPerBand_v1640_csi_RS_CFRA_ForHO_r16 csi_RS_CFRA_ForHO_r16 = null;  // optional

   public SharedSpectrumChAccessParamsPerBand_v1640 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SharedSpectrumChAccessParamsPerBand_v1640 (
      SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithSSB_r16 csi_RSRP_AndRSRQ_MeasWithSSB_r16_,
      SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 csi_RSRP_AndRSRQ_MeasWithoutSSB_r16_,
      SharedSpectrumChAccessParamsPerBand_v1640_csi_SINR_Meas_r16 csi_SINR_Meas_r16_,
      SharedSpectrumChAccessParamsPerBand_v1640_ssb_AndCSI_RS_RLM_r16 ssb_AndCSI_RS_RLM_r16_,
      SharedSpectrumChAccessParamsPerBand_v1640_csi_RS_CFRA_ForHO_r16 csi_RS_CFRA_ForHO_r16_
   ) {
      super();
      csi_RSRP_AndRSRQ_MeasWithSSB_r16 = csi_RSRP_AndRSRQ_MeasWithSSB_r16_;
      csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 = csi_RSRP_AndRSRQ_MeasWithoutSSB_r16_;
      csi_SINR_Meas_r16 = csi_SINR_Meas_r16_;
      ssb_AndCSI_RS_RLM_r16 = ssb_AndCSI_RS_RLM_r16_;
      csi_RS_CFRA_ForHO_r16 = csi_RS_CFRA_ForHO_r16_;
   }

   public void init () {
      csi_RSRP_AndRSRQ_MeasWithSSB_r16 = null;
      csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 = null;
      csi_SINR_Meas_r16 = null;
      ssb_AndCSI_RS_RLM_r16 = null;
      csi_RS_CFRA_ForHO_r16 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_RSRP_AndRSRQ_MeasWithSSB_r16;
         case 1: return csi_RSRP_AndRSRQ_MeasWithoutSSB_r16;
         case 2: return csi_SINR_Meas_r16;
         case 3: return ssb_AndCSI_RS_RLM_r16;
         case 4: return csi_RS_CFRA_ForHO_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-RSRP-AndRSRQ-MeasWithSSB-r16";
         case 1: return "csi-RSRP-AndRSRQ-MeasWithoutSSB-r16";
         case 2: return "csi-SINR-Meas-r16";
         case 3: return "ssb-AndCSI-RS-RLM-r16";
         case 4: return "csi-RS-CFRA-ForHO-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean csi_RSRP_AndRSRQ_MeasWithSSB_r16Present = buffer.decodeBit ("csi_RSRP_AndRSRQ_MeasWithSSB_r16Present");
      boolean csi_RSRP_AndRSRQ_MeasWithoutSSB_r16Present = buffer.decodeBit ("csi_RSRP_AndRSRQ_MeasWithoutSSB_r16Present");
      boolean csi_SINR_Meas_r16Present = buffer.decodeBit ("csi_SINR_Meas_r16Present");
      boolean ssb_AndCSI_RS_RLM_r16Present = buffer.decodeBit ("ssb_AndCSI_RS_RLM_r16Present");
      boolean csi_RS_CFRA_ForHO_r16Present = buffer.decodeBit ("csi_RS_CFRA_ForHO_r16Present");

      // decode csi_RSRP_AndRSRQ_MeasWithSSB_r16

      if (csi_RSRP_AndRSRQ_MeasWithSSB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("csi_RSRP_AndRSRQ_MeasWithSSB_r16", -1);

         int tval = SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithSSB_r16.decodeEnumValue (buffer);
         csi_RSRP_AndRSRQ_MeasWithSSB_r16 = SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithSSB_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csi_RSRP_AndRSRQ_MeasWithSSB_r16", -1);
      }
      else {
         csi_RSRP_AndRSRQ_MeasWithSSB_r16 = null;
      }

      // decode csi_RSRP_AndRSRQ_MeasWithoutSSB_r16

      if (csi_RSRP_AndRSRQ_MeasWithoutSSB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("csi_RSRP_AndRSRQ_MeasWithoutSSB_r16", -1);

         int tval = SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithoutSSB_r16.decodeEnumValue (buffer);
         csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 = SharedSpectrumChAccessParamsPerBand_v1640_csi_RSRP_AndRSRQ_MeasWithoutSSB_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csi_RSRP_AndRSRQ_MeasWithoutSSB_r16", -1);
      }
      else {
         csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 = null;
      }

      // decode csi_SINR_Meas_r16

      if (csi_SINR_Meas_r16Present) {
         buffer.getContext().eventDispatcher.startElement("csi_SINR_Meas_r16", -1);

         int tval = SharedSpectrumChAccessParamsPerBand_v1640_csi_SINR_Meas_r16.decodeEnumValue (buffer);
         csi_SINR_Meas_r16 = SharedSpectrumChAccessParamsPerBand_v1640_csi_SINR_Meas_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csi_SINR_Meas_r16", -1);
      }
      else {
         csi_SINR_Meas_r16 = null;
      }

      // decode ssb_AndCSI_RS_RLM_r16

      if (ssb_AndCSI_RS_RLM_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ssb_AndCSI_RS_RLM_r16", -1);

         int tval = SharedSpectrumChAccessParamsPerBand_v1640_ssb_AndCSI_RS_RLM_r16.decodeEnumValue (buffer);
         ssb_AndCSI_RS_RLM_r16 = SharedSpectrumChAccessParamsPerBand_v1640_ssb_AndCSI_RS_RLM_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ssb_AndCSI_RS_RLM_r16", -1);
      }
      else {
         ssb_AndCSI_RS_RLM_r16 = null;
      }

      // decode csi_RS_CFRA_ForHO_r16

      if (csi_RS_CFRA_ForHO_r16Present) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_CFRA_ForHO_r16", -1);

         int tval = SharedSpectrumChAccessParamsPerBand_v1640_csi_RS_CFRA_ForHO_r16.decodeEnumValue (buffer);
         csi_RS_CFRA_ForHO_r16 = SharedSpectrumChAccessParamsPerBand_v1640_csi_RS_CFRA_ForHO_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("csi_RS_CFRA_ForHO_r16", -1);
      }
      else {
         csi_RS_CFRA_ForHO_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((csi_RSRP_AndRSRQ_MeasWithSSB_r16 != null), null);
      buffer.encodeBit ((csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 != null), null);
      buffer.encodeBit ((csi_SINR_Meas_r16 != null), null);
      buffer.encodeBit ((ssb_AndCSI_RS_RLM_r16 != null), null);
      buffer.encodeBit ((csi_RS_CFRA_ForHO_r16 != null), null);

      // encode csi_RSRP_AndRSRQ_MeasWithSSB_r16

      if (csi_RSRP_AndRSRQ_MeasWithSSB_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RSRP_AndRSRQ_MeasWithSSB_r16", -1);

         csi_RSRP_AndRSRQ_MeasWithSSB_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RSRP_AndRSRQ_MeasWithSSB_r16", -1);
      }

      // encode csi_RSRP_AndRSRQ_MeasWithoutSSB_r16

      if (csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RSRP_AndRSRQ_MeasWithoutSSB_r16", -1);

         csi_RSRP_AndRSRQ_MeasWithoutSSB_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RSRP_AndRSRQ_MeasWithoutSSB_r16", -1);
      }

      // encode csi_SINR_Meas_r16

      if (csi_SINR_Meas_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("csi_SINR_Meas_r16", -1);

         csi_SINR_Meas_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_SINR_Meas_r16", -1);
      }

      // encode ssb_AndCSI_RS_RLM_r16

      if (ssb_AndCSI_RS_RLM_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ssb_AndCSI_RS_RLM_r16", -1);

         ssb_AndCSI_RS_RLM_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ssb_AndCSI_RS_RLM_r16", -1);
      }

      // encode csi_RS_CFRA_ForHO_r16

      if (csi_RS_CFRA_ForHO_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_CFRA_ForHO_r16", -1);

         csi_RS_CFRA_ForHO_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RS_CFRA_ForHO_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_RSRP_AndRSRQ_MeasWithSSB_r16 != null) csi_RSRP_AndRSRQ_MeasWithSSB_r16.print (_sb, "csi_RSRP_AndRSRQ_MeasWithSSB_r16", _level+1);
      if (csi_RSRP_AndRSRQ_MeasWithoutSSB_r16 != null) csi_RSRP_AndRSRQ_MeasWithoutSSB_r16.print (_sb, "csi_RSRP_AndRSRQ_MeasWithoutSSB_r16", _level+1);
      if (csi_SINR_Meas_r16 != null) csi_SINR_Meas_r16.print (_sb, "csi_SINR_Meas_r16", _level+1);
      if (ssb_AndCSI_RS_RLM_r16 != null) ssb_AndCSI_RS_RLM_r16.print (_sb, "ssb_AndCSI_RS_RLM_r16", _level+1);
      if (csi_RS_CFRA_ForHO_r16 != null) csi_RS_CFRA_ForHO_r16.print (_sb, "csi_RS_CFRA_ForHO_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
