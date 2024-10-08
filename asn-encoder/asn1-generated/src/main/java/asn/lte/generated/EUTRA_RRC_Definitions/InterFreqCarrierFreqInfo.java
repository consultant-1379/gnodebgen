/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class InterFreqCarrierFreqInfo extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "InterFreqCarrierFreqInfo";
   }

   public ARFCN_ValueEUTRA dl_CarrierFreq;
   public Q_RxLevMin q_RxLevMin;
   public P_Max p_Max;  // optional
   public T_Reselection t_ReselectionEUTRA;
   public SpeedStateScaleFactors t_ReselectionEUTRA_SF;  // optional
   public ReselectionThreshold threshX_High;
   public ReselectionThreshold threshX_Low;
   public AllowedMeasBandwidth allowedMeasBandwidth = null;
   public PresenceAntennaPort1 presenceAntennaPort1;
   public CellReselectionPriority cellReselectionPriority;  // optional
   public NeighCellConfig neighCellConfig;
   public Q_OffsetRange q_OffsetFreq = null;  // default = Q_OffsetRange.dB0()
   public InterFreqNeighCellList interFreqNeighCellList;  // optional
   public InterFreqBlackCellList interFreqBlackCellList;  // optional
   public boolean mV2ExtPresent;
   public Q_QualMin_r9 q_QualMin_r9;  // optional
   public InterFreqCarrierFreqInfo_threshX_Q_r9 threshX_Q_r9;  // optional
   public boolean mV3ExtPresent;
   public Q_QualMin_r9 q_QualMinWB_r11;  // optional
   public Asn1OpenExt extElem1;

   public InterFreqCarrierFreqInfo () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public InterFreqCarrierFreqInfo (
      ARFCN_ValueEUTRA dl_CarrierFreq_,
      Q_RxLevMin q_RxLevMin_,
      P_Max p_Max_,
      T_Reselection t_ReselectionEUTRA_,
      SpeedStateScaleFactors t_ReselectionEUTRA_SF_,
      ReselectionThreshold threshX_High_,
      ReselectionThreshold threshX_Low_,
      AllowedMeasBandwidth allowedMeasBandwidth_,
      PresenceAntennaPort1 presenceAntennaPort1_,
      CellReselectionPriority cellReselectionPriority_,
      NeighCellConfig neighCellConfig_,
      Q_OffsetRange q_OffsetFreq_,
      InterFreqNeighCellList interFreqNeighCellList_,
      InterFreqBlackCellList interFreqBlackCellList_,
      Q_QualMin_r9 q_QualMin_r9_,
      InterFreqCarrierFreqInfo_threshX_Q_r9 threshX_Q_r9_,
      Q_QualMin_r9 q_QualMinWB_r11_
   ) {
      super();
      dl_CarrierFreq = dl_CarrierFreq_;
      q_RxLevMin = q_RxLevMin_;
      p_Max = p_Max_;
      t_ReselectionEUTRA = t_ReselectionEUTRA_;
      t_ReselectionEUTRA_SF = t_ReselectionEUTRA_SF_;
      threshX_High = threshX_High_;
      threshX_Low = threshX_Low_;
      allowedMeasBandwidth = allowedMeasBandwidth_;
      presenceAntennaPort1 = presenceAntennaPort1_;
      cellReselectionPriority = cellReselectionPriority_;
      neighCellConfig = neighCellConfig_;
      q_OffsetFreq = q_OffsetFreq_;
      interFreqNeighCellList = interFreqNeighCellList_;
      interFreqBlackCellList = interFreqBlackCellList_;
      q_QualMin_r9 = q_QualMin_r9_;
      threshX_Q_r9 = threshX_Q_r9_;
      q_QualMinWB_r11 = q_QualMinWB_r11_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public InterFreqCarrierFreqInfo (
      ARFCN_ValueEUTRA dl_CarrierFreq_,
      Q_RxLevMin q_RxLevMin_,
      T_Reselection t_ReselectionEUTRA_,
      ReselectionThreshold threshX_High_,
      ReselectionThreshold threshX_Low_,
      AllowedMeasBandwidth allowedMeasBandwidth_,
      PresenceAntennaPort1 presenceAntennaPort1_,
      NeighCellConfig neighCellConfig_
   ) {
      super();
      dl_CarrierFreq = dl_CarrierFreq_;
      q_RxLevMin = q_RxLevMin_;
      t_ReselectionEUTRA = t_ReselectionEUTRA_;
      threshX_High = threshX_High_;
      threshX_Low = threshX_Low_;
      allowedMeasBandwidth = allowedMeasBandwidth_;
      presenceAntennaPort1 = presenceAntennaPort1_;
      neighCellConfig = neighCellConfig_;
      q_OffsetFreq = Q_OffsetRange.dB0();
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public InterFreqCarrierFreqInfo (long dl_CarrierFreq_,
      long q_RxLevMin_,
      long p_Max_,
      long t_ReselectionEUTRA_,
      SpeedStateScaleFactors t_ReselectionEUTRA_SF_,
      long threshX_High_,
      long threshX_Low_,
      AllowedMeasBandwidth allowedMeasBandwidth_,
      boolean presenceAntennaPort1_,
      long cellReselectionPriority_,
      NeighCellConfig neighCellConfig_,
      Q_OffsetRange q_OffsetFreq_,
      InterFreqNeighCellList interFreqNeighCellList_,
      InterFreqBlackCellList interFreqBlackCellList_,
      long q_QualMin_r9_,
      InterFreqCarrierFreqInfo_threshX_Q_r9 threshX_Q_r9_,
      long q_QualMinWB_r11_
   ) {
      super();
      dl_CarrierFreq = new ARFCN_ValueEUTRA (dl_CarrierFreq_);
      q_RxLevMin = new Q_RxLevMin (q_RxLevMin_);
      p_Max = new P_Max (p_Max_);
      t_ReselectionEUTRA = new T_Reselection (t_ReselectionEUTRA_);
      t_ReselectionEUTRA_SF = t_ReselectionEUTRA_SF_;
      threshX_High = new ReselectionThreshold (threshX_High_);
      threshX_Low = new ReselectionThreshold (threshX_Low_);
      allowedMeasBandwidth = allowedMeasBandwidth_;
      presenceAntennaPort1 = new PresenceAntennaPort1 (presenceAntennaPort1_);
      cellReselectionPriority = new CellReselectionPriority (cellReselectionPriority_);
      neighCellConfig = neighCellConfig_;
      q_OffsetFreq = q_OffsetFreq_;
      interFreqNeighCellList = interFreqNeighCellList_;
      interFreqBlackCellList = interFreqBlackCellList_;
      q_QualMin_r9 = new Q_QualMin_r9 (q_QualMin_r9_);
      threshX_Q_r9 = threshX_Q_r9_;
      q_QualMinWB_r11 = new Q_QualMin_r9 (q_QualMinWB_r11_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public InterFreqCarrierFreqInfo (
      long dl_CarrierFreq_,
      long q_RxLevMin_,
      long t_ReselectionEUTRA_,
      long threshX_High_,
      long threshX_Low_,
      AllowedMeasBandwidth allowedMeasBandwidth_,
      boolean presenceAntennaPort1_,
      NeighCellConfig neighCellConfig_
   ) {
      super();
      dl_CarrierFreq = new ARFCN_ValueEUTRA (dl_CarrierFreq_);
      q_RxLevMin = new Q_RxLevMin (q_RxLevMin_);
      t_ReselectionEUTRA = new T_Reselection (t_ReselectionEUTRA_);
      threshX_High = new ReselectionThreshold (threshX_High_);
      threshX_Low = new ReselectionThreshold (threshX_Low_);
      allowedMeasBandwidth = allowedMeasBandwidth_;
      presenceAntennaPort1 = new PresenceAntennaPort1 (presenceAntennaPort1_);
      neighCellConfig = neighCellConfig_;
      q_OffsetFreq = Q_OffsetRange.dB0();
   }

   public void init () {
      dl_CarrierFreq = null;
      q_RxLevMin = null;
      p_Max = null;
      t_ReselectionEUTRA = null;
      t_ReselectionEUTRA_SF = null;
      threshX_High = null;
      threshX_Low = null;
      allowedMeasBandwidth = null;
      presenceAntennaPort1 = null;
      cellReselectionPriority = null;
      neighCellConfig = null;
      q_OffsetFreq = Q_OffsetRange.dB0();
      interFreqNeighCellList = null;
      interFreqBlackCellList = null;
      q_QualMin_r9 = null;
      threshX_Q_r9 = null;
      q_QualMinWB_r11 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 18; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_CarrierFreq;
         case 1: return q_RxLevMin;
         case 2: return p_Max;
         case 3: return t_ReselectionEUTRA;
         case 4: return t_ReselectionEUTRA_SF;
         case 5: return threshX_High;
         case 6: return threshX_Low;
         case 7: return allowedMeasBandwidth;
         case 8: return presenceAntennaPort1;
         case 9: return cellReselectionPriority;
         case 10: return neighCellConfig;
         case 11: return q_OffsetFreq;
         case 12: return interFreqNeighCellList;
         case 13: return interFreqBlackCellList;
         case 14: return q_QualMin_r9;
         case 15: return threshX_Q_r9;
         case 16: return q_QualMinWB_r11;
         case 17: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-CarrierFreq";
         case 1: return "q-RxLevMin";
         case 2: return "p-Max";
         case 3: return "t-ReselectionEUTRA";
         case 4: return "t-ReselectionEUTRA-SF";
         case 5: return "threshX-High";
         case 6: return "threshX-Low";
         case 7: return "allowedMeasBandwidth";
         case 8: return "presenceAntennaPort1";
         case 9: return "cellReselectionPriority";
         case 10: return "neighCellConfig";
         case 11: return "q-OffsetFreq";
         case 12: return "interFreqNeighCellList";
         case 13: return "interFreqBlackCellList";
         case 14: return "q-QualMin-r9";
         case 15: return "threshX-Q-r9";
         case 16: return "q-QualMinWB-r11";
         case 17: return null;
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

      boolean p_MaxPresent = buffer.decodeBit ("p_MaxPresent");
      boolean t_ReselectionEUTRA_SFPresent = buffer.decodeBit ("t_ReselectionEUTRA_SFPresent");
      boolean cellReselectionPriorityPresent = buffer.decodeBit ("cellReselectionPriorityPresent");
      boolean q_OffsetFreqPresent = buffer.decodeBit ("q_OffsetFreqPresent");
      boolean interFreqNeighCellListPresent = buffer.decodeBit ("interFreqNeighCellListPresent");
      boolean interFreqBlackCellListPresent = buffer.decodeBit ("interFreqBlackCellListPresent");

      // decode dl_CarrierFreq

      buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq", -1);

      dl_CarrierFreq = new ARFCN_ValueEUTRA();
      dl_CarrierFreq.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq", -1);

      // decode q_RxLevMin

      buffer.getContext().eventDispatcher.startElement("q_RxLevMin", -1);

      q_RxLevMin = new Q_RxLevMin();
      q_RxLevMin.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("q_RxLevMin", -1);

      // decode p_Max

      if (p_MaxPresent) {
         buffer.getContext().eventDispatcher.startElement("p_Max", -1);

         p_Max = new P_Max();
         p_Max.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p_Max", -1);
      }
      else {
         p_Max = null;
      }

      // decode t_ReselectionEUTRA

      buffer.getContext().eventDispatcher.startElement("t_ReselectionEUTRA", -1);

      t_ReselectionEUTRA = new T_Reselection();
      t_ReselectionEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("t_ReselectionEUTRA", -1);

      // decode t_ReselectionEUTRA_SF

      if (t_ReselectionEUTRA_SFPresent) {
         buffer.getContext().eventDispatcher.startElement("t_ReselectionEUTRA_SF", -1);

         t_ReselectionEUTRA_SF = new SpeedStateScaleFactors();
         t_ReselectionEUTRA_SF.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("t_ReselectionEUTRA_SF", -1);
      }
      else {
         t_ReselectionEUTRA_SF = null;
      }

      // decode threshX_High

      buffer.getContext().eventDispatcher.startElement("threshX_High", -1);

      threshX_High = new ReselectionThreshold();
      threshX_High.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_High", -1);

      // decode threshX_Low

      buffer.getContext().eventDispatcher.startElement("threshX_Low", -1);

      threshX_Low = new ReselectionThreshold();
      threshX_Low.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("threshX_Low", -1);

      // decode allowedMeasBandwidth

      buffer.getContext().eventDispatcher.startElement("allowedMeasBandwidth", -1);

      {
         int tval = AllowedMeasBandwidth.decodeEnumValue (buffer);
         allowedMeasBandwidth = AllowedMeasBandwidth.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("allowedMeasBandwidth", -1);

      // decode presenceAntennaPort1

      buffer.getContext().eventDispatcher.startElement("presenceAntennaPort1", -1);

      presenceAntennaPort1 = new PresenceAntennaPort1();
      presenceAntennaPort1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("presenceAntennaPort1", -1);

      // decode cellReselectionPriority

      if (cellReselectionPriorityPresent) {
         buffer.getContext().eventDispatcher.startElement("cellReselectionPriority", -1);

         cellReselectionPriority = new CellReselectionPriority();
         cellReselectionPriority.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellReselectionPriority", -1);
      }
      else {
         cellReselectionPriority = null;
      }

      // decode neighCellConfig

      buffer.getContext().eventDispatcher.startElement("neighCellConfig", -1);

      neighCellConfig = new NeighCellConfig();
      neighCellConfig.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("neighCellConfig", -1);

      // decode q_OffsetFreq

      if (q_OffsetFreqPresent) {
         buffer.getContext().eventDispatcher.startElement("q_OffsetFreq", -1);

         int tval = Q_OffsetRange.decodeEnumValue (buffer);
         q_OffsetFreq = Q_OffsetRange.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("q_OffsetFreq", -1);
      }
      else {
         q_OffsetFreq = Q_OffsetRange.dB0();
      }

      // decode interFreqNeighCellList

      if (interFreqNeighCellListPresent) {
         buffer.getContext().eventDispatcher.startElement("interFreqNeighCellList", -1);

         interFreqNeighCellList = new InterFreqNeighCellList();
         interFreqNeighCellList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interFreqNeighCellList", -1);
      }
      else {
         interFreqNeighCellList = null;
      }

      // decode interFreqBlackCellList

      if (interFreqBlackCellListPresent) {
         buffer.getContext().eventDispatcher.startElement("interFreqBlackCellList", -1);

         interFreqBlackCellList = new InterFreqBlackCellList();
         interFreqBlackCellList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("interFreqBlackCellList", -1);
      }
      else {
         interFreqBlackCellList = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean q_QualMin_r9Present = buffer.decodeBit ("q_QualMin_r9Present");

            boolean threshX_Q_r9Present = buffer.decodeBit ("threshX_Q_r9Present");

            // decode q_QualMin_r9

            if (q_QualMin_r9Present) {
               buffer.getContext().eventDispatcher.startElement("q_QualMin_r9", -1);

               q_QualMin_r9 = new Q_QualMin_r9();
               q_QualMin_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("q_QualMin_r9", -1);
            }
            else {
               q_QualMin_r9 = null;
            }

            // decode threshX_Q_r9

            if (threshX_Q_r9Present) {
               buffer.getContext().eventDispatcher.startElement("threshX_Q_r9", -1);

               threshX_Q_r9 = new InterFreqCarrierFreqInfo_threshX_Q_r9();
               threshX_Q_r9.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("threshX_Q_r9", -1);
            }
            else {
               threshX_Q_r9 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean q_QualMinWB_r11Present = buffer.decodeBit ("q_QualMinWB_r11Present");

            // decode q_QualMinWB_r11

            if (q_QualMinWB_r11Present) {
               buffer.getContext().eventDispatcher.startElement("q_QualMinWB_r11", -1);

               q_QualMinWB_r11 = new Q_QualMin_r9();
               q_QualMinWB_r11.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("q_QualMinWB_r11", -1);
            }
            else {
               q_QualMinWB_r11 = null;
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
      if (dl_CarrierFreq != null) dl_CarrierFreq.print (_sb, "dl_CarrierFreq", _level+1);
      if (q_RxLevMin != null) q_RxLevMin.print (_sb, "q_RxLevMin", _level+1);
      if (p_Max != null) p_Max.print (_sb, "p_Max", _level+1);
      if (t_ReselectionEUTRA != null) t_ReselectionEUTRA.print (_sb, "t_ReselectionEUTRA", _level+1);
      if (t_ReselectionEUTRA_SF != null) t_ReselectionEUTRA_SF.print (_sb, "t_ReselectionEUTRA_SF", _level+1);
      if (threshX_High != null) threshX_High.print (_sb, "threshX_High", _level+1);
      if (threshX_Low != null) threshX_Low.print (_sb, "threshX_Low", _level+1);
      if (allowedMeasBandwidth != null) allowedMeasBandwidth.print (_sb, "allowedMeasBandwidth", _level+1);
      if (presenceAntennaPort1 != null) presenceAntennaPort1.print (_sb, "presenceAntennaPort1", _level+1);
      if (cellReselectionPriority != null) cellReselectionPriority.print (_sb, "cellReselectionPriority", _level+1);
      if (neighCellConfig != null) neighCellConfig.print (_sb, "neighCellConfig", _level+1);
      if (q_OffsetFreq != null) q_OffsetFreq.print (_sb, "q_OffsetFreq", _level+1);
      if (interFreqNeighCellList != null) interFreqNeighCellList.print (_sb, "interFreqNeighCellList", _level+1);
      if (interFreqBlackCellList != null) interFreqBlackCellList.print (_sb, "interFreqBlackCellList", _level+1);
      if (q_QualMin_r9 != null) q_QualMin_r9.print (_sb, "q_QualMin_r9", _level+1);
      if (threshX_Q_r9 != null) threshX_Q_r9.print (_sb, "threshX_Q_r9", _level+1);
      if (q_QualMinWB_r11 != null) q_QualMinWB_r11.print (_sb, "q_QualMinWB_r11", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
