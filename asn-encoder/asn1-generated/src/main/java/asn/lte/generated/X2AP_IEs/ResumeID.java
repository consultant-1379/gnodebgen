/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ResumeID extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ResumeID";
   }

   // Choice element identifier constants
   public final static byte _NON_TRUNCATED = 1;
   public final static byte _TRUNCATED = 2;
   public final static byte _EXTELEM1 = 3;

   public ResumeID () {
      super();
   }

   public ResumeID (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _NON_TRUNCATED: return "non_truncated";
      case _TRUNCATED: return "truncated";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_non_truncated (Asn1BitString value) {
      setElement (_NON_TRUNCATED, value);
   }

   public void set_truncated (Asn1BitString value) {
      setElement (_TRUNCATED, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (2, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // non_truncated
            case 0: { 
               Asn1BitString non_truncated;
               element = non_truncated = new Asn1BitString();
               non_truncated.decode (buffer, 40, 40);

               buffer.invokeCharacters(non_truncated.toString());
               break;
            }

            // truncated
            case 1: { 
               Asn1BitString truncated;
               element = truncated = new Asn1BitString();
               truncated.decode (buffer, 24, 24);

               buffer.invokeCharacters(truncated.toString());
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 3;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
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
