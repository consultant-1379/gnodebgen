/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRP_Range;
import asn.lte.generated.EUTRA_RRC_Definitions.RSRQ_Range;

public class MeasResultServCellSCG_r12_measResultSCell_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_Range rsrpResultSCell_r12;
   public RSRQ_Range rsrqResultSCell_r12;

   public MeasResultServCellSCG_r12_measResultSCell_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultServCellSCG_r12_measResultSCell_r12 (
      RSRP_Range rsrpResultSCell_r12_,
      RSRQ_Range rsrqResultSCell_r12_
   ) {
      super();
      rsrpResultSCell_r12 = rsrpResultSCell_r12_;
      rsrqResultSCell_r12 = rsrqResultSCell_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultServCellSCG_r12_measResultSCell_r12 (long rsrpResultSCell_r12_,
      long rsrqResultSCell_r12_
   ) {
      super();
      rsrpResultSCell_r12 = new RSRP_Range (rsrpResultSCell_r12_);
      rsrqResultSCell_r12 = new RSRQ_Range (rsrqResultSCell_r12_);
   }

   public void init () {
      rsrpResultSCell_r12 = null;
      rsrqResultSCell_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rsrpResultSCell_r12;
         case 1: return rsrqResultSCell_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rsrpResultSCell-r12";
         case 1: return "rsrqResultSCell-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode rsrpResultSCell_r12

      buffer.getContext().eventDispatcher.startElement("rsrpResultSCell_r12", -1);

      rsrpResultSCell_r12 = new RSRP_Range();
      rsrpResultSCell_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrpResultSCell_r12", -1);

      // decode rsrqResultSCell_r12

      buffer.getContext().eventDispatcher.startElement("rsrqResultSCell_r12", -1);

      rsrqResultSCell_r12 = new RSRQ_Range();
      rsrqResultSCell_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("rsrqResultSCell_r12", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rsrpResultSCell_r12 != null) rsrpResultSCell_r12.print (_sb, "rsrpResultSCell_r12", _level+1);
      if (rsrqResultSCell_r12 != null) rsrqResultSCell_r12.print (_sb, "rsrqResultSCell_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
