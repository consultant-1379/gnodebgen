/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class MeasTriggerQuantityOffset extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "MeasTriggerQuantityOffset";
   }

   // Choice element identifier constants
   public final static byte _RSRP = 1;
   public final static byte _RSRQ = 2;
   public final static byte _SINR = 3;

   public MeasTriggerQuantityOffset () {
      super();
   }

   public MeasTriggerQuantityOffset (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _RSRP: return "rsrp";
      case _RSRQ: return "rsrq";
      case _SINR: return "sinr";
      default: return "UNDEFINED";
      }
   }

   public void set_rsrp (Asn1Integer value) {
      setElement (_RSRP, value);
   }

   public void set_rsrq (Asn1Integer value) {
      setElement (_RSRQ, value);
   }

   public void set_sinr (Asn1Integer value) {
      setElement (_SINR, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (3, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // rsrp
         case 0: { 
            Asn1Integer rsrp;
            element = rsrp = new Asn1Integer();
            rsrp.decode (buffer, -30, 30);

            buffer.invokeCharacters(rsrp.toString());
            break;
         }

         // rsrq
         case 1: { 
            Asn1Integer rsrq;
            element = rsrq = new Asn1Integer();
            rsrq.decode (buffer, -30, 30);

            buffer.invokeCharacters(rsrq.toString());
            break;
         }

         // sinr
         case 2: { 
            Asn1Integer sinr;
            element = sinr = new Asn1Integer();
            sinr.decode (buffer, -30, 30);

            buffer.invokeCharacters(sinr.toString());
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
