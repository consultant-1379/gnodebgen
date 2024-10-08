/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailureReportSCG extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FailureReportSCG";
   }

   public FailureReportSCG_failureType failureType = null;
   public MeasResultFreqList measResultFreqList;  // optional
   public MeasResultSCG_Failure measResultSCG_Failure;  // optional
   public boolean mV2ExtPresent;
   public LocationInfo_r16 locationInfo_r16;  // optional
   public FailureReportSCG_failureType_v1610 failureType_v1610 = null;  // optional
   public Asn1OpenExt extElem1;

   public FailureReportSCG () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FailureReportSCG (
      FailureReportSCG_failureType failureType_,
      MeasResultFreqList measResultFreqList_,
      MeasResultSCG_Failure measResultSCG_Failure_,
      LocationInfo_r16 locationInfo_r16_,
      FailureReportSCG_failureType_v1610 failureType_v1610_
   ) {
      super();
      failureType = failureType_;
      measResultFreqList = measResultFreqList_;
      measResultSCG_Failure = measResultSCG_Failure_;
      locationInfo_r16 = locationInfo_r16_;
      failureType_v1610 = failureType_v1610_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FailureReportSCG (
      FailureReportSCG_failureType failureType_
   ) {
      super();
      failureType = failureType_;
   }

   public void init () {
      failureType = null;
      measResultFreqList = null;
      measResultSCG_Failure = null;
      locationInfo_r16 = null;
      failureType_v1610 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return failureType;
         case 1: return measResultFreqList;
         case 2: return measResultSCG_Failure;
         case 3: return locationInfo_r16;
         case 4: return failureType_v1610;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "failureType";
         case 1: return "measResultFreqList";
         case 2: return "measResultSCG-Failure";
         case 3: return "locationInfo-r16";
         case 4: return "failureType-v1610";
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

      boolean measResultFreqListPresent = buffer.decodeBit ("measResultFreqListPresent");
      boolean measResultSCG_FailurePresent = buffer.decodeBit ("measResultSCG_FailurePresent");

      // decode failureType

      buffer.getContext().eventDispatcher.startElement("failureType", -1);

      {
         int tval = FailureReportSCG_failureType.decodeEnumValue (buffer);
         failureType = FailureReportSCG_failureType.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("failureType", -1);

      // decode measResultFreqList

      if (measResultFreqListPresent) {
         buffer.getContext().eventDispatcher.startElement("measResultFreqList", -1);

         measResultFreqList = new MeasResultFreqList();
         measResultFreqList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultFreqList", -1);
      }
      else {
         measResultFreqList = null;
      }

      // decode measResultSCG_Failure

      if (measResultSCG_FailurePresent) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_Failure", -1);

         Asn1OctetString measResultSCG_Failure_outer = new Asn1OctetString();
         measResultSCG_Failure_outer.decode (buffer);
         if (measResultSCG_Failure_outer.value == null) throw new Asn1Exception("contained type's complete encoding is empty");
         Asn1PerDecodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer( measResultSCG_Failure_outer.value, buffer.isAligned());
         buffer.setEventHandlerList( savedBuffer );
         measResultSCG_Failure = new MeasResultSCG_Failure();
         measResultSCG_Failure.decode (buffer);
         buffer = savedBuffer;
         buffer.getContext().eventDispatcher.endElement("measResultSCG_Failure", -1);
      }
      else {
         measResultSCG_Failure = null;
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

            boolean locationInfo_r16Present = buffer.decodeBit ("locationInfo_r16Present");

            boolean failureType_v1610Present = buffer.decodeBit ("failureType_v1610Present");

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

            // decode failureType_v1610

            if (failureType_v1610Present) {
               buffer.getContext().eventDispatcher.startElement("failureType_v1610", -1);

               int tval = FailureReportSCG_failureType_v1610.decodeEnumValue (buffer);
               failureType_v1610 = FailureReportSCG_failureType_v1610.valueOf (tval);
               buffer.getContext().eventDispatcher.endElement("failureType_v1610", -1);
            }
            else {
               failureType_v1610 = null;
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
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((measResultFreqList != null), null);
      buffer.encodeBit ((measResultSCG_Failure != null), null);

      // encode failureType

      if (failureType != null) {
         buffer.getContext().eventDispatcher.startElement("failureType", -1);

         failureType.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("failureType", -1);
      }
      else throw new Asn1MissingRequiredException ("failureType");

      // encode measResultFreqList

      if (measResultFreqList != null) {
         buffer.getContext().eventDispatcher.startElement("measResultFreqList", -1);

         measResultFreqList.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultFreqList", -1);
      }

      // encode measResultSCG_Failure

      if (measResultSCG_Failure != null) {
         buffer.getContext().eventDispatcher.startElement("measResultSCG_Failure", -1);

         Asn1OctetString measResultSCG_Failure_outer;
         {
            Asn1PerEncodeBuffer savedBuffer = buffer;
            buffer = new Asn1PerEncodeBuffer(buffer.isAligned());
            measResultSCG_Failure.encode (buffer);
            measResultSCG_Failure_outer = new Asn1OctetString(buffer.getMsgCopy() );
            buffer = savedBuffer;
         }
         measResultSCG_Failure_outer.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measResultSCG_Failure", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((locationInfo_r16 != null), "optbit");
            buffer.encodeBit ((failureType_v1610 != null), "optbit");
            if (locationInfo_r16 != null) {
               locationInfo_r16.encode (buffer);
            }
            if (failureType_v1610 != null) {
               failureType_v1610.encode (buffer);
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
      if (failureType != null) failureType.print (_sb, "failureType", _level+1);
      if (measResultFreqList != null) measResultFreqList.print (_sb, "measResultFreqList", _level+1);
      if (measResultSCG_Failure != null) measResultSCG_Failure.print (_sb, "measResultSCG_Failure", _level+1);
      if (locationInfo_r16 != null) locationInfo_r16.print (_sb, "locationInfo_r16", _level+1);
      if (failureType_v1610 != null) failureType_v1610.print (_sb, "failureType_v1610", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
