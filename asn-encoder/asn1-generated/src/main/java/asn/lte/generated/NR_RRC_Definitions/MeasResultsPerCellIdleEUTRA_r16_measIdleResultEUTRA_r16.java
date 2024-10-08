/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultsPerCellIdleEUTRA_r16_measIdleResultEUTRA_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public RSRP_RangeEUTRA rsrp_ResultEUTRA_r16;  // optional
   public RSRQ_RangeEUTRA_r16 rsrq_ResultEUTRA_r16;  // optional

   public MeasResultsPerCellIdleEUTRA_r16_measIdleResultEUTRA_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasResultsPerCellIdleEUTRA_r16_measIdleResultEUTRA_r16 (
      RSRP_RangeEUTRA rsrp_ResultEUTRA_r16_,
      RSRQ_RangeEUTRA_r16 rsrq_ResultEUTRA_r16_
   ) {
      super();
      rsrp_ResultEUTRA_r16 = rsrp_ResultEUTRA_r16_;
      rsrq_ResultEUTRA_r16 = rsrq_ResultEUTRA_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasResultsPerCellIdleEUTRA_r16_measIdleResultEUTRA_r16 (long rsrp_ResultEUTRA_r16_,
      long rsrq_ResultEUTRA_r16_
   ) {
      super();
      rsrp_ResultEUTRA_r16 = new RSRP_RangeEUTRA (rsrp_ResultEUTRA_r16_);
      rsrq_ResultEUTRA_r16 = new RSRQ_RangeEUTRA_r16 (rsrq_ResultEUTRA_r16_);
   }

   public void init () {
      rsrp_ResultEUTRA_r16 = null;
      rsrq_ResultEUTRA_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return rsrp_ResultEUTRA_r16;
         case 1: return rsrq_ResultEUTRA_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "rsrp-ResultEUTRA-r16";
         case 1: return "rsrq-ResultEUTRA-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean rsrp_ResultEUTRA_r16Present = buffer.decodeBit ("rsrp_ResultEUTRA_r16Present");
      boolean rsrq_ResultEUTRA_r16Present = buffer.decodeBit ("rsrq_ResultEUTRA_r16Present");

      // decode rsrp_ResultEUTRA_r16

      if (rsrp_ResultEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rsrp_ResultEUTRA_r16", -1);

         rsrp_ResultEUTRA_r16 = new RSRP_RangeEUTRA();
         rsrp_ResultEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrp_ResultEUTRA_r16", -1);
      }
      else {
         rsrp_ResultEUTRA_r16 = null;
      }

      // decode rsrq_ResultEUTRA_r16

      if (rsrq_ResultEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rsrq_ResultEUTRA_r16", -1);

         rsrq_ResultEUTRA_r16 = new RSRQ_RangeEUTRA_r16();
         rsrq_ResultEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rsrq_ResultEUTRA_r16", -1);
      }
      else {
         rsrq_ResultEUTRA_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (rsrp_ResultEUTRA_r16 != null) rsrp_ResultEUTRA_r16.print (_sb, "rsrp_ResultEUTRA_r16", _level+1);
      if (rsrq_ResultEUTRA_r16 != null) rsrq_ResultEUTRA_r16.print (_sb, "rsrq_ResultEUTRA_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
