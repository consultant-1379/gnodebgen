/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.PhysCellId;
import asn.lte.generated.NR_RRC_Definitions.EUTRA_PhysCellId;
import asn.lte.generated.NR_RRC_Definitions.PhysCellIdUTRA_FDD_r16;

public class CellsTriggeredList_element extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _PHYSCELLID = 1;
   public final static byte _PHYSCELLIDEUTRA = 2;
   public final static byte _PHYSCELLIDUTRA_FDD_R16 = 3;

   public CellsTriggeredList_element () {
      super();
   }

   public CellsTriggeredList_element (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PHYSCELLID: return "physCellId";
      case _PHYSCELLIDEUTRA: return "physCellIdEUTRA";
      case _PHYSCELLIDUTRA_FDD_R16: return "physCellIdUTRA_FDD_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_physCellId (PhysCellId value) {
      setElement (_PHYSCELLID, value);
   }

   public void set_physCellIdEUTRA (EUTRA_PhysCellId value) {
      setElement (_PHYSCELLIDEUTRA, value);
   }

   public void set_physCellIdUTRA_FDD_r16 (PhysCellIdUTRA_FDD_r16 value) {
      setElement (_PHYSCELLIDUTRA_FDD_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // physCellId
         case 0: { 
            PhysCellId physCellId;
            element = physCellId = new PhysCellId();
            physCellId.decode (buffer);
            break;
         }

         // physCellIdEUTRA
         case 1: { 
            EUTRA_PhysCellId physCellIdEUTRA;
            element = physCellIdEUTRA = new EUTRA_PhysCellId();
            physCellIdEUTRA.decode (buffer);
            break;
         }

         // physCellIdUTRA_FDD_r16
         case 2: { 
            PhysCellIdUTRA_FDD_r16 physCellIdUTRA_FDD_r16;
            element = physCellIdUTRA_FDD_r16 = new PhysCellIdUTRA_FDD_r16();
            physCellIdUTRA_FDD_r16.decode (buffer);
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
