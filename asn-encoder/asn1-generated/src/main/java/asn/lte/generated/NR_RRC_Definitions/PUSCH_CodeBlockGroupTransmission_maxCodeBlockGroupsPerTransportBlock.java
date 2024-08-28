/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N2 = 0;
   public static final int _N4 = 1;
   public static final int _N6 = 2;
   public static final int _N8 = 3;

   // Singleton instances of PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock
   protected static final PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock _n2 = new PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock(0);
   protected static final PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock _n4 = new PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock(1);
   protected static final PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock _n6 = new PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock(2);
   protected static final PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock _n8 = new PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n2.
    */
   public static PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock n8() {
      return _n8;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock.valueOf( PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n2();
         case 1: return n4();
         case 2: return n6();
         case 3: return n8();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (4);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (PUSCH_CodeBlockGroupTransmission_maxCodeBlockGroupsPerTransportBlock.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n2");
         case 1: return ("n4");
         case 2: return ("n6");
         case 3: return ("n8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
