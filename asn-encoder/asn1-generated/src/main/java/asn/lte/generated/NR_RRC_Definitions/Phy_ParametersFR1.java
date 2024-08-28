/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersFR1 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Phy-ParametersFR1";
   }

   public Phy_ParametersFR1_pdcch_MonitoringSingleOccasion pdcch_MonitoringSingleOccasion = null;  // optional
   public Phy_ParametersFR1_scs_60kHz scs_60kHz = null;  // optional
   public Phy_ParametersFR1_pdsch_256QAM_FR1 pdsch_256QAM_FR1 = null;  // optional
   public Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSymbol pdsch_RE_MappingFR1_PerSymbol = null;  // optional
   public boolean mV2ExtPresent;
   public Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSlot pdsch_RE_MappingFR1_PerSlot = null;  // optional
   public Asn1OpenExt extElem1;

   public Phy_ParametersFR1 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Phy_ParametersFR1 (
      Phy_ParametersFR1_pdcch_MonitoringSingleOccasion pdcch_MonitoringSingleOccasion_,
      Phy_ParametersFR1_scs_60kHz scs_60kHz_,
      Phy_ParametersFR1_pdsch_256QAM_FR1 pdsch_256QAM_FR1_,
      Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSymbol pdsch_RE_MappingFR1_PerSymbol_,
      Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSlot pdsch_RE_MappingFR1_PerSlot_
   ) {
      super();
      pdcch_MonitoringSingleOccasion = pdcch_MonitoringSingleOccasion_;
      scs_60kHz = scs_60kHz_;
      pdsch_256QAM_FR1 = pdsch_256QAM_FR1_;
      pdsch_RE_MappingFR1_PerSymbol = pdsch_RE_MappingFR1_PerSymbol_;
      pdsch_RE_MappingFR1_PerSlot = pdsch_RE_MappingFR1_PerSlot_;
   }

   public void init () {
      pdcch_MonitoringSingleOccasion = null;
      scs_60kHz = null;
      pdsch_256QAM_FR1 = null;
      pdsch_RE_MappingFR1_PerSymbol = null;
      pdsch_RE_MappingFR1_PerSlot = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pdcch_MonitoringSingleOccasion;
         case 1: return scs_60kHz;
         case 2: return pdsch_256QAM_FR1;
         case 3: return pdsch_RE_MappingFR1_PerSymbol;
         case 4: return pdsch_RE_MappingFR1_PerSlot;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pdcch-MonitoringSingleOccasion";
         case 1: return "scs-60kHz";
         case 2: return "pdsch-256QAM-FR1";
         case 3: return "pdsch-RE-MappingFR1-PerSymbol";
         case 4: return "pdsch-RE-MappingFR1-PerSlot";
         case 5: return null;
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

      boolean pdcch_MonitoringSingleOccasionPresent = buffer.decodeBit ("pdcch_MonitoringSingleOccasionPresent");
      boolean scs_60kHzPresent = buffer.decodeBit ("scs_60kHzPresent");
      boolean pdsch_256QAM_FR1Present = buffer.decodeBit ("pdsch_256QAM_FR1Present");
      boolean pdsch_RE_MappingFR1_PerSymbolPresent = buffer.decodeBit ("pdsch_RE_MappingFR1_PerSymbolPresent");

      // decode pdcch_MonitoringSingleOccasion

      if (pdcch_MonitoringSingleOccasionPresent) {
         buffer.getContext().eventDispatcher.startElement("pdcch_MonitoringSingleOccasion", -1);

         int tval = Phy_ParametersFR1_pdcch_MonitoringSingleOccasion.decodeEnumValue (buffer);
         pdcch_MonitoringSingleOccasion = Phy_ParametersFR1_pdcch_MonitoringSingleOccasion.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdcch_MonitoringSingleOccasion", -1);
      }
      else {
         pdcch_MonitoringSingleOccasion = null;
      }

      // decode scs_60kHz

      if (scs_60kHzPresent) {
         buffer.getContext().eventDispatcher.startElement("scs_60kHz", -1);

         int tval = Phy_ParametersFR1_scs_60kHz.decodeEnumValue (buffer);
         scs_60kHz = Phy_ParametersFR1_scs_60kHz.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("scs_60kHz", -1);
      }
      else {
         scs_60kHz = null;
      }

      // decode pdsch_256QAM_FR1

      if (pdsch_256QAM_FR1Present) {
         buffer.getContext().eventDispatcher.startElement("pdsch_256QAM_FR1", -1);

         int tval = Phy_ParametersFR1_pdsch_256QAM_FR1.decodeEnumValue (buffer);
         pdsch_256QAM_FR1 = Phy_ParametersFR1_pdsch_256QAM_FR1.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_256QAM_FR1", -1);
      }
      else {
         pdsch_256QAM_FR1 = null;
      }

      // decode pdsch_RE_MappingFR1_PerSymbol

      if (pdsch_RE_MappingFR1_PerSymbolPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_RE_MappingFR1_PerSymbol", -1);

         int tval = Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSymbol.decodeEnumValue (buffer);
         pdsch_RE_MappingFR1_PerSymbol = Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSymbol.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_RE_MappingFR1_PerSymbol", -1);
      }
      else {
         pdsch_RE_MappingFR1_PerSymbol = null;
      }

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

            boolean pdsch_RE_MappingFR1_PerSlotPresent = buffer.decodeBit ("pdsch_RE_MappingFR1_PerSlotPresent");

            // decode pdsch_RE_MappingFR1_PerSlot

            if (pdsch_RE_MappingFR1_PerSlotPresent) {
               buffer.getContext().eventDispatcher.startElement("pdsch_RE_MappingFR1_PerSlot", -1);

               int tval = Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSlot.decodeEnumValue (buffer);
               pdsch_RE_MappingFR1_PerSlot = Phy_ParametersFR1_pdsch_RE_MappingFR1_PerSlot.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdsch_RE_MappingFR1_PerSlot", -1);
            }
            else {
               pdsch_RE_MappingFR1_PerSlot = null;
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
      if (pdcch_MonitoringSingleOccasion != null) pdcch_MonitoringSingleOccasion.print (_sb, "pdcch_MonitoringSingleOccasion", _level+1);
      if (scs_60kHz != null) scs_60kHz.print (_sb, "scs_60kHz", _level+1);
      if (pdsch_256QAM_FR1 != null) pdsch_256QAM_FR1.print (_sb, "pdsch_256QAM_FR1", _level+1);
      if (pdsch_RE_MappingFR1_PerSymbol != null) pdsch_RE_MappingFR1_PerSymbol.print (_sb, "pdsch_RE_MappingFR1_PerSymbol", _level+1);
      if (pdsch_RE_MappingFR1_PerSlot != null) pdsch_RE_MappingFR1_PerSlot.print (_sb, "pdsch_RE_MappingFR1_PerSlot", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
