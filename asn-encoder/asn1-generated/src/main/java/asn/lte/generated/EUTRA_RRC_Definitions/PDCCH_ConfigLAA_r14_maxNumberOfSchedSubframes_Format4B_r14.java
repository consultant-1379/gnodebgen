/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _SF2 = 0;
   public static final int _SF3 = 1;
   public static final int _SF4 = 2;

   // Singleton instances of PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14
   protected static final PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 _sf2 = new PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14(0);
   protected static final PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 _sf3 = new PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14(1);
   protected static final PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 _sf4 = new PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14(2);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    */
   protected PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for sf2.
    */
   public static PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 sf2() {
      return _sf2;
   }

   /**
    * Singleton accessor method for sf3.
    */
   public static PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 sf3() {
      return _sf3;
   }

   /**
    * Singleton accessor method for sf4.
    */
   public static PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 sf4() {
      return _sf4;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14.valueOf( PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return sf2();
         case 1: return sf3();
         case 2: return sf4();
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
      buffer.invokeCharacters (PDCCH_ConfigLAA_r14_maxNumberOfSchedSubframes_Format4B_r14.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("sf2");
         case 1: return ("sf3");
         case 2: return ("sf4");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
