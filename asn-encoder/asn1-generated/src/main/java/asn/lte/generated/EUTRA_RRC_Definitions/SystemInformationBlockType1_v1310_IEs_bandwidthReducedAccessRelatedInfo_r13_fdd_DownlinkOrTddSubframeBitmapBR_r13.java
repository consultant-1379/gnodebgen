/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SystemInformationBlockType1_v1310_IEs_bandwidthReducedAccessRelatedInfo_r13_fdd_DownlinkOrTddSubframeBitmapBR_r13 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SUBFRAMEPATTERN10_R13 = 1;
   public final static byte _SUBFRAMEPATTERN40_R13 = 2;

   public SystemInformationBlockType1_v1310_IEs_bandwidthReducedAccessRelatedInfo_r13_fdd_DownlinkOrTddSubframeBitmapBR_r13 () {
      super();
   }

   public SystemInformationBlockType1_v1310_IEs_bandwidthReducedAccessRelatedInfo_r13_fdd_DownlinkOrTddSubframeBitmapBR_r13 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SUBFRAMEPATTERN10_R13: return "subframePattern10_r13";
      case _SUBFRAMEPATTERN40_R13: return "subframePattern40_r13";
      default: return "UNDEFINED";
      }
   }

   public void set_subframePattern10_r13 (Asn1BitString value) {
      setElement (_SUBFRAMEPATTERN10_R13, value);
   }

   public void set_subframePattern40_r13 (Asn1BitString value) {
      setElement (_SUBFRAMEPATTERN40_R13, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // subframePattern10_r13
         case 0: { 
            Asn1BitString subframePattern10_r13;
            element = subframePattern10_r13 = new Asn1BitString();
            subframePattern10_r13.decode (buffer, 10, 10);

            buffer.invokeCharacters(subframePattern10_r13.toString());
            break;
         }

         // subframePattern40_r13
         case 1: { 
            Asn1BitString subframePattern40_r13;
            element = subframePattern40_r13 = new Asn1BitString();
            subframePattern40_r13.decode (buffer, 40, 40);

            buffer.invokeCharacters(subframePattern40_r13.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
