/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_IM_Resource_csi_IM_ResourceElementPattern extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _PATTERN0 = 1;
   public final static byte _PATTERN1 = 2;

   public CSI_IM_Resource_csi_IM_ResourceElementPattern () {
      super();
   }

   public CSI_IM_Resource_csi_IM_ResourceElementPattern (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PATTERN0: return "pattern0";
      case _PATTERN1: return "pattern1";
      default: return "UNDEFINED";
      }
   }

   public void set_pattern0 (CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern0 value) {
      setElement (_PATTERN0, value);
   }

   public void set_pattern1 (CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern1 value) {
      setElement (_PATTERN1, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // pattern0
         case 0: { 
            CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern0 pattern0;
            element = pattern0 = new CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern0();
            pattern0.decode (buffer);
            break;
         }

         // pattern1
         case 1: { 
            CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern1 pattern1;
            element = pattern1 = new CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern1();
            pattern1.decode (buffer);
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
         // pattern0
         case _PATTERN0:
            CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern0 pattern0 = (CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern0) element;
            pattern0.encode (buffer);
            break;

         // pattern1
         case _PATTERN1:
            CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern1 pattern1 = (CSI_IM_Resource_csi_IM_ResourceElementPattern_pattern1) element;
            pattern1.encode (buffer);
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
