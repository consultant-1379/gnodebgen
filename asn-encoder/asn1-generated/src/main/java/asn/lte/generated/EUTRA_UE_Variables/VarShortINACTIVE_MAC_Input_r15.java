/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_UE_Variables;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.CellIdentity;
import asn.lte.generated.EUTRA_RRC_Definitions.PhysCellId;
import asn.lte.generated.EUTRA_RRC_Definitions.C_RNTI;

public class VarShortINACTIVE_MAC_Input_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_UE_VariablesRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VarShortINACTIVE-MAC-Input-r15";
   }

   public CellIdentity cellIdentity_r15;
   public PhysCellId physCellId_r15;
   public C_RNTI c_RNTI_r15;

   public VarShortINACTIVE_MAC_Input_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VarShortINACTIVE_MAC_Input_r15 (
      CellIdentity cellIdentity_r15_,
      PhysCellId physCellId_r15_,
      C_RNTI c_RNTI_r15_
   ) {
      super();
      cellIdentity_r15 = cellIdentity_r15_;
      physCellId_r15 = physCellId_r15_;
      c_RNTI_r15 = c_RNTI_r15_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public VarShortINACTIVE_MAC_Input_r15 (CellIdentity cellIdentity_r15_,
      long physCellId_r15_,
      C_RNTI c_RNTI_r15_
   ) {
      super();
      cellIdentity_r15 = cellIdentity_r15_;
      physCellId_r15 = new PhysCellId (physCellId_r15_);
      c_RNTI_r15 = c_RNTI_r15_;
   }

   public void init () {
      cellIdentity_r15 = null;
      physCellId_r15 = null;
      c_RNTI_r15 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellIdentity_r15;
         case 1: return physCellId_r15;
         case 2: return c_RNTI_r15;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellIdentity-r15";
         case 1: return "physCellId-r15";
         case 2: return "c-RNTI-r15";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cellIdentity_r15

      buffer.getContext().eventDispatcher.startElement("cellIdentity_r15", -1);

      cellIdentity_r15 = new CellIdentity();
      cellIdentity_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_r15", -1);

      // decode physCellId_r15

      buffer.getContext().eventDispatcher.startElement("physCellId_r15", -1);

      physCellId_r15 = new PhysCellId();
      physCellId_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r15", -1);

      // decode c_RNTI_r15

      buffer.getContext().eventDispatcher.startElement("c_RNTI_r15", -1);

      c_RNTI_r15 = new C_RNTI();
      c_RNTI_r15.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("c_RNTI_r15", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellIdentity_r15 != null) cellIdentity_r15.print (_sb, "cellIdentity_r15", _level+1);
      if (physCellId_r15 != null) physCellId_r15.print (_sb, "physCellId_r15", _level+1);
      if (c_RNTI_r15 != null) c_RNTI_r15.print (_sb, "c_RNTI_r15", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
