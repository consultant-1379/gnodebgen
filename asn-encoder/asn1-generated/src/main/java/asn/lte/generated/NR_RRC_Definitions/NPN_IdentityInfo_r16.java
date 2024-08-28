/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class NPN_IdentityInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NPN-IdentityInfo-r16";
   }

   public NPN_IdentityInfo_r16_npn_IdentityList_r16 npn_IdentityList_r16;
   public TrackingAreaCode trackingAreaCode_r16;
   public RAN_AreaCode ranac_r16;  // optional
   public CellIdentity cellIdentity_r16;
   public NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16 cellReservedForOperatorUse_r16 = null;
   public NPN_IdentityInfo_r16_iab_Support_r16 iab_Support_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public NPN_IdentityInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public NPN_IdentityInfo_r16 (
      NPN_IdentityInfo_r16_npn_IdentityList_r16 npn_IdentityList_r16_,
      TrackingAreaCode trackingAreaCode_r16_,
      RAN_AreaCode ranac_r16_,
      CellIdentity cellIdentity_r16_,
      NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16 cellReservedForOperatorUse_r16_,
      NPN_IdentityInfo_r16_iab_Support_r16 iab_Support_r16_
   ) {
      super();
      npn_IdentityList_r16 = npn_IdentityList_r16_;
      trackingAreaCode_r16 = trackingAreaCode_r16_;
      ranac_r16 = ranac_r16_;
      cellIdentity_r16 = cellIdentity_r16_;
      cellReservedForOperatorUse_r16 = cellReservedForOperatorUse_r16_;
      iab_Support_r16 = iab_Support_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public NPN_IdentityInfo_r16 (
      NPN_IdentityInfo_r16_npn_IdentityList_r16 npn_IdentityList_r16_,
      TrackingAreaCode trackingAreaCode_r16_,
      CellIdentity cellIdentity_r16_,
      NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16 cellReservedForOperatorUse_r16_
   ) {
      super();
      npn_IdentityList_r16 = npn_IdentityList_r16_;
      trackingAreaCode_r16 = trackingAreaCode_r16_;
      cellIdentity_r16 = cellIdentity_r16_;
      cellReservedForOperatorUse_r16 = cellReservedForOperatorUse_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public NPN_IdentityInfo_r16 (NPN_IdentityInfo_r16_npn_IdentityList_r16 npn_IdentityList_r16_,
      TrackingAreaCode trackingAreaCode_r16_,
      long ranac_r16_,
      CellIdentity cellIdentity_r16_,
      NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16 cellReservedForOperatorUse_r16_,
      NPN_IdentityInfo_r16_iab_Support_r16 iab_Support_r16_
   ) {
      super();
      npn_IdentityList_r16 = npn_IdentityList_r16_;
      trackingAreaCode_r16 = trackingAreaCode_r16_;
      ranac_r16 = new RAN_AreaCode (ranac_r16_);
      cellIdentity_r16 = cellIdentity_r16_;
      cellReservedForOperatorUse_r16 = cellReservedForOperatorUse_r16_;
      iab_Support_r16 = iab_Support_r16_;
   }

   public void init () {
      npn_IdentityList_r16 = null;
      trackingAreaCode_r16 = null;
      ranac_r16 = null;
      cellIdentity_r16 = null;
      cellReservedForOperatorUse_r16 = null;
      iab_Support_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return npn_IdentityList_r16;
         case 1: return trackingAreaCode_r16;
         case 2: return ranac_r16;
         case 3: return cellIdentity_r16;
         case 4: return cellReservedForOperatorUse_r16;
         case 5: return iab_Support_r16;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "npn-IdentityList-r16";
         case 1: return "trackingAreaCode-r16";
         case 2: return "ranac-r16";
         case 3: return "cellIdentity-r16";
         case 4: return "cellReservedForOperatorUse-r16";
         case 5: return "iab-Support-r16";
         case 6: return null;
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

      boolean ranac_r16Present = buffer.decodeBit ("ranac_r16Present");
      boolean iab_Support_r16Present = buffer.decodeBit ("iab_Support_r16Present");

      // decode npn_IdentityList_r16

      buffer.getContext().eventDispatcher.startElement("npn_IdentityList_r16", -1);

      npn_IdentityList_r16 = new NPN_IdentityInfo_r16_npn_IdentityList_r16();
      npn_IdentityList_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("npn_IdentityList_r16", -1);

      // decode trackingAreaCode_r16

      buffer.getContext().eventDispatcher.startElement("trackingAreaCode_r16", -1);

      trackingAreaCode_r16 = new TrackingAreaCode();
      trackingAreaCode_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("trackingAreaCode_r16", -1);

      // decode ranac_r16

      if (ranac_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ranac_r16", -1);

         ranac_r16 = new RAN_AreaCode();
         ranac_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ranac_r16", -1);
      }
      else {
         ranac_r16 = null;
      }

      // decode cellIdentity_r16

      buffer.getContext().eventDispatcher.startElement("cellIdentity_r16", -1);

      cellIdentity_r16 = new CellIdentity();
      cellIdentity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellIdentity_r16", -1);

      // decode cellReservedForOperatorUse_r16

      buffer.getContext().eventDispatcher.startElement("cellReservedForOperatorUse_r16", -1);

      {
         int tval = NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16.decodeEnumValue (buffer);
         cellReservedForOperatorUse_r16 = NPN_IdentityInfo_r16_cellReservedForOperatorUse_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("cellReservedForOperatorUse_r16", -1);

      // decode iab_Support_r16

      if (iab_Support_r16Present) {
         buffer.getContext().eventDispatcher.startElement("iab_Support_r16", -1);

         int tval = NPN_IdentityInfo_r16_iab_Support_r16.decodeEnumValue (buffer);
         iab_Support_r16 = NPN_IdentityInfo_r16_iab_Support_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("iab_Support_r16", -1);
      }
      else {
         iab_Support_r16 = null;
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
      if (npn_IdentityList_r16 != null) npn_IdentityList_r16.print (_sb, "npn_IdentityList_r16", _level+1);
      if (trackingAreaCode_r16 != null) trackingAreaCode_r16.print (_sb, "trackingAreaCode_r16", _level+1);
      if (ranac_r16 != null) ranac_r16.print (_sb, "ranac_r16", _level+1);
      if (cellIdentity_r16 != null) cellIdentity_r16.print (_sb, "cellIdentity_r16", _level+1);
      if (cellReservedForOperatorUse_r16 != null) cellReservedForOperatorUse_r16.print (_sb, "cellReservedForOperatorUse_r16", _level+1);
      if (iab_Support_r16 != null) iab_Support_r16.print (_sb, "iab_Support_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
