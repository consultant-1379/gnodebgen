/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class FailureReportSCG_r12_failureType_r12 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T313_EXPIRY = 0;
   public static final int _RANDOMACCESSPROBLEM = 1;
   public static final int _RLC_MAXNUMRETX = 2;
   public static final int _SCG_CHANGEFAILURE = 3;

   // Singleton instances of FailureReportSCG_r12_failureType_r12
   protected static final FailureReportSCG_r12_failureType_r12 _t313_Expiry = new FailureReportSCG_r12_failureType_r12(0);
   protected static final FailureReportSCG_r12_failureType_r12 _randomAccessProblem = new FailureReportSCG_r12_failureType_r12(1);
   protected static final FailureReportSCG_r12_failureType_r12 _rlc_MaxNumRetx = new FailureReportSCG_r12_failureType_r12(2);
   protected static final FailureReportSCG_r12_failureType_r12 _scg_ChangeFailure = new FailureReportSCG_r12_failureType_r12(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected FailureReportSCG_r12_failureType_r12 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t313_Expiry.
    */
   public static FailureReportSCG_r12_failureType_r12 t313_Expiry() {
      return _t313_Expiry;
   }

   /**
    * Singleton accessor method for randomAccessProblem.
    */
   public static FailureReportSCG_r12_failureType_r12 randomAccessProblem() {
      return _randomAccessProblem;
   }

   /**
    * Singleton accessor method for rlc_MaxNumRetx.
    */
   public static FailureReportSCG_r12_failureType_r12 rlc_MaxNumRetx() {
      return _rlc_MaxNumRetx;
   }

   /**
    * Singleton accessor method for scg_ChangeFailure.
    */
   public static FailureReportSCG_r12_failureType_r12 scg_ChangeFailure() {
      return _scg_ChangeFailure;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return FailureReportSCG_r12_failureType_r12.valueOf( FailureReportSCG_r12_failureType_r12.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static FailureReportSCG_r12_failureType_r12 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return t313_Expiry();
         case 1: return randomAccessProblem();
         case 2: return rlc_MaxNumRetx();
         case 3: return scg_ChangeFailure();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (FailureReportSCG_r12_failureType_r12.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("t313-Expiry");
         case 1: return ("randomAccessProblem");
         case 2: return ("rlc-MaxNumRetx");
         case 3: return ("scg-ChangeFailure");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
