/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N4 = 0;
   public static final int _N8 = 1;
   public static final int _N16 = 2;
   public static final int _N32 = 3;
   public static final int _N64 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _n4 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(0);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _n8 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(1);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _n16 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(2);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _n32 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(3);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _n64 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(4);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _spare3 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(5);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _spare2 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(6);
   protected static final SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 _spare1 = new SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13(7);

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
   protected SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 n32() {
      return _n32;
   }

   /**
    * Singleton accessor method for n64.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 n64() {
      return _n64;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13.valueOf( SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n4();
         case 1: return n8();
         case 2: return n16();
         case 3: return n32();
         case 4: return n64();
         case 5: return spare3();
         case 6: return spare2();
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
      buffer.invokeCharacters (SchedulingRequestConfigSCell_r13_setup_dsr_TransMax_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n4");
         case 1: return ("n8");
         case 2: return ("n16");
         case 3: return ("n32");
         case 4: return ("n64");
         case 5: return ("spare3");
         case 6: return ("spare2");
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
