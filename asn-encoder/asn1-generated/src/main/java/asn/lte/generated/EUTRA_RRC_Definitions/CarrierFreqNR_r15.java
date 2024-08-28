/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqNR_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierFreqNR-r15";
   }

   public ARFCN_ValueNR_r15 carrierFreq_r15;
   public MultiFrequencyBandListNR_r15 multiBandInfoList_r15;  // optional
   public MultiFrequencyBandListNR_r15 multiBandInfoListSUL_r15;  // optional
   public MTC_SSB_NR_r15 measTimingConfig_r15;  // optional
   public CarrierFreqNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15 = null;
   public SS_RSSI_Measurement_r15 ss_RSSI_Measurement_r15;  // optional
   public CellReselectionPriority cellReselectionPriority_r15;  // optional
   public CellReselectionSubPriority_r13 cellReselectionSubPriority_r15 = null;  // optional
   public ReselectionThreshold threshX_High_r15;
   public ReselectionThreshold threshX_Low_r15;
   public CarrierFreqNR_r15_threshX_Q_r15 threshX_Q_r15;  // optional
   public Asn1Integer q_RxLevMin_r15;
   public Asn1Integer q_RxLevMinSUL_r15;  // optional
   public P_MaxNR_r15 p_MaxNR_r15;
   public NS_PmaxListNR_r15 ns_PmaxListNR_r15;  // optional
   public Q_QualMin_r9 q_QualMin_r15;  // optional
   public Asn1Boolean deriveSSB_IndexFromCell_r15;
   public MaxRS_IndexCellQualNR_r15 maxRS_IndexCellQual_r15;  // optional
   public ThresholdListNR_r15 threshRS_Index_r15;  // optional
   public Asn1OpenExt extElem1;

   public CarrierFreqNR_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_,
      MultiFrequencyBandListNR_r15 multiBandInfoList_r15_,
      MultiFrequencyBandListNR_r15 multiBandInfoListSUL_r15_,
      MTC_SSB_NR_r15 measTimingConfig_r15_,
      CarrierFreqNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      SS_RSSI_Measurement_r15 ss_RSSI_Measurement_r15_,
      CellReselectionPriority cellReselectionPriority_r15_,
      CellReselectionSubPriority_r13 cellReselectionSubPriority_r15_,
      ReselectionThreshold threshX_High_r15_,
      ReselectionThreshold threshX_Low_r15_,
      CarrierFreqNR_r15_threshX_Q_r15 threshX_Q_r15_,
      Asn1Integer q_RxLevMin_r15_,
      Asn1Integer q_RxLevMinSUL_r15_,
      P_MaxNR_r15 p_MaxNR_r15_,
      NS_PmaxListNR_r15 ns_PmaxListNR_r15_,
      Q_QualMin_r9 q_QualMin_r15_,
      Asn1Boolean deriveSSB_IndexFromCell_r15_,
      MaxRS_IndexCellQualNR_r15 maxRS_IndexCellQual_r15_,
      ThresholdListNR_r15 threshRS_Index_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
      multiBandInfoList_r15 = multiBandInfoList_r15_;
      multiBandInfoListSUL_r15 = multiBandInfoListSUL_r15_;
      measTimingConfig_r15 = measTimingConfig_r15_;
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      ss_RSSI_Measurement_r15 = ss_RSSI_Measurement_r15_;
      cellReselectionPriority_r15 = cellReselectionPriority_r15_;
      cellReselectionSubPriority_r15 = cellReselectionSubPriority_r15_;
      threshX_High_r15 = threshX_High_r15_;
      threshX_Low_r15 = threshX_Low_r15_;
      threshX_Q_r15 = threshX_Q_r15_;
      q_RxLevMin_r15 = q_RxLevMin_r15_;
      q_RxLevMinSUL_r15 = q_RxLevMinSUL_r15_;
      p_MaxNR_r15 = p_MaxNR_r15_;
      ns_PmaxListNR_r15 = ns_PmaxListNR_r15_;
      q_QualMin_r15 = q_QualMin_r15_;
      deriveSSB_IndexFromCell_r15 = deriveSSB_IndexFromCell_r15_;
      maxRS_IndexCellQual_r15 = maxRS_IndexCellQual_r15_;
      threshRS_Index_r15 = threshRS_Index_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CarrierFreqNR_r15 (
      ARFCN_ValueNR_r15 carrierFreq_r15_,
      CarrierFreqNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      ReselectionThreshold threshX_High_r15_,
      ReselectionThreshold threshX_Low_r15_,
      Asn1Integer q_RxLevMin_r15_,
      P_MaxNR_r15 p_MaxNR_r15_,
      Asn1Boolean deriveSSB_IndexFromCell_r15_
   ) {
      super();
      carrierFreq_r15 = carrierFreq_r15_;
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      threshX_High_r15 = threshX_High_r15_;
      threshX_Low_r15 = threshX_Low_r15_;
      q_RxLevMin_r15 = q_RxLevMin_r15_;
      p_MaxNR_r15 = p_MaxNR_r15_;
      deriveSSB_IndexFromCell_r15 = deriveSSB_IndexFromCell_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CarrierFreqNR_r15 (long carrierFreq_r15_,
      MultiFrequencyBandListNR_r15 multiBandInfoList_r15_,
      MultiFrequencyBandListNR_r15 multiBandInfoListSUL_r15_,
      MTC_SSB_NR_r15 measTimingConfig_r15_,
      CarrierFreqNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      SS_RSSI_Measurement_r15 ss_RSSI_Measurement_r15_,
      long cellReselectionPriority_r15_,
      CellReselectionSubPriority_r13 cellReselectionSubPriority_r15_,
      long threshX_High_r15_,
      long threshX_Low_r15_,
      CarrierFreqNR_r15_threshX_Q_r15 threshX_Q_r15_,
      long q_RxLevMin_r15_,
      long q_RxLevMinSUL_r15_,
      long p_MaxNR_r15_,
      NS_PmaxListNR_r15 ns_PmaxListNR_r15_,
      long q_QualMin_r15_,
      boolean deriveSSB_IndexFromCell_r15_,
      long maxRS_IndexCellQual_r15_,
      ThresholdListNR_r15 threshRS_Index_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
      multiBandInfoList_r15 = multiBandInfoList_r15_;
      multiBandInfoListSUL_r15 = multiBandInfoListSUL_r15_;
      measTimingConfig_r15 = measTimingConfig_r15_;
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      ss_RSSI_Measurement_r15 = ss_RSSI_Measurement_r15_;
      cellReselectionPriority_r15 = new CellReselectionPriority (cellReselectionPriority_r15_);
      cellReselectionSubPriority_r15 = cellReselectionSubPriority_r15_;
      threshX_High_r15 = new ReselectionThreshold (threshX_High_r15_);
      threshX_Low_r15 = new ReselectionThreshold (threshX_Low_r15_);
      threshX_Q_r15 = threshX_Q_r15_;
      q_RxLevMin_r15 = new Asn1Integer (q_RxLevMin_r15_);
      q_RxLevMinSUL_r15 = new Asn1Integer (q_RxLevMinSUL_r15_);
      p_MaxNR_r15 = new P_MaxNR_r15 (p_MaxNR_r15_);
      ns_PmaxListNR_r15 = ns_PmaxListNR_r15_;
      q_QualMin_r15 = new Q_QualMin_r9 (q_QualMin_r15_);
      deriveSSB_IndexFromCell_r15 = new Asn1Boolean (deriveSSB_IndexFromCell_r15_);
      maxRS_IndexCellQual_r15 = new MaxRS_IndexCellQualNR_r15 (maxRS_IndexCellQual_r15_);
      threshRS_Index_r15 = threshRS_Index_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CarrierFreqNR_r15 (
      long carrierFreq_r15_,
      CarrierFreqNR_r15_subcarrierSpacingSSB_r15 subcarrierSpacingSSB_r15_,
      long threshX_High_r15_,
      long threshX_Low_r15_,
      long q_RxLevMin_r15_,
      long p_MaxNR_r15_,
      boolean deriveSSB_IndexFromCell_r15_
   ) {
      super();
      carrierFreq_r15 = new ARFCN_ValueNR_r15 (carrierFreq_r15_);
      subcarrierSpacingSSB_r15 = subcarrierSpacingSSB_r15_;
      threshX_High_r15 = new ReselectionThreshold (threshX_High_r15_);
      threshX_Low_r15 = new ReselectionThreshold (threshX_Low_r15_);
      q_RxLevMin_r15 = new Asn1Integer (q_RxLevMin_r15_);
      p_MaxNR_r15 = new P_MaxNR_r15 (p_MaxNR_r15_);
      deriveSSB_IndexFromCell_r15 = new Asn1Boolean (deriveSSB_IndexFromCell_r15_);
   }

   public void init () {
      carrierFreq_r15 = null;
      multiBandInfoList_r15 = null;
      multiBandInfoListSUL_r15 = null;
      measTimingConfig_r15 = null;
      subcarrierSpacingSSB_r15 = null;
      ss_RSSI_Measurement_r15 = null;
      cellReselectionPriority_r15 = null;
      cellReselectionSubPriority_r15 = null;
      threshX_High_r15 = null;
      threshX_Low_r15 = null;
      threshX_Q_r15 = null;
      q_RxLevMin_r15 = null;
      q_RxLevMinSUL_r15 = null;
      p_MaxNR_r15 = null;
      ns_PmaxListNR_r15 = null;
      q_QualMin_r15 = null;
      deriveSSB_IndexFromCell_r15 = null;
      maxRS_IndexCellQual_r15 = null;
      threshRS_Index_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 20; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq_r15;
         case 1: return multiBandInfoList_r15;
         case 2: return multiBandInfoListSUL_r15;
         case 3: return measTimingConfig_r15;
         case 4: return subcarrierSpacingSSB_r15;
         case 5: return ss_RSSI_Measurement_r15;
         case 6: return cellReselectionPriority_r15;
         case 7: return cellReselectionSubPriority_r15;
         case 8: return threshX_High_r15;
         case 9: return threshX_Low_r15;
         case 10: return threshX_Q_r15;
         case 11: return q_RxLevMin_r15;
         case 12: return q_RxLevMinSUL_r15;
         case 13: return p_MaxNR_r15;
         case 14: return ns_PmaxListNR_r15;
         case 15: return q_QualMin_r15;
         case 16: return deriveSSB_IndexFromCell_r15;
         case 17: return maxRS_IndexCellQual_r15;
         case 18: return threshRS_Index_r15;
         case 19: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq-r15";
         case 1: return "multiBandInfoList-r15";
         case 2: return "multiBandInfoListSUL-r15";
         case 3: return "measTimingConfig-r15";
         case 4: return "subcarrierSpacingSSB-r15";
         case 5: return "ss-RSSI-Measurement-r15";
         case 6: return "cellReselectionPriority-r15";
         case 7: return "cellReselectionSubPriority-r15";
         case 8: return "threshX-High-r15";
         case 9: return "threshX-Low-r15";
         case 10: return "threshX-Q-r15";
         case 11: return "q-RxLevMin-r15";
         case 12: return "q-RxLevMinSUL-r15";
         case 13: return "p-MaxNR-r15";
         case 14: return "ns-PmaxListNR-r15";
         case 15: return "q-QualMin-r15";
         case 16: return "deriveSSB-IndexFromCell-r15";
         case 17: return "maxRS-IndexCellQual-r15";
         case 18: return "threshRS-Index-r15";
         case 19: return null;
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

      boolean multiBandInfoList_r15Present = buffer.decodeBit ("multiBandInfoList_r15Present");
      boolean multiBandInfoListSUL_r15Present = buffer.decodeBit ("multiBandInfoListSUL_r15Present");
      boolean measTimingConfig_r15Present = buffer.decodeBit ("measTimingConfig_r15Present");
      boolean ss_RSSI_Measurement_r15Present = buffer.decodeBit ("ss_RSSI_Measurement_r15Present");
      boolean cellReselectionPriority_r15Present = buffer.decodeBit ("cellReselectionPriority_r15Present");
      boolean cellReselectionSubPriority_r15Present = buffer.decodeBit ("cellReselectionSubPriority_r15Present");
      boolean threshX_Q_r15Present = buffer.decodeBit ("threshX_Q_r15Present");
      boolean q_RxLevMinSUL_r15Present = buffer.decodeBit ("q_RxLevMinSUL_r15Present");
      boolean ns_PmaxListNR_r15Present = buffer.decodeBit ("ns_PmaxListNR_r15Present");
      boolean q_QualMin_r15Present = buffer.decodeBit ("q_QualMin_r15Present");
      boolean maxRS_IndexCellQual_r15Present = buffer.decodeBit ("maxRS_IndexCellQual_r15Present");
      boolean threshRS_Index_r15Present = buffer.decodeBit ("threshRS_Index_r15Present");

      // decode carrierFreq_r15

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r15", -1);

      carrierFreq_r15 = new ARFCN_ValueNR_r15();
      carrierFreq_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r15", -1);

      // decode multiBandInfoList_r15

      if (multiBandInfoList_r15Present) {
         buffer.getContext().eventDispatcher.startElement("multiBandInfoList_r15", -1);

         multiBandInfoList_r15 = new MultiFrequencyBandListNR_r15();
         multiBandInfoList_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("multiBandInfoList_r15", -1);
      }
      else {
         multiBandInfoList_r15 = null;
      }

      // decode multiBandInfoListSUL_r15

      if (multiBandInfoListSUL_r15Present) {
         buffer.getContext().eventDispatcher.startElement("multiBandInfoListSUL_r15", -1);

         multiBandInfoListSUL_r15 = new MultiFrequencyBandListNR_r15();
         multiBandInfoListSUL_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("multiBandInfoListSUL_r15", -1);
      }
      else {
         multiBandInfoListSUL_r15 = null;
      }

      // decode measTimingConfig_r15

      if (measTimingConfig_r15Present) {
         buffer.getContext().eventDispatcher.startElement("measTimingConfig_r15", -1);

         measTimingConfig_r15 = new MTC_SSB_NR_r15();
         measTimingConfig_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measTimingConfig_r15", -1);
      }
      else {
         measTimingConfig_r15 = null;
      }

      // decode subcarrierSpacingSSB_r15

      buffer.getContext().eventDispatcher.startElement("subcarrierSpacingSSB_r15", -1);

      {
         int tval = CarrierFreqNR_r15_subcarrierSpacingSSB_r15.decodeEnumValue (buffer);
         subcarrierSpacingSSB_r15 = CarrierFreqNR_r15_subcarrierSpacingSSB_r15.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("subcarrierSpacingSSB_r15", -1);

      // decode ss_RSSI_Measurement_r15

      if (ss_RSSI_Measurement_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ss_RSSI_Measurement_r15", -1);

         ss_RSSI_Measurement_r15 = new SS_RSSI_Measurement_r15();
         ss_RSSI_Measurement_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ss_RSSI_Measurement_r15", -1);
      }
      else {
         ss_RSSI_Measurement_r15 = null;
      }

      // decode cellReselectionPriority_r15

      if (cellReselectionPriority_r15Present) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionPriority_r15", -1);

         cellReselectionPriority_r15 = new CellReselectionPriority();
         cellReselectionPriority_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellReselectionPriority_r15", -1);
      }
      else {
         cellReselectionPriority_r15 = null;
      }

      // decode cellReselectionSubPriority_r15

      if (cellReselectionSubPriority_r15Present) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionSubPriority_r15", -1);

         int tval = CellReselectionSubPriority_r13.decodeEnumValue (buffer);
         cellReselectionSubPriority_r15 = CellReselectionSubPriority_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("cellReselectionSubPriority_r15", -1);
      }
      else {
         cellReselectionSubPriority_r15 = null;
      }

      // decode threshX_High_r15

      buffer.getContext().eventDispatcher.startElement("threshX_High_r15", -1);

      threshX_High_r15 = new ReselectionThreshold();
      threshX_High_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_High_r15", -1);

      // decode threshX_Low_r15

      buffer.getContext().eventDispatcher.startElement("threshX_Low_r15", -1);

      threshX_Low_r15 = new ReselectionThreshold();
      threshX_Low_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_Low_r15", -1);

      // decode threshX_Q_r15

      if (threshX_Q_r15Present) {
         buffer.getContext().eventDispatcher.startElement("threshX_Q_r15", -1);

         threshX_Q_r15 = new CarrierFreqNR_r15_threshX_Q_r15();
         threshX_Q_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("threshX_Q_r15", -1);
      }
      else {
         threshX_Q_r15 = null;
      }

      // decode q_RxLevMin_r15

      buffer.getContext().eventDispatcher.startElement("q_RxLevMin_r15", -1);

      q_RxLevMin_r15 = new Asn1Integer();
      q_RxLevMin_r15.decode (buffer, -70, -22);

      buffer.invokeCharacters(q_RxLevMin_r15.toString());
      buffer.getContext().eventDispatcher.endElement("q_RxLevMin_r15", -1);

      // decode q_RxLevMinSUL_r15

      if (q_RxLevMinSUL_r15Present) {
         buffer.getContext().eventDispatcher.startElement("q_RxLevMinSUL_r15", -1);

         q_RxLevMinSUL_r15 = new Asn1Integer();
         q_RxLevMinSUL_r15.decode (buffer, -70, -22);

         buffer.invokeCharacters(q_RxLevMinSUL_r15.toString());
         buffer.getContext().eventDispatcher.endElement("q_RxLevMinSUL_r15", -1);
      }
      else {
         q_RxLevMinSUL_r15 = null;
      }

      // decode p_MaxNR_r15

      buffer.getContext().eventDispatcher.startElement("p_MaxNR_r15", -1);

      p_MaxNR_r15 = new P_MaxNR_r15();
      p_MaxNR_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("p_MaxNR_r15", -1);

      // decode ns_PmaxListNR_r15

      if (ns_PmaxListNR_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ns_PmaxListNR_r15", -1);

         ns_PmaxListNR_r15 = new NS_PmaxListNR_r15();
         ns_PmaxListNR_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ns_PmaxListNR_r15", -1);
      }
      else {
         ns_PmaxListNR_r15 = null;
      }

      // decode q_QualMin_r15

      if (q_QualMin_r15Present) {
         buffer.getContext().eventDispatcher.startElement("q_QualMin_r15", -1);

         q_QualMin_r15 = new Q_QualMin_r9();
         q_QualMin_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("q_QualMin_r15", -1);
      }
      else {
         q_QualMin_r15 = null;
      }

      // decode deriveSSB_IndexFromCell_r15

      buffer.getContext().eventDispatcher.startElement("deriveSSB_IndexFromCell_r15", -1);

      deriveSSB_IndexFromCell_r15 = new Asn1Boolean();
      deriveSSB_IndexFromCell_r15.decode (buffer);

      buffer.invokeCharacters(deriveSSB_IndexFromCell_r15.toString());
      buffer.getContext().eventDispatcher.endElement("deriveSSB_IndexFromCell_r15", -1);

      // decode maxRS_IndexCellQual_r15

      if (maxRS_IndexCellQual_r15Present) {
         buffer.getContext().eventDispatcher.startElement("maxRS_IndexCellQual_r15", -1);

         maxRS_IndexCellQual_r15 = new MaxRS_IndexCellQualNR_r15();
         maxRS_IndexCellQual_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("maxRS_IndexCellQual_r15", -1);
      }
      else {
         maxRS_IndexCellQual_r15 = null;
      }

      // decode threshRS_Index_r15

      if (threshRS_Index_r15Present) {
         buffer.getContext().eventDispatcher.startElement("threshRS_Index_r15", -1);

         threshRS_Index_r15 = new ThresholdListNR_r15();
         threshRS_Index_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("threshRS_Index_r15", -1);
      }
      else {
         threshRS_Index_r15 = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

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
      if (carrierFreq_r15 != null) carrierFreq_r15.print (_sb, "carrierFreq_r15", _level+1);
      if (multiBandInfoList_r15 != null) multiBandInfoList_r15.print (_sb, "multiBandInfoList_r15", _level+1);
      if (multiBandInfoListSUL_r15 != null) multiBandInfoListSUL_r15.print (_sb, "multiBandInfoListSUL_r15", _level+1);
      if (measTimingConfig_r15 != null) measTimingConfig_r15.print (_sb, "measTimingConfig_r15", _level+1);
      if (subcarrierSpacingSSB_r15 != null) subcarrierSpacingSSB_r15.print (_sb, "subcarrierSpacingSSB_r15", _level+1);
      if (ss_RSSI_Measurement_r15 != null) ss_RSSI_Measurement_r15.print (_sb, "ss_RSSI_Measurement_r15", _level+1);
      if (cellReselectionPriority_r15 != null) cellReselectionPriority_r15.print (_sb, "cellReselectionPriority_r15", _level+1);
      if (cellReselectionSubPriority_r15 != null) cellReselectionSubPriority_r15.print (_sb, "cellReselectionSubPriority_r15", _level+1);
      if (threshX_High_r15 != null) threshX_High_r15.print (_sb, "threshX_High_r15", _level+1);
      if (threshX_Low_r15 != null) threshX_Low_r15.print (_sb, "threshX_Low_r15", _level+1);
      if (threshX_Q_r15 != null) threshX_Q_r15.print (_sb, "threshX_Q_r15", _level+1);
      if (q_RxLevMin_r15 != null) q_RxLevMin_r15.print (_sb, "q_RxLevMin_r15", _level+1);
      if (q_RxLevMinSUL_r15 != null) q_RxLevMinSUL_r15.print (_sb, "q_RxLevMinSUL_r15", _level+1);
      if (p_MaxNR_r15 != null) p_MaxNR_r15.print (_sb, "p_MaxNR_r15", _level+1);
      if (ns_PmaxListNR_r15 != null) ns_PmaxListNR_r15.print (_sb, "ns_PmaxListNR_r15", _level+1);
      if (q_QualMin_r15 != null) q_QualMin_r15.print (_sb, "q_QualMin_r15", _level+1);
      if (deriveSSB_IndexFromCell_r15 != null) deriveSSB_IndexFromCell_r15.print (_sb, "deriveSSB_IndexFromCell_r15", _level+1);
      if (maxRS_IndexCellQual_r15 != null) maxRS_IndexCellQual_r15.print (_sb, "maxRS_IndexCellQual_r15", _level+1);
      if (threshRS_Index_r15 != null) threshRS_Index_r15.print (_sb, "threshRS_Index_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
