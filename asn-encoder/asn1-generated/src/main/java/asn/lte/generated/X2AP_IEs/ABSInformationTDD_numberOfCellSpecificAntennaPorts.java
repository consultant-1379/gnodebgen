/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class ABSInformationTDD_numberOfCellSpecificAntennaPorts extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _ONE = 0;
   public static final int _TWO = 1;
   public static final int _FOUR = 2;

   // Singleton instances of ABSInformationTDD_numberOfCellSpecificAntennaPorts
   protected static final ABSInformationTDD_numberOfCellSpecificAntennaPorts _one = new ABSInformationTDD_numberOfCellSpecificAntennaPorts(0);
   protected static final ABSInformationTDD_numberOfCellSpecificAntennaPorts _two = new ABSInformationTDD_numberOfCellSpecificAntennaPorts(1);
   protected static final ABSInformationTDD_numberOfCellSpecificAntennaPorts _four = new ABSInformationTDD_numberOfCellSpecificAntennaPorts(2);
   private static ABSInformationTDD_numberOfCellSpecificAntennaPorts __undefined = new ABSInformationTDD_numberOfCellSpecificAntennaPorts(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected ABSInformationTDD_numberOfCellSpecificAntennaPorts (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for one.
    */
   public static ABSInformationTDD_numberOfCellSpecificAntennaPorts one() {
      return _one;
   }

   /**
    * Singleton accessor method for two.
    */
   public static ABSInformationTDD_numberOfCellSpecificAntennaPorts two() {
      return _two;
   }

   /**
    * Singleton accessor method for four.
    */
   public static ABSInformationTDD_numberOfCellSpecificAntennaPorts four() {
      return _four;
   }

   /** Undefined value. */
   protected static ABSInformationTDD_numberOfCellSpecificAntennaPorts __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ABSInformationTDD_numberOfCellSpecificAntennaPorts.valueOf( ABSInformationTDD_numberOfCellSpecificAntennaPorts.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ABSInformationTDD_numberOfCellSpecificAntennaPorts valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return one();
         case 1: return two();
         case 2: return four();
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
         ui = (int) buffer.decodeConsWholeNumber (3);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (ABSInformationTDD_numberOfCellSpecificAntennaPorts.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("one");
         case 1: return ("two");
         case 2: return ("four");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
