/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_IEs;

import com.objsys.asn1j.runtime.*;

public class Cause extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Cause";
   }

   // Choice element identifier constants
   public final static byte _RADIONETWORK = 1;
   public final static byte _PROTOCOL = 2;
   public final static byte _MISC = 3;
   public final static byte _EXTELEM1 = 4;

   public Cause () {
      super();
   }

   public Cause (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RADIONETWORK: return "radioNetwork";
      case _PROTOCOL: return "protocol";
      case _MISC: return "misc";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_radioNetwork (CauseRadioNetwork value) {
      setElement (_RADIONETWORK, value);
   }

   public void set_protocol (CauseProtocol value) {
      setElement (_PROTOCOL, value);
   }

   public void set_misc (CauseMisc value) {
      setElement (_MISC, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (3, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // radioNetwork
            case 0: { 
               CauseRadioNetwork radioNetwork;
               int tval = CauseRadioNetwork.decodeEnumValue (buffer);
               element = radioNetwork = CauseRadioNetwork.valueOf (tval);
               break;
            }

            // protocol
            case 1: { 
               CauseProtocol protocol;
               int tval = CauseProtocol.decodeEnumValue (buffer);
               element = protocol = CauseProtocol.valueOf (tval);
               break;
            }

            // misc
            case 2: { 
               CauseMisc misc;
               int tval = CauseMisc.decodeEnumValue (buffer);
               element = misc = CauseMisc.valueOf (tval);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 4;
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
