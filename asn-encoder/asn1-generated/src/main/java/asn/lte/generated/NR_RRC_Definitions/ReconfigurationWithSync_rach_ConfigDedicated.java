/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReconfigurationWithSync_rach_ConfigDedicated extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _UPLINK = 1;
   public final static byte _SUPPLEMENTARYUPLINK = 2;

   public ReconfigurationWithSync_rach_ConfigDedicated () {
      super();
   }

   public ReconfigurationWithSync_rach_ConfigDedicated (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _UPLINK: return "uplink";
      case _SUPPLEMENTARYUPLINK: return "supplementaryUplink";
      default: return "UNDEFINED";
      }
   }

   public void set_uplink (RACH_ConfigDedicated value) {
      setElement (_UPLINK, value);
   }

   public void set_supplementaryUplink (RACH_ConfigDedicated value) {
      setElement (_SUPPLEMENTARYUPLINK, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // uplink
         case 0: { 
            RACH_ConfigDedicated uplink;
            element = uplink = new RACH_ConfigDedicated();
            uplink.decode (buffer);
            break;
         }

         // supplementaryUplink
         case 1: { 
            RACH_ConfigDedicated supplementaryUplink;
            element = supplementaryUplink = new RACH_ConfigDedicated();
            supplementaryUplink.decode (buffer);
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
