/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BCCH_DL_SCH_MessageType extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "BCCH-DL-SCH-MessageType";
   }

   // Choice element identifier constants
   public final static byte _C1 = 1;
   public final static byte _MESSAGECLASSEXTENSION = 2;

   public BCCH_DL_SCH_MessageType () {
      super();
   }

   public BCCH_DL_SCH_MessageType (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _C1: return "c1";
      case _MESSAGECLASSEXTENSION: return "messageClassExtension";
      default: return "UNDEFINED";
      }
   }

   public void set_c1 (BCCH_DL_SCH_MessageType_c1 value) {
      setElement (_C1, value);
   }

   public void set_messageClassExtension (BCCH_DL_SCH_MessageType_messageClassExtension value) {
      setElement (_MESSAGECLASSEXTENSION, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // c1
         case 0: { 
            BCCH_DL_SCH_MessageType_c1 c1;
            element = c1 = new BCCH_DL_SCH_MessageType_c1();
            c1.decode (buffer);
            break;
         }

         // messageClassExtension
         case 1: { 
            BCCH_DL_SCH_MessageType_messageClassExtension messageClassExtension;
            element = messageClassExtension = new BCCH_DL_SCH_MessageType_messageClassExtension();
            messageClassExtension.decode (buffer);
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
