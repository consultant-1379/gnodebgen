/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType23_NB_r15 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SystemInformationBlockType23-NB-r15";
   }

   public UL_ConfigCommonList_NB_v1530 ul_ConfigList_v1530;  // optional
   public UL_ConfigCommonList_NB_v1530 ul_ConfigListMixed_v1530;  // optional
   public Asn1OctetString lateNonCriticalExtension;  // optional
   public Asn1OpenExt extElem1;

   public SystemInformationBlockType23_NB_r15 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SystemInformationBlockType23_NB_r15 (
      UL_ConfigCommonList_NB_v1530 ul_ConfigList_v1530_,
      UL_ConfigCommonList_NB_v1530 ul_ConfigListMixed_v1530_,
      Asn1OctetString lateNonCriticalExtension_
   ) {
      super();
      ul_ConfigList_v1530 = ul_ConfigList_v1530_;
      ul_ConfigListMixed_v1530 = ul_ConfigListMixed_v1530_;
      lateNonCriticalExtension = lateNonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SystemInformationBlockType23_NB_r15 (UL_ConfigCommonList_NB_v1530 ul_ConfigList_v1530_,
      UL_ConfigCommonList_NB_v1530 ul_ConfigListMixed_v1530_,
      byte[] lateNonCriticalExtension_
   ) {
      super();
      ul_ConfigList_v1530 = ul_ConfigList_v1530_;
      ul_ConfigListMixed_v1530 = ul_ConfigListMixed_v1530_;
      lateNonCriticalExtension = new Asn1OctetString (lateNonCriticalExtension_);
   }

   public void init () {
      ul_ConfigList_v1530 = null;
      ul_ConfigListMixed_v1530 = null;
      lateNonCriticalExtension = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_ConfigList_v1530;
         case 1: return ul_ConfigListMixed_v1530;
         case 2: return lateNonCriticalExtension;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-ConfigList-v1530";
         case 1: return "ul-ConfigListMixed-v1530";
         case 2: return "lateNonCriticalExtension";
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

      boolean ul_ConfigList_v1530Present = buffer.decodeBit ("ul_ConfigList_v1530Present");
      boolean ul_ConfigListMixed_v1530Present = buffer.decodeBit ("ul_ConfigListMixed_v1530Present");
      boolean lateNonCriticalExtensionPresent = buffer.decodeBit ("lateNonCriticalExtensionPresent");

      // decode ul_ConfigList_v1530

      if (ul_ConfigList_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("ul_ConfigList_v1530", -1);

         ul_ConfigList_v1530 = new UL_ConfigCommonList_NB_v1530();
         ul_ConfigList_v1530.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_ConfigList_v1530", -1);
      }
      else {
         ul_ConfigList_v1530 = null;
      }

      // decode ul_ConfigListMixed_v1530

      if (ul_ConfigListMixed_v1530Present) {
         buffer.getContext().eventDispatcher.startElement("ul_ConfigListMixed_v1530", -1);

         ul_ConfigListMixed_v1530 = new UL_ConfigCommonList_NB_v1530();
         ul_ConfigListMixed_v1530.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ul_ConfigListMixed_v1530", -1);
      }
      else {
         ul_ConfigListMixed_v1530 = null;
      }

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
      if (ul_ConfigList_v1530 != null) ul_ConfigList_v1530.print (_sb, "ul_ConfigList_v1530", _level+1);
      if (ul_ConfigListMixed_v1530 != null) ul_ConfigListMixed_v1530.print (_sb, "ul_ConfigListMixed_v1530", _level+1);
      if (lateNonCriticalExtension != null) lateNonCriticalExtension.print (_sb, "lateNonCriticalExtension", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
