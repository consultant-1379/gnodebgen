/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_FreqConfigCommon_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-FreqConfigCommon-r16";
   }

   public SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16 sl_SCS_SpecificCarrierList_r16;
   public ARFCN_ValueNR sl_AbsoluteFrequencyPointA_r16;
   public ARFCN_ValueNR sl_AbsoluteFrequencySSB_r16;  // optional
   public SL_FreqConfigCommon_r16_frequencyShift7p5khzSL_r16 frequencyShift7p5khzSL_r16 = null;  // optional
   public Asn1Integer valueN_r16;
   public SL_FreqConfigCommon_r16_sl_BWP_List_r16 sl_BWP_List_r16;  // optional
   public SL_FreqConfigCommon_r16_sl_SyncPriority_r16 sl_SyncPriority_r16 = null;  // optional
   public Asn1Boolean sl_NbAsSync_r16;  // optional
   public SL_SyncConfigList_r16 sl_SyncConfigList_r16;  // optional
   public Asn1OpenExt extElem1;

   public SL_FreqConfigCommon_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_FreqConfigCommon_r16 (
      SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16 sl_SCS_SpecificCarrierList_r16_,
      ARFCN_ValueNR sl_AbsoluteFrequencyPointA_r16_,
      ARFCN_ValueNR sl_AbsoluteFrequencySSB_r16_,
      SL_FreqConfigCommon_r16_frequencyShift7p5khzSL_r16 frequencyShift7p5khzSL_r16_,
      Asn1Integer valueN_r16_,
      SL_FreqConfigCommon_r16_sl_BWP_List_r16 sl_BWP_List_r16_,
      SL_FreqConfigCommon_r16_sl_SyncPriority_r16 sl_SyncPriority_r16_,
      Asn1Boolean sl_NbAsSync_r16_,
      SL_SyncConfigList_r16 sl_SyncConfigList_r16_
   ) {
      super();
      sl_SCS_SpecificCarrierList_r16 = sl_SCS_SpecificCarrierList_r16_;
      sl_AbsoluteFrequencyPointA_r16 = sl_AbsoluteFrequencyPointA_r16_;
      sl_AbsoluteFrequencySSB_r16 = sl_AbsoluteFrequencySSB_r16_;
      frequencyShift7p5khzSL_r16 = frequencyShift7p5khzSL_r16_;
      valueN_r16 = valueN_r16_;
      sl_BWP_List_r16 = sl_BWP_List_r16_;
      sl_SyncPriority_r16 = sl_SyncPriority_r16_;
      sl_NbAsSync_r16 = sl_NbAsSync_r16_;
      sl_SyncConfigList_r16 = sl_SyncConfigList_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_FreqConfigCommon_r16 (
      SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16 sl_SCS_SpecificCarrierList_r16_,
      ARFCN_ValueNR sl_AbsoluteFrequencyPointA_r16_,
      Asn1Integer valueN_r16_
   ) {
      super();
      sl_SCS_SpecificCarrierList_r16 = sl_SCS_SpecificCarrierList_r16_;
      sl_AbsoluteFrequencyPointA_r16 = sl_AbsoluteFrequencyPointA_r16_;
      valueN_r16 = valueN_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_FreqConfigCommon_r16 (SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16 sl_SCS_SpecificCarrierList_r16_,
      long sl_AbsoluteFrequencyPointA_r16_,
      long sl_AbsoluteFrequencySSB_r16_,
      SL_FreqConfigCommon_r16_frequencyShift7p5khzSL_r16 frequencyShift7p5khzSL_r16_,
      long valueN_r16_,
      SL_FreqConfigCommon_r16_sl_BWP_List_r16 sl_BWP_List_r16_,
      SL_FreqConfigCommon_r16_sl_SyncPriority_r16 sl_SyncPriority_r16_,
      boolean sl_NbAsSync_r16_,
      SL_SyncConfigList_r16 sl_SyncConfigList_r16_
   ) {
      super();
      sl_SCS_SpecificCarrierList_r16 = sl_SCS_SpecificCarrierList_r16_;
      sl_AbsoluteFrequencyPointA_r16 = new ARFCN_ValueNR (sl_AbsoluteFrequencyPointA_r16_);
      sl_AbsoluteFrequencySSB_r16 = new ARFCN_ValueNR (sl_AbsoluteFrequencySSB_r16_);
      frequencyShift7p5khzSL_r16 = frequencyShift7p5khzSL_r16_;
      valueN_r16 = new Asn1Integer (valueN_r16_);
      sl_BWP_List_r16 = sl_BWP_List_r16_;
      sl_SyncPriority_r16 = sl_SyncPriority_r16_;
      sl_NbAsSync_r16 = new Asn1Boolean (sl_NbAsSync_r16_);
      sl_SyncConfigList_r16 = sl_SyncConfigList_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_FreqConfigCommon_r16 (
      SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16 sl_SCS_SpecificCarrierList_r16_,
      long sl_AbsoluteFrequencyPointA_r16_,
      long valueN_r16_
   ) {
      super();
      sl_SCS_SpecificCarrierList_r16 = sl_SCS_SpecificCarrierList_r16_;
      sl_AbsoluteFrequencyPointA_r16 = new ARFCN_ValueNR (sl_AbsoluteFrequencyPointA_r16_);
      valueN_r16 = new Asn1Integer (valueN_r16_);
   }

   public void init () {
      sl_SCS_SpecificCarrierList_r16 = null;
      sl_AbsoluteFrequencyPointA_r16 = null;
      sl_AbsoluteFrequencySSB_r16 = null;
      frequencyShift7p5khzSL_r16 = null;
      valueN_r16 = null;
      sl_BWP_List_r16 = null;
      sl_SyncPriority_r16 = null;
      sl_NbAsSync_r16 = null;
      sl_SyncConfigList_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_SCS_SpecificCarrierList_r16;
         case 1: return sl_AbsoluteFrequencyPointA_r16;
         case 2: return sl_AbsoluteFrequencySSB_r16;
         case 3: return frequencyShift7p5khzSL_r16;
         case 4: return valueN_r16;
         case 5: return sl_BWP_List_r16;
         case 6: return sl_SyncPriority_r16;
         case 7: return sl_NbAsSync_r16;
         case 8: return sl_SyncConfigList_r16;
         case 9: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-SCS-SpecificCarrierList-r16";
         case 1: return "sl-AbsoluteFrequencyPointA-r16";
         case 2: return "sl-AbsoluteFrequencySSB-r16";
         case 3: return "frequencyShift7p5khzSL-r16";
         case 4: return "valueN-r16";
         case 5: return "sl-BWP-List-r16";
         case 6: return "sl-SyncPriority-r16";
         case 7: return "sl-NbAsSync-r16";
         case 8: return "sl-SyncConfigList-r16";
         case 9: return null;
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

      boolean sl_AbsoluteFrequencySSB_r16Present = buffer.decodeBit ("sl_AbsoluteFrequencySSB_r16Present");
      boolean frequencyShift7p5khzSL_r16Present = buffer.decodeBit ("frequencyShift7p5khzSL_r16Present");
      boolean sl_BWP_List_r16Present = buffer.decodeBit ("sl_BWP_List_r16Present");
      boolean sl_SyncPriority_r16Present = buffer.decodeBit ("sl_SyncPriority_r16Present");
      boolean sl_NbAsSync_r16Present = buffer.decodeBit ("sl_NbAsSync_r16Present");
      boolean sl_SyncConfigList_r16Present = buffer.decodeBit ("sl_SyncConfigList_r16Present");

      // decode sl_SCS_SpecificCarrierList_r16

      buffer.getContext().eventDispatcher.startElement("sl_SCS_SpecificCarrierList_r16", -1);

      sl_SCS_SpecificCarrierList_r16 = new SL_FreqConfigCommon_r16_sl_SCS_SpecificCarrierList_r16();
      sl_SCS_SpecificCarrierList_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_SCS_SpecificCarrierList_r16", -1);

      // decode sl_AbsoluteFrequencyPointA_r16

      buffer.getContext().eventDispatcher.startElement("sl_AbsoluteFrequencyPointA_r16", -1);

      sl_AbsoluteFrequencyPointA_r16 = new ARFCN_ValueNR();
      sl_AbsoluteFrequencyPointA_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_AbsoluteFrequencyPointA_r16", -1);

      // decode sl_AbsoluteFrequencySSB_r16

      if (sl_AbsoluteFrequencySSB_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_AbsoluteFrequencySSB_r16", -1);

         sl_AbsoluteFrequencySSB_r16 = new ARFCN_ValueNR();
         sl_AbsoluteFrequencySSB_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_AbsoluteFrequencySSB_r16", -1);
      }
      else {
         sl_AbsoluteFrequencySSB_r16 = null;
      }

      // decode frequencyShift7p5khzSL_r16

      if (frequencyShift7p5khzSL_r16Present) {
         buffer.getContext().eventDispatcher.startElement("frequencyShift7p5khzSL_r16", -1);

         int tval = SL_FreqConfigCommon_r16_frequencyShift7p5khzSL_r16.decodeEnumValue (buffer);
         frequencyShift7p5khzSL_r16 = SL_FreqConfigCommon_r16_frequencyShift7p5khzSL_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("frequencyShift7p5khzSL_r16", -1);
      }
      else {
         frequencyShift7p5khzSL_r16 = null;
      }

      // decode valueN_r16

      buffer.getContext().eventDispatcher.startElement("valueN_r16", -1);

      valueN_r16 = new Asn1Integer();
      valueN_r16.decode (buffer, -1, 1);

      buffer.invokeCharacters(valueN_r16.toString());
      buffer.getContext().eventDispatcher.endElement("valueN_r16", -1);

      // decode sl_BWP_List_r16

      if (sl_BWP_List_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_BWP_List_r16", -1);

         sl_BWP_List_r16 = new SL_FreqConfigCommon_r16_sl_BWP_List_r16();
         sl_BWP_List_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_BWP_List_r16", -1);
      }
      else {
         sl_BWP_List_r16 = null;
      }

      // decode sl_SyncPriority_r16

      if (sl_SyncPriority_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_SyncPriority_r16", -1);

         int tval = SL_FreqConfigCommon_r16_sl_SyncPriority_r16.decodeEnumValue (buffer);
         sl_SyncPriority_r16 = SL_FreqConfigCommon_r16_sl_SyncPriority_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_SyncPriority_r16", -1);
      }
      else {
         sl_SyncPriority_r16 = null;
      }

      // decode sl_NbAsSync_r16

      if (sl_NbAsSync_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_NbAsSync_r16", -1);

         sl_NbAsSync_r16 = new Asn1Boolean();
         sl_NbAsSync_r16.decode (buffer);

         buffer.invokeCharacters(sl_NbAsSync_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_NbAsSync_r16", -1);
      }
      else {
         sl_NbAsSync_r16 = null;
      }

      // decode sl_SyncConfigList_r16

      if (sl_SyncConfigList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_SyncConfigList_r16", -1);

         sl_SyncConfigList_r16 = new SL_SyncConfigList_r16();
         sl_SyncConfigList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_SyncConfigList_r16", -1);
      }
      else {
         sl_SyncConfigList_r16 = null;
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
      if (sl_SCS_SpecificCarrierList_r16 != null) sl_SCS_SpecificCarrierList_r16.print (_sb, "sl_SCS_SpecificCarrierList_r16", _level+1);
      if (sl_AbsoluteFrequencyPointA_r16 != null) sl_AbsoluteFrequencyPointA_r16.print (_sb, "sl_AbsoluteFrequencyPointA_r16", _level+1);
      if (sl_AbsoluteFrequencySSB_r16 != null) sl_AbsoluteFrequencySSB_r16.print (_sb, "sl_AbsoluteFrequencySSB_r16", _level+1);
      if (frequencyShift7p5khzSL_r16 != null) frequencyShift7p5khzSL_r16.print (_sb, "frequencyShift7p5khzSL_r16", _level+1);
      if (valueN_r16 != null) valueN_r16.print (_sb, "valueN_r16", _level+1);
      if (sl_BWP_List_r16 != null) sl_BWP_List_r16.print (_sb, "sl_BWP_List_r16", _level+1);
      if (sl_SyncPriority_r16 != null) sl_SyncPriority_r16.print (_sb, "sl_SyncPriority_r16", _level+1);
      if (sl_NbAsSync_r16 != null) sl_NbAsSync_r16.print (_sb, "sl_NbAsSync_r16", _level+1);
      if (sl_SyncConfigList_r16 != null) sl_SyncConfigList_r16.print (_sb, "sl_SyncConfigList_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
