/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_CarrierInfo_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "WLAN-CarrierInfo-r13";
   }

   public Asn1Integer operatingClass_r13;  // optional
   public WLAN_CarrierInfo_r13_countryCode_r13 countryCode_r13 = null;  // optional
   public WLAN_ChannelList_r13 channelNumbers_r13;  // optional
   public Asn1OpenExt extElem1;

   public WLAN_CarrierInfo_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLAN_CarrierInfo_r13 (
      Asn1Integer operatingClass_r13_,
      WLAN_CarrierInfo_r13_countryCode_r13 countryCode_r13_,
      WLAN_ChannelList_r13 channelNumbers_r13_
   ) {
      super();
      operatingClass_r13 = operatingClass_r13_;
      countryCode_r13 = countryCode_r13_;
      channelNumbers_r13 = channelNumbers_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public WLAN_CarrierInfo_r13 (long operatingClass_r13_,
      WLAN_CarrierInfo_r13_countryCode_r13 countryCode_r13_,
      WLAN_ChannelList_r13 channelNumbers_r13_
   ) {
      super();
      operatingClass_r13 = new Asn1Integer (operatingClass_r13_);
      countryCode_r13 = countryCode_r13_;
      channelNumbers_r13 = channelNumbers_r13_;
   }

   public void init () {
      operatingClass_r13 = null;
      countryCode_r13 = null;
      channelNumbers_r13 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return operatingClass_r13;
         case 1: return countryCode_r13;
         case 2: return channelNumbers_r13;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "operatingClass-r13";
         case 1: return "countryCode-r13";
         case 2: return "channelNumbers-r13";
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

      boolean operatingClass_r13Present = buffer.decodeBit ("operatingClass_r13Present");
      boolean countryCode_r13Present = buffer.decodeBit ("countryCode_r13Present");
      boolean channelNumbers_r13Present = buffer.decodeBit ("channelNumbers_r13Present");

      // decode operatingClass_r13

      if (operatingClass_r13Present) {
         buffer.getContext().eventDispatcher.startElement("operatingClass_r13", -1);

         operatingClass_r13 = new Asn1Integer();
         operatingClass_r13.decode (buffer, 0, 255);

         buffer.invokeCharacters(operatingClass_r13.toString());
         buffer.getContext().eventDispatcher.endElement("operatingClass_r13", -1);
      }
      else {
         operatingClass_r13 = null;
      }

      // decode countryCode_r13

      if (countryCode_r13Present) {
         buffer.getContext().eventDispatcher.startElement("countryCode_r13", -1);

         int tval = WLAN_CarrierInfo_r13_countryCode_r13.decodeEnumValue (buffer);
         countryCode_r13 = WLAN_CarrierInfo_r13_countryCode_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("countryCode_r13", -1);
      }
      else {
         countryCode_r13 = null;
      }

      // decode channelNumbers_r13

      if (channelNumbers_r13Present) {
         buffer.getContext().eventDispatcher.startElement("channelNumbers_r13", -1);

         channelNumbers_r13 = new WLAN_ChannelList_r13();
         channelNumbers_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("channelNumbers_r13", -1);
      }
      else {
         channelNumbers_r13 = null;
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
      if (operatingClass_r13 != null) operatingClass_r13.print (_sb, "operatingClass_r13", _level+1);
      if (countryCode_r13 != null) countryCode_r13.print (_sb, "countryCode_r13", _level+1);
      if (channelNumbers_r13 != null) channelNumbers_r13.print (_sb, "channelNumbers_r13", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
