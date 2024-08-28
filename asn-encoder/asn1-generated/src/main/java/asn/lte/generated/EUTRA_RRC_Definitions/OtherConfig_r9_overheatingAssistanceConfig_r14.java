/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class OtherConfig_r9_overheatingAssistanceConfig_r14 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RELEASE = 1;
   public final static byte _SETUP = 2;

   public OtherConfig_r9_overheatingAssistanceConfig_r14 () {
      super();
   }

   public OtherConfig_r9_overheatingAssistanceConfig_r14 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RELEASE: return "release";
      case _SETUP: return "setup";
      default: return "UNDEFINED";
      }
   }

   public void set_release () {
      setElement (_RELEASE, Asn1Null.NULL_VALUE);
   }

   public void set_setup (OtherConfig_r9_overheatingAssistanceConfig_r14_setup value) {
      setElement (_SETUP, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // release
         case 0: { 
            Asn1Null release;
            element = release = Asn1Null.NULL_VALUE;
            release.decode (buffer);

            buffer.invokeCharacters(release.toString());
            break;
         }

         // setup
         case 1: { 
            OtherConfig_r9_overheatingAssistanceConfig_r14_setup setup;
            element = setup = new OtherConfig_r9_overheatingAssistanceConfig_r14_setup();
            setup.decode (buffer);
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
