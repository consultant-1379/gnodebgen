/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_IEs;

import com.objsys.asn1j.runtime.*;

public class NumberOfDlFrames extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "NumberOfDlFrames";
   }

   // Integer constants for switch-case
   public static final int _SF1 = 0;
   public static final int _SF2 = 1;
   public static final int _SF4 = 2;
   public static final int _SF6 = 3;

   // Singleton instances of NumberOfDlFrames
   protected static final NumberOfDlFrames _sf1 = new NumberOfDlFrames(0);
   protected static final NumberOfDlFrames _sf2 = new NumberOfDlFrames(1);
   protected static final NumberOfDlFrames _sf4 = new NumberOfDlFrames(2);
   protected static final NumberOfDlFrames _sf6 = new NumberOfDlFrames(3);
   private static NumberOfDlFrames __undefined = new NumberOfDlFrames(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected NumberOfDlFrames (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf1.
    */
   public static NumberOfDlFrames sf1() {
      return _sf1;
   }

   /**
    * Singleton accessor method for sf2.
    */
   public static NumberOfDlFrames sf2() {
      return _sf2;
   }

   /**
    * Singleton accessor method for sf4.
    */
   public static NumberOfDlFrames sf4() {
      return _sf4;
   }

   /**
    * Singleton accessor method for sf6.
    */
   public static NumberOfDlFrames sf6() {
      return _sf6;
   }

   /** Undefined value. */
   protected static NumberOfDlFrames __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return NumberOfDlFrames.valueOf( NumberOfDlFrames.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static NumberOfDlFrames valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return sf1();
         case 1: return sf2();
         case 2: return sf4();
         case 3: return sf6();
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
         ui = (int) buffer.decodeConsWholeNumber (4);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (NumberOfDlFrames.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf1");
         case 1: return ("sf2");
         case 2: return ("sf4");
         case 3: return ("sf6");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
