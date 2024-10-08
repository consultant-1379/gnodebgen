/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MBSFN_AreaInfo_r9 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MBSFN-AreaInfo-r9";
   }

   public MBSFN_AreaId_r12 mbsfn_AreaId_r9;
   public MBSFN_AreaInfo_r9_non_MBSFNregionLength non_MBSFNregionLength = null;
   public Asn1Integer notificationIndicator_r9;
   public MBSFN_AreaInfo_r9_mcch_Config_r9 mcch_Config_r9;
   public boolean mV2ExtPresent;
   public MBSFN_AreaInfo_r9_mcch_Config_r14 mcch_Config_r14;  // optional
   public MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 subcarrierSpacingMBMS_r14 = null;  // optional
   public Asn1OpenExt extElem1;

   public MBSFN_AreaInfo_r9 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MBSFN_AreaInfo_r9 (
      MBSFN_AreaId_r12 mbsfn_AreaId_r9_,
      MBSFN_AreaInfo_r9_non_MBSFNregionLength non_MBSFNregionLength_,
      Asn1Integer notificationIndicator_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r9 mcch_Config_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r14 mcch_Config_r14_,
      MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 subcarrierSpacingMBMS_r14_
   ) {
      super();
      mbsfn_AreaId_r9 = mbsfn_AreaId_r9_;
      non_MBSFNregionLength = non_MBSFNregionLength_;
      notificationIndicator_r9 = notificationIndicator_r9_;
      mcch_Config_r9 = mcch_Config_r9_;
      mcch_Config_r14 = mcch_Config_r14_;
      subcarrierSpacingMBMS_r14 = subcarrierSpacingMBMS_r14_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MBSFN_AreaInfo_r9 (
      MBSFN_AreaId_r12 mbsfn_AreaId_r9_,
      MBSFN_AreaInfo_r9_non_MBSFNregionLength non_MBSFNregionLength_,
      Asn1Integer notificationIndicator_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r9 mcch_Config_r9_
   ) {
      super();
      mbsfn_AreaId_r9 = mbsfn_AreaId_r9_;
      non_MBSFNregionLength = non_MBSFNregionLength_;
      notificationIndicator_r9 = notificationIndicator_r9_;
      mcch_Config_r9 = mcch_Config_r9_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MBSFN_AreaInfo_r9 (long mbsfn_AreaId_r9_,
      MBSFN_AreaInfo_r9_non_MBSFNregionLength non_MBSFNregionLength_,
      long notificationIndicator_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r9 mcch_Config_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r14 mcch_Config_r14_,
      MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14 subcarrierSpacingMBMS_r14_
   ) {
      super();
      mbsfn_AreaId_r9 = new MBSFN_AreaId_r12 (mbsfn_AreaId_r9_);
      non_MBSFNregionLength = non_MBSFNregionLength_;
      notificationIndicator_r9 = new Asn1Integer (notificationIndicator_r9_);
      mcch_Config_r9 = mcch_Config_r9_;
      mcch_Config_r14 = mcch_Config_r14_;
      subcarrierSpacingMBMS_r14 = subcarrierSpacingMBMS_r14_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MBSFN_AreaInfo_r9 (
      long mbsfn_AreaId_r9_,
      MBSFN_AreaInfo_r9_non_MBSFNregionLength non_MBSFNregionLength_,
      long notificationIndicator_r9_,
      MBSFN_AreaInfo_r9_mcch_Config_r9 mcch_Config_r9_
   ) {
      super();
      mbsfn_AreaId_r9 = new MBSFN_AreaId_r12 (mbsfn_AreaId_r9_);
      non_MBSFNregionLength = non_MBSFNregionLength_;
      notificationIndicator_r9 = new Asn1Integer (notificationIndicator_r9_);
      mcch_Config_r9 = mcch_Config_r9_;
   }

   public void init () {
      mbsfn_AreaId_r9 = null;
      non_MBSFNregionLength = null;
      notificationIndicator_r9 = null;
      mcch_Config_r9 = null;
      mcch_Config_r14 = null;
      subcarrierSpacingMBMS_r14 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mbsfn_AreaId_r9;
         case 1: return non_MBSFNregionLength;
         case 2: return notificationIndicator_r9;
         case 3: return mcch_Config_r9;
         case 4: return mcch_Config_r14;
         case 5: return subcarrierSpacingMBMS_r14;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mbsfn-AreaId-r9";
         case 1: return "non-MBSFNregionLength";
         case 2: return "notificationIndicator-r9";
         case 3: return "mcch-Config-r9";
         case 4: return "mcch-Config-r14";
         case 5: return "subcarrierSpacingMBMS-r14";
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

      // decode mbsfn_AreaId_r9

      buffer.getContext().eventDispatcher.startElement("mbsfn_AreaId_r9", -1);

      mbsfn_AreaId_r9 = new MBSFN_AreaId_r12();
      mbsfn_AreaId_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mbsfn_AreaId_r9", -1);

      // decode non_MBSFNregionLength

      buffer.getContext().eventDispatcher.startElement("non_MBSFNregionLength", -1);

      {
         int tval = MBSFN_AreaInfo_r9_non_MBSFNregionLength.decodeEnumValue (buffer);
         non_MBSFNregionLength = MBSFN_AreaInfo_r9_non_MBSFNregionLength.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("non_MBSFNregionLength", -1);

      // decode notificationIndicator_r9

      buffer.getContext().eventDispatcher.startElement("notificationIndicator_r9", -1);

      notificationIndicator_r9 = new Asn1Integer();
      notificationIndicator_r9.decode (buffer, 0, 7);

      buffer.invokeCharacters(notificationIndicator_r9.toString());
      buffer.getContext().eventDispatcher.endElement("notificationIndicator_r9", -1);

      // decode mcch_Config_r9

      buffer.getContext().eventDispatcher.startElement("mcch_Config_r9", -1);

      mcch_Config_r9 = new MBSFN_AreaInfo_r9_mcch_Config_r9();
      mcch_Config_r9.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("mcch_Config_r9", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean mcch_Config_r14Present = buffer.decodeBit ("mcch_Config_r14Present");

            boolean subcarrierSpacingMBMS_r14Present = buffer.decodeBit ("subcarrierSpacingMBMS_r14Present");

            // decode mcch_Config_r14

            if (mcch_Config_r14Present) {
               buffer.getContext().eventDispatcher.startElement("mcch_Config_r14", -1);

               mcch_Config_r14 = new MBSFN_AreaInfo_r9_mcch_Config_r14();
               mcch_Config_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("mcch_Config_r14", -1);
            }
            else {
               mcch_Config_r14 = null;
            }

            // decode subcarrierSpacingMBMS_r14

            if (subcarrierSpacingMBMS_r14Present) {
               buffer.getContext().eventDispatcher.startElement("subcarrierSpacingMBMS_r14", -1);

               int tval = MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14.decodeEnumValue (buffer);
               subcarrierSpacingMBMS_r14 = MBSFN_AreaInfo_r9_subcarrierSpacingMBMS_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("subcarrierSpacingMBMS_r14", -1);
            }
            else {
               subcarrierSpacingMBMS_r14 = null;
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
      if (mbsfn_AreaId_r9 != null) mbsfn_AreaId_r9.print (_sb, "mbsfn_AreaId_r9", _level+1);
      if (non_MBSFNregionLength != null) non_MBSFNregionLength.print (_sb, "non_MBSFNregionLength", _level+1);
      if (notificationIndicator_r9 != null) notificationIndicator_r9.print (_sb, "notificationIndicator_r9", _level+1);
      if (mcch_Config_r9 != null) mcch_Config_r9.print (_sb, "mcch_Config_r9", _level+1);
      if (mcch_Config_r14 != null) mcch_Config_r14.print (_sb, "mcch_Config_r14", _level+1);
      if (subcarrierSpacingMBMS_r14 != null) subcarrierSpacingMBMS_r14.print (_sb, "subcarrierSpacingMBMS_r14", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
