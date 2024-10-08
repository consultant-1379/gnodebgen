/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PSSCH_Config_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PSSCH-Config-r16";
   }

   public SL_PSSCH_Config_r16_sl_PSSCH_DMRS_TimePatternList_r16 sl_PSSCH_DMRS_TimePatternList_r16;  // optional
   public SL_PSSCH_Config_r16_sl_BetaOffsets2ndSCI_r16 sl_BetaOffsets2ndSCI_r16;  // optional
   public SL_PSSCH_Config_r16_sl_Scaling_r16 sl_Scaling_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public SL_PSSCH_Config_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PSSCH_Config_r16 (
      SL_PSSCH_Config_r16_sl_PSSCH_DMRS_TimePatternList_r16 sl_PSSCH_DMRS_TimePatternList_r16_,
      SL_PSSCH_Config_r16_sl_BetaOffsets2ndSCI_r16 sl_BetaOffsets2ndSCI_r16_,
      SL_PSSCH_Config_r16_sl_Scaling_r16 sl_Scaling_r16_
   ) {
      super();
      sl_PSSCH_DMRS_TimePatternList_r16 = sl_PSSCH_DMRS_TimePatternList_r16_;
      sl_BetaOffsets2ndSCI_r16 = sl_BetaOffsets2ndSCI_r16_;
      sl_Scaling_r16 = sl_Scaling_r16_;
   }

   public void init () {
      sl_PSSCH_DMRS_TimePatternList_r16 = null;
      sl_BetaOffsets2ndSCI_r16 = null;
      sl_Scaling_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_PSSCH_DMRS_TimePatternList_r16;
         case 1: return sl_BetaOffsets2ndSCI_r16;
         case 2: return sl_Scaling_r16;
         case 3: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-PSSCH-DMRS-TimePatternList-r16";
         case 1: return "sl-BetaOffsets2ndSCI-r16";
         case 2: return "sl-Scaling-r16";
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

      boolean sl_PSSCH_DMRS_TimePatternList_r16Present = buffer.decodeBit ("sl_PSSCH_DMRS_TimePatternList_r16Present");
      boolean sl_BetaOffsets2ndSCI_r16Present = buffer.decodeBit ("sl_BetaOffsets2ndSCI_r16Present");
      boolean sl_Scaling_r16Present = buffer.decodeBit ("sl_Scaling_r16Present");

      // decode sl_PSSCH_DMRS_TimePatternList_r16

      if (sl_PSSCH_DMRS_TimePatternList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_PSSCH_DMRS_TimePatternList_r16", -1);

         sl_PSSCH_DMRS_TimePatternList_r16 = new SL_PSSCH_Config_r16_sl_PSSCH_DMRS_TimePatternList_r16();
         sl_PSSCH_DMRS_TimePatternList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_PSSCH_DMRS_TimePatternList_r16", -1);
      }
      else {
         sl_PSSCH_DMRS_TimePatternList_r16 = null;
      }

      // decode sl_BetaOffsets2ndSCI_r16

      if (sl_BetaOffsets2ndSCI_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_BetaOffsets2ndSCI_r16", -1);

         sl_BetaOffsets2ndSCI_r16 = new SL_PSSCH_Config_r16_sl_BetaOffsets2ndSCI_r16();
         sl_BetaOffsets2ndSCI_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_BetaOffsets2ndSCI_r16", -1);
      }
      else {
         sl_BetaOffsets2ndSCI_r16 = null;
      }

      // decode sl_Scaling_r16

      if (sl_Scaling_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Scaling_r16", -1);

         int tval = SL_PSSCH_Config_r16_sl_Scaling_r16.decodeEnumValue (buffer);
         sl_Scaling_r16 = SL_PSSCH_Config_r16_sl_Scaling_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_Scaling_r16", -1);
      }
      else {
         sl_Scaling_r16 = null;
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
      if (sl_PSSCH_DMRS_TimePatternList_r16 != null) sl_PSSCH_DMRS_TimePatternList_r16.print (_sb, "sl_PSSCH_DMRS_TimePatternList_r16", _level+1);
      if (sl_BetaOffsets2ndSCI_r16 != null) sl_BetaOffsets2ndSCI_r16.print (_sb, "sl_BetaOffsets2ndSCI_r16", _level+1);
      if (sl_Scaling_r16 != null) sl_Scaling_r16.print (_sb, "sl_Scaling_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
