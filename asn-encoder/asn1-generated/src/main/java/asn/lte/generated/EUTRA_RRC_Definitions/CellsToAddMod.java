/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellsToAddMod extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellsToAddMod";
   }

   public Asn1Integer cellIndex;
   public PhysCellId physCellId;
   public Q_OffsetRange cellIndividualOffset = null;

   public CellsToAddMod () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellsToAddMod (
      Asn1Integer cellIndex_,
      PhysCellId physCellId_,
      Q_OffsetRange cellIndividualOffset_
   ) {
      super();
      cellIndex = cellIndex_;
      physCellId = physCellId_;
      cellIndividualOffset = cellIndividualOffset_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CellsToAddMod (long cellIndex_,
      long physCellId_,
      Q_OffsetRange cellIndividualOffset_
   ) {
      super();
      cellIndex = new Asn1Integer (cellIndex_);
      physCellId = new PhysCellId (physCellId_);
      cellIndividualOffset = cellIndividualOffset_;
   }

   public void init () {
      cellIndex = null;
      physCellId = null;
      cellIndividualOffset = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellIndex;
         case 1: return physCellId;
         case 2: return cellIndividualOffset;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellIndex";
         case 1: return "physCellId";
         case 2: return "cellIndividualOffset";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode cellIndex

      buffer.getContext().eventDispatcher.startElement("cellIndex", -1);

      cellIndex = new Asn1Integer();
      cellIndex.decode (buffer, 1, 32);

      buffer.invokeCharacters(cellIndex.toString());
      buffer.getContext().eventDispatcher.endElement("cellIndex", -1);

      // decode physCellId

      buffer.getContext().eventDispatcher.startElement("physCellId", -1);

      physCellId = new PhysCellId();
      physCellId.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellId", -1);

      // decode cellIndividualOffset

      buffer.getContext().eventDispatcher.startElement("cellIndividualOffset", -1);

      {
         int tval = Q_OffsetRange.decodeEnumValue (buffer);
         cellIndividualOffset = Q_OffsetRange.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cellIndividualOffset", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellIndex != null) cellIndex.print (_sb, "cellIndex", _level+1);
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (cellIndividualOffset != null) cellIndividualOffset.print (_sb, "cellIndividualOffset", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
