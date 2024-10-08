/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_ENSA_IEs;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_IEs.Cause;

public class ENSA_Cause extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_ENSA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENSA-Cause";
   }

   // Choice element identifier constants
   public final static byte _EAB_NSA = 1;
   public final static byte _STANDARD = 2;
   public final static byte _EXTELEM1 = 3;

   public ENSA_Cause () {
      super();
   }

   public ENSA_Cause (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _EAB_NSA: return "eab_NSA";
      case _STANDARD: return "standard";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_eab_NSA (CauseENSA value) {
      setElement (_EAB_NSA, value);
   }

   public void set_standard (Cause value) {
      setElement (_STANDARD, value);
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
            // eab_NSA
            case 0: { 
               CauseENSA eab_NSA;
               int tval = CauseENSA.decodeEnumValue (buffer);
               element = eab_NSA = CauseENSA.valueOf (tval);
               break;
            }

            // standard
            case 1: { 
               Cause standard;
               element = standard = new Cause();
               standard.decode (buffer);
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
