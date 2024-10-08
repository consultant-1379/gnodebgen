/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class Global_RAN_NODE_ID extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Global-RAN-NODE-ID";
   }

   // Choice element identifier constants
   public final static byte _GNB = 1;
   public final static byte _NG_ENB = 2;
   public final static byte _EXTELEM1 = 3;

   public Global_RAN_NODE_ID () {
      super();
   }

   public Global_RAN_NODE_ID (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _GNB: return "gNB";
      case _NG_ENB: return "ng_eNB";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_gNB (GNB value) {
      setElement (_GNB, value);
   }

   public void set_ng_eNB (NG_eNB value) {
      setElement (_NG_ENB, value);
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
            // gNB
            case 0: { 
               GNB gNB;
               element = gNB = new GNB();
               gNB.decode (buffer);
               break;
            }

            // ng_eNB
            case 1: { 
               NG_eNB ng_eNB;
               element = ng_eNB = new NG_eNB();
               ng_eNB.decode (buffer);
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
