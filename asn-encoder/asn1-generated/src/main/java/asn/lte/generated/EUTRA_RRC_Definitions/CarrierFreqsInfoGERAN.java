/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CarrierFreqsInfoGERAN extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CarrierFreqsInfoGERAN";
   }

   public CarrierFreqsGERAN carrierFreqs;
   public CarrierFreqsInfoGERAN_commonInfo commonInfo;
   public Asn1OpenExt extElem1;

   public CarrierFreqsInfoGERAN () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CarrierFreqsInfoGERAN (
      CarrierFreqsGERAN carrierFreqs_,
      CarrierFreqsInfoGERAN_commonInfo commonInfo_
   ) {
      super();
      carrierFreqs = carrierFreqs_;
      commonInfo = commonInfo_;
   }

   public void init () {
      carrierFreqs = null;
      commonInfo = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return carrierFreqs;
         case 1: return commonInfo;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "carrierFreqs";
         case 1: return "commonInfo";
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

      // decode carrierFreqs

      buffer.getContext().eventDispatcher.startElement("carrierFreqs", -1);

      carrierFreqs = new CarrierFreqsGERAN();
      carrierFreqs.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("carrierFreqs", -1);

      // decode commonInfo

      buffer.getContext().eventDispatcher.startElement("commonInfo", -1);

      commonInfo = new CarrierFreqsInfoGERAN_commonInfo();
      commonInfo.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("commonInfo", -1);

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
      if (carrierFreqs != null) carrierFreqs.print (_sb, "carrierFreqs", _level+1);
      if (commonInfo != null) commonInfo.print (_sb, "commonInfo", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
