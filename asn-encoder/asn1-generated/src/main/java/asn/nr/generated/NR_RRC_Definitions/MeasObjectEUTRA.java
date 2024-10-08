/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasObjectEUTRA extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasObjectEUTRA";
   }

   public ARFCN_ValueEUTRA carrierFreq;
   public EUTRA_AllowedMeasBandwidth allowedMeasBandwidth = null;
   public EUTRA_CellIndexList cellsToRemoveListEUTRAN;  // optional
   public MeasObjectEUTRA_cellsToAddModListEUTRAN cellsToAddModListEUTRAN;  // optional
   public EUTRA_CellIndexList blackCellsToRemoveListEUTRAN;  // optional
   public MeasObjectEUTRA_blackCellsToAddModListEUTRAN blackCellsToAddModListEUTRAN;  // optional
   public EUTRA_PresenceAntennaPort1 eutra_PresenceAntennaPort1;
   public EUTRA_Q_OffsetRange eutra_Q_OffsetRange = null;  // optional
   public Asn1Boolean widebandRSRQ_Meas;
   public Asn1OpenExt extElem1;

   public MeasObjectEUTRA () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasObjectEUTRA (
      ARFCN_ValueEUTRA carrierFreq_,
      EUTRA_AllowedMeasBandwidth allowedMeasBandwidth_,
      EUTRA_CellIndexList cellsToRemoveListEUTRAN_,
      MeasObjectEUTRA_cellsToAddModListEUTRAN cellsToAddModListEUTRAN_,
      EUTRA_CellIndexList blackCellsToRemoveListEUTRAN_,
      MeasObjectEUTRA_blackCellsToAddModListEUTRAN blackCellsToAddModListEUTRAN_,
      EUTRA_PresenceAntennaPort1 eutra_PresenceAntennaPort1_,
      EUTRA_Q_OffsetRange eutra_Q_OffsetRange_,
      Asn1Boolean widebandRSRQ_Meas_
   ) {
      super();
      carrierFreq = carrierFreq_;
      allowedMeasBandwidth = allowedMeasBandwidth_;
      cellsToRemoveListEUTRAN = cellsToRemoveListEUTRAN_;
      cellsToAddModListEUTRAN = cellsToAddModListEUTRAN_;
      blackCellsToRemoveListEUTRAN = blackCellsToRemoveListEUTRAN_;
      blackCellsToAddModListEUTRAN = blackCellsToAddModListEUTRAN_;
      eutra_PresenceAntennaPort1 = eutra_PresenceAntennaPort1_;
      eutra_Q_OffsetRange = eutra_Q_OffsetRange_;
      widebandRSRQ_Meas = widebandRSRQ_Meas_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public MeasObjectEUTRA (
      ARFCN_ValueEUTRA carrierFreq_,
      EUTRA_AllowedMeasBandwidth allowedMeasBandwidth_,
      EUTRA_PresenceAntennaPort1 eutra_PresenceAntennaPort1_,
      Asn1Boolean widebandRSRQ_Meas_
   ) {
      super();
      carrierFreq = carrierFreq_;
      allowedMeasBandwidth = allowedMeasBandwidth_;
      eutra_PresenceAntennaPort1 = eutra_PresenceAntennaPort1_;
      widebandRSRQ_Meas = widebandRSRQ_Meas_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasObjectEUTRA (long carrierFreq_,
      EUTRA_AllowedMeasBandwidth allowedMeasBandwidth_,
      EUTRA_CellIndexList cellsToRemoveListEUTRAN_,
      MeasObjectEUTRA_cellsToAddModListEUTRAN cellsToAddModListEUTRAN_,
      EUTRA_CellIndexList blackCellsToRemoveListEUTRAN_,
      MeasObjectEUTRA_blackCellsToAddModListEUTRAN blackCellsToAddModListEUTRAN_,
      boolean eutra_PresenceAntennaPort1_,
      EUTRA_Q_OffsetRange eutra_Q_OffsetRange_,
      boolean widebandRSRQ_Meas_
   ) {
      super();
      carrierFreq = new ARFCN_ValueEUTRA (carrierFreq_);
      allowedMeasBandwidth = allowedMeasBandwidth_;
      cellsToRemoveListEUTRAN = cellsToRemoveListEUTRAN_;
      cellsToAddModListEUTRAN = cellsToAddModListEUTRAN_;
      blackCellsToRemoveListEUTRAN = blackCellsToRemoveListEUTRAN_;
      blackCellsToAddModListEUTRAN = blackCellsToAddModListEUTRAN_;
      eutra_PresenceAntennaPort1 = new EUTRA_PresenceAntennaPort1 (eutra_PresenceAntennaPort1_);
      eutra_Q_OffsetRange = eutra_Q_OffsetRange_;
      widebandRSRQ_Meas = new Asn1Boolean (widebandRSRQ_Meas_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public MeasObjectEUTRA (
      long carrierFreq_,
      EUTRA_AllowedMeasBandwidth allowedMeasBandwidth_,
      boolean eutra_PresenceAntennaPort1_,
      boolean widebandRSRQ_Meas_
   ) {
      super();
      carrierFreq = new ARFCN_ValueEUTRA (carrierFreq_);
      allowedMeasBandwidth = allowedMeasBandwidth_;
      eutra_PresenceAntennaPort1 = new EUTRA_PresenceAntennaPort1 (eutra_PresenceAntennaPort1_);
      widebandRSRQ_Meas = new Asn1Boolean (widebandRSRQ_Meas_);
   }

   public void init () {
      carrierFreq = null;
      allowedMeasBandwidth = null;
      cellsToRemoveListEUTRAN = null;
      cellsToAddModListEUTRAN = null;
      blackCellsToRemoveListEUTRAN = null;
      blackCellsToAddModListEUTRAN = null;
      eutra_PresenceAntennaPort1 = null;
      eutra_Q_OffsetRange = null;
      widebandRSRQ_Meas = null;
      extElem1 = null;
   }

   public int getElementCount() { return 10; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreq;
         case 1: return allowedMeasBandwidth;
         case 2: return cellsToRemoveListEUTRAN;
         case 3: return cellsToAddModListEUTRAN;
         case 4: return blackCellsToRemoveListEUTRAN;
         case 5: return blackCellsToAddModListEUTRAN;
         case 6: return eutra_PresenceAntennaPort1;
         case 7: return eutra_Q_OffsetRange;
         case 8: return widebandRSRQ_Meas;
         case 9: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreq";
         case 1: return "allowedMeasBandwidth";
         case 2: return "cellsToRemoveListEUTRAN";
         case 3: return "cellsToAddModListEUTRAN";
         case 4: return "blackCellsToRemoveListEUTRAN";
         case 5: return "blackCellsToAddModListEUTRAN";
         case 6: return "eutra-PresenceAntennaPort1";
         case 7: return "eutra-Q-OffsetRange";
         case 8: return "widebandRSRQ-Meas";
         case 9: return null;
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

      boolean cellsToRemoveListEUTRANPresent = buffer.decodeBit ("cellsToRemoveListEUTRANPresent");
      boolean cellsToAddModListEUTRANPresent = buffer.decodeBit ("cellsToAddModListEUTRANPresent");
      boolean blackCellsToRemoveListEUTRANPresent = buffer.decodeBit ("blackCellsToRemoveListEUTRANPresent");
      boolean blackCellsToAddModListEUTRANPresent = buffer.decodeBit ("blackCellsToAddModListEUTRANPresent");
      boolean eutra_Q_OffsetRangePresent = buffer.decodeBit ("eutra_Q_OffsetRangePresent");

      // decode carrierFreq

      buffer.getContext().eventDispatcher.startElement("carrierFreq", -1);

      carrierFreq = new ARFCN_ValueEUTRA();
      carrierFreq.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreq", -1);

      // decode allowedMeasBandwidth

      buffer.getContext().eventDispatcher.startElement("allowedMeasBandwidth", -1);

      {
         int tval = EUTRA_AllowedMeasBandwidth.decodeEnumValue (buffer);
         allowedMeasBandwidth = EUTRA_AllowedMeasBandwidth.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("allowedMeasBandwidth", -1);

      // decode cellsToRemoveListEUTRAN

      if (cellsToRemoveListEUTRANPresent) {
         buffer.getContext().eventDispatcher.startElement("cellsToRemoveListEUTRAN", -1);

         cellsToRemoveListEUTRAN = new EUTRA_CellIndexList();
         cellsToRemoveListEUTRAN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToRemoveListEUTRAN", -1);
      }
      else {
         cellsToRemoveListEUTRAN = null;
      }

      // decode cellsToAddModListEUTRAN

      if (cellsToAddModListEUTRANPresent) {
         buffer.getContext().eventDispatcher.startElement("cellsToAddModListEUTRAN", -1);

         cellsToAddModListEUTRAN = new MeasObjectEUTRA_cellsToAddModListEUTRAN();
         cellsToAddModListEUTRAN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cellsToAddModListEUTRAN", -1);
      }
      else {
         cellsToAddModListEUTRAN = null;
      }

      // decode blackCellsToRemoveListEUTRAN

      if (blackCellsToRemoveListEUTRANPresent) {
         buffer.getContext().eventDispatcher.startElement("blackCellsToRemoveListEUTRAN", -1);

         blackCellsToRemoveListEUTRAN = new EUTRA_CellIndexList();
         blackCellsToRemoveListEUTRAN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("blackCellsToRemoveListEUTRAN", -1);
      }
      else {
         blackCellsToRemoveListEUTRAN = null;
      }

      // decode blackCellsToAddModListEUTRAN

      if (blackCellsToAddModListEUTRANPresent) {
         buffer.getContext().eventDispatcher.startElement("blackCellsToAddModListEUTRAN", -1);

         blackCellsToAddModListEUTRAN = new MeasObjectEUTRA_blackCellsToAddModListEUTRAN();
         blackCellsToAddModListEUTRAN.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("blackCellsToAddModListEUTRAN", -1);
      }
      else {
         blackCellsToAddModListEUTRAN = null;
      }

      // decode eutra_PresenceAntennaPort1

      buffer.getContext().eventDispatcher.startElement("eutra_PresenceAntennaPort1", -1);

      eutra_PresenceAntennaPort1 = new EUTRA_PresenceAntennaPort1();
      eutra_PresenceAntennaPort1.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("eutra_PresenceAntennaPort1", -1);

      // decode eutra_Q_OffsetRange

      if (eutra_Q_OffsetRangePresent) {
         buffer.getContext().eventDispatcher.startElement("eutra_Q_OffsetRange", -1);

         int tval = EUTRA_Q_OffsetRange.decodeEnumValue (buffer);
         eutra_Q_OffsetRange = EUTRA_Q_OffsetRange.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("eutra_Q_OffsetRange", -1);
      }
      else {
         eutra_Q_OffsetRange = null;
      }

      // decode widebandRSRQ_Meas

      buffer.getContext().eventDispatcher.startElement("widebandRSRQ_Meas", -1);

      widebandRSRQ_Meas = new Asn1Boolean();
      widebandRSRQ_Meas.decode (buffer);

      buffer.invokeCharacters(widebandRSRQ_Meas.toString());
      buffer.getContext().eventDispatcher.endElement("widebandRSRQ_Meas", -1);

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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((cellsToRemoveListEUTRAN != null), null);
      buffer.encodeBit ((cellsToAddModListEUTRAN != null), null);
      buffer.encodeBit ((blackCellsToRemoveListEUTRAN != null), null);
      buffer.encodeBit ((blackCellsToAddModListEUTRAN != null), null);
      buffer.encodeBit ((eutra_Q_OffsetRange != null), null);

      // encode carrierFreq

      if (carrierFreq != null) {
         buffer.getContext().eventDispatcher.startElement("carrierFreq", -1);

         carrierFreq.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("carrierFreq", -1);
      }
      else throw new Asn1MissingRequiredException ("carrierFreq");

      // encode allowedMeasBandwidth

      if (allowedMeasBandwidth != null) {
         buffer.getContext().eventDispatcher.startElement("allowedMeasBandwidth", -1);

         allowedMeasBandwidth.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("allowedMeasBandwidth", -1);
      }
      else throw new Asn1MissingRequiredException ("allowedMeasBandwidth");

      // encode cellsToRemoveListEUTRAN

      if (cellsToRemoveListEUTRAN != null) {
         buffer.getContext().eventDispatcher.startElement("cellsToRemoveListEUTRAN", -1);

         cellsToRemoveListEUTRAN.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellsToRemoveListEUTRAN", -1);
      }

      // encode cellsToAddModListEUTRAN

      if (cellsToAddModListEUTRAN != null) {
         buffer.getContext().eventDispatcher.startElement("cellsToAddModListEUTRAN", -1);

         cellsToAddModListEUTRAN.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cellsToAddModListEUTRAN", -1);
      }

      // encode blackCellsToRemoveListEUTRAN

      if (blackCellsToRemoveListEUTRAN != null) {
         buffer.getContext().eventDispatcher.startElement("blackCellsToRemoveListEUTRAN", -1);

         blackCellsToRemoveListEUTRAN.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("blackCellsToRemoveListEUTRAN", -1);
      }

      // encode blackCellsToAddModListEUTRAN

      if (blackCellsToAddModListEUTRAN != null) {
         buffer.getContext().eventDispatcher.startElement("blackCellsToAddModListEUTRAN", -1);

         blackCellsToAddModListEUTRAN.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("blackCellsToAddModListEUTRAN", -1);
      }

      // encode eutra_PresenceAntennaPort1

      if (eutra_PresenceAntennaPort1 != null) {
         buffer.getContext().eventDispatcher.startElement("eutra_PresenceAntennaPort1", -1);

         eutra_PresenceAntennaPort1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("eutra_PresenceAntennaPort1", -1);
      }
      else throw new Asn1MissingRequiredException ("eutra_PresenceAntennaPort1");

      // encode eutra_Q_OffsetRange

      if (eutra_Q_OffsetRange != null) {
         buffer.getContext().eventDispatcher.startElement("eutra_Q_OffsetRange", -1);

         eutra_Q_OffsetRange.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("eutra_Q_OffsetRange", -1);
      }

      // encode widebandRSRQ_Meas

      if (widebandRSRQ_Meas != null) {
         buffer.getContext().eventDispatcher.startElement("widebandRSRQ_Meas", -1);

         widebandRSRQ_Meas.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("widebandRSRQ_Meas", -1);
      }
      else throw new Asn1MissingRequiredException ("widebandRSRQ_Meas");

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (carrierFreq != null) carrierFreq.print (_sb, "carrierFreq", _level+1);
      if (allowedMeasBandwidth != null) allowedMeasBandwidth.print (_sb, "allowedMeasBandwidth", _level+1);
      if (cellsToRemoveListEUTRAN != null) cellsToRemoveListEUTRAN.print (_sb, "cellsToRemoveListEUTRAN", _level+1);
      if (cellsToAddModListEUTRAN != null) cellsToAddModListEUTRAN.print (_sb, "cellsToAddModListEUTRAN", _level+1);
      if (blackCellsToRemoveListEUTRAN != null) blackCellsToRemoveListEUTRAN.print (_sb, "blackCellsToRemoveListEUTRAN", _level+1);
      if (blackCellsToAddModListEUTRAN != null) blackCellsToAddModListEUTRAN.print (_sb, "blackCellsToAddModListEUTRAN", _level+1);
      if (eutra_PresenceAntennaPort1 != null) eutra_PresenceAntennaPort1.print (_sb, "eutra_PresenceAntennaPort1", _level+1);
      if (eutra_Q_OffsetRange != null) eutra_Q_OffsetRange.print (_sb, "eutra_Q_OffsetRange", _level+1);
      if (widebandRSRQ_Meas != null) widebandRSRQ_Meas.print (_sb, "widebandRSRQ_Meas", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
