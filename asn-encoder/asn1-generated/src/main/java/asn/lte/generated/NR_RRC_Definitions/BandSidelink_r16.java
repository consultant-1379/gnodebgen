/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandSidelink_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandSidelink-r16";
   }

   public FreqBandIndicatorNR freqBandSidelink_r16;
   public BandSidelink_r16_sl_Reception_r16 sl_Reception_r16;  // optional
   public BandSidelink_r16_sl_TransmissionMode1_r16 sl_TransmissionMode1_r16;  // optional
   public BandSidelink_r16_sync_Sidelink_r16 sync_Sidelink_r16;  // optional
   public BandSidelink_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16 = null;  // optional
   public BandSidelink_r16_psfch_FormatZeroSidelink_r16 psfch_FormatZeroSidelink_r16;  // optional
   public BandSidelink_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16 = null;  // optional
   public BandSidelink_r16_enb_sync_Sidelink_r16 enb_sync_Sidelink_r16 = null;  // optional
   public boolean mV2ExtPresent;
   public BandSidelink_r16_sl_TransmissionMode2_r16 sl_TransmissionMode2_r16;  // optional
   public BandSidelink_r16_congestionControlSidelink_r16 congestionControlSidelink_r16;  // optional
   public BandSidelink_r16_fewerSymbolSlotSidelink_r16 fewerSymbolSlotSidelink_r16 = null;  // optional
   public BandSidelink_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16 = null;  // optional
   public BandSidelink_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public BandSidelink_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandSidelink_r16 (
      FreqBandIndicatorNR freqBandSidelink_r16_,
      BandSidelink_r16_sl_Reception_r16 sl_Reception_r16_,
      BandSidelink_r16_sl_TransmissionMode1_r16 sl_TransmissionMode1_r16_,
      BandSidelink_r16_sync_Sidelink_r16 sync_Sidelink_r16_,
      BandSidelink_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16_,
      BandSidelink_r16_psfch_FormatZeroSidelink_r16 psfch_FormatZeroSidelink_r16_,
      BandSidelink_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16_,
      BandSidelink_r16_enb_sync_Sidelink_r16 enb_sync_Sidelink_r16_,
      BandSidelink_r16_sl_TransmissionMode2_r16 sl_TransmissionMode2_r16_,
      BandSidelink_r16_congestionControlSidelink_r16 congestionControlSidelink_r16_,
      BandSidelink_r16_fewerSymbolSlotSidelink_r16 fewerSymbolSlotSidelink_r16_,
      BandSidelink_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16_,
      BandSidelink_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16_
   ) {
      super();
      freqBandSidelink_r16 = freqBandSidelink_r16_;
      sl_Reception_r16 = sl_Reception_r16_;
      sl_TransmissionMode1_r16 = sl_TransmissionMode1_r16_;
      sync_Sidelink_r16 = sync_Sidelink_r16_;
      sl_Tx_256QAM_r16 = sl_Tx_256QAM_r16_;
      psfch_FormatZeroSidelink_r16 = psfch_FormatZeroSidelink_r16_;
      lowSE_64QAM_MCS_TableSidelink_r16 = lowSE_64QAM_MCS_TableSidelink_r16_;
      enb_sync_Sidelink_r16 = enb_sync_Sidelink_r16_;
      sl_TransmissionMode2_r16 = sl_TransmissionMode2_r16_;
      congestionControlSidelink_r16 = congestionControlSidelink_r16_;
      fewerSymbolSlotSidelink_r16 = fewerSymbolSlotSidelink_r16_;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = sl_openLoopPC_RSRP_ReportSidelink_r16_;
      sl_Rx_256QAM_r16 = sl_Rx_256QAM_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandSidelink_r16 (
      FreqBandIndicatorNR freqBandSidelink_r16_
   ) {
      super();
      freqBandSidelink_r16 = freqBandSidelink_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public BandSidelink_r16 (long freqBandSidelink_r16_,
      BandSidelink_r16_sl_Reception_r16 sl_Reception_r16_,
      BandSidelink_r16_sl_TransmissionMode1_r16 sl_TransmissionMode1_r16_,
      BandSidelink_r16_sync_Sidelink_r16 sync_Sidelink_r16_,
      BandSidelink_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16_,
      BandSidelink_r16_psfch_FormatZeroSidelink_r16 psfch_FormatZeroSidelink_r16_,
      BandSidelink_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16_,
      BandSidelink_r16_enb_sync_Sidelink_r16 enb_sync_Sidelink_r16_,
      BandSidelink_r16_sl_TransmissionMode2_r16 sl_TransmissionMode2_r16_,
      BandSidelink_r16_congestionControlSidelink_r16 congestionControlSidelink_r16_,
      BandSidelink_r16_fewerSymbolSlotSidelink_r16 fewerSymbolSlotSidelink_r16_,
      BandSidelink_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16_,
      BandSidelink_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16_
   ) {
      super();
      freqBandSidelink_r16 = new FreqBandIndicatorNR (freqBandSidelink_r16_);
      sl_Reception_r16 = sl_Reception_r16_;
      sl_TransmissionMode1_r16 = sl_TransmissionMode1_r16_;
      sync_Sidelink_r16 = sync_Sidelink_r16_;
      sl_Tx_256QAM_r16 = sl_Tx_256QAM_r16_;
      psfch_FormatZeroSidelink_r16 = psfch_FormatZeroSidelink_r16_;
      lowSE_64QAM_MCS_TableSidelink_r16 = lowSE_64QAM_MCS_TableSidelink_r16_;
      enb_sync_Sidelink_r16 = enb_sync_Sidelink_r16_;
      sl_TransmissionMode2_r16 = sl_TransmissionMode2_r16_;
      congestionControlSidelink_r16 = congestionControlSidelink_r16_;
      fewerSymbolSlotSidelink_r16 = fewerSymbolSlotSidelink_r16_;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = sl_openLoopPC_RSRP_ReportSidelink_r16_;
      sl_Rx_256QAM_r16 = sl_Rx_256QAM_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public BandSidelink_r16 (
      long freqBandSidelink_r16_
   ) {
      super();
      freqBandSidelink_r16 = new FreqBandIndicatorNR (freqBandSidelink_r16_);
   }

   public void init () {
      freqBandSidelink_r16 = null;
      sl_Reception_r16 = null;
      sl_TransmissionMode1_r16 = null;
      sync_Sidelink_r16 = null;
      sl_Tx_256QAM_r16 = null;
      psfch_FormatZeroSidelink_r16 = null;
      lowSE_64QAM_MCS_TableSidelink_r16 = null;
      enb_sync_Sidelink_r16 = null;
      sl_TransmissionMode2_r16 = null;
      congestionControlSidelink_r16 = null;
      fewerSymbolSlotSidelink_r16 = null;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = null;
      sl_Rx_256QAM_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqBandSidelink_r16;
         case 1: return sl_Reception_r16;
         case 2: return sl_TransmissionMode1_r16;
         case 3: return sync_Sidelink_r16;
         case 4: return sl_Tx_256QAM_r16;
         case 5: return psfch_FormatZeroSidelink_r16;
         case 6: return lowSE_64QAM_MCS_TableSidelink_r16;
         case 7: return enb_sync_Sidelink_r16;
         case 8: return sl_TransmissionMode2_r16;
         case 9: return congestionControlSidelink_r16;
         case 10: return fewerSymbolSlotSidelink_r16;
         case 11: return sl_openLoopPC_RSRP_ReportSidelink_r16;
         case 12: return sl_Rx_256QAM_r16;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqBandSidelink-r16";
         case 1: return "sl-Reception-r16";
         case 2: return "sl-TransmissionMode1-r16";
         case 3: return "sync-Sidelink-r16";
         case 4: return "sl-Tx-256QAM-r16";
         case 5: return "psfch-FormatZeroSidelink-r16";
         case 6: return "lowSE-64QAM-MCS-TableSidelink-r16";
         case 7: return "enb-sync-Sidelink-r16";
         case 8: return "sl-TransmissionMode2-r16";
         case 9: return "congestionControlSidelink-r16";
         case 10: return "fewerSymbolSlotSidelink-r16";
         case 11: return "sl-openLoopPC-RSRP-ReportSidelink-r16";
         case 12: return "sl-Rx-256QAM-r16";
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

      boolean sl_Reception_r16Present = buffer.decodeBit ("sl_Reception_r16Present");
      boolean sl_TransmissionMode1_r16Present = buffer.decodeBit ("sl_TransmissionMode1_r16Present");
      boolean sync_Sidelink_r16Present = buffer.decodeBit ("sync_Sidelink_r16Present");
      boolean sl_Tx_256QAM_r16Present = buffer.decodeBit ("sl_Tx_256QAM_r16Present");
      boolean psfch_FormatZeroSidelink_r16Present = buffer.decodeBit ("psfch_FormatZeroSidelink_r16Present");
      boolean lowSE_64QAM_MCS_TableSidelink_r16Present = buffer.decodeBit ("lowSE_64QAM_MCS_TableSidelink_r16Present");
      boolean enb_sync_Sidelink_r16Present = buffer.decodeBit ("enb_sync_Sidelink_r16Present");

      // decode freqBandSidelink_r16

      buffer.getContext().eventDispatcher.startElement("freqBandSidelink_r16", -1);

      freqBandSidelink_r16 = new FreqBandIndicatorNR();
      freqBandSidelink_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("freqBandSidelink_r16", -1);

      // decode sl_Reception_r16

      if (sl_Reception_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Reception_r16", -1);

         sl_Reception_r16 = new BandSidelink_r16_sl_Reception_r16();
         sl_Reception_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_Reception_r16", -1);
      }
      else {
         sl_Reception_r16 = null;
      }

      // decode sl_TransmissionMode1_r16

      if (sl_TransmissionMode1_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_TransmissionMode1_r16", -1);

         sl_TransmissionMode1_r16 = new BandSidelink_r16_sl_TransmissionMode1_r16();
         sl_TransmissionMode1_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_TransmissionMode1_r16", -1);
      }
      else {
         sl_TransmissionMode1_r16 = null;
      }

      // decode sync_Sidelink_r16

      if (sync_Sidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sync_Sidelink_r16", -1);

         sync_Sidelink_r16 = new BandSidelink_r16_sync_Sidelink_r16();
         sync_Sidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sync_Sidelink_r16", -1);
      }
      else {
         sync_Sidelink_r16 = null;
      }

      // decode sl_Tx_256QAM_r16

      if (sl_Tx_256QAM_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Tx_256QAM_r16", -1);

         int tval = BandSidelink_r16_sl_Tx_256QAM_r16.decodeEnumValue (buffer);
         sl_Tx_256QAM_r16 = BandSidelink_r16_sl_Tx_256QAM_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_Tx_256QAM_r16", -1);
      }
      else {
         sl_Tx_256QAM_r16 = null;
      }

      // decode psfch_FormatZeroSidelink_r16

      if (psfch_FormatZeroSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("psfch_FormatZeroSidelink_r16", -1);

         psfch_FormatZeroSidelink_r16 = new BandSidelink_r16_psfch_FormatZeroSidelink_r16();
         psfch_FormatZeroSidelink_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("psfch_FormatZeroSidelink_r16", -1);
      }
      else {
         psfch_FormatZeroSidelink_r16 = null;
      }

      // decode lowSE_64QAM_MCS_TableSidelink_r16

      if (lowSE_64QAM_MCS_TableSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("lowSE_64QAM_MCS_TableSidelink_r16", -1);

         int tval = BandSidelink_r16_lowSE_64QAM_MCS_TableSidelink_r16.decodeEnumValue (buffer);
         lowSE_64QAM_MCS_TableSidelink_r16 = BandSidelink_r16_lowSE_64QAM_MCS_TableSidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lowSE_64QAM_MCS_TableSidelink_r16", -1);
      }
      else {
         lowSE_64QAM_MCS_TableSidelink_r16 = null;
      }

      // decode enb_sync_Sidelink_r16

      if (enb_sync_Sidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("enb_sync_Sidelink_r16", -1);

         int tval = BandSidelink_r16_enb_sync_Sidelink_r16.decodeEnumValue (buffer);
         enb_sync_Sidelink_r16 = BandSidelink_r16_enb_sync_Sidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("enb_sync_Sidelink_r16", -1);
      }
      else {
         enb_sync_Sidelink_r16 = null;
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

            boolean sl_TransmissionMode2_r16Present = buffer.decodeBit ("sl_TransmissionMode2_r16Present");

            boolean congestionControlSidelink_r16Present = buffer.decodeBit ("congestionControlSidelink_r16Present");

            boolean fewerSymbolSlotSidelink_r16Present = buffer.decodeBit ("fewerSymbolSlotSidelink_r16Present");

            boolean sl_openLoopPC_RSRP_ReportSidelink_r16Present = buffer.decodeBit ("sl_openLoopPC_RSRP_ReportSidelink_r16Present");

            boolean sl_Rx_256QAM_r16Present = buffer.decodeBit ("sl_Rx_256QAM_r16Present");

            // decode sl_TransmissionMode2_r16

            if (sl_TransmissionMode2_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_TransmissionMode2_r16", -1);

               sl_TransmissionMode2_r16 = new BandSidelink_r16_sl_TransmissionMode2_r16();
               sl_TransmissionMode2_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sl_TransmissionMode2_r16", -1);
            }
            else {
               sl_TransmissionMode2_r16 = null;
            }

            // decode congestionControlSidelink_r16

            if (congestionControlSidelink_r16Present) {
               buffer.getContext().eventDispatcher.startElement("congestionControlSidelink_r16", -1);

               congestionControlSidelink_r16 = new BandSidelink_r16_congestionControlSidelink_r16();
               congestionControlSidelink_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("congestionControlSidelink_r16", -1);
            }
            else {
               congestionControlSidelink_r16 = null;
            }

            // decode fewerSymbolSlotSidelink_r16

            if (fewerSymbolSlotSidelink_r16Present) {
               buffer.getContext().eventDispatcher.startElement("fewerSymbolSlotSidelink_r16", -1);

               int tval = BandSidelink_r16_fewerSymbolSlotSidelink_r16.decodeEnumValue (buffer);
               fewerSymbolSlotSidelink_r16 = BandSidelink_r16_fewerSymbolSlotSidelink_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("fewerSymbolSlotSidelink_r16", -1);
            }
            else {
               fewerSymbolSlotSidelink_r16 = null;
            }

            // decode sl_openLoopPC_RSRP_ReportSidelink_r16

            if (sl_openLoopPC_RSRP_ReportSidelink_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_openLoopPC_RSRP_ReportSidelink_r16", -1);

               int tval = BandSidelink_r16_sl_openLoopPC_RSRP_ReportSidelink_r16.decodeEnumValue (buffer);
               sl_openLoopPC_RSRP_ReportSidelink_r16 = BandSidelink_r16_sl_openLoopPC_RSRP_ReportSidelink_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sl_openLoopPC_RSRP_ReportSidelink_r16", -1);
            }
            else {
               sl_openLoopPC_RSRP_ReportSidelink_r16 = null;
            }

            // decode sl_Rx_256QAM_r16

            if (sl_Rx_256QAM_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_Rx_256QAM_r16", -1);

               int tval = BandSidelink_r16_sl_Rx_256QAM_r16.decodeEnumValue (buffer);
               sl_Rx_256QAM_r16 = BandSidelink_r16_sl_Rx_256QAM_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sl_Rx_256QAM_r16", -1);
            }
            else {
               sl_Rx_256QAM_r16 = null;
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
      if (freqBandSidelink_r16 != null) freqBandSidelink_r16.print (_sb, "freqBandSidelink_r16", _level+1);
      if (sl_Reception_r16 != null) sl_Reception_r16.print (_sb, "sl_Reception_r16", _level+1);
      if (sl_TransmissionMode1_r16 != null) sl_TransmissionMode1_r16.print (_sb, "sl_TransmissionMode1_r16", _level+1);
      if (sync_Sidelink_r16 != null) sync_Sidelink_r16.print (_sb, "sync_Sidelink_r16", _level+1);
      if (sl_Tx_256QAM_r16 != null) sl_Tx_256QAM_r16.print (_sb, "sl_Tx_256QAM_r16", _level+1);
      if (psfch_FormatZeroSidelink_r16 != null) psfch_FormatZeroSidelink_r16.print (_sb, "psfch_FormatZeroSidelink_r16", _level+1);
      if (lowSE_64QAM_MCS_TableSidelink_r16 != null) lowSE_64QAM_MCS_TableSidelink_r16.print (_sb, "lowSE_64QAM_MCS_TableSidelink_r16", _level+1);
      if (enb_sync_Sidelink_r16 != null) enb_sync_Sidelink_r16.print (_sb, "enb_sync_Sidelink_r16", _level+1);
      if (sl_TransmissionMode2_r16 != null) sl_TransmissionMode2_r16.print (_sb, "sl_TransmissionMode2_r16", _level+1);
      if (congestionControlSidelink_r16 != null) congestionControlSidelink_r16.print (_sb, "congestionControlSidelink_r16", _level+1);
      if (fewerSymbolSlotSidelink_r16 != null) fewerSymbolSlotSidelink_r16.print (_sb, "fewerSymbolSlotSidelink_r16", _level+1);
      if (sl_openLoopPC_RSRP_ReportSidelink_r16 != null) sl_openLoopPC_RSRP_ReportSidelink_r16.print (_sb, "sl_openLoopPC_RSRP_ReportSidelink_r16", _level+1);
      if (sl_Rx_256QAM_r16 != null) sl_Rx_256QAM_r16.print (_sb, "sl_Rx_256QAM_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
