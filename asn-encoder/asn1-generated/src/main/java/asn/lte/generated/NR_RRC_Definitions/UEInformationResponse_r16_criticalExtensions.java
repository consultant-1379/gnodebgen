/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEInformationResponse_r16_criticalExtensions extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _UEINFORMATIONRESPONSE_R16 = 1;
   public final static byte _CRITICALEXTENSIONSFUTURE = 2;

   public UEInformationResponse_r16_criticalExtensions () {
      super();
   }

   public UEInformationResponse_r16_criticalExtensions (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _UEINFORMATIONRESPONSE_R16: return "ueInformationResponse_r16";
      case _CRITICALEXTENSIONSFUTURE: return "criticalExtensionsFuture";
      default: return "UNDEFINED";
      }
   }

   public void set_ueInformationResponse_r16 (UEInformationResponse_r16_IEs value) {
      setElement (_UEINFORMATIONRESPONSE_R16, value);
   }

   public void set_criticalExtensionsFuture (UEInformationResponse_r16_criticalExtensions_criticalExtensionsFuture value) {
      setElement (_CRITICALEXTENSIONSFUTURE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // ueInformationResponse_r16
         case 0: { 
            UEInformationResponse_r16_IEs ueInformationResponse_r16;
            element = ueInformationResponse_r16 = new UEInformationResponse_r16_IEs();
            ueInformationResponse_r16.decode (buffer);
            break;
         }

         // criticalExtensionsFuture
         case 1: { 
            UEInformationResponse_r16_criticalExtensions_criticalExtensionsFuture criticalExtensionsFuture;
            element = criticalExtensionsFuture = new UEInformationResponse_r16_criticalExtensions_criticalExtensionsFuture();
            criticalExtensionsFuture.decode (buffer);
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
