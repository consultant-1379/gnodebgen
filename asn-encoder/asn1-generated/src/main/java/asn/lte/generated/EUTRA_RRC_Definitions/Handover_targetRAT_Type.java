/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class Handover_targetRAT_Type extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _UTRA = 0;
   public static final int _GERAN = 1;
   public static final int _CDMA2000_1XRTT = 2;
   public static final int _CDMA2000_HRPD = 3;
   public static final int _NR = 4;
   public static final int _EUTRA = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of Handover_targetRAT_Type
   protected static final Handover_targetRAT_Type _utra = new Handover_targetRAT_Type(0);
   protected static final Handover_targetRAT_Type _geran = new Handover_targetRAT_Type(1);
   protected static final Handover_targetRAT_Type _cdma2000_1XRTT = new Handover_targetRAT_Type(2);
   protected static final Handover_targetRAT_Type _cdma2000_HRPD = new Handover_targetRAT_Type(3);
   protected static final Handover_targetRAT_Type _nr = new Handover_targetRAT_Type(4);
   protected static final Handover_targetRAT_Type _eutra = new Handover_targetRAT_Type(5);
   protected static final Handover_targetRAT_Type _spare2 = new Handover_targetRAT_Type(6);
   protected static final Handover_targetRAT_Type _spare1 = new Handover_targetRAT_Type(7);
   private static Handover_targetRAT_Type __undefined = new Handover_targetRAT_Type(-999);

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
   protected Handover_targetRAT_Type (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for utra.
    */
   public static Handover_targetRAT_Type utra() {
      return _utra;
   }

   /**
    * Singleton accessor method for geran.
    */
   public static Handover_targetRAT_Type geran() {
      return _geran;
   }

   /**
    * Singleton accessor method for cdma2000_1XRTT.
    */
   public static Handover_targetRAT_Type cdma2000_1XRTT() {
      return _cdma2000_1XRTT;
   }

   /**
    * Singleton accessor method for cdma2000_HRPD.
    */
   public static Handover_targetRAT_Type cdma2000_HRPD() {
      return _cdma2000_HRPD;
   }

   /**
    * Singleton accessor method for nr.
    */
   public static Handover_targetRAT_Type nr() {
      return _nr;
   }

   /**
    * Singleton accessor method for eutra.
    */
   public static Handover_targetRAT_Type eutra() {
      return _eutra;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static Handover_targetRAT_Type spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static Handover_targetRAT_Type spare1() {
      return _spare1;
   }

   /** Undefined value. */
   protected static Handover_targetRAT_Type __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Handover_targetRAT_Type.valueOf( Handover_targetRAT_Type.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Handover_targetRAT_Type valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return utra();
         case 1: return geran();
         case 2: return cdma2000_1XRTT();
         case 3: return cdma2000_HRPD();
         case 4: return nr();
         case 5: return eutra();
         case 6: return spare2();
         case 7: return spare1();
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
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (Handover_targetRAT_Type.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("utra");
         case 1: return ("geran");
         case 2: return ("cdma2000-1XRTT");
         case 3: return ("cdma2000-HRPD");
         case 4: return ("nr");
         case 5: return ("eutra");
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
