/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpaceExt_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SearchSpaceExt-r16";
   }

   public ControlResourceSetId_r16 controlResourceSetId_r16;  // optional
   public SearchSpaceExt_r16_searchSpaceType_r16 searchSpaceType_r16;  // optional
   public SearchSpaceExt_r16_searchSpaceGroupIdList_r16 searchSpaceGroupIdList_r16;  // optional
   public Asn1BitString freqMonitorLocations_r16;  // optional

   public SearchSpaceExt_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SearchSpaceExt_r16 (
      ControlResourceSetId_r16 controlResourceSetId_r16_,
      SearchSpaceExt_r16_searchSpaceType_r16 searchSpaceType_r16_,
      SearchSpaceExt_r16_searchSpaceGroupIdList_r16 searchSpaceGroupIdList_r16_,
      Asn1BitString freqMonitorLocations_r16_
   ) {
      super();
      controlResourceSetId_r16 = controlResourceSetId_r16_;
      searchSpaceType_r16 = searchSpaceType_r16_;
      searchSpaceGroupIdList_r16 = searchSpaceGroupIdList_r16_;
      freqMonitorLocations_r16 = freqMonitorLocations_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SearchSpaceExt_r16 (long controlResourceSetId_r16_,
      SearchSpaceExt_r16_searchSpaceType_r16 searchSpaceType_r16_,
      SearchSpaceExt_r16_searchSpaceGroupIdList_r16 searchSpaceGroupIdList_r16_,
      Asn1BitString freqMonitorLocations_r16_
   ) {
      super();
      controlResourceSetId_r16 = new ControlResourceSetId_r16 (controlResourceSetId_r16_);
      searchSpaceType_r16 = searchSpaceType_r16_;
      searchSpaceGroupIdList_r16 = searchSpaceGroupIdList_r16_;
      freqMonitorLocations_r16 = freqMonitorLocations_r16_;
   }

   public void init () {
      controlResourceSetId_r16 = null;
      searchSpaceType_r16 = null;
      searchSpaceGroupIdList_r16 = null;
      freqMonitorLocations_r16 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return controlResourceSetId_r16;
         case 1: return searchSpaceType_r16;
         case 2: return searchSpaceGroupIdList_r16;
         case 3: return freqMonitorLocations_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "controlResourceSetId-r16";
         case 1: return "searchSpaceType-r16";
         case 2: return "searchSpaceGroupIdList-r16";
         case 3: return "freqMonitorLocations-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean controlResourceSetId_r16Present = buffer.decodeBit ("controlResourceSetId_r16Present");
      boolean searchSpaceType_r16Present = buffer.decodeBit ("searchSpaceType_r16Present");
      boolean searchSpaceGroupIdList_r16Present = buffer.decodeBit ("searchSpaceGroupIdList_r16Present");
      boolean freqMonitorLocations_r16Present = buffer.decodeBit ("freqMonitorLocations_r16Present");

      // decode controlResourceSetId_r16

      if (controlResourceSetId_r16Present) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetId_r16", -1);

         controlResourceSetId_r16 = new ControlResourceSetId_r16();
         controlResourceSetId_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("controlResourceSetId_r16", -1);
      }
      else {
         controlResourceSetId_r16 = null;
      }

      // decode searchSpaceType_r16

      if (searchSpaceType_r16Present) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceType_r16", -1);

         searchSpaceType_r16 = new SearchSpaceExt_r16_searchSpaceType_r16();
         searchSpaceType_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("searchSpaceType_r16", -1);
      }
      else {
         searchSpaceType_r16 = null;
      }

      // decode searchSpaceGroupIdList_r16

      if (searchSpaceGroupIdList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceGroupIdList_r16", -1);

         searchSpaceGroupIdList_r16 = new SearchSpaceExt_r16_searchSpaceGroupIdList_r16();
         searchSpaceGroupIdList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("searchSpaceGroupIdList_r16", -1);
      }
      else {
         searchSpaceGroupIdList_r16 = null;
      }

      // decode freqMonitorLocations_r16

      if (freqMonitorLocations_r16Present) {
         buffer.getContext().eventDispatcher.startElement("freqMonitorLocations_r16", -1);

         freqMonitorLocations_r16 = new Asn1BitString();
         freqMonitorLocations_r16.decode (buffer, 5, 5);

         buffer.invokeCharacters(freqMonitorLocations_r16.toString());
         buffer.getContext().eventDispatcher.endElement("freqMonitorLocations_r16", -1);
      }
      else {
         freqMonitorLocations_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((controlResourceSetId_r16 != null), null);
      buffer.encodeBit ((searchSpaceType_r16 != null), null);
      buffer.encodeBit ((searchSpaceGroupIdList_r16 != null), null);
      buffer.encodeBit ((freqMonitorLocations_r16 != null), null);

      // encode controlResourceSetId_r16

      if (controlResourceSetId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("controlResourceSetId_r16", -1);

         controlResourceSetId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("controlResourceSetId_r16", -1);
      }

      // encode searchSpaceType_r16

      if (searchSpaceType_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceType_r16", -1);

         searchSpaceType_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("searchSpaceType_r16", -1);
      }

      // encode searchSpaceGroupIdList_r16

      if (searchSpaceGroupIdList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("searchSpaceGroupIdList_r16", -1);

         searchSpaceGroupIdList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("searchSpaceGroupIdList_r16", -1);
      }

      // encode freqMonitorLocations_r16

      if (freqMonitorLocations_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("freqMonitorLocations_r16", -1);

         freqMonitorLocations_r16.encode (buffer, 5, 5);

         buffer.getContext().eventDispatcher.endElement("freqMonitorLocations_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (controlResourceSetId_r16 != null) controlResourceSetId_r16.print (_sb, "controlResourceSetId_r16", _level+1);
      if (searchSpaceType_r16 != null) searchSpaceType_r16.print (_sb, "searchSpaceType_r16", _level+1);
      if (searchSpaceGroupIdList_r16 != null) searchSpaceGroupIdList_r16.print (_sb, "searchSpaceGroupIdList_r16", _level+1);
      if (freqMonitorLocations_r16 != null) freqMonitorLocations_r16.print (_sb, "freqMonitorLocations_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
