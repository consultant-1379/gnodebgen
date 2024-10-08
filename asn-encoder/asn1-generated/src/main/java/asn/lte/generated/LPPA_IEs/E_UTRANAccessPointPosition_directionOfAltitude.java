/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.LPPA_IEs;

import com.objsys.asn1j.runtime.*;

public class E_UTRANAccessPointPosition_directionOfAltitude extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_LPPA_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _HEIGHT = 0;
   public static final int _DEPTH = 1;

   // Singleton instances of E_UTRANAccessPointPosition_directionOfAltitude
   protected static final E_UTRANAccessPointPosition_directionOfAltitude _height = new E_UTRANAccessPointPosition_directionOfAltitude(0);
   protected static final E_UTRANAccessPointPosition_directionOfAltitude _depth = new E_UTRANAccessPointPosition_directionOfAltitude(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected E_UTRANAccessPointPosition_directionOfAltitude (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for height.
    */
   public static E_UTRANAccessPointPosition_directionOfAltitude height() {
      return _height;
   }

   /**
    * Singleton accessor method for depth.
    */
   public static E_UTRANAccessPointPosition_directionOfAltitude depth() {
      return _depth;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return E_UTRANAccessPointPosition_directionOfAltitude.valueOf( E_UTRANAccessPointPosition_directionOfAltitude.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static E_UTRANAccessPointPosition_directionOfAltitude valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return height();
         case 1: return depth();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (2);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (E_UTRANAccessPointPosition_directionOfAltitude.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("height");
         case 1: return ("depth");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
