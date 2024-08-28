/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_MeasConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-MeasConfig-r16";
   }

   public SL_MeasObjectToRemoveList_r16 sl_MeasObjectToRemoveList_r16;  // optional
   public SL_MeasObjectList_r16 sl_MeasObjectToAddModList_r16;  // optional
   public SL_ReportConfigToRemoveList_r16 sl_ReportConfigToRemoveList_r16;  // optional
   public SL_ReportConfigList_r16 sl_ReportConfigToAddModList_r16;  // optional
   public SL_MeasIdToRemoveList_r16 sl_MeasIdToRemoveList_r16;  // optional
   public SL_MeasIdList_r16 sl_MeasIdToAddModList_r16;  // optional
   public SL_QuantityConfig_r16 sl_QuantityConfig_r16;  // optional
   public Asn1OpenExt extElem1;

   public SL_MeasConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_MeasConfig_r16 (
      SL_MeasObjectToRemoveList_r16 sl_MeasObjectToRemoveList_r16_,
      SL_MeasObjectList_r16 sl_MeasObjectToAddModList_r16_,
      SL_ReportConfigToRemoveList_r16 sl_ReportConfigToRemoveList_r16_,
      SL_ReportConfigList_r16 sl_ReportConfigToAddModList_r16_,
      SL_MeasIdToRemoveList_r16 sl_MeasIdToRemoveList_r16_,
      SL_MeasIdList_r16 sl_MeasIdToAddModList_r16_,
      SL_QuantityConfig_r16 sl_QuantityConfig_r16_
   ) {
      super();
      sl_MeasObjectToRemoveList_r16 = sl_MeasObjectToRemoveList_r16_;
      sl_MeasObjectToAddModList_r16 = sl_MeasObjectToAddModList_r16_;
      sl_ReportConfigToRemoveList_r16 = sl_ReportConfigToRemoveList_r16_;
      sl_ReportConfigToAddModList_r16 = sl_ReportConfigToAddModList_r16_;
      sl_MeasIdToRemoveList_r16 = sl_MeasIdToRemoveList_r16_;
      sl_MeasIdToAddModList_r16 = sl_MeasIdToAddModList_r16_;
      sl_QuantityConfig_r16 = sl_QuantityConfig_r16_;
   }

   public void init () {
      sl_MeasObjectToRemoveList_r16 = null;
      sl_MeasObjectToAddModList_r16 = null;
      sl_ReportConfigToRemoveList_r16 = null;
      sl_ReportConfigToAddModList_r16 = null;
      sl_MeasIdToRemoveList_r16 = null;
      sl_MeasIdToAddModList_r16 = null;
      sl_QuantityConfig_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_MeasObjectToRemoveList_r16;
         case 1: return sl_MeasObjectToAddModList_r16;
         case 2: return sl_ReportConfigToRemoveList_r16;
         case 3: return sl_ReportConfigToAddModList_r16;
         case 4: return sl_MeasIdToRemoveList_r16;
         case 5: return sl_MeasIdToAddModList_r16;
         case 6: return sl_QuantityConfig_r16;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-MeasObjectToRemoveList-r16";
         case 1: return "sl-MeasObjectToAddModList-r16";
         case 2: return "sl-ReportConfigToRemoveList-r16";
         case 3: return "sl-ReportConfigToAddModList-r16";
         case 4: return "sl-MeasIdToRemoveList-r16";
         case 5: return "sl-MeasIdToAddModList-r16";
         case 6: return "sl-QuantityConfig-r16";
         case 7: return null;
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

      boolean sl_MeasObjectToRemoveList_r16Present = buffer.decodeBit ("sl_MeasObjectToRemoveList_r16Present");
      boolean sl_MeasObjectToAddModList_r16Present = buffer.decodeBit ("sl_MeasObjectToAddModList_r16Present");
      boolean sl_ReportConfigToRemoveList_r16Present = buffer.decodeBit ("sl_ReportConfigToRemoveList_r16Present");
      boolean sl_ReportConfigToAddModList_r16Present = buffer.decodeBit ("sl_ReportConfigToAddModList_r16Present");
      boolean sl_MeasIdToRemoveList_r16Present = buffer.decodeBit ("sl_MeasIdToRemoveList_r16Present");
      boolean sl_MeasIdToAddModList_r16Present = buffer.decodeBit ("sl_MeasIdToAddModList_r16Present");
      boolean sl_QuantityConfig_r16Present = buffer.decodeBit ("sl_QuantityConfig_r16Present");

      // decode sl_MeasObjectToRemoveList_r16

      if (sl_MeasObjectToRemoveList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_MeasObjectToRemoveList_r16", -1);

         sl_MeasObjectToRemoveList_r16 = new SL_MeasObjectToRemoveList_r16();
         sl_MeasObjectToRemoveList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_MeasObjectToRemoveList_r16", -1);
      }
      else {
         sl_MeasObjectToRemoveList_r16 = null;
      }

      // decode sl_MeasObjectToAddModList_r16

      if (sl_MeasObjectToAddModList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_MeasObjectToAddModList_r16", -1);

         sl_MeasObjectToAddModList_r16 = new SL_MeasObjectList_r16();
         sl_MeasObjectToAddModList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_MeasObjectToAddModList_r16", -1);
      }
      else {
         sl_MeasObjectToAddModList_r16 = null;
      }

      // decode sl_ReportConfigToRemoveList_r16

      if (sl_ReportConfigToRemoveList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_ReportConfigToRemoveList_r16", -1);

         sl_ReportConfigToRemoveList_r16 = new SL_ReportConfigToRemoveList_r16();
         sl_ReportConfigToRemoveList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_ReportConfigToRemoveList_r16", -1);
      }
      else {
         sl_ReportConfigToRemoveList_r16 = null;
      }

      // decode sl_ReportConfigToAddModList_r16

      if (sl_ReportConfigToAddModList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_ReportConfigToAddModList_r16", -1);

         sl_ReportConfigToAddModList_r16 = new SL_ReportConfigList_r16();
         sl_ReportConfigToAddModList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_ReportConfigToAddModList_r16", -1);
      }
      else {
         sl_ReportConfigToAddModList_r16 = null;
      }

      // decode sl_MeasIdToRemoveList_r16

      if (sl_MeasIdToRemoveList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_MeasIdToRemoveList_r16", -1);

         sl_MeasIdToRemoveList_r16 = new SL_MeasIdToRemoveList_r16();
         sl_MeasIdToRemoveList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_MeasIdToRemoveList_r16", -1);
      }
      else {
         sl_MeasIdToRemoveList_r16 = null;
      }

      // decode sl_MeasIdToAddModList_r16

      if (sl_MeasIdToAddModList_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_MeasIdToAddModList_r16", -1);

         sl_MeasIdToAddModList_r16 = new SL_MeasIdList_r16();
         sl_MeasIdToAddModList_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_MeasIdToAddModList_r16", -1);
      }
      else {
         sl_MeasIdToAddModList_r16 = null;
      }

      // decode sl_QuantityConfig_r16

      if (sl_QuantityConfig_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_QuantityConfig_r16", -1);

         sl_QuantityConfig_r16 = new SL_QuantityConfig_r16();
         sl_QuantityConfig_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("sl_QuantityConfig_r16", -1);
      }
      else {
         sl_QuantityConfig_r16 = null;
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
      if (sl_MeasObjectToRemoveList_r16 != null) sl_MeasObjectToRemoveList_r16.print (_sb, "sl_MeasObjectToRemoveList_r16", _level+1);
      if (sl_MeasObjectToAddModList_r16 != null) sl_MeasObjectToAddModList_r16.print (_sb, "sl_MeasObjectToAddModList_r16", _level+1);
      if (sl_ReportConfigToRemoveList_r16 != null) sl_ReportConfigToRemoveList_r16.print (_sb, "sl_ReportConfigToRemoveList_r16", _level+1);
      if (sl_ReportConfigToAddModList_r16 != null) sl_ReportConfigToAddModList_r16.print (_sb, "sl_ReportConfigToAddModList_r16", _level+1);
      if (sl_MeasIdToRemoveList_r16 != null) sl_MeasIdToRemoveList_r16.print (_sb, "sl_MeasIdToRemoveList_r16", _level+1);
      if (sl_MeasIdToAddModList_r16 != null) sl_MeasIdToAddModList_r16.print (_sb, "sl_MeasIdToAddModList_r16", _level+1);
      if (sl_QuantityConfig_r16 != null) sl_QuantityConfig_r16.print (_sb, "sl_QuantityConfig_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
