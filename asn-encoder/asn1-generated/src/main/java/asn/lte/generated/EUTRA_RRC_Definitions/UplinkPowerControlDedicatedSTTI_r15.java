/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UplinkPowerControlDedicatedSTTI_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UplinkPowerControlDedicatedSTTI-r15";
   }

   public Asn1Boolean accumulationEnabledSTTI_r15;
   public DeltaTxD_OffsetListSPUCCH_r15 deltaTxD_OffsetListSPUCCH_r15;  // optional
   public Asn1Boolean uplinkPower_CSIPayload;

   public UplinkPowerControlDedicatedSTTI_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UplinkPowerControlDedicatedSTTI_r15 (
      Asn1Boolean accumulationEnabledSTTI_r15_,
      DeltaTxD_OffsetListSPUCCH_r15 deltaTxD_OffsetListSPUCCH_r15_,
      Asn1Boolean uplinkPower_CSIPayload_
   ) {
      super();
      accumulationEnabledSTTI_r15 = accumulationEnabledSTTI_r15_;
      deltaTxD_OffsetListSPUCCH_r15 = deltaTxD_OffsetListSPUCCH_r15_;
      uplinkPower_CSIPayload = uplinkPower_CSIPayload_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public UplinkPowerControlDedicatedSTTI_r15 (
      Asn1Boolean accumulationEnabledSTTI_r15_,
      Asn1Boolean uplinkPower_CSIPayload_
   ) {
      super();
      accumulationEnabledSTTI_r15 = accumulationEnabledSTTI_r15_;
      uplinkPower_CSIPayload = uplinkPower_CSIPayload_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UplinkPowerControlDedicatedSTTI_r15 (boolean accumulationEnabledSTTI_r15_,
      DeltaTxD_OffsetListSPUCCH_r15 deltaTxD_OffsetListSPUCCH_r15_,
      boolean uplinkPower_CSIPayload_
   ) {
      super();
      accumulationEnabledSTTI_r15 = new Asn1Boolean (accumulationEnabledSTTI_r15_);
      deltaTxD_OffsetListSPUCCH_r15 = deltaTxD_OffsetListSPUCCH_r15_;
      uplinkPower_CSIPayload = new Asn1Boolean (uplinkPower_CSIPayload_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public UplinkPowerControlDedicatedSTTI_r15 (
      boolean accumulationEnabledSTTI_r15_,
      boolean uplinkPower_CSIPayload_
   ) {
      super();
      accumulationEnabledSTTI_r15 = new Asn1Boolean (accumulationEnabledSTTI_r15_);
      uplinkPower_CSIPayload = new Asn1Boolean (uplinkPower_CSIPayload_);
   }

   public void init () {
      accumulationEnabledSTTI_r15 = null;
      deltaTxD_OffsetListSPUCCH_r15 = null;
      uplinkPower_CSIPayload = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return accumulationEnabledSTTI_r15;
         case 1: return deltaTxD_OffsetListSPUCCH_r15;
         case 2: return uplinkPower_CSIPayload;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "accumulationEnabledSTTI-r15";
         case 1: return "deltaTxD-OffsetListSPUCCH-r15";
         case 2: return "uplinkPower-CSIPayload";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean deltaTxD_OffsetListSPUCCH_r15Present = buffer.decodeBit ("deltaTxD_OffsetListSPUCCH_r15Present");

      // decode accumulationEnabledSTTI_r15

      buffer.getContext().eventDispatcher.startElement("accumulationEnabledSTTI_r15", -1);

      accumulationEnabledSTTI_r15 = new Asn1Boolean();
      accumulationEnabledSTTI_r15.decode (buffer);

      buffer.invokeCharacters(accumulationEnabledSTTI_r15.toString());
      buffer.getContext().eventDispatcher.endElement("accumulationEnabledSTTI_r15", -1);

      // decode deltaTxD_OffsetListSPUCCH_r15

      if (deltaTxD_OffsetListSPUCCH_r15Present) {
         buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetListSPUCCH_r15", -1);

         deltaTxD_OffsetListSPUCCH_r15 = new DeltaTxD_OffsetListSPUCCH_r15();
         deltaTxD_OffsetListSPUCCH_r15.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetListSPUCCH_r15", -1);
      }
      else {
         deltaTxD_OffsetListSPUCCH_r15 = null;
      }

      // decode uplinkPower_CSIPayload

      buffer.getContext().eventDispatcher.startElement("uplinkPower_CSIPayload", -1);

      uplinkPower_CSIPayload = new Asn1Boolean();
      uplinkPower_CSIPayload.decode (buffer);

      buffer.invokeCharacters(uplinkPower_CSIPayload.toString());
      buffer.getContext().eventDispatcher.endElement("uplinkPower_CSIPayload", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (accumulationEnabledSTTI_r15 != null) accumulationEnabledSTTI_r15.print (_sb, "accumulationEnabledSTTI_r15", _level+1);
      if (deltaTxD_OffsetListSPUCCH_r15 != null) deltaTxD_OffsetListSPUCCH_r15.print (_sb, "deltaTxD_OffsetListSPUCCH_r15", _level+1);
      if (uplinkPower_CSIPayload != null) uplinkPower_CSIPayload.print (_sb, "uplinkPower_CSIPayload", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
