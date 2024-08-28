/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCGFailureInformationEUTRA_criticalExtensions extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SCGFAILUREINFORMATIONEUTRA = 1;
   public final static byte _CRITICALEXTENSIONSFUTURE = 2;

   public SCGFailureInformationEUTRA_criticalExtensions () {
      super();
   }

   public SCGFailureInformationEUTRA_criticalExtensions (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SCGFAILUREINFORMATIONEUTRA: return "scgFailureInformationEUTRA";
      case _CRITICALEXTENSIONSFUTURE: return "criticalExtensionsFuture";
      default: return "UNDEFINED";
      }
   }

   public void set_scgFailureInformationEUTRA (SCGFailureInformationEUTRA_IEs value) {
      setElement (_SCGFAILUREINFORMATIONEUTRA, value);
   }

   public void set_criticalExtensionsFuture (SCGFailureInformationEUTRA_criticalExtensions_criticalExtensionsFuture value) {
      setElement (_CRITICALEXTENSIONSFUTURE, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // scgFailureInformationEUTRA
         case 0: { 
            SCGFailureInformationEUTRA_IEs scgFailureInformationEUTRA;
            element = scgFailureInformationEUTRA = new SCGFailureInformationEUTRA_IEs();
            scgFailureInformationEUTRA.decode (buffer);
            break;
         }

         // criticalExtensionsFuture
         case 1: { 
            SCGFailureInformationEUTRA_criticalExtensions_criticalExtensionsFuture criticalExtensionsFuture;
            element = criticalExtensionsFuture = new SCGFailureInformationEUTRA_criticalExtensions_criticalExtensionsFuture();
            criticalExtensionsFuture.decode (buffer);
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
