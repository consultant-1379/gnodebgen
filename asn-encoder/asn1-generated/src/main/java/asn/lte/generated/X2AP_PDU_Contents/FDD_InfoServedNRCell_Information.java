/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.NRFreqInfo;
import asn.lte.generated.X2AP_IEs.NR_TxBW;

public class FDD_InfoServedNRCell_Information extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "FDD-InfoServedNRCell-Information";
   }

   public NRFreqInfo ul_NRFreqInfo;
   public NRFreqInfo dl_NRFreqInfo;
   public NR_TxBW ul_NR_TxBW;
   public NR_TxBW dl_NR_TxBW;
   public FDD_InfoServedNRCell_Information_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public FDD_InfoServedNRCell_Information () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FDD_InfoServedNRCell_Information (
      NRFreqInfo ul_NRFreqInfo_,
      NRFreqInfo dl_NRFreqInfo_,
      NR_TxBW ul_NR_TxBW_,
      NR_TxBW dl_NR_TxBW_,
      FDD_InfoServedNRCell_Information_iE_Extensions iE_Extensions_
   ) {
      super();
      ul_NRFreqInfo = ul_NRFreqInfo_;
      dl_NRFreqInfo = dl_NRFreqInfo_;
      ul_NR_TxBW = ul_NR_TxBW_;
      dl_NR_TxBW = dl_NR_TxBW_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public FDD_InfoServedNRCell_Information (
      NRFreqInfo ul_NRFreqInfo_,
      NRFreqInfo dl_NRFreqInfo_,
      NR_TxBW ul_NR_TxBW_,
      NR_TxBW dl_NR_TxBW_
   ) {
      super();
      ul_NRFreqInfo = ul_NRFreqInfo_;
      dl_NRFreqInfo = dl_NRFreqInfo_;
      ul_NR_TxBW = ul_NR_TxBW_;
      dl_NR_TxBW = dl_NR_TxBW_;
   }

   public void init () {
      ul_NRFreqInfo = null;
      dl_NRFreqInfo = null;
      ul_NR_TxBW = null;
      dl_NR_TxBW = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return ul_NRFreqInfo;
         case 1: return dl_NRFreqInfo;
         case 2: return ul_NR_TxBW;
         case 3: return dl_NR_TxBW;
         case 4: return iE_Extensions;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "ul-NRFreqInfo";
         case 1: return "dl-NRFreqInfo";
         case 2: return "ul-NR-TxBW";
         case 3: return "dl-NR-TxBW";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode ul_NRFreqInfo

      buffer.getContext().eventDispatcher.startElement("ul_NRFreqInfo", -1);

      ul_NRFreqInfo = new NRFreqInfo();
      ul_NRFreqInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_NRFreqInfo", -1);

      // decode dl_NRFreqInfo

      buffer.getContext().eventDispatcher.startElement("dl_NRFreqInfo", -1);

      dl_NRFreqInfo = new NRFreqInfo();
      dl_NRFreqInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_NRFreqInfo", -1);

      // decode ul_NR_TxBW

      buffer.getContext().eventDispatcher.startElement("ul_NR_TxBW", -1);

      ul_NR_TxBW = new NR_TxBW();
      ul_NR_TxBW.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("ul_NR_TxBW", -1);

      // decode dl_NR_TxBW

      buffer.getContext().eventDispatcher.startElement("dl_NR_TxBW", -1);

      dl_NR_TxBW = new NR_TxBW();
      dl_NR_TxBW.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("dl_NR_TxBW", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new FDD_InfoServedNRCell_Information_iE_Extensions();
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
      if (ul_NRFreqInfo != null) ul_NRFreqInfo.print (_sb, "ul_NRFreqInfo", _level+1);
      if (dl_NRFreqInfo != null) dl_NRFreqInfo.print (_sb, "dl_NRFreqInfo", _level+1);
      if (ul_NR_TxBW != null) ul_NR_TxBW.print (_sb, "ul_NR_TxBW", _level+1);
      if (dl_NR_TxBW != null) dl_NR_TxBW.print (_sb, "dl_NR_TxBW", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
