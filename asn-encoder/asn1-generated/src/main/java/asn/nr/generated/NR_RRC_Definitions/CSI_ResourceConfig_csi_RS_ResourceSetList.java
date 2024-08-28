/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_ResourceConfig_csi_RS_ResourceSetList extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _NZP_CSI_RS_SSB = 1;
   public final static byte _CSI_IM_RESOURCESETLIST = 2;

   public CSI_ResourceConfig_csi_RS_ResourceSetList () {
      super();
   }

   public CSI_ResourceConfig_csi_RS_ResourceSetList (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NZP_CSI_RS_SSB: return "nzp_CSI_RS_SSB";
      case _CSI_IM_RESOURCESETLIST: return "csi_IM_ResourceSetList";
      default: return "UNDEFINED";
      }
   }

   public void set_nzp_CSI_RS_SSB (CSI_ResourceConfig_csi_RS_ResourceSetList_nzp_CSI_RS_SSB value) {
      setElement (_NZP_CSI_RS_SSB, value);
   }

   public void set_csi_IM_ResourceSetList (CSI_ResourceConfig_csi_RS_ResourceSetList_csi_IM_ResourceSetList value) {
      setElement (_CSI_IM_RESOURCESETLIST, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // nzp_CSI_RS_SSB
         case 0: { 
            CSI_ResourceConfig_csi_RS_ResourceSetList_nzp_CSI_RS_SSB nzp_CSI_RS_SSB;
            element = nzp_CSI_RS_SSB = new CSI_ResourceConfig_csi_RS_ResourceSetList_nzp_CSI_RS_SSB();
            nzp_CSI_RS_SSB.decode (buffer);
            break;
         }

         // csi_IM_ResourceSetList
         case 1: { 
            CSI_ResourceConfig_csi_RS_ResourceSetList_csi_IM_ResourceSetList csi_IM_ResourceSetList;
            element = csi_IM_ResourceSetList = new CSI_ResourceConfig_csi_RS_ResourceSetList_csi_IM_ResourceSetList();
            csi_IM_ResourceSetList.decode (buffer);
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
         // nzp_CSI_RS_SSB
         case _NZP_CSI_RS_SSB:
            CSI_ResourceConfig_csi_RS_ResourceSetList_nzp_CSI_RS_SSB nzp_CSI_RS_SSB = (CSI_ResourceConfig_csi_RS_ResourceSetList_nzp_CSI_RS_SSB) element;
            nzp_CSI_RS_SSB.encode (buffer);
            break;

         // csi_IM_ResourceSetList
         case _CSI_IM_RESOURCESETLIST:
            CSI_ResourceConfig_csi_RS_ResourceSetList_csi_IM_ResourceSetList csi_IM_ResourceSetList = (CSI_ResourceConfig_csi_RS_ResourceSetList_csi_IM_ResourceSetList) element;
            csi_IM_ResourceSetList.encode (buffer);
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
