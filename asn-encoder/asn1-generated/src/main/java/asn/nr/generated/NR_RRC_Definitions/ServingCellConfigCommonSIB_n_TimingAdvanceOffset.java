/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class ServingCellConfigCommonSIB_n_TimingAdvanceOffset extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N25600 = 1;
   public static final int _N39936 = 2;

   // Singleton instances of ServingCellConfigCommonSIB_n_TimingAdvanceOffset
   protected static final ServingCellConfigCommonSIB_n_TimingAdvanceOffset _n0 = new ServingCellConfigCommonSIB_n_TimingAdvanceOffset(0);
   protected static final ServingCellConfigCommonSIB_n_TimingAdvanceOffset _n25600 = new ServingCellConfigCommonSIB_n_TimingAdvanceOffset(1);
   protected static final ServingCellConfigCommonSIB_n_TimingAdvanceOffset _n39936 = new ServingCellConfigCommonSIB_n_TimingAdvanceOffset(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected ServingCellConfigCommonSIB_n_TimingAdvanceOffset (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static ServingCellConfigCommonSIB_n_TimingAdvanceOffset n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n25600.
    */
   public static ServingCellConfigCommonSIB_n_TimingAdvanceOffset n25600() {
      return _n25600;
   }

   /**
    * Singleton accessor method for n39936.
    */
   public static ServingCellConfigCommonSIB_n_TimingAdvanceOffset n39936() {
      return _n39936;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return ServingCellConfigCommonSIB_n_TimingAdvanceOffset.valueOf( ServingCellConfigCommonSIB_n_TimingAdvanceOffset.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static ServingCellConfigCommonSIB_n_TimingAdvanceOffset valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n25600();
         case 2: return n39936();
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
      buffer.invokeCharacters (ServingCellConfigCommonSIB_n_TimingAdvanceOffset.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* n0 */break;
         case 1: ui = 1; /* n25600 */break;
         case 2: ui = 2; /* n39936 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 3);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n25600");
         case 2: return ("n39936");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
