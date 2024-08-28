/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogMeasReport_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LogMeasReport-r16";
   }

   public AbsoluteTimeInfo_r16 absoluteTimeStamp_r16;
   public TraceReference_r16 traceReference_r16;
   public Asn1OctetString traceRecordingSessionRef_r16;
   public Asn1OctetString tce_Id_r16;
   public LogMeasInfoList_r16 logMeasInfoList_r16;
   public LogMeasReport_r16_logMeasAvailable_r16 logMeasAvailable_r16 = null;  // optional
   public LogMeasReport_r16_logMeasAvailableBT_r16 logMeasAvailableBT_r16 = null;  // optional
   public LogMeasReport_r16_logMeasAvailableWLAN_r16 logMeasAvailableWLAN_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public LogMeasReport_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LogMeasReport_r16 (
      AbsoluteTimeInfo_r16 absoluteTimeStamp_r16_,
      TraceReference_r16 traceReference_r16_,
      Asn1OctetString traceRecordingSessionRef_r16_,
      Asn1OctetString tce_Id_r16_,
      LogMeasInfoList_r16 logMeasInfoList_r16_,
      LogMeasReport_r16_logMeasAvailable_r16 logMeasAvailable_r16_,
      LogMeasReport_r16_logMeasAvailableBT_r16 logMeasAvailableBT_r16_,
      LogMeasReport_r16_logMeasAvailableWLAN_r16 logMeasAvailableWLAN_r16_
   ) {
      super();
      absoluteTimeStamp_r16 = absoluteTimeStamp_r16_;
      traceReference_r16 = traceReference_r16_;
      traceRecordingSessionRef_r16 = traceRecordingSessionRef_r16_;
      tce_Id_r16 = tce_Id_r16_;
      logMeasInfoList_r16 = logMeasInfoList_r16_;
      logMeasAvailable_r16 = logMeasAvailable_r16_;
      logMeasAvailableBT_r16 = logMeasAvailableBT_r16_;
      logMeasAvailableWLAN_r16 = logMeasAvailableWLAN_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public LogMeasReport_r16 (
      AbsoluteTimeInfo_r16 absoluteTimeStamp_r16_,
      TraceReference_r16 traceReference_r16_,
      Asn1OctetString traceRecordingSessionRef_r16_,
      Asn1OctetString tce_Id_r16_,
      LogMeasInfoList_r16 logMeasInfoList_r16_
   ) {
      super();
      absoluteTimeStamp_r16 = absoluteTimeStamp_r16_;
      traceReference_r16 = traceReference_r16_;
      traceRecordingSessionRef_r16 = traceRecordingSessionRef_r16_;
      tce_Id_r16 = tce_Id_r16_;
      logMeasInfoList_r16 = logMeasInfoList_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LogMeasReport_r16 (AbsoluteTimeInfo_r16 absoluteTimeStamp_r16_,
      TraceReference_r16 traceReference_r16_,
      byte[] traceRecordingSessionRef_r16_,
      byte[] tce_Id_r16_,
      LogMeasInfoList_r16 logMeasInfoList_r16_,
      LogMeasReport_r16_logMeasAvailable_r16 logMeasAvailable_r16_,
      LogMeasReport_r16_logMeasAvailableBT_r16 logMeasAvailableBT_r16_,
      LogMeasReport_r16_logMeasAvailableWLAN_r16 logMeasAvailableWLAN_r16_
   ) {
      super();
      absoluteTimeStamp_r16 = absoluteTimeStamp_r16_;
      traceReference_r16 = traceReference_r16_;
      traceRecordingSessionRef_r16 = new Asn1OctetString (traceRecordingSessionRef_r16_);
      tce_Id_r16 = new Asn1OctetString (tce_Id_r16_);
      logMeasInfoList_r16 = logMeasInfoList_r16_;
      logMeasAvailable_r16 = logMeasAvailable_r16_;
      logMeasAvailableBT_r16 = logMeasAvailableBT_r16_;
      logMeasAvailableWLAN_r16 = logMeasAvailableWLAN_r16_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public LogMeasReport_r16 (
      AbsoluteTimeInfo_r16 absoluteTimeStamp_r16_,
      TraceReference_r16 traceReference_r16_,
      byte[] traceRecordingSessionRef_r16_,
      byte[] tce_Id_r16_,
      LogMeasInfoList_r16 logMeasInfoList_r16_
   ) {
      super();
      absoluteTimeStamp_r16 = absoluteTimeStamp_r16_;
      traceReference_r16 = traceReference_r16_;
      traceRecordingSessionRef_r16 = new Asn1OctetString (traceRecordingSessionRef_r16_);
      tce_Id_r16 = new Asn1OctetString (tce_Id_r16_);
      logMeasInfoList_r16 = logMeasInfoList_r16_;
   }

   public void init () {
      absoluteTimeStamp_r16 = null;
      traceReference_r16 = null;
      traceRecordingSessionRef_r16 = null;
      tce_Id_r16 = null;
      logMeasInfoList_r16 = null;
      logMeasAvailable_r16 = null;
      logMeasAvailableBT_r16 = null;
      logMeasAvailableWLAN_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return absoluteTimeStamp_r16;
         case 1: return traceReference_r16;
         case 2: return traceRecordingSessionRef_r16;
         case 3: return tce_Id_r16;
         case 4: return logMeasInfoList_r16;
         case 5: return logMeasAvailable_r16;
         case 6: return logMeasAvailableBT_r16;
         case 7: return logMeasAvailableWLAN_r16;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "absoluteTimeStamp-r16";
         case 1: return "traceReference-r16";
         case 2: return "traceRecordingSessionRef-r16";
         case 3: return "tce-Id-r16";
         case 4: return "logMeasInfoList-r16";
         case 5: return "logMeasAvailable-r16";
         case 6: return "logMeasAvailableBT-r16";
         case 7: return "logMeasAvailableWLAN-r16";
         case 8: return null;
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

      boolean logMeasAvailable_r16Present = buffer.decodeBit ("logMeasAvailable_r16Present");
      boolean logMeasAvailableBT_r16Present = buffer.decodeBit ("logMeasAvailableBT_r16Present");
      boolean logMeasAvailableWLAN_r16Present = buffer.decodeBit ("logMeasAvailableWLAN_r16Present");

      // decode absoluteTimeStamp_r16

      buffer.getContext().eventDispatcher.startElement("absoluteTimeStamp_r16", -1);

      absoluteTimeStamp_r16 = new AbsoluteTimeInfo_r16();
      absoluteTimeStamp_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("absoluteTimeStamp_r16", -1);

      // decode traceReference_r16

      buffer.getContext().eventDispatcher.startElement("traceReference_r16", -1);

      traceReference_r16 = new TraceReference_r16();
      traceReference_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("traceReference_r16", -1);

      // decode traceRecordingSessionRef_r16

      buffer.getContext().eventDispatcher.startElement("traceRecordingSessionRef_r16", -1);

      traceRecordingSessionRef_r16 = new Asn1OctetString();
      traceRecordingSessionRef_r16.decode (buffer, 2, 2);

      buffer.invokeCharacters(traceRecordingSessionRef_r16.toString());
      buffer.getContext().eventDispatcher.endElement("traceRecordingSessionRef_r16", -1);

      // decode tce_Id_r16

      buffer.getContext().eventDispatcher.startElement("tce_Id_r16", -1);

      tce_Id_r16 = new Asn1OctetString();
      tce_Id_r16.decode (buffer, 1, 1);

      buffer.invokeCharacters(tce_Id_r16.toString());
      buffer.getContext().eventDispatcher.endElement("tce_Id_r16", -1);

      // decode logMeasInfoList_r16

      buffer.getContext().eventDispatcher.startElement("logMeasInfoList_r16", -1);

      logMeasInfoList_r16 = new LogMeasInfoList_r16();
      logMeasInfoList_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("logMeasInfoList_r16", -1);

      // decode logMeasAvailable_r16

      if (logMeasAvailable_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailable_r16", -1);

         int tval = LogMeasReport_r16_logMeasAvailable_r16.decodeEnumValue (buffer);
         logMeasAvailable_r16 = LogMeasReport_r16_logMeasAvailable_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailable_r16", -1);
      }
      else {
         logMeasAvailable_r16 = null;
      }

      // decode logMeasAvailableBT_r16

      if (logMeasAvailableBT_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailableBT_r16", -1);

         int tval = LogMeasReport_r16_logMeasAvailableBT_r16.decodeEnumValue (buffer);
         logMeasAvailableBT_r16 = LogMeasReport_r16_logMeasAvailableBT_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailableBT_r16", -1);
      }
      else {
         logMeasAvailableBT_r16 = null;
      }

      // decode logMeasAvailableWLAN_r16

      if (logMeasAvailableWLAN_r16Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailableWLAN_r16", -1);

         int tval = LogMeasReport_r16_logMeasAvailableWLAN_r16.decodeEnumValue (buffer);
         logMeasAvailableWLAN_r16 = LogMeasReport_r16_logMeasAvailableWLAN_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailableWLAN_r16", -1);
      }
      else {
         logMeasAvailableWLAN_r16 = null;
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
      if (absoluteTimeStamp_r16 != null) absoluteTimeStamp_r16.print (_sb, "absoluteTimeStamp_r16", _level+1);
      if (traceReference_r16 != null) traceReference_r16.print (_sb, "traceReference_r16", _level+1);
      if (traceRecordingSessionRef_r16 != null) traceRecordingSessionRef_r16.print (_sb, "traceRecordingSessionRef_r16", _level+1);
      if (tce_Id_r16 != null) tce_Id_r16.print (_sb, "tce_Id_r16", _level+1);
      if (logMeasInfoList_r16 != null) logMeasInfoList_r16.print (_sb, "logMeasInfoList_r16", _level+1);
      if (logMeasAvailable_r16 != null) logMeasAvailable_r16.print (_sb, "logMeasAvailable_r16", _level+1);
      if (logMeasAvailableBT_r16 != null) logMeasAvailableBT_r16.print (_sb, "logMeasAvailableBT_r16", _level+1);
      if (logMeasAvailableWLAN_r16 != null) logMeasAvailableWLAN_r16.print (_sb, "logMeasAvailableWLAN_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
