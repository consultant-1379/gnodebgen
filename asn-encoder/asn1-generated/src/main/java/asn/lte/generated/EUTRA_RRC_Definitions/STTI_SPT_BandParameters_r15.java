/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class STTI_SPT_BandParameters_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "STTI-SPT-BandParameters-r15";
   }

   public STTI_SPT_BandParameters_r15_dl_1024QAM_Slot_r15 dl_1024QAM_Slot_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_1_r15 dl_1024QAM_SubslotTA_1_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_2_r15 dl_1024QAM_SubslotTA_2_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15_simultaneousTx_differentTx_duration_r15 simultaneousTx_differentTx_duration_r15 = null;  // optional
   public CA_MIMO_ParametersDL_r15 sTTI_CA_MIMO_ParametersDL_r15;  // optional
   public CA_MIMO_ParametersUL_r15 sTTI_CA_MIMO_ParametersUL_r15;
   public STTI_SPT_BandParameters_r15_sTTI_FD_MIMO_Coexistence sTTI_FD_MIMO_Coexistence = null;  // optional
   public MIMO_CA_ParametersPerBoBC_r13 sTTI_MIMO_CA_ParametersPerBoBCs_r15;  // optional
   public MIMO_CA_ParametersPerBoBC_v1430 sTTI_MIMO_CA_ParametersPerBoBCs_v1530;  // optional
   public STTI_SupportedCombinations_r15 sTTI_SupportedCombinations_r15;  // optional
   public STTI_SPT_BandParameters_r15_sTTI_SupportedCSI_Proc_r15 sTTI_SupportedCSI_Proc_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15_ul_256QAM_Slot_r15 ul_256QAM_Slot_r15 = null;  // optional
   public STTI_SPT_BandParameters_r15_ul_256QAM_Subslot_r15 ul_256QAM_Subslot_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public STTI_SPT_BandParameters_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public STTI_SPT_BandParameters_r15 (
      STTI_SPT_BandParameters_r15_dl_1024QAM_Slot_r15 dl_1024QAM_Slot_r15_,
      STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_1_r15 dl_1024QAM_SubslotTA_1_r15_,
      STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_2_r15 dl_1024QAM_SubslotTA_2_r15_,
      STTI_SPT_BandParameters_r15_simultaneousTx_differentTx_duration_r15 simultaneousTx_differentTx_duration_r15_,
      CA_MIMO_ParametersDL_r15 sTTI_CA_MIMO_ParametersDL_r15_,
      CA_MIMO_ParametersUL_r15 sTTI_CA_MIMO_ParametersUL_r15_,
      STTI_SPT_BandParameters_r15_sTTI_FD_MIMO_Coexistence sTTI_FD_MIMO_Coexistence_,
      MIMO_CA_ParametersPerBoBC_r13 sTTI_MIMO_CA_ParametersPerBoBCs_r15_,
      MIMO_CA_ParametersPerBoBC_v1430 sTTI_MIMO_CA_ParametersPerBoBCs_v1530_,
      STTI_SupportedCombinations_r15 sTTI_SupportedCombinations_r15_,
      STTI_SPT_BandParameters_r15_sTTI_SupportedCSI_Proc_r15 sTTI_SupportedCSI_Proc_r15_,
      STTI_SPT_BandParameters_r15_ul_256QAM_Slot_r15 ul_256QAM_Slot_r15_,
      STTI_SPT_BandParameters_r15_ul_256QAM_Subslot_r15 ul_256QAM_Subslot_r15_
   ) {
      super();
      dl_1024QAM_Slot_r15 = dl_1024QAM_Slot_r15_;
      dl_1024QAM_SubslotTA_1_r15 = dl_1024QAM_SubslotTA_1_r15_;
      dl_1024QAM_SubslotTA_2_r15 = dl_1024QAM_SubslotTA_2_r15_;
      simultaneousTx_differentTx_duration_r15 = simultaneousTx_differentTx_duration_r15_;
      sTTI_CA_MIMO_ParametersDL_r15 = sTTI_CA_MIMO_ParametersDL_r15_;
      sTTI_CA_MIMO_ParametersUL_r15 = sTTI_CA_MIMO_ParametersUL_r15_;
      sTTI_FD_MIMO_Coexistence = sTTI_FD_MIMO_Coexistence_;
      sTTI_MIMO_CA_ParametersPerBoBCs_r15 = sTTI_MIMO_CA_ParametersPerBoBCs_r15_;
      sTTI_MIMO_CA_ParametersPerBoBCs_v1530 = sTTI_MIMO_CA_ParametersPerBoBCs_v1530_;
      sTTI_SupportedCombinations_r15 = sTTI_SupportedCombinations_r15_;
      sTTI_SupportedCSI_Proc_r15 = sTTI_SupportedCSI_Proc_r15_;
      ul_256QAM_Slot_r15 = ul_256QAM_Slot_r15_;
      ul_256QAM_Subslot_r15 = ul_256QAM_Subslot_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public STTI_SPT_BandParameters_r15 (
      CA_MIMO_ParametersUL_r15 sTTI_CA_MIMO_ParametersUL_r15_
   ) {
      super();
      sTTI_CA_MIMO_ParametersUL_r15 = sTTI_CA_MIMO_ParametersUL_r15_;
   }

   public void init () {
      dl_1024QAM_Slot_r15 = null;
      dl_1024QAM_SubslotTA_1_r15 = null;
      dl_1024QAM_SubslotTA_2_r15 = null;
      simultaneousTx_differentTx_duration_r15 = null;
      sTTI_CA_MIMO_ParametersDL_r15 = null;
      sTTI_CA_MIMO_ParametersUL_r15 = null;
      sTTI_FD_MIMO_Coexistence = null;
      sTTI_MIMO_CA_ParametersPerBoBCs_r15 = null;
      sTTI_MIMO_CA_ParametersPerBoBCs_v1530 = null;
      sTTI_SupportedCombinations_r15 = null;
      sTTI_SupportedCSI_Proc_r15 = null;
      ul_256QAM_Slot_r15 = null;
      ul_256QAM_Subslot_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 14; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_1024QAM_Slot_r15;
         case 1: return dl_1024QAM_SubslotTA_1_r15;
         case 2: return dl_1024QAM_SubslotTA_2_r15;
         case 3: return simultaneousTx_differentTx_duration_r15;
         case 4: return sTTI_CA_MIMO_ParametersDL_r15;
         case 5: return sTTI_CA_MIMO_ParametersUL_r15;
         case 6: return sTTI_FD_MIMO_Coexistence;
         case 7: return sTTI_MIMO_CA_ParametersPerBoBCs_r15;
         case 8: return sTTI_MIMO_CA_ParametersPerBoBCs_v1530;
         case 9: return sTTI_SupportedCombinations_r15;
         case 10: return sTTI_SupportedCSI_Proc_r15;
         case 11: return ul_256QAM_Slot_r15;
         case 12: return ul_256QAM_Subslot_r15;
         case 13: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-1024QAM-Slot-r15";
         case 1: return "dl-1024QAM-SubslotTA-1-r15";
         case 2: return "dl-1024QAM-SubslotTA-2-r15";
         case 3: return "simultaneousTx-differentTx-duration-r15";
         case 4: return "sTTI-CA-MIMO-ParametersDL-r15";
         case 5: return "sTTI-CA-MIMO-ParametersUL-r15";
         case 6: return "sTTI-FD-MIMO-Coexistence";
         case 7: return "sTTI-MIMO-CA-ParametersPerBoBCs-r15";
         case 8: return "sTTI-MIMO-CA-ParametersPerBoBCs-v1530";
         case 9: return "sTTI-SupportedCombinations-r15";
         case 10: return "sTTI-SupportedCSI-Proc-r15";
         case 11: return "ul-256QAM-Slot-r15";
         case 12: return "ul-256QAM-Subslot-r15";
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

      boolean dl_1024QAM_Slot_r15Present = buffer.decodeBit ("dl_1024QAM_Slot_r15Present");
      boolean dl_1024QAM_SubslotTA_1_r15Present = buffer.decodeBit ("dl_1024QAM_SubslotTA_1_r15Present");
      boolean dl_1024QAM_SubslotTA_2_r15Present = buffer.decodeBit ("dl_1024QAM_SubslotTA_2_r15Present");
      boolean simultaneousTx_differentTx_duration_r15Present = buffer.decodeBit ("simultaneousTx_differentTx_duration_r15Present");
      boolean sTTI_CA_MIMO_ParametersDL_r15Present = buffer.decodeBit ("sTTI_CA_MIMO_ParametersDL_r15Present");
      boolean sTTI_FD_MIMO_CoexistencePresent = buffer.decodeBit ("sTTI_FD_MIMO_CoexistencePresent");
      boolean sTTI_MIMO_CA_ParametersPerBoBCs_r15Present = buffer.decodeBit ("sTTI_MIMO_CA_ParametersPerBoBCs_r15Present");
      boolean sTTI_MIMO_CA_ParametersPerBoBCs_v1530Present = buffer.decodeBit ("sTTI_MIMO_CA_ParametersPerBoBCs_v1530Present");
      boolean sTTI_SupportedCombinations_r15Present = buffer.decodeBit ("sTTI_SupportedCombinations_r15Present");
      boolean sTTI_SupportedCSI_Proc_r15Present = buffer.decodeBit ("sTTI_SupportedCSI_Proc_r15Present");
      boolean ul_256QAM_Slot_r15Present = buffer.decodeBit ("ul_256QAM_Slot_r15Present");
      boolean ul_256QAM_Subslot_r15Present = buffer.decodeBit ("ul_256QAM_Subslot_r15Present");

      // decode dl_1024QAM_Slot_r15

      if (dl_1024QAM_Slot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_1024QAM_Slot_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_dl_1024QAM_Slot_r15.decodeEnumValue (buffer);
         dl_1024QAM_Slot_r15 = STTI_SPT_BandParameters_r15_dl_1024QAM_Slot_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_1024QAM_Slot_r15", -1);
      }
      else {
         dl_1024QAM_Slot_r15 = null;
      }

      // decode dl_1024QAM_SubslotTA_1_r15

      if (dl_1024QAM_SubslotTA_1_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_1024QAM_SubslotTA_1_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_1_r15.decodeEnumValue (buffer);
         dl_1024QAM_SubslotTA_1_r15 = STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_1_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_1024QAM_SubslotTA_1_r15", -1);
      }
      else {
         dl_1024QAM_SubslotTA_1_r15 = null;
      }

      // decode dl_1024QAM_SubslotTA_2_r15

      if (dl_1024QAM_SubslotTA_2_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_1024QAM_SubslotTA_2_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_2_r15.decodeEnumValue (buffer);
         dl_1024QAM_SubslotTA_2_r15 = STTI_SPT_BandParameters_r15_dl_1024QAM_SubslotTA_2_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_1024QAM_SubslotTA_2_r15", -1);
      }
      else {
         dl_1024QAM_SubslotTA_2_r15 = null;
      }

      // decode simultaneousTx_differentTx_duration_r15

      if (simultaneousTx_differentTx_duration_r15Present) {
         buffer.getContext().eventDispatcher.startElement("simultaneousTx_differentTx_duration_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_simultaneousTx_differentTx_duration_r15.decodeEnumValue (buffer);
         simultaneousTx_differentTx_duration_r15 = STTI_SPT_BandParameters_r15_simultaneousTx_differentTx_duration_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simultaneousTx_differentTx_duration_r15", -1);
      }
      else {
         simultaneousTx_differentTx_duration_r15 = null;
      }

      // decode sTTI_CA_MIMO_ParametersDL_r15

      if (sTTI_CA_MIMO_ParametersDL_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sTTI_CA_MIMO_ParametersDL_r15", -1);

         sTTI_CA_MIMO_ParametersDL_r15 = new CA_MIMO_ParametersDL_r15();
         sTTI_CA_MIMO_ParametersDL_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sTTI_CA_MIMO_ParametersDL_r15", -1);
      }
      else {
         sTTI_CA_MIMO_ParametersDL_r15 = null;
      }

      // decode sTTI_CA_MIMO_ParametersUL_r15

      buffer.getContext().eventDispatcher.startElement("sTTI_CA_MIMO_ParametersUL_r15", -1);

      sTTI_CA_MIMO_ParametersUL_r15 = new CA_MIMO_ParametersUL_r15();
      sTTI_CA_MIMO_ParametersUL_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sTTI_CA_MIMO_ParametersUL_r15", -1);

      // decode sTTI_FD_MIMO_Coexistence

      if (sTTI_FD_MIMO_CoexistencePresent) {
         buffer.getContext().eventDispatcher.startElement("sTTI_FD_MIMO_Coexistence", -1);

         int tval = STTI_SPT_BandParameters_r15_sTTI_FD_MIMO_Coexistence.decodeEnumValue (buffer);
         sTTI_FD_MIMO_Coexistence = STTI_SPT_BandParameters_r15_sTTI_FD_MIMO_Coexistence.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sTTI_FD_MIMO_Coexistence", -1);
      }
      else {
         sTTI_FD_MIMO_Coexistence = null;
      }

      // decode sTTI_MIMO_CA_ParametersPerBoBCs_r15

      if (sTTI_MIMO_CA_ParametersPerBoBCs_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sTTI_MIMO_CA_ParametersPerBoBCs_r15", -1);

         sTTI_MIMO_CA_ParametersPerBoBCs_r15 = new MIMO_CA_ParametersPerBoBC_r13();
         sTTI_MIMO_CA_ParametersPerBoBCs_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sTTI_MIMO_CA_ParametersPerBoBCs_r15", -1);
      }
      else {
         sTTI_MIMO_CA_ParametersPerBoBCs_r15 = null;
      }

      // decode sTTI_MIMO_CA_ParametersPerBoBCs_v1530

      if (sTTI_MIMO_CA_ParametersPerBoBCs_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("sTTI_MIMO_CA_ParametersPerBoBCs_v1530", -1);

         sTTI_MIMO_CA_ParametersPerBoBCs_v1530 = new MIMO_CA_ParametersPerBoBC_v1430();
         sTTI_MIMO_CA_ParametersPerBoBCs_v1530.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sTTI_MIMO_CA_ParametersPerBoBCs_v1530", -1);
      }
      else {
         sTTI_MIMO_CA_ParametersPerBoBCs_v1530 = null;
      }

      // decode sTTI_SupportedCombinations_r15

      if (sTTI_SupportedCombinations_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sTTI_SupportedCombinations_r15", -1);

         sTTI_SupportedCombinations_r15 = new STTI_SupportedCombinations_r15();
         sTTI_SupportedCombinations_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sTTI_SupportedCombinations_r15", -1);
      }
      else {
         sTTI_SupportedCombinations_r15 = null;
      }

      // decode sTTI_SupportedCSI_Proc_r15

      if (sTTI_SupportedCSI_Proc_r15Present) {
         buffer.getContext().eventDispatcher.startElement("sTTI_SupportedCSI_Proc_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_sTTI_SupportedCSI_Proc_r15.decodeEnumValue (buffer);
         sTTI_SupportedCSI_Proc_r15 = STTI_SPT_BandParameters_r15_sTTI_SupportedCSI_Proc_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sTTI_SupportedCSI_Proc_r15", -1);
      }
      else {
         sTTI_SupportedCSI_Proc_r15 = null;
      }

      // decode ul_256QAM_Slot_r15

      if (ul_256QAM_Slot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ul_256QAM_Slot_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_ul_256QAM_Slot_r15.decodeEnumValue (buffer);
         ul_256QAM_Slot_r15 = STTI_SPT_BandParameters_r15_ul_256QAM_Slot_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_256QAM_Slot_r15", -1);
      }
      else {
         ul_256QAM_Slot_r15 = null;
      }

      // decode ul_256QAM_Subslot_r15

      if (ul_256QAM_Subslot_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ul_256QAM_Subslot_r15", -1);

         int tval = STTI_SPT_BandParameters_r15_ul_256QAM_Subslot_r15.decodeEnumValue (buffer);
         ul_256QAM_Subslot_r15 = STTI_SPT_BandParameters_r15_ul_256QAM_Subslot_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ul_256QAM_Subslot_r15", -1);
      }
      else {
         ul_256QAM_Subslot_r15 = null;
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
      if (dl_1024QAM_Slot_r15 != null) dl_1024QAM_Slot_r15.print (_sb, "dl_1024QAM_Slot_r15", _level+1);
      if (dl_1024QAM_SubslotTA_1_r15 != null) dl_1024QAM_SubslotTA_1_r15.print (_sb, "dl_1024QAM_SubslotTA_1_r15", _level+1);
      if (dl_1024QAM_SubslotTA_2_r15 != null) dl_1024QAM_SubslotTA_2_r15.print (_sb, "dl_1024QAM_SubslotTA_2_r15", _level+1);
      if (simultaneousTx_differentTx_duration_r15 != null) simultaneousTx_differentTx_duration_r15.print (_sb, "simultaneousTx_differentTx_duration_r15", _level+1);
      if (sTTI_CA_MIMO_ParametersDL_r15 != null) sTTI_CA_MIMO_ParametersDL_r15.print (_sb, "sTTI_CA_MIMO_ParametersDL_r15", _level+1);
      if (sTTI_CA_MIMO_ParametersUL_r15 != null) sTTI_CA_MIMO_ParametersUL_r15.print (_sb, "sTTI_CA_MIMO_ParametersUL_r15", _level+1);
      if (sTTI_FD_MIMO_Coexistence != null) sTTI_FD_MIMO_Coexistence.print (_sb, "sTTI_FD_MIMO_Coexistence", _level+1);
      if (sTTI_MIMO_CA_ParametersPerBoBCs_r15 != null) sTTI_MIMO_CA_ParametersPerBoBCs_r15.print (_sb, "sTTI_MIMO_CA_ParametersPerBoBCs_r15", _level+1);
      if (sTTI_MIMO_CA_ParametersPerBoBCs_v1530 != null) sTTI_MIMO_CA_ParametersPerBoBCs_v1530.print (_sb, "sTTI_MIMO_CA_ParametersPerBoBCs_v1530", _level+1);
      if (sTTI_SupportedCombinations_r15 != null) sTTI_SupportedCombinations_r15.print (_sb, "sTTI_SupportedCombinations_r15", _level+1);
      if (sTTI_SupportedCSI_Proc_r15 != null) sTTI_SupportedCSI_Proc_r15.print (_sb, "sTTI_SupportedCSI_Proc_r15", _level+1);
      if (ul_256QAM_Slot_r15 != null) ul_256QAM_Slot_r15.print (_sb, "ul_256QAM_Slot_r15", _level+1);
      if (ul_256QAM_Subslot_r15 != null) ul_256QAM_Subslot_r15.print (_sb, "ul_256QAM_Subslot_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
