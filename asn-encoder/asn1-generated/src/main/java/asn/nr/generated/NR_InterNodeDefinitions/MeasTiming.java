/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.nr.generated.NR_RRC_Definitions.SSB_ToMeasure;
import asn.nr.generated.NR_RRC_Definitions.PhysCellId;

public class MeasTiming extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasTiming";
   }

   public MeasTiming_frequencyAndTiming frequencyAndTiming;  // optional
   public boolean mV2ExtPresent;
   public SSB_ToMeasure ssb_ToMeasure;  // optional
   public PhysCellId physCellId;  // optional
   public Asn1OpenExt extElem1;

   public MeasTiming () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasTiming (
      MeasTiming_frequencyAndTiming frequencyAndTiming_,
      SSB_ToMeasure ssb_ToMeasure_,
      PhysCellId physCellId_
   ) {
      super();
      frequencyAndTiming = frequencyAndTiming_;
      ssb_ToMeasure = ssb_ToMeasure_;
      physCellId = physCellId_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public MeasTiming (MeasTiming_frequencyAndTiming frequencyAndTiming_,
      SSB_ToMeasure ssb_ToMeasure_,
      long physCellId_
   ) {
      super();
      frequencyAndTiming = frequencyAndTiming_;
      ssb_ToMeasure = ssb_ToMeasure_;
      physCellId = new PhysCellId (physCellId_);
   }

   public void init () {
      frequencyAndTiming = null;
      ssb_ToMeasure = null;
      physCellId = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return frequencyAndTiming;
         case 1: return ssb_ToMeasure;
         case 2: return physCellId;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "frequencyAndTiming";
         case 1: return "ssb-ToMeasure";
         case 2: return "physCellId";
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

      boolean frequencyAndTimingPresent = buffer.decodeBit ("frequencyAndTimingPresent");

      // decode frequencyAndTiming

      if (frequencyAndTimingPresent) {
         buffer.getContext().eventDispatcher.startElement("frequencyAndTiming", -1);

         frequencyAndTiming = new MeasTiming_frequencyAndTiming();
         frequencyAndTiming.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("frequencyAndTiming", -1);
      }
      else {
         frequencyAndTiming = null;
      }

      if (extbit) {

         int bitcnt = buffer.decodeSmallLength(), i = 0;
         long bitidx = buffer.getBitOffset() + bitcnt;
         boolean[] bitmap = new boolean [bitcnt];

         if (i < bitcnt) bitmap[i++] = buffer.decodeBit ("mV2ExtPresent");

         while (i < bitcnt) {
            bitmap[i++] = buffer.decodeBit ("unknown");
         }

         i = 0;

         // decode extension group

         if (i < bitcnt && bitmap[i++]) {
            mV2ExtPresent = true;
            bitidx = buffer.decodeExtLength ();

            boolean ssb_ToMeasurePresent = buffer.decodeBit ("ssb_ToMeasurePresent");

            boolean physCellIdPresent = buffer.decodeBit ("physCellIdPresent");

            // decode ssb_ToMeasure

            if (ssb_ToMeasurePresent) {
               buffer.getContext().eventDispatcher.startElement("ssb_ToMeasure", -1);

               ssb_ToMeasure = new SSB_ToMeasure();
               ssb_ToMeasure.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ssb_ToMeasure", -1);
            }
            else {
               ssb_ToMeasure = null;
            }

            // decode physCellId

            if (physCellIdPresent) {
               buffer.getContext().eventDispatcher.startElement("physCellId", -1);

               physCellId = new PhysCellId();
               physCellId.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("physCellId", -1);
            }
            else {
               physCellId = null;
            }

            buffer.moveBitCursor (bitidx);
         }

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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (mV2ExtPresent ||
      ((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((frequencyAndTiming != null), null);

      // encode frequencyAndTiming

      if (frequencyAndTiming != null) {
         buffer.getContext().eventDispatcher.startElement("frequencyAndTiming", -1);

         frequencyAndTiming.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("frequencyAndTiming", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 1;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         buffer.encodeBit (mV2ExtPresent, null);

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         Asn1PerEncodeBuffer mainBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());

         if (mV2ExtPresent) {
            buffer.reset();
            buffer.encodeBit ((ssb_ToMeasure != null), "optbit");
            buffer.encodeBit ((physCellId != null), "optbit");
            if (ssb_ToMeasure != null) {
               ssb_ToMeasure.encode (buffer);
            }
            if (physCellId != null) {
               physCellId.encode (buffer);
            }
            mainBuffer.encodeOpenType (buffer, null);
         }

         buffer = mainBuffer;

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (frequencyAndTiming != null) frequencyAndTiming.print (_sb, "frequencyAndTiming", _level+1);
      if (ssb_ToMeasure != null) ssb_ToMeasure.print (_sb, "ssb_ToMeasure", _level+1);
      if (physCellId != null) physCellId.print (_sb, "physCellId", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
