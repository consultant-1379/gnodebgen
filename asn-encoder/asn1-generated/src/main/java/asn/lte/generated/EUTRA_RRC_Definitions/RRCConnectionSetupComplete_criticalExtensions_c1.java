/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionSetupComplete_criticalExtensions_c1 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _RRCCONNECTIONSETUPCOMPLETE_R8 = 1;
   public final static byte _SPARE3 = 2;
   public final static byte _SPARE2 = 3;
   public final static byte _SPARE1 = 4;

   public RRCConnectionSetupComplete_criticalExtensions_c1 () {
      super();
   }

   public RRCConnectionSetupComplete_criticalExtensions_c1 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RRCCONNECTIONSETUPCOMPLETE_R8: return "rrcConnectionSetupComplete_r8";
      case _SPARE3: return "spare3";
      case _SPARE2: return "spare2";
      case _SPARE1: return "spare1";
      default: return "UNDEFINED";
      }
   }

   public void set_rrcConnectionSetupComplete_r8 (RRCConnectionSetupComplete_r8_IEs value) {
      setElement (_RRCCONNECTIONSETUPCOMPLETE_R8, value);
   }

   public void set_spare3 () {
      setElement (_SPARE3, Asn1Null.NULL_VALUE);
   }

   public void set_spare2 () {
      setElement (_SPARE2, Asn1Null.NULL_VALUE);
   }

   public void set_spare1 () {
      setElement (_SPARE1, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rrcConnectionSetupComplete_r8
         case 0: { 
            RRCConnectionSetupComplete_r8_IEs rrcConnectionSetupComplete_r8;
            element = rrcConnectionSetupComplete_r8 = new RRCConnectionSetupComplete_r8_IEs();
            rrcConnectionSetupComplete_r8.decode (buffer);
            break;
         }

         // spare3
         case 1: { 
            Asn1Null spare3;
            element = spare3 = Asn1Null.NULL_VALUE;
            spare3.decode (buffer);

            buffer.invokeCharacters(spare3.toString());
            break;
         }

         // spare2
         case 2: { 
            Asn1Null spare2;
            element = spare2 = Asn1Null.NULL_VALUE;
            spare2.decode (buffer);

            buffer.invokeCharacters(spare2.toString());
            break;
         }

         // spare1
         case 3: { 
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
