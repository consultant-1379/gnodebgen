/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasResultWLAN_r13_connectedWLAN_r13 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _TRUE_ = 0;

   // Singleton instances of MeasResultWLAN_r13_connectedWLAN_r13
   protected static final MeasResultWLAN_r13_connectedWLAN_r13 _true_ = new MeasResultWLAN_r13_connectedWLAN_r13(0);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    */
   protected MeasResultWLAN_r13_connectedWLAN_r13 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for true_.
    */
   public static MeasResultWLAN_r13_connectedWLAN_r13 true_() {
      return _true_;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MeasResultWLAN_r13_connectedWLAN_r13.valueOf( MeasResultWLAN_r13_connectedWLAN_r13.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MeasResultWLAN_r13_connectedWLAN_r13 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return true_();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (1);

      switch (ui) {
         case 0: ret =  0; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (MeasResultWLAN_r13_connectedWLAN_r13.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("true");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
