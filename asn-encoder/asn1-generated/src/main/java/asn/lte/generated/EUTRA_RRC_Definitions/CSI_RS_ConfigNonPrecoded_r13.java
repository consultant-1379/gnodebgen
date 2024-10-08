/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_ConfigNonPrecoded_r13 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CSI-RS-ConfigNonPrecoded-r13";
   }

   public P_C_AndCBSR_Pair_r13 p_C_AndCBSRList_r13;  // optional
   public CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13 codebookConfigN1_r13 = null;
   public CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13 codebookConfigN2_r13 = null;
   public CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O1_r13 codebookOverSamplingRateConfig_O1_r13 = null;  // optional
   public CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O2_r13 codebookOverSamplingRateConfig_O2_r13 = null;  // optional
   public Asn1Integer codebookConfig_r13;
   public CSI_RS_ConfigNonPrecoded_r13_csi_IM_ConfigIdList_r13 csi_IM_ConfigIdList_r13;  // optional
   public CSI_RS_ConfigNZP_EMIMO_r13 csi_RS_ConfigNZP_EMIMO_r13;  // optional

   public CSI_RS_ConfigNonPrecoded_r13 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public CSI_RS_ConfigNonPrecoded_r13 (
      P_C_AndCBSR_Pair_r13 p_C_AndCBSRList_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13 codebookConfigN1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13 codebookConfigN2_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O1_r13 codebookOverSamplingRateConfig_O1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O2_r13 codebookOverSamplingRateConfig_O2_r13_,
      Asn1Integer codebookConfig_r13_,
      CSI_RS_ConfigNonPrecoded_r13_csi_IM_ConfigIdList_r13 csi_IM_ConfigIdList_r13_,
      CSI_RS_ConfigNZP_EMIMO_r13 csi_RS_ConfigNZP_EMIMO_r13_
   ) {
      super();
      p_C_AndCBSRList_r13 = p_C_AndCBSRList_r13_;
      codebookConfigN1_r13 = codebookConfigN1_r13_;
      codebookConfigN2_r13 = codebookConfigN2_r13_;
      codebookOverSamplingRateConfig_O1_r13 = codebookOverSamplingRateConfig_O1_r13_;
      codebookOverSamplingRateConfig_O2_r13 = codebookOverSamplingRateConfig_O2_r13_;
      codebookConfig_r13 = codebookConfig_r13_;
      csi_IM_ConfigIdList_r13 = csi_IM_ConfigIdList_r13_;
      csi_RS_ConfigNZP_EMIMO_r13 = csi_RS_ConfigNZP_EMIMO_r13_;
   }

   /**
    * This constructor is for required elements only.  It sets 
    * all elements to references to the given objects
    */
   public CSI_RS_ConfigNonPrecoded_r13 (
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13 codebookConfigN1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13 codebookConfigN2_r13_,
      Asn1Integer codebookConfig_r13_
   ) {
      super();
      codebookConfigN1_r13 = codebookConfigN1_r13_;
      codebookConfigN2_r13 = codebookConfigN2_r13_;
      codebookConfig_r13 = codebookConfig_r13_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public CSI_RS_ConfigNonPrecoded_r13 (P_C_AndCBSR_Pair_r13 p_C_AndCBSRList_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13 codebookConfigN1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13 codebookConfigN2_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O1_r13 codebookOverSamplingRateConfig_O1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O2_r13 codebookOverSamplingRateConfig_O2_r13_,
      long codebookConfig_r13_,
      CSI_RS_ConfigNonPrecoded_r13_csi_IM_ConfigIdList_r13 csi_IM_ConfigIdList_r13_,
      CSI_RS_ConfigNZP_EMIMO_r13 csi_RS_ConfigNZP_EMIMO_r13_
   ) {
      super();
      p_C_AndCBSRList_r13 = p_C_AndCBSRList_r13_;
      codebookConfigN1_r13 = codebookConfigN1_r13_;
      codebookConfigN2_r13 = codebookConfigN2_r13_;
      codebookOverSamplingRateConfig_O1_r13 = codebookOverSamplingRateConfig_O1_r13_;
      codebookOverSamplingRateConfig_O2_r13 = codebookOverSamplingRateConfig_O2_r13_;
      codebookConfig_r13 = new Asn1Integer (codebookConfig_r13_);
      csi_IM_ConfigIdList_r13 = csi_IM_ConfigIdList_r13_;
      csi_RS_ConfigNZP_EMIMO_r13 = csi_RS_ConfigNZP_EMIMO_r13_;
   }

   /**
    * This constructor is for required elements only.  It allows 
    * primitive data to be passed for all primitive elements.  
    * It will create new object wrappers for the primitive data 
    * and set other elements to references to the given objects. 
    */
   public CSI_RS_ConfigNonPrecoded_r13 (
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13 codebookConfigN1_r13_,
      CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13 codebookConfigN2_r13_,
      long codebookConfig_r13_
   ) {
      super();
      codebookConfigN1_r13 = codebookConfigN1_r13_;
      codebookConfigN2_r13 = codebookConfigN2_r13_;
      codebookConfig_r13 = new Asn1Integer (codebookConfig_r13_);
   }

   public void init () {
      p_C_AndCBSRList_r13 = null;
      codebookConfigN1_r13 = null;
      codebookConfigN2_r13 = null;
      codebookOverSamplingRateConfig_O1_r13 = null;
      codebookOverSamplingRateConfig_O2_r13 = null;
      codebookConfig_r13 = null;
      csi_IM_ConfigIdList_r13 = null;
      csi_RS_ConfigNZP_EMIMO_r13 = null;
   }

   public int getElementCount() { return 8; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return p_C_AndCBSRList_r13;
         case 1: return codebookConfigN1_r13;
         case 2: return codebookConfigN2_r13;
         case 3: return codebookOverSamplingRateConfig_O1_r13;
         case 4: return codebookOverSamplingRateConfig_O2_r13;
         case 5: return codebookConfig_r13;
         case 6: return csi_IM_ConfigIdList_r13;
         case 7: return csi_RS_ConfigNZP_EMIMO_r13;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "p-C-AndCBSRList-r13";
         case 1: return "codebookConfigN1-r13";
         case 2: return "codebookConfigN2-r13";
         case 3: return "codebookOverSamplingRateConfig-O1-r13";
         case 4: return "codebookOverSamplingRateConfig-O2-r13";
         case 5: return "codebookConfig-r13";
         case 6: return "csi-IM-ConfigIdList-r13";
         case 7: return "csi-RS-ConfigNZP-EMIMO-r13";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean p_C_AndCBSRList_r13Present = buffer.decodeBit ("p_C_AndCBSRList_r13Present");
      boolean codebookOverSamplingRateConfig_O1_r13Present = buffer.decodeBit ("codebookOverSamplingRateConfig_O1_r13Present");
      boolean codebookOverSamplingRateConfig_O2_r13Present = buffer.decodeBit ("codebookOverSamplingRateConfig_O2_r13Present");
      boolean csi_IM_ConfigIdList_r13Present = buffer.decodeBit ("csi_IM_ConfigIdList_r13Present");
      boolean csi_RS_ConfigNZP_EMIMO_r13Present = buffer.decodeBit ("csi_RS_ConfigNZP_EMIMO_r13Present");

      // decode p_C_AndCBSRList_r13

      if (p_C_AndCBSRList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("p_C_AndCBSRList_r13", -1);

         p_C_AndCBSRList_r13 = new P_C_AndCBSR_Pair_r13();
         p_C_AndCBSRList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("p_C_AndCBSRList_r13", -1);
      }
      else {
         p_C_AndCBSRList_r13 = null;
      }

      // decode codebookConfigN1_r13

      buffer.getContext().eventDispatcher.startElement("codebookConfigN1_r13", -1);

      {
         int tval = CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13.decodeEnumValue (buffer);
         codebookConfigN1_r13 = CSI_RS_ConfigNonPrecoded_r13_codebookConfigN1_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("codebookConfigN1_r13", -1);

      // decode codebookConfigN2_r13

      buffer.getContext().eventDispatcher.startElement("codebookConfigN2_r13", -1);

      {
         int tval = CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13.decodeEnumValue (buffer);
         codebookConfigN2_r13 = CSI_RS_ConfigNonPrecoded_r13_codebookConfigN2_r13.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("codebookConfigN2_r13", -1);

      // decode codebookOverSamplingRateConfig_O1_r13

      if (codebookOverSamplingRateConfig_O1_r13Present) {
         buffer.getContext().eventDispatcher.startElement("codebookOverSamplingRateConfig_O1_r13", -1);

         int tval = CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O1_r13.decodeEnumValue (buffer);
         codebookOverSamplingRateConfig_O1_r13 = CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O1_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("codebookOverSamplingRateConfig_O1_r13", -1);
      }
      else {
         codebookOverSamplingRateConfig_O1_r13 = null;
      }

      // decode codebookOverSamplingRateConfig_O2_r13

      if (codebookOverSamplingRateConfig_O2_r13Present) {
         buffer.getContext().eventDispatcher.startElement("codebookOverSamplingRateConfig_O2_r13", -1);

         int tval = CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O2_r13.decodeEnumValue (buffer);
         codebookOverSamplingRateConfig_O2_r13 = CSI_RS_ConfigNonPrecoded_r13_codebookOverSamplingRateConfig_O2_r13.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("codebookOverSamplingRateConfig_O2_r13", -1);
      }
      else {
         codebookOverSamplingRateConfig_O2_r13 = null;
      }

      // decode codebookConfig_r13

      buffer.getContext().eventDispatcher.startElement("codebookConfig_r13", -1);

      codebookConfig_r13 = new Asn1Integer();
      codebookConfig_r13.decode (buffer, 1, 4);

      buffer.invokeCharacters(codebookConfig_r13.toString());
      buffer.getContext().eventDispatcher.endElement("codebookConfig_r13", -1);

      // decode csi_IM_ConfigIdList_r13

      if (csi_IM_ConfigIdList_r13Present) {
         buffer.getContext().eventDispatcher.startElement("csi_IM_ConfigIdList_r13", -1);

         csi_IM_ConfigIdList_r13 = new CSI_RS_ConfigNonPrecoded_r13_csi_IM_ConfigIdList_r13();
         csi_IM_ConfigIdList_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csi_IM_ConfigIdList_r13", -1);
      }
      else {
         csi_IM_ConfigIdList_r13 = null;
      }

      // decode csi_RS_ConfigNZP_EMIMO_r13

      if (csi_RS_ConfigNZP_EMIMO_r13Present) {
         buffer.getContext().eventDispatcher.startElement("csi_RS_ConfigNZP_EMIMO_r13", -1);

         csi_RS_ConfigNZP_EMIMO_r13 = new CSI_RS_ConfigNZP_EMIMO_r13();
         csi_RS_ConfigNZP_EMIMO_r13.decode (buffer);
         buffer.getContext().eventDispatcher.endElement("csi_RS_ConfigNZP_EMIMO_r13", -1);
      }
      else {
         csi_RS_ConfigNZP_EMIMO_r13 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (p_C_AndCBSRList_r13 != null) p_C_AndCBSRList_r13.print (_sb, "p_C_AndCBSRList_r13", _level+1);
      if (codebookConfigN1_r13 != null) codebookConfigN1_r13.print (_sb, "codebookConfigN1_r13", _level+1);
      if (codebookConfigN2_r13 != null) codebookConfigN2_r13.print (_sb, "codebookConfigN2_r13", _level+1);
      if (codebookOverSamplingRateConfig_O1_r13 != null) codebookOverSamplingRateConfig_O1_r13.print (_sb, "codebookOverSamplingRateConfig_O1_r13", _level+1);
      if (codebookOverSamplingRateConfig_O2_r13 != null) codebookOverSamplingRateConfig_O2_r13.print (_sb, "codebookOverSamplingRateConfig_O2_r13", _level+1);
      if (codebookConfig_r13 != null) codebookConfig_r13.print (_sb, "codebookConfig_r13", _level+1);
      if (csi_IM_ConfigIdList_r13 != null) csi_IM_ConfigIdList_r13.print (_sb, "csi_IM_ConfigIdList_r13", _level+1);
      if (csi_RS_ConfigNZP_EMIMO_r13 != null) csi_RS_ConfigNZP_EMIMO_r13.print (_sb, "csi_RS_ConfigNZP_EMIMO_r13", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
