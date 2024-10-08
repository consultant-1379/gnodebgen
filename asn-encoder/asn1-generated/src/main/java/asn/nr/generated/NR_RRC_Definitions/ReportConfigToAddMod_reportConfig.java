/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigToAddMod_reportConfig extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _REPORTCONFIGNR = 1;
   public final static byte _REPORTCONFIGINTERRAT = 2;
   public final static byte _REPORTCONFIGNR_SL_R16 = 3;
   public final static byte _EXTELEM1 = 4;

   public ReportConfigToAddMod_reportConfig () {
      super();
   }

   public ReportConfigToAddMod_reportConfig (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _REPORTCONFIGNR: return "reportConfigNR";
      case _REPORTCONFIGINTERRAT: return "reportConfigInterRAT";
      case _REPORTCONFIGNR_SL_R16: return "reportConfigNR_SL_r16";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_reportConfigNR (ReportConfigNR value) {
      setElement (_REPORTCONFIGNR, value);
   }

   public void set_reportConfigInterRAT (ReportConfigInterRAT value) {
      setElement (_REPORTCONFIGINTERRAT, value);
   }

   public void set_reportConfigNR_SL_r16 (ReportConfigNR_SL_r16 value) {
      setElement (_REPORTCONFIGNR_SL_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (1, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // reportConfigNR
            case 0: { 
               ReportConfigNR reportConfigNR;
               element = reportConfigNR = new ReportConfigNR();
               reportConfigNR.decode (buffer);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 2;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // reportConfigInterRAT
            case 0: { 
               ReportConfigInterRAT reportConfigInterRAT;
               element = reportConfigInterRAT = new ReportConfigInterRAT();
               reportConfigInterRAT.decode (buffer);
               break;
            }

            // reportConfigNR_SL_r16
            case 1: { 
               ReportConfigNR_SL_r16 reportConfigNR_SL_r16;
               element = reportConfigNR_SL_r16 = new ReportConfigNR_SL_r16();
               reportConfigNR_SL_r16.decode (buffer);
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (choiceID > 1);
      buffer.encodeBit (extbit, "extbit");

      if (!extbit) {

         // Encode choice index value

         buffer.encodeConsWholeNumber (choiceID - 1, 1, "index");

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         switch (choiceID) {
            // reportConfigNR
            case _REPORTCONFIGNR:
               ReportConfigNR reportConfigNR = (ReportConfigNR) element;
               reportConfigNR.encode (buffer);
               break;

            default:
            throw new Asn1InvalidChoiceOptionException();
         }
      }
      else {
         // Encode extension choice index value

         buffer.encodeSmallNonNegWholeNumber (choiceID - 2);

         // Encode extension element data value

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         Asn1PerEncodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());
         Asn1OpenType openType;

         switch (choiceID) {
            // reportConfigInterRAT
            case _REPORTCONFIGINTERRAT:
               ReportConfigInterRAT reportConfigInterRAT = (ReportConfigInterRAT) element;
               reportConfigInterRAT.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            // reportConfigNR_SL_r16
            case _REPORTCONFIGNR_SL_R16:
               ReportConfigNR_SL_r16 reportConfigNR_SL_r16 = (ReportConfigNR_SL_r16) element;
               reportConfigNR_SL_r16.encode (buffer);
               openType = new Asn1OpenType 
                  (buffer.getBuffer(), 0, buffer.getMsgByteCnt());
               break;

            default:
               openType = (Asn1OpenType)getElement();
         }

         buffer = savedBuffer;
         if (openType != null) {
            buffer.byteAlign();
            openType.encode (buffer);
         }
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
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
