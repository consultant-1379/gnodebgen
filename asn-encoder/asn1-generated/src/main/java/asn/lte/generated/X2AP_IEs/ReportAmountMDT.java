/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ReportAmountMDT extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReportAmountMDT";
   }

   // Integer constants for switch-case
   public static final int _R1 = 0;
   public static final int _R2 = 1;
   public static final int _R4 = 2;
   public static final int _R8 = 3;
   public static final int _R16 = 4;
   public static final int _R32 = 5;
   public static final int _R64 = 6;
   public static final int _RINFINITY = 7;

   // Singleton instances of ReportAmountMDT
   protected static final ReportAmountMDT _r1 = new ReportAmountMDT(0);
   protected static final ReportAmountMDT _r2 = new ReportAmountMDT(1);
   protected static final ReportAmountMDT _r4 = new ReportAmountMDT(2);
   protected static final ReportAmountMDT _r8 = new ReportAmountMDT(3);
   protected static final ReportAmountMDT _r16 = new ReportAmountMDT(4);
   protected static final ReportAmountMDT _r32 = new ReportAmountMDT(5);
   protected static final ReportAmountMDT _r64 = new ReportAmountMDT(6);
   protected static final ReportAmountMDT _rinfinity = new ReportAmountMDT(7);

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
   protected ReportAmountMDT (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for r1.
    */
   public static ReportAmountMDT r1() {
      return _r1;
   }

   /**
    * Singleton accessor method for r2.
    */
   public static ReportAmountMDT r2() {
      return _r2;
   }

   /**
    * Singleton accessor method for r4.
    */
   public static ReportAmountMDT r4() {
      return _r4;
   }

   /**
    * Singleton accessor method for r8.
    */
   public static ReportAmountMDT r8() {
      return _r8;
   }

   /**
    * Singleton accessor method for r16.
    */
   public static ReportAmountMDT r16() {
      return _r16;
   }

   /**
    * Singleton accessor method for r32.
    */
   public static ReportAmountMDT r32() {
      return _r32;
   }

   /**
    * Singleton accessor method for r64.
    */
   public static ReportAmountMDT r64() {
      return _r64;
   }

   /**
    * Singleton accessor method for rinfinity.
    */
   public static ReportAmountMDT rinfinity() {
      return _rinfinity;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ReportAmountMDT.valueOf( ReportAmountMDT.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ReportAmountMDT valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return r1();
         case 1: return r2();
         case 2: return r4();
         case 3: return r8();
         case 4: return r16();
         case 5: return r32();
         case 6: return r64();
         case 7: return rinfinity();
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
      buffer.invokeCharacters (ReportAmountMDT.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("r1");
         case 1: return ("r2");
         case 2: return ("r4");
         case 3: return ("r8");
         case 4: return ("r16");
         case 5: return ("r32");
         case 6: return ("r64");
         case 7: return ("rinfinity");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
