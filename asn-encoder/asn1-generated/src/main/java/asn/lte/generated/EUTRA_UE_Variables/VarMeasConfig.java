/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasIdToAddModList;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasIdToAddModListExt_r12;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasIdToAddModList_v1310;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasIdToAddModListExt_v1310;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasObjectToAddModList;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasObjectToAddModListExt_r13;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasObjectToAddModList_v9e0;
import asn.lte.generated.EUTRA_RRC_Definitions.ReportConfigToAddModList;
import asn.lte.generated.EUTRA_RRC_Definitions.QuantityConfig;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasScaleFactor_r12;

public class VarMeasConfig extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarMeasConfig";
   }

   public MeasIdToAddModList measIdList;  // optional
   public MeasIdToAddModListExt_r12 measIdListExt_r12;  // optional
   public MeasIdToAddModList_v1310 measIdList_v1310;  // optional
   public MeasIdToAddModListExt_v1310 measIdListExt_v1310;  // optional
   public MeasObjectToAddModList measObjectList;  // optional
   public MeasObjectToAddModListExt_r13 measObjectListExt_r13;  // optional
   public MeasObjectToAddModList_v9e0 measObjectList_v9i0;  // optional
   public ReportConfigToAddModList reportConfigList;  // optional
   public QuantityConfig quantityConfig;  // optional
   public MeasScaleFactor_r12 measScaleFactor_r12 = null;  // optional
   public Asn1Integer s_Measure;  // optional
   public VarMeasConfig_speedStatePars speedStatePars;  // optional
   public Asn1Boolean allowInterruptions_r11;  // optional

   public VarMeasConfig () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarMeasConfig (
      MeasIdToAddModList measIdList_,
      MeasIdToAddModListExt_r12 measIdListExt_r12_,
      MeasIdToAddModList_v1310 measIdList_v1310_,
      MeasIdToAddModListExt_v1310 measIdListExt_v1310_,
      MeasObjectToAddModList measObjectList_,
      MeasObjectToAddModListExt_r13 measObjectListExt_r13_,
      MeasObjectToAddModList_v9e0 measObjectList_v9i0_,
      ReportConfigToAddModList reportConfigList_,
      QuantityConfig quantityConfig_,
      MeasScaleFactor_r12 measScaleFactor_r12_,
      Asn1Integer s_Measure_,
      VarMeasConfig_speedStatePars speedStatePars_,
      Asn1Boolean allowInterruptions_r11_
   ) {
      super();
      measIdList = measIdList_;
      measIdListExt_r12 = measIdListExt_r12_;
      measIdList_v1310 = measIdList_v1310_;
      measIdListExt_v1310 = measIdListExt_v1310_;
      measObjectList = measObjectList_;
      measObjectListExt_r13 = measObjectListExt_r13_;
      measObjectList_v9i0 = measObjectList_v9i0_;
      reportConfigList = reportConfigList_;
      quantityConfig = quantityConfig_;
      measScaleFactor_r12 = measScaleFactor_r12_;
      s_Measure = s_Measure_;
      speedStatePars = speedStatePars_;
      allowInterruptions_r11 = allowInterruptions_r11_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public VarMeasConfig (MeasIdToAddModList measIdList_,
      MeasIdToAddModListExt_r12 measIdListExt_r12_,
      MeasIdToAddModList_v1310 measIdList_v1310_,
      MeasIdToAddModListExt_v1310 measIdListExt_v1310_,
      MeasObjectToAddModList measObjectList_,
      MeasObjectToAddModListExt_r13 measObjectListExt_r13_,
      MeasObjectToAddModList_v9e0 measObjectList_v9i0_,
      ReportConfigToAddModList reportConfigList_,
      QuantityConfig quantityConfig_,
      MeasScaleFactor_r12 measScaleFactor_r12_,
      long s_Measure_,
      VarMeasConfig_speedStatePars speedStatePars_,
      boolean allowInterruptions_r11_
   ) {
      super();
      measIdList = measIdList_;
      measIdListExt_r12 = measIdListExt_r12_;
      measIdList_v1310 = measIdList_v1310_;
      measIdListExt_v1310 = measIdListExt_v1310_;
      measObjectList = measObjectList_;
      measObjectListExt_r13 = measObjectListExt_r13_;
      measObjectList_v9i0 = measObjectList_v9i0_;
      reportConfigList = reportConfigList_;
      quantityConfig = quantityConfig_;
      measScaleFactor_r12 = measScaleFactor_r12_;
      s_Measure = new Asn1Integer (s_Measure_);
      speedStatePars = speedStatePars_;
      allowInterruptions_r11 = new Asn1Boolean (allowInterruptions_r11_);
   }

   public void init () {
      measIdList = null;
      measIdListExt_r12 = null;
      measIdList_v1310 = null;
      measIdListExt_v1310 = null;
      measObjectList = null;
      measObjectListExt_r13 = null;
      measObjectList_v9i0 = null;
      reportConfigList = null;
      quantityConfig = null;
      measScaleFactor_r12 = null;
      s_Measure = null;
      speedStatePars = null;
      allowInterruptions_r11 = null;
   }

   public int getElementCount() { return 13; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measIdList;
         case 1: return measIdListExt_r12;
         case 2: return measIdList_v1310;
         case 3: return measIdListExt_v1310;
         case 4: return measObjectList;
         case 5: return measObjectListExt_r13;
         case 6: return measObjectList_v9i0;
         case 7: return reportConfigList;
         case 8: return quantityConfig;
         case 9: return measScaleFactor_r12;
         case 10: return s_Measure;
         case 11: return speedStatePars;
         case 12: return allowInterruptions_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measIdList";
         case 1: return "measIdListExt-r12";
         case 2: return "measIdList-v1310";
         case 3: return "measIdListExt-v1310";
         case 4: return "measObjectList";
         case 5: return "measObjectListExt-r13";
         case 6: return "measObjectList-v9i0";
         case 7: return "reportConfigList";
         case 8: return "quantityConfig";
         case 9: return "measScaleFactor-r12";
         case 10: return "s-Measure";
         case 11: return "speedStatePars";
         case 12: return "allowInterruptions-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measIdListPresent = buffer.decodeBit ("measIdListPresent");
      boolean measIdListExt_r12Present = buffer.decodeBit ("measIdListExt_r12Present");
      boolean measIdList_v1310Present = buffer.decodeBit ("measIdList_v1310Present");
      boolean measIdListExt_v1310Present = buffer.decodeBit ("measIdListExt_v1310Present");
      boolean measObjectListPresent = buffer.decodeBit ("measObjectListPresent");
      boolean measObjectListExt_r13Present = buffer.decodeBit ("measObjectListExt_r13Present");
      boolean measObjectList_v9i0Present = buffer.decodeBit ("measObjectList_v9i0Present");
      boolean reportConfigListPresent = buffer.decodeBit ("reportConfigListPresent");
      boolean quantityConfigPresent = buffer.decodeBit ("quantityConfigPresent");
      boolean measScaleFactor_r12Present = buffer.decodeBit ("measScaleFactor_r12Present");
      boolean s_MeasurePresent = buffer.decodeBit ("s_MeasurePresent");
      boolean speedStateParsPresent = buffer.decodeBit ("speedStateParsPresent");
      boolean allowInterruptions_r11Present = buffer.decodeBit ("allowInterruptions_r11Present");

      // decode measIdList

      if (measIdListPresent) {
         buffer.getContext().eventDispatcher.startElement("measIdList", -1);

         measIdList = new MeasIdToAddModList();
         measIdList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdList", -1);
      }
      else {
         measIdList = null;
      }

      // decode measIdListExt_r12

      if (measIdListExt_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measIdListExt_r12", -1);

         measIdListExt_r12 = new MeasIdToAddModListExt_r12();
         measIdListExt_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdListExt_r12", -1);
      }
      else {
         measIdListExt_r12 = null;
      }

      // decode measIdList_v1310

      if (measIdList_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("measIdList_v1310", -1);

         measIdList_v1310 = new MeasIdToAddModList_v1310();
         measIdList_v1310.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdList_v1310", -1);
      }
      else {
         measIdList_v1310 = null;
      }

      // decode measIdListExt_v1310

      if (measIdListExt_v1310Present) {
         buffer.getContext().eventDispatcher.startElement("measIdListExt_v1310", -1);

         measIdListExt_v1310 = new MeasIdToAddModListExt_v1310();
         measIdListExt_v1310.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measIdListExt_v1310", -1);
      }
      else {
         measIdListExt_v1310 = null;
      }

      // decode measObjectList

      if (measObjectListPresent) {
         buffer.getContext().eventDispatcher.startElement("measObjectList", -1);

         measObjectList = new MeasObjectToAddModList();
         measObjectList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measObjectList", -1);
      }
      else {
         measObjectList = null;
      }

      // decode measObjectListExt_r13

      if (measObjectListExt_r13Present) {
         buffer.getContext().eventDispatcher.startElement("measObjectListExt_r13", -1);

         measObjectListExt_r13 = new MeasObjectToAddModListExt_r13();
         measObjectListExt_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measObjectListExt_r13", -1);
      }
      else {
         measObjectListExt_r13 = null;
      }

      // decode measObjectList_v9i0

      if (measObjectList_v9i0Present) {
         buffer.getContext().eventDispatcher.startElement("measObjectList_v9i0", -1);

         measObjectList_v9i0 = new MeasObjectToAddModList_v9e0();
         measObjectList_v9i0.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measObjectList_v9i0", -1);
      }
      else {
         measObjectList_v9i0 = null;
      }

      // decode reportConfigList

      if (reportConfigListPresent) {
         buffer.getContext().eventDispatcher.startElement("reportConfigList", -1);

         reportConfigList = new ReportConfigToAddModList();
         reportConfigList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reportConfigList", -1);
      }
      else {
         reportConfigList = null;
      }

      // decode quantityConfig

      if (quantityConfigPresent) {
         buffer.getContext().eventDispatcher.startElement("quantityConfig", -1);

         quantityConfig = new QuantityConfig();
         quantityConfig.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("quantityConfig", -1);
      }
      else {
         quantityConfig = null;
      }

      // decode measScaleFactor_r12

      if (measScaleFactor_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measScaleFactor_r12", -1);

         int tval = MeasScaleFactor_r12.decodeEnumValue (buffer);
         measScaleFactor_r12 = MeasScaleFactor_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measScaleFactor_r12", -1);
      }
      else {
         measScaleFactor_r12 = null;
      }

      // decode s_Measure

      if (s_MeasurePresent) {
         buffer.getContext().eventDispatcher.startElement("s_Measure", -1);

         s_Measure = new Asn1Integer();
         s_Measure.decode (buffer, -140, -44);

         buffer.invokeCharacters(s_Measure.toString());
         buffer.getContext().eventDispatcher.endElement("s_Measure", -1);
      }
      else {
         s_Measure = null;
      }

      // decode speedStatePars

      if (speedStateParsPresent) {
         buffer.getContext().eventDispatcher.startElement("speedStatePars", -1);

         speedStatePars = new VarMeasConfig_speedStatePars();
         speedStatePars.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("speedStatePars", -1);
      }
      else {
         speedStatePars = null;
      }

      // decode allowInterruptions_r11

      if (allowInterruptions_r11Present) {
         buffer.getContext().eventDispatcher.startElement("allowInterruptions_r11", -1);

         allowInterruptions_r11 = new Asn1Boolean();
         allowInterruptions_r11.decode (buffer);

         buffer.invokeCharacters(allowInterruptions_r11.toString());
         buffer.getContext().eventDispatcher.endElement("allowInterruptions_r11", -1);
      }
      else {
         allowInterruptions_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measIdList != null) measIdList.print (_sb, "measIdList", _level+1);
      if (measIdListExt_r12 != null) measIdListExt_r12.print (_sb, "measIdListExt_r12", _level+1);
      if (measIdList_v1310 != null) measIdList_v1310.print (_sb, "measIdList_v1310", _level+1);
      if (measIdListExt_v1310 != null) measIdListExt_v1310.print (_sb, "measIdListExt_v1310", _level+1);
      if (measObjectList != null) measObjectList.print (_sb, "measObjectList", _level+1);
      if (measObjectListExt_r13 != null) measObjectListExt_r13.print (_sb, "measObjectListExt_r13", _level+1);
      if (measObjectList_v9i0 != null) measObjectList_v9i0.print (_sb, "measObjectList_v9i0", _level+1);
      if (reportConfigList != null) reportConfigList.print (_sb, "reportConfigList", _level+1);
      if (quantityConfig != null) quantityConfig.print (_sb, "quantityConfig", _level+1);
      if (measScaleFactor_r12 != null) measScaleFactor_r12.print (_sb, "measScaleFactor_r12", _level+1);
      if (s_Measure != null) s_Measure.print (_sb, "s_Measure", _level+1);
      if (speedStatePars != null) speedStatePars.print (_sb, "speedStatePars", _level+1);
      if (allowInterruptions_r11 != null) allowInterruptions_r11.print (_sb, "allowInterruptions_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
