/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NAICS_AssistanceInfo_r12_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public NeighCellsToReleaseList_r12 neighCellsToReleaseList_r12;  // optional
   public NeighCellsToAddModList_r12 neighCellsToAddModList_r12;  // optional
   public P_a servCellp_a_r12 = null;  // optional

   public NAICS_AssistanceInfo_r12_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NAICS_AssistanceInfo_r12_setup (
      NeighCellsToReleaseList_r12 neighCellsToReleaseList_r12_,
      NeighCellsToAddModList_r12 neighCellsToAddModList_r12_,
      P_a servCellp_a_r12_
   ) {
      super();
      neighCellsToReleaseList_r12 = neighCellsToReleaseList_r12_;
      neighCellsToAddModList_r12 = neighCellsToAddModList_r12_;
      servCellp_a_r12 = servCellp_a_r12_;
   }

   public void init () {
      neighCellsToReleaseList_r12 = null;
      neighCellsToAddModList_r12 = null;
      servCellp_a_r12 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return neighCellsToReleaseList_r12;
         case 1: return neighCellsToAddModList_r12;
         case 2: return servCellp_a_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "neighCellsToReleaseList-r12";
         case 1: return "neighCellsToAddModList-r12";
         case 2: return "servCellp-a-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean neighCellsToReleaseList_r12Present = buffer.decodeBit ("neighCellsToReleaseList_r12Present");
      boolean neighCellsToAddModList_r12Present = buffer.decodeBit ("neighCellsToAddModList_r12Present");
      boolean servCellp_a_r12Present = buffer.decodeBit ("servCellp_a_r12Present");

      // decode neighCellsToReleaseList_r12

      if (neighCellsToReleaseList_r12Present) {
         buffer.getContext().eventDispatcher.startElement("neighCellsToReleaseList_r12", -1);

         neighCellsToReleaseList_r12 = new NeighCellsToReleaseList_r12();
         neighCellsToReleaseList_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("neighCellsToReleaseList_r12", -1);
      }
      else {
         neighCellsToReleaseList_r12 = null;
      }

      // decode neighCellsToAddModList_r12

      if (neighCellsToAddModList_r12Present) {
         buffer.getContext().eventDispatcher.startElement("neighCellsToAddModList_r12", -1);

         neighCellsToAddModList_r12 = new NeighCellsToAddModList_r12();
         neighCellsToAddModList_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("neighCellsToAddModList_r12", -1);
      }
      else {
         neighCellsToAddModList_r12 = null;
      }

      // decode servCellp_a_r12

      if (servCellp_a_r12Present) {
         buffer.getContext().eventDispatcher.startElement("servCellp_a_r12", -1);

         int tval = P_a.decodeEnumValue (buffer);
         servCellp_a_r12 = P_a.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("servCellp_a_r12", -1);
      }
      else {
         servCellp_a_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (neighCellsToReleaseList_r12 != null) neighCellsToReleaseList_r12.print (_sb, "neighCellsToReleaseList_r12", _level+1);
      if (neighCellsToAddModList_r12 != null) neighCellsToAddModList_r12.print (_sb, "neighCellsToAddModList_r12", _level+1);
      if (servCellp_a_r12 != null) servCellp_a_r12.print (_sb, "servCellp_a_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
