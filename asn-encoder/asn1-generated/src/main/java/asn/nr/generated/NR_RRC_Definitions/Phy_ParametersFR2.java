/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Phy_ParametersFR2 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Phy-ParametersFR2";
   }

   public Phy_ParametersFR2_dummy dummy = null;  // optional
   public Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSymbol pdsch_RE_MappingFR2_PerSymbol = null;  // optional
   public boolean mV2ExtPresent;
   public Phy_ParametersFR2_pCell_FR2 pCell_FR2 = null;  // optional
   public Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSlot pdsch_RE_MappingFR2_PerSlot = null;  // optional
   public boolean mV3ExtPresent;
   public Phy_ParametersFR2_defaultSpatialRelationPathlossRS_r16 defaultSpatialRelationPathlossRS_r16 = null;  // optional
   public Phy_ParametersFR2_spatialRelationUpdateAP_SRS_r16 spatialRelationUpdateAP_SRS_r16 = null;  // optional
   public Phy_ParametersFR2_maxNumberSRS_PosSpatialRelationsAllServingCells_r16 maxNumberSRS_PosSpatialRelationsAllServingCells_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public Phy_ParametersFR2 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Phy_ParametersFR2 (
      Phy_ParametersFR2_dummy dummy_,
      Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSymbol pdsch_RE_MappingFR2_PerSymbol_,
      Phy_ParametersFR2_pCell_FR2 pCell_FR2_,
      Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSlot pdsch_RE_MappingFR2_PerSlot_,
      Phy_ParametersFR2_defaultSpatialRelationPathlossRS_r16 defaultSpatialRelationPathlossRS_r16_,
      Phy_ParametersFR2_spatialRelationUpdateAP_SRS_r16 spatialRelationUpdateAP_SRS_r16_,
      Phy_ParametersFR2_maxNumberSRS_PosSpatialRelationsAllServingCells_r16 maxNumberSRS_PosSpatialRelationsAllServingCells_r16_
   ) {
      super();
      dummy = dummy_;
      pdsch_RE_MappingFR2_PerSymbol = pdsch_RE_MappingFR2_PerSymbol_;
      pCell_FR2 = pCell_FR2_;
      pdsch_RE_MappingFR2_PerSlot = pdsch_RE_MappingFR2_PerSlot_;
      defaultSpatialRelationPathlossRS_r16 = defaultSpatialRelationPathlossRS_r16_;
      spatialRelationUpdateAP_SRS_r16 = spatialRelationUpdateAP_SRS_r16_;
      maxNumberSRS_PosSpatialRelationsAllServingCells_r16 = maxNumberSRS_PosSpatialRelationsAllServingCells_r16_;
   }

   public void init () {
      dummy = null;
      pdsch_RE_MappingFR2_PerSymbol = null;
      pCell_FR2 = null;
      pdsch_RE_MappingFR2_PerSlot = null;
      defaultSpatialRelationPathlossRS_r16 = null;
      spatialRelationUpdateAP_SRS_r16 = null;
      maxNumberSRS_PosSpatialRelationsAllServingCells_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return dummy;
         case 1: return pdsch_RE_MappingFR2_PerSymbol;
         case 2: return pCell_FR2;
         case 3: return pdsch_RE_MappingFR2_PerSlot;
         case 4: return defaultSpatialRelationPathlossRS_r16;
         case 5: return spatialRelationUpdateAP_SRS_r16;
         case 6: return maxNumberSRS_PosSpatialRelationsAllServingCells_r16;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "dummy";
         case 1: return "pdsch-RE-MappingFR2-PerSymbol";
         case 2: return "pCell-FR2";
         case 3: return "pdsch-RE-MappingFR2-PerSlot";
         case 4: return "defaultSpatialRelationPathlossRS-r16";
         case 5: return "spatialRelationUpdateAP-SRS-r16";
         case 6: return "maxNumberSRS-PosSpatialRelationsAllServingCells-r16";
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

      boolean dummyPresent = buffer.decodeBit ("dummyPresent");
      boolean pdsch_RE_MappingFR2_PerSymbolPresent = buffer.decodeBit ("pdsch_RE_MappingFR2_PerSymbolPresent");

      // decode dummy

      if (dummyPresent) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         int tval = Phy_ParametersFR2_dummy.decodeEnumValue (buffer);
         dummy = Phy_ParametersFR2_dummy.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else {
         dummy = null;
      }

      // decode pdsch_RE_MappingFR2_PerSymbol

      if (pdsch_RE_MappingFR2_PerSymbolPresent) {
         buffer.getContext().eventDispatcher.startElement("pdsch_RE_MappingFR2_PerSymbol", -1);

         int tval = Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSymbol.decodeEnumValue (buffer);
         pdsch_RE_MappingFR2_PerSymbol = Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSymbol.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("pdsch_RE_MappingFR2_PerSymbol", -1);
      }
      else {
         pdsch_RE_MappingFR2_PerSymbol = null;
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

            boolean pCell_FR2Present = buffer.decodeBit ("pCell_FR2Present");

            boolean pdsch_RE_MappingFR2_PerSlotPresent = buffer.decodeBit ("pdsch_RE_MappingFR2_PerSlotPresent");

            // decode pCell_FR2

            if (pCell_FR2Present) {
               buffer.getContext().eventDispatcher.startElement("pCell_FR2", -1);

               int tval = Phy_ParametersFR2_pCell_FR2.decodeEnumValue (buffer);
               pCell_FR2 = Phy_ParametersFR2_pCell_FR2.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pCell_FR2", -1);
            }
            else {
               pCell_FR2 = null;
            }

            // decode pdsch_RE_MappingFR2_PerSlot

            if (pdsch_RE_MappingFR2_PerSlotPresent) {
               buffer.getContext().eventDispatcher.startElement("pdsch_RE_MappingFR2_PerSlot", -1);

               int tval = Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSlot.decodeEnumValue (buffer);
               pdsch_RE_MappingFR2_PerSlot = Phy_ParametersFR2_pdsch_RE_MappingFR2_PerSlot.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("pdsch_RE_MappingFR2_PerSlot", -1);
            }
            else {
               pdsch_RE_MappingFR2_PerSlot = null;
            }

            buffer.moveBitCursor (bitidx);
         }

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV3ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean defaultSpatialRelationPathlossRS_r16Present = buffer.decodeBit ("defaultSpatialRelationPathlossRS_r16Present");

            boolean spatialRelationUpdateAP_SRS_r16Present = buffer.decodeBit ("spatialRelationUpdateAP_SRS_r16Present");

            boolean maxNumberSRS_PosSpatialRelationsAllServingCells_r16Present = buffer.decodeBit ("maxNumberSRS_PosSpatialRelationsAllServingCells_r16Present");

            // decode defaultSpatialRelationPathlossRS_r16

            if (defaultSpatialRelationPathlossRS_r16Present) {
               buffer.getContext().eventDispatcher.startElement("defaultSpatialRelationPathlossRS_r16", -1);

               int tval = Phy_ParametersFR2_defaultSpatialRelationPathlossRS_r16.decodeEnumValue (buffer);
               defaultSpatialRelationPathlossRS_r16 = Phy_ParametersFR2_defaultSpatialRelationPathlossRS_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("defaultSpatialRelationPathlossRS_r16", -1);
            }
            else {
               defaultSpatialRelationPathlossRS_r16 = null;
            }

            // decode spatialRelationUpdateAP_SRS_r16

            if (spatialRelationUpdateAP_SRS_r16Present) {
               buffer.getContext().eventDispatcher.startElement("spatialRelationUpdateAP_SRS_r16", -1);

               int tval = Phy_ParametersFR2_spatialRelationUpdateAP_SRS_r16.decodeEnumValue (buffer);
               spatialRelationUpdateAP_SRS_r16 = Phy_ParametersFR2_spatialRelationUpdateAP_SRS_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("spatialRelationUpdateAP_SRS_r16", -1);
            }
            else {
               spatialRelationUpdateAP_SRS_r16 = null;
            }

            // decode maxNumberSRS_PosSpatialRelationsAllServingCells_r16

            if (maxNumberSRS_PosSpatialRelationsAllServingCells_r16Present) {
               buffer.getContext().eventDispatcher.startElement("maxNumberSRS_PosSpatialRelationsAllServingCells_r16", -1);

               int tval = Phy_ParametersFR2_maxNumberSRS_PosSpatialRelationsAllServingCells_r16.decodeEnumValue (buffer);
               maxNumberSRS_PosSpatialRelationsAllServingCells_r16 = Phy_ParametersFR2_maxNumberSRS_PosSpatialRelationsAllServingCells_r16.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("maxNumberSRS_PosSpatialRelationsAllServingCells_r16", -1);
            }
            else {
               maxNumberSRS_PosSpatialRelationsAllServingCells_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (mV2ExtPresent ||
      mV3ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((dummy != null), null);
      buffer.encodeBit ((pdsch_RE_MappingFR2_PerSymbol != null), null);

      // encode dummy

      if (dummy != null) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }

      // encode pdsch_RE_MappingFR2_PerSymbol

      if (pdsch_RE_MappingFR2_PerSymbol != null) {
         buffer.getContext().eventDispatcher.startElement("pdsch_RE_MappingFR2_PerSymbol", -1);

         pdsch_RE_MappingFR2_PerSymbol.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("pdsch_RE_MappingFR2_PerSymbol", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 2;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);
         buffer.encodeBit (mV3ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((pCell_FR2 != null), "optbit");
            buffer.encodeBit ((pdsch_RE_MappingFR2_PerSlot != null), "optbit");
            if (pCell_FR2 != null) {
               pCell_FR2.encode (buffer);
            }
            if (pdsch_RE_MappingFR2_PerSlot != null) {
               pdsch_RE_MappingFR2_PerSlot.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         if (mV3ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((defaultSpatialRelationPathlossRS_r16 != null), "optbit");
            buffer.encodeBit ((spatialRelationUpdateAP_SRS_r16 != null), "optbit");
            buffer.encodeBit ((maxNumberSRS_PosSpatialRelationsAllServingCells_r16 != null), "optbit");
            if (defaultSpatialRelationPathlossRS_r16 != null) {
               defaultSpatialRelationPathlossRS_r16.encode (buffer);
            }
            if (spatialRelationUpdateAP_SRS_r16 != null) {
               spatialRelationUpdateAP_SRS_r16.encode (buffer);
            }
            if (maxNumberSRS_PosSpatialRelationsAllServingCells_r16 != null) {
               maxNumberSRS_PosSpatialRelationsAllServingCells_r16.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      if (pdsch_RE_MappingFR2_PerSymbol != null) pdsch_RE_MappingFR2_PerSymbol.print (_sb, "pdsch_RE_MappingFR2_PerSymbol", _level+1);
      if (pCell_FR2 != null) pCell_FR2.print (_sb, "pCell_FR2", _level+1);
      if (pdsch_RE_MappingFR2_PerSlot != null) pdsch_RE_MappingFR2_PerSlot.print (_sb, "pdsch_RE_MappingFR2_PerSlot", _level+1);
      if (defaultSpatialRelationPathlossRS_r16 != null) defaultSpatialRelationPathlossRS_r16.print (_sb, "defaultSpatialRelationPathlossRS_r16", _level+1);
      if (spatialRelationUpdateAP_SRS_r16 != null) spatialRelationUpdateAP_SRS_r16.print (_sb, "spatialRelationUpdateAP_SRS_r16", _level+1);
      if (maxNumberSRS_PosSpatialRelationsAllServingCells_r16 != null) maxNumberSRS_PosSpatialRelationsAllServingCells_r16.print (_sb, "maxNumberSRS_PosSpatialRelationsAllServingCells_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
