/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.nr.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class CG_UCI_OnPUSCH extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CG-UCI-OnPUSCH";
   }

   // Choice element identifier constants
   public final static byte _DYNAMIC = 1;
   public final static byte _SEMISTATIC = 2;

   public CG_UCI_OnPUSCH () {
      super();
   }

   public CG_UCI_OnPUSCH (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _DYNAMIC: return "dynamic";
      case _SEMISTATIC: return "semiStatic";
      default: return "UNDEFINED";
      }
   }

   public void set_dynamic (CG_UCI_OnPUSCH_dynamic value) {
      setElement (_DYNAMIC, value);
   }

   public void set_semiStatic (BetaOffsets value) {
      setElement (_SEMISTATIC, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // dynamic
         case 0: { 
            CG_UCI_OnPUSCH_dynamic dynamic;
            element = dynamic = new CG_UCI_OnPUSCH_dynamic();
            dynamic.decode (buffer);
            break;
         }

         // semiStatic
         case 1: { 
            BetaOffsets semiStatic;
            element = semiStatic = new BetaOffsets();
            semiStatic.decode (buffer);
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
         // dynamic
         case _DYNAMIC:
            CG_UCI_OnPUSCH_dynamic dynamic = (CG_UCI_OnPUSCH_dynamic) element;
            dynamic.encode (buffer);
            break;

         // semiStatic
         case _SEMISTATIC:
            BetaOffsets semiStatic = (BetaOffsets) element;
            semiStatic.encode (buffer);
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
