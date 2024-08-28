/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class BluetoothMeasurementConfiguration extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BluetoothMeasurementConfiguration";
   }

   public BluetoothMeasConfig bluetoothMeasConfig = null;
   public BluetoothMeasConfigNameList bluetoothMeasConfigNameList;  // optional
   public BluetoothMeasurementConfiguration_bt_rssi bt_rssi = null;  // optional
   public BluetoothMeasurementConfiguration_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public BluetoothMeasurementConfiguration () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BluetoothMeasurementConfiguration (
      BluetoothMeasConfig bluetoothMeasConfig_,
      BluetoothMeasConfigNameList bluetoothMeasConfigNameList_,
      BluetoothMeasurementConfiguration_bt_rssi bt_rssi_,
      BluetoothMeasurementConfiguration_iE_Extensions iE_Extensions_
   ) {
      super();
      bluetoothMeasConfig = bluetoothMeasConfig_;
      bluetoothMeasConfigNameList = bluetoothMeasConfigNameList_;
      bt_rssi = bt_rssi_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BluetoothMeasurementConfiguration (
      BluetoothMeasConfig bluetoothMeasConfig_
   ) {
      super();
      bluetoothMeasConfig = bluetoothMeasConfig_;
   }

   public void init () {
      bluetoothMeasConfig = null;
      bluetoothMeasConfigNameList = null;
      bt_rssi = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bluetoothMeasConfig;
         case 1: return bluetoothMeasConfigNameList;
         case 2: return bt_rssi;
         case 3: return iE_Extensions;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bluetoothMeasConfig";
         case 1: return "bluetoothMeasConfigNameList";
         case 2: return "bt-rssi";
         case 3: return "iE-Extensions";
         case 4: return null;
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

      boolean bluetoothMeasConfigNameListPresent = buffer.decodeBit ("bluetoothMeasConfigNameListPresent");
      boolean bt_rssiPresent = buffer.decodeBit ("bt_rssiPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode bluetoothMeasConfig

      buffer.getContext().eventDispatcher.startElement("bluetoothMeasConfig", -1);

      {
         int tval = BluetoothMeasConfig.decodeEnumValue (buffer);
         bluetoothMeasConfig = BluetoothMeasConfig.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("bluetoothMeasConfig", -1);

      // decode bluetoothMeasConfigNameList

      if (bluetoothMeasConfigNameListPresent) {
         buffer.getContext().eventDispatcher.startElement("bluetoothMeasConfigNameList", -1);

         bluetoothMeasConfigNameList = new BluetoothMeasConfigNameList();
         bluetoothMeasConfigNameList.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bluetoothMeasConfigNameList", -1);
      }
      else {
         bluetoothMeasConfigNameList = null;
      }

      // decode bt_rssi

      if (bt_rssiPresent) {
         buffer.getContext().eventDispatcher.startElement("bt_rssi", -1);

         int tval = BluetoothMeasurementConfiguration_bt_rssi.decodeEnumValue (buffer);
         bt_rssi = BluetoothMeasurementConfiguration_bt_rssi.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bt_rssi", -1);
      }
      else {
         bt_rssi = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new BluetoothMeasurementConfiguration_iE_Extensions();
         iE_Extensions.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("iE_Extensions", -1);
      }
      else {
         iE_Extensions = null;
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
      if (bluetoothMeasConfig != null) bluetoothMeasConfig.print (_sb, "bluetoothMeasConfig", _level+1);
      if (bluetoothMeasConfigNameList != null) bluetoothMeasConfigNameList.print (_sb, "bluetoothMeasConfigNameList", _level+1);
      if (bt_rssi != null) bt_rssi.print (_sb, "bt_rssi", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
