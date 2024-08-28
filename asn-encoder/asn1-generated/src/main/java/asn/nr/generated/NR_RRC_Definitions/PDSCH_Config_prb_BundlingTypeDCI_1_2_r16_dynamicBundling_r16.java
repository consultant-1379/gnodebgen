/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet1_r16 bundleSizeSet1_r16 = null;  // optional
   public PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet2_r16 bundleSizeSet2_r16 = null;  // optional

   public PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16 (
      PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet1_r16 bundleSizeSet1_r16_,
      PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet2_r16 bundleSizeSet2_r16_
   ) {
      super();
      bundleSizeSet1_r16 = bundleSizeSet1_r16_;
      bundleSizeSet2_r16 = bundleSizeSet2_r16_;
   }

   public void init () {
      bundleSizeSet1_r16 = null;
      bundleSizeSet2_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bundleSizeSet1_r16;
         case 1: return bundleSizeSet2_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bundleSizeSet1-r16";
         case 1: return "bundleSizeSet2-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bundleSizeSet1_r16Present = buffer.decodeBit ("bundleSizeSet1_r16Present");
      boolean bundleSizeSet2_r16Present = buffer.decodeBit ("bundleSizeSet2_r16Present");

      // decode bundleSizeSet1_r16

      if (bundleSizeSet1_r16Present) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet1_r16", -1);

         int tval = PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet1_r16.decodeEnumValue (buffer);
         bundleSizeSet1_r16 = PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet1_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bundleSizeSet1_r16", -1);
      }
      else {
         bundleSizeSet1_r16 = null;
      }

      // decode bundleSizeSet2_r16

      if (bundleSizeSet2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet2_r16", -1);

         int tval = PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet2_r16.decodeEnumValue (buffer);
         bundleSizeSet2_r16 = PDSCH_Config_prb_BundlingTypeDCI_1_2_r16_dynamicBundling_r16_bundleSizeSet2_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bundleSizeSet2_r16", -1);
      }
      else {
         bundleSizeSet2_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((bundleSizeSet1_r16 != null), null);
      buffer.encodeBit ((bundleSizeSet2_r16 != null), null);

      // encode bundleSizeSet1_r16

      if (bundleSizeSet1_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet1_r16", -1);

         bundleSizeSet1_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bundleSizeSet1_r16", -1);
      }

      // encode bundleSizeSet2_r16

      if (bundleSizeSet2_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet2_r16", -1);

         bundleSizeSet2_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bundleSizeSet2_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bundleSizeSet1_r16 != null) bundleSizeSet1_r16.print (_sb, "bundleSizeSet1_r16", _level+1);
      if (bundleSizeSet2_r16 != null) bundleSizeSet2_r16.print (_sb, "bundleSizeSet2_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
