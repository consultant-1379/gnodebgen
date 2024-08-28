/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class GapConfig_mgrp extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _MS20 = 0;
   public static final int _MS40 = 1;
   public static final int _MS80 = 2;
   public static final int _MS160 = 3;

   // Singleton instances of GapConfig_mgrp
   protected static final GapConfig_mgrp _ms20 = new GapConfig_mgrp(0);
   protected static final GapConfig_mgrp _ms40 = new GapConfig_mgrp(1);
   protected static final GapConfig_mgrp _ms80 = new GapConfig_mgrp(2);
   protected static final GapConfig_mgrp _ms160 = new GapConfig_mgrp(3);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    */
   protected GapConfig_mgrp (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for ms20.
    */
   public static GapConfig_mgrp ms20() {
      return _ms20;
   }

   /**
    * Singleton accessor method for ms40.
    */
   public static GapConfig_mgrp ms40() {
      return _ms40;
   }

   /**
    * Singleton accessor method for ms80.
    */
   public static GapConfig_mgrp ms80() {
      return _ms80;
   }

   /**
    * Singleton accessor method for ms160.
    */
   public static GapConfig_mgrp ms160() {
      return _ms160;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return GapConfig_mgrp.valueOf( GapConfig_mgrp.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static GapConfig_mgrp valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return ms20();
         case 1: return ms40();
         case 2: return ms80();
         case 3: return ms160();
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
      buffer.invokeCharacters (GapConfig_mgrp.valueOf(ret).toString());

      return ret;
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      switch ((int)value) {
         case 0: ui = 0; /* ms20 */break;
         case 1: ui = 1; /* ms40 */break;
         case 2: ui = 2; /* ms80 */break;
         case 3: ui = 3; /* ms160 */break;
         default:
            throw new Asn1InvalidEnumException (value);
      }

      buffer.encodeConsWholeNumber (ui, 4);
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("ms20");
         case 1: return ("ms40");
         case 2: return ("ms80");
         case 3: return ("ms160");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
