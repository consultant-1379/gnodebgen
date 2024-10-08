/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF240 = 0;
   public static final int _SF480 = 1;
   public static final int _SF960 = 2;
   public static final int _SF1920 = 3;
   public static final int _SF3840 = 4;
   public static final int _SF5760 = 5;
   public static final int _SF7680 = 6;
   public static final int _SF10240 = 7;

   // Singleton instances of RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf240 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(0);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf480 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(1);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf960 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(2);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf1920 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(3);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf3840 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(4);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf5760 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(5);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf7680 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(6);
   protected static final RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 _sf10240 = new RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15(7);

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
   protected RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf240.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf240() {
      return _sf240;
   }

   /**
    * Singleton accessor method for sf480.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf480() {
      return _sf480;
   }

   /**
    * Singleton accessor method for sf960.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf960() {
      return _sf960;
   }

   /**
    * Singleton accessor method for sf1920.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf1920() {
      return _sf1920;
   }

   /**
    * Singleton accessor method for sf3840.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf3840() {
      return _sf3840;
   }

   /**
    * Singleton accessor method for sf5760.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf5760() {
      return _sf5760;
   }

   /**
    * Singleton accessor method for sf7680.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf7680() {
      return _sf7680;
   }

   /**
    * Singleton accessor method for sf10240.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 sf10240() {
      return _sf10240;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15.valueOf( RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf240();
         case 1: return sf480();
         case 2: return sf960();
         case 3: return sf1920();
         case 4: return sf3840();
         case 5: return sf5760();
         case 6: return sf7680();
         case 7: return sf10240();
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
      buffer.invokeCharacters (RACH_CE_LevelInfo_r13_edt_Parameters_r15_mac_ContentionResolutionTimer_r15.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf240");
         case 1: return ("sf480");
         case 2: return ("sf960");
         case 3: return ("sf1920");
         case 4: return ("sf3840");
         case 5: return ("sf5760");
         case 6: return ("sf7680");
         case 7: return ("sf10240");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
