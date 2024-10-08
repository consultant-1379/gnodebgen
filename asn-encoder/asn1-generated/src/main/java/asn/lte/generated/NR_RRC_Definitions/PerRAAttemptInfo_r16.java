/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PerRAAttemptInfo_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "PerRAAttemptInfo-r16";
   }

   public Asn1Boolean contentionDetected_r16;  // optional
   public Asn1Boolean dlRSRPAboveThreshold_r16;  // optional
   public Asn1OpenExt extElem1;

   public PerRAAttemptInfo_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PerRAAttemptInfo_r16 (
      Asn1Boolean contentionDetected_r16_,
      Asn1Boolean dlRSRPAboveThreshold_r16_
   ) {
      super();
      contentionDetected_r16 = contentionDetected_r16_;
      dlRSRPAboveThreshold_r16 = dlRSRPAboveThreshold_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public PerRAAttemptInfo_r16 (boolean contentionDetected_r16_,
      boolean dlRSRPAboveThreshold_r16_
   ) {
      super();
      contentionDetected_r16 = new Asn1Boolean (contentionDetected_r16_);
      dlRSRPAboveThreshold_r16 = new Asn1Boolean (dlRSRPAboveThreshold_r16_);
   }

   public void init () {
      contentionDetected_r16 = null;
      dlRSRPAboveThreshold_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return contentionDetected_r16;
         case 1: return dlRSRPAboveThreshold_r16;
         case 2: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "contentionDetected-r16";
         case 1: return "dlRSRPAboveThreshold-r16";
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

      boolean contentionDetected_r16Present = buffer.decodeBit ("contentionDetected_r16Present");
      boolean dlRSRPAboveThreshold_r16Present = buffer.decodeBit ("dlRSRPAboveThreshold_r16Present");

      // decode contentionDetected_r16

      if (contentionDetected_r16Present) {
         buffer.getContext().eventDispatcher.startElement("contentionDetected_r16", -1);

         contentionDetected_r16 = new Asn1Boolean();
         contentionDetected_r16.decode (buffer);

         buffer.invokeCharacters(contentionDetected_r16.toString());
         buffer.getContext().eventDispatcher.endElement("contentionDetected_r16", -1);
      }
      else {
         contentionDetected_r16 = null;
      }

      // decode dlRSRPAboveThreshold_r16

      if (dlRSRPAboveThreshold_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dlRSRPAboveThreshold_r16", -1);

         dlRSRPAboveThreshold_r16 = new Asn1Boolean();
         dlRSRPAboveThreshold_r16.decode (buffer);

         buffer.invokeCharacters(dlRSRPAboveThreshold_r16.toString());
         buffer.getContext().eventDispatcher.endElement("dlRSRPAboveThreshold_r16", -1);
      }
      else {
         dlRSRPAboveThreshold_r16 = null;
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
      if (contentionDetected_r16 != null) contentionDetected_r16.print (_sb, "contentionDetected_r16", _level+1);
      if (dlRSRPAboveThreshold_r16 != null) dlRSRPAboveThreshold_r16.print (_sb, "dlRSRPAboveThreshold_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
