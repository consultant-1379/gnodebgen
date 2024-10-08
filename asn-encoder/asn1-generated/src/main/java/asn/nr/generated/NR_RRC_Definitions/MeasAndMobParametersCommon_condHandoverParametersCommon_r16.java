/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasAndMobParametersCommon_condHandoverParametersCommon_r16 extends Asn1Seq {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "SEQUENCE";
   }

   public MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFDD_TDD_r16 condHandoverFDD_TDD_r16 = null;  // optional
   public MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFR1_FR2_r16 condHandoverFR1_FR2_r16 = null;  // optional

   public MeasAndMobParametersCommon_condHandoverParametersCommon_r16 () {
      super();
      init();
   }

   /**
    * This constructor sets all elements to references to the 
    * given objects
    */
   public MeasAndMobParametersCommon_condHandoverParametersCommon_r16 (
      MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFDD_TDD_r16 condHandoverFDD_TDD_r16_,
      MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFR1_FR2_r16 condHandoverFR1_FR2_r16_
   ) {
      super();
      condHandoverFDD_TDD_r16 = condHandoverFDD_TDD_r16_;
      condHandoverFR1_FR2_r16 = condHandoverFR1_FR2_r16_;
   }

   public void init () {
      condHandoverFDD_TDD_r16 = null;
      condHandoverFR1_FR2_r16 = null;
   }

   public int getElementCount() { return 2; }


   public Object getElementValue(int index){
      switch(index)  {
         case 0: return condHandoverFDD_TDD_r16;
         case 1: return condHandoverFR1_FR2_r16;
         default: return null;
      }
   }


   public String getElementName(int index){
      switch(index)  {
         case 0: return "condHandoverFDD-TDD-r16";
         case 1: return "condHandoverFR1-FR2-r16";
         default: return null;
      }
   }


   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      init ();

      // optional bits

      boolean condHandoverFDD_TDD_r16Present = buffer.decodeBit ("condHandoverFDD_TDD_r16Present");
      boolean condHandoverFR1_FR2_r16Present = buffer.decodeBit ("condHandoverFR1_FR2_r16Present");

      // decode condHandoverFDD_TDD_r16

      if (condHandoverFDD_TDD_r16Present) {
         buffer.getContext().eventDispatcher.startElement("condHandoverFDD_TDD_r16", -1);

         int tval = MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFDD_TDD_r16.decodeEnumValue (buffer);
         condHandoverFDD_TDD_r16 = MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFDD_TDD_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("condHandoverFDD_TDD_r16", -1);
      }
      else {
         condHandoverFDD_TDD_r16 = null;
      }

      // decode condHandoverFR1_FR2_r16

      if (condHandoverFR1_FR2_r16Present) {
         buffer.getContext().eventDispatcher.startElement("condHandoverFR1_FR2_r16", -1);

         int tval = MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFR1_FR2_r16.decodeEnumValue (buffer);
         condHandoverFR1_FR2_r16 = MeasAndMobParametersCommon_condHandoverParametersCommon_r16_condHandoverFR1_FR2_r16.valueOf (tval);
         buffer.getContext().eventDispatcher.endElement("condHandoverFR1_FR2_r16", -1);
      }
      else {
         condHandoverFR1_FR2_r16 = null;
      }

   }

   public void encode (Asn1PerEncodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // encode optional elements bit mask

      buffer.encodeBit ((condHandoverFDD_TDD_r16 != null), null);
      buffer.encodeBit ((condHandoverFR1_FR2_r16 != null), null);

      // encode condHandoverFDD_TDD_r16

      if (condHandoverFDD_TDD_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("condHandoverFDD_TDD_r16", -1);

         condHandoverFDD_TDD_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("condHandoverFDD_TDD_r16", -1);
      }

      // encode condHandoverFR1_FR2_r16

      if (condHandoverFR1_FR2_r16 != null) {
         buffer.getContext().eventDispatcher.startElement("condHandoverFR1_FR2_r16", -1);

         condHandoverFR1_FR2_r16.encode (buffer);

         buffer.getContext().eventDispatcher.endElement("condHandoverFR1_FR2_r16", -1);
      }

   }

   public void print (java.lang.StringBuilder _sb, String _varName, int _level)
   {
      indent (_sb, _level);
      _sb.append(_varName).append(" {\n");
      if (condHandoverFDD_TDD_r16 != null) condHandoverFDD_TDD_r16.print (_sb, "condHandoverFDD_TDD_r16", _level+1);
      if (condHandoverFR1_FR2_r16 != null) condHandoverFR1_FR2_r16.print (_sb, "condHandoverFR1_FR2_r16", _level+1);
      indent (_sb, _level);
      _sb.append ("}\n");
   }

}
