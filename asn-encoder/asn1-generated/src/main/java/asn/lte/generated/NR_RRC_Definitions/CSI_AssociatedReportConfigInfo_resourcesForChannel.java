/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_AssociatedReportConfigInfo_resourcesForChannel extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _NZP_CSI_RS = 1;
   public final static byte _CSI_SSB_RESOURCESET = 2;

   public CSI_AssociatedReportConfigInfo_resourcesForChannel () {
      super();
   }

   public CSI_AssociatedReportConfigInfo_resourcesForChannel (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NZP_CSI_RS: return "nzp_CSI_RS";
      case _CSI_SSB_RESOURCESET: return "csi_SSB_ResourceSet";
      default: return "UNDEFINED";
      }
   }

   public void set_nzp_CSI_RS (CSI_AssociatedReportConfigInfo_resourcesForChannel_nzp_CSI_RS value) {
      setElement (_NZP_CSI_RS, value);
   }

   public void set_csi_SSB_ResourceSet (Asn1Integer value) {
      setElement (_CSI_SSB_RESOURCESET, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // nzp_CSI_RS
         case 0: { 
            CSI_AssociatedReportConfigInfo_resourcesForChannel_nzp_CSI_RS nzp_CSI_RS;
            element = nzp_CSI_RS = new CSI_AssociatedReportConfigInfo_resourcesForChannel_nzp_CSI_RS();
            nzp_CSI_RS.decode (buffer);
            break;
         }

         // csi_SSB_ResourceSet
         case 1: { 
            Asn1Integer csi_SSB_ResourceSet;
            element = csi_SSB_ResourceSet = new Asn1Integer();
            csi_SSB_ResourceSet.decode (buffer, 1, 1);

            buffer.invokeCharacters(csi_SSB_ResourceSet.toString());
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
