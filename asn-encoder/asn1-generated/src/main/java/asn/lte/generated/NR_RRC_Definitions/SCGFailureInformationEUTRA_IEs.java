/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SCGFailureInformationEUTRA_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SCGFailureInformationEUTRA-IEs";
   }

   public FailureReportSCG_EUTRA failureReportSCG_EUTRA;  // optional
   public SCGFailureInformationEUTRA_v1590_IEs nonCriticalExtension;  // optional

   public SCGFailureInformationEUTRA_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public SCGFailureInformationEUTRA_IEs (
      FailureReportSCG_EUTRA failureReportSCG_EUTRA_,
      SCGFailureInformationEUTRA_v1590_IEs nonCriticalExtension_
   ) {
      super();
      failureReportSCG_EUTRA = failureReportSCG_EUTRA_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      failureReportSCG_EUTRA = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return failureReportSCG_EUTRA;
         case 1: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "failureReportSCG-EUTRA";
         case 1: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean failureReportSCG_EUTRAPresent = buffer.decodeBit ("failureReportSCG_EUTRAPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode failureReportSCG_EUTRA

      if (failureReportSCG_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("failureReportSCG_EUTRA", -1);

         failureReportSCG_EUTRA = new FailureReportSCG_EUTRA();
         failureReportSCG_EUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("failureReportSCG_EUTRA", -1);
      }
      else {
         failureReportSCG_EUTRA = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new SCGFailureInformationEUTRA_v1590_IEs();
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
      if (failureReportSCG_EUTRA != null) failureReportSCG_EUTRA.print (_sb, "failureReportSCG_EUTRA", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
