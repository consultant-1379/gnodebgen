/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N4 = 0;
   public static final int _N8 = 1;
   public static final int _N12 = 2;
   public static final int _N16 = 3;
   public static final int _N20 = 4;
   public static final int _N24 = 5;
   public static final int _N28 = 6;
   public static final int _N32 = 7;
   public static final int _N36 = 8;
   public static final int _N40 = 9;
   public static final int _N44 = 10;
   public static final int _N48 = 11;
   public static final int _N52 = 12;
   public static final int _N56 = 13;
   public static final int _N60 = 14;
   public static final int _N64 = 15;

   // Singleton instances of RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n4 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(0);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n8 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(1);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n12 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(2);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n16 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(3);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n20 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(4);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n24 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(5);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n28 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(6);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n32 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(7);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n36 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(8);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n40 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(9);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n44 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(10);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n48 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(11);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n52 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(12);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n56 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(13);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n60 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(14);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth _n64 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth(15);

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
   protected RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n12.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n12() {
      return _n12;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n20.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n20() {
      return _n20;
   }

   /**
    * Singleton accessor method for n24.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n24() {
      return _n24;
   }

   /**
    * Singleton accessor method for n28.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n28() {
      return _n28;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n32() {
      return _n32;
   }

   /**
    * Singleton accessor method for n36.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n36() {
      return _n36;
   }

   /**
    * Singleton accessor method for n40.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n40() {
      return _n40;
   }

   /**
    * Singleton accessor method for n44.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n44() {
      return _n44;
   }

   /**
    * Singleton accessor method for n48.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n48() {
      return _n48;
   }

   /**
    * Singleton accessor method for n52.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n52() {
      return _n52;
   }

   /**
    * Singleton accessor method for n56.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n56() {
      return _n56;
   }

   /**
    * Singleton accessor method for n60.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n60() {
      return _n60;
   }

   /**
    * Singleton accessor method for n64.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth n64() {
      return _n64;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth.valueOf( RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n4();
         case 1: return n8();
         case 2: return n12();
         case 3: return n16();
         case 4: return n20();
         case 5: return n24();
         case 6: return n28();
         case 7: return n32();
         case 8: return n36();
         case 9: return n40();
         case 10: return n44();
         case 11: return n48();
         case 12: return n52();
         case 13: return n56();
         case 14: return n60();
         case 15: return n64();
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
      buffer.invokeCharacters (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_oneEighth.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n4 */break;
         case 1: ui = 1; /* n8 */break;
         case 2: ui = 2; /* n12 */break;
         case 3: ui = 3; /* n16 */break;
         case 4: ui = 4; /* n20 */break;
         case 5: ui = 5; /* n24 */break;
         case 6: ui = 6; /* n28 */break;
         case 7: ui = 7; /* n32 */break;
         case 8: ui = 8; /* n36 */break;
         case 9: ui = 9; /* n40 */break;
         case 10: ui = 10; /* n44 */break;
         case 11: ui = 11; /* n48 */break;
         case 12: ui = 12; /* n52 */break;
         case 13: ui = 13; /* n56 */break;
         case 14: ui = 14; /* n60 */break;
         case 15: ui = 15; /* n64 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 16);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n4");
         case 1: return ("n8");
         case 2: return ("n12");
         case 3: return ("n16");
         case 4: return ("n20");
         case 5: return ("n24");
         case 6: return ("n28");
         case 7: return ("n32");
         case 8: return ("n36");
         case 9: return ("n40");
         case 10: return ("n44");
         case 11: return ("n48");
         case 12: return ("n52");
         case 13: return ("n56");
         case 14: return ("n60");
         case 15: return ("n64");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
