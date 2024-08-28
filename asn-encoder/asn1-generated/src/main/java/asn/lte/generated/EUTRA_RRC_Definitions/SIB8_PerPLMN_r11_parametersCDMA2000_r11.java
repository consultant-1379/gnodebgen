/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.EUTRA_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class SIB8_PerPLMN_r11_parametersCDMA2000_r11 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_EUTRA_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _EXPLICITVALUE = 1;
   public final static byte _DEFAULTVALUE = 2;

   public SIB8_PerPLMN_r11_parametersCDMA2000_r11 () {
      super();
   }

   public SIB8_PerPLMN_r11_parametersCDMA2000_r11 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _EXPLICITVALUE: return "explicitValue";
      case _DEFAULTVALUE: return "defaultValue";
      default: return "UNDEFINED";
      }
   }

   public void set_explicitValue (ParametersCDMA2000_r11 value) {
      setElement (_EXPLICITVALUE, value);
   }

   public void set_defaultValue () {
      setElement (_DEFAULTVALUE, Asn1Null.NULL_VALUE);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // explicitValue
         case 0: { 
            ParametersCDMA2000_r11 explicitValue;
            element = explicitValue = new ParametersCDMA2000_r11();
            explicitValue.decode (buffer);
            break;
         }

         // defaultValue
         case 1: { 
            Asn1Null defaultValue;
            element = defaultValue = Asn1Null.NULL_VALUE;
            defaultValue.decode (buffer);

            buffer.invokeCharacters(defaultValue.toString());
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
