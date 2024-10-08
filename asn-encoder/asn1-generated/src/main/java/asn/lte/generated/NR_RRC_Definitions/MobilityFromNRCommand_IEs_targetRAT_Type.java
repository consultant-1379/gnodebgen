/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MobilityFromNRCommand_IEs_targetRAT_Type extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _EUTRA = 0;
   public static final int _UTRA_FDD_V1610 = 1;
   public static final int _SPARE2 = 2;
   public static final int _SPARE1 = 3;

   // Singleton instances of MobilityFromNRCommand_IEs_targetRAT_Type
   protected static final MobilityFromNRCommand_IEs_targetRAT_Type _eutra = new MobilityFromNRCommand_IEs_targetRAT_Type(0);
   protected static final MobilityFromNRCommand_IEs_targetRAT_Type _utra_fdd_v1610 = new MobilityFromNRCommand_IEs_targetRAT_Type(1);
   protected static final MobilityFromNRCommand_IEs_targetRAT_Type _spare2 = new MobilityFromNRCommand_IEs_targetRAT_Type(2);
   protected static final MobilityFromNRCommand_IEs_targetRAT_Type _spare1 = new MobilityFromNRCommand_IEs_targetRAT_Type(3);
   private static MobilityFromNRCommand_IEs_targetRAT_Type __undefined = new MobilityFromNRCommand_IEs_targetRAT_Type(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected MobilityFromNRCommand_IEs_targetRAT_Type (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for eutra.
    */
   public static MobilityFromNRCommand_IEs_targetRAT_Type eutra() {
      return _eutra;
   }

   /**
    * Singleton accessor method for utra_fdd_v1610.
    */
   public static MobilityFromNRCommand_IEs_targetRAT_Type utra_fdd_v1610() {
      return _utra_fdd_v1610;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static MobilityFromNRCommand_IEs_targetRAT_Type spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static MobilityFromNRCommand_IEs_targetRAT_Type spare1() {
      return _spare1;
   }

   /** Undefined value. */
   protected static MobilityFromNRCommand_IEs_targetRAT_Type __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return MobilityFromNRCommand_IEs_targetRAT_Type.valueOf( MobilityFromNRCommand_IEs_targetRAT_Type.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static MobilityFromNRCommand_IEs_targetRAT_Type valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return eutra();
         case 1: return utra_fdd_v1610();
         case 2: return spare2();
         case 3: return spare1();
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
      buffer.invokeCharacters (MobilityFromNRCommand_IEs_targetRAT_Type.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("eutra");
         case 1: return ("utra-fdd-v1610");
         case 2: return ("spare2");
         case 3: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
