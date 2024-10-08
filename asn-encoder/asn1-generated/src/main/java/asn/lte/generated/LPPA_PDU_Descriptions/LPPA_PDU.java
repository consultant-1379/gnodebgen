/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;

public class LPPA_PDU extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_PDU_DescriptionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "LPPA-PDU";
   }

   // Choice element identifier constants
   public final static byte _INITIATINGMESSAGE = 1;
   public final static byte _SUCCESSFULOUTCOME = 2;
   public final static byte _UNSUCCESSFULOUTCOME = 3;
   public final static byte _EXTELEM1 = 4;

   public LPPA_PDU () {
      super();
   }

   public LPPA_PDU (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _INITIATINGMESSAGE: return "initiatingMessage";
      case _SUCCESSFULOUTCOME: return "successfulOutcome";
      case _UNSUCCESSFULOUTCOME: return "unsuccessfulOutcome";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_initiatingMessage (InitiatingMessage value) {
      setElement (_INITIATINGMESSAGE, value);
   }

   public void set_successfulOutcome (SuccessfulOutcome value) {
      setElement (_SUCCESSFULOUTCOME, value);
   }

   public void set_unsuccessfulOutcome (UnsuccessfulOutcome value) {
      setElement (_UNSUCCESSFULOUTCOME, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (3, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // initiatingMessage
            case 0: { 
               InitiatingMessage initiatingMessage;
               element = initiatingMessage = new InitiatingMessage();
               initiatingMessage.decode (buffer);
               break;
            }

            // successfulOutcome
            case 1: { 
               SuccessfulOutcome successfulOutcome;
               element = successfulOutcome = new SuccessfulOutcome();
               successfulOutcome.decode (buffer);
               break;
            }

            // unsuccessfulOutcome
            case 2: { 
               UnsuccessfulOutcome unsuccessfulOutcome;
               element = unsuccessfulOutcome = new UnsuccessfulOutcome();
               unsuccessfulOutcome.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 4;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
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
