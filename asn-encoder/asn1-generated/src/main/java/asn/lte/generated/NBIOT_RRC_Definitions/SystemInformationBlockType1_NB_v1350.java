/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_NB_v1350 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType1-NB-v1350";
   }

   public CellSelectionInfo_NB_v1350 cellSelectionInfo_v1350;  // optional
   public SystemInformationBlockType1_NB_v1430 nonCriticalExtension;  // optional

   public SystemInformationBlockType1_NB_v1350 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_NB_v1350 (
      CellSelectionInfo_NB_v1350 cellSelectionInfo_v1350_,
      SystemInformationBlockType1_NB_v1430 nonCriticalExtension_
   ) {
      super();
      cellSelectionInfo_v1350 = cellSelectionInfo_v1350_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      cellSelectionInfo_v1350 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellSelectionInfo_v1350;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellSelectionInfo-v1350";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cellSelectionInfo_v1350Present = buffer.decodeBit ("cellSelectionInfo_v1350Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode cellSelectionInfo_v1350

      if (cellSelectionInfo_v1350Present) {
         buffer.getContext().eventDispatcher.startElement("cellSelectionInfo_v1350", -1);

         cellSelectionInfo_v1350 = new CellSelectionInfo_NB_v1350();
         cellSelectionInfo_v1350.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellSelectionInfo_v1350", -1);
      }
      else {
         cellSelectionInfo_v1350 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SystemInformationBlockType1_NB_v1430();
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
      if (cellSelectionInfo_v1350 != null) cellSelectionInfo_v1350.print (_sb, "cellSelectionInfo_v1350", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
