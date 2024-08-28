/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandCombinationParameters_r11 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BandCombinationParameters-r11";
   }

   public BandCombinationParameters_r11_bandParameterList_r11 bandParameterList_r11;
   public SupportedBandwidthCombinationSet_r10 supportedBandwidthCombinationSet_r11;  // optional
   public BandCombinationParameters_r11_multipleTimingAdvance_r11 multipleTimingAdvance_r11 = null;  // optional
   public BandCombinationParameters_r11_simultaneousRx_Tx_r11 simultaneousRx_Tx_r11 = null;  // optional
   public BandInfoEUTRA bandInfoEUTRA_r11;
   public Asn1OpenExt extElem1;

   public BandCombinationParameters_r11 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BandCombinationParameters_r11 (
      BandCombinationParameters_r11_bandParameterList_r11 bandParameterList_r11_,
      SupportedBandwidthCombinationSet_r10 supportedBandwidthCombinationSet_r11_,
      BandCombinationParameters_r11_multipleTimingAdvance_r11 multipleTimingAdvance_r11_,
      BandCombinationParameters_r11_simultaneousRx_Tx_r11 simultaneousRx_Tx_r11_,
      BandInfoEUTRA bandInfoEUTRA_r11_
   ) {
      super();
      bandParameterList_r11 = bandParameterList_r11_;
      supportedBandwidthCombinationSet_r11 = supportedBandwidthCombinationSet_r11_;
      multipleTimingAdvance_r11 = multipleTimingAdvance_r11_;
      simultaneousRx_Tx_r11 = simultaneousRx_Tx_r11_;
      bandInfoEUTRA_r11 = bandInfoEUTRA_r11_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BandCombinationParameters_r11 (
      BandCombinationParameters_r11_bandParameterList_r11 bandParameterList_r11_,
      BandInfoEUTRA bandInfoEUTRA_r11_
   ) {
      super();
      bandParameterList_r11 = bandParameterList_r11_;
      bandInfoEUTRA_r11 = bandInfoEUTRA_r11_;
   }

   public void init () {
      bandParameterList_r11 = null;
      supportedBandwidthCombinationSet_r11 = null;
      multipleTimingAdvance_r11 = null;
      simultaneousRx_Tx_r11 = null;
      bandInfoEUTRA_r11 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bandParameterList_r11;
         case 1: return supportedBandwidthCombinationSet_r11;
         case 2: return multipleTimingAdvance_r11;
         case 3: return simultaneousRx_Tx_r11;
         case 4: return bandInfoEUTRA_r11;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bandParameterList-r11";
         case 1: return "supportedBandwidthCombinationSet-r11";
         case 2: return "multipleTimingAdvance-r11";
         case 3: return "simultaneousRx-Tx-r11";
         case 4: return "bandInfoEUTRA-r11";
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

      boolean supportedBandwidthCombinationSet_r11Present = buffer.decodeBit ("supportedBandwidthCombinationSet_r11Present");
      boolean multipleTimingAdvance_r11Present = buffer.decodeBit ("multipleTimingAdvance_r11Present");
      boolean simultaneousRx_Tx_r11Present = buffer.decodeBit ("simultaneousRx_Tx_r11Present");

      // decode bandParameterList_r11

      buffer.getContext().eventDispatcher.startElement("bandParameterList_r11", -1);

      bandParameterList_r11 = new BandCombinationParameters_r11_bandParameterList_r11();
      bandParameterList_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandParameterList_r11", -1);

      // decode supportedBandwidthCombinationSet_r11

      if (supportedBandwidthCombinationSet_r11Present) {
         buffer.getContext().eventDispatcher.startElement("supportedBandwidthCombinationSet_r11", -1);

         supportedBandwidthCombinationSet_r11 = new SupportedBandwidthCombinationSet_r10();
         supportedBandwidthCombinationSet_r11.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("supportedBandwidthCombinationSet_r11", -1);
      }
      else {
         supportedBandwidthCombinationSet_r11 = null;
      }

      // decode multipleTimingAdvance_r11

      if (multipleTimingAdvance_r11Present) {
         buffer.getContext().eventDispatcher.startElement("multipleTimingAdvance_r11", -1);

         int tval = BandCombinationParameters_r11_multipleTimingAdvance_r11.decodeEnumValue (buffer);
         multipleTimingAdvance_r11 = BandCombinationParameters_r11_multipleTimingAdvance_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("multipleTimingAdvance_r11", -1);
      }
      else {
         multipleTimingAdvance_r11 = null;
      }

      // decode simultaneousRx_Tx_r11

      if (simultaneousRx_Tx_r11Present) {
         buffer.getContext().eventDispatcher.startElement("simultaneousRx_Tx_r11", -1);

         int tval = BandCombinationParameters_r11_simultaneousRx_Tx_r11.decodeEnumValue (buffer);
         simultaneousRx_Tx_r11 = BandCombinationParameters_r11_simultaneousRx_Tx_r11.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("simultaneousRx_Tx_r11", -1);
      }
      else {
         simultaneousRx_Tx_r11 = null;
      }

      // decode bandInfoEUTRA_r11

      buffer.getContext().eventDispatcher.startElement("bandInfoEUTRA_r11", -1);

      bandInfoEUTRA_r11 = new BandInfoEUTRA();
      bandInfoEUTRA_r11.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bandInfoEUTRA_r11", -1);

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
      if (bandParameterList_r11 != null) bandParameterList_r11.print (_sb, "bandParameterList_r11", _level+1);
      if (supportedBandwidthCombinationSet_r11 != null) supportedBandwidthCombinationSet_r11.print (_sb, "supportedBandwidthCombinationSet_r11", _level+1);
      if (multipleTimingAdvance_r11 != null) multipleTimingAdvance_r11.print (_sb, "multipleTimingAdvance_r11", _level+1);
      if (simultaneousRx_Tx_r11 != null) simultaneousRx_Tx_r11.print (_sb, "simultaneousRx_Tx_r11", _level+1);
      if (bandInfoEUTRA_r11 != null) bandInfoEUTRA_r11.print (_sb, "bandInfoEUTRA_r11", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
