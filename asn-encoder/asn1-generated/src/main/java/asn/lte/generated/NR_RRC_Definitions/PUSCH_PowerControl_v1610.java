/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_PowerControl_v1610 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PUSCH-PowerControl-v1610";
   }

   public PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModList2_r16 pathlossReferenceRSToAddModList2_r16;  // optional
   public PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseList2_r16 pathlossReferenceRSToReleaseList2_r16;  // optional
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
      PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModList2_r16 pathlossReferenceRSToAddModList2_r16_,
      PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseList2_r16 pathlossReferenceRSToReleaseList2_r16_,
      PUSCH_PowerControl_v1610_p0_PUSCH_SetList_r16 p0_PUSCH_SetList_r16_,
      PUSCH_PowerControl_v1610_olpc_ParameterSet olpc_ParameterSet_
   ) {
      super();
      pathlossReferenceRSToAddModList2_r16 = pathlossReferenceRSToAddModList2_r16_;
      pathlossReferenceRSToReleaseList2_r16 = pathlossReferenceRSToReleaseList2_r16_;
      p0_PUSCH_SetList_r16 = p0_PUSCH_SetList_r16_;
      olpc_ParameterSet = olpc_ParameterSet_;
   }

   public void init () {
      pathlossReferenceRSToAddModList2_r16 = null;
      pathlossReferenceRSToReleaseList2_r16 = null;
      p0_PUSCH_SetList_r16 = null;
      olpc_ParameterSet = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pathlossReferenceRSToAddModList2_r16;
         case 1: return pathlossReferenceRSToReleaseList2_r16;
         case 2: return p0_PUSCH_SetList_r16;
         case 3: return olpc_ParameterSet;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pathlossReferenceRSToAddModList2-r16";
         case 1: return "pathlossReferenceRSToReleaseList2-r16";
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

      boolean pathlossReferenceRSToAddModList2_r16Present = buffer.decodeBit ("pathlossReferenceRSToAddModList2_r16Present");
      boolean pathlossReferenceRSToReleaseList2_r16Present = buffer.decodeBit ("pathlossReferenceRSToReleaseList2_r16Present");
      boolean p0_PUSCH_SetList_r16Present = buffer.decodeBit ("p0_PUSCH_SetList_r16Present");
      boolean olpc_ParameterSetPresent = buffer.decodeBit ("olpc_ParameterSetPresent");

      // decode pathlossReferenceRSToAddModList2_r16

      if (pathlossReferenceRSToAddModList2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToAddModList2_r16", -1);

         pathlossReferenceRSToAddModList2_r16 = new PUSCH_PowerControl_v1610_pathlossReferenceRSToAddModList2_r16();
         pathlossReferenceRSToAddModList2_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToAddModList2_r16", -1);
      }
      else {
         pathlossReferenceRSToAddModList2_r16 = null;
      }

      // decode pathlossReferenceRSToReleaseList2_r16

      if (pathlossReferenceRSToReleaseList2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("pathlossReferenceRSToReleaseList2_r16", -1);

         pathlossReferenceRSToReleaseList2_r16 = new PUSCH_PowerControl_v1610_pathlossReferenceRSToReleaseList2_r16();
         pathlossReferenceRSToReleaseList2_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pathlossReferenceRSToReleaseList2_r16", -1);
      }
      else {
         pathlossReferenceRSToReleaseList2_r16 = null;
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

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (pathlossReferenceRSToAddModList2_r16 != null) pathlossReferenceRSToAddModList2_r16.print (_sb, "pathlossReferenceRSToAddModList2_r16", _level+1);
      if (pathlossReferenceRSToReleaseList2_r16 != null) pathlossReferenceRSToReleaseList2_r16.print (_sb, "pathlossReferenceRSToReleaseList2_r16", _level+1);
      if (p0_PUSCH_SetList_r16 != null) p0_PUSCH_SetList_r16.print (_sb, "p0_PUSCH_SetList_r16", _level+1);
      if (olpc_ParameterSet != null) olpc_ParameterSet.print (_sb, "olpc_ParameterSet", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
