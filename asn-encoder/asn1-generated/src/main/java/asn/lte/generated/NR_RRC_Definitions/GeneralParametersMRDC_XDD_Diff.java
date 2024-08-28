/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

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
   public GeneralParametersMRDC_XDD_Diff_v2x_EUTRA v2x_EUTRA = null;  // optional
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
      GeneralParametersMRDC_XDD_Diff_v2x_EUTRA v2x_EUTRA_
   ) {
      super();
      splitSRB_WithOneUL_Path = splitSRB_WithOneUL_Path_;
      splitDRB_withUL_Both_MCG_SCG = splitDRB_withUL_Both_MCG_SCG_;
      srb3 = srb3_;
      v2x_EUTRA = v2x_EUTRA_;
   }

   public void init () {
      splitSRB_WithOneUL_Path = null;
      splitDRB_withUL_Both_MCG_SCG = null;
      srb3 = null;
      v2x_EUTRA = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return splitSRB_WithOneUL_Path;
         case 1: return splitDRB_withUL_Both_MCG_SCG;
         case 2: return srb3;
         case 3: return v2x_EUTRA;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "splitSRB-WithOneUL-Path";
         case 1: return "splitDRB-withUL-Both-MCG-SCG";
         case 2: return "srb3";
         case 3: return "v2x-EUTRA";
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
      boolean v2x_EUTRAPresent = buffer.decodeBit ("v2x_EUTRAPresent");

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

      // decode v2x_EUTRA

      if (v2x_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("v2x_EUTRA", -1);

         int tval = GeneralParametersMRDC_XDD_Diff_v2x_EUTRA.decodeEnumValue (buffer);
         v2x_EUTRA = GeneralParametersMRDC_XDD_Diff_v2x_EUTRA.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("v2x_EUTRA", -1);
      }
      else {
         v2x_EUTRA = null;
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
      if (splitSRB_WithOneUL_Path != null) splitSRB_WithOneUL_Path.print (_sb, "splitSRB_WithOneUL_Path", _level+1);
      if (splitDRB_withUL_Both_MCG_SCG != null) splitDRB_withUL_Both_MCG_SCG.print (_sb, "splitDRB_withUL_Both_MCG_SCG", _level+1);
      if (srb3 != null) srb3.print (_sb, "srb3", _level+1);
      if (v2x_EUTRA != null) v2x_EUTRA.print (_sb, "v2x_EUTRA", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
