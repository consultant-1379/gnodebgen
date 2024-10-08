/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_Resource_resourceMapping_repetitionFactor extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;
   public static final int _N4 = 2;

   // Singleton instances of SRS_Resource_resourceMapping_repetitionFactor
   protected static final SRS_Resource_resourceMapping_repetitionFactor _n1 = new SRS_Resource_resourceMapping_repetitionFactor(0);
   protected static final SRS_Resource_resourceMapping_repetitionFactor _n2 = new SRS_Resource_resourceMapping_repetitionFactor(1);
   protected static final SRS_Resource_resourceMapping_repetitionFactor _n4 = new SRS_Resource_resourceMapping_repetitionFactor(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected SRS_Resource_resourceMapping_repetitionFactor (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static SRS_Resource_resourceMapping_repetitionFactor n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static SRS_Resource_resourceMapping_repetitionFactor n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static SRS_Resource_resourceMapping_repetitionFactor n4() {
      return _n4;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SRS_Resource_resourceMapping_repetitionFactor.valueOf( SRS_Resource_resourceMapping_repetitionFactor.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SRS_Resource_resourceMapping_repetitionFactor valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
         case 2: return n4();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (3);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SRS_Resource_resourceMapping_repetitionFactor.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         case 2: return ("n4");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
