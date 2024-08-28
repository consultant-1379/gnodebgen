/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PSFCH_Config_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PSFCH-Config-r16";
   }

   public SL_PSFCH_Config_r16_sl_PSFCH_Period_r16 sl_PSFCH_Period_r16 = null;  // optional
   public Asn1BitString sl_PSFCH_RB_Set_r16;  // optional
   public SL_PSFCH_Config_r16_sl_NumMuxCS_Pair_r16 sl_NumMuxCS_Pair_r16 = null;  // optional
   public SL_PSFCH_Config_r16_sl_MinTimeGapPSFCH_r16 sl_MinTimeGapPSFCH_r16 = null;  // optional
   public Asn1Integer sl_PSFCH_HopID_r16;  // optional
   public SL_PSFCH_Config_r16_sl_PSFCH_CandidateResourceType_r16 sl_PSFCH_CandidateResourceType_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public SL_PSFCH_Config_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PSFCH_Config_r16 (
      SL_PSFCH_Config_r16_sl_PSFCH_Period_r16 sl_PSFCH_Period_r16_,
      Asn1BitString sl_PSFCH_RB_Set_r16_,
      SL_PSFCH_Config_r16_sl_NumMuxCS_Pair_r16 sl_NumMuxCS_Pair_r16_,
      SL_PSFCH_Config_r16_sl_MinTimeGapPSFCH_r16 sl_MinTimeGapPSFCH_r16_,
      Asn1Integer sl_PSFCH_HopID_r16_,
      SL_PSFCH_Config_r16_sl_PSFCH_CandidateResourceType_r16 sl_PSFCH_CandidateResourceType_r16_
   ) {
      super();
      sl_PSFCH_Period_r16 = sl_PSFCH_Period_r16_;
      sl_PSFCH_RB_Set_r16 = sl_PSFCH_RB_Set_r16_;
      sl_NumMuxCS_Pair_r16 = sl_NumMuxCS_Pair_r16_;
      sl_MinTimeGapPSFCH_r16 = sl_MinTimeGapPSFCH_r16_;
      sl_PSFCH_HopID_r16 = sl_PSFCH_HopID_r16_;
      sl_PSFCH_CandidateResourceType_r16 = sl_PSFCH_CandidateResourceType_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_PSFCH_Config_r16 (SL_PSFCH_Config_r16_sl_PSFCH_Period_r16 sl_PSFCH_Period_r16_,
      Asn1BitString sl_PSFCH_RB_Set_r16_,
      SL_PSFCH_Config_r16_sl_NumMuxCS_Pair_r16 sl_NumMuxCS_Pair_r16_,
      SL_PSFCH_Config_r16_sl_MinTimeGapPSFCH_r16 sl_MinTimeGapPSFCH_r16_,
      long sl_PSFCH_HopID_r16_,
      SL_PSFCH_Config_r16_sl_PSFCH_CandidateResourceType_r16 sl_PSFCH_CandidateResourceType_r16_
   ) {
      super();
      sl_PSFCH_Period_r16 = sl_PSFCH_Period_r16_;
      sl_PSFCH_RB_Set_r16 = sl_PSFCH_RB_Set_r16_;
      sl_NumMuxCS_Pair_r16 = sl_NumMuxCS_Pair_r16_;
      sl_MinTimeGapPSFCH_r16 = sl_MinTimeGapPSFCH_r16_;
      sl_PSFCH_HopID_r16 = new Asn1Integer (sl_PSFCH_HopID_r16_);
      sl_PSFCH_CandidateResourceType_r16 = sl_PSFCH_CandidateResourceType_r16_;
   }

   public void init () {
      sl_PSFCH_Period_r16 = null;
      sl_PSFCH_RB_Set_r16 = null;
      sl_NumMuxCS_Pair_r16 = null;
      sl_MinTimeGapPSFCH_r16 = null;
      sl_PSFCH_HopID_r16 = null;
      sl_PSFCH_CandidateResourceType_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 7; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_PSFCH_Period_r16;
         case 1: return sl_PSFCH_RB_Set_r16;
         case 2: return sl_NumMuxCS_Pair_r16;
         case 3: return sl_MinTimeGapPSFCH_r16;
         case 4: return sl_PSFCH_HopID_r16;
         case 5: return sl_PSFCH_CandidateResourceType_r16;
         case 6: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-PSFCH-Period-r16";
         case 1: return "sl-PSFCH-RB-Set-r16";
         case 2: return "sl-NumMuxCS-Pair-r16";
         case 3: return "sl-MinTimeGapPSFCH-r16";
         case 4: return "sl-PSFCH-HopID-r16";
         case 5: return "sl-PSFCH-CandidateResourceType-r16";
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

      boolean sl_PSFCH_Period_r16Present = buffer.decodeBit ("sl_PSFCH_Period_r16Present");
      boolean sl_PSFCH_RB_Set_r16Present = buffer.decodeBit ("sl_PSFCH_RB_Set_r16Present");
      boolean sl_NumMuxCS_Pair_r16Present = buffer.decodeBit ("sl_NumMuxCS_Pair_r16Present");
      boolean sl_MinTimeGapPSFCH_r16Present = buffer.decodeBit ("sl_MinTimeGapPSFCH_r16Present");
      boolean sl_PSFCH_HopID_r16Present = buffer.decodeBit ("sl_PSFCH_HopID_r16Present");
      boolean sl_PSFCH_CandidateResourceType_r16Present = buffer.decodeBit ("sl_PSFCH_CandidateResourceType_r16Present");

      // decode sl_PSFCH_Period_r16

      if (sl_PSFCH_Period_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_PSFCH_Period_r16", -1);

         int tval = SL_PSFCH_Config_r16_sl_PSFCH_Period_r16.decodeEnumValue (buffer);
         sl_PSFCH_Period_r16 = SL_PSFCH_Config_r16_sl_PSFCH_Period_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_PSFCH_Period_r16", -1);
      }
      else {
         sl_PSFCH_Period_r16 = null;
      }

      // decode sl_PSFCH_RB_Set_r16

      if (sl_PSFCH_RB_Set_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_PSFCH_RB_Set_r16", -1);

         sl_PSFCH_RB_Set_r16 = new Asn1BitString();
         sl_PSFCH_RB_Set_r16.decode (buffer, 10, 275);

         buffer.invokeCharacters(sl_PSFCH_RB_Set_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_PSFCH_RB_Set_r16", -1);
      }
      else {
         sl_PSFCH_RB_Set_r16 = null;
      }

      // decode sl_NumMuxCS_Pair_r16

      if (sl_NumMuxCS_Pair_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_NumMuxCS_Pair_r16", -1);

         int tval = SL_PSFCH_Config_r16_sl_NumMuxCS_Pair_r16.decodeEnumValue (buffer);
         sl_NumMuxCS_Pair_r16 = SL_PSFCH_Config_r16_sl_NumMuxCS_Pair_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_NumMuxCS_Pair_r16", -1);
      }
      else {
         sl_NumMuxCS_Pair_r16 = null;
      }

      // decode sl_MinTimeGapPSFCH_r16

      if (sl_MinTimeGapPSFCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_MinTimeGapPSFCH_r16", -1);

         int tval = SL_PSFCH_Config_r16_sl_MinTimeGapPSFCH_r16.decodeEnumValue (buffer);
         sl_MinTimeGapPSFCH_r16 = SL_PSFCH_Config_r16_sl_MinTimeGapPSFCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_MinTimeGapPSFCH_r16", -1);
      }
      else {
         sl_MinTimeGapPSFCH_r16 = null;
      }

      // decode sl_PSFCH_HopID_r16

      if (sl_PSFCH_HopID_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_PSFCH_HopID_r16", -1);

         sl_PSFCH_HopID_r16 = new Asn1Integer();
         sl_PSFCH_HopID_r16.decode (buffer, 0, 1023);

         buffer.invokeCharacters(sl_PSFCH_HopID_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_PSFCH_HopID_r16", -1);
      }
      else {
         sl_PSFCH_HopID_r16 = null;
      }

      // decode sl_PSFCH_CandidateResourceType_r16

      if (sl_PSFCH_CandidateResourceType_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_PSFCH_CandidateResourceType_r16", -1);

         int tval = SL_PSFCH_Config_r16_sl_PSFCH_CandidateResourceType_r16.decodeEnumValue (buffer);
         sl_PSFCH_CandidateResourceType_r16 = SL_PSFCH_Config_r16_sl_PSFCH_CandidateResourceType_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_PSFCH_CandidateResourceType_r16", -1);
      }
      else {
         sl_PSFCH_CandidateResourceType_r16 = null;
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
      if (sl_PSFCH_Period_r16 != null) sl_PSFCH_Period_r16.print (_sb, "sl_PSFCH_Period_r16", _level+1);
      if (sl_PSFCH_RB_Set_r16 != null) sl_PSFCH_RB_Set_r16.print (_sb, "sl_PSFCH_RB_Set_r16", _level+1);
      if (sl_NumMuxCS_Pair_r16 != null) sl_NumMuxCS_Pair_r16.print (_sb, "sl_NumMuxCS_Pair_r16", _level+1);
      if (sl_MinTimeGapPSFCH_r16 != null) sl_MinTimeGapPSFCH_r16.print (_sb, "sl_MinTimeGapPSFCH_r16", _level+1);
      if (sl_PSFCH_HopID_r16 != null) sl_PSFCH_HopID_r16.print (_sb, "sl_PSFCH_HopID_r16", _level+1);
      if (sl_PSFCH_CandidateResourceType_r16 != null) sl_PSFCH_CandidateResourceType_r16.print (_sb, "sl_PSFCH_CandidateResourceType_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
