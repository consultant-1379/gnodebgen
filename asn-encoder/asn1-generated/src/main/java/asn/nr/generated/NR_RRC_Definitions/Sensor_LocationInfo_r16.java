/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Sensor_LocationInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Sensor-LocationInfo-r16";
   }

   public Asn1OctetString sensor_MeasurementInformation_r16;  // optional
   public Asn1OctetString sensor_MotionInformation_r16;  // optional
   public Asn1OpenExt extElem1;

   public Sensor_LocationInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Sensor_LocationInfo_r16 (
      Asn1OctetString sensor_MeasurementInformation_r16_,
      Asn1OctetString sensor_MotionInformation_r16_
   ) {
      super();
      sensor_MeasurementInformation_r16 = sensor_MeasurementInformation_r16_;
      sensor_MotionInformation_r16 = sensor_MotionInformation_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public Sensor_LocationInfo_r16 (byte[] sensor_MeasurementInformation_r16_,
      byte[] sensor_MotionInformation_r16_
   ) {
      super();
      sensor_MeasurementInformation_r16 = new Asn1OctetString (sensor_MeasurementInformation_r16_);
      sensor_MotionInformation_r16 = new Asn1OctetString (sensor_MotionInformation_r16_);
   }

   public void init () {
      sensor_MeasurementInformation_r16 = null;
      sensor_MotionInformation_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sensor_MeasurementInformation_r16;
         case 1: return sensor_MotionInformation_r16;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sensor-MeasurementInformation-r16";
         case 1: return "sensor-MotionInformation-r16";
         case 2: return null;
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

      boolean sensor_MeasurementInformation_r16Present = buffer.decodeBit ("sensor_MeasurementInformation_r16Present");
      boolean sensor_MotionInformation_r16Present = buffer.decodeBit ("sensor_MotionInformation_r16Present");

      // decode sensor_MeasurementInformation_r16

      if (sensor_MeasurementInformation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sensor_MeasurementInformation_r16", -1);

         sensor_MeasurementInformation_r16 = new Asn1OctetString();
         sensor_MeasurementInformation_r16.decode (buffer);

         buffer.invokeCharacters(sensor_MeasurementInformation_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sensor_MeasurementInformation_r16", -1);
      }
      else {
         sensor_MeasurementInformation_r16 = null;
      }

      // decode sensor_MotionInformation_r16

      if (sensor_MotionInformation_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sensor_MotionInformation_r16", -1);

         sensor_MotionInformation_r16 = new Asn1OctetString();
         sensor_MotionInformation_r16.decode (buffer);

         buffer.invokeCharacters(sensor_MotionInformation_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sensor_MotionInformation_r16", -1);
      }
      else {
         sensor_MotionInformation_r16 = null;
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

      buffer.encodeBit ((sensor_MeasurementInformation_r16 != null), null);
      buffer.encodeBit ((sensor_MotionInformation_r16 != null), null);

      // encode sensor_MeasurementInformation_r16

      if (sensor_MeasurementInformation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sensor_MeasurementInformation_r16", -1);

         sensor_MeasurementInformation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sensor_MeasurementInformation_r16", -1);
      }

      // encode sensor_MotionInformation_r16

      if (sensor_MotionInformation_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sensor_MotionInformation_r16", -1);

         sensor_MotionInformation_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sensor_MotionInformation_r16", -1);
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
      if (sensor_MeasurementInformation_r16 != null) sensor_MeasurementInformation_r16.print (_sb, "sensor_MeasurementInformation_r16", _level+1);
      if (sensor_MotionInformation_r16 != null) sensor_MotionInformation_r16.print (_sb, "sensor_MotionInformation_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
