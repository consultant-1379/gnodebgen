/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_Identifiers_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "WLAN-Identifiers-r12";
   }

   public Asn1OctetString ssid_r12;  // optional
   public Asn1OctetString bssid_r12;  // optional
   public Asn1OctetString hessid_r12;  // optional
   public Asn1OpenExt extElem1;

   public WLAN_Identifiers_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLAN_Identifiers_r12 (
      Asn1OctetString ssid_r12_,
      Asn1OctetString bssid_r12_,
      Asn1OctetString hessid_r12_
   ) {
      super();
      ssid_r12 = ssid_r12_;
      bssid_r12 = bssid_r12_;
      hessid_r12 = hessid_r12_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WLAN_Identifiers_r12 (byte[] ssid_r12_,
      byte[] bssid_r12_,
      byte[] hessid_r12_
   ) {
      super();
      ssid_r12 = new Asn1OctetString (ssid_r12_);
      bssid_r12 = new Asn1OctetString (bssid_r12_);
      hessid_r12 = new Asn1OctetString (hessid_r12_);
   }

   public void init () {
      ssid_r12 = null;
      bssid_r12 = null;
      hessid_r12 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ssid_r12;
         case 1: return bssid_r12;
         case 2: return hessid_r12;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ssid-r12";
         case 1: return "bssid-r12";
         case 2: return "hessid-r12";
         case 3: return null;
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

      boolean ssid_r12Present = buffer.decodeBit ("ssid_r12Present");
      boolean bssid_r12Present = buffer.decodeBit ("bssid_r12Present");
      boolean hessid_r12Present = buffer.decodeBit ("hessid_r12Present");

      // decode ssid_r12

      if (ssid_r12Present) {
         buffer.getContext().eventDispatcher.startElement("ssid_r12", -1);

         ssid_r12 = new Asn1OctetString();
         ssid_r12.decode (buffer, 1, 32);

         buffer.invokeCharacters(ssid_r12.toString());
         buffer.getContext().eventDispatcher.endElement("ssid_r12", -1);
      }
      else {
         ssid_r12 = null;
      }

      // decode bssid_r12

      if (bssid_r12Present) {
         buffer.getContext().eventDispatcher.startElement("bssid_r12", -1);

         bssid_r12 = new Asn1OctetString();
         bssid_r12.decode (buffer, 6, 6);

         buffer.invokeCharacters(bssid_r12.toString());
         buffer.getContext().eventDispatcher.endElement("bssid_r12", -1);
      }
      else {
         bssid_r12 = null;
      }

      // decode hessid_r12

      if (hessid_r12Present) {
         buffer.getContext().eventDispatcher.startElement("hessid_r12", -1);

         hessid_r12 = new Asn1OctetString();
         hessid_r12.decode (buffer, 6, 6);

         buffer.invokeCharacters(hessid_r12.toString());
         buffer.getContext().eventDispatcher.endElement("hessid_r12", -1);
      }
      else {
         hessid_r12 = null;
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
      if (ssid_r12 != null) ssid_r12.print (_sb, "ssid_r12", _level+1);
      if (bssid_r12 != null) bssid_r12.print (_sb, "bssid_r12", _level+1);
      if (hessid_r12 != null) hessid_r12.print (_sb, "hessid_r12", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
