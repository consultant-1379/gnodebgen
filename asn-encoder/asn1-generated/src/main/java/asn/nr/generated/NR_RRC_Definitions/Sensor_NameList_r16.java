/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Sensor_NameList_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Sensor-NameList-r16";
   }

   public Sensor_NameList_r16_measUncomBarPre_r16 measUncomBarPre_r16 = null;  // optional
   public Sensor_NameList_r16_measUeSpeed measUeSpeed = null;  // optional
   public Sensor_NameList_r16_measUeOrientation measUeOrientation = null;  // optional

   public Sensor_NameList_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Sensor_NameList_r16 (
      Sensor_NameList_r16_measUncomBarPre_r16 measUncomBarPre_r16_,
      Sensor_NameList_r16_measUeSpeed measUeSpeed_,
      Sensor_NameList_r16_measUeOrientation measUeOrientation_
   ) {
      super();
      measUncomBarPre_r16 = measUncomBarPre_r16_;
      measUeSpeed = measUeSpeed_;
      measUeOrientation = measUeOrientation_;
   }

   public void init () {
      measUncomBarPre_r16 = null;
      measUeSpeed = null;
      measUeOrientation = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return measUncomBarPre_r16;
         case 1: return measUeSpeed;
         case 2: return measUeOrientation;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "measUncomBarPre-r16";
         case 1: return "measUeSpeed";
         case 2: return "measUeOrientation";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean measUncomBarPre_r16Present = buffer.decodeBit ("measUncomBarPre_r16Present");
      boolean measUeSpeedPresent = buffer.decodeBit ("measUeSpeedPresent");
      boolean measUeOrientationPresent = buffer.decodeBit ("measUeOrientationPresent");

      // decode measUncomBarPre_r16

      if (measUncomBarPre_r16Present) {
         buffer.getContext().eventDispatcher.startElement("measUncomBarPre_r16", -1);

         int tval = Sensor_NameList_r16_measUncomBarPre_r16.decodeEnumValue (buffer);
         measUncomBarPre_r16 = Sensor_NameList_r16_measUncomBarPre_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measUncomBarPre_r16", -1);
      }
      else {
         measUncomBarPre_r16 = null;
      }

      // decode measUeSpeed

      if (measUeSpeedPresent) {
         buffer.getContext().eventDispatcher.startElement("measUeSpeed", -1);

         int tval = Sensor_NameList_r16_measUeSpeed.decodeEnumValue (buffer);
         measUeSpeed = Sensor_NameList_r16_measUeSpeed.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measUeSpeed", -1);
      }
      else {
         measUeSpeed = null;
      }

      // decode measUeOrientation

      if (measUeOrientationPresent) {
         buffer.getContext().eventDispatcher.startElement("measUeOrientation", -1);

         int tval = Sensor_NameList_r16_measUeOrientation.decodeEnumValue (buffer);
         measUeOrientation = Sensor_NameList_r16_measUeOrientation.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("measUeOrientation", -1);
      }
      else {
         measUeOrientation = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((measUncomBarPre_r16 != null), null);
      buffer.encodeBit ((measUeSpeed != null), null);
      buffer.encodeBit ((measUeOrientation != null), null);

      // encode measUncomBarPre_r16

      if (measUncomBarPre_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("measUncomBarPre_r16", -1);

         measUncomBarPre_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measUncomBarPre_r16", -1);
      }

      // encode measUeSpeed

      if (measUeSpeed != null) {
         buffer.getContext().eventDispatcher.startElement("measUeSpeed", -1);

         measUeSpeed.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measUeSpeed", -1);
      }

      // encode measUeOrientation

      if (measUeOrientation != null) {
         buffer.getContext().eventDispatcher.startElement("measUeOrientation", -1);

         measUeOrientation.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("measUeOrientation", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (measUncomBarPre_r16 != null) measUncomBarPre_r16.print (_sb, "measUncomBarPre_r16", _level+1);
      if (measUeSpeed != null) measUeSpeed.print (_sb, "measUeSpeed", _level+1);
      if (measUeOrientation != null) measUeOrientation.print (_sb, "measUeOrientation", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
