/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SIZE24 = 0;
   public static final int _SIZE48 = 1;
   public static final int _SIZE96 = 2;
   public static final int _SIZE192 = 3;
   public static final int _SIZE264 = 4;

   // Singleton instances of CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs
   protected static final CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs _size24 = new CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs(0);
   protected static final CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs _size48 = new CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs(1);
   protected static final CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs _size96 = new CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs(2);
   protected static final CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs _size192 = new CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs(3);
   protected static final CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs _size264 = new CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs(4);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    */
   protected CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for size24.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs size24() {
      return _size24;
   }

   /**
    * Singleton accessor method for size48.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs size48() {
      return _size48;
   }

   /**
    * Singleton accessor method for size96.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs size96() {
      return _size96;
   }

   /**
    * Singleton accessor method for size192.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs size192() {
      return _size192;
   }

   /**
    * Singleton accessor method for size264.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs size264() {
      return _size264;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs.valueOf( CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return size24();
         case 1: return size48();
         case 2: return size96();
         case 3: return size192();
         case 4: return size264();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
      ui = (int) buffer.decodeConsWholeNumber (5);

      switch (ui) {
         case 0: ret =  0; break;
         case 1: ret =  1; break;
         case 2: ret =  2; break;
         case 3: ret =  3; break;
         case 4: ret =  4; break;
         default: throw new Asn1InvalidEnumException (ui);
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (CSI_RS_CellMobility_csi_rs_MeasurementBW_nrofPRBs.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("size24");
         case 1: return ("size48");
         case 2: return ("size96");
         case 3: return ("size192");
         case 4: return ("size264");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
