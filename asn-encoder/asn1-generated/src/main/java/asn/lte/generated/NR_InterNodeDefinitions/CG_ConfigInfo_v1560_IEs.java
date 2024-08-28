/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.DRX_Config;
import asn.lte.generated.NR_RRC_Definitions.MeasResultCellListSFTD_EUTRA;

public class CG_ConfigInfo_v1560_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-ConfigInfo-v1560-IEs";
   }

   public Asn1OctetString candidateCellInfoListMN_EUTRA;  // optional
   public Asn1OctetString candidateCellInfoListSN_EUTRA;  // optional
   public Asn1OctetString sourceConfigSCG_EUTRA;  // optional
   public CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA scgFailureInfoEUTRA;  // optional
   public DRX_Config drx_ConfigMCG;  // optional
   public CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA measResultReportCGI_EUTRA;  // optional
   public MeasResultCellListSFTD_EUTRA measResultCellListSFTD_EUTRA;  // optional
   public FR_InfoList fr_InfoListMCG;  // optional
   public CG_ConfigInfo_v1570_IEs nonCriticalExtension;  // optional

   public CG_ConfigInfo_v1560_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_ConfigInfo_v1560_IEs (
      Asn1OctetString candidateCellInfoListMN_EUTRA_,
      Asn1OctetString candidateCellInfoListSN_EUTRA_,
      Asn1OctetString sourceConfigSCG_EUTRA_,
      CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA scgFailureInfoEUTRA_,
      DRX_Config drx_ConfigMCG_,
      CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA measResultReportCGI_EUTRA_,
      MeasResultCellListSFTD_EUTRA measResultCellListSFTD_EUTRA_,
      FR_InfoList fr_InfoListMCG_,
      CG_ConfigInfo_v1570_IEs nonCriticalExtension_
   ) {
      super();
      candidateCellInfoListMN_EUTRA = candidateCellInfoListMN_EUTRA_;
      candidateCellInfoListSN_EUTRA = candidateCellInfoListSN_EUTRA_;
      sourceConfigSCG_EUTRA = sourceConfigSCG_EUTRA_;
      scgFailureInfoEUTRA = scgFailureInfoEUTRA_;
      drx_ConfigMCG = drx_ConfigMCG_;
      measResultReportCGI_EUTRA = measResultReportCGI_EUTRA_;
      measResultCellListSFTD_EUTRA = measResultCellListSFTD_EUTRA_;
      fr_InfoListMCG = fr_InfoListMCG_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_ConfigInfo_v1560_IEs (byte[] candidateCellInfoListMN_EUTRA_,
      byte[] candidateCellInfoListSN_EUTRA_,
      byte[] sourceConfigSCG_EUTRA_,
      CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA scgFailureInfoEUTRA_,
      DRX_Config drx_ConfigMCG_,
      CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA measResultReportCGI_EUTRA_,
      MeasResultCellListSFTD_EUTRA measResultCellListSFTD_EUTRA_,
      FR_InfoList fr_InfoListMCG_,
      CG_ConfigInfo_v1570_IEs nonCriticalExtension_
   ) {
      super();
      candidateCellInfoListMN_EUTRA = new Asn1OctetString (candidateCellInfoListMN_EUTRA_);
      candidateCellInfoListSN_EUTRA = new Asn1OctetString (candidateCellInfoListSN_EUTRA_);
      sourceConfigSCG_EUTRA = new Asn1OctetString (sourceConfigSCG_EUTRA_);
      scgFailureInfoEUTRA = scgFailureInfoEUTRA_;
      drx_ConfigMCG = drx_ConfigMCG_;
      measResultReportCGI_EUTRA = measResultReportCGI_EUTRA_;
      measResultCellListSFTD_EUTRA = measResultCellListSFTD_EUTRA_;
      fr_InfoListMCG = fr_InfoListMCG_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      candidateCellInfoListMN_EUTRA = null;
      candidateCellInfoListSN_EUTRA = null;
      sourceConfigSCG_EUTRA = null;
      scgFailureInfoEUTRA = null;
      drx_ConfigMCG = null;
      measResultReportCGI_EUTRA = null;
      measResultCellListSFTD_EUTRA = null;
      fr_InfoListMCG = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 9; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return candidateCellInfoListMN_EUTRA;
         case 1: return candidateCellInfoListSN_EUTRA;
         case 2: return sourceConfigSCG_EUTRA;
         case 3: return scgFailureInfoEUTRA;
         case 4: return drx_ConfigMCG;
         case 5: return measResultReportCGI_EUTRA;
         case 6: return measResultCellListSFTD_EUTRA;
         case 7: return fr_InfoListMCG;
         case 8: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "candidateCellInfoListMN-EUTRA";
         case 1: return "candidateCellInfoListSN-EUTRA";
         case 2: return "sourceConfigSCG-EUTRA";
         case 3: return "scgFailureInfoEUTRA";
         case 4: return "drx-ConfigMCG";
         case 5: return "measResultReportCGI-EUTRA";
         case 6: return "measResultCellListSFTD-EUTRA";
         case 7: return "fr-InfoListMCG";
         case 8: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean candidateCellInfoListMN_EUTRAPresent = buffer.decodeBit ("candidateCellInfoListMN_EUTRAPresent");
      boolean candidateCellInfoListSN_EUTRAPresent = buffer.decodeBit ("candidateCellInfoListSN_EUTRAPresent");
      boolean sourceConfigSCG_EUTRAPresent = buffer.decodeBit ("sourceConfigSCG_EUTRAPresent");
      boolean scgFailureInfoEUTRAPresent = buffer.decodeBit ("scgFailureInfoEUTRAPresent");
      boolean drx_ConfigMCGPresent = buffer.decodeBit ("drx_ConfigMCGPresent");
      boolean measResultReportCGI_EUTRAPresent = buffer.decodeBit ("measResultReportCGI_EUTRAPresent");
      boolean measResultCellListSFTD_EUTRAPresent = buffer.decodeBit ("measResultCellListSFTD_EUTRAPresent");
      boolean fr_InfoListMCGPresent = buffer.decodeBit ("fr_InfoListMCGPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode candidateCellInfoListMN_EUTRA

      if (candidateCellInfoListMN_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("candidateCellInfoListMN_EUTRA", -1);

         candidateCellInfoListMN_EUTRA = new Asn1OctetString();
         candidateCellInfoListMN_EUTRA.decode (buffer);

         buffer.invokeCharacters(candidateCellInfoListMN_EUTRA.toString());
         buffer.getContext().eventDispatcher.endElement("candidateCellInfoListMN_EUTRA", -1);
      }
      else {
         candidateCellInfoListMN_EUTRA = null;
      }

      // decode candidateCellInfoListSN_EUTRA

      if (candidateCellInfoListSN_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("candidateCellInfoListSN_EUTRA", -1);

         candidateCellInfoListSN_EUTRA = new Asn1OctetString();
         candidateCellInfoListSN_EUTRA.decode (buffer);

         buffer.invokeCharacters(candidateCellInfoListSN_EUTRA.toString());
         buffer.getContext().eventDispatcher.endElement("candidateCellInfoListSN_EUTRA", -1);
      }
      else {
         candidateCellInfoListSN_EUTRA = null;
      }

      // decode sourceConfigSCG_EUTRA

      if (sourceConfigSCG_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("sourceConfigSCG_EUTRA", -1);

         sourceConfigSCG_EUTRA = new Asn1OctetString();
         sourceConfigSCG_EUTRA.decode (buffer);

         buffer.invokeCharacters(sourceConfigSCG_EUTRA.toString());
         buffer.getContext().eventDispatcher.endElement("sourceConfigSCG_EUTRA", -1);
      }
      else {
         sourceConfigSCG_EUTRA = null;
      }

      // decode scgFailureInfoEUTRA

      if (scgFailureInfoEUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("scgFailureInfoEUTRA", -1);

         scgFailureInfoEUTRA = new CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA();
         scgFailureInfoEUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("scgFailureInfoEUTRA", -1);
      }
      else {
         scgFailureInfoEUTRA = null;
      }

      // decode drx_ConfigMCG

      if (drx_ConfigMCGPresent) {
         buffer.getContext().eventDispatcher.startElement("drx_ConfigMCG", -1);

         drx_ConfigMCG = new DRX_Config();
         drx_ConfigMCG.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("drx_ConfigMCG", -1);
      }
      else {
         drx_ConfigMCG = null;
      }

      // decode measResultReportCGI_EUTRA

      if (measResultReportCGI_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("measResultReportCGI_EUTRA", -1);

         measResultReportCGI_EUTRA = new CG_ConfigInfo_v1560_IEs_measResultReportCGI_EUTRA();
         measResultReportCGI_EUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultReportCGI_EUTRA", -1);
      }
      else {
         measResultReportCGI_EUTRA = null;
      }

      // decode measResultCellListSFTD_EUTRA

      if (measResultCellListSFTD_EUTRAPresent) {
         buffer.getContext().eventDispatcher.startElement("measResultCellListSFTD_EUTRA", -1);

         measResultCellListSFTD_EUTRA = new MeasResultCellListSFTD_EUTRA();
         measResultCellListSFTD_EUTRA.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("measResultCellListSFTD_EUTRA", -1);
      }
      else {
         measResultCellListSFTD_EUTRA = null;
      }

      // decode fr_InfoListMCG

      if (fr_InfoListMCGPresent) {
         buffer.getContext().eventDispatcher.startElement("fr_InfoListMCG", -1);

         fr_InfoListMCG = new FR_InfoList();
         fr_InfoListMCG.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("fr_InfoListMCG", -1);
      }
      else {
         fr_InfoListMCG = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CG_ConfigInfo_v1570_IEs();
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
      if (candidateCellInfoListMN_EUTRA != null) candidateCellInfoListMN_EUTRA.print (_sb, "candidateCellInfoListMN_EUTRA", _level+1);
      if (candidateCellInfoListSN_EUTRA != null) candidateCellInfoListSN_EUTRA.print (_sb, "candidateCellInfoListSN_EUTRA", _level+1);
      if (sourceConfigSCG_EUTRA != null) sourceConfigSCG_EUTRA.print (_sb, "sourceConfigSCG_EUTRA", _level+1);
      if (scgFailureInfoEUTRA != null) scgFailureInfoEUTRA.print (_sb, "scgFailureInfoEUTRA", _level+1);
      if (drx_ConfigMCG != null) drx_ConfigMCG.print (_sb, "drx_ConfigMCG", _level+1);
      if (measResultReportCGI_EUTRA != null) measResultReportCGI_EUTRA.print (_sb, "measResultReportCGI_EUTRA", _level+1);
      if (measResultCellListSFTD_EUTRA != null) measResultCellListSFTD_EUTRA.print (_sb, "measResultCellListSFTD_EUTRA", _level+1);
      if (fr_InfoListMCG != null) fr_InfoListMCG.print (_sb, "fr_InfoListMCG", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
