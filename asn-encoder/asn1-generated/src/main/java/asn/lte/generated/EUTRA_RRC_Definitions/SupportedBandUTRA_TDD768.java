/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SupportedBandUTRA_TDD768 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SupportedBandUTRA-TDD768";
   }

   // Integer constants for switch-case
   public static final int _A = 0;
   public static final int _B = 1;
   public static final int _C = 2;
   public static final int _D = 3;
   public static final int _E = 4;
   public static final int _F = 5;
   public static final int _G = 6;
   public static final int _H = 7;
   public static final int _I = 8;
   public static final int _J = 9;
   public static final int _K = 10;
   public static final int _L = 11;
   public static final int _M = 12;
   public static final int _N = 13;
   public static final int _O = 14;
   public static final int _P = 15;

   // Singleton instances of SupportedBandUTRA_TDD768
   protected static final SupportedBandUTRA_TDD768 _a = new SupportedBandUTRA_TDD768(0);
   protected static final SupportedBandUTRA_TDD768 _b = new SupportedBandUTRA_TDD768(1);
   protected static final SupportedBandUTRA_TDD768 _c = new SupportedBandUTRA_TDD768(2);
   protected static final SupportedBandUTRA_TDD768 _d = new SupportedBandUTRA_TDD768(3);
   protected static final SupportedBandUTRA_TDD768 _e = new SupportedBandUTRA_TDD768(4);
   protected static final SupportedBandUTRA_TDD768 _f = new SupportedBandUTRA_TDD768(5);
   protected static final SupportedBandUTRA_TDD768 _g = new SupportedBandUTRA_TDD768(6);
   protected static final SupportedBandUTRA_TDD768 _h = new SupportedBandUTRA_TDD768(7);
   protected static final SupportedBandUTRA_TDD768 _i = new SupportedBandUTRA_TDD768(8);
   protected static final SupportedBandUTRA_TDD768 _j = new SupportedBandUTRA_TDD768(9);
   protected static final SupportedBandUTRA_TDD768 _k = new SupportedBandUTRA_TDD768(10);
   protected static final SupportedBandUTRA_TDD768 _l = new SupportedBandUTRA_TDD768(11);
   protected static final SupportedBandUTRA_TDD768 _m = new SupportedBandUTRA_TDD768(12);
   protected static final SupportedBandUTRA_TDD768 _n = new SupportedBandUTRA_TDD768(13);
   protected static final SupportedBandUTRA_TDD768 _o = new SupportedBandUTRA_TDD768(14);
   protected static final SupportedBandUTRA_TDD768 _p = new SupportedBandUTRA_TDD768(15);
   private static SupportedBandUTRA_TDD768 __undefined = new SupportedBandUTRA_TDD768(-999);

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
    *   8
    *   9
    *   10
    *   11
    *   12
    *   13
    *   14
    *   15
    */
   protected SupportedBandUTRA_TDD768 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for a.
    */
   public static SupportedBandUTRA_TDD768 a() {
      return _a;
   }

   /**
    * Singleton accessor method for b.
    */
   public static SupportedBandUTRA_TDD768 b() {
      return _b;
   }

   /**
    * Singleton accessor method for c.
    */
   public static SupportedBandUTRA_TDD768 c() {
      return _c;
   }

   /**
    * Singleton accessor method for d.
    */
   public static SupportedBandUTRA_TDD768 d() {
      return _d;
   }

   /**
    * Singleton accessor method for e.
    */
   public static SupportedBandUTRA_TDD768 e() {
      return _e;
   }

   /**
    * Singleton accessor method for f.
    */
   public static SupportedBandUTRA_TDD768 f() {
      return _f;
   }

   /**
    * Singleton accessor method for g.
    */
   public static SupportedBandUTRA_TDD768 g() {
      return _g;
   }

   /**
    * Singleton accessor method for h.
    */
   public static SupportedBandUTRA_TDD768 h() {
      return _h;
   }

   /**
    * Singleton accessor method for i.
    */
   public static SupportedBandUTRA_TDD768 i() {
      return _i;
   }

   /**
    * Singleton accessor method for j.
    */
   public static SupportedBandUTRA_TDD768 j() {
      return _j;
   }

   /**
    * Singleton accessor method for k.
    */
   public static SupportedBandUTRA_TDD768 k() {
      return _k;
   }

   /**
    * Singleton accessor method for l.
    */
   public static SupportedBandUTRA_TDD768 l() {
      return _l;
   }

   /**
    * Singleton accessor method for m.
    */
   public static SupportedBandUTRA_TDD768 m() {
      return _m;
   }

   /**
    * Singleton accessor method for n.
    */
   public static SupportedBandUTRA_TDD768 n() {
      return _n;
   }

   /**
    * Singleton accessor method for o.
    */
   public static SupportedBandUTRA_TDD768 o() {
      return _o;
   }

   /**
    * Singleton accessor method for p.
    */
   public static SupportedBandUTRA_TDD768 p() {
      return _p;
   }

   /** Undefined value. */
   protected static SupportedBandUTRA_TDD768 __undefined_() { return __undefined; }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SupportedBandUTRA_TDD768.valueOf( SupportedBandUTRA_TDD768.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SupportedBandUTRA_TDD768 valueOf (int _value)
   {
      switch ((int)_value) {
         case 0: return a();
         case 1: return b();
         case 2: return c();
         case 3: return d();
         case 4: return e();
         case 5: return f();
         case 6: return g();
         case 7: return h();
         case 8: return i();
         case 9: return j();
         case 10: return k();
         case 11: return l();
         case 12: return m();
         case 13: return n();
         case 14: return o();
         case 15: return p();
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
         ui = (int) buffer.decodeConsWholeNumber (16);

         switch (ui) {
            case 0: ret =  0; break;
            case 1: ret =  1; break;
            case 2: ret =  2; break;
            case 3: ret =  3; break;
            case 4: ret =  4; break;
            case 5: ret =  5; break;
            case 6: ret =  6; break;
            case 7: ret =  7; break;
            case 8: ret =  8; break;
            case 9: ret =  9; break;
            case 10: ret =  10; break;
            case 11: ret =  11; break;
            case 12: ret =  12; break;
            case 13: ret =  13; break;
            case 14: ret =  14; break;
            case 15: ret =  15; break;
            default: throw new Asn1InvalidEnumException (ui);
         }
      }

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SupportedBandUTRA_TDD768.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("a");
         case 1: return ("b");
         case 2: return ("c");
         case 3: return ("d");
         case 4: return ("e");
         case 5: return ("f");
         case 6: return ("g");
         case 7: return ("h");
         case 8: return ("i");
         case 9: return ("j");
         case 10: return ("k");
         case 11: return ("l");
         case 12: return ("m");
         case 13: return ("n");
         case 14: return ("o");
         case 15: return ("p");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
