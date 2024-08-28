/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UECapabilityInformation_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UECapabilityInformation-IEs";
   }

   public UE_CapabilityRAT_ContainerList ue_CapabilityRAT_ContainerList;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public UECapabilityInformation_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UECapabilityInformation_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UECapabilityInformation_IEs (
      UE_CapabilityRAT_ContainerList ue_CapabilityRAT_ContainerList_,
      Asn1OctetString lateNonCriticalExtension_,
      UECapabilityInformation_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ue_CapabilityRAT_ContainerList = ue_CapabilityRAT_ContainerList_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UECapabilityInformation_IEs (UE_CapabilityRAT_ContainerList ue_CapabilityRAT_ContainerList_,
      byte[] lateNonCriticalExtension_,
      UECapabilityInformation_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      ue_CapabilityRAT_ContainerList = ue_CapabilityRAT_ContainerList_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ue_CapabilityRAT_ContainerList = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_CapabilityRAT_ContainerList;
         case 1: return lateNonCriticalExtension;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-CapabilityRAT-ContainerList";
         case 1: return "lateNonCriticalExtension";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ue_CapabilityRAT_ContainerListPresent = buffer.decodeBit ("ue_CapabilityRAT_ContainerListPresent");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ue_CapabilityRAT_ContainerList

      if (ue_CapabilityRAT_ContainerListPresent) {
         buffer.getContext().eventDispatcher.startElement("ue_CapabilityRAT_ContainerList", -1);

         ue_CapabilityRAT_ContainerList = new UE_CapabilityRAT_ContainerList();
         ue_CapabilityRAT_ContainerList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ue_CapabilityRAT_ContainerList", -1);
      }
      else {
         ue_CapabilityRAT_ContainerList = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UECapabilityInformation_IEs_nonCriticalExtension();
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
      if (ue_CapabilityRAT_ContainerList != null) ue_CapabilityRAT_ContainerList.print (_sb, "ue_CapabilityRAT_ContainerList", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
