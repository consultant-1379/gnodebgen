/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RN_SubframeConfig_r10_subframeConfigPattern_r10 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SUBFRAMECONFIGPATTERNFDD_R10 = 1;
   public final static byte _SUBFRAMECONFIGPATTERNTDD_R10 = 2;

   public RN_SubframeConfig_r10_subframeConfigPattern_r10 () {
      super();
   }

   public RN_SubframeConfig_r10_subframeConfigPattern_r10 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SUBFRAMECONFIGPATTERNFDD_R10: return "subframeConfigPatternFDD_r10";
      case _SUBFRAMECONFIGPATTERNTDD_R10: return "subframeConfigPatternTDD_r10";
      default: return "UNDEFINED";
      }
   }

   public void set_subframeConfigPatternFDD_r10 (Asn1BitString value) {
      setElement (_SUBFRAMECONFIGPATTERNFDD_R10, value);
   }

   public void set_subframeConfigPatternTDD_r10 (Asn1Integer value) {
      setElement (_SUBFRAMECONFIGPATTERNTDD_R10, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // subframeConfigPatternFDD_r10
         case 0: { 
            Asn1BitString subframeConfigPatternFDD_r10;
            element = subframeConfigPatternFDD_r10 = new Asn1BitString();
            subframeConfigPatternFDD_r10.decode (buffer, 8, 8);

            buffer.invokeCharacters(subframeConfigPatternFDD_r10.toString());
            break;
         }

         // subframeConfigPatternTDD_r10
         case 1: { 
            Asn1Integer subframeConfigPatternTDD_r10;
            element = subframeConfigPatternTDD_r10 = new Asn1Integer();
            subframeConfigPatternTDD_r10.decode (buffer, 0, 31);

            buffer.invokeCharacters(subframeConfigPatternTDD_r10.toString());
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
