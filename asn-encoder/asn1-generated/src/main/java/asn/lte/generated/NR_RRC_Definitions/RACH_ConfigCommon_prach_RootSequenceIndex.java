/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_prach_RootSequenceIndex extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _L839 = 1;
   public final static byte _L139 = 2;

   public RACH_ConfigCommon_prach_RootSequenceIndex () {
      super();
   }

   public RACH_ConfigCommon_prach_RootSequenceIndex (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _L839: return "l839";
      case _L139: return "l139";
      default: return "UNDEFINED";
      }
   }

   public void set_l839 (Asn1Integer value) {
      setElement (_L839, value);
   }

   public void set_l139 (Asn1Integer value) {
      setElement (_L139, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // l839
         case 0: { 
            Asn1Integer l839;
            element = l839 = new Asn1Integer();
            l839.decode (buffer, 0, 837);

            buffer.invokeCharacters(l839.toString());
            break;
         }

         // l139
         case 1: { 
            Asn1Integer l139;
            element = l139 = new Asn1Integer();
            l139.decode (buffer, 0, 137);

            buffer.invokeCharacters(l139.toString());
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
