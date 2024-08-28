/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class EventTriggerConfigInterRAT_eventId extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _EVENTB1 = 1;
   public final static byte _EVENTB2 = 2;
   public final static byte _EVENTB1_UTRA_FDD_R16 = 3;
   public final static byte _EVENTB2_UTRA_FDD_R16 = 4;
   public final static byte _EXTELEM1 = 5;

   public EventTriggerConfigInterRAT_eventId () {
      super();
   }

   public EventTriggerConfigInterRAT_eventId (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _EVENTB1: return "eventB1";
      case _EVENTB2: return "eventB2";
      case _EVENTB1_UTRA_FDD_R16: return "eventB1_UTRA_FDD_r16";
      case _EVENTB2_UTRA_FDD_R16: return "eventB2_UTRA_FDD_r16";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_eventB1 (EventTriggerConfigInterRAT_eventId_eventB1 value) {
      setElement (_EVENTB1, value);
   }

   public void set_eventB2 (EventTriggerConfigInterRAT_eventId_eventB2 value) {
      setElement (_EVENTB2, value);
   }

   public void set_eventB1_UTRA_FDD_r16 (EventTriggerConfigInterRAT_eventId_eventB1_UTRA_FDD_r16 value) {
      setElement (_EVENTB1_UTRA_FDD_R16, value);
   }

   public void set_eventB2_UTRA_FDD_r16 (EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 value) {
      setElement (_EVENTB2_UTRA_FDD_R16, value);
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
            // eventB1
            case 0: { 
               EventTriggerConfigInterRAT_eventId_eventB1 eventB1;
               element = eventB1 = new EventTriggerConfigInterRAT_eventId_eventB1();
               eventB1.decode (buffer);
               break;
            }

            // eventB2
            case 1: { 
               EventTriggerConfigInterRAT_eventId_eventB2 eventB2;
               element = eventB2 = new EventTriggerConfigInterRAT_eventId_eventB2();
               eventB2.decode (buffer);
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
            // eventB1_UTRA_FDD_r16
            case 0: { 
               EventTriggerConfigInterRAT_eventId_eventB1_UTRA_FDD_r16 eventB1_UTRA_FDD_r16;
               element = eventB1_UTRA_FDD_r16 = new EventTriggerConfigInterRAT_eventId_eventB1_UTRA_FDD_r16();
               eventB1_UTRA_FDD_r16.decode (buffer);
               break;
            }

            // eventB2_UTRA_FDD_r16
            case 1: { 
               EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16 eventB2_UTRA_FDD_r16;
               element = eventB2_UTRA_FDD_r16 = new EventTriggerConfigInterRAT_eventId_eventB2_UTRA_FDD_r16();
               eventB2_UTRA_FDD_r16.decode (buffer);
               break;
            }

            // extElem1
            case 2: { 
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
