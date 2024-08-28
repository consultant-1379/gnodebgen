/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N2 = 0;
   public static final int _N4 = 1;
   public static final int _N6 = 2;
   public static final int _N10 = 3;
   public static final int _N12 = 4;
   public static final int _N16 = 5;

   // Singleton instances of PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n2 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(0);
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n4 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(1);
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n6 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(2);
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n10 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(3);
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n12 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(4);
   protected static final PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH _n16 = new PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH(5);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    */
   protected PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n2.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n10.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n10() {
      return _n10;
   }

   /**
    * Singleton accessor method for n12.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n12() {
      return _n12;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH n16() {
      return _n16;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH.valueOf( PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n2();
         case 1: return n4();
         case 2: return n6();
         case 3: return n10();
         case 4: return n12();
         case 5: return n16();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (6);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         case 5: ret =  5; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PDSCH_ServingCellConfig_nrofHARQ_ProcessesForPDSCH.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n2 */break;
         case 1: ui = 1; /* n4 */break;
         case 2: ui = 2; /* n6 */break;
         case 3: ui = 3; /* n10 */break;
         case 4: ui = 4; /* n12 */break;
         case 5: ui = 5; /* n16 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 6);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n2");
         case 1: return ("n4");
         case 2: return ("n6");
         case 3: return ("n10");
         case 4: return ("n12");
         case 5: return ("n16");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
