/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Other_Parameters_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Other-Parameters-r11";
   }

   public Other_Parameters_r11_inDeviceCoexInd_r11 inDeviceCoexInd_r11 = null;  // optional
   public Other_Parameters_r11_powerPrefInd_r11 powerPrefInd_r11 = null;  // optional
   public Other_Parameters_r11_ue_Rx_TxTimeDiffMeasurements_r11 ue_Rx_TxTimeDiffMeasurements_r11 = null;  // optional

   public Other_Parameters_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public Other_Parameters_r11 (
      Other_Parameters_r11_inDeviceCoexInd_r11 inDeviceCoexInd_r11_,
      Other_Parameters_r11_powerPrefInd_r11 powerPrefInd_r11_,
      Other_Parameters_r11_ue_Rx_TxTimeDiffMeasurements_r11 ue_Rx_TxTimeDiffMeasurements_r11_
   ) {
      super();
      inDeviceCoexInd_r11 = inDeviceCoexInd_r11_;
      powerPrefInd_r11 = powerPrefInd_r11_;
      ue_Rx_TxTimeDiffMeasurements_r11 = ue_Rx_TxTimeDiffMeasurements_r11_;
   }

   public void init () {
      inDeviceCoexInd_r11 = null;
      powerPrefInd_r11 = null;
      ue_Rx_TxTimeDiffMeasurements_r11 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return inDeviceCoexInd_r11;
         case 1: return powerPrefInd_r11;
         case 2: return ue_Rx_TxTimeDiffMeasurements_r11;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "inDeviceCoexInd-r11";
         case 1: return "powerPrefInd-r11";
         case 2: return "ue-Rx-TxTimeDiffMeasurements-r11";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean inDeviceCoexInd_r11Present = buffer.decodeBit ("inDeviceCoexInd_r11Present");
      boolean powerPrefInd_r11Present = buffer.decodeBit ("powerPrefInd_r11Present");
      boolean ue_Rx_TxTimeDiffMeasurements_r11Present = buffer.decodeBit ("ue_Rx_TxTimeDiffMeasurements_r11Present");

      // decode inDeviceCoexInd_r11

      if (inDeviceCoexInd_r11Present) {
         buffer.getContext().eventDispatcher.startElement("inDeviceCoexInd_r11", -1);

         int tval = Other_Parameters_r11_inDeviceCoexInd_r11.decodeEnumValue (buffer);
         inDeviceCoexInd_r11 = Other_Parameters_r11_inDeviceCoexInd_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("inDeviceCoexInd_r11", -1);
      }
      else {
         inDeviceCoexInd_r11 = null;
      }

      // decode powerPrefInd_r11

      if (powerPrefInd_r11Present) {
         buffer.getContext().eventDispatcher.startElement("powerPrefInd_r11", -1);

         int tval = Other_Parameters_r11_powerPrefInd_r11.decodeEnumValue (buffer);
         powerPrefInd_r11 = Other_Parameters_r11_powerPrefInd_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("powerPrefInd_r11", -1);
      }
      else {
         powerPrefInd_r11 = null;
      }

      // decode ue_Rx_TxTimeDiffMeasurements_r11

      if (ue_Rx_TxTimeDiffMeasurements_r11Present) {
         buffer.getContext().eventDispatcher.startElement("ue_Rx_TxTimeDiffMeasurements_r11", -1);

         int tval = Other_Parameters_r11_ue_Rx_TxTimeDiffMeasurements_r11.decodeEnumValue (buffer);
         ue_Rx_TxTimeDiffMeasurements_r11 = Other_Parameters_r11_ue_Rx_TxTimeDiffMeasurements_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("ue_Rx_TxTimeDiffMeasurements_r11", -1);
      }
      else {
         ue_Rx_TxTimeDiffMeasurements_r11 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (inDeviceCoexInd_r11 != null) inDeviceCoexInd_r11.print (_sb, "inDeviceCoexInd_r11", _level+1);
      if (powerPrefInd_r11 != null) powerPrefInd_r11.print (_sb, "powerPrefInd_r11", _level+1);
      if (ue_Rx_TxTimeDiffMeasurements_r11 != null) ue_Rx_TxTimeDiffMeasurements_r11.print (_sb, "ue_Rx_TxTimeDiffMeasurements_r11", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
