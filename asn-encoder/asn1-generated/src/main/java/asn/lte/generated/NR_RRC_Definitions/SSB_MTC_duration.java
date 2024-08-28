/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SSB_MTC_duration extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF1 = 0;
   public static final int _SF2 = 1;
   public static final int _SF3 = 2;
   public static final int _SF4 = 3;
   public static final int _SF5 = 4;

   // Singleton instances of SSB_MTC_duration
   protected static final SSB_MTC_duration _sf1 = new SSB_MTC_duration(0);
   protected static final SSB_MTC_duration _sf2 = new SSB_MTC_duration(1);
   protected static final SSB_MTC_duration _sf3 = new SSB_MTC_duration(2);
   protected static final SSB_MTC_duration _sf4 = new SSB_MTC_duration(3);
   protected static final SSB_MTC_duration _sf5 = new SSB_MTC_duration(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected SSB_MTC_duration (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf1.
    */
   public static SSB_MTC_duration sf1() {
      return _sf1;
   }

   /**
    * Singleton accessor method for sf2.
    */
   public static SSB_MTC_duration sf2() {
      return _sf2;
   }

   /**
    * Singleton accessor method for sf3.
    */
   public static SSB_MTC_duration sf3() {
      return _sf3;
   }

   /**
    * Singleton accessor method for sf4.
    */
   public static SSB_MTC_duration sf4() {
      return _sf4;
   }

   /**
    * Singleton accessor method for sf5.
    */
   public static SSB_MTC_duration sf5() {
      return _sf5;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SSB_MTC_duration.valueOf( SSB_MTC_duration.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SSB_MTC_duration valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf1();
         case 1: return sf2();
         case 2: return sf3();
         case 3: return sf4();
         case 4: return sf5();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SSB_MTC_duration.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf1");
         case 1: return ("sf2");
         case 2: return ("sf3");
         case 3: return ("sf4");
         case 4: return ("sf5");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
