/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_Config_prb_BundlingType_dynamicBundling extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet1 bundleSizeSet1 = null;  // optional
   public PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 bundleSizeSet2 = null;  // optional

   public PDSCH_Config_prb_BundlingType_dynamicBundling () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public PDSCH_Config_prb_BundlingType_dynamicBundling (
      PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet1 bundleSizeSet1_,
      PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2 bundleSizeSet2_
   ) {
      super();
      bundleSizeSet1 = bundleSizeSet1_;
      bundleSizeSet2 = bundleSizeSet2_;
   }

   public void init () {
      bundleSizeSet1 = null;
      bundleSizeSet2 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return bundleSizeSet1;
         case 1: return bundleSizeSet2;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "bundleSizeSet1";
         case 1: return "bundleSizeSet2";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean bundleSizeSet1Present = buffer.decodeBit ("bundleSizeSet1Present");
      boolean bundleSizeSet2Present = buffer.decodeBit ("bundleSizeSet2Present");

      // decode bundleSizeSet1

      if (bundleSizeSet1Present) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet1", -1);

         int tval = PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet1.decodeEnumValue (buffer);
         bundleSizeSet1 = PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet1.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bundleSizeSet1", -1);
      }
      else {
         bundleSizeSet1 = null;
      }

      // decode bundleSizeSet2

      if (bundleSizeSet2Present) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet2", -1);

         int tval = PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2.decodeEnumValue (buffer);
         bundleSizeSet2 = PDSCH_Config_prb_BundlingType_dynamicBundling_bundleSizeSet2.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("bundleSizeSet2", -1);
      }
      else {
         bundleSizeSet2 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((bundleSizeSet1 != null), null);
      buffer.encodeBit ((bundleSizeSet2 != null), null);

      // encode bundleSizeSet1

      if (bundleSizeSet1 != null) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet1", -1);

         bundleSizeSet1.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bundleSizeSet1", -1);
      }

      // encode bundleSizeSet2

      if (bundleSizeSet2 != null) {
         buffer.getContext().eventDispatcher.startElement("bundleSizeSet2", -1);

         bundleSizeSet2.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("bundleSizeSet2", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (bundleSizeSet1 != null) bundleSizeSet1.print (_sb, "bundleSizeSet1", _level+1);
      if (bundleSizeSet2 != null) bundleSizeSet2.print (_sb, "bundleSizeSet2", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
