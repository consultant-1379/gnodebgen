/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BH_RLC_ChannelConfig_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BH-RLC-ChannelConfig-r16";
   }

   public BH_LogicalChannelIdentity_r16 bh_LogicalChannelIdentity_r16;  // optional
   public BH_RLC_ChannelID_r16 bh_RLC_ChannelID_r16;
   public BH_RLC_ChannelConfig_r16_reestablishRLC_r16 reestablishRLC_r16 = null;  // optional
   public RLC_Config rlc_Config_r16;  // optional
   public LogicalChannelConfig mac_LogicalChannelConfig_r16;  // optional
   public Asn1OpenExt extElem1;

   public BH_RLC_ChannelConfig_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BH_RLC_ChannelConfig_r16 (
      BH_LogicalChannelIdentity_r16 bh_LogicalChannelIdentity_r16_,
      BH_RLC_ChannelID_r16 bh_RLC_ChannelID_r16_,
      BH_RLC_ChannelConfig_r16_reestablishRLC_r16 reestablishRLC_r16_,
      RLC_Config rlc_Config_r16_,
      LogicalChannelConfig mac_LogicalChannelConfig_r16_
   ) {
      super();
      bh_LogicalChannelIdentity_r16 = bh_LogicalChannelIdentity_r16_;
      bh_RLC_ChannelID_r16 = bh_RLC_ChannelID_r16_;
      reestablishRLC_r16 = reestablishRLC_r16_;
      rlc_Config_r16 = rlc_Config_r16_;
      mac_LogicalChannelConfig_r16 = mac_LogicalChannelConfig_r16_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public BH_RLC_ChannelConfig_r16 (
      BH_RLC_ChannelID_r16 bh_RLC_ChannelID_r16_
   ) {
      super();
      bh_RLC_ChannelID_r16 = bh_RLC_ChannelID_r16_;
   }

   public void init () {
      bh_LogicalChannelIdentity_r16 = null;
      bh_RLC_ChannelID_r16 = null;
      reestablishRLC_r16 = null;
      rlc_Config_r16 = null;
      mac_LogicalChannelConfig_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 6; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bh_LogicalChannelIdentity_r16;
         case 1: return bh_RLC_ChannelID_r16;
         case 2: return reestablishRLC_r16;
         case 3: return rlc_Config_r16;
         case 4: return mac_LogicalChannelConfig_r16;
         case 5: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bh-LogicalChannelIdentity-r16";
         case 1: return "bh-RLC-ChannelID-r16";
         case 2: return "reestablishRLC-r16";
         case 3: return "rlc-Config-r16";
         case 4: return "mac-LogicalChannelConfig-r16";
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

      boolean bh_LogicalChannelIdentity_r16Present = buffer.decodeBit ("bh_LogicalChannelIdentity_r16Present");
      boolean reestablishRLC_r16Present = buffer.decodeBit ("reestablishRLC_r16Present");
      boolean rlc_Config_r16Present = buffer.decodeBit ("rlc_Config_r16Present");
      boolean mac_LogicalChannelConfig_r16Present = buffer.decodeBit ("mac_LogicalChannelConfig_r16Present");

      // decode bh_LogicalChannelIdentity_r16

      if (bh_LogicalChannelIdentity_r16Present) {
         buffer.getContext().eventDispatcher.startElement("bh_LogicalChannelIdentity_r16", -1);

         bh_LogicalChannelIdentity_r16 = new BH_LogicalChannelIdentity_r16();
         bh_LogicalChannelIdentity_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("bh_LogicalChannelIdentity_r16", -1);
      }
      else {
         bh_LogicalChannelIdentity_r16 = null;
      }

      // decode bh_RLC_ChannelID_r16

      buffer.getContext().eventDispatcher.startElement("bh_RLC_ChannelID_r16", -1);

      bh_RLC_ChannelID_r16 = new BH_RLC_ChannelID_r16();
      bh_RLC_ChannelID_r16.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("bh_RLC_ChannelID_r16", -1);

      // decode reestablishRLC_r16

      if (reestablishRLC_r16Present) {
         buffer.getContext().eventDispatcher.startElement("reestablishRLC_r16", -1);

         int tval = BH_RLC_ChannelConfig_r16_reestablishRLC_r16.decodeEnumValue (buffer);
         reestablishRLC_r16 = BH_RLC_ChannelConfig_r16_reestablishRLC_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("reestablishRLC_r16", -1);
      }
      else {
         reestablishRLC_r16 = null;
      }

      // decode rlc_Config_r16

      if (rlc_Config_r16Present) {
         buffer.getContext().eventDispatcher.startElement("rlc_Config_r16", -1);

         rlc_Config_r16 = new RLC_Config();
         rlc_Config_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("rlc_Config_r16", -1);
      }
      else {
         rlc_Config_r16 = null;
      }

      // decode mac_LogicalChannelConfig_r16

      if (mac_LogicalChannelConfig_r16Present) {
         buffer.getContext().eventDispatcher.startElement("mac_LogicalChannelConfig_r16", -1);

         mac_LogicalChannelConfig_r16 = new LogicalChannelConfig();
         mac_LogicalChannelConfig_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("mac_LogicalChannelConfig_r16", -1);
      }
      else {
         mac_LogicalChannelConfig_r16 = null;
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

      buffer.encodeBit ((bh_LogicalChannelIdentity_r16 != null), null);
      buffer.encodeBit ((reestablishRLC_r16 != null), null);
      buffer.encodeBit ((rlc_Config_r16 != null), null);
      buffer.encodeBit ((mac_LogicalChannelConfig_r16 != null), null);

      // encode bh_LogicalChannelIdentity_r16

      if (bh_LogicalChannelIdentity_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("bh_LogicalChannelIdentity_r16", -1);

         bh_LogicalChannelIdentity_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bh_LogicalChannelIdentity_r16", -1);
      }

      // encode bh_RLC_ChannelID_r16

      if (bh_RLC_ChannelID_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("bh_RLC_ChannelID_r16", -1);

         bh_RLC_ChannelID_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bh_RLC_ChannelID_r16", -1);
      }
      else throw new Asn1MissingRequiredException ("bh_RLC_ChannelID_r16");

      // encode reestablishRLC_r16

      if (reestablishRLC_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("reestablishRLC_r16", -1);

         reestablishRLC_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("reestablishRLC_r16", -1);
      }

      // encode rlc_Config_r16

      if (rlc_Config_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("rlc_Config_r16", -1);

         rlc_Config_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("rlc_Config_r16", -1);
      }

      // encode mac_LogicalChannelConfig_r16

      if (mac_LogicalChannelConfig_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("mac_LogicalChannelConfig_r16", -1);

         mac_LogicalChannelConfig_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("mac_LogicalChannelConfig_r16", -1);
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
      if (bh_LogicalChannelIdentity_r16 != null) bh_LogicalChannelIdentity_r16.print (_sb, "bh_LogicalChannelIdentity_r16", _level+1);
      if (bh_RLC_ChannelID_r16 != null) bh_RLC_ChannelID_r16.print (_sb, "bh_RLC_ChannelID_r16", _level+1);
      if (reestablishRLC_r16 != null) reestablishRLC_r16.print (_sb, "reestablishRLC_r16", _level+1);
      if (rlc_Config_r16 != null) rlc_Config_r16.print (_sb, "rlc_Config_r16", _level+1);
      if (mac_LogicalChannelConfig_r16 != null) mac_LogicalChannelConfig_r16.print (_sb, "mac_LogicalChannelConfig_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
