/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DummyB_maxNumberTxPortsPerResource extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _P2 = 0;
   public static final int _P4 = 1;
   public static final int _P8 = 2;
   public static final int _P12 = 3;
   public static final int _P16 = 4;
   public static final int _P24 = 5;
   public static final int _P32 = 6;

   // Singleton instances of DummyB_maxNumberTxPortsPerResource
   protected static final DummyB_maxNumberTxPortsPerResource _p2 = new DummyB_maxNumberTxPortsPerResource(0);
   protected static final DummyB_maxNumberTxPortsPerResource _p4 = new DummyB_maxNumberTxPortsPerResource(1);
   protected static final DummyB_maxNumberTxPortsPerResource _p8 = new DummyB_maxNumberTxPortsPerResource(2);
   protected static final DummyB_maxNumberTxPortsPerResource _p12 = new DummyB_maxNumberTxPortsPerResource(3);
   protected static final DummyB_maxNumberTxPortsPerResource _p16 = new DummyB_maxNumberTxPortsPerResource(4);
   protected static final DummyB_maxNumberTxPortsPerResource _p24 = new DummyB_maxNumberTxPortsPerResource(5);
   protected static final DummyB_maxNumberTxPortsPerResource _p32 = new DummyB_maxNumberTxPortsPerResource(6);

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
    */
   protected DummyB_maxNumberTxPortsPerResource (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for p2.
    */
   public static DummyB_maxNumberTxPortsPerResource p2() {
      return _p2;
   }

   /**
    * Singleton accessor method for p4.
    */
   public static DummyB_maxNumberTxPortsPerResource p4() {
      return _p4;
   }

   /**
    * Singleton accessor method for p8.
    */
   public static DummyB_maxNumberTxPortsPerResource p8() {
      return _p8;
   }

   /**
    * Singleton accessor method for p12.
    */
   public static DummyB_maxNumberTxPortsPerResource p12() {
      return _p12;
   }

   /**
    * Singleton accessor method for p16.
    */
   public static DummyB_maxNumberTxPortsPerResource p16() {
      return _p16;
   }

   /**
    * Singleton accessor method for p24.
    */
   public static DummyB_maxNumberTxPortsPerResource p24() {
      return _p24;
   }

   /**
    * Singleton accessor method for p32.
    */
   public static DummyB_maxNumberTxPortsPerResource p32() {
      return _p32;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return DummyB_maxNumberTxPortsPerResource.valueOf( DummyB_maxNumberTxPortsPerResource.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static DummyB_maxNumberTxPortsPerResource valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return p2();
         case 1: return p4();
         case 2: return p8();
         case 3: return p12();
         case 4: return p16();
         case 5: return p24();
         case 6: return p32();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (7);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         case 6: ret =  6; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (DummyB_maxNumberTxPortsPerResource.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("p2");
         case 1: return ("p4");
         case 2: return ("p8");
         case 3: return ("p12");
         case 4: return ("p16");
         case 5: return ("p24");
         case 6: return ("p32");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
