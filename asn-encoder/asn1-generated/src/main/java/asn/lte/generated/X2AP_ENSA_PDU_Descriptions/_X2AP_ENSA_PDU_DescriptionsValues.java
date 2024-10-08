/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_ENSA_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ErrorIndication;
import asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupRequest;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupResponse;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_X2SetupFailure;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdate;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdateAcknowledge;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_ConfigurationUpdateFailure;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequest;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequestAcknowledge;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBAdditionRequestReject;
import asn.lte.generated.X2AP_ENSA_PDU_Contents.ENSA_SgNBReconfigurationComplete;

public class _X2AP_ENSA_PDU_DescriptionsValues {

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE ensa_ErrorIndication = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENSA_ErrorIndication.class, null, "ENSA-ErrorIndication"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_ErrorIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE ensa_X2Setup = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENSA_X2SetupRequest.class, null, "ENSA-X2SetupRequest"),
         new Asn1OpenTypeField(ENSA_X2SetupResponse.class, null, "ENSA-X2SetupResponse"),
         new Asn1OpenTypeField(ENSA_X2SetupFailure.class, null, "ENSA-X2SetupFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_X2Setup),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE ensa_ConfigurationUpdate = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENSA_ConfigurationUpdate.class, null, "ENSA-ConfigurationUpdate"),
         new Asn1OpenTypeField(ENSA_ConfigurationUpdateAcknowledge.class, null, "ENSA-ConfigurationUpdateAcknowledge"),
         new Asn1OpenTypeField(ENSA_ConfigurationUpdateFailure.class, null, "ENSA-ConfigurationUpdateFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_ConfigurationUpdate),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE ensa_sgNBAdditionPreparation = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENSA_SgNBAdditionRequest.class, null, "ENSA-SgNBAdditionRequest"),
         new Asn1OpenTypeField(ENSA_SgNBAdditionRequestAcknowledge.class, null, "ENSA-SgNBAdditionRequestAcknowledge"),
         new Asn1OpenTypeField(ENSA_SgNBAdditionRequestReject.class, null, "ENSA-SgNBAdditionRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_sgNBAdditionPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE ensa_sgNBReconfigurationCompletion = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENSA_SgNBReconfigurationComplete.class, null, "ENSA-SgNBReconfigurationComplete"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_ENSA_Constants._X2AP_ENSA_ConstantsValues.xid_sgNBReconfigurationCompletion),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE[] X2AP_ENSA_ELEMENTARY_PROCEDURES = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE[] {
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_X2Setup,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_ConfigurationUpdate,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_sgNBAdditionPreparation,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_ErrorIndication,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_sgNBReconfigurationCompletion
      };

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE[] X2AP_ENSA_ELEMENTARY_PROCEDURES_CLASS_1 = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE[] {
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_X2Setup,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_ConfigurationUpdate,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_sgNBAdditionPreparation
      };

   public static final X2AP_ENSA_ELEMENTARY_PROCEDURE[] X2AP_ENSA_ELEMENTARY_PROCEDURES_CLASS_2 = 
      new X2AP_ENSA_ELEMENTARY_PROCEDURE[] {
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_ErrorIndication,
         _X2AP_ENSA_PDU_DescriptionsValues.ensa_sgNBReconfigurationCompletion
      };

}

