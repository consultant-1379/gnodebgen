/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType20_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType20-r13";
   }

   public SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13 sc_mcch_RepetitionPeriod_r13 = null;
   public Asn1Integer sc_mcch_Offset_r13;
   public Asn1Integer sc_mcch_FirstSubframe_r13;
   public Asn1Integer sc_mcch_duration_r13;  // optional
   public SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13 sc_mcch_ModificationPeriod_r13 = null;
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public boolean mV2ExtPresent;
   public SystemInformationBlockType20_r13_br_BCCH_Config_r14 br_BCCH_Config_r14;  // optional
   public SC_MCCH_SchedulingInfo_r14 sc_mcch_SchedulingInfo_r14;  // optional
   public SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = null;  // optional
   public SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = null;  // optional
   public boolean mV3ExtPresent;
   public SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_v1470 sc_mcch_RepetitionPeriod_v1470 = null;  // optional
   public SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_v1470 sc_mcch_ModificationPeriod_v1470 = null;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType20_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType20_r13 (
      SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13 sc_mcch_RepetitionPeriod_r13_,
      Asn1Integer sc_mcch_Offset_r13_,
      Asn1Integer sc_mcch_FirstSubframe_r13_,
      Asn1Integer sc_mcch_duration_r13_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13 sc_mcch_ModificationPeriod_r13_,
      Asn1OctetString lateNonCriticalExtension_,
      SystemInformationBlockType20_r13_br_BCCH_Config_r14 br_BCCH_Config_r14_,
      SC_MCCH_SchedulingInfo_r14 sc_mcch_SchedulingInfo_r14_,
      SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14_,
      SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14_,
      SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_v1470 sc_mcch_RepetitionPeriod_v1470_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_v1470 sc_mcch_ModificationPeriod_v1470_
   ) {
      super();
      sc_mcch_RepetitionPeriod_r13 = sc_mcch_RepetitionPeriod_r13_;
      sc_mcch_Offset_r13 = sc_mcch_Offset_r13_;
      sc_mcch_FirstSubframe_r13 = sc_mcch_FirstSubframe_r13_;
      sc_mcch_duration_r13 = sc_mcch_duration_r13_;
      sc_mcch_ModificationPeriod_r13 = sc_mcch_ModificationPeriod_r13_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      br_BCCH_Config_r14 = br_BCCH_Config_r14_;
      sc_mcch_SchedulingInfo_r14 = sc_mcch_SchedulingInfo_r14_;
      pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14_;
      pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14_;
      sc_mcch_RepetitionPeriod_v1470 = sc_mcch_RepetitionPeriod_v1470_;
      sc_mcch_ModificationPeriod_v1470 = sc_mcch_ModificationPeriod_v1470_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SystemInformationBlockType20_r13 (
      SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13 sc_mcch_RepetitionPeriod_r13_,
      Asn1Integer sc_mcch_Offset_r13_,
      Asn1Integer sc_mcch_FirstSubframe_r13_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13 sc_mcch_ModificationPeriod_r13_
   ) {
      super();
      sc_mcch_RepetitionPeriod_r13 = sc_mcch_RepetitionPeriod_r13_;
      sc_mcch_Offset_r13 = sc_mcch_Offset_r13_;
      sc_mcch_FirstSubframe_r13 = sc_mcch_FirstSubframe_r13_;
      sc_mcch_ModificationPeriod_r13 = sc_mcch_ModificationPeriod_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType20_r13 (SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13 sc_mcch_RepetitionPeriod_r13_,
      long sc_mcch_Offset_r13_,
      long sc_mcch_FirstSubframe_r13_,
      long sc_mcch_duration_r13_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13 sc_mcch_ModificationPeriod_r13_,
      byte[] lateNonCriticalExtension_,
      SystemInformationBlockType20_r13_br_BCCH_Config_r14 br_BCCH_Config_r14_,
      SC_MCCH_SchedulingInfo_r14 sc_mcch_SchedulingInfo_r14_,
      SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14_,
      SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14_,
      SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_v1470 sc_mcch_RepetitionPeriod_v1470_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_v1470 sc_mcch_ModificationPeriod_v1470_
   ) {
      super();
      sc_mcch_RepetitionPeriod_r13 = sc_mcch_RepetitionPeriod_r13_;
      sc_mcch_Offset_r13 = new Asn1Integer (sc_mcch_Offset_r13_);
      sc_mcch_FirstSubframe_r13 = new Asn1Integer (sc_mcch_FirstSubframe_r13_);
      sc_mcch_duration_r13 = new Asn1Integer (sc_mcch_duration_r13_);
      sc_mcch_ModificationPeriod_r13 = sc_mcch_ModificationPeriod_r13_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      br_BCCH_Config_r14 = br_BCCH_Config_r14_;
      sc_mcch_SchedulingInfo_r14 = sc_mcch_SchedulingInfo_r14_;
      pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14_;
      pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14_;
      sc_mcch_RepetitionPeriod_v1470 = sc_mcch_RepetitionPeriod_v1470_;
      sc_mcch_ModificationPeriod_v1470 = sc_mcch_ModificationPeriod_v1470_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SystemInformationBlockType20_r13 (
      SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13 sc_mcch_RepetitionPeriod_r13_,
      long sc_mcch_Offset_r13_,
      long sc_mcch_FirstSubframe_r13_,
      SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13 sc_mcch_ModificationPeriod_r13_
   ) {
      super();
      sc_mcch_RepetitionPeriod_r13 = sc_mcch_RepetitionPeriod_r13_;
      sc_mcch_Offset_r13 = new Asn1Integer (sc_mcch_Offset_r13_);
      sc_mcch_FirstSubframe_r13 = new Asn1Integer (sc_mcch_FirstSubframe_r13_);
      sc_mcch_ModificationPeriod_r13 = sc_mcch_ModificationPeriod_r13_;
   }

   public void init () {
      sc_mcch_RepetitionPeriod_r13 = null;
      sc_mcch_Offset_r13 = null;
      sc_mcch_FirstSubframe_r13 = null;
      sc_mcch_duration_r13 = null;
      sc_mcch_ModificationPeriod_r13 = null;
      lateNonCriticalExtension = null;
      br_BCCH_Config_r14 = null;
      sc_mcch_SchedulingInfo_r14 = null;
      pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = null;
      pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = null;
      sc_mcch_RepetitionPeriod_v1470 = null;
      sc_mcch_ModificationPeriod_v1470 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 13; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sc_mcch_RepetitionPeriod_r13;
         case 1: return sc_mcch_Offset_r13;
         case 2: return sc_mcch_FirstSubframe_r13;
         case 3: return sc_mcch_duration_r13;
         case 4: return sc_mcch_ModificationPeriod_r13;
         case 5: return lateNonCriticalExtension;
         case 6: return br_BCCH_Config_r14;
         case 7: return sc_mcch_SchedulingInfo_r14;
         case 8: return pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14;
         case 9: return pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14;
         case 10: return sc_mcch_RepetitionPeriod_v1470;
         case 11: return sc_mcch_ModificationPeriod_v1470;
         case 12: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sc-mcch-RepetitionPeriod-r13";
         case 1: return "sc-mcch-Offset-r13";
         case 2: return "sc-mcch-FirstSubframe-r13";
         case 3: return "sc-mcch-duration-r13";
         case 4: return "sc-mcch-ModificationPeriod-r13";
         case 5: return "lateNonCriticalExtension";
         case 6: return "br-BCCH-Config-r14";
         case 7: return "sc-mcch-SchedulingInfo-r14";
         case 8: return "pdsch-maxNumRepetitionCEmodeA-SC-MTCH-r14";
         case 9: return "pdsch-maxNumRepetitionCEmodeB-SC-MTCH-r14";
         case 10: return "sc-mcch-RepetitionPeriod-v1470";
         case 11: return "sc-mcch-ModificationPeriod-v1470";
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

      boolean sc_mcch_duration_r13Present = buffer.decodeBit ("sc_mcch_duration_r13Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode sc_mcch_RepetitionPeriod_r13

      buffer.getContext().eventDispatcher.startElement("sc_mcch_RepetitionPeriod_r13", -1);

      {
         int tval = SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13.decodeEnumValue (buffer);
         sc_mcch_RepetitionPeriod_r13 = SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sc_mcch_RepetitionPeriod_r13", -1);

      // decode sc_mcch_Offset_r13

      buffer.getContext().eventDispatcher.startElement("sc_mcch_Offset_r13", -1);

      sc_mcch_Offset_r13 = new Asn1Integer();
      sc_mcch_Offset_r13.decode (buffer, 0, 10);

      buffer.invokeCharacters(sc_mcch_Offset_r13.toString());
      buffer.getContext().eventDispatcher.endElement("sc_mcch_Offset_r13", -1);

      // decode sc_mcch_FirstSubframe_r13

      buffer.getContext().eventDispatcher.startElement("sc_mcch_FirstSubframe_r13", -1);

      sc_mcch_FirstSubframe_r13 = new Asn1Integer();
      sc_mcch_FirstSubframe_r13.decode (buffer, 0, 9);

      buffer.invokeCharacters(sc_mcch_FirstSubframe_r13.toString());
      buffer.getContext().eventDispatcher.endElement("sc_mcch_FirstSubframe_r13", -1);

      // decode sc_mcch_duration_r13

      if (sc_mcch_duration_r13Present) {
         buffer.getContext().eventDispatcher.startElement("sc_mcch_duration_r13", -1);

         sc_mcch_duration_r13 = new Asn1Integer();
         sc_mcch_duration_r13.decode (buffer, 2, 9);

         buffer.invokeCharacters(sc_mcch_duration_r13.toString());
         buffer.getContext().eventDispatcher.endElement("sc_mcch_duration_r13", -1);
      }
      else {
         sc_mcch_duration_r13 = null;
      }

      // decode sc_mcch_ModificationPeriod_r13

      buffer.getContext().eventDispatcher.startElement("sc_mcch_ModificationPeriod_r13", -1);

      {
         int tval = SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13.decodeEnumValue (buffer);
         sc_mcch_ModificationPeriod_r13 = SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sc_mcch_ModificationPeriod_r13", -1);

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

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean br_BCCH_Config_r14Present = buffer.decodeBit ("br_BCCH_Config_r14Present");

            boolean sc_mcch_SchedulingInfo_r14Present = buffer.decodeBit ("sc_mcch_SchedulingInfo_r14Present");

            boolean pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14Present = buffer.decodeBit ("pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14Present");

            boolean pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14Present = buffer.decodeBit ("pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14Present");

            // decode br_BCCH_Config_r14

            if (br_BCCH_Config_r14Present) {
               buffer.getContext().eventDispatcher.startElement("br_BCCH_Config_r14", -1);

               br_BCCH_Config_r14 = new SystemInformationBlockType20_r13_br_BCCH_Config_r14();
               br_BCCH_Config_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("br_BCCH_Config_r14", -1);
            }
            else {
               br_BCCH_Config_r14 = null;
            }

            // decode sc_mcch_SchedulingInfo_r14

            if (sc_mcch_SchedulingInfo_r14Present) {
               buffer.getContext().eventDispatcher.startElement("sc_mcch_SchedulingInfo_r14", -1);

               sc_mcch_SchedulingInfo_r14 = new SC_MCCH_SchedulingInfo_r14();
               sc_mcch_SchedulingInfo_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("sc_mcch_SchedulingInfo_r14", -1);
            }
            else {
               sc_mcch_SchedulingInfo_r14 = null;
            }

            // decode pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14

            if (pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14Present) {
               buffer.getContext().eventDispatcher.startElement("pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14", -1);

               int tval = SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14.decodeEnumValue (buffer);
               pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14", -1);
            }
            else {
               pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 = null;
            }

            // decode pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14

            if (pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14Present) {
               buffer.getContext().eventDispatcher.startElement("pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14", -1);

               int tval = SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14.decodeEnumValue (buffer);
               pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = SystemInformationBlockType20_r13_pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14", -1);
            }
            else {
               pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean sc_mcch_RepetitionPeriod_v1470Present = buffer.decodeBit ("sc_mcch_RepetitionPeriod_v1470Present");

            boolean sc_mcch_ModificationPeriod_v1470Present = buffer.decodeBit ("sc_mcch_ModificationPeriod_v1470Present");

            // decode sc_mcch_RepetitionPeriod_v1470

            if (sc_mcch_RepetitionPeriod_v1470Present) {
               buffer.getContext().eventDispatcher.startElement("sc_mcch_RepetitionPeriod_v1470", -1);

               int tval = SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_v1470.decodeEnumValue (buffer);
               sc_mcch_RepetitionPeriod_v1470 = SystemInformationBlockType20_r13_sc_mcch_RepetitionPeriod_v1470.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sc_mcch_RepetitionPeriod_v1470", -1);
            }
            else {
               sc_mcch_RepetitionPeriod_v1470 = null;
            }

            // decode sc_mcch_ModificationPeriod_v1470

            if (sc_mcch_ModificationPeriod_v1470Present) {
               buffer.getContext().eventDispatcher.startElement("sc_mcch_ModificationPeriod_v1470", -1);

               int tval = SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_v1470.decodeEnumValue (buffer);
               sc_mcch_ModificationPeriod_v1470 = SystemInformationBlockType20_r13_sc_mcch_ModificationPeriod_v1470.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("sc_mcch_ModificationPeriod_v1470", -1);
            }
            else {
               sc_mcch_ModificationPeriod_v1470 = null;
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
      if (sc_mcch_RepetitionPeriod_r13 != null) sc_mcch_RepetitionPeriod_r13.print (_sb, "sc_mcch_RepetitionPeriod_r13", _level+1);
      if (sc_mcch_Offset_r13 != null) sc_mcch_Offset_r13.print (_sb, "sc_mcch_Offset_r13", _level+1);
      if (sc_mcch_FirstSubframe_r13 != null) sc_mcch_FirstSubframe_r13.print (_sb, "sc_mcch_FirstSubframe_r13", _level+1);
      if (sc_mcch_duration_r13 != null) sc_mcch_duration_r13.print (_sb, "sc_mcch_duration_r13", _level+1);
      if (sc_mcch_ModificationPeriod_r13 != null) sc_mcch_ModificationPeriod_r13.print (_sb, "sc_mcch_ModificationPeriod_r13", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (br_BCCH_Config_r14 != null) br_BCCH_Config_r14.print (_sb, "br_BCCH_Config_r14", _level+1);
      if (sc_mcch_SchedulingInfo_r14 != null) sc_mcch_SchedulingInfo_r14.print (_sb, "sc_mcch_SchedulingInfo_r14", _level+1);
      if (pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14 != null) pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14.print (_sb, "pdsch_maxNumRepetitionCEmodeA_SC_MTCH_r14", _level+1);
      if (pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14 != null) pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14.print (_sb, "pdsch_maxNumRepetitionCEmodeB_SC_MTCH_r14", _level+1);
      if (sc_mcch_RepetitionPeriod_v1470 != null) sc_mcch_RepetitionPeriod_v1470.print (_sb, "sc_mcch_RepetitionPeriod_v1470", _level+1);
      if (sc_mcch_ModificationPeriod_v1470 != null) sc_mcch_ModificationPeriod_v1470.print (_sb, "sc_mcch_ModificationPeriod_v1470", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
