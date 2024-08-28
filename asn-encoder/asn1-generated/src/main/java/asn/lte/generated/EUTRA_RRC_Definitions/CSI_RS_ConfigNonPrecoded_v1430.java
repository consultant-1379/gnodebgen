/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_ConfigNonPrecoded_v1430 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-ConfigNonPrecoded-v1430";
   }

   public CSI_RS_ConfigNZP_EMIMO_v1430 csi_RS_ConfigNZP_EMIMO_v1430;  // optional
   public CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN1_v1430 codebookConfigN1_v1430 = null;
   public CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN2_v1430 codebookConfigN2_v1430 = null;
   public CSI_RS_Config_NZP_v1430 nzp_ResourceConfigTM9_Original_v1430;

   public CSI_RS_ConfigNonPrecoded_v1430 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_ConfigNonPrecoded_v1430 (
      CSI_RS_ConfigNZP_EMIMO_v1430 csi_RS_ConfigNZP_EMIMO_v1430_,
      CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN1_v1430 codebookConfigN1_v1430_,
      CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN2_v1430 codebookConfigN2_v1430_,
      CSI_RS_Config_NZP_v1430 nzp_ResourceConfigTM9_Original_v1430_
   ) {
      super();
      csi_RS_ConfigNZP_EMIMO_v1430 = csi_RS_ConfigNZP_EMIMO_v1430_;
      codebookConfigN1_v1430 = codebookConfigN1_v1430_;
      codebookConfigN2_v1430 = codebookConfigN2_v1430_;
      nzp_ResourceConfigTM9_Original_v1430 = nzp_ResourceConfigTM9_Original_v1430_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CSI_RS_ConfigNonPrecoded_v1430 (
      CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN1_v1430 codebookConfigN1_v1430_,
      CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN2_v1430 codebookConfigN2_v1430_,
      CSI_RS_Config_NZP_v1430 nzp_ResourceConfigTM9_Original_v1430_
   ) {
      super();
      codebookConfigN1_v1430 = codebookConfigN1_v1430_;
      codebookConfigN2_v1430 = codebookConfigN2_v1430_;
      nzp_ResourceConfigTM9_Original_v1430 = nzp_ResourceConfigTM9_Original_v1430_;
   }

   public void init () {
      csi_RS_ConfigNZP_EMIMO_v1430 = null;
      codebookConfigN1_v1430 = null;
      codebookConfigN2_v1430 = null;
      nzp_ResourceConfigTM9_Original_v1430 = null;
   }

   public int getElementCount() { return 4; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return csi_RS_ConfigNZP_EMIMO_v1430;
         case 1: return codebookConfigN1_v1430;
         case 2: return codebookConfigN2_v1430;
         case 3: return nzp_ResourceConfigTM9_Original_v1430;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "csi-RS-ConfigNZP-EMIMO-v1430";
         case 1: return "codebookConfigN1-v1430";
         case 2: return "codebookConfigN2-v1430";
         case 3: return "nzp-ResourceConfigTM9-Original-v1430";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean csi_RS_ConfigNZP_EMIMO_v1430Present = buffer.decodeBit ("csi_RS_ConfigNZP_EMIMO_v1430Present");

      // decode csi_RS_ConfigNZP_EMIMO_v1430

      if (csi_RS_ConfigNZP_EMIMO_v1430Present) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_ConfigNZP_EMIMO_v1430", -1);

         csi_RS_ConfigNZP_EMIMO_v1430 = new CSI_RS_ConfigNZP_EMIMO_v1430();
         csi_RS_ConfigNZP_EMIMO_v1430.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csi_RS_ConfigNZP_EMIMO_v1430", -1);
      }
      else {
         csi_RS_ConfigNZP_EMIMO_v1430 = null;
      }

      // decode codebookConfigN1_v1430

      buffer.getContext().eventDispatcher.startElement("codebookConfigN1_v1430", -1);

      {
         int tval = CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN1_v1430.decodeEnumValue (buffer);
         codebookConfigN1_v1430 = CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN1_v1430.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("codebookConfigN1_v1430", -1);

      // decode codebookConfigN2_v1430

      buffer.getContext().eventDispatcher.startElement("codebookConfigN2_v1430", -1);

      {
         int tval = CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN2_v1430.decodeEnumValue (buffer);
         codebookConfigN2_v1430 = CSI_RS_ConfigNonPrecoded_v1430_codebookConfigN2_v1430.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("codebookConfigN2_v1430", -1);

      // decode nzp_ResourceConfigTM9_Original_v1430

      buffer.getContext().eventDispatcher.startElement("nzp_ResourceConfigTM9_Original_v1430", -1);

      nzp_ResourceConfigTM9_Original_v1430 = new CSI_RS_Config_NZP_v1430();
      nzp_ResourceConfigTM9_Original_v1430.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("nzp_ResourceConfigTM9_Original_v1430", -1);

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (csi_RS_ConfigNZP_EMIMO_v1430 != null) csi_RS_ConfigNZP_EMIMO_v1430.print (_sb, "csi_RS_ConfigNZP_EMIMO_v1430", _level+1);
      if (codebookConfigN1_v1430 != null) codebookConfigN1_v1430.print (_sb, "codebookConfigN1_v1430", _level+1);
      if (codebookConfigN2_v1430 != null) codebookConfigN2_v1430.print (_sb, "codebookConfigN2_v1430", _level+1);
      if (nzp_ResourceConfigTM9_Original_v1430 != null) nzp_ResourceConfigTM9_Original_v1430.print (_sb, "nzp_ResourceConfigTM9_Original_v1430", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
