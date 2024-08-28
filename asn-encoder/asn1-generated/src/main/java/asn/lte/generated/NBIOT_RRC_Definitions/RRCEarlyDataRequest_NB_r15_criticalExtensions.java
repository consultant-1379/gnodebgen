/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCEarlyDataRequest_NB_r15_criticalExtensions extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCEARLYDATAREQUEST_R15 = 1;
   public final static byte _CRITICALEXTENSIONSFUTURE = 2;

   public RRCEarlyDataRequest_NB_r15_criticalExtensions () {
      super();
   }

   public RRCEarlyDataRequest_NB_r15_criticalExtensions (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCEARLYDATAREQUEST_R15: return "rrcEarlyDataRequest_r15";
      case _CRITICALEXTENSIONSFUTURE: return "criticalExtensionsFuture";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcEarlyDataRequest_r15 (RRCEarlyDataRequest_NB_r15_IEs value) {
      setElement (_RRCEARLYDATAREQUEST_R15, value);
   }

   public void set_criticalExtensionsFuture (RRCEarlyDataRequest_NB_r15_criticalExtensions_criticalExtensionsFuture value) {
      setElement (_CRITICALEXTENSIONSFUTURE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcEarlyDataRequest_r15
         case 0: { 
            RRCEarlyDataRequest_NB_r15_IEs rrcEarlyDataRequest_r15;
            element = rrcEarlyDataRequest_r15 = new RRCEarlyDataRequest_NB_r15_IEs();
            rrcEarlyDataRequest_r15.decode (buffer);
            break;
         }

         // criticalExtensionsFuture
         case 1: { 
            RRCEarlyDataRequest_NB_r15_criticalExtensions_criticalExtensionsFuture criticalExtensionsFuture;
            element = criticalExtensionsFuture = new RRCEarlyDataRequest_NB_r15_criticalExtensions_criticalExtensionsFuture();
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
