/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode;
import asn.lte.generated.X2AP_CommonDataTypes.Criticality;
import asn.lte.generated.X2AP_PDU_Contents.HandoverRequest;
import asn.lte.generated.X2AP_PDU_Contents.HandoverRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.HandoverPreparationFailure;
import asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues;
import asn.lte.generated.X2AP_PDU_Contents.SNStatusTransfer;
import asn.lte.generated.X2AP_PDU_Contents.UEContextRelease;
import asn.lte.generated.X2AP_PDU_Contents.HandoverCancel;
import asn.lte.generated.X2AP_PDU_Contents.HandoverReport;
import asn.lte.generated.X2AP_PDU_Contents.ErrorIndication;
import asn.lte.generated.X2AP_PDU_Contents.ResetRequest;
import asn.lte.generated.X2AP_PDU_Contents.ResetResponse;
import asn.lte.generated.X2AP_PDU_Contents.X2SetupRequest;
import asn.lte.generated.X2AP_PDU_Contents.X2SetupResponse;
import asn.lte.generated.X2AP_PDU_Contents.X2SetupFailure;
import asn.lte.generated.X2AP_PDU_Contents.LoadInformation;
import asn.lte.generated.X2AP_PDU_Contents.ENBConfigurationUpdate;
import asn.lte.generated.X2AP_PDU_Contents.ENBConfigurationUpdateAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.ENBConfigurationUpdateFailure;
import asn.lte.generated.X2AP_PDU_Contents.ResourceStatusRequest;
import asn.lte.generated.X2AP_PDU_Contents.ResourceStatusResponse;
import asn.lte.generated.X2AP_PDU_Contents.ResourceStatusFailure;
import asn.lte.generated.X2AP_PDU_Contents.ResourceStatusUpdate;
import asn.lte.generated.X2AP_PDU_Contents.RLFIndication;
import asn.lte.generated.X2AP_PDU_Contents.PrivateMessage;
import asn.lte.generated.X2AP_PDU_Contents.MobilityChangeRequest;
import asn.lte.generated.X2AP_PDU_Contents.MobilityChangeAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.MobilityChangeFailure;
import asn.lte.generated.X2AP_PDU_Contents.CellActivationRequest;
import asn.lte.generated.X2AP_PDU_Contents.CellActivationResponse;
import asn.lte.generated.X2AP_PDU_Contents.CellActivationFailure;
import asn.lte.generated.X2AP_PDU_Contents.X2Release;
import asn.lte.generated.X2AP_PDU_Contents.X2APMessageTransfer;
import asn.lte.generated.X2AP_PDU_Contents.SeNBAdditionRequest;
import asn.lte.generated.X2AP_PDU_Contents.SeNBAdditionRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.SeNBAdditionRequestReject;
import asn.lte.generated.X2AP_PDU_Contents.SeNBReconfigurationComplete;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationRequest;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationRequestReject;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationRequired;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationConfirm;
import asn.lte.generated.X2AP_PDU_Contents.SeNBModificationRefuse;
import asn.lte.generated.X2AP_PDU_Contents.SeNBReleaseRequest;
import asn.lte.generated.X2AP_PDU_Contents.SeNBReleaseRequired;
import asn.lte.generated.X2AP_PDU_Contents.SeNBReleaseConfirm;
import asn.lte.generated.X2AP_PDU_Contents.SeNBCounterCheckRequest;
import asn.lte.generated.X2AP_PDU_Contents.X2RemovalRequest;
import asn.lte.generated.X2AP_PDU_Contents.X2RemovalResponse;
import asn.lte.generated.X2AP_PDU_Contents.X2RemovalFailure;
import asn.lte.generated.X2AP_PDU_Contents.RetrieveUEContextRequest;
import asn.lte.generated.X2AP_PDU_Contents.RetrieveUEContextResponse;
import asn.lte.generated.X2AP_PDU_Contents.RetrieveUEContextFailure;
import asn.lte.generated.X2AP_PDU_Contents.SgNBAdditionRequest;
import asn.lte.generated.X2AP_PDU_Contents.SgNBAdditionRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.SgNBAdditionRequestReject;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReconfigurationComplete;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationRequest;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationRequestReject;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationRequired;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationConfirm;
import asn.lte.generated.X2AP_PDU_Contents.SgNBModificationRefuse;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReleaseRequest;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReleaseRequestAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReleaseRequestReject;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReleaseRequired;
import asn.lte.generated.X2AP_PDU_Contents.SgNBReleaseConfirm;
import asn.lte.generated.X2AP_PDU_Contents.SgNBCounterCheckRequest;
import asn.lte.generated.X2AP_PDU_Contents.SgNBChangeRequired;
import asn.lte.generated.X2AP_PDU_Contents.SgNBChangeConfirm;
import asn.lte.generated.X2AP_PDU_Contents.SgNBChangeRefuse;
import asn.lte.generated.X2AP_PDU_Contents.RRCTransfer;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2SetupRequest;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2SetupResponse;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2SetupFailure;
import asn.lte.generated.X2AP_PDU_Contents.ENDCConfigurationUpdate;
import asn.lte.generated.X2AP_PDU_Contents.ENDCConfigurationUpdateAcknowledge;
import asn.lte.generated.X2AP_PDU_Contents.ENDCConfigurationUpdateFailure;
import asn.lte.generated.X2AP_PDU_Contents.SecondaryRATDataUsageReport;
import asn.lte.generated.X2AP_PDU_Contents.ENDCCellActivationRequest;
import asn.lte.generated.X2AP_PDU_Contents.ENDCCellActivationResponse;
import asn.lte.generated.X2AP_PDU_Contents.ENDCCellActivationFailure;
import asn.lte.generated.X2AP_PDU_Contents.ENDCPartialResetRequired;
import asn.lte.generated.X2AP_PDU_Contents.ENDCPartialResetConfirm;
import asn.lte.generated.X2AP_PDU_Contents.EUTRANRCellResourceCoordinationRequest;
import asn.lte.generated.X2AP_PDU_Contents.EUTRANRCellResourceCoordinationResponse;
import asn.lte.generated.X2AP_PDU_Contents.SgNBActivityNotification;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2RemovalRequest;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2RemovalResponse;
import asn.lte.generated.X2AP_PDU_Contents.ENDCX2RemovalFailure;
import asn.lte.generated.X2AP_PDU_Contents.DataForwardingAddressIndication;
import asn.lte.generated.X2AP_PDU_Contents.GNBStatusIndication;
import asn.lte.generated.X2AP_PDU_Contents.ENDCConfigurationTransfer;
import asn.lte.generated.X2AP_PDU_Contents.DeactivateTrace;
import asn.lte.generated.X2AP_PDU_Contents.TraceStart;

