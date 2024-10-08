/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasDS_Config_r12_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasDS_Config_r12_setup_dmtc_PeriodOffset_r12 dmtc_PeriodOffset_r12;
   public MeasDS_Config_r12_setup_ds_OccasionDuration_r12 ds_OccasionDuration_r12;
   public MeasCSI_RS_ToRemoveList_r12 measCSI_RS_ToRemoveList_r12;  // optional
   public MeasCSI_RS_ToAddModList_r12 measCSI_RS_ToAddModList_r12;  // optional
   public Asn1OpenExt extElem1;

   public MeasDS_Config_r12_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasDS_Config_r12_setup (
      MeasDS_Config_r12_setup_dmtc_PeriodOffset_r12 dmtc_PeriodOffset_r12_,
      MeasDS_Config_r12_setup_ds_OccasionDuration_r12 ds_OccasionDuration_r12_,
      MeasCSI_RS_ToRemoveList_r12 measCSI_RS_ToRemoveList_r12_,
      MeasCSI_RS_ToAddModList_r12 measCSI_RS_ToAddModList_r12_
   ) {
      super();
      dmtc_PeriodOffset_r12 = dmtc_PeriodOffset_r12_;
      ds_OccasionDuration_r12 = ds_OccasionDuration_r12_;
      measCSI_RS_ToRemoveList_r12 = measCSI_RS_ToRemoveList_r12_;
      measCSI_RS_ToAddModList_r12 = measCSI_RS_ToAddModList_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasDS_Config_r12_setup (
      MeasDS_Config_r12_setup_dmtc_PeriodOffset_r12 dmtc_PeriodOffset_r12_,
      MeasDS_Config_r12_setup_ds_OccasionDuration_r12 ds_OccasionDuration_r12_
   ) {
      super();
      dmtc_PeriodOffset_r12 = dmtc_PeriodOffset_r12_;
      ds_OccasionDuration_r12 = ds_OccasionDuration_r12_;
   }

   public void init () {
      dmtc_PeriodOffset_r12 = null;
      ds_OccasionDuration_r12 = null;
      measCSI_RS_ToRemoveList_r12 = null;
      measCSI_RS_ToAddModList_r12 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dmtc_PeriodOffset_r12;
         case 1: return ds_OccasionDuration_r12;
         case 2: return measCSI_RS_ToRemoveList_r12;
         case 3: return measCSI_RS_ToAddModList_r12;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dmtc-PeriodOffset-r12";
         case 1: return "ds-OccasionDuration-r12";
         case 2: return "measCSI-RS-ToRemoveList-r12";
         case 3: return "measCSI-RS-ToAddModList-r12";
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

      boolean measCSI_RS_ToRemoveList_r12Present = buffer.decodeBit ("measCSI_RS_ToRemoveList_r12Present");
      boolean measCSI_RS_ToAddModList_r12Present = buffer.decodeBit ("measCSI_RS_ToAddModList_r12Present");

      // decode dmtc_PeriodOffset_r12

      buffer.getContext().eventDispatcher.startElement("dmtc_PeriodOffset_r12", -1);

      dmtc_PeriodOffset_r12 = new MeasDS_Config_r12_setup_dmtc_PeriodOffset_r12();
      dmtc_PeriodOffset_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dmtc_PeriodOffset_r12", -1);

      // decode ds_OccasionDuration_r12

      buffer.getContext().eventDispatcher.startElement("ds_OccasionDuration_r12", -1);

      ds_OccasionDuration_r12 = new MeasDS_Config_r12_setup_ds_OccasionDuration_r12();
      ds_OccasionDuration_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ds_OccasionDuration_r12", -1);

      // decode measCSI_RS_ToRemoveList_r12

      if (measCSI_RS_ToRemoveList_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measCSI_RS_ToRemoveList_r12", -1);

         measCSI_RS_ToRemoveList_r12 = new MeasCSI_RS_ToRemoveList_r12();
         measCSI_RS_ToRemoveList_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measCSI_RS_ToRemoveList_r12", -1);
      }
      else {
         measCSI_RS_ToRemoveList_r12 = null;
      }

      // decode measCSI_RS_ToAddModList_r12

      if (measCSI_RS_ToAddModList_r12Present) {
         buffer.getContext().eventDispatcher.startElement("measCSI_RS_ToAddModList_r12", -1);

         measCSI_RS_ToAddModList_r12 = new MeasCSI_RS_ToAddModList_r12();
         measCSI_RS_ToAddModList_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measCSI_RS_ToAddModList_r12", -1);
      }
      else {
         measCSI_RS_ToAddModList_r12 = null;
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
      if (dmtc_PeriodOffset_r12 != null) dmtc_PeriodOffset_r12.print (_sb, "dmtc_PeriodOffset_r12", _level+1);
      if (ds_OccasionDuration_r12 != null) ds_OccasionDuration_r12.print (_sb, "ds_OccasionDuration_r12", _level+1);
      if (measCSI_RS_ToRemoveList_r12 != null) measCSI_RS_ToRemoveList_r12.print (_sb, "measCSI_RS_ToRemoveList_r12", _level+1);
      if (measCSI_RS_ToAddModList_r12 != null) measCSI_RS_ToAddModList_r12.print (_sb, "measCSI_RS_ToAddModList_r12", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
