/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AggregatedBandwidth extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AggregatedBandwidth";
   }

   // Integer constants for switch-case
   public static final int _MHZ50 = 0;
   public static final int _MHZ100 = 1;
   public static final int _MHZ150 = 2;
   public static final int _MHZ200 = 3;
   public static final int _MHZ250 = 4;
   public static final int _MHZ300 = 5;
   public static final int _MHZ350 = 6;
   public static final int _MHZ400 = 7;
   public static final int _MHZ450 = 8;
   public static final int _MHZ500 = 9;
   public static final int _MHZ550 = 10;
   public static final int _MHZ600 = 11;
   public static final int _MHZ650 = 12;
   public static final int _MHZ700 = 13;
   public static final int _MHZ750 = 14;
   public static final int _MHZ800 = 15;

   // Singleton instances of AggregatedBandwidth
   protected static final AggregatedBandwidth _mhz50 = new AggregatedBandwidth(0);
   protected static final AggregatedBandwidth _mhz100 = new AggregatedBandwidth(1);
   protected static final AggregatedBandwidth _mhz150 = new AggregatedBandwidth(2);
   protected static final AggregatedBandwidth _mhz200 = new AggregatedBandwidth(3);
   protected static final AggregatedBandwidth _mhz250 = new AggregatedBandwidth(4);
   protected static final AggregatedBandwidth _mhz300 = new AggregatedBandwidth(5);
   protected static final AggregatedBandwidth _mhz350 = new AggregatedBandwidth(6);
   protected static final AggregatedBandwidth _mhz400 = new AggregatedBandwidth(7);
   protected static final AggregatedBandwidth _mhz450 = new AggregatedBandwidth(8);
   protected static final AggregatedBandwidth _mhz500 = new AggregatedBandwidth(9);
   protected static final AggregatedBandwidth _mhz550 = new AggregatedBandwidth(10);
   protected static final AggregatedBandwidth _mhz600 = new AggregatedBandwidth(11);
   protected static final AggregatedBandwidth _mhz650 = new AggregatedBandwidth(12);
   protected static final AggregatedBandwidth _mhz700 = new AggregatedBandwidth(13);
   protected static final AggregatedBandwidth _mhz750 = new AggregatedBandwidth(14);
   protected static final AggregatedBandwidth _mhz800 = new AggregatedBandwidth(15);

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
    *   12
    *   13
    *   14
    *   15
    */
   protected AggregatedBandwidth (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for mhz50.
    */
   public static AggregatedBandwidth mhz50() {
      return _mhz50;
   }

   /**
    * Singleton accessor method for mhz100.
    */
   public static AggregatedBandwidth mhz100() {
      return _mhz100;
   }

   /**
    * Singleton accessor method for mhz150.
    */
   public static AggregatedBandwidth mhz150() {
      return _mhz150;
   }

   /**
    * Singleton accessor method for mhz200.
    */
   public static AggregatedBandwidth mhz200() {
      return _mhz200;
   }

   /**
    * Singleton accessor method for mhz250.
    */
   public static AggregatedBandwidth mhz250() {
      return _mhz250;
   }

   /**
    * Singleton accessor method for mhz300.
    */
   public static AggregatedBandwidth mhz300() {
      return _mhz300;
   }

   /**
    * Singleton accessor method for mhz350.
    */
   public static AggregatedBandwidth mhz350() {
      return _mhz350;
   }

   /**
    * Singleton accessor method for mhz400.
    */
   public static AggregatedBandwidth mhz400() {
      return _mhz400;
   }

   /**
    * Singleton accessor method for mhz450.
    */
   public static AggregatedBandwidth mhz450() {
      return _mhz450;
   }

   /**
    * Singleton accessor method for mhz500.
    */
   public static AggregatedBandwidth mhz500() {
      return _mhz500;
   }

   /**
    * Singleton accessor method for mhz550.
    */
   public static AggregatedBandwidth mhz550() {
      return _mhz550;
   }

   /**
    * Singleton accessor method for mhz600.
    */
   public static AggregatedBandwidth mhz600() {
      return _mhz600;
   }

   /**
    * Singleton accessor method for mhz650.
    */
   public static AggregatedBandwidth mhz650() {
      return _mhz650;
   }

   /**
    * Singleton accessor method for mhz700.
    */
   public static AggregatedBandwidth mhz700() {
      return _mhz700;
   }

   /**
    * Singleton accessor method for mhz750.
    */
   public static AggregatedBandwidth mhz750() {
      return _mhz750;
   }

   /**
    * Singleton accessor method for mhz800.
    */
   public static AggregatedBandwidth mhz800() {
      return _mhz800;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return AggregatedBandwidth.valueOf( AggregatedBandwidth.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static AggregatedBandwidth valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return mhz50();
         case 1: return mhz100();
         case 2: return mhz150();
         case 3: return mhz200();
         case 4: return mhz250();
         case 5: return mhz300();
         case 6: return mhz350();
         case 7: return mhz400();
         case 8: return mhz450();
         case 9: return mhz500();
         case 10: return mhz550();
         case 11: return mhz600();
         case 12: return mhz650();
         case 13: return mhz700();
         case 14: return mhz750();
         case 15: return mhz800();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (16);

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
         case 12: ret =  12; break;
         case 13: ret =  13; break;
         case 14: ret =  14; break;
         case 15: ret =  15; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (AggregatedBandwidth.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* mhz50 */break;
         case 1: ui = 1; /* mhz100 */break;
         case 2: ui = 2; /* mhz150 */break;
         case 3: ui = 3; /* mhz200 */break;
         case 4: ui = 4; /* mhz250 */break;
         case 5: ui = 5; /* mhz300 */break;
         case 6: ui = 6; /* mhz350 */break;
         case 7: ui = 7; /* mhz400 */break;
         case 8: ui = 8; /* mhz450 */break;
         case 9: ui = 9; /* mhz500 */break;
         case 10: ui = 10; /* mhz550 */break;
         case 11: ui = 11; /* mhz600 */break;
         case 12: ui = 12; /* mhz650 */break;
         case 13: ui = 13; /* mhz700 */break;
         case 14: ui = 14; /* mhz750 */break;
         case 15: ui = 15; /* mhz800 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 16);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("mhz50");
         case 1: return ("mhz100");
         case 2: return ("mhz150");
         case 3: return ("mhz200");
         case 4: return ("mhz250");
         case 5: return ("mhz300");
         case 6: return ("mhz350");
         case 7: return ("mhz400");
         case 8: return ("mhz450");
         case 9: return ("mhz500");
         case 10: return ("mhz550");
         case 11: return ("mhz600");
         case 12: return ("mhz650");
         case 13: return ("mhz700");
         case 14: return ("mhz750");
         case 15: return ("mhz800");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
