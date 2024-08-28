/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.EUTRA_RRC_Definitions.SecurityModeComplete;
import asn.lte.generated.EUTRA_RRC_Definitions.SecurityModeFailure;

public class UL_DCCH_MessageType_NB_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCCONNECTIONRECONFIGURATIONCOMPLETE_R13 = 1;
   public final static byte _RRCCONNECTIONREESTABLISHMENTCOMPLETE_R13 = 2;
   public final static byte _RRCCONNECTIONSETUPCOMPLETE_R13 = 3;
   public final static byte _SECURITYMODECOMPLETE_R13 = 4;
   public final static byte _SECURITYMODEFAILURE_R13 = 5;
   public final static byte _UECAPABILITYINFORMATION_R13 = 6;
   public final static byte _ULINFORMATIONTRANSFER_R13 = 7;
   public final static byte _RRCCONNECTIONRESUMECOMPLETE_R13 = 8;
   public final static byte _SPARE8 = 9;
   public final static byte _SPARE7 = 10;
   public final static byte _SPARE6 = 11;
   public final static byte _SPARE5 = 12;
   public final static byte _SPARE4 = 13;
   public final static byte _SPARE3 = 14;
   public final static byte _SPARE2 = 15;
   public final static byte _SPARE1 = 16;

   public UL_DCCH_MessageType_NB_c1 () {
      super();
   }

   public UL_DCCH_MessageType_NB_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCCONNECTIONRECONFIGURATIONCOMPLETE_R13: return "rrcConnectionReconfigurationComplete_r13";
      case _RRCCONNECTIONREESTABLISHMENTCOMPLETE_R13: return "rrcConnectionReestablishmentComplete_r13";
      case _RRCCONNECTIONSETUPCOMPLETE_R13: return "rrcConnectionSetupComplete_r13";
      case _SECURITYMODECOMPLETE_R13: return "securityModeComplete_r13";
      case _SECURITYMODEFAILURE_R13: return "securityModeFailure_r13";
      case _UECAPABILITYINFORMATION_R13: return "ueCapabilityInformation_r13";
      case _ULINFORMATIONTRANSFER_R13: return "ulInformationTransfer_r13";
      case _RRCCONNECTIONRESUMECOMPLETE_R13: return "rrcConnectionResumeComplete_r13";
      case _SPARE8: return "spare8";
      case _SPARE7: return "spare7";
      case _SPARE6: return "spare6";
      case _SPARE5: return "spare5";
      case _SPARE4: return "spare4";
      case _SPARE3: return "spare3";
      case _SPARE2: return "spare2";
      case _SPARE1: return "spare1";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcConnectionReconfigurationComplete_r13 (RRCConnectionReconfigurationComplete_NB value) {
      setElement (_RRCCONNECTIONRECONFIGURATIONCOMPLETE_R13, value);
   }

   public void set_rrcConnectionReestablishmentComplete_r13 (RRCConnectionReestablishmentComplete_NB value) {
      setElement (_RRCCONNECTIONREESTABLISHMENTCOMPLETE_R13, value);
   }

   public void set_rrcConnectionSetupComplete_r13 (RRCConnectionSetupComplete_NB value) {
      setElement (_RRCCONNECTIONSETUPCOMPLETE_R13, value);
   }

   public void set_securityModeComplete_r13 (SecurityModeComplete value) {
      setElement (_SECURITYMODECOMPLETE_R13, value);
   }

   public void set_securityModeFailure_r13 (SecurityModeFailure value) {
      setElement (_SECURITYMODEFAILURE_R13, value);
   }

   public void set_ueCapabilityInformation_r13 (UECapabilityInformation_NB value) {
      setElement (_UECAPABILITYINFORMATION_R13, value);
   }

   public void set_ulInformationTransfer_r13 (ULInformationTransfer_NB value) {
      setElement (_ULINFORMATIONTRANSFER_R13, value);
   }

   public void set_rrcConnectionResumeComplete_r13 (RRCConnectionResumeComplete_NB value) {
      setElement (_RRCCONNECTIONRESUMECOMPLETE_R13, value);
   }

   public void set_spare8 () {
      setElement (_SPARE8, Asn1Null.NULL_VALUE);
   }

   public void set_spare7 () {
      setElement (_SPARE7, Asn1Null.NULL_VALUE);
   }

   public void set_spare6 () {
      setElement (_SPARE6, Asn1Null.NULL_VALUE);
   }

   public void set_spare5 () {
      setElement (_SPARE5, Asn1Null.NULL_VALUE);
   }

   public void set_spare4 () {
      setElement (_SPARE4, Asn1Null.NULL_VALUE);
   }

   public void set_spare3 () {
      setElement (_SPARE3, Asn1Null.NULL_VALUE);
   }

   public void set_spare2 () {
      setElement (_SPARE2, Asn1Null.NULL_VALUE);
   }

   public void set_spare1 () {
      setElement (_SPARE1, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (16, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcConnectionReconfigurationComplete_r13
         case 0: { 
            RRCConnectionReconfigurationComplete_NB rrcConnectionReconfigurationComplete_r13;
            element = rrcConnectionReconfigurationComplete_r13 = new RRCConnectionReconfigurationComplete_NB();
            rrcConnectionReconfigurationComplete_r13.decode (buffer);
            break;
         }

         // rrcConnectionReestablishmentComplete_r13
         case 1: { 
            RRCConnectionReestablishmentComplete_NB rrcConnectionReestablishmentComplete_r13;
            element = rrcConnectionReestablishmentComplete_r13 = new RRCConnectionReestablishmentComplete_NB();
            rrcConnectionReestablishmentComplete_r13.decode (buffer);
            break;
         }

         // rrcConnectionSetupComplete_r13
         case 2: { 
            RRCConnectionSetupComplete_NB rrcConnectionSetupComplete_r13;
            element = rrcConnectionSetupComplete_r13 = new RRCConnectionSetupComplete_NB();
            rrcConnectionSetupComplete_r13.decode (buffer);
            break;
         }

         // securityModeComplete_r13
         case 3: { 
            SecurityModeComplete securityModeComplete_r13;
            element = securityModeComplete_r13 = new SecurityModeComplete();
            securityModeComplete_r13.decode (buffer);
            break;
         }

         // securityModeFailure_r13
         case 4: { 
            SecurityModeFailure securityModeFailure_r13;
            element = securityModeFailure_r13 = new SecurityModeFailure();
            securityModeFailure_r13.decode (buffer);
            break;
         }

         // ueCapabilityInformation_r13
         case 5: { 
            UECapabilityInformation_NB ueCapabilityInformation_r13;
            element = ueCapabilityInformation_r13 = new UECapabilityInformation_NB();
            ueCapabilityInformation_r13.decode (buffer);
            break;
         }

         // ulInformationTransfer_r13
         case 6: { 
            ULInformationTransfer_NB ulInformationTransfer_r13;
            element = ulInformationTransfer_r13 = new ULInformationTransfer_NB();
            ulInformationTransfer_r13.decode (buffer);
            break;
         }

         // rrcConnectionResumeComplete_r13
         case 7: { 
            RRCConnectionResumeComplete_NB rrcConnectionResumeComplete_r13;
            element = rrcConnectionResumeComplete_r13 = new RRCConnectionResumeComplete_NB();
            rrcConnectionResumeComplete_r13.decode (buffer);
            break;
         }

         // spare8
         case 8: { 
            Asn1Null spare8;
            element = spare8 = Asn1Null.NULL_VALUE;
            spare8.decode (buffer);

            buffer.invokeCharacters(spare8.toString());
            break;
         }

         // spare7
         case 9: { 
            Asn1Null spare7;
            element = spare7 = Asn1Null.NULL_VALUE;
            spare7.decode (buffer);

            buffer.invokeCharacters(spare7.toString());
            break;
         }

         // spare6
         case 10: { 
            Asn1Null spare6;
            element = spare6 = Asn1Null.NULL_VALUE;
            spare6.decode (buffer);

            buffer.invokeCharacters(spare6.toString());
            break;
         }

         // spare5
         case 11: { 
            Asn1Null spare5;
            element = spare5 = Asn1Null.NULL_VALUE;
            spare5.decode (buffer);

            buffer.invokeCharacters(spare5.toString());
            break;
         }

         // spare4
         case 12: { 
            Asn1Null spare4;
            element = spare4 = Asn1Null.NULL_VALUE;
            spare4.decode (buffer);

            buffer.invokeCharacters(spare4.toString());
            break;
         }

         // spare3
         case 13: { 
            Asn1Null spare3;
            element = spare3 = Asn1Null.NULL_VALUE;
            spare3.decode (buffer);

            buffer.invokeCharacters(spare3.toString());
            break;
         }

         // spare2
         case 14: { 
            Asn1Null spare2;
            element = spare2 = Asn1Null.NULL_VALUE;
            spare2.decode (buffer);

            buffer.invokeCharacters(spare2.toString());
            break;
         }

         // spare1
         case 15: { 
            Asn1Null spare1;
            element = spare1 = Asn1Null.NULL_VALUE;
            spare1.decode (buffer);

            buffer.invokeCharacters(spare1.toString());
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
