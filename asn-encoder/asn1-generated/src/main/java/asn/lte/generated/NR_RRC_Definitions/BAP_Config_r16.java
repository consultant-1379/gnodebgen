/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BAP_Config_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BAP-Config-r16";
   }

   public Asn1BitString bap_Address_r16;  // optional
   public BAP_RoutingID_r16 defaultUL_BAP_RoutingID_r16;  // optional
   public BH_RLC_ChannelID_r16 defaultUL_BH_RLC_Channel_r16;  // optional
   public BAP_Config_r16_flowControlFeedbackType_r16 flowControlFeedbackType_r16 = null;  // optional
   public Asn1OpenExt extElem1;

   public BAP_Config_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public BAP_Config_r16 (
      Asn1BitString bap_Address_r16_,
      BAP_RoutingID_r16 defaultUL_BAP_RoutingID_r16_,
      BH_RLC_ChannelID_r16 defaultUL_BH_RLC_Channel_r16_,
      BAP_Config_r16_flowControlFeedbackType_r16 flowControlFeedbackType_r16_
   ) {
      super();
      bap_Address_r16 = bap_Address_r16_;
      defaultUL_BAP_RoutingID_r16 = defaultUL_BAP_RoutingID_r16_;
      defaultUL_BH_RLC_Channel_r16 = defaultUL_BH_RLC_Channel_r16_;
      flowControlFeedbackType_r16 = flowControlFeedbackType_r16_;
   }

   public void init () {
      bap_Address_r16 = null;
      defaultUL_BAP_RoutingID_r16 = null;
      defaultUL_BH_RLC_Channel_r16 = null;
      flowControlFeedbackType_r16 = null;
      extElem1 = null;
   }

   public int getElementCount() { return 5; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bap_Address_r16;
         case 1: return defaultUL_BAP_RoutingID_r16;
         case 2: return defaultUL_BH_RLC_Channel_r16;
         case 3: return flowControlFeedbackType_r16;
         case 4: return extElem1;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bap-Address-r16";
         case 1: return "defaultUL-BAP-RoutingID-r16";
         case 2: return "defaultUL-BH-RLC-Channel-r16";
         case 3: return "flowControlFeedbackType-r16";
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

      boolean bap_Address_r16Present = buffer.decodeBit ("bap_Address_r16Present");
      boolean defaultUL_BAP_RoutingID_r16Present = buffer.decodeBit ("defaultUL_BAP_RoutingID_r16Present");
      boolean defaultUL_BH_RLC_Channel_r16Present = buffer.decodeBit ("defaultUL_BH_RLC_Channel_r16Present");
      boolean flowControlFeedbackType_r16Present = buffer.decodeBit ("flowControlFeedbackType_r16Present");

      // decode bap_Address_r16

      if (bap_Address_r16Present) {
         buffer.getContext().eventDispatcher.startElement("bap_Address_r16", -1);

         bap_Address_r16 = new Asn1BitString();
         bap_Address_r16.decode (buffer, 10, 10);

         buffer.invokeCharacters(bap_Address_r16.toString());
         buffer.getContext().eventDispatcher.endElement("bap_Address_r16", -1);
      }
      else {
         bap_Address_r16 = null;
      }

      // decode defaultUL_BAP_RoutingID_r16

      if (defaultUL_BAP_RoutingID_r16Present) {
         buffer.getContext().eventDispatcher.startElement("defaultUL_BAP_RoutingID_r16", -1);

         defaultUL_BAP_RoutingID_r16 = new BAP_RoutingID_r16();
         defaultUL_BAP_RoutingID_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("defaultUL_BAP_RoutingID_r16", -1);
      }
      else {
         defaultUL_BAP_RoutingID_r16 = null;
      }

      // decode defaultUL_BH_RLC_Channel_r16

      if (defaultUL_BH_RLC_Channel_r16Present) {
         buffer.getContext().eventDispatcher.startElement("defaultUL_BH_RLC_Channel_r16", -1);

         defaultUL_BH_RLC_Channel_r16 = new BH_RLC_ChannelID_r16();
         defaultUL_BH_RLC_Channel_r16.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("defaultUL_BH_RLC_Channel_r16", -1);
      }
      else {
         defaultUL_BH_RLC_Channel_r16 = null;
      }

      // decode flowControlFeedbackType_r16

      if (flowControlFeedbackType_r16Present) {
         buffer.getContext().eventDispatcher.startElement("flowControlFeedbackType_r16", -1);

         int tval = BAP_Config_r16_flowControlFeedbackType_r16.decodeEnumValue (buffer);
         flowControlFeedbackType_r16 = BAP_Config_r16_flowControlFeedbackType_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("flowControlFeedbackType_r16", -1);
      }
      else {
         flowControlFeedbackType_r16 = null;
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
      if (bap_Address_r16 != null) bap_Address_r16.print (_sb, "bap_Address_r16", _level+1);
      if (defaultUL_BAP_RoutingID_r16 != null) defaultUL_BAP_RoutingID_r16.print (_sb, "defaultUL_BAP_RoutingID_r16", _level+1);
      if (defaultUL_BH_RLC_Channel_r16 != null) defaultUL_BH_RLC_Channel_r16.print (_sb, "defaultUL_BH_RLC_Channel_r16", _level+1);
      if (flowControlFeedbackType_r16 != null) flowControlFeedbackType_r16.print (_sb, "flowControlFeedbackType_r16", _level+1);
      if (extElem1 != null) extElem1.print (_sb, "extElem1", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
