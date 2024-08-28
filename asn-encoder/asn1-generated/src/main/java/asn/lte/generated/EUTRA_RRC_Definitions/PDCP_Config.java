/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCP-Config";
   }

   public PDCP_Config_discardTimer discardTimer = null;  // optional
   public PDCP_Config_rlc_AM rlc_AM;  // optional
   public PDCP_Config_rlc_UM rlc_UM;  // optional
   public PDCP_Config_headerCompression headerCompression;
   public boolean mV2ExtPresent;
   public PDCP_Config_rn_IntegrityProtection_r10 rn_IntegrityProtection_r10 = null;  // optional
   public boolean mV3ExtPresent;
   public PDCP_Config_pdcp_SN_Size_v1130 pdcp_SN_Size_v1130 = null;  // optional
   public boolean mV4ExtPresent;
   public Asn1Boolean ul_DataSplitDRB_ViaSCG_r12;  // optional
   public PDCP_Config_t_Reordering_r12 t_Reordering_r12 = null;  // optional
   public boolean mV5ExtPresent;
   public PDCP_Config_ul_DataSplitThreshold_r13 ul_DataSplitThreshold_r13;  // optional
   public PDCP_Config_pdcp_SN_Size_v1310 pdcp_SN_Size_v1310 = null;  // optional
   public PDCP_Config_statusFeedback_r13 statusFeedback_r13;  // optional
   public boolean mV6ExtPresent;
   public PDCP_Config_ul_LWA_Config_r14 ul_LWA_Config_r14;  // optional
   public PDCP_Config_uplinkOnlyHeaderCompression_r14 uplinkOnlyHeaderCompression_r14;  // optional
   public boolean mV7ExtPresent;
   public PDCP_Config_uplinkDataCompression_r15 uplinkDataCompression_r15;  // optional
   public PDCP_Config_pdcp_DuplicationConfig_r15 pdcp_DuplicationConfig_r15;  // optional
   public Asn1OpenExt extElem1;

   public PDCP_Config () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDCP_Config (
      PDCP_Config_discardTimer discardTimer_,
      PDCP_Config_rlc_AM rlc_AM_,
      PDCP_Config_rlc_UM rlc_UM_,
      PDCP_Config_headerCompression headerCompression_,
      PDCP_Config_rn_IntegrityProtection_r10 rn_IntegrityProtection_r10_,
      PDCP_Config_pdcp_SN_Size_v1130 pdcp_SN_Size_v1130_,
      Asn1Boolean ul_DataSplitDRB_ViaSCG_r12_,
      PDCP_Config_t_Reordering_r12 t_Reordering_r12_,
      PDCP_Config_ul_DataSplitThreshold_r13 ul_DataSplitThreshold_r13_,
      PDCP_Config_pdcp_SN_Size_v1310 pdcp_SN_Size_v1310_,
      PDCP_Config_statusFeedback_r13 statusFeedback_r13_,
      PDCP_Config_ul_LWA_Config_r14 ul_LWA_Config_r14_,
      PDCP_Config_uplinkOnlyHeaderCompression_r14 uplinkOnlyHeaderCompression_r14_,
      PDCP_Config_uplinkDataCompression_r15 uplinkDataCompression_r15_,
      PDCP_Config_pdcp_DuplicationConfig_r15 pdcp_DuplicationConfig_r15_
   ) {
      super();
      discardTimer = discardTimer_;
      rlc_AM = rlc_AM_;
      rlc_UM = rlc_UM_;
      headerCompression = headerCompression_;
      rn_IntegrityProtection_r10 = rn_IntegrityProtection_r10_;
      pdcp_SN_Size_v1130 = pdcp_SN_Size_v1130_;
      ul_DataSplitDRB_ViaSCG_r12 = ul_DataSplitDRB_ViaSCG_r12_;
      t_Reordering_r12 = t_Reordering_r12_;
      ul_DataSplitThreshold_r13 = ul_DataSplitThreshold_r13_;
      pdcp_SN_Size_v1310 = pdcp_SN_Size_v1310_;
      statusFeedback_r13 = statusFeedback_r13_;
      ul_LWA_Config_r14 = ul_LWA_Config_r14_;
      uplinkOnlyHeaderCompression_r14 = uplinkOnlyHeaderCompression_r14_;
      uplinkDataCompression_r15 = uplinkDataCompression_r15_;
      pdcp_DuplicationConfig_r15 = pdcp_DuplicationConfig_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public PDCP_Config (
      PDCP_Config_headerCompression headerCompression_
   ) {
      super();
      headerCompression = headerCompression_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PDCP_Config (PDCP_Config_discardTimer discardTimer_,
      PDCP_Config_rlc_AM rlc_AM_,
      PDCP_Config_rlc_UM rlc_UM_,
      PDCP_Config_headerCompression headerCompression_,
      PDCP_Config_rn_IntegrityProtection_r10 rn_IntegrityProtection_r10_,
      PDCP_Config_pdcp_SN_Size_v1130 pdcp_SN_Size_v1130_,
      boolean ul_DataSplitDRB_ViaSCG_r12_,
      PDCP_Config_t_Reordering_r12 t_Reordering_r12_,
      PDCP_Config_ul_DataSplitThreshold_r13 ul_DataSplitThreshold_r13_,
      PDCP_Config_pdcp_SN_Size_v1310 pdcp_SN_Size_v1310_,
      PDCP_Config_statusFeedback_r13 statusFeedback_r13_,
      PDCP_Config_ul_LWA_Config_r14 ul_LWA_Config_r14_,
      PDCP_Config_uplinkOnlyHeaderCompression_r14 uplinkOnlyHeaderCompression_r14_,
      PDCP_Config_uplinkDataCompression_r15 uplinkDataCompression_r15_,
      PDCP_Config_pdcp_DuplicationConfig_r15 pdcp_DuplicationConfig_r15_
   ) {
      super();
      discardTimer = discardTimer_;
      rlc_AM = rlc_AM_;
      rlc_UM = rlc_UM_;
      headerCompression = headerCompression_;
      rn_IntegrityProtection_r10 = rn_IntegrityProtection_r10_;
      pdcp_SN_Size_v1130 = pdcp_SN_Size_v1130_;
      ul_DataSplitDRB_ViaSCG_r12 = new Asn1Boolean (ul_DataSplitDRB_ViaSCG_r12_);
      t_Reordering_r12 = t_Reordering_r12_;
      ul_DataSplitThreshold_r13 = ul_DataSplitThreshold_r13_;
      pdcp_SN_Size_v1310 = pdcp_SN_Size_v1310_;
      statusFeedback_r13 = statusFeedback_r13_;
      ul_LWA_Config_r14 = ul_LWA_Config_r14_;
      uplinkOnlyHeaderCompression_r14 = uplinkOnlyHeaderCompression_r14_;
      uplinkDataCompression_r15 = uplinkDataCompression_r15_;
      pdcp_DuplicationConfig_r15 = pdcp_DuplicationConfig_r15_;
   }

   public void init () {
      discardTimer = null;
      rlc_AM = null;
      rlc_UM = null;
      headerCompression = null;
      rn_IntegrityProtection_r10 = null;
      pdcp_SN_Size_v1130 = null;
      ul_DataSplitDRB_ViaSCG_r12 = null;
      t_Reordering_r12 = null;
      ul_DataSplitThreshold_r13 = null;
      pdcp_SN_Size_v1310 = null;
      statusFeedback_r13 = null;
      ul_LWA_Config_r14 = null;
      uplinkOnlyHeaderCompression_r14 = null;
      uplinkDataCompression_r15 = null;
      pdcp_DuplicationConfig_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 16; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return discardTimer;
         case 1: return rlc_AM;
         case 2: return rlc_UM;
         case 3: return headerCompression;
         case 4: return rn_IntegrityProtection_r10;
         case 5: return pdcp_SN_Size_v1130;
         case 6: return ul_DataSplitDRB_ViaSCG_r12;
         case 7: return t_Reordering_r12;
         case 8: return ul_DataSplitThreshold_r13;
         case 9: return pdcp_SN_Size_v1310;
         case 10: return statusFeedback_r13;
         case 11: return ul_LWA_Config_r14;
         case 12: return uplinkOnlyHeaderCompression_r14;
         case 13: return uplinkDataCompression_r15;
         case 14: return pdcp_DuplicationConfig_r15;
         case 15: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "discardTimer";
         case 1: return "rlc-AM";
         case 2: return "rlc-UM";
         case 3: return "headerCompression";
         case 4: return "rn-IntegrityProtection-r10";
         case 5: return "pdcp-SN-Size-v1130";
         case 6: return "ul-DataSplitDRB-ViaSCG-r12";
         case 7: return "t-Reordering-r12";
         case 8: return "ul-DataSplitThreshold-r13";
         case 9: return "pdcp-SN-Size-v1310";
         case 10: return "statusFeedback-r13";
         case 11: return "ul-LWA-Config-r14";
         case 12: return "uplinkOnlyHeaderCompression-r14";
         case 13: return "uplinkDataCompression-r15";
         case 14: return "pdcp-DuplicationConfig-r15";
         case 15: return null;
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

      boolean discardTimerPresent = buffer.decodeBit ("discardTimerPresent");
      boolean rlc_AMPresent = buffer.decodeBit ("rlc_AMPresent");
      boolean rlc_UMPresent = buffer.decodeBit ("rlc_UMPresent");

      // decode discardTimer

      if (discardTimerPresent) {
         buffer.getContext().eventDispatcher.startElement("discardTimer", -1);

         int tval = PDCP_Config_discardTimer.decodeEnumValue (buffer);
         discardTimer = PDCP_Config_discardTimer.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("discardTimer", -1);
      }
      else {
         discardTimer = null;
      }

      // decode rlc_AM

      if (rlc_AMPresent) {
         buffer.getContext().eventDispatcher.startElement("rlc_AM", -1);

         rlc_AM = new PDCP_Config_rlc_AM();
         rlc_AM.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_AM", -1);
      }
      else {
         rlc_AM = null;
      }

      // decode rlc_UM

      if (rlc_UMPresent) {
         buffer.getContext().eventDispatcher.startElement("rlc_UM", -1);

         rlc_UM = new PDCP_Config_rlc_UM();
         rlc_UM.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_UM", -1);
      }
      else {
         rlc_UM = null;
      }

      // decode headerCompression

      buffer.getContext().eventDispatcher.startElement("headerCompression", -1);

      headerCompression = new PDCP_Config_headerCompression();
      headerCompression.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("headerCompression", -1);

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV3ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV4ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV5ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV6ExtPresent");
         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV7ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean rn_IntegrityProtection_r10Present = buffer.decodeBit ("rn_IntegrityProtection_r10Present");

            // decode rn_IntegrityProtection_r10

            if (rn_IntegrityProtection_r10Present) {
               buffer.getContext().eventDispatcher.startElement("rn_IntegrityProtection_r10", -1);

               int tval = PDCP_Config_rn_IntegrityProtection_r10.decodeEnumValue (buffer);
               rn_IntegrityProtection_r10 = PDCP_Config_rn_IntegrityProtection_r10.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("rn_IntegrityProtection_r10", -1);
            }
            else {
               rn_IntegrityProtection_r10 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean pdcp_SN_Size_v1130Present = buffer.decodeBit ("pdcp_SN_Size_v1130Present");

            // decode pdcp_SN_Size_v1130

            if (pdcp_SN_Size_v1130Present) {
               buffer.getContext().eventDispatcher.startElement("pdcp_SN_Size_v1130", -1);

               int tval = PDCP_Config_pdcp_SN_Size_v1130.decodeEnumValue (buffer);
               pdcp_SN_Size_v1130 = PDCP_Config_pdcp_SN_Size_v1130.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdcp_SN_Size_v1130", -1);
            }
            else {
               pdcp_SN_Size_v1130 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV4ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean ul_DataSplitDRB_ViaSCG_r12Present = buffer.decodeBit ("ul_DataSplitDRB_ViaSCG_r12Present");

            boolean t_Reordering_r12Present = buffer.decodeBit ("t_Reordering_r12Present");

            // decode ul_DataSplitDRB_ViaSCG_r12

            if (ul_DataSplitDRB_ViaSCG_r12Present) {
               buffer.getContext().eventDispatcher.startElement("ul_DataSplitDRB_ViaSCG_r12", -1);

               ul_DataSplitDRB_ViaSCG_r12 = new Asn1Boolean();
               ul_DataSplitDRB_ViaSCG_r12.decode (buffer);

               buffer.invokeCharacters(ul_DataSplitDRB_ViaSCG_r12.toString());
               buffer.getContext().eventDispatcher.endElement("ul_DataSplitDRB_ViaSCG_r12", -1);
            }
            else {
               ul_DataSplitDRB_ViaSCG_r12 = null;
            }

            // decode t_Reordering_r12

            if (t_Reordering_r12Present) {
               buffer.getContext().eventDispatcher.startElement("t_Reordering_r12", -1);

               int tval = PDCP_Config_t_Reordering_r12.decodeEnumValue (buffer);
               t_Reordering_r12 = PDCP_Config_t_Reordering_r12.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("t_Reordering_r12", -1);
            }
            else {
               t_Reordering_r12 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV5ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean ul_DataSplitThreshold_r13Present = buffer.decodeBit ("ul_DataSplitThreshold_r13Present");

            boolean pdcp_SN_Size_v1310Present = buffer.decodeBit ("pdcp_SN_Size_v1310Present");

            boolean statusFeedback_r13Present = buffer.decodeBit ("statusFeedback_r13Present");

            // decode ul_DataSplitThreshold_r13

            if (ul_DataSplitThreshold_r13Present) {
               buffer.getContext().eventDispatcher.startElement("ul_DataSplitThreshold_r13", -1);

               ul_DataSplitThreshold_r13 = new PDCP_Config_ul_DataSplitThreshold_r13();
               ul_DataSplitThreshold_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ul_DataSplitThreshold_r13", -1);
            }
            else {
               ul_DataSplitThreshold_r13 = null;
            }

            // decode pdcp_SN_Size_v1310

            if (pdcp_SN_Size_v1310Present) {
               buffer.getContext().eventDispatcher.startElement("pdcp_SN_Size_v1310", -1);

               int tval = PDCP_Config_pdcp_SN_Size_v1310.decodeEnumValue (buffer);
               pdcp_SN_Size_v1310 = PDCP_Config_pdcp_SN_Size_v1310.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdcp_SN_Size_v1310", -1);
            }
            else {
               pdcp_SN_Size_v1310 = null;
            }

            // decode statusFeedback_r13

            if (statusFeedback_r13Present) {
               buffer.getContext().eventDispatcher.startElement("statusFeedback_r13", -1);

               statusFeedback_r13 = new PDCP_Config_statusFeedback_r13();
               statusFeedback_r13.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("statusFeedback_r13", -1);
            }
            else {
               statusFeedback_r13 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV6ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean ul_LWA_Config_r14Present = buffer.decodeBit ("ul_LWA_Config_r14Present");

            boolean uplinkOnlyHeaderCompression_r14Present = buffer.decodeBit ("uplinkOnlyHeaderCompression_r14Present");

            // decode ul_LWA_Config_r14

            if (ul_LWA_Config_r14Present) {
               buffer.getContext().eventDispatcher.startElement("ul_LWA_Config_r14", -1);

               ul_LWA_Config_r14 = new PDCP_Config_ul_LWA_Config_r14();
               ul_LWA_Config_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ul_LWA_Config_r14", -1);
            }
            else {
               ul_LWA_Config_r14 = null;
            }

            // decode uplinkOnlyHeaderCompression_r14

            if (uplinkOnlyHeaderCompression_r14Present) {
               buffer.getContext().eventDispatcher.startElement("uplinkOnlyHeaderCompression_r14", -1);

               uplinkOnlyHeaderCompression_r14 = new PDCP_Config_uplinkOnlyHeaderCompression_r14();
               uplinkOnlyHeaderCompression_r14.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("uplinkOnlyHeaderCompression_r14", -1);
            }
            else {
               uplinkOnlyHeaderCompression_r14 = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV7ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean uplinkDataCompression_r15Present = buffer.decodeBit ("uplinkDataCompression_r15Present");

            boolean pdcp_DuplicationConfig_r15Present = buffer.decodeBit ("pdcp_DuplicationConfig_r15Present");

            // decode uplinkDataCompression_r15

            if (uplinkDataCompression_r15Present) {
               buffer.getContext().eventDispatcher.startElement("uplinkDataCompression_r15", -1);

               uplinkDataCompression_r15 = new PDCP_Config_uplinkDataCompression_r15();
               uplinkDataCompression_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("uplinkDataCompression_r15", -1);
            }
            else {
               uplinkDataCompression_r15 = null;
            }

            // decode pdcp_DuplicationConfig_r15

            if (pdcp_DuplicationConfig_r15Present) {
               buffer.getContext().eventDispatcher.startElement("pdcp_DuplicationConfig_r15", -1);

               pdcp_DuplicationConfig_r15 = new PDCP_Config_pdcp_DuplicationConfig_r15();
               pdcp_DuplicationConfig_r15.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("pdcp_DuplicationConfig_r15", -1);
            }
            else {
               pdcp_DuplicationConfig_r15 = null;
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
      if (discardTimer != null) discardTimer.print (_sb, "discardTimer", _level+1);
      if (rlc_AM != null) rlc_AM.print (_sb, "rlc_AM", _level+1);
      if (rlc_UM != null) rlc_UM.print (_sb, "rlc_UM", _level+1);
      if (headerCompression != null) headerCompression.print (_sb, "headerCompression", _level+1);
      if (rn_IntegrityProtection_r10 != null) rn_IntegrityProtection_r10.print (_sb, "rn_IntegrityProtection_r10", _level+1);
      if (pdcp_SN_Size_v1130 != null) pdcp_SN_Size_v1130.print (_sb, "pdcp_SN_Size_v1130", _level+1);
      if (ul_DataSplitDRB_ViaSCG_r12 != null) ul_DataSplitDRB_ViaSCG_r12.print (_sb, "ul_DataSplitDRB_ViaSCG_r12", _level+1);
      if (t_Reordering_r12 != null) t_Reordering_r12.print (_sb, "t_Reordering_r12", _level+1);
      if (ul_DataSplitThreshold_r13 != null) ul_DataSplitThreshold_r13.print (_sb, "ul_DataSplitThreshold_r13", _level+1);
      if (pdcp_SN_Size_v1310 != null) pdcp_SN_Size_v1310.print (_sb, "pdcp_SN_Size_v1310", _level+1);
      if (statusFeedback_r13 != null) statusFeedback_r13.print (_sb, "statusFeedback_r13", _level+1);
      if (ul_LWA_Config_r14 != null) ul_LWA_Config_r14.print (_sb, "ul_LWA_Config_r14", _level+1);
      if (uplinkOnlyHeaderCompression_r14 != null) uplinkOnlyHeaderCompression_r14.print (_sb, "uplinkOnlyHeaderCompression_r14", _level+1);
      if (uplinkDataCompression_r15 != null) uplinkDataCompression_r15.print (_sb, "uplinkDataCompression_r15", _level+1);
      if (pdcp_DuplicationConfig_r15 != null) pdcp_DuplicationConfig_r15.print (_sb, "pdcp_DuplicationConfig_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
