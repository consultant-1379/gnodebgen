/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class VictimSystemType_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "VictimSystemType-r11";
   }

   public VictimSystemType_r11_gps_r11 gps_r11 = null;  // optional
   public VictimSystemType_r11_glonass_r11 glonass_r11 = null;  // optional
   public VictimSystemType_r11_bds_r11 bds_r11 = null;  // optional
   public VictimSystemType_r11_galileo_r11 galileo_r11 = null;  // optional
   public VictimSystemType_r11_wlan_r11 wlan_r11 = null;  // optional
   public VictimSystemType_r11_bluetooth_r11 bluetooth_r11 = null;  // optional

   public VictimSystemType_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public VictimSystemType_r11 (
      VictimSystemType_r11_gps_r11 gps_r11_,
      VictimSystemType_r11_glonass_r11 glonass_r11_,
      VictimSystemType_r11_bds_r11 bds_r11_,
      VictimSystemType_r11_galileo_r11 galileo_r11_,
      VictimSystemType_r11_wlan_r11 wlan_r11_,
      VictimSystemType_r11_bluetooth_r11 bluetooth_r11_
   ) {
      super();
      gps_r11 = gps_r11_;
      glonass_r11 = glonass_r11_;
      bds_r11 = bds_r11_;
      galileo_r11 = galileo_r11_;
      wlan_r11 = wlan_r11_;
      bluetooth_r11 = bluetooth_r11_;
   }

   public void init () {
      gps_r11 = null;
      glonass_r11 = null;
      bds_r11 = null;
      galileo_r11 = null;
      wlan_r11 = null;
      bluetooth_r11 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return gps_r11;
         case 1: return glonass_r11;
         case 2: return bds_r11;
         case 3: return galileo_r11;
         case 4: return wlan_r11;
         case 5: return bluetooth_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "gps-r11";
         case 1: return "glonass-r11";
         case 2: return "bds-r11";
         case 3: return "galileo-r11";
         case 4: return "wlan-r11";
         case 5: return "bluetooth-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean gps_r11Present = buffer.decodeBit ("gps_r11Present");
      boolean glonass_r11Present = buffer.decodeBit ("glonass_r11Present");
      boolean bds_r11Present = buffer.decodeBit ("bds_r11Present");
      boolean galileo_r11Present = buffer.decodeBit ("galileo_r11Present");
      boolean wlan_r11Present = buffer.decodeBit ("wlan_r11Present");
      boolean bluetooth_r11Present = buffer.decodeBit ("bluetooth_r11Present");

      // decode gps_r11

      if (gps_r11Present) {
         buffer.getContext().eventDispatcher.startElement("gps_r11", -1);

         int tval = VictimSystemType_r11_gps_r11.decodeEnumValue (buffer);
         gps_r11 = VictimSystemType_r11_gps_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("gps_r11", -1);
      }
      else {
         gps_r11 = null;
      }

      // decode glonass_r11

      if (glonass_r11Present) {
         buffer.getContext().eventDispatcher.startElement("glonass_r11", -1);

         int tval = VictimSystemType_r11_glonass_r11.decodeEnumValue (buffer);
         glonass_r11 = VictimSystemType_r11_glonass_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("glonass_r11", -1);
      }
      else {
         glonass_r11 = null;
      }

      // decode bds_r11

      if (bds_r11Present) {
         buffer.getContext().eventDispatcher.startElement("bds_r11", -1);

         int tval = VictimSystemType_r11_bds_r11.decodeEnumValue (buffer);
         bds_r11 = VictimSystemType_r11_bds_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bds_r11", -1);
      }
      else {
         bds_r11 = null;
      }

      // decode galileo_r11

      if (galileo_r11Present) {
         buffer.getContext().eventDispatcher.startElement("galileo_r11", -1);

         int tval = VictimSystemType_r11_galileo_r11.decodeEnumValue (buffer);
         galileo_r11 = VictimSystemType_r11_galileo_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("galileo_r11", -1);
      }
      else {
         galileo_r11 = null;
      }

      // decode wlan_r11

      if (wlan_r11Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_r11", -1);

         int tval = VictimSystemType_r11_wlan_r11.decodeEnumValue (buffer);
         wlan_r11 = VictimSystemType_r11_wlan_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("wlan_r11", -1);
      }
      else {
         wlan_r11 = null;
      }

      // decode bluetooth_r11

      if (bluetooth_r11Present) {
         buffer.getContext().eventDispatcher.startElement("bluetooth_r11", -1);

         int tval = VictimSystemType_r11_bluetooth_r11.decodeEnumValue (buffer);
         bluetooth_r11 = VictimSystemType_r11_bluetooth_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bluetooth_r11", -1);
      }
      else {
         bluetooth_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (gps_r11 != null) gps_r11.print (_sb, "gps_r11", _level+1);
      if (glonass_r11 != null) glonass_r11.print (_sb, "glonass_r11", _level+1);
      if (bds_r11 != null) bds_r11.print (_sb, "bds_r11", _level+1);
      if (galileo_r11 != null) galileo_r11.print (_sb, "galileo_r11", _level+1);
      if (wlan_r11 != null) wlan_r11.print (_sb, "wlan_r11", _level+1);
      if (bluetooth_r11 != null) bluetooth_r11.print (_sb, "bluetooth_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
