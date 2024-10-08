/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_IEs;

import com.objsys.asn1j.runtime.*;

public class UserPlaneTrafficActivityReport extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_IEsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "UserPlaneTrafficActivityReport";
   }

   // Integer constants for switch-case
   public static final int _INACTIVE = 0;
   public static final int _RE_ACTIVATED = 1;

   // Singleton instances of UserPlaneTrafficActivityReport
   protected static final UserPlaneTrafficActivityReport _inactive = new UserPlaneTrafficActivityReport(0);
   protected static final UserPlaneTrafficActivityReport _re_activated = new UserPlaneTrafficActivityReport(1);
   private static UserPlaneTrafficActivityReport __undefined = new UserPlaneTrafficActivityReport(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected UserPlaneTrafficActivityReport (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for inactive.
    */
   public static UserPlaneTrafficActivityReport inactive() {
      return _inactive;
   }

   /**
    * Singleton accessor method for re_activated.
    */
   public static UserPlaneTrafficActivityReport re_activated() {
      return _re_activated;
   }

   /** Undefined value. */
   protected static UserPlaneTrafficActivityReport __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return UserPlaneTrafficActivityReport.valueOf( UserPlaneTrafficActivityReport.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static UserPlaneTrafficActivityReport valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return inactive();
         case 1: return re_activated();
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
         ui = (int) buffer.decodeConsWholeNumber (2);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (UserPlaneTrafficActivityReport.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("inactive");
         case 1: return ("re-activated");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
