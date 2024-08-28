/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PUCCH_SpatialRelationInfo_closedLoopIndex extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _I0 = 0;
   public static final int _I1 = 1;

   // Singleton instances of PUCCH_SpatialRelationInfo_closedLoopIndex
   protected static final PUCCH_SpatialRelationInfo_closedLoopIndex _i0 = new PUCCH_SpatialRelationInfo_closedLoopIndex(0);
   protected static final PUCCH_SpatialRelationInfo_closedLoopIndex _i1 = new PUCCH_SpatialRelationInfo_closedLoopIndex(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected PUCCH_SpatialRelationInfo_closedLoopIndex (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for i0.
    */
   public static PUCCH_SpatialRelationInfo_closedLoopIndex i0() {
      return _i0;
   }

   /**
    * Singleton accessor method for i1.
    */
   public static PUCCH_SpatialRelationInfo_closedLoopIndex i1() {
      return _i1;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PUCCH_SpatialRelationInfo_closedLoopIndex.valueOf( PUCCH_SpatialRelationInfo_closedLoopIndex.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PUCCH_SpatialRelationInfo_closedLoopIndex valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return i0();
         case 1: return i1();
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
      buffer.invokeCharacters (PUCCH_SpatialRelationInfo_closedLoopIndex.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("i0");
         case 1: return ("i1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
