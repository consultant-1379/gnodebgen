/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UL_DCCH_MessageType_messageClassExtension extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _C2 = 1;
   public final static byte _MESSAGECLASSEXTENSIONFUTURE_R16 = 2;

   public UL_DCCH_MessageType_messageClassExtension () {
      super();
   }

   public UL_DCCH_MessageType_messageClassExtension (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _C2: return "c2";
      case _MESSAGECLASSEXTENSIONFUTURE_R16: return "messageClassExtensionFuture_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_c2 (UL_DCCH_MessageType_messageClassExtension_c2 value) {
      setElement (_C2, value);
   }

   public void set_messageClassExtensionFuture_r16 (UL_DCCH_MessageType_messageClassExtension_messageClassExtensionFuture_r16 value) {
      setElement (_MESSAGECLASSEXTENSIONFUTURE_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // c2
         case 0: { 
            UL_DCCH_MessageType_messageClassExtension_c2 c2;
            element = c2 = new UL_DCCH_MessageType_messageClassExtension_c2();
            c2.decode (buffer);
            break;
         }

         // messageClassExtensionFuture_r16
         case 1: { 
            UL_DCCH_MessageType_messageClassExtension_messageClassExtensionFuture_r16 messageClassExtensionFuture_r16;
            element = messageClassExtensionFuture_r16 = new UL_DCCH_MessageType_messageClassExtension_messageClassExtensionFuture_r16();
            messageClassExtensionFuture_r16.decode (buffer);
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
         // c2
         case _C2:
            UL_DCCH_MessageType_messageClassExtension_c2 c2 = (UL_DCCH_MessageType_messageClassExtension_c2) element;
            c2.encode (buffer);
            break;

         // messageClassExtensionFuture_r16
         case _MESSAGECLASSEXTENSIONFUTURE_R16:
            UL_DCCH_MessageType_messageClassExtension_messageClassExtensionFuture_r16 messageClassExtensionFuture_r16 = (UL_DCCH_MessageType_messageClassExtension_messageClassExtensionFuture_r16) element;
            messageClassExtensionFuture_r16.encode (buffer);
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
