/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_PowerControl_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-PowerControl-v1610";
   }

   public PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModListSizeExt_v1610 pathlossReferenceRSToAddModListSizeExt_v1610;  // optional
   public PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseListSizeExt_v1610 pathlossReferenceRSToReleaseListSizeExt_v1610;  // optional
   public PUSCH_PowerControl_v1610_p0_PUSCH_SetList_r16 p0_PUSCH_SetList_r16;  // optional
   public PUSCH_PowerControl_v1610_olpc_ParameterSet olpc_ParameterSet;  // optional
   public Asn1OpenExt extElem1;

   public PUSCH_PowerControl_v1610 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PUSCH_PowerControl_v1610 (
      PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModListSizeExt_v1610 pathlossReferenceRSToAddModListSizeExt_v1610_,
      PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseListSizeExt_v1610 pathlossReferenceRSToReleaseListSizeExt_v1610_,
      PUSCH_PowerControl_v1610_p0_PUSCH_SetList_r16 p0_PUSCH_SetList_r16_,
      PUSCH_PowerControl_v1610_olpc_ParameterSet olpc_ParameterSet_
   ) {
      super();
      pathlossReferenceRSToAddModListSizeExt_v1610 = pathlossReferenceRSToAddModListSizeExt_v1610_;
      pathlossReferenceRSToReleaseListSizeExt_v1610 = pathlossReferenceRSToReleaseListSizeExt_v1610_;
      p0_PUSCH_SetList_r16 = p0_PUSCH_SetList_r16_;
      olpc_ParameterSet = olpc_ParameterSet_;
   }

   public void init () {
      pathlossReferenceRSToAddModListSizeExt_v1610 = null;
      pathlossReferenceRSToReleaseListSizeExt_v1610 = null;
      p0_PUSCH_SetList_r16 = null;
      olpc_ParameterSet = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pathlossReferenceRSToAddModListSizeExt_v1610;
         case 1: return pathlossReferenceRSToReleaseListSizeExt_v1610;
         case 2: return p0_PUSCH_SetList_r16;
         case 3: return olpc_ParameterSet;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pathlossReferenceRSToAddModListSizeExt-v1610";
         case 1: return "pathlossReferenceRSToReleaseListSizeExt-v1610";
         case 2: return "p0-PUSCH-SetList-r16";
         case 3: return "olpc-ParameterSet";
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

      boolean pathlossReferenceRSToAddModListSizeExt_v1610Present = buffer.decodeBit ("pathlossReferenceRSToAddModListSizeExt_v1610Present");
      boolean pathlossReferenceRSToReleaseListSizeExt_v1610Present = buffer.decodeBit ("pathlossReferenceRSToReleaseListSizeExt_v1610Present");
      boolean p0_PUSCH_SetList_r16Present = buffer.decodeBit ("p0_PUSCH_SetList_r16Present");
      boolean olpc_ParameterSetPresent = buffer.decodeBit ("olpc_ParameterSetPresent");

      // decode pathlossReferenceRSToAddModListSizeExt_v1610

      if (pathlossReferenceRSToAddModListSizeExt_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToAddModListSizeExt_v1610", -1);

         pathlossReferenceRSToAddModListSizeExt_v1610 = new PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModListSizeExt_v1610();
         pathlossReferenceRSToAddModListSizeExt_v1610.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToAddModListSizeExt_v1610", -1);
      }
      else {
         pathlossReferenceRSToAddModListSizeExt_v1610 = null;
      }

      // decode pathlossReferenceRSToReleaseListSizeExt_v1610

      if (pathlossReferenceRSToReleaseListSizeExt_v1610Present) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToReleaseListSizeExt_v1610", -1);

         pathlossReferenceRSToReleaseListSizeExt_v1610 = new PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseListSizeExt_v1610();
         pathlossReferenceRSToReleaseListSizeExt_v1610.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToReleaseListSizeExt_v1610", -1);
      }
      else {
         pathlossReferenceRSToReleaseListSizeExt_v1610 = null;
      }

      // decode p0_PUSCH_SetList_r16

      if (p0_PUSCH_SetList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("p0_PUSCH_SetList_r16", -1);

         p0_PUSCH_SetList_r16 = new PUSCH_PowerControl_v1610_p0_PUSCH_SetList_r16();
         p0_PUSCH_SetList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p0_PUSCH_SetList_r16", -1);
      }
      else {
         p0_PUSCH_SetList_r16 = null;
      }

      // decode olpc_ParameterSet

      if (olpc_ParameterSetPresent) {
         buffer.getContext().eventDispatcher.startElement("olpc_ParameterSet", -1);

         olpc_ParameterSet = new PUSCH_PowerControl_v1610_olpc_ParameterSet();
         olpc_ParameterSet.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("olpc_ParameterSet", -1);
      }
      else {
         olpc_ParameterSet = null;
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

      buffer.encodeBit ((pathlossReferenceRSToAddModListSizeExt_v1610 != null), null);
      buffer.encodeBit ((pathlossReferenceRSToReleaseListSizeExt_v1610 != null), null);
      buffer.encodeBit ((p0_PUSCH_SetList_r16 != null), null);
      buffer.encodeBit ((olpc_ParameterSet != null), null);

      // encode pathlossReferenceRSToAddModListSizeExt_v1610

      if (pathlossReferenceRSToAddModListSizeExt_v1610 != null) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToAddModListSizeExt_v1610", -1);

         pathlossReferenceRSToAddModListSizeExt_v1610.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToAddModListSizeExt_v1610", -1);
      }

      // encode pathlossReferenceRSToReleaseListSizeExt_v1610

      if (pathlossReferenceRSToReleaseListSizeExt_v1610 != null) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToReleaseListSizeExt_v1610", -1);

         pathlossReferenceRSToReleaseListSizeExt_v1610.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToReleaseListSizeExt_v1610", -1);
      }

      // encode p0_PUSCH_SetList_r16

      if (p0_PUSCH_SetList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("p0_PUSCH_SetList_r16", -1);

         p0_PUSCH_SetList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("p0_PUSCH_SetList_r16", -1);
      }

      // encode olpc_ParameterSet

      if (olpc_ParameterSet != null) {
         buffer.getContext().eventDispatcher.startElement("olpc_ParameterSet", -1);

         olpc_ParameterSet.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("olpc_ParameterSet", -1);
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
      if (pathlossReferenceRSToAddModListSizeExt_v1610 != null) pathlossReferenceRSToAddModListSizeExt_v1610.print (_sb, "pathlossReferenceRSToAddModListSizeExt_v1610", _level+1);
      if (pathlossReferenceRSToReleaseListSizeExt_v1610 != null) pathlossReferenceRSToReleaseListSizeExt_v1610.print (_sb, "pathlossReferenceRSToReleaseListSizeExt_v1610", _level+1);
      if (p0_PUSCH_SetList_r16 != null) p0_PUSCH_SetList_r16.print (_sb, "p0_PUSCH_SetList_r16", _level+1);
      if (olpc_ParameterSet != null) olpc_ParameterSet.print (_sb, "olpc_ParameterSet", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
