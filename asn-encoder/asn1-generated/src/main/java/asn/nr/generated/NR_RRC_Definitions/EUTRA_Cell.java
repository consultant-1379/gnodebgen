/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EUTRA_Cell extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EUTRA-Cell";
   }

   public EUTRA_CellIndex cellIndexEUTRA;
   public EUTRA_PhysCellId physCellId;
   public EUTRA_Q_OffsetRange cellIndividualOffset = null;

   public EUTRA_Cell () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EUTRA_Cell (
      EUTRA_CellIndex cellIndexEUTRA_,
      EUTRA_PhysCellId physCellId_,
      EUTRA_Q_OffsetRange cellIndividualOffset_
   ) {
      super();
      cellIndexEUTRA = cellIndexEUTRA_;
      physCellId = physCellId_;
      cellIndividualOffset = cellIndividualOffset_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EUTRA_Cell (long cellIndexEUTRA_,
      long physCellId_,
      EUTRA_Q_OffsetRange cellIndividualOffset_
   ) {
      super();
      cellIndexEUTRA = new EUTRA_CellIndex (cellIndexEUTRA_);
      physCellId = new EUTRA_PhysCellId (physCellId_);
      cellIndividualOffset = cellIndividualOffset_;
   }

   public void init () {
      cellIndexEUTRA = null;
      physCellId = null;
      cellIndividualOffset = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellIndexEUTRA;
         case 1: return physCellId;
         case 2: return cellIndividualOffset;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellIndexEUTRA";
         case 1: return "physCellId";
         case 2: return "cellIndividualOffset";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cellIndexEUTRA

      buffer.getContext().eventDispatcher.startElement("cellIndexEUTRA", -1);

      cellIndexEUTRA = new EUTRA_CellIndex();
      cellIndexEUTRA.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIndexEUTRA", -1);

      // decode physCellId

      buffer.getContext().eventDispatcher.startElement("physCellId", -1);

      physCellId = new EUTRA_PhysCellId();
      physCellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId", -1);

      // decode cellIndividualOffset

      buffer.getContext().eventDispatcher.startElement("cellIndividualOffset", -1);

      {
         int tval = EUTRA_Q_OffsetRange.decodeEnumValue (buffer);
         cellIndividualOffset = EUTRA_Q_OffsetRange.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cellIndividualOffset", -1);

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode cellIndexEUTRA

      if (cellIndexEUTRA != null) {
         buffer.getContext().eventDispatcher.startElement("cellIndexEUTRA", -1);

         cellIndexEUTRA.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellIndexEUTRA", -1);
      }
      else throw new Asn1MissingRequiredException ("cellIndexEUTRA");

      // encode physCellId

      if (physCellId != null) {
         buffer.getContext().eventDispatcher.startElement("physCellId", -1);

         physCellId.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("physCellId", -1);
      }
      else throw new Asn1MissingRequiredException ("physCellId");

      // encode cellIndividualOffset

      if (cellIndividualOffset != null) {
         buffer.getContext().eventDispatcher.startElement("cellIndividualOffset", -1);

         cellIndividualOffset.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellIndividualOffset", -1);
      }
      else throw new Asn1MissingRequiredException ("cellIndividualOffset");

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellIndexEUTRA != null) cellIndexEUTRA.print (_sb, "cellIndexEUTRA", _level+1);
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (cellIndividualOffset != null) cellIndividualOffset.print (_sb, "cellIndividualOffset", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
