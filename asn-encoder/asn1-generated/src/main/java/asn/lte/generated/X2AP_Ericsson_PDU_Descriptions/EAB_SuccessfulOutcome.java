/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_Ericsson_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;

public class EAB_SuccessfulOutcome extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_Ericsson_PDU_DescriptionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "EAB-SuccessfulOutcome";
   }

   public EAB_ProcedureCode procedureCode;
   public Criticality criticality = null;

   /**
    * procedureCode: eid-CellResourceControl
    * criticality: Criticality.reject
    * ASN.1 type: EAB-CellResourceControlResponse
    * Java type: EAB_CellResourceControlResponse
    *
    * procedureCode: eid-CellSleepRequest
    * criticality: Criticality.reject
    * ASN.1 type: EAB-CellSleepResponse
    * Java type: EAB_CellSleepResponse
    *
    * procedureCode: eid-CellInformationFetch
    * criticality: Criticality.reject
    * ASN.1 type: EAB-CellInfoFetchResponse
    * Java type: EAB_CellInfoFetchResponse
    *
    * procedureCode: eid-Elastic-RAN-TunnelDeletion
    * criticality: Criticality.ignore
    * ASN.1 type: EAB-Elastic-RAN-TunnelDeletionResponse
    * Java type: EAB_Elastic_RAN_TunnelDeletionResponse
    *
    * procedureCode: eid-Elastic-RAN-TunnelSetup
    * criticality: Criticality.reject
    * ASN.1 type: EAB-Elastic-RAN-TunnelSetupResponse
    * Java type: EAB_Elastic_RAN_TunnelSetupResponse
    *
    * procedureCode: eid-Elastic-RAN-TunnelSetupULComp
    * criticality: Criticality.reject
    * ASN.1 type: EAB-Elastic-RAN-TunnelSetupULCompResponse
    * Java type: EAB_Elastic_RAN_TunnelSetupULCompResponse
    *
    * procedureCode: eid-IeNB-TunnelsDeletion
    * criticality: Criticality.reject
    * ASN.1 type: EAB-IeNB-TunnelsDeletionResponse
    * Java type: EAB_IeNB_TunnelsDeletionResponse
    *
    * procedureCode: eid-IeNB-TunnelsSetup
    * criticality: Criticality.reject
    * ASN.1 type: EAB-IeNB-TunnelsSetupResponse
    * Java type: EAB_IeNB_TunnelsSetupResponse
    *
    * procedureCode: eid-IeNB-TunnelsSetupULCoMP
    * criticality: Criticality.reject
    * ASN.1 type: EAB-IeNB-TunnelsSetupULCoMPResponse
    * Java type: EAB_IeNB_TunnelsSetupULCoMPResponse
    *
    * procedureCode: eid-UEContextFetch
    * criticality: Criticality.reject
    * ASN.1 type: EAB-UEContextFetchResponse
    * Java type: EAB_UEContextFetchResponse
    *
    * procedureCode: eid-BasebandResetIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-ErrorIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-CellResourceStatusReport
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-IeNB-TunnelsRelease
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-OverlaidCellIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-TestCellIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-UEContextFetchAccept
    * criticality: Criticality.reject
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-UE-S1AP-PDU-Transfer
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-CellLoadStateIndication
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    *
    * procedureCode: eid-EUTRAN-NR-E5-Transport
    * criticality: Criticality.ignore
    * ASN.1 type: 
    * Java type: 
    */
   public Asn1Type value;

   public EAB_SuccessfulOutcome () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public EAB_SuccessfulOutcome (
      EAB_ProcedureCode procedureCode_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      procedureCode = procedureCode_;
      criticality = criticality_;
      value = value_;
   }

   /**
    * This constructor allows primitive data to be passed for all 
    * primitive elements.  It will create new object wrappers for 
    * the primitive data and set other elements to references to 
    * the given objects 
    */
   public EAB_SuccessfulOutcome (long procedureCode_,
      Criticality criticality_,
      Asn1Type value_
   ) {
      super();
      procedureCode = new EAB_ProcedureCode (procedureCode_);
      criticality = criticality_;
      value = value_;
   }

   public void init () {
      procedureCode = null;
      criticality = null;
      value = null;
   }

   public int getElementCount() { return 3; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return procedureCode;
         case 1: return criticality;
         case 2: return value;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "procedureCode";
         case 1: return "criticality";
         case 2: return "value";
         default: return null;
      }
   }


   /**
    * Assign fields according to information object eab-CellResourceControl
    */
   public void setUsing_eab_CellResourceControl(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellResourceControlResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CellResourceControl);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-CellSleepRequest
    */
   public void setUsing_eab_CellSleepRequest(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellSleepResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CellSleepRequest);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-CellInformationFetch
    */
   public void setUsing_eab_CellInformationFetch(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellInfoFetchResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CellInformationFetch);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-Elastic-RAN-TunnelDeletion
    */
   public void setUsing_eab_Elastic_RAN_TunnelDeletion(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelDeletionResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_Elastic_RAN_TunnelDeletion);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-Elastic-RAN-TunnelSetup
    */
   public void setUsing_eab_Elastic_RAN_TunnelSetup(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_Elastic_RAN_TunnelSetup);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-Elastic-RAN-TunnelSetupULComp
    */
   public void setUsing_eab_Elastic_RAN_TunnelSetupULComp(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupULCompResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_Elastic_RAN_TunnelSetupULComp);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-IeNB-TunnelsDeletion
    */
   public void setUsing_eab_IeNB_TunnelsDeletion(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsDeletionResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_IeNB_TunnelsDeletion);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-IeNB-TunnelsSetup
    */
   public void setUsing_eab_IeNB_TunnelsSetup(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_IeNB_TunnelsSetup);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-IeNB-TunnelsSetupULCoMP
    */
   public void setUsing_eab_IeNB_TunnelsSetupULCoMP(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupULCoMPResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_IeNB_TunnelsSetupULCoMP);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-UEContextFetch
    */
   public void setUsing_eab_UEContextFetch(asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_UEContextFetchResponse value) {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_UEContextFetch);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
      this.value = value;
   }

   /**
    * Assign fields according to information object eab-BasebandResetIndication
    */
   public void setUsing_eab_BasebandResetIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_BasebandResetIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-ErrorIndication
    */
   public void setUsing_eab_ErrorIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_ErrorIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-CellResourceStatusReport
    */
   public void setUsing_eab_CellResourceStatusReport() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CellResourceStatusReport);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-IeNB-TunnelsRelease
    */
   public void setUsing_eab_IeNB_TunnelsRelease() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_IeNB_TunnelsRelease);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-OverlaidCellIndication
    */
   public void setUsing_eab_OverlaidCellIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_OverlaidCellIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-TestCellIndication
    */
   public void setUsing_eab_TestCellIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_TestCellIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-UEContextFetchAccept
    */
   public void setUsing_eab_UEContextFetchAccept() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_UEContextFetchAccept);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject();
   }

   /**
    * Assign fields according to information object eab-UE-S1AP-PDU-Transfer
    */
   public void setUsing_eab_UE_S1AP_PDU_Transfer() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_UE_S1AP_PDU_Transfer);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-CellLoadStateIndication
    */
   public void setUsing_eab_CellLoadStateIndication() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_CellLoadStateIndication);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Assign fields according to information object eab-EUTRAN-NR-E5-Transport
    */
   public void setUsing_eab_EUTRAN_NR_E5_Transport() {
      this.procedureCode = new asn.lte.generated.X2AP_Ericsson_CommonDataTypes.EAB_ProcedureCode(asn.lte.generated.X2AP_Ericsson_Constants._X2AP_Ericsson_ConstantsValues.eid_EUTRAN_NR_E5_Transport);
      this.criticality = asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore();
   }

   /**
    * Get value of value with type set according to information object eab-CellResourceControl
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellResourceControlResponse getValueFor_eab_CellResourceControl() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellResourceControlResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-CellSleepRequest
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellSleepResponse getValueFor_eab_CellSleepRequest() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellSleepResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-CellInformationFetch
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellInfoFetchResponse getValueFor_eab_CellInformationFetch() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_CellInfoFetchResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-Elastic-RAN-TunnelDeletion
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelDeletionResponse getValueFor_eab_Elastic_RAN_TunnelDeletion() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelDeletionResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-Elastic-RAN-TunnelSetup
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupResponse getValueFor_eab_Elastic_RAN_TunnelSetup() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-Elastic-RAN-TunnelSetupULComp
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupULCompResponse getValueFor_eab_Elastic_RAN_TunnelSetupULComp() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_Elastic_RAN_TunnelSetupULCompResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-IeNB-TunnelsDeletion
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsDeletionResponse getValueFor_eab_IeNB_TunnelsDeletion() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsDeletionResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-IeNB-TunnelsSetup
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupResponse getValueFor_eab_IeNB_TunnelsSetup() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-IeNB-TunnelsSetupULCoMP
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupULCoMPResponse getValueFor_eab_IeNB_TunnelsSetupULCoMP() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_IeNB_TunnelsSetupULCoMPResponse) this.value;
   }

   /**
    * Get value of value with type set according to information object eab-UEContextFetch
    */
   public asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_UEContextFetchResponse getValueFor_eab_UEContextFetch() {
      return (asn.lte.generated.X2AP_Ericsson_PDU_Contents.EAB_UEContextFetchResponse) this.value;
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // decode procedureCode

      buffer.getContext().eventDispatcher.startElement("procedureCode", -1);

      procedureCode = new EAB_ProcedureCode();
      procedureCode.decode (buffer);
      buffer.getContext().eventDispatcher.endElement("procedureCode", -1);

      // decode criticality

      buffer.getContext().eventDispatcher.startElement("criticality", -1);

      {
         int tval = Criticality.decodeEnumValue (buffer);
         criticality = Criticality.valueOf (tval);
      }
      buffer.getContext().eventDispatcher.endElement("criticality", -1);

      // decode value

      buffer.getContext().eventDispatcher.startElement("value", -1);

      value = new Asn1OpenType();
      value.decode (buffer);

      buffer.invokeCharacters(value.toString());
      buffer.getContext().eventDispatcher.endElement("value", -1);

      checkTC (true, buffer.getLazyOpenTypeDecode() ? 0 : 2, buffer.isAligned(), buffer.getContext().eventDispatcher);
   }

   public void checkTC(boolean decode, int decodeOpenTypeFlag, boolean aligned, Asn1NamedEventDispatcher eventDispatcher)
      throws Asn1Exception
   {
      /* check procedureCode */
      X2AP_EAB_ELEMENTARY_PROCEDURE _index = null;
      for(int i=0; i < _X2AP_Ericsson_PDU_DescriptionsValues.X2AP_EAB_ELEMENTARY_PROCEDURES.length; i++) {
         if(_X2AP_Ericsson_PDU_DescriptionsValues.X2AP_EAB_ELEMENTARY_PROCEDURES[i].procedureCode.equals(procedureCode)) {
            _index = _X2AP_Ericsson_PDU_DescriptionsValues.X2AP_EAB_ELEMENTARY_PROCEDURES[i];
            break;
         }
      }
      if (null == _index) {
         return;
      }

      /* check value */
      if( decode && decodeOpenTypeFlag >=1 ) {
         if(_index.SuccessfulOutcome != null)
         {
            try {
               Asn1PerDecodeBuffer buffer = new Asn1PerDecodeBuffer(((Asn1OpenType)value).value, aligned);
               buffer.setLazyOpenTypeDecode(decodeOpenTypeFlag == 1);
               if (eventDispatcher != null)buffer.getContext().eventDispatcher = eventDispatcher;
               buffer.getContext().eventDispatcher.startElement("value", -1);

               String className = _index.SuccessfulOutcome.actualType.getName();
               if (className.lastIndexOf('.') > 0) {
                  className = className.substring (className.lastIndexOf (".")+1);
               }
               buffer.getContext().eventDispatcher.startElement(className, -1);

               value = Asn1Type.decode(buffer, _index.SuccessfulOutcome);

               buffer.getContext().eventDispatcher.endElement(className, -1);

               buffer.getContext().eventDispatcher.endElement("value", -1);
            }
            catch (java.io.IOException e) {
               throw new Asn1Exception(e.toString());
            }
         }
      }

      /* use -strict option to validate the "criticality" element */
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (procedureCode.value == 10) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-CellResourceControl\n");
      }
      else if (procedureCode.value == 17) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-CellSleepRequest\n");
      }
      else if (procedureCode.value == 20) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-CellInformationFetch\n");
      }
      else if (procedureCode.value == 26) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-Elastic-RAN-TunnelDeletion\n");
      }
      else if (procedureCode.value == 21) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-Elastic-RAN-TunnelSetup\n");
      }
      else if (procedureCode.value == 27) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-Elastic-RAN-TunnelSetupULComp\n");
      }
      else if (procedureCode.value == 23) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-IeNB-TunnelsDeletion\n");
      }
      else if (procedureCode.value == 19) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-IeNB-TunnelsSetup\n");
      }
      else if (procedureCode.value == 25) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-IeNB-TunnelsSetupULCoMP\n");
      }
      else if (procedureCode.value == 12) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-UEContextFetch\n");
      }
      else if (procedureCode.value == 18) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-BasebandResetIndication\n");
      }
      else if (procedureCode.value == 0) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-ErrorIndication\n");
      }
      else if (procedureCode.value == 11) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-CellResourceStatusReport\n");
      }
      else if (procedureCode.value == 24) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-IeNB-TunnelsRelease\n");
      }
      else if (procedureCode.value == 15) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-OverlaidCellIndication\n");
      }
      else if (procedureCode.value == 22) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-TestCellIndication\n");
      }
      else if (procedureCode.value == 13) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-UEContextFetchAccept\n");
      }
      else if (procedureCode.value == 16) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-UE-S1AP-PDU-Transfer\n");
      }
      else if (procedureCode.value == 28) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-CellLoadStateIndication\n");
      }
      else if (procedureCode.value == 29) {
         indent (_sb, _level+1);
         _sb.append("procedureCode = eid-EUTRAN-NR-E5-Transport\n");
      }

      if (criticality != null) {
         criticality.print (_sb, "criticality", _level+1);
      }
      if (value != null) {
         String tmpName = value.getAsn1TypeName();
         if (tmpName != null && tmpName != "")  {
            tmpName = "value" + " (" + tmpName + ")";
         }
         else  {
            tmpName = "value";
         }
         value.print (_sb, tmpName, _level+1);
      }
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
