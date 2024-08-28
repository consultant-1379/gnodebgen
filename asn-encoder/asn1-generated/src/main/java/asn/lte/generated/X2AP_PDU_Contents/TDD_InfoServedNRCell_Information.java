/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.NRFreqInfo;
import asn.lte.generated.X2AP_IEs.NR_TxBW;

public class TDD_InfoServedNRCell_Information extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "TDD-InfoServedNRCell-Information";
   }

   public NRFreqInfo nRFreqInfo;
   public NR_TxBW nR_TxBW;
   public TDD_InfoServedNRCell_Information_iE_Extensions iE_Extensions;  // optional
   public Asn1OpenExt extElem1;

   public TDD_InfoServedNRCell_Information () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public TDD_InfoServedNRCell_Information (
      NRFreqInfo nRFreqInfo_,
      NR_TxBW nR_TxBW_,
      TDD_InfoServedNRCell_Information_iE_Extensions iE_Extensions_
   ) {
      super();
      nRFreqInfo = nRFreqInfo_;
      nR_TxBW = nR_TxBW_;
      iE_Extensions = iE_Extensions_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public TDD_InfoServedNRCell_Information (
      NRFreqInfo nRFreqInfo_,
      NR_TxBW nR_TxBW_
   ) {
      super();
      nRFreqInfo = nRFreqInfo_;
      nR_TxBW = nR_TxBW_;
   }

   public void init () {
      nRFreqInfo = null;
      nR_TxBW = null;
      iE_Extensions = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return nRFreqInfo;
         case 1: return nR_TxBW;
         case 2: return iE_Extensions;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "nRFreqInfo";
         case 1: return "nR-TxBW";
         case 2: return "iE-Extensions";
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

      boolean iE_ExtensionsPresent = buffer.decodeBit ("iE_ExtensionsPresent");

      // decode nRFreqInfo

      buffer.getContext().eventDispatcher.startElement("nRFreqInfo", -1);

      nRFreqInfo = new NRFreqInfo();
      nRFreqInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nRFreqInfo", -1);

      // decode nR_TxBW

      buffer.getContext().eventDispatcher.startElement("nR_TxBW", -1);

      nR_TxBW = new NR_TxBW();
      nR_TxBW.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nR_TxBW", -1);

      // decode iE_Extensions

      if (iE_ExtensionsPresent) {
         buffer.getContext().eventDispatcher.startElement("iE_Extensions", -1);

         iE_Extensions = new TDD_InfoServedNRCell_Information_iE_Extensions();
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
      if (nRFreqInfo != null) nRFreqInfo.print (_sb, "nRFreqInfo", _level+1);
      if (nR_TxBW != null) nR_TxBW.print (_sb, "nR_TxBW", _level+1);
      if (iE_Extensions != null) iE_Extensions.print (_sb, "iE_Extensions", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
