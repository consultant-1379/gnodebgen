/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_IEs;

import com.objsys.asn1j.runtime.*;

public class MeasurementQuantitiesValue extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasurementQuantitiesValue";
   }

   // Integer constants for switch-case
   public static final int _CELL_ID = 0;
   public static final int _ANGLEOFARRIVAL = 1;
   public static final int _TIMINGADVANCETYPE1 = 2;
   public static final int _TIMINGADVANCETYPE2 = 3;
   public static final int _RSRP = 4;
   public static final int _RSRQ = 5;

   // Singleton instances of MeasurementQuantitiesValue
   protected static final MeasurementQuantitiesValue _cell_ID = new MeasurementQuantitiesValue(0);
   protected static final MeasurementQuantitiesValue _angleOfArrival = new MeasurementQuantitiesValue(1);
   protected static final MeasurementQuantitiesValue _timingAdvanceType1 = new MeasurementQuantitiesValue(2);
   protected static final MeasurementQuantitiesValue _timingAdvanceType2 = new MeasurementQuantitiesValue(3);
   protected static final MeasurementQuantitiesValue _rSRP = new MeasurementQuantitiesValue(4);
   protected static final MeasurementQuantitiesValue _rSRQ = new MeasurementQuantitiesValue(5);
   private static MeasurementQuantitiesValue __undefined = new MeasurementQuantitiesValue(-999);

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
   protected MeasurementQuantitiesValue (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for cell_ID.
    */
   public static MeasurementQuantitiesValue cell_ID() {
      return _cell_ID;
   }

   /**
    * Singleton accessor method for angleOfArrival.
    */
   public static MeasurementQuantitiesValue angleOfArrival() {
      return _angleOfArrival;
   }

   /**
    * Singleton accessor method for timingAdvanceType1.
    */
   public static MeasurementQuantitiesValue timingAdvanceType1() {
      return _timingAdvanceType1;
   }

   /**
    * Singleton accessor method for timingAdvanceType2.
    */
   public static MeasurementQuantitiesValue timingAdvanceType2() {
      return _timingAdvanceType2;
   }

   /**
    * Singleton accessor method for rSRP.
    */
   public static MeasurementQuantitiesValue rSRP() {
      return _rSRP;
   }

   /**
    * Singleton accessor method for rSRQ.
    */
   public static MeasurementQuantitiesValue rSRQ() {
      return _rSRQ;
   }

   /** Undefined value. */
   protected static MeasurementQuantitiesValue __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MeasurementQuantitiesValue.valueOf( MeasurementQuantitiesValue.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MeasurementQuantitiesValue valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return cell_ID();
         case 1: return angleOfArrival();
         case 2: return timingAdvanceType1();
         case 3: return timingAdvanceType2();
         case 4: return rSRP();
         case 5: return rSRQ();
         default: return __undefined_();
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      boolean extbit = buffer.decodeBit ("extbit");

      if (extbit) {
         ui = buffer.decodeSmallNonNegWholeNumber ();

         return 0x7fffffff;
      }
      else {
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
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MeasurementQuantitiesValue.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("cell-ID");
         case 1: return ("angleOfArrival");
         case 2: return ("timingAdvanceType1");
         case 3: return ("timingAdvanceType2");
         case 4: return ("rSRP");
         case 5: return ("rSRQ");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
