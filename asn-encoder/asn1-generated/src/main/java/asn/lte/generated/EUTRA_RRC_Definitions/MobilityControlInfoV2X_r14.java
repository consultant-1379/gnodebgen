/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MobilityControlInfoV2X_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MobilityControlInfoV2X-r14";
   }

   public SL_CommResourcePoolV2X_r14 v2x_CommTxPoolExceptional_r14;  // optional
   public SL_CommRxPoolListV2X_r14 v2x_CommRxPool_r14;  // optional
   public SL_SyncConfigListV2X_r14 v2x_CommSyncConfig_r14;  // optional
   public SL_CBR_CommonTxConfigList_r14 cbr_MobilityTxConfigList_r14;  // optional

   public MobilityControlInfoV2X_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MobilityControlInfoV2X_r14 (
      SL_CommResourcePoolV2X_r14 v2x_CommTxPoolExceptional_r14_,
      SL_CommRxPoolListV2X_r14 v2x_CommRxPool_r14_,
      SL_SyncConfigListV2X_r14 v2x_CommSyncConfig_r14_,
      SL_CBR_CommonTxConfigList_r14 cbr_MobilityTxConfigList_r14_
   ) {
      super();
      v2x_CommTxPoolExceptional_r14 = v2x_CommTxPoolExceptional_r14_;
      v2x_CommRxPool_r14 = v2x_CommRxPool_r14_;
      v2x_CommSyncConfig_r14 = v2x_CommSyncConfig_r14_;
      cbr_MobilityTxConfigList_r14 = cbr_MobilityTxConfigList_r14_;
   }

   public void init () {
      v2x_CommTxPoolExceptional_r14 = null;
      v2x_CommRxPool_r14 = null;
      v2x_CommSyncConfig_r14 = null;
      cbr_MobilityTxConfigList_r14 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return v2x_CommTxPoolExceptional_r14;
         case 1: return v2x_CommRxPool_r14;
         case 2: return v2x_CommSyncConfig_r14;
         case 3: return cbr_MobilityTxConfigList_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "v2x-CommTxPoolExceptional-r14";
         case 1: return "v2x-CommRxPool-r14";
         case 2: return "v2x-CommSyncConfig-r14";
         case 3: return "cbr-MobilityTxConfigList-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean v2x_CommTxPoolExceptional_r14Present = buffer.decodeBit ("v2x_CommTxPoolExceptional_r14Present");
      boolean v2x_CommRxPool_r14Present = buffer.decodeBit ("v2x_CommRxPool_r14Present");
      boolean v2x_CommSyncConfig_r14Present = buffer.decodeBit ("v2x_CommSyncConfig_r14Present");
      boolean cbr_MobilityTxConfigList_r14Present = buffer.decodeBit ("cbr_MobilityTxConfigList_r14Present");

      // decode v2x_CommTxPoolExceptional_r14

      if (v2x_CommTxPoolExceptional_r14Present) {
         buffer.getContext().eventDispatcher.startElement("v2x_CommTxPoolExceptional_r14", -1);

         v2x_CommTxPoolExceptional_r14 = new SL_CommResourcePoolV2X_r14();
         v2x_CommTxPoolExceptional_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("v2x_CommTxPoolExceptional_r14", -1);
      }
      else {
         v2x_CommTxPoolExceptional_r14 = null;
      }

      // decode v2x_CommRxPool_r14

      if (v2x_CommRxPool_r14Present) {
         buffer.getContext().eventDispatcher.startElement("v2x_CommRxPool_r14", -1);

         v2x_CommRxPool_r14 = new SL_CommRxPoolListV2X_r14();
         v2x_CommRxPool_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("v2x_CommRxPool_r14", -1);
      }
      else {
         v2x_CommRxPool_r14 = null;
      }

      // decode v2x_CommSyncConfig_r14

      if (v2x_CommSyncConfig_r14Present) {
         buffer.getContext().eventDispatcher.startElement("v2x_CommSyncConfig_r14", -1);

         v2x_CommSyncConfig_r14 = new SL_SyncConfigListV2X_r14();
         v2x_CommSyncConfig_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("v2x_CommSyncConfig_r14", -1);
      }
      else {
         v2x_CommSyncConfig_r14 = null;
      }

      // decode cbr_MobilityTxConfigList_r14

      if (cbr_MobilityTxConfigList_r14Present) {
         buffer.getContext().eventDispatcher.startElement("cbr_MobilityTxConfigList_r14", -1);

         cbr_MobilityTxConfigList_r14 = new SL_CBR_CommonTxConfigList_r14();
         cbr_MobilityTxConfigList_r14.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cbr_MobilityTxConfigList_r14", -1);
      }
      else {
         cbr_MobilityTxConfigList_r14 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (v2x_CommTxPoolExceptional_r14 != null) v2x_CommTxPoolExceptional_r14.print (_sb, "v2x_CommTxPoolExceptional_r14", _level+1);
      if (v2x_CommRxPool_r14 != null) v2x_CommRxPool_r14.print (_sb, "v2x_CommRxPool_r14", _level+1);
      if (v2x_CommSyncConfig_r14 != null) v2x_CommSyncConfig_r14.print (_sb, "v2x_CommSyncConfig_r14", _level+1);
      if (cbr_MobilityTxConfigList_r14 != null) cbr_MobilityTxConfigList_r14.print (_sb, "cbr_MobilityTxConfigList_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
