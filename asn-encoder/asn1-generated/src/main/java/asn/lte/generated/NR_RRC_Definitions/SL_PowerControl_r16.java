/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SL_PowerControl_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SL-PowerControl-r16";
   }

   public Asn1Integer sl_MaxTransPower_r16;
   public SL_PowerControl_r16_sl_Alpha_PSSCH_PSCCH_r16 sl_Alpha_PSSCH_PSCCH_r16 = null;  // optional
   public SL_PowerControl_r16_dl_Alpha_PSSCH_PSCCH_r16 dl_Alpha_PSSCH_PSCCH_r16 = null;  // optional
   public Asn1Integer sl_P0_PSSCH_PSCCH_r16;  // optional
   public Asn1Integer dl_P0_PSSCH_PSCCH_r16;  // optional
   public SL_PowerControl_r16_dl_Alpha_PSFCH_r16 dl_Alpha_PSFCH_r16 = null;  // optional
   public Asn1Integer dl_P0_PSFCH_r16;  // optional
   public Asn1OpenExt extElem1;

   public SL_PowerControl_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SL_PowerControl_r16 (
      Asn1Integer sl_MaxTransPower_r16_,
      SL_PowerControl_r16_sl_Alpha_PSSCH_PSCCH_r16 sl_Alpha_PSSCH_PSCCH_r16_,
      SL_PowerControl_r16_dl_Alpha_PSSCH_PSCCH_r16 dl_Alpha_PSSCH_PSCCH_r16_,
      Asn1Integer sl_P0_PSSCH_PSCCH_r16_,
      Asn1Integer dl_P0_PSSCH_PSCCH_r16_,
      SL_PowerControl_r16_dl_Alpha_PSFCH_r16 dl_Alpha_PSFCH_r16_,
      Asn1Integer dl_P0_PSFCH_r16_
   ) {
      super();
      sl_MaxTransPower_r16 = sl_MaxTransPower_r16_;
      sl_Alpha_PSSCH_PSCCH_r16 = sl_Alpha_PSSCH_PSCCH_r16_;
      dl_Alpha_PSSCH_PSCCH_r16 = dl_Alpha_PSSCH_PSCCH_r16_;
      sl_P0_PSSCH_PSCCH_r16 = sl_P0_PSSCH_PSCCH_r16_;
      dl_P0_PSSCH_PSCCH_r16 = dl_P0_PSSCH_PSCCH_r16_;
      dl_Alpha_PSFCH_r16 = dl_Alpha_PSFCH_r16_;
      dl_P0_PSFCH_r16 = dl_P0_PSFCH_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public SL_PowerControl_r16 (
      Asn1Integer sl_MaxTransPower_r16_
   ) {
      super();
      sl_MaxTransPower_r16 = sl_MaxTransPower_r16_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public SL_PowerControl_r16 (long sl_MaxTransPower_r16_,
      SL_PowerControl_r16_sl_Alpha_PSSCH_PSCCH_r16 sl_Alpha_PSSCH_PSCCH_r16_,
      SL_PowerControl_r16_dl_Alpha_PSSCH_PSCCH_r16 dl_Alpha_PSSCH_PSCCH_r16_,
      long sl_P0_PSSCH_PSCCH_r16_,
      long dl_P0_PSSCH_PSCCH_r16_,
      SL_PowerControl_r16_dl_Alpha_PSFCH_r16 dl_Alpha_PSFCH_r16_,
      long dl_P0_PSFCH_r16_
   ) {
      super();
      sl_MaxTransPower_r16 = new Asn1Integer (sl_MaxTransPower_r16_);
      sl_Alpha_PSSCH_PSCCH_r16 = sl_Alpha_PSSCH_PSCCH_r16_;
      dl_Alpha_PSSCH_PSCCH_r16 = dl_Alpha_PSSCH_PSCCH_r16_;
      sl_P0_PSSCH_PSCCH_r16 = new Asn1Integer (sl_P0_PSSCH_PSCCH_r16_);
      dl_P0_PSSCH_PSCCH_r16 = new Asn1Integer (dl_P0_PSSCH_PSCCH_r16_);
      dl_Alpha_PSFCH_r16 = dl_Alpha_PSFCH_r16_;
      dl_P0_PSFCH_r16 = new Asn1Integer (dl_P0_PSFCH_r16_);
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public SL_PowerControl_r16 (
      long sl_MaxTransPower_r16_
   ) {
      super();
      sl_MaxTransPower_r16 = new Asn1Integer (sl_MaxTransPower_r16_);
   }

   public void init () {
      sl_MaxTransPower_r16 = null;
      sl_Alpha_PSSCH_PSCCH_r16 = null;
      dl_Alpha_PSSCH_PSCCH_r16 = null;
      sl_P0_PSSCH_PSCCH_r16 = null;
      dl_P0_PSSCH_PSCCH_r16 = null;
      dl_Alpha_PSFCH_r16 = null;
      dl_P0_PSFCH_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sl_MaxTransPower_r16;
         case 1: return sl_Alpha_PSSCH_PSCCH_r16;
         case 2: return dl_Alpha_PSSCH_PSCCH_r16;
         case 3: return sl_P0_PSSCH_PSCCH_r16;
         case 4: return dl_P0_PSSCH_PSCCH_r16;
         case 5: return dl_Alpha_PSFCH_r16;
         case 6: return dl_P0_PSFCH_r16;
         case 7: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sl-MaxTransPower-r16";
         case 1: return "sl-Alpha-PSSCH-PSCCH-r16";
         case 2: return "dl-Alpha-PSSCH-PSCCH-r16";
         case 3: return "sl-P0-PSSCH-PSCCH-r16";
         case 4: return "dl-P0-PSSCH-PSCCH-r16";
         case 5: return "dl-Alpha-PSFCH-r16";
         case 6: return "dl-P0-PSFCH-r16";
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

      boolean sl_Alpha_PSSCH_PSCCH_r16Present = buffer.decodeBit ("sl_Alpha_PSSCH_PSCCH_r16Present");
      boolean dl_Alpha_PSSCH_PSCCH_r16Present = buffer.decodeBit ("dl_Alpha_PSSCH_PSCCH_r16Present");
      boolean sl_P0_PSSCH_PSCCH_r16Present = buffer.decodeBit ("sl_P0_PSSCH_PSCCH_r16Present");
      boolean dl_P0_PSSCH_PSCCH_r16Present = buffer.decodeBit ("dl_P0_PSSCH_PSCCH_r16Present");
      boolean dl_Alpha_PSFCH_r16Present = buffer.decodeBit ("dl_Alpha_PSFCH_r16Present");
      boolean dl_P0_PSFCH_r16Present = buffer.decodeBit ("dl_P0_PSFCH_r16Present");

      // decode sl_MaxTransPower_r16

      buffer.getContext().eventDispatcher.startElement("sl_MaxTransPower_r16", -1);

      sl_MaxTransPower_r16 = new Asn1Integer();
      sl_MaxTransPower_r16.decode (buffer, -30, 33);

      buffer.invokeCharacters(sl_MaxTransPower_r16.toString());
      buffer.getContext().eventDispatcher.endElement("sl_MaxTransPower_r16", -1);

      // decode sl_Alpha_PSSCH_PSCCH_r16

      if (sl_Alpha_PSSCH_PSCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_Alpha_PSSCH_PSCCH_r16", -1);

         int tval = SL_PowerControl_r16_sl_Alpha_PSSCH_PSCCH_r16.decodeEnumValue (buffer);
         sl_Alpha_PSSCH_PSCCH_r16 = SL_PowerControl_r16_sl_Alpha_PSSCH_PSCCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sl_Alpha_PSSCH_PSCCH_r16", -1);
      }
      else {
         sl_Alpha_PSSCH_PSCCH_r16 = null;
      }

      // decode dl_Alpha_PSSCH_PSCCH_r16

      if (dl_Alpha_PSSCH_PSCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dl_Alpha_PSSCH_PSCCH_r16", -1);

         int tval = SL_PowerControl_r16_dl_Alpha_PSSCH_PSCCH_r16.decodeEnumValue (buffer);
         dl_Alpha_PSSCH_PSCCH_r16 = SL_PowerControl_r16_dl_Alpha_PSSCH_PSCCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_Alpha_PSSCH_PSCCH_r16", -1);
      }
      else {
         dl_Alpha_PSSCH_PSCCH_r16 = null;
      }

      // decode sl_P0_PSSCH_PSCCH_r16

      if (sl_P0_PSSCH_PSCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sl_P0_PSSCH_PSCCH_r16", -1);

         sl_P0_PSSCH_PSCCH_r16 = new Asn1Integer();
         sl_P0_PSSCH_PSCCH_r16.decode (buffer, -16, 15);

         buffer.invokeCharacters(sl_P0_PSSCH_PSCCH_r16.toString());
         buffer.getContext().eventDispatcher.endElement("sl_P0_PSSCH_PSCCH_r16", -1);
      }
      else {
         sl_P0_PSSCH_PSCCH_r16 = null;
      }

      // decode dl_P0_PSSCH_PSCCH_r16

      if (dl_P0_PSSCH_PSCCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dl_P0_PSSCH_PSCCH_r16", -1);

         dl_P0_PSSCH_PSCCH_r16 = new Asn1Integer();
         dl_P0_PSSCH_PSCCH_r16.decode (buffer, -16, 15);

         buffer.invokeCharacters(dl_P0_PSSCH_PSCCH_r16.toString());
         buffer.getContext().eventDispatcher.endElement("dl_P0_PSSCH_PSCCH_r16", -1);
      }
      else {
         dl_P0_PSSCH_PSCCH_r16 = null;
      }

      // decode dl_Alpha_PSFCH_r16

      if (dl_Alpha_PSFCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dl_Alpha_PSFCH_r16", -1);

         int tval = SL_PowerControl_r16_dl_Alpha_PSFCH_r16.decodeEnumValue (buffer);
         dl_Alpha_PSFCH_r16 = SL_PowerControl_r16_dl_Alpha_PSFCH_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("dl_Alpha_PSFCH_r16", -1);
      }
      else {
         dl_Alpha_PSFCH_r16 = null;
      }

      // decode dl_P0_PSFCH_r16

      if (dl_P0_PSFCH_r16Present) {
         buffer.getContext().eventDispatcher.startElement("dl_P0_PSFCH_r16", -1);

         dl_P0_PSFCH_r16 = new Asn1Integer();
         dl_P0_PSFCH_r16.decode (buffer, -16, 15);

         buffer.invokeCharacters(dl_P0_PSFCH_r16.toString());
         buffer.getContext().eventDispatcher.endElement("dl_P0_PSFCH_r16", -1);
      }
      else {
         dl_P0_PSFCH_r16 = null;
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
      if (sl_MaxTransPower_r16 != null) sl_MaxTransPower_r16.print (_sb, "sl_MaxTransPower_r16", _level+1);
      if (sl_Alpha_PSSCH_PSCCH_r16 != null) sl_Alpha_PSSCH_PSCCH_r16.print (_sb, "sl_Alpha_PSSCH_PSCCH_r16", _level+1);
      if (dl_Alpha_PSSCH_PSCCH_r16 != null) dl_Alpha_PSSCH_PSCCH_r16.print (_sb, "dl_Alpha_PSSCH_PSCCH_r16", _level+1);
      if (sl_P0_PSSCH_PSCCH_r16 != null) sl_P0_PSSCH_PSCCH_r16.print (_sb, "sl_P0_PSSCH_PSCCH_r16", _level+1);
      if (dl_P0_PSSCH_PSCCH_r16 != null) dl_P0_PSSCH_PSCCH_r16.print (_sb, "dl_P0_PSSCH_PSCCH_r16", _level+1);
      if (dl_Alpha_PSFCH_r16 != null) dl_Alpha_PSFCH_r16.print (_sb, "dl_Alpha_PSFCH_r16", _level+1);
      if (dl_P0_PSFCH_r16 != null) dl_P0_PSFCH_r16.print (_sb, "dl_P0_PSFCH_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
