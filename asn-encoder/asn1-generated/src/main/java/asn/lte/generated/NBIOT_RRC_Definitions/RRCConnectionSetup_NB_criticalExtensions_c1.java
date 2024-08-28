/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NBIOT_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionSetup_NB_criticalExtensions_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NBIOT_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCCONNECTIONSETUP_R13 = 1;
   public final static byte _SPARE1 = 2;

   public RRCConnectionSetup_NB_criticalExtensions_c1 () {
      super();
   }

   public RRCConnectionSetup_NB_criticalExtensions_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCCONNECTIONSETUP_R13: return "rrcConnectionSetup_r13";
      case _SPARE1: return "spare1";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcConnectionSetup_r13 (RRCConnectionSetup_NB_r13_IEs value) {
      setElement (_RRCCONNECTIONSETUP_R13, value);
   }

   public void set_spare1 () {
      setElement (_SPARE1, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcConnectionSetup_r13
         case 0: { 
            RRCConnectionSetup_NB_r13_IEs rrcConnectionSetup_r13;
            element = rrcConnectionSetup_r13 = new RRCConnectionSetup_NB_r13_IEs();
            rrcConnectionSetup_r13.decode (buffer);
            break;
         }

         // spare1
         case 1: { 
            Asn1Null spare1;
            element = spare1 = Asn1Null.NULL_VALUE;
            spare1.decode (buffer);

            buffer.invokeCharacters(spare1.toString());
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
