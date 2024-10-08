/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRP_Range;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRQ_Range;

public class Cell_ToAddMod_r12_measResultCellToAdd_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_Range rsrpResult_r12;
   public RSRQ_Range rsrqResult_r12;

   public Cell_ToAddMod_r12_measResultCellToAdd_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Cell_ToAddMod_r12_measResultCellToAdd_r12 (
      RSRP_Range rsrpResult_r12_,
      RSRQ_Range rsrqResult_r12_
   ) {
      super();
      rsrpResult_r12 = rsrpResult_r12_;
      rsrqResult_r12 = rsrqResult_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Cell_ToAddMod_r12_measResultCellToAdd_r12 (long rsrpResult_r12_,
      long rsrqResult_r12_
   ) {
      super();
      rsrpResult_r12 = new RSRP_Range (rsrpResult_r12_);
      rsrqResult_r12 = new RSRQ_Range (rsrqResult_r12_);
   }

   public void init () {
      rsrpResult_r12 = null;
      rsrqResult_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rsrpResult_r12;
         case 1: return rsrqResult_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rsrpResult-r12";
         case 1: return "rsrqResult-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rsrpResult_r12

      buffer.getContext().eventDispatcher.startElement("rsrpResult_r12", -1);

      rsrpResult_r12 = new RSRP_Range();
      rsrpResult_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrpResult_r12", -1);

      // decode rsrqResult_r12

      buffer.getContext().eventDispatcher.startElement("rsrqResult_r12", -1);

      rsrqResult_r12 = new RSRQ_Range();
      rsrqResult_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrqResult_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rsrpResult_r12 != null) rsrpResult_r12.print (_sb, "rsrpResult_r12", _level+1);
      if (rsrqResult_r12 != null) rsrqResult_r12.print (_sb, "rsrqResult_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
