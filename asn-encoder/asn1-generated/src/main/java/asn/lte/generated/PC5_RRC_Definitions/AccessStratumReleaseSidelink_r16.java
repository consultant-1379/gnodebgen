/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.PC5_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class AccessStratumReleaseSidelink_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_PC5_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "AccessStratumReleaseSidelink-r16";
   }

   // Integer constants for switch-case
   public static final int _REL16 = 0;
   public static final int _SPARE7 = 1;
   public static final int _SPARE6 = 2;
   public static final int _SPARE5 = 3;
   public static final int _SPARE4 = 4;
   public static final int _SPARE3 = 5;
   public static final int _SPARE2 = 6;
   public static final int _SPARE1 = 7;

   // Singleton instances of AccessStratumReleaseSidelink_r16
   protected static final AccessStratumReleaseSidelink_r16 _rel16 = new AccessStratumReleaseSidelink_r16(0);
   protected static final AccessStratumReleaseSidelink_r16 _spare7 = new AccessStratumReleaseSidelink_r16(1);
   protected static final AccessStratumReleaseSidelink_r16 _spare6 = new AccessStratumReleaseSidelink_r16(2);
   protected static final AccessStratumReleaseSidelink_r16 _spare5 = new AccessStratumReleaseSidelink_r16(3);
   protected static final AccessStratumReleaseSidelink_r16 _spare4 = new AccessStratumReleaseSidelink_r16(4);
   protected static final AccessStratumReleaseSidelink_r16 _spare3 = new AccessStratumReleaseSidelink_r16(5);
   protected static final AccessStratumReleaseSidelink_r16 _spare2 = new AccessStratumReleaseSidelink_r16(6);
   protected static final AccessStratumReleaseSidelink_r16 _spare1 = new AccessStratumReleaseSidelink_r16(7);
   private static AccessStratumReleaseSidelink_r16 __undefined = new AccessStratumReleaseSidelink_r16(-999);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    *   2
    *   3
    *   4
    *   5
    *   6
    *   7
    */
   protected AccessStratumReleaseSidelink_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for rel16.
    */
   public static AccessStratumReleaseSidelink_r16 rel16() {
      return _rel16;
   }

   /**
    * Singleton accessor method for spare7.
    */
   public static AccessStratumReleaseSidelink_r16 spare7() {
      return _spare7;
   }

   /**
    * Singleton accessor method for spare6.
    */
   public static AccessStratumReleaseSidelink_r16 spare6() {
      return _spare6;
   }

   /**
    * Singleton accessor method for spare5.
    */
   public static AccessStratumReleaseSidelink_r16 spare5() {
      return _spare5;
   }

   /**
    * Singleton accessor method for spare4.
    */
   public static AccessStratumReleaseSidelink_r16 spare4() {
      return _spare4;
   }

   /**
    * Singleton accessor method for spare3.
    */
   public static AccessStratumReleaseSidelink_r16 spare3() {
      return _spare3;
   }

   /**
    * Singleton accessor method for spare2.
    */
   public static AccessStratumReleaseSidelink_r16 spare2() {
      return _spare2;
   }

   /**
    * Singleton accessor method for spare1.
    */
   public static AccessStratumReleaseSidelink_r16 spare1() {
      return _spare1;
   }

   /** Undefined value. */
   protected static AccessStratumReleaseSidelink_r16 __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return AccessStratumReleaseSidelink_r16.valueOf( AccessStratumReleaseSidelink_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static AccessStratumReleaseSidelink_r16 valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return rel16();
         case 1: return spare7();
         case 2: return spare6();
         case 3: return spare5();
         case 4: return spare4();
         case 5: return spare3();
         case 6: return spare2();
         case 7: return spare1();
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
         ui = (int) buffer.decodeConsWholeNumber (8);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            case 4: ret =  4; break;
            case 5: ret =  5; break;
            case 6: ret =  6; break;
            case 7: ret =  7; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (AccessStratumReleaseSidelink_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("rel16");
         case 1: return ("spare7");
         case 2: return ("spare6");
         case 3: return ("spare5");
         case 4: return ("spare4");
         case 5: return ("spare3");
         case 6: return ("spare2");
         case 7: return ("spare1");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
