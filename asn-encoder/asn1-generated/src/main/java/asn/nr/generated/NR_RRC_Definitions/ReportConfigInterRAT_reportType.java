/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReportConfigInterRAT_reportType extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _PERIODICAL = 1;
   public final static byte _EVENTTRIGGERED = 2;
   public final static byte _REPORTCGI = 3;
   public final static byte _REPORTSFTD = 4;
   public final static byte _EXTELEM1 = 5;

   public ReportConfigInterRAT_reportType () {
      super();
   }

   public ReportConfigInterRAT_reportType (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _PERIODICAL: return "periodical";
      case _EVENTTRIGGERED: return "eventTriggered";
      case _REPORTCGI: return "reportCGI";
      case _REPORTSFTD: return "reportSFTD";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_periodical (PeriodicalReportConfigInterRAT value) {
      setElement (_PERIODICAL, value);
   }

   public void set_eventTriggered (EventTriggerConfigInterRAT value) {
      setElement (_EVENTTRIGGERED, value);
   }

   public void set_reportCGI (ReportCGI_EUTRA value) {
      setElement (_REPORTCGI, value);
   }

   public void set_reportSFTD (ReportSFTD_EUTRA value) {
      setElement (_REPORTSFTD, value);
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
            // periodical
            case 0: { 
               PeriodicalReportConfigInterRAT periodical;
               element = periodical = new PeriodicalReportConfigInterRAT();
               periodical.decode (buffer);
               break;
            }

            // eventTriggered
            case 1: { 
               EventTriggerConfigInterRAT eventTriggered;
               element = eventTriggered = new EventTriggerConfigInterRAT();
               eventTriggered.decode (buffer);
               break;
            }

            // reportCGI
            case 2: { 
               ReportCGI_EUTRA reportCGI;
               element = reportCGI = new ReportCGI_EUTRA();
               reportCGI.decode (buffer);
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

         savedBuffer = buffer;
         buffer = new Asn1PerDecodeBuffer (openType.value, savedBuffer.isAligned());
         buffer.setEventHandlerList (savedBuffer);

         switch (idx) {
            // reportSFTD
            case 0: { 
               ReportSFTD_EUTRA reportSFTD;
               element = reportSFTD = new ReportSFTD_EUTRA();
               reportSFTD.decode (buffer);
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

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      boolean extbit = (choiceID > 3);
      buffer.encodeBit (extbit, "extbit");

      if (!extbit) {

         // Encode choice index value

         buffer.encodeConsWholeNumber (choiceID - 1, 3, "index");

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         switch (choiceID) {
            // periodical
            case _PERIODICAL:
               PeriodicalReportConfigInterRAT periodical = (PeriodicalReportConfigInterRAT) element;
               periodical.encode (buffer);
               break;

            // eventTriggered
            case _EVENTTRIGGERED:
               EventTriggerConfigInterRAT eventTriggered = (EventTriggerConfigInterRAT) element;
               eventTriggered.encode (buffer);
               break;

            // reportCGI
            case _REPORTCGI:
               ReportCGI_EUTRA reportCGI = (ReportCGI_EUTRA) element;
               reportCGI.encode (buffer);
               break;

            default:
            throw new Asn1InvalidChoiceOptionException();
         }
      }
      else {
         // Encode extension choice index value

         buffer.encodeSmallNonNegWholeNumber (choiceID - 4);

         // Encode extension element data value

         buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

         Asn1PerEncodeBuffer savedBuffer = buffer;
         buffer = new Asn1PerEncodeBuffer (buffer.isAligned());
         Asn1OpenType openType;

         switch (choiceID) {
            // reportSFTD
            case _REPORTSFTD:
               ReportSFTD_EUTRA reportSFTD = (ReportSFTD_EUTRA) element;
               reportSFTD.encode (buffer);
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
