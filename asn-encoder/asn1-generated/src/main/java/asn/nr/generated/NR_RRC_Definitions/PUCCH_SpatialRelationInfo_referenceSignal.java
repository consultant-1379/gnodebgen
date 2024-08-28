/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_SpatialRelationInfo_referenceSignal extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SSB_INDEX = 1;
   public final static byte _CSI_RS_INDEX = 2;
   public final static byte _SRS = 3;

   public PUCCH_SpatialRelationInfo_referenceSignal () {
      super();
   }

   public PUCCH_SpatialRelationInfo_referenceSignal (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SSB_INDEX: return "ssb_Index";
      case _CSI_RS_INDEX: return "csi_RS_Index";
      case _SRS: return "srs";
      default: return "UNDEFINED";
      }
   }

   public void set_ssb_Index (SSB_Index value) {
      setElement (_SSB_INDEX, value);
   }

   public void set_csi_RS_Index (NZP_CSI_RS_ResourceId value) {
      setElement (_CSI_RS_INDEX, value);
   }

   public void set_srs (PUCCH_SRS value) {
      setElement (_SRS, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ssb_Index
         case 0: { 
            SSB_Index ssb_Index;
            element = ssb_Index = new SSB_Index();
            ssb_Index.decode (buffer);
            break;
         }

         // csi_RS_Index
         case 1: { 
            NZP_CSI_RS_ResourceId csi_RS_Index;
            element = csi_RS_Index = new NZP_CSI_RS_ResourceId();
            csi_RS_Index.decode (buffer);
            break;
         }

         // srs
         case 2: { 
            PUCCH_SRS srs;
            element = srs = new PUCCH_SRS();
            srs.decode (buffer);
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

      buffer.encodeConsWholeNumber (choiceID - 1, 3, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // ssb_Index
         case _SSB_INDEX:
            SSB_Index ssb_Index = (SSB_Index) element;
            ssb_Index.encode (buffer);
            break;

         // csi_RS_Index
         case _CSI_RS_INDEX:
            NZP_CSI_RS_ResourceId csi_RS_Index = (NZP_CSI_RS_ResourceId) element;
            csi_RS_Index.encode (buffer);
            break;

         // srs
         case _SRS:
            PUCCH_SRS srs = (PUCCH_SRS) element;
            srs.encode (buffer);
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
