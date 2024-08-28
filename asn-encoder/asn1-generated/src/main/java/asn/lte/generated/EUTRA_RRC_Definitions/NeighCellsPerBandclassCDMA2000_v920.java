/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NeighCellsPerBandclassCDMA2000_v920 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NeighCellsPerBandclassCDMA2000-v920";
   }

   public PhysCellIdListCDMA2000_v920 physCellIdList_v920;

   public NeighCellsPerBandclassCDMA2000_v920 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NeighCellsPerBandclassCDMA2000_v920 (
      PhysCellIdListCDMA2000_v920 physCellIdList_v920_
   ) {
      super();
      physCellIdList_v920 = physCellIdList_v920_;
   }

   public void init () {
      physCellIdList_v920 = null;
   }

   public int getElementCount() { return 1; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return physCellIdList_v920;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "physCellIdList-v920";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode physCellIdList_v920

      buffer.getContext().eventDispatcher.startElement("physCellIdList_v920", -1);

      physCellIdList_v920 = new PhysCellIdListCDMA2000_v920();
      physCellIdList_v920.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("physCellIdList_v920", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (physCellIdList_v920 != null) physCellIdList_v920.print (_sb, "physCellIdList_v920", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
