/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class MDTMode extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MDTMode";
   }

   // Choice element identifier constants
   public final static byte _IMMEDIATEMDT = 1;
   public final static byte _LOGGEDMDT = 2;
   public final static byte _MDTMODE_EXTENSION = 3;
   public final static byte _EXTELEM1 = 4;

   public MDTMode () {
      super();
   }

   public MDTMode (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _IMMEDIATEMDT: return "immediateMDT";
      case _LOGGEDMDT: return "loggedMDT";
      case _MDTMODE_EXTENSION: return "mDTMode_Extension";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_immediateMDT (ImmediateMDT value) {
      setElement (_IMMEDIATEMDT, value);
   }

   public void set_loggedMDT (LoggedMDT value) {
      setElement (_LOGGEDMDT, value);
   }

   public void set_mDTMode_Extension (MDTMode_Extension value) {
      setElement (_MDTMODE_EXTENSION, value);
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
            // immediateMDT
            case 0: { 
               ImmediateMDT immediateMDT;
               element = immediateMDT = new ImmediateMDT();
               immediateMDT.decode (buffer);
               break;
            }

            // loggedMDT
            case 1: { 
               LoggedMDT loggedMDT;
               element = loggedMDT = new LoggedMDT();
               loggedMDT.decode (buffer);
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

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // mDTMode_Extension
            case 0: { 
               MDTMode_Extension mDTMode_Extension;
               element = mDTMode_Extension = new MDTMode_Extension();
               mDTMode_Extension.decode (buffer);
               break;
            }

            // extElem1
            case 1: { 
               Asn1OpenType extElem1;
               element = extElem1 = new Asn1OpenType();
               extElem1.decode (buffer);

               buffer.invokeCharacters(extElem1.toString());
               break;
            }

            default:
               setElement (_EXTELEM1, openType);
               buffer.invokeCharacters (openType.toString());
         }

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
