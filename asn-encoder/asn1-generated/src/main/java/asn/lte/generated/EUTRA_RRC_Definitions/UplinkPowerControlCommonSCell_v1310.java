/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPowerControlCommonSCell_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkPowerControlCommonSCell-v1310";
   }

   public Asn1Integer p0_NominalPUCCH;
   public DeltaFList_PUCCH deltaFList_PUCCH;
   public UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format3_r12 deltaF_PUCCH_Format3_r12 = null;  // optional
   public UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format1bCS_r12 deltaF_PUCCH_Format1bCS_r12 = null;  // optional
   public UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format4_r13 deltaF_PUCCH_Format4_r13 = null;  // optional
   public UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format5_13 deltaF_PUCCH_Format5_13 = null;  // optional

   public UplinkPowerControlCommonSCell_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkPowerControlCommonSCell_v1310 (
      Asn1Integer p0_NominalPUCCH_,
      DeltaFList_PUCCH deltaFList_PUCCH_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format3_r12 deltaF_PUCCH_Format3_r12_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format1bCS_r12 deltaF_PUCCH_Format1bCS_r12_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format4_r13 deltaF_PUCCH_Format4_r13_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format5_13 deltaF_PUCCH_Format5_13_
   ) {
      super();
      p0_NominalPUCCH = p0_NominalPUCCH_;
      deltaFList_PUCCH = deltaFList_PUCCH_;
      deltaF_PUCCH_Format3_r12 = deltaF_PUCCH_Format3_r12_;
      deltaF_PUCCH_Format1bCS_r12 = deltaF_PUCCH_Format1bCS_r12_;
      deltaF_PUCCH_Format4_r13 = deltaF_PUCCH_Format4_r13_;
      deltaF_PUCCH_Format5_13 = deltaF_PUCCH_Format5_13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UplinkPowerControlCommonSCell_v1310 (
      Asn1Integer p0_NominalPUCCH_,
      DeltaFList_PUCCH deltaFList_PUCCH_
   ) {
      super();
      p0_NominalPUCCH = p0_NominalPUCCH_;
      deltaFList_PUCCH = deltaFList_PUCCH_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UplinkPowerControlCommonSCell_v1310 (long p0_NominalPUCCH_,
      DeltaFList_PUCCH deltaFList_PUCCH_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format3_r12 deltaF_PUCCH_Format3_r12_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format1bCS_r12 deltaF_PUCCH_Format1bCS_r12_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format4_r13 deltaF_PUCCH_Format4_r13_,
      UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format5_13 deltaF_PUCCH_Format5_13_
   ) {
      super();
      p0_NominalPUCCH = new Asn1Integer (p0_NominalPUCCH_);
      deltaFList_PUCCH = deltaFList_PUCCH_;
      deltaF_PUCCH_Format3_r12 = deltaF_PUCCH_Format3_r12_;
      deltaF_PUCCH_Format1bCS_r12 = deltaF_PUCCH_Format1bCS_r12_;
      deltaF_PUCCH_Format4_r13 = deltaF_PUCCH_Format4_r13_;
      deltaF_PUCCH_Format5_13 = deltaF_PUCCH_Format5_13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public UplinkPowerControlCommonSCell_v1310 (
      long p0_NominalPUCCH_,
      DeltaFList_PUCCH deltaFList_PUCCH_
   ) {
      super();
      p0_NominalPUCCH = new Asn1Integer (p0_NominalPUCCH_);
      deltaFList_PUCCH = deltaFList_PUCCH_;
   }

   public void init () {
      p0_NominalPUCCH = null;
      deltaFList_PUCCH = null;
      deltaF_PUCCH_Format3_r12 = null;
      deltaF_PUCCH_Format1bCS_r12 = null;
      deltaF_PUCCH_Format4_r13 = null;
      deltaF_PUCCH_Format5_13 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p0_NominalPUCCH;
         case 1: return deltaFList_PUCCH;
         case 2: return deltaF_PUCCH_Format3_r12;
         case 3: return deltaF_PUCCH_Format1bCS_r12;
         case 4: return deltaF_PUCCH_Format4_r13;
         case 5: return deltaF_PUCCH_Format5_13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p0-NominalPUCCH";
         case 1: return "deltaFList-PUCCH";
         case 2: return "deltaF-PUCCH-Format3-r12";
         case 3: return "deltaF-PUCCH-Format1bCS-r12";
         case 4: return "deltaF-PUCCH-Format4-r13";
         case 5: return "deltaF-PUCCH-Format5-13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean deltaF_PUCCH_Format3_r12Present = buffer.decodeBit ("deltaF_PUCCH_Format3_r12Present");
      boolean deltaF_PUCCH_Format1bCS_r12Present = buffer.decodeBit ("deltaF_PUCCH_Format1bCS_r12Present");
      boolean deltaF_PUCCH_Format4_r13Present = buffer.decodeBit ("deltaF_PUCCH_Format4_r13Present");
      boolean deltaF_PUCCH_Format5_13Present = buffer.decodeBit ("deltaF_PUCCH_Format5_13Present");

      // decode p0_NominalPUCCH

      buffer.getContext().eventDispatcher.startElement("p0_NominalPUCCH", -1);

      p0_NominalPUCCH = new Asn1Integer();
      p0_NominalPUCCH.decode (buffer, -127, -96);

      buffer.invokeCharacters(p0_NominalPUCCH.toString());
      buffer.getContext().eventDispatcher.endElement("p0_NominalPUCCH", -1);

      // decode deltaFList_PUCCH

      buffer.getContext().eventDispatcher.startElement("deltaFList_PUCCH", -1);

      deltaFList_PUCCH = new DeltaFList_PUCCH();
      deltaFList_PUCCH.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("deltaFList_PUCCH", -1);

      // decode deltaF_PUCCH_Format3_r12

      if (deltaF_PUCCH_Format3_r12Present) {
         buffer.getContext().eventDispatcher.startElement("deltaF_PUCCH_Format3_r12", -1);

         int tval = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format3_r12.decodeEnumValue (buffer);
         deltaF_PUCCH_Format3_r12 = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format3_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("deltaF_PUCCH_Format3_r12", -1);
      }
      else {
         deltaF_PUCCH_Format3_r12 = null;
      }

      // decode deltaF_PUCCH_Format1bCS_r12

      if (deltaF_PUCCH_Format1bCS_r12Present) {
         buffer.getContext().eventDispatcher.startElement("deltaF_PUCCH_Format1bCS_r12", -1);

         int tval = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format1bCS_r12.decodeEnumValue (buffer);
         deltaF_PUCCH_Format1bCS_r12 = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format1bCS_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("deltaF_PUCCH_Format1bCS_r12", -1);
      }
      else {
         deltaF_PUCCH_Format1bCS_r12 = null;
      }

      // decode deltaF_PUCCH_Format4_r13

      if (deltaF_PUCCH_Format4_r13Present) {
         buffer.getContext().eventDispatcher.startElement("deltaF_PUCCH_Format4_r13", -1);

         int tval = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format4_r13.decodeEnumValue (buffer);
         deltaF_PUCCH_Format4_r13 = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format4_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("deltaF_PUCCH_Format4_r13", -1);
      }
      else {
         deltaF_PUCCH_Format4_r13 = null;
      }

      // decode deltaF_PUCCH_Format5_13

      if (deltaF_PUCCH_Format5_13Present) {
         buffer.getContext().eventDispatcher.startElement("deltaF_PUCCH_Format5_13", -1);

         int tval = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format5_13.decodeEnumValue (buffer);
         deltaF_PUCCH_Format5_13 = UplinkPowerControlCommonSCell_v1310_deltaF_PUCCH_Format5_13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("deltaF_PUCCH_Format5_13", -1);
      }
      else {
         deltaF_PUCCH_Format5_13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p0_NominalPUCCH != null) p0_NominalPUCCH.print (_sb, "p0_NominalPUCCH", _level+1);
      if (deltaFList_PUCCH != null) deltaFList_PUCCH.print (_sb, "deltaFList_PUCCH", _level+1);
      if (deltaF_PUCCH_Format3_r12 != null) deltaF_PUCCH_Format3_r12.print (_sb, "deltaF_PUCCH_Format3_r12", _level+1);
      if (deltaF_PUCCH_Format1bCS_r12 != null) deltaF_PUCCH_Format1bCS_r12.print (_sb, "deltaF_PUCCH_Format1bCS_r12", _level+1);
      if (deltaF_PUCCH_Format4_r13 != null) deltaF_PUCCH_Format4_r13.print (_sb, "deltaF_PUCCH_Format4_r13", _level+1);
      if (deltaF_PUCCH_Format5_13 != null) deltaF_PUCCH_Format5_13.print (_sb, "deltaF_PUCCH_Format5_13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
