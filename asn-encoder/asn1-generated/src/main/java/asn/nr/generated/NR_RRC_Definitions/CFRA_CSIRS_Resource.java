/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CFRA_CSIRS_Resource extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CFRA-CSIRS-Resource";
   }

   public CSI_RS_Index csi_RS;
   public CFRA_CSIRS_Resource_ra_OccasionList ra_OccasionList;
   public Asn1Integer ra_PreambleIndex;
   public Asn1OpenExt extElem1;

   public CFRA_CSIRS_Resource () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CFRA_CSIRS_Resource (
      CSI_RS_Index csi_RS_,
      CFRA_CSIRS_Resource_ra_OccasionList ra_OccasionList_,
      Asn1Integer ra_PreambleIndex_
   ) {
      super();
      csi_RS = csi_RS_;
      ra_OccasionList = ra_OccasionList_;
      ra_PreambleIndex = ra_PreambleIndex_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CFRA_CSIRS_Resource (long csi_RS_,
      CFRA_CSIRS_Resource_ra_OccasionList ra_OccasionList_,
      long ra_PreambleIndex_
   ) {
      super();
      csi_RS = new CSI_RS_Index (csi_RS_);
      ra_OccasionList = ra_OccasionList_;
      ra_PreambleIndex = new Asn1Integer (ra_PreambleIndex_);
   }

   public void init () {
      csi_RS = null;
      ra_OccasionList = null;
      ra_PreambleIndex = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_RS;
         case 1: return ra_OccasionList;
         case 2: return ra_PreambleIndex;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-RS";
         case 1: return "ra-OccasionList";
         case 2: return "ra-PreambleIndex";
         case 3: return null;
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // extension bit

      boolean extbit = buffer.decodeBit ("extbit");

      // decode csi_RS

      buffer.getContext().eventDispatcher.startElement("csi_RS", -1);

      csi_RS = new CSI_RS_Index();
      csi_RS.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("csi_RS", -1);

      // decode ra_OccasionList

      buffer.getContext().eventDispatcher.startElement("ra_OccasionList", -1);

      ra_OccasionList = new CFRA_CSIRS_Resource_ra_OccasionList();
      ra_OccasionList.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ra_OccasionList", -1);

      // decode ra_PreambleIndex

      buffer.getContext().eventDispatcher.startElement("ra_PreambleIndex", -1);

      ra_PreambleIndex = new Asn1Integer();
      ra_PreambleIndex.decode (buffer, 0, 63);

      buffer.invokeCharacters(ra_PreambleIndex.toString());
      buffer.getContext().eventDispatcher.endElement("ra_PreambleIndex", -1);

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

      // encode csi_RS

      if (csi_RS != null) {
         buffer.getContext().eventDispatcher.startElement("csi_RS", -1);

         csi_RS.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("csi_RS", -1);
      }
      else throw new Asn1MissingRequiredException ("csi_RS");

      // encode ra_OccasionList

      if (ra_OccasionList != null) {
         buffer.getContext().eventDispatcher.startElement("ra_OccasionList", -1);

         ra_OccasionList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_OccasionList", -1);
      }
      else throw new Asn1MissingRequiredException ("ra_OccasionList");

      // encode ra_PreambleIndex

      if (ra_PreambleIndex != null) {
         buffer.getContext().eventDispatcher.startElement("ra_PreambleIndex", -1);

         ra_PreambleIndex.encode (buffer, 0, 63);

         buffer.getContext().eventDispatcher.endElement("ra_PreambleIndex", -1);
      }
      else throw new Asn1MissingRequiredException ("ra_PreambleIndex");

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
      if (csi_RS != null) csi_RS.print (_sb, "csi_RS", _level+1);
      if (ra_OccasionList != null) ra_OccasionList.print (_sb, "ra_OccasionList", _level+1);
      if (ra_PreambleIndex != null) ra_PreambleIndex.print (_sb, "ra_PreambleIndex", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
