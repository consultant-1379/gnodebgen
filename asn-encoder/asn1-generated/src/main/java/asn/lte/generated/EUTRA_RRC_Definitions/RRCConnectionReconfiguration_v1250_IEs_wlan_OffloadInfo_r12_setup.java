/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public WLAN_OffloadConfig_r12 wlan_OffloadConfigDedicated_r12;
   public RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 t350_r12 = null;  // optional

   public RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup (
      WLAN_OffloadConfig_r12 wlan_OffloadConfigDedicated_r12_,
      RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 t350_r12_
   ) {
      super();
      wlan_OffloadConfigDedicated_r12 = wlan_OffloadConfigDedicated_r12_;
      t350_r12 = t350_r12_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup (
      WLAN_OffloadConfig_r12 wlan_OffloadConfigDedicated_r12_
   ) {
      super();
      wlan_OffloadConfigDedicated_r12 = wlan_OffloadConfigDedicated_r12_;
   }

   public void init () {
      wlan_OffloadConfigDedicated_r12 = null;
      t350_r12 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return wlan_OffloadConfigDedicated_r12;
         case 1: return t350_r12;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "wlan-OffloadConfigDedicated-r12";
         case 1: return "t350-r12";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean t350_r12Present = buffer.decodeBit ("t350_r12Present");

      // decode wlan_OffloadConfigDedicated_r12

      buffer.getContext().eventDispatcher.startElement("wlan_OffloadConfigDedicated_r12", -1);

      wlan_OffloadConfigDedicated_r12 = new WLAN_OffloadConfig_r12();
      wlan_OffloadConfigDedicated_r12.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("wlan_OffloadConfigDedicated_r12", -1);

      // decode t350_r12

      if (t350_r12Present) {
         buffer.getContext().eventDispatcher.startElement("t350_r12", -1);

         int tval = RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12.decodeEnumValue (buffer);
         t350_r12 = RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("t350_r12", -1);
      }
      else {
         t350_r12 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (wlan_OffloadConfigDedicated_r12 != null) wlan_OffloadConfigDedicated_r12.print (_sb, "wlan_OffloadConfigDedicated_r12", _level+1);
      if (t350_r12 != null) t350_r12.print (_sb, "t350_r12", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
