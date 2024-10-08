/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MIN5 = 0;
   public static final int _MIN10 = 1;
   public static final int _MIN20 = 2;
   public static final int _MIN30 = 3;
   public static final int _MIN60 = 4;
   public static final int _MIN120 = 5;
   public static final int _MIN180 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min5 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(0);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min10 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(1);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min20 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(2);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min30 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(3);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min60 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(4);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min120 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(5);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _min180 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(6);
   protected static final RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 _spare1 = new RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12(7);

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
   protected RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for min5.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min5() {
      return _min5;
   }

   /**
    * Singleton accessor method for min10.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min10() {
      return _min10;
   }

   /**
    * Singleton accessor method for min20.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min20() {
      return _min20;
   }

   /**
    * Singleton accessor method for min30.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min30() {
      return _min30;
   }

   /**
    * Singleton accessor method for min60.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min60() {
      return _min60;
   }

   /**
    * Singleton accessor method for min120.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min120() {
      return _min120;
   }

   /**
    * Singleton accessor method for min180.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 min180() {
      return _min180;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 spare1() {
      return _spare1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12.valueOf( RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return min5();
         case 1: return min10();
         case 2: return min20();
         case 3: return min30();
         case 4: return min60();
         case 5: return min120();
         case 6: return min180();
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
      buffer.invokeCharacters (RRCConnectionReconfiguration_v1250_IEs_wlan_OffloadInfo_r12_setup_t350_r12.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("min5");
         case 1: return ("min10");
         case 2: return ("min20");
         case 3: return ("min30");
         case 4: return ("min60");
         case 5: return ("min120");
         case 6: return ("min180");
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
