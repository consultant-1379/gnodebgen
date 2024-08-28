/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEInformationResponse_r16_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UEInformationResponse-r16-IEs";
   }

   public MeasResultIdleEUTRA_r16 measResultIdleEUTRA_r16;  // optional
   public MeasResultIdleNR_r16 measResultIdleNR_r16;  // optional
   public LogMeasReport_r16 logMeasReport_r16;  // optional
   public ConnEstFailReport_r16 connEstFailReport_r16;  // optional
   public RA_ReportList_r16 ra_ReportList_r16;  // optional
   public RLF_Report_r16 rlf_Report_r16;  // optional
   public MobilityHistoryReport_r16 mobilityHistoryReport_r16;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public UEInformationResponse_r16_IEs_nonCriticalExtension nonCriticalExtension;  // optional

   public UEInformationResponse_r16_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UEInformationResponse_r16_IEs (
      MeasResultIdleEUTRA_r16 measResultIdleEUTRA_r16_,
      MeasResultIdleNR_r16 measResultIdleNR_r16_,
      LogMeasReport_r16 logMeasReport_r16_,
      ConnEstFailReport_r16 connEstFailReport_r16_,
      RA_ReportList_r16 ra_ReportList_r16_,
      RLF_Report_r16 rlf_Report_r16_,
      MobilityHistoryReport_r16 mobilityHistoryReport_r16_,
      Asn1OctetString lateNonCriticalExtension_,
      UEInformationResponse_r16_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      measResultIdleEUTRA_r16 = measResultIdleEUTRA_r16_;
      measResultIdleNR_r16 = measResultIdleNR_r16_;
      logMeasReport_r16 = logMeasReport_r16_;
      connEstFailReport_r16 = connEstFailReport_r16_;
      ra_ReportList_r16 = ra_ReportList_r16_;
      rlf_Report_r16 = rlf_Report_r16_;
      mobilityHistoryReport_r16 = mobilityHistoryReport_r16_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public UEInformationResponse_r16_IEs (MeasResultIdleEUTRA_r16 measResultIdleEUTRA_r16_,
      MeasResultIdleNR_r16 measResultIdleNR_r16_,
      LogMeasReport_r16 logMeasReport_r16_,
      ConnEstFailReport_r16 connEstFailReport_r16_,
      RA_ReportList_r16 ra_ReportList_r16_,
      RLF_Report_r16 rlf_Report_r16_,
      MobilityHistoryReport_r16 mobilityHistoryReport_r16_,
      byte[] lateNonCriticalExtension_,
      UEInformationResponse_r16_IEs_nonCriticalExtension nonCriticalExtension_
   ) {
      super();
      measResultIdleEUTRA_r16 = measResultIdleEUTRA_r16_;
      measResultIdleNR_r16 = measResultIdleNR_r16_;
      logMeasReport_r16 = logMeasReport_r16_;
      connEstFailReport_r16 = connEstFailReport_r16_;
      ra_ReportList_r16 = ra_ReportList_r16_;
      rlf_Report_r16 = rlf_Report_r16_;
      mobilityHistoryReport_r16 = mobilityHistoryReport_r16_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      measResultIdleEUTRA_r16 = null;
      measResultIdleNR_r16 = null;
      logMeasReport_r16 = null;
      connEstFailReport_r16 = null;
      ra_ReportList_r16 = null;
      rlf_Report_r16 = null;
      mobilityHistoryReport_r16 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measResultIdleEUTRA_r16;
         case 1: return measResultIdleNR_r16;
         case 2: return logMeasReport_r16;
         case 3: return connEstFailReport_r16;
         case 4: return ra_ReportList_r16;
         case 5: return rlf_Report_r16;
         case 6: return mobilityHistoryReport_r16;
         case 7: return lateNonCriticalExtension;
         case 8: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measResultIdleEUTRA-r16";
         case 1: return "measResultIdleNR-r16";
         case 2: return "logMeasReport-r16";
         case 3: return "connEstFailReport-r16";
         case 4: return "ra-ReportList-r16";
         case 5: return "rlf-Report-r16";
         case 6: return "mobilityHistoryReport-r16";
         case 7: return "lateNonCriticalExtension";
         case 8: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measResultIdleEUTRA_r16Present = buffer.decodeBit ("measResultIdleEUTRA_r16Present");
      boolean measResultIdleNR_r16Present = buffer.decodeBit ("measResultIdleNR_r16Present");
      boolean logMeasReport_r16Present = buffer.decodeBit ("logMeasReport_r16Present");
      boolean connEstFailReport_r16Present = buffer.decodeBit ("connEstFailReport_r16Present");
      boolean ra_ReportList_r16Present = buffer.decodeBit ("ra_ReportList_r16Present");
      boolean rlf_Report_r16Present = buffer.decodeBit ("rlf_Report_r16Present");
      boolean mobilityHistoryReport_r16Present = buffer.decodeBit ("mobilityHistoryReport_r16Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode measResultIdleEUTRA_r16

      if (measResultIdleEUTRA_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultIdleEUTRA_r16", -1);

         measResultIdleEUTRA_r16 = new MeasResultIdleEUTRA_r16();
         measResultIdleEUTRA_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultIdleEUTRA_r16", -1);
      }
      else {
         measResultIdleEUTRA_r16 = null;
      }

      // decode measResultIdleNR_r16

      if (measResultIdleNR_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measResultIdleNR_r16", -1);

         measResultIdleNR_r16 = new MeasResultIdleNR_r16();
         measResultIdleNR_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultIdleNR_r16", -1);
      }
      else {
         measResultIdleNR_r16 = null;
      }

      // decode logMeasReport_r16

      if (logMeasReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasReport_r16", -1);

         logMeasReport_r16 = new LogMeasReport_r16();
         logMeasReport_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("logMeasReport_r16", -1);
      }
      else {
         logMeasReport_r16 = null;
      }

      // decode connEstFailReport_r16

      if (connEstFailReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("connEstFailReport_r16", -1);

         connEstFailReport_r16 = new ConnEstFailReport_r16();
         connEstFailReport_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("connEstFailReport_r16", -1);
      }
      else {
         connEstFailReport_r16 = null;
      }

      // decode ra_ReportList_r16

      if (ra_ReportList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ra_ReportList_r16", -1);

         ra_ReportList_r16 = new RA_ReportList_r16();
         ra_ReportList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ra_ReportList_r16", -1);
      }
      else {
         ra_ReportList_r16 = null;
      }

      // decode rlf_Report_r16

      if (rlf_Report_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rlf_Report_r16", -1);

         rlf_Report_r16 = new RLF_Report_r16();
         rlf_Report_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlf_Report_r16", -1);
      }
      else {
         rlf_Report_r16 = null;
      }

      // decode mobilityHistoryReport_r16

      if (mobilityHistoryReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mobilityHistoryReport_r16", -1);

         mobilityHistoryReport_r16 = new MobilityHistoryReport_r16();
         mobilityHistoryReport_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mobilityHistoryReport_r16", -1);
      }
      else {
         mobilityHistoryReport_r16 = null;
      }

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

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UEInformationResponse_r16_IEs_nonCriticalExtension();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measResultIdleEUTRA_r16 != null), null);
      buffer.encodeBit ((measResultIdleNR_r16 != null), null);
      buffer.encodeBit ((logMeasReport_r16 != null), null);
      buffer.encodeBit ((connEstFailReport_r16 != null), null);
      buffer.encodeBit ((ra_ReportList_r16 != null), null);
      buffer.encodeBit ((rlf_Report_r16 != null), null);
      buffer.encodeBit ((mobilityHistoryReport_r16 != null), null);
      buffer.encodeBit ((lateNonCriticalExtension != null), null);
      buffer.encodeBit ((nonCriticalExtension != null), null);

      // encode measResultIdleEUTRA_r16

      if (measResultIdleEUTRA_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measResultIdleEUTRA_r16", -1);

         measResultIdleEUTRA_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultIdleEUTRA_r16", -1);
      }

      // encode measResultIdleNR_r16

      if (measResultIdleNR_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measResultIdleNR_r16", -1);

         measResultIdleNR_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultIdleNR_r16", -1);
      }

      // encode logMeasReport_r16

      if (logMeasReport_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("logMeasReport_r16", -1);

         logMeasReport_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("logMeasReport_r16", -1);
      }

      // encode connEstFailReport_r16

      if (connEstFailReport_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("connEstFailReport_r16", -1);

         connEstFailReport_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("connEstFailReport_r16", -1);
      }

      // encode ra_ReportList_r16

      if (ra_ReportList_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("ra_ReportList_r16", -1);

         ra_ReportList_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_ReportList_r16", -1);
      }

      // encode rlf_Report_r16

      if (rlf_Report_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rlf_Report_r16", -1);

         rlf_Report_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rlf_Report_r16", -1);
      }

      // encode mobilityHistoryReport_r16

      if (mobilityHistoryReport_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mobilityHistoryReport_r16", -1);

         mobilityHistoryReport_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mobilityHistoryReport_r16", -1);
      }

      // encode lateNonCriticalExtension

      if (lateNonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }

      // encode nonCriticalExtension

      if (nonCriticalExtension != null) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measResultIdleEUTRA_r16 != null) measResultIdleEUTRA_r16.print (_sb, "measResultIdleEUTRA_r16", _level+1);
      if (measResultIdleNR_r16 != null) measResultIdleNR_r16.print (_sb, "measResultIdleNR_r16", _level+1);
      if (logMeasReport_r16 != null) logMeasReport_r16.print (_sb, "logMeasReport_r16", _level+1);
      if (connEstFailReport_r16 != null) connEstFailReport_r16.print (_sb, "connEstFailReport_r16", _level+1);
      if (ra_ReportList_r16 != null) ra_ReportList_r16.print (_sb, "ra_ReportList_r16", _level+1);
      if (rlf_Report_r16 != null) rlf_Report_r16.print (_sb, "rlf_Report_r16", _level+1);
      if (mobilityHistoryReport_r16 != null) mobilityHistoryReport_r16.print (_sb, "mobilityHistoryReport_r16", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
