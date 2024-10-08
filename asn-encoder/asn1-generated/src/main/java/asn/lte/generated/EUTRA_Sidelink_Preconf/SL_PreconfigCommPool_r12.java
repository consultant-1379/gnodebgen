/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_Sidelink_Preconf;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_CP_Len_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_PeriodComm_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_TF_ResourceConfig_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.P0_SL_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_HoppingConfigComm_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_TRPT_Subset_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.SL_PriorityList_r13;

public class SL_PreconfigCommPool_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_Sidelink_PreconfRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PreconfigCommPool-r12";
   }

   public SL_CP_Len_r12 sc_CP_Len_r12 = null;
   public SL_PeriodComm_r12 sc_Period_r12 = null;
   public SL_TF_ResourceConfig_r12 sc_TF_ResourceConfig_r12;
   public P0_SL_r12 sc_TxParameters_r12;
   public SL_CP_Len_r12 data_CP_Len_r12 = null;
   public SL_TF_ResourceConfig_r12 data_TF_ResourceConfig_r12;
   public SL_HoppingConfigComm_r12 dataHoppingConfig_r12;
   public P0_SL_r12 dataTxParameters_r12;
   public SL_TRPT_Subset_r12 trpt_Subset_r12;
   public boolean mV2ExtPresent;
   public SL_PriorityList_r13 priorityList_r13;  // optional
   public Asn1OpenExt extElem1;

   public SL_PreconfigCommPool_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PreconfigCommPool_r12 (
      SL_CP_Len_r12 sc_CP_Len_r12_,
      SL_PeriodComm_r12 sc_Period_r12_,
      SL_TF_ResourceConfig_r12 sc_TF_ResourceConfig_r12_,
      P0_SL_r12 sc_TxParameters_r12_,
      SL_CP_Len_r12 data_CP_Len_r12_,
      SL_TF_ResourceConfig_r12 data_TF_ResourceConfig_r12_,
      SL_HoppingConfigComm_r12 dataHoppingConfig_r12_,
      P0_SL_r12 dataTxParameters_r12_,
      SL_TRPT_Subset_r12 trpt_Subset_r12_,
      SL_PriorityList_r13 priorityList_r13_
   ) {
      super();
      sc_CP_Len_r12 = sc_CP_Len_r12_;
      sc_Period_r12 = sc_Period_r12_;
      sc_TF_ResourceConfig_r12 = sc_TF_ResourceConfig_r12_;
      sc_TxParameters_r12 = sc_TxParameters_r12_;
      data_CP_Len_r12 = data_CP_Len_r12_;
      data_TF_ResourceConfig_r12 = data_TF_ResourceConfig_r12_;
      dataHoppingConfig_r12 = dataHoppingConfig_r12_;
      dataTxParameters_r12 = dataTxParameters_r12_;
      trpt_Subset_r12 = trpt_Subset_r12_;
      priorityList_r13 = priorityList_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_PreconfigCommPool_r12 (
      SL_CP_Len_r12 sc_CP_Len_r12_,
      SL_PeriodComm_r12 sc_Period_r12_,
      SL_TF_ResourceConfig_r12 sc_TF_ResourceConfig_r12_,
      P0_SL_r12 sc_TxParameters_r12_,
      SL_CP_Len_r12 data_CP_Len_r12_,
      SL_TF_ResourceConfig_r12 data_TF_ResourceConfig_r12_,
      SL_HoppingConfigComm_r12 dataHoppingConfig_r12_,
      P0_SL_r12 dataTxParameters_r12_,
      SL_TRPT_Subset_r12 trpt_Subset_r12_
   ) {
      super();
      sc_CP_Len_r12 = sc_CP_Len_r12_;
      sc_Period_r12 = sc_Period_r12_;
      sc_TF_ResourceConfig_r12 = sc_TF_ResourceConfig_r12_;
      sc_TxParameters_r12 = sc_TxParameters_r12_;
      data_CP_Len_r12 = data_CP_Len_r12_;
      data_TF_ResourceConfig_r12 = data_TF_ResourceConfig_r12_;
      dataHoppingConfig_r12 = dataHoppingConfig_r12_;
      dataTxParameters_r12 = dataTxParameters_r12_;
      trpt_Subset_r12 = trpt_Subset_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_PreconfigCommPool_r12 (SL_CP_Len_r12 sc_CP_Len_r12_,
      SL_PeriodComm_r12 sc_Period_r12_,
      SL_TF_ResourceConfig_r12 sc_TF_ResourceConfig_r12_,
      long sc_TxParameters_r12_,
      SL_CP_Len_r12 data_CP_Len_r12_,
      SL_TF_ResourceConfig_r12 data_TF_ResourceConfig_r12_,
      SL_HoppingConfigComm_r12 dataHoppingConfig_r12_,
      long dataTxParameters_r12_,
      SL_TRPT_Subset_r12 trpt_Subset_r12_,
      SL_PriorityList_r13 priorityList_r13_
   ) {
      super();
      sc_CP_Len_r12 = sc_CP_Len_r12_;
      sc_Period_r12 = sc_Period_r12_;
      sc_TF_ResourceConfig_r12 = sc_TF_ResourceConfig_r12_;
      sc_TxParameters_r12 = new P0_SL_r12 (sc_TxParameters_r12_);
      data_CP_Len_r12 = data_CP_Len_r12_;
      data_TF_ResourceConfig_r12 = data_TF_ResourceConfig_r12_;
      dataHoppingConfig_r12 = dataHoppingConfig_r12_;
      dataTxParameters_r12 = new P0_SL_r12 (dataTxParameters_r12_);
      trpt_Subset_r12 = trpt_Subset_r12_;
      priorityList_r13 = priorityList_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_PreconfigCommPool_r12 (
      SL_CP_Len_r12 sc_CP_Len_r12_,
      SL_PeriodComm_r12 sc_Period_r12_,
      SL_TF_ResourceConfig_r12 sc_TF_ResourceConfig_r12_,
      long sc_TxParameters_r12_,
      SL_CP_Len_r12 data_CP_Len_r12_,
      SL_TF_ResourceConfig_r12 data_TF_ResourceConfig_r12_,
      SL_HoppingConfigComm_r12 dataHoppingConfig_r12_,
      long dataTxParameters_r12_,
      SL_TRPT_Subset_r12 trpt_Subset_r12_
   ) {
      super();
      sc_CP_Len_r12 = sc_CP_Len_r12_;
      sc_Period_r12 = sc_Period_r12_;
      sc_TF_ResourceConfig_r12 = sc_TF_ResourceConfig_r12_;
      sc_TxParameters_r12 = new P0_SL_r12 (sc_TxParameters_r12_);
      data_CP_Len_r12 = data_CP_Len_r12_;
      data_TF_ResourceConfig_r12 = data_TF_ResourceConfig_r12_;
      dataHoppingConfig_r12 = dataHoppingConfig_r12_;
      dataTxParameters_r12 = new P0_SL_r12 (dataTxParameters_r12_);
      trpt_Subset_r12 = trpt_Subset_r12_;
   }

   public void init () {
      sc_CP_Len_r12 = null;
      sc_Period_r12 = null;
      sc_TF_ResourceConfig_r12 = null;
      sc_TxParameters_r12 = null;
      data_CP_Len_r12 = null;
      data_TF_ResourceConfig_r12 = null;
      dataHoppingConfig_r12 = null;
      dataTxParameters_r12 = null;
      trpt_Subset_r12 = null;
      priorityList_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sc_CP_Len_r12;
         case 1: return sc_Period_r12;
         case 2: return sc_TF_ResourceConfig_r12;
         case 3: return sc_TxParameters_r12;
         case 4: return data_CP_Len_r12;
         case 5: return data_TF_ResourceConfig_r12;
         case 6: return dataHoppingConfig_r12;
         case 7: return dataTxParameters_r12;
         case 8: return trpt_Subset_r12;
         case 9: return priorityList_r13;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sc-CP-Len-r12";
         case 1: return "sc-Period-r12";
         case 2: return "sc-TF-ResourceConfig-r12";
         case 3: return "sc-TxParameters-r12";
         case 4: return "data-CP-Len-r12";
         case 5: return "data-TF-ResourceConfig-r12";
         case 6: return "dataHoppingConfig-r12";
         case 7: return "dataTxParameters-r12";
         case 8: return "trpt-Subset-r12";
         case 9: return "priorityList-r13";
         case 10: return null;
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

      // decode sc_CP_Len_r12

      buffer.getContext().eventDispatcher.startElement("sc_CP_Len_r12", -1);

      {
         int tval = SL_CP_Len_r12.decodeEnumValue (buffer);
         sc_CP_Len_r12 = SL_CP_Len_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sc_CP_Len_r12", -1);

      // decode sc_Period_r12

      buffer.getContext().eventDispatcher.startElement("sc_Period_r12", -1);

      {
         int tval = SL_PeriodComm_r12.decodeEnumValue (buffer);
         sc_Period_r12 = SL_PeriodComm_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sc_Period_r12", -1);

      // decode sc_TF_ResourceConfig_r12

      buffer.getContext().eventDispatcher.startElement("sc_TF_ResourceConfig_r12", -1);

      sc_TF_ResourceConfig_r12 = new SL_TF_ResourceConfig_r12();
      sc_TF_ResourceConfig_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sc_TF_ResourceConfig_r12", -1);

      // decode sc_TxParameters_r12

      buffer.getContext().eventDispatcher.startElement("sc_TxParameters_r12", -1);

      sc_TxParameters_r12 = new P0_SL_r12();
      sc_TxParameters_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sc_TxParameters_r12", -1);

      // decode data_CP_Len_r12

      buffer.getContext().eventDispatcher.startElement("data_CP_Len_r12", -1);

      {
         int tval = SL_CP_Len_r12.decodeEnumValue (buffer);
         data_CP_Len_r12 = SL_CP_Len_r12.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("data_CP_Len_r12", -1);

      // decode data_TF_ResourceConfig_r12

      buffer.getContext().eventDispatcher.startElement("data_TF_ResourceConfig_r12", -1);

      data_TF_ResourceConfig_r12 = new SL_TF_ResourceConfig_r12();
      data_TF_ResourceConfig_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("data_TF_ResourceConfig_r12", -1);

      // decode dataHoppingConfig_r12

      buffer.getContext().eventDispatcher.startElement("dataHoppingConfig_r12", -1);

      dataHoppingConfig_r12 = new SL_HoppingConfigComm_r12();
      dataHoppingConfig_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dataHoppingConfig_r12", -1);

      // decode dataTxParameters_r12

      buffer.getContext().eventDispatcher.startElement("dataTxParameters_r12", -1);

      dataTxParameters_r12 = new P0_SL_r12();
      dataTxParameters_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dataTxParameters_r12", -1);

      // decode trpt_Subset_r12

      buffer.getContext().eventDispatcher.startElement("trpt_Subset_r12", -1);

      trpt_Subset_r12 = new SL_TRPT_Subset_r12();
      trpt_Subset_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trpt_Subset_r12", -1);

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

            boolean priorityList_r13Present = buffer.decodeBit ("priorityList_r13Present");

            // decode priorityList_r13

            if (priorityList_r13Present) {
               buffer.getContext().eventDispatcher.startElement("priorityList_r13", -1);

               priorityList_r13 = new SL_PriorityList_r13();
               priorityList_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("priorityList_r13", -1);
            }
            else {
               priorityList_r13 = null;
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
      if (sc_CP_Len_r12 != null) sc_CP_Len_r12.print (_sb, "sc_CP_Len_r12", _level+1);
      if (sc_Period_r12 != null) sc_Period_r12.print (_sb, "sc_Period_r12", _level+1);
      if (sc_TF_ResourceConfig_r12 != null) sc_TF_ResourceConfig_r12.print (_sb, "sc_TF_ResourceConfig_r12", _level+1);
      if (sc_TxParameters_r12 != null) sc_TxParameters_r12.print (_sb, "sc_TxParameters_r12", _level+1);
      if (data_CP_Len_r12 != null) data_CP_Len_r12.print (_sb, "data_CP_Len_r12", _level+1);
      if (data_TF_ResourceConfig_r12 != null) data_TF_ResourceConfig_r12.print (_sb, "data_TF_ResourceConfig_r12", _level+1);
      if (dataHoppingConfig_r12 != null) dataHoppingConfig_r12.print (_sb, "dataHoppingConfig_r12", _level+1);
      if (dataTxParameters_r12 != null) dataTxParameters_r12.print (_sb, "dataTxParameters_r12", _level+1);
      if (trpt_Subset_r12 != null) trpt_Subset_r12.print (_sb, "trpt_Subset_r12", _level+1);
      if (priorityList_r13 != null) priorityList_r13.print (_sb, "priorityList_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
