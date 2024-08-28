/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.FreqBandIndicatorNR;

public class BandSidelinkPC5_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandSidelinkPC5-r16";
   }

   public FreqBandIndicatorNR freqBandSidelink_r16;
   public BandSidelinkPC5_r16_sl_Reception_r16 sl_Reception_r16;  // optional
   public BandSidelinkPC5_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16 = null;  // optional
   public BandSidelinkPC5_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16 = null;  // optional
   public boolean mV2ExtPresent;
   public BandSidelinkPC5_r16_csi_ReportSidelink_r16 csi_ReportSidelink_r16;  // optional
   public BandSidelinkPC5_r16_rankTwoReception_r16 rankTwoReception_r16 = null;  // optional
   public BandSidelinkPC5_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16 = null;  // optional
   public BandSidelinkPC5_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public BandSidelinkPC5_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandSidelinkPC5_r16 (
      FreqBandIndicatorNR freqBandSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16 sl_Reception_r16_,
      BandSidelinkPC5_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16_,
      BandSidelinkPC5_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16_,
      BandSidelinkPC5_r16_csi_ReportSidelink_r16 csi_ReportSidelink_r16_,
      BandSidelinkPC5_r16_rankTwoReception_r16 rankTwoReception_r16_,
      BandSidelinkPC5_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16_,
      BandSidelinkPC5_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16_
   ) {
      super();
      freqBandSidelink_r16 = freqBandSidelink_r16_;
      sl_Reception_r16 = sl_Reception_r16_;
      sl_Tx_256QAM_r16 = sl_Tx_256QAM_r16_;
      lowSE_64QAM_MCS_TableSidelink_r16 = lowSE_64QAM_MCS_TableSidelink_r16_;
      csi_ReportSidelink_r16 = csi_ReportSidelink_r16_;
      rankTwoReception_r16 = rankTwoReception_r16_;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = sl_openLoopPC_RSRP_ReportSidelink_r16_;
      sl_Rx_256QAM_r16 = sl_Rx_256QAM_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandSidelinkPC5_r16 (
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
   public BandSidelinkPC5_r16 (long freqBandSidelink_r16_,
      BandSidelinkPC5_r16_sl_Reception_r16 sl_Reception_r16_,
      BandSidelinkPC5_r16_sl_Tx_256QAM_r16 sl_Tx_256QAM_r16_,
      BandSidelinkPC5_r16_lowSE_64QAM_MCS_TableSidelink_r16 lowSE_64QAM_MCS_TableSidelink_r16_,
      BandSidelinkPC5_r16_csi_ReportSidelink_r16 csi_ReportSidelink_r16_,
      BandSidelinkPC5_r16_rankTwoReception_r16 rankTwoReception_r16_,
      BandSidelinkPC5_r16_sl_openLoopPC_RSRP_ReportSidelink_r16 sl_openLoopPC_RSRP_ReportSidelink_r16_,
      BandSidelinkPC5_r16_sl_Rx_256QAM_r16 sl_Rx_256QAM_r16_
   ) {
      super();
      freqBandSidelink_r16 = new FreqBandIndicatorNR (freqBandSidelink_r16_);
      sl_Reception_r16 = sl_Reception_r16_;
      sl_Tx_256QAM_r16 = sl_Tx_256QAM_r16_;
      lowSE_64QAM_MCS_TableSidelink_r16 = lowSE_64QAM_MCS_TableSidelink_r16_;
      csi_ReportSidelink_r16 = csi_ReportSidelink_r16_;
      rankTwoReception_r16 = rankTwoReception_r16_;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = sl_openLoopPC_RSRP_ReportSidelink_r16_;
      sl_Rx_256QAM_r16 = sl_Rx_256QAM_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public BandSidelinkPC5_r16 (
      long freqBandSidelink_r16_
   ) {
      super();
      freqBandSidelink_r16 = new FreqBandIndicatorNR (freqBandSidelink_r16_);
   }

   public void init () {
      freqBandSidelink_r16 = null;
      sl_Reception_r16 = null;
      sl_Tx_256QAM_r16 = null;
      lowSE_64QAM_MCS_TableSidelink_r16 = null;
      csi_ReportSidelink_r16 = null;
      rankTwoReception_r16 = null;
      sl_openLoopPC_RSRP_ReportSidelink_r16 = null;
      sl_Rx_256QAM_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return freqBandSidelink_r16;
         case 1: return sl_Reception_r16;
         case 2: return sl_Tx_256QAM_r16;
         case 3: return lowSE_64QAM_MCS_TableSidelink_r16;
         case 4: return csi_ReportSidelink_r16;
         case 5: return rankTwoReception_r16;
         case 6: return sl_openLoopPC_RSRP_ReportSidelink_r16;
         case 7: return sl_Rx_256QAM_r16;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "freqBandSidelink-r16";
         case 1: return "sl-Reception-r16";
         case 2: return "sl-Tx-256QAM-r16";
         case 3: return "lowSE-64QAM-MCS-TableSidelink-r16";
         case 4: return "csi-ReportSidelink-r16";
         case 5: return "rankTwoReception-r16";
         case 6: return "sl-openLoopPC-RSRP-ReportSidelink-r16";
         case 7: return "sl-Rx-256QAM-r16";
         case 8: return null;
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
      boolean sl_Tx_256QAM_r16Present = buffer.decodeBit ("sl_Tx_256QAM_r16Present");
      boolean lowSE_64QAM_MCS_TableSidelink_r16Present = buffer.decodeBit ("lowSE_64QAM_MCS_TableSidelink_r16Present");

      // decode freqBandSidelink_r16

      buffer.getContext().eventDispatcher.startElement("freqBandSidelink_r16", -1);

      freqBandSidelink_r16 = new FreqBandIndicatorNR();
      freqBandSidelink_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("freqBandSidelink_r16", -1);

      // decode sl_Reception_r16

      if (sl_Reception_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Reception_r16", -1);

         sl_Reception_r16 = new BandSidelinkPC5_r16_sl_Reception_r16();
         sl_Reception_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_Reception_r16", -1);
      }
      else {
         sl_Reception_r16 = null;
      }

      // decode sl_Tx_256QAM_r16

      if (sl_Tx_256QAM_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Tx_256QAM_r16", -1);

         int tval = BandSidelinkPC5_r16_sl_Tx_256QAM_r16.decodeEnumValue (buffer);
         sl_Tx_256QAM_r16 = BandSidelinkPC5_r16_sl_Tx_256QAM_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_Tx_256QAM_r16", -1);
      }
      else {
         sl_Tx_256QAM_r16 = null;
      }

      // decode lowSE_64QAM_MCS_TableSidelink_r16

      if (lowSE_64QAM_MCS_TableSidelink_r16Present) {
         buffer.getContext().eventDispatcher.startElement("lowSE_64QAM_MCS_TableSidelink_r16", -1);

         int tval = BandSidelinkPC5_r16_lowSE_64QAM_MCS_TableSidelink_r16.decodeEnumValue (buffer);
         lowSE_64QAM_MCS_TableSidelink_r16 = BandSidelinkPC5_r16_lowSE_64QAM_MCS_TableSidelink_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("lowSE_64QAM_MCS_TableSidelink_r16", -1);
      }
      else {
         lowSE_64QAM_MCS_TableSidelink_r16 = null;
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

            boolean csi_ReportSidelink_r16Present = buffer.decodeBit ("csi_ReportSidelink_r16Present");

            boolean rankTwoReception_r16Present = buffer.decodeBit ("rankTwoReception_r16Present");

            boolean sl_openLoopPC_RSRP_ReportSidelink_r16Present = buffer.decodeBit ("sl_openLoopPC_RSRP_ReportSidelink_r16Present");

            boolean sl_Rx_256QAM_r16Present = buffer.decodeBit ("sl_Rx_256QAM_r16Present");

            // decode csi_ReportSidelink_r16

            if (csi_ReportSidelink_r16Present) {
               buffer.getContext().eventDispatcher.startElement("csi_ReportSidelink_r16", -1);

               csi_ReportSidelink_r16 = new BandSidelinkPC5_r16_csi_ReportSidelink_r16();
               csi_ReportSidelink_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("csi_ReportSidelink_r16", -1);
            }
            else {
               csi_ReportSidelink_r16 = null;
            }

            // decode rankTwoReception_r16

            if (rankTwoReception_r16Present) {
               buffer.getContext().eventDispatcher.startElement("rankTwoReception_r16", -1);

               int tval = BandSidelinkPC5_r16_rankTwoReception_r16.decodeEnumValue (buffer);
               rankTwoReception_r16 = BandSidelinkPC5_r16_rankTwoReception_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("rankTwoReception_r16", -1);
            }
            else {
               rankTwoReception_r16 = null;
            }

            // decode sl_openLoopPC_RSRP_ReportSidelink_r16

            if (sl_openLoopPC_RSRP_ReportSidelink_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_openLoopPC_RSRP_ReportSidelink_r16", -1);

               int tval = BandSidelinkPC5_r16_sl_openLoopPC_RSRP_ReportSidelink_r16.decodeEnumValue (buffer);
               sl_openLoopPC_RSRP_ReportSidelink_r16 = BandSidelinkPC5_r16_sl_openLoopPC_RSRP_ReportSidelink_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sl_openLoopPC_RSRP_ReportSidelink_r16", -1);
            }
            else {
               sl_openLoopPC_RSRP_ReportSidelink_r16 = null;
            }

            // decode sl_Rx_256QAM_r16

            if (sl_Rx_256QAM_r16Present) {
               buffer.getContext().eventDispatcher.startElement("sl_Rx_256QAM_r16", -1);

               int tval = BandSidelinkPC5_r16_sl_Rx_256QAM_r16.decodeEnumValue (buffer);
               sl_Rx_256QAM_r16 = BandSidelinkPC5_r16_sl_Rx_256QAM_r16.valueOf (tval);
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
      if (sl_Tx_256QAM_r16 != null) sl_Tx_256QAM_r16.print (_sb, "sl_Tx_256QAM_r16", _level+1);
      if (lowSE_64QAM_MCS_TableSidelink_r16 != null) lowSE_64QAM_MCS_TableSidelink_r16.print (_sb, "lowSE_64QAM_MCS_TableSidelink_r16", _level+1);
      if (csi_ReportSidelink_r16 != null) csi_ReportSidelink_r16.print (_sb, "csi_ReportSidelink_r16", _level+1);
      if (rankTwoReception_r16 != null) rankTwoReception_r16.print (_sb, "rankTwoReception_r16", _level+1);
      if (sl_openLoopPC_RSRP_ReportSidelink_r16 != null) sl_openLoopPC_RSRP_ReportSidelink_r16.print (_sb, "sl_openLoopPC_RSRP_ReportSidelink_r16", _level+1);
      if (sl_Rx_256QAM_r16 != null) sl_Rx_256QAM_r16.print (_sb, "sl_Rx_256QAM_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
