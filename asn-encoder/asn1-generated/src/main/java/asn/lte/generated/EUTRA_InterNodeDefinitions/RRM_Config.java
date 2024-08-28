/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.MeasResultServFreqListNR_r15;

public class RRM_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RRM-Config";
   }

   public RRM_Config_ue_InactiveTime ue_InactiveTime = null;  // optional
   public boolean mV2ExtPresent;
   public CandidateCellInfoList_r10 candidateCellInfoList_r10;  // optional
   public boolean mV3ExtPresent;
   public MeasResultServFreqListNR_r15 candidateCellInfoListNR_r15;  // optional
   public Asn1OpenExt extElem1;

   public RRM_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRM_Config (
      RRM_Config_ue_InactiveTime ue_InactiveTime_,
      CandidateCellInfoList_r10 candidateCellInfoList_r10_,
      MeasResultServFreqListNR_r15 candidateCellInfoListNR_r15_
   ) {
      super();
      ue_InactiveTime = ue_InactiveTime_;
      candidateCellInfoList_r10 = candidateCellInfoList_r10_;
      candidateCellInfoListNR_r15 = candidateCellInfoListNR_r15_;
   }

   public void init () {
      ue_InactiveTime = null;
      candidateCellInfoList_r10 = null;
      candidateCellInfoListNR_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ue_InactiveTime;
         case 1: return candidateCellInfoList_r10;
         case 2: return candidateCellInfoListNR_r15;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ue-InactiveTime";
         case 1: return "candidateCellInfoList-r10";
         case 2: return "candidateCellInfoListNR-r15";
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

      // optional bits

      boolean ue_InactiveTimePresent = buffer.decodeBit ("ue_InactiveTimePresent");

      // decode ue_InactiveTime

      if (ue_InactiveTimePresent) {
         buffer.getContext().eventDispatcher.startElement("ue_InactiveTime", -1);

         int tval = RRM_Config_ue_InactiveTime.decodeEnumValue (buffer);
         ue_InactiveTime = RRM_Config_ue_InactiveTime.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_InactiveTime", -1);
      }
      else {
         ue_InactiveTime = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean candidateCellInfoList_r10Present = buffer.decodeBit ("candidateCellInfoList_r10Present");

            // decode candidateCellInfoList_r10

            if (candidateCellInfoList_r10Present) {
               buffer.getContext().eventDispatcher.startElement("candidateCellInfoList_r10", -1);

               candidateCellInfoList_r10 = new CandidateCellInfoList_r10();
               candidateCellInfoList_r10.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("candidateCellInfoList_r10", -1);
            }
            else {
               candidateCellInfoList_r10 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean candidateCellInfoListNR_r15Present = buffer.decodeBit ("candidateCellInfoListNR_r15Present");

            // decode candidateCellInfoListNR_r15

            if (candidateCellInfoListNR_r15Present) {
               buffer.getContext().eventDispatcher.startElement("candidateCellInfoListNR_r15", -1);

               candidateCellInfoListNR_r15 = new MeasResultServFreqListNR_r15();
               candidateCellInfoListNR_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("candidateCellInfoListNR_r15", -1);
            }
            else {
               candidateCellInfoListNR_r15 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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
      if (ue_InactiveTime != null) ue_InactiveTime.print (_sb, "ue_InactiveTime", _level+1);
      if (candidateCellInfoList_r10 != null) candidateCellInfoList_r10.print (_sb, "candidateCellInfoList_r10", _level+1);
      if (candidateCellInfoListNR_r15 != null) candidateCellInfoListNR_r15.print (_sb, "candidateCellInfoListNR_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
