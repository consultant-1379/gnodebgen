/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RLF_Report_r16_nr_RLF_Report_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasResultRLFNR_r16 measResultLastServCell_r16;
   public RLF_Report_r16_nr_RLF_Report_r16_measResultNeighCells_r16 measResultNeighCells_r16;  // optional
   public RNTI_Value c_RNTI_r16;
   public RLF_Report_r16_nr_RLF_Report_r16_previousPCellId_r16 previousPCellId_r16;  // optional
   public RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16 failedPCellId_r16;
   public RLF_Report_r16_nr_RLF_Report_r16_reconnectCellId_r16 reconnectCellId_r16;  // optional
   public TimeUntilReconnection_16 timeUntilReconnection_16;  // optional
   public CGI_Info_Logging_r16 reestablishmentCellId_r16;  // optional
   public Asn1Integer timeConnFailure_r16;  // optional
   public TimeSinceFailure_r16 timeSinceFailure_r16;
   public RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16 connectionFailureType_r16 = null;
   public RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16 rlf_Cause_r16 = null;
   public LocationInfo_r16 locationInfo_r16;  // optional
   public RLF_Report_r16_nr_RLF_Report_r16_noSuitableCellFound_r16 noSuitableCellFound_r16 = null;  // optional
   public RA_InformationCommon_r16 ra_InformationCommon_r16;  // optional
   public Asn1OpenExt extElem1;

   public RLF_Report_r16_nr_RLF_Report_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RLF_Report_r16_nr_RLF_Report_r16 (
      MeasResultRLFNR_r16 measResultLastServCell_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_measResultNeighCells_r16 measResultNeighCells_r16_,
      RNTI_Value c_RNTI_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_previousPCellId_r16 previousPCellId_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16 failedPCellId_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_reconnectCellId_r16 reconnectCellId_r16_,
      TimeUntilReconnection_16 timeUntilReconnection_16_,
      CGI_Info_Logging_r16 reestablishmentCellId_r16_,
      Asn1Integer timeConnFailure_r16_,
      TimeSinceFailure_r16 timeSinceFailure_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16 connectionFailureType_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16 rlf_Cause_r16_,
      LocationInfo_r16 locationInfo_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_noSuitableCellFound_r16 noSuitableCellFound_r16_,
      RA_InformationCommon_r16 ra_InformationCommon_r16_
   ) {
      super();
      measResultLastServCell_r16 = measResultLastServCell_r16_;
      measResultNeighCells_r16 = measResultNeighCells_r16_;
      c_RNTI_r16 = c_RNTI_r16_;
      previousPCellId_r16 = previousPCellId_r16_;
      failedPCellId_r16 = failedPCellId_r16_;
      reconnectCellId_r16 = reconnectCellId_r16_;
      timeUntilReconnection_16 = timeUntilReconnection_16_;
      reestablishmentCellId_r16 = reestablishmentCellId_r16_;
      timeConnFailure_r16 = timeConnFailure_r16_;
      timeSinceFailure_r16 = timeSinceFailure_r16_;
      connectionFailureType_r16 = connectionFailureType_r16_;
      rlf_Cause_r16 = rlf_Cause_r16_;
      locationInfo_r16 = locationInfo_r16_;
      noSuitableCellFound_r16 = noSuitableCellFound_r16_;
      ra_InformationCommon_r16 = ra_InformationCommon_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RLF_Report_r16_nr_RLF_Report_r16 (
      MeasResultRLFNR_r16 measResultLastServCell_r16_,
      RNTI_Value c_RNTI_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16 failedPCellId_r16_,
      TimeSinceFailure_r16 timeSinceFailure_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16 connectionFailureType_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16 rlf_Cause_r16_
   ) {
      super();
      measResultLastServCell_r16 = measResultLastServCell_r16_;
      c_RNTI_r16 = c_RNTI_r16_;
      failedPCellId_r16 = failedPCellId_r16_;
      timeSinceFailure_r16 = timeSinceFailure_r16_;
      connectionFailureType_r16 = connectionFailureType_r16_;
      rlf_Cause_r16 = rlf_Cause_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public RLF_Report_r16_nr_RLF_Report_r16 (MeasResultRLFNR_r16 measResultLastServCell_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_measResultNeighCells_r16 measResultNeighCells_r16_,
      long c_RNTI_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_previousPCellId_r16 previousPCellId_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16 failedPCellId_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_reconnectCellId_r16 reconnectCellId_r16_,
      long timeUntilReconnection_16_,
      CGI_Info_Logging_r16 reestablishmentCellId_r16_,
      long timeConnFailure_r16_,
      long timeSinceFailure_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16 connectionFailureType_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16 rlf_Cause_r16_,
      LocationInfo_r16 locationInfo_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_noSuitableCellFound_r16 noSuitableCellFound_r16_,
      RA_InformationCommon_r16 ra_InformationCommon_r16_
   ) {
      super();
      measResultLastServCell_r16 = measResultLastServCell_r16_;
      measResultNeighCells_r16 = measResultNeighCells_r16_;
      c_RNTI_r16 = new RNTI_Value (c_RNTI_r16_);
      previousPCellId_r16 = previousPCellId_r16_;
      failedPCellId_r16 = failedPCellId_r16_;
      reconnectCellId_r16 = reconnectCellId_r16_;
      timeUntilReconnection_16 = new TimeUntilReconnection_16 (timeUntilReconnection_16_);
      reestablishmentCellId_r16 = reestablishmentCellId_r16_;
      timeConnFailure_r16 = new Asn1Integer (timeConnFailure_r16_);
      timeSinceFailure_r16 = new TimeSinceFailure_r16 (timeSinceFailure_r16_);
      connectionFailureType_r16 = connectionFailureType_r16_;
      rlf_Cause_r16 = rlf_Cause_r16_;
      locationInfo_r16 = locationInfo_r16_;
      noSuitableCellFound_r16 = noSuitableCellFound_r16_;
      ra_InformationCommon_r16 = ra_InformationCommon_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public RLF_Report_r16_nr_RLF_Report_r16 (
      MeasResultRLFNR_r16 measResultLastServCell_r16_,
      long c_RNTI_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16 failedPCellId_r16_,
      long timeSinceFailure_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16 connectionFailureType_r16_,
      RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16 rlf_Cause_r16_
   ) {
      super();
      measResultLastServCell_r16 = measResultLastServCell_r16_;
      c_RNTI_r16 = new RNTI_Value (c_RNTI_r16_);
      failedPCellId_r16 = failedPCellId_r16_;
      timeSinceFailure_r16 = new TimeSinceFailure_r16 (timeSinceFailure_r16_);
      connectionFailureType_r16 = connectionFailureType_r16_;
      rlf_Cause_r16 = rlf_Cause_r16_;
   }

   public void init () {
      measResultLastServCell_r16 = null;
      measResultNeighCells_r16 = null;
      c_RNTI_r16 = null;
      previousPCellId_r16 = null;
      failedPCellId_r16 = null;
      reconnectCellId_r16 = null;
      timeUntilReconnection_16 = null;
      reestablishmentCellId_r16 = null;
      timeConnFailure_r16 = null;
      timeSinceFailure_r16 = null;
      connectionFailureType_r16 = null;
      rlf_Cause_r16 = null;
      locationInfo_r16 = null;
      noSuitableCellFound_r16 = null;
      ra_InformationCommon_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 16; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measResultLastServCell_r16;
         case 1: return measResultNeighCells_r16;
         case 2: return c_RNTI_r16;
         case 3: return previousPCellId_r16;
         case 4: return failedPCellId_r16;
         case 5: return reconnectCellId_r16;
         case 6: return timeUntilReconnection_16;
         case 7: return reestablishmentCellId_r16;
         case 8: return timeConnFailure_r16;
         case 9: return timeSinceFailure_r16;
         case 10: return connectionFailureType_r16;
         case 11: return rlf_Cause_r16;
         case 12: return locationInfo_r16;
         case 13: return noSuitableCellFound_r16;
         case 14: return ra_InformationCommon_r16;
         case 15: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measResultLastServCell-r16";
         case 1: return "measResultNeighCells-r16";
         case 2: return "c-RNTI-r16";
         case 3: return "previousPCellId-r16";
         case 4: return "failedPCellId-r16";
         case 5: return "reconnectCellId-r16";
         case 6: return "timeUntilReconnection-16";
         case 7: return "reestablishmentCellId-r16";
         case 8: return "timeConnFailure-r16";
         case 9: return "timeSinceFailure-r16";
         case 10: return "connectionFailureType-r16";
         case 11: return "rlf-Cause-r16";
         case 12: return "locationInfo-r16";
         case 13: return "noSuitableCellFound-r16";
         case 14: return "ra-InformationCommon-r16";
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

      boolean measResultNeighCells_r16Present = buffer.decodeBit ("measResultNeighCells_r16Present");
      boolean previousPCellId_r16Present = buffer.decodeBit ("previousPCellId_r16Present");
      boolean reconnectCellId_r16Present = buffer.decodeBit ("reconnectCellId_r16Present");
      boolean timeUntilReconnection_16Present = buffer.decodeBit ("timeUntilReconnection_16Present");
      boolean reestablishmentCellId_r16Present = buffer.decodeBit ("reestablishmentCellId_r16Present");
      boolean timeConnFailure_r16Present = buffer.decodeBit ("timeConnFailure_r16Present");
      boolean locationInfo_r16Present = buffer.decodeBit ("locationInfo_r16Present");
      boolean noSuitableCellFound_r16Present = buffer.decodeBit ("noSuitableCellFound_r16Present");
      boolean ra_InformationCommon_r16Present = buffer.decodeBit ("ra_InformationCommon_r16Present");

      // decode measResultLastServCell_r16

      buffer.getContext().eventDispatcher.startElement("measResultLastServCell_r16", -1);

      measResultLastServCell_r16 = new MeasResultRLFNR_r16();
      measResultLastServCell_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("measResultLastServCell_r16", -1);

      // decode measResultNeighCells_r16

      if (measResultNeighCells_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultNeighCells_r16", -1);

         measResultNeighCells_r16 = new RLF_Report_r16_nr_RLF_Report_r16_measResultNeighCells_r16();
         measResultNeighCells_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultNeighCells_r16", -1);
      }
      else {
         measResultNeighCells_r16 = null;
      }

      // decode c_RNTI_r16

      buffer.getContext().eventDispatcher.startElement("c_RNTI_r16", -1);

      c_RNTI_r16 = new RNTI_Value();
      c_RNTI_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("c_RNTI_r16", -1);

      // decode previousPCellId_r16

      if (previousPCellId_r16Present) {
         buffer.getContext().eventDispatcher.startElement("previousPCellId_r16", -1);

         previousPCellId_r16 = new RLF_Report_r16_nr_RLF_Report_r16_previousPCellId_r16();
         previousPCellId_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("previousPCellId_r16", -1);
      }
      else {
         previousPCellId_r16 = null;
      }

      // decode failedPCellId_r16

      buffer.getContext().eventDispatcher.startElement("failedPCellId_r16", -1);

      failedPCellId_r16 = new RLF_Report_r16_nr_RLF_Report_r16_failedPCellId_r16();
      failedPCellId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("failedPCellId_r16", -1);

      // decode reconnectCellId_r16

      if (reconnectCellId_r16Present) {
         buffer.getContext().eventDispatcher.startElement("reconnectCellId_r16", -1);

         reconnectCellId_r16 = new RLF_Report_r16_nr_RLF_Report_r16_reconnectCellId_r16();
         reconnectCellId_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reconnectCellId_r16", -1);
      }
      else {
         reconnectCellId_r16 = null;
      }

      // decode timeUntilReconnection_16

      if (timeUntilReconnection_16Present) {
         buffer.getContext().eventDispatcher.startElement("timeUntilReconnection_16", -1);

         timeUntilReconnection_16 = new TimeUntilReconnection_16();
         timeUntilReconnection_16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("timeUntilReconnection_16", -1);
      }
      else {
         timeUntilReconnection_16 = null;
      }

      // decode reestablishmentCellId_r16

      if (reestablishmentCellId_r16Present) {
         buffer.getContext().eventDispatcher.startElement("reestablishmentCellId_r16", -1);

         reestablishmentCellId_r16 = new CGI_Info_Logging_r16();
         reestablishmentCellId_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reestablishmentCellId_r16", -1);
      }
      else {
         reestablishmentCellId_r16 = null;
      }

      // decode timeConnFailure_r16

      if (timeConnFailure_r16Present) {
         buffer.getContext().eventDispatcher.startElement("timeConnFailure_r16", -1);

         timeConnFailure_r16 = new Asn1Integer();
         timeConnFailure_r16.decode (buffer, 0, 1023);

         buffer.invokeCharacters(timeConnFailure_r16.toString());
         buffer.getContext().eventDispatcher.endElement("timeConnFailure_r16", -1);
      }
      else {
         timeConnFailure_r16 = null;
      }

      // decode timeSinceFailure_r16

      buffer.getContext().eventDispatcher.startElement("timeSinceFailure_r16", -1);

      timeSinceFailure_r16 = new TimeSinceFailure_r16();
      timeSinceFailure_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("timeSinceFailure_r16", -1);

      // decode connectionFailureType_r16

      buffer.getContext().eventDispatcher.startElement("connectionFailureType_r16", -1);

      {
         int tval = RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16.decodeEnumValue (buffer);
         connectionFailureType_r16 = RLF_Report_r16_nr_RLF_Report_r16_connectionFailureType_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("connectionFailureType_r16", -1);

      // decode rlf_Cause_r16

      buffer.getContext().eventDispatcher.startElement("rlf_Cause_r16", -1);

      {
         int tval = RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16.decodeEnumValue (buffer);
         rlf_Cause_r16 = RLF_Report_r16_nr_RLF_Report_r16_rlf_Cause_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("rlf_Cause_r16", -1);

      // decode locationInfo_r16

      if (locationInfo_r16Present) {
         buffer.getContext().eventDispatcher.startElement("locationInfo_r16", -1);

         locationInfo_r16 = new LocationInfo_r16();
         locationInfo_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("locationInfo_r16", -1);
      }
      else {
         locationInfo_r16 = null;
      }

      // decode noSuitableCellFound_r16

      if (noSuitableCellFound_r16Present) {
         buffer.getContext().eventDispatcher.startElement("noSuitableCellFound_r16", -1);

         int tval = RLF_Report_r16_nr_RLF_Report_r16_noSuitableCellFound_r16.decodeEnumValue (buffer);
         noSuitableCellFound_r16 = RLF_Report_r16_nr_RLF_Report_r16_noSuitableCellFound_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("noSuitableCellFound_r16", -1);
      }
      else {
         noSuitableCellFound_r16 = null;
      }

      // decode ra_InformationCommon_r16

      if (ra_InformationCommon_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ra_InformationCommon_r16", -1);

         ra_InformationCommon_r16 = new RA_InformationCommon_r16();
         ra_InformationCommon_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ra_InformationCommon_r16", -1);
      }
      else {
         ra_InformationCommon_r16 = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((measResultNeighCells_r16 != null), null);
      buffer.encodeBit ((previousPCellId_r16 != null), null);
      buffer.encodeBit ((reconnectCellId_r16 != null), null);
      buffer.encodeBit ((timeUntilReconnection_16 != null), null);
      buffer.encodeBit ((reestablishmentCellId_r16 != null), null);
      buffer.encodeBit ((timeConnFailure_r16 != null), null);
      buffer.encodeBit ((locationInfo_r16 != null), null);
      buffer.encodeBit ((noSuitableCellFound_r16 != null), null);
      buffer.encodeBit ((ra_InformationCommon_r16 != null), null);

      // encode measResultLastServCell_r16

      if (measResultLastServCell_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measResultLastServCell_r16", -1);

         measResultLastServCell_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultLastServCell_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("measResultLastServCell_r16");

      // encode measResultNeighCells_r16

      if (measResultNeighCells_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measResultNeighCells_r16", -1);

         measResultNeighCells_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultNeighCells_r16", -1);
      }

      // encode c_RNTI_r16

      if (c_RNTI_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("c_RNTI_r16", -1);

         c_RNTI_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("c_RNTI_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("c_RNTI_r16");

      // encode previousPCellId_r16

      if (previousPCellId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("previousPCellId_r16", -1);

         previousPCellId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("previousPCellId_r16", -1);
      }

      // encode failedPCellId_r16

      if (failedPCellId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("failedPCellId_r16", -1);

         failedPCellId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("failedPCellId_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("failedPCellId_r16");

      // encode reconnectCellId_r16

      if (reconnectCellId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reconnectCellId_r16", -1);

         reconnectCellId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reconnectCellId_r16", -1);
      }

      // encode timeUntilReconnection_16

      if (timeUntilReconnection_16 != null) {
         buffer.getContext().eventDispatcher.startElement("timeUntilReconnection_16", -1);

         timeUntilReconnection_16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("timeUntilReconnection_16", -1);
      }

      // encode reestablishmentCellId_r16

      if (reestablishmentCellId_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reestablishmentCellId_r16", -1);

         reestablishmentCellId_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reestablishmentCellId_r16", -1);
      }

      // encode timeConnFailure_r16

      if (timeConnFailure_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("timeConnFailure_r16", -1);

         timeConnFailure_r16.encode (buffer, 0, 1023);

         buffer.getContext().eventDispatcher.endElement("timeConnFailure_r16", -1);
      }

      // encode timeSinceFailure_r16

      if (timeSinceFailure_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("timeSinceFailure_r16", -1);

         timeSinceFailure_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("timeSinceFailure_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("timeSinceFailure_r16");

      // encode connectionFailureType_r16

      if (connectionFailureType_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("connectionFailureType_r16", -1);

         connectionFailureType_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("connectionFailureType_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("connectionFailureType_r16");

      // encode rlf_Cause_r16

      if (rlf_Cause_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rlf_Cause_r16", -1);

         rlf_Cause_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rlf_Cause_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("rlf_Cause_r16");

      // encode locationInfo_r16

      if (locationInfo_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("locationInfo_r16", -1);

         locationInfo_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("locationInfo_r16", -1);
      }

      // encode noSuitableCellFound_r16

      if (noSuitableCellFound_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("noSuitableCellFound_r16", -1);

         noSuitableCellFound_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("noSuitableCellFound_r16", -1);
      }

      // encode ra_InformationCommon_r16

      if (ra_InformationCommon_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ra_InformationCommon_r16", -1);

         ra_InformationCommon_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_InformationCommon_r16", -1);
      }

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
      if (measResultLastServCell_r16 != null) measResultLastServCell_r16.print (_sb, "measResultLastServCell_r16", _level+1);
      if (measResultNeighCells_r16 != null) measResultNeighCells_r16.print (_sb, "measResultNeighCells_r16", _level+1);
      if (c_RNTI_r16 != null) c_RNTI_r16.print (_sb, "c_RNTI_r16", _level+1);
      if (previousPCellId_r16 != null) previousPCellId_r16.print (_sb, "previousPCellId_r16", _level+1);
      if (failedPCellId_r16 != null) failedPCellId_r16.print (_sb, "failedPCellId_r16", _level+1);
      if (reconnectCellId_r16 != null) reconnectCellId_r16.print (_sb, "reconnectCellId_r16", _level+1);
      if (timeUntilReconnection_16 != null) timeUntilReconnection_16.print (_sb, "timeUntilReconnection_16", _level+1);
      if (reestablishmentCellId_r16 != null) reestablishmentCellId_r16.print (_sb, "reestablishmentCellId_r16", _level+1);
      if (timeConnFailure_r16 != null) timeConnFailure_r16.print (_sb, "timeConnFailure_r16", _level+1);
      if (timeSinceFailure_r16 != null) timeSinceFailure_r16.print (_sb, "timeSinceFailure_r16", _level+1);
      if (connectionFailureType_r16 != null) connectionFailureType_r16.print (_sb, "connectionFailureType_r16", _level+1);
      if (rlf_Cause_r16 != null) rlf_Cause_r16.print (_sb, "rlf_Cause_r16", _level+1);
      if (locationInfo_r16 != null) locationInfo_r16.print (_sb, "locationInfo_r16", _level+1);
      if (noSuitableCellFound_r16 != null) noSuitableCellFound_r16.print (_sb, "noSuitableCellFound_r16", _level+1);
      if (ra_InformationCommon_r16 != null) ra_InformationCommon_r16.print (_sb, "ra_InformationCommon_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
