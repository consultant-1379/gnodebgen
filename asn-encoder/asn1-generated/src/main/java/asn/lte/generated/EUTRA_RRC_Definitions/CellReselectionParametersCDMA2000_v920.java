/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CellReselectionParametersCDMA2000_v920 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellReselectionParametersCDMA2000-v920";
   }

   public NeighCellListCDMA2000_v920 neighCellList_v920;

   public CellReselectionParametersCDMA2000_v920 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellReselectionParametersCDMA2000_v920 (
      NeighCellListCDMA2000_v920 neighCellList_v920_
   ) {
      super();
      neighCellList_v920 = neighCellList_v920_;
   }

   public void init () {
      neighCellList_v920 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return neighCellList_v920;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "neighCellList-v920";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode neighCellList_v920

      buffer.getContext().eventDispatcher.startElement("neighCellList_v920", -1);

      neighCellList_v920 = new NeighCellListCDMA2000_v920();
      neighCellList_v920.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("neighCellList_v920", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (neighCellList_v920 != null) neighCellList_v920.print (_sb, "neighCellList_v920", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
