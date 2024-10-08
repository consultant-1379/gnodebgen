/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_v920_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType1-v920-IEs";
   }

   public SystemInformationBlockType1_v920_IEs_ims_EmergencySupport_r9 ims_EmergencySupport_r9 = null;  // optional
   public CellSelectionInfo_v920 cellSelectionInfo_v920;  // optional
   public SystemInformationBlockType1_v1130_IEs nonCriticalExtension;  // optional

   public SystemInformationBlockType1_v920_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_v920_IEs (
      SystemInformationBlockType1_v920_IEs_ims_EmergencySupport_r9 ims_EmergencySupport_r9_,
      CellSelectionInfo_v920 cellSelectionInfo_v920_,
      SystemInformationBlockType1_v1130_IEs nonCriticalExtension_
   ) {
      super();
      ims_EmergencySupport_r9 = ims_EmergencySupport_r9_;
      cellSelectionInfo_v920 = cellSelectionInfo_v920_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      ims_EmergencySupport_r9 = null;
      cellSelectionInfo_v920 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ims_EmergencySupport_r9;
         case 1: return cellSelectionInfo_v920;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ims-EmergencySupport-r9";
         case 1: return "cellSelectionInfo-v920";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean ims_EmergencySupport_r9Present = buffer.decodeBit ("ims_EmergencySupport_r9Present");
      boolean cellSelectionInfo_v920Present = buffer.decodeBit ("cellSelectionInfo_v920Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode ims_EmergencySupport_r9

      if (ims_EmergencySupport_r9Present) {
         buffer.getContext().eventDispatcher.startElement("ims_EmergencySupport_r9", -1);

         int tval = SystemInformationBlockType1_v920_IEs_ims_EmergencySupport_r9.decodeEnumValue (buffer);
         ims_EmergencySupport_r9 = SystemInformationBlockType1_v920_IEs_ims_EmergencySupport_r9.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ims_EmergencySupport_r9", -1);
      }
      else {
         ims_EmergencySupport_r9 = null;
      }

      // decode cellSelectionInfo_v920

      if (cellSelectionInfo_v920Present) {
         buffer.getContext().eventDispatcher.startElement("cellSelectionInfo_v920", -1);

         cellSelectionInfo_v920 = new CellSelectionInfo_v920();
         cellSelectionInfo_v920.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellSelectionInfo_v920", -1);
      }
      else {
         cellSelectionInfo_v920 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SystemInformationBlockType1_v1130_IEs();
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
      if (ims_EmergencySupport_r9 != null) ims_EmergencySupport_r9.print (_sb, "ims_EmergencySupport_r9", _level+1);
      if (cellSelectionInfo_v920 != null) cellSelectionInfo_v920.print (_sb, "cellSelectionInfo_v920", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
