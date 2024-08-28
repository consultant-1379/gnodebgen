/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpace_nrofCandidates_aggregationLevel2 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N0 = 0;
   public static final int _N1 = 1;
   public static final int _N2 = 2;
   public static final int _N3 = 3;
   public static final int _N4 = 4;
   public static final int _N5 = 5;
   public static final int _N6 = 6;
   public static final int _N8 = 7;

   // Singleton instances of SearchSpace_nrofCandidates_aggregationLevel2
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n0 = new SearchSpace_nrofCandidates_aggregationLevel2(0);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n1 = new SearchSpace_nrofCandidates_aggregationLevel2(1);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n2 = new SearchSpace_nrofCandidates_aggregationLevel2(2);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n3 = new SearchSpace_nrofCandidates_aggregationLevel2(3);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n4 = new SearchSpace_nrofCandidates_aggregationLevel2(4);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n5 = new SearchSpace_nrofCandidates_aggregationLevel2(5);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n6 = new SearchSpace_nrofCandidates_aggregationLevel2(6);
   protected static final SearchSpace_nrofCandidates_aggregationLevel2 _n8 = new SearchSpace_nrofCandidates_aggregationLevel2(7);

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
   protected SearchSpace_nrofCandidates_aggregationLevel2 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n0.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n0() {
      return _n0;
   }

   /**
    * Singleton accessor method for n1.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n2() {
      return _n2;
   }

   /**
    * Singleton accessor method for n3.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n3() {
      return _n3;
   }

   /**
    * Singleton accessor method for n4.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n4() {
      return _n4;
   }

   /**
    * Singleton accessor method for n5.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n5() {
      return _n5;
   }

   /**
    * Singleton accessor method for n6.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n6() {
      return _n6;
   }

   /**
    * Singleton accessor method for n8.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 n8() {
      return _n8;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SearchSpace_nrofCandidates_aggregationLevel2.valueOf( SearchSpace_nrofCandidates_aggregationLevel2.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SearchSpace_nrofCandidates_aggregationLevel2 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n0();
         case 1: return n1();
         case 2: return n2();
         case 3: return n3();
         case 4: return n4();
         case 5: return n5();
         case 6: return n6();
         case 7: return n8();
         default: throw new Asn1InvalidEnumException (_value);
      }
   }

   public static int decodeEnumValue (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int ui;  // enum index
      int ret; // return value
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

      buffer.setTypeCode (Asn1Type.ENUMERATED);
      buffer.invokeCharacters (SearchSpace_nrofCandidates_aggregationLevel2.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n0");
         case 1: return ("n1");
         case 2: return ("n2");
         case 3: return ("n3");
         case 4: return ("n4");
         case 5: return ("n5");
         case 6: return ("n6");
         case 7: return ("n8");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
