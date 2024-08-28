/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_PathlossReferenceRS_r16_referenceSignal_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SSB_INDEX_R16 = 1;
   public final static byte _CSI_RS_INDEX_R16 = 2;

   public PUSCH_PathlossReferenceRS_r16_referenceSignal_r16 () {
      super();
   }

   public PUSCH_PathlossReferenceRS_r16_referenceSignal_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SSB_INDEX_R16: return "ssb_Index_r16";
      case _CSI_RS_INDEX_R16: return "csi_RS_Index_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_ssb_Index_r16 (SSB_Index value) {
      setElement (_SSB_INDEX_R16, value);
   }

   public void set_csi_RS_Index_r16 (NZP_CSI_RS_ResourceId value) {
      setElement (_CSI_RS_INDEX_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ssb_Index_r16
         case 0: { 
            SSB_Index ssb_Index_r16;
            element = ssb_Index_r16 = new SSB_Index();
            ssb_Index_r16.decode (buffer);
            break;
         }

         // csi_RS_Index_r16
         case 1: { 
            NZP_CSI_RS_ResourceId csi_RS_Index_r16;
            element = csi_RS_Index_r16 = new NZP_CSI_RS_ResourceId();
            csi_RS_Index_r16.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 2, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // ssb_Index_r16
         case _SSB_INDEX_R16:
            SSB_Index ssb_Index_r16 = (SSB_Index) element;
            ssb_Index_r16.encode (buffer);
            break;

         // csi_RS_Index_r16
         case _CSI_RS_INDEX_R16:
            NZP_CSI_RS_ResourceId csi_RS_Index_r16 = (NZP_CSI_RS_ResourceId) element;
            csi_RS_Index_r16.encode (buffer);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
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
