/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DeltaTxD_OffsetListPUCCH_r10 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "DeltaTxD-OffsetListPUCCH-r10";
   }

   public DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1_r10 deltaTxD_OffsetPUCCH_Format1_r10 = null;
   public DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1a1b_r10 deltaTxD_OffsetPUCCH_Format1a1b_r10 = null;
   public DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format22a2b_r10 deltaTxD_OffsetPUCCH_Format22a2b_r10 = null;
   public DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format3_r10 deltaTxD_OffsetPUCCH_Format3_r10 = null;
   public Asn1OpenExt extElem1;

   public DeltaTxD_OffsetListPUCCH_r10 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public DeltaTxD_OffsetListPUCCH_r10 (
      DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1_r10 deltaTxD_OffsetPUCCH_Format1_r10_,
      DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1a1b_r10 deltaTxD_OffsetPUCCH_Format1a1b_r10_,
      DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format22a2b_r10 deltaTxD_OffsetPUCCH_Format22a2b_r10_,
      DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format3_r10 deltaTxD_OffsetPUCCH_Format3_r10_
   ) {
      super();
      deltaTxD_OffsetPUCCH_Format1_r10 = deltaTxD_OffsetPUCCH_Format1_r10_;
      deltaTxD_OffsetPUCCH_Format1a1b_r10 = deltaTxD_OffsetPUCCH_Format1a1b_r10_;
      deltaTxD_OffsetPUCCH_Format22a2b_r10 = deltaTxD_OffsetPUCCH_Format22a2b_r10_;
      deltaTxD_OffsetPUCCH_Format3_r10 = deltaTxD_OffsetPUCCH_Format3_r10_;
   }

   public void init () {
      deltaTxD_OffsetPUCCH_Format1_r10 = null;
      deltaTxD_OffsetPUCCH_Format1a1b_r10 = null;
      deltaTxD_OffsetPUCCH_Format22a2b_r10 = null;
      deltaTxD_OffsetPUCCH_Format3_r10 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return deltaTxD_OffsetPUCCH_Format1_r10;
         case 1: return deltaTxD_OffsetPUCCH_Format1a1b_r10;
         case 2: return deltaTxD_OffsetPUCCH_Format22a2b_r10;
         case 3: return deltaTxD_OffsetPUCCH_Format3_r10;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "deltaTxD-OffsetPUCCH-Format1-r10";
         case 1: return "deltaTxD-OffsetPUCCH-Format1a1b-r10";
         case 2: return "deltaTxD-OffsetPUCCH-Format22a2b-r10";
         case 3: return "deltaTxD-OffsetPUCCH-Format3-r10";
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

      // decode deltaTxD_OffsetPUCCH_Format1_r10

      buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetPUCCH_Format1_r10", -1);

      {
         int tval = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1_r10.decodeEnumValue (buffer);
         deltaTxD_OffsetPUCCH_Format1_r10 = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetPUCCH_Format1_r10", -1);

      // decode deltaTxD_OffsetPUCCH_Format1a1b_r10

      buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetPUCCH_Format1a1b_r10", -1);

      {
         int tval = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1a1b_r10.decodeEnumValue (buffer);
         deltaTxD_OffsetPUCCH_Format1a1b_r10 = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format1a1b_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetPUCCH_Format1a1b_r10", -1);

      // decode deltaTxD_OffsetPUCCH_Format22a2b_r10

      buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetPUCCH_Format22a2b_r10", -1);

      {
         int tval = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format22a2b_r10.decodeEnumValue (buffer);
         deltaTxD_OffsetPUCCH_Format22a2b_r10 = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format22a2b_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetPUCCH_Format22a2b_r10", -1);

      // decode deltaTxD_OffsetPUCCH_Format3_r10

      buffer.getContext().eventDispatcher.startElement("deltaTxD_OffsetPUCCH_Format3_r10", -1);

      {
         int tval = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format3_r10.decodeEnumValue (buffer);
         deltaTxD_OffsetPUCCH_Format3_r10 = DeltaTxD_OffsetListPUCCH_r10_deltaTxD_OffsetPUCCH_Format3_r10.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("deltaTxD_OffsetPUCCH_Format3_r10", -1);

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
      if (deltaTxD_OffsetPUCCH_Format1_r10 != null) deltaTxD_OffsetPUCCH_Format1_r10.print (_sb, "deltaTxD_OffsetPUCCH_Format1_r10", _level+1);
      if (deltaTxD_OffsetPUCCH_Format1a1b_r10 != null) deltaTxD_OffsetPUCCH_Format1a1b_r10.print (_sb, "deltaTxD_OffsetPUCCH_Format1a1b_r10", _level+1);
      if (deltaTxD_OffsetPUCCH_Format22a2b_r10 != null) deltaTxD_OffsetPUCCH_Format22a2b_r10.print (_sb, "deltaTxD_OffsetPUCCH_Format22a2b_r10", _level+1);
      if (deltaTxD_OffsetPUCCH_Format3_r10 != null) deltaTxD_OffsetPUCCH_Format3_r10.print (_sb, "deltaTxD_OffsetPUCCH_Format3_r10", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
