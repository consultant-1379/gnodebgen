/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLANConnectionStatusReport_r13_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "WLANConnectionStatusReport-r13-IEs";
   }

   public WLAN_Status_r13 wlan_Status_r13 = null;
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public WLANConnectionStatusReport_v1430_IEs nonCriticalExtension;  // optional

   public WLANConnectionStatusReport_r13_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLANConnectionStatusReport_r13_IEs (
      WLAN_Status_r13 wlan_Status_r13_,
      Asn1OctetString lateNonCriticalExtension_,
      WLANConnectionStatusReport_v1430_IEs nonCriticalExtension_
   ) {
      super();
      wlan_Status_r13 = wlan_Status_r13_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public WLANConnectionStatusReport_r13_IEs (
      WLAN_Status_r13 wlan_Status_r13_
   ) {
      super();
      wlan_Status_r13 = wlan_Status_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WLANConnectionStatusReport_r13_IEs (WLAN_Status_r13 wlan_Status_r13_,
      byte[] lateNonCriticalExtension_,
      WLANConnectionStatusReport_v1430_IEs nonCriticalExtension_
   ) {
      super();
      wlan_Status_r13 = wlan_Status_r13_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      wlan_Status_r13 = null;
      lateNonCriticalExtension = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return wlan_Status_r13;
         case 1: return lateNonCriticalExtension;
         case 2: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "wlan-Status-r13";
         case 1: return "lateNonCriticalExtension";
         case 2: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode wlan_Status_r13

      buffer.getContext().eventDispatcher.startElement("wlan_Status_r13", -1);

      {
         int tval = WLAN_Status_r13.decodeEnumValue (buffer);
         wlan_Status_r13 = WLAN_Status_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("wlan_Status_r13", -1);

      // decode lateNonCriticalExtension

      if (lateNonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("lateNonCriticalExtension", -1);

         lateNonCriticalExtension = new Asn1OctetString();
         lateNonCriticalExtension.decode (buffer);

         buffer.invokeCharacters(lateNonCriticalExtension.toString());
         buffer.getContext().eventDispatcher.endElement("lateNonCriticalExtension", -1);
      }
      else {
         lateNonCriticalExtension = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new WLANConnectionStatusReport_v1430_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (wlan_Status_r13 != null) wlan_Status_r13.print (_sb, "wlan_Status_r13", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
