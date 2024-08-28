/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class CauseRadioNetwork extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CauseRadioNetwork";
   }

   // Integer constants for switch-case
   public static final int _HANDOVER_DESIRABLE_FOR_RADIO_REASONS = 0;
   public static final int _TIME_CRITICAL_HANDOVER = 1;
   public static final int _RESOURCE_OPTIMISATION_HANDOVER = 2;
   public static final int _REDUCE_LOAD_IN_SERVING_CELL = 3;
   public static final int _PARTIAL_HANDOVER = 4;
   public static final int _UNKNOWN_NEW_ENB_UE_X2AP_ID = 5;
   public static final int _UNKNOWN_OLD_ENB_UE_X2AP_ID = 6;
   public static final int _UNKNOWN_PAIR_OF_UE_X2AP_ID = 7;
   public static final int _HO_TARGET_NOT_ALLOWED = 8;
   public static final int _TX2RELOCOVERALL_EXPIRY = 9;
   public static final int _TRELOCPREP_EXPIRY = 10;
   public static final int _CELL_NOT_AVAILABLE = 11;
   public static final int _NO_RADIO_RESOURCES_AVAILABLE_IN_TARGET_CELL = 12;
   public static final int _INVALID_MME_GROUPID = 13;
   public static final int _UNKNOWN_MME_CODE = 14;
   public static final int _ENCRYPTION_AND_OR_INTEGRITY_PROTECTION_ALGORITHMS_NOT_SUPPORTED = 15;
   public static final int _REPORTCHARACTERISTICSEMPTY = 16;
   public static final int _NOREPORTPERIODICITY = 17;
   public static final int _EXISTINGMEASUREMENTID = 18;
   public static final int _UNKNOWN_ENB_MEASUREMENT_ID = 19;
   public static final int _MEASUREMENT_TEMPORARILY_NOT_AVAILABLE = 20;
   public static final int _UNSPECIFIED = 21;
   public static final int _LOAD_BALANCING = 22;
   public static final int _HANDOVER_OPTIMISATION = 23;
   public static final int _VALUE_OUT_OF_ALLOWED_RANGE = 24;
   public static final int _MULTIPLE_E_RAB_ID_INSTANCES = 25;
   public static final int _SWITCH_OFF_ONGOING = 26;
   public static final int _NOT_SUPPORTED_QCI_VALUE = 27;
   public static final int _MEASUREMENT_NOT_SUPPORTED_FOR_THE_OBJECT = 28;
   public static final int _TDCOVERALL_EXPIRY = 29;
   public static final int _TDCPREP_EXPIRY = 30;
   public static final int _ACTION_DESIRABLE_FOR_RADIO_REASONS = 31;
   public static final int _REDUCE_LOAD = 32;
   public static final int _RESOURCE_OPTIMISATION = 33;
   public static final int _TIME_CRITICAL_ACTION = 34;
   public static final int _TARGET_NOT_ALLOWED = 35;
   public static final int _NO_RADIO_RESOURCES_AVAILABLE = 36;
   public static final int _INVALID_QOS_COMBINATION = 37;
   public static final int _ENCRYPTION_ALGORITHMS_NOT_SUPPORTED = 38;
   public static final int _PROCEDURE_CANCELLED = 39;
   public static final int _RRM_PURPOSE = 40;
   public static final int _IMPROVE_USER_BIT_RATE = 41;
   public static final int _USER_INACTIVITY = 42;
   public static final int _RADIO_CONNECTION_WITH_UE_LOST = 43;
   public static final int _FAILURE_IN_THE_RADIO_INTERFACE_PROCEDURE = 44;
   public static final int _BEARER_OPTION_NOT_SUPPORTED = 45;
   public static final int _MCG_MOBILITY = 46;
   public static final int _SCG_MOBILITY = 47;
   public static final int _COUNT_REACHES_MAX_VALUE = 48;
   public static final int _UNKNOWN_OLD_EN_GNB_UE_X2AP_ID = 49;
   public static final int _PDCP_OVERLOAD = 50;

   // Singleton instances of CauseRadioNetwork
   protected static final CauseRadioNetwork _handover_desirable_for_radio_reasons = new CauseRadioNetwork(0);
   protected static final CauseRadioNetwork _time_critical_handover = new CauseRadioNetwork(1);
   protected static final CauseRadioNetwork _resource_optimisation_handover = new CauseRadioNetwork(2);
   protected static final CauseRadioNetwork _reduce_load_in_serving_cell = new CauseRadioNetwork(3);
   protected static final CauseRadioNetwork _partial_handover = new CauseRadioNetwork(4);
   protected static final CauseRadioNetwork _unknown_new_eNB_UE_X2AP_ID = new CauseRadioNetwork(5);
   protected static final CauseRadioNetwork _unknown_old_eNB_UE_X2AP_ID = new CauseRadioNetwork(6);
   protected static final CauseRadioNetwork _unknown_pair_of_UE_X2AP_ID = new CauseRadioNetwork(7);
   protected static final CauseRadioNetwork _ho_target_not_allowed = new CauseRadioNetwork(8);
   protected static final CauseRadioNetwork _tx2relocoverall_expiry = new CauseRadioNetwork(9);
   protected static final CauseRadioNetwork _trelocprep_expiry = new CauseRadioNetwork(10);
   protected static final CauseRadioNetwork _cell_not_available = new CauseRadioNetwork(11);
   protected static final CauseRadioNetwork _no_radio_resources_available_in_target_cell = new CauseRadioNetwork(12);
   protected static final CauseRadioNetwork _invalid_MME_GroupID = new CauseRadioNetwork(13);
   protected static final CauseRadioNetwork _unknown_MME_Code = new CauseRadioNetwork(14);
   protected static final CauseRadioNetwork _encryption_and_or_integrity_protection_algorithms_not_supported = new CauseRadioNetwork(15);
   protected static final CauseRadioNetwork _reportCharacteristicsEmpty = new CauseRadioNetwork(16);
   protected static final CauseRadioNetwork _noReportPeriodicity = new CauseRadioNetwork(17);
   protected static final CauseRadioNetwork _existingMeasurementID = new CauseRadioNetwork(18);
   protected static final CauseRadioNetwork _unknown_eNB_Measurement_ID = new CauseRadioNetwork(19);
   protected static final CauseRadioNetwork _measurement_temporarily_not_available = new CauseRadioNetwork(20);
   protected static final CauseRadioNetwork _unspecified = new CauseRadioNetwork(21);
   protected static final CauseRadioNetwork _load_balancing = new CauseRadioNetwork(22);
   protected static final CauseRadioNetwork _handover_optimisation = new CauseRadioNetwork(23);
   protected static final CauseRadioNetwork _value_out_of_allowed_range = new CauseRadioNetwork(24);
   protected static final CauseRadioNetwork _multiple_E_RAB_ID_instances = new CauseRadioNetwork(25);
   protected static final CauseRadioNetwork _switch_off_ongoing = new CauseRadioNetwork(26);
   protected static final CauseRadioNetwork _not_supported_QCI_value = new CauseRadioNetwork(27);
   protected static final CauseRadioNetwork _measurement_not_supported_for_the_object = new CauseRadioNetwork(28);
   protected static final CauseRadioNetwork _tDCoverall_expiry = new CauseRadioNetwork(29);
   protected static final CauseRadioNetwork _tDCprep_expiry = new CauseRadioNetwork(30);
   protected static final CauseRadioNetwork _action_desirable_for_radio_reasons = new CauseRadioNetwork(31);
   protected static final CauseRadioNetwork _reduce_load = new CauseRadioNetwork(32);
   protected static final CauseRadioNetwork _resource_optimisation = new CauseRadioNetwork(33);
   protected static final CauseRadioNetwork _time_critical_action = new CauseRadioNetwork(34);
   protected static final CauseRadioNetwork _target_not_allowed = new CauseRadioNetwork(35);
   protected static final CauseRadioNetwork _no_radio_resources_available = new CauseRadioNetwork(36);
   protected static final CauseRadioNetwork _invalid_QoS_combination = new CauseRadioNetwork(37);
   protected static final CauseRadioNetwork _encryption_algorithms_not_supported = new CauseRadioNetwork(38);
   protected static final CauseRadioNetwork _procedure_cancelled = new CauseRadioNetwork(39);
   protected static final CauseRadioNetwork _rRM_purpose = new CauseRadioNetwork(40);
   protected static final CauseRadioNetwork _improve_user_bit_rate = new CauseRadioNetwork(41);
   protected static final CauseRadioNetwork _user_inactivity = new CauseRadioNetwork(42);
   protected static final CauseRadioNetwork _radio_connection_with_UE_lost = new CauseRadioNetwork(43);
   protected static final CauseRadioNetwork _failure_in_the_radio_interface_procedure = new CauseRadioNetwork(44);
   protected static final CauseRadioNetwork _bearer_option_not_supported = new CauseRadioNetwork(45);
   protected static final CauseRadioNetwork _mCG_Mobility = new CauseRadioNetwork(46);
   protected static final CauseRadioNetwork _sCG_Mobility = new CauseRadioNetwork(47);
   protected static final CauseRadioNetwork _count_reaches_max_value = new CauseRadioNetwork(48);
   protected static final CauseRadioNetwork _unknown_old_en_gNB_UE_X2AP_ID = new CauseRadioNetwork(49);
   protected static final CauseRadioNetwork _pDCP_Overload = new CauseRadioNetwork(50);
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
    *   40
    *   41
    *   42
    *   43
    *   44
    *   45
    *   46
    *   47
    *   48
    *   49
    *   50
    */
   protected CauseRadioNetwork (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for handover_desirable_for_radio_reasons.
    */
   public static CauseRadioNetwork handover_desirable_for_radio_reasons() {
      return _handover_desirable_for_radio_reasons;
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
    * Singleton accessor method for partial_handover.
    */
   public static CauseRadioNetwork partial_handover() {
      return _partial_handover;
   }

   /**
    * Singleton accessor method for unknown_new_eNB_UE_X2AP_ID.
    */
   public static CauseRadioNetwork unknown_new_eNB_UE_X2AP_ID() {
      return _unknown_new_eNB_UE_X2AP_ID;
   }

   /**
    * Singleton accessor method for unknown_old_eNB_UE_X2AP_ID.
    */
   public static CauseRadioNetwork unknown_old_eNB_UE_X2AP_ID() {
      return _unknown_old_eNB_UE_X2AP_ID;
   }

   /**
    * Singleton accessor method for unknown_pair_of_UE_X2AP_ID.
    */
   public static CauseRadioNetwork unknown_pair_of_UE_X2AP_ID() {
      return _unknown_pair_of_UE_X2AP_ID;
   }

   /**
    * Singleton accessor method for ho_target_not_allowed.
    */
   public static CauseRadioNetwork ho_target_not_allowed() {
      return _ho_target_not_allowed;
   }

   /**
    * Singleton accessor method for tx2relocoverall_expiry.
    */
   public static CauseRadioNetwork tx2relocoverall_expiry() {
      return _tx2relocoverall_expiry;
   }

   /**
    * Singleton accessor method for trelocprep_expiry.
    */
   public static CauseRadioNetwork trelocprep_expiry() {
      return _trelocprep_expiry;
   }

   /**
    * Singleton accessor method for cell_not_available.
    */
   public static CauseRadioNetwork cell_not_available() {
      return _cell_not_available;
   }

   /**
    * Singleton accessor method for no_radio_resources_available_in_target_cell.
    */
   public static CauseRadioNetwork no_radio_resources_available_in_target_cell() {
      return _no_radio_resources_available_in_target_cell;
   }

   /**
    * Singleton accessor method for invalid_MME_GroupID.
    */
   public static CauseRadioNetwork invalid_MME_GroupID() {
      return _invalid_MME_GroupID;
   }

   /**
    * Singleton accessor method for unknown_MME_Code.
    */
   public static CauseRadioNetwork unknown_MME_Code() {
      return _unknown_MME_Code;
   }

   /**
    * Singleton accessor method for encryption_and_or_integrity_protection_algorithms_not_supported.
    */
   public static CauseRadioNetwork encryption_and_or_integrity_protection_algorithms_not_supported() {
      return _encryption_and_or_integrity_protection_algorithms_not_supported;
   }

   /**
    * Singleton accessor method for reportCharacteristicsEmpty.
    */
   public static CauseRadioNetwork reportCharacteristicsEmpty() {
      return _reportCharacteristicsEmpty;
   }

   /**
    * Singleton accessor method for noReportPeriodicity.
    */
   public static CauseRadioNetwork noReportPeriodicity() {
      return _noReportPeriodicity;
   }

   /**
    * Singleton accessor method for existingMeasurementID.
    */
   public static CauseRadioNetwork existingMeasurementID() {
      return _existingMeasurementID;
   }

   /**
    * Singleton accessor method for unknown_eNB_Measurement_ID.
    */
   public static CauseRadioNetwork unknown_eNB_Measurement_ID() {
      return _unknown_eNB_Measurement_ID;
   }

   /**
    * Singleton accessor method for measurement_temporarily_not_available.
    */
   public static CauseRadioNetwork measurement_temporarily_not_available() {
      return _measurement_temporarily_not_available;
   }

   /**
    * Singleton accessor method for unspecified.
    */
   public static CauseRadioNetwork unspecified() {
      return _unspecified;
   }

   /**
    * Singleton accessor method for load_balancing.
    */
   public static CauseRadioNetwork load_balancing() {
      return _load_balancing;
   }

   /**
    * Singleton accessor method for handover_optimisation.
    */
   public static CauseRadioNetwork handover_optimisation() {
      return _handover_optimisation;
   }

   /**
    * Singleton accessor method for value_out_of_allowed_range.
    */
   public static CauseRadioNetwork value_out_of_allowed_range() {
      return _value_out_of_allowed_range;
   }

   /**
    * Singleton accessor method for multiple_E_RAB_ID_instances.
    */
   public static CauseRadioNetwork multiple_E_RAB_ID_instances() {
      return _multiple_E_RAB_ID_instances;
   }

   /**
    * Singleton accessor method for switch_off_ongoing.
    */
   public static CauseRadioNetwork switch_off_ongoing() {
      return _switch_off_ongoing;
   }

   /**
    * Singleton accessor method for not_supported_QCI_value.
    */
   public static CauseRadioNetwork not_supported_QCI_value() {
      return _not_supported_QCI_value;
   }

   /**
    * Singleton accessor method for measurement_not_supported_for_the_object.
    */
   public static CauseRadioNetwork measurement_not_supported_for_the_object() {
      return _measurement_not_supported_for_the_object;
   }

   /**
    * Singleton accessor method for tDCoverall_expiry.
    */
   public static CauseRadioNetwork tDCoverall_expiry() {
      return _tDCoverall_expiry;
   }

   /**
    * Singleton accessor method for tDCprep_expiry.
    */
   public static CauseRadioNetwork tDCprep_expiry() {
      return _tDCprep_expiry;
   }

   /**
    * Singleton accessor method for action_desirable_for_radio_reasons.
    */
   public static CauseRadioNetwork action_desirable_for_radio_reasons() {
      return _action_desirable_for_radio_reasons;
   }

   /**
    * Singleton accessor method for reduce_load.
    */
   public static CauseRadioNetwork reduce_load() {
      return _reduce_load;
   }

   /**
    * Singleton accessor method for resource_optimisation.
    */
   public static CauseRadioNetwork resource_optimisation() {
      return _resource_optimisation;
   }

   /**
    * Singleton accessor method for time_critical_action.
    */
   public static CauseRadioNetwork time_critical_action() {
      return _time_critical_action;
   }

   /**
    * Singleton accessor method for target_not_allowed.
    */
   public static CauseRadioNetwork target_not_allowed() {
      return _target_not_allowed;
   }

   /**
    * Singleton accessor method for no_radio_resources_available.
    */
   public static CauseRadioNetwork no_radio_resources_available() {
      return _no_radio_resources_available;
   }

   /**
    * Singleton accessor method for invalid_QoS_combination.
    */
   public static CauseRadioNetwork invalid_QoS_combination() {
      return _invalid_QoS_combination;
   }

   /**
    * Singleton accessor method for encryption_algorithms_not_supported.
    */
   public static CauseRadioNetwork encryption_algorithms_not_supported() {
      return _encryption_algorithms_not_supported;
   }

   /**
    * Singleton accessor method for procedure_cancelled.
    */
   public static CauseRadioNetwork procedure_cancelled() {
      return _procedure_cancelled;
   }

   /**
    * Singleton accessor method for rRM_purpose.
    */
   public static CauseRadioNetwork rRM_purpose() {
      return _rRM_purpose;
   }

   /**
    * Singleton accessor method for improve_user_bit_rate.
    */
   public static CauseRadioNetwork improve_user_bit_rate() {
      return _improve_user_bit_rate;
   }

   /**
    * Singleton accessor method for user_inactivity.
    */
   public static CauseRadioNetwork user_inactivity() {
      return _user_inactivity;
   }

   /**
    * Singleton accessor method for radio_connection_with_UE_lost.
    */
   public static CauseRadioNetwork radio_connection_with_UE_lost() {
      return _radio_connection_with_UE_lost;
   }

   /**
    * Singleton accessor method for failure_in_the_radio_interface_procedure.
    */
   public static CauseRadioNetwork failure_in_the_radio_interface_procedure() {
      return _failure_in_the_radio_interface_procedure;
   }

   /**
    * Singleton accessor method for bearer_option_not_supported.
    */
   public static CauseRadioNetwork bearer_option_not_supported() {
      return _bearer_option_not_supported;
   }

   /**
    * Singleton accessor method for mCG_Mobility.
    */
   public static CauseRadioNetwork mCG_Mobility() {
      return _mCG_Mobility;
   }

   /**
    * Singleton accessor method for sCG_Mobility.
    */
   public static CauseRadioNetwork sCG_Mobility() {
      return _sCG_Mobility;
   }

   /**
    * Singleton accessor method for count_reaches_max_value.
    */
   public static CauseRadioNetwork count_reaches_max_value() {
      return _count_reaches_max_value;
   }

   /**
    * Singleton accessor method for unknown_old_en_gNB_UE_X2AP_ID.
    */
   public static CauseRadioNetwork unknown_old_en_gNB_UE_X2AP_ID() {
      return _unknown_old_en_gNB_UE_X2AP_ID;
   }

   /**
    * Singleton accessor method for pDCP_Overload.
    */
   public static CauseRadioNetwork pDCP_Overload() {
      return _pDCP_Overload;
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
         case 0: return handover_desirable_for_radio_reasons();
         case 1: return time_critical_handover();
         case 2: return resource_optimisation_handover();
         case 3: return reduce_load_in_serving_cell();
         case 4: return partial_handover();
         case 5: return unknown_new_eNB_UE_X2AP_ID();
         case 6: return unknown_old_eNB_UE_X2AP_ID();
         case 7: return unknown_pair_of_UE_X2AP_ID();
         case 8: return ho_target_not_allowed();
         case 9: return tx2relocoverall_expiry();
         case 10: return trelocprep_expiry();
         case 11: return cell_not_available();
         case 12: return no_radio_resources_available_in_target_cell();
         case 13: return invalid_MME_GroupID();
         case 14: return unknown_MME_Code();
         case 15: return encryption_and_or_integrity_protection_algorithms_not_supported();
         case 16: return reportCharacteristicsEmpty();
         case 17: return noReportPeriodicity();
         case 18: return existingMeasurementID();
         case 19: return unknown_eNB_Measurement_ID();
         case 20: return measurement_temporarily_not_available();
         case 21: return unspecified();
         case 22: return load_balancing();
         case 23: return handover_optimisation();
         case 24: return value_out_of_allowed_range();
         case 25: return multiple_E_RAB_ID_instances();
         case 26: return switch_off_ongoing();
         case 27: return not_supported_QCI_value();
         case 28: return measurement_not_supported_for_the_object();
         case 29: return tDCoverall_expiry();
         case 30: return tDCprep_expiry();
         case 31: return action_desirable_for_radio_reasons();
         case 32: return reduce_load();
         case 33: return resource_optimisation();
         case 34: return time_critical_action();
         case 35: return target_not_allowed();
         case 36: return no_radio_resources_available();
         case 37: return invalid_QoS_combination();
         case 38: return encryption_algorithms_not_supported();
         case 39: return procedure_cancelled();
         case 40: return rRM_purpose();
         case 41: return improve_user_bit_rate();
         case 42: return user_inactivity();
         case 43: return radio_connection_with_UE_lost();
         case 44: return failure_in_the_radio_interface_procedure();
         case 45: return bearer_option_not_supported();
         case 46: return mCG_Mobility();
         case 47: return sCG_Mobility();
         case 48: return count_reaches_max_value();
         case 49: return unknown_old_en_gNB_UE_X2AP_ID();
         case 50: return pDCP_Overload();
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
            case 0: ret = 22; break;
            case 1: ret = 23; break;
            case 2: ret = 24; break;
            case 3: ret = 25; break;
            case 4: ret = 26; break;
            case 5: ret = 27; break;
            case 6: ret = 28; break;
            case 7: ret = 29; break;
            case 8: ret = 30; break;
            case 9: ret = 31; break;
            case 10: ret = 32; break;
            case 11: ret = 33; break;
            case 12: ret = 34; break;
            case 13: ret = 35; break;
            case 14: ret = 36; break;
            case 15: ret = 37; break;
            case 16: ret = 38; break;
            case 17: ret = 39; break;
            case 18: ret = 40; break;
            case 19: ret = 41; break;
            case 20: ret = 42; break;
            case 21: ret = 43; break;
            case 22: ret = 44; break;
            case 23: ret = 45; break;
            case 24: ret = 46; break;
            case 25: ret = 47; break;
            case 26: ret = 48; break;
            case 27: ret = 49; break;
            case 28: ret = 50; break;
            default: ret = 0x7fffffff; break;
         }
      }
      else {
         ui = (int) buffer.decodeConsWholeNumber (22);

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
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CauseRadioNetwork.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("handover-desirable-for-radio-reasons");
         case 1: return ("time-critical-handover");
         case 2: return ("resource-optimisation-handover");
         case 3: return ("reduce-load-in-serving-cell");
         case 4: return ("partial-handover");
         case 5: return ("unknown-new-eNB-UE-X2AP-ID");
         case 6: return ("unknown-old-eNB-UE-X2AP-ID");
         case 7: return ("unknown-pair-of-UE-X2AP-ID");
         case 8: return ("ho-target-not-allowed");
         case 9: return ("tx2relocoverall-expiry");
         case 10: return ("trelocprep-expiry");
         case 11: return ("cell-not-available");
         case 12: return ("no-radio-resources-available-in-target-cell");
         case 13: return ("invalid-MME-GroupID");
         case 14: return ("unknown-MME-Code");
         case 15: return ("encryption-and-or-integrity-protection-algorithms-not-supported");
         case 16: return ("reportCharacteristicsEmpty");
         case 17: return ("noReportPeriodicity");
         case 18: return ("existingMeasurementID");
         case 19: return ("unknown-eNB-Measurement-ID");
         case 20: return ("measurement-temporarily-not-available");
         case 21: return ("unspecified");
         case 22: return ("load-balancing");
         case 23: return ("handover-optimisation");
         case 24: return ("value-out-of-allowed-range");
         case 25: return ("multiple-E-RAB-ID-instances");
         case 26: return ("switch-off-ongoing");
         case 27: return ("not-supported-QCI-value");
         case 28: return ("measurement-not-supported-for-the-object");
         case 29: return ("tDCoverall-expiry");
         case 30: return ("tDCprep-expiry");
         case 31: return ("action-desirable-for-radio-reasons");
         case 32: return ("reduce-load");
         case 33: return ("resource-optimisation");
         case 34: return ("time-critical-action");
         case 35: return ("target-not-allowed");
         case 36: return ("no-radio-resources-available");
         case 37: return ("invalid-QoS-combination");
         case 38: return ("encryption-algorithms-not-supported");
         case 39: return ("procedure-cancelled");
         case 40: return ("rRM-purpose");
         case 41: return ("improve-user-bit-rate");
         case 42: return ("user-inactivity");
         case 43: return ("radio-connection-with-UE-lost");
         case 44: return ("failure-in-the-radio-interface-procedure");
         case 45: return ("bearer-option-not-supported");
         case 46: return ("mCG-Mobility");
         case 47: return ("sCG-Mobility");
         case 48: return ("count-reaches-max-value");
         case 49: return ("unknown-old-en-gNB-UE-X2AP-ID");
         case 50: return ("pDCP-Overload");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
