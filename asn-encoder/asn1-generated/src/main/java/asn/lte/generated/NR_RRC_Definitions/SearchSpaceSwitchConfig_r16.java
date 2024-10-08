/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpaceSwitchConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SearchSpaceSwitchConfig-r16";
   }

   public SearchSpaceSwitchConfig_r16_cellGroupsForSwitchList_r16 cellGroupsForSwitchList_r16;  // optional
   public Asn1Integer searchSpaceSwitchDelay_r16;  // optional

   public SearchSpaceSwitchConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SearchSpaceSwitchConfig_r16 (
      SearchSpaceSwitchConfig_r16_cellGroupsForSwitchList_r16 cellGroupsForSwitchList_r16_,
      Asn1Integer searchSpaceSwitchDelay_r16_
   ) {
      super();
      cellGroupsForSwitchList_r16 = cellGroupsForSwitchList_r16_;
      searchSpaceSwitchDelay_r16 = searchSpaceSwitchDelay_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SearchSpaceSwitchConfig_r16 (SearchSpaceSwitchConfig_r16_cellGroupsForSwitchList_r16 cellGroupsForSwitchList_r16_,
      long searchSpaceSwitchDelay_r16_
   ) {
      super();
      cellGroupsForSwitchList_r16 = cellGroupsForSwitchList_r16_;
      searchSpaceSwitchDelay_r16 = new Asn1Integer (searchSpaceSwitchDelay_r16_);
   }

   public void init () {
      cellGroupsForSwitchList_r16 = null;
      searchSpaceSwitchDelay_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellGroupsForSwitchList_r16;
         case 1: return searchSpaceSwitchDelay_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellGroupsForSwitchList-r16";
         case 1: return "searchSpaceSwitchDelay-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean cellGroupsForSwitchList_r16Present = buffer.decodeBit ("cellGroupsForSwitchList_r16Present");
      boolean searchSpaceSwitchDelay_r16Present = buffer.decodeBit ("searchSpaceSwitchDelay_r16Present");

      // decode cellGroupsForSwitchList_r16

      if (cellGroupsForSwitchList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("cellGroupsForSwitchList_r16", -1);

         cellGroupsForSwitchList_r16 = new SearchSpaceSwitchConfig_r16_cellGroupsForSwitchList_r16();
         cellGroupsForSwitchList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellGroupsForSwitchList_r16", -1);
      }
      else {
         cellGroupsForSwitchList_r16 = null;
      }

      // decode searchSpaceSwitchDelay_r16

      if (searchSpaceSwitchDelay_r16Present) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceSwitchDelay_r16", -1);

         searchSpaceSwitchDelay_r16 = new Asn1Integer();
         searchSpaceSwitchDelay_r16.decode (buffer, 10, 52);

         buffer.invokeCharacters(searchSpaceSwitchDelay_r16.toString());
         buffer.getContext().eventDispatcher.endElement("searchSpaceSwitchDelay_r16", -1);
      }
      else {
         searchSpaceSwitchDelay_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (cellGroupsForSwitchList_r16 != null) cellGroupsForSwitchList_r16.print (_sb, "cellGroupsForSwitchList_r16", _level+1);
      if (searchSpaceSwitchDelay_r16 != null) searchSpaceSwitchDelay_r16.print (_sb, "searchSpaceSwitchDelay_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
