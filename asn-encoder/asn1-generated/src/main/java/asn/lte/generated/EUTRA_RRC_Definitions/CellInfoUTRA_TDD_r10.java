/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellInfoUTRA_TDD_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellInfoUTRA-TDD-r10";
   }

   public PhysCellIdUTRA_TDD physCellId_r10;
   public ARFCN_ValueUTRA carrierFreq_r10;
   public Asn1OctetString utra_BCCH_Container_r10;

   public CellInfoUTRA_TDD_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellInfoUTRA_TDD_r10 (
      PhysCellIdUTRA_TDD physCellId_r10_,
      ARFCN_ValueUTRA carrierFreq_r10_,
      Asn1OctetString utra_BCCH_Container_r10_
   ) {
      super();
      physCellId_r10 = physCellId_r10_;
      carrierFreq_r10 = carrierFreq_r10_;
      utra_BCCH_Container_r10 = utra_BCCH_Container_r10_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellInfoUTRA_TDD_r10 (long physCellId_r10_,
      long carrierFreq_r10_,
      byte[] utra_BCCH_Container_r10_
   ) {
      super();
      physCellId_r10 = new PhysCellIdUTRA_TDD (physCellId_r10_);
      carrierFreq_r10 = new ARFCN_ValueUTRA (carrierFreq_r10_);
      utra_BCCH_Container_r10 = new Asn1OctetString (utra_BCCH_Container_r10_);
   }

   public void init () {
      physCellId_r10 = null;
      carrierFreq_r10 = null;
      utra_BCCH_Container_r10 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellId_r10;
         case 1: return carrierFreq_r10;
         case 2: return utra_BCCH_Container_r10;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellId-r10";
         case 1: return "carrierFreq-r10";
         case 2: return "utra-BCCH-Container-r10";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode physCellId_r10

      buffer.getContext().eventDispatcher.startElement("physCellId_r10", -1);

      physCellId_r10 = new PhysCellIdUTRA_TDD();
      physCellId_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId_r10", -1);

      // decode carrierFreq_r10

      buffer.getContext().eventDispatcher.startElement("carrierFreq_r10", -1);

      carrierFreq_r10 = new ARFCN_ValueUTRA();
      carrierFreq_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq_r10", -1);

      // decode utra_BCCH_Container_r10

      buffer.getContext().eventDispatcher.startElement("utra_BCCH_Container_r10", -1);

      utra_BCCH_Container_r10 = new Asn1OctetString();
      utra_BCCH_Container_r10.decode (buffer);

      buffer.invokeCharacters(utra_BCCH_Container_r10.toString());
      buffer.getContext().eventDispatcher.endElement("utra_BCCH_Container_r10", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physCellId_r10 != null) physCellId_r10.print (_sb, "physCellId_r10", _level+1);
      if (carrierFreq_r10 != null) carrierFreq_r10.print (_sb, "carrierFreq_r10", _level+1);
      if (utra_BCCH_Container_r10 != null) utra_BCCH_Container_r10.print (_sb, "utra_BCCH_Container_r10", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
