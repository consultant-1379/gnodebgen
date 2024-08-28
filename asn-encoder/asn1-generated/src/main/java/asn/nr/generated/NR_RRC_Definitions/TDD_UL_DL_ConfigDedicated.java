/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_UL_DL_ConfigDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TDD-UL-DL-ConfigDedicated";
   }

   public TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToAddModList slotSpecificConfigurationsToAddModList;  // optional
   public TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToReleaseList slotSpecificConfigurationsToReleaseList;  // optional
   public Asn1OpenExt extElem1;

   public TDD_UL_DL_ConfigDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TDD_UL_DL_ConfigDedicated (
      TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToAddModList slotSpecificConfigurationsToAddModList_,
      TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToReleaseList slotSpecificConfigurationsToReleaseList_
   ) {
      super();
      slotSpecificConfigurationsToAddModList = slotSpecificConfigurationsToAddModList_;
      slotSpecificConfigurationsToReleaseList = slotSpecificConfigurationsToReleaseList_;
   }

   public void init () {
      slotSpecificConfigurationsToAddModList = null;
      slotSpecificConfigurationsToReleaseList = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return slotSpecificConfigurationsToAddModList;
         case 1: return slotSpecificConfigurationsToReleaseList;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "slotSpecificConfigurationsToAddModList";
         case 1: return "slotSpecificConfigurationsToReleaseList";
         case 2: return null;
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

      boolean slotSpecificConfigurationsToAddModListPresent = buffer.decodeBit ("slotSpecificConfigurationsToAddModListPresent");
      boolean slotSpecificConfigurationsToReleaseListPresent = buffer.decodeBit ("slotSpecificConfigurationsToReleaseListPresent");

      // decode slotSpecificConfigurationsToAddModList

      if (slotSpecificConfigurationsToAddModListPresent) {
         buffer.getContext().eventDispatcher.startElement("slotSpecificConfigurationsToAddModList", -1);

         slotSpecificConfigurationsToAddModList = new TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToAddModList();
         slotSpecificConfigurationsToAddModList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("slotSpecificConfigurationsToAddModList", -1);
      }
      else {
         slotSpecificConfigurationsToAddModList = null;
      }

      // decode slotSpecificConfigurationsToReleaseList

      if (slotSpecificConfigurationsToReleaseListPresent) {
         buffer.getContext().eventDispatcher.startElement("slotSpecificConfigurationsToReleaseList", -1);

         slotSpecificConfigurationsToReleaseList = new TDD_UL_DL_ConfigDedicated_slotSpecificConfigurationsToReleaseList();
         slotSpecificConfigurationsToReleaseList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("slotSpecificConfigurationsToReleaseList", -1);
      }
      else {
         slotSpecificConfigurationsToReleaseList = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((slotSpecificConfigurationsToAddModList != null), null);
      buffer.encodeBit ((slotSpecificConfigurationsToReleaseList != null), null);

      // encode slotSpecificConfigurationsToAddModList

      if (slotSpecificConfigurationsToAddModList != null) {
         buffer.getContext().eventDispatcher.startElement("slotSpecificConfigurationsToAddModList", -1);

         slotSpecificConfigurationsToAddModList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("slotSpecificConfigurationsToAddModList", -1);
      }

      // encode slotSpecificConfigurationsToReleaseList

      if (slotSpecificConfigurationsToReleaseList != null) {
         buffer.getContext().eventDispatcher.startElement("slotSpecificConfigurationsToReleaseList", -1);

         slotSpecificConfigurationsToReleaseList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("slotSpecificConfigurationsToReleaseList", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (slotSpecificConfigurationsToAddModList != null) slotSpecificConfigurationsToAddModList.print (_sb, "slotSpecificConfigurationsToAddModList", _level+1);
      if (slotSpecificConfigurationsToReleaseList != null) slotSpecificConfigurationsToReleaseList.print (_sb, "slotSpecificConfigurationsToReleaseList", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
