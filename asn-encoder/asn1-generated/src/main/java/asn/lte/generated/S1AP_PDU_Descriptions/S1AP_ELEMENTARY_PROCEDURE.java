/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_PDU_Descriptions;

import com.objsys.asn1j.runtime.*;
import asn.lte.generated.S1AP_CommonDataTypes.ProcedureCode;
import asn.lte.generated.S1AP_CommonDataTypes.Criticality;

public class S1AP_ELEMENTARY_PROCEDURE {
   public Asn1OpenTypeField InitiatingMessage;
   public Asn1OpenTypeField SuccessfulOutcome;
   public Asn1OpenTypeField UnsuccessfulOutcome;
   public ProcedureCode procedureCode;
   public Criticality criticality;

   public S1AP_ELEMENTARY_PROCEDURE() {
      InitiatingMessage = null;
      SuccessfulOutcome = null;
      UnsuccessfulOutcome = null;
      procedureCode = null;
      criticality = null;
   }

   public S1AP_ELEMENTARY_PROCEDURE(
      Asn1OpenTypeField InitiatingMessage_,
      Asn1OpenTypeField SuccessfulOutcome_,
      Asn1OpenTypeField UnsuccessfulOutcome_,
      ProcedureCode procedureCode_,
      Criticality criticality_
      ) {
      InitiatingMessage = InitiatingMessage_;
      SuccessfulOutcome = SuccessfulOutcome_;
      UnsuccessfulOutcome = UnsuccessfulOutcome_;
      procedureCode = procedureCode_;
      criticality = criticality_;
   }
}
