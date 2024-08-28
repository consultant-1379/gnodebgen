/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 extends Asn1Enumerated {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "ENUMERATED";
   }

   // Integer constants for switch-case
   public static final int _N1 = 0;
   public static final int _N2 = 1;

   // Singleton instances of SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16
   protected static final SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 _n1 = new SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16(0);
   protected static final SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 _n2 = new SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16(1);

   /**
    * Enumerated constructor: this object must be initialized with one 
    * of the following values:
    *   0
    *   1
    */
   protected SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 (int value_) {
      super (value_);
   }

   /**
    * Singleton accessor method for n1.
    */
   public static SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 n1() {
      return _n1;
   }

   /**
    * Singleton accessor method for n2.
    */
   public static SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 n2() {
      return _n2;
   }

   public static final Decoder DECODER = new Decoder();

   public static class Decoder implements Asn1PerDecoder{

      public Asn1Type decode(Asn1PerDecodeBuffer buffer) throws Asn1Exception, java.io.IOException
      {
         return SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16.valueOf( SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16.decodeEnumValue( buffer ) );
      }
   }

   /**
    * Returns the instance associated with the value passed.
    * If the value passed is invalid, an exception is thrown.
    */
   public static SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16 valueOf (int _value)
      throws Asn1InvalidEnumException
   {
      switch ((int)_value) {
         case 0: return n1();
         case 1: return n2();
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
      buffer.invokeCharacters (SearchSpaceExt_r16_searchSpaceType_r16_common_r16_dci_Format2_4_r16_nrofCandidates_CI_r16_aggregationLevel4_r16.valueOf(ret).toString());

      return ret;
   }

   public String toString () {
      switch ((int)value) {
         case 0: return ("n1");
         case 1: return ("n2");
         default: return ("UNDEFINED");
      }
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" = ").append(toString()).append("\n");
   }

}
