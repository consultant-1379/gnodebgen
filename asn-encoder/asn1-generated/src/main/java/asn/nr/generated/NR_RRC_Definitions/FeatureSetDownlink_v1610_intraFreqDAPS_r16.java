/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FeatureSetDownlink_v1610_intraFreqDAPS_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqDiffSCS_DAPS_r16 intraFreqDiffSCS_DAPS_r16 = null;  // optional
   public FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqAsyncDAPS_r16 intraFreqAsyncDAPS_r16 = null;  // optional

   public FeatureSetDownlink_v1610_intraFreqDAPS_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public FeatureSetDownlink_v1610_intraFreqDAPS_r16 (
      FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqDiffSCS_DAPS_r16 intraFreqDiffSCS_DAPS_r16_,
      FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqAsyncDAPS_r16 intraFreqAsyncDAPS_r16_
   ) {
      super();
      intraFreqDiffSCS_DAPS_r16 = intraFreqDiffSCS_DAPS_r16_;
      intraFreqAsyncDAPS_r16 = intraFreqAsyncDAPS_r16_;
   }

   public void init () {
      intraFreqDiffSCS_DAPS_r16 = null;
      intraFreqAsyncDAPS_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return intraFreqDiffSCS_DAPS_r16;
         case 1: return intraFreqAsyncDAPS_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "intraFreqDiffSCS-DAPS-r16";
         case 1: return "intraFreqAsyncDAPS-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean intraFreqDiffSCS_DAPS_r16Present = buffer.decodeBit ("intraFreqDiffSCS_DAPS_r16Present");
      boolean intraFreqAsyncDAPS_r16Present = buffer.decodeBit ("intraFreqAsyncDAPS_r16Present");

      // decode intraFreqDiffSCS_DAPS_r16

      if (intraFreqDiffSCS_DAPS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("intraFreqDiffSCS_DAPS_r16", -1);

         int tval = FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqDiffSCS_DAPS_r16.decodeEnumValue (buffer);
         intraFreqDiffSCS_DAPS_r16 = FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqDiffSCS_DAPS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("intraFreqDiffSCS_DAPS_r16", -1);
      }
      else {
         intraFreqDiffSCS_DAPS_r16 = null;
      }

      // decode intraFreqAsyncDAPS_r16

      if (intraFreqAsyncDAPS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("intraFreqAsyncDAPS_r16", -1);

         int tval = FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqAsyncDAPS_r16.decodeEnumValue (buffer);
         intraFreqAsyncDAPS_r16 = FeatureSetDownlink_v1610_intraFreqDAPS_r16_intraFreqAsyncDAPS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("intraFreqAsyncDAPS_r16", -1);
      }
      else {
         intraFreqAsyncDAPS_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((intraFreqDiffSCS_DAPS_r16 != null), null);
      buffer.encodeBit ((intraFreqAsyncDAPS_r16 != null), null);

      // encode intraFreqDiffSCS_DAPS_r16

      if (intraFreqDiffSCS_DAPS_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("intraFreqDiffSCS_DAPS_r16", -1);

         intraFreqDiffSCS_DAPS_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("intraFreqDiffSCS_DAPS_r16", -1);
      }

      // encode intraFreqAsyncDAPS_r16

      if (intraFreqAsyncDAPS_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("intraFreqAsyncDAPS_r16", -1);

         intraFreqAsyncDAPS_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("intraFreqAsyncDAPS_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (intraFreqDiffSCS_DAPS_r16 != null) intraFreqDiffSCS_DAPS_r16.print (_sb, "intraFreqDiffSCS_DAPS_r16", _level+1);
      if (intraFreqAsyncDAPS_r16 != null) intraFreqAsyncDAPS_r16.print (_sb, "intraFreqAsyncDAPS_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
