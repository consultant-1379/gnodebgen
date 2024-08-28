/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class Cell_Size extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "Cell-Size";
   }

   // Integer constants for switch-case
   public static final int _VERYSMALL = 0;
   public static final int _SMALL = 1;
   public static final int _MEDIUM = 2;
   public static final int _LARGE = 3;

   // Singleton instances of Cell_Size
   protected static final Cell_Size _verysmall = new Cell_Size(0);
   protected static final Cell_Size _small = new Cell_Size(1);
   protected static final Cell_Size _medium = new Cell_Size(2);
   protected static final Cell_Size _large = new Cell_Size(3);
   private static Cell_Size __undefined = new Cell_Size(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected Cell_Size (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for verysmall.
    */
   public static Cell_Size verysmall() {
      return _verysmall;
   }

   /**
    * Singleton accessor method for small.
    */
   public static Cell_Size small() {
      return _small;
   }

   /**
    * Singleton accessor method for medium.
    */
   public static Cell_Size medium() {
      return _medium;
   }

   /**
    * Singleton accessor method for large.
    */
   public static Cell_Size large() {
      return _large;
   }

   /** Undefined value. */
   protected static Cell_Size __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return Cell_Size.valueOf( Cell_Size.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static Cell_Size valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return verysmall();
         case 1: return small();
         case 2: return medium();
         case 3: return large();
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
      buffer.invokeCharacters (Cell_Size.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("verysmall");
         case 1: return ("small");
         case 2: return ("medium");
         case 3: return ("large");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
