/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _ALLDOWNLINK_R16 = 1;
   public final static byte _ALLUPLINK_R16 = 2;
   public final static byte _EXPLICIT_R16 = 3;
   public final static byte _EXPLICIT_IAB_MT_R16 = 4;

   public TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16 () {
      super();
   }

   public TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _ALLDOWNLINK_R16: return "allDownlink_r16";
      case _ALLUPLINK_R16: return "allUplink_r16";
      case _EXPLICIT_R16: return "explicit_r16";
      case _EXPLICIT_IAB_MT_R16: return "explicit_IAB_MT_r16";
      default: return "UNDEFINED";
      }
   }

   public void set_allDownlink_r16 () {
      setElement (_ALLDOWNLINK_R16, Asn1Null.NULL_VALUE);
   }

   public void set_allUplink_r16 () {
      setElement (_ALLUPLINK_R16, Asn1Null.NULL_VALUE);
   }

   public void set_explicit_r16 (TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_r16 value) {
      setElement (_EXPLICIT_R16, value);
   }

   public void set_explicit_IAB_MT_r16 (TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 value) {
      setElement (_EXPLICIT_IAB_MT_R16, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (4, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // allDownlink_r16
         case 0: { 
            Asn1Null allDownlink_r16;
            element = allDownlink_r16 = Asn1Null.NULL_VALUE;
            allDownlink_r16.decode (buffer);

            buffer.invokeCharacters(allDownlink_r16.toString());
            break;
         }

         // allUplink_r16
         case 1: { 
            Asn1Null allUplink_r16;
            element = allUplink_r16 = Asn1Null.NULL_VALUE;
            allUplink_r16.decode (buffer);

            buffer.invokeCharacters(allUplink_r16.toString());
            break;
         }

         // explicit_r16
         case 2: { 
            TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_r16 explicit_r16;
            element = explicit_r16 = new TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_r16();
            explicit_r16.decode (buffer);
            break;
         }

         // explicit_IAB_MT_r16
         case 3: { 
            TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16 explicit_IAB_MT_r16;
            element = explicit_IAB_MT_r16 = new TDD_UL_DL_SlotConfig_IAB_MT_r16_symbols_IAB_MT_r16_explicit_IAB_MT_r16();
            explicit_IAB_MT_r16.decode (buffer);
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
