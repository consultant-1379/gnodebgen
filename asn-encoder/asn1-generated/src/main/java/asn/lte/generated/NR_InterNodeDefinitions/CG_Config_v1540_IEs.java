/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.NR_RRC_Definitions.ARFCN_ValueNR;

public class CG_Config_v1540_IEs extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-Config-v1540-IEs";
   }

   public ARFCN_ValueNR pSCellFrequency;  // optional
   public CG_Config_v1540_IEs_reportCGI_RequestNR reportCGI_RequestNR;  // optional
   public PH_TypeListSCG ph_InfoSCG;  // optional
   public CG_Config_v1560_IEs nonCriticalExtension;  // optional

   public CG_Config_v1540_IEs () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CG_Config_v1540_IEs (
      ARFCN_ValueNR pSCellFrequency_,
      CG_Config_v1540_IEs_reportCGI_RequestNR reportCGI_RequestNR_,
      PH_TypeListSCG ph_InfoSCG_,
      CG_Config_v1560_IEs nonCriticalExtension_
   ) {
      super();
      pSCellFrequency = pSCellFrequency_;
      reportCGI_RequestNR = reportCGI_RequestNR_;
      ph_InfoSCG = ph_InfoSCG_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CG_Config_v1540_IEs (long pSCellFrequency_,
      CG_Config_v1540_IEs_reportCGI_RequestNR reportCGI_RequestNR_,
      PH_TypeListSCG ph_InfoSCG_,
      CG_Config_v1560_IEs nonCriticalExtension_
   ) {
      super();
      pSCellFrequency = new ARFCN_ValueNR (pSCellFrequency_);
      reportCGI_RequestNR = reportCGI_RequestNR_;
      ph_InfoSCG = ph_InfoSCG_;
      nonCriticalExtension = nonCriticalExtension_;
   }

   public void init () {
      pSCellFrequency = null;
      reportCGI_RequestNR = null;
      ph_InfoSCG = null;
      nonCriticalExtension = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return pSCellFrequency;
         case 1: return reportCGI_RequestNR;
         case 2: return ph_InfoSCG;
         case 3: return nonCriticalExtension;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "pSCellFrequency";
         case 1: return "reportCGI-RequestNR";
         case 2: return "ph-InfoSCG";
         case 3: return "nonCriticalExtension";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean pSCellFrequencyPresent = buffer.decodeBit ("pSCellFrequencyPresent");
      boolean reportCGI_RequestNRPresent = buffer.decodeBit ("reportCGI_RequestNRPresent");
      boolean ph_InfoSCGPresent = buffer.decodeBit ("ph_InfoSCGPresent");
      boolean nonCriticalExtensionPresent = buffer.decodeBit ("nonCriticalExtensionPresent");

      // decode pSCellFrequency

      if (pSCellFrequencyPresent) {
         buffer.getContext().eventDispatcher.startElement("pSCellFrequency", -1);

         pSCellFrequency = new ARFCN_ValueNR();
         pSCellFrequency.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("pSCellFrequency", -1);
      }
      else {
         pSCellFrequency = null;
      }

      // decode reportCGI_RequestNR

      if (reportCGI_RequestNRPresent) {
         buffer.getContext().eventDispatcher.startElement("reportCGI_RequestNR", -1);

         reportCGI_RequestNR = new CG_Config_v1540_IEs_reportCGI_RequestNR();
         reportCGI_RequestNR.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("reportCGI_RequestNR", -1);
      }
      else {
         reportCGI_RequestNR = null;
      }

      // decode ph_InfoSCG

      if (ph_InfoSCGPresent) {
         buffer.getContext().eventDispatcher.startElement("ph_InfoSCG", -1);

         ph_InfoSCG = new PH_TypeListSCG();
         ph_InfoSCG.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("ph_InfoSCG", -1);
      }
      else {
         ph_InfoSCG = null;
      }

      // decode nonCriticalExtension

      if (nonCriticalExtensionPresent) {
         buffer.getContext().eventDispatcher.startElement("nonCriticalExtension", -1);

         nonCriticalExtension = new CG_Config_v1560_IEs();
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
      if (pSCellFrequency != null) pSCellFrequency.print (_sb, "pSCellFrequency", _level+1);
      if (reportCGI_RequestNR != null) reportCGI_RequestNR.print (_sb, "reportCGI_RequestNR", _level+1);
      if (ph_InfoSCG != null) ph_InfoSCG.print (_sb, "ph_InfoSCG", _level+1);
      if (nonCriticalExtension != null) nonCriticalExtension.print (_sb, "nonCriticalExtension", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
