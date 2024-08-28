/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPowerControlDedicatedSCell_v1310 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkPowerControlDedicatedSCell-v1310";
   }

   public Asn1Integer p0_UE_PUCCH;
   public DeltaTxD_OffsetListPUCCH_r10 deltaTxD_OffsetListPUCCH_r10;  // optional

   public UplinkPowerControlDedicatedSCell_v1310 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkPowerControlDedicatedSCell_v1310 (
      Asn1Integer p0_UE_PUCCH_,
      DeltaTxD_OffsetListPUCCH_r10 deltaTxD_OffsetListPUCCH_r10_
   ) {
      super();
      p0_UE_PUCCH = p0_UE_PUCCH_;
      deltaTxD_OffsetListPUCCH_r10 = deltaTxD_OffsetListPUCCH_r10_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UplinkPowerControlDedicatedSCell_v1310 (
      Asn1Integer p0_UE_PUCCH_
   ) {
      super();
      p0_UE_PUCCH = p0_UE_PUCCH_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UplinkPowerControlDedicatedSCell_v1310 (long p0_UE_PUCCH_,
      DeltaTxD_OffsetListPUCCH_r10 deltaTxD_OffsetListPUCCH_r10_
   ) {
      super();
      p0_UE_PUCCH = new Asn1Integer (p0_UE_PUCCH_);
      deltaTxD_OffsetListPUCCH_r10 = deltaTxD_OffsetListPUCCH_r10_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public UplinkPowerControlDedicatedSCell_v1310 (
      long p0_UE_PUCCH_
   ) {
      super();
      p0_UE_PUCCH = new Asn1Integer (p0_UE_PUCCH_);
   }

   public void init () {
      p0_UE_PUCCH = null;
      deltaTxD_OffsetListPUCCH_r10 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p0_UE_PUCCH;
         case 1: return deltaTxD_OffsetListPUCCH_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p0-UE-PUCCH";
         case 1: return "deltaTxD-OffsetListPUCCH-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean deltaTxD_OffsetListPUCCH_r10Present = buffer.decodeBit ("deltaTxD_OffsetListPUCCH_r10Present");

      // decode p0_UE_PUCCH

      buffer.getContext().eventDispatcher.startElement("p0_UE_PUCCH", -1);

      p0_UE_PUCCH = new Asn1Integer();
      p0_UE_PUCCH.decode (buffer, -8, 7);

      buffer.invokeCharacters(p0_UE_PUCCH.toString());
      buffer.getContext().eventDispatcher.endElement("p0_UE_PUCCH", -1);

      // decode deltaTxD_OffsetListPUCCH_r10

      if (deltaTxD_OffsetListPUCCH_r10Present) {
         buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetListPUCCH_r10", -1);

         deltaTxD_OffsetListPUCCH_r10 = new DeltaTxD_OffsetListPUCCH_r10();
         deltaTxD_OffsetListPUCCH_r10.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetListPUCCH_r10", -1);
      }
      else {
         deltaTxD_OffsetListPUCCH_r10 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p0_UE_PUCCH != null) p0_UE_PUCCH.print (_sb, "p0_UE_PUCCH", _level+1);
      if (deltaTxD_OffsetListPUCCH_r10 != null) deltaTxD_OffsetListPUCCH_r10.print (_sb, "deltaTxD_OffsetListPUCCH_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
