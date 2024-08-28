/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel1 aggregationLevel1 = null;  // optional
   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel2 aggregationLevel2 = null;  // optional
   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel4 aggregationLevel4 = null;  // optional
   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel8 aggregationLevel8 = null;  // optional
   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel16 aggregationLevel16 = null;  // optional

   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI (
      SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel1 aggregationLevel1_,
      SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel2 aggregationLevel2_,
      SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel4 aggregationLevel4_,
      SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel8 aggregationLevel8_,
      SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel16 aggregationLevel16_
   ) {
      super();
      aggregationLevel1 = aggregationLevel1_;
      aggregationLevel2 = aggregationLevel2_;
      aggregationLevel4 = aggregationLevel4_;
      aggregationLevel8 = aggregationLevel8_;
      aggregationLevel16 = aggregationLevel16_;
   }

   public void init () {
      aggregationLevel1 = null;
      aggregationLevel2 = null;
      aggregationLevel4 = null;
      aggregationLevel8 = null;
      aggregationLevel16 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return aggregationLevel1;
         case 1: return aggregationLevel2;
         case 2: return aggregationLevel4;
         case 3: return aggregationLevel8;
         case 4: return aggregationLevel16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "aggregationLevel1";
         case 1: return "aggregationLevel2";
         case 2: return "aggregationLevel4";
         case 3: return "aggregationLevel8";
         case 4: return "aggregationLevel16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean aggregationLevel1Present = buffer.decodeBit ("aggregationLevel1Present");
      boolean aggregationLevel2Present = buffer.decodeBit ("aggregationLevel2Present");
      boolean aggregationLevel4Present = buffer.decodeBit ("aggregationLevel4Present");
      boolean aggregationLevel8Present = buffer.decodeBit ("aggregationLevel8Present");
      boolean aggregationLevel16Present = buffer.decodeBit ("aggregationLevel16Present");

      // decode aggregationLevel1

      if (aggregationLevel1Present) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel1", -1);

         int tval = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel1.decodeEnumValue (buffer);
         aggregationLevel1 = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel1.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("aggregationLevel1", -1);
      }
      else {
         aggregationLevel1 = null;
      }

      // decode aggregationLevel2

      if (aggregationLevel2Present) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel2", -1);

         int tval = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel2.decodeEnumValue (buffer);
         aggregationLevel2 = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel2.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("aggregationLevel2", -1);
      }
      else {
         aggregationLevel2 = null;
      }

      // decode aggregationLevel4

      if (aggregationLevel4Present) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel4", -1);

         int tval = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel4.decodeEnumValue (buffer);
         aggregationLevel4 = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel4.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("aggregationLevel4", -1);
      }
      else {
         aggregationLevel4 = null;
      }

      // decode aggregationLevel8

      if (aggregationLevel8Present) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel8", -1);

         int tval = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel8.decodeEnumValue (buffer);
         aggregationLevel8 = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel8.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("aggregationLevel8", -1);
      }
      else {
         aggregationLevel8 = null;
      }

      // decode aggregationLevel16

      if (aggregationLevel16Present) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel16", -1);

         int tval = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel16.decodeEnumValue (buffer);
         aggregationLevel16 = SearchSpace_searchSpaceType_common_dci_Format2_0_nrofCandidates_SFI_aggregationLevel16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("aggregationLevel16", -1);
      }
      else {
         aggregationLevel16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((aggregationLevel1 != null), null);
      buffer.encodeBit ((aggregationLevel2 != null), null);
      buffer.encodeBit ((aggregationLevel4 != null), null);
      buffer.encodeBit ((aggregationLevel8 != null), null);
      buffer.encodeBit ((aggregationLevel16 != null), null);

      // encode aggregationLevel1

      if (aggregationLevel1 != null) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel1", -1);

         aggregationLevel1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("aggregationLevel1", -1);
      }

      // encode aggregationLevel2

      if (aggregationLevel2 != null) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel2", -1);

         aggregationLevel2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("aggregationLevel2", -1);
      }

      // encode aggregationLevel4

      if (aggregationLevel4 != null) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel4", -1);

         aggregationLevel4.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("aggregationLevel4", -1);
      }

      // encode aggregationLevel8

      if (aggregationLevel8 != null) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel8", -1);

         aggregationLevel8.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("aggregationLevel8", -1);
      }

      // encode aggregationLevel16

      if (aggregationLevel16 != null) {
         buffer.getContext().eventDispatcher.startElement("aggregationLevel16", -1);

         aggregationLevel16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("aggregationLevel16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (aggregationLevel1 != null) aggregationLevel1.print (_sb, "aggregationLevel1", _level+1);
      if (aggregationLevel2 != null) aggregationLevel2.print (_sb, "aggregationLevel2", _level+1);
      if (aggregationLevel4 != null) aggregationLevel4.print (_sb, "aggregationLevel4", _level+1);
      if (aggregationLevel8 != null) aggregationLevel8.print (_sb, "aggregationLevel8", _level+1);
      if (aggregationLevel16 != null) aggregationLevel16.print (_sb, "aggregationLevel16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
