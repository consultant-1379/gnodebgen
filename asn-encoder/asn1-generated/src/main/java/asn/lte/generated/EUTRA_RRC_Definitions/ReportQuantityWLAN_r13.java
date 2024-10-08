/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportQuantityWLAN_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportQuantityWLAN-r13";
   }

   public ReportQuantityWLAN_r13_bandRequestWLAN_r13 bandRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_carrierInfoRequestWLAN_r13 carrierInfoRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_availableAdmissionCapacityRequestWLAN_r13 availableAdmissionCapacityRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_backhaulDL_BandwidthRequestWLAN_r13 backhaulDL_BandwidthRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_backhaulUL_BandwidthRequestWLAN_r13 backhaulUL_BandwidthRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_channelUtilizationRequestWLAN_r13 channelUtilizationRequestWLAN_r13 = null;  // optional
   public ReportQuantityWLAN_r13_stationCountRequestWLAN_r13 stationCountRequestWLAN_r13 = null;  // optional
   public Asn1OpenExt extElem1;

   public ReportQuantityWLAN_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public ReportQuantityWLAN_r13 (
      ReportQuantityWLAN_r13_bandRequestWLAN_r13 bandRequestWLAN_r13_,
      ReportQuantityWLAN_r13_carrierInfoRequestWLAN_r13 carrierInfoRequestWLAN_r13_,
      ReportQuantityWLAN_r13_availableAdmissionCapacityRequestWLAN_r13 availableAdmissionCapacityRequestWLAN_r13_,
      ReportQuantityWLAN_r13_backhaulDL_BandwidthRequestWLAN_r13 backhaulDL_BandwidthRequestWLAN_r13_,
      ReportQuantityWLAN_r13_backhaulUL_BandwidthRequestWLAN_r13 backhaulUL_BandwidthRequestWLAN_r13_,
      ReportQuantityWLAN_r13_channelUtilizationRequestWLAN_r13 channelUtilizationRequestWLAN_r13_,
      ReportQuantityWLAN_r13_stationCountRequestWLAN_r13 stationCountRequestWLAN_r13_
   ) {
      super();
      bandRequestWLAN_r13 = bandRequestWLAN_r13_;
      carrierInfoRequestWLAN_r13 = carrierInfoRequestWLAN_r13_;
      availableAdmissionCapacityRequestWLAN_r13 = availableAdmissionCapacityRequestWLAN_r13_;
      backhaulDL_BandwidthRequestWLAN_r13 = backhaulDL_BandwidthRequestWLAN_r13_;
      backhaulUL_BandwidthRequestWLAN_r13 = backhaulUL_BandwidthRequestWLAN_r13_;
      channelUtilizationRequestWLAN_r13 = channelUtilizationRequestWLAN_r13_;
      stationCountRequestWLAN_r13 = stationCountRequestWLAN_r13_;
   }

   public void init () {
      bandRequestWLAN_r13 = null;
      carrierInfoRequestWLAN_r13 = null;
      availableAdmissionCapacityRequestWLAN_r13 = null;
      backhaulDL_BandwidthRequestWLAN_r13 = null;
      backhaulUL_BandwidthRequestWLAN_r13 = null;
      channelUtilizationRequestWLAN_r13 = null;
      stationCountRequestWLAN_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandRequestWLAN_r13;
         case 1: return carrierInfoRequestWLAN_r13;
         case 2: return availableAdmissionCapacityRequestWLAN_r13;
         case 3: return backhaulDL_BandwidthRequestWLAN_r13;
         case 4: return backhaulUL_BandwidthRequestWLAN_r13;
         case 5: return channelUtilizationRequestWLAN_r13;
         case 6: return stationCountRequestWLAN_r13;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandRequestWLAN-r13";
         case 1: return "carrierInfoRequestWLAN-r13";
         case 2: return "availableAdmissionCapacityRequestWLAN-r13";
         case 3: return "backhaulDL-BandwidthRequestWLAN-r13";
         case 4: return "backhaulUL-BandwidthRequestWLAN-r13";
         case 5: return "channelUtilizationRequestWLAN-r13";
         case 6: return "stationCountRequestWLAN-r13";
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

      boolean bandRequestWLAN_r13Present = buffer.decodeBit ("bandRequestWLAN_r13Present");
      boolean carrierInfoRequestWLAN_r13Present = buffer.decodeBit ("carrierInfoRequestWLAN_r13Present");
      boolean availableAdmissionCapacityRequestWLAN_r13Present = buffer.decodeBit ("availableAdmissionCapacityRequestWLAN_r13Present");
      boolean backhaulDL_BandwidthRequestWLAN_r13Present = buffer.decodeBit ("backhaulDL_BandwidthRequestWLAN_r13Present");
      boolean backhaulUL_BandwidthRequestWLAN_r13Present = buffer.decodeBit ("backhaulUL_BandwidthRequestWLAN_r13Present");
      boolean channelUtilizationRequestWLAN_r13Present = buffer.decodeBit ("channelUtilizationRequestWLAN_r13Present");
      boolean stationCountRequestWLAN_r13Present = buffer.decodeBit ("stationCountRequestWLAN_r13Present");

      // decode bandRequestWLAN_r13

      if (bandRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("bandRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_bandRequestWLAN_r13.decodeEnumValue (buffer);
         bandRequestWLAN_r13 = ReportQuantityWLAN_r13_bandRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bandRequestWLAN_r13", -1);
      }
      else {
         bandRequestWLAN_r13 = null;
      }

      // decode carrierInfoRequestWLAN_r13

      if (carrierInfoRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("carrierInfoRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_carrierInfoRequestWLAN_r13.decodeEnumValue (buffer);
         carrierInfoRequestWLAN_r13 = ReportQuantityWLAN_r13_carrierInfoRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("carrierInfoRequestWLAN_r13", -1);
      }
      else {
         carrierInfoRequestWLAN_r13 = null;
      }

      // decode availableAdmissionCapacityRequestWLAN_r13

      if (availableAdmissionCapacityRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("availableAdmissionCapacityRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_availableAdmissionCapacityRequestWLAN_r13.decodeEnumValue (buffer);
         availableAdmissionCapacityRequestWLAN_r13 = ReportQuantityWLAN_r13_availableAdmissionCapacityRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("availableAdmissionCapacityRequestWLAN_r13", -1);
      }
      else {
         availableAdmissionCapacityRequestWLAN_r13 = null;
      }

      // decode backhaulDL_BandwidthRequestWLAN_r13

      if (backhaulDL_BandwidthRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("backhaulDL_BandwidthRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_backhaulDL_BandwidthRequestWLAN_r13.decodeEnumValue (buffer);
         backhaulDL_BandwidthRequestWLAN_r13 = ReportQuantityWLAN_r13_backhaulDL_BandwidthRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("backhaulDL_BandwidthRequestWLAN_r13", -1);
      }
      else {
         backhaulDL_BandwidthRequestWLAN_r13 = null;
      }

      // decode backhaulUL_BandwidthRequestWLAN_r13

      if (backhaulUL_BandwidthRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("backhaulUL_BandwidthRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_backhaulUL_BandwidthRequestWLAN_r13.decodeEnumValue (buffer);
         backhaulUL_BandwidthRequestWLAN_r13 = ReportQuantityWLAN_r13_backhaulUL_BandwidthRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("backhaulUL_BandwidthRequestWLAN_r13", -1);
      }
      else {
         backhaulUL_BandwidthRequestWLAN_r13 = null;
      }

      // decode channelUtilizationRequestWLAN_r13

      if (channelUtilizationRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("channelUtilizationRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_channelUtilizationRequestWLAN_r13.decodeEnumValue (buffer);
         channelUtilizationRequestWLAN_r13 = ReportQuantityWLAN_r13_channelUtilizationRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("channelUtilizationRequestWLAN_r13", -1);
      }
      else {
         channelUtilizationRequestWLAN_r13 = null;
      }

      // decode stationCountRequestWLAN_r13

      if (stationCountRequestWLAN_r13Present) {
         buffer.getContext().eventDispatcher.startElement("stationCountRequestWLAN_r13", -1);

         int tval = ReportQuantityWLAN_r13_stationCountRequestWLAN_r13.decodeEnumValue (buffer);
         stationCountRequestWLAN_r13 = ReportQuantityWLAN_r13_stationCountRequestWLAN_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("stationCountRequestWLAN_r13", -1);
      }
      else {
         stationCountRequestWLAN_r13 = null;
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
      if (bandRequestWLAN_r13 != null) bandRequestWLAN_r13.print (_sb, "bandRequestWLAN_r13", _level+1);
      if (carrierInfoRequestWLAN_r13 != null) carrierInfoRequestWLAN_r13.print (_sb, "carrierInfoRequestWLAN_r13", _level+1);
      if (availableAdmissionCapacityRequestWLAN_r13 != null) availableAdmissionCapacityRequestWLAN_r13.print (_sb, "availableAdmissionCapacityRequestWLAN_r13", _level+1);
      if (backhaulDL_BandwidthRequestWLAN_r13 != null) backhaulDL_BandwidthRequestWLAN_r13.print (_sb, "backhaulDL_BandwidthRequestWLAN_r13", _level+1);
      if (backhaulUL_BandwidthRequestWLAN_r13 != null) backhaulUL_BandwidthRequestWLAN_r13.print (_sb, "backhaulUL_BandwidthRequestWLAN_r13", _level+1);
      if (channelUtilizationRequestWLAN_r13 != null) channelUtilizationRequestWLAN_r13.print (_sb, "channelUtilizationRequestWLAN_r13", _level+1);
      if (stationCountRequestWLAN_r13 != null) stationCountRequestWLAN_r13.print (_sb, "stationCountRequestWLAN_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
