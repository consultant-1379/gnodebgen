/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_v1350_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType1-v1350-IEs";
   }

   public CellSelectionInfoCE1_r13 cellSelectionInfoCE1_r13;  // optional
   public SystemInformationBlockType1_v1360_IEs nonCriticalExtension;  // optional

   public SystemInformationBlockType1_v1350_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType1_v1350_IEs (
      CellSelectionInfoCE1_r13 cellSelectionInfoCE1_r13_,
      SystemInformationBlockType1_v1360_IEs nonCriticalExtension_
   ) {
      super();
      cellSelectionInfoCE1_r13 = cellSelectionInfoCE1_r13_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      cellSelectionInfoCE1_r13 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellSelectionInfoCE1_r13;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellSelectionInfoCE1-r13";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cellSelectionInfoCE1_r13Present = buffer.decodeBit ("cellSelectionInfoCE1_r13Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode cellSelectionInfoCE1_r13

      if (cellSelectionInfoCE1_r13Present) {
         buffer.getContext().eventDispatcher.startElement("cellSelectionInfoCE1_r13", -1);

         cellSelectionInfoCE1_r13 = new CellSelectionInfoCE1_r13();
         cellSelectionInfoCE1_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellSelectionInfoCE1_r13", -1);
      }
      else {
         cellSelectionInfoCE1_r13 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SystemInformationBlockType1_v1360_IEs();
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
      if (cellSelectionInfoCE1_r13 != null) cellSelectionInfoCE1_r13.print (_sb, "cellSelectionInfoCE1_r13", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
