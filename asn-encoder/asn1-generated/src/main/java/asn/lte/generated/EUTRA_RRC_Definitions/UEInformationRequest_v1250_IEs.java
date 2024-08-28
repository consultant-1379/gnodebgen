/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class UEInformationRequest_v1250_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UEInformationRequest-v1250-IEs";
   }

   public UEInformationRequest_v1250_IEs_mobilityHistoryReportReq_r12 mobilityHistoryReportReq_r12 = null;  // optional
   public UEInformationRequest_v1530_IEs nonCriticalExtension;  // optional

   public UEInformationRequest_v1250_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public UEInformationRequest_v1250_IEs (
      UEInformationRequest_v1250_IEs_mobilityHistoryReportReq_r12 mobilityHistoryReportReq_r12_,
      UEInformationRequest_v1530_IEs nonCriticalExtension_
   ) {
      super();
      mobilityHistoryReportReq_r12 = mobilityHistoryReportReq_r12_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      mobilityHistoryReportReq_r12 = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return mobilityHistoryReportReq_r12;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "mobilityHistoryReportReq-r12";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean mobilityHistoryReportReq_r12Present = buffer.decodeBit ("mobilityHistoryReportReq_r12Present");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode mobilityHistoryReportReq_r12

      if (mobilityHistoryReportReq_r12Present) {
         buffer.getContext().eventDispatcher.startElement("mobilityHistoryReportReq_r12", -1);

         int tval = UEInformationRequest_v1250_IEs_mobilityHistoryReportReq_r12.decodeEnumValue (buffer);
         mobilityHistoryReportReq_r12 = UEInformationRequest_v1250_IEs_mobilityHistoryReportReq_r12.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("mobilityHistoryReportReq_r12", -1);
      }
      else {
         mobilityHistoryReportReq_r12 = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new UEInformationRequest_v1530_IEs();
         nonCriticalExtension.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("nonCriticalExtension", -1);
      }
      else {
         nonCriticalExtension = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (mobilityHistoryReportReq_r12 != null) mobilityHistoryReportReq_r12.print (_sb, "mobilityHistoryReportReq_r12", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
