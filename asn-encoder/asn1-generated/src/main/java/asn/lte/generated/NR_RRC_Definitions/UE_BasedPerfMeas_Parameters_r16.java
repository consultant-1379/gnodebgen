/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UE_BasedPerfMeas_Parameters_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UE-BasedPerfMeas-Parameters-r16";
   }

   public UE_BasedPerfMeas_Parameters_r16_barometerMeasReport_r16 barometerMeasReport_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_immMeasBT_r16 immMeasBT_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_immMeasWLAN_r16 immMeasWLAN_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_loggedMeasBT_r16 loggedMeasBT_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_loggedMeasurements_r16 loggedMeasurements_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_loggedMeasWLAN_r16 loggedMeasWLAN_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_orientationMeasReport_r16 orientationMeasReport_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_speedMeasReport_r16 speedMeasReport_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_gnss_Location_r16 gnss_Location_r16 = null;  // optional
   public UE_BasedPerfMeas_Parameters_r16_ulPDCP_Delay_r16 ulPDCP_Delay_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public UE_BasedPerfMeas_Parameters_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UE_BasedPerfMeas_Parameters_r16 (
      UE_BasedPerfMeas_Parameters_r16_barometerMeasReport_r16 barometerMeasReport_r16_,
      UE_BasedPerfMeas_Parameters_r16_immMeasBT_r16 immMeasBT_r16_,
      UE_BasedPerfMeas_Parameters_r16_immMeasWLAN_r16 immMeasWLAN_r16_,
      UE_BasedPerfMeas_Parameters_r16_loggedMeasBT_r16 loggedMeasBT_r16_,
      UE_BasedPerfMeas_Parameters_r16_loggedMeasurements_r16 loggedMeasurements_r16_,
      UE_BasedPerfMeas_Parameters_r16_loggedMeasWLAN_r16 loggedMeasWLAN_r16_,
      UE_BasedPerfMeas_Parameters_r16_orientationMeasReport_r16 orientationMeasReport_r16_,
      UE_BasedPerfMeas_Parameters_r16_speedMeasReport_r16 speedMeasReport_r16_,
      UE_BasedPerfMeas_Parameters_r16_gnss_Location_r16 gnss_Location_r16_,
      UE_BasedPerfMeas_Parameters_r16_ulPDCP_Delay_r16 ulPDCP_Delay_r16_
   ) {
      super();
      barometerMeasReport_r16 = barometerMeasReport_r16_;
      immMeasBT_r16 = immMeasBT_r16_;
      immMeasWLAN_r16 = immMeasWLAN_r16_;
      loggedMeasBT_r16 = loggedMeasBT_r16_;
      loggedMeasurements_r16 = loggedMeasurements_r16_;
      loggedMeasWLAN_r16 = loggedMeasWLAN_r16_;
      orientationMeasReport_r16 = orientationMeasReport_r16_;
      speedMeasReport_r16 = speedMeasReport_r16_;
      gnss_Location_r16 = gnss_Location_r16_;
      ulPDCP_Delay_r16 = ulPDCP_Delay_r16_;
   }

   public void init () {
      barometerMeasReport_r16 = null;
      immMeasBT_r16 = null;
      immMeasWLAN_r16 = null;
      loggedMeasBT_r16 = null;
      loggedMeasurements_r16 = null;
      loggedMeasWLAN_r16 = null;
      orientationMeasReport_r16 = null;
      speedMeasReport_r16 = null;
      gnss_Location_r16 = null;
      ulPDCP_Delay_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 11; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return barometerMeasReport_r16;
         case 1: return immMeasBT_r16;
         case 2: return immMeasWLAN_r16;
         case 3: return loggedMeasBT_r16;
         case 4: return loggedMeasurements_r16;
         case 5: return loggedMeasWLAN_r16;
         case 6: return orientationMeasReport_r16;
         case 7: return speedMeasReport_r16;
         case 8: return gnss_Location_r16;
         case 9: return ulPDCP_Delay_r16;
         case 10: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "barometerMeasReport-r16";
         case 1: return "immMeasBT-r16";
         case 2: return "immMeasWLAN-r16";
         case 3: return "loggedMeasBT-r16";
         case 4: return "loggedMeasurements-r16";
         case 5: return "loggedMeasWLAN-r16";
         case 6: return "orientationMeasReport-r16";
         case 7: return "speedMeasReport-r16";
         case 8: return "gnss-Location-r16";
         case 9: return "ulPDCP-Delay-r16";
         case 10: return null;
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

      boolean barometerMeasReport_r16Present = buffer.decodeBit ("barometerMeasReport_r16Present");
      boolean immMeasBT_r16Present = buffer.decodeBit ("immMeasBT_r16Present");
      boolean immMeasWLAN_r16Present = buffer.decodeBit ("immMeasWLAN_r16Present");
      boolean loggedMeasBT_r16Present = buffer.decodeBit ("loggedMeasBT_r16Present");
      boolean loggedMeasurements_r16Present = buffer.decodeBit ("loggedMeasurements_r16Present");
      boolean loggedMeasWLAN_r16Present = buffer.decodeBit ("loggedMeasWLAN_r16Present");
      boolean orientationMeasReport_r16Present = buffer.decodeBit ("orientationMeasReport_r16Present");
      boolean speedMeasReport_r16Present = buffer.decodeBit ("speedMeasReport_r16Present");
      boolean gnss_Location_r16Present = buffer.decodeBit ("gnss_Location_r16Present");
      boolean ulPDCP_Delay_r16Present = buffer.decodeBit ("ulPDCP_Delay_r16Present");

      // decode barometerMeasReport_r16

      if (barometerMeasReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("barometerMeasReport_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_barometerMeasReport_r16.decodeEnumValue (buffer);
         barometerMeasReport_r16 = UE_BasedPerfMeas_Parameters_r16_barometerMeasReport_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("barometerMeasReport_r16", -1);
      }
      else {
         barometerMeasReport_r16 = null;
      }

      // decode immMeasBT_r16

      if (immMeasBT_r16Present) {
         buffer.getContext().eventDispatcher.startElement("immMeasBT_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_immMeasBT_r16.decodeEnumValue (buffer);
         immMeasBT_r16 = UE_BasedPerfMeas_Parameters_r16_immMeasBT_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("immMeasBT_r16", -1);
      }
      else {
         immMeasBT_r16 = null;
      }

      // decode immMeasWLAN_r16

      if (immMeasWLAN_r16Present) {
         buffer.getContext().eventDispatcher.startElement("immMeasWLAN_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_immMeasWLAN_r16.decodeEnumValue (buffer);
         immMeasWLAN_r16 = UE_BasedPerfMeas_Parameters_r16_immMeasWLAN_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("immMeasWLAN_r16", -1);
      }
      else {
         immMeasWLAN_r16 = null;
      }

      // decode loggedMeasBT_r16

      if (loggedMeasBT_r16Present) {
         buffer.getContext().eventDispatcher.startElement("loggedMeasBT_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_loggedMeasBT_r16.decodeEnumValue (buffer);
         loggedMeasBT_r16 = UE_BasedPerfMeas_Parameters_r16_loggedMeasBT_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("loggedMeasBT_r16", -1);
      }
      else {
         loggedMeasBT_r16 = null;
      }

      // decode loggedMeasurements_r16

      if (loggedMeasurements_r16Present) {
         buffer.getContext().eventDispatcher.startElement("loggedMeasurements_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_loggedMeasurements_r16.decodeEnumValue (buffer);
         loggedMeasurements_r16 = UE_BasedPerfMeas_Parameters_r16_loggedMeasurements_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("loggedMeasurements_r16", -1);
      }
      else {
         loggedMeasurements_r16 = null;
      }

      // decode loggedMeasWLAN_r16

      if (loggedMeasWLAN_r16Present) {
         buffer.getContext().eventDispatcher.startElement("loggedMeasWLAN_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_loggedMeasWLAN_r16.decodeEnumValue (buffer);
         loggedMeasWLAN_r16 = UE_BasedPerfMeas_Parameters_r16_loggedMeasWLAN_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("loggedMeasWLAN_r16", -1);
      }
      else {
         loggedMeasWLAN_r16 = null;
      }

      // decode orientationMeasReport_r16

      if (orientationMeasReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("orientationMeasReport_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_orientationMeasReport_r16.decodeEnumValue (buffer);
         orientationMeasReport_r16 = UE_BasedPerfMeas_Parameters_r16_orientationMeasReport_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("orientationMeasReport_r16", -1);
      }
      else {
         orientationMeasReport_r16 = null;
      }

      // decode speedMeasReport_r16

      if (speedMeasReport_r16Present) {
         buffer.getContext().eventDispatcher.startElement("speedMeasReport_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_speedMeasReport_r16.decodeEnumValue (buffer);
         speedMeasReport_r16 = UE_BasedPerfMeas_Parameters_r16_speedMeasReport_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("speedMeasReport_r16", -1);
      }
      else {
         speedMeasReport_r16 = null;
      }

      // decode gnss_Location_r16

      if (gnss_Location_r16Present) {
         buffer.getContext().eventDispatcher.startElement("gnss_Location_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_gnss_Location_r16.decodeEnumValue (buffer);
         gnss_Location_r16 = UE_BasedPerfMeas_Parameters_r16_gnss_Location_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("gnss_Location_r16", -1);
      }
      else {
         gnss_Location_r16 = null;
      }

      // decode ulPDCP_Delay_r16

      if (ulPDCP_Delay_r16Present) {
         buffer.getContext().eventDispatcher.startElement("ulPDCP_Delay_r16", -1);

         int tval = UE_BasedPerfMeas_Parameters_r16_ulPDCP_Delay_r16.decodeEnumValue (buffer);
         ulPDCP_Delay_r16 = UE_BasedPerfMeas_Parameters_r16_ulPDCP_Delay_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ulPDCP_Delay_r16", -1);
      }
      else {
         ulPDCP_Delay_r16 = null;
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
      if (barometerMeasReport_r16 != null) barometerMeasReport_r16.print (_sb, "barometerMeasReport_r16", _level+1);
      if (immMeasBT_r16 != null) immMeasBT_r16.print (_sb, "immMeasBT_r16", _level+1);
      if (immMeasWLAN_r16 != null) immMeasWLAN_r16.print (_sb, "immMeasWLAN_r16", _level+1);
      if (loggedMeasBT_r16 != null) loggedMeasBT_r16.print (_sb, "loggedMeasBT_r16", _level+1);
      if (loggedMeasurements_r16 != null) loggedMeasurements_r16.print (_sb, "loggedMeasurements_r16", _level+1);
      if (loggedMeasWLAN_r16 != null) loggedMeasWLAN_r16.print (_sb, "loggedMeasWLAN_r16", _level+1);
      if (orientationMeasReport_r16 != null) orientationMeasReport_r16.print (_sb, "orientationMeasReport_r16", _level+1);
      if (speedMeasReport_r16 != null) speedMeasReport_r16.print (_sb, "speedMeasReport_r16", _level+1);
      if (gnss_Location_r16 != null) gnss_Location_r16.print (_sb, "gnss_Location_r16", _level+1);
      if (ulPDCP_Delay_r16 != null) ulPDCP_Delay_r16.print (_sb, "ulPDCP_Delay_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
