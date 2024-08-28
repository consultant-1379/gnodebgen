/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_InterNodeDefinitions;

import com.objsys.asn1j.runtime.*;

public class CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_InterNodeDefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T313_EXPIRY = 0;
   public static final int _RANDOMACCESSPROBLEM = 1;
   public static final int _RLC_MAXNUMRETX = 2;
   public static final int _SCG_CHANGEFAILURE = 3;

   // Singleton instances of CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA
   protected static final CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA _t313_Expiry = new CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA(0);
   protected static final CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA _randomAccessProblem = new CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA(1);
   protected static final CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA _rlc_MaxNumRetx = new CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA(2);
   protected static final CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA _scg_ChangeFailure = new CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t313_Expiry.
    */
   public static CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA t313_Expiry() {
      return _t313_Expiry;
   }

   /**
    * Singleton accessor method for randomAccessProblem.
    */
   public static CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA randomAccessProblem() {
      return _randomAccessProblem;
   }

   /**
    * Singleton accessor method for rlc_MaxNumRetx.
    */
   public static CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA rlc_MaxNumRetx() {
      return _rlc_MaxNumRetx;
   }

   /**
    * Singleton accessor method for scg_ChangeFailure.
    */
   public static CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA scg_ChangeFailure() {
      return _scg_ChangeFailure;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA.valueOf( CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA valueOf (int _value)
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
      buffer.invokeCharacters (CG_ConfigInfo_v1560_IEs_scgFailureInfoEUTRA_failureTypeEUTRA.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* t313_Expiry */break;
         case 1: ui = 1; /* randomAccessProblem */break;
         case 2: ui = 2; /* rlc_MaxNumRetx */break;
         case 3: ui = 3; /* scg_ChangeFailure */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
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
