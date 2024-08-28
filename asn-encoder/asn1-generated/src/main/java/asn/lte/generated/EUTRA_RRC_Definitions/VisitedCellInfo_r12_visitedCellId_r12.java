/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class VisitedCellInfo_r12_visitedCellId_r12 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _CELLGLOBALID_R12 = 1;
   public final static byte _PCI_ARFCN_R12 = 2;

   public VisitedCellInfo_r12_visitedCellId_r12 () {
      super();
   }

   public VisitedCellInfo_r12_visitedCellId_r12 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _CELLGLOBALID_R12: return "cellGlobalId_r12";
      case _PCI_ARFCN_R12: return "pci_arfcn_r12";
      default: return "UNDEFINED";
      }
   }

   public void set_cellGlobalId_r12 (CellGlobalIdEUTRA value) {
      setElement (_CELLGLOBALID_R12, value);
   }

   public void set_pci_arfcn_r12 (VisitedCellInfo_r12_visitedCellId_r12_pci_arfcn_r12 value) {
      setElement (_PCI_ARFCN_R12, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // cellGlobalId_r12
         case 0: { 
            CellGlobalIdEUTRA cellGlobalId_r12;
            element = cellGlobalId_r12 = new CellGlobalIdEUTRA();
            cellGlobalId_r12.decode (buffer);
            break;
         }

         // pci_arfcn_r12
         case 1: { 
            VisitedCellInfo_r12_visitedCellId_r12_pci_arfcn_r12 pci_arfcn_r12;
            element = pci_arfcn_r12 = new VisitedCellInfo_r12_visitedCellId_r12_pci_arfcn_r12();
            pci_arfcn_r12.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
