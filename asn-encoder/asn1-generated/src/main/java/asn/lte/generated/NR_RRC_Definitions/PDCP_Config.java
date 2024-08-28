/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCP_Config extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PDCP-Config";
   }

   public PDCP_Config_drb drb;  // optional
   public PDCP_Config_moreThanOneRLC moreThanOneRLC;  // optional
   public PDCP_Config_t_Reordering t_Reordering = null;  // optional
   public boolean mV2ExtPresent;
   public PDCP_Config_cipheringDisabled cipheringDisabled = null;  // optional
   public boolean mV3ExtPresent;
   public PDCP_Config_discardTimerExt_r16 discardTimerExt_r16;  // optional
   public PDCP_Config_moreThanTwoRLC_DRB_r16 moreThanTwoRLC_DRB_r16;  // optional
   public PDCP_Config_ethernetHeaderCompression_r16 ethernetHeaderCompression_r16;  // optional
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
      PDCP_Config_drb drb_,
      PDCP_Config_moreThanOneRLC moreThanOneRLC_,
      PDCP_Config_t_Reordering t_Reordering_,
      PDCP_Config_cipheringDisabled cipheringDisabled_,
      PDCP_Config_discardTimerExt_r16 discardTimerExt_r16_,
      PDCP_Config_moreThanTwoRLC_DRB_r16 moreThanTwoRLC_DRB_r16_,
      PDCP_Config_ethernetHeaderCompression_r16 ethernetHeaderCompression_r16_
   ) {
      super();
      drb = drb_;
      moreThanOneRLC = moreThanOneRLC_;
      t_Reordering = t_Reordering_;
      cipheringDisabled = cipheringDisabled_;
      discardTimerExt_r16 = discardTimerExt_r16_;
      moreThanTwoRLC_DRB_r16 = moreThanTwoRLC_DRB_r16_;
      ethernetHeaderCompression_r16 = ethernetHeaderCompression_r16_;
   }

   public void init () {
      drb = null;
      moreThanOneRLC = null;
      t_Reordering = null;
      cipheringDisabled = null;
      discardTimerExt_r16 = null;
      moreThanTwoRLC_DRB_r16 = null;
      ethernetHeaderCompression_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return drb;
         case 1: return moreThanOneRLC;
         case 2: return t_Reordering;
         case 3: return cipheringDisabled;
         case 4: return discardTimerExt_r16;
         case 5: return moreThanTwoRLC_DRB_r16;
         case 6: return ethernetHeaderCompression_r16;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "drb";
         case 1: return "moreThanOneRLC";
         case 2: return "t-Reordering";
         case 3: return "cipheringDisabled";
         case 4: return "discardTimerExt-r16";
         case 5: return "moreThanTwoRLC-DRB-r16";
         case 6: return "ethernetHeaderCompression-r16";
         case 7: return null;
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

      boolean drbPresent = buffer.decodeBit ("drbPresent");
      boolean moreThanOneRLCPresent = buffer.decodeBit ("moreThanOneRLCPresent");
      boolean t_ReorderingPresent = buffer.decodeBit ("t_ReorderingPresent");

      // decode drb

      if (drbPresent) {
         buffer.getContext().eventDispatcher.startElement("drb", -1);

         drb = new PDCP_Config_drb();
         drb.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drb", -1);
      }
      else {
         drb = null;
      }

      // decode moreThanOneRLC

      if (moreThanOneRLCPresent) {
         buffer.getContext().eventDispatcher.startElement("moreThanOneRLC", -1);

         moreThanOneRLC = new PDCP_Config_moreThanOneRLC();
         moreThanOneRLC.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("moreThanOneRLC", -1);
      }
      else {
         moreThanOneRLC = null;
      }

      // decode t_Reordering

      if (t_ReorderingPresent) {
         buffer.getContext().eventDispatcher.startElement("t_Reordering", -1);

         int tval = PDCP_Config_t_Reordering.decodeEnumValue (buffer);
         t_Reordering = PDCP_Config_t_Reordering.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("t_Reordering", -1);
      }
      else {
         t_Reordering = null;
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

            boolean cipheringDisabledPresent = buffer.decodeBit ("cipheringDisabledPresent");

            // decode cipheringDisabled

            if (cipheringDisabledPresent) {
               buffer.getContext().eventDispatcher.startElement("cipheringDisabled", -1);

               int tval = PDCP_Config_cipheringDisabled.decodeEnumValue (buffer);
               cipheringDisabled = PDCP_Config_cipheringDisabled.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("cipheringDisabled", -1);
            }
            else {
               cipheringDisabled = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean discardTimerExt_r16Present = buffer.decodeBit ("discardTimerExt_r16Present");

            boolean moreThanTwoRLC_DRB_r16Present = buffer.decodeBit ("moreThanTwoRLC_DRB_r16Present");

            boolean ethernetHeaderCompression_r16Present = buffer.decodeBit ("ethernetHeaderCompression_r16Present");

            // decode discardTimerExt_r16

            if (discardTimerExt_r16Present) {
               buffer.getContext().eventDispatcher.startElement("discardTimerExt_r16", -1);

               discardTimerExt_r16 = new PDCP_Config_discardTimerExt_r16();
               discardTimerExt_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("discardTimerExt_r16", -1);
            }
            else {
               discardTimerExt_r16 = null;
            }

            // decode moreThanTwoRLC_DRB_r16

            if (moreThanTwoRLC_DRB_r16Present) {
               buffer.getContext().eventDispatcher.startElement("moreThanTwoRLC_DRB_r16", -1);

               moreThanTwoRLC_DRB_r16 = new PDCP_Config_moreThanTwoRLC_DRB_r16();
               moreThanTwoRLC_DRB_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("moreThanTwoRLC_DRB_r16", -1);
            }
            else {
               moreThanTwoRLC_DRB_r16 = null;
            }

            // decode ethernetHeaderCompression_r16

            if (ethernetHeaderCompression_r16Present) {
               buffer.getContext().eventDispatcher.startElement("ethernetHeaderCompression_r16", -1);

               ethernetHeaderCompression_r16 = new PDCP_Config_ethernetHeaderCompression_r16();
               ethernetHeaderCompression_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ethernetHeaderCompression_r16", -1);
            }
            else {
               ethernetHeaderCompression_r16 = null;
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
      if (drb != null) drb.print (_sb, "drb", _level+1);
      if (moreThanOneRLC != null) moreThanOneRLC.print (_sb, "moreThanOneRLC", _level+1);
      if (t_Reordering != null) t_Reordering.print (_sb, "t_Reordering", _level+1);
      if (cipheringDisabled != null) cipheringDisabled.print (_sb, "cipheringDisabled", _level+1);
      if (discardTimerExt_r16 != null) discardTimerExt_r16.print (_sb, "discardTimerExt_r16", _level+1);
      if (moreThanTwoRLC_DRB_r16 != null) moreThanTwoRLC_DRB_r16.print (_sb, "moreThanTwoRLC_DRB_r16", _level+1);
      if (ethernetHeaderCompression_r16 != null) ethernetHeaderCompression_r16.print (_sb, "ethernetHeaderCompression_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
