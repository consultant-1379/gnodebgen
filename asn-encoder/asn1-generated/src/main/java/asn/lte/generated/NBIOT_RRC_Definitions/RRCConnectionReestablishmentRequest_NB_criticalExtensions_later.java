/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReestablishmentRequest_NB_criticalExtensions_later extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCCONNECTIONREESTABLISHMENTREQUEST_R14 = 1;
   public final static byte _CRITICALEXTENSIONSFUTURE = 2;

   public RRCConnectionReestablishmentRequest_NB_criticalExtensions_later () {
      super();
   }

   public RRCConnectionReestablishmentRequest_NB_criticalExtensions_later (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCCONNECTIONREESTABLISHMENTREQUEST_R14: return "rrcConnectionReestablishmentRequest_r14";
      case _CRITICALEXTENSIONSFUTURE: return "criticalExtensionsFuture";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcConnectionReestablishmentRequest_r14 (RRCConnectionReestablishmentRequest_NB_r14_IEs value) {
      setElement (_RRCCONNECTIONREESTABLISHMENTREQUEST_R14, value);
   }

   public void set_criticalExtensionsFuture (RRCConnectionReestablishmentRequest_NB_criticalExtensions_later_criticalExtensionsFuture value) {
      setElement (_CRITICALEXTENSIONSFUTURE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcConnectionReestablishmentRequest_r14
         case 0: { 
            RRCConnectionReestablishmentRequest_NB_r14_IEs rrcConnectionReestablishmentRequest_r14;
            element = rrcConnectionReestablishmentRequest_r14 = new RRCConnectionReestablishmentRequest_NB_r14_IEs();
            rrcConnectionReestablishmentRequest_r14.decode (buffer);
            break;
         }

         // criticalExtensionsFuture
         case 1: { 
            RRCConnectionReestablishmentRequest_NB_criticalExtensions_later_criticalExtensionsFuture criticalExtensionsFuture;
            element = criticalExtensionsFuture = new RRCConnectionReestablishmentRequest_NB_criticalExtensions_later_criticalExtensionsFuture();
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
