/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ReducedAggregatedBandwidth extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ReducedAggregatedBandwidth";
   }

   // Integer constants for switch-case
   public static final int _MHZ0 = 0;
   public static final int _MHZ10 = 1;
   public static final int _MHZ20 = 2;
   public static final int _MHZ30 = 3;
   public static final int _MHZ40 = 4;
   public static final int _MHZ50 = 5;
   public static final int _MHZ60 = 6;
   public static final int _MHZ80 = 7;
   public static final int _MHZ100 = 8;
   public static final int _MHZ200 = 9;
   public static final int _MHZ300 = 10;
   public static final int _MHZ400 = 11;

   // Singleton instances of ReducedAggregatedBandwidth
   protected static final ReducedAggregatedBandwidth _mhz0 = new ReducedAggregatedBandwidth(0);
   protected static final ReducedAggregatedBandwidth _mhz10 = new ReducedAggregatedBandwidth(1);
   protected static final ReducedAggregatedBandwidth _mhz20 = new ReducedAggregatedBandwidth(2);
   protected static final ReducedAggregatedBandwidth _mhz30 = new ReducedAggregatedBandwidth(3);
   protected static final ReducedAggregatedBandwidth _mhz40 = new ReducedAggregatedBandwidth(4);
   protected static final ReducedAggregatedBandwidth _mhz50 = new ReducedAggregatedBandwidth(5);
   protected static final ReducedAggregatedBandwidth _mhz60 = new ReducedAggregatedBandwidth(6);
   protected static final ReducedAggregatedBandwidth _mhz80 = new ReducedAggregatedBandwidth(7);
   protected static final ReducedAggregatedBandwidth _mhz100 = new ReducedAggregatedBandwidth(8);
   protected static final ReducedAggregatedBandwidth _mhz200 = new ReducedAggregatedBandwidth(9);
   protected static final ReducedAggregatedBandwidth _mhz300 = new ReducedAggregatedBandwidth(10);
   protected static final ReducedAggregatedBandwidth _mhz400 = new ReducedAggregatedBandwidth(11);

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
    */
   protected ReducedAggregatedBandwidth (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mhz0.
    */
   public static ReducedAggregatedBandwidth mhz0() {
      return _mhz0;
   }

   /**
    * Singleton accessor method for mhz10.
    */
   public static ReducedAggregatedBandwidth mhz10() {
      return _mhz10;
   }

   /**
    * Singleton accessor method for mhz20.
    */
   public static ReducedAggregatedBandwidth mhz20() {
      return _mhz20;
   }

   /**
    * Singleton accessor method for mhz30.
    */
   public static ReducedAggregatedBandwidth mhz30() {
      return _mhz30;
   }

   /**
    * Singleton accessor method for mhz40.
    */
   public static ReducedAggregatedBandwidth mhz40() {
      return _mhz40;
   }

   /**
    * Singleton accessor method for mhz50.
    */
   public static ReducedAggregatedBandwidth mhz50() {
      return _mhz50;
   }

   /**
    * Singleton accessor method for mhz60.
    */
   public static ReducedAggregatedBandwidth mhz60() {
      return _mhz60;
   }

   /**
    * Singleton accessor method for mhz80.
    */
   public static ReducedAggregatedBandwidth mhz80() {
      return _mhz80;
   }

   /**
    * Singleton accessor method for mhz100.
    */
   public static ReducedAggregatedBandwidth mhz100() {
      return _mhz100;
   }

   /**
    * Singleton accessor method for mhz200.
    */
   public static ReducedAggregatedBandwidth mhz200() {
      return _mhz200;
   }

   /**
    * Singleton accessor method for mhz300.
    */
   public static ReducedAggregatedBandwidth mhz300() {
      return _mhz300;
   }

   /**
    * Singleton accessor method for mhz400.
    */
   public static ReducedAggregatedBandwidth mhz400() {
      return _mhz400;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ReducedAggregatedBandwidth.valueOf( ReducedAggregatedBandwidth.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ReducedAggregatedBandwidth valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mhz0();
         case 1: return mhz10();
         case 2: return mhz20();
         case 3: return mhz30();
         case 4: return mhz40();
         case 5: return mhz50();
         case 6: return mhz60();
         case 7: return mhz80();
         case 8: return mhz100();
         case 9: return mhz200();
         case 10: return mhz300();
         case 11: return mhz400();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (12);

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
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ReducedAggregatedBandwidth.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* mhz0 */break;
         case 1: ui = 1; /* mhz10 */break;
         case 2: ui = 2; /* mhz20 */break;
         case 3: ui = 3; /* mhz30 */break;
         case 4: ui = 4; /* mhz40 */break;
         case 5: ui = 5; /* mhz50 */break;
         case 6: ui = 6; /* mhz60 */break;
         case 7: ui = 7; /* mhz80 */break;
         case 8: ui = 8; /* mhz100 */break;
         case 9: ui = 9; /* mhz200 */break;
         case 10: ui = 10; /* mhz300 */break;
         case 11: ui = 11; /* mhz400 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 12);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mhz0");
         case 1: return ("mhz10");
         case 2: return ("mhz20");
         case 3: return ("mhz30");
         case 4: return ("mhz40");
         case 5: return ("mhz50");
         case 6: return ("mhz60");
         case 7: return ("mhz80");
         case 8: return ("mhz100");
         case 9: return ("mhz200");
         case 10: return ("mhz300");
         case 11: return ("mhz400");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
