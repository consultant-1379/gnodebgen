/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_EventTriggerConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-EventTriggerConfig-r16";
   }

   public SL_EventTriggerConfig_r16_sl_EventId_r16 sl_EventId_r16;
   public ReportInterval sl_ReportInterval_r16 = null;
   public SL_EventTriggerConfig_r16_sl_ReportAmount_r16 sl_ReportAmount_r16 = null;
   public SL_MeasReportQuantity_r16 sl_ReportQuantity_r16;
   public SL_RS_Type_r16 sl_RS_Type_r16 = null;
   public Asn1OpenExt extElem1;

   public SL_EventTriggerConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_EventTriggerConfig_r16 (
      SL_EventTriggerConfig_r16_sl_EventId_r16 sl_EventId_r16_,
      ReportInterval sl_ReportInterval_r16_,
      SL_EventTriggerConfig_r16_sl_ReportAmount_r16 sl_ReportAmount_r16_,
      SL_MeasReportQuantity_r16 sl_ReportQuantity_r16_,
      SL_RS_Type_r16 sl_RS_Type_r16_
   ) {
      super();
      sl_EventId_r16 = sl_EventId_r16_;
      sl_ReportInterval_r16 = sl_ReportInterval_r16_;
      sl_ReportAmount_r16 = sl_ReportAmount_r16_;
      sl_ReportQuantity_r16 = sl_ReportQuantity_r16_;
      sl_RS_Type_r16 = sl_RS_Type_r16_;
   }

   public void init () {
      sl_EventId_r16 = null;
      sl_ReportInterval_r16 = null;
      sl_ReportAmount_r16 = null;
      sl_ReportQuantity_r16 = null;
      sl_RS_Type_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_EventId_r16;
         case 1: return sl_ReportInterval_r16;
         case 2: return sl_ReportAmount_r16;
         case 3: return sl_ReportQuantity_r16;
         case 4: return sl_RS_Type_r16;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-EventId-r16";
         case 1: return "sl-ReportInterval-r16";
         case 2: return "sl-ReportAmount-r16";
         case 3: return "sl-ReportQuantity-r16";
         case 4: return "sl-RS-Type-r16";
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

      // decode sl_EventId_r16

      buffer.getContext().eventDispatcher.startElement("sl_EventId_r16", -1);

      sl_EventId_r16 = new SL_EventTriggerConfig_r16_sl_EventId_r16();
      sl_EventId_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_EventId_r16", -1);

      // decode sl_ReportInterval_r16

      buffer.getContext().eventDispatcher.startElement("sl_ReportInterval_r16", -1);

      {
         int tval = ReportInterval.decodeEnumValue (buffer);
         sl_ReportInterval_r16 = ReportInterval.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sl_ReportInterval_r16", -1);

      // decode sl_ReportAmount_r16

      buffer.getContext().eventDispatcher.startElement("sl_ReportAmount_r16", -1);

      {
         int tval = SL_EventTriggerConfig_r16_sl_ReportAmount_r16.decodeEnumValue (buffer);
         sl_ReportAmount_r16 = SL_EventTriggerConfig_r16_sl_ReportAmount_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sl_ReportAmount_r16", -1);

      // decode sl_ReportQuantity_r16

      buffer.getContext().eventDispatcher.startElement("sl_ReportQuantity_r16", -1);

      sl_ReportQuantity_r16 = new SL_MeasReportQuantity_r16();
      sl_ReportQuantity_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("sl_ReportQuantity_r16", -1);

      // decode sl_RS_Type_r16

      buffer.getContext().eventDispatcher.startElement("sl_RS_Type_r16", -1);

      {
         int tval = SL_RS_Type_r16.decodeEnumValue (buffer);
         sl_RS_Type_r16 = SL_RS_Type_r16.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("sl_RS_Type_r16", -1);

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
      if (sl_EventId_r16 != null) sl_EventId_r16.print (_sb, "sl_EventId_r16", _level+1);
      if (sl_ReportInterval_r16 != null) sl_ReportInterval_r16.print (_sb, "sl_ReportInterval_r16", _level+1);
      if (sl_ReportAmount_r16 != null) sl_ReportAmount_r16.print (_sb, "sl_ReportAmount_r16", _level+1);
      if (sl_ReportQuantity_r16 != null) sl_ReportQuantity_r16.print (_sb, "sl_ReportQuantity_r16", _level+1);
      if (sl_RS_Type_r16 != null) sl_RS_Type_r16.print (_sb, "sl_RS_Type_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
