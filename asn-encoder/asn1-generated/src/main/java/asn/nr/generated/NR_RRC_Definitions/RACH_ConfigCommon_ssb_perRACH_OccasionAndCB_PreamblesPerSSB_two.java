/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two extends Asn1Enumerated {
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

   // Singleton instances of RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n4 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(0);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n8 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(1);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n12 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(2);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n16 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(3);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n20 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(4);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n24 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(5);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n28 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(6);
   protected static final RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two _n32 = new RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two(7);

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
   protected RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n4.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n8() {
      return _n8;
   }

   /**
    * Singleton accessor method for n12.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n12() {
      return _n12;
   }

   /**
    * Singleton accessor method for n16.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n16() {
      return _n16;
   }

   /**
    * Singleton accessor method for n20.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n20() {
      return _n20;
   }

   /**
    * Singleton accessor method for n24.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n24() {
      return _n24;
   }

   /**
    * Singleton accessor method for n28.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n28() {
      return _n28;
   }

   /**
    * Singleton accessor method for n32.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two n32() {
      return _n32;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two.valueOf( RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two valueOf (int _value)
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
      buffer.invokeCharacters (RACH_ConfigCommon_ssb_perRACH_OccasionAndCB_PreamblesPerSSB_two.valueOf(ret).toString());

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
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 8);
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
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
