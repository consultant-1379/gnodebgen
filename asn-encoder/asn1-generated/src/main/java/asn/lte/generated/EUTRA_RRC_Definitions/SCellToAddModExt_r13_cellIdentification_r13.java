/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCellToAddModExt_r13_cellIdentification_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PhysCellId physCellId_r13;
   public ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r13;

   public SCellToAddModExt_r13_cellIdentification_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCellToAddModExt_r13_cellIdentification_r13 (
      PhysCellId physCellId_r13_,
      ARFCN_ValueEUTRA_r9 dl_CarrierFreq_r13_
   ) {
      super();
      physCellId_r13 = physCellId_r13_;
      dl_CarrierFreq_r13 = dl_CarrierFreq_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SCellToAddModExt_r13_cellIdentification_r13 (long physCellId_r13_,
      long dl_CarrierFreq_r13_
   ) {
      super();
      physCellId_r13 = new PhysCellId (physCellId_r13_);
      dl_CarrierFreq_r13 = new ARFCN_ValueEUTRA_r9 (dl_CarrierFreq_r13_);
   }

   public void init () {
      physCellId_r13 = null;
      dl_CarrierFreq_r13 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId_r13;
         case 1: return dl_CarrierFreq_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId-r13";
         case 1: return "dl-CarrierFreq-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode physCellId_r13

      buffer.getContext().eventDispatcher.startElement("physCellId_r13", -1);

      physCellId_r13 = new PhysCellId();
      physCellId_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r13", -1);

      // decode dl_CarrierFreq_r13

      buffer.getContext().eventDispatcher.startElement("dl_CarrierFreq_r13", -1);

      dl_CarrierFreq_r13 = new ARFCN_ValueEUTRA_r9();
      dl_CarrierFreq_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_CarrierFreq_r13", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physCellId_r13 != null) physCellId_r13.print (_sb, "physCellId_r13", _level+1);
      if (dl_CarrierFreq_r13 != null) dl_CarrierFreq_r13.print (_sb, "dl_CarrierFreq_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
