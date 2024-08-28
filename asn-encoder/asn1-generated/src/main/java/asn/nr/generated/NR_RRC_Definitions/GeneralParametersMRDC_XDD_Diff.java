/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class GeneralParametersMRDC_XDD_Diff extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "GeneralParametersMRDC-XDD-Diff";
   }

   public GeneralParametersMRDC_XDD_Diff_splitSRB_WithOneUL_Path splitSRB_WithOneUL_Path = null;  // optional
   public GeneralParametersMRDC_XDD_Diff_splitDRB_withUL_Both_MCG_SCG splitDRB_withUL_Both_MCG_SCG = null;  // optional
   public GeneralParametersMRDC_XDD_Diff_srb3 srb3 = null;  // optional
   public GeneralParametersMRDC_XDD_Diff_dummy dummy = null;  // optional
   public Asn1OpenExt extElem1;

   public GeneralParametersMRDC_XDD_Diff () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public GeneralParametersMRDC_XDD_Diff (
      GeneralParametersMRDC_XDD_Diff_splitSRB_WithOneUL_Path splitSRB_WithOneUL_Path_,
      GeneralParametersMRDC_XDD_Diff_splitDRB_withUL_Both_MCG_SCG splitDRB_withUL_Both_MCG_SCG_,
      GeneralParametersMRDC_XDD_Diff_srb3 srb3_,
      GeneralParametersMRDC_XDD_Diff_dummy dummy_
   ) {
      super();
      splitSRB_WithOneUL_Path = splitSRB_WithOneUL_Path_;
      splitDRB_withUL_Both_MCG_SCG = splitDRB_withUL_Both_MCG_SCG_;
      srb3 = srb3_;
      dummy = dummy_;
   }

   public void init () {
      splitSRB_WithOneUL_Path = null;
      splitDRB_withUL_Both_MCG_SCG = null;
      srb3 = null;
      dummy = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return splitSRB_WithOneUL_Path;
         case 1: return splitDRB_withUL_Both_MCG_SCG;
         case 2: return srb3;
         case 3: return dummy;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "splitSRB-WithOneUL-Path";
         case 1: return "splitDRB-withUL-Both-MCG-SCG";
         case 2: return "srb3";
         case 3: return "dummy";
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

      boolean splitSRB_WithOneUL_PathPresent = buffer.decodeBit ("splitSRB_WithOneUL_PathPresent");
      boolean splitDRB_withUL_Both_MCG_SCGPresent = buffer.decodeBit ("splitDRB_withUL_Both_MCG_SCGPresent");
      boolean srb3Present = buffer.decodeBit ("srb3Present");
      boolean dummyPresent = buffer.decodeBit ("dummyPresent");

      // decode splitSRB_WithOneUL_Path

      if (splitSRB_WithOneUL_PathPresent) {
         buffer.getContext().eventDispatcher.startElement("splitSRB_WithOneUL_Path", -1);

         int tval = GeneralParametersMRDC_XDD_Diff_splitSRB_WithOneUL_Path.decodeEnumValue (buffer);
         splitSRB_WithOneUL_Path = GeneralParametersMRDC_XDD_Diff_splitSRB_WithOneUL_Path.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("splitSRB_WithOneUL_Path", -1);
      }
      else {
         splitSRB_WithOneUL_Path = null;
      }

      // decode splitDRB_withUL_Both_MCG_SCG

      if (splitDRB_withUL_Both_MCG_SCGPresent) {
         buffer.getContext().eventDispatcher.startElement("splitDRB_withUL_Both_MCG_SCG", -1);

         int tval = GeneralParametersMRDC_XDD_Diff_splitDRB_withUL_Both_MCG_SCG.decodeEnumValue (buffer);
         splitDRB_withUL_Both_MCG_SCG = GeneralParametersMRDC_XDD_Diff_splitDRB_withUL_Both_MCG_SCG.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("splitDRB_withUL_Both_MCG_SCG", -1);
      }
      else {
         splitDRB_withUL_Both_MCG_SCG = null;
      }

      // decode srb3

      if (srb3Present) {
         buffer.getContext().eventDispatcher.startElement("srb3", -1);

         int tval = GeneralParametersMRDC_XDD_Diff_srb3.decodeEnumValue (buffer);
         srb3 = GeneralParametersMRDC_XDD_Diff_srb3.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("srb3", -1);
      }
      else {
         srb3 = null;
      }

      // decode dummy

      if (dummyPresent) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         int tval = GeneralParametersMRDC_XDD_Diff_dummy.decodeEnumValue (buffer);
         dummy = GeneralParametersMRDC_XDD_Diff_dummy.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }
      else {
         dummy = null;
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (((extElem1 != null) && (!extElem1.value.isEmpty()))
      );

      buffer.encodeBit (extbit, "extbit");

      // encode optional elements bit mask

      buffer.encodeBit ((splitSRB_WithOneUL_Path != null), null);
      buffer.encodeBit ((splitDRB_withUL_Both_MCG_SCG != null), null);
      buffer.encodeBit ((srb3 != null), null);
      buffer.encodeBit ((dummy != null), null);

      // encode splitSRB_WithOneUL_Path

      if (splitSRB_WithOneUL_Path != null) {
         buffer.getContext().eventDispatcher.startElement("splitSRB_WithOneUL_Path", -1);

         splitSRB_WithOneUL_Path.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("splitSRB_WithOneUL_Path", -1);
      }

      // encode splitDRB_withUL_Both_MCG_SCG

      if (splitDRB_withUL_Both_MCG_SCG != null) {
         buffer.getContext().eventDispatcher.startElement("splitDRB_withUL_Both_MCG_SCG", -1);

         splitDRB_withUL_Both_MCG_SCG.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("splitDRB_withUL_Both_MCG_SCG", -1);
      }

      // encode srb3

      if (srb3 != null) {
         buffer.getContext().eventDispatcher.startElement("srb3", -1);

         srb3.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("srb3", -1);
      }

      // encode dummy

      if (dummy != null) {
         buffer.getContext().eventDispatcher.startElement("dummy", -1);

         dummy.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("dummy", -1);
      }

      if (extbit) {

         // encode extension optional bits length

         int bitcnt = 0;
         if (extElem1 != null) bitcnt += extElem1.value.size();
         buffer.encodeSmallLength (bitcnt);

         // encode optional bits

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encodeExtBits (buffer);
         }

         // encode extension elements

         if (extElem1 != null && extElem1.value.size() > 0) {
            extElem1.encode (buffer);
         }
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (splitSRB_WithOneUL_Path != null) splitSRB_WithOneUL_Path.print (_sb, "splitSRB_WithOneUL_Path", _level+1);
      if (splitDRB_withUL_Both_MCG_SCG != null) splitDRB_withUL_Both_MCG_SCG.print (_sb, "splitDRB_withUL_Both_MCG_SCG", _level+1);
      if (srb3 != null) srb3.print (_sb, "srb3", _level+1);
      if (dummy != null) dummy.print (_sb, "dummy", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
