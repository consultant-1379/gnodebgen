/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailureReportSCG_failureType extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T310_EXPIRY = 0;
   public static final int _RANDOMACCESSPROBLEM = 1;
   public static final int _RLC_MAXNUMRETX = 2;
   public static final int _SYNCHRECONFIGFAILURESCG = 3;
   public static final int _SCG_RECONFIGFAILURE = 4;
   public static final int _SRB3_INTEGRITYFAILURE = 5;
   public static final int _OTHER_R16 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of FailureReportSCG_failureType
   protected static final FailureReportSCG_failureType _t310_Expiry = new FailureReportSCG_failureType(0);
   protected static final FailureReportSCG_failureType _randomAccessProblem = new FailureReportSCG_failureType(1);
   protected static final FailureReportSCG_failureType _rlc_MaxNumRetx = new FailureReportSCG_failureType(2);
   protected static final FailureReportSCG_failureType _synchReconfigFailureSCG = new FailureReportSCG_failureType(3);
   protected static final FailureReportSCG_failureType _scg_ReconfigFailure = new FailureReportSCG_failureType(4);
   protected static final FailureReportSCG_failureType _srb3_IntegrityFailure = new FailureReportSCG_failureType(5);
   protected static final FailureReportSCG_failureType _other_r16 = new FailureReportSCG_failureType(6);
   protected static final FailureReportSCG_failureType _spare1 = new FailureReportSCG_failureType(7);

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
    */
   protected FailureReportSCG_failureType (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t310_Expiry.
    */
   public static FailureReportSCG_failureType t310_Expiry() {
      return _t310_Expiry;
   }

   /**
    * Singleton accessor method for randomAccessProblem.
    */
   public static FailureReportSCG_failureType randomAccessProblem() {
      return _randomAccessProblem;
   }

   /**
    * Singleton accessor method for rlc_MaxNumRetx.
    */
   public static FailureReportSCG_failureType rlc_MaxNumRetx() {
      return _rlc_MaxNumRetx;
   }

   /**
    * Singleton accessor method for synchReconfigFailureSCG.
    */
   public static FailureReportSCG_failureType synchReconfigFailureSCG() {
      return _synchReconfigFailureSCG;
   }

   /**
    * Singleton accessor method for scg_ReconfigFailure.
    */
   public static FailureReportSCG_failureType scg_ReconfigFailure() {
      return _scg_ReconfigFailure;
   }

   /**
    * Singleton accessor method for srb3_IntegrityFailure.
    */
   public static FailureReportSCG_failureType srb3_IntegrityFailure() {
      return _srb3_IntegrityFailure;
   }

   /**
    * Singleton accessor method for other_r16.
    */
   public static FailureReportSCG_failureType other_r16() {
      return _other_r16;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static FailureReportSCG_failureType spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FailureReportSCG_failureType.valueOf( FailureReportSCG_failureType.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FailureReportSCG_failureType valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return t310_Expiry();
         case 1: return randomAccessProblem();
         case 2: return rlc_MaxNumRetx();
         case 3: return synchReconfigFailureSCG();
         case 4: return scg_ReconfigFailure();
         case 5: return srb3_IntegrityFailure();
         case 6: return other_r16();
         case 7: return spare1();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (8);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         case 7: ret =  7; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (FailureReportSCG_failureType.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* t310_Expiry */break;
         case 1: ui = 1; /* randomAccessProblem */break;
         case 2: ui = 2; /* rlc_MaxNumRetx */break;
         case 3: ui = 3; /* synchReconfigFailureSCG */break;
         case 4: ui = 4; /* scg_ReconfigFailure */break;
         case 5: ui = 5; /* srb3_IntegrityFailure */break;
         case 6: ui = 6; /* other_r16 */break;
         case 7: ui = 7; /* spare1 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("t310-Expiry");
         case 1: return ("randomAccessProblem");
         case 2: return ("rlc-MaxNumRetx");
         case 3: return ("synchReconfigFailureSCG");
         case 4: return ("scg-ReconfigFailure");
         case 5: return ("srb3-IntegrityFailure");
         case 6: return ("other-r16");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
