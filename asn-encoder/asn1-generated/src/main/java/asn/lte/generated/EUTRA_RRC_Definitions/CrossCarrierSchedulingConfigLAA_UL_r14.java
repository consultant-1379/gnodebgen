/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CrossCarrierSchedulingConfigLAA_UL_r14 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CrossCarrierSchedulingConfigLAA-UL-r14";
   }

   public ServCellIndex_r13 schedulingCellId_r14;
   public Asn1Integer cif_InSchedulingCell_r14;

   public CrossCarrierSchedulingConfigLAA_UL_r14 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CrossCarrierSchedulingConfigLAA_UL_r14 (
      ServCellIndex_r13 schedulingCellId_r14_,
      Asn1Integer cif_InSchedulingCell_r14_
   ) {
      super();
      schedulingCellId_r14 = schedulingCellId_r14_;
      cif_InSchedulingCell_r14 = cif_InSchedulingCell_r14_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CrossCarrierSchedulingConfigLAA_UL_r14 (long schedulingCellId_r14_,
      long cif_InSchedulingCell_r14_
   ) {
      super();
      schedulingCellId_r14 = new ServCellIndex_r13 (schedulingCellId_r14_);
      cif_InSchedulingCell_r14 = new Asn1Integer (cif_InSchedulingCell_r14_);
   }

   public void init () {
      schedulingCellId_r14 = null;
      cif_InSchedulingCell_r14 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return schedulingCellId_r14;
         case 1: return cif_InSchedulingCell_r14;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "schedulingCellId-r14";
         case 1: return "cif-InSchedulingCell-r14";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode schedulingCellId_r14

      buffer.getContext().eventDispatcher.startElement("schedulingCellId_r14", -1);

      schedulingCellId_r14 = new ServCellIndex_r13();
      schedulingCellId_r14.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("schedulingCellId_r14", -1);

      // decode cif_InSchedulingCell_r14

      buffer.getContext().eventDispatcher.startElement("cif_InSchedulingCell_r14", -1);

      cif_InSchedulingCell_r14 = new Asn1Integer();
      cif_InSchedulingCell_r14.decode (buffer, 1, 7);

      buffer.invokeCharacters(cif_InSchedulingCell_r14.toString());
      buffer.getContext().eventDispatcher.endElement("cif_InSchedulingCell_r14", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (schedulingCellId_r14 != null) schedulingCellId_r14.print (_sb, "schedulingCellId_r14", _level+1);
      if (cif_InSchedulingCell_r14 != null) cif_InSchedulingCell_r14.print (_sb, "cif_InSchedulingCell_r14", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
