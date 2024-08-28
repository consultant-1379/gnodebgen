/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PSCellToAddMod_r12_cellIdentification_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PhysCellId physCellId_r12;
   public ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r12;

   public PSCellToAddMod_r12_cellIdentification_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PSCellToAddMod_r12_cellIdentification_r12 (
      PhysCellId physCellId_r12_,
      ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r12_
   ) {
      super();
      physCellId_r12 = physCellId_r12_;
      dl_CarrierFreq_r12 = dl_CarrierFreq_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PSCellToAddMod_r12_cellIdentification_r12 (long physCellId_r12_,
      long dl_CarrierFreq_r12_
   ) {
      super();
      physCellId_r12 = new PhysCellId (physCellId_r12_);
      dl_CarrierFreq_r12 = new ARFCN_ValueEUTRA_r9 (dl_CarrierFreq_r12_);
   }

   public void init () {
      physCellId_r12 = null;
      dl_CarrierFreq_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId_r12;
         case 1: return dl_CarrierFreq_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId-r12";
         case 1: return "dl-CarrierFreq-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode physCellId_r12

      buffer.getContext().eventDispatcher.startElement("physCellId_r12", -1);

      physCellId_r12 = new PhysCellId();
      physCellId_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r12", -1);

      // decode dl_CarrierFreq_r12

      buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq_r12", -1);

      dl_CarrierFreq_r12 = new ARFCN_ValueEUTRA_r9();
      dl_CarrierFreq_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physCellId_r12 != null) physCellId_r12.print (_sb, "physCellId_r12", _level+1);
      if (dl_CarrierFreq_r12 != null) dl_CarrierFreq_r12.print (_sb, "dl_CarrierFreq_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
