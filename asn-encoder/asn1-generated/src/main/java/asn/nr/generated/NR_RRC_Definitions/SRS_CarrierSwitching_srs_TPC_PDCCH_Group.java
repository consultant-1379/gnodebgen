/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SRS_CarrierSwitching_srs_TPC_PDCCH_Group extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _TYPEA = 1;
   public final static byte _TYPEB = 2;

   public SRS_CarrierSwitching_srs_TPC_PDCCH_Group () {
      super();
   }

   public SRS_CarrierSwitching_srs_TPC_PDCCH_Group (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _TYPEA: return "typeA";
      case _TYPEB: return "typeB";
      default: return "UNDEFINED";
      }
   }

   public void set_typeA (SRS_CarrierSwitching_srs_TPC_PDCCH_Group_typeA value) {
      setElement (_TYPEA, value);
   }

   public void set_typeB (SRS_TPC_PDCCH_Config value) {
      setElement (_TYPEB, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // typeA
         case 0: { 
            SRS_CarrierSwitching_srs_TPC_PDCCH_Group_typeA typeA;
            element = typeA = new SRS_CarrierSwitching_srs_TPC_PDCCH_Group_typeA();
            typeA.decode (buffer);
            break;
         }

         // typeB
         case 1: { 
            SRS_TPC_PDCCH_Config typeB;
            element = typeB = new SRS_TPC_PDCCH_Config();
            typeB.decode (buffer);
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // Encode choice index value

      buffer.encodeConsWholeNumber (choiceID - 1, 2, "index");

      buffer.getContext().eventDispatcher.startElement("getElemName()", -1);

      switch (choiceID) {
         // typeA
         case _TYPEA:
            SRS_CarrierSwitching_srs_TPC_PDCCH_Group_typeA typeA = (SRS_CarrierSwitching_srs_TPC_PDCCH_Group_typeA) element;
            typeA.encode (buffer);
            break;

         // typeB
         case _TYPEB:
            SRS_TPC_PDCCH_Config typeB = (SRS_TPC_PDCCH_Config) element;
            typeB.encode (buffer);
            break;

         default:
         throw new Asn1InvalidChoiceOptionException();
      }

      buffer.getContext().eventDispatcher.endElement("getElemName()", -1);
   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (element != null) {
         element.print (_sb, getElemName(), _level+1);
      }
      indent (_sb, _level);
      _sb.append("}\n");
   }

}
