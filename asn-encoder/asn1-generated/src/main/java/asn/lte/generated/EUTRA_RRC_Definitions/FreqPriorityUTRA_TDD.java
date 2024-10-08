/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FreqPriorityUTRA_TDD extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FreqPriorityUTRA-TDD";
   }

   public ARFCN_ValueUTRA carrierFreq;
   public CellReselectionPriority cellReselectionPriority;

   public FreqPriorityUTRA_TDD () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FreqPriorityUTRA_TDD (
      ARFCN_ValueUTRA carrierFreq_,
      CellReselectionPriority cellReselectionPriority_
   ) {
      super();
      carrierFreq = carrierFreq_;
      cellReselectionPriority = cellReselectionPriority_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public FreqPriorityUTRA_TDD (long carrierFreq_,
      long cellReselectionPriority_
   ) {
      super();
      carrierFreq = new ARFCN_ValueUTRA (carrierFreq_);
      cellReselectionPriority = new CellReselectionPriority (cellReselectionPriority_);
   }

   public void init () {
      carrierFreq = null;
      cellReselectionPriority = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq;
         case 1: return cellReselectionPriority;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq";
         case 1: return "cellReselectionPriority";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode carrierFreq

      buffer.getContext().eventDispatcher.startElement("carrierFreq", -1);

      carrierFreq = new ARFCN_ValueUTRA();
      carrierFreq.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq", -1);

      // decode cellReselectionPriority

      buffer.getContext().eventDispatcher.startElement("cellReselectionPriority", -1);

      cellReselectionPriority = new CellReselectionPriority();
      cellReselectionPriority.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionPriority", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq != null) carrierFreq.print (_sb, "carrierFreq", _level+1);
      if (cellReselectionPriority != null) cellReselectionPriority.print (_sb, "cellReselectionPriority", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
