/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType3_NB_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType3-NB-r13";
   }

   public SystemInformationBlockType3_NB_r13_cellReselectionInfoCommon_r13 cellReselectionInfoCommon_r13;
   public SystemInformationBlockType3_NB_r13_cellReselectionServingFreqInfo_r13 cellReselectionServingFreqInfo_r13;
   public SystemInformationBlockType3_NB_r13_intraFreqCellReselectionInfo_r13 intraFreqCellReselectionInfo_r13;
   public NS_PmaxList_NB_r13 freqBandInfo_r13;  // optional
   public SystemInformationBlockType3_NB_r13_multiBandInfoList_r13 multiBandInfoList_r13;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public boolean mV2ExtPresent;
   public IntraFreqCellReselectionInfo_NB_v1350 intraFreqCellReselectionInfo_v1350;  // optional
   public boolean mV3ExtPresent;
   public IntraFreqCellReselectionInfo_NB_v1360 intraFreqCellReselectionInfo_v1360;  // optional
   public boolean mV4ExtPresent;
   public IntraFreqCellReselectionInfo_NB_v1430 intraFreqCellReselectionInfo_v1430;  // optional
   public boolean mV5ExtPresent;
   public CellReselectionInfoCommon_NB_v1450 cellReselectionInfoCommon_v1450;  // optional
   public boolean mV6ExtPresent;
   public NSSS_RRM_Config_NB_r15 nsss_RRM_Config_r15;  // optional
   public SystemInformationBlockType3_NB_r13_npbch_RRM_Config_r15 npbch_RRM_Config_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType3_NB_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType3_NB_r13 (
      SystemInformationBlockType3_NB_r13_cellReselectionInfoCommon_r13 cellReselectionInfoCommon_r13_,
      SystemInformationBlockType3_NB_r13_cellReselectionServingFreqInfo_r13 cellReselectionServingFreqInfo_r13_,
      SystemInformationBlockType3_NB_r13_intraFreqCellReselectionInfo_r13 intraFreqCellReselectionInfo_r13_,
      NS_PmaxList_NB_r13 freqBandInfo_r13_,
      SystemInformationBlockType3_NB_r13_multiBandInfoList_r13 multiBandInfoList_r13_,
      Asn1OctetString lateNonCriticalExtension_,
      IntraFreqCellReselectionInfo_NB_v1350 intraFreqCellReselectionInfo_v1350_,
      IntraFreqCellReselectionInfo_NB_v1360 intraFreqCellReselectionInfo_v1360_,
      IntraFreqCellReselectionInfo_NB_v1430 intraFreqCellReselectionInfo_v1430_,
      CellReselectionInfoCommon_NB_v1450 cellReselectionInfoCommon_v1450_,
      NSSS_RRM_Config_NB_r15 nsss_RRM_Config_r15_,
      SystemInformationBlockType3_NB_r13_npbch_RRM_Config_r15 npbch_RRM_Config_r15_
   ) {
      super();
      cellReselectionInfoCommon_r13 = cellReselectionInfoCommon_r13_;
      cellReselectionServingFreqInfo_r13 = cellReselectionServingFreqInfo_r13_;
      intraFreqCellReselectionInfo_r13 = intraFreqCellReselectionInfo_r13_;
      freqBandInfo_r13 = freqBandInfo_r13_;
      multiBandInfoList_r13 = multiBandInfoList_r13_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      intraFreqCellReselectionInfo_v1350 = intraFreqCellReselectionInfo_v1350_;
      intraFreqCellReselectionInfo_v1360 = intraFreqCellReselectionInfo_v1360_;
      intraFreqCellReselectionInfo_v1430 = intraFreqCellReselectionInfo_v1430_;
      cellReselectionInfoCommon_v1450 = cellReselectionInfoCommon_v1450_;
      nsss_RRM_Config_r15 = nsss_RRM_Config_r15_;
      npbch_RRM_Config_r15 = npbch_RRM_Config_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType3_NB_r13 (
      SystemInformationBlockType3_NB_r13_cellReselectionInfoCommon_r13 cellReselectionInfoCommon_r13_,
      SystemInformationBlockType3_NB_r13_cellReselectionServingFreqInfo_r13 cellReselectionServingFreqInfo_r13_,
      SystemInformationBlockType3_NB_r13_intraFreqCellReselectionInfo_r13 intraFreqCellReselectionInfo_r13_
   ) {
      super();
      cellReselectionInfoCommon_r13 = cellReselectionInfoCommon_r13_;
      cellReselectionServingFreqInfo_r13 = cellReselectionServingFreqInfo_r13_;
      intraFreqCellReselectionInfo_r13 = intraFreqCellReselectionInfo_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType3_NB_r13 (SystemInformationBlockType3_NB_r13_cellReselectionInfoCommon_r13 cellReselectionInfoCommon_r13_,
      SystemInformationBlockType3_NB_r13_cellReselectionServingFreqInfo_r13 cellReselectionServingFreqInfo_r13_,
      SystemInformationBlockType3_NB_r13_intraFreqCellReselectionInfo_r13 intraFreqCellReselectionInfo_r13_,
      NS_PmaxList_NB_r13 freqBandInfo_r13_,
      SystemInformationBlockType3_NB_r13_multiBandInfoList_r13 multiBandInfoList_r13_,
      byte[] lateNonCriticalExtension_,
      IntraFreqCellReselectionInfo_NB_v1350 intraFreqCellReselectionInfo_v1350_,
      IntraFreqCellReselectionInfo_NB_v1360 intraFreqCellReselectionInfo_v1360_,
      IntraFreqCellReselectionInfo_NB_v1430 intraFreqCellReselectionInfo_v1430_,
      CellReselectionInfoCommon_NB_v1450 cellReselectionInfoCommon_v1450_,
      NSSS_RRM_Config_NB_r15 nsss_RRM_Config_r15_,
      SystemInformationBlockType3_NB_r13_npbch_RRM_Config_r15 npbch_RRM_Config_r15_
   ) {
      super();
      cellReselectionInfoCommon_r13 = cellReselectionInfoCommon_r13_;
      cellReselectionServingFreqInfo_r13 = cellReselectionServingFreqInfo_r13_;
      intraFreqCellReselectionInfo_r13 = intraFreqCellReselectionInfo_r13_;
      freqBandInfo_r13 = freqBandInfo_r13_;
      multiBandInfoList_r13 = multiBandInfoList_r13_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      intraFreqCellReselectionInfo_v1350 = intraFreqCellReselectionInfo_v1350_;
      intraFreqCellReselectionInfo_v1360 = intraFreqCellReselectionInfo_v1360_;
      intraFreqCellReselectionInfo_v1430 = intraFreqCellReselectionInfo_v1430_;
      cellReselectionInfoCommon_v1450 = cellReselectionInfoCommon_v1450_;
      nsss_RRM_Config_r15 = nsss_RRM_Config_r15_;
      npbch_RRM_Config_r15 = npbch_RRM_Config_r15_;
   }

   public void init () {
      cellReselectionInfoCommon_r13 = null;
      cellReselectionServingFreqInfo_r13 = null;
      intraFreqCellReselectionInfo_r13 = null;
      freqBandInfo_r13 = null;
      multiBandInfoList_r13 = null;
      lateNonCriticalExtension = null;
      intraFreqCellReselectionInfo_v1350 = null;
      intraFreqCellReselectionInfo_v1360 = null;
      intraFreqCellReselectionInfo_v1430 = null;
      cellReselectionInfoCommon_v1450 = null;
      nsss_RRM_Config_r15 = null;
      npbch_RRM_Config_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 13; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cellReselectionInfoCommon_r13;
         case 1: return cellReselectionServingFreqInfo_r13;
         case 2: return intraFreqCellReselectionInfo_r13;
         case 3: return freqBandInfo_r13;
         case 4: return multiBandInfoList_r13;
         case 5: return lateNonCriticalExtension;
         case 6: return intraFreqCellReselectionInfo_v1350;
         case 7: return intraFreqCellReselectionInfo_v1360;
         case 8: return intraFreqCellReselectionInfo_v1430;
         case 9: return cellReselectionInfoCommon_v1450;
         case 10: return nsss_RRM_Config_r15;
         case 11: return npbch_RRM_Config_r15;
         case 12: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cellReselectionInfoCommon-r13";
         case 1: return "cellReselectionServingFreqInfo-r13";
         case 2: return "intraFreqCellReselectionInfo-r13";
         case 3: return "freqBandInfo-r13";
         case 4: return "multiBandInfoList-r13";
         case 5: return "lateNonCriticalExtension";
         case 6: return "intraFreqCellReselectionInfo-v1350";
         case 7: return "intraFreqCellReselectionInfo-v1360";
         case 8: return "intraFreqCellReselectionInfo-v1430";
         case 9: return "cellReselectionInfoCommon-v1450";
         case 10: return "nsss-RRM-Config-r15";
         case 11: return "npbch-RRM-Config-r15";
         case 12: return null;
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

      boolean freqBandInfo_r13Present = buffer.decodeBit ("freqBandInfo_r13Present");
      boolean multiBandInfoList_r13Present = buffer.decodeBit ("multiBandInfoList_r13Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode cellReselectionInfoCommon_r13

      buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon_r13", -1);

      cellReselectionInfoCommon_r13 = new SystemInformationBlockType3_NB_r13_cellReselectionInfoCommon_r13();
      cellReselectionInfoCommon_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon_r13", -1);

      // decode cellReselectionServingFreqInfo_r13

      buffer.getContext().eventDispatcher.startElement("cellReselectionServingFreqInfo_r13", -1);

      cellReselectionServingFreqInfo_r13 = new SystemInformationBlockType3_NB_r13_cellReselectionServingFreqInfo_r13();
      cellReselectionServingFreqInfo_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cellReselectionServingFreqInfo_r13", -1);

      // decode intraFreqCellReselectionInfo_r13

      buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo_r13", -1);

      intraFreqCellReselectionInfo_r13 = new SystemInformationBlockType3_NB_r13_intraFreqCellReselectionInfo_r13();
      intraFreqCellReselectionInfo_r13.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo_r13", -1);

      // decode freqBandInfo_r13

      if (freqBandInfo_r13Present) {
         buffer.getContext().eventDispatcher.startElement("freqBandInfo_r13", -1);

         freqBandInfo_r13 = new NS_PmaxList_NB_r13();
         freqBandInfo_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("freqBandInfo_r13", -1);
      }
      else {
         freqBandInfo_r13 = null;
      }

      // decode multiBandInfoList_r13

      if (multiBandInfoList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("multiBandInfoList_r13", -1);

         multiBandInfoList_r13 = new SystemInformationBlockType3_NB_r13_multiBandInfoList_r13();
         multiBandInfoList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("multiBandInfoList_r13", -1);
      }
      else {
         multiBandInfoList_r13 = null;
      }

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean intraFreqCellReselectionInfo_v1350Present = buffer.decodeBit ("intraFreqCellReselectionInfo_v1350Present");

            // decode intraFreqCellReselectionInfo_v1350

            if (intraFreqCellReselectionInfo_v1350Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo_v1350", -1);

               intraFreqCellReselectionInfo_v1350 = new IntraFreqCellReselectionInfo_NB_v1350();
               intraFreqCellReselectionInfo_v1350.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo_v1350", -1);
            }
            else {
               intraFreqCellReselectionInfo_v1350 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean intraFreqCellReselectionInfo_v1360Present = buffer.decodeBit ("intraFreqCellReselectionInfo_v1360Present");

            // decode intraFreqCellReselectionInfo_v1360

            if (intraFreqCellReselectionInfo_v1360Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo_v1360", -1);

               intraFreqCellReselectionInfo_v1360 = new IntraFreqCellReselectionInfo_NB_v1360();
               intraFreqCellReselectionInfo_v1360.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo_v1360", -1);
            }
            else {
               intraFreqCellReselectionInfo_v1360 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean intraFreqCellReselectionInfo_v1430Present = buffer.decodeBit ("intraFreqCellReselectionInfo_v1430Present");

            // decode intraFreqCellReselectionInfo_v1430

            if (intraFreqCellReselectionInfo_v1430Present) {
               buffer.getContext().eventDispatcher.startElement("intraFreqCellReselectionInfo_v1430", -1);

               intraFreqCellReselectionInfo_v1430 = new IntraFreqCellReselectionInfo_NB_v1430();
               intraFreqCellReselectionInfo_v1430.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("intraFreqCellReselectionInfo_v1430", -1);
            }
            else {
               intraFreqCellReselectionInfo_v1430 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean cellReselectionInfoCommon_v1450Present = buffer.decodeBit ("cellReselectionInfoCommon_v1450Present");

            // decode cellReselectionInfoCommon_v1450

            if (cellReselectionInfoCommon_v1450Present) {
               buffer.getContext().eventDispatcher.startElement("cellReselectionInfoCommon_v1450", -1);

               cellReselectionInfoCommon_v1450 = new CellReselectionInfoCommon_NB_v1450();
               cellReselectionInfoCommon_v1450.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cellReselectionInfoCommon_v1450", -1);
            }
            else {
               cellReselectionInfoCommon_v1450 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean nsss_RRM_Config_r15Present = buffer.decodeBit ("nsss_RRM_Config_r15Present");

            boolean npbch_RRM_Config_r15Present = buffer.decodeBit ("npbch_RRM_Config_r15Present");

            // decode nsss_RRM_Config_r15

            if (nsss_RRM_Config_r15Present) {
               buffer.getContext().eventDispatcher.startElement("nsss_RRM_Config_r15", -1);

               nsss_RRM_Config_r15 = new NSSS_RRM_Config_NB_r15();
               nsss_RRM_Config_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("nsss_RRM_Config_r15", -1);
            }
            else {
               nsss_RRM_Config_r15 = null;
            }

            // decode npbch_RRM_Config_r15

            if (npbch_RRM_Config_r15Present) {
               buffer.getContext().eventDispatcher.startElement("npbch_RRM_Config_r15", -1);

               int tval = SystemInformationBlockType3_NB_r13_npbch_RRM_Config_r15.decodeEnumValue (buffer);
               npbch_RRM_Config_r15 = SystemInformationBlockType3_NB_r13_npbch_RRM_Config_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("npbch_RRM_Config_r15", -1);
            }
            else {
               npbch_RRM_Config_r15 = null;
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
      if (cellReselectionInfoCommon_r13 != null) cellReselectionInfoCommon_r13.print (_sb, "cellReselectionInfoCommon_r13", _level+1);
      if (cellReselectionServingFreqInfo_r13 != null) cellReselectionServingFreqInfo_r13.print (_sb, "cellReselectionServingFreqInfo_r13", _level+1);
      if (intraFreqCellReselectionInfo_r13 != null) intraFreqCellReselectionInfo_r13.print (_sb, "intraFreqCellReselectionInfo_r13", _level+1);
      if (freqBandInfo_r13 != null) freqBandInfo_r13.print (_sb, "freqBandInfo_r13", _level+1);
      if (multiBandInfoList_r13 != null) multiBandInfoList_r13.print (_sb, "multiBandInfoList_r13", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (intraFreqCellReselectionInfo_v1350 != null) intraFreqCellReselectionInfo_v1350.print (_sb, "intraFreqCellReselectionInfo_v1350", _level+1);
      if (intraFreqCellReselectionInfo_v1360 != null) intraFreqCellReselectionInfo_v1360.print (_sb, "intraFreqCellReselectionInfo_v1360", _level+1);
      if (intraFreqCellReselectionInfo_v1430 != null) intraFreqCellReselectionInfo_v1430.print (_sb, "intraFreqCellReselectionInfo_v1430", _level+1);
      if (cellReselectionInfoCommon_v1450 != null) cellReselectionInfoCommon_v1450.print (_sb, "cellReselectionInfoCommon_v1450", _level+1);
      if (nsss_RRM_Config_r15 != null) nsss_RRM_Config_r15.print (_sb, "nsss_RRM_Config_r15", _level+1);
      if (npbch_RRM_Config_r15 != null) npbch_RRM_Config_r15.print (_sb, "npbch_RRM_Config_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
