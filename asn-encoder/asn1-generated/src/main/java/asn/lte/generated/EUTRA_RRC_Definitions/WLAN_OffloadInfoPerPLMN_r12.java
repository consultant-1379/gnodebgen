/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class WLAN_OffloadInfoPerPLMN_r12 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "WLAN-OffloadInfoPerPLMN-r12";
   }

   public WLAN_OffloadConfig_r12 wlan_OffloadConfigCommon_r12;  // optional
   public WLAN_Id_List_r12 wlan_Id_List_r12;  // optional
   public Asn1OpenExt extElem1;

   public WLAN_OffloadInfoPerPLMN_r12 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public WLAN_OffloadInfoPerPLMN_r12 (
      WLAN_OffloadConfig_r12 wlan_OffloadConfigCommon_r12_,
      WLAN_Id_List_r12 wlan_Id_List_r12_
   ) {
      super();
      wlan_OffloadConfigCommon_r12 = wlan_OffloadConfigCommon_r12_;
      wlan_Id_List_r12 = wlan_Id_List_r12_;
   }

   public void init () {
      wlan_OffloadConfigCommon_r12 = null;
      wlan_Id_List_r12 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return wlan_OffloadConfigCommon_r12;
         case 1: return wlan_Id_List_r12;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "wlan-OffloadConfigCommon-r12";
         case 1: return "wlan-Id-List-r12";
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

      boolean wlan_OffloadConfigCommon_r12Present = buffer.decodeBit ("wlan_OffloadConfigCommon_r12Present");
      boolean wlan_Id_List_r12Present = buffer.decodeBit ("wlan_Id_List_r12Present");

      // decode wlan_OffloadConfigCommon_r12

      if (wlan_OffloadConfigCommon_r12Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_OffloadConfigCommon_r12", -1);

         wlan_OffloadConfigCommon_r12 = new WLAN_OffloadConfig_r12();
         wlan_OffloadConfigCommon_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("wlan_OffloadConfigCommon_r12", -1);
      }
      else {
         wlan_OffloadConfigCommon_r12 = null;
      }

      // decode wlan_Id_List_r12

      if (wlan_Id_List_r12Present) {
         buffer.getContext().eventDispatcher.startElement("wlan_Id_List_r12", -1);

         wlan_Id_List_r12 = new WLAN_Id_List_r12();
         wlan_Id_List_r12.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("wlan_Id_List_r12", -1);
      }
      else {
         wlan_Id_List_r12 = null;
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
      if (wlan_OffloadConfigCommon_r12 != null) wlan_OffloadConfigCommon_r12.print (_sb, "wlan_OffloadConfigCommon_r12", _level+1);
      if (wlan_Id_List_r12 != null) wlan_Id_List_r12.print (_sb, "wlan_Id_List_r12", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