public class _X2AP_PDU_DescriptionsValues {

   public static final X2AP_ELEMENTARY_PROCEDURE handoverPreparation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(HandoverRequest.class, null, "HandoverRequest"),
         new Asn1OpenTypeField(HandoverRequestAcknowledge.class, null, "HandoverRequestAcknowledge"),
         new Asn1OpenTypeField(HandoverPreparationFailure.class, null, "HandoverPreparationFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_handoverPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE snStatusTransfer = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SNStatusTransfer.class, null, "SNStatusTransfer"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_snStatusTransfer),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE uEContextRelease = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(UEContextRelease.class, null, "UEContextRelease"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_uEContextRelease),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE handoverCancel = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(HandoverCancel.class, null, "HandoverCancel"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_handoverCancel),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE handoverReport = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(HandoverReport.class, null, "HandoverReport"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_handoverReport),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE errorIndication = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ErrorIndication.class, null, "ErrorIndication"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_errorIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE reset = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ResetRequest.class, null, "ResetRequest"),
         new Asn1OpenTypeField(ResetResponse.class, null, "ResetResponse"),
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_reset),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE x2Setup = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(X2SetupRequest.class, null, "X2SetupRequest"),
         new Asn1OpenTypeField(X2SetupResponse.class, null, "X2SetupResponse"),
         new Asn1OpenTypeField(X2SetupFailure.class, null, "X2SetupFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_x2Setup),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE loadIndication = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(LoadInformation.class, null, "LoadInformation"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_loadIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE eNBConfigurationUpdate = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENBConfigurationUpdate.class, null, "ENBConfigurationUpdate"),
         new Asn1OpenTypeField(ENBConfigurationUpdateAcknowledge.class, null, "ENBConfigurationUpdateAcknowledge"),
         new Asn1OpenTypeField(ENBConfigurationUpdateFailure.class, null, "ENBConfigurationUpdateFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_eNBConfigurationUpdate),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE resourceStatusReportingInitiation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ResourceStatusRequest.class, null, "ResourceStatusRequest"),
         new Asn1OpenTypeField(ResourceStatusResponse.class, null, "ResourceStatusResponse"),
         new Asn1OpenTypeField(ResourceStatusFailure.class, null, "ResourceStatusFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_resourceStatusReportingInitiation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE resourceStatusReporting = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ResourceStatusUpdate.class, null, "ResourceStatusUpdate"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_resourceStatusReporting),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE rLFIndication = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(RLFIndication.class, null, "RLFIndication"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_rLFIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE privateMessage = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(PrivateMessage.class, null, "PrivateMessage"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_privateMessage),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE mobilitySettingsChange = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(MobilityChangeRequest.class, null, "MobilityChangeRequest"),
         new Asn1OpenTypeField(MobilityChangeAcknowledge.class, null, "MobilityChangeAcknowledge"),
         new Asn1OpenTypeField(MobilityChangeFailure.class, null, "MobilityChangeFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_mobilitySettingsChange),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE cellActivation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(CellActivationRequest.class, null, "CellActivationRequest"),
         new Asn1OpenTypeField(CellActivationResponse.class, null, "CellActivationResponse"),
         new Asn1OpenTypeField(CellActivationFailure.class, null, "CellActivationFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_cellActivation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE x2Release = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(X2Release.class, null, "X2Release"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_x2Release),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE x2APMessageTransfer = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(X2APMessageTransfer.class, null, "X2APMessageTransfer"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_x2APMessageTransfer),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE seNBAdditionPreparation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBAdditionRequest.class, null, "SeNBAdditionRequest"),
         new Asn1OpenTypeField(SeNBAdditionRequestAcknowledge.class, null, "SeNBAdditionRequestAcknowledge"),
         new Asn1OpenTypeField(SeNBAdditionRequestReject.class, null, "SeNBAdditionRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_seNBAdditionPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE seNBReconfigurationCompletion = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBReconfigurationComplete.class, null, "SeNBReconfigurationComplete"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_seNBReconfigurationCompletion),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE meNBinitiatedSeNBModificationPreparation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBModificationRequest.class, null, "SeNBModificationRequest"),
         new Asn1OpenTypeField(SeNBModificationRequestAcknowledge.class, null, "SeNBModificationRequestAcknowledge"),
         new Asn1OpenTypeField(SeNBModificationRequestReject.class, null, "SeNBModificationRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_meNBinitiatedSeNBModificationPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE seNBinitiatedSeNBModification = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBModificationRequired.class, null, "SeNBModificationRequired"),
         new Asn1OpenTypeField(SeNBModificationConfirm.class, null, "SeNBModificationConfirm"),
         new Asn1OpenTypeField(SeNBModificationRefuse.class, null, "SeNBModificationRefuse"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_seNBinitiatedSeNBModification),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE meNBinitiatedSeNBRelease = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBReleaseRequest.class, null, "SeNBReleaseRequest"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_meNBinitiatedSeNBRelease),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE seNBinitiatedSeNBRelease = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBReleaseRequired.class, null, "SeNBReleaseRequired"),
         new Asn1OpenTypeField(SeNBReleaseConfirm.class, null, "SeNBReleaseConfirm"),
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_seNBinitiatedSeNBRelease),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE seNBCounterCheck = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SeNBCounterCheckRequest.class, null, "SeNBCounterCheckRequest"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_seNBCounterCheck),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE x2Removal = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(X2RemovalRequest.class, null, "X2RemovalRequest"),
         new Asn1OpenTypeField(X2RemovalResponse.class, null, "X2RemovalResponse"),
         new Asn1OpenTypeField(X2RemovalFailure.class, null, "X2RemovalFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_x2Removal),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE retrieveUEContext = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(RetrieveUEContextRequest.class, null, "RetrieveUEContextRequest"),
         new Asn1OpenTypeField(RetrieveUEContextResponse.class, null, "RetrieveUEContextResponse"),
         new Asn1OpenTypeField(RetrieveUEContextFailure.class, null, "RetrieveUEContextFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_retrieveUEContext),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBAdditionPreparation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBAdditionRequest.class, null, "SgNBAdditionRequest"),
         new Asn1OpenTypeField(SgNBAdditionRequestAcknowledge.class, null, "SgNBAdditionRequestAcknowledge"),
         new Asn1OpenTypeField(SgNBAdditionRequestReject.class, null, "SgNBAdditionRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBAdditionPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBReconfigurationCompletion = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBReconfigurationComplete.class, null, "SgNBReconfigurationComplete"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBReconfigurationCompletion),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE meNBinitiatedSgNBModificationPreparation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBModificationRequest.class, null, "SgNBModificationRequest"),
         new Asn1OpenTypeField(SgNBModificationRequestAcknowledge.class, null, "SgNBModificationRequestAcknowledge"),
         new Asn1OpenTypeField(SgNBModificationRequestReject.class, null, "SgNBModificationRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_meNBinitiatedSgNBModificationPreparation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBinitiatedSgNBModification = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBModificationRequired.class, null, "SgNBModificationRequired"),
         new Asn1OpenTypeField(SgNBModificationConfirm.class, null, "SgNBModificationConfirm"),
         new Asn1OpenTypeField(SgNBModificationRefuse.class, null, "SgNBModificationRefuse"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBinitiatedSgNBModification),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE meNBinitiatedSgNBRelease = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBReleaseRequest.class, null, "SgNBReleaseRequest"),
         new Asn1OpenTypeField(SgNBReleaseRequestAcknowledge.class, null, "SgNBReleaseRequestAcknowledge"),
         new Asn1OpenTypeField(SgNBReleaseRequestReject.class, null, "SgNBReleaseRequestReject"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_meNBinitiatedSgNBRelease),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBinitiatedSgNBRelease = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBReleaseRequired.class, null, "SgNBReleaseRequired"),
         new Asn1OpenTypeField(SgNBReleaseConfirm.class, null, "SgNBReleaseConfirm"),
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBinitiatedSgNBRelease),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBCounterCheck = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBCounterCheckRequest.class, null, "SgNBCounterCheckRequest"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBCounterCheck),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBChange = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBChangeRequired.class, null, "SgNBChangeRequired"),
         new Asn1OpenTypeField(SgNBChangeConfirm.class, null, "SgNBChangeConfirm"),
         new Asn1OpenTypeField(SgNBChangeRefuse.class, null, "SgNBChangeRefuse"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_sgNBChange),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE rRCTransfer = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(RRCTransfer.class, null, "RRCTransfer"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_rRCTransfer),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE endcX2Setup = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCX2SetupRequest.class, null, "ENDCX2SetupRequest"),
         new Asn1OpenTypeField(ENDCX2SetupResponse.class, null, "ENDCX2SetupResponse"),
         new Asn1OpenTypeField(ENDCX2SetupFailure.class, null, "ENDCX2SetupFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcX2Setup),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE endcConfigurationUpdate = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCConfigurationUpdate.class, null, "ENDCConfigurationUpdate"),
         new Asn1OpenTypeField(ENDCConfigurationUpdateAcknowledge.class, null, "ENDCConfigurationUpdateAcknowledge"),
         new Asn1OpenTypeField(ENDCConfigurationUpdateFailure.class, null, "ENDCConfigurationUpdateFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcConfigurationUpdate),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE secondaryRATDataUsageReport = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SecondaryRATDataUsageReport.class, null, "SecondaryRATDataUsageReport"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_secondaryRATDataUsageReport),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE endcCellActivation = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCCellActivationRequest.class, null, "ENDCCellActivationRequest"),
         new Asn1OpenTypeField(ENDCCellActivationResponse.class, null, "ENDCCellActivationResponse"),
         new Asn1OpenTypeField(ENDCCellActivationFailure.class, null, "ENDCCellActivationFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcCellActivation),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE endcPartialReset = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCPartialResetRequired.class, null, "ENDCPartialResetRequired"),
         new Asn1OpenTypeField(ENDCPartialResetConfirm.class, null, "ENDCPartialResetConfirm"),
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcPartialReset),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE eUTRANRCellResourceCoordination = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(EUTRANRCellResourceCoordinationRequest.class, null, "EUTRANRCellResourceCoordinationRequest"),
         new Asn1OpenTypeField(EUTRANRCellResourceCoordinationResponse.class, null, "EUTRANRCellResourceCoordinationResponse"),
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_eUTRANRCellResourceCoordination),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE sgNBActivityNotification = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(SgNBActivityNotification.class, null, "SgNBActivityNotification"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_SgNBActivityNotification),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE endcX2Removal = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCX2RemovalRequest.class, null, "ENDCX2RemovalRequest"),
         new Asn1OpenTypeField(ENDCX2RemovalResponse.class, null, "ENDCX2RemovalResponse"),
         new Asn1OpenTypeField(ENDCX2RemovalFailure.class, null, "ENDCX2RemovalFailure"),
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcX2Removal),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.reject());

   public static final X2AP_ELEMENTARY_PROCEDURE dataForwardingAddressIndication = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(DataForwardingAddressIndication.class, null, "DataForwardingAddressIndication"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_dataForwardingAddressIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE gNBStatusIndication = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(GNBStatusIndication.class, null, "GNBStatusIndication"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_gNBStatusIndication),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE endcConfigurationTransfer = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(ENDCConfigurationTransfer.class, null, "ENDCConfigurationTransfer"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_endcConfigurationTransfer),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE deactivateTrace = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(DeactivateTrace.class, null, "DeactivateTrace"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_deactivateTrace),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE traceStart = 
      new X2AP_ELEMENTARY_PROCEDURE (
         new Asn1OpenTypeField(TraceStart.class, null, "TraceStart"),
         null,
         null,
         new asn.lte.generated.X2AP_CommonDataTypes.ProcedureCode(asn.lte.generated.X2AP_Constants._X2AP_ConstantsValues.id_traceStart),
         asn.lte.generated.X2AP_CommonDataTypes.Criticality.ignore());

   public static final X2AP_ELEMENTARY_PROCEDURE[] X2AP_ELEMENTARY_PROCEDURES = 
      new X2AP_ELEMENTARY_PROCEDURE[] {
         _X2AP_PDU_DescriptionsValues.handoverPreparation,
         _X2AP_PDU_DescriptionsValues.reset,
         _X2AP_PDU_DescriptionsValues.x2Setup,
         _X2AP_PDU_DescriptionsValues.resourceStatusReportingInitiation,
         _X2AP_PDU_DescriptionsValues.eNBConfigurationUpdate,
         _X2AP_PDU_DescriptionsValues.mobilitySettingsChange,
         _X2AP_PDU_DescriptionsValues.cellActivation,
         _X2AP_PDU_DescriptionsValues.seNBAdditionPreparation,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSeNBModificationPreparation,
         _X2AP_PDU_DescriptionsValues.seNBinitiatedSeNBModification,
         _X2AP_PDU_DescriptionsValues.seNBinitiatedSeNBRelease,
         _X2AP_PDU_DescriptionsValues.x2Removal,
         _X2AP_PDU_DescriptionsValues.retrieveUEContext,
         _X2AP_PDU_DescriptionsValues.sgNBAdditionPreparation,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSgNBModificationPreparation,
         _X2AP_PDU_DescriptionsValues.sgNBinitiatedSgNBModification,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSgNBRelease,
         _X2AP_PDU_DescriptionsValues.sgNBinitiatedSgNBRelease,
         _X2AP_PDU_DescriptionsValues.sgNBChange,
         _X2AP_PDU_DescriptionsValues.endcX2Setup,
         _X2AP_PDU_DescriptionsValues.endcConfigurationUpdate,
         _X2AP_PDU_DescriptionsValues.endcCellActivation,
         _X2AP_PDU_DescriptionsValues.endcPartialReset,
         _X2AP_PDU_DescriptionsValues.eUTRANRCellResourceCoordination,
         _X2AP_PDU_DescriptionsValues.endcX2Removal,
         _X2AP_PDU_DescriptionsValues.snStatusTransfer,
         _X2AP_PDU_DescriptionsValues.uEContextRelease,
         _X2AP_PDU_DescriptionsValues.handoverCancel,
         _X2AP_PDU_DescriptionsValues.errorIndication,
         _X2AP_PDU_DescriptionsValues.resourceStatusReporting,
         _X2AP_PDU_DescriptionsValues.loadIndication,
         _X2AP_PDU_DescriptionsValues.privateMessage,
         _X2AP_PDU_DescriptionsValues.rLFIndication,
         _X2AP_PDU_DescriptionsValues.handoverReport,
         _X2AP_PDU_DescriptionsValues.x2Release,
         _X2AP_PDU_DescriptionsValues.x2APMessageTransfer,
         _X2AP_PDU_DescriptionsValues.seNBReconfigurationCompletion,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSeNBRelease,
         _X2AP_PDU_DescriptionsValues.seNBCounterCheck,
         _X2AP_PDU_DescriptionsValues.sgNBReconfigurationCompletion,
         _X2AP_PDU_DescriptionsValues.sgNBCounterCheck,
         _X2AP_PDU_DescriptionsValues.rRCTransfer,
         _X2AP_PDU_DescriptionsValues.secondaryRATDataUsageReport,
         _X2AP_PDU_DescriptionsValues.sgNBActivityNotification,
         _X2AP_PDU_DescriptionsValues.dataForwardingAddressIndication,
         _X2AP_PDU_DescriptionsValues.gNBStatusIndication,
         _X2AP_PDU_DescriptionsValues.endcConfigurationTransfer,
         _X2AP_PDU_DescriptionsValues.deactivateTrace,
         _X2AP_PDU_DescriptionsValues.traceStart
      };

   public static final X2AP_ELEMENTARY_PROCEDURE[] X2AP_ELEMENTARY_PROCEDURES_CLASS_1 = 
      new X2AP_ELEMENTARY_PROCEDURE[] {
         _X2AP_PDU_DescriptionsValues.handoverPreparation,
         _X2AP_PDU_DescriptionsValues.reset,
         _X2AP_PDU_DescriptionsValues.x2Setup,
         _X2AP_PDU_DescriptionsValues.resourceStatusReportingInitiation,
         _X2AP_PDU_DescriptionsValues.eNBConfigurationUpdate,
         _X2AP_PDU_DescriptionsValues.mobilitySettingsChange,
         _X2AP_PDU_DescriptionsValues.cellActivation,
         _X2AP_PDU_DescriptionsValues.seNBAdditionPreparation,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSeNBModificationPreparation,
         _X2AP_PDU_DescriptionsValues.seNBinitiatedSeNBModification,
         _X2AP_PDU_DescriptionsValues.seNBinitiatedSeNBRelease,
         _X2AP_PDU_DescriptionsValues.x2Removal,
         _X2AP_PDU_DescriptionsValues.retrieveUEContext,
         _X2AP_PDU_DescriptionsValues.sgNBAdditionPreparation,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSgNBModificationPreparation,
         _X2AP_PDU_DescriptionsValues.sgNBinitiatedSgNBModification,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSgNBRelease,
         _X2AP_PDU_DescriptionsValues.sgNBinitiatedSgNBRelease,
         _X2AP_PDU_DescriptionsValues.sgNBChange,
         _X2AP_PDU_DescriptionsValues.endcX2Setup,
         _X2AP_PDU_DescriptionsValues.endcConfigurationUpdate,
         _X2AP_PDU_DescriptionsValues.endcCellActivation,
         _X2AP_PDU_DescriptionsValues.endcPartialReset,
         _X2AP_PDU_DescriptionsValues.eUTRANRCellResourceCoordination,
         _X2AP_PDU_DescriptionsValues.endcX2Removal
      };

   public static final X2AP_ELEMENTARY_PROCEDURE[] X2AP_ELEMENTARY_PROCEDURES_CLASS_2 = 
      new X2AP_ELEMENTARY_PROCEDURE[] {
         _X2AP_PDU_DescriptionsValues.snStatusTransfer,
         _X2AP_PDU_DescriptionsValues.uEContextRelease,
         _X2AP_PDU_DescriptionsValues.handoverCancel,
         _X2AP_PDU_DescriptionsValues.errorIndication,
         _X2AP_PDU_DescriptionsValues.resourceStatusReporting,
         _X2AP_PDU_DescriptionsValues.loadIndication,
         _X2AP_PDU_DescriptionsValues.privateMessage,
         _X2AP_PDU_DescriptionsValues.rLFIndication,
         _X2AP_PDU_DescriptionsValues.handoverReport,
         _X2AP_PDU_DescriptionsValues.x2Release,
         _X2AP_PDU_DescriptionsValues.x2APMessageTransfer,
         _X2AP_PDU_DescriptionsValues.seNBReconfigurationCompletion,
         _X2AP_PDU_DescriptionsValues.meNBinitiatedSeNBRelease,
         _X2AP_PDU_DescriptionsValues.seNBCounterCheck,
         _X2AP_PDU_DescriptionsValues.sgNBReconfigurationCompletion,
         _X2AP_PDU_DescriptionsValues.sgNBCounterCheck,
         _X2AP_PDU_DescriptionsValues.rRCTransfer,
         _X2AP_PDU_DescriptionsValues.secondaryRATDataUsageReport,
         _X2AP_PDU_DescriptionsValues.sgNBActivityNotification,
         _X2AP_PDU_DescriptionsValues.dataForwardingAddressIndication,
         _X2AP_PDU_DescriptionsValues.gNBStatusIndication,
         _X2AP_PDU_DescriptionsValues.endcConfigurationTransfer,
         _X2AP_PDU_DescriptionsValues.deactivateTrace,
         _X2AP_PDU_DescriptionsValues.traceStart
      };

}

