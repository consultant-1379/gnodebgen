/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DLInformationTransfer_r8_IEs_dedicatedInfoType extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _DEDICATEDINFONAS = 1;
   public final static byte _DEDICATEDINFOCDMA2000_1XRTT = 2;
   public final static byte _DEDICATEDINFOCDMA2000_HRPD = 3;

   public DLInformationTransfer_r8_IEs_dedicatedInfoType () {
      super();
   }

   public DLInformationTransfer_r8_IEs_dedicatedInfoType (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _DEDICATEDINFONAS: return "dedicatedInfoNAS";
      case _DEDICATEDINFOCDMA2000_1XRTT: return "dedicatedInfoCDMA2000_1XRTT";
      case _DEDICATEDINFOCDMA2000_HRPD: return "dedicatedInfoCDMA2000_HRPD";
      default: return "UNDEFINED";
      }
   }

   public void set_dedicatedInfoNAS (DedicatedInfoNAS value) {
      setElement (_DEDICATEDINFONAS, value);
   }

   public void set_dedicatedInfoCDMA2000_1XRTT (DedicatedInfoCDMA2000 value) {
      setElement (_DEDICATEDINFOCDMA2000_1XRTT, value);
   }

   public void set_dedicatedInfoCDMA2000_HRPD (DedicatedInfoCDMA2000 value) {
      setElement (_DEDICATEDINFOCDMA2000_HRPD, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // dedicatedInfoNAS
         case 0: { 
            DedicatedInfoNAS dedicatedInfoNAS;
            element = dedicatedInfoNAS = new DedicatedInfoNAS();
            dedicatedInfoNAS.decode (buffer);
            break;
         }

         // dedicatedInfoCDMA2000_1XRTT
         case 1: { 
            DedicatedInfoCDMA2000 dedicatedInfoCDMA2000_1XRTT;
            element = dedicatedInfoCDMA2000_1XRTT = new DedicatedInfoCDMA2000();
            dedicatedInfoCDMA2000_1XRTT.decode (buffer);
            break;
         }

         // dedicatedInfoCDMA2000_HRPD
         case 2: { 
            DedicatedInfoCDMA2000 dedicatedInfoCDMA2000_HRPD;
            element = dedicatedInfoCDMA2000_HRPD = new DedicatedInfoCDMA2000();
            dedicatedInfoCDMA2000_HRPD.decode (buffer);
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
