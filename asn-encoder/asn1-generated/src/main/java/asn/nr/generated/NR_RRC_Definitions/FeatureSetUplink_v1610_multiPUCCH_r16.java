/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetUplink_v1610_multiPUCCH_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_NCP_r16 sub_SlotConfig_NCP_r16 = null;  // optional
   public FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_ECP_r16 sub_SlotConfig_ECP_r16 = null;  // optional

   public FeatureSetUplink_v1610_multiPUCCH_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetUplink_v1610_multiPUCCH_r16 (
      FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_NCP_r16 sub_SlotConfig_NCP_r16_,
      FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_ECP_r16 sub_SlotConfig_ECP_r16_
   ) {
      super();
      sub_SlotConfig_NCP_r16 = sub_SlotConfig_NCP_r16_;
      sub_SlotConfig_ECP_r16 = sub_SlotConfig_ECP_r16_;
   }

   public void init () {
      sub_SlotConfig_NCP_r16 = null;
      sub_SlotConfig_ECP_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return sub_SlotConfig_NCP_r16;
         case 1: return sub_SlotConfig_ECP_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "sub-SlotConfig-NCP-r16";
         case 1: return "sub-SlotConfig-ECP-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean sub_SlotConfig_NCP_r16Present = buffer.decodeBit ("sub_SlotConfig_NCP_r16Present");
      boolean sub_SlotConfig_ECP_r16Present = buffer.decodeBit ("sub_SlotConfig_ECP_r16Present");

      // decode sub_SlotConfig_NCP_r16

      if (sub_SlotConfig_NCP_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sub_SlotConfig_NCP_r16", -1);

         int tval = FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_NCP_r16.decodeEnumValue (buffer);
         sub_SlotConfig_NCP_r16 = FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_NCP_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sub_SlotConfig_NCP_r16", -1);
      }
      else {
         sub_SlotConfig_NCP_r16 = null;
      }

      // decode sub_SlotConfig_ECP_r16

      if (sub_SlotConfig_ECP_r16Present) {
         buffer.getContext().eventDispatcher.startElement("sub_SlotConfig_ECP_r16", -1);

         int tval = FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_ECP_r16.decodeEnumValue (buffer);
         sub_SlotConfig_ECP_r16 = FeatureSetUplink_v1610_multiPUCCH_r16_sub_SlotConfig_ECP_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("sub_SlotConfig_ECP_r16", -1);
      }
      else {
         sub_SlotConfig_ECP_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((sub_SlotConfig_NCP_r16 != null), null);
      buffer.encodeBit ((sub_SlotConfig_ECP_r16 != null), null);

      // encode sub_SlotConfig_NCP_r16

      if (sub_SlotConfig_NCP_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sub_SlotConfig_NCP_r16", -1);

         sub_SlotConfig_NCP_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sub_SlotConfig_NCP_r16", -1);
      }

      // encode sub_SlotConfig_ECP_r16

      if (sub_SlotConfig_ECP_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("sub_SlotConfig_ECP_r16", -1);

         sub_SlotConfig_ECP_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("sub_SlotConfig_ECP_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (sub_SlotConfig_NCP_r16 != null) sub_SlotConfig_NCP_r16.print (_sb, "sub_SlotConfig_NCP_r16", _level+1);
      if (sub_SlotConfig_ECP_r16 != null) sub_SlotConfig_ECP_r16.print (_sb, "sub_SlotConfig_ECP_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
