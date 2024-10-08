/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class QCL_Info_referenceSignal extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _CSI_RS = 1;
   public final static byte _SSB = 2;

   public QCL_Info_referenceSignal () {
      super();
   }

   public QCL_Info_referenceSignal (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _CSI_RS: return "csi_rs";
      case _SSB: return "ssb";
      default: return "UNDEFINED";
      }
   }

   public void set_csi_rs (NZP_CSI_RS_ResourceId value) {
      setElement (_CSI_RS, value);
   }

   public void set_ssb (SSB_Index value) {
      setElement (_SSB, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // csi_rs
         case 0: { 
            NZP_CSI_RS_ResourceId csi_rs;
            element = csi_rs = new NZP_CSI_RS_ResourceId();
            csi_rs.decode (buffer);
            break;
         }

         // ssb
         case 1: { 
            SSB_Index ssb;
            element = ssb = new SSB_Index();
            ssb.decode (buffer);
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
