/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.P0_SL_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRP_RangeSL3_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.FilterCoefficient;

public class SL_PreconfigV2X_Sync_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PreconfigV2X-Sync-r14";
   }

   public SL_V2X_SyncOffsetIndicators_r14 syncOffsetIndicators_r14;
   public P0_SL_r12 syncTxParameters_r14;
   public RSRP_RangeSL3_r12 syncTxThreshOoC_r14;
   public FilterCoefficient filterCoefficient_r14 = null;
   public SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14 syncRefMinHyst_r14 = null;
   public SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14 syncRefDiffHyst_r14 = null;
   public boolean mV2ExtPresent;
   public SL_PreconfigV2X_Sync_r14_slss_TxDisabled_r15 slss_TxDisabled_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public SL_PreconfigV2X_Sync_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PreconfigV2X_Sync_r14 (
      SL_V2X_SyncOffsetIndicators_r14 syncOffsetIndicators_r14_,
      P0_SL_r12 syncTxParameters_r14_,
      RSRP_RangeSL3_r12 syncTxThreshOoC_r14_,
      FilterCoefficient filterCoefficient_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14 syncRefMinHyst_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14 syncRefDiffHyst_r14_,
      SL_PreconfigV2X_Sync_r14_slss_TxDisabled_r15 slss_TxDisabled_r15_
   ) {
      super();
      syncOffsetIndicators_r14 = syncOffsetIndicators_r14_;
      syncTxParameters_r14 = syncTxParameters_r14_;
      syncTxThreshOoC_r14 = syncTxThreshOoC_r14_;
      filterCoefficient_r14 = filterCoefficient_r14_;
      syncRefMinHyst_r14 = syncRefMinHyst_r14_;
      syncRefDiffHyst_r14 = syncRefDiffHyst_r14_;
      slss_TxDisabled_r15 = slss_TxDisabled_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_PreconfigV2X_Sync_r14 (
      SL_V2X_SyncOffsetIndicators_r14 syncOffsetIndicators_r14_,
      P0_SL_r12 syncTxParameters_r14_,
      RSRP_RangeSL3_r12 syncTxThreshOoC_r14_,
      FilterCoefficient filterCoefficient_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14 syncRefMinHyst_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14 syncRefDiffHyst_r14_
   ) {
      super();
      syncOffsetIndicators_r14 = syncOffsetIndicators_r14_;
      syncTxParameters_r14 = syncTxParameters_r14_;
      syncTxThreshOoC_r14 = syncTxThreshOoC_r14_;
      filterCoefficient_r14 = filterCoefficient_r14_;
      syncRefMinHyst_r14 = syncRefMinHyst_r14_;
      syncRefDiffHyst_r14 = syncRefDiffHyst_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_PreconfigV2X_Sync_r14 (SL_V2X_SyncOffsetIndicators_r14 syncOffsetIndicators_r14_,
      long syncTxParameters_r14_,
      long syncTxThreshOoC_r14_,
      FilterCoefficient filterCoefficient_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14 syncRefMinHyst_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14 syncRefDiffHyst_r14_,
      SL_PreconfigV2X_Sync_r14_slss_TxDisabled_r15 slss_TxDisabled_r15_
   ) {
      super();
      syncOffsetIndicators_r14 = syncOffsetIndicators_r14_;
      syncTxParameters_r14 = new P0_SL_r12 (syncTxParameters_r14_);
      syncTxThreshOoC_r14 = new RSRP_RangeSL3_r12 (syncTxThreshOoC_r14_);
      filterCoefficient_r14 = filterCoefficient_r14_;
      syncRefMinHyst_r14 = syncRefMinHyst_r14_;
      syncRefDiffHyst_r14 = syncRefDiffHyst_r14_;
      slss_TxDisabled_r15 = slss_TxDisabled_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_PreconfigV2X_Sync_r14 (
      SL_V2X_SyncOffsetIndicators_r14 syncOffsetIndicators_r14_,
      long syncTxParameters_r14_,
      long syncTxThreshOoC_r14_,
      FilterCoefficient filterCoefficient_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14 syncRefMinHyst_r14_,
      SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14 syncRefDiffHyst_r14_
   ) {
      super();
      syncOffsetIndicators_r14 = syncOffsetIndicators_r14_;
      syncTxParameters_r14 = new P0_SL_r12 (syncTxParameters_r14_);
      syncTxThreshOoC_r14 = new RSRP_RangeSL3_r12 (syncTxThreshOoC_r14_);
      filterCoefficient_r14 = filterCoefficient_r14_;
      syncRefMinHyst_r14 = syncRefMinHyst_r14_;
      syncRefDiffHyst_r14 = syncRefDiffHyst_r14_;
   }

   public void init () {
      syncOffsetIndicators_r14 = null;
      syncTxParameters_r14 = null;
      syncTxThreshOoC_r14 = null;
      filterCoefficient_r14 = null;
      syncRefMinHyst_r14 = null;
      syncRefDiffHyst_r14 = null;
      slss_TxDisabled_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return syncOffsetIndicators_r14;
         case 1: return syncTxParameters_r14;
         case 2: return syncTxThreshOoC_r14;
         case 3: return filterCoefficient_r14;
         case 4: return syncRefMinHyst_r14;
         case 5: return syncRefDiffHyst_r14;
         case 6: return slss_TxDisabled_r15;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "syncOffsetIndicators-r14";
         case 1: return "syncTxParameters-r14";
         case 2: return "syncTxThreshOoC-r14";
         case 3: return "filterCoefficient-r14";
         case 4: return "syncRefMinHyst-r14";
         case 5: return "syncRefDiffHyst-r14";
         case 6: return "slss-TxDisabled-r15";
         case 7: return null;
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

      // decode syncOffsetIndicators_r14

      buffer.getContext().eventDispatcher.startElement("syncOffsetIndicators_r14", -1);

      syncOffsetIndicators_r14 = new SL_V2X_SyncOffsetIndicators_r14();
      syncOffsetIndicators_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("syncOffsetIndicators_r14", -1);

      // decode syncTxParameters_r14

      buffer.getContext().eventDispatcher.startElement("syncTxParameters_r14", -1);

      syncTxParameters_r14 = new P0_SL_r12();
      syncTxParameters_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("syncTxParameters_r14", -1);

      // decode syncTxThreshOoC_r14

      buffer.getContext().eventDispatcher.startElement("syncTxThreshOoC_r14", -1);

      syncTxThreshOoC_r14 = new RSRP_RangeSL3_r12();
      syncTxThreshOoC_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("syncTxThreshOoC_r14", -1);

      // decode filterCoefficient_r14

      buffer.getContext().eventDispatcher.startElement("filterCoefficient_r14", -1);

      {
         int tval = FilterCoefficient.decodeEnumValue (buffer);
         filterCoefficient_r14 = FilterCoefficient.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("filterCoefficient_r14", -1);

      // decode syncRefMinHyst_r14

      buffer.getContext().eventDispatcher.startElement("syncRefMinHyst_r14", -1);

      {
         int tval = SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14.decodeEnumValue (buffer);
         syncRefMinHyst_r14 = SL_PreconfigV2X_Sync_r14_syncRefMinHyst_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("syncRefMinHyst_r14", -1);

      // decode syncRefDiffHyst_r14

      buffer.getContext().eventDispatcher.startElement("syncRefDiffHyst_r14", -1);

      {
         int tval = SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14.decodeEnumValue (buffer);
         syncRefDiffHyst_r14 = SL_PreconfigV2X_Sync_r14_syncRefDiffHyst_r14.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("syncRefDiffHyst_r14", -1);

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

            boolean slss_TxDisabled_r15Present = buffer.decodeBit ("slss_TxDisabled_r15Present");

            // decode slss_TxDisabled_r15

            if (slss_TxDisabled_r15Present) {
               buffer.getContext().eventDispatcher.startElement("slss_TxDisabled_r15", -1);

               int tval = SL_PreconfigV2X_Sync_r14_slss_TxDisabled_r15.decodeEnumValue (buffer);
               slss_TxDisabled_r15 = SL_PreconfigV2X_Sync_r14_slss_TxDisabled_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("slss_TxDisabled_r15", -1);
            }
            else {
               slss_TxDisabled_r15 = null;
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
      if (syncOffsetIndicators_r14 != null) syncOffsetIndicators_r14.print (_sb, "syncOffsetIndicators_r14", _level+1);
      if (syncTxParameters_r14 != null) syncTxParameters_r14.print (_sb, "syncTxParameters_r14", _level+1);
      if (syncTxThreshOoC_r14 != null) syncTxThreshOoC_r14.print (_sb, "syncTxThreshOoC_r14", _level+1);
      if (filterCoefficient_r14 != null) filterCoefficient_r14.print (_sb, "filterCoefficient_r14", _level+1);
      if (syncRefMinHyst_r14 != null) syncRefMinHyst_r14.print (_sb, "syncRefMinHyst_r14", _level+1);
      if (syncRefDiffHyst_r14 != null) syncRefDiffHyst_r14.print (_sb, "syncRefDiffHyst_r14", _level+1);
      if (slss_TxDisabled_r15 != null) slss_TxDisabled_r15.print (_sb, "slss_TxDisabled_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
