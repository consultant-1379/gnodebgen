/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_EUTRA_Capability_v1330_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-EUTRA-Capability-v1330-IEs";
   }

   public Asn1Integer ue_CategoryDL_v1330;  // optional
   public PhyLayerParameters_v1330 phyLayerParameters_v1330;  // optional
   public UE_EUTRA_Capability_v1330_IEs_ue_CE_NeedULGaps_r13 ue_CE_NeedULGaps_r13 = null;  // optional
   public UE_EUTRA_Capability_v1340_IEs nonCriticalExtension;  // optional

   public UE_EUTRA_Capability_v1330_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_EUTRA_Capability_v1330_IEs (
      Asn1Integer ue_CategoryDL_v1330_,
      PhyLayerParameters_v1330 phyLayerParameters_v1330_,
      UE_EUTRA_Capability_v1330_IEs_ue_CE_NeedULGaps_r13 ue_CE_NeedULGaps_r13_,
      UE_EUTRA_Capability_v1340_IEs nonCriticalExtension_
   ) {
      super();
      ue_CategoryDL_v1330 = ue_CategoryDL_v1330_;
      phyLayerParameters_v1330 = phyLayerParameters_v1330_;
      ue_CE_NeedULGaps_r13 = ue_CE_NeedULGaps_r13_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UE_EUTRA_Capability_v1330_IEs (long ue_CategoryDL_v1330_,
      PhyLayerParameters_v1330 phyLayerParameters_v1330_,
      UE_EUTRA_Capability_v1330_IEs_ue_CE_NeedULGaps_r13 ue_CE_NeedULGaps_r13_,
      UE_EUTRA_Capability_v1340_IEs nonCriticalExtension_
   ) {
      super();
      ue_CategoryDL_v1330 = new Asn1Integer (ue_CategoryDL_v1330_);
      phyLayerParameters_v1330 = phyLayerParameters_v1330_;
      ue_CE_NeedULGaps_r13 = ue_CE_NeedULGaps_r13_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_CategoryDL_v1330 = null;
      phyLayerParameters_v1330 = null;
      ue_CE_NeedULGaps_r13 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_CategoryDL_v1330;
         case 1: return phyLayerParameters_v1330;
         case 2: return ue_CE_NeedULGaps_r13;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-CategoryDL-v1330";
         case 1: return "phyLayerParameters-v1330";
         case 2: return "ue-CE-NeedULGaps-r13";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_CategoryDL_v1330Present = buffer.decodeBit ("ue_CategoryDL_v1330Present");
      boolean phyLayerParameters_v1330Present = buffer.decodeBit ("phyLayerParameters_v1330Present");
      boolean ue_CE_NeedULGaps_r13Present = buffer.decodeBit ("ue_CE_NeedULGaps_r13Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_CategoryDL_v1330

      if (ue_CategoryDL_v1330Present) {
         buffer.getContext().eventDispatcher.startElement("ue_CategoryDL_v1330", -1);

         ue_CategoryDL_v1330 = new Asn1Integer();
         ue_CategoryDL_v1330.decode (buffer, 18, 19);

         buffer.invokeCharacters(ue_CategoryDL_v1330.toString());
         buffer.getContext().eventDispatcher.endElement("ue_CategoryDL_v1330", -1);
      }
      else {
         ue_CategoryDL_v1330 = null;
      }

      // decode phyLayerParameters_v1330

      if (phyLayerParameters_v1330Present) {
         buffer.getContext().eventDispatcher.startElement("phyLayerParameters_v1330", -1);

         phyLayerParameters_v1330 = new PhyLayerParameters_v1330();
         phyLayerParameters_v1330.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("phyLayerParameters_v1330", -1);
      }
      else {
         phyLayerParameters_v1330 = null;
      }

      // decode ue_CE_NeedULGaps_r13

      if (ue_CE_NeedULGaps_r13Present) {
         buffer.getContext().eventDispatcher.startElement("ue_CE_NeedULGaps_r13", -1);

         int tval = UE_EUTRA_Capability_v1330_IEs_ue_CE_NeedULGaps_r13.decodeEnumValue (buffer);
         ue_CE_NeedULGaps_r13 = UE_EUTRA_Capability_v1330_IEs_ue_CE_NeedULGaps_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_CE_NeedULGaps_r13", -1);
      }
      else {
         ue_CE_NeedULGaps_r13 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UE_EUTRA_Capability_v1340_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (ue_CategoryDL_v1330 != null) ue_CategoryDL_v1330.print (_sb, "ue_CategoryDL_v1330", _level+1);
      if (phyLayerParameters_v1330 != null) phyLayerParameters_v1330.print (_sb, "phyLayerParameters_v1330", _level+1);
      if (ue_CE_NeedULGaps_r13 != null) ue_CE_NeedULGaps_r13.print (_sb, "ue_CE_NeedULGaps_r13", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
