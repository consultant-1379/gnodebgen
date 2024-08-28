/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class LastVisitedEUTRANCellInformation extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LastVisitedEUTRANCellInformation";
   }

   public ECGI global_Cell_ID;
   public CellType cellType;
   public Time_UE_StayedInCell time_UE_StayedInCell;
   public LastVisitedEUTRANCellInformation_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public LastVisitedEUTRANCellInformation () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LastVisitedEUTRANCellInformation (
      ECGI global_Cell_ID_,
      CellType cellType_,
      Time_UE_StayedInCell time_UE_StayedInCell_,
      LastVisitedEUTRANCellInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      global_Cell_ID = global_Cell_ID_;
      cellType = cellType_;
      time_UE_StayedInCell = time_UE_StayedInCell_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public LastVisitedEUTRANCellInformation (
      ECGI global_Cell_ID_,
      CellType cellType_,
      Time_UE_StayedInCell time_UE_StayedInCell_
   ) {
      super();
      global_Cell_ID = global_Cell_ID_;
      cellType = cellType_;
      time_UE_StayedInCell = time_UE_StayedInCell_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LastVisitedEUTRANCellInformation (ECGI global_Cell_ID_,
      CellType cellType_,
      long time_UE_StayedInCell_,
      LastVisitedEUTRANCellInformation_iE_Extensions iE_Extensions_
   ) {
      super();
      global_Cell_ID = global_Cell_ID_;
      cellType = cellType_;
      time_UE_StayedInCell = new Time_UE_StayedInCell (time_UE_StayedInCell_);
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public LastVisitedEUTRANCellInformation (
      ECGI global_Cell_ID_,
      CellType cellType_,
      long time_UE_StayedInCell_
   ) {
      super();
      global_Cell_ID = global_Cell_ID_;
      cellType = cellType_;
      time_UE_StayedInCell = new Time_UE_StayedInCell (time_UE_StayedInCell_);
   }

   public void init () {
      global_Cell_ID = null;
      cellType = null;
      time_UE_StayedInCell = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return global_Cell_ID;
         case 1: return cellType;
         case 2: return time_UE_StayedInCell;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "global-Cell-ID";
         case 1: return "cellType";
         case 2: return "time-UE-StayedInCell";
         case 3: return "iE-Extensions";
         case 4: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // optional bits

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode global_Cell_ID

      buffer.getContext().eventDispatcher.startElement("global_Cell_ID", -1);

      global_Cell_ID = new ECGI();
      global_Cell_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("global_Cell_ID", -1);

      // decode cellType

      buffer.getContext().eventDispatcher.startElement("cellType", -1);

      cellType = new CellType();
      cellType.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellType", -1);

      // decode time_UE_StayedInCell

      buffer.getContext().eventDispatcher.startElement("time_UE_StayedInCell", -1);

      time_UE_StayedInCell = new Time_UE_StayedInCell();
      time_UE_StayedInCell.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("time_UE_StayedInCell", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new LastVisitedEUTRANCellInformation_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode unknown extension elements

         if (i < bitcnt) {
            Asn1OpenType openType = null;
            extElem1 = new Asn1OpenExt();
            int j = 0;
            while (i < bitcnt) {
               if (bitmap[i]) {
                  buffer.getContext().eventDispatcher.startElement("...", -1);

                  openType = extElem1.decodeOpenType (buffer, true, j++);

                  buffer.invokeCharacters (openType.toString());
                  buffer.getContext().eventDispatcher.endElement("...", -1);
               }
               else {
                  extElem1.setOpenType (null, j++);
               }
               i++;
            }
         }
         buffer.byteAlign ();

      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (global_Cell_ID != null) global_Cell_ID.print (_sb, "global_Cell_ID", _level+1);
      if (cellType != null) cellType.print (_sb, "cellType", _level+1);
      if (time_UE_StayedInCell != null) time_UE_StayedInCell.print (_sb, "time_UE_StayedInCell", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
