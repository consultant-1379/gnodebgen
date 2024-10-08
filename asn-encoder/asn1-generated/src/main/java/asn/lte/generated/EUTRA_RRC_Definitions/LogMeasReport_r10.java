/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class LogMeasReport_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LogMeasReport-r10";
   }

   public AbsoluteTimeInfo_r10 absoluteTimeStamp_r10;
   public TraceReference_r10 traceReference_r10;
   public Asn1OctetString traceRecordingSessionRef_r10;
   public Asn1OctetString tce_Id_r10;
   public LogMeasInfoList_r10 logMeasInfoList_r10;
   public LogMeasReport_r10_logMeasAvailable_r10 logMeasAvailable_r10 = null;  // optional
   public boolean mV2ExtPresent;
   public LogMeasReport_r10_logMeasAvailableBT_r15 logMeasAvailableBT_r15 = null;  // optional
   public LogMeasReport_r10_logMeasAvailableWLAN_r15 logMeasAvailableWLAN_r15 = null;  // optional
   public Asn1OpenExt extElem1;

   public LogMeasReport_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public LogMeasReport_r10 (
      AbsoluteTimeInfo_r10 absoluteTimeStamp_r10_,
      TraceReference_r10 traceReference_r10_,
      Asn1OctetString traceRecordingSessionRef_r10_,
      Asn1OctetString tce_Id_r10_,
      LogMeasInfoList_r10 logMeasInfoList_r10_,
      LogMeasReport_r10_logMeasAvailable_r10 logMeasAvailable_r10_,
      LogMeasReport_r10_logMeasAvailableBT_r15 logMeasAvailableBT_r15_,
      LogMeasReport_r10_logMeasAvailableWLAN_r15 logMeasAvailableWLAN_r15_
   ) {
      super();
      absoluteTimeStamp_r10 = absoluteTimeStamp_r10_;
      traceReference_r10 = traceReference_r10_;
      traceRecordingSessionRef_r10 = traceRecordingSessionRef_r10_;
      tce_Id_r10 = tce_Id_r10_;
      logMeasInfoList_r10 = logMeasInfoList_r10_;
      logMeasAvailable_r10 = logMeasAvailable_r10_;
      logMeasAvailableBT_r15 = logMeasAvailableBT_r15_;
      logMeasAvailableWLAN_r15 = logMeasAvailableWLAN_r15_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public LogMeasReport_r10 (
      AbsoluteTimeInfo_r10 absoluteTimeStamp_r10_,
      TraceReference_r10 traceReference_r10_,
      Asn1OctetString traceRecordingSessionRef_r10_,
      Asn1OctetString tce_Id_r10_,
      LogMeasInfoList_r10 logMeasInfoList_r10_
   ) {
      super();
      absoluteTimeStamp_r10 = absoluteTimeStamp_r10_;
      traceReference_r10 = traceReference_r10_;
      traceRecordingSessionRef_r10 = traceRecordingSessionRef_r10_;
      tce_Id_r10 = tce_Id_r10_;
      logMeasInfoList_r10 = logMeasInfoList_r10_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public LogMeasReport_r10 (AbsoluteTimeInfo_r10 absoluteTimeStamp_r10_,
      TraceReference_r10 traceReference_r10_,
      byte[] traceRecordingSessionRef_r10_,
      byte[] tce_Id_r10_,
      LogMeasInfoList_r10 logMeasInfoList_r10_,
      LogMeasReport_r10_logMeasAvailable_r10 logMeasAvailable_r10_,
      LogMeasReport_r10_logMeasAvailableBT_r15 logMeasAvailableBT_r15_,
      LogMeasReport_r10_logMeasAvailableWLAN_r15 logMeasAvailableWLAN_r15_
   ) {
      super();
      absoluteTimeStamp_r10 = absoluteTimeStamp_r10_;
      traceReference_r10 = traceReference_r10_;
      traceRecordingSessionRef_r10 = new Asn1OctetString (traceRecordingSessionRef_r10_);
      tce_Id_r10 = new Asn1OctetString (tce_Id_r10_);
      logMeasInfoList_r10 = logMeasInfoList_r10_;
      logMeasAvailable_r10 = logMeasAvailable_r10_;
      logMeasAvailableBT_r15 = logMeasAvailableBT_r15_;
      logMeasAvailableWLAN_r15 = logMeasAvailableWLAN_r15_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public LogMeasReport_r10 (
      AbsoluteTimeInfo_r10 absoluteTimeStamp_r10_,
      TraceReference_r10 traceReference_r10_,
      byte[] traceRecordingSessionRef_r10_,
      byte[] tce_Id_r10_,
      LogMeasInfoList_r10 logMeasInfoList_r10_
   ) {
      super();
      absoluteTimeStamp_r10 = absoluteTimeStamp_r10_;
      traceReference_r10 = traceReference_r10_;
      traceRecordingSessionRef_r10 = new Asn1OctetString (traceRecordingSessionRef_r10_);
      tce_Id_r10 = new Asn1OctetString (tce_Id_r10_);
      logMeasInfoList_r10 = logMeasInfoList_r10_;
   }

   public void init () {
      absoluteTimeStamp_r10 = null;
      traceReference_r10 = null;
      traceRecordingSessionRef_r10 = null;
      tce_Id_r10 = null;
      logMeasInfoList_r10 = null;
      logMeasAvailable_r10 = null;
      logMeasAvailableBT_r15 = null;
      logMeasAvailableWLAN_r15 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return absoluteTimeStamp_r10;
         case 1: return traceReference_r10;
         case 2: return traceRecordingSessionRef_r10;
         case 3: return tce_Id_r10;
         case 4: return logMeasInfoList_r10;
         case 5: return logMeasAvailable_r10;
         case 6: return logMeasAvailableBT_r15;
         case 7: return logMeasAvailableWLAN_r15;
         case 8: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "absoluteTimeStamp-r10";
         case 1: return "traceReference-r10";
         case 2: return "traceRecordingSessionRef-r10";
         case 3: return "tce-Id-r10";
         case 4: return "logMeasInfoList-r10";
         case 5: return "logMeasAvailable-r10";
         case 6: return "logMeasAvailableBT-r15";
         case 7: return "logMeasAvailableWLAN-r15";
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

      boolean logMeasAvailable_r10Present = buffer.decodeBit ("logMeasAvailable_r10Present");

      // decode absoluteTimeStamp_r10

      buffer.getContext().eventDispatcher.startElement("absoluteTimeStamp_r10", -1);

      absoluteTimeStamp_r10 = new AbsoluteTimeInfo_r10();
      absoluteTimeStamp_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("absoluteTimeStamp_r10", -1);

      // decode traceReference_r10

      buffer.getContext().eventDispatcher.startElement("traceReference_r10", -1);

      traceReference_r10 = new TraceReference_r10();
      traceReference_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("traceReference_r10", -1);

      // decode traceRecordingSessionRef_r10

      buffer.getContext().eventDispatcher.startElement("traceRecordingSessionRef_r10", -1);

      traceRecordingSessionRef_r10 = new Asn1OctetString();
      traceRecordingSessionRef_r10.decode (buffer, 2, 2);

      buffer.invokeCharacters(traceRecordingSessionRef_r10.toString());
      buffer.getContext().eventDispatcher.endElement("traceRecordingSessionRef_r10", -1);

      // decode tce_Id_r10

      buffer.getContext().eventDispatcher.startElement("tce_Id_r10", -1);

      tce_Id_r10 = new Asn1OctetString();
      tce_Id_r10.decode (buffer, 1, 1);

      buffer.invokeCharacters(tce_Id_r10.toString());
      buffer.getContext().eventDispatcher.endElement("tce_Id_r10", -1);

      // decode logMeasInfoList_r10

      buffer.getContext().eventDispatcher.startElement("logMeasInfoList_r10", -1);

      logMeasInfoList_r10 = new LogMeasInfoList_r10();
      logMeasInfoList_r10.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("logMeasInfoList_r10", -1);

      // decode logMeasAvailable_r10

      if (logMeasAvailable_r10Present) {
         buffer.getContext().eventDispatcher.startElement("logMeasAvailable_r10", -1);

         int tval = LogMeasReport_r10_logMeasAvailable_r10.decodeEnumValue (buffer);
         logMeasAvailable_r10 = LogMeasReport_r10_logMeasAvailable_r10.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("logMeasAvailable_r10", -1);
      }
      else {
         logMeasAvailable_r10 = null;
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

            boolean logMeasAvailableBT_r15Present = buffer.decodeBit ("logMeasAvailableBT_r15Present");

            boolean logMeasAvailableWLAN_r15Present = buffer.decodeBit ("logMeasAvailableWLAN_r15Present");

            // decode logMeasAvailableBT_r15

            if (logMeasAvailableBT_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logMeasAvailableBT_r15", -1);

               int tval = LogMeasReport_r10_logMeasAvailableBT_r15.decodeEnumValue (buffer);
               logMeasAvailableBT_r15 = LogMeasReport_r10_logMeasAvailableBT_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("logMeasAvailableBT_r15", -1);
            }
            else {
               logMeasAvailableBT_r15 = null;
            }

            // decode logMeasAvailableWLAN_r15

            if (logMeasAvailableWLAN_r15Present) {
               buffer.getContext().eventDispatcher.startElement("logMeasAvailableWLAN_r15", -1);

               int tval = LogMeasReport_r10_logMeasAvailableWLAN_r15.decodeEnumValue (buffer);
               logMeasAvailableWLAN_r15 = LogMeasReport_r10_logMeasAvailableWLAN_r15.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("logMeasAvailableWLAN_r15", -1);
            }
            else {
               logMeasAvailableWLAN_r15 = null;
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
      if (absoluteTimeStamp_r10 != null) absoluteTimeStamp_r10.print (_sb, "absoluteTimeStamp_r10", _level+1);
      if (traceReference_r10 != null) traceReference_r10.print (_sb, "traceReference_r10", _level+1);
      if (traceRecordingSessionRef_r10 != null) traceRecordingSessionRef_r10.print (_sb, "traceRecordingSessionRef_r10", _level+1);
      if (tce_Id_r10 != null) tce_Id_r10.print (_sb, "tce_Id_r10", _level+1);
      if (logMeasInfoList_r10 != null) logMeasInfoList_r10.print (_sb, "logMeasInfoList_r10", _level+1);
      if (logMeasAvailable_r10 != null) logMeasAvailable_r10.print (_sb, "logMeasAvailable_r10", _level+1);
      if (logMeasAvailableBT_r15 != null) logMeasAvailableBT_r15.print (_sb, "logMeasAvailableBT_r15", _level+1);
      if (logMeasAvailableWLAN_r15 != null) logMeasAvailableWLAN_r15.print (_sb, "logMeasAvailableWLAN_r15", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
