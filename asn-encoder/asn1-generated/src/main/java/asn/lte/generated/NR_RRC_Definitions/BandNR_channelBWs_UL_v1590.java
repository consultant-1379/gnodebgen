/**
 * This file was generated by the Objective Systems ASN1C Compiler
 * (http://www.obj-sys.com).  Version: 7.2.4, Date: 05-Aug-2021.
 */
package asn.lte.generated.NR_RRC_Definitions;

import com.objsys.asn1j.runtime.*;

public class BandNR_channelBWs_UL_v1590 extends Asn1Choice {
   private static final long serialVersionUID = 55;
   static {
      _setKey (_NR_RRC_DefinitionsRtkey._rtkey);
   }

   public String getAsn1TypeName()  {
      return "CHOICE";
   }

   // Choice element identifier constants
   public final static byte _FR1 = 1;
   public final static byte _FR2 = 2;

   public BandNR_channelBWs_UL_v1590 () {
      super();
   }

   public BandNR_channelBWs_UL_v1590 (byte choiceId_, Asn1Type element_) {
      super();
      setElement (choiceId_, element_);
   }

   public String getElemName () {
      switch (choiceID) {
      case _FR1: return "fr1";
      case _FR2: return "fr2";
      default: return "UNDEFINED";
      }
   }

   public void set_fr1 (BandNR_channelBWs_UL_v1590_fr1 value) {
      setElement (_FR1, value);
   }

   public void set_fr2 (BandNR_channelBWs_UL_v1590_fr2 value) {
      setElement (_FR2, value);
   }

   public void decode (Asn1PerDecodeBuffer buffer)
      throws Asn1Exception, java.io.IOException
   {
      int idx = (int) buffer.decodeConsWholeNumber (2, "index");
      choiceID = idx + 1;
      buffer.getContext().eventDispatcher.startElement (getElemName(), -1);

      switch (idx) {
         // fr1
         case 0: { 
            BandNR_channelBWs_UL_v1590_fr1 fr1;
            element = fr1 = new BandNR_channelBWs_UL_v1590_fr1();
            fr1.decode (buffer);
            break;
         }

         // fr2
         case 1: { 
            BandNR_channelBWs_UL_v1590_fr2 fr2;
            element = fr2 = new BandNR_channelBWs_UL_v1590_fr2();
            fr2.decode (buffer);
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
