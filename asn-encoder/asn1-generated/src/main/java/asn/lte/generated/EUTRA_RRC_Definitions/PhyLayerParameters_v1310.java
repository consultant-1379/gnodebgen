/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PhyLayerParameters_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PhyLayerParameters-v1310";
   }

   public Asn1BitString aperiodicCSI_Reporting_r13;  // optional
   public Asn1BitString codebook_HARQ_ACK_r13;  // optional
   public PhyLayerParameters_v1310_crossCarrierScheduling_B5C_r13 crossCarrierScheduling_B5C_r13 = null;  // optional
   public PhyLayerParameters_v1310_fdd_HARQ_TimingTDD_r13 fdd_HARQ_TimingTDD_r13 = null;  // optional
   public Asn1Integer maxNumberUpdatedCSI_Proc_r13;  // optional
   public PhyLayerParameters_v1310_pucch_Format4_r13 pucch_Format4_r13 = null;  // optional
   public PhyLayerParameters_v1310_pucch_Format5_r13 pucch_Format5_r13 = null;  // optional
   public PhyLayerParameters_v1310_pucch_SCell_r13 pucch_SCell_r13 = null;  // optional
   public PhyLayerParameters_v1310_spatialBundling_HARQ_ACK_r13 spatialBundling_HARQ_ACK_r13 = null;  // optional
   public PhyLayerParameters_v1310_supportedBlindDecoding_r13 supportedBlindDecoding_r13;  // optional
   public PhyLayerParameters_v1310_uci_PUSCH_Ext_r13 uci_PUSCH_Ext_r13 = null;  // optional
   public PhyLayerParameters_v1310_crs_InterfMitigationTM10_r13 crs_InterfMitigationTM10_r13 = null;  // optional
   public PhyLayerParameters_v1310_pdsch_CollisionHandling_r13 pdsch_CollisionHandling_r13 = null;  // optional

   public PhyLayerParameters_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PhyLayerParameters_v1310 (
      Asn1BitString aperiodicCSI_Reporting_r13_,
      Asn1BitString codebook_HARQ_ACK_r13_,
      PhyLayerParameters_v1310_crossCarrierScheduling_B5C_r13 crossCarrierScheduling_B5C_r13_,
      PhyLayerParameters_v1310_fdd_HARQ_TimingTDD_r13 fdd_HARQ_TimingTDD_r13_,
      Asn1Integer maxNumberUpdatedCSI_Proc_r13_,
      PhyLayerParameters_v1310_pucch_Format4_r13 pucch_Format4_r13_,
      PhyLayerParameters_v1310_pucch_Format5_r13 pucch_Format5_r13_,
      PhyLayerParameters_v1310_pucch_SCell_r13 pucch_SCell_r13_,
      PhyLayerParameters_v1310_spatialBundling_HARQ_ACK_r13 spatialBundling_HARQ_ACK_r13_,
      PhyLayerParameters_v1310_supportedBlindDecoding_r13 supportedBlindDecoding_r13_,
      PhyLayerParameters_v1310_uci_PUSCH_Ext_r13 uci_PUSCH_Ext_r13_,
      PhyLayerParameters_v1310_crs_InterfMitigationTM10_r13 crs_InterfMitigationTM10_r13_,
      PhyLayerParameters_v1310_pdsch_CollisionHandling_r13 pdsch_CollisionHandling_r13_
   ) {
      super();
      aperiodicCSI_Reporting_r13 = aperiodicCSI_Reporting_r13_;
      codebook_HARQ_ACK_r13 = codebook_HARQ_ACK_r13_;
      crossCarrierScheduling_B5C_r13 = crossCarrierScheduling_B5C_r13_;
      fdd_HARQ_TimingTDD_r13 = fdd_HARQ_TimingTDD_r13_;
      maxNumberUpdatedCSI_Proc_r13 = maxNumberUpdatedCSI_Proc_r13_;
      pucch_Format4_r13 = pucch_Format4_r13_;
      pucch_Format5_r13 = pucch_Format5_r13_;
      pucch_SCell_r13 = pucch_SCell_r13_;
      spatialBundling_HARQ_ACK_r13 = spatialBundling_HARQ_ACK_r13_;
      supportedBlindDecoding_r13 = supportedBlindDecoding_r13_;
      uci_PUSCH_Ext_r13 = uci_PUSCH_Ext_r13_;
      crs_InterfMitigationTM10_r13 = crs_InterfMitigationTM10_r13_;
      pdsch_CollisionHandling_r13 = pdsch_CollisionHandling_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PhyLayerParameters_v1310 (Asn1BitString aperiodicCSI_Reporting_r13_,
      Asn1BitString codebook_HARQ_ACK_r13_,
      PhyLayerParameters_v1310_crossCarrierScheduling_B5C_r13 crossCarrierScheduling_B5C_r13_,
      PhyLayerParameters_v1310_fdd_HARQ_TimingTDD_r13 fdd_HARQ_TimingTDD_r13_,
      long maxNumberUpdatedCSI_Proc_r13_,
      PhyLayerParameters_v1310_pucch_Format4_r13 pucch_Format4_r13_,
      PhyLayerParameters_v1310_pucch_Format5_r13 pucch_Format5_r13_,
      PhyLayerParameters_v1310_pucch_SCell_r13 pucch_SCell_r13_,
      PhyLayerParameters_v1310_spatialBundling_HARQ_ACK_r13 spatialBundling_HARQ_ACK_r13_,
      PhyLayerParameters_v1310_supportedBlindDecoding_r13 supportedBlindDecoding_r13_,
      PhyLayerParameters_v1310_uci_PUSCH_Ext_r13 uci_PUSCH_Ext_r13_,
      PhyLayerParameters_v1310_crs_InterfMitigationTM10_r13 crs_InterfMitigationTM10_r13_,
      PhyLayerParameters_v1310_pdsch_CollisionHandling_r13 pdsch_CollisionHandling_r13_
   ) {
      super();
      aperiodicCSI_Reporting_r13 = aperiodicCSI_Reporting_r13_;
      codebook_HARQ_ACK_r13 = codebook_HARQ_ACK_r13_;
      crossCarrierScheduling_B5C_r13 = crossCarrierScheduling_B5C_r13_;
      fdd_HARQ_TimingTDD_r13 = fdd_HARQ_TimingTDD_r13_;
      maxNumberUpdatedCSI_Proc_r13 = new Asn1Integer (maxNumberUpdatedCSI_Proc_r13_);
      pucch_Format4_r13 = pucch_Format4_r13_;
      pucch_Format5_r13 = pucch_Format5_r13_;
      pucch_SCell_r13 = pucch_SCell_r13_;
      spatialBundling_HARQ_ACK_r13 = spatialBundling_HARQ_ACK_r13_;
      supportedBlindDecoding_r13 = supportedBlindDecoding_r13_;
      uci_PUSCH_Ext_r13 = uci_PUSCH_Ext_r13_;
      crs_InterfMitigationTM10_r13 = crs_InterfMitigationTM10_r13_;
      pdsch_CollisionHandling_r13 = pdsch_CollisionHandling_r13_;
   }

   public void init () {
      aperiodicCSI_Reporting_r13 = null;
      codebook_HARQ_ACK_r13 = null;
      crossCarrierScheduling_B5C_r13 = null;
      fdd_HARQ_TimingTDD_r13 = null;
      maxNumberUpdatedCSI_Proc_r13 = null;
      pucch_Format4_r13 = null;
      pucch_Format5_r13 = null;
      pucch_SCell_r13 = null;
      spatialBundling_HARQ_ACK_r13 = null;
      supportedBlindDecoding_r13 = null;
      uci_PUSCH_Ext_r13 = null;
      crs_InterfMitigationTM10_r13 = null;
      pdsch_CollisionHandling_r13 = null;
   }

   public int getElementCount() { return 13; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return aperiodicCSI_Reporting_r13;
         case 1: return codebook_HARQ_ACK_r13;
         case 2: return crossCarrierScheduling_B5C_r13;
         case 3: return fdd_HARQ_TimingTDD_r13;
         case 4: return maxNumberUpdatedCSI_Proc_r13;
         case 5: return pucch_Format4_r13;
         case 6: return pucch_Format5_r13;
         case 7: return pucch_SCell_r13;
         case 8: return spatialBundling_HARQ_ACK_r13;
         case 9: return supportedBlindDecoding_r13;
         case 10: return uci_PUSCH_Ext_r13;
         case 11: return crs_InterfMitigationTM10_r13;
         case 12: return pdsch_CollisionHandling_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "aperiodicCSI-Reporting-r13";
         case 1: return "codebook-HARQ-ACK-r13";
         case 2: return "crossCarrierScheduling-B5C-r13";
         case 3: return "fdd-HARQ-TimingTDD-r13";
         case 4: return "maxNumberUpdatedCSI-Proc-r13";
         case 5: return "pucch-Format4-r13";
         case 6: return "pucch-Format5-r13";
         case 7: return "pucch-SCell-r13";
         case 8: return "spatialBundling-HARQ-ACK-r13";
         case 9: return "supportedBlindDecoding-r13";
         case 10: return "uci-PUSCH-Ext-r13";
         case 11: return "crs-InterfMitigationTM10-r13";
         case 12: return "pdsch-CollisionHandling-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean aperiodicCSI_Reporting_r13Present = buffer.decodeBit ("aperiodicCSI_Reporting_r13Present");
      boolean codebook_HARQ_ACK_r13Present = buffer.decodeBit ("codebook_HARQ_ACK_r13Present");
      boolean crossCarrierScheduling_B5C_r13Present = buffer.decodeBit ("crossCarrierScheduling_B5C_r13Present");
      boolean fdd_HARQ_TimingTDD_r13Present = buffer.decodeBit ("fdd_HARQ_TimingTDD_r13Present");
      boolean maxNumberUpdatedCSI_Proc_r13Present = buffer.decodeBit ("maxNumberUpdatedCSI_Proc_r13Present");
      boolean pucch_Format4_r13Present = buffer.decodeBit ("pucch_Format4_r13Present");
      boolean pucch_Format5_r13Present = buffer.decodeBit ("pucch_Format5_r13Present");
      boolean pucch_SCell_r13Present = buffer.decodeBit ("pucch_SCell_r13Present");
      boolean spatialBundling_HARQ_ACK_r13Present = buffer.decodeBit ("spatialBundling_HARQ_ACK_r13Present");
      boolean supportedBlindDecoding_r13Present = buffer.decodeBit ("supportedBlindDecoding_r13Present");
      boolean uci_PUSCH_Ext_r13Present = buffer.decodeBit ("uci_PUSCH_Ext_r13Present");
      boolean crs_InterfMitigationTM10_r13Present = buffer.decodeBit ("crs_InterfMitigationTM10_r13Present");
      boolean pdsch_CollisionHandling_r13Present = buffer.decodeBit ("pdsch_CollisionHandling_r13Present");

      // decode aperiodicCSI_Reporting_r13

      if (aperiodicCSI_Reporting_r13Present) {
         buffer.getContext().eventDispatcher.startElement("aperiodicCSI_Reporting_r13", -1);

         aperiodicCSI_Reporting_r13 = new Asn1BitString();
         aperiodicCSI_Reporting_r13.decode (buffer, 2, 2);

         buffer.invokeCharacters(aperiodicCSI_Reporting_r13.toString());
         buffer.getContext().eventDispatcher.endElement("aperiodicCSI_Reporting_r13", -1);
      }
      else {
         aperiodicCSI_Reporting_r13 = null;
      }

      // decode codebook_HARQ_ACK_r13

      if (codebook_HARQ_ACK_r13Present) {
         buffer.getContext().eventDispatcher.startElement("codebook_HARQ_ACK_r13", -1);

         codebook_HARQ_ACK_r13 = new Asn1BitString();
         codebook_HARQ_ACK_r13.decode (buffer, 2, 2);

         buffer.invokeCharacters(codebook_HARQ_ACK_r13.toString());
         buffer.getContext().eventDispatcher.endElement("codebook_HARQ_ACK_r13", -1);
      }
      else {
         codebook_HARQ_ACK_r13 = null;
      }

      // decode crossCarrierScheduling_B5C_r13

      if (crossCarrierScheduling_B5C_r13Present) {
         buffer.getContext().eventDispatcher.startElement("crossCarrierScheduling_B5C_r13", -1);

         int tval = PhyLayerParameters_v1310_crossCarrierScheduling_B5C_r13.decodeEnumValue (buffer);
         crossCarrierScheduling_B5C_r13 = PhyLayerParameters_v1310_crossCarrierScheduling_B5C_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crossCarrierScheduling_B5C_r13", -1);
      }
      else {
         crossCarrierScheduling_B5C_r13 = null;
      }

      // decode fdd_HARQ_TimingTDD_r13

      if (fdd_HARQ_TimingTDD_r13Present) {
         buffer.getContext().eventDispatcher.startElement("fdd_HARQ_TimingTDD_r13", -1);

         int tval = PhyLayerParameters_v1310_fdd_HARQ_TimingTDD_r13.decodeEnumValue (buffer);
         fdd_HARQ_TimingTDD_r13 = PhyLayerParameters_v1310_fdd_HARQ_TimingTDD_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("fdd_HARQ_TimingTDD_r13", -1);
      }
      else {
         fdd_HARQ_TimingTDD_r13 = null;
      }

      // decode maxNumberUpdatedCSI_Proc_r13

      if (maxNumberUpdatedCSI_Proc_r13Present) {
         buffer.getContext().eventDispatcher.startElement("maxNumberUpdatedCSI_Proc_r13", -1);

         maxNumberUpdatedCSI_Proc_r13 = new Asn1Integer();
         maxNumberUpdatedCSI_Proc_r13.decode (buffer, 5, 32);

         buffer.invokeCharacters(maxNumberUpdatedCSI_Proc_r13.toString());
         buffer.getContext().eventDispatcher.endElement("maxNumberUpdatedCSI_Proc_r13", -1);
      }
      else {
         maxNumberUpdatedCSI_Proc_r13 = null;
      }

      // decode pucch_Format4_r13

      if (pucch_Format4_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pucch_Format4_r13", -1);

         int tval = PhyLayerParameters_v1310_pucch_Format4_r13.decodeEnumValue (buffer);
         pucch_Format4_r13 = PhyLayerParameters_v1310_pucch_Format4_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pucch_Format4_r13", -1);
      }
      else {
         pucch_Format4_r13 = null;
      }

      // decode pucch_Format5_r13

      if (pucch_Format5_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pucch_Format5_r13", -1);

         int tval = PhyLayerParameters_v1310_pucch_Format5_r13.decodeEnumValue (buffer);
         pucch_Format5_r13 = PhyLayerParameters_v1310_pucch_Format5_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pucch_Format5_r13", -1);
      }
      else {
         pucch_Format5_r13 = null;
      }

      // decode pucch_SCell_r13

      if (pucch_SCell_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pucch_SCell_r13", -1);

         int tval = PhyLayerParameters_v1310_pucch_SCell_r13.decodeEnumValue (buffer);
         pucch_SCell_r13 = PhyLayerParameters_v1310_pucch_SCell_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pucch_SCell_r13", -1);
      }
      else {
         pucch_SCell_r13 = null;
      }

      // decode spatialBundling_HARQ_ACK_r13

      if (spatialBundling_HARQ_ACK_r13Present) {
         buffer.getContext().eventDispatcher.startElement("spatialBundling_HARQ_ACK_r13", -1);

         int tval = PhyLayerParameters_v1310_spatialBundling_HARQ_ACK_r13.decodeEnumValue (buffer);
         spatialBundling_HARQ_ACK_r13 = PhyLayerParameters_v1310_spatialBundling_HARQ_ACK_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("spatialBundling_HARQ_ACK_r13", -1);
      }
      else {
         spatialBundling_HARQ_ACK_r13 = null;
      }

      // decode supportedBlindDecoding_r13

      if (supportedBlindDecoding_r13Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBlindDecoding_r13", -1);

         supportedBlindDecoding_r13 = new PhyLayerParameters_v1310_supportedBlindDecoding_r13();
         supportedBlindDecoding_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBlindDecoding_r13", -1);
      }
      else {
         supportedBlindDecoding_r13 = null;
      }

      // decode uci_PUSCH_Ext_r13

      if (uci_PUSCH_Ext_r13Present) {
         buffer.getContext().eventDispatcher.startElement("uci_PUSCH_Ext_r13", -1);

         int tval = PhyLayerParameters_v1310_uci_PUSCH_Ext_r13.decodeEnumValue (buffer);
         uci_PUSCH_Ext_r13 = PhyLayerParameters_v1310_uci_PUSCH_Ext_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("uci_PUSCH_Ext_r13", -1);
      }
      else {
         uci_PUSCH_Ext_r13 = null;
      }

      // decode crs_InterfMitigationTM10_r13

      if (crs_InterfMitigationTM10_r13Present) {
         buffer.getContext().eventDispatcher.startElement("crs_InterfMitigationTM10_r13", -1);

         int tval = PhyLayerParameters_v1310_crs_InterfMitigationTM10_r13.decodeEnumValue (buffer);
         crs_InterfMitigationTM10_r13 = PhyLayerParameters_v1310_crs_InterfMitigationTM10_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("crs_InterfMitigationTM10_r13", -1);
      }
      else {
         crs_InterfMitigationTM10_r13 = null;
      }

      // decode pdsch_CollisionHandling_r13

      if (pdsch_CollisionHandling_r13Present) {
         buffer.getContext().eventDispatcher.startElement("pdsch_CollisionHandling_r13", -1);

         int tval = PhyLayerParameters_v1310_pdsch_CollisionHandling_r13.decodeEnumValue (buffer);
         pdsch_CollisionHandling_r13 = PhyLayerParameters_v1310_pdsch_CollisionHandling_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_CollisionHandling_r13", -1);
      }
      else {
         pdsch_CollisionHandling_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (aperiodicCSI_Reporting_r13 != null) aperiodicCSI_Reporting_r13.print (_sb, "aperiodicCSI_Reporting_r13", _level+1);
      if (codebook_HARQ_ACK_r13 != null) codebook_HARQ_ACK_r13.print (_sb, "codebook_HARQ_ACK_r13", _level+1);
      if (crossCarrierScheduling_B5C_r13 != null) crossCarrierScheduling_B5C_r13.print (_sb, "crossCarrierScheduling_B5C_r13", _level+1);
      if (fdd_HARQ_TimingTDD_r13 != null) fdd_HARQ_TimingTDD_r13.print (_sb, "fdd_HARQ_TimingTDD_r13", _level+1);
      if (maxNumberUpdatedCSI_Proc_r13 != null) maxNumberUpdatedCSI_Proc_r13.print (_sb, "maxNumberUpdatedCSI_Proc_r13", _level+1);
      if (pucch_Format4_r13 != null) pucch_Format4_r13.print (_sb, "pucch_Format4_r13", _level+1);
      if (pucch_Format5_r13 != null) pucch_Format5_r13.print (_sb, "pucch_Format5_r13", _level+1);
      if (pucch_SCell_r13 != null) pucch_SCell_r13.print (_sb, "pucch_SCell_r13", _level+1);
      if (spatialBundling_HARQ_ACK_r13 != null) spatialBundling_HARQ_ACK_r13.print (_sb, "spatialBundling_HARQ_ACK_r13", _level+1);
      if (supportedBlindDecoding_r13 != null) supportedBlindDecoding_r13.print (_sb, "supportedBlindDecoding_r13", _level+1);
      if (uci_PUSCH_Ext_r13 != null) uci_PUSCH_Ext_r13.print (_sb, "uci_PUSCH_Ext_r13", _level+1);
      if (crs_InterfMitigationTM10_r13 != null) crs_InterfMitigationTM10_r13.print (_sb, "crs_InterfMitigationTM10_r13", _level+1);
      if (pdsch_CollisionHandling_r13 != null) pdsch_CollisionHandling_r13.print (_sb, "pdsch_CollisionHandling_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
