/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.ECGI;
import asn.lte.generated.X2AP_IEs.UL_InterferenceOverloadIndication;
import asn.lte.generated.X2AP_IEs.UL_HighInterferenceIndicationInfo;
import asn.lte.generated.X2AP_IEs.RelativeNarrowbandTxPower;

public class CellInformation_Item extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellInformation-Item";
   }

   public ECGI cell_ID;
   public UL_InterferenceOverloadIndication ul_InterferenceOverloadIndication;  // optional
   public UL_HighInterferenceIndicationInfo ul_HighInterferenceIndicationInfo;  // optional
   public RelativeNarrowbandTxPower relativeNarrowbandTxPower;  // optional
   public CellInformation_Item_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public CellInformation_Item () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CellInformation_Item (
      ECGI cell_ID_,
      UL_InterferenceOverloadIndication ul_InterferenceOverloadIndication_,
      UL_HighInterferenceIndicationInfo ul_HighInterferenceIndicationInfo_,
      RelativeNarrowbandTxPower relativeNarrowbandTxPower_,
      CellInformation_Item_iE_Extensions iE_Extensions_
   ) {
      super();
      cell_ID = cell_ID_;
      ul_InterferenceOverloadIndication = ul_InterferenceOverloadIndication_;
      ul_HighInterferenceIndicationInfo = ul_HighInterferenceIndicationInfo_;
      relativeNarrowbandTxPower = relativeNarrowbandTxPower_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CellInformation_Item (
      ECGI cell_ID_
   ) {
      super();
      cell_ID = cell_ID_;
   }

   public void init () {
      cell_ID = null;
      ul_InterferenceOverloadIndication = null;
      ul_HighInterferenceIndicationInfo = null;
      relativeNarrowbandTxPower = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cell_ID;
         case 1: return ul_InterferenceOverloadIndication;
         case 2: return ul_HighInterferenceIndicationInfo;
         case 3: return relativeNarrowbandTxPower;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cell-ID";
         case 1: return "ul-InterferenceOverloadIndication";
         case 2: return "ul-HighInterferenceIndicationInfo";
         case 3: return "relativeNarrowbandTxPower";
         case 4: return "iE-Extensions";
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

      boolean ul_InterferenceOverloadIndicationPresent = buffer.decodeBit ("ul_InterferenceOverloadIndicationPresent");
      boolean ul_HighInterferenceIndicationInfoPresent = buffer.decodeBit ("ul_HighInterferenceIndicationInfoPresent");
      boolean relativeNarrowbandTxPowerPresent = buffer.decodeBit ("relativeNarrowbandTxPowerPresent");
      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode cell_ID

      buffer.getContext().eventDispatcher.startElement("cell_ID", -1);

      cell_ID = new ECGI();
      cell_ID.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("cell_ID", -1);

      // decode ul_InterferenceOverloadIndication

      if (ul_InterferenceOverloadIndicationPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_InterferenceOverloadIndication", -1);

         ul_InterferenceOverloadIndication = new UL_InterferenceOverloadIndication();
         ul_InterferenceOverloadIndication.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_InterferenceOverloadIndication", -1);
      }
      else {
         ul_InterferenceOverloadIndication = null;
      }

      // decode ul_HighInterferenceIndicationInfo

      if (ul_HighInterferenceIndicationInfoPresent) {
         buffer.getContext().eventDispatcher.startElement("ul_HighInterferenceIndicationInfo", -1);

         ul_HighInterferenceIndicationInfo = new UL_HighInterferenceIndicationInfo();
         ul_HighInterferenceIndicationInfo.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_HighInterferenceIndicationInfo", -1);
      }
      else {
         ul_HighInterferenceIndicationInfo = null;
      }

      // decode relativeNarrowbandTxPower

      if (relativeNarrowbandTxPowerPresent) {
         buffer.getContext().eventDispatcher.startElement("relativeNarrowbandTxPower", -1);

         relativeNarrowbandTxPower = new RelativeNarrowbandTxPower();
         relativeNarrowbandTxPower.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("relativeNarrowbandTxPower", -1);
      }
      else {
         relativeNarrowbandTxPower = null;
      }

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new CellInformation_Item_iE_Extensions();
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
      if (cell_ID != null) cell_ID.print (_sb, "cell_ID", _level+1);
      if (ul_InterferenceOverloadIndication != null) ul_InterferenceOverloadIndication.print (_sb, "ul_InterferenceOverloadIndication", _level+1);
      if (ul_HighInterferenceIndicationInfo != null) ul_HighInterferenceIndicationInfo.print (_sb, "ul_HighInterferenceIndicationInfo", _level+1);
      if (relativeNarrowbandTxPower != null) relativeNarrowbandTxPower.print (_sb, "relativeNarrowbandTxPower", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
