/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandNR_maxUplinkDutyCycle_PC2_FR1 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N60 = 0;
   public static final int _N70 = 1;
   public static final int _N80 = 2;
   public static final int _N90 = 3;
   public static final int _N100 = 4;

   // Singleton instances of BandNR_maxUplinkDutyCycle_PC2_FR1
   protected static final BandNR_maxUplinkDutyCycle_PC2_FR1 _n60 = new BandNR_maxUplinkDutyCycle_PC2_FR1(0);
   protected static final BandNR_maxUplinkDutyCycle_PC2_FR1 _n70 = new BandNR_maxUplinkDutyCycle_PC2_FR1(1);
   protected static final BandNR_maxUplinkDutyCycle_PC2_FR1 _n80 = new BandNR_maxUplinkDutyCycle_PC2_FR1(2);
   protected static final BandNR_maxUplinkDutyCycle_PC2_FR1 _n90 = new BandNR_maxUplinkDutyCycle_PC2_FR1(3);
   protected static final BandNR_maxUplinkDutyCycle_PC2_FR1 _n100 = new BandNR_maxUplinkDutyCycle_PC2_FR1(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected BandNR_maxUplinkDutyCycle_PC2_FR1 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n60.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 n60() {
      return _n60;
   }

   /**
    * Singleton accessor method for n70.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 n70() {
      return _n70;
   }

   /**
    * Singleton accessor method for n80.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 n80() {
      return _n80;
   }

   /**
    * Singleton accessor method for n90.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 n90() {
      return _n90;
   }

   /**
    * Singleton accessor method for n100.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 n100() {
      return _n100;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return BandNR_maxUplinkDutyCycle_PC2_FR1.valueOf( BandNR_maxUplinkDutyCycle_PC2_FR1.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static BandNR_maxUplinkDutyCycle_PC2_FR1 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n60();
         case 1: return n70();
         case 2: return n80();
         case 3: return n90();
         case 4: return n100();
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
      buffer.invokeCharacters (BandNR_maxUplinkDutyCycle_PC2_FR1.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n60 */break;
         case 1: ui = 1; /* n70 */break;
         case 2: ui = 2; /* n80 */break;
         case 3: ui = 3; /* n90 */break;
         case 4: ui = 4; /* n100 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 5);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n60");
         case 1: return ("n70");
         case 2: return ("n80");
         case 3: return ("n90");
         case 4: return ("n100");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
