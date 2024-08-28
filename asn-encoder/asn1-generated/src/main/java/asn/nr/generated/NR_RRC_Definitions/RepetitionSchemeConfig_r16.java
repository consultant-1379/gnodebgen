/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RepetitionSchemeConfig_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "RepetitionSchemeConfig-r16";
   }

   // Choice element identifier constants
   public final static byte _FDM_TDM_R16 = 1;
   public final static byte _SLOTBASED_R16 = 2;

   public RepetitionSchemeConfig_r16 () {
      super();
   }

   public RepetitionSchemeConfig_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _FDM_TDM_R16: return "fdm_TDM_r16";
      case _SLOTBASED_R16: return "slotBased_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_fdm_TDM_r16 (RepetitionSchemeConfig_r16_fdm_TDM_r16 value) {
      setElement (_FDM_TDM_R16, value);
   }

   public void set_slotBased_r16 (RepetitionSchemeConfig_r16_slotBased_r16 value) {
      setElement (_SLOTBASED_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // fdm_TDM_r16
         case 0: { 
            RepetitionSchemeConfig_r16_fdm_TDM_r16 fdm_TDM_r16;
            element = fdm_TDM_r16 = new RepetitionSchemeConfig_r16_fdm_TDM_r16();
            fdm_TDM_r16.decode (buffer);
            break;
         }

         // slotBased_r16
         case 1: { 
            RepetitionSchemeConfig_r16_slotBased_r16 slotBased_r16;
            element = slotBased_r16 = new RepetitionSchemeConfig_r16_slotBased_r16();
            slotBased_r16.decode (buffer);
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
         // fdm_TDM_r16
         case _FDM_TDM_R16:
            RepetitionSchemeConfig_r16_fdm_TDM_r16 fdm_TDM_r16 = (RepetitionSchemeConfig_r16_fdm_TDM_r16) element;
            fdm_TDM_r16.encode (buffer);
            break;

         // slotBased_r16
         case _SLOTBASED_R16:
            RepetitionSchemeConfig_r16_slotBased_r16 slotBased_r16 = (RepetitionSchemeConfig_r16_slotBased_r16) element;
            slotBased_r16.encode (buffer);
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
