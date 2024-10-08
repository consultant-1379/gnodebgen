/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _B328 = 0;
   public static final int _B408 = 1;
   public static final int _B504 = 2;
   public static final int _B600 = 3;
   public static final int _B712 = 4;
   public static final int _B808 = 5;
   public static final int _B936 = 6;
   public static final int _B1000OR456 = 7;

   // Singleton instances of RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b328 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(0);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b408 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(1);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b504 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(2);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b600 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(3);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b712 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(4);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b808 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(5);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b936 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(6);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 _b1000or456 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15(7);

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
   protected RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for b328.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b328() {
      return _b328;
   }

   /**
    * Singleton accessor method for b408.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b408() {
      return _b408;
   }

   /**
    * Singleton accessor method for b504.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b504() {
      return _b504;
   }

   /**
    * Singleton accessor method for b600.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b600() {
      return _b600;
   }

   /**
    * Singleton accessor method for b712.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b712() {
      return _b712;
   }

   /**
    * Singleton accessor method for b808.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b808() {
      return _b808;
   }

   /**
    * Singleton accessor method for b936.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b936() {
      return _b936;
   }

   /**
    * Singleton accessor method for b1000or456.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 b1000or456() {
      return _b1000or456;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15.valueOf( RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return b328();
         case 1: return b408();
         case 2: return b504();
         case 3: return b600();
         case 4: return b712();
         case 5: return b808();
         case 6: return b936();
         case 7: return b1000or456();
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
      buffer.invokeCharacters (RACH_CE_LevelInfo_r13_edt_Parameters_r15_edt_TBS_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("b328");
         case 1: return ("b408");
         case 2: return ("b504");
         case 3: return ("b600");
         case 4: return ("b712");
         case 5: return ("b808");
         case 6: return ("b936");
         case 7: return ("b1000or456");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
