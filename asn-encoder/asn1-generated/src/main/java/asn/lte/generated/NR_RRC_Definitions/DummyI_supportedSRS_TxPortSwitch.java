/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyI_supportedSRS_TxPortSwitch extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _T1R2 = 0;
   public static final int _T1R4 = 1;
   public static final int _T2R4 = 2;
   public static final int _T1R4_T2R4 = 3;
   public static final int _TR_EQUAL = 4;

   // Singleton instances of DummyI_supportedSRS_TxPortSwitch
   protected static final DummyI_supportedSRS_TxPortSwitch _t1r2 = new DummyI_supportedSRS_TxPortSwitch(0);
   protected static final DummyI_supportedSRS_TxPortSwitch _t1r4 = new DummyI_supportedSRS_TxPortSwitch(1);
   protected static final DummyI_supportedSRS_TxPortSwitch _t2r4 = new DummyI_supportedSRS_TxPortSwitch(2);
   protected static final DummyI_supportedSRS_TxPortSwitch _t1r4_t2r4 = new DummyI_supportedSRS_TxPortSwitch(3);
   protected static final DummyI_supportedSRS_TxPortSwitch _tr_equal = new DummyI_supportedSRS_TxPortSwitch(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected DummyI_supportedSRS_TxPortSwitch (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for t1r2.
    */
   public static DummyI_supportedSRS_TxPortSwitch t1r2() {
      return _t1r2;
   }

   /**
    * Singleton accessor method for t1r4.
    */
   public static DummyI_supportedSRS_TxPortSwitch t1r4() {
      return _t1r4;
   }

   /**
    * Singleton accessor method for t2r4.
    */
   public static DummyI_supportedSRS_TxPortSwitch t2r4() {
      return _t2r4;
   }

   /**
    * Singleton accessor method for t1r4_t2r4.
    */
   public static DummyI_supportedSRS_TxPortSwitch t1r4_t2r4() {
      return _t1r4_t2r4;
   }

   /**
    * Singleton accessor method for tr_equal.
    */
   public static DummyI_supportedSRS_TxPortSwitch tr_equal() {
      return _tr_equal;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DummyI_supportedSRS_TxPortSwitch.valueOf( DummyI_supportedSRS_TxPortSwitch.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DummyI_supportedSRS_TxPortSwitch valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return t1r2();
         case 1: return t1r4();
         case 2: return t2r4();
         case 3: return t1r4_t2r4();
         case 4: return tr_equal();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (DummyI_supportedSRS_TxPortSwitch.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("t1r2");
         case 1: return ("t1r4");
         case 2: return ("t2r4");
         case 3: return ("t1r4-t2r4");
         case 4: return ("tr-equal");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
