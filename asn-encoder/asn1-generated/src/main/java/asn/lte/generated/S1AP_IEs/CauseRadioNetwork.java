/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.S1AP_IEs;

import com.objsys.asn1j.runtime.*;

public class CauseRadioNetwork extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_S1AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CauseRadioNetwork";
   }

   // Integer constants for switch-case
   public static final int _UNSPECIFIED = 0;
   public static final int _TX2RELOCOVERALL_EXPIRY = 1;
   public static final int _SUCCESSFUL_HANDOVER = 2;
   public static final int _RELEASE_DUE_TO_EUTRAN_GENERATED_REASON = 3;
   public static final int _HANDOVER_CANCELLED = 4;
   public static final int _PARTIAL_HANDOVER = 5;
   public static final int _HO_FAILURE_IN_TARGET_EPC_ENB_OR_TARGET_SYSTEM = 6;
   public static final int _HO_TARGET_NOT_ALLOWED = 7;
   public static final int _TS1RELOCOVERALL_EXPIRY = 8;
   public static final int _TS1RELOCPREP_EXPIRY = 9;
   public static final int _CELL_NOT_AVAILABLE = 10;
   public static final int _UNKNOWN_TARGETID = 11;
   public static final int _NO_RADIO_RESOURCES_AVAILABLE_IN_TARGET_CELL = 12;
   public static final int _UNKNOWN_MME_UE_S1AP_ID = 13;
   public static final int _UNKNOWN_ENB_UE_S1AP_ID = 14;
   public static final int _UNKNOWN_PAIR_UE_S1AP_ID = 15;
   public static final int _HANDOVER_DESIRABLE_FOR_RADIO_REASON = 16;
   public static final int _TIME_CRITICAL_HANDOVER = 17;
   public static final int _RESOURCE_OPTIMISATION_HANDOVER = 18;
   public static final int _REDUCE_LOAD_IN_SERVING_CELL = 19;
   public static final int _USER_INACTIVITY = 20;
   public static final int _RADIO_CONNECTION_WITH_UE_LOST = 21;
   public static final int _LOAD_BALANCING_TAU_REQUIRED = 22;
   public static final int _CS_FALLBACK_TRIGGERED = 23;
   public static final int _UE_NOT_AVAILABLE_FOR_PS_SERVICE = 24;
   public static final int _RADIO_RESOURCES_NOT_AVAILABLE = 25;
   public static final int _FAILURE_IN_RADIO_INTERFACE_PROCEDURE = 26;
   public static final int _INVALID_QOS_COMBINATION = 27;
   public static final int _INTERRAT_REDIRECTION = 28;
   public static final int _INTERACTION_WITH_OTHER_PROCEDURE = 29;
   public static final int _UNKNOWN_E_RAB_ID = 30;
   public static final int _MULTIPLE_E_RAB_ID_INSTANCES = 31;
   public static final int _ENCRYPTION_AND_OR_INTEGRITY_PROTECTION_ALGORITHMS_NOT_SUPPORTED = 32;
   public static final int _S1_INTRA_SYSTEM_HANDOVER_TRIGGERED = 33;
   public static final int _S1_INTER_SYSTEM_HANDOVER_TRIGGERED = 34;
   public static final int _X2_HANDOVER_TRIGGERED = 35;
   public static final int _REDIRECTION_TOWARDS_1XRTT = 36;
   public static final int _NOT_SUPPORTED_QCI_VALUE = 37;
   public static final int _INVALID_CSG_ID = 38;
   public static final int _RELEASE_DUE_TO_PRE_EMPTION = 39;

   // Singleton instances of CauseRadioNetwork
   protected static final CauseRadioNetwork _unspecified = new CauseRadioNetwork(0);
   protected static final CauseRadioNetwork _tx2relocoverall_expiry = new CauseRadioNetwork(1);
   protected static final CauseRadioNetwork _successful_handover = new CauseRadioNetwork(2);
   protected static final CauseRadioNetwork _release_due_to_eutran_generated_reason = new CauseRadioNetwork(3);
   protected static final CauseRadioNetwork _handover_cancelled = new CauseRadioNetwork(4);
   protected static final CauseRadioNetwork _partial_handover = new CauseRadioNetwork(5);
   protected static final CauseRadioNetwork _ho_failure_in_target_EPC_eNB_or_target_system = new CauseRadioNetwork(6);
   protected static final CauseRadioNetwork _ho_target_not_allowed = new CauseRadioNetwork(7);
   protected static final CauseRadioNetwork _tS1relocoverall_expiry = new CauseRadioNetwork(8);
   protected static final CauseRadioNetwork _tS1relocprep_expiry = new CauseRadioNetwork(9);
   protected static final CauseRadioNetwork _cell_not_available = new CauseRadioNetwork(10);
   protected static final CauseRadioNetwork _unknown_targetID = new CauseRadioNetwork(11);
   protected static final CauseRadioNetwork _no_radio_resources_available_in_target_cell = new CauseRadioNetwork(12);
   protected static final CauseRadioNetwork _unknown_mme_ue_s1ap_id = new CauseRadioNetwork(13);
   protected static final CauseRadioNetwork _unknown_enb_ue_s1ap_id = new CauseRadioNetwork(14);
   protected static final CauseRadioNetwork _unknown_pair_ue_s1ap_id = new CauseRadioNetwork(15);
   protected static final CauseRadioNetwork _handover_desirable_for_radio_reason = new CauseRadioNetwork(16);
   protected static final CauseRadioNetwork _time_critical_handover = new CauseRadioNetwork(17);
   protected static final CauseRadioNetwork _resource_optimisation_handover = new CauseRadioNetwork(18);
   protected static final CauseRadioNetwork _reduce_load_in_serving_cell = new CauseRadioNetwork(19);
   protected static final CauseRadioNetwork _user_inactivity = new CauseRadioNetwork(20);
   protected static final CauseRadioNetwork _radio_connection_with_ue_lost = new CauseRadioNetwork(21);
   protected static final CauseRadioNetwork _load_balancing_tau_required = new CauseRadioNetwork(22);
   protected static final CauseRadioNetwork _cs_fallback_triggered = new CauseRadioNetwork(23);
   protected static final CauseRadioNetwork _ue_not_available_for_ps_service = new CauseRadioNetwork(24);
   protected static final CauseRadioNetwork _radio_resources_not_available = new CauseRadioNetwork(25);
   protected static final CauseRadioNetwork _failure_in_radio_interface_procedure = new CauseRadioNetwork(26);
   protected static final CauseRadioNetwork _invalid_qos_combination = new CauseRadioNetwork(27);
   protected static final CauseRadioNetwork _interrat_redirection = new CauseRadioNetwork(28);
   protected static final CauseRadioNetwork _interaction_with_other_procedure = new CauseRadioNetwork(29);
   protected static final CauseRadioNetwork _unknown_E_RAB_ID = new CauseRadioNetwork(30);
   protected static final CauseRadioNetwork _multiple_E_RAB_ID_instances = new CauseRadioNetwork(31);
   protected static final CauseRadioNetwork _encryption_and_or_integrity_protection_algorithms_not_supported = new CauseRadioNetwork(32);
   protected static final CauseRadioNetwork _s1_intra_system_handover_triggered = new CauseRadioNetwork(33);
   protected static final CauseRadioNetwork _s1_inter_system_handover_triggered = new CauseRadioNetwork(34);
   protected static final CauseRadioNetwork _x2_handover_triggered = new CauseRadioNetwork(35);
   protected static final CauseRadioNetwork _redirection_towards_1xRTT = new CauseRadioNetwork(36);
   protected static final CauseRadioNetwork _not_supported_QCI_value = new CauseRadioNetwork(37);
   protected static final CauseRadioNetwork _invalid_CSG_Id = new CauseRadioNetwork(38);
   protected static final CauseRadioNetwork _release_due_to_pre_emption = new CauseRadioNetwork(39);
   private static CauseRadioNetwork __undefined = new CauseRadioNetwork(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    *   8
    *   9
    *   10
    *   11
    *   12
    *   13
    *   14
    *   15
    *   16
    *   17
    *   18
    *   19
    *   20
    *   21
    *   22
    *   23
    *   24
    *   25
    *   26
    *   27
    *   28
    *   29
    *   30
    *   31
    *   32
    *   33
    *   34
    *   35
    *   36
    *   37
    *   38
    *   39
    */
   protected CauseRadioNetwork (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for unspecified.
    */
   public static CauseRadioNetwork unspecified() {
      return _unspecified;
   }

   /**
    * Singleton accessor method for tx2relocoverall_expiry.
    */
   public static CauseRadioNetwork tx2relocoverall_expiry() {
      return _tx2relocoverall_expiry;
   }

   /**
    * Singleton accessor method for successful_handover.
    */
   public static CauseRadioNetwork successful_handover() {
      return _successful_handover;
   }

   /**
    * Singleton accessor method for release_due_to_eutran_generated_reason.
    */
   public static CauseRadioNetwork release_due_to_eutran_generated_reason() {
      return _release_due_to_eutran_generated_reason;
   }

   /**
    * Singleton accessor method for handover_cancelled.
    */
   public static CauseRadioNetwork handover_cancelled() {
      return _handover_cancelled;
   }

   /**
    * Singleton accessor method for partial_handover.
    */
   public static CauseRadioNetwork partial_handover() {
      return _partial_handover;
   }

   /**
    * Singleton accessor method for ho_failure_in_target_EPC_eNB_or_target_system.
    */
   public static CauseRadioNetwork ho_failure_in_target_EPC_eNB_or_target_system() {
      return _ho_failure_in_target_EPC_eNB_or_target_system;
   }

   /**
    * Singleton accessor method for ho_target_not_allowed.
    */
   public static CauseRadioNetwork ho_target_not_allowed() {
      return _ho_target_not_allowed;
   }

   /**
    * Singleton accessor method for tS1relocoverall_expiry.
    */
   public static CauseRadioNetwork tS1relocoverall_expiry() {
      return _tS1relocoverall_expiry;
   }

   /**
    * Singleton accessor method for tS1relocprep_expiry.
    */
   public static CauseRadioNetwork tS1relocprep_expiry() {
      return _tS1relocprep_expiry;
   }

   /**
    * Singleton accessor method for cell_not_available.
    */
   public static CauseRadioNetwork cell_not_available() {
      return _cell_not_available;
   }

   /**
    * Singleton accessor method for unknown_targetID.
    */
   public static CauseRadioNetwork unknown_targetID() {
      return _unknown_targetID;
   }

   /**
    * Singleton accessor method for no_radio_resources_available_in_target_cell.
    */
   public static CauseRadioNetwork no_radio_resources_available_in_target_cell() {
      return _no_radio_resources_available_in_target_cell;
   }

   /**
    * Singleton accessor method for unknown_mme_ue_s1ap_id.
    */
   public static CauseRadioNetwork unknown_mme_ue_s1ap_id() {
      return _unknown_mme_ue_s1ap_id;
   }

   /**
    * Singleton accessor method for unknown_enb_ue_s1ap_id.
    */
   public static CauseRadioNetwork unknown_enb_ue_s1ap_id() {
      return _unknown_enb_ue_s1ap_id;
   }

   /**
    * Singleton accessor method for unknown_pair_ue_s1ap_id.
    */
   public static CauseRadioNetwork unknown_pair_ue_s1ap_id() {
      return _unknown_pair_ue_s1ap_id;
   }

   /**
    * Singleton accessor method for handover_desirable_for_radio_reason.
    */
   public static CauseRadioNetwork handover_desirable_for_radio_reason() {
      return _handover_desirable_for_radio_reason;
   }

   /**
    * Singleton accessor method for time_critical_handover.
    */
   public static CauseRadioNetwork time_critical_handover() {
      return _time_critical_handover;
   }

   /**
    * Singleton accessor method for resource_optimisation_handover.
    */
   public static CauseRadioNetwork resource_optimisation_handover() {
      return _resource_optimisation_handover;
   }

   /**
    * Singleton accessor method for reduce_load_in_serving_cell.
    */
   public static CauseRadioNetwork reduce_load_in_serving_cell() {
      return _reduce_load_in_serving_cell;
   }

   /**
    * Singleton accessor method for user_inactivity.
    */
   public static CauseRadioNetwork user_inactivity() {
      return _user_inactivity;
   }

   /**
    * Singleton accessor method for radio_connection_with_ue_lost.
    */
   public static CauseRadioNetwork radio_connection_with_ue_lost() {
      return _radio_connection_with_ue_lost;
   }

   /**
    * Singleton accessor method for load_balancing_tau_required.
    */
   public static CauseRadioNetwork load_balancing_tau_required() {
      return _load_balancing_tau_required;
   }

   /**
    * Singleton accessor method for cs_fallback_triggered.
    */
   public static CauseRadioNetwork cs_fallback_triggered() {
      return _cs_fallback_triggered;
   }

   /**
    * Singleton accessor method for ue_not_available_for_ps_service.
    */
   public static CauseRadioNetwork ue_not_available_for_ps_service() {
      return _ue_not_available_for_ps_service;
   }

   /**
    * Singleton accessor method for radio_resources_not_available.
    */
   public static CauseRadioNetwork radio_resources_not_available() {
      return _radio_resources_not_available;
   }

   /**
    * Singleton accessor method for failure_in_radio_interface_procedure.
    */
   public static CauseRadioNetwork failure_in_radio_interface_procedure() {
      return _failure_in_radio_interface_procedure;
   }

   /**
    * Singleton accessor method for invalid_qos_combination.
    */
   public static CauseRadioNetwork invalid_qos_combination() {
      return _invalid_qos_combination;
   }

   /**
    * Singleton accessor method for interrat_redirection.
    */
   public static CauseRadioNetwork interrat_redirection() {
      return _interrat_redirection;
   }

   /**
    * Singleton accessor method for interaction_with_other_procedure.
    */
   public static CauseRadioNetwork interaction_with_other_procedure() {
      return _interaction_with_other_procedure;
   }

   /**
    * Singleton accessor method for unknown_E_RAB_ID.
    */
   public static CauseRadioNetwork unknown_E_RAB_ID() {
      return _unknown_E_RAB_ID;
   }

   /**
    * Singleton accessor method for multiple_E_RAB_ID_instances.
    */
   public static CauseRadioNetwork multiple_E_RAB_ID_instances() {
      return _multiple_E_RAB_ID_instances;
   }

   /**
    * Singleton accessor method for encryption_and_or_integrity_protection_algorithms_not_supported.
    */
   public static CauseRadioNetwork encryption_and_or_integrity_protection_algorithms_not_supported() {
      return _encryption_and_or_integrity_protection_algorithms_not_supported;
   }

   /**
    * Singleton accessor method for s1_intra_system_handover_triggered.
    */
   public static CauseRadioNetwork s1_intra_system_handover_triggered() {
      return _s1_intra_system_handover_triggered;
   }

   /**
    * Singleton accessor method for s1_inter_system_handover_triggered.
    */
   public static CauseRadioNetwork s1_inter_system_handover_triggered() {
      return _s1_inter_system_handover_triggered;
   }

   /**
    * Singleton accessor method for x2_handover_triggered.
    */
   public static CauseRadioNetwork x2_handover_triggered() {
      return _x2_handover_triggered;
   }

   /**
    * Singleton accessor method for redirection_towards_1xRTT.
    */
   public static CauseRadioNetwork redirection_towards_1xRTT() {
      return _redirection_towards_1xRTT;
   }

   /**
    * Singleton accessor method for not_supported_QCI_value.
    */
   public static CauseRadioNetwork not_supported_QCI_value() {
      return _not_supported_QCI_value;
   }

   /**
    * Singleton accessor method for invalid_CSG_Id.
    */
   public static CauseRadioNetwork invalid_CSG_Id() {
      return _invalid_CSG_Id;
   }

   /**
    * Singleton accessor method for release_due_to_pre_emption.
    */
   public static CauseRadioNetwork release_due_to_pre_emption() {
      return _release_due_to_pre_emption;
   }

   /** Undefined value. */
   protected static CauseRadioNetwork __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CauseRadioNetwork.valueOf( CauseRadioNetwork.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CauseRadioNetwork valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return unspecified();
         case 1: return tx2relocoverall_expiry();
         case 2: return successful_handover();
         case 3: return release_due_to_eutran_generated_reason();
         case 4: return handover_cancelled();
         case 5: return partial_handover();
         case 6: return ho_failure_in_target_EPC_eNB_or_target_system();
         case 7: return ho_target_not_allowed();
         case 8: return tS1relocoverall_expiry();
         case 9: return tS1relocprep_expiry();
         case 10: return cell_not_available();
         case 11: return unknown_targetID();
         case 12: return no_radio_resources_available_in_target_cell();
         case 13: return unknown_mme_ue_s1ap_id();
         case 14: return unknown_enb_ue_s1ap_id();
         case 15: return unknown_pair_ue_s1ap_id();
         case 16: return handover_desirable_for_radio_reason();
         case 17: return time_critical_handover();
         case 18: return resource_optimisation_handover();
         case 19: return reduce_load_in_serving_cell();
         case 20: return user_inactivity();
         case 21: return radio_connection_with_ue_lost();
         case 22: return load_balancing_tau_required();
         case 23: return cs_fallback_triggered();
         case 24: return ue_not_available_for_ps_service();
         case 25: return radio_resources_not_available();
         case 26: return failure_in_radio_interface_procedure();
         case 27: return invalid_qos_combination();
         case 28: return interrat_redirection();
         case 29: return interaction_with_other_procedure();
         case 30: return unknown_E_RAB_ID();
         case 31: return multiple_E_RAB_ID_instances();
         case 32: return encryption_and_or_integrity_protection_algorithms_not_supported();
         case 33: return s1_intra_system_handover_triggered();
         case 34: return s1_inter_system_handover_triggered();
         case 35: return x2_handover_triggered();
         case 36: return redirection_towards_1xRTT();
         case 37: return not_supported_QCI_value();
         case 38: return invalid_CSG_Id();
         case 39: return release_due_to_pre_emption();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         switch (ui) {
            case 0: ret = 36; break;
            case 1: ret = 37; break;
            case 2: ret = 38; break;
            case 3: ret = 39; break;
            default: ret = 0x7fffffff; break;
         }
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (36);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            case 4: ret =  4; break;
            case 5: ret =  5; break;
            case 6: ret =  6; break;
            case 7: ret =  7; break;
            case 8: ret =  8; break;
            case 9: ret =  9; break;
            case 10: ret =  10; break;
            case 11: ret =  11; break;
            case 12: ret =  12; break;
            case 13: ret =  13; break;
            case 14: ret =  14; break;
            case 15: ret =  15; break;
            case 16: ret =  16; break;
            case 17: ret =  17; break;
            case 18: ret =  18; break;
            case 19: ret =  19; break;
            case 20: ret =  20; break;
            case 21: ret =  21; break;
            case 22: ret =  22; break;
            case 23: ret =  23; break;
            case 24: ret =  24; break;
            case 25: ret =  25; break;
            case 26: ret =  26; break;
            case 27: ret =  27; break;
            case 28: ret =  28; break;
            case 29: ret =  29; break;
            case 30: ret =  30; break;
            case 31: ret =  31; break;
            case 32: ret =  32; break;
            case 33: ret =  33; break;
            case 34: ret =  34; break;
            case 35: ret =  35; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CauseRadioNetwork.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("unspecified");
         case 1: return ("tx2relocoverall-expiry");
         case 2: return ("successful-handover");
         case 3: return ("release-due-to-eutran-generated-reason");
         case 4: return ("handover-cancelled");
         case 5: return ("partial-handover");
         case 6: return ("ho-failure-in-target-EPC-eNB-or-target-system");
         case 7: return ("ho-target-not-allowed");
         case 8: return ("tS1relocoverall-expiry");
         case 9: return ("tS1relocprep-expiry");
         case 10: return ("cell-not-available");
         case 11: return ("unknown-targetID");
         case 12: return ("no-radio-resources-available-in-target-cell");
         case 13: return ("unknown-mme-ue-s1ap-id");
         case 14: return ("unknown-enb-ue-s1ap-id");
         case 15: return ("unknown-pair-ue-s1ap-id");
         case 16: return ("handover-desirable-for-radio-reason");
         case 17: return ("time-critical-handover");
         case 18: return ("resource-optimisation-handover");
         case 19: return ("reduce-load-in-serving-cell");
         case 20: return ("user-inactivity");
         case 21: return ("radio-connection-with-ue-lost");
         case 22: return ("load-balancing-tau-required");
         case 23: return ("cs-fallback-triggered");
         case 24: return ("ue-not-available-for-ps-service");
         case 25: return ("radio-resources-not-available");
         case 26: return ("failure-in-radio-interface-procedure");
         case 27: return ("invalid-qos-combination");
         case 28: return ("interrat-redirection");
         case 29: return ("interaction-with-other-procedure");
         case 30: return ("unknown-E-RAB-ID");
         case 31: return ("multiple-E-RAB-ID-instances");
         case 32: return ("encryption-and-or-integrity-protection-algorithms-not-supported");
         case 33: return ("s1-intra-system-handover-triggered");
         case 34: return ("s1-inter-system-handover-triggered");
         case 35: return ("x2-handover-triggered");
         case 36: return ("redirection-towards-1xRTT");
         case 37: return ("not-supported-QCI-value");
         case 38: return ("invalid-CSG-Id");
         case 39: return ("release-due-to-pre-emption");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
