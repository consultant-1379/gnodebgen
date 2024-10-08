/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class DRX_Config_v1130_longDRX_CycleStartOffset_v1130 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _SF60_V1130 = 1;
   public final static byte _SF70_V1130 = 2;

   public DRX_Config_v1130_longDRX_CycleStartOffset_v1130 () {
      super();
   }

   public DRX_Config_v1130_longDRX_CycleStartOffset_v1130 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _SF60_V1130: return "sf60_v1130";
      case _SF70_V1130: return "sf70_v1130";
      default: return "UNDEFINED";
      }
   }

   public void set_sf60_v1130 (Asn1Integer value) {
      setElement (_SF60_V1130, value);
   }

   public void set_sf70_v1130 (Asn1Integer value) {
      setElement (_SF70_V1130, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // sf60_v1130
         case 0: { 
            Asn1Integer sf60_v1130;
            element = sf60_v1130 = new Asn1Integer();
            sf60_v1130.decode (buffer, 0, 59);

            buffer.invokeCharacters(sf60_v1130.toString());
            break;
         }

         // sf70_v1130
         case 1: { 
            Asn1Integer sf70_v1130;
            element = sf70_v1130 = new Asn1Integer();
            sf70_v1130.decode (buffer, 0, 69);

            buffer.invokeCharacters(sf70_v1130.toString());
            break;
         }

         default:
         throw new Asn1InvalidChoiceOptionException (buffer, idx);
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);
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
