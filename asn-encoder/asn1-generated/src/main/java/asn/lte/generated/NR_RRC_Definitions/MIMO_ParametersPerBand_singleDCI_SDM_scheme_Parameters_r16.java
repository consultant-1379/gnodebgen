/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportNewDMRS_Port_r16 supportNewDMRS_Port_r16 = null;  // optional
   public MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportTwoPortDL_PTRS_r16 supportTwoPortDL_PTRS_r16 = null;  // optional

   public MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16 (
      MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportNewDMRS_Port_r16 supportNewDMRS_Port_r16_,
      MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportTwoPortDL_PTRS_r16 supportTwoPortDL_PTRS_r16_
   ) {
      super();
      supportNewDMRS_Port_r16 = supportNewDMRS_Port_r16_;
      supportTwoPortDL_PTRS_r16 = supportTwoPortDL_PTRS_r16_;
   }

   public void init () {
      supportNewDMRS_Port_r16 = null;
      supportTwoPortDL_PTRS_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return supportNewDMRS_Port_r16;
         case 1: return supportTwoPortDL_PTRS_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "supportNewDMRS-Port-r16";
         case 1: return "supportTwoPortDL-PTRS-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean supportNewDMRS_Port_r16Present = buffer.decodeBit ("supportNewDMRS_Port_r16Present");
      boolean supportTwoPortDL_PTRS_r16Present = buffer.decodeBit ("supportTwoPortDL_PTRS_r16Present");

      // decode supportNewDMRS_Port_r16

      if (supportNewDMRS_Port_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportNewDMRS_Port_r16", -1);

         int tval = MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportNewDMRS_Port_r16.decodeEnumValue (buffer);
         supportNewDMRS_Port_r16 = MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportNewDMRS_Port_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportNewDMRS_Port_r16", -1);
      }
      else {
         supportNewDMRS_Port_r16 = null;
      }

      // decode supportTwoPortDL_PTRS_r16

      if (supportTwoPortDL_PTRS_r16Present) {
         buffer.getContext().eventDispatcher.startElement("supportTwoPortDL_PTRS_r16", -1);

         int tval = MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportTwoPortDL_PTRS_r16.decodeEnumValue (buffer);
         supportTwoPortDL_PTRS_r16 = MIMO_ParametersPerBand_singleDCI_SDM_scheme_Parameters_r16_supportTwoPortDL_PTRS_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("supportTwoPortDL_PTRS_r16", -1);
      }
      else {
         supportTwoPortDL_PTRS_r16 = null;
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (supportNewDMRS_Port_r16 != null) supportNewDMRS_Port_r16.print (_sb, "supportNewDMRS_Port_r16", _level+1);
      if (supportTwoPortDL_PTRS_r16 != null) supportTwoPortDL_PTRS_r16.print (_sb, "supportTwoPortDL_PTRS_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
