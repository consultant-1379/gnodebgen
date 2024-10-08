/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_CCCH_MessageType_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCCONNECTIONREESTABLISHMENTREQUEST = 1;
   public final static byte _RRCCONNECTIONREQUEST = 2;

   public UL_CCCH_MessageType_c1 () {
      super();
   }

   public UL_CCCH_MessageType_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCCONNECTIONREESTABLISHMENTREQUEST: return "rrcConnectionReestablishmentRequest";
      case _RRCCONNECTIONREQUEST: return "rrcConnectionRequest";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcConnectionReestablishmentRequest (RRCConnectionReestablishmentRequest value) {
      setElement (_RRCCONNECTIONREESTABLISHMENTREQUEST, value);
   }

   public void set_rrcConnectionRequest (RRCConnectionRequest value) {
      setElement (_RRCCONNECTIONREQUEST, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcConnectionReestablishmentRequest
         case 0: { 
            RRCConnectionReestablishmentRequest rrcConnectionReestablishmentRequest;
            element = rrcConnectionReestablishmentRequest = new RRCConnectionReestablishmentRequest();
            rrcConnectionReestablishmentRequest.decode (buffer);
            break;
         }

         // rrcConnectionRequest
         case 1: { 
            RRCConnectionRequest rrcConnectionRequest;
            element = rrcConnectionRequest = new RRCConnectionRequest();
            rrcConnectionRequest.decode (buffer);
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
