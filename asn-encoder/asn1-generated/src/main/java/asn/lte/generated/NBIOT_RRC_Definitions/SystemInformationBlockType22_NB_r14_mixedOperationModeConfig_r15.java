/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public DL_ConfigCommonList_NB_r14 dl_ConfigListMixed_r15;  // optional
   public UL_ConfigCommonList_NB_r14 ul_ConfigListMixed_r15;  // optional
   public SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_pagingDistribution_r15 pagingDistribution_r15 = null;  // optional
   public SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_nprach_Distribution_r15 nprach_Distribution_r15 = null;  // optional

   public SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15 (
      DL_ConfigCommonList_NB_r14 dl_ConfigListMixed_r15_,
      UL_ConfigCommonList_NB_r14 ul_ConfigListMixed_r15_,
      SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_pagingDistribution_r15 pagingDistribution_r15_,
      SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_nprach_Distribution_r15 nprach_Distribution_r15_
   ) {
      super();
      dl_ConfigListMixed_r15 = dl_ConfigListMixed_r15_;
      ul_ConfigListMixed_r15 = ul_ConfigListMixed_r15_;
      pagingDistribution_r15 = pagingDistribution_r15_;
      nprach_Distribution_r15 = nprach_Distribution_r15_;
   }

   public void init () {
      dl_ConfigListMixed_r15 = null;
      ul_ConfigListMixed_r15 = null;
      pagingDistribution_r15 = null;
      nprach_Distribution_r15 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dl_ConfigListMixed_r15;
         case 1: return ul_ConfigListMixed_r15;
         case 2: return pagingDistribution_r15;
         case 3: return nprach_Distribution_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dl-ConfigListMixed-r15";
         case 1: return "ul-ConfigListMixed-r15";
         case 2: return "pagingDistribution-r15";
         case 3: return "nprach-Distribution-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean dl_ConfigListMixed_r15Present = buffer.decodeBit ("dl_ConfigListMixed_r15Present");
      boolean ul_ConfigListMixed_r15Present = buffer.decodeBit ("ul_ConfigListMixed_r15Present");
      boolean pagingDistribution_r15Present = buffer.decodeBit ("pagingDistribution_r15Present");
      boolean nprach_Distribution_r15Present = buffer.decodeBit ("nprach_Distribution_r15Present");

      // decode dl_ConfigListMixed_r15

      if (dl_ConfigListMixed_r15Present) {
         buffer.getContext().eventDispatcher.startElement("dl_ConfigListMixed_r15", -1);

         dl_ConfigListMixed_r15 = new DL_ConfigCommonList_NB_r14();
         dl_ConfigListMixed_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("dl_ConfigListMixed_r15", -1);
      }
      else {
         dl_ConfigListMixed_r15 = null;
      }

      // decode ul_ConfigListMixed_r15

      if (ul_ConfigListMixed_r15Present) {
         buffer.getContext().eventDispatcher.startElement("ul_ConfigListMixed_r15", -1);

         ul_ConfigListMixed_r15 = new UL_ConfigCommonList_NB_r14();
         ul_ConfigListMixed_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_ConfigListMixed_r15", -1);
      }
      else {
         ul_ConfigListMixed_r15 = null;
      }

      // decode pagingDistribution_r15

      if (pagingDistribution_r15Present) {
         buffer.getContext().eventDispatcher.startElement("pagingDistribution_r15", -1);

         int tval = SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_pagingDistribution_r15.decodeEnumValue (buffer);
         pagingDistribution_r15 = SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_pagingDistribution_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pagingDistribution_r15", -1);
      }
      else {
         pagingDistribution_r15 = null;
      }

      // decode nprach_Distribution_r15

      if (nprach_Distribution_r15Present) {
         buffer.getContext().eventDispatcher.startElement("nprach_Distribution_r15", -1);

         int tval = SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_nprach_Distribution_r15.decodeEnumValue (buffer);
         nprach_Distribution_r15 = SystemInformationBlockType22_NB_r14_mixedOperationModeConfig_r15_nprach_Distribution_r15.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("nprach_Distribution_r15", -1);
      }
      else {
         nprach_Distribution_r15 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dl_ConfigListMixed_r15 != null) dl_ConfigListMixed_r15.print (_sb, "dl_ConfigListMixed_r15", _level+1);
      if (ul_ConfigListMixed_r15 != null) ul_ConfigListMixed_r15.print (_sb, "ul_ConfigListMixed_r15", _level+1);
      if (pagingDistribution_r15 != null) pagingDistribution_r15.print (_sb, "pagingDistribution_r15", _level+1);
      if (nprach_Distribution_r15 != null) nprach_Distribution_r15.print (_sb, "nprach_Distribution_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
