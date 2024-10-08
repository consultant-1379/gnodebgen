/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigDedicated extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RACH-ConfigDedicated";
   }

   public CFRA cfra;  // optional
   public RA_Prioritization ra_Prioritization;  // optional
   public boolean mV2ExtPresent;
   public RA_Prioritization ra_PrioritizationTwoStep_r16;  // optional
   public CFRA_TwoStep_r16 cfra_TwoStep_r16;  // optional
   public Asn1OpenExt extElem1;

   public RACH_ConfigDedicated () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public RACH_ConfigDedicated (
      CFRA cfra_,
      RA_Prioritization ra_Prioritization_,
      RA_Prioritization ra_PrioritizationTwoStep_r16_,
      CFRA_TwoStep_r16 cfra_TwoStep_r16_
   ) {
      super();
      cfra = cfra_;
      ra_Prioritization = ra_Prioritization_;
      ra_PrioritizationTwoStep_r16 = ra_PrioritizationTwoStep_r16_;
      cfra_TwoStep_r16 = cfra_TwoStep_r16_;
   }

   public void init () {
      cfra = null;
      ra_Prioritization = null;
      ra_PrioritizationTwoStep_r16 = null;
      cfra_TwoStep_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return cfra;
         case 1: return ra_Prioritization;
         case 2: return ra_PrioritizationTwoStep_r16;
         case 3: return cfra_TwoStep_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "cfra";
         case 1: return "ra-Prioritization";
         case 2: return "ra-PrioritizationTwoStep-r16";
         case 3: return "cfra-TwoStep-r16";
         case 4: return null;
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

      boolean cfraPresent = buffer.decodeBit ("cfraPresent");
      boolean ra_PrioritizationPresent = buffer.decodeBit ("ra_PrioritizationPresent");

      // decode cfra

      if (cfraPresent) {
         buffer.getContext().eventDispatcher.startElement("cfra", -1);

         cfra = new CFRA();
         cfra.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("cfra", -1);
      }
      else {
         cfra = null;
      }

      // decode ra_Prioritization

      if (ra_PrioritizationPresent) {
         buffer.getContext().eventDispatcher.startElement("ra_Prioritization", -1);

         ra_Prioritization = new RA_Prioritization();
         ra_Prioritization.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ra_Prioritization", -1);
      }
      else {
         ra_Prioritization = null;
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

            boolean ra_PrioritizationTwoStep_r16Present = buffer.decodeBit ("ra_PrioritizationTwoStep_r16Present");

            boolean cfra_TwoStep_r16Present = buffer.decodeBit ("cfra_TwoStep_r16Present");

            // decode ra_PrioritizationTwoStep_r16

            if (ra_PrioritizationTwoStep_r16Present) {
               buffer.getContext().eventDispatcher.startElement("ra_PrioritizationTwoStep_r16", -1);

               ra_PrioritizationTwoStep_r16 = new RA_Prioritization();
               ra_PrioritizationTwoStep_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("ra_PrioritizationTwoStep_r16", -1);
            }
            else {
               ra_PrioritizationTwoStep_r16 = null;
            }

            // decode cfra_TwoStep_r16

            if (cfra_TwoStep_r16Present) {
               buffer.getContext().eventDispatcher.startElement("cfra_TwoStep_r16", -1);

               cfra_TwoStep_r16 = new CFRA_TwoStep_r16();
               cfra_TwoStep_r16.decode (buffer);
               buffer.getContext().eventDispatcher.endElement("cfra_TwoStep_r16", -1);
            }
            else {
               cfra_TwoStep_r16 = null;
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

      buffer.encodeBit ((cfra != null), null);
      buffer.encodeBit ((ra_Prioritization != null), null);

      // encode cfra

      if (cfra != null) {
         buffer.getContext().eventDispatcher.startElement("cfra", -1);

         cfra.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("cfra", -1);
      }

      // encode ra_Prioritization

      if (ra_Prioritization != null) {
         buffer.getContext().eventDispatcher.startElement("ra_Prioritization", -1);

         ra_Prioritization.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("ra_Prioritization", -1);
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
            buffer.encodeBit ((ra_PrioritizationTwoStep_r16 != null), "optbit");
            buffer.encodeBit ((cfra_TwoStep_r16 != null), "optbit");
            if (ra_PrioritizationTwoStep_r16 != null) {
               ra_PrioritizationTwoStep_r16.encode (buffer);
            }
            if (cfra_TwoStep_r16 != null) {
               cfra_TwoStep_r16.encode (buffer);
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
      if (cfra != null) cfra.print (_sb, "cfra", _level+1);
      if (ra_Prioritization != null) ra_Prioritization.print (_sb, "ra_Prioritization", _level+1);
      if (ra_PrioritizationTwoStep_r16 != null) ra_PrioritizationTwoStep_r16.print (_sb, "ra_PrioritizationTwoStep_r16", _level+1);
      if (cfra_TwoStep_r16 != null) cfra_TwoStep_r16.print (_sb, "cfra_TwoStep_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
