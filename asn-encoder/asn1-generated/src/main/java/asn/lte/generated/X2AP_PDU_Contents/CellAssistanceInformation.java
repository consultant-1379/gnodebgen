/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.X2AP_PDU_Contents;

import com.objsys.asn1j.runtime.*;

public class CellAssistanceInformation extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_X2AP_PDU_ContentsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CellAssistanceInformation";
   }

   // Choice element identifier constants
   public final static byte _LIMITED_LIST = 1;
   public final static byte _FULL_LIST = 2;
   public final static byte _EXTELEM1 = 3;

   public CellAssistanceInformation () {
      super();
   }

   public CellAssistanceInformation (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _LIMITED_LIST: return "limited_list";
      case _FULL_LIST: return "full_list";
      case _EXTELEM1: return "...";
      default: return "UNDEFINED";
      }
   }

   public void set_limited_list (Limited_list value) {
      setElement (_LIMITED_LIST, value);
   }

   public void set_full_list (CellAssistanceInformation_full_list value) {
      setElement (_FULL_LIST, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      // extension bit

      Asn1PerDecodeBuffer savedBuffer = null;
      boolean extbit = buffer.decodeBit ("extbit");

      if (!extbit) {
         int idx = (int) buffer.decodeConsWholeNumber (2, "index");
         choiceID = idx + 1;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         switch (idx) {
            // limited_list
            case 0: { 
               Limited_list limited_list;
               element = limited_list = new Limited_list();
               limited_list.decode (buffer);
               break;
            }

            // full_list
            case 1: { 
               CellAssistanceInformation_full_list full_list;
               int tval = CellAssistanceInformation_full_list.decodeEnumValue (buffer);
               element = full_list = CellAssistanceInformation_full_list.valueOf (tval);
               break;
            }

            default:
            throw new Asn1InvalidChoiceOptionException (buffer, idx);
         }
      }
      else {
         int idx = (int) buffer.decodeSmallNonNegWholeNumber ();
         choiceID = idx + 3;
         buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

         buffer.byteAlign();

         Asn1OpenType openType = new Asn1OpenType ();
         openType.decode (buffer);

         setElement (_EXTELEM1, openType);
         buffer.invokeCharacters (openType.toString());
      }

      buffer.getContext().eventDispatcher.endElement (getElemName(), -1);

      if (savedBuffer != null) {
         buffer = savedBuffer;
      }
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
